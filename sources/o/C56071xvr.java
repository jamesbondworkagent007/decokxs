package o;

import androidx.camera.video.AudioStats;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56071xvr {
    public static final C56071xvr gEmmrt = new C56071xvr();
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.xvq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C56071xvr.djBIcL();
        }
    });
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xvw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C56071xvr.valueOf());
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xvv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C56071xvr.KWHzl());
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xvu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C56071xvr.AYXKKw());
        }
    });
    public static final java.lang.String KWHzl = "filterType";
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return KWHzl;
    }

    private C56071xvr() {
    }

    public static final xND djBIcL() {
        return (xND) C43251rlk.copydefault(xND.class);
    }

    public final xND fARcdN() {
        return (xND) AhwBna.getValue();
    }

    public static final int valueOf() {
        return C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final int AkhnZx() {
        return ((java.lang.Number) EZpvd.getValue()).intValue();
    }

    public static final int KWHzl() {
        return C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final int gEmmrt() {
        return ((java.lang.Number) OLrzqt.getValue()).intValue();
    }

    public static final int AYXKKw() {
        return C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final int AhwBna() {
        return ((java.lang.Number) copydefault.getValue()).intValue();
    }

    public final boolean ejfBZ() {
        java.lang.Boolean boolCopydefault = fARcdN().copydefault();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return Intrinsics.EZpvd(boolCopydefault, bool) && Intrinsics.EZpvd(fARcdN().gEmmrt(), bool);
    }

    public final boolean hDKMBd() {
        return fARcdN().EZpvd();
    }

    public static /* synthetic */ boolean isSupportAiBot$default(C56071xvr c56071xvr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c56071xvr.AEQbTJ(str);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return ejfBZ() ? fARcdN().KWHzl() : !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "nmp");
    }

    public static /* synthetic */ boolean isHideCopySource$default(C56071xvr c56071xvr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c56071xvr.EZpvd(str);
    }

    public final boolean EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd(fARcdN().copydefault(), java.lang.Boolean.TRUE) && !C33129mqd.OLrzqt((java.lang.CharSequence) str);
    }

    public final boolean uzCIH() {
        return ejfBZ();
    }

    public final boolean copydefault(java.lang.String str) {
        return !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "nmp");
    }

    public static /* synthetic */ java.lang.String getBotMainPath$default(C56071xvr c56071xvr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c56071xvr.EZpvd(z);
    }

    public final java.lang.String EZpvd(boolean z) {
        java.lang.String mode;
        if (z) {
            mode = "exchange";
        } else {
            mode = (ejfBZ() ? DeeplinkMode.LITE : DeeplinkMode.PRO).getMode();
        }
        return mode + "/trade_bot/order/page";
    }

    public static /* synthetic */ java.lang.String getBotMpPagePath$default(C56071xvr c56071xvr, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return c56071xvr.copydefault(str, str2, z);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String mode;
        if (z) {
            mode = "exchange";
        } else {
            mode = (ejfBZ() ? DeeplinkMode.LITE : DeeplinkMode.PRO).getMode();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) || C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            return mode + "/trade_bot/main/page?tab=" + str + ContainerUtils.FIELD_DELIMITER + KWHzl + ContainerUtils.KEY_VALUE_DELIMITER + str2;
        }
        return mode + "/trade_bot/main/page";
    }

    public static /* synthetic */ java.lang.String getBotCopyPagePath$default(C56071xvr c56071xvr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c56071xvr.KWHzl(z);
    }

    public final java.lang.String KWHzl(boolean z) {
        java.lang.String mode;
        if (z) {
            mode = "exchange";
        } else {
            mode = (ejfBZ() ? DeeplinkMode.LITE : DeeplinkMode.PRO).getMode();
        }
        return mode + "/trade_bot/copy/page";
    }

    public static /* synthetic */ java.lang.String getBotToNMPDetailPath$default(C56071xvr c56071xvr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c56071xvr.KWHzl(str, str2);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || str2.length() == 0) {
            return "miniapp?appid=okluatradingeco&pageurl=/bot_details&underlyingAssetId=" + str + "&page=nmp";
        }
        return "miniapp?appid=okluatradingeco&pageurl=/bot_details&underlyingAssetId=" + str + "&page=nmp&channel=" + str2;
    }

    public final int fIwbmz() {
        return AhwBna();
    }

    public final int DbNXlk() {
        return fIwbmz();
    }

    public final int isConnected() {
        return gEmmrt();
    }

    public final int fJNWhG() {
        return AkhnZx();
    }

    public final int AuCTel() {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return C55366xib.KWHzl(C52761wXj.ActionBar.iPSTqm, contextAEQbTJ);
    }

    public final int values() {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return C55366xib.KWHzl(C52761wXj.ActionBar.dvImUD, contextAEQbTJ);
    }

    public static /* synthetic */ int getRiseUpColor$default(C56071xvr c56071xvr, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c56071xvr.EZpvd(f);
    }

    public final int EZpvd(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return Intrinsics.EZpvd(fARcdN().OLrzqt(), java.lang.Boolean.TRUE) ? C33512mxp.AEQbTJ.EZpvd(contextAEQbTJ, f) : C33512mxp.AEQbTJ.valueOf(contextAEQbTJ, f);
    }

    public static /* synthetic */ int getFallDownColor$default(C56071xvr c56071xvr, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return c56071xvr.KWHzl(f);
    }

    public final int KWHzl(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
        }
        return Intrinsics.EZpvd(fARcdN().OLrzqt(), java.lang.Boolean.TRUE) ? C33512mxp.AEQbTJ.copydefault(contextAEQbTJ, f) : C33512mxp.AEQbTJ.djBIcL(contextAEQbTJ, f);
    }

    public final boolean getFieldNames() {
        return Intrinsics.EZpvd(fARcdN().copydefault(), java.lang.Boolean.TRUE);
    }

    public final boolean getNewProxyInstance() {
        return Intrinsics.EZpvd(fARcdN().OLrzqt(), java.lang.Boolean.TRUE);
    }
}
