package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29642kxW extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final boolean AEQbTJ;
    public java.lang.Integer AYXKKw;
    public java.lang.Integer KWHzl;
    public C21499hBq gEmmrt;
    public Function1<? super C29635kxP, Unit> EZpvd = new Function1() { // from class: o.kxS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C29642kxW.copydefault((C29635kxP) obj);
        }
    };
    public java.util.List<C29635kxP> OLrzqt = yDY.AhwBna();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.AEQbTJ;
    }

    public static final Unit copydefault(C29635kxP c29635kxP) {
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        java.lang.Integer num = this.KWHzl;
        if (num != null) {
            int iIntValue = num.intValue();
            android.content.Context context = getContext();
            java.lang.String string = context != null ? context.getString(iIntValue) : null;
            if (string != null) {
                str = string;
            }
        }
        java.lang.Integer num2 = this.AYXKKw;
        if (num2 != null) {
            wxq.AYXKKw().setTextAppearance(num2.intValue());
        }
        if (str.length() > 0) {
            wxq.setStyle(2);
            wxq.setTitle(str);
            wxq.setDividerVisibility(false);
            wxq.AEQbTJ().setVisibility(0);
            return;
        }
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = C21499hBq.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        KWHzl();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ivp.loadImageBitmap$default(android.widget.ImageView, java.lang.String, o.Qc[], android.graphics.drawable.Drawable, kotlin.jvm.functions.Function2, int, java.lang.Object):void */
    private final void KWHzl() {
        C21499hBq c21499hBq = this.gEmmrt;
        if (c21499hBq != null) {
            c21499hBq.EZpvd.removeAllViews();
            for (final C29635kxP c29635kxP : this.OLrzqt) {
                final C21537hDa c21537hDaCopydefault = C21537hDa.copydefault(getCustomLayoutInflater(), c21499hBq.EZpvd, true);
                Intrinsics.checkNotNullExpressionValue(c21537hDaCopydefault, "");
                c21537hDaCopydefault.copydefault.setText(c29635kxP.AEQbTJ());
                int i = 8;
                if (c29635kxP.copydefault() != null) {
                    android.widget.ImageView imageView = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    imageView.setVisibility(0);
                    c21537hDaCopydefault.KWHzl.setImageDrawable(c29635kxP.copydefault());
                } else if (c29635kxP.EZpvd().length() > 0) {
                    android.widget.ImageView imageView2 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(0);
                    android.widget.ImageView imageView3 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    C25392ivp.loadImageBitmap$default(imageView3, c29635kxP.EZpvd(), new AbstractC5396Qc[0], null, new Function2() { // from class: o.kxU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return C29642kxW.KWHzl(c29635kxP, c21537hDaCopydefault, (android.graphics.Bitmap) obj, (java.lang.Throwable) obj2);
                        }
                    }, 4, null);
                } else {
                    android.widget.ImageView imageView4 = c21537hDaCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(8);
                }
                android.widget.ImageView imageView5 = c21537hDaCopydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                if (c29635kxP.KWHzl()) {
                    i = 0;
                }
                imageView5.setVisibility(i);
                android.widget.LinearLayout root = c21537hDaCopydefault.getRoot();
                root.setOnClickListener(new StateListAnimator(root, 1000L, this, c29635kxP));
            }
        }
    }

    public static final Unit KWHzl(C29635kxP c29635kxP, C21537hDa c21537hDa, android.graphics.Bitmap bitmap, java.lang.Throwable th) {
        boolean z = th == null || c29635kxP.OLrzqt() != null;
        android.widget.ImageView imageView = c21537hDa.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (th != null && c29635kxP.OLrzqt() != null) {
            c21537hDa.KWHzl.setImageResource(c29635kxP.OLrzqt().intValue());
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        this.EZpvd.invoke(null);
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.kxW$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kxW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C29642kxW newInstance$default(TaskDescription taskDescription, java.util.List list, java.lang.Integer num, Function1 function1, java.lang.Integer num2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            return taskDescription.AEQbTJ(list, num, function1, num2);
        }

        public final C29642kxW AEQbTJ(@NotNull java.util.List<C29635kxP> list, @androidx.annotation.StringRes java.lang.Integer num, @NotNull Function1<? super C29635kxP, Unit> function1, @androidx.annotation.StyleRes java.lang.Integer num2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C29642kxW c29642kxW = new C29642kxW();
            c29642kxW.OLrzqt = list;
            c29642kxW.KWHzl = num;
            c29642kxW.EZpvd = function1;
            c29642kxW.AYXKKw = num2;
            return c29642kxW;
        }
    }

    /* JADX INFO: renamed from: o.kxW$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C29635kxP KWHzl;
        public final /* synthetic */ C29642kxW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29642kxW c29642kxW, C29635kxP c29635kxP) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c29642kxW;
            this.KWHzl = c29635kxP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.EZpvd.invoke(this.KWHzl);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
