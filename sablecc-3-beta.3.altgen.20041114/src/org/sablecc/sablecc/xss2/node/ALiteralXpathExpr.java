/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import java.util.*;
import org.sablecc.sablecc.xss2.analysis.*;

public final class ALiteralXpathExpr extends PXpathExpr
{
    private TXliteral _xliteral_;

    public ALiteralXpathExpr ()
    {
    }

    public ALiteralXpathExpr (
            TXliteral _xliteral_
    )
    {
        setXliteral (_xliteral_);
    }

    public Object clone()
    {
        return new ALiteralXpathExpr (
            (TXliteral)cloneNode (_xliteral_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALiteralXpathExpr(this);
    }

    public TXliteral getXliteral ()
    {
        return _xliteral_;
    }

    public void setXliteral (TXliteral node)
    {
        if(_xliteral_ != null)
        {
            _xliteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xliteral_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_xliteral_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _xliteral_ == child )
        {
            _xliteral_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _xliteral_ == oldChild )
        {
            setXliteral ((TXliteral) newChild);
            return;
        }
    }

}
