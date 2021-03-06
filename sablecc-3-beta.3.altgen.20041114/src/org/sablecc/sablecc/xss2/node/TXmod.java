/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.xss2.node;

import org.sablecc.sablecc.xss2.analysis.*;

public final class TXmod extends Token
{
    public TXmod()
    {
        super.setText("mod");
    }

    public TXmod(int line, int pos)
    {
        super.setText("mod");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TXmod(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTXmod(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TXmod text.");
    }
}
