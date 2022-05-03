/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PPrograma _pPrograma_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PPrograma _pPrograma_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPPrograma(_pPrograma_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pPrograma_),
            cloneNode(this._eof_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PPrograma getPPrograma()
    {
        return this._pPrograma_;
    }

    public void setPPrograma(PPrograma node)
    {
        if(this._pPrograma_ != null)
        {
            this._pPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pPrograma_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pPrograma_ == child)
        {
            this._pPrograma_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pPrograma_ == oldChild)
        {
            setPPrograma((PPrograma) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pPrograma_) +
            toString(this._eof_);
    }
}
