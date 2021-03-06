/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp5210.node;

import java.util.*;
import comp5210.analysis.*;

public final class AFred extends PFred
{
    private TPublic _public_;

    public AFred()
    {
    }

    public AFred(
        TPublic _public_)
    {
        setPublic(_public_);

    }
    public Object clone()
    {
        return new AFred(
            (TPublic) cloneNode(_public_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFred(this);
    }

    public TPublic getPublic()
    {
        return _public_;
    }

    public void setPublic(TPublic node)
    {
        if(_public_ != null)
        {
            _public_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _public_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_public_);
    }

    void removeChild(Node child)
    {
        if(_public_ == child)
        {
            _public_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_public_ == oldChild)
        {
            setPublic((TPublic) newChild);
            return;
        }

    }
}
