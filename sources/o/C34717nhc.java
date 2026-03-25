package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34717nhc {
    public static final Application Companion = new Application(null);
    public static StateListAnimator KWHzl;

    /* JADX INFO: renamed from: o.nhc$StateListAnimator */
    public interface StateListAnimator {
        void getPostValueLengthLimit();
    }

    /* JADX INFO: renamed from: o.nhc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nhc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(StateListAnimator stateListAnimator) {
            C34717nhc.KWHzl = stateListAnimator;
        }

        public final StateListAnimator copydefault() {
            return C34717nhc.KWHzl;
        }

        public static /* synthetic */ void install$default(Application application, android.content.Context context, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                stateListAnimator = null;
            }
            application.KWHzl(context, stateListAnimator);
        }

        public final void KWHzl(@NotNull android.content.Context context, StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(context, "");
            C8067avj.OLrzqt(context);
            EZpvd(stateListAnimator);
        }

        public final void copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C8067avj.copydefault(context);
        }
    }
}
