package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12340clB<SignData extends UTXOTransferSignData> extends AbstractC12387clw<SignData> {
    public final java.lang.String UeEOUB = "OKWXRCBaseTransfer";
    public XRC20TransactionResult aKErDB;

    public abstract AbstractC58185ywX<ResponseData<XRC20TransactionResult>> AhwBna(@NotNull java.util.List<UtxoInfo> list);

    public abstract AbstractC58185ywX<ResponseData<XRC20TransactionResult>> OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.util.List<UtxoInfo> list);

    public abstract boolean OTwTPd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XRC20TransactionResult RKcVTr() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public java.lang.String l_() {
        return "53";
    }

    @Override // o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.util.List<UTXOInfoResp> listQKVWgx = QKVWgx();
        if (listQKVWgx != null) {
            java.util.Iterator<T> it = listQKVWgx.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) next).getAddress(), (java.lang.Object) htlTjW())) {
                        break;
                    }
                }
            }
            UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) next;
            if (uTXOInfoResp != null) {
                OLrzqt(uTXOInfoResp.getCanTransferAmount());
            }
        }
    }

    public static final java.lang.Boolean htlTjW(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<java.lang.Boolean> iZzfmt() {
        AbstractC58185ywX<XRC20TransactionResult> abstractC58185ywXGEmmrt = gEmmrt(AEQbTJ(QKVWgx(), djSkpj()));
        final Function1 function1 = new Function1() { // from class: o.clN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12340clB.EZpvd(this.KWHzl, (XRC20TransactionResult) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXGEmmrt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12340clB.htlTjW(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean EZpvd(AbstractC12340clB abstractC12340clB, XRC20TransactionResult xRC20TransactionResult) {
        Intrinsics.checkNotNullParameter(xRC20TransactionResult, "");
        XRC20TransactionResult xRC20TransactionResult2 = abstractC12340clB.aKErDB;
        abstractC12340clB.aKErDB = xRC20TransactionResult;
        java.lang.String str = abstractC12340clB.UeEOUB;
        java.lang.String commitTxFee = xRC20TransactionResult2 != null ? xRC20TransactionResult2.getCommitTxFee() : null;
        XRC20TransactionResult xRC20TransactionResult3 = abstractC12340clB.aKErDB;
        abstractC12340clB.OLrzqt(str, "isSignLengthChange  oldFee:" + commitTxFee + "  newFee:" + (xRC20TransactionResult3 != null ? xRC20TransactionResult3.getCommitTxFee() : null));
        java.lang.String commitTxFee2 = xRC20TransactionResult2 != null ? xRC20TransactionResult2.getCommitTxFee() : null;
        java.lang.String feeRate = xRC20TransactionResult2 != null ? xRC20TransactionResult2.getFeeRate() : null;
        if (feeRate == null) {
            feeRate = "";
        }
        java.lang.String strKWHzl = abstractC12340clB.KWHzl(commitTxFee2, feeRate);
        XRC20TransactionResult xRC20TransactionResult4 = abstractC12340clB.aKErDB;
        java.lang.String commitTxFee3 = xRC20TransactionResult4 != null ? xRC20TransactionResult4.getCommitTxFee() : null;
        XRC20TransactionResult xRC20TransactionResult5 = abstractC12340clB.aKErDB;
        return java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) abstractC12340clB.KWHzl(commitTxFee3, (xRC20TransactionResult5 != null ? xRC20TransactionResult5.getFeeRate() : null) != null ? r2 : "")));
    }

    /* JADX DEBUG: Type inference failed for r10v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.wallet.core.sign.utxo.XRC20TransactionResult> */
    private final AbstractC58185ywX<XRC20TransactionResult> gEmmrt(java.util.List<UtxoInfo> list) {
        AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXKWHzl;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            abstractC58185ywXKWHzl = AhwBna(list);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null));
        }
        final Function1 function1 = new Function1() { // from class: o.clI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12340clB.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12340clB.fjfviF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final XRC20TransactionResult fjfviF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (XRC20TransactionResult) function1.invoke(obj);
    }

    public static final XRC20TransactionResult AEQbTJ(AbstractC12340clB abstractC12340clB, ResponseData responseData) {
        XRC20TransactionResult xRC20TransactionResult;
        Intrinsics.checkNotNullParameter(responseData, "");
        XRC20TransactionResult xRC20TransactionResult2 = (XRC20TransactionResult) responseData.getData();
        if (xRC20TransactionResult2 == null) {
            xRC20TransactionResult2 = new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        }
        abstractC12340clB.OLrzqt(abstractC12340clB.UeEOUB, "calculateFee111  " + xRC20TransactionResult2);
        java.lang.String feeRate$default = C11990ceW.getFeeRate$default(abstractC12340clB.DXXBbs(), 0, 1, null);
        if (xRC20TransactionResult2.getFeeRate() == null) {
            xRC20TransactionResult2.setFeeRate(feeRate$default);
        }
        java.lang.String commitTxFee = xRC20TransactionResult2.getCommitTxFee();
        if ((commitTxFee == null || commitTxFee.length() == 0) && (xRC20TransactionResult = abstractC12340clB.aKErDB) != null && C33129mqd.AEQbTJ(xRC20TransactionResult.getCommitTxFee(), "0")) {
            xRC20TransactionResult2.setCommitTxFee(C54862xYb.convertToBigIntegerString$default(C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.divB$default(xRC20TransactionResult.getCommitTxFee(), xRC20TransactionResult.getFeeRate(), 0, null, 6, null), feeRate$default), false, null, null, 7, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        }
        abstractC12340clB.OLrzqt(abstractC12340clB.UeEOUB, "calculateFee222  " + xRC20TransactionResult2);
        return xRC20TransactionResult2;
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String fZBcTu() {
        XRC20TransactionResult xRC20TransactionResult = this.aKErDB;
        java.lang.String commitTxFee = xRC20TransactionResult != null ? xRC20TransactionResult.getCommitTxFee() : null;
        XRC20TransactionResult xRC20TransactionResult2 = this.aKErDB;
        java.lang.String feeRate = xRC20TransactionResult2 != null ? xRC20TransactionResult2.getFeeRate() : null;
        if (feeRate == null) {
            feeRate = "";
        }
        return KWHzl(commitTxFee, feeRate);
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean E_() {
        return super.E_() && !RVsVBY();
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        return super.F_() && !OTwTPd();
    }

    public final boolean RVsVBY() {
        XRC20TransactionResult xRC20TransactionResult = this.aKErDB;
        return Intrinsics.EZpvd((java.lang.Object) (xRC20TransactionResult != null ? xRC20TransactionResult.getErrCode() : null), (java.lang.Object) "2011400");
    }

    public static final InterfaceC60096zvd spnCvw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(final java.lang.String str, final java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.clE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12340clB.AEQbTJ(this.KWHzl, str, str2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.clD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12340clB.spnCvw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.clJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12340clB.OLrzqt(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.clG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12340clB.fERRXa(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd AEQbTJ(final AbstractC12340clB abstractC12340clB, java.lang.String str, java.lang.String str2, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            AbstractC58185ywX<ResponseData<XRC20TransactionResult>> abstractC58185ywXOLrzqt = abstractC12340clB.OLrzqt(str, str2, abstractC12340clB.copydefault((java.util.List<UTXOInfoResp>) responseData.getData()));
            final Function1 function1 = new Function1() { // from class: o.clF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC12340clB.copydefault(this.AEQbTJ, responseData, (ResponseData) obj);
                }
            };
            return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC12340clB.DCUTEIdCUTEI(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null));
    }

    public static final ResponseData DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(AbstractC12340clB abstractC12340clB, ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData2, "");
        Intrinsics.copydefault(responseData);
        return abstractC12340clB.OLrzqt((ResponseData<XRC20TransactionResult>) responseData2, (ResponseData<? extends java.util.List<UTXOInfoResp>>) responseData);
    }

    public static final ResponseData fERRXa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(AbstractC12340clB abstractC12340clB, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001) {
            kotlin.Pair pair = (kotlin.Pair) responseData.getData();
            XRC20TransactionResult xRC20TransactionResult = pair != null ? (XRC20TransactionResult) pair.getFirst() : null;
            kotlin.Pair pair2 = (kotlin.Pair) responseData.getData();
            return new ResponseData(-5001, null, null, null, abstractC12340clB.KWHzl(xRC20TransactionResult, pair2 != null ? (java.util.List) pair2.getSecond() : null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, responseData.getErrorMsg(), null, responseData.getError_code(), 20, null);
    }

    public ResponseData<kotlin.Pair<XRC20TransactionResult, java.util.List<UTXOInfoResp>>> OLrzqt(@NotNull ResponseData<XRC20TransactionResult> responseData, @NotNull ResponseData<? extends java.util.List<UTXOInfoResp>> responseData2) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        XRC20TransactionResult data = responseData.getData();
        if (data == null) {
            return new ResponseData<>(-5005, null, null, null, null, null, 62, null);
        }
        java.lang.String commitTx = data.getCommitTx();
        if (commitTx == null || commitTx.length() == 0) {
            return new ResponseData<>(-5010, null, null, null, null, null, 62, null);
        }
        return new ResponseData<>(-5001, null, null, null, C56390yDp.OLrzqt(data, responseData2.getData()), null, 46, null);
    }

    public BatchBroadcastModel KWHzl(XRC20TransactionResult xRC20TransactionResult, java.util.List<UTXOInfoResp> list) {
        java.lang.String commitTx = xRC20TransactionResult != null ? xRC20TransactionResult.getCommitTx() : null;
        java.lang.String str = commitTx == null ? "" : commitTx;
        xYW xyw = xYW.AEQbTJ;
        java.lang.String commitTx2 = xRC20TransactionResult != null ? xRC20TransactionResult.getCommitTx() : null;
        if (commitTx2 == null) {
            commitTx2 = "";
        }
        BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(this, str, xyw.OLrzqt(commitTx2, dHguZz().QKVWgx()), null, new UTXOExtJson(4, QUSxYX(), null, aKErDB().copydefault(list), null, null, aKErDB().EZpvd(list), ExtJson.BRC20TYPE_TRANSFER, null, null, 0, dvKsVJ(), null, 4096, null), 4, null);
        java.lang.String commitTxFee = xRC20TransactionResult != null ? xRC20TransactionResult.getCommitTxFee() : null;
        broadcastBeanGenerateBroadcastModel$default.setServiceCharge(commitTxFee != null ? commitTxFee : "");
        return new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null);
    }
}
