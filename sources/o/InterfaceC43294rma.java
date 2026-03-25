package o;

import com.okinc.modular.deeplinkv2.LinkSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43294rma extends InterfaceC43217rlC {
    public static final StateListAnimator Companion = StateListAnimator.OLrzqt;

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull LinkSource linkSource, boolean z, @NotNull Function1<? super AbstractC43238rlX, Unit> function1);

    boolean AkhnZx(@NotNull java.lang.String str);

    java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43238rlX> continuation);

    java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z);

    void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Function1<? super AbstractC43238rlX, Unit> function1);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.util.Map<java.lang.String, java.lang.Object> fetchVPNInfo(@NotNull java.lang.String str);

    boolean values(@NotNull java.lang.String str);

    java.lang.String wlaJM();

    /* JADX INFO: renamed from: o.rma$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.rma$Application */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rma */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void processDeeplink$default(InterfaceC43294rma interfaceC43294rma, android.content.Context context, java.lang.String str, java.util.Map map, LinkSource linkSource, boolean z, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processDeeplink");
            }
            if ((i & 4) != 0) {
                map = C56424yEw.KWHzl();
            }
            java.util.Map map2 = map;
            if ((i & 8) != 0) {
                linkSource = LinkSource.IN_APP;
            }
            LinkSource linkSource2 = linkSource;
            if ((i & 16) != 0) {
                z = true;
            }
            interfaceC43294rma.AEQbTJ(context, str, map2, linkSource2, z, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rma */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void processDeeplink$default(InterfaceC43294rma interfaceC43294rma, android.content.Context context, java.lang.String str, java.util.Map map, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processDeeplink");
            }
            if ((i & 4) != 0) {
                map = C56424yEw.KWHzl();
            }
            interfaceC43294rma.KWHzl(context, str, map, function1);
        }

        public static /* synthetic */ java.lang.String createLink$default(InterfaceC43294rma interfaceC43294rma, java.lang.String str, java.util.Map map, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLink");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return interfaceC43294rma.EZpvd(str, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map, z);
        }
    }
}
