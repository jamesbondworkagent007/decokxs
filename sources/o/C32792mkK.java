package o;

import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;
import o.C32791mkJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32792mkK {
    public static final C32792mkK KWHzl = new C32792mkK();

    private C32792mkK() {
    }

    public final boolean AEQbTJ(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        C32791mkJ.Application application = C32791mkJ.Companion;
        Intrinsics.copydefault(byteBufferWrap);
        application.EZpvd(byteBufferWrap);
        java.util.Iterator<java.lang.String> it = C32793mkL.Companion.KWHzl(byteBufferWrap).OLrzqt().iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) it.next(), (java.lang.Object) "android.permission.WAKE_LOCK")) {
                return true;
            }
        }
        return false;
    }
}
