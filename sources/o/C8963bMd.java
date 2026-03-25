package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.EVMBatchContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignDataInBatch;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EVMBatchExtJson;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.evm.SigData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: o.bMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8963bMd extends C8972bMm<EVMBatchContractSignData> {
    public EVMContractSignDataInBatch AYXKKw;
    public java.lang.String AhwBna;
    public boolean djBIcL;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.valueOf;
    }

    public C8963bMd() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public boolean q_() {
        java.lang.String strOLrzqt;
        EVMBatchContractSignData eVMBatchContractSignDataQVsKAR = QVsKAR();
        java.util.Iterator<T> it = eVMBatchContractSignDataQVsKAR.getMultiSignData().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            int length = ((EVMContractSignDataInBatch) next).getData().length();
            do {
                java.lang.Object next2 = it.next();
                int length2 = ((EVMContractSignDataInBatch) next2).getData().length();
                if (length < length2) {
                    next = next2;
                    length = length2;
                }
            } while (it.hasNext());
        }
        this.AYXKKw = (EVMContractSignDataInBatch) next;
        for (EVMContractSignDataInBatch eVMContractSignDataInBatch : eVMBatchContractSignDataQVsKAR.getMultiSignData()) {
            java.lang.String value = eVMContractSignDataInBatch.getValue();
            if (value == null || (strOLrzqt = C33491mxU.OLrzqt(value)) == null) {
                strOLrzqt = "0";
            }
            eVMContractSignDataInBatch.setValue(strOLrzqt);
        }
        java.util.List<EVMContractSignDataInBatch> multiSignData = eVMBatchContractSignDataQVsKAR.getMultiSignData();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        java.util.Iterator<T> it2 = multiSignData.iterator();
        while (it2.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(C33129mqd.copydefault(((EVMContractSignDataInBatch) it2.next()).getValue()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        this.AhwBna = bigDecimalValueOf.toString();
        super.q_();
        java.lang.Integer gasRate = eVMBatchContractSignDataQVsKAR.getGasRate();
        if (gasRate == null || gasRate.intValue() != 4 || !C33129mqd.OLrzqt((java.lang.CharSequence) eVMBatchContractSignDataQVsKAR.getGasPrice())) {
            return true;
        }
        isConnected(eVMBatchContractSignDataQVsKAR.getGasPrice());
        return true;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.C8972bMm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        final Function1 function1 = new Function1() { // from class: o.bMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8963bMd.AEQbTJ(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXR_.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8963bMd.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AEQbTJ(C8963bMd c8963bMd, kotlin.Pair pair) {
        EVMBatchContractSignData eVMBatchContractSignDataQVsKAR;
        java.lang.Integer gasRate;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && (gasRate = (eVMBatchContractSignDataQVsKAR = c8963bMd.QVsKAR()).getGasRate()) != null && gasRate.intValue() == 4 && C33129mqd.OLrzqt((java.lang.CharSequence) c8963bMd.DcqEDu()) && (C33129mqd.OLrzqt((java.lang.CharSequence) c8963bMd.KDccX()) || (C33129mqd.OLrzqt((java.lang.CharSequence) eVMBatchContractSignDataQVsKAR.getMaxFeePerGas()) && C33129mqd.OLrzqt((java.lang.CharSequence) eVMBatchContractSignDataQVsKAR.getMaxPriorityFeePerGas())))) {
            java.lang.Boolean supportEip1559 = c8963bMd.uzCIH().getGasPrice().getSupportEip1559();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!Intrinsics.EZpvd(supportEip1559, bool) && c8963bMd.KDccX() != null) {
                C9312bTH c9312bTHDXXBbs = c8963bMd.DXXBbs();
                java.lang.String strKDccX = c8963bMd.KDccX();
                Intrinsics.copydefault((java.lang.Object) strKDccX);
                java.lang.String strDcqEDu = c8963bMd.DcqEDu();
                Intrinsics.copydefault((java.lang.Object) strDcqEDu);
                c9312bTHDXXBbs.AEQbTJ(strKDccX, strDcqEDu, false, false);
            } else if (Intrinsics.EZpvd(c8963bMd.uzCIH().getGasPrice().getSupportEip1559(), bool) && eVMBatchContractSignDataQVsKAR.getMaxFeePerGas() != null && eVMBatchContractSignDataQVsKAR.getMaxPriorityFeePerGas() != null) {
                C9312bTH c9312bTHDXXBbs2 = c8963bMd.DXXBbs();
                java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(eVMBatchContractSignDataQVsKAR.getMaxFeePerGas(), eVMBatchContractSignDataQVsKAR.getMaxPriorityFeePerGas()), false, null, null, 7, null);
                java.lang.String maxPriorityFeePerGas = eVMBatchContractSignDataQVsKAR.getMaxPriorityFeePerGas();
                Intrinsics.copydefault((java.lang.Object) maxPriorityFeePerGas);
                java.lang.String strDcqEDu2 = c8963bMd.DcqEDu();
                Intrinsics.copydefault((java.lang.Object) strDcqEDu2);
                c9312bTHDXXBbs2.OLrzqt(strConvertToString$default, maxPriorityFeePerGas, strDcqEDu2, false, false);
            }
        }
        return pair;
    }

    @Override // o.C8972bMm, o.InterfaceC8931bLy
    public int fIwbmz() {
        return QVsKAR().getMultiSignData().size();
    }

    @Override // o.C8972bMm, o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        EVMContractSignDataInBatch eVMContractSignDataInBatch = this.AYXKKw;
        if (eVMContractSignDataInBatch == null) {
            Intrinsics.gEmmrt("");
            eVMContractSignDataInBatch = null;
        }
        return eVMContractSignDataInBatch.getTo();
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm
    public java.lang.String zuBGHE() {
        EVMContractSignDataInBatch eVMContractSignDataInBatch = this.AYXKKw;
        if (eVMContractSignDataInBatch == null) {
            Intrinsics.gEmmrt("");
            eVMContractSignDataInBatch = null;
        }
        java.lang.String value = eVMContractSignDataInBatch.getValue();
        return value == null ? "0" : value;
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        EVMContractSignDataInBatch eVMContractSignDataInBatch = this.AYXKKw;
        if (eVMContractSignDataInBatch == null) {
            Intrinsics.gEmmrt("");
            eVMContractSignDataInBatch = null;
        }
        return eVMContractSignDataInBatch.getData();
    }

    @Override // o.AbstractC8601bFm
    public boolean ORxRYg() {
        java.lang.String strKWHzl = DCJXGO().KWHzl(java.lang.Long.valueOf(dHguZz().AhwBna()), htlTjW());
        java.lang.String str = this.AhwBna;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        return C33129mqd.copydefault(strKWHzl, str);
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm
    public boolean DTwDnp() {
        java.lang.String strKWHzl = DCJXGO().KWHzl(java.lang.Long.valueOf(dHguZz().AhwBna()), htlTjW());
        java.lang.String feeAmount = DXXBbs().KWHzl().getFeeAmount();
        java.lang.String str = this.AhwBna;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        return C33129mqd.copydefault(strKWHzl, C54862xYb.KWHzl(feeAmount, str));
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.bMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8963bMd.copydefault(this.AEQbTJ, str, (Unit) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<java.lang.String>>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8963bMd.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return EZpvd(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(C8963bMd c8963bMd, java.lang.String str, Unit unit) {
        java.lang.String strSubstring = str;
        Intrinsics.checkNotNullParameter(unit, "");
        int i = 0;
        if (C59449zhJ.startsWith$default(strSubstring, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strSubstring = strSubstring.substring(2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strSubstring)) {
            java.util.List<EVMContractSignDataInBatch> multiSignData = c8963bMd.QVsKAR().getMultiSignData();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(multiSignData, 10));
            for (java.lang.Object obj : multiSignData) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(xYZ.KWHzl.EZpvd(strSubstring, C33129mqd.valueOf(c8963bMd.QKVWgx()), c8963bMd.KWHzl(i, (EVMContractSignDataInBatch) obj)));
                i++;
            }
            return new ResponseData(0, null, null, null, arrayList, null, 46, null);
        }
        return new ResponseData(-5004, null, null, null, null, null, 62, null);
    }

    public final SigData KWHzl(int i, EVMContractSignDataInBatch eVMContractSignDataInBatch) {
        java.lang.String strCopydefault;
        java.lang.String strConvertToBigIntegerString$default;
        java.lang.String strConvertToBigIntegerString$default2;
        java.lang.String to = eVMContractSignDataInBatch.getTo();
        java.lang.String value = eVMContractSignDataInBatch.getValue();
        if (value == null || (strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(value, false, (RoundingMode) null, 3, (java.lang.Object) null)) == null || (strCopydefault = C33491mxU.copydefault(strConvertToBigIntegerString$default2)) == null) {
            strCopydefault = "";
        }
        java.lang.String str = strCopydefault;
        java.lang.String data = eVMContractSignDataInBatch.getData();
        java.lang.String strCopydefault2 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strCopydefault3 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(AbstractC9346bTp.getGasLimit$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String strCopydefault4 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(V_(), java.lang.Integer.valueOf(i)), false, (RoundingMode) null, 3, (java.lang.Object) null));
        int iIwGUEr = iwGUEr();
        java.lang.String strCopydefault5 = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(C9311bTG.getGasPrice$default(DXXBbs(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        java.lang.String priorityFee$default = C9311bTG.getPriorityFee$default(DXXBbs(), 0, 1, null);
        return new SigData(to, str, data, strCopydefault2, strCopydefault3, strCopydefault4, java.lang.String.valueOf(iIwGUEr), strCopydefault5, (priorityFee$default == null || (strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(priorityFee$default, false, (RoundingMode) null, 3, (java.lang.Object) null)) == null) ? null : C33491mxU.copydefault(strConvertToBigIntegerString$default), (java.util.List) null, 512, (DefaultConstructorMarker) null);
    }

    @Override // o.C8972bMm, o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.lang.String l_() {
        java.lang.Integer bizType = OJuSTm().getBizType();
        if (bizType != null && bizType.intValue() == 8) {
            return "1";
        }
        return null;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(73819761, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.C8972bMm, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5006, null, null, null, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    private final AbstractC58185ywX<ResponseData<BatchBroadcastModel>> EZpvd(AbstractC58185ywX<ResponseData<java.util.List<java.lang.String>>> abstractC58185ywX) {
        final Function1 function1 = new Function1() { // from class: o.bMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8963bMd.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8963bMd.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(C8963bMd c8963bMd, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 || responseData.getCode() == 0) {
            C9215bRQ c9215bRQKWHzl = c8963bMd.DXXBbs().KWHzl();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54862xYb.divB$default(c9215bRQKWHzl.getFeeAmount(), java.lang.Integer.valueOf(c8963bMd.fIwbmz()), 0, null, 6, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.Iterable iterable = (java.lang.Iterable) data;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
            int i = 0;
            for (java.lang.Object obj : iterable) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                java.lang.String strAEQbTJ = xYW.AEQbTJ.AEQbTJ(str, c8963bMd.dHguZz().fetchVPNInfo());
                java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(c8963bMd.V_(), java.lang.Integer.valueOf(i)), false, (RoundingMode) null, 3, (java.lang.Object) null);
                java.lang.String gasLimit$default = AbstractC9346bTp.getGasLimit$default(c8963bMd.DXXBbs(), 0, 1, null);
                java.lang.String gasPrice$default = C9311bTG.getGasPrice$default(c8963bMd.DXXBbs(), 0, 1, null);
                java.lang.String priorityFee$default = C9311bTG.getPriorityFee$default(c8963bMd.DXXBbs(), 0, 1, null);
                int iValueOf = c8963bMd.dHguZz().valueOf();
                int iDGOPHZ = c8963bMd.DGOPHZ();
                java.lang.String strDbNXlk = c8963bMd.DbNXlk();
                java.lang.String strFlVtFt = i == 0 ? c8963bMd.flVtFt() : null;
                int iFetchVPNInfo = c8963bMd.DXXBbs().fetchVPNInfo();
                java.lang.Integer bizType = c8963bMd.OJuSTm().getBizType();
                BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8601bFm.generateBroadcastModel$default(c8963bMd, str, strAEQbTJ, null, new EVMBatchExtJson(strConvertToBigIntegerString$default2, gasLimit$default, gasPrice$default, priorityFee$default, iValueOf, iDGOPHZ, strDbNXlk, strFlVtFt, iFetchVPNInfo, (bizType != null && bizType.intValue() == 8) ? 1 : null), 4, null);
                broadcastBeanGenerateBroadcastModel$default.setInputData(c8963bMd.QVsKAR().getMultiSignData().get(i).getData());
                broadcastBeanGenerateBroadcastModel$default.setServiceCharge(strConvertToBigIntegerString$default);
                broadcastBeanGenerateBroadcastModel$default.setToAdr(c8963bMd.QVsKAR().getMultiSignData().get(i).getTo());
                broadcastBeanGenerateBroadcastModel$default.setMevSuppliers(c8963bMd.iZzfmt());
                arrayList.add(broadcastBeanGenerateBroadcastModel$default);
                i++;
            }
            return new ResponseData(-5001, null, null, null, new BatchBroadcastModel(arrayList, (java.util.List) null, java.lang.Boolean.TRUE, c9215bRQKWHzl.getCost(), (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 242, (DefaultConstructorMarker) null), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean>> */
    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<ResponseData<DappTxResultBean>> OLrzqt(@NotNull final BatchBroadcastModel batchBroadcastModel) {
        Intrinsics.checkNotNullParameter(batchBroadcastModel, "");
        if (OJuSTm().getBroadcastDelegate() != null) {
            return super.OLrzqt(batchBroadcastModel);
        }
        AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> abstractC58185ywXOLrzqt = OFhtUX().OLrzqt(Dmq(), OxVOHk(), QCjLjM(), batchBroadcastModel);
        final Function1 function1 = new Function1() { // from class: o.bMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8963bMd.OLrzqt(batchBroadcastModel, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8963bMd.AhwBna(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(BatchBroadcastModel batchBroadcastModel, ResponseData responseData) {
        java.util.Collection collectionValues;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(responseData, "");
        int code = responseData.getCode();
        java.util.List<BroadcastBean> txList = batchBroadcastModel.getTxList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(txList, 10));
        java.util.Iterator<T> it = txList.iterator();
        while (it.hasNext()) {
            arrayList.add(((BroadcastBean) it.next()).getSignedTx());
        }
        java.lang.String string2 = new JSONArray((java.util.Collection) arrayList).toString();
        java.util.HashMap map = (java.util.HashMap) responseData.getData();
        java.lang.String str = (map == null || (collectionValues = map.values()) == null || (string = new JSONArray(collectionValues).toString()) == null) ? "" : string;
        java.util.List<BroadcastBean> txList2 = batchBroadcastModel.getTxList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(txList2, 10));
        java.util.Iterator<T> it2 = txList2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((BroadcastBean) it2.next()).getTxHash());
        }
        return new ResponseData(code, responseData.getMsg(), null, null, new DappTxResultBean(string2, str, new JSONArray((java.util.Collection) arrayList2).toString(), (java.lang.String) null, java.lang.Boolean.TRUE, (java.lang.Boolean) null, (java.lang.String) null, 104, (DefaultConstructorMarker) null), null, 44, null);
    }
}
