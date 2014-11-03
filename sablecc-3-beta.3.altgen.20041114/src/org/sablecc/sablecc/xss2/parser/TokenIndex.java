/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.parser;

import org.sablecc.sablecc.xss2.node.*;
import org.sablecc.sablecc.xss2.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    public void caseTCmdStart(TCmdStart node)
    {
        index = 0;
    }

    public void caseTCmdEnd(TCmdEnd node)
    {
        index = 1;
    }

    public void caseTForeach(TForeach node)
    {
        index = 2;
    }

    public void caseTReverseForeach(TReverseForeach node)
    {
        index = 3;
    }

    public void caseTIf(TIf node)
    {
        index = 4;
    }

    public void caseTElse(TElse node)
    {
        index = 5;
    }

    public void caseTChoose(TChoose node)
    {
        index = 6;
    }

    public void caseTWhen(TWhen node)
    {
        index = 7;
    }

    public void caseTEnd(TEnd node)
    {
        index = 8;
    }

    public void caseTInclude(TInclude node)
    {
        index = 9;
    }

    public void caseTIn(TIn node)
    {
        index = 10;
    }

    public void caseTOtherwise(TOtherwise node)
    {
        index = 11;
    }

    public void caseTSet(TSet node)
    {
        index = 12;
    }

    public void caseTParam(TParam node)
    {
        index = 13;
    }

    public void caseTOutput(TOutput node)
    {
        index = 14;
    }

    public void caseTTemplate(TTemplate node)
    {
        index = 15;
    }

    public void caseTCall(TCall node)
    {
        index = 16;
    }

    public void caseTSep(TSep node)
    {
        index = 17;
    }

    public void caseTPrint(TPrint node)
    {
        index = 18;
    }

    public void caseTEquals(TEquals node)
    {
        index = 19;
    }

    public void caseTLPar(TLPar node)
    {
        index = 20;
    }

    public void caseTRPar(TRPar node)
    {
        index = 21;
    }

    public void caseTComma(TComma node)
    {
        index = 22;
    }

    public void caseTPlus(TPlus node)
    {
        index = 23;
    }

    public void caseTData(TData node)
    {
        index = 24;
    }

    public void caseTIxpathStart(TIxpathStart node)
    {
        index = 25;
    }

    public void caseTIattrib(TIattrib node)
    {
        index = 26;
    }

    public void caseTIvar(TIvar node)
    {
        index = 27;
    }

    public void caseTIdentifier(TIdentifier node)
    {
        index = 28;
    }

    public void caseTXpathStart(TXpathStart node)
    {
        index = 29;
    }

    public void caseTLiteral(TLiteral node)
    {
        index = 30;
    }

    public void caseTXor(TXor node)
    {
        index = 31;
    }

    public void caseTXand(TXand node)
    {
        index = 32;
    }

    public void caseTXmod(TXmod node)
    {
        index = 33;
    }

    public void caseTXdiv(TXdiv node)
    {
        index = 34;
    }

    public void caseTXname(TXname node)
    {
        index = 35;
    }

    public void caseTXvar(TXvar node)
    {
        index = 36;
    }

    public void caseTXsepAny(TXsepAny node)
    {
        index = 37;
    }

    public void caseTXsepOne(TXsepOne node)
    {
        index = 38;
    }

    public void caseTXcurrent(TXcurrent node)
    {
        index = 39;
    }

    public void caseTXparent(TXparent node)
    {
        index = 40;
    }

    public void caseTXattrib(TXattrib node)
    {
        index = 41;
    }

    public void caseTXlBrace(TXlBrace node)
    {
        index = 42;
    }

    public void caseTXrBrace(TXrBrace node)
    {
        index = 43;
    }

    public void caseTXlPar(TXlPar node)
    {
        index = 44;
    }

    public void caseTXrPar(TXrPar node)
    {
        index = 45;
    }

    public void caseTXequals(TXequals node)
    {
        index = 46;
    }

    public void caseTXnotEquals(TXnotEquals node)
    {
        index = 47;
    }

    public void caseTXmul(TXmul node)
    {
        index = 48;
    }

    public void caseTXadd(TXadd node)
    {
        index = 49;
    }

    public void caseTXsub(TXsub node)
    {
        index = 50;
    }

    public void caseTXless(TXless node)
    {
        index = 51;
    }

    public void caseTXlessOrEqual(TXlessOrEqual node)
    {
        index = 52;
    }

    public void caseTXgreater(TXgreater node)
    {
        index = 53;
    }

    public void caseTXgreaterOrEqual(TXgreaterOrEqual node)
    {
        index = 54;
    }

    public void caseTXcomma(TXcomma node)
    {
        index = 55;
    }

    public void caseTXliteral(TXliteral node)
    {
        index = 56;
    }

    public void caseTXnumber(TXnumber node)
    {
        index = 57;
    }

    public void caseTXpathEnd(TXpathEnd node)
    {
        index = 58;
    }

    public void caseEOF(EOF node)
    {
        index = 59;
    }
}
