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
            BasicType methodtype = new BasicType();
            methodtype.name = "methodtype";
            stringhash.Add(inttype.name,inttype);
            stringhash.Add(flttype.name,flttype);
            stringhash.Add(methodtype.name, methodtype);
        }

      public override void OutAIntegerConstants(comp5210.node.AIntegerConstants node)
        {
            String typename = node.GetVar1().Text;
            String varname = node.GetVar2().Text;
            Definition typeconst;

            if(!stringhash.TryGetValue(typename, out typeconst))
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
                    nodehash.Add(node, varconst);
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
            String varname = node.GetVar2().Text;
            Definition typeconst;

            if (!stringhash.TryGetValue(typename, out typeconst))
            {
                Console.WriteLine("[" + node.GetFloat().Line + "]" + varname + " is not defined.");
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
                    nodehash.Add(node, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetFloat().Line + "]: " + "variables already in tables");
                }
            }
        }
       
        public override void OutASomeMethods (comp5210.node.ASomeMethods node)
        {
            VariableDefinition method = new VariableDefinition();
            method.name = node.GetVariable().Text;     

            if (!stringhash.ContainsValue(method) && !nodehash.ContainsValue(method))
            {
                stringhash.Add(method.name, method);
            }
            else
            {
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variables already in tables");
            }   
        }

        public override void OutASomeInitParam(comp5210.node.ASomeInitParam node)
        {
            String typename = node.GetVar1().Text;
            String varname = node.GetVar2().Text;
            Definition typeconst;
            
            if (!stringhash.TryGetValue(typename, out typeconst))
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
                    nodehash.Add(node, varconst);
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

            if (!stringhash.TryGetValue(typename, out typeconst))
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
                    nodehash.Add(node, varconst);
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

            if (!stringhash.TryGetValue(typename, out typeconst))
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
                    nodehash.Add(node, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetVar2().Line + "]: " + "variable already in tables");
                }
            }
        }

         public override void OutAArrayDecls(comp5210.node.AArrayDecls node)
        {
            String typename = node.GetVar1().Text;
            String varname = node.GetVar2().Text;
            Definition typeconst;

            if (!stringhash.TryGetValue(typename, out typeconst))
            {
                Console.WriteLine("[" + node.GetVar1().Line + "]" + varname + " is not defined.");
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
                    nodehash.Add(node, varconst);
                }
                else
                {
                    Console.WriteLine("[" + node.GetVar2().Line + "]: " + "variables already in tables");
                }
            }
        }

        public override void OutAMathAssignments(comp5210.node.AMathAssignments node)
         {
             VariableDefinition var = new VariableDefinition();
             var.name = node.GetVariable().Text;


             if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
             {
                 stringhash.Add(var.name, var);
                 Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
             }              
         }

        public override void OutAStringAssignments(comp5210.node.AStringAssignments node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
            }
        }

        public override void OutAMathArrayAssignments(comp5210.node.AMathArrayAssignments node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
            }
        }

        public override void OutAStringArrayAssignments(comp5210.node.AStringArrayAssignments node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable not in tables");
            }
        }

          public override void OutAVarParam(comp5210.node.AVarParam node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
            }
            else
            {
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable already in tables");
            }
        }

        public override void OutAOthersMoreParam(comp5210.node.AOthersMoreParam node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;


            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
            }
            else
            {
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variable already in tables");
            }
        }

        public override void OutAAddMath(comp5210.node.AAddMath node)
        {
            Definition rhs, lhs;
            nodehash.TryGetValue(node.GetMath(), out rhs);
            nodehash.TryGetValue(node.GetMultiDivide(), out lhs);

            if ((lhs as VariableDefinition).vartype != rhs)
            {
                Console.WriteLine("[" + node.GetPlus().Line + "]: " + "types don't match.");
            }
        }
        public override void OutASubMath(comp5210.node.ASubMath node)
        {
            Definition rhs, lhs;
            nodehash.TryGetValue(node.GetMath(), out rhs);
            nodehash.TryGetValue(node.GetMultiDivide(), out lhs);

            if ((lhs as VariableDefinition).vartype != rhs)
            {
                Console.WriteLine("[" + node.GetMinus().Line + "]: " + "types don't match.");
            }
        }

        public override void OutAMultiMultiDivide(comp5210.node.AMultiMultiDivide node)
        {
            Definition rhs, lhs;
            nodehash.TryGetValue(node.GetMultiDivide(), out rhs);
            nodehash.TryGetValue(node.GetParentheses(), out lhs);

            if ((lhs as VariableDefinition).vartype != rhs)
            {
                Console.WriteLine("[" + node.GetMultiplication().Line + "]: " +
                    "types don't match");
            }
        }

        public override void OutADivideMultiDivide(comp5210.node.ADivideMultiDivide node)
        {
            Definition rhs, lhs;
            nodehash.TryGetValue(node.GetMultiDivide(), out rhs);
            nodehash.TryGetValue(node.GetParentheses(), out lhs);

            if ((lhs as VariableDefinition).vartype != rhs)
            {
                Console.WriteLine("[" + node.GetDivision().Line + "]: " +
                    "types don't match");
            }
        }

        public override void OutAVariableParentheses(comp5210.node.AVariableParentheses node)
        {
            VariableDefinition var = new VariableDefinition();
            var.name = node.GetVariable().Text;

            if (!stringhash.ContainsValue(var) && !nodehash.ContainsValue(var))
            {
                stringhash.Add(var.name, var);
            }
            else
            {
                Console.WriteLine("[" + node.GetVariable().Line + "]: " + "variables already in tables");
            }
        }

       
    }
}