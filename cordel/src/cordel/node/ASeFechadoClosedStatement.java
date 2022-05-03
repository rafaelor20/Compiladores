/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class ASeFechadoClosedStatement extends PClosedStatement
{
    private TSe _se_;
    private TEPar _ePar_;
    private PExp _exp_;
    private TDPar _dPar_;
    private PClosedStatement _left_;
    private TSenao _senao_;
    private PClosedStatement _right_;

    public ASeFechadoClosedStatement()
    {
        // Constructor
    }

    public ASeFechadoClosedStatement(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TEPar _ePar_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TDPar _dPar_,
        @SuppressWarnings("hiding") PClosedStatement _left_,
        @SuppressWarnings("hiding") TSenao _senao_,
        @SuppressWarnings("hiding") PClosedStatement _right_)
    {
        // Constructor
        setSe(_se_);

        setEPar(_ePar_);

        setExp(_exp_);

        setDPar(_dPar_);

        setLeft(_left_);

        setSenao(_senao_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ASeFechadoClosedStatement(
            cloneNode(this._se_),
            cloneNode(this._ePar_),
            cloneNode(this._exp_),
            cloneNode(this._dPar_),
            cloneNode(this._left_),
            cloneNode(this._senao_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeFechadoClosedStatement(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
    }

    public TEPar getEPar()
    {
        return this._ePar_;
    }

    public void setEPar(TEPar node)
    {
        if(this._ePar_ != null)
        {
            this._ePar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ePar_ = node;
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

    public TDPar getDPar()
    {
        return this._dPar_;
    }

    public void setDPar(TDPar node)
    {
        if(this._dPar_ != null)
        {
            this._dPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dPar_ = node;
    }

    public PClosedStatement getLeft()
    {
        return this._left_;
    }

    public void setLeft(PClosedStatement node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TSenao getSenao()
    {
        return this._senao_;
    }

    public void setSenao(TSenao node)
    {
        if(this._senao_ != null)
        {
            this._senao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._senao_ = node;
    }

    public PClosedStatement getRight()
    {
        return this._right_;
    }

    public void setRight(PClosedStatement node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._se_)
            + toString(this._ePar_)
            + toString(this._exp_)
            + toString(this._dPar_)
            + toString(this._left_)
            + toString(this._senao_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._ePar_ == child)
        {
            this._ePar_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._dPar_ == child)
        {
            this._dPar_ = null;
            return;
        }

        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._senao_ == child)
        {
            this._senao_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._ePar_ == oldChild)
        {
            setEPar((TEPar) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._dPar_ == oldChild)
        {
            setDPar((TDPar) newChild);
            return;
        }

        if(this._left_ == oldChild)
        {
            setLeft((PClosedStatement) newChild);
            return;
        }

        if(this._senao_ == oldChild)
        {
            setSenao((TSenao) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PClosedStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
