package o;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9845bdK extends InterfaceC43217rlC {
    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<java.lang.String>> continuation);

    /* JADX INFO: renamed from: o.bdK$ActionBar */
    public static final class ActionBar {
        /* JADX INFO: renamed from: connectVerificationServer-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8563connectVerificationServer0E7RQCE$default(InterfaceC9845bdK interfaceC9845bdK, java.lang.String str, long j, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connectVerificationServer-0E7RQCE");
            }
            if ((i & 2) != 0) {
                j = 5000;
            }
            return interfaceC9845bdK.copydefault(str, j, continuation);
        }
    }
}
