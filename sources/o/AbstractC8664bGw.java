package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.model.tx.signdata.TransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.CommonTransferExtJson;
import com.okinc.business.defi.biz.net.bean.PreExecTransactionReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8426bCW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8664bGw<Fee extends AbstractC8426bCW<?>, SignData extends TransferSignData> extends AbstractC8704bHj<Fee, SignData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String D_() {
        return "0";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String at_() {
        return "-";
    }

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM();

    public static final kotlin.Pair AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDxcTrN = super.dxcTrN();
        final Function1 function1 = new Function1() { // from class: o.bGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8664bGw.AhwBna(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8664bGw.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AhwBna(AbstractC8664bGw abstractC8664bGw, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (abstractC8664bGw.B_()) {
            abstractC8664bGw.DTwDnp();
        }
        return pair;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return QVsKAR().getFromAddress();
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return QVsKAR().getToAddress();
    }

    public final java.lang.String an_() {
        java.lang.String strZLjUOn = zLjUOn();
        return QVsKAR().isXLayerPrefixToAddress() ? dHguZz().AEQbTJ(strZLjUOn) : strZLjUOn;
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String DAIeex() {
        return QVsKAR().getCurrencyIsoCode();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        return yDY.copydefault(2, 3);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull PreExecTransactionReq preExecTransactionReq) {
        Intrinsics.checkNotNullParameter(preExecTransactionReq, "");
        return KWHzl(false, preExecTransactionReq);
    }

    public static /* synthetic */ AbstractC58185ywX preExecTransaction$default(AbstractC8664bGw abstractC8664bGw, boolean z, PreExecTransactionReq preExecTransactionReq, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preExecTransaction");
        }
        if ((i & 2) != 0) {
            preExecTransactionReq = abstractC8664bGw.RdAHlO();
        }
        return abstractC8664bGw.KWHzl(z, preExecTransactionReq);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(boolean z, @NotNull PreExecTransactionReq preExecTransactionReq) {
        Intrinsics.checkNotNullParameter(preExecTransactionReq, "");
        if (z) {
            return super.AEQbTJ(preExecTransactionReq);
        }
        if (fHqPtx().AuCTel()) {
            preExecTransactionReq.setOnlyGasLimit(java.lang.Boolean.TRUE);
            return super.AEQbTJ(preExecTransactionReq);
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        java.util.List<java.lang.String> causeRiskItem;
        Intrinsics.checkNotNullParameter(list, "");
        Triple triple = new Triple(java.lang.Boolean.TRUE, "", java.lang.Boolean.FALSE);
        boolean zBooleanValue = ((java.lang.Boolean) triple.component1()).booleanValue();
        java.lang.Object objComponent2 = triple.component2();
        boolean zBooleanValue2 = ((java.lang.Boolean) triple.component3()).booleanValue();
        java.lang.String str = "";
        boolean z = zBooleanValue2;
        boolean z2 = zBooleanValue;
        boolean zIsBoutique = false;
        boolean z3 = true;
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 2) {
                if (Intrinsics.EZpvd(txToastCheckRes.getResult(), java.lang.Boolean.FALSE)) {
                    zIsBoutique = txToastCheckRes.isBoutique();
                    objComponent2 = txToastCheckRes.getWarningBlackAddress();
                    z2 = false;
                    z = false;
                } else if (txToastCheckRes.isSimilarAddress()) {
                    objComponent2 = zLjUOn();
                    java.lang.String similarAddress = txToastCheckRes.getSimilarAddress();
                    str = similarAddress == null ? "" : similarAddress;
                    z2 = false;
                    z = true;
                }
            } else if (checkType != null && checkType.intValue() == 9 && (causeRiskItem = txToastCheckRes.getCauseRiskItem()) != null && causeRiskItem.contains(TxToastCheckRes.FROM_RISK_REJECT)) {
                z3 = false;
            }
        }
        DLWbHP().OLrzqt(yDY.gEmmrt(new C9870bdj(z2, (java.lang.String) objComponent2, z, zIsBoutique, null, str, 16, null), new C9788bcG(z3, true)));
    }

    @Override // o.AbstractC8564bFB
    public void x_() {
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        C9785bcD[] c9785bcDArr = new C9785bcD[4];
        c9785bcDArr[0] = new C9808bca(E_(), fHqPtx());
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAo_ = ao_();
        c9785bcDArr[1] = new C9754bbZ(pairAo_.getFirst().booleanValue(), pairAo_.getSecond());
        c9785bcDArr[2] = new C9753bbY(t_());
        c9785bcDArr[3] = new C9787bcF(C33129mqd.OLrzqt(QVsKAR().getDepositLimit(), "0") || C33129mqd.copydefault(C54870xYj.AEQbTJ(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), fHqPtx().valueOf()), QVsKAR().getDepositLimit()), QVsKAR().getDepositLimit());
        c8497bDoDLWbHP.OLrzqt(yDY.gEmmrt(c9785bcDArr));
    }

    public boolean E_() {
        return a_(AbstractC8704bHj.getCoinCheckBalance$default(this, null, 1, null), AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null));
    }

    @Override // o.AbstractC8564bFB
    public void AhwBna() {
        C8497bDo c8497bDoDLWbHP = DLWbHP();
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAo_ = ao_();
        c8497bDoDLWbHP.OLrzqt(yDY.gEmmrt(new C9784bcC(F_(), DXXBbs().AYXKKw(), null, 4, null), new C9754bbZ(pairAo_.getFirst().booleanValue(), pairAo_.getSecond()), new C9753bbY(t_())));
    }

    public final boolean t_() {
        if (dHguZz().QkdxfA() || (this instanceof AbstractC12102cgc)) {
            return true;
        }
        return C33129mqd.AhwBna(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), "0");
    }

    public boolean F_() {
        return c_(AbstractC8564bFB.getFeeCoinCheckBalance$default(this, null, 1, null), DXXBbs().AEQbTJ());
    }

    public kotlin.Pair<java.lang.Boolean, java.lang.String> ao_() {
        boolean z = true;
        java.lang.String strConvertToString$default = null;
        if (heceqZ()) {
            java.lang.String coinCheckBalance$default = AbstractC8704bHj.getCoinCheckBalance$default(this, null, 1, null);
            java.lang.String strAEQbTJ = DXXBbs().AEQbTJ();
            boolean zEZpvd = EZpvd(coinCheckBalance$default, strAEQbTJ, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null));
            if (!zEZpvd) {
                BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(coinCheckBalance$default, strAEQbTJ);
                strConvertToString$default = C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0") ? "0" : C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
            }
            z = zEZpvd;
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), strConvertToString$default);
    }

    @Override // o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        if (QwvEab() == 3) {
            return new java.util.ArrayList<>();
        }
        return yDY.copydefault(4);
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(@NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = super.EZpvd(c8486bDd);
        final Function1 function1 = new Function1() { // from class: o.bGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8664bGw.gEmmrt(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8664bGw.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair gEmmrt(AbstractC8664bGw abstractC8664bGw, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (abstractC8664bGw.C_()) {
            abstractC8664bGw.DTwDnp();
        }
        abstractC8664bGw.aq_();
        return pair;
    }

    public static final kotlin.Pair gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> finit() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXFinit = super.finit();
        final Function1 function1 = new Function1() { // from class: o.bGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8664bGw.AYXKKw(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXFinit.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8664bGw.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(AbstractC8664bGw abstractC8664bGw, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (abstractC8664bGw.B_() || abstractC8664bGw.C_()) {
            abstractC8664bGw.DTwDnp();
        } else {
            abstractC8664bGw.ar_();
        }
        abstractC8664bGw.aq_();
        return pair;
    }

    public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = super.RJOkX();
        final Function1 function1 = new Function1() { // from class: o.bGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8664bGw.EZpvd(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRJOkX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bGB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8664bGw.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair EZpvd(AbstractC8664bGw abstractC8664bGw, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (abstractC8664bGw.C_()) {
            abstractC8664bGw.DTwDnp();
        }
        abstractC8664bGw.aq_();
        return pair;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> a_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zIsTransferMaxAmount = QVsKAR().isTransferMaxAmount();
        QVsKAR().setTransferMaxAmount(false);
        java.lang.String transferAmount = QVsKAR().getTransferAmount();
        if (transferAmount.length() == 0) {
            transferAmount = "0";
        }
        if (str.length() == 0) {
            str = "0";
        }
        if (zIsTransferMaxAmount || !C33129mqd.OLrzqt(str, transferAmount)) {
            QVsKAR().setTransferAmount(str);
            x_();
            aq_();
            return wlaJM();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8704bHj
    public java.lang.String AEQbTJ(boolean z, boolean z2) {
        if (C_()) {
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(AbstractC8704bHj.getCoinBalance$default(this, null, 1, null), z2 ? D_() : "0"), false, null, null, 7, null);
            if (!heceqZ()) {
                return (strConvertToString$default == null || strConvertToString$default.length() == 0) ? "0" : strConvertToString$default;
            }
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(strConvertToString$default, z ? DXXBbs().AEQbTJ() : "0");
            return C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0") ? "0" : C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
        }
        java.lang.String transferAmount = QVsKAR().getTransferAmount();
        return transferAmount.length() == 0 ? "0" : transferAmount;
    }

    public static /* synthetic */ java.lang.String getTransferCoinAmount$default(AbstractC8664bGw abstractC8664bGw, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransferCoinAmount");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return abstractC8664bGw.a_(z, z2);
    }

    public final java.lang.String a_(boolean z, boolean z2) {
        return C54870xYj.AEQbTJ(AEQbTJ(z, z2), fHqPtx().valueOf());
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ap_() {
        if (QVsKAR().isTransferMaxAmount()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        QVsKAR().setTransferAmount("0");
        QVsKAR().setTransferMaxAmount(true);
        x_();
        aq_();
        return wlaJM();
    }

    public final void aq_() {
        AssetDiffModuleModel assetDiffModuleModel;
        AssetDiffModuleModel.AssetDiffItem data;
        java.util.List<AssetDiffModuleModel.AssetDiff> assetDiffList;
        AssetDiffModuleModel.AssetDiff assetDiff;
        java.util.List<AssetDiffModuleModel.TokenAssetDifflist> tokenAssetDifflist;
        AssetDiffModuleModel.TokenAssetDifflist tokenAssetDifflist2;
        if (this instanceof AbstractC12102cgc) {
            return;
        }
        java.util.List<BaseModel<?>> listUSBtdM = USBtdM();
        if (listUSBtdM != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listUSBtdM) {
                if (obj instanceof AssetDiffModuleModel) {
                    arrayList.add(obj);
                }
            }
            assetDiffModuleModel = (AssetDiffModuleModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        } else {
            assetDiffModuleModel = null;
        }
        if (assetDiffModuleModel == null || (data = assetDiffModuleModel.getData()) == null || (assetDiffList = data.getAssetDiffList()) == null || (assetDiff = (AssetDiffModuleModel.AssetDiff) CollectionsKt___CollectionsKt.firstOrNull(assetDiffList)) == null || (tokenAssetDifflist = assetDiff.getTokenAssetDifflist()) == null || (tokenAssetDifflist2 = (AssetDiffModuleModel.TokenAssetDifflist) CollectionsKt___CollectionsKt.firstOrNull(tokenAssetDifflist)) == null) {
            return;
        }
        C8423bCT c8423bCTAm_ = am_();
        if (Intrinsics.EZpvd((java.lang.Object) c8423bCTAm_.AEQbTJ(), (java.lang.Object) tokenAssetDifflist2.getDisplayAmount()) && Intrinsics.EZpvd((java.lang.Object) c8423bCTAm_.copydefault(), (java.lang.Object) tokenAssetDifflist2.getDisplayCurrency())) {
            return;
        }
        tokenAssetDifflist2.setDisplayAmount(c8423bCTAm_.AEQbTJ());
        tokenAssetDifflist2.getTokenInfo().setDisplaySymbol(c8423bCTAm_.OLrzqt());
        tokenAssetDifflist2.setDisplayCurrency(c8423bCTAm_.copydefault());
        b_(C56402yEa.EZpvd(assetDiffModuleModel));
    }

    public final C8423bCT am_() {
        C10854bwM c10854bwMFHqPtx = fHqPtx();
        java.lang.String strAt_ = at_();
        if (B_()) {
            return new C8423bCT(strAt_ + C54870xYj.EZpvd(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), c10854bwMFHqPtx.fJNWhG(), EZpvd(true));
        }
        return new C8423bCT(strAt_ + EZpvd(true), "", C54870xYj.EZpvd(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), c10854bwMFHqPtx.fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null));
    }

    public final boolean C_() {
        return QVsKAR().isTransferMaxAmount();
    }

    public final void AEQbTJ(boolean z) {
        QVsKAR().setTransferAmount(z);
        aq_();
    }

    public final boolean B_() {
        return QVsKAR().isTransferAmount();
    }

    public static /* synthetic */ java.lang.String getTransferValuation$default(AbstractC8664bGw abstractC8664bGw, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransferValuation");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return abstractC8664bGw.EZpvd(z);
    }

    public java.lang.String EZpvd(boolean z) {
        if (z) {
            return C54880xYt.formatValuation$default(pTB.OLrzqt((java.lang.Object) QVsKAR().getValuation()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, zuWLRA().KWHzl(), null, false, 39, null);
        }
        return QVsKAR().getValuation();
    }

    public final void b_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        QVsKAR().setValuation(str);
    }

    public final void DTwDnp() {
        QVsKAR().setValuation(values(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null)));
    }

    public final void ar_() {
        QVsKAR().setTransferAmount(fetchVPNInfo(getTransferValuation$default(this, false, 1, null)));
    }

    public static /* synthetic */ BroadcastBean generateBroadcastModel$default(AbstractC8664bGw abstractC8664bGw, java.lang.String str, java.lang.String str2, CommonTransferExtJson commonTransferExtJson, java.lang.Object obj, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateBroadcastModel");
        }
        if ((i & 4) != 0) {
            commonTransferExtJson = abstractC8664bGw.u_();
        }
        if ((i & 8) != 0) {
            obj = null;
        }
        return abstractC8664bGw.EZpvd(str, str2, commonTransferExtJson, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.bGw<Fee extends o.bCW<?>, SignData extends com.okinc.business.defi.api.model.tx.signdata.TransferSignData> */
    /* JADX WARN: Multi-variable type inference failed */
    public final BroadcastBean EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull CommonTransferExtJson commonTransferExtJson, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(commonTransferExtJson, "");
        long jDGOPHZ = DGOPHZ();
        java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
        java.lang.String strAEQbTJ = DXXBbs().AEQbTJ();
        InterfaceC9747bbS interfaceC9747bbS = this instanceof InterfaceC9747bbS ? (InterfaceC9747bbS) this : null;
        return EZpvd(str, str2, jDGOPHZ, transferAmount$default, strAEQbTJ, commonTransferExtJson, obj, null, interfaceC9747bbS != null ? interfaceC9747bbS.copydefault() : null);
    }

    public final CommonTransferExtJson u_() {
        return new CommonTransferExtJson(fHqPtx().valueOf(), 0, z_(), 0);
    }

    public final java.lang.String z_() {
        java.lang.String okexAccount = QVsKAR().getOkexAccount();
        if (okexAccount == null || okexAccount.length() == 0) {
            return null;
        }
        return QVsKAR().getOkexAccount();
    }

    public final java.lang.String y_() {
        java.lang.String memo = QVsKAR().getMemo();
        if (memo == null || memo.length() == 0) {
            return null;
        }
        return QVsKAR().getMemo();
    }

    public final java.lang.String A_() {
        return QVsKAR().getToAddressName();
    }
}
