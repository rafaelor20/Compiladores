/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.analysis;

import cordel.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseADecVariavel(ADecVariavel node);
    void caseAListaNomes(AListaNomes node);
    void caseAIdAux(AIdAux node);
    void caseATipoBaseTipo(ATipoBaseTipo node);
    void caseATipoRumaTipo(ATipoRumaTipo node);
    void caseATipoInteiroTipoBase(ATipoInteiroTipoBase node);
    void caseATipoCaractereTipoBase(ATipoCaractereTipoBase node);
    void caseATipoRealTipoBase(ATipoRealTipoBase node);
    void caseATipoBoolTipoBase(ATipoBoolTipoBase node);
    void caseADecFuncao(ADecFuncao node);
    void caseATipoTipoRetorno(ATipoTipoRetorno node);
    void caseANadaTipoRetorno(ANadaTipoRetorno node);
    void caseAParametros(AParametros node);
    void caseAParametrosAux1(AParametrosAux1 node);
    void caseAParametrosAux2(AParametrosAux2 node);
    void caseAParametro(AParametro node);
    void caseABloco(ABloco node);
    void caseAOpenStatementComando(AOpenStatementComando node);
    void caseAClosedStatementComando(AClosedStatementComando node);
    void caseASeSimplesOpenStatement(ASeSimplesOpenStatement node);
    void caseASeAbertoOpenStatement(ASeAbertoOpenStatement node);
    void caseASeSenaoAbertoOpenStatement(ASeSenaoAbertoOpenStatement node);
    void caseAComandoEnquantoAbertoOpenStatement(AComandoEnquantoAbertoOpenStatement node);
    void caseAComandoArrodeieAbertoOpenStatement(AComandoArrodeieAbertoOpenStatement node);
    void caseAClosedStatement(AClosedStatement node);
    void caseASeFechadoClosedStatement(ASeFechadoClosedStatement node);
    void caseAComandoEnquantoFechadoClosedStatement(AComandoEnquantoFechadoClosedStatement node);
    void caseAComandoArrodeieFechadoClosedStatement(AComandoArrodeieFechadoClosedStatement node);
    void caseAComandoRecebeSimpleStatement(AComandoRecebeSimpleStatement node);
    void caseAComandoMandeSimpleStatement(AComandoMandeSimpleStatement node);
    void caseAComandoBlocoSimpleStatement(AComandoBlocoSimpleStatement node);
    void caseAComandoChamadaSimpleStatement(AComandoChamadaSimpleStatement node);
    void caseAAtrib(AAtrib node);
    void caseAListaAtrib(AListaAtrib node);
    void caseAAtribAux(AAtribAux node);
    void caseAVarIdVar(AVarIdVar node);
    void caseAVarExpVar(AVarExpVar node);
    void caseAExpIgualExp(AExpIgualExp node);
    void caseAExpMaiorIgualExp(AExpMaiorIgualExp node);
    void caseAExpMenorIgualExp(AExpMenorIgualExp node);
    void caseAExpMenorQueExp(AExpMenorQueExp node);
    void caseAExpMaiorQueExp(AExpMaiorQueExp node);
    void caseAExpNaoExp(AExpNaoExp node);
    void caseAExpEExp(AExpEExp node);
    void caseAExpOuExp(AExpOuExp node);
    void caseAOpExp(AOpExp node);
    void caseAFactorOp(AFactorOp node);
    void caseAMaisOp(AMaisOp node);
    void caseAMenosOp(AMenosOp node);
    void caseATermFactor(ATermFactor node);
    void caseAExpMultTermFactor(AExpMultTermFactor node);
    void caseAExpDivTermFactor(AExpDivTermFactor node);
    void caseAVarTerm(AVarTerm node);
    void caseAVariavelTerm(AVariavelTerm node);
    void caseANegInteiroTerm(ANegInteiroTerm node);
    void caseANegRealTerm(ANegRealTerm node);
    void caseAExpPrioridadeTerm(AExpPrioridadeTerm node);
    void caseAExpChamadaTerm(AExpChamadaTerm node);
    void caseANumeroInteiroVariavel(ANumeroInteiroVariavel node);
    void caseANumeroRealVariavel(ANumeroRealVariavel node);
    void caseACaractereVariavel(ACaractereVariavel node);
    void caseABoolSimVariavel(ABoolSimVariavel node);
    void caseABoolNaoVariavel(ABoolNaoVariavel node);
    void caseAStringVariavel(AStringVariavel node);
    void caseAChamada(AChamada node);
    void caseAListaExp(AListaExp node);
    void caseAListaAux1(AListaAux1 node);
    void caseAListaAux2(AListaAux2 node);

    void caseTEmBranco(TEmBranco node);
    void caseTComentario(TComentario node);
    void caseTCaractere(TCaractere node);
    void caseTCaractereVetor(TCaractereVetor node);
    void caseTNumeroInteiro(TNumeroInteiro node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTTipoCaractere(TTipoCaractere node);
    void caseTTipoInteiro(TTipoInteiro node);
    void caseTTipoReal(TTipoReal node);
    void caseTTipoBool(TTipoBool node);
    void caseTBoolSim(TBoolSim node);
    void caseTBoolNao(TBoolNao node);
    void caseTRuma(TRuma node);
    void caseTDe(TDe node);
    void caseTBlocoInicio(TBlocoInicio node);
    void caseTBlocoFim(TBlocoFim node);
    void caseTArrodeie(TArrodeie node);
    void caseTEnquanto(TEnquanto node);
    void caseTRepita(TRepita node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTArrume(TArrume node);
    void caseTAssim(TAssim node);
    void caseTMande(TMande node);
    void caseTVolta(TVolta node);
    void caseTNada(TNada node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTMultiplica(TMultiplica node);
    void caseTDivide(TDivide node);
    void caseTMaiorQue(TMaiorQue node);
    void caseTMenorQue(TMenorQue node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTIgual(TIgual node);
    void caseTNaoOp(TNaoOp node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTECol(TECol node);
    void caseTDCol(TDCol node);
    void caseTEPar(TEPar node);
    void caseTDPar(TDPar node);
    void caseTEChv(TEChv node);
    void caseTDChv(TDChv node);
    void caseTVirgula(TVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTRecebe(TRecebe node);
    void caseTEParametro(TEParametro node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
