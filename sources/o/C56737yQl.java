package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56737yQl implements yTH {
    public static final C56737yQl EZpvd = new C56737yQl();

    /* JADX INFO: renamed from: o.yQl$StateListAnimator */
    public static final class StateListAnimator implements yTK {
        public final yQG OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yTY; */
        @Override // o.yTK
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public yQG EZpvd() {
            return this.OLrzqt;
        }

        public StateListAnimator(@NotNull yQG yqg) {
            Intrinsics.checkNotNullParameter(yqg, "");
            this.OLrzqt = yqg;
        }

        public java.lang.String toString() {
            return StateListAnimator.class.getName() + ": " + EZpvd();
        }

        @Override // o.InterfaceC56686yOo
        public InterfaceC56684yOm copydefault() {
            InterfaceC56684yOm interfaceC56684yOm = InterfaceC56684yOm.EZpvd;
            Intrinsics.checkNotNullExpressionValue(interfaceC56684yOm, "");
            return interfaceC56684yOm;
        }
    }

    private C56737yQl() {
    }

    @Override // o.yTH
    public yTK KWHzl(@NotNull yTY yty) {
        Intrinsics.checkNotNullParameter(yty, "");
        return new StateListAnimator((yQG) yty);
    }
}
