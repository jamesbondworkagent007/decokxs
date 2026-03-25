package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57516yjr extends ConstraintLayout {
    public final C57449yid copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57516yjr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57516yjr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.yjr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57516yjr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57516yjr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57449yid c57449yidAEQbTJ = C57449yid.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57449yidAEQbTJ, "");
        this.copydefault = c57449yidAEQbTJ;
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    /* JADX INFO: renamed from: o.yjr$StateListAnimator */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AhwBna;
        public final boolean EZpvd;
        public final boolean KWHzl;
        public final Function0<Unit> OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.CharSequence djBIcL;
        public final Function0<Unit> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, charSequence, str2, z, z2, str3, function0, function02);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && Intrinsics.EZpvd(this.djBIcL, stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && this.KWHzl == stateListAnimator.KWHzl && this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AhwBna.hashCode();
            java.lang.CharSequence charSequence = this.djBIcL;
            int iHashCode2 = charSequence == null ? 0 : charSequence.hashCode();
            java.lang.String str = this.copydefault;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            int iHashCode4 = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode5 = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.String str2 = this.AEQbTJ;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            Function0<Unit> function0 = this.gEmmrt;
            int iHashCode7 = function0 == null ? 0 : function0.hashCode();
            Function0<Unit> function02 = this.OLrzqt;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (function02 != null ? function02.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.String str = this.AhwBna;
            java.lang.CharSequence charSequence = this.djBIcL;
            return "FeeInfoBean(title=" + str + ", value=" + ((java.lang.Object) charSequence) + ", tag=" + this.copydefault + ", hasError=" + this.KWHzl + ", showArrow=" + this.EZpvd + ", freeGasContent=" + this.AEQbTJ + ", titleClickCallback=" + this.gEmmrt + ", clickCallback=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        public StateListAnimator(@NotNull java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AhwBna = str;
            this.djBIcL = charSequence;
            this.copydefault = str2;
            this.KWHzl = z;
            this.EZpvd = z2;
            this.AEQbTJ = str3;
            this.gEmmrt = function0;
            this.OLrzqt = function02;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r10v0 java.lang.CharSequence))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r13v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0026: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r15v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r16v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, java.lang.CharSequence, java.lang.String, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:37) call: o.yjr.StateListAnimator.<init>(java.lang.String, java.lang.CharSequence, java.lang.String, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : function0, (i & 128) == 0 ? function02 : null);
        }
    }

    public final void setData(@NotNull StateListAnimator stateListAnimator) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AEQbTJ(stateListAnimator.valueOf(), stateListAnimator.gEmmrt());
        android.widget.TextView textView = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, stateListAnimator.AhwBna());
        if (stateListAnimator.copydefault()) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.hrjNmC);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        this.copydefault.djBIcL.setTextColor(iCopydefault);
        AppCompatImageView appCompatImageView = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(stateListAnimator.OLrzqt() ? 0 : 8);
        C55251xgS c55251xgS = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C55307xhV.AEQbTJ(c55251xgS, stateListAnimator.EZpvd());
        C55251xgS c55251xgS2 = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        C55307xhV.AEQbTJ(c55251xgS2, stateListAnimator.KWHzl());
        AEQbTJ(stateListAnimator.AEQbTJ());
    }

    private final void AEQbTJ(java.lang.String str, final Function0<Unit> function0) {
        if (function0 == null) {
            this.copydefault.AhwBna.setText(str);
            this.copydefault.AhwBna.setOnClickListener(null);
            this.copydefault.AhwBna.setClickable(false);
            this.copydefault.AhwBna.setMovementMethod(null);
            return;
        }
        this.copydefault.AhwBna.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        AppCompatTextView appCompatTextView = this.copydefault.AhwBna;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        C57494yjV c57494yjV = new C57494yjV(C33070mpX.copydefault(C52761wXj.Activity.ORxRYg), str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(c57494yjV, length, spannableStringBuilder.length(), 17);
        appCompatTextView.setText(new android.text.SpannedString(spannableStringBuilder));
        this.copydefault.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.yjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }

    private final void AEQbTJ(Function0<Unit> function0) {
        if (function0 == null) {
            setOnClickListener(null);
            setClickable(false);
        } else {
            setOnClickListener(new Activity(this, 1000L, function0));
        }
    }

    /* JADX INFO: renamed from: o.yjr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }
}
