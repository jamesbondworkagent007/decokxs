package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48759ubj implements InterfaceC43234rlT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.util.ArrayList<InterfaceC43233rlS> KWHzl = yDY.copydefault(C48757ubh.AEQbTJ, C48763ubn.EZpvd);

    /* JADX INFO: renamed from: o.ubj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ubj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.util.ArrayList<InterfaceC43233rlS> AEQbTJ() {
            return C48759ubj.KWHzl;
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt == null) {
            pUU.copydefault("ReferralDeepLinkHandlerV2", "error:activity=null");
            return;
        }
        if (Intrinsics.EZpvd(interfaceC43233rlS, C48757ubh.AEQbTJ) || Intrinsics.EZpvd(interfaceC43233rlS, C48763ubn.EZpvd)) {
            InterfaceC48694uaX interfaceC48694uaX = (InterfaceC48694uaX) C43251rlk.OLrzqt(InterfaceC48694uaX.class);
            if (interfaceC48694uaX != null) {
                interfaceC48694uaX.AEQbTJ(activityOLrzqt, C48760ubk.copydefault(map));
                return;
            }
            return;
        }
        C55326xho.OLrzqt("unknown metadata: " + interfaceC43233rlS);
    }
}
