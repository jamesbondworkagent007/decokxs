package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class pES {
    public static final pES EZpvd = new pES();

    private pES() {
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC39407prj viewOnClickListenerC39407prj = new ViewOnClickListenerC39407prj(context);
        viewOnClickListenerC39407prj.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.Ufzxmz));
        viewOnClickListenerC39407prj.OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.igXuih), new View.OnClickListener() { // from class: o.pET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pES.AEQbTJ(viewOnClickListenerC39407prj, function0, view);
            }
        });
        viewOnClickListenerC39407prj.AEQbTJ(2);
        viewOnClickListenerC39407prj.copydefault(C33070mpX.AYXKKw(C35964oKf.Fragment.dYepVG), null);
        viewOnClickListenerC39407prj.setCanceledOnTouchOutside(true);
        viewOnClickListenerC39407prj.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC39407prj viewOnClickListenerC39407prj, Function0 function0, android.view.View view) {
        viewOnClickListenerC39407prj.dismiss();
        function0.invoke();
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C35964oKf.Application.AkhnZx, (android.view.ViewGroup) null);
        final wYK wyk = (wYK) viewInflate.findViewById(C35964oKf.StateListAnimator.hUfVAv);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.zEHIKV), new View.OnClickListener() { // from class: o.pEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pES.copydefault(wyk, function1, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.RcXXUw), new View.OnClickListener() { // from class: o.pEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pES.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(wYK wyk, Function1 function1, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (wyk.isChecked()) {
            function1.invoke(java.lang.Boolean.TRUE);
        } else {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
