package o;

import androidx.core.view.PointerIconCompat;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.RuneMainMintItemInfo;
import com.okinc.business.defi.api.model.tx.signdata.RunesMainMintSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResult;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cjx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12282cjx extends AbstractC12239cjG<RuneMainMintItemInfo, RunesMainMintSignData> {
    public RuneMainMintTransactionResult QUSxYX;
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.cjF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12282cjx.KWHzl(this.copydefault);
        }
    });

    public int DaRZkR() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    public final C12242cjJ OTwTPd() {
        return (C12242cjJ) this.QfsBiF.getValue();
    }

    public static final C12242cjJ KWHzl(C12282cjx c12282cjx) {
        return new C12242cjJ(c12282cjx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAJFbMH = aJFbMH();
        final Function1 function1 = new Function1() { // from class: o.cjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12282cjx.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAJFbMH.KWHzl(new InterfaceC58229yxO() { // from class: o.cjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12282cjx.QwvEab(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd KWHzl(C12282cjx c12282cjx, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.r_();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8704bHj
    public C10854bwM fHqPtx() {
        C10854bwM c10854bwMRXzakW = RXzakW();
        return c10854bwMRXzakW == null ? dHguZz() : c10854bwMRXzakW;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12239cjG
    public java.lang.String DNMMPQ() {
        return ((RunesMainMintSignData) QVsKAR()).getTickerId();
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(QUSxYX(), "0", refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : ((C11990ceW) QKudOq()).AEQbTJ(), (java.lang.Integer) 11, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, dvKsVJ(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59376, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Boolean aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<java.lang.Boolean> iZzfmt() {
        AbstractC58185ywX<RuneMainMintTransactionResult> abstractC58185ywXAhwBna = AhwBna(copydefault(QKVWgx(), djSkpj()));
        final Function1 function1 = new Function1() { // from class: o.cjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12282cjx.KWHzl(this.OLrzqt, (RuneMainMintTransactionResult) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAhwBna.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12282cjx.aUsmxb(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean KWHzl(C12282cjx c12282cjx, RuneMainMintTransactionResult runeMainMintTransactionResult) {
        Intrinsics.checkNotNullParameter(runeMainMintTransactionResult, "");
        RuneMainMintTransactionResult runeMainMintTransactionResult2 = c12282cjx.QUSxYX;
        c12282cjx.QUSxYX = runeMainMintTransactionResult;
        java.lang.String strCalSignLength$default = AbstractC11993ceZ.calSignLength$default(c12282cjx, C33129mqd.gEmmrt(runeMainMintTransactionResult2 != null ? java.lang.Long.valueOf(runeMainMintTransactionResult2.EZpvd()) : null), null, 2, null);
        return java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) strCalSignLength$default, (java.lang.Object) AbstractC11993ceZ.calSignLength$default(c12282cjx, C33129mqd.gEmmrt(c12282cjx.QUSxYX != null ? java.lang.Long.valueOf(r2.EZpvd()) : null), null, 2, null)));
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String fZBcTu() {
        RuneMainMintTransactionResult runeMainMintTransactionResult = this.QUSxYX;
        return AbstractC11993ceZ.calSignLength$default(this, C33129mqd.gEmmrt(runeMainMintTransactionResult != null ? java.lang.Long.valueOf(runeMainMintTransactionResult.EZpvd()) : null), null, 2, null);
    }

    private final AbstractC58185ywX<RuneMainMintTransactionResult> AhwBna(final java.util.List<UTXOInfoResp> list) {
        AbstractC58185ywX<RuneMainMintTransactionResult> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.cjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C12282cjx.OLrzqt(list, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final RuneMainMintTransactionResult OLrzqt(java.util.List list, C12282cjx c12282cjx) {
        RuneMainMintTransactionResult runeMainMintTransactionResultEZpvd = list.isEmpty() ^ true ? c12282cjx.OTwTPd().EZpvd(list) : null;
        return runeMainMintTransactionResultEZpvd == null ? new RuneMainMintTransactionResult((java.util.List) null, (java.util.List) null, 0L, 7, (DefaultConstructorMarker) null) : runeMainMintTransactionResultEZpvd;
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        UTXOInfoResp uTXOInfoResp;
        java.util.List<UtxoInfo> utxoList;
        if (super.F_()) {
            java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
            java.lang.Integer numValueOf = (listDjSkpj == null || (uTXOInfoResp = (UTXOInfoResp) CollectionsKt___CollectionsKt.AuCTelauCTel(listDjSkpj)) == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) ? null : java.lang.Integer.valueOf(utxoList.size());
            UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
            if (C33129mqd.valueOf(numValueOf, uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getTxSizeLimit() : null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12239cjG, o.AbstractC8704bHj, o.AbstractC8564bFB
    public java.lang.String l_() {
        return java.lang.String.valueOf(((RunesMainMintSignData) QVsKAR()).getTxType());
    }

    public static final ResponseData OJuSTm(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(final java.lang.String str, final java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.cjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12282cjx.KWHzl(this.AEQbTJ, str, str2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12282cjx.OJuSTm(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12282cjx.AEQbTJ(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12282cjx.OxVOHk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData KWHzl(C12282cjx c12282cjx, java.lang.String str, java.lang.String str2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            RuneMainMintTransactionResult runeMainMintTransactionResultKWHzl = c12282cjx.OTwTPd().KWHzl(str, str2, (java.util.List) responseData.getData());
            if (runeMainMintTransactionResultKWHzl == null) {
                return new ResponseData(-5005, null, null, null, null, null, 62, null);
            }
            return runeMainMintTransactionResultKWHzl.OLrzqt() ? new ResponseData(-5010, null, null, null, null, null, 62, null) : new ResponseData(-5001, null, null, null, C56390yDp.OLrzqt(runeMainMintTransactionResultKWHzl, responseData.getData()), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null);
    }

    public static final ResponseData OxVOHk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(C12282cjx c12282cjx, ResponseData responseData) {
        java.util.List<RunesTransactionResult> listCopydefault;
        java.util.List<RunesTransactionResult> listCopydefault2;
        RunesTransactionResult runesTransactionResult;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            kotlin.Pair pair = (kotlin.Pair) responseData.getData();
            RuneMainMintTransactionResult runeMainMintTransactionResult = pair != null ? (RuneMainMintTransactionResult) pair.getFirst() : null;
            java.lang.Integer numDvKsVJ = c12282cjx.dvKsVJ();
            java.lang.String strL_ = c12282cjx.l_();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String txId = (runeMainMintTransactionResult == null || (listCopydefault2 = runeMainMintTransactionResult.copydefault()) == null || (runesTransactionResult = (RunesTransactionResult) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault2)) == null) ? null : runesTransactionResult.getTxId();
            if (txId == null) {
                txId = "";
            }
            if (runeMainMintTransactionResult != null && (listCopydefault = runeMainMintTransactionResult.copydefault()) != null) {
                int i = 0;
                for (java.lang.Object obj : listCopydefault) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    RunesTransactionResult runesTransactionResult2 = (RunesTransactionResult) obj;
                    java.lang.String txHex = runesTransactionResult2.getTxHex();
                    BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(c12282cjx, txHex == null ? "" : txHex, runesTransactionResult2.getTxId(), null, new UTXOExtJson(2, c12282cjx.htlTjW(), null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(c12282cjx.DaRZkR()), c12282cjx.dvKsVJ(), runesTransactionResult2.getPublicKey(), PointerIconCompat.TYPE_GRAB, null), 4, null);
                    broadcastBeanGenerateBroadcastModel$default.setFeeRate(C11990ceW.getFeeRate$default(c12282cjx.DXXBbs(), 0, 1, null));
                    java.lang.String txFee = runesTransactionResult2.getTxFee();
                    if (txFee == null) {
                        txFee = "";
                    }
                    broadcastBeanGenerateBroadcastModel$default.setServiceCharge(txFee);
                    if (i != 0) {
                        broadcastBeanGenerateBroadcastModel$default.setDependTx(C56402yEa.EZpvd(txId));
                    }
                    arrayList.add(broadcastBeanGenerateBroadcastModel$default);
                    i++;
                }
            }
            Unit unit = Unit.INSTANCE;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(arrayList, (java.util.List) null, bool, (java.lang.String) null, bool, numDvKsVJ, strL_, (SignAuthType) null, 138, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null);
    }
}
