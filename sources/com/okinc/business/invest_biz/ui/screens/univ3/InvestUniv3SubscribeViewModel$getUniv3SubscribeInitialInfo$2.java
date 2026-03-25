package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.network.okg.response.ResponseFailedException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C23566iBc;
import o.C23948iPg;
import o.C23958iPq;
import o.C25480ixX;
import o.C27315jsq;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeViewModel$getUniv3SubscribeInitialInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InvestUniv3SubscribeInfo>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$getUniv3SubscribeInitialInfo$2(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, Continuation<? super InvestUniv3SubscribeViewModel$getUniv3SubscribeInitialInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$getUniv3SubscribeInitialInfo$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InvestUniv3SubscribeInfo> continuation) {
        return ((InvestUniv3SubscribeViewModel$getUniv3SubscribeInitialInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0496 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0299  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo;
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel;
        BigDecimal bigDecimalEZpvd;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo2;
        Integer num;
        Integer num2;
        BigDecimal bigDecimalEZpvd2;
        BigDecimal bigDecimalEZpvd3;
        InvestTokenWithAmount investTokenWithAmountGasjUx;
        Object next;
        InvestTokenWithAmount investTokenWithAmountFlVtFt;
        Object next2;
        InvestPoolV3 investPoolV3;
        Integer upperTicker;
        Integer lowerTicker;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo3;
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel2;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo4;
        int i;
        MutableSharedFlow<C27315jsq> mutableSharedFlowIRxXKY;
        C27315jsq c27315jsq;
        String tokenAddress;
        InvestTokenWithAmount investTokenWithAmountFlVtFt2;
        Object next3;
        String coinAmount;
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel3;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo5;
        String coinAmount2;
        Object next4;
        String coinAmount3;
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel4;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo6;
        String coinAmount4;
        String amount;
        InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo7;
        String amount2;
        InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex2;
        Object objAwaitFirst;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel5 = this.this$0;
                Result.Application application2 = Result.Companion;
                AbstractC58185ywX abstractC58185ywXAEQbTJ = C23566iBc.EZpvd.AEQbTJ(investUniv3SubscribeViewModel5.gHZMYf, investUniv3SubscribeViewModel5.accept(), (64 & 4) != 0 ? "" : "", (64 & 8) != 0 ? false : investUniv3SubscribeViewModel5.DTwDnp, (64 & 16) != 0 ? "" : investUniv3SubscribeViewModel5.hBpjJd, (64 & 32) != 0 ? "" : investUniv3SubscribeViewModel5.zuWLRA, (64 & 64) != 0 ? false : false);
                this.label = 1;
                objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, this);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((InvestUniv3SubscribeInfo) objAwaitFirst);
                if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    if ((Result.m7380exceptionOrNullimpl(objM7377constructorimpl) instanceof ResponseFailedException) || (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) instanceof IllegalArgumentException)) {
                        this.this$0.AubY().setValue(new C23958iPq(false, false));
                    } else {
                        this.this$0.AubY().setValue(new C23958iPq(false, true));
                    }
                } else {
                    this.this$0.AubY().setValue(new C23958iPq(true, false));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) objM7377constructorimpl;
                if (investUniv3SubscribeInfo != null) {
                    return null;
                }
                investUniv3SubscribeViewModel = this.this$0;
                investUniv3SubscribeViewModel.copydefault(investUniv3SubscribeInfo);
                investUniv3SubscribeViewModel.OLrzqt(investUniv3SubscribeInfo);
                Integer tickSpacing = investUniv3SubscribeInfo.getTickSpacing();
                investUniv3SubscribeViewModel.AhwBna(tickSpacing != null ? tickSpacing.intValue() : 0);
                Integer currentTick = investUniv3SubscribeInfo.getCurrentTick();
                investUniv3SubscribeViewModel.gEmmrt(currentTick != null ? currentTick.intValue() : 0);
                List<Integer> uniV3TickRange = investUniv3SubscribeInfo.getUniV3TickRange();
                investUniv3SubscribeViewModel.UeEOUB = (uniV3TickRange == null || (num2 = (Integer) CollectionsKt___CollectionsKt.AkhnZx(uniV3TickRange, 0)) == null) ? -887272 : num2.intValue();
                List<Integer> uniV3TickRange2 = investUniv3SubscribeInfo.getUniV3TickRange();
                investUniv3SubscribeViewModel.djSkpj = (uniV3TickRange2 == null || (num = (Integer) CollectionsKt___CollectionsKt.AkhnZx(uniV3TickRange2, 1)) == null) ? 887272 : num.intValue();
                String uniV3Base = investUniv3SubscribeInfo.getUniV3Base();
                if (uniV3Base == null || uniV3Base.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) uniV3Base)) {
                    uniV3Base = "1.0001";
                }
                investUniv3SubscribeViewModel.AEQbTJ = uniV3Base;
                investUniv3SubscribeViewModel.OLrzqt((InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 0));
                investUniv3SubscribeViewModel.copydefault((InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 0));
                investUniv3SubscribeViewModel.KWHzl((InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 1));
                investUniv3SubscribeViewModel.AEQbTJ((InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 1));
                MutableStateFlow<BigDecimal> mutableStateFlowEjfBZ = investUniv3SubscribeViewModel.ejfBZ();
                if (investUniv3SubscribeViewModel.getPostValueLengthLimit()) {
                    bigDecimalEZpvd = C33129mqd.EZpvd(investUniv3SubscribeInfo.getCurrentPrice());
                } else {
                    bigDecimalEZpvd = C33129mqd.EZpvd(C33129mqd.divS$default(C56443yFo.AEQbTJ(1), investUniv3SubscribeInfo.getCurrentPrice(), null, null, null, 14, null));
                }
                this.L$0 = investUniv3SubscribeInfo;
                this.L$1 = investUniv3SubscribeViewModel;
                this.L$2 = investUniv3SubscribeInfo;
                this.label = 2;
                if (mutableStateFlowEjfBZ.emit(bigDecimalEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
                investUniv3SubscribeInfo2 = investUniv3SubscribeInfo;
                if (C33129mqd.OLrzqt((CharSequence) investUniv3SubscribeInfo.getLowerPrice())) {
                    if (investUniv3SubscribeViewModel.getPostValueLengthLimit()) {
                        bigDecimalEZpvd2 = C33129mqd.EZpvd(investUniv3SubscribeInfo.getLowerPrice());
                    } else {
                        bigDecimalEZpvd2 = C33129mqd.EZpvd(C33129mqd.divS$default(C56443yFo.AEQbTJ(1), investUniv3SubscribeInfo.getUpperPrice(), null, null, null, 14, null));
                    }
                    MutableSharedFlow<C27315jsq> mutableSharedFlowSSMYrx = investUniv3SubscribeViewModel.sSMYrx();
                    C27315jsq c27315jsq2 = new C27315jsq(bigDecimalEZpvd2, investUniv3SubscribeViewModel.OLrzqt(bigDecimalEZpvd2));
                    this.L$0 = investUniv3SubscribeInfo2;
                    this.L$1 = investUniv3SubscribeViewModel;
                    this.L$2 = investUniv3SubscribeInfo;
                    this.label = 3;
                    if (mutableSharedFlowSSMYrx.emit(c27315jsq2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (C33129mqd.OLrzqt((CharSequence) investUniv3SubscribeInfo.getUpperPrice())) {
                    if (investUniv3SubscribeViewModel.getPostValueLengthLimit()) {
                        bigDecimalEZpvd3 = C33129mqd.EZpvd(investUniv3SubscribeInfo.getUpperPrice());
                    } else {
                        bigDecimalEZpvd3 = C33129mqd.EZpvd(C33129mqd.divS$default(C56443yFo.AEQbTJ(1), investUniv3SubscribeInfo.getLowerPrice(), null, null, null, 14, null));
                    }
                    MutableSharedFlow<C27315jsq> mutableSharedFlowIRxXKY2 = investUniv3SubscribeViewModel.iRxXKY();
                    C27315jsq c27315jsq3 = new C27315jsq(bigDecimalEZpvd3, investUniv3SubscribeViewModel.OLrzqt(bigDecimalEZpvd3));
                    this.L$0 = investUniv3SubscribeInfo2;
                    this.L$1 = investUniv3SubscribeViewModel;
                    this.L$2 = investUniv3SubscribeInfo;
                    this.label = 4;
                    if (mutableSharedFlowIRxXKY2.emit(c27315jsq3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                investTokenWithAmountGasjUx = investUniv3SubscribeViewModel.gasjUx();
                if (investTokenWithAmountGasjUx != null) {
                    Iterator<T> it = investUniv3SubscribeInfo.getInvestWithTokenList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) investTokenWithAmountGasjUx.getTokenAddress())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) next;
                    if (investTokenWithAmount != null) {
                        investTokenWithAmountGasjUx.setCoinAmount(investTokenWithAmount.getCoinAmount());
                        MutableStateFlow<C25480ixX> mutableStateFlowAwvSrB = investUniv3SubscribeViewModel.AwvSrB();
                        C25480ixX c25480ixX = new C25480ixX("0", investTokenWithAmountGasjUx.getTokenSymbol(), investTokenWithAmountGasjUx.getTokenLogo(), "0", false, investUniv3SubscribeViewModel.KWHzl(investTokenWithAmount.isBaseToken(), investTokenWithAmount.getCoinAmount()), false, false, false, null, C33129mqd.AhwBna(investTokenWithAmountGasjUx.getTokenPrecision()), investTokenWithAmountGasjUx.getCoinAmount(), false, 5072, null);
                        this.L$0 = investUniv3SubscribeInfo2;
                        this.L$1 = investUniv3SubscribeViewModel;
                        this.L$2 = investUniv3SubscribeInfo;
                        this.label = 5;
                        if (mutableStateFlowAwvSrB.emit(c25480ixX, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                investTokenWithAmountFlVtFt = investUniv3SubscribeViewModel.flVtFt();
                if (investTokenWithAmountFlVtFt != null) {
                    Iterator<T> it2 = investUniv3SubscribeInfo.getInvestWithTokenList().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next2).getTokenAddress(), (Object) investTokenWithAmountFlVtFt.getTokenAddress())) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) next2;
                    if (investTokenWithAmount2 != null) {
                        investTokenWithAmountFlVtFt.setCoinAmount(investTokenWithAmount2.getCoinAmount());
                        MutableStateFlow<C25480ixX> mutableStateFlowZuBGHE = investUniv3SubscribeViewModel.zuBGHE();
                        C25480ixX c25480ixX2 = new C25480ixX("0", investTokenWithAmountFlVtFt.getTokenSymbol(), investTokenWithAmountFlVtFt.getTokenLogo(), "0", false, investUniv3SubscribeViewModel.KWHzl(investTokenWithAmount2.isBaseToken(), investTokenWithAmount2.getCoinAmount()), false, false, false, null, C33129mqd.AhwBna(investTokenWithAmountFlVtFt.getTokenPrecision()), investTokenWithAmountFlVtFt.getCoinAmount(), false, 5072, null);
                        this.L$0 = investUniv3SubscribeInfo2;
                        this.L$1 = investUniv3SubscribeViewModel;
                        this.L$2 = investUniv3SubscribeInfo;
                        this.label = 6;
                        if (mutableStateFlowZuBGHE.emit(c25480ixX2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                if (investUniv3SubscribeViewModel.zLjUOn != null && investUniv3SubscribeViewModel.gGvvIC != null) {
                    investPoolV3 = investUniv3SubscribeViewModel.gGvvIC;
                    Intrinsics.copydefault(investPoolV3);
                    if (investPoolV3.getLowerTicker() != null) {
                        InvestPoolV3 investPoolV32 = investUniv3SubscribeViewModel.gGvvIC;
                        Intrinsics.copydefault(investPoolV32);
                        if (investPoolV32.getUpperTicker() != null) {
                            if (investUniv3SubscribeViewModel.getPostValueLengthLimit()) {
                                InvestPoolV3 investPoolV33 = investUniv3SubscribeViewModel.gGvvIC;
                                Intrinsics.copydefault(investPoolV33);
                                upperTicker = investPoolV33.getLowerTicker();
                            } else {
                                InvestPoolV3 investPoolV34 = investUniv3SubscribeViewModel.gGvvIC;
                                Intrinsics.copydefault(investPoolV34);
                                upperTicker = investPoolV34.getUpperTicker();
                            }
                            Intrinsics.copydefault(upperTicker);
                            int iIntValue = upperTicker.intValue();
                            if (investUniv3SubscribeViewModel.getPostValueLengthLimit()) {
                                InvestPoolV3 investPoolV35 = investUniv3SubscribeViewModel.gGvvIC;
                                Intrinsics.copydefault(investPoolV35);
                                lowerTicker = investPoolV35.getUpperTicker();
                            } else {
                                InvestPoolV3 investPoolV36 = investUniv3SubscribeViewModel.gGvvIC;
                                Intrinsics.copydefault(investPoolV36);
                                lowerTicker = investPoolV36.getLowerTicker();
                            }
                            Intrinsics.copydefault(lowerTicker);
                            int iIntValue2 = lowerTicker.intValue();
                            MutableSharedFlow<C27315jsq> mutableSharedFlowSSMYrx2 = investUniv3SubscribeViewModel.sSMYrx();
                            C27315jsq c27315jsq4 = new C27315jsq(investUniv3SubscribeViewModel.OLrzqt(iIntValue), iIntValue);
                            this.L$0 = investUniv3SubscribeInfo2;
                            this.L$1 = investUniv3SubscribeViewModel;
                            this.L$2 = investUniv3SubscribeInfo;
                            this.I$0 = iIntValue2;
                            this.label = 7;
                            if (mutableSharedFlowSSMYrx2.emit(c27315jsq4, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            investUniv3SubscribeInfo3 = investUniv3SubscribeInfo2;
                            investUniv3SubscribeViewModel2 = investUniv3SubscribeViewModel;
                            investUniv3SubscribeInfo4 = investUniv3SubscribeInfo;
                            i = iIntValue2;
                            mutableSharedFlowIRxXKY = investUniv3SubscribeViewModel2.iRxXKY();
                            c27315jsq = new C27315jsq(investUniv3SubscribeViewModel2.OLrzqt(i), i);
                            this.L$0 = investUniv3SubscribeInfo3;
                            this.L$1 = investUniv3SubscribeViewModel2;
                            this.L$2 = investUniv3SubscribeInfo4;
                            this.label = 8;
                            if (mutableSharedFlowIRxXKY.emit(c27315jsq, this) != objCopydefault) {
                                return objCopydefault;
                            }
                            investUniv3SubscribeInfo = investUniv3SubscribeInfo4;
                            investUniv3SubscribeViewModel = investUniv3SubscribeViewModel2;
                            investUniv3SubscribeInfo2 = investUniv3SubscribeInfo3;
                        }
                    }
                    InvestInputData investInputData = investUniv3SubscribeViewModel.zLjUOn;
                    Intrinsics.copydefault(investInputData);
                    tokenAddress = investInputData.getTokenAddress();
                    if (tokenAddress != null && tokenAddress.length() > 0) {
                        if (investUniv3SubscribeViewModel.gasjUx() == null) {
                            InvestTokenWithAmount investTokenWithAmountGasjUx2 = investUniv3SubscribeViewModel.gasjUx();
                            Intrinsics.copydefault(investTokenWithAmountGasjUx2);
                            String tokenAddress2 = investTokenWithAmountGasjUx2.getTokenAddress();
                            InvestInputData investInputData2 = investUniv3SubscribeViewModel.zLjUOn;
                            Intrinsics.copydefault(investInputData2);
                            if (C59449zhJ.gEmmrt(tokenAddress2, investInputData2.getTokenAddress(), true)) {
                                InvestTokenWithAmount investTokenWithAmountGasjUx3 = investUniv3SubscribeViewModel.gasjUx();
                                if (investTokenWithAmountGasjUx3 != null) {
                                    Iterator<T> it3 = investUniv3SubscribeInfo.getInvestWithTokenList().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next4 = it3.next();
                                            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next4).getTokenAddress(), (Object) investTokenWithAmountGasjUx3.getTokenAddress())) {
                                            }
                                        } else {
                                            next4 = null;
                                        }
                                    }
                                    InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) next4;
                                    if (investTokenWithAmount3 == null || (coinAmount3 = investTokenWithAmount3.getCoinAmount()) == null) {
                                        coinAmount3 = "";
                                    }
                                    investTokenWithAmountGasjUx3.setCoinAmount(coinAmount3);
                                    MutableStateFlow<C25480ixX> mutableStateFlowAwvSrB2 = investUniv3SubscribeViewModel.AwvSrB();
                                    InvestInputData investInputData3 = investUniv3SubscribeViewModel.zLjUOn;
                                    Intrinsics.copydefault(investInputData3);
                                    String amount3 = investInputData3.getAmount();
                                    C25480ixX c25480ixX3 = new C25480ixX(amount3 == null ? "0" : amount3, investTokenWithAmountGasjUx3.getTokenSymbol(), investTokenWithAmountGasjUx3.getTokenLogo(), "0", false, investTokenWithAmount3 != null ? investUniv3SubscribeViewModel.KWHzl(investTokenWithAmount3.isBaseToken(), investTokenWithAmount3.getCoinAmount()) : false, false, false, false, null, C33129mqd.AhwBna(investTokenWithAmountGasjUx3.getTokenPrecision()), (investTokenWithAmount3 == null || (coinAmount4 = investTokenWithAmount3.getCoinAmount()) == null) ? "" : coinAmount4, false, 5072, null);
                                    this.L$0 = investUniv3SubscribeInfo2;
                                    this.L$1 = investUniv3SubscribeViewModel;
                                    this.L$2 = null;
                                    this.label = 9;
                                    if (mutableStateFlowAwvSrB2.emit(c25480ixX3, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    investUniv3SubscribeViewModel4 = investUniv3SubscribeViewModel;
                                    investUniv3SubscribeInfo6 = investUniv3SubscribeInfo2;
                                    investUniv3SubscribeViewModel4.zsXlph().setValue(C56443yFo.KWHzl(true));
                                    InvestInputData investInputData4 = investUniv3SubscribeViewModel4.zLjUOn;
                                    Intrinsics.copydefault(investInputData4);
                                    amount = investInputData4.getAmount();
                                    if (amount == null) {
                                        amount = "0";
                                    }
                                    amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.First;
                                    this.L$0 = investUniv3SubscribeInfo6;
                                    this.L$1 = investUniv3SubscribeViewModel4;
                                    this.label = 10;
                                    if (InvestUniv3SubscribeViewModel.getReceiveInfoAndCheckState$default(investUniv3SubscribeViewModel4, amount, amountInputIndex, false, this, 4, null) != objCopydefault) {
                                        return objCopydefault;
                                    }
                                    investUniv3SubscribeInfo7 = investUniv3SubscribeInfo6;
                                    investUniv3SubscribeViewModel4.wlaJM().setValue(new C23948iPg(false, "", false, true, false, 20, null));
                                    Unit unit3 = Unit.INSTANCE;
                                    return investUniv3SubscribeInfo7;
                                }
                            } else if (investUniv3SubscribeViewModel.flVtFt() != null) {
                                InvestTokenWithAmount investTokenWithAmountFlVtFt3 = investUniv3SubscribeViewModel.flVtFt();
                                Intrinsics.copydefault(investTokenWithAmountFlVtFt3);
                                String tokenAddress3 = investTokenWithAmountFlVtFt3.getTokenAddress();
                                InvestInputData investInputData5 = investUniv3SubscribeViewModel.zLjUOn;
                                Intrinsics.copydefault(investInputData5);
                                if (C59449zhJ.gEmmrt(tokenAddress3, investInputData5.getTokenAddress(), true) && (investTokenWithAmountFlVtFt2 = investUniv3SubscribeViewModel.flVtFt()) != null) {
                                    Iterator<T> it4 = investUniv3SubscribeInfo.getInvestWithTokenList().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            next3 = it4.next();
                                            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next3).getTokenAddress(), (Object) investTokenWithAmountFlVtFt2.getTokenAddress())) {
                                            }
                                        } else {
                                            next3 = null;
                                        }
                                    }
                                    InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) next3;
                                    if (investTokenWithAmount4 == null || (coinAmount = investTokenWithAmount4.getCoinAmount()) == null) {
                                        coinAmount = "";
                                    }
                                    investTokenWithAmountFlVtFt2.setCoinAmount(coinAmount);
                                    MutableStateFlow<C25480ixX> mutableStateFlowZuBGHE2 = investUniv3SubscribeViewModel.zuBGHE();
                                    InvestInputData investInputData6 = investUniv3SubscribeViewModel.zLjUOn;
                                    Intrinsics.copydefault(investInputData6);
                                    String amount4 = investInputData6.getAmount();
                                    C25480ixX c25480ixX4 = new C25480ixX(amount4 == null ? "0" : amount4, investTokenWithAmountFlVtFt2.getTokenSymbol(), investTokenWithAmountFlVtFt2.getTokenLogo(), "0", false, investTokenWithAmount4 != null ? investUniv3SubscribeViewModel.KWHzl(investTokenWithAmount4.isBaseToken(), investTokenWithAmount4.getCoinAmount()) : false, false, false, false, null, C33129mqd.AhwBna(investTokenWithAmountFlVtFt2.getTokenPrecision()), (investTokenWithAmount4 == null || (coinAmount2 = investTokenWithAmount4.getCoinAmount()) == null) ? "" : coinAmount2, false, 5072, null);
                                    this.L$0 = investUniv3SubscribeInfo2;
                                    this.L$1 = investUniv3SubscribeViewModel;
                                    this.L$2 = null;
                                    this.label = 11;
                                    if (mutableStateFlowZuBGHE2.emit(c25480ixX4, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    investUniv3SubscribeViewModel3 = investUniv3SubscribeViewModel;
                                    investUniv3SubscribeInfo5 = investUniv3SubscribeInfo2;
                                    investUniv3SubscribeViewModel3.zsXlph().setValue(C56443yFo.KWHzl(true));
                                    InvestInputData investInputData7 = investUniv3SubscribeViewModel3.zLjUOn;
                                    Intrinsics.copydefault(investInputData7);
                                    amount2 = investInputData7.getAmount();
                                    if (amount2 == null) {
                                        amount2 = "0";
                                    }
                                    amountInputIndex2 = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                                    this.L$0 = investUniv3SubscribeInfo5;
                                    this.L$1 = investUniv3SubscribeViewModel3;
                                    this.label = 12;
                                    if (InvestUniv3SubscribeViewModel.getReceiveInfoAndCheckState$default(investUniv3SubscribeViewModel3, amount2, amountInputIndex2, false, this, 4, null) != objCopydefault) {
                                        return objCopydefault;
                                    }
                                    investUniv3SubscribeInfo7 = investUniv3SubscribeInfo5;
                                }
                            }
                        }
                        investUniv3SubscribeViewModel3.wlaJM().setValue(new C23948iPg(false, "", false, true, false, 20, null));
                        Unit unit4 = Unit.INSTANCE;
                        return investUniv3SubscribeInfo7;
                    }
                }
                return investUniv3SubscribeInfo2;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objAwaitFirst = obj;
                objM7377constructorimpl = Result.m7377constructorimpl((InvestUniv3SubscribeInfo) objAwaitFirst);
                if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) objM7377constructorimpl;
                if (investUniv3SubscribeInfo != null) {
                }
                break;
            case 2:
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) this.L$2;
                investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo2 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (C33129mqd.OLrzqt((CharSequence) investUniv3SubscribeInfo.getLowerPrice())) {
                }
                if (C33129mqd.OLrzqt((CharSequence) investUniv3SubscribeInfo.getUpperPrice())) {
                }
                investTokenWithAmountGasjUx = investUniv3SubscribeViewModel.gasjUx();
                if (investTokenWithAmountGasjUx != null) {
                }
                investTokenWithAmountFlVtFt = investUniv3SubscribeViewModel.flVtFt();
                if (investTokenWithAmountFlVtFt != null) {
                }
                if (investUniv3SubscribeViewModel.zLjUOn != null) {
                    investPoolV3 = investUniv3SubscribeViewModel.gGvvIC;
                    Intrinsics.copydefault(investPoolV3);
                    if (investPoolV3.getLowerTicker() != null) {
                    }
                    InvestInputData investInputData8 = investUniv3SubscribeViewModel.zLjUOn;
                    Intrinsics.copydefault(investInputData8);
                    tokenAddress = investInputData8.getTokenAddress();
                    if (tokenAddress != null) {
                        if (investUniv3SubscribeViewModel.gasjUx() == null) {
                        }
                        investUniv3SubscribeViewModel3.wlaJM().setValue(new C23948iPg(false, "", false, true, false, 20, null));
                        Unit unit42 = Unit.INSTANCE;
                        return investUniv3SubscribeInfo7;
                    }
                }
                return investUniv3SubscribeInfo2;
            case 3:
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) this.L$2;
                investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo2 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (C33129mqd.OLrzqt((CharSequence) investUniv3SubscribeInfo.getUpperPrice())) {
                }
                investTokenWithAmountGasjUx = investUniv3SubscribeViewModel.gasjUx();
                if (investTokenWithAmountGasjUx != null) {
                }
                investTokenWithAmountFlVtFt = investUniv3SubscribeViewModel.flVtFt();
                if (investTokenWithAmountFlVtFt != null) {
                }
                if (investUniv3SubscribeViewModel.zLjUOn != null) {
                }
                return investUniv3SubscribeInfo2;
            case 4:
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) this.L$2;
                investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo2 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                investTokenWithAmountGasjUx = investUniv3SubscribeViewModel.gasjUx();
                if (investTokenWithAmountGasjUx != null) {
                }
                investTokenWithAmountFlVtFt = investUniv3SubscribeViewModel.flVtFt();
                if (investTokenWithAmountFlVtFt != null) {
                }
                if (investUniv3SubscribeViewModel.zLjUOn != null) {
                }
                return investUniv3SubscribeInfo2;
            case 5:
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) this.L$2;
                investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo2 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Unit unit5 = Unit.INSTANCE;
                investTokenWithAmountFlVtFt = investUniv3SubscribeViewModel.flVtFt();
                if (investTokenWithAmountFlVtFt != null) {
                }
                if (investUniv3SubscribeViewModel.zLjUOn != null) {
                }
                return investUniv3SubscribeInfo2;
            case 6:
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) this.L$2;
                investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo2 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Unit unit22 = Unit.INSTANCE;
                if (investUniv3SubscribeViewModel.zLjUOn != null) {
                }
                return investUniv3SubscribeInfo2;
            case 7:
                i = this.I$0;
                investUniv3SubscribeInfo4 = (InvestUniv3SubscribeInfo) this.L$2;
                investUniv3SubscribeViewModel2 = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo3 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlowIRxXKY = investUniv3SubscribeViewModel2.iRxXKY();
                c27315jsq = new C27315jsq(investUniv3SubscribeViewModel2.OLrzqt(i), i);
                this.L$0 = investUniv3SubscribeInfo3;
                this.L$1 = investUniv3SubscribeViewModel2;
                this.L$2 = investUniv3SubscribeInfo4;
                this.label = 8;
                if (mutableSharedFlowIRxXKY.emit(c27315jsq, this) != objCopydefault) {
                }
                break;
            case 8:
                investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) this.L$2;
                investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo2 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                InvestInputData investInputData82 = investUniv3SubscribeViewModel.zLjUOn;
                Intrinsics.copydefault(investInputData82);
                tokenAddress = investInputData82.getTokenAddress();
                if (tokenAddress != null) {
                }
                return investUniv3SubscribeInfo2;
            case 9:
                investUniv3SubscribeViewModel4 = (InvestUniv3SubscribeViewModel) this.L$1;
                InvestUniv3SubscribeInfo investUniv3SubscribeInfo8 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                investUniv3SubscribeInfo6 = investUniv3SubscribeInfo8;
                investUniv3SubscribeViewModel4.zsXlph().setValue(C56443yFo.KWHzl(true));
                InvestInputData investInputData42 = investUniv3SubscribeViewModel4.zLjUOn;
                Intrinsics.copydefault(investInputData42);
                amount = investInputData42.getAmount();
                if (amount == null) {
                }
                amountInputIndex = InvestUniv3SubscribeActivity.AmountInputIndex.First;
                this.L$0 = investUniv3SubscribeInfo6;
                this.L$1 = investUniv3SubscribeViewModel4;
                this.label = 10;
                if (InvestUniv3SubscribeViewModel.getReceiveInfoAndCheckState$default(investUniv3SubscribeViewModel4, amount, amountInputIndex, false, this, 4, null) != objCopydefault) {
                }
                break;
            case 10:
                investUniv3SubscribeViewModel4 = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo7 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                investUniv3SubscribeViewModel4.wlaJM().setValue(new C23948iPg(false, "", false, true, false, 20, null));
                Unit unit32 = Unit.INSTANCE;
                return investUniv3SubscribeInfo7;
            case 11:
                investUniv3SubscribeViewModel3 = (InvestUniv3SubscribeViewModel) this.L$1;
                InvestUniv3SubscribeInfo investUniv3SubscribeInfo9 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                investUniv3SubscribeInfo5 = investUniv3SubscribeInfo9;
                investUniv3SubscribeViewModel3.zsXlph().setValue(C56443yFo.KWHzl(true));
                InvestInputData investInputData72 = investUniv3SubscribeViewModel3.zLjUOn;
                Intrinsics.copydefault(investInputData72);
                amount2 = investInputData72.getAmount();
                if (amount2 == null) {
                }
                amountInputIndex2 = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                this.L$0 = investUniv3SubscribeInfo5;
                this.L$1 = investUniv3SubscribeViewModel3;
                this.label = 12;
                if (InvestUniv3SubscribeViewModel.getReceiveInfoAndCheckState$default(investUniv3SubscribeViewModel3, amount2, amountInputIndex2, false, this, 4, null) != objCopydefault) {
                }
                break;
            case 12:
                investUniv3SubscribeViewModel3 = (InvestUniv3SubscribeViewModel) this.L$1;
                investUniv3SubscribeInfo7 = (InvestUniv3SubscribeInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                investUniv3SubscribeViewModel3.wlaJM().setValue(new C23948iPg(false, "", false, true, false, 20, null));
                Unit unit422 = Unit.INSTANCE;
                return investUniv3SubscribeInfo7;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
