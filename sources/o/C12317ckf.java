package o;

import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ckf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12317ckf extends C12289ckD {
    public final InterfaceC56387yDm QfsBiF = C56392yDr.copydefault(new Function0() { // from class: o.ckl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12317ckf.EZpvd(this.copydefault);
        }
    });
    public final InterfaceC56387yDm QUSxYX = C56392yDr.copydefault(new Function0() { // from class: o.ckm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C12317ckf.AEQbTJ(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C12289ckD, o.AbstractC11993ceZ
    public void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
    }

    /* JADX DEBUG: Method merged with bridge method: DNMMPQ()Lo/clT; */
    @Override // o.C12289ckD
    /* JADX INFO: renamed from: DaRZkR, reason: merged with bridge method [inline-methods] */
    public C12356clR DNMMPQ() {
        return (C12356clR) this.QfsBiF.getValue();
    }

    public static final C12356clR EZpvd(C12317ckf c12317ckf) {
        return new C12356clR(c12317ckf);
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    /* JADX DEBUG: Method merged with bridge method: dNCPSb()Lo/ceW; */
    @Override // o.AbstractC11993ceZ
    /* JADX INFO: renamed from: OTwTPd, reason: merged with bridge method [inline-methods] */
    public C12353clO DXXBbs() {
        return (C12353clO) this.QUSxYX.getValue();
    }

    public static final C12353clO AEQbTJ(C12317ckf c12317ckf) {
        return new C12353clO(c12317ckf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair DaRZkR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDxcTrN = super.dxcTrN();
        final Function1 function1 = new Function1() { // from class: o.ckj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12317ckf.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDxcTrN.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12317ckf.DaRZkR(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair OLrzqt(C12317ckf c12317ckf, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12317ckf.OLrzqt(c12317ckf.DarRvM().KWHzl(java.lang.Long.valueOf(c12317ckf.DGOPHZ()), c12317ckf.htlTjW()));
        return pair;
    }

    @Override // o.C12289ckD, o.AbstractC12387clw
    public java.lang.String DGgnkA() {
        UTXOSignInfo uTXOSignInfoUeEOUB = UeEOUB();
        return C54862xYb.convertToBigIntegerString$default(uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null, true, (RoundingMode) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair DGgnkA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC11993ceZ, o.AbstractC8664bGw, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = super.RJOkX();
        final Function1 function1 = new Function1() { // from class: o.ckd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12317ckf.EZpvd(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXRJOkX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12317ckf.DGgnkA(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair EZpvd(C12317ckf c12317ckf, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12317ckf.OLrzqt(c12317ckf.DarRvM().KWHzl(java.lang.Long.valueOf(c12317ckf.DGOPHZ()), c12317ckf.htlTjW()));
        return pair;
    }

    @Override // o.C12289ckD, o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C12289ckD, o.AbstractC11993ceZ
    public java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue) {
        java.lang.String minOutput;
        UTXOSignInfo uTXOSignInfoUeEOUB;
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        java.lang.String strHtlTjW = htlTjW();
        if (refreshUTXOVenue.getUpdateCanTransferAmount() || (uTXOSignInfoUeEOUB = UeEOUB()) == null || (minOutput = uTXOSignInfoUeEOUB.getMinOutput()) == null) {
            minOutput = "0";
        }
        return C56402yEa.EZpvd(new UTXOAddressInfoReq(strHtlTjW, C54862xYb.convertToBigIntegerString$default(minOutput, true, (RoundingMode) null, 2, (java.lang.Object) null), refreshUTXOVenue.getUpdateCanTransferAmount() ? "0" : ((C11990ceW) QKudOq()).AEQbTJ(), (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 63472, (DefaultConstructorMarker) null));
    }
}
