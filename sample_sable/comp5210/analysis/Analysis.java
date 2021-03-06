/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp5210.analysis;

import comp5210.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object in);
    Object getOut(Node node);
    void setOut(Node node, Object out);

    void caseStart(Start node);
    void caseAPublicFred(APublicFred node);
    void caseAPrivateFred(APrivateFred node);

    void caseTBang(TBang node);
    void caseTWhitespace(TWhitespace node);
    void caseTComment(TComment node);
    void caseTOp(TOp node);
    void caseTClass(TClass node);
    void caseTPublic(TPublic node);
    void caseTPrivate(TPrivate node);
    void caseTId(TId node);
    void caseTReturn(TReturn node);
    void caseEOF(EOF node);
}
