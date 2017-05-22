/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TGoto extends Token
{
    public TGoto()
    {
        super.setText("goto");
    }

    public TGoto(int line, int pos)
    {
        super.setText("goto");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TGoto(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGoto(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TGoto text.");
    }
}
