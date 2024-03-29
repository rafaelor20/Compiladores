/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AComandoArrodeieFechadoClosedStatement extends PClosedStatement
{
    private TArrodeie _arrodeie_;
    private TEPar _ePar_;
    private PListaAtrib _esq1_;
    private TPontoVirgula _esq_;
    private PExp _exp_;
    private TPontoVirgula _dir_;
    private PListaAtrib _dir1_;
    private TDPar _dPar_;
    private PClosedStatement _closedStatement_;

    public AComandoArrodeieFechadoClosedStatement()
    {
        // Constructor
    }

    public AComandoArrodeieFechadoClosedStatement(
        @SuppressWarnings("hiding") TArrodeie _arrodeie_,
        @SuppressWarnings("hiding") TEPar _ePar_,
        @SuppressWarnings("hiding") PListaAtrib _esq1_,
        @SuppressWarnings("hiding") TPontoVirgula _esq_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TPontoVirgula _dir_,
        @SuppressWarnings("hiding") PListaAtrib _dir1_,
        @SuppressWarnings("hiding") TDPar _dPar_,
        @SuppressWarnings("hiding") PClosedStatement _closedStatement_)
    {
        // Constructor
        setArrodeie(_arrodeie_);

        setEPar(_ePar_);

        setEsq1(_esq1_);

        setEsq(_esq_);

        setExp(_exp_);

        setDir(_dir_);

        setDir1(_dir1_);

        setDPar(_dPar_);

        setClosedStatement(_closedStatement_);

    }

    @Override
    public Object clone()
    {
        return new AComandoArrodeieFechadoClosedStatement(
            cloneNode(this._arrodeie_),
            cloneNode(this._ePar_),
            cloneNode(this._esq1_),
            cloneNode(this._esq_),
            cloneNode(this._exp_),
            cloneNode(this._dir_),
            cloneNode(this._dir1_),
            cloneNode(this._dPar_),
            cloneNode(this._closedStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoArrodeieFechadoClosedStatement(this);
    }

    public TArrodeie getArrodeie()
    {
        return this._arrodeie_;
    }

    public void setArrodeie(TArrodeie node)
    {
        if(this._arrodeie_ != null)
        {
            this._arrodeie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrodeie_ = node;
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

    public PListaAtrib getEsq1()
    {
        return this._esq1_;
    }

    public void setEsq1(PListaAtrib node)
    {
        if(this._esq1_ != null)
        {
            this._esq1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq1_ = node;
    }

    public TPontoVirgula getEsq()
    {
        return this._esq_;
    }

    public void setEsq(TPontoVirgula node)
    {
        if(this._esq_ != null)
        {
            this._esq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq_ = node;
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

    public TPontoVirgula getDir()
    {
        return this._dir_;
    }

    public void setDir(TPontoVirgula node)
    {
        if(this._dir_ != null)
        {
            this._dir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir_ = node;
    }

    public PListaAtrib getDir1()
    {
        return this._dir1_;
    }

    public void setDir1(PListaAtrib node)
    {
        if(this._dir1_ != null)
        {
            this._dir1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir1_ = node;
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

    public PClosedStatement getClosedStatement()
    {
        return this._closedStatement_;
    }

    public void setClosedStatement(PClosedStatement node)
    {
        if(this._closedStatement_ != null)
        {
            this._closedStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._closedStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrodeie_)
            + toString(this._ePar_)
            + toString(this._esq1_)
            + toString(this._esq_)
            + toString(this._exp_)
            + toString(this._dir_)
            + toString(this._dir1_)
            + toString(this._dPar_)
            + toString(this._closedStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrodeie_ == child)
        {
            this._arrodeie_ = null;
            return;
        }

        if(this._ePar_ == child)
        {
            this._ePar_ = null;
            return;
        }

        if(this._esq1_ == child)
        {
            this._esq1_ = null;
            return;
        }

        if(this._esq_ == child)
        {
            this._esq_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._dir_ == child)
        {
            this._dir_ = null;
            return;
        }

        if(this._dir1_ == child)
        {
            this._dir1_ = null;
            return;
        }

        if(this._dPar_ == child)
        {
            this._dPar_ = null;
            return;
        }

        if(this._closedStatement_ == child)
        {
            this._closedStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrodeie_ == oldChild)
        {
            setArrodeie((TArrodeie) newChild);
            return;
        }

        if(this._ePar_ == oldChild)
        {
            setEPar((TEPar) newChild);
            return;
        }

        if(this._esq1_ == oldChild)
        {
            setEsq1((PListaAtrib) newChild);
            return;
        }

        if(this._esq_ == oldChild)
        {
            setEsq((TPontoVirgula) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._dir_ == oldChild)
        {
            setDir((TPontoVirgula) newChild);
            return;
        }

        if(this._dir1_ == oldChild)
        {
            setDir1((PListaAtrib) newChild);
            return;
        }

        if(this._dPar_ == oldChild)
        {
            setDPar((TDPar) newChild);
            return;
        }

        if(this._closedStatement_ == oldChild)
        {
            setClosedStatement((PClosedStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
