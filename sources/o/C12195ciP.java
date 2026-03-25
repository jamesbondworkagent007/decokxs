package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.BRC20MintItemInfo;
import com.okinc.business.defi.api.model.tx.signdata.BRC20MintSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.utxo.BRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ciP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12195ciP extends AbstractC12239cjG<BRC20MintItemInfo, BRC20MintSignData> {
    public BRC20TransactionResult QVAiDq;
    public final java.lang.String QUSxYX = "OKWBRC20Mint";
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.cjj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12195ciP.copydefault(this.copydefault);
        }
    });

    public static final boolean EZpvd(BRC20TransactionResult bRC20TransactionResult) {
        return true;
    }

    public static final BRC20TransactionResult copydefault(BRC20TransactionResult bRC20TransactionResult) {
        return bRC20TransactionResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DGgnkA() {
        return ExtJson.BRC20TYPE_INSCRIBE_MINT;
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

    public final C12245cjM OTwTPd() {
        return (C12245cjM) this.QfsBiF.getValue();
    }

    public static final C12245cjM copydefault(C12195ciP c12195ciP) {
        return new C12245cjM(c12195ciP);
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<BRC20MintSignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        OLrzqt(this.QUSxYX, "init: " + signDataArgs);
        return zKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAJFbMH = aJFbMH();
        final Function1 function1 = new Function1() { // from class: o.ciZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12195ciP.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAJFbMH.KWHzl(new InterfaceC58229yxO() { // from class: o.cjc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12195ciP.QCjLjM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd OLrzqt(C12195ciP c12195ciP, kotlin.Pair pair) {
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
        if (c10854bwMRXzakW != null) {
            return c10854bwMRXzakW;
        }
        if (QDqgQU()) {
            return super.fHqPtx();
        }
        return dHguZz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC12239cjG
    public java.lang.String DNMMPQ() {
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) yEE.AhwBna(1, 14)), dvKsVJ()) && yEE.AhwBna(3, 4, 9).contains(java.lang.Integer.valueOf(((BRC20MintSignData) QVsKAR()).getMintType()))) {
            return ((BRC20MintSignData) QVsKAR()).getTicker();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean QDqgQU() {
        switch (((BRC20MintSignData) QVsKAR()).getMintType()) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                return false;
        }
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(QUSxYX(), refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(TarCU(), java.lang.Integer.valueOf(RKcVTr())), false, (RoundingMode) null, 3, (java.lang.Object) null), refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : ((C11990ceW) QKudOq()).AEQbTJ(), (java.lang.Integer) 11, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, dvKsVJ(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59376, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final java.lang.Boolean aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<java.lang.Boolean> iZzfmt() {
        AbstractC58185ywX<BRC20TransactionResult> abstractC58185ywXAhwBna = AhwBna(copydefault(QKVWgx(), djSkpj()));
        final Function1 function1 = new Function1() { // from class: o.ciR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12195ciP.KWHzl(this.EZpvd, (BRC20TransactionResult) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXAhwBna.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ciT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12195ciP.aUsmxb(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Boolean KWHzl(C12195ciP c12195ciP, BRC20TransactionResult bRC20TransactionResult) {
        boolean z;
        Intrinsics.checkNotNullParameter(bRC20TransactionResult, "");
        BRC20TransactionResult bRC20TransactionResult2 = c12195ciP.QVAiDq;
        c12195ciP.QVAiDq = bRC20TransactionResult;
        java.lang.String commitTx = bRC20TransactionResult != null ? bRC20TransactionResult.getCommitTx() : null;
        if (commitTx == null || commitTx.length() == 0) {
            z = true;
        } else {
            java.lang.String commitTxFee = bRC20TransactionResult2 != null ? bRC20TransactionResult2.getCommitTxFee() : null;
            java.lang.String feeRate = bRC20TransactionResult2 != null ? bRC20TransactionResult2.getFeeRate() : null;
            if (feeRate == null) {
                feeRate = "";
            }
            java.lang.String strKWHzl = c12195ciP.KWHzl(commitTxFee, feeRate);
            BRC20TransactionResult bRC20TransactionResult3 = c12195ciP.QVAiDq;
            java.lang.String commitTxFee2 = bRC20TransactionResult3 != null ? bRC20TransactionResult3.getCommitTxFee() : null;
            BRC20TransactionResult bRC20TransactionResult4 = c12195ciP.QVAiDq;
            java.lang.String feeRate2 = bRC20TransactionResult4 != null ? bRC20TransactionResult4.getFeeRate() : null;
            if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) c12195ciP.KWHzl(commitTxFee2, feeRate2 != null ? feeRate2 : ""))) {
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String fZBcTu() {
        java.util.List<java.lang.String> revealTxFees;
        BigDecimal bigDecimal = new BigDecimal("0");
        BRC20TransactionResult bRC20TransactionResult = this.QVAiDq;
        java.lang.String commitTxFee = bRC20TransactionResult != null ? bRC20TransactionResult.getCommitTxFee() : null;
        BRC20TransactionResult bRC20TransactionResult2 = this.QVAiDq;
        java.lang.String feeRate = bRC20TransactionResult2 != null ? bRC20TransactionResult2.getFeeRate() : null;
        if (feeRate == null) {
            feeRate = "";
        }
        BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimal, KWHzl(commitTxFee, feeRate));
        BRC20TransactionResult bRC20TransactionResult3 = this.QVAiDq;
        if (bRC20TransactionResult3 != null && (revealTxFees = bRC20TransactionResult3.getRevealTxFees()) != null) {
            for (java.lang.String str : revealTxFees) {
                BRC20TransactionResult bRC20TransactionResult4 = this.QVAiDq;
                java.lang.String feeRate2 = bRC20TransactionResult4 != null ? bRC20TransactionResult4.getFeeRate() : null;
                if (feeRate2 == null) {
                    feeRate2 = "";
                }
                bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, KWHzl(str, feeRate2));
            }
        }
        return C54862xYb.convertToBigIntegerString$default(bigDecimalKWHzl, true, (RoundingMode) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<BRC20TransactionResult> AhwBna(final java.util.List<UTXOInfoResp> list) {
        AbstractC58185ywX<BRC20TransactionResult> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.ciS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C12195ciP.copydefault(list, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final BRC20TransactionResult copydefault(java.util.List list, C12195ciP c12195ciP) {
        BRC20TransactionResult bRC20TransactionResult;
        java.util.List<java.lang.String> revealTxFees;
        BRC20TransactionResult bRC20TransactionResultEZpvd = (list == null || list.isEmpty()) ? null : c12195ciP.OTwTPd().EZpvd(list);
        if (bRC20TransactionResultEZpvd == null) {
            bRC20TransactionResultEZpvd = new BRC20TransactionResult((java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, 63, (DefaultConstructorMarker) null);
        }
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default(c12195ciP.DXXBbs(), 0, 1, null);
        if (bRC20TransactionResultEZpvd.getFeeRate() == null) {
            bRC20TransactionResultEZpvd.setFeeRate(feeRate$default);
        }
        java.lang.String commitTxFee = bRC20TransactionResultEZpvd.getCommitTxFee();
        if ((commitTxFee == null || commitTxFee.length() == 0 || (revealTxFees = bRC20TransactionResultEZpvd.getRevealTxFees()) == null || revealTxFees.isEmpty()) && (bRC20TransactionResult = c12195ciP.QVAiDq) != null) {
            java.lang.String commitTxFee2 = bRC20TransactionResult.getCommitTxFee();
            java.lang.String feeRate = bRC20TransactionResult.getFeeRate();
            if (feeRate == null) {
                feeRate = "";
            }
            bRC20TransactionResultEZpvd.setCommitTxFee(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(c12195ciP.KWHzl(commitTxFee2, feeRate), feeRate$default), false, (RoundingMode) null, 3, (java.lang.Object) null));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<java.lang.String> revealTxFees2 = bRC20TransactionResult.getRevealTxFees();
            if (revealTxFees2 != null) {
                for (java.lang.String str : revealTxFees2) {
                    java.lang.String feeRate2 = bRC20TransactionResult.getFeeRate();
                    if (feeRate2 == null) {
                        feeRate2 = "";
                    }
                    arrayList.add(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(c12195ciP.KWHzl(str, feeRate2), feeRate$default), false, (RoundingMode) null, 3, (java.lang.Object) null));
                }
            }
            bRC20TransactionResultEZpvd.setRevealTxFees(arrayList);
        }
        return bRC20TransactionResultEZpvd;
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        UTXOInfoResp uTXOInfoResp;
        java.util.List<UtxoInfo> utxoList;
        if (!giSNqX() && !gasjUx()) {
            BRC20TransactionResult bRC20TransactionResult = this.QVAiDq;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (bRC20TransactionResult != null ? bRC20TransactionResult.getCommitTxFee() : null))) {
                BRC20TransactionResult bRC20TransactionResult2 = this.QVAiDq;
                if (C33129mqd.KWHzl((java.util.Collection) (bRC20TransactionResult2 != null ? bRC20TransactionResult2.getRevealTxFees() : null))) {
                    java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
                    java.lang.Integer numValueOf = (listDjSkpj == null || (uTXOInfoResp = (UTXOInfoResp) CollectionsKt___CollectionsKt.AuCTelauCTel(listDjSkpj)) == null || (utxoList = uTXOInfoResp.getUtxoList()) == null) ? null : java.lang.Integer.valueOf(utxoList.size());
                    UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
                    if (C33129mqd.valueOf(numValueOf, uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getTxSizeLimit() : null) && C33129mqd.copydefault(OcIXYQ(), ULRxlR())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final ResponseData USBtdM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(final java.lang.String str, final java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.ciV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12195ciP.AEQbTJ(this.EZpvd, str, str2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ciX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12195ciP.USBtdM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return EZpvd((AbstractC58185ywX<ResponseData<BRC20TransactionResult>>) abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData AEQbTJ(C12195ciP c12195ciP, java.lang.String str, java.lang.String str2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            return new ResponseData(-5001, null, null, null, c12195ciP.OTwTPd().EZpvd(str, str2, (java.util.List) responseData.getData()), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null);
    }

    public static final InterfaceC60096zvd igXuih(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.ciQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12195ciP.KWHzl(this.OLrzqt, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ciU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12195ciP.igXuih(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd KWHzl(final C12195ciP c12195ciP, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            final SignParams signParams = new SignParams(c12195ciP.dHguZz().QKVWgx(), c12195ciP.dHguZz().fetchVPNInfo(), null, null, null, null, 0, null, false, false, null, 2044, null);
            final java.util.List<UTXOTxIn> listOLrzqt = c12195ciP.OTwTPd().OLrzqt((java.util.List) responseData.getData());
            AbstractC58185ywX abstractC58185ywXAEQbTJ = C10965byR.OLrzqt.AEQbTJ(str, c12195ciP.dUDNAs(), c12195ciP.dHguZz(), new Function0() { // from class: o.ciM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C12195ciP.EZpvd(signParams, c12195ciP, listOLrzqt);
                }
            }, new Function1() { // from class: o.ciL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C12195ciP.KWHzl((TxMessage) obj));
                }
            }, new Function1() { // from class: o.cja
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12195ciP.OLrzqt((TxMessage) obj);
                }
            }, new Function1() { // from class: o.cjd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12195ciP.valueOf((TxMessage) obj);
                }
            }, new Function2() { // from class: o.cje
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C12195ciP.KWHzl(signParams, c12195ciP, listOLrzqt, (java.lang.String) obj, (java.util.List) obj2);
                }
            }, new Function1() { // from class: o.cjb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C12195ciP.EZpvd((BRC20TransactionResult) obj));
                }
            }, new Function1() { // from class: o.cji
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12195ciP.copydefault((BRC20TransactionResult) obj);
                }
            });
            final Function1 function1 = new Function1() { // from class: o.cjf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12195ciP.gEmmrt((ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<BRC20TransactionResult>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12195ciP.fdOvFl(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
            return c12195ciP.EZpvd(abstractC58185ywXAEQbTJ2);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cjM.generateBRC20Transaction$OKWallet_wallet_impl$default(o.cjM, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, java.lang.Object):com.okinc.wallet.core.sign.utxo.BRC20Transaction */
    public static final TxMessage EZpvd(SignParams signParams, C12195ciP c12195ciP, java.util.List list) {
        C54904xZq c54904xZq = C54904xZq.copydefault;
        C12245cjM c12245cjMOTwTPd = c12195ciP.OTwTPd();
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default(c12195ciP.DXXBbs(), 0, 1, null);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = c12195ciP.dUDNAs().QSBOWP();
        java.lang.String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : null;
        java.lang.String str = ecdsaPubkey == null ? "" : ecdsaPubkey;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = c12195ciP.dUDNAs().QSBOWP();
        java.lang.String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : null;
        BRC20TransactionResult bRC20TransactionResultEZpvd = c54904xZq.EZpvd(signParams, C12245cjM.generateBRC20Transaction$OKWallet_wallet_impl$default(c12245cjMOTwTPd, feeRate$default, list, str, ecdsaChainCode == null ? "" : ecdsaChainCode, null, null, 48, null));
        KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl));
        java.util.List<java.lang.String> sigHashList = bRC20TransactionResultEZpvd != null ? bRC20TransactionResultEZpvd.getSigHashList() : null;
        if (sigHashList == null) {
            sigHashList = yDY.AhwBna();
        }
        java.lang.String strEncodeToString$default = C54907xZt.encodeToString$default(kSerializerListSerializer, sigHashList, false, 2, null);
        java.lang.String commitTx = bRC20TransactionResultEZpvd != null ? bRC20TransactionResultEZpvd.getCommitTx() : null;
        return new TxMessage(strEncodeToString$default, commitTx != null ? commitTx : "");
    }

    public static final boolean KWHzl(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.isValid();
    }

    public static final java.lang.String OLrzqt(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getMessage();
    }

    public static final java.lang.String valueOf(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getTx();
    }

    public static final BRC20TransactionResult KWHzl(SignParams signParams, C12195ciP c12195ciP, java.util.List list, java.lang.String str, java.util.List list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        C54904xZq c54904xZq = C54904xZq.copydefault;
        C12245cjM c12245cjMOTwTPd = c12195ciP.OTwTPd();
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default(c12195ciP.DXXBbs(), 0, 1, null);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = c12195ciP.dUDNAs().QSBOWP();
        java.lang.String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : null;
        java.lang.String str2 = ecdsaPubkey == null ? "" : ecdsaPubkey;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = c12195ciP.dUDNAs().QSBOWP();
        java.lang.String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : null;
        if (ecdsaChainCode == null) {
            ecdsaChainCode = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(c12195ciP.aKErDB().KWHzl((RSV) it.next()));
        }
        return c54904xZq.copydefault(signParams, c12245cjMOTwTPd.AEQbTJ(feeRate$default, list, str2, ecdsaChainCode, str, arrayList));
    }

    public static final ResponseData fdOvFl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData gEmmrt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && responseData.getData() != null) {
            return new ResponseData(-5001, null, null, null, responseData.getData(), null, 46, null);
        }
        return new ResponseData(-5005, null, null, null, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(AbstractC58185ywX<ResponseData<BRC20TransactionResult>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.ciW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12195ciP.copydefault(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ciY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12195ciP.DLWbHP(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData copydefault(C12195ciP c12195ciP, ResponseData responseData) {
        java.util.List<java.lang.String> revealTxs;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            BRC20TransactionResult bRC20TransactionResult = (BRC20TransactionResult) responseData.getData();
            if (bRC20TransactionResult == null) {
                return new ResponseData(-5005, null, null, null, null, null, 62, null);
            }
            java.lang.String commitTx = bRC20TransactionResult.getCommitTx();
            if (commitTx == null || commitTx.length() == 0 || (revealTxs = bRC20TransactionResult.getRevealTxs()) == null || revealTxs.isEmpty()) {
                return new ResponseData(-5010, null, null, null, null, null, 62, null);
            }
            java.lang.Integer numDvKsVJ = c12195ciP.dvKsVJ();
            java.lang.String strL_ = c12195ciP.l_();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String commitTx2 = bRC20TransactionResult.getCommitTx();
            java.lang.String str = commitTx2 == null ? "" : commitTx2;
            xYW xyw = xYW.AEQbTJ;
            java.lang.String commitTx3 = bRC20TransactionResult.getCommitTx();
            if (commitTx3 == null) {
                commitTx3 = "";
            }
            BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(c12195ciP, str, xyw.OLrzqt(commitTx3, c12195ciP.dHguZz().QKVWgx()), null, new UTXOExtJson(java.lang.Integer.valueOf(c12195ciP.RVsVBY()), c12195ciP.htlTjW(), null, null, null, null, null, c12195ciP.DGgnkA(), null, null, java.lang.Integer.valueOf(c12195ciP.DaRZkR()), c12195ciP.dvKsVJ(), null, 4988, null), 4, null);
            broadcastBeanGenerateBroadcastModel$default.setCoinAmount(c12195ciP.QXDzTk());
            java.lang.String commitTxFee = bRC20TransactionResult.getCommitTxFee();
            if (commitTxFee == null) {
                commitTxFee = "";
            }
            broadcastBeanGenerateBroadcastModel$default.setServiceCharge(commitTxFee);
            broadcastBeanGenerateBroadcastModel$default.setFeeRate(bRC20TransactionResult.getFeeRate());
            arrayList.add(broadcastBeanGenerateBroadcastModel$default);
            java.util.List<java.lang.String> revealTxs2 = bRC20TransactionResult.getRevealTxs();
            if (revealTxs2 != null) {
                int i = 0;
                for (java.lang.Object obj : revealTxs2) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str2 = (java.lang.String) obj;
                    xYW xyw2 = xYW.AEQbTJ;
                    BroadcastBean broadcastBeanGenerateBroadcastModel$default2 = AbstractC8664bGw.generateBroadcastModel$default(c12195ciP, str2, xyw2.OLrzqt(str2, c12195ciP.dHguZz().QKVWgx()), null, new UTXOExtJson(java.lang.Integer.valueOf(c12195ciP.RVsVBY()), c12195ciP.htlTjW(), null, null, null, null, null, c12195ciP.DGgnkA(), null, null, java.lang.Integer.valueOf(c12195ciP.DaRZkR()), c12195ciP.dvKsVJ(), null, 4988, null), 4, null);
                    broadcastBeanGenerateBroadcastModel$default2.setCoinAmount(c12195ciP.QXDzTk());
                    java.util.List<java.lang.String> revealTxFees = bRC20TransactionResult.getRevealTxFees();
                    java.util.List<java.lang.String> listEZpvd = null;
                    java.lang.String str3 = revealTxFees != null ? (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(revealTxFees, i) : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    broadcastBeanGenerateBroadcastModel$default2.setServiceCharge(str3);
                    broadcastBeanGenerateBroadcastModel$default2.setFeeRate(bRC20TransactionResult.getFeeRate());
                    java.lang.String commitTx4 = bRC20TransactionResult.getCommitTx();
                    if (commitTx4 != null && commitTx4.length() != 0) {
                        java.lang.String commitTx5 = bRC20TransactionResult.getCommitTx();
                        if (commitTx5 == null) {
                            commitTx5 = "";
                        }
                        listEZpvd = C56402yEa.EZpvd(xyw2.OLrzqt(commitTx5, c12195ciP.dHguZz().QKVWgx()));
                    }
                    broadcastBeanGenerateBroadcastModel$default2.setDependTx(listEZpvd);
                    arrayList.add(broadcastBeanGenerateBroadcastModel$default2);
                    i++;
                }
            }
            Unit unit = Unit.INSTANCE;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(arrayList, (java.util.List) null, bool, (java.lang.String) null, bool, numDvKsVJ, strL_, (SignAuthType) null, 138, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String QXDzTk() {
        java.lang.String strTarCU;
        if (QDqgQU()) {
            strTarCU = AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
        } else {
            strTarCU = TarCU();
        }
        java.lang.String strKWHzl = "1";
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) yEE.AhwBna(1, 14)), dvKsVJ()) && yEE.AhwBna(3, 4).contains(java.lang.Integer.valueOf(((BRC20MintSignData) QVsKAR()).getMintType()))) {
            strKWHzl = C54870xYj.KWHzl("1", fHqPtx().valueOf());
        }
        return C54862xYb.convertToString$default(C54862xYb.OLrzqt(strTarCU, strKWHzl), false, null, null, 7, null);
    }

    public final int RVsVBY() {
        return QDqgQU() ? 4 : 1;
    }

    public int DaRZkR() {
        return yEE.AhwBna(50, 51, 60).contains(java.lang.Integer.valueOf(C33129mqd.AhwBna(l_()))) ? 1 : 0;
    }
}
