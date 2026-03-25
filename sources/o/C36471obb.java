package o;

import com.okinc.im.camera.OKIMCaptureMode;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.obb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36471obb {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Function2<android.content.Context, OKIMCaptureMode, android.content.Intent> KWHzl() {
        return new Function2() { // from class: o.obd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C36471obb.AEQbTJ((android.content.Context) obj, (OKIMCaptureMode) obj2);
            }
        };
    }

    public static final android.content.Intent AEQbTJ(android.content.Context context, OKIMCaptureMode oKIMCaptureMode) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKIMCaptureMode, "");
        return ActivityC35526nwy.Companion.KWHzl(context, oKIMCaptureMode);
    }
}
