/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class TArrodeie extends Token
{
    public TArrodeie()
    {
        super.setText("arrodeie");
    }

    public TArrodeie(int line, int pos)
    {
        super.setText("arrodeie");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TArrodeie(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTArrodeie(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TArrodeie text.");
    }
}