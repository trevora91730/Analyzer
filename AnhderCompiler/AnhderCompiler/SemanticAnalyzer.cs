using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace parser
{
    class SemanticAnalyzer : comp5210.analysis.DepthFirstAdapter
    {
        System.Collections.Generic.Dictionary<string,parser.Definition>
            stringhash = new Dictionary<string,Definition>();
        System.Collections.Generic.Dictionary<comp5210.node.Node, parser.Definition>
            nodehash = new Dictionary<comp5210.node.Node, Definition>();

        // before theclass starts, create the two hashes and 
        // add int and float        
        public override void InAProgram(comp5210.node.AProgram node)
        {
            BasicType inttype = new BasicType();
            inttype.name = "integer";
            BasicType flttype = new BasicType();
            flttype.name = "float";
            BasicType stringtype = new BasicType();
            stringtype.name = "string";
            stringhash.Add(inttype.name,inttype);
            stringhash.Add(flttype.name,flttype);
            stringhash.Add(stringtype.name, stringtype);
        }

      public override void OutAIntegerConstants(comp5210.node.AIntegerConstants node)
        {
            String typename = node.GetInteger().Text;
            String varname = node.GetVariable().Text;
            Definition typeconst;

            if(!stringhash.TryGetValue(varname, out typeconst))
            {
                Console.WriteLine("[" + node.GetInteger().Line + "]" + typename + " is not defined." );
            }

            else if (!(typeconst is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetInteger().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition varconst = new VariableDefinition();
                varconst.name = varname;
                varconst.vartype = typeconst as TypeDefinition;

                if (!stringhash.ContainsValue(varconst) && !nodehash.ContainsValue(varconst))
                {
                    stringhash.Add(varconst.name, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetInteger().Line + "]: " + "variables already in tables");
                }
            }
        }

        public override void OutAFloatConstants(comp5210.node.AFloatConstants node)
        {
            String typename = node.GetFloat().Text;
            String varname = node.GetVariable().Text;
            Definition typeconst;

            if (!stringhash.TryGetValue(typename, out typeconst))
            {
                Console.WriteLine("[" + node.GetFloat().Line + "]" + typename + " is not defined.");
            }

            else if (!(typeconst is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetFloat().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition varconst = new VariableDefinition();
                varconst.name = varname;
                varconst.vartype = typeconst as TypeDefinition;

                if (!stringhash.ContainsValue(varconst) && !nodehash.ContainsValue(varconst))
                {
                    stringhash.Add(varconst.name, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetFloat().Line + "]: " + "variables already in tables");
                }
            }
        }

        public override void OutAStringConstants(comp5210.node.AStringConstants node)
        {
            String typename = node.GetString().Text;
            String varname = node.GetVariable().Text;
            Definition typeconst;

            if (!stringhash.TryGetValue(typename, out typeconst))
            {
                Console.WriteLine("[" + node.GetString().Line + "]" + typename + " is not defined.");
            }

            else if (!(typeconst is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetString().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition varconst = new VariableDefinition();
                varconst.name = varname;
                varconst.vartype = typeconst as TypeDefinition;

                if (!stringhash.ContainsValue(varconst) && !nodehash.ContainsValue(varconst))
                {
                    stringhash.Add(varconst.name, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetString().Line + "]: " + "variables already in tables");
                }
            }
        }

        public override void OutASomeMethods (comp5210.node.ASomeMethods node)
        {
            VariableDefinition method = new VariableDefinition();
            method.name = node.GetVariable().Text;
     

            if (!stringhash.ContainsValue(method) && !nodehash.ContainsValue(method))
            {
                BasicType methodtype = new BasicType();
                methodtype.name = "method";
                stringhash.Add(method.name, method);
            }
            else
            {
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variables already in tables");
            }   
        }

        public override void OutASomeInit_Param(comp5210.node.ASomeInitParam node)
        {
            String typename = node.GetVar1().Text;
            String varname = node.GetVar2().Text;
            Definition typeconst;

            if (!stringhash.TryGetValue(varname, out typeconst))
            {
                Console.WriteLine("[" + node.GetVar1().Line + "]" + typename + " is not defined.");
            }

            else if (!(typeconst is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetVar1().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition varconst = new VariableDefinition();
                varconst.name = varname;
                varconst.vartype = typeconst as TypeDefinition;

                if (!stringhash.ContainsValue(varconst) && !nodehash.ContainsValue(varconst))
                {
                    stringhash.Add(varconst.name, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetVar2().Line + "]: " + "variables already in tables");
                }
            }
        }

        public override void OutAOthersSecondParam(comp5210.node.AOthersSecondParam node)
        {
            String typename = node.GetVar1().Text;
            String varname = node.GetVar2().Text;
            Definition typeconst;

            if (!stringhash.TryGetValue(varname, out typeconst))
            {
                Console.WriteLine("[" + node.GetVar1().Line + "]" + typename + " is not defined.");
            }

            else if (!(typeconst is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetVar1().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition varconst = new VariableDefinition();
                varconst.name = varname;
                varconst.vartype = typeconst as TypeDefinition;

                if (!stringhash.ContainsValue(varconst) && !nodehash.ContainsValue(varconst))
                {
                    stringhash.Add(varconst.name, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetVar2().Line + "]: " + "variables already in tables");
                }
            }
        }

        public override void OutAVarDecls(comp5210.node.AVarDecls node)
        {
            String typename = node.GetVar1().Text;
            String varname = node.GetVar2().Text;
            Definition typeconst;

            if(!stringhash.TryGetValue(varname, out typeconst))
            {
                Console.WriteLine("[" + node.GetVar2().Line + "]" + typename + " is not defined." );
            }

            else if (!(typeconst is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetVar1().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition varconst = new VariableDefinition();
                varconst.name = varname;
                varconst.vartype = typeconst as TypeDefinition;

                if (!stringhash.ContainsValue(varconst) && !nodehash.ContainsValue(varconst))
                {
                    stringhash.Add(varconst.name, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetVar2().Line + "]: " + "variables already in tables");
                }
            }
        }

         public override void OutAArrayDecls(comp5210.node.AArrayDecls node)
        {
            String typename = node.GetVar1().Text;
            String varname = node.GetVar2().Text;
            Definition typeconst;

            if(!stringhash.TryGetValue(varname, out typeconst))
            {
                Console.WriteLine("[" + node.GetVar2().Line + "]" + typename + " is not defined." );
            }

            else if (!(typeconst is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetVar1().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition varconst = new VariableDefinition();
                varconst.name = varname;
                varconst.vartype = typeconst as TypeDefinition;

                if (!stringhash.ContainsValue(varconst) && !nodehash.ContainsValue(varconst))
                {
                    stringhash.Add(varconst.name, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetVar2().Line + "]: " + "variables already in tables");
                }
            }
        }

        public override void OutMathAssignments(comp5210.node.AMathAssignments node)
         {
             VariableDefinition var = new VariableDefinition();
             var.name = node.GetVariable().Text;


             if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
             {
                 stringhash.Add(var.name, var);
                 Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
             }              
         }

        public override void OutStringAssignments(comp5210.node.AStringAssignments node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
            }
        }

        public override void OutMathArrayAssignments(comp5210.node.AMathArrayAssignments node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
            }
        }

        public override void OutStringArrayAssignments(comp5210.node.AStringArrayAssignments node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
            }
        }
       /* public override void OutAProgramMain_Program(comp5210.node.AProgramMain_Program node)
        {
             string varname = node.GetVarname().Text;

            if (!stringhash.ContainsValue(varname) && !nodehash.ContainsValue(varname))
            {
                stringhash.Add(varname.name, varname);
            }
            else
            {
                Console.WriteLine("[" + node.GetEquals().Line = "]: " + "Main already assigned");
            }   
        }*/

        /*
        public override void OutAVarDecl(comp5210.node.AVarDecl node)
        {
            string typename = node.GetTypename().Text;
            string varname = node.GetVarname().Text;
            Definition typedefn;
            // lookup the type
            if (!stringhash.TryGetValue(typename,out typedefn))
            {
                Console.WriteLine("[" + node.GetTypename().Line + "]: " +
                    typename + " is not defined.");
            }
            // check to make sure what we got back is a type
            else if (!(typedefn is TypeDefinition))
            {
                Console.WriteLine("[" + node.GetSemicolon().Line + "]: " +
                    typename + " is an invalid type.");
            }
            else
            {
                // add this variable to the hash table
                // note you need to add checks to make sure this 
                // variable name isn't already defined.
                VariableDefinition vardefn = new VariableDefinition();
                vardefn.name = varname;
                vardefn.vartype = typedefn as TypeDefinition;

                if(!stringhash.ContainsValue(vardefn) && !nodehash.ContainsValue(vardefn))
                {
                    stringhash.Add(vardefn.name, vardefn);
                }
                else
                {
                    Console.WriteLine("[" + node.GetEquals().Line = "]: " + "variables already in tables");
                }                
            }
        }
        public override void OutAStmt(comp5210.node.AStmt node)
        {
            Definition rhs,lhs;
            nodehash.TryGetValue(node.GetExpr(), out rhs);
            stringhash.TryGetValue(node.GetId().Text, out lhs);
            // make sure left hand side and right hand side match
            // of course, you should really make sure left side is
            // a variable first
            if ((lhs as VariableDefinition).vartype != rhs)
            {
                Console.WriteLine("[" + node.GetEquals().Line + "]: " +
                    "types don't match");
            }
        }
        public override void OutAComplexExpr(comp5210.node.AComplexExpr node)
        {
            Definition lhs;
            nodehash.TryGetValue(node.GetBase(), out lhs);
            // you should really get the types of both sides and make sure 
            // they match
            // make sure the type of the child is a BasicType, as those
            // are the only addable things.
            nodehash.Add(node, lhs);
        }
        public override void OutASimpleExpr(comp5210.node.ASimpleExpr node)
        {
            Definition lhs;
            nodehash.TryGetValue(node.GetBase(), out lhs);
            nodehash.Add(node, lhs);
        }
        public override void OutAParenBase(comp5210.node.AParenBase node)
        {
            Definition exprdefn;
            nodehash.TryGetValue(node.GetExpr(), out exprdefn);
            nodehash.Add(node, exprdefn);
        }
        public override void OutAIdBase(comp5210.node.AIdBase node)
        {
            Definition iddefn;
            if (!stringhash.TryGetValue(node.GetId().Text, out iddefn))
            {
                Console.WriteLine("[" + node.GetId().Line + "]: " +
                    node.GetId().Text + " is not defined");
            }
            // you should really make sure that iddefn is a variable 
            // definition
            else
            {
                nodehash.Add(node, (iddefn as VariableDefinition).vartype);
            }
        }
         */
    }
}
