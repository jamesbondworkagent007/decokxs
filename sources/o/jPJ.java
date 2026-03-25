package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPJ extends android.widget.LinearLayout {
    public float AEQbTJ;
    public int AYXKKw;
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public Function1<? super java.lang.Boolean, Unit> OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jPJ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginRequiredOnIvWhenClosed(float f) {
        this.AEQbTJ = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCollapsedLines(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToggleDescriptionBoxListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:29) call: o.jPJ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ jPJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jPJ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jPH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jPJ.KWHzl(context, this);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jPJ.EZpvd();
            }
        });
        this.AYXKKw = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C23498hzP AEQbTJ() {
        return (C23498hzP) this.KWHzl.getValue();
    }

    public static final C23498hzP KWHzl(android.content.Context context, jPJ jpj) {
        return C23498hzP.KWHzl(android.view.LayoutInflater.from(context), jpj, true);
    }

    private final InterfaceC43294rma djBIcL() {
        return (InterfaceC43294rma) this.copydefault.getValue();
    }

    public static final InterfaceC43294rma EZpvd() {
        return (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
    }

    public static /* synthetic */ void setDescription$default(jPJ jpj, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        jpj.setDescription(str, z);
    }

    public final void setDescription(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        final android.widget.TextView textView = AEQbTJ().EZpvd;
        if (z) {
            C55137xeK c55137xeKOLrzqt = C55137xeK.Companion.KWHzl(str).OLrzqt(new InterfaceC55228xfw() { // from class: o.jPK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC55228xfw
                public final boolean OLrzqt(java.lang.String str2) {
                    return jPJ.KWHzl(this.copydefault, textView, str2);
                }
            });
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55137xeKOLrzqt.KWHzl(context, new Function1() { // from class: o.jPI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jPJ.copydefault(textView, this, (java.lang.CharSequence) obj);
                }
            });
            return;
        }
        textView.setText(str);
        Intrinsics.copydefault(textView);
        KWHzl(textView);
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(jPJ jpj, android.widget.TextView textView, java.lang.String str) {
        InterfaceC43294rma interfaceC43294rmaDjBIcL = jpj.djBIcL();
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Intrinsics.copydefault((java.lang.Object) str);
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rmaDjBIcL, context, str, null, new Function1() { // from class: o.jPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jPJ.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return true;
    }

    public static final Unit copydefault(android.widget.TextView textView, jPJ jpj, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        textView.setText(charSequence);
        textView.setMovementMethod(C55134xeH.OLrzqt());
        Intrinsics.copydefault(textView);
        jpj.KWHzl(textView);
        return Unit.INSTANCE;
    }

    public final void setDescriptionTextStyle(@androidx.annotation.StyleRes int i, @androidx.annotation.ColorRes int i2, float f) {
        android.widget.TextView textView = AEQbTJ().EZpvd;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TextViewCompat.setLineHeight(textView, C55298xhM.djBIcL(f, context));
        TextViewCompat.setTextAppearance(textView, i);
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setTextColor(C25382ivf.copydefault(i2, context2));
    }

    public final void setDropdownChevronBackgroundTint(@androidx.annotation.ColorRes int i) {
        android.widget.ImageView imageView = AEQbTJ().AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        imageView.setBackgroundTintList(C25382ivf.OLrzqt(context, i));
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.widget.TextView AEQbTJ;
        public final /* synthetic */ jPJ OLrzqt;

        public Activity(android.widget.TextView textView, jPJ jpj) {
            this.AEQbTJ = textView;
            this.OLrzqt = jpj;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.AEQbTJ.getLineCount() > this.OLrzqt.AYXKKw) {
                this.AEQbTJ.setMaxLines(this.OLrzqt.EZpvd ? 100 : this.OLrzqt.AYXKKw);
                android.widget.ImageView imageView = this.OLrzqt.AEQbTJ().AEQbTJ;
                jPJ jpj = this.OLrzqt;
                Intrinsics.copydefault(imageView);
                imageView.setVisibility(0);
                C55296xhK.margin$default(imageView, null, null, null, java.lang.Float.valueOf(jpj.EZpvd ? 0.0f : jpj.AEQbTJ), 7, null);
                imageView.setOnClickListener(new TaskDescription(imageView, 1000L, jpj));
                Intrinsics.copydefault(imageView);
                return;
            }
            android.widget.ImageView imageView2 = this.OLrzqt.AEQbTJ().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ jPJ EZpvd;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, jPJ jpj) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.EZpvd = jpj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    if (this.EZpvd.EZpvd) {
                        this.EZpvd.KWHzl();
                    } else {
                        this.EZpvd.OLrzqt();
                    }
                    this.EZpvd.EZpvd = !r7.EZpvd;
                }
            }
        }
    }

    public final void KWHzl(android.widget.TextView textView) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new Activity(textView, this));
    }

    public final void OLrzqt() {
        C23498hzP c23498hzPAEQbTJ = AEQbTJ();
        c23498hzPAEQbTJ.EZpvd.setMaxLines(100);
        c23498hzPAEQbTJ.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        android.widget.ImageView imageView = c23498hzPAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C55296xhK.margin$default(imageView, null, null, null, java.lang.Float.valueOf(0.0f), 7, null);
        Function1<? super java.lang.Boolean, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
    }

    public final void KWHzl() {
        C23498hzP c23498hzPAEQbTJ = AEQbTJ();
        java.lang.CharSequence text = c23498hzPAEQbTJ.EZpvd.getText();
        if (text instanceof android.text.Spannable) {
            android.text.Selection.removeSelection((android.text.Spannable) text);
        }
        c23498hzPAEQbTJ.EZpvd.setMaxLines(this.AYXKKw);
        c23498hzPAEQbTJ.AEQbTJ.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
        android.widget.ImageView imageView = c23498hzPAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C55296xhK.margin$default(imageView, null, null, null, java.lang.Float.valueOf(this.AEQbTJ), 7, null);
        Function1<? super java.lang.Boolean, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }

    public final void setFooter(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = AEQbTJ().KWHzl;
        Intrinsics.copydefault(textView);
        textView.setVisibility(C33129mqd.OLrzqt(charSequence) ? 0 : 8);
        if (textView.getVisibility() == 0) {
            textView.setText(charSequence);
            textView.setMovementMethod(C55134xeH.OLrzqt());
        }
    }
}
