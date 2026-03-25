package o;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.InterfaceC19946gVe;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19945gVd implements InterfaceC19944gVc {
    public final AbstractC33073mpa KWHzl;
    public final C21522hCm copydefault;

    public C19945gVd(@NotNull C21522hCm c21522hCm, @NotNull AbstractC33073mpa abstractC33073mpa) {
        Intrinsics.checkNotNullParameter(c21522hCm, "");
        Intrinsics.checkNotNullParameter(abstractC33073mpa, "");
        this.copydefault = c21522hCm;
        this.KWHzl = abstractC33073mpa;
    }

    @Override // o.InterfaceC19944gVc
    public void KWHzl(@NotNull InterfaceC19946gVe interfaceC19946gVe) {
        Intrinsics.checkNotNullParameter(interfaceC19946gVe, "");
        if (!(interfaceC19946gVe instanceof InterfaceC19946gVe.ActionBar)) {
            if (interfaceC19946gVe instanceof InterfaceC19946gVe.Activity) {
                AEQbTJ(((InterfaceC19946gVe.Activity) interfaceC19946gVe).OLrzqt());
                return;
            }
            if (interfaceC19946gVe instanceof InterfaceC19946gVe.StateListAnimator) {
                InterfaceC19946gVe.StateListAnimator stateListAnimator = (InterfaceC19946gVe.StateListAnimator) interfaceC19946gVe;
                EZpvd(stateListAnimator.OLrzqt(), stateListAnimator.KWHzl());
                return;
            } else {
                if (interfaceC19946gVe instanceof InterfaceC19946gVe.TaskDescription) {
                    C55326xho.toast$default(((InterfaceC19946gVe.TaskDescription) interfaceC19946gVe).AEQbTJ(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return;
                }
                return;
            }
        }
        android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
    }

    public final void AEQbTJ(gLQ glq) {
        java.lang.String strEZpvd;
        Function0<Unit> function0;
        java.lang.CharSequence charSequenceKWHzl = KWHzl(glq);
        if (glq.KWHzl() == null || (strEZpvd = EZpvd(glq)) == null) {
            strEZpvd = glq.EZpvd() != null ? EZpvd(glq) : "";
        }
        final gLQ.Fragment fragmentKWHzl = glq.KWHzl();
        if (fragmentKWHzl != null) {
            function0 = new Function0() { // from class: o.gVi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19945gVd.KWHzl(fragmentKWHzl, this);
                }
            };
        } else {
            final Function2<android.content.Context, CoroutineScope, Unit> function2EZpvd = glq.EZpvd();
            function0 = function2EZpvd != null ? new Function0() { // from class: o.gVk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19945gVd.AEQbTJ(function2EZpvd, this);
                }
            } : null;
        }
        OLrzqt(charSequenceKWHzl, strEZpvd, function0);
    }

    public static final Unit KWHzl(gLQ.Fragment fragment, C19945gVd c19945gVd) {
        android.content.Context context = c19945gVd.copydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        fragment.KWHzl(context);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function2 function2, C19945gVd c19945gVd) {
        android.content.Context context = c19945gVd.copydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        function2.invoke(context, ViewModelKt.getViewModelScope(c19945gVd.KWHzl));
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z, Function0<Unit> function0) {
        if (z) {
            AEQbTJ(function0);
        }
    }

    public static final Unit EZpvd(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final Function0<Unit> function0) {
        C22274hcK c22274hcK = C22274hcK.OLrzqt;
        android.content.Context context = this.copydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c22274hcK.KWHzl(context, new Function0() { // from class: o.gVj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19945gVd.EZpvd(function0);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.gVd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReminder$default(C19945gVd c19945gVd, java.lang.CharSequence charSequence, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charSequence = "";
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        c19945gVd.OLrzqt(charSequence, str, function0);
    }

    public final void OLrzqt(java.lang.CharSequence charSequence, java.lang.String str, Function0<Unit> function0) {
        android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        this.copydefault.copydefault.setText(charSequence);
        if (str.length() > 0 && function0 != null) {
            android.widget.ImageView imageView = this.copydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            android.widget.LinearLayout linearLayout2 = this.copydefault.OLrzqt;
            linearLayout2.setOnClickListener(new Application(linearLayout2, 1000L, function0));
            return;
        }
        android.widget.ImageView imageView2 = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        this.copydefault.OLrzqt.setOnClickListener(null);
    }

    public final java.lang.CharSequence KWHzl(gLQ glq) {
        if (glq instanceof gLQ.ActionBar) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.OrsvgJ);
        }
        if (glq instanceof gLQ.FragmentManager) {
            if (((gLQ.FragmentManager) glq).OLrzqt()) {
                return C33070mpX.AYXKKw(C23274hvD.Fragment.DQnQnb);
            }
            return C33070mpX.AYXKKw(C23274hvD.Fragment.QnnRaN);
        }
        if (!(glq instanceof gLQ.Application)) {
            return glq instanceof gLQ.Dialog ? C33070mpX.AYXKKw(C23274hvD.Fragment.OgHfcT) : glq instanceof gLQ.Activity ? C33070mpX.AYXKKw(C23274hvD.Fragment.RLmrWm) : glq instanceof gLQ.AssistContent ? C33070mpX.AYXKKw(C23274hvD.Fragment.QnnRaN) : glq instanceof gLQ.LoaderManager ? C33070mpX.AYXKKw(C23274hvD.Fragment.OgHfcT) : glq instanceof gLQ.PendingIntent ? C33070mpX.AYXKKw(C23274hvD.Fragment.fZc) : glq instanceof gLQ.StateListAnimator ? C33070mpX.AYXKKw(C23274hvD.Fragment.fTEjYi) : "";
        }
        android.content.Context context = this.copydefault.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        gLQ.Application application = (gLQ.Application) glq;
        return pTD.EZpvd(context, C23274hvD.FragmentManager.DbNXlk, C33129mqd.AhwBna(java.lang.Long.valueOf(application.OLrzqt())), C56423yEv.EZpvd(C56390yDp.OLrzqt("numDays", java.lang.String.valueOf(application.OLrzqt()))));
    }

    public final java.lang.String EZpvd(gLQ glq) {
        return glq instanceof gLQ.FragmentManager ? C33070mpX.AYXKKw(C23274hvD.Fragment.GQzpsZ) : glq instanceof gLQ.Application ? C33070mpX.AYXKKw(C23274hvD.Fragment.zeUYeG) : glq instanceof gLQ.Activity ? C33070mpX.AYXKKw(C23274hvD.Fragment.RLmrWm) : glq instanceof gLQ.AssistContent ? C33070mpX.AYXKKw(C23274hvD.Fragment.zeUYeG) : glq instanceof gLQ.PendingIntent ? C33070mpX.AYXKKw(C23274hvD.Fragment.sILrnl) : glq instanceof gLQ.StateListAnimator ? C33070mpX.AYXKKw(C23274hvD.Fragment.QKDJJA) : "";
    }

    /* JADX INFO: renamed from: o.gVd$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }
}
