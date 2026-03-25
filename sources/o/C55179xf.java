package o;

import kotlin.coroutines.Continuation;
import o.C56080xw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55179xf {

    /* JADX INFO: renamed from: o.xf$StateListAnimator */
    public static final class StateListAnimator implements C56080xw.Application {
        public final CR OLrzqt;

        public StateListAnimator(InterfaceC5060De interfaceC5060De) {
            this.OLrzqt = CX.copydefault(interfaceC5060De);
        }

        @Override // o.C56080xw.Application
        public boolean EZpvd() {
            return this.OLrzqt.c_();
        }

        @Override // o.C56080xw.Application
        public java.lang.Object AEQbTJ(@NotNull CQ cq, long j, @NotNull Continuation<? super java.lang.Long> continuation) {
            return C56443yFo.KWHzl(this.OLrzqt.KWHzl(cq, j));
        }
    }

    public static final C56080xw.Application AEQbTJ(InterfaceC5060De interfaceC5060De) {
        return new StateListAnimator(interfaceC5060De);
    }
}
