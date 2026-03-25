package o;

import com.okinc.im.camera.OKIMCaptureMode;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class oFV {
    @yCM
    public oFV() {
    }

    public final java.util.List<AbstractC35291nsZ> OLrzqt(final int i, int i2) {
        return yDY.gEmmrt(new C36413oaW(new Function2() { // from class: o.oFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return oFV.OLrzqt(i, (android.content.Context) obj, (OKIMCaptureMode) obj2);
            }
        }), new C36478obi(i2, true, i, 0, 0, 0, 56, null));
    }

    public static final android.content.Intent OLrzqt(int i, android.content.Context context, OKIMCaptureMode oKIMCaptureMode) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKIMCaptureMode, "");
        return ActivityC35517nwp.Companion.EZpvd(context, oKIMCaptureMode, i);
    }
}
