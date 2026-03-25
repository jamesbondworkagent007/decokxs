package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vLe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50351vLe extends ConstraintLayout {
    public final Function2<C47988uAv, java.lang.String, Unit> AEQbTJ;
    public java.lang.String AYXKKw;
    public Function2<? super C47988uAv, ? super java.lang.String, Unit> EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public final AbstractC50886vcc copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50351vLe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = "";
        this.valueOf = "";
        this.KWHzl = "";
        this.AYXKKw = "";
        this.gEmmrt = "";
        this.OLrzqt = 4;
        AbstractC50886vcc abstractC50886vccAEQbTJ = AbstractC50886vcc.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50886vccAEQbTJ, "");
        this.copydefault = abstractC50886vccAEQbTJ;
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50351vLe.OLrzqt(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AEQbTJ = function2;
        AEQbTJ(abstractC50886vccAEQbTJ.EZpvd);
        AEQbTJ(abstractC50886vccAEQbTJ.AEQbTJ);
        AEQbTJ(abstractC50886vccAEQbTJ.OLrzqt);
        AEQbTJ(abstractC50886vccAEQbTJ.copydefault);
        AEQbTJ(abstractC50886vccAEQbTJ.valueOf);
        C47988uAv c47988uAv = abstractC50886vccAEQbTJ.KWHzl;
        c47988uAv.setOnTextChangeCallback(function2);
        c47988uAv.setMaxDecimal(this.OLrzqt);
        android.widget.TextView textView = abstractC50886vccAEQbTJ.EZpvd;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
        android.widget.TextView textView2 = abstractC50886vccAEQbTJ.AEQbTJ;
        textView2.setOnClickListener(new StateListAnimator(textView2, 1000L, this));
        android.widget.TextView textView3 = abstractC50886vccAEQbTJ.OLrzqt;
        textView3.setOnClickListener(new Application(textView3, 1000L, this));
        android.widget.TextView textView4 = abstractC50886vccAEQbTJ.copydefault;
        textView4.setOnClickListener(new Activity(textView4, 1000L, this));
        android.widget.TextView textView5 = abstractC50886vccAEQbTJ.valueOf;
        textView5.setOnClickListener(new TaskDescription(textView5, 1000L, this));
    }

    public static final Unit OLrzqt(C50351vLe c50351vLe, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = c50351vLe.EZpvd;
        if (function2 != null) {
            function2.invoke(c47988uAv, str);
        }
        if (C33129mqd.OLrzqt(str, c50351vLe.djBIcL)) {
            c50351vLe.EZpvd(true, false, false, false, false);
        } else if (C33129mqd.OLrzqt(str, c50351vLe.valueOf)) {
            c50351vLe.EZpvd(false, true, false, false, false);
        } else if (C33129mqd.OLrzqt(str, c50351vLe.KWHzl)) {
            c50351vLe.EZpvd(false, false, true, false, false);
        } else if (C33129mqd.OLrzqt(str, c50351vLe.AYXKKw)) {
            c50351vLe.EZpvd(false, false, false, true, false);
        } else if (C33129mqd.OLrzqt(str, c50351vLe.gEmmrt)) {
            c50351vLe.EZpvd(false, false, false, false, true);
        } else {
            c50351vLe.EZpvd(false, false, false, false, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vLe$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C50351vLe OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50351vLe c50351vLe) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c50351vLe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.EZpvd(true, false, false, false, false);
                this.OLrzqt.copydefault.KWHzl.setOnTextChangeCallback(null);
                C50351vLe c50351vLe = this.OLrzqt;
                c50351vLe.setInputContent(c50351vLe.djBIcL);
                Function2 function2 = this.OLrzqt.EZpvd;
                if (function2 != null) {
                    C47988uAv c47988uAv = this.OLrzqt.copydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    function2.invoke(c47988uAv, this.OLrzqt.KWHzl);
                }
                this.OLrzqt.copydefault.KWHzl.setOnTextChangeCallback(this.OLrzqt.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.vLe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C50351vLe AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50351vLe c50351vLe) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c50351vLe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd(false, false, false, true, false);
                this.AEQbTJ.copydefault.KWHzl.setOnTextChangeCallback(null);
                C50351vLe c50351vLe = this.AEQbTJ;
                c50351vLe.setInputContent(c50351vLe.AYXKKw);
                Function2 function2 = this.AEQbTJ.EZpvd;
                if (function2 != null) {
                    C47988uAv c47988uAv = this.AEQbTJ.copydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    function2.invoke(c47988uAv, this.AEQbTJ.AYXKKw);
                }
                this.AEQbTJ.copydefault.KWHzl.setOnTextChangeCallback(this.AEQbTJ.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.vLe$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C50351vLe EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50351vLe c50351vLe) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c50351vLe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.EZpvd(false, false, true, false, false);
                this.EZpvd.copydefault.KWHzl.setOnTextChangeCallback(null);
                C50351vLe c50351vLe = this.EZpvd;
                c50351vLe.setInputContent(c50351vLe.KWHzl);
                Function2 function2 = this.EZpvd.EZpvd;
                if (function2 != null) {
                    C47988uAv c47988uAv = this.EZpvd.copydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    function2.invoke(c47988uAv, this.EZpvd.KWHzl);
                }
                this.EZpvd.copydefault.KWHzl.setOnTextChangeCallback(this.EZpvd.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.vLe$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C50351vLe KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50351vLe c50351vLe) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c50351vLe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.EZpvd(false, true, false, false, false);
                this.KWHzl.copydefault.KWHzl.setOnTextChangeCallback(null);
                C50351vLe c50351vLe = this.KWHzl;
                c50351vLe.setInputContent(c50351vLe.valueOf);
                Function2 function2 = this.KWHzl.EZpvd;
                if (function2 != null) {
                    C47988uAv c47988uAv = this.KWHzl.copydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    function2.invoke(c47988uAv, this.KWHzl.KWHzl);
                }
                this.KWHzl.copydefault.KWHzl.setOnTextChangeCallback(this.KWHzl.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.vLe$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C50351vLe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50351vLe c50351vLe) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c50351vLe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd(false, false, false, false, true);
                this.copydefault.copydefault.KWHzl.setOnTextChangeCallback(null);
                C50351vLe c50351vLe = this.copydefault;
                c50351vLe.setInputContent(c50351vLe.gEmmrt);
                Function2 function2 = this.copydefault.EZpvd;
                if (function2 != null) {
                    C47988uAv c47988uAv = this.copydefault.copydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    function2.invoke(c47988uAv, this.copydefault.gEmmrt);
                }
                this.copydefault.copydefault.KWHzl.setOnTextChangeCallback(this.copydefault.AEQbTJ);
            }
        }
    }

    public final void EZpvd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.copydefault.EZpvd.setSelected(z);
        this.copydefault.AEQbTJ.setSelected(z2);
        this.copydefault.OLrzqt.setSelected(z3);
        this.copydefault.copydefault.setSelected(z4);
        this.copydefault.valueOf.setSelected(z5);
    }

    public final C47988uAv AEQbTJ() {
        C47988uAv c47988uAv = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final void setInputContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv.setInputContent$default(this.copydefault.KWHzl, str, false, false, 6, null);
    }

    public final void setRecommendValue(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.djBIcL = C33129mqd.mulS$default(str, 100, java.lang.Integer.valueOf(this.OLrzqt), null, null, 12, null);
        this.valueOf = C33129mqd.mulS$default(str2, 100, java.lang.Integer.valueOf(this.OLrzqt), null, null, 12, null);
        this.KWHzl = C33129mqd.mulS$default(str3, 100, java.lang.Integer.valueOf(this.OLrzqt), null, null, 12, null);
        this.AYXKKw = C33129mqd.mulS$default(str4, 100, java.lang.Integer.valueOf(this.OLrzqt), null, null, 12, null);
        this.gEmmrt = C33129mqd.mulS$default(str5, 100, java.lang.Integer.valueOf(this.OLrzqt), null, null, 12, null);
        android.widget.TextView textView = this.copydefault.EZpvd;
        xMR xmr = xMR.copydefault;
        textView.setText(xMR.formatPercent$default(xmr, str, 4, 0, null, 8, null));
        this.copydefault.AEQbTJ.setText(xMR.formatPercent$default(xmr, str2, 4, 0, null, 8, null));
        this.copydefault.OLrzqt.setText(xMR.formatPercent$default(xmr, str3, 4, 0, null, 8, null));
        this.copydefault.copydefault.setText(xMR.formatPercent$default(xmr, str4, 4, 0, null, 8, null));
        this.copydefault.valueOf.setText(xMR.formatPercent$default(xmr, str5, 4, 0, null, 8, null));
    }

    private final void AEQbTJ(android.widget.TextView textView) {
        if (textView != null) {
            TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 1);
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, 8, 14, 1, 2);
        }
    }
}
