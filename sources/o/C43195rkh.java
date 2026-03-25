package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43195rkh extends C43265rly {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static android.app.Application EZpvd;

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
    }

    /* JADX INFO: renamed from: o.rkh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rkh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(InterfaceC7377aig.class, C56392yDr.copydefault(new Function0() { // from class: o.rkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43195rkh.OLrzqt();
            }
        }));
        C43056riA.AEQbTJ.OLrzqt("growth", new C43189rkb());
    }

    public static final C43197rkj OLrzqt() {
        return new C43197rkj();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd = getApplication();
    }
}
