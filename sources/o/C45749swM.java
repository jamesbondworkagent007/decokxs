package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45749swM extends C43265rly {
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull final android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        interfaceC43237rlW.copydefault(StateListAnimator.OLrzqt, C56392yDr.copydefault(new Function0() { // from class: o.swN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45749swM.EZpvd(context);
            }
        }));
    }

    public static final C45751swO EZpvd(android.content.Context context) {
        return new C45751swO(context);
    }

    /* JADX INFO: renamed from: o.swM$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC43233rlS {
        public static final StateListAnimator OLrzqt = new StateListAnimator();
        public static final java.lang.String copydefault = "derivateonboarding";
        public static final DeeplinkMode KWHzl = DeeplinkMode.LITE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return copydefault;
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return true;
        }

        private StateListAnimator() {
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return InterfaceC43233rlS.Application.copydefault(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }
    }
}
