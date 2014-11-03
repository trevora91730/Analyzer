/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import java.util.*;
import org.sablecc.sablecc.xss2.analysis.*;

public final class AIncludeStatement extends PStatement
{
    private TLiteral _path_;

    public AIncludeStatement ()
    {
    }

    public AIncludeStatement (
            TLiteral _path_
    )
    {
        setPath (_path_);
    }

    public Object clone()
    {
        return new AIncludeStatement (
            (TLiteral)cloneNode (_path_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIncludeStatement(this);
    }

    public TLiteral getPath ()
    {
        return _path_;
    }

    public void setPath (TLiteral node)
    {
        if(_path_ != null)
        {
            _path_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _path_ = node;
    }

    public String toString()
    {
        return ""
            + toString (_path_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _path_ == child )
        {
            _path_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _path_ == oldChild )
        {
            setPath ((TLiteral) newChild);
            return;
        }
    }

}