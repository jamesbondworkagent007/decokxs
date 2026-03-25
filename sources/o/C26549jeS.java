package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.data.contants.RateType;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$execute$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$handleRegularPool$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$handleV3Farm$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$hasViewedRiskReminder$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$invoke$2;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC26561jee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26549jeS {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC23636iDs AEQbTJ;
    public final C26545jeO KWHzl;
    public final iEM OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C26549jeS(@NotNull C26545jeO c26545jeO, @NotNull iEM iem, @NotNull InterfaceC23636iDs interfaceC23636iDs, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c26545jeO, "");
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(interfaceC23636iDs, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c26545jeO;
        this.OLrzqt = iem;
        this.AEQbTJ = interfaceC23636iDs;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C25476ixT c25476ixT, ProductDetailsUserTradeAction productDetailsUserTradeAction, @NotNull Continuation<? super Result<? extends InterfaceC26561jee>> continuation) throws java.lang.Throwable {
        MakeInvestTransactionUseCase$invoke$1 makeInvestTransactionUseCase$invoke$1;
        if (continuation instanceof MakeInvestTransactionUseCase$invoke$1) {
            makeInvestTransactionUseCase$invoke$1 = (MakeInvestTransactionUseCase$invoke$1) continuation;
            int i = makeInvestTransactionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeInvestTransactionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                makeInvestTransactionUseCase$invoke$1 = new MakeInvestTransactionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = makeInvestTransactionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeInvestTransactionUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.copydefault;
        MakeInvestTransactionUseCase$invoke$2 makeInvestTransactionUseCase$invoke$2 = new MakeInvestTransactionUseCase$invoke$2(this, c25476ixT, productDetailsUserTradeAction, null);
        makeInvestTransactionUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, makeInvestTransactionUseCase$invoke$2, makeInvestTransactionUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(C25476ixT c25476ixT, ProductDetailsUserTradeAction productDetailsUserTradeAction, Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeInvestTransactionUseCase$execute$1 makeInvestTransactionUseCase$execute$1;
        C26549jeS c26549jeS;
        InterfaceC26561jee interfaceC26561jee;
        C25476ixT c25476ixT2;
        InterfaceC26561jee interfaceC26561jee2;
        if (continuation instanceof MakeInvestTransactionUseCase$execute$1) {
            makeInvestTransactionUseCase$execute$1 = (MakeInvestTransactionUseCase$execute$1) continuation;
            int i = makeInvestTransactionUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeInvestTransactionUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                makeInvestTransactionUseCase$execute$1 = new MakeInvestTransactionUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = makeInvestTransactionUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeInvestTransactionUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InvestTipInfoVo investTipInfoVoValues = c25476ixT.values();
            if (investTipInfoVoValues != null) {
                return new InterfaceC26561jee.PendingIntent(investTipInfoVoValues);
            }
            C23687iFp c23687iFpAkhnZx = c25476ixT.AkhnZx();
            makeInvestTransactionUseCase$execute$1.L$0 = this;
            makeInvestTransactionUseCase$execute$1.L$1 = c25476ixT;
            makeInvestTransactionUseCase$execute$1.L$2 = productDetailsUserTradeAction;
            makeInvestTransactionUseCase$execute$1.label = 1;
            objAEQbTJ = AEQbTJ(c23687iFpAkhnZx, makeInvestTransactionUseCase$execute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c26549jeS = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC26561jee2 = (InterfaceC26561jee) makeInvestTransactionUseCase$execute$1.L$2;
                    productDetailsUserTradeAction = (ProductDetailsUserTradeAction) makeInvestTransactionUseCase$execute$1.L$1;
                    c25476ixT2 = (C25476ixT) makeInvestTransactionUseCase$execute$1.L$0;
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    return (((java.lang.Boolean) objAEQbTJ).booleanValue() && c25476ixT2.fetchVPNInfo()) ? new InterfaceC26561jee.Application(productDetailsUserTradeAction, C56443yFo.KWHzl(c25476ixT2.AEQbTJ())) : interfaceC26561jee2;
                }
                ProductDetailsUserTradeAction productDetailsUserTradeAction2 = (ProductDetailsUserTradeAction) makeInvestTransactionUseCase$execute$1.L$2;
                C25476ixT c25476ixT3 = (C25476ixT) makeInvestTransactionUseCase$execute$1.L$1;
                c26549jeS = (C26549jeS) makeInvestTransactionUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                productDetailsUserTradeAction = productDetailsUserTradeAction2;
                c25476ixT = c25476ixT3;
                interfaceC26561jee = (InterfaceC26561jee) objAEQbTJ;
                if (interfaceC26561jee instanceof InterfaceC26561jee.ActionBar) {
                    return interfaceC26561jee;
                }
                makeInvestTransactionUseCase$execute$1.L$0 = c25476ixT;
                makeInvestTransactionUseCase$execute$1.L$1 = productDetailsUserTradeAction;
                makeInvestTransactionUseCase$execute$1.L$2 = interfaceC26561jee;
                makeInvestTransactionUseCase$execute$1.label = 3;
                java.lang.Object objAEQbTJ2 = c26549jeS.AEQbTJ(makeInvestTransactionUseCase$execute$1);
                if (objAEQbTJ2 == objCopydefault) {
                    return objCopydefault;
                }
                c25476ixT2 = c25476ixT;
                interfaceC26561jee2 = interfaceC26561jee;
                objAEQbTJ = objAEQbTJ2;
                if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
                }
            }
            productDetailsUserTradeAction = (ProductDetailsUserTradeAction) makeInvestTransactionUseCase$execute$1.L$2;
            c25476ixT = (C25476ixT) makeInvestTransactionUseCase$execute$1.L$1;
            c26549jeS = (C26549jeS) makeInvestTransactionUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
            return new InterfaceC26561jee.StateListAnimator(c25476ixT.AkhnZx().copydefault(), c25476ixT.AkhnZx().KWHzl().getValue(), productDetailsUserTradeAction, C56443yFo.KWHzl(c25476ixT.AEQbTJ()));
        }
        makeInvestTransactionUseCase$execute$1.L$0 = c26549jeS;
        makeInvestTransactionUseCase$execute$1.L$1 = c25476ixT;
        makeInvestTransactionUseCase$execute$1.L$2 = productDetailsUserTradeAction;
        makeInvestTransactionUseCase$execute$1.label = 2;
        objAEQbTJ = c26549jeS.AEQbTJ(c25476ixT, productDetailsUserTradeAction, makeInvestTransactionUseCase$execute$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        interfaceC26561jee = (InterfaceC26561jee) objAEQbTJ;
        if (interfaceC26561jee instanceof InterfaceC26561jee.ActionBar) {
        }
    }

    public static /* synthetic */ java.lang.Object prepareTransactionAction$default(C26549jeS c26549jeS, C25476ixT c25476ixT, ProductDetailsUserTradeAction productDetailsUserTradeAction, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            productDetailsUserTradeAction = null;
        }
        return c26549jeS.AEQbTJ(c25476ixT, productDetailsUserTradeAction, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull C25476ixT c25476ixT, ProductDetailsUserTradeAction productDetailsUserTradeAction, @NotNull Continuation<? super InterfaceC26561jee> continuation) {
        if (c25476ixT.AYXKKw() == PoolProtocolType.V3) {
            if (c25476ixT.djBIcL() == ProductType.Farm) {
                return OLrzqt(c25476ixT, continuation);
            }
            return new InterfaceC26561jee.ActionBar(TransactionType.Univ3Invest, c25476ixT.djBIcL(), c25476ixT.AEQbTJ(), null, c25476ixT.EZpvd(), null, null, false, null, null, null, null, false, null, false, null, null, null, 261992, null);
        }
        if (c25476ixT.djBIcL() == ProductType.Pool) {
            return AEQbTJ(c25476ixT, continuation);
        }
        if (c25476ixT.djBIcL() == ProductType.Borrow) {
            return new InterfaceC26561jee.ActionBar(TransactionType.BORROW, c25476ixT.djBIcL(), c25476ixT.AEQbTJ(), null, c25476ixT.EZpvd(), null, null, true, null, null, null, null, true, productDetailsUserTradeAction, false, null, null, null, 249704, null);
        }
        if (c25476ixT.AhwBna() == ProtocolType.LSDFI) {
            return new InterfaceC26561jee.ActionBar(TransactionType.LybraInvest, c25476ixT.djBIcL(), c25476ixT.AEQbTJ(), InvestmentKind.Lybra, c25476ixT.EZpvd(), null, null, true, null, null, null, null, true, productDetailsUserTradeAction, false, null, null, null, 249696, null);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(TransactionType.Invest, C56443yFo.KWHzl(c25476ixT.OLrzqt() != PaymentOption.MultiToken));
        return new InterfaceC26561jee.ActionBar((TransactionType) pairOLrzqt.component1(), c25476ixT.djBIcL(), c25476ixT.AEQbTJ(), null, c25476ixT.EZpvd(), null, null, true, null, null, null, null, ((java.lang.Boolean) pairOLrzqt.component2()).booleanValue(), productDetailsUserTradeAction, false, c25476ixT.copydefault(), null, c25476ixT.isConnected(), 85864, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C25476ixT c25476ixT, @NotNull Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeInvestTransactionUseCase$handleV3Farm$1 makeInvestTransactionUseCase$handleV3Farm$1;
        C25476ixT c25476ixT2;
        java.lang.Object objAEQbTJ;
        long j;
        TransactionType transactionType;
        if (continuation instanceof MakeInvestTransactionUseCase$handleV3Farm$1) {
            makeInvestTransactionUseCase$handleV3Farm$1 = (MakeInvestTransactionUseCase$handleV3Farm$1) continuation;
            int i = makeInvestTransactionUseCase$handleV3Farm$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeInvestTransactionUseCase$handleV3Farm$1.label = i - Integer.MIN_VALUE;
            } else {
                makeInvestTransactionUseCase$handleV3Farm$1 = new MakeInvestTransactionUseCase$handleV3Farm$1(this, continuation);
            }
        }
        MakeInvestTransactionUseCase$handleV3Farm$1 makeInvestTransactionUseCase$handleV3Farm$12 = makeInvestTransactionUseCase$handleV3Farm$1;
        java.lang.Object obj = makeInvestTransactionUseCase$handleV3Farm$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeInvestTransactionUseCase$handleV3Farm$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.Long lDbNXlk = c25476ixT.DbNXlk();
            long jLongValue = lDbNXlk != null ? lDbNXlk.longValue() : c25476ixT.AEQbTJ();
            iEM iem = this.OLrzqt;
            java.lang.Long lKWHzl = C56443yFo.KWHzl(c25476ixT.AEQbTJ());
            java.lang.Long lKWHzl2 = C56443yFo.KWHzl(c25476ixT.EZpvd());
            c25476ixT2 = c25476ixT;
            makeInvestTransactionUseCase$handleV3Farm$12.L$0 = c25476ixT2;
            makeInvestTransactionUseCase$handleV3Farm$12.J$0 = jLongValue;
            makeInvestTransactionUseCase$handleV3Farm$12.label = 1;
            objAEQbTJ = iem.AEQbTJ(jLongValue, lKWHzl, lKWHzl2, makeInvestTransactionUseCase$handleV3Farm$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            j = jLongValue;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = makeInvestTransactionUseCase$handleV3Farm$12.J$0;
            C25476ixT c25476ixT3 = (C25476ixT) makeInvestTransactionUseCase$handleV3Farm$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            c25476ixT2 = c25476ixT3;
            j = j2;
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objAEQbTJ);
        java.util.List<InvestUserAssetDetailByPosition> positionList = investUserAssetDetailByInvestment != null ? investUserAssetDetailByInvestment.getPositionList() : null;
        if (positionList == null) {
            positionList = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(positionList, 10));
        for (InvestUserAssetDetailByPosition investUserAssetDetailByPosition : positionList) {
            java.lang.String str = investUserAssetDetailByPosition.getPositionName() + "(#" + investUserAssetDetailByPosition.getTokenId() + ")";
            boolean zIsActive = investUserAssetDetailByPosition.isActive();
            java.lang.String range = investUserAssetDetailByPosition.getRange();
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String totalValue = investUserAssetDetailByPosition.getTotalValue();
            if (totalValue == null) {
                totalValue = "0";
            }
            arrayList.add(new InvestPositionSelectUIItem.InvestV3PositionSelectUIItem(str, zIsActive, range, C27492jwH.formatCurrencyData$default(c27492jwH, totalValue, null, null, null, 14, null), investUserAssetDetailByPosition.getTokenId(), investUserAssetDetailByPosition.isNarrow(), (java.lang.String) null, 64, (DefaultConstructorMarker) null));
        }
        if (arrayList.isEmpty()) {
            return new InterfaceC26561jee.FragmentManager(j, c25476ixT2.EZpvd(), new InterfaceC26561jee.ActionBar(TransactionType.Univ3Invest, c25476ixT2.djBIcL(), j, null, c25476ixT2.EZpvd(), null, "", false, null, null, null, null, false, null, false, null, null, null, 261928, null));
        }
        if (arrayList.size() == 1 && ((InvestPositionSelectUIItem.InvestV3PositionSelectUIItem) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getCannotInvest()) {
            return new InterfaceC26561jee.Fragment(c25476ixT2.djBIcL(), arrayList, InterfaceC26561jee.Activity.copydefault);
        }
        if (c25476ixT2.djBIcL() == ProductType.Farm && c25476ixT2.AYXKKw() == PoolProtocolType.V3) {
            transactionType = TransactionType.Univ3FarmInvest;
        } else {
            transactionType = TransactionType.Univ3Invest;
        }
        TransactionType transactionType2 = transactionType;
        if (arrayList.size() == 1) {
            return new InterfaceC26561jee.ActionBar(transactionType2, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), null, c25476ixT2.EZpvd(), null, ((InvestPositionSelectUIItem.InvestV3PositionSelectUIItem) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getTokenId(), false, null, null, null, null, false, null, false, null, null, null, 261928, null);
        }
        return new InterfaceC26561jee.Fragment(c25476ixT2.djBIcL(), arrayList, new InterfaceC26561jee.ActionBar(transactionType2, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), null, c25476ixT2.EZpvd(), null, "", false, null, null, null, null, false, null, false, null, null, null, 261928, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C25476ixT c25476ixT, @NotNull Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeInvestTransactionUseCase$handleRegularPool$1 makeInvestTransactionUseCase$handleRegularPool$1;
        TransactionType transactionType;
        boolean z;
        C25476ixT c25476ixT2;
        if (continuation instanceof MakeInvestTransactionUseCase$handleRegularPool$1) {
            makeInvestTransactionUseCase$handleRegularPool$1 = (MakeInvestTransactionUseCase$handleRegularPool$1) continuation;
            int i = makeInvestTransactionUseCase$handleRegularPool$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeInvestTransactionUseCase$handleRegularPool$1.label = i - Integer.MIN_VALUE;
            } else {
                makeInvestTransactionUseCase$handleRegularPool$1 = new MakeInvestTransactionUseCase$handleRegularPool$1(this, continuation);
            }
        }
        java.lang.Object obj = makeInvestTransactionUseCase$handleRegularPool$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeInvestTransactionUseCase$handleRegularPool$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(TransactionType.Invest, C56443yFo.KWHzl(false));
            transactionType = (TransactionType) pairOLrzqt.component1();
            boolean zBooleanValue = ((java.lang.Boolean) pairOLrzqt.component2()).booleanValue();
            C26545jeO c26545jeO = this.KWHzl;
            makeInvestTransactionUseCase$handleRegularPool$1.L$0 = c25476ixT;
            makeInvestTransactionUseCase$handleRegularPool$1.L$1 = transactionType;
            makeInvestTransactionUseCase$handleRegularPool$1.Z$0 = zBooleanValue;
            makeInvestTransactionUseCase$handleRegularPool$1.label = 1;
            java.lang.Object objCopydefault2 = c26545jeO.copydefault(true, makeInvestTransactionUseCase$handleRegularPool$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            z = zBooleanValue;
            obj = objCopydefault2;
            c25476ixT2 = c25476ixT;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z2 = makeInvestTransactionUseCase$handleRegularPool$1.Z$0;
            transactionType = (TransactionType) makeInvestTransactionUseCase$handleRegularPool$1.L$1;
            c25476ixT2 = (C25476ixT) makeInvestTransactionUseCase$handleRegularPool$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z = z2;
        }
        if (((PaymentOption) obj) == PaymentOption.SingleToken) {
            return new InterfaceC26561jee.ActionBar(transactionType, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), null, c25476ixT2.EZpvd(), c25476ixT2.valueOf(), null, true, null, null, null, null, z, null, false, null, null, null, 257864, null);
        }
        return new InterfaceC26561jee.ActionBar(transactionType, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), null, c25476ixT2.EZpvd(), c25476ixT2.valueOf(), null, false, null, null, null, null, z, null, false, null, null, null, 257864, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1 makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1) {
            makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1 = (MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1) continuation;
            int i = makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1.label = i - Integer.MIN_VALUE;
            } else {
                makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1 = new MakeInvestTransactionUseCase$hasViewedBonusDisclaimer$1(this, continuation);
            }
        }
        java.lang.Object obj = makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23636iDs interfaceC23636iDs = this.AEQbTJ;
            makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1.label = 1;
            objOLrzqt = interfaceC23636iDs.OLrzqt("sp_invest_friendlyreminder_dialog_never_show", false, makeInvestTransactionUseCase$hasViewedBonusDisclaimer$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        return objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MakeInvestTransactionUseCase$hasViewedRiskReminder$1 makeInvestTransactionUseCase$hasViewedRiskReminder$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof MakeInvestTransactionUseCase$hasViewedRiskReminder$1) {
            makeInvestTransactionUseCase$hasViewedRiskReminder$1 = (MakeInvestTransactionUseCase$hasViewedRiskReminder$1) continuation;
            int i = makeInvestTransactionUseCase$hasViewedRiskReminder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeInvestTransactionUseCase$hasViewedRiskReminder$1.label = i - Integer.MIN_VALUE;
            } else {
                makeInvestTransactionUseCase$hasViewedRiskReminder$1 = new MakeInvestTransactionUseCase$hasViewedRiskReminder$1(this, continuation);
            }
        }
        java.lang.Object obj = makeInvestTransactionUseCase$hasViewedRiskReminder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeInvestTransactionUseCase$hasViewedRiskReminder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23636iDs interfaceC23636iDs = this.AEQbTJ;
            makeInvestTransactionUseCase$hasViewedRiskReminder$1.label = 1;
            objOLrzqt = interfaceC23636iDs.OLrzqt("sp_invest_friendlyreminder_dialog_never_show", false, makeInvestTransactionUseCase$hasViewedRiskReminder$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        return objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C23687iFp c23687iFp, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MakeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1 makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof MakeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1) {
            makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1 = (MakeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1) continuation;
            int i = makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1.label = i - Integer.MIN_VALUE;
            } else {
                makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1 = new MakeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1(this, continuation);
            }
        }
        java.lang.Object obj = makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!c23687iFp.OLrzqt()) {
                return C56443yFo.KWHzl(false);
            }
            if (c23687iFp.copydefault().length() == 0 || c23687iFp.KWHzl() == RateType.Unknown) {
                return C56443yFo.KWHzl(false);
            }
            InterfaceC23636iDs interfaceC23636iDs = this.AEQbTJ;
            makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1.label = 1;
            objOLrzqt = interfaceC23636iDs.OLrzqt("sp_invest_friendlyreminder_dialog_never_show", false, makeInvestTransactionUseCase$shouldDisplayImpermanentLossReminder$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        return C56443yFo.KWHzl(!((java.lang.Boolean) objOLrzqt).booleanValue());
    }

    /* JADX INFO: renamed from: o.jeS$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jeS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
