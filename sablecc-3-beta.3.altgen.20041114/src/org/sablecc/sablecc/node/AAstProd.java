/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import java.util.*;
import org.sablecc.sablecc.analysis.*;

public final class AAstProd extends PAstProd
{
    private TId _id_;
    private final LinkedList _alts_ = new TypedLinkedList(new Alts_Cast());

    public AAstProd ()
    {
    }

    public AAstProd (
            TId _id_,
            List _alts_
    )
    {
        setId (_id_);
        this._alts_.clear();
        this._alts_.addAll(_alts_);
    }

    public Object clone()
    {
        return new AAstProd (
            (TId)cloneNode (_id_),
            cloneList (_alts_)
        );
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAstProd(this);
    }

    public TId getId ()
    {
        return _id_;
    }

    public void setId (TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }
    public LinkedList getAlts ()
    {
        return _alts_;
    }

    public void setAlts (List list)
    {
        _alts_.clear();
        _alts_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString (_id_)
            + toString (_alts_)
        ;
    }

    void removeChild(Node child)
    {
        if ( _id_ == child )
        {
            _id_ = null;
            return;
        }
        if ( _alts_.remove(child))
        {
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if ( _id_ == oldChild )
        {
            setId ((TId) newChild);
            return;
        }
        for(ListIterator i = _alts_.listIterator(); i.hasNext();)
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

    private class Alts_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PAstAlt node = (PAstAlt) o;

            if((node.parent() != null) &&
                (node.parent() != AAstProd.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AAstProd.this))
            {
                node.parent(AAstProd.this);
            }

            return node;
        }
    }
}
