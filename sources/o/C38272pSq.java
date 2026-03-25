package o;

import com.okinc.liveness.kycsdk.bean.KycSdkException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C38272pSq {
    public static final C38272pSq KWHzl = new C38272pSq();

    private C38272pSq() {
    }

    public final void AEQbTJ(@NotNull KycSdkException kycSdkException) {
        Intrinsics.checkNotNullParameter(kycSdkException, "");
        C6777aVl.Companion.OLrzqt(kycSdkException, C56424yEw.gEmmrt(C56390yDp.OLrzqt("localizedMessage", kycSdkException.getTopMessage()), C56390yDp.OLrzqt("lineNumber", kycSdkException.getLineNumber())), java.lang.Boolean.TRUE);
    }
}
