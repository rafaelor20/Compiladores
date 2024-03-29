/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TTipoReal extends Token
{
    public TTipoReal()
    {
        super.setText("real");
    }

    public TTipoReal(int line, int pos)
    {
        super.setText("real");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTipoReal(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipoReal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTipoReal text.");
    }
}
