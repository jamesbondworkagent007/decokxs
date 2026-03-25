package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41959rBc {

    /* JADX INFO: renamed from: o.rBc$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final Unit OLrzqt(java.lang.Object obj) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void observeKYCFormField$default(rAX rax, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.rBd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C41959rBc.OLrzqt(obj2);
                }
            };
        }
        Function1 function14 = function1;
        if ((i & 8) != 0) {
            function12 = new Function1() { // from class: o.rBf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C41959rBc.KWHzl((java.lang.String) obj2);
                }
            };
        }
        Function1 function15 = function12;
        if ((i & 16) != 0) {
            function13 = new Function1() { // from class: o.rBe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C41959rBc.AEQbTJ((java.lang.String) obj2);
                }
            };
        }
        Function1 function16 = function13;
        if ((i & 32) != 0) {
            function0 = new Function0() { // from class: o.rBb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C41959rBc.KWHzl();
                }
            };
        }
        EZpvd(rax, lifecycleOwner, function14, function15, function16, function0);
    }

    public static final Unit KWHzl(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final <T> void EZpvd(@NotNull rAX<T> rax, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super T, Unit> function1, @NotNull final Function1<? super java.lang.String, Unit> function12, @NotNull final Function1<? super java.lang.String, Unit> function13, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(rax, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function0, "");
        rax.observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41959rBc.KWHzl(function1, obj);
            }
        }));
        rax.copydefault().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41959rBc.AEQbTJ(function12, (java.lang.String) obj);
            }
        }));
        rax.AEQbTJ().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41959rBc.OLrzqt(function13, (java.lang.String) obj);
            }
        }));
        rax.valueOf().observe(lifecycleOwner, new StateListAnimator(new ActionBar(function0)));
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rBc$ActionBar */
    public static final class ActionBar implements Function1 {
        public final /* synthetic */ Function0<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function0<Unit> function0) {
            this.copydefault = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            OLrzqt((java.lang.Void) obj);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Void r1) {
            this.copydefault.invoke();
        }
    }
}
