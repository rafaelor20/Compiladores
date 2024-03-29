/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.analysis;

import java.util.*;
import cordel.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVariavel(ADecVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaNomes(AListaNomes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAux(AIdAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoRumaTipo(ATipoRumaTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoInteiroTipoBase(ATipoInteiroTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoCaractereTipoBase(ATipoCaractereTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoRealTipoBase(ATipoRealTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBoolTipoBase(ATipoBoolTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncao(ADecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoTipoRetorno(ATipoTipoRetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANadaTipoRetorno(ANadaTipoRetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametros(AParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosAux1(AParametrosAux1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametrosAux2(AParametrosAux2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABloco(ABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpenStatementComando(AOpenStatementComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAClosedStatementComando(AClosedStatementComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSimplesOpenStatement(ASeSimplesOpenStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeAbertoOpenStatement(ASeAbertoOpenStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSenaoAbertoOpenStatement(ASeSenaoAbertoOpenStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoEnquantoAbertoOpenStatement(AComandoEnquantoAbertoOpenStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoArrodeieAbertoOpenStatement(AComandoArrodeieAbertoOpenStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAClosedStatement(AClosedStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeFechadoClosedStatement(ASeFechadoClosedStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoEnquantoFechadoClosedStatement(AComandoEnquantoFechadoClosedStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoArrodeieFechadoClosedStatement(AComandoArrodeieFechadoClosedStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoRecebeSimpleStatement(AComandoRecebeSimpleStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoMandeSimpleStatement(AComandoMandeSimpleStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoBlocoSimpleStatement(AComandoBlocoSimpleStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoChamadaSimpleStatement(AComandoChamadaSimpleStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtrib(AAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAtrib(AListaAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribAux(AAtribAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarIdVar(AVarIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarExpVar(AVarExpVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpIgualExp(AExpIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMaiorIgualExp(AExpMaiorIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMenorIgualExp(AExpMenorIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMenorQueExp(AExpMenorQueExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMaiorQueExp(AExpMaiorQueExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpNaoExp(AExpNaoExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpEExp(AExpEExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpOuExp(AExpOuExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpExp(AOpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorOp(AFactorOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisOp(AMaisOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosOp(AMenosOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpMultTermFactor(AExpMultTermFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpDivTermFactor(AExpDivTermFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarTerm(AVarTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelTerm(AVariavelTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegInteiroTerm(ANegInteiroTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANegRealTerm(ANegRealTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpPrioridadeTerm(AExpPrioridadeTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpChamadaTerm(AExpChamadaTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroInteiroVariavel(ANumeroInteiroVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroRealVariavel(ANumeroRealVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereVariavel(ACaractereVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolSimVariavel(ABoolSimVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolNaoVariavel(ABoolNaoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringVariavel(AStringVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamada(AChamada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExp(AListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAux1(AListaAux1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaAux2(AListaAux2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEmBranco(TEmBranco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractereVetor(TCaractereVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroInteiro(TNumeroInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoCaractere(TTipoCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoInteiro(TTipoInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoReal(TTipoReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoBool(TTipoBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolSim(TBoolSim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolNao(TBoolNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRuma(TRuma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlocoInicio(TBlocoInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlocoFim(TBlocoFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrodeie(TArrodeie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrume(TArrume node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAssim(TAssim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMande(TMande node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVolta(TVolta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNada(TNada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplica(TMultiplica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivide(TDivide node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorQue(TMaiorQue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorQue(TMenorQue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNaoOp(TNaoOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTECol(TECol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDCol(TDCol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEPar(TEPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDPar(TDPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEChv(TEChv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDChv(TDChv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRecebe(TRecebe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEParametro(TEParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
