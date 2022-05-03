/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class ATipoCaractereTipoBase extends PTipoBase
{
    private TTipoCaractere _tipoCaractere_;

    public ATipoCaractereTipoBase()
    {
        // Constructor
    }

    public ATipoCaractereTipoBase(
        @SuppressWarnings("hiding") TTipoCaractere _tipoCaractere_)
    {
        // Constructor
        setTipoCaractere(_tipoCaractere_);

    }

    @Override
    public Object clone()
    {
        return new ATipoCaractereTipoBase(
            cloneNode(this._tipoCaractere_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoCaractereTipoBase(this);
    }

    public TTipoCaractere getTipoCaractere()
    {
        return this._tipoCaractere_;
    }

    public void setTipoCaractere(TTipoCaractere node)
    {
        if(this._tipoCaractere_ != null)
        {
            this._tipoCaractere_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoCaractere_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoCaractere_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoCaractere_ == child)
        {
            this._tipoCaractere_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoCaractere_ == oldChild)
        {
            setTipoCaractere((TTipoCaractere) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
