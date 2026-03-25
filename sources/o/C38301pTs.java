package o;

import androidx.core.os.ConfigurationCompat;
import com.okinc.okapm.okqpl.util.QPLConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38301pTs {
    public static final C38301pTs OLrzqt = new C38301pTs();
    public static final java.lang.String[] KWHzl = {"gt4_", "leak_", "config_", "rc_", "agc_", "google_", "common_google_play_", "gcm_", "project_id", "0", "app_name", "bottomsheet_action", "item_view_role_description", "abc_capital_off", "error_icon_", "exo_controls_", "str_touch_move", "mln_current_sdk_version", "mln_current_script_version", "close_log"};
    public static final int EZpvd = 8;

    private C38301pTs() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.io.File file = new java.io.File(str);
        return file.exists() ? yFI.readText$default(file, null, 1, null) : "";
    }

    public static /* synthetic */ boolean isKeyUseForAndroidOrInvalid$OKLocalization_localization$default(C38301pTs c38301pTs, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c38301pTs.KWHzl(str, str2);
    }

    public final boolean KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "android")) {
            return true;
        }
        return !AEQbTJ(str);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (java.lang.String str2 : KWHzl) {
            if (C59449zhJ.startsWith$default(str, str2, false, 2, null) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) QPLConstants.ENV_DEBUG, false, 2, (java.lang.Object) null)) {
                return false;
            }
        }
        return true;
    }

    public final java.util.Locale copydefault() {
        java.util.Locale locale = ConfigurationCompat.getLocales(android.content.res.Resources.getSystem().getConfiguration()).get(0);
        if (locale != null) {
            return locale;
        }
        java.util.Locale locale2 = android.content.res.Resources.getSystem().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        return locale2;
    }
}
