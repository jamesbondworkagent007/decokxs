package o;

import com.okinc.okimcore.model.im.OKContractAddressMessage;
import java.net.URLEncoder;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSQ {
    public static final sSQ KWHzl = new sSQ();

    private sSQ() {
    }

    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objEZpvd = C6832aWn.EZpvd("clipboard");
        android.content.ClipboardManager clipboardManager = objEZpvd instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) objEZpvd : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        }
    }

    public static /* synthetic */ java.lang.String formatAddress$default(sSQ ssq, java.lang.String str, int i, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            str2 = "...";
        }
        return ssq.OLrzqt(str, i, i2, str2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() <= i + i2 + 1) {
            return str;
        }
        return C59454zhO.AkhnZx(str, i + 2) + str2 + C59454zhO.isConnected(str, i2);
    }

    public final java.util.List<java.lang.String> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? yDY.AhwBna() : C59467zhb.zuBGHE(C59467zhb.AYXKKw(C59467zhb.AuCTelauCTel(C59467zhb.DbNXlk(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(new Regex("[\\W_]+").split(str, 0)), new Function1() { // from class: o.sSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(sSQ.KWHzl((java.lang.String) obj));
            }
        }), new Function1() { // from class: o.sSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sSQ.OLrzqt((java.lang.String) obj);
            }
        }), new Function1() { // from class: o.sSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(sSQ.AYXKKw((java.lang.String) obj));
            }
        })), 50));
    }

    public static final boolean KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() >= 30;
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
    }

    public static final boolean AYXKKw(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() > 0;
    }

    public static /* synthetic */ java.lang.String getDeeplinkForCA$default(sSQ ssq, boolean z, OKContractAddressMessage oKContractAddressMessage, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return ssq.EZpvd(z, oKContractAddressMessage, z2);
    }

    public final java.lang.String EZpvd(boolean z, @NotNull OKContractAddressMessage oKContractAddressMessage, boolean z2) {
        Intrinsics.checkNotNullParameter(oKContractAddressMessage, "");
        java.lang.String str = z ? "okx://pro/cedefi_kline" : "okx://lite/cedefi_kline";
        if (z2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("?chainId=");
            java.lang.String chainId = oKContractAddressMessage.getChainId();
            if (chainId == null) {
                chainId = "";
            }
            sb.append(URLEncoder.encode(chainId, com.google.android.exoplayer2.C.UTF8_NAME));
            sb.append("&tokenaddr=");
            java.lang.String contractAddress = oKContractAddressMessage.getContractAddress();
            sb.append(URLEncoder.encode(contractAddress != null ? contractAddress : "", com.google.android.exoplayer2.C.UTF8_NAME));
            sb.append("&isShowPriceAlert=1");
            sb.append("&source=share");
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append("?chainId=");
        java.lang.String chainId2 = oKContractAddressMessage.getChainId();
        if (chainId2 == null) {
            chainId2 = "";
        }
        sb2.append(URLEncoder.encode(chainId2, com.google.android.exoplayer2.C.UTF8_NAME));
        sb2.append("&tokenaddr=");
        java.lang.String contractAddress2 = oKContractAddressMessage.getContractAddress();
        sb2.append(URLEncoder.encode(contractAddress2 != null ? contractAddress2 : "", com.google.android.exoplayer2.C.UTF8_NAME));
        sb2.append("&source=share");
        return sb2.toString();
    }
}
