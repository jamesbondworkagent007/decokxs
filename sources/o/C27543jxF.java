package o;

import androidx.appcompat.app.AppCompatDelegate;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27543jxF {
    public static final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r0.equals("nightYes") == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean KWHzl(@NotNull android.content.Context context) {
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(context, "");
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        if (defaultNightMode == -1) {
            return OLrzqt(context);
        }
        if (defaultNightMode == 1) {
            return false;
        }
        if (defaultNightMode != 2) {
            try {
                string = SPUtils.getString("nightModeV2Sp", "");
            } catch (java.lang.ClassCastException unused) {
            }
            if (string != null) {
                int iHashCode = string.hashCode();
                if (iHashCode != -859015132) {
                    if (iHashCode != 182607791) {
                        if (iHashCode == 1945552889 && string.equals("nightNo")) {
                            return false;
                        }
                    }
                } else if (string.equals("nightFollowSys")) {
                    return OLrzqt(context);
                }
            }
            try {
                return SPUtils.getBoolean("nightModeSp", false);
            } catch (java.lang.ClassCastException unused2) {
                return false;
            }
        }
        return true;
    }
}
