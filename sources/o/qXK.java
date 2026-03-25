package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.qXK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qXK {
    void AEQbTJ(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, int i4, @NotNull Function0<Unit> function0);

    void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, @NotNull Function0<Unit> function0);

    void EZpvd(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @androidx.annotation.StringRes int i3, @NotNull Function0<Unit> function0);

    void copydefault(long j);

    void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull Function0<Unit> function0);

    public static final class StateListAnimator {
        public static Unit KWHzl() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.qXK */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showEmptyState$default(qXK qxk, int i, int i2, int i3, int i4, Function0 function0, int i5, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyState");
            }
            int i6 = (i5 & 2) != 0 ? 0 : i2;
            int i7 = (i5 & 4) != 0 ? 0 : i3;
            if ((i5 & 8) != 0) {
                i4 = 6;
            }
            int i8 = i4;
            if ((i5 & 16) != 0) {
                function0 = new Function0() { // from class: o.qXM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return qXK.StateListAnimator.KWHzl();
                    }
                };
            }
            qxk.AEQbTJ(i, i6, i7, i8, (Function0<Unit>) function0);
        }

        public static Unit AhwBna() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.qXK */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showEmptyState$default(qXK qxk, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, Function0 function0, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyState");
            }
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 4) != 0) {
                str3 = null;
            }
            if ((i2 & 8) != 0) {
                i = 6;
            }
            if ((i2 & 16) != 0) {
                function0 = new Function0() { // from class: o.qXT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return qXK.StateListAnimator.AhwBna();
                    }
                };
            }
            qxk.AEQbTJ(str, str2, str3, i, (Function0<Unit>) function0);
        }

        public static Unit djBIcL() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.qXK */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showErrorState$default(qXK qxk, int i, int i2, int i3, Function0 function0, int i4, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorState");
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            if ((i4 & 8) != 0) {
                function0 = new Function0() { // from class: o.qXO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return qXK.StateListAnimator.djBIcL();
                    }
                };
            }
            qxk.EZpvd(i, i2, i3, function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.qXK */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showErrorState$default(qXK qxk, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorState");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                function0 = new Function0() { // from class: o.qXR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return qXK.StateListAnimator.valueOf();
                    }
                };
            }
            qxk.copydefault(str, str2, str3, function0);
        }

        public static Unit valueOf() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void showLoadingState$default(qXK qxk, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadingState");
            }
            if ((i & 1) != 0) {
                j = 0;
            }
            qxk.copydefault(j);
        }
    }
}
