/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AListaAux2 extends PListaAux2
{
    private TEParametro _eParametro_;
    private PExp _exp_;

    public AListaAux2()
    {
        // Constructor
    }

    public AListaAux2(
        @SuppressWarnings("hiding") TEParametro _eParametro_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setEParametro(_eParametro_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AListaAux2(
            cloneNode(this._eParametro_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaAux2(this);
    }

    public TEParametro getEParametro()
    {
        return this._eParametro_;
    }

    public void setEParametro(TEParametro node)
    {
        if(this._eParametro_ != null)
        {
            this._eParametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eParametro_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._eParametro_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._eParametro_ == child)
        {
            this._eParametro_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._eParametro_ == oldChild)
        {
            setEParametro((TEParametro) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
