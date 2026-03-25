package o;

import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hTk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21979hTk extends C32995moB {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function0<Unit> AEQbTJ;
    public hAR KWHzl;
    public Function0<Unit> OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX INFO: renamed from: o.hTk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hTk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C21979hTk OLrzqt(int i, boolean z, @NotNull Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            Intrinsics.checkNotNullParameter(function0, "");
            C21979hTk c21979hTk = new C21979hTk();
            c21979hTk.OLrzqt = function0;
            c21979hTk.copydefault = function02;
            c21979hTk.AEQbTJ = function03;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("position", i);
            bundle.putBoolean("un_favorite", z);
            c21979hTk.setArguments(bundle);
            return c21979hTk;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.KWHzl = hAR.AEQbTJ(layoutInflater, viewGroup, false);
        EZpvd();
        hAR har = this.KWHzl;
        if (har != null) {
            return har.getRoot();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.graphics.drawable.Drawable drawableOLrzqt;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("un_favorite") : false;
        hAR har = this.KWHzl;
        if (har != null) {
            if (z) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.UkCIYP);
                if (drawableKWHzl != null) {
                    android.content.Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    drawableOLrzqt = C33057mpK.OLrzqt(drawableKWHzl, context, C23274hvD.StateListAnimator.fARcdN);
                } else {
                    drawableOLrzqt = null;
                }
                har.OLrzqt.setImageDrawable(drawableOLrzqt);
            } else {
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.QezThh);
                if (drawableKWHzl2 != null) {
                    android.content.Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    drawableOLrzqt = C33057mpK.OLrzqt(drawableKWHzl2, context2, C52761wXj.Activity.gdmIOq);
                }
                har.OLrzqt.setImageDrawable(drawableOLrzqt);
            }
        }
        view.post(new java.lang.Runnable() { // from class: o.hTp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C21979hTk.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(C21979hTk c21979hTk) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21979hTk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C32995moB, androidx.fragment.app.Fragment
    public void onResume() {
        android.view.Window window;
        int iKWHzl;
        super.onResume();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 49;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        if (attributes2 != null) {
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                int i = arguments.getInt("position");
                android.content.Context context = window.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iKWHzl = i - C55298xhM.KWHzl(120.0f, context);
            } else {
                iKWHzl = 0;
            }
            attributes2.y = iKWHzl;
        }
        window.getAttributes().dimAmount = 0.0f;
        window.setAttributes(window.getAttributes());
    }

    private final void EZpvd() {
        hAR har = this.KWHzl;
        if (har != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(har.OLrzqt, 0L, new Function1() { // from class: o.hTn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21979hTk.KWHzl(this.OLrzqt, (android.view.View) obj);
                }
            }, 1, null);
            if (this.copydefault != null) {
                har.copydefault.setVisibility(0);
                C25352ivB.setOnDoubleCheckClickListener$default(har.copydefault, 0L, new Function1() { // from class: o.hTq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C21979hTk.EZpvd(this.EZpvd, (android.view.View) obj);
                    }
                }, 1, null);
            }
            if (this.AEQbTJ != null) {
                har.KWHzl.setVisibility(0);
                C25352ivB.setOnDoubleCheckClickListener$default(har.KWHzl, 0L, new Function1() { // from class: o.hTm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C21979hTk.djBIcL(this.KWHzl, (android.view.View) obj);
                    }
                }, 1, null);
            }
        }
    }

    public static final Unit KWHzl(C21979hTk c21979hTk, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c21979hTk.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        c21979hTk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C21979hTk c21979hTk, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c21979hTk.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        c21979hTk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C21979hTk c21979hTk, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c21979hTk.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
        c21979hTk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
