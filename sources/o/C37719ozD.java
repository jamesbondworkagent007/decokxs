package o;

import android.media.AudioManager;
import android.telecom.TelecomManager;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ozD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37719ozD {
    public static final C37719ozD KWHzl = new C37719ozD();

    private C37719ozD() {
    }

    public final boolean EZpvd(android.content.Context context) {
        boolean zIsInCall;
        boolean z;
        AudioManager audioManager;
        if (context == null) {
            return false;
        }
        try {
            java.lang.Object systemService = context.getSystemService("telecom");
            Intrinsics.copydefault(systemService, "");
            zIsInCall = ((TelecomManager) systemService).isInCall();
        } catch (java.lang.Exception unused) {
            zIsInCall = false;
        }
        try {
            java.lang.Object systemService2 = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            Intrinsics.copydefault(systemService2, "");
            audioManager = (AudioManager) systemService2;
        } catch (java.lang.Exception unused2) {
        }
        if (audioManager.getMode() != 2) {
            if (audioManager.getMode() != 3) {
                z = false;
            }
            return !zIsInCall || z;
        }
        z = true;
        if (zIsInCall) {
        }
    }

    public final boolean copydefault(android.content.Context context) {
        java.lang.Object objInvoke;
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("io.rong.callkit.RongCallKit").getMethod("isInVoipCall", android.content.Context.class);
            Intrinsics.checkNotNullExpressionValue(method, "");
            objInvoke = method.invoke(null, context);
            Intrinsics.copydefault(objInvoke, "");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("MediaTools", "isMediaOperationPermit", e);
        }
        return !((java.lang.Boolean) objInvoke).booleanValue();
    }
}
