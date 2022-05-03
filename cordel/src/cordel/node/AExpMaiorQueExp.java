/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AExpMaiorQueExp extends PExp
{
    private PExp _exp_;
    private TMaiorQue _maiorQue_;
    private POp _op_;

    public AExpMaiorQueExp()
    {
        // Constructor
    }

    public AExpMaiorQueExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TMaiorQue _maiorQue_,
        @SuppressWarnings("hiding") POp _op_)
    {
        // Constructor
        setExp(_exp_);

        setMaiorQue(_maiorQue_);

        setOp(_op_);

    }

    @Override
    public Object clone()
    {
        return new AExpMaiorQueExp(
            cloneNode(this._exp_),
            cloneNode(this._maiorQue_),
            cloneNode(this._op_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpMaiorQueExp(this);
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

    public TMaiorQue getMaiorQue()
    {
        return this._maiorQue_;
    }

    public void setMaiorQue(TMaiorQue node)
    {
        if(this._maiorQue_ != null)
        {
            this._maiorQue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maiorQue_ = node;
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
            + toString(this._maiorQue_)
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

        if(this._maiorQue_ == child)
        {
            this._maiorQue_ = null;
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

        if(this._maiorQue_ == oldChild)
        {
            setMaiorQue((TMaiorQue) newChild);
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