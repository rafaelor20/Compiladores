/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AExpNaoExp extends PExp
{
    private TNaoOp _naoOp_;
    private POp _op_;

    public AExpNaoExp()
    {
        // Constructor
    }

    public AExpNaoExp(
        @SuppressWarnings("hiding") TNaoOp _naoOp_,
        @SuppressWarnings("hiding") POp _op_)
    {
        // Constructor
        setNaoOp(_naoOp_);

        setOp(_op_);

    }

    @Override
    public Object clone()
    {
        return new AExpNaoExp(
            cloneNode(this._naoOp_),
            cloneNode(this._op_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpNaoExp(this);
    }

    public TNaoOp getNaoOp()
    {
        return this._naoOp_;
    }

    public void setNaoOp(TNaoOp node)
    {
        if(this._naoOp_ != null)
        {
            this._naoOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._naoOp_ = node;
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
            + toString(this._naoOp_)
            + toString(this._op_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._naoOp_ == child)
        {
            this._naoOp_ = null;
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
        if(this._naoOp_ == oldChild)
        {
            setNaoOp((TNaoOp) newChild);
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
