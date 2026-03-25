package o;

import com.google.gson.Gson;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.utxo.BTCSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import java.math.RoundingMode;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ckD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12289ckD extends AbstractC12387clw<UTXOTransferSignData> {
    public int aKErDB;
    public final java.lang.String RcXXUw = "OKWUTXOTransfer";
    public final InterfaceC56387yDm QVAiDq = C56392yDr.copydefault(new Function0() { // from class: o.ckM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12289ckD.OLrzqt(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fJNWhG(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    /* JADX DEBUG: Possible override for method o.clw.DNMMPQ()Z */
    public C12358clT DNMMPQ() {
        return (C12358clT) this.QVAiDq.getValue();
    }

    public static final C12358clT OLrzqt(C12289ckD c12289ckD) {
        return new C12358clT(c12289ckD);
    }

    @Override // o.AbstractC12387clw
    public java.lang.String DGgnkA() {
        return AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        java.lang.String strConvertToBigIntegerString$default;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.String strHtlTjW = htlTjW();
        java.lang.String strAEQbTJ = "0";
        if (refreshUTXOVenue.getUpdateCanTransferAmount()) {
            strConvertToBigIntegerString$default = "0";
        } else {
            strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C_() ? ORxRYg() : AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
        }
        if (!refreshUTXOVenue.getUpdateCanTransferAmount() && !C_()) {
            strAEQbTJ = ((C11990ceW) QKudOq()).AEQbTJ();
        }
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(strHtlTjW, strConvertToBigIntegerString$default, strAEQbTJ, (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 63472, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<java.lang.Boolean> iZzfmt() {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.ckQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C12289ckD.copydefault(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean copydefault(C12289ckD c12289ckD) {
        int i = c12289ckD.aKErDB;
        int iCopydefault = c12289ckD.DNMMPQ().copydefault(c12289ckD.copydefault(c12289ckD.QKVWgx(), c12289ckD.djSkpj()));
        c12289ckD.aKErDB = iCopydefault;
        c12289ckD.OLrzqt(c12289ckD.RcXXUw, "isSignLengthChange: oldSignLength:" + i + "  mSignLength:" + iCopydefault);
        return java.lang.Boolean.valueOf(c12289ckD.aKErDB != i);
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String fZBcTu() {
        return java.lang.String.valueOf(this.aKErDB);
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void AhwBna() {
        super.AhwBna();
        DLWbHP().AEQbTJ(new C9811bcd(!QXDzTk()));
    }

    public final boolean QXDzTk() {
        if (fHqPtx().iRxXKY()) {
            C9808bca c9808bca = (C9808bca) DLWbHP().KWHzl(C56524yIo.AEQbTJ(C9808bca.class));
            C9754bbZ c9754bbZ = (C9754bbZ) DLWbHP().KWHzl(C56524yIo.AEQbTJ(C9754bbZ.class));
            if (gasjUx()) {
                return true;
            }
            if (RVsVBY() && ((c9808bca == null || c9808bca.AhwBna()) && c9754bbZ != null && !c9754bbZ.AhwBna())) {
                return true;
            }
            if (RVsVBY() && c9808bca != null && !c9808bca.AhwBna() && C33129mqd.gEmmrt(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), AbstractC8704bHj.getCoinBalance$default(this, null, 1, null))) {
                return true;
            }
        }
        return false;
    }

    public final boolean RVsVBY() {
        return C33129mqd.AEQbTJ(AbstractC8704bHj.getCoinBalance$default(this, null, 1, null), ORxRYg());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String QIZEnU() {
        return ((UTXOTransferSignData) QVsKAR()).getMemo();
    }

    public final java.lang.Integer QDqgQU() {
        java.lang.String strQIZEnU = QIZEnU();
        return (strQIZEnU == null || strQIZEnU.length() == 0) ? null : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(final java.lang.String str, final java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.ckK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.OLrzqt(this.EZpvd, str, str2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ckH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.DLWbHP(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ckU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.values(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.QVsKAR(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData OLrzqt(C12289ckD c12289ckD, java.lang.String str, java.lang.String str2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.String strOLrzqt = c12289ckD.DNMMPQ().OLrzqt(str, str2, (java.util.List) responseData.getData());
            if (strOLrzqt.length() == 0) {
                return new ResponseData(-5005, null, null, null, null, null, 62, null);
            }
            return new ResponseData(-5001, null, null, null, strOLrzqt, null, 46, null);
        }
        return new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResponseData QVsKAR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData values(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12289ckD.fetchVPNInfo((ResponseData<java.lang.String>) responseData);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!dHguZz().hrNTAI()) {
            return super.EZpvd(str, submitTxExpandBean);
        }
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.ckN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.copydefault(this.OLrzqt, str, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ckT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.DGOPHZDGOPHZ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ckR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.iwGUEr(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.ckV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.DGUQLI(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.ckS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.getFieldNames(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ckW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.heceqZ(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final InterfaceC60096zvd DGOPHZDGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C12289ckD c12289ckD, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            final TxInsBean txInsBeanAEQbTJ = c12289ckD.DNMMPQ().AEQbTJ((java.util.List<UTXOInfoResp>) responseData.getData());
            AbstractC58185ywX abstractC58185ywXAEQbTJ = C10965byR.OLrzqt.AEQbTJ(str, c12289ckD.dUDNAs(), c12289ckD.dHguZz(), new Function0() { // from class: o.clp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C12289ckD.EZpvd(this.AEQbTJ, txInsBeanAEQbTJ);
                }
            }, new Function1() { // from class: o.clq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C12289ckD.djBIcL((TxMessage) obj));
                }
            }, new Function1() { // from class: o.clr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12289ckD.OLrzqt((TxMessage) obj);
                }
            }, new Function1() { // from class: o.clv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12289ckD.KWHzl((TxMessage) obj);
                }
            }, new Function2() { // from class: o.cly
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C12289ckD.KWHzl(this.AEQbTJ, txInsBeanAEQbTJ, (java.lang.String) obj, (java.util.List) obj2);
                }
            }, new Function1() { // from class: o.clz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C12289ckD.valueOf((java.lang.String) obj));
                }
            }, new Function1() { // from class: o.ckJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12289ckD.fJNWhG((java.lang.String) obj);
                }
            });
            final Function1 function1 = new Function1() { // from class: o.ckI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12289ckD.isConnected((ResponseData) obj);
                }
            };
            return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ckL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12289ckD.UrRBLY(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null));
    }

    public static final TxMessage EZpvd(C12289ckD c12289ckD, TxInsBean txInsBean) {
        return C54904xZq.copydefault.AEQbTJ(c12289ckD.dHguZz().QKVWgx(), c12289ckD.DNMMPQ().v_(), c12289ckD.fdOvFl(), c12289ckD.DNMMPQ().AEQbTJ(txInsBean));
    }

    public static final boolean djBIcL(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.isValid();
    }

    public static final java.lang.String OLrzqt(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getMessage();
    }

    public static final java.lang.String KWHzl(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getTx();
    }

    public static final java.lang.String KWHzl(C12289ckD c12289ckD, TxInsBean txInsBean, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        C54904xZq c54904xZq = C54904xZq.copydefault;
        long jQKVWgx = c12289ckD.dHguZz().QKVWgx();
        int iFdOvFl = c12289ckD.fdOvFl();
        java.lang.String strIgXuih = c12289ckD.igXuih();
        java.util.List txIns = txInsBean != null ? txInsBean.getTxIns() : null;
        if (txIns == null) {
            txIns = yDY.AhwBna();
        }
        return c54904xZq.OLrzqt(jQKVWgx, iFdOvFl, new BTCSignatureRawValue(str, strIgXuih, C12800ctn.copydefault(list, txIns)));
    }

    public static final boolean valueOf(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() > 0;
    }

    public static final ResponseData UrRBLY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData isConnected(ResponseData responseData) {
        java.lang.CharSequence charSequence;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && (charSequence = (java.lang.CharSequence) responseData.getData()) != null && charSequence.length() != 0) {
            return new ResponseData(-5001, null, null, null, responseData.getData(), null, 46, null);
        }
        return new ResponseData(-5005, null, null, null, null, null, 62, null);
    }

    public static final ResponseData DGUQLI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData iwGUEr(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12289ckD.fetchVPNInfo((ResponseData<java.lang.String>) responseData);
    }

    public static final ResponseData heceqZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData getFieldNames(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c12289ckD.OLrzqt(c12289ckD.RcXXUw, "broadcast: " + responseData);
        return responseData;
    }

    public static final InterfaceC60096zvd DGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.ckZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.ejfBZ(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.ckY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.DGOPHZ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ckX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.fARcdN(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.call(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.fIwbmz(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.run(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final InterfaceC60096zvd ejfBZ(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            TxInsBean txInsBeanAEQbTJ = c12289ckD.DNMMPQ().AEQbTJ((java.util.List<UTXOInfoResp>) responseData.getData());
            LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
            C10854bwM c10854bwMDHguZz = c12289ckD.dHguZz();
            ChainAddress chainAddressFERRXa = c12289ckD.fERRXa();
            java.lang.String strV_ = c12289ckD.DNMMPQ().v_();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(txInsBeanAEQbTJ != null ? txInsBeanAEQbTJ.getBalance() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
            UTXOSignInfo uTXOSignInfoUeEOUB = c12289ckD.UeEOUB();
            java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String strHtlTjW = c12289ckD.htlTjW();
            java.lang.String strZLjUOn = c12289ckD.zLjUOn();
            java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(c12289ckD, false, false, 3, null);
            java.lang.String strAEQbTJ = c12289ckD.DXXBbs().AEQbTJ();
            java.util.ArrayList<UTXOTxIn> txIns = txInsBeanAEQbTJ != null ? txInsBeanAEQbTJ.getTxIns() : null;
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = ledgerSignHelper.AEQbTJ(new LedgerSignHelper.ActionBar(c10854bwMDHguZz, chainAddressFERRXa, strV_, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strHtlTjW, strZLjUOn, transferAmount$default, strAEQbTJ, txIns == null ? yDY.AhwBna() : txIns, c12289ckD.fdOvFl(), null));
            final Function1 function1 = new Function1() { // from class: o.ckP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12289ckD.DbNXlk((ResponseData) obj);
                }
            };
            return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ckO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12289ckD.WS(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null));
    }

    public static final ResponseData WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData DbNXlk(ResponseData responseData) {
        java.lang.CharSequence charSequence;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && (charSequence = (java.lang.CharSequence) responseData.getData()) != null && charSequence.length() != 0) {
            return new ResponseData(-5001, null, null, null, responseData.getData(), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public static final ResponseData call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData fARcdN(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12289ckD.fetchVPNInfo((ResponseData<java.lang.String>) responseData);
    }

    public static final ResponseData run(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData fIwbmz(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c12289ckD.OLrzqt(c12289ckD.RcXXUw, "broadcast: " + responseData);
        return responseData;
    }

    /* JADX DEBUG: Type inference failed for r12v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        if (!fHqPtx().spnCvw()) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        java.lang.String keystoneSignTx = submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null;
        if (keystoneSignTx == null || keystoneSignTx.length() == 0) {
            AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl2 = KWHzl(submitTxExpandBean);
            final Function1 function1 = new Function1() { // from class: o.clh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12289ckD.fetchVPNInfo(this.AEQbTJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cln
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12289ckD.Dmq(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, submitTxExpandBean != null ? submitTxExpandBean.getKeystoneSignTx() : null, null, 46, null));
        final Function1 function12 = new Function1() { // from class: o.cll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.DbNXlk(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.ixgjPv(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.clo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.fJNWhG(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ3 = abstractC58185ywXAEQbTJ2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.DCUTEIddSDPG(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ3, "");
        return abstractC58185ywXAEQbTJ3;
    }

    public static final ResponseData Dmq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData fetchVPNInfo(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c12289ckD.OLrzqt(c12289ckD.RcXXUw, "keystone to sign");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            return new ResponseData(-5013, null, null, null, null, null, 62, null);
        }
        return new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null);
    }

    public static final ResponseData ixgjPv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData DbNXlk(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12289ckD.fetchVPNInfo((ResponseData<java.lang.String>) responseData);
    }

    public static final ResponseData DCUTEIddSDPG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData fJNWhG(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c12289ckD.OLrzqt(c12289ckD.RcXXUw, "broadcast: " + responseData);
        return responseData;
    }

    public static final InterfaceC60096zvd DWgRXt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.clc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.AuCTel(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.clb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.DWgRXt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.getNewProxyInstance(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.clg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.fHqPtx(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.clk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12289ckD.uzCIH(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12289ckD.DcqEDu(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final InterfaceC60096zvd AuCTel(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = OneKeySignHelper.copydefault.copydefault(c12289ckD.dUDNAs(), c12289ckD.DNMMPQ().AEQbTJ(c12289ckD.DNMMPQ().AEQbTJ((java.util.List<UTXOInfoResp>) responseData.getData())));
            final Function1 function1 = new Function1() { // from class: o.clt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12289ckD.AkhnZx((ResponseData) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.clu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12289ckD.KDccX(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new ResponseData(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null));
    }

    public static final ResponseData KDccX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AkhnZx(ResponseData responseData) {
        java.lang.CharSequence charSequence;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && (charSequence = (java.lang.CharSequence) responseData.getData()) != null && charSequence.length() != 0) {
            return new ResponseData(-5001, null, null, null, responseData.getData(), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public static final ResponseData fHqPtx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData getNewProxyInstance(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c12289ckD.fetchVPNInfo((ResponseData<java.lang.String>) responseData);
    }

    public static final ResponseData DcqEDu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData uzCIH(C12289ckD c12289ckD, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c12289ckD.OLrzqt(c12289ckD.RcXXUw, "broadcast: " + responseData);
        return responseData;
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String zuBGHE() {
        if (dHguZz().AxsJAYaxsJAY()) {
            return aKErDB().copydefault(DNMMPQ().AEQbTJ(DNMMPQ().AEQbTJ(copydefault(QKVWgx(), djSkpj()))));
        }
        if (!dHguZz().DLWbHP() && !dHguZz().OqFWZa() && !dHguZz().flVtFt()) {
            return "";
        }
        java.lang.String json = new Gson().toJson(DNMMPQ().AEQbTJ(DNMMPQ().AEQbTJ(copydefault(QKVWgx(), djSkpj()))), UTXOTransaction.class);
        Intrinsics.copydefault((java.lang.Object) json);
        return json;
    }

    private final ResponseData<BatchBroadcastModel> fetchVPNInfo(ResponseData<java.lang.String> responseData) {
        if (responseData.getCode() == -5001) {
            java.lang.String data = responseData.getData();
            java.lang.String str = data == null ? "" : data;
            xYW xyw = xYW.AEQbTJ;
            java.lang.String data2 = responseData.getData();
            return new ResponseData<>(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8664bGw.generateBroadcastModel$default(this, str, xyw.OLrzqt(data2 != null ? data2 : "", dHguZz().QKVWgx()), null, new UTXOExtJson(1, htlTjW(), null, null, null, null, null, null, null, null, 0, dvKsVJ(), null, 4096, null), 4, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData<>(responseData.getCode(), null, null, responseData.getErrorMsg(), null, responseData.getError_code(), 22, null);
    }

    @Override // o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
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
}
