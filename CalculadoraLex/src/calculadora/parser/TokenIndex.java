/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.parser;

import calculadora.node.*;
import calculadora.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNumero(@SuppressWarnings("unused") TNumero node)
    {
        this.index = 0;
    }

    @Override
    public void caseTSoma(@SuppressWarnings("unused") TSoma node)
    {
        this.index = 1;
    }

    @Override
    public void caseTMenos(@SuppressWarnings("unused") TMenos node)
    {
        this.index = 2;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 3;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 4;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 5;
    }

    @Override
    public void caseTParEsq(@SuppressWarnings("unused") TParEsq node)
    {
        this.index = 6;
    }

    @Override
    public void caseTParDir(@SuppressWarnings("unused") TParDir node)
    {
        this.index = 7;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 8;
    }
}