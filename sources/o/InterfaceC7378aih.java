package o;

import kotlin.jvm.internal.Intrinsics;
import o.C7325ahh;
import o.C8010aue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC7378aih {

    /* JADX INFO: renamed from: o.aih$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static C7325ahh OLrzqt(@NotNull InterfaceC7378aih interfaceC7378aih, @NotNull C7325ahh c7325ahh) {
            Intrinsics.checkNotNullParameter(c7325ahh, "");
            return c7325ahh;
        }
    }

    java.lang.Class<?>[] registerConstants();

    C7325ahh.TaskDescription[] registerConverter();

    InterfaceC7380aij registerRouter();

    C7325ahh.Application[] registerSingleInstance();

    C8010aue.LoaderManager[] registerStaticClass();

    C8010aue.AssistContent[] registerUserData();
}
