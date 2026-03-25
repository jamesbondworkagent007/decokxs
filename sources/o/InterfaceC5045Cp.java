package o;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5045Cp {
    java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC5047Cr> continuation);

    /* JADX INFO: renamed from: o.Cp$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.Object resolve$default(InterfaceC5045Cp interfaceC5045Cp, InterfaceC57843yq interfaceC57843yq, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
            }
            if ((i & 1) != 0) {
                interfaceC57843yq = C58108yv.copydefault();
            }
            return interfaceC5045Cp.resolve(interfaceC57843yq, continuation);
        }
    }
}
