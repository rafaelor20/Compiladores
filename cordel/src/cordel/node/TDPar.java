/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TDPar extends Token
{
    public TDPar()
    {
        super.setText(")");
    }

    public TDPar(int line, int pos)
    {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDPar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDPar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDPar text.");
    }
}