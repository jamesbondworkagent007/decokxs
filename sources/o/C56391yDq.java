package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56391yDq {
    public static final java.lang.Object EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new Result.Failure(th);
    }

    public static final void AEQbTJ(@NotNull java.lang.Object obj) throws java.lang.Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
