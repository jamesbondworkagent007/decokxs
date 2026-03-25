package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52864waf extends android.widget.LinearLayout {
    public Function0<Unit> EZpvd;
    public Function0<Unit> KWHzl;
    public AbstractC50914vdD OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52864waf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52864waf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.waf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52864waf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52864waf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
        this.EZpvd = new Function0() { // from class: o.wah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52864waf.KWHzl();
            }
        };
        this.KWHzl = new Function0() { // from class: o.wak
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52864waf.EZpvd();
            }
        };
    }

    public final void OLrzqt() {
        setOrientation(0);
        AbstractC50914vdD abstractC50914vdD = (AbstractC50914vdD) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.QhYuFg, this, true);
        this.OLrzqt = abstractC50914vdD;
        AbstractC50914vdD abstractC50914vdD2 = null;
        if (abstractC50914vdD == null) {
            Intrinsics.gEmmrt("");
            abstractC50914vdD = null;
        }
        C54984xbQ c54984xbQ = abstractC50914vdD.KWHzl;
        c54984xbQ.setOnClickListener(new StateListAnimator(c54984xbQ, 1000L, this));
        AbstractC50914vdD abstractC50914vdD3 = this.OLrzqt;
        if (abstractC50914vdD3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50914vdD2 = abstractC50914vdD3;
        }
        C54984xbQ c54984xbQ2 = abstractC50914vdD2.OLrzqt;
        c54984xbQ2.setOnClickListener(new Activity(c54984xbQ2, 1000L, this));
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final void setFirstSelect(boolean z) {
        AbstractC50914vdD abstractC50914vdD = this.OLrzqt;
        AbstractC50914vdD abstractC50914vdD2 = null;
        if (abstractC50914vdD == null) {
            Intrinsics.gEmmrt("");
            abstractC50914vdD = null;
        }
        abstractC50914vdD.KWHzl.setSelectedStyle(z, 3);
        AbstractC50914vdD abstractC50914vdD3 = this.OLrzqt;
        if (abstractC50914vdD3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50914vdD2 = abstractC50914vdD3;
        }
        abstractC50914vdD2.OLrzqt.setSelectedStyle(!z, 3);
    }

    public final void setTabText(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC50914vdD abstractC50914vdD = this.OLrzqt;
        AbstractC50914vdD abstractC50914vdD2 = null;
        if (abstractC50914vdD == null) {
            Intrinsics.gEmmrt("");
            abstractC50914vdD = null;
        }
        abstractC50914vdD.KWHzl.setText(str);
        AbstractC50914vdD abstractC50914vdD3 = this.OLrzqt;
        if (abstractC50914vdD3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50914vdD2 = abstractC50914vdD3;
        }
        abstractC50914vdD2.OLrzqt.setText(str2);
    }

    public static /* synthetic */ void refreshTabStyle$default(C52864waf c52864waf, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c52864waf.OLrzqt(i, i2);
    }

    public final void OLrzqt(final int i, final int i2) {
        AbstractC50914vdD abstractC50914vdD = null;
        if (!C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(i), (java.lang.Object) 0)) {
            AbstractC50914vdD abstractC50914vdD2 = this.OLrzqt;
            if (abstractC50914vdD2 == null) {
                Intrinsics.gEmmrt("");
                abstractC50914vdD2 = null;
            }
            java.lang.CharSequence text = abstractC50914vdD2.KWHzl.getText();
            if (text == null) {
                text = "";
            }
            AbstractC50914vdD abstractC50914vdD3 = this.OLrzqt;
            if (abstractC50914vdD3 == null) {
                Intrinsics.gEmmrt("");
                abstractC50914vdD3 = null;
            }
            abstractC50914vdD3.KWHzl.setText(C33061mpO.setupSpanStyles$default(C33129mqd.gEmmrt(new java.lang.StringBuilder(text)), new java.lang.String[]{C33129mqd.gEmmrt(text)}, 0, null, false, new Function1() { // from class: o.wai
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52864waf.AEQbTJ(this.copydefault, i, (java.util.List) obj);
                }
            }, 14, null));
        }
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(i2), (java.lang.Object) 0)) {
            return;
        }
        AbstractC50914vdD abstractC50914vdD4 = this.OLrzqt;
        if (abstractC50914vdD4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50914vdD4 = null;
        }
        java.lang.CharSequence text2 = abstractC50914vdD4.OLrzqt.getText();
        if (text2 == null) {
            text2 = "";
        }
        AbstractC50914vdD abstractC50914vdD5 = this.OLrzqt;
        if (abstractC50914vdD5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50914vdD = abstractC50914vdD5;
        }
        abstractC50914vdD.OLrzqt.setText(C33061mpO.setupSpanStyles$default(C33129mqd.gEmmrt(new java.lang.StringBuilder(text2)), new java.lang.String[]{C33129mqd.gEmmrt(text2)}, 0, null, false, new Function1() { // from class: o.wag
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52864waf.KWHzl(this.AEQbTJ, i2, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit AEQbTJ(C52864waf c52864waf, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c52864waf.getContext(), i));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52864waf c52864waf, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c52864waf.getContext(), i));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.waf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C52864waf KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52864waf c52864waf) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c52864waf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C54984xbQ c54984xbQ = (C54984xbQ) this.OLrzqt;
                this.KWHzl.KWHzl.invoke();
                c54984xbQ.setSelectedStyle(true, 3);
                AbstractC50914vdD abstractC50914vdD = this.KWHzl.OLrzqt;
                if (abstractC50914vdD == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50914vdD = null;
                }
                abstractC50914vdD.KWHzl.setSelectedStyle(false, 3);
            }
        }
    }

    /* JADX INFO: renamed from: o.waf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C52864waf OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52864waf c52864waf) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c52864waf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C54984xbQ c54984xbQ = (C54984xbQ) this.EZpvd;
                this.OLrzqt.EZpvd.invoke();
                c54984xbQ.setSelectedStyle(true, 3);
                AbstractC50914vdD abstractC50914vdD = this.OLrzqt.OLrzqt;
                if (abstractC50914vdD == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50914vdD = null;
                }
                abstractC50914vdD.OLrzqt.setSelectedStyle(false, 3);
            }
        }
    }
}
