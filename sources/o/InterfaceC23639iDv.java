package o;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23639iDv {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super Result<java.lang.Integer>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation);

    /* JADX INFO: renamed from: getBoolean-0E7RQCE$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m8611getBoolean0E7RQCE$default(InterfaceC23639iDv interfaceC23639iDv, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean-0E7RQCE");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return interfaceC23639iDv.EZpvd(str, z, continuation);
    }

    /* JADX INFO: renamed from: getInt-0E7RQCE$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m8612getInt0E7RQCE$default(InterfaceC23639iDv interfaceC23639iDv, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt-0E7RQCE");
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return interfaceC23639iDv.AEQbTJ(str, i, continuation);
    }
}
