/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import org.sablecc.sablecc.xss2.analysis.*;

public final class TXadd extends Token
{
    public TXadd()
    {
        super.setText("+");
    }

    public TXadd(int line, int pos)
    {
        super.setText("+");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TXadd(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTXadd(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TXadd text.");
    }
}
