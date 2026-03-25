package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fYf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17948fYf {
    public static java.lang.Boolean AEQbTJ;
    public static int AhwBna;
    public static final C17948fYf copydefault = new C17948fYf();
    public static boolean KWHzl = true;
    public static boolean valueOf = true;
    public static boolean djBIcL = true;
    public static boolean OLrzqt = true;
    public static final int EZpvd = 8;

    private C17948fYf() {
    }

    public final void KWHzl(int i) {
        AhwBna = i;
        SPUtils.put("key_sol_tx_mode_type", java.lang.Integer.valueOf(i), "key_file_sol_tx_mode");
    }

    public final int copydefault() {
        java.lang.Integer num = SPUtils.getInt("key_sol_tx_mode_type", 0, "key_file_sol_tx_mode");
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void AEQbTJ(boolean z) {
        KWHzl = z;
        SPUtils.put("show_sol_express_tx_mode_optimize_guide", java.lang.Boolean.valueOf(z), "key_file_sol_tx_mode");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("show_sol_express_tx_mode_optimize_guide", true, "key_file_sol_tx_mode");
    }

    public final void OLrzqt(boolean z) {
        OLrzqt = z;
        SPUtils.put("replace_xlayer_address_prefix", java.lang.Boolean.valueOf(z));
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("replace_xlayer_address_prefix", true);
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return false;
        }
        try {
            java.lang.String string = SPUtils.getString("address_expanded_coin_ids", "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) (string == null ? "" : string), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listSplit$default) {
                if (((java.lang.String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList.contains(str);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        try {
            java.lang.String string = SPUtils.getString("address_expanded_coin_ids", "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) (string == null ? "" : string), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listSplit$default) {
                if (((java.lang.String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            java.util.Set setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(arrayList);
            if (z) {
                setDXXBbs.add(str);
            } else {
                setDXXBbs.remove(str);
            }
            SPUtils.put("address_expanded_coin_ids", CollectionsKt___CollectionsKt.joinToString$default(setDXXBbs, ",", null, null, 0, null, null, 62, null));
        } catch (java.lang.Exception unused) {
        }
    }

    public final boolean KWHzl() {
        if (AEQbTJ == null) {
            AEQbTJ = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_wallet_xlayer_prefix", AmplitudeName.WEB3), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON));
        }
        return Intrinsics.EZpvd(AEQbTJ, java.lang.Boolean.TRUE);
    }
}
