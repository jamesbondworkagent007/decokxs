package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pJz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38039pJz extends WeakReference<java.lang.Object> {
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38039pJz(@NotNull java.lang.Object obj, @NotNull ReferenceQueue<java.lang.Object> referenceQueue, @NotNull java.lang.String str) {
        super(obj, referenceQueue);
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(referenceQueue, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }
}
