package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.okex.lite.hero.deeplink.SwitchToExchangeDeeplink$executeDeeplink$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45674suW implements InterfaceC43234rlT {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public static final DeeplinkMode AEQbTJ = DeeplinkMode.LITE;
    public static final java.lang.String EZpvd = "exchange/home";

    /* JADX INFO: renamed from: o.suW$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC43233rlS {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.suW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return false;
        }

        private StateListAnimator() {
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }

        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return C45674suW.AEQbTJ;
        }

        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return C45674suW.EZpvd;
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return C56402yEa.EZpvd(new C43240rlZ("next", false));
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SwitchToExchangeDeeplink$executeDeeplink$1(context, map, null), 3, null);
    }
}
