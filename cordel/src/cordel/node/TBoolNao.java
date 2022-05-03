/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TBoolNao extends Token
{
    public TBoolNao()
    {
        super.setText("nao");
    }

    public TBoolNao(int line, int pos)
    {
        super.setText("nao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBoolNao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBoolNao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBoolNao text.");
    }
}