/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class ABoolNaoVariavel extends PVariavel
{
    private TBoolNao _boolNao_;

    public ABoolNaoVariavel()
    {
        // Constructor
    }

    public ABoolNaoVariavel(
        @SuppressWarnings("hiding") TBoolNao _boolNao_)
    {
        // Constructor
        setBoolNao(_boolNao_);

    }

    @Override
    public Object clone()
    {
        return new ABoolNaoVariavel(
            cloneNode(this._boolNao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoolNaoVariavel(this);
    }

    public TBoolNao getBoolNao()
    {
        return this._boolNao_;
    }

    public void setBoolNao(TBoolNao node)
    {
        if(this._boolNao_ != null)
        {
            this._boolNao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolNao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._boolNao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._boolNao_ == child)
        {
            this._boolNao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._boolNao_ == oldChild)
        {
            setBoolNao((TBoolNao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
