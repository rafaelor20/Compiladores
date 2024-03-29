/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AChamada extends PChamada
{
    private TId _id_;
    private TEPar _ePar_;
    private PListaExp _listaExp_;
    private TDPar _dPar_;

    public AChamada()
    {
        // Constructor
    }

    public AChamada(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TEPar _ePar_,
        @SuppressWarnings("hiding") PListaExp _listaExp_,
        @SuppressWarnings("hiding") TDPar _dPar_)
    {
        // Constructor
        setId(_id_);

        setEPar(_ePar_);

        setListaExp(_listaExp_);

        setDPar(_dPar_);

    }

    @Override
    public Object clone()
    {
        return new AChamada(
            cloneNode(this._id_),
            cloneNode(this._ePar_),
            cloneNode(this._listaExp_),
            cloneNode(this._dPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamada(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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

    public PListaExp getListaExp()
    {
        return this._listaExp_;
    }

    public void setListaExp(PListaExp node)
    {
        if(this._listaExp_ != null)
        {
            this._listaExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaExp_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._ePar_)
            + toString(this._listaExp_)
            + toString(this._dPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._ePar_ == child)
        {
            this._ePar_ = null;
            return;
        }

        if(this._listaExp_ == child)
        {
            this._listaExp_ = null;
            return;
        }

        if(this._dPar_ == child)
        {
            this._dPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._ePar_ == oldChild)
        {
            setEPar((TEPar) newChild);
            return;
        }

        if(this._listaExp_ == oldChild)
        {
            setListaExp((PListaExp) newChild);
            return;
        }

        if(this._dPar_ == oldChild)
        {
            setDPar((TDPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
