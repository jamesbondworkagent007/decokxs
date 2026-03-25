package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eSy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15724eSy {
    public static final C15724eSy AEQbTJ = new C15724eSy();

    private C15724eSy() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eSy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void operatorNetworkError$default(C15724eSy c15724eSy, android.content.Context context, Function0 function0, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        c15724eSy.copydefault(context, function0, yho);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull final Function0<Unit> function0, final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        eRI.OLrzqt.copydefault(context, new yHO() { // from class: o.eSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C15724eSy.EZpvd(yho, function0, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        });
    }

    public static final Unit EZpvd(yHO yho, Function0 function0, int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        if (yho != null) {
            yho.invoke(java.lang.Integer.valueOf(i), view, viewOnClickListenerC54939xaY);
        }
        if (i == 1) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }
}
