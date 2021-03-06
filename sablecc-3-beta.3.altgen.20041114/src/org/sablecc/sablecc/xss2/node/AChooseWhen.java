/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import java.util.*;
import org.sablecc.sablecc.xss2.analysis.*;

public final class AChooseWhen extends PChooseWhen
{
    private PExpr _test_;
    private final LinkedList _statement_ = new TypedLinkedList(new Statement_Cast());

    public AChooseWhen ()
    {
    }

    public AChooseWhen (
            PExpr _test_,
            List _statement_
    )
    {
        setTest (_test_);
        this._statement_.clear();
        this._statement_.addAll(_statement_);
    }

    public Object clone()
    {
        return new AChooseWhen (
            (PExpr)cloneNode (_test_),
            cloneList (_statement_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChooseWhen(this);
    }

    public PExpr getTest ()
    {
        return _test_;
    }

    public void setTest (PExpr node)
    {
        if(_test_ != null)
        {
            _test_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _test_ = node;
    }
    public LinkedList getStatement ()
    {
        return _statement_;
    }

    public void setStatement (List list)
    {
        _statement_.clear();
        _statement_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString (_test_)
            + toString (_statement_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _test_ == child )
        {
            _test_ = null;
            return;
        }
        if ( _statement_.remove(child))
        {
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _test_ == oldChild )
        {
            setTest ((PExpr) newChild);
            return;
        }
        for(ListIterator i = _statement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }
    }

    private class Statement_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PStatement node = (PStatement) o;

            if((node.parent() != null) &&
                (node.parent() != AChooseWhen.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AChooseWhen.this))
            {
                node.parent(AChooseWhen.this);
            }

            return node;
        }
    }
}
