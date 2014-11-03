﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace parser
{
    public abstract class Definition
    {
        public string name;
    }
    public abstract class TypeDefinition : Definition
    {
    }
    public class BasicType : TypeDefinition
    {
    }
    public class VariableDefinition : Definition
    {
        public TypeDefinition vartype;
    }
}
