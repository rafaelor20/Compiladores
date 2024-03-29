/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import java.util.*;
import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AListaAux1 extends PListaAux1
{
    private PExp _exp_;
    private final LinkedList<PListaAux2> _listaAux2_ = new LinkedList<PListaAux2>();

    public AListaAux1()
    {
        // Constructor
    }

    public AListaAux1(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") List<?> _listaAux2_)
    {
        // Constructor
        setExp(_exp_);

        setListaAux2(_listaAux2_);

    }

    @Override
    public Object clone()
    {
        return new AListaAux1(
            cloneNode(this._exp_),
            cloneList(this._listaAux2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaAux1(this);
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

    public LinkedList<PListaAux2> getListaAux2()
    {
        return this._listaAux2_;
    }

    public void setListaAux2(List<?> list)
    {
        for(PListaAux2 e : this._listaAux2_)
        {
            e.parent(null);
        }
        this._listaAux2_.clear();

        for(Object obj_e : list)
        {
            PListaAux2 e = (PListaAux2) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._listaAux2_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._listaAux2_);
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

        if(this._listaAux2_.remove(child))
        {
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

        for(ListIterator<PListaAux2> i = this._listaAux2_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PListaAux2) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
