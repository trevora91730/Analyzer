/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.analysis;

import java.util.*;
import org.sablecc.sablecc.xss2.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(Node node)
    {
    }

    public void defaultOut(Node node)
    {
    }

    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPScript().apply(this);
        outStart(node);
    }

    public void inAScript(AScript node)
    {
        defaultIn(node);
    }

    public void outAScript(AScript node)
    {
        defaultOut(node);
    }

    public void caseAScript(AScript node)
    {
        inAScript(node);
        {
            Object temp[] = node.getStatement().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        outAScript(node);
    }
    public void inADataStatement(ADataStatement node)
    {
        defaultIn(node);
    }

    public void outADataStatement(ADataStatement node)
    {
        defaultOut(node);
    }

    public void caseADataStatement(ADataStatement node)
    {
        inADataStatement(node);
        if(node.getData() != null)
        {
            node.getData().apply(this);
        }
        outADataStatement(node);
    }
    public void inAForeachStatement(AForeachStatement node)
    {
        defaultIn(node);
    }

    public void outAForeachStatement(AForeachStatement node)
    {
        defaultOut(node);
    }

    public void caseAForeachStatement(AForeachStatement node)
    {
        inAForeachStatement(node);
        {
            Object temp[] = node.getStatement().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        if(node.getXpath() != null)
        {
            node.getXpath().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAForeachStatement(node);
    }
    public void inAIncludeStatement(AIncludeStatement node)
    {
        defaultIn(node);
    }

    public void outAIncludeStatement(AIncludeStatement node)
    {
        defaultOut(node);
    }

    public void caseAIncludeStatement(AIncludeStatement node)
    {
        inAIncludeStatement(node);
        if(node.getPath() != null)
        {
            node.getPath().apply(this);
        }
        outAIncludeStatement(node);
    }
    public void inAIfStatement(AIfStatement node)
    {
        defaultIn(node);
    }

    public void outAIfStatement(AIfStatement node)
    {
        defaultOut(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        inAIfStatement(node);
        {
            Object temp[] = node.getElse().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        {
            Object temp[] = node.getStatement().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        if(node.getTest() != null)
        {
            node.getTest().apply(this);
        }
        outAIfStatement(node);
    }
    public void inAChooseStatement(AChooseStatement node)
    {
        defaultIn(node);
    }

    public void outAChooseStatement(AChooseStatement node)
    {
        defaultOut(node);
    }

    public void caseAChooseStatement(AChooseStatement node)
    {
        inAChooseStatement(node);
        {
            Object temp[] = node.getOtherwise().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        {
            Object temp[] = node.getChooseWhen().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PChooseWhen) temp[i]).apply(this);
            }
        }
        outAChooseStatement(node);
    }
    public void inASetStatement(ASetStatement node)
    {
        defaultIn(node);
    }

    public void outASetStatement(ASetStatement node)
    {
        defaultOut(node);
    }

    public void caseASetStatement(ASetStatement node)
    {
        inASetStatement(node);
        {
            Object temp[] = node.getArgs().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PArg) temp[i]).apply(this);
            }
        }
        outASetStatement(node);
    }
    public void inAParamStatement(AParamStatement node)
    {
        defaultIn(node);
    }

    public void outAParamStatement(AParamStatement node)
    {
        defaultOut(node);
    }

    public void caseAParamStatement(AParamStatement node)
    {
        inAParamStatement(node);
        {
            Object temp[] = node.getArgs().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((POarg) temp[i]).apply(this);
            }
        }
        outAParamStatement(node);
    }
    public void inAOutputStatement(AOutputStatement node)
    {
        defaultIn(node);
    }

    public void outAOutputStatement(AOutputStatement node)
    {
        defaultOut(node);
    }

    public void caseAOutputStatement(AOutputStatement node)
    {
        inAOutputStatement(node);
        {
            Object temp[] = node.getStatement().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAOutputStatement(node);
    }
    public void inATemplateStatement(ATemplateStatement node)
    {
        defaultIn(node);
    }

    public void outATemplateStatement(ATemplateStatement node)
    {
        defaultOut(node);
    }

    public void caseATemplateStatement(ATemplateStatement node)
    {
        inATemplateStatement(node);
        {
            Object temp[] = node.getStatement().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        {
            Object temp[] = node.getArgs().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((POarg) temp[i]).apply(this);
            }
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outATemplateStatement(node);
    }
    public void inACallStatement(ACallStatement node)
    {
        defaultIn(node);
    }

    public void outACallStatement(ACallStatement node)
    {
        defaultOut(node);
    }

    public void caseACallStatement(ACallStatement node)
    {
        inACallStatement(node);
        {
            Object temp[] = node.getArgs().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PArg) temp[i]).apply(this);
            }
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outACallStatement(node);
    }
    public void inAPrintStatement(APrintStatement node)
    {
        defaultIn(node);
    }

    public void outAPrintStatement(APrintStatement node)
    {
        defaultOut(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        inAPrintStatement(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAPrintStatement(node);
    }
    public void inASeparatorStatement(ASeparatorStatement node)
    {
        defaultIn(node);
    }

    public void outASeparatorStatement(ASeparatorStatement node)
    {
        defaultOut(node);
    }

    public void caseASeparatorStatement(ASeparatorStatement node)
    {
        inASeparatorStatement(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outASeparatorStatement(node);
    }
    public void inAChooseWhen(AChooseWhen node)
    {
        defaultIn(node);
    }

    public void outAChooseWhen(AChooseWhen node)
    {
        defaultOut(node);
    }

    public void caseAChooseWhen(AChooseWhen node)
    {
        inAChooseWhen(node);
        {
            Object temp[] = node.getStatement().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PStatement) temp[i]).apply(this);
            }
        }
        if(node.getTest() != null)
        {
            node.getTest().apply(this);
        }
        outAChooseWhen(node);
    }
    public void inAOarg(AOarg node)
    {
        defaultIn(node);
    }

    public void outAOarg(AOarg node)
    {
        defaultOut(node);
    }

    public void caseAOarg(AOarg node)
    {
        inAOarg(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAOarg(node);
    }
    public void inAArg(AArg node)
    {
        defaultIn(node);
    }

    public void outAArg(AArg node)
    {
        defaultOut(node);
    }

    public void caseAArg(AArg node)
    {
        inAArg(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAArg(node);
    }
    public void inALiteralExpr(ALiteralExpr node)
    {
        defaultIn(node);
    }

    public void outALiteralExpr(ALiteralExpr node)
    {
        defaultOut(node);
    }

    public void caseALiteralExpr(ALiteralExpr node)
    {
        inALiteralExpr(node);
        if(node.getLiteral() != null)
        {
            node.getLiteral().apply(this);
        }
        outALiteralExpr(node);
    }
    public void inAXpathExpr(AXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAXpathExpr(AXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAXpathExpr(AXpathExpr node)
    {
        inAXpathExpr(node);
        if(node.getXpathExpr() != null)
        {
            node.getXpathExpr().apply(this);
        }
        outAXpathExpr(node);
    }
    public void inAIattribExpr(AIattribExpr node)
    {
        defaultIn(node);
    }

    public void outAIattribExpr(AIattribExpr node)
    {
        defaultOut(node);
    }

    public void caseAIattribExpr(AIattribExpr node)
    {
        inAIattribExpr(node);
        if(node.getIattrib() != null)
        {
            node.getIattrib().apply(this);
        }
        outAIattribExpr(node);
    }
    public void inAIvarExpr(AIvarExpr node)
    {
        defaultIn(node);
    }

    public void outAIvarExpr(AIvarExpr node)
    {
        defaultOut(node);
    }

    public void caseAIvarExpr(AIvarExpr node)
    {
        inAIvarExpr(node);
        if(node.getIvar() != null)
        {
            node.getIvar().apply(this);
        }
        outAIvarExpr(node);
    }
    public void inAConcatExpr(AConcatExpr node)
    {
        defaultIn(node);
    }

    public void outAConcatExpr(AConcatExpr node)
    {
        defaultOut(node);
    }

    public void caseAConcatExpr(AConcatExpr node)
    {
        inAConcatExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAConcatExpr(node);
    }
    public void inAPathXpathExpr(APathXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAPathXpathExpr(APathXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAPathXpathExpr(APathXpathExpr node)
    {
        inAPathXpathExpr(node);
        {
            Object temp[] = node.getXpathPathElem().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PXpathPathElem) temp[i]).apply(this);
            }
        }
        outAPathXpathExpr(node);
    }
    public void inALiteralXpathExpr(ALiteralXpathExpr node)
    {
        defaultIn(node);
    }

    public void outALiteralXpathExpr(ALiteralXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseALiteralXpathExpr(ALiteralXpathExpr node)
    {
        inALiteralXpathExpr(node);
        if(node.getXliteral() != null)
        {
            node.getXliteral().apply(this);
        }
        outALiteralXpathExpr(node);
    }
    public void inANumberXpathExpr(ANumberXpathExpr node)
    {
        defaultIn(node);
    }

    public void outANumberXpathExpr(ANumberXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseANumberXpathExpr(ANumberXpathExpr node)
    {
        inANumberXpathExpr(node);
        if(node.getXnumber() != null)
        {
            node.getXnumber().apply(this);
        }
        outANumberXpathExpr(node);
    }
    public void inAFunctionXpathExpr(AFunctionXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAFunctionXpathExpr(AFunctionXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAFunctionXpathExpr(AFunctionXpathExpr node)
    {
        inAFunctionXpathExpr(node);
        {
            Object temp[] = node.getArgs().toArray();
            for(int i = temp.length - 1; i >= 0;  i--)
            {
                ((PXpathExpr) temp[i]).apply(this);
            }
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAFunctionXpathExpr(node);
    }
    public void inAEqualsXpathExpr(AEqualsXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAEqualsXpathExpr(AEqualsXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAEqualsXpathExpr(AEqualsXpathExpr node)
    {
        inAEqualsXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAEqualsXpathExpr(node);
    }
    public void inANotEqualsXpathExpr(ANotEqualsXpathExpr node)
    {
        defaultIn(node);
    }

    public void outANotEqualsXpathExpr(ANotEqualsXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseANotEqualsXpathExpr(ANotEqualsXpathExpr node)
    {
        inANotEqualsXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outANotEqualsXpathExpr(node);
    }
    public void inAOrXpathExpr(AOrXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAOrXpathExpr(AOrXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAOrXpathExpr(AOrXpathExpr node)
    {
        inAOrXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAOrXpathExpr(node);
    }
    public void inAAndXpathExpr(AAndXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAAndXpathExpr(AAndXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAAndXpathExpr(AAndXpathExpr node)
    {
        inAAndXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAAndXpathExpr(node);
    }
    public void inAAddXpathExpr(AAddXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAAddXpathExpr(AAddXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAAddXpathExpr(AAddXpathExpr node)
    {
        inAAddXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAAddXpathExpr(node);
    }
    public void inASubXpathExpr(ASubXpathExpr node)
    {
        defaultIn(node);
    }

    public void outASubXpathExpr(ASubXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseASubXpathExpr(ASubXpathExpr node)
    {
        inASubXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outASubXpathExpr(node);
    }
    public void inAMulXpathExpr(AMulXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAMulXpathExpr(AMulXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAMulXpathExpr(AMulXpathExpr node)
    {
        inAMulXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAMulXpathExpr(node);
    }
    public void inADivXpathExpr(ADivXpathExpr node)
    {
        defaultIn(node);
    }

    public void outADivXpathExpr(ADivXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseADivXpathExpr(ADivXpathExpr node)
    {
        inADivXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outADivXpathExpr(node);
    }
    public void inAModXpathExpr(AModXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAModXpathExpr(AModXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAModXpathExpr(AModXpathExpr node)
    {
        inAModXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAModXpathExpr(node);
    }
    public void inALessXpathExpr(ALessXpathExpr node)
    {
        defaultIn(node);
    }

    public void outALessXpathExpr(ALessXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseALessXpathExpr(ALessXpathExpr node)
    {
        inALessXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outALessXpathExpr(node);
    }
    public void inALessOrEqualXpathExpr(ALessOrEqualXpathExpr node)
    {
        defaultIn(node);
    }

    public void outALessOrEqualXpathExpr(ALessOrEqualXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseALessOrEqualXpathExpr(ALessOrEqualXpathExpr node)
    {
        inALessOrEqualXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outALessOrEqualXpathExpr(node);
    }
    public void inAGreaterXpathExpr(AGreaterXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAGreaterXpathExpr(AGreaterXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAGreaterXpathExpr(AGreaterXpathExpr node)
    {
        inAGreaterXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAGreaterXpathExpr(node);
    }
    public void inAGreaterOrEqualXpathExpr(AGreaterOrEqualXpathExpr node)
    {
        defaultIn(node);
    }

    public void outAGreaterOrEqualXpathExpr(AGreaterOrEqualXpathExpr node)
    {
        defaultOut(node);
    }

    public void caseAGreaterOrEqualXpathExpr(AGreaterOrEqualXpathExpr node)
    {
        inAGreaterOrEqualXpathExpr(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outAGreaterOrEqualXpathExpr(node);
    }
    public void inAXpathPathElem(AXpathPathElem node)
    {
        defaultIn(node);
    }

    public void outAXpathPathElem(AXpathPathElem node)
    {
        defaultOut(node);
    }

    public void caseAXpathPathElem(AXpathPathElem node)
    {
        inAXpathPathElem(node);
        if(node.getCondition() != null)
        {
            node.getCondition().apply(this);
        }
        if(node.getElem() != null)
        {
            node.getElem().apply(this);
        }
        if(node.getSeparator() != null)
        {
            node.getSeparator().apply(this);
        }
        outAXpathPathElem(node);
    }
    public void inANameXpathElem(ANameXpathElem node)
    {
        defaultIn(node);
    }

    public void outANameXpathElem(ANameXpathElem node)
    {
        defaultOut(node);
    }

    public void caseANameXpathElem(ANameXpathElem node)
    {
        inANameXpathElem(node);
        if(node.getXname() != null)
        {
            node.getXname().apply(this);
        }
        outANameXpathElem(node);
    }
    public void inAVarXpathElem(AVarXpathElem node)
    {
        defaultIn(node);
    }

    public void outAVarXpathElem(AVarXpathElem node)
    {
        defaultOut(node);
    }

    public void caseAVarXpathElem(AVarXpathElem node)
    {
        inAVarXpathElem(node);
        if(node.getXvar() != null)
        {
            node.getXvar().apply(this);
        }
        outAVarXpathElem(node);
    }
    public void inAAttribXpathElem(AAttribXpathElem node)
    {
        defaultIn(node);
    }

    public void outAAttribXpathElem(AAttribXpathElem node)
    {
        defaultOut(node);
    }

    public void caseAAttribXpathElem(AAttribXpathElem node)
    {
        inAAttribXpathElem(node);
        if(node.getXattrib() != null)
        {
            node.getXattrib().apply(this);
        }
        outAAttribXpathElem(node);
    }
    public void inAParentXpathElem(AParentXpathElem node)
    {
        defaultIn(node);
    }

    public void outAParentXpathElem(AParentXpathElem node)
    {
        defaultOut(node);
    }

    public void caseAParentXpathElem(AParentXpathElem node)
    {
        inAParentXpathElem(node);
        outAParentXpathElem(node);
    }
    public void inACurrentXpathElem(ACurrentXpathElem node)
    {
        defaultIn(node);
    }

    public void outACurrentXpathElem(ACurrentXpathElem node)
    {
        defaultOut(node);
    }

    public void caseACurrentXpathElem(ACurrentXpathElem node)
    {
        inACurrentXpathElem(node);
        outACurrentXpathElem(node);
    }
    public void inAOneXpathSeparator(AOneXpathSeparator node)
    {
        defaultIn(node);
    }

    public void outAOneXpathSeparator(AOneXpathSeparator node)
    {
        defaultOut(node);
    }

    public void caseAOneXpathSeparator(AOneXpathSeparator node)
    {
        inAOneXpathSeparator(node);
        outAOneXpathSeparator(node);
    }
    public void inAAnyXpathSeparator(AAnyXpathSeparator node)
    {
        defaultIn(node);
    }

    public void outAAnyXpathSeparator(AAnyXpathSeparator node)
    {
        defaultOut(node);
    }

    public void caseAAnyXpathSeparator(AAnyXpathSeparator node)
    {
        inAAnyXpathSeparator(node);
        outAAnyXpathSeparator(node);
    }
}
