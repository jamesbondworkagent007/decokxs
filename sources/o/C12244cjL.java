package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.BTCSpeedUpSignData;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.TxInsBean;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateReq;
import com.okinc.business.defi.biz.net.bean.BTCSpeedUpFeeRateResp;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12797ctk;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cjL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12244cjL extends AbstractC11993ceZ<BTCSpeedUpSignData> {
    public UtxoInfo QUSxYX;
    public int QVAiDq;
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.cjZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12244cjL.OLrzqt(this.OLrzqt);
        }
    });
    public BTCSpeedUpFeeRateResp RcXXUw;
    public int UeEOUB;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean E_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        if (this.QVAiDq == 0) {
            this.QVAiDq = i;
        }
    }

    public final C12257cjY QDqgQU() {
        return (C12257cjY) this.QfsBiF.getValue();
    }

    public static final C12257cjY OLrzqt(C12244cjL c12244cjL) {
        return new C12257cjY(c12244cjL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() throws java.lang.Exception {
        java.util.ArrayList arrayList;
        java.lang.String address;
        java.util.List<ChainAddress> listDbNXlk = dUDNAs().DbNXlk(dHguZz().fetchVPNInfo());
        UtxoInfo utxoInfo = null;
        java.lang.Object obj = null;
        if (listDbNXlk != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
            java.util.Iterator<T> it = listDbNXlk.iterator();
            while (it.hasNext()) {
                arrayList.add(((ChainAddress) it.next()).getAddress());
            }
        } else {
            arrayList = null;
        }
        java.util.List<UtxoInfo> cpfpSpeedUpUTXO = ((BTCSpeedUpSignData) QVsKAR()).getCpfpSpeedUpUTXO();
        if (cpfpSpeedUpUTXO != null) {
            java.util.Iterator<T> it2 = cpfpSpeedUpUTXO.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                UtxoInfo utxoInfo2 = (UtxoInfo) next;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) utxoInfo2.getAddress()) && arrayList != null && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList), utxoInfo2.getAddress())) {
                    obj = next;
                    break;
                }
            }
            utxoInfo = (UtxoInfo) obj;
        }
        this.QUSxYX = utxoInfo;
        if (utxoInfo == null || (address = utxoInfo.getAddress()) == null) {
            throw new java.lang.Exception(C33070mpX.AYXKKw(C13754dXa.FragmentManager.UscePu));
        }
        return address;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public java.lang.String zLjUOn() {
        return htlTjW();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOTwTPd = OTwTPd();
        final Function1 function1 = new Function1() { // from class: o.cjT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12244cjL.valueOf(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOTwTPd.KWHzl(new InterfaceC58229yxO() { // from class: o.cjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12244cjL.aUsmxb(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd valueOf(C12244cjL c12244cjL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return super.r_();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: SignData */
    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OTwTPd() {
        AbstractC58185ywX<ResponseData<BTCSpeedUpFeeRateResp>> abstractC58185ywXAEQbTJ = OFhtUX().AEQbTJ(OxVOHk(), Dmq(), new BTCSpeedUpFeeRateReq(dmfpNf(), htlTjW(), ((BTCSpeedUpSignData) QVsKAR()).getSpeedUpSignData().getTxHash()));
        final Function1 function1 = new Function1() { // from class: o.cjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12244cjL.copydefault(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12244cjL.UlJrfe(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C12244cjL c12244cjL, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c12244cjL.RcXXUw = (BTCSpeedUpFeeRateResp) responseData.getData();
        c12244cjL.QVAiDq = responseData.getCode();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String errorMsg$default = getErrorMsg$default(c12244cjL, 0, 1, null);
        return C56390yDp.OLrzqt(bool, errorMsg$default != null ? errorMsg$default : "");
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.Integer dvKsVJ() {
        return dHguZz().QbewEr();
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return yDY.AhwBna();
    }

    @Override // o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        UtxoInfo utxoInfo = this.QUSxYX;
        Intrinsics.copydefault(utxoInfo);
        java.lang.String address = utxoInfo.getAddress();
        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strDaRZkR = DaRZkR();
        int iAhwBna = C33129mqd.AhwBna(DNMMPQ());
        UtxoInfo utxoInfo2 = this.QUSxYX;
        Intrinsics.copydefault(utxoInfo2);
        java.lang.String txHash = utxoInfo2.getTxHash();
        UtxoInfo utxoInfo3 = this.QUSxYX;
        Intrinsics.copydefault(utxoInfo3);
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(address, strConvertToBigIntegerString$default, strDaRZkR, (java.lang.Integer) 15, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, java.lang.Integer.valueOf(iAhwBna), (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, C56402yEa.EZpvd(txHash + "-" + utxoInfo3.getVout()), 30704, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<java.lang.Boolean> iZzfmt() {
        java.util.List<UTXOInfoResp> listDjSkpj = djSkpj();
        if (listDjSkpj == null || listDjSkpj.isEmpty()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.ckc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C12244cjL.EZpvd(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean EZpvd(C12244cjL c12244cjL) {
        TxInsBean txInsBeanKWHzl = c12244cjL.QDqgQU().KWHzl(c12244cjL.djSkpj());
        C12257cjY c12257cjYQDqgQU = c12244cjL.QDqgQU();
        UTXOSignInfo uTXOSignInfoUeEOUB = c12244cjL.UeEOUB();
        c12244cjL.UeEOUB = c12257cjYQDqgQU.KWHzl(txInsBeanKWHzl, uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, txInsBeanKWHzl != null ? txInsBeanKWHzl.getBalance() : null);
        java.lang.String balance = txInsBeanKWHzl != null ? txInsBeanKWHzl.getBalance() : null;
        C43296rmc.KWHzl("btcSpeedUp", "balance=" + balance + ",signLength=" + c12244cjL.UeEOUB + ",amount=" + AbstractC8704bHj.getTransferAmount$default(c12244cjL, false, false, 3, null) + ",feeRate=" + c12244cjL.DNMMPQ());
        return java.lang.Boolean.valueOf(c12244cjL.RVsVBY());
    }

    public final boolean RVsVBY() {
        java.lang.String strOLrzqt = aKErDB().OLrzqt(djSkpj());
        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
        return C33129mqd.gEmmrt(strOLrzqt, C54862xYb.KWHzl(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, DaRZkR()));
    }

    @Override // o.AbstractC11993ceZ
    public java.lang.String fZBcTu() {
        return java.lang.String.valueOf(this.UeEOUB);
    }

    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.String errorMsg$default = getErrorMsg$default(this, 0, 1, null);
        if (errorMsg$default == null) {
            errorMsg$default = "";
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), errorMsg$default));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOTwTPd = OTwTPd();
        final Function1 function1 = new Function1() { // from class: o.cjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12244cjL.djBIcL(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXOTwTPd.KWHzl(new InterfaceC58229yxO() { // from class: o.cjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12244cjL.QwvEab(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12244cjL.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.ckb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12244cjL.USBtdM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd djBIcL(C12244cjL c12244cjL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return c12244cjL.copydefault(new RefreshUTXOVenue(false, false, false, true, false, false, false, false, 0, 503, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit USBtdM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit OLrzqt(C12244cjL c12244cjL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12244cjL.DXXBbs().KWHzl(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd fERRXa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOTwTPd = OTwTPd();
        final Function1 function1 = new Function1() { // from class: o.cjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12244cjL.AhwBna(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOTwTPd.KWHzl(new InterfaceC58229yxO() { // from class: o.cjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12244cjL.fERRXa(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AhwBna(C12244cjL c12244cjL, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return c12244cjL.copydefault(new RefreshUTXOVenue(false, false, false, true, false, false, false, false, 0, 503, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC8664bGw
    public kotlin.Pair<java.lang.Boolean, java.lang.String> ao_() {
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw
    public boolean F_() {
        int i;
        return (RVsVBY() || giSNqX() || gasjUx() || (i = this.QVAiDq) == 10001 || i == 400002) ? false : true;
    }

    public static final ResponseData dUDNAs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // o.AbstractC11993ceZ
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(final java.lang.String str, final java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = KWHzl(submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.cjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12244cjL.OLrzqt(this.OLrzqt, str, str2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12244cjL.dUDNAs(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData OLrzqt(C12244cjL c12244cjL, java.lang.String str, java.lang.String str2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            C12257cjY c12257cjYQDqgQU = c12244cjL.QDqgQU();
            TxInsBean txInsBeanKWHzl = c12244cjL.QDqgQU().KWHzl((java.util.List) responseData.getData());
            java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(c12244cjL, false, false, 3, null);
            UTXOSignInfo uTXOSignInfoUeEOUB = c12244cjL.UeEOUB();
            java.lang.String strOLrzqt = c12257cjYQDqgQU.OLrzqt(str, str2, txInsBeanKWHzl, transferAmount$default, uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null);
            if (strOLrzqt.length() == 0) {
                return new ResponseData(-5005, null, null, null, null, null, 62, null);
            }
            return new ResponseData(-5001, null, null, null, c12244cjL.EZpvd(strOLrzqt), null, 46, null);
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
    }

    public final BatchBroadcastModel EZpvd(java.lang.String str) {
        BroadcastBean broadcastBeanGenerateBroadcastModel$default = AbstractC8664bGw.generateBroadcastModel$default(this, str, xYW.AEQbTJ.OLrzqt(str, dHguZz().QKVWgx()), null, new UTXOExtJson(1, htlTjW(), null, null, null, null, null, null, null, null, 0, dvKsVJ(), null, 5116, null), 4, null);
        broadcastBeanGenerateBroadcastModel$default.setServiceCharge(DaRZkR());
        broadcastBeanGenerateBroadcastModel$default.setFeeRate(DNMMPQ());
        return new BatchBroadcastModel(C56402yEa.EZpvd(broadcastBeanGenerateBroadcastModel$default), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8704bHj
    public java.lang.String AEQbTJ(boolean z, boolean z2) {
        int iAhwBna = C33129mqd.AhwBna(C54862xYb.convertToBigIntegerString$default(C54862xYb.AEQbTJ(aKErDB().OLrzqt(djSkpj()), DaRZkR()), false, (RoundingMode) null, 3, (java.lang.Object) null));
        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
        return C33129mqd.gEmmrt(java.lang.Integer.valueOf(java.lang.Math.max(iAhwBna, C33129mqd.AhwBna(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null))));
    }

    public final java.lang.String DaRZkR() {
        BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(DNMMPQ(), java.lang.Integer.valueOf(this.UeEOUB));
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.RcXXUw;
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(bigDecimalOLrzqt, bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getIncreaseFee() : null), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    public final java.lang.String QXDzTk() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.RcXXUw;
        java.lang.String currentAvgFeeRate = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getCurrentAvgFeeRate() : null;
        return currentAvgFeeRate == null ? "" : currentAvgFeeRate;
    }

    public final java.lang.String DNMMPQ() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.RcXXUw;
        java.lang.String expectedFeeRate = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getExpectedFeeRate() : null;
        return expectedFeeRate == null ? "" : expectedFeeRate;
    }

    public final java.lang.String DGgnkA() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.RcXXUw;
        java.lang.String ancestorsTxSize = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getAncestorsTxSize() : null;
        return ancestorsTxSize == null ? "" : ancestorsTxSize;
    }

    public final java.lang.String RKcVTr() {
        BTCSpeedUpFeeRateResp bTCSpeedUpFeeRateResp = this.RcXXUw;
        java.lang.String currentTxSize = bTCSpeedUpFeeRateResp != null ? bTCSpeedUpFeeRateResp.getCurrentTxSize() : null;
        return currentTxSize == null ? "" : currentTxSize;
    }

    public final boolean QIZEnU() {
        return giSNqX() || gasjUx();
    }

    public static /* synthetic */ java.lang.String getErrorMsg$default(C12244cjL c12244cjL, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c12244cjL.QVAiDq;
        }
        return c12244cjL.OLrzqt(i);
    }

    public final java.lang.String OLrzqt(int i) {
        if (i == 0) {
            return null;
        }
        if (i != 10001) {
            if (i == 10004 || i == 100041) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.QIZEnU);
            }
            if (i != 400002) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.UscePu);
            }
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.DBxZfM);
    }

    @Override // o.AbstractC11993ceZ
    public C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new C12797ctk.Application(responseData, htlTjW(), responseData.getData(), DGOPHZ(), -1, dHguZz().DbNXlk(), null, false, fragmentActivity, 192, null);
    }
}
