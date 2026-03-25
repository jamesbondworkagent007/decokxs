package o;

import com.okinc.liveness.kycsdk.bean.KycSdkException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38275pSt {
    public static final C38275pSt AEQbTJ = new C38275pSt();

    private C38275pSt() {
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            C6800aWH.EZpvd(C33478mxH.KWHzl.EZpvd(context), new java.io.FileFilter() { // from class: o.pSu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.io.FileFilter
                public final boolean accept(java.io.File file) {
                    return C38275pSt.KWHzl(file);
                }
            });
        } catch (java.lang.Exception e) {
            C38272pSq.KWHzl.AEQbTJ(new KycSdkException("PictureUtil", e));
        }
    }

    public static final boolean KWHzl(java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return C59449zhJ.endsWith$default(name, "_okx_kyc.jpeg", false, 2, null);
    }
}
