/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class ASomaExpr extends PExpr
{
    private PExpr _expr_;
    private TSoma _soma_;
    private PFator _fator_;

    public ASomaExpr()
    {
        // Constructor
    }

    public ASomaExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TSoma _soma_,
        @SuppressWarnings("hiding") PFator _fator_)
    {
        // Constructor
        setExpr(_expr_);

        setSoma(_soma_);

        setFator(_fator_);

    }

    @Override
    public Object clone()
    {
        return new ASomaExpr(
            cloneNode(this._expr_),
            cloneNode(this._soma_),
            cloneNode(this._fator_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASomaExpr(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TSoma getSoma()
    {
        return this._soma_;
    }

    public void setSoma(TSoma node)
    {
        if(this._soma_ != null)
        {
            this._soma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._soma_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._soma_)
            + toString(this._fator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._soma_ == child)
        {
            this._soma_ = null;
            return;
        }

        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._soma_ == oldChild)
        {
            setSoma((TSoma) newChild);
            return;
        }

        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
