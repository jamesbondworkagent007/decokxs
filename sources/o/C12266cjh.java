package o;

import com.okinc.business.defi.api.model.tx.signdata.BRC20MintItemInfo;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.BrcJsonRes;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cjh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C12266cjh extends C12195ciP {
    public java.lang.String RcXXUw = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C12195ciP
    public java.lang.String DGgnkA() {
        return ExtJson.BRC20TYPE_INSCRIBE_TRANSFER;
    }

    @Override // o.C12195ciP
    public int DaRZkR() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.RcXXUw = str;
    }

    @Override // o.AbstractC12239cjG
    public int RKcVTr() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8664bGw
    public java.lang.String at_() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AhwBna(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // o.C12195ciP, o.AbstractC11993ceZ, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXUfzxmz = Ufzxmz();
        final Function2 function2 = new Function2() { // from class: o.cjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12266cjh.gEmmrt((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXUfzxmz, new InterfaceC58223yxI() { // from class: o.cjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12266cjh.AhwBna(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair gEmmrt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> UhxbNG() {
        return super.r_();
    }

    public static final kotlin.Pair zblBkD(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC12239cjG, o.AbstractC8664bGw, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDxcTrN = super.dxcTrN();
        final Function1 function1 = new Function1() { // from class: o.cjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12266cjh.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12266cjh.zblBkD(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair OLrzqt(C12266cjh c12266cjh, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12266cjh.OLrzqt(c12266cjh.DarRvM().KWHzl(java.lang.Long.valueOf(c12266cjh.DGOPHZ()), c12266cjh.htlTjW()));
        return pair;
    }

    public static final kotlin.Pair DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = super.RJOkX();
        final Function1 function1 = new Function1() { // from class: o.cjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12266cjh.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRJOkX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12266cjh.DCUTEIdCUTEI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair EZpvd(C12266cjh c12266cjh, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12266cjh.OLrzqt(c12266cjh.DarRvM().KWHzl(java.lang.Long.valueOf(c12266cjh.DGOPHZ()), c12266cjh.htlTjW()));
        return pair;
    }

    @Override // o.AbstractC12239cjG, o.AbstractC8664bGw
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> wlaJM() {
        return Ufzxmz();
    }

    @Override // o.AbstractC12239cjG
    public java.lang.String TarCU() {
        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
        java.lang.String inscriptionOutput = uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getInscriptionOutput() : null;
        return (inscriptionOutput == null || inscriptionOutput.length() == 0) ? "546" : inscriptionOutput;
    }

    @Override // o.AbstractC12239cjG
    public java.util.List<BRC20MintItemInfo> QIZEnU() {
        return C56402yEa.EZpvd(new BRC20MintItemInfo("text/plain;charset=utf-8", this.RcXXUw, htlTjW(), false));
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> Ufzxmz() {
        AbstractC58185ywX<ResponseData<BrcJsonRes>> abstractC58185ywXCopydefault = OFhtUX().copydefault(fHqPtx().fJNWhG(), AbstractC8664bGw.getTransferCoinAmount$default(this, false, false, 3, null), ExtJson.BRC20TYPE_TRANSFER);
        final Function1 function1 = new Function1() { // from class: o.cjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12266cjh.copydefault(this.EZpvd, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12266cjh.spnCvw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair spnCvw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C12266cjh c12266cjh, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            BrcJsonRes brcJsonRes = (BrcJsonRes) responseData.getData();
            java.lang.String brcJson = brcJsonRes != null ? brcJsonRes.getBrcJson() : null;
            if (brcJson == null) {
                brcJson = "";
            }
            c12266cjh.RcXXUw = brcJson;
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
