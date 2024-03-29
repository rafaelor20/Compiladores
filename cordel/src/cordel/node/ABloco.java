/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class ABloco extends PBloco
{
    private TBlocoInicio _blocoInicio_;
    private final LinkedList<PDecVariavel> _decVariavel_ = new LinkedList<PDecVariavel>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private TBlocoFim _blocoFim_;

    public ABloco()
    {
        // Constructor
    }

    public ABloco(
        @SuppressWarnings("hiding") TBlocoInicio _blocoInicio_,
        @SuppressWarnings("hiding") List<?> _decVariavel_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") TBlocoFim _blocoFim_)
    {
        // Constructor
        setBlocoInicio(_blocoInicio_);

        setDecVariavel(_decVariavel_);

        setComando(_comando_);

        setBlocoFim(_blocoFim_);

    }

    @Override
    public Object clone()
    {
        return new ABloco(
            cloneNode(this._blocoInicio_),
            cloneList(this._decVariavel_),
            cloneList(this._comando_),
            cloneNode(this._blocoFim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABloco(this);
    }

    public TBlocoInicio getBlocoInicio()
    {
        return this._blocoInicio_;
    }

    public void setBlocoInicio(TBlocoInicio node)
    {
        if(this._blocoInicio_ != null)
        {
            this._blocoInicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoInicio_ = node;
    }

    public LinkedList<PDecVariavel> getDecVariavel()
    {
        return this._decVariavel_;
    }

    public void setDecVariavel(List<?> list)
    {
        for(PDecVariavel e : this._decVariavel_)
        {
            e.parent(null);
        }
        this._decVariavel_.clear();

        for(Object obj_e : list)
        {
            PDecVariavel e = (PDecVariavel) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decVariavel_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public TBlocoFim getBlocoFim()
    {
        return this._blocoFim_;
    }

    public void setBlocoFim(TBlocoFim node)
    {
        if(this._blocoFim_ != null)
        {
            this._blocoFim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoFim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._blocoInicio_)
            + toString(this._decVariavel_)
            + toString(this._comando_)
            + toString(this._blocoFim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._blocoInicio_ == child)
        {
            this._blocoInicio_ = null;
            return;
        }

        if(this._decVariavel_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._blocoFim_ == child)
        {
            this._blocoFim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._blocoInicio_ == oldChild)
        {
            setBlocoInicio((TBlocoInicio) newChild);
            return;
        }

        for(ListIterator<PDecVariavel> i = this._decVariavel_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecVariavel) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._blocoFim_ == oldChild)
        {
            setBlocoFim((TBlocoFim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
