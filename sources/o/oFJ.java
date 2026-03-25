package o;

import com.okinc.im.config.page.IMPageType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = C35285nsT.copydefault;
    public final C35285nsT EZpvd;

    @yCM
    public oFJ(@yCL(AEQbTJ = "IMDefaultPageConfig") @NotNull C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(c35285nsT, "");
        this.EZpvd = c35285nsT;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final C35285nsT KWHzl(IMPageType iMPageType) {
        C35285nsT c35285nsTKWHzl = C36596odu.copydefault.KWHzl(iMPageType);
        C35285nsT c35285nsT = this.EZpvd;
        if (c35285nsTKWHzl != null) {
            c35285nsT = c35285nsTKWHzl;
        }
        pUU.KWHzl("GetPageConfigByPageTypeUseCase", "[" + iMPageType + "] execute: targetPageConfig: " + c35285nsTKWHzl);
        pUU.KWHzl("GetPageConfigByPageTypeUseCase", "[" + iMPageType + "] execute: resultConfig: " + c35285nsT);
        return c35285nsT;
    }
}
