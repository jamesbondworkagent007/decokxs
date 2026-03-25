package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46370tRv {

    /* JADX INFO: renamed from: o.tRv$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements InterfaceC58227yxM {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58227yxM
        public final /* synthetic */ void accept(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    public static /* synthetic */ void trackChildFragmentLifecycle$default(androidx.fragment.app.Fragment fragment, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        KWHzl(fragment, z);
    }
}
