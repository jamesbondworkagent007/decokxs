package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52873wao extends ConstraintLayout implements InterfaceC50054vAe {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Function1<? super android.view.View, Unit> AEQbTJ;
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public AbstractC50919vdI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52873wao(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52873wao(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC50054vAe
    public void AEQbTJ(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstRecCallBack(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondRecCallBack(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.wao.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52873wao(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52873wao(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
        setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.ikIEnW)));
    }

    /* JADX INFO: renamed from: o.wao$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wao.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final void AEQbTJ() {
        AbstractC50919vdI abstractC50919vdI = (AbstractC50919vdI) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.aChkwz, this, true);
        this.copydefault = abstractC50919vdI;
        AbstractC50919vdI abstractC50919vdI2 = null;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.AEQbTJ.AEQbTJ(new Function1() { // from class: o.wap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52873wao.EZpvd(this.OLrzqt, (android.view.View) obj);
            }
        });
        AbstractC50919vdI abstractC50919vdI3 = this.copydefault;
        if (abstractC50919vdI3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI3 = null;
        }
        copydefault(abstractC50919vdI3.KWHzl);
        AbstractC50919vdI abstractC50919vdI4 = this.copydefault;
        if (abstractC50919vdI4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI4 = null;
        }
        copydefault(abstractC50919vdI4.copydefault);
        AbstractC50919vdI abstractC50919vdI5 = this.copydefault;
        if (abstractC50919vdI5 == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI5 = null;
        }
        android.widget.TextView textView = abstractC50919vdI5.KWHzl;
        textView.setOnClickListener(new Activity(textView, 1000L, this));
        AbstractC50919vdI abstractC50919vdI6 = this.copydefault;
        if (abstractC50919vdI6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50919vdI2 = abstractC50919vdI6;
        }
        android.widget.TextView textView2 = abstractC50919vdI2.copydefault;
        textView2.setOnClickListener(new ActionBar(textView2, 1000L, this));
    }

    public static final Unit EZpvd(C52873wao c52873wao, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super android.view.View, Unit> function1 = c52873wao.AEQbTJ;
        if (function1 != null) {
            function1.invoke(view);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final Function1<? super C52873wao, Unit> function1) {
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.EZpvd.setOnTextChangeCallback(new Function2() { // from class: o.wan
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52873wao.copydefault(this.KWHzl, function1, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit copydefault(C52873wao c52873wao, Function1 function1, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        AbstractC50919vdI abstractC50919vdI = c52873wao.copydefault;
        AbstractC50919vdI abstractC50919vdI2 = null;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.KWHzl.setSelected(false);
        AbstractC50919vdI abstractC50919vdI3 = c52873wao.copydefault;
        if (abstractC50919vdI3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50919vdI2 = abstractC50919vdI3;
        }
        abstractC50919vdI2.copydefault.setSelected(false);
        if (function1 != null) {
            function1.invoke(c52873wao);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.EZpvd.setOnTextChangeCallback(null);
    }

    @Override // android.view.View
    public void postInvalidate() {
        super.postInvalidate();
    }

    public final void setInputContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        C47988uAv.setInputContent$default(abstractC50919vdI.EZpvd, str, false, false, 6, null);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.AEQbTJ.setTitle(str);
    }

    @Override // o.InterfaceC50054vAe
    public void setSelect(boolean z) {
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        AbstractC50919vdI abstractC50919vdI2 = null;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.AEQbTJ.setSelect(z);
        AbstractC50919vdI abstractC50919vdI3 = this.copydefault;
        if (abstractC50919vdI3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI3 = null;
        }
        C47988uAv c47988uAv = abstractC50919vdI3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        AbstractC50919vdI abstractC50919vdI4 = this.copydefault;
        if (abstractC50919vdI4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI4 = null;
        }
        android.widget.TextView textView = abstractC50919vdI4.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        AbstractC50919vdI abstractC50919vdI5 = this.copydefault;
        if (abstractC50919vdI5 == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI5 = null;
        }
        android.widget.TextView textView2 = abstractC50919vdI5.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        AbstractC50919vdI abstractC50919vdI6 = this.copydefault;
        if (abstractC50919vdI6 == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI6 = null;
        }
        android.widget.Space space = abstractC50919vdI6.valueOf;
        Intrinsics.checkNotNullExpressionValue(space, "");
        space.setVisibility(z ? 0 : 8);
        if (z) {
            return;
        }
        AbstractC50919vdI abstractC50919vdI7 = this.copydefault;
        if (abstractC50919vdI7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50919vdI2 = abstractC50919vdI7;
        }
        C47988uAv.setInputContent$default(abstractC50919vdI2.EZpvd, "", false, false, 6, null);
    }

    public static /* synthetic */ void setInputViewConfig$default(C52873wao c52873wao, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        c52873wao.setInputViewConfig(str, str2, num);
    }

    public final void setInputViewConfig(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        AbstractC50919vdI abstractC50919vdI = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC50919vdI abstractC50919vdI2 = this.copydefault;
            if (abstractC50919vdI2 == null) {
                Intrinsics.gEmmrt("");
                abstractC50919vdI2 = null;
            }
            C47988uAv.setInputLabel$default(abstractC50919vdI2.EZpvd, str, null, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            AbstractC50919vdI abstractC50919vdI3 = this.copydefault;
            if (abstractC50919vdI3 == null) {
                Intrinsics.gEmmrt("");
                abstractC50919vdI3 = null;
            }
            abstractC50919vdI3.EZpvd.setInputUnit(str2);
        }
        if (num != null) {
            AbstractC50919vdI abstractC50919vdI4 = this.copydefault;
            if (abstractC50919vdI4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50919vdI = abstractC50919vdI4;
            }
            abstractC50919vdI.EZpvd.setMaxDecimal(num.intValue());
        }
    }

    public final void copydefault() {
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.KWHzl.performClick();
    }

    public final void setRecommendText(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        AbstractC50919vdI abstractC50919vdI2 = null;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.KWHzl.setText(str);
        AbstractC50919vdI abstractC50919vdI3 = this.copydefault;
        if (abstractC50919vdI3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50919vdI2 = abstractC50919vdI3;
        }
        abstractC50919vdI2.copydefault.setText(str2);
    }

    public final java.lang.String EZpvd() {
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        return abstractC50919vdI.EZpvd.AkhnZx();
    }

    public final void setInputError(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC50919vdI abstractC50919vdI = this.copydefault;
            AbstractC50919vdI abstractC50919vdI2 = null;
            if (abstractC50919vdI == null) {
                Intrinsics.gEmmrt("");
                abstractC50919vdI = null;
            }
            android.widget.TextView textView = abstractC50919vdI.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            AbstractC50919vdI abstractC50919vdI3 = this.copydefault;
            if (abstractC50919vdI3 == null) {
                Intrinsics.gEmmrt("");
                abstractC50919vdI3 = null;
            }
            abstractC50919vdI3.OLrzqt.setText(str);
            AbstractC50919vdI abstractC50919vdI4 = this.copydefault;
            if (abstractC50919vdI4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50919vdI2 = abstractC50919vdI4;
            }
            abstractC50919vdI2.EZpvd.setInputErrorMsg("");
        }
    }

    public final void KWHzl() {
        AbstractC50919vdI abstractC50919vdI = this.copydefault;
        AbstractC50919vdI abstractC50919vdI2 = null;
        if (abstractC50919vdI == null) {
            Intrinsics.gEmmrt("");
            abstractC50919vdI = null;
        }
        abstractC50919vdI.EZpvd.copydefault();
        AbstractC50919vdI abstractC50919vdI3 = this.copydefault;
        if (abstractC50919vdI3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50919vdI2 = abstractC50919vdI3;
        }
        android.widget.TextView textView = abstractC50919vdI2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    private final void copydefault(android.widget.TextView textView) {
        if (textView != null) {
            TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 1);
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, 8, 14, 1, 2);
        }
    }

    /* JADX INFO: renamed from: o.wao$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52873wao OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52873wao c52873wao) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c52873wao;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AbstractC50919vdI abstractC50919vdI = this.OLrzqt.copydefault;
                AbstractC50919vdI abstractC50919vdI2 = null;
                if (abstractC50919vdI == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50919vdI = null;
                }
                abstractC50919vdI.EZpvd.AEQbTJ();
                AbstractC50919vdI abstractC50919vdI3 = this.OLrzqt.copydefault;
                if (abstractC50919vdI3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50919vdI3 = null;
                }
                abstractC50919vdI3.KWHzl.setSelected(false);
                AbstractC50919vdI abstractC50919vdI4 = this.OLrzqt.copydefault;
                if (abstractC50919vdI4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC50919vdI2 = abstractC50919vdI4;
                }
                abstractC50919vdI2.copydefault.setSelected(true);
                Function0 function0 = this.OLrzqt.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wao$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C52873wao EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52873wao c52873wao) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c52873wao;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                AbstractC50919vdI abstractC50919vdI = this.EZpvd.copydefault;
                AbstractC50919vdI abstractC50919vdI2 = null;
                if (abstractC50919vdI == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50919vdI = null;
                }
                abstractC50919vdI.EZpvd.AEQbTJ();
                AbstractC50919vdI abstractC50919vdI3 = this.EZpvd.copydefault;
                if (abstractC50919vdI3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50919vdI3 = null;
                }
                abstractC50919vdI3.KWHzl.setSelected(true);
                AbstractC50919vdI abstractC50919vdI4 = this.EZpvd.copydefault;
                if (abstractC50919vdI4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC50919vdI2 = abstractC50919vdI4;
                }
                abstractC50919vdI2.copydefault.setSelected(false);
                Function0 function0 = this.EZpvd.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
