/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp5210.node;

import comp5210.analysis.*;

public final class TBang extends Token
{
    public TBang()
    {
        super.setText("!");
    }

    public TBang(int line, int pos)
    {
        super.setText("!");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TBang(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBang(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TBang text.");
    }
}
