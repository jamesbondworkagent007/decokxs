package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C21022grs {
    public static final void EZpvd(@NotNull android.app.Activity activity, @NotNull android.view.View view, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, @NotNull final Function0<java.lang.Boolean> function0, @NotNull final Function0<java.lang.Boolean> function02) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        final C52812wZg c52812wZg = new C52812wZg(activity);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(1);
        stateListAnimator.AEQbTJ(str);
        stateListAnimator.OLrzqt(str2);
        stateListAnimator.AEQbTJ(C55298xhM.AEQbTJ(i3, (android.content.Context) activity));
        stateListAnimator.copydefault(i4);
        stateListAnimator.KWHzl(i5);
        stateListAnimator.AEQbTJ(i6);
        stateListAnimator.OLrzqt(i7);
        stateListAnimator.copydefault(new Function0() { // from class: o.grr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C21022grs.OLrzqt(function0, c52812wZg));
            }
        });
        c52812wZg.AEQbTJ(stateListAnimator);
        if (i != i2) {
            c52812wZg.AEQbTJ(new C52812wZg.StateListAnimator(view));
        }
        c52812wZg.EZpvd(new Function0() { // from class: o.grv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21022grs.EZpvd(function02, c52812wZg);
            }
        });
        c52812wZg.AEQbTJ(new Function0() { // from class: o.grw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21022grs.KWHzl(function0);
            }
        });
        c52812wZg.OLrzqt(3);
        c52812wZg.KWHzl(i != i2);
        c52812wZg.fARcdN();
        android.widget.TextView textViewValues = c52812wZg.values();
        if (textViewValues != null) {
            textViewValues.setText(i + "/" + i2);
        }
    }

    public static final boolean OLrzqt(Function0 function0, C52812wZg c52812wZg) {
        if (!((java.lang.Boolean) function0.invoke()).booleanValue()) {
            return true;
        }
        c52812wZg.KWHzl();
        return true;
    }

    public static final Unit EZpvd(Function0 function0, C52812wZg c52812wZg) {
        if (((java.lang.Boolean) function0.invoke()).booleanValue()) {
            c52812wZg.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
