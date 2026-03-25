package o;

import com.engagelab.privates.common.constants.MTCommonConstants;
import com.okinc.base.utils.OkUtils;

/* JADX INFO: renamed from: o.aWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6832aWn {
    public static final java.lang.String KWHzl = "AppServiceUtils";

    public static <T> T EZpvd(java.lang.String str) {
        return (T) KWHzl(OkUtils.AEQbTJ(), str);
    }

    public static <T> T KWHzl(android.content.Context context, java.lang.String str) {
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) context.getSystemService(str);
        } catch (java.lang.Exception e) {
            OkUtils.KWHzl().EZpvd(KWHzl, "getSystemService:" + e.getMessage());
            return null;
        }
    }

    public static android.app.ActivityManager AEQbTJ() {
        return (android.app.ActivityManager) EZpvd(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
    }
}
