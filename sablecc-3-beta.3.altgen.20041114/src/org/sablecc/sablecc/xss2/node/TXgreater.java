/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import org.sablecc.sablecc.xss2.analysis.*;

public final class TXgreater extends Token
{
    public TXgreater()
    {
        super.setText(">");
    }

    public TXgreater(int line, int pos)
    {
        super.setText(">");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TXgreater(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTXgreater(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TXgreater text.");
    }
}
