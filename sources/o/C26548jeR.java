package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.contants.ProtocolType;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeRedeemTransactionUseCase$execute$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeRedeemTransactionUseCase$handleExpiryProduct$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeRedeemTransactionUseCase$handleRegularPool$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeRedeemTransactionUseCase$handleStakingProtocol$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeRedeemTransactionUseCase$handleV3Product$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeRedeemTransactionUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.MakeRedeemTransactionUseCase$invoke$2;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC26561jee;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26548jeR {
    public final C26545jeO EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final iEM OLrzqt;

    @yCM
    public C26548jeR(@NotNull C26545jeO c26545jeO, @NotNull iEM iem, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c26545jeO, "");
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c26545jeO;
        this.OLrzqt = iem;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AYXKKw(@NotNull C25476ixT c25476ixT, @NotNull Continuation<? super Result<? extends InterfaceC26561jee>> continuation) throws java.lang.Throwable {
        MakeRedeemTransactionUseCase$invoke$1 makeRedeemTransactionUseCase$invoke$1;
        if (continuation instanceof MakeRedeemTransactionUseCase$invoke$1) {
            makeRedeemTransactionUseCase$invoke$1 = (MakeRedeemTransactionUseCase$invoke$1) continuation;
            int i = makeRedeemTransactionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeRedeemTransactionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                makeRedeemTransactionUseCase$invoke$1 = new MakeRedeemTransactionUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = makeRedeemTransactionUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeRedeemTransactionUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        MakeRedeemTransactionUseCase$invoke$2 makeRedeemTransactionUseCase$invoke$2 = new MakeRedeemTransactionUseCase$invoke$2(this, c25476ixT, null);
        makeRedeemTransactionUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, makeRedeemTransactionUseCase$invoke$2, makeRedeemTransactionUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(C25476ixT c25476ixT, Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeRedeemTransactionUseCase$execute$1 makeRedeemTransactionUseCase$execute$1;
        java.lang.Object objAEQbTJ;
        C26548jeR c26548jeR;
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment;
        C25476ixT c25476ixT2 = c25476ixT;
        if (continuation instanceof MakeRedeemTransactionUseCase$execute$1) {
            makeRedeemTransactionUseCase$execute$1 = (MakeRedeemTransactionUseCase$execute$1) continuation;
            int i = makeRedeemTransactionUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeRedeemTransactionUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                makeRedeemTransactionUseCase$execute$1 = new MakeRedeemTransactionUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = makeRedeemTransactionUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeRedeemTransactionUseCase$execute$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objKWHzl);
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                if (i2 == 4) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                if (i2 == 5) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25476ixT2 = (C25476ixT) makeRedeemTransactionUseCase$execute$1.L$1;
            c26548jeR = (C26548jeR) makeRedeemTransactionUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            objAEQbTJ = ((Result) objKWHzl).m7386unboximpl();
            C56391yDq.AEQbTJ(objAEQbTJ);
            investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objAEQbTJ);
            if (!C33129mqd.KWHzl((java.util.Collection) (investUserAssetDetailByInvestment == null ? investUserAssetDetailByInvestment.getPositionList() : null))) {
                makeRedeemTransactionUseCase$execute$1.L$0 = null;
                makeRedeemTransactionUseCase$execute$1.L$1 = null;
                makeRedeemTransactionUseCase$execute$1.label = 3;
                objKWHzl = c26548jeR.EZpvd(c25476ixT2, makeRedeemTransactionUseCase$execute$1);
                return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
            }
            if (C26547jeQ.copydefault.contains(c25476ixT2.AhwBna())) {
                makeRedeemTransactionUseCase$execute$1.L$0 = null;
                makeRedeemTransactionUseCase$execute$1.L$1 = null;
                makeRedeemTransactionUseCase$execute$1.label = 4;
                objKWHzl = c26548jeR.AEQbTJ(c25476ixT2, makeRedeemTransactionUseCase$execute$1);
                return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
            }
            if (c25476ixT2.djBIcL() == ProductType.Pool) {
                makeRedeemTransactionUseCase$execute$1.L$0 = null;
                makeRedeemTransactionUseCase$execute$1.L$1 = null;
                makeRedeemTransactionUseCase$execute$1.label = 5;
                objKWHzl = c26548jeR.copydefault(c25476ixT2, makeRedeemTransactionUseCase$execute$1);
                return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
            }
            if (c25476ixT2.djBIcL() == ProductType.Borrow) {
                return new InterfaceC26561jee.ActionBar(TransactionType.Repay, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), c25476ixT2.gEmmrt(), c25476ixT2.EZpvd(), null, null, true, c25476ixT2.AhwBna(), null, null, null, false, null, false, null, DeFiTradeExecutorType.SINGLE_REDEEM_V2, null, 196192, null);
            }
            if (c25476ixT2.AhwBna() == ProtocolType.LSDFI) {
                return new InterfaceC26561jee.ActionBar(TransactionType.Repay, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), c25476ixT2.gEmmrt(), c25476ixT2.EZpvd(), null, null, true, c25476ixT2.AhwBna(), null, null, null, false, null, false, null, DeFiTradeExecutorType.SINGLE_REDEEM_V2, null, 196192, null);
            }
            return new InterfaceC26561jee.ActionBar(TransactionType.Redeem, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), c25476ixT2.gEmmrt(), c25476ixT2.EZpvd(), null, null, true, c25476ixT2.AhwBna(), null, null, null, false, null, false, c25476ixT2.copydefault(), DeFiTradeExecutorType.SINGLE_REDEEM_V2, c25476ixT2.isConnected(), 32352, null);
        }
        C56391yDq.AEQbTJ(objKWHzl);
        InvestTipInfoVo investTipInfoVoFARcdN = c25476ixT.fARcdN();
        if (investTipInfoVoFARcdN != null) {
            return new InterfaceC26561jee.PendingIntent(investTipInfoVoFARcdN);
        }
        if (c25476ixT.AYXKKw() == PoolProtocolType.V3) {
            makeRedeemTransactionUseCase$execute$1.label = 1;
            objKWHzl = KWHzl(c25476ixT2, makeRedeemTransactionUseCase$execute$1);
            return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
        }
        iEM iem = this.OLrzqt;
        long jAEQbTJ = c25476ixT.AEQbTJ();
        java.lang.Long lKWHzl = C56443yFo.KWHzl(c25476ixT.EZpvd());
        makeRedeemTransactionUseCase$execute$1.L$0 = this;
        makeRedeemTransactionUseCase$execute$1.L$1 = c25476ixT2;
        makeRedeemTransactionUseCase$execute$1.label = 2;
        objAEQbTJ = iem.AEQbTJ(jAEQbTJ, (java.lang.Long) null, lKWHzl, makeRedeemTransactionUseCase$execute$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        c26548jeR = this;
        C56391yDq.AEQbTJ(objAEQbTJ);
        investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objAEQbTJ);
        if (!C33129mqd.KWHzl((java.util.Collection) (investUserAssetDetailByInvestment == null ? investUserAssetDetailByInvestment.getPositionList() : null))) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull C25476ixT c25476ixT, @NotNull Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeRedeemTransactionUseCase$handleV3Product$1 makeRedeemTransactionUseCase$handleV3Product$1;
        C25476ixT c25476ixT2;
        java.lang.Object objAEQbTJ;
        TransactionType transactionType;
        if (continuation instanceof MakeRedeemTransactionUseCase$handleV3Product$1) {
            makeRedeemTransactionUseCase$handleV3Product$1 = (MakeRedeemTransactionUseCase$handleV3Product$1) continuation;
            int i = makeRedeemTransactionUseCase$handleV3Product$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeRedeemTransactionUseCase$handleV3Product$1.label = i - Integer.MIN_VALUE;
            } else {
                makeRedeemTransactionUseCase$handleV3Product$1 = new MakeRedeemTransactionUseCase$handleV3Product$1(this, continuation);
            }
        }
        MakeRedeemTransactionUseCase$handleV3Product$1 makeRedeemTransactionUseCase$handleV3Product$12 = makeRedeemTransactionUseCase$handleV3Product$1;
        java.lang.Object obj = makeRedeemTransactionUseCase$handleV3Product$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeRedeemTransactionUseCase$handleV3Product$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iEM iem = this.OLrzqt;
            long jAEQbTJ = c25476ixT.AEQbTJ();
            java.lang.Long lKWHzl = C56443yFo.KWHzl(c25476ixT.EZpvd());
            c25476ixT2 = c25476ixT;
            makeRedeemTransactionUseCase$handleV3Product$12.L$0 = c25476ixT2;
            makeRedeemTransactionUseCase$handleV3Product$12.label = 1;
            objAEQbTJ = iem.AEQbTJ(jAEQbTJ, (java.lang.Long) null, lKWHzl, makeRedeemTransactionUseCase$handleV3Product$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C25476ixT c25476ixT3 = (C25476ixT) makeRedeemTransactionUseCase$handleV3Product$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            c25476ixT2 = c25476ixT3;
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objAEQbTJ);
        java.util.List<InvestUserAssetDetailByPosition> positionList = investUserAssetDetailByInvestment != null ? investUserAssetDetailByInvestment.getPositionList() : null;
        if (positionList == null) {
            positionList = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(positionList, 10));
        for (InvestUserAssetDetailByPosition investUserAssetDetailByPosition : positionList) {
            java.lang.String str = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + investUserAssetDetailByPosition.getTokenId();
            boolean zIsActive = investUserAssetDetailByPosition.isActive();
            java.lang.String range = investUserAssetDetailByPosition.getRange();
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String totalValue = investUserAssetDetailByPosition.getTotalValue();
            if (totalValue == null) {
                totalValue = "0";
            }
            arrayList.add(new InvestPositionSelectUIItem.InvestV3PositionSelectUIItem(str, zIsActive, range, C27492jwH.formatCurrencyData$default(c27492jwH, totalValue, null, null, null, 14, null), investUserAssetDetailByPosition.getTokenId(), investUserAssetDetailByPosition.isNarrow(), investUserAssetDetailByPosition.getReverseRange()));
        }
        if (arrayList.isEmpty()) {
            return InterfaceC26561jee.Activity.copydefault;
        }
        if (arrayList.size() == 1 && ((InvestPositionSelectUIItem.InvestV3PositionSelectUIItem) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getCannotInvest()) {
            return new InterfaceC26561jee.Fragment(c25476ixT2.djBIcL(), arrayList, InterfaceC26561jee.Activity.copydefault);
        }
        if (C25475ixS.KWHzl(c25476ixT2)) {
            transactionType = TransactionType.Univ3FarmRedeem;
        } else {
            transactionType = TransactionType.Univ3Redeem;
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
    public final java.lang.Object EZpvd(@NotNull C25476ixT c25476ixT, @NotNull Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeRedeemTransactionUseCase$handleExpiryProduct$1 makeRedeemTransactionUseCase$handleExpiryProduct$1;
        C25476ixT c25476ixT2;
        java.lang.Object objAEQbTJ;
        java.util.List listAhwBna;
        java.util.List<InvestUserAssetDetailByPosition> positionList;
        if (continuation instanceof MakeRedeemTransactionUseCase$handleExpiryProduct$1) {
            makeRedeemTransactionUseCase$handleExpiryProduct$1 = (MakeRedeemTransactionUseCase$handleExpiryProduct$1) continuation;
            int i = makeRedeemTransactionUseCase$handleExpiryProduct$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeRedeemTransactionUseCase$handleExpiryProduct$1.label = i - Integer.MIN_VALUE;
            } else {
                makeRedeemTransactionUseCase$handleExpiryProduct$1 = new MakeRedeemTransactionUseCase$handleExpiryProduct$1(this, continuation);
            }
        }
        MakeRedeemTransactionUseCase$handleExpiryProduct$1 makeRedeemTransactionUseCase$handleExpiryProduct$12 = makeRedeemTransactionUseCase$handleExpiryProduct$1;
        java.lang.Object obj = makeRedeemTransactionUseCase$handleExpiryProduct$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = makeRedeemTransactionUseCase$handleExpiryProduct$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iEM iem = this.OLrzqt;
            long jAEQbTJ = c25476ixT.AEQbTJ();
            java.lang.Long lKWHzl = C56443yFo.KWHzl(c25476ixT.EZpvd());
            c25476ixT2 = c25476ixT;
            makeRedeemTransactionUseCase$handleExpiryProduct$12.L$0 = c25476ixT2;
            makeRedeemTransactionUseCase$handleExpiryProduct$12.label = 1;
            objAEQbTJ = iem.AEQbTJ(jAEQbTJ, (java.lang.Long) null, lKWHzl, makeRedeemTransactionUseCase$handleExpiryProduct$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C25476ixT c25476ixT3 = (C25476ixT) makeRedeemTransactionUseCase$handleExpiryProduct$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            c25476ixT2 = c25476ixT3;
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objAEQbTJ);
        if (investUserAssetDetailByInvestment == null || (positionList = investUserAssetDetailByInvestment.getPositionList()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(positionList, 10));
            for (InvestUserAssetDetailByPosition investUserAssetDetailByPosition : positionList) {
                boolean zIsActive = investUserAssetDetailByPosition.isActive();
                java.lang.String totalValue = investUserAssetDetailByPosition.getTotalValue();
                java.lang.String str = "";
                if (totalValue == null) {
                    totalValue = "";
                }
                java.lang.String settlementTime = investUserAssetDetailByPosition.getSettlementTime();
                if (settlementTime != null) {
                    str = settlementTime;
                }
                listAhwBna.add(new InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem(zIsActive, totalValue, investUserAssetDetailByPosition.getTokenId(), str));
            }
        }
        return new InterfaceC26561jee.TaskDescription(listAhwBna, new InterfaceC26561jee.ActionBar(TransactionType.Redeem, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), null, c25476ixT2.EZpvd(), null, "", true, null, null, null, c25476ixT2.KWHzl(), false, null, false, null, null, null, 259880, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C25476ixT c25476ixT, @NotNull Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeRedeemTransactionUseCase$handleStakingProtocol$1 makeRedeemTransactionUseCase$handleStakingProtocol$1;
        C25476ixT c25476ixT2;
        C26548jeR c26548jeR;
        int i;
        C25476ixT c25476ixT3;
        java.lang.Object objM7386unboximpl;
        if (continuation instanceof MakeRedeemTransactionUseCase$handleStakingProtocol$1) {
            makeRedeemTransactionUseCase$handleStakingProtocol$1 = (MakeRedeemTransactionUseCase$handleStakingProtocol$1) continuation;
            int i2 = makeRedeemTransactionUseCase$handleStakingProtocol$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeRedeemTransactionUseCase$handleStakingProtocol$1.label = i2 - Integer.MIN_VALUE;
            } else {
                makeRedeemTransactionUseCase$handleStakingProtocol$1 = new MakeRedeemTransactionUseCase$handleStakingProtocol$1(this, continuation);
            }
        }
        MakeRedeemTransactionUseCase$handleStakingProtocol$1 makeRedeemTransactionUseCase$handleStakingProtocol$12 = makeRedeemTransactionUseCase$handleStakingProtocol$1;
        java.lang.Object objCopydefault = makeRedeemTransactionUseCase$handleStakingProtocol$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = makeRedeemTransactionUseCase$handleStakingProtocol$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C26545jeO c26545jeO = this.EZpvd;
            makeRedeemTransactionUseCase$handleStakingProtocol$12.L$0 = this;
            c25476ixT2 = c25476ixT;
            makeRedeemTransactionUseCase$handleStakingProtocol$12.L$1 = c25476ixT2;
            makeRedeemTransactionUseCase$handleStakingProtocol$12.label = 1;
            objCopydefault = c26545jeO.copydefault(false, makeRedeemTransactionUseCase$handleStakingProtocol$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c26548jeR = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = makeRedeemTransactionUseCase$handleStakingProtocol$12.I$0;
                c25476ixT3 = (C25476ixT) makeRedeemTransactionUseCase$handleStakingProtocol$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                objM7386unboximpl = ((Result) objCopydefault).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl);
                return new InterfaceC26561jee.Dialog((InvestRedeemInitialInfo) objM7386unboximpl, i != 0, "TYPE_SUI", new InterfaceC26561jee.ActionBar(TransactionType.Redeem, c25476ixT3.djBIcL(), c25476ixT3.AEQbTJ(), null, c25476ixT3.EZpvd(), null, null, true, null, null, null, null, false, null, false, null, null, null, 261992, null));
            }
            c25476ixT2 = (C25476ixT) makeRedeemTransactionUseCase$handleStakingProtocol$12.L$1;
            c26548jeR = (C26548jeR) makeRedeemTransactionUseCase$handleStakingProtocol$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C25476ixT c25476ixT4 = c25476ixT2;
        int i4 = ((PaymentOption) objCopydefault) == PaymentOption.SingleToken ? 1 : 0;
        iEM iem = c26548jeR.OLrzqt;
        long jAEQbTJ = c25476ixT4.AEQbTJ();
        InvestmentKind investmentKindGEmmrt = c25476ixT4.gEmmrt();
        long jEZpvd = c25476ixT4.EZpvd();
        makeRedeemTransactionUseCase$handleStakingProtocol$12.L$0 = c25476ixT4;
        makeRedeemTransactionUseCase$handleStakingProtocol$12.L$1 = null;
        makeRedeemTransactionUseCase$handleStakingProtocol$12.I$0 = i4;
        makeRedeemTransactionUseCase$handleStakingProtocol$12.label = 2;
        java.lang.Object objKWHzl = iem.KWHzl(jAEQbTJ, investmentKindGEmmrt, jEZpvd, i4, makeRedeemTransactionUseCase$handleStakingProtocol$12);
        if (objKWHzl == objCopydefault2) {
            return objCopydefault2;
        }
        i = i4;
        c25476ixT3 = c25476ixT4;
        objM7386unboximpl = objKWHzl;
        C56391yDq.AEQbTJ(objM7386unboximpl);
        return new InterfaceC26561jee.Dialog((InvestRedeemInitialInfo) objM7386unboximpl, i != 0, "TYPE_SUI", new InterfaceC26561jee.ActionBar(TransactionType.Redeem, c25476ixT3.djBIcL(), c25476ixT3.AEQbTJ(), null, c25476ixT3.EZpvd(), null, null, true, null, null, null, null, false, null, false, null, null, null, 261992, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C25476ixT c25476ixT, @NotNull Continuation<? super InterfaceC26561jee> continuation) throws java.lang.Throwable {
        MakeRedeemTransactionUseCase$handleRegularPool$1 makeRedeemTransactionUseCase$handleRegularPool$1;
        C25476ixT c25476ixT2;
        if (continuation instanceof MakeRedeemTransactionUseCase$handleRegularPool$1) {
            makeRedeemTransactionUseCase$handleRegularPool$1 = (MakeRedeemTransactionUseCase$handleRegularPool$1) continuation;
            int i = makeRedeemTransactionUseCase$handleRegularPool$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeRedeemTransactionUseCase$handleRegularPool$1.label = i - Integer.MIN_VALUE;
            } else {
                makeRedeemTransactionUseCase$handleRegularPool$1 = new MakeRedeemTransactionUseCase$handleRegularPool$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = makeRedeemTransactionUseCase$handleRegularPool$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = makeRedeemTransactionUseCase$handleRegularPool$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C26545jeO c26545jeO = this.EZpvd;
            makeRedeemTransactionUseCase$handleRegularPool$1.L$0 = c25476ixT;
            makeRedeemTransactionUseCase$handleRegularPool$1.label = 1;
            objCopydefault = c26545jeO.copydefault(false, makeRedeemTransactionUseCase$handleRegularPool$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c25476ixT2 = c25476ixT;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25476ixT2 = (C25476ixT) makeRedeemTransactionUseCase$handleRegularPool$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((PaymentOption) objCopydefault) == PaymentOption.SingleToken) {
            return new InterfaceC26561jee.ActionBar(TransactionType.Redeem, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), null, c25476ixT2.EZpvd(), null, null, true, null, null, null, null, false, null, false, null, null, null, 261992, null);
        }
        return new InterfaceC26561jee.ActionBar(TransactionType.Redeem, c25476ixT2.djBIcL(), c25476ixT2.AEQbTJ(), null, c25476ixT2.EZpvd(), null, null, false, null, null, null, null, false, null, false, null, null, null, 261992, null);
    }
}
