/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AExpOuExp extends PExp
{
    private PExp _exp_;
    private TOu _ou_;
    private POp _op_;

    public AExpOuExp()
    {
        // Constructor
    }

    public AExpOuExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TOu _ou_,
        @SuppressWarnings("hiding") POp _op_)
    {
        // Constructor
        setExp(_exp_);

        setOu(_ou_);

        setOp(_op_);

    }

    @Override
    public Object clone()
    {
        return new AExpOuExp(
            cloneNode(this._exp_),
            cloneNode(this._ou_),
            cloneNode(this._op_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpOuExp(this);
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

    public TOu getOu()
    {
        return this._ou_;
    }

    public void setOu(TOu node)
    {
        if(this._ou_ != null)
        {
            this._ou_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ou_ = node;
    }

    public POp getOp()
    {
        return this._op_;
    }

    public void setOp(POp node)
    {
        if(this._op_ != null)
        {
            this._op_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._ou_)
            + toString(this._op_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._ou_ == child)
        {
            this._ou_ = null;
            return;
        }

        if(this._op_ == child)
        {
            this._op_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._ou_ == oldChild)
        {
            setOu((TOu) newChild);
            return;
        }

        if(this._op_ == oldChild)
        {
            setOp((POp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}