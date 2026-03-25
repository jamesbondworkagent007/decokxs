package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ngJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34658ngJ {
    public static final C34658ngJ copydefault = new C34658ngJ();

    private C34658ngJ() {
    }

    /* JADX INFO: renamed from: o.ngJ$StateListAnimator */
    public static final class StateListAnimator implements Function1<androidx.fragment.app.Fragment, androidx.fragment.app.Fragment> {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.Fragment invoke(androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "");
            return fragment.getParentFragment();
        }
    }
}
