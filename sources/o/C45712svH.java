package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45712svH implements InterfaceC45711svG {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC45711svG
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX INFO: renamed from: o.svH$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.svH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public C45712svH() {
    }

    @Override // o.InterfaceC45711svG
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.valueOf("LiteHeroPage", str);
    }

    @Override // o.InterfaceC45711svG
    public void OLrzqt(@NotNull java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        if (th != null) {
            pUU.AEQbTJ("LiteHeroPage", str, th);
        } else {
            pUU.copydefault("LiteHeroPage", str);
        }
    }
}
