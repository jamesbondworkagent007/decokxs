package o;

import kotlin.jvm.internal.Intrinsics;
import o.C58061yuF;
import o.C58093yul;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58089yuh {
    public final C58061yuF AEQbTJ;
    public final C58093yul copydefault;

    public C58089yuh(@NotNull C58093yul c58093yul, @NotNull C58061yuF c58061yuF) {
        Intrinsics.checkNotNullParameter(c58093yul, "");
        Intrinsics.checkNotNullParameter(c58061yuF, "");
        this.copydefault = c58093yul;
        this.AEQbTJ = c58061yuF;
    }

    public final void KWHzl() {
        this.copydefault.AEQbTJ();
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.reflect.Method method, @NotNull java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(method, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        return this.AEQbTJ.KWHzl(method, objArr);
    }

    /* JADX INFO: renamed from: o.yuh$Application */
    public static final class Application {
        public final C58061yuF.StateListAnimator OLrzqt;
        public final C58093yul.Activity copydefault;

        public Application(@NotNull C58093yul.Activity activity, @NotNull C58061yuF.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            this.copydefault = activity;
            this.OLrzqt = stateListAnimator;
        }

        public final C58089yuh OLrzqt(@NotNull java.lang.Class<?> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            copydefault(cls);
            C58093yul c58093yulAEQbTJ = this.copydefault.AEQbTJ();
            return new C58089yuh(c58093yulAEQbTJ, this.OLrzqt.AEQbTJ(cls, c58093yulAEQbTJ));
        }

        public final void copydefault(java.lang.Class<?> cls) {
            if (!cls.isInterface()) {
                throw new java.lang.IllegalArgumentException("Service declarations must be interfaces.".toString());
            }
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "");
            if (interfaces.length != 0) {
                throw new java.lang.IllegalArgumentException("Service interfaces must not extend other interfaces.".toString());
            }
        }
    }
}
