/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class ADivFator extends PFator
{
    private PFator _fator_;
    private TDiv _div_;
    private PTermo _termo_;

    public ADivFator()
    {
        // Constructor
    }

    public ADivFator(
        @SuppressWarnings("hiding") PFator _fator_,
        @SuppressWarnings("hiding") TDiv _div_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setFator(_fator_);

        setDiv(_div_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new ADivFator(
            cloneNode(this._fator_),
            cloneNode(this._div_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivFator(this);
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    public TDiv getDiv()
    {
        return this._div_;
    }

    public void setDiv(TDiv node)
    {
        if(this._div_ != null)
        {
            this._div_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._div_ = node;
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fator_)
            + toString(this._div_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        if(this._div_ == child)
        {
            this._div_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        if(this._div_ == oldChild)
        {
            setDiv((TDiv) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
