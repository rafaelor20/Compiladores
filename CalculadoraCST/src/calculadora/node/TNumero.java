/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class TNumero extends Token
{
    public TNumero(String text)
    {
        setText(text);
    }

    public TNumero(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNumero(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNumero(this);
    }
}
