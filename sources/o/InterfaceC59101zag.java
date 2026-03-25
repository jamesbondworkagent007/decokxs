package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59101zag {
    java.util.Collection<? extends yNG> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv);

    InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv);

    void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv);

    java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1);

    /* JADX INFO: renamed from: o.zag$Application */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zag */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.util.Collection getContributedDescriptors$default(InterfaceC59101zag interfaceC59101zag, yZU yzu, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i & 1) != 0) {
                yzu = yZU.AEQbTJ;
            }
            if ((i & 2) != 0) {
                function1 = InterfaceC59098zad.hDKMBd.AEQbTJ();
            }
            return interfaceC59101zag.copydefault(yzu, function1);
        }

        public static void AEQbTJ(@NotNull InterfaceC59101zag interfaceC59101zag, @NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            interfaceC59101zag.AEQbTJ(c56935yXu, yqv);
        }
    }
}
