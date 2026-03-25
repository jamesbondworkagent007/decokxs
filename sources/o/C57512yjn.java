package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.bumptech.glide.Glide;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57512yjn extends ConstraintLayout {
    public ViewTreeObserver.OnGlobalLayoutListener OLrzqt;
    public final C57446yia copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57512yjn(@NotNull android.content.Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57512yjn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57512yjn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(android.content.Context, android.util.AttributeSet, int, boolean):void (m)] (LINE:39) call: o.yjn.<init>(android.content.Context, android.util.AttributeSet, int, boolean):void type: THIS */
    public /* synthetic */ C57512yjn(android.content.Context context, android.util.AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57512yjn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57446yia c57446yiaEZpvd = C57446yia.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57446yiaEZpvd, "");
        this.copydefault = c57446yiaEZpvd;
        if (z) {
            setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
        } else {
            setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        }
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: renamed from: o.yjn$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity {
        public final boolean AEQbTJ;
        public final java.lang.Integer EZpvd;
        public final java.lang.CharSequence KWHzl;
        public final java.lang.CharSequence OLrzqt;
        public Function0<Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, null, false, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yjn$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.CharSequence charSequence2, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                charSequence = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                num = activity.EZpvd;
            }
            java.lang.Integer num2 = num;
            if ((i & 4) != 0) {
                charSequence2 = activity.KWHzl;
            }
            java.lang.CharSequence charSequence3 = charSequence2;
            if ((i & 8) != 0) {
                z = activity.AEQbTJ;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                function0 = activity.copydefault;
            }
            return activity.KWHzl(charSequence, num2, charSequence3, z2, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.CharSequence charSequence, @androidx.annotation.ColorInt java.lang.Integer num, @NotNull java.lang.CharSequence charSequence2, boolean z, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            return new Activity(charSequence, num, charSequence2, z, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            java.lang.Integer num = this.EZpvd;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = java.lang.Boolean.hashCode(this.AEQbTJ);
            Function0<Unit> function0 = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.CharSequence charSequence = this.OLrzqt;
            java.lang.Integer num = this.EZpvd;
            java.lang.CharSequence charSequence2 = this.KWHzl;
            return "TitleBean(title=" + ((java.lang.Object) charSequence) + ", titleColor=" + num + ", titleTag=" + ((java.lang.Object) charSequence2) + ", isClickable=" + this.AEQbTJ + ", clickCallback=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.CharSequence charSequence, @androidx.annotation.ColorInt java.lang.Integer num, @NotNull java.lang.CharSequence charSequence2, boolean z, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            this.OLrzqt = charSequence;
            this.EZpvd = num;
            this.KWHzl = charSequence2;
            this.AEQbTJ = z;
            this.copydefault = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.CharSequence))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.CharSequence) : (""))
  (wrap:boolean:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r9v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.CharSequence, java.lang.Integer, java.lang.CharSequence, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:69) call: o.yjn.Activity.<init>(java.lang.CharSequence, java.lang.Integer, java.lang.CharSequence, boolean, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ Activity(java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.CharSequence charSequence2, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : charSequence, (i & 2) != 0 ? null : num, (i & 4) == 0 ? charSequence2 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : function0);
        }
    }

    /* JADX INFO: renamed from: o.yjn$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription {
        public final android.graphics.drawable.Drawable AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;
        public final java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, 0, 0, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i, int i2, int i3, java.lang.Object obj2) {
            if ((i3 & 1) != 0) {
                obj = taskDescription.copydefault;
            }
            if ((i3 & 2) != 0) {
                drawable = taskDescription.AEQbTJ;
            }
            if ((i3 & 4) != 0) {
                i = taskDescription.KWHzl;
            }
            if ((i3 & 8) != 0) {
                i2 = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(obj, drawable, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i, int i2) {
            return new TaskDescription(obj, drawable, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && this.KWHzl == taskDescription.KWHzl && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Object obj = this.copydefault;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            android.graphics.drawable.Drawable drawable = this.AEQbTJ;
            return (((((iHashCode * 31) + (drawable != null ? drawable.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IconBean(icon=" + this.copydefault + ", iconDefault=" + this.AEQbTJ + ", iconSize=" + this.KWHzl + ", roundedRadius=" + this.EZpvd + ")";
        }

        public TaskDescription(java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i, int i2) {
            this.copydefault = obj;
            this.AEQbTJ = drawable;
            this.KWHzl = i;
            this.EZpvd = i2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r3v0 android.graphics.drawable.Drawable))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (32 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0018: INVOKE (16.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2px$default(float, android.content.Context, int, java.lang.Object):int A[MD:(float, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:87)) : (r5v0 int))
 A[MD:(java.lang.Object, android.graphics.drawable.Drawable, int, int):void (m)] (LINE:83) call: o.yjn.TaskDescription.<init>(java.lang.Object, android.graphics.drawable.Drawable, int, int):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : obj, (i3 & 2) != 0 ? null : drawable, (i3 & 4) != 0 ? 32 : i, (i3 & 8) != 0 ? C55298xhM.dp2px$default(16.0f, null, 1, null) : i2);
        }
    }

    /* JADX INFO: renamed from: o.yjn$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator {
        public Function0<Unit> AEQbTJ;
        public final java.lang.CharSequence EZpvd;
        public final java.lang.CharSequence KWHzl;
        public final java.lang.CharSequence OLrzqt;
        public final TaskDescription copydefault;
        public final java.lang.CharSequence gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yjn$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, TaskDescription taskDescription, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                charSequence = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                charSequence2 = stateListAnimator.OLrzqt;
            }
            java.lang.CharSequence charSequence5 = charSequence2;
            if ((i & 4) != 0) {
                charSequence3 = stateListAnimator.KWHzl;
            }
            java.lang.CharSequence charSequence6 = charSequence3;
            if ((i & 8) != 0) {
                charSequence4 = stateListAnimator.gEmmrt;
            }
            java.lang.CharSequence charSequence7 = charSequence4;
            if ((i & 16) != 0) {
                taskDescription = stateListAnimator.copydefault;
            }
            TaskDescription taskDescription2 = taskDescription;
            if ((i & 32) != 0) {
                function0 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.EZpvd(charSequence, charSequence5, charSequence6, charSequence7, taskDescription2, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, @NotNull java.lang.CharSequence charSequence4, TaskDescription taskDescription, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            return new StateListAnimator(charSequence, charSequence2, charSequence3, charSequence4, taskDescription, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<Unit> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = this.gEmmrt.hashCode();
            TaskDescription taskDescription = this.copydefault;
            int iHashCode5 = taskDescription == null ? 0 : taskDescription.hashCode();
            Function0<Unit> function0 = this.AEQbTJ;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (function0 != null ? function0.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.lang.CharSequence charSequence = this.EZpvd;
            java.lang.CharSequence charSequence2 = this.OLrzqt;
            java.lang.CharSequence charSequence3 = this.KWHzl;
            java.lang.CharSequence charSequence4 = this.gEmmrt;
            return "ContentBean(mainContent1=" + ((java.lang.Object) charSequence) + ", mainContent2=" + ((java.lang.Object) charSequence2) + ", contentTag=" + ((java.lang.Object) charSequence3) + ", subContent=" + ((java.lang.Object) charSequence4) + ", contentIcon=" + this.copydefault + ", onContentIconClick=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, @NotNull java.lang.CharSequence charSequence4, TaskDescription taskDescription, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(charSequence3, "");
            Intrinsics.checkNotNullParameter(charSequence4, "");
            this.EZpvd = charSequence;
            this.OLrzqt = charSequence2;
            this.KWHzl = charSequence3;
            this.gEmmrt = charSequence4;
            this.copydefault = taskDescription;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.CharSequence) : (""))
  (wrap:o.yjn$TaskDescription:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.yjn$TaskDescription) : (r9v0 o.yjn$TaskDescription))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r10v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, o.yjn$TaskDescription, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:99) call: o.yjn.StateListAnimator.<init>(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, o.yjn$TaskDescription, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4, TaskDescription taskDescription, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : charSequence, (i & 2) != 0 ? "" : charSequence2, (i & 4) != 0 ? "" : charSequence3, (i & 8) == 0 ? charSequence4 : "", (i & 16) != 0 ? null : taskDescription, (i & 32) != 0 ? null : function0);
        }
    }

    /* JADX INFO: renamed from: o.yjn$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        public final TaskDescription AEQbTJ;
        public final Activity EZpvd;
        public final java.lang.CharSequence OLrzqt;
        public final StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, Activity activity, TaskDescription taskDescription, StateListAnimator stateListAnimator, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activity = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                taskDescription = actionBar.AEQbTJ;
            }
            if ((i & 4) != 0) {
                stateListAnimator = actionBar.copydefault;
            }
            if ((i & 8) != 0) {
                charSequence = actionBar.OLrzqt;
            }
            return actionBar.AEQbTJ(activity, taskDescription, stateListAnimator, charSequence);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(Activity activity, TaskDescription taskDescription, StateListAnimator stateListAnimator, java.lang.CharSequence charSequence) {
            return new ActionBar(activity, taskDescription, stateListAnimator, charSequence);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Activity activity = this.EZpvd;
            int iHashCode = activity == null ? 0 : activity.hashCode();
            TaskDescription taskDescription = this.AEQbTJ;
            int iHashCode2 = taskDescription == null ? 0 : taskDescription.hashCode();
            StateListAnimator stateListAnimator = this.copydefault;
            int iHashCode3 = stateListAnimator == null ? 0 : stateListAnimator.hashCode();
            java.lang.CharSequence charSequence = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (charSequence != null ? charSequence.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TXAssetBean(titleBean=" + this.EZpvd + ", iconBean=" + this.AEQbTJ + ", mainContentBean=" + this.copydefault + ", secondaryContent=" + ((java.lang.Object) this.OLrzqt) + ")";
        }

        public ActionBar(Activity activity, TaskDescription taskDescription, StateListAnimator stateListAnimator, java.lang.CharSequence charSequence) {
            this.EZpvd = activity;
            this.AEQbTJ = taskDescription;
            this.copydefault = stateListAnimator;
            this.OLrzqt = charSequence;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:o.yjn$Activity:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.yjn$Activity) : (r2v0 o.yjn$Activity))
  (wrap:o.yjn$TaskDescription:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.yjn$TaskDescription) : (r3v0 o.yjn$TaskDescription))
  (wrap:o.yjn$StateListAnimator:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.yjn$StateListAnimator) : (r4v0 o.yjn$StateListAnimator))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r5v0 java.lang.CharSequence))
 A[MD:(o.yjn$Activity, o.yjn$TaskDescription, o.yjn$StateListAnimator, java.lang.CharSequence):void (m)] (LINE:115) call: o.yjn.ActionBar.<init>(o.yjn$Activity, o.yjn$TaskDescription, o.yjn$StateListAnimator, java.lang.CharSequence):void type: THIS */
        public /* synthetic */ ActionBar(Activity activity, TaskDescription taskDescription, StateListAnimator stateListAnimator, java.lang.CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : activity, (i & 2) != 0 ? null : taskDescription, (i & 4) != 0 ? null : stateListAnimator, (i & 8) != 0 ? null : charSequence);
        }
    }

    public final C57479yjG KWHzl() {
        C57479yjG c57479yjG = this.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c57479yjG, "");
        return c57479yjG;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.copydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setData(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        OLrzqt(actionBar.EZpvd());
        copydefault(actionBar.KWHzl());
        copydefault(actionBar.AEQbTJ());
        copydefault(actionBar.OLrzqt());
    }

    private final void OLrzqt(final Activity activity) {
        if (activity == null || activity.AEQbTJ().length() == 0) {
            this.copydefault.djBIcL.setVisibility(8);
            this.copydefault.copydefault.setVisibility(8);
            return;
        }
        this.copydefault.djBIcL.setVisibility(0);
        if (activity.EZpvd() != null) {
            this.copydefault.djBIcL.setTextColor(activity.EZpvd().intValue());
        }
        if (activity.copydefault().length() > 0) {
            this.copydefault.copydefault.setVisibility(0);
            this.copydefault.copydefault.setText(activity.copydefault());
        } else {
            this.copydefault.copydefault.setVisibility(8);
        }
        this.copydefault.djBIcL.setOnClickListener(null);
        if (activity.KWHzl() && activity.OLrzqt() != null) {
            this.copydefault.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.yjl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C57512yjn.setupTitle$lambda$0(activity, view);
                }
            });
            this.copydefault.djBIcL.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            android.widget.TextView textView = this.copydefault.djBIcL;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            java.lang.Integer numEZpvd = activity.EZpvd();
            C57494yjV c57494yjV = new C57494yjV(numEZpvd != null ? numEZpvd.intValue() : C33070mpX.copydefault(C52761wXj.Activity.QwvEab), activity.AEQbTJ().toString());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(activity.AEQbTJ());
            spannableStringBuilder.setSpan(c57494yjV, length, spannableStringBuilder.length(), 17);
            textView.setText(new android.text.SpannedString(spannableStringBuilder));
            return;
        }
        this.copydefault.djBIcL.setText(activity.AEQbTJ());
    }

    public static final void setupTitle$lambda$0(Activity activity, android.view.View view) {
        Function0<Unit> function0OLrzqt = activity.OLrzqt();
        if (function0OLrzqt != null) {
            function0OLrzqt.invoke();
        }
    }

    private final void copydefault(TaskDescription taskDescription) {
        java.lang.String str;
        if (taskDescription == null || (taskDescription.copydefault() == null && taskDescription.KWHzl() == null)) {
            this.copydefault.OLrzqt.setVisibility(8);
            return;
        }
        this.copydefault.OLrzqt.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.copydefault.OLrzqt.getLayoutParams();
        layoutParams.width = C55298xhM.dpInt$default(taskDescription.OLrzqt(), (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.height = C55298xhM.dpInt$default(taskDescription.OLrzqt(), (android.content.Context) null, 1, (java.lang.Object) null);
        this.copydefault.OLrzqt.setLayoutParams(layoutParams);
        if (taskDescription.copydefault() instanceof java.lang.String) {
            C5448Sc c5448ScOLrzqt = C57491yjS.OLrzqt.OLrzqt((java.lang.String) taskDescription.copydefault());
            java.lang.String str2 = (java.lang.String) taskDescription.copydefault();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
                str = "SVG:" + taskDescription.copydefault();
            } else {
                str = (java.lang.String) taskDescription.copydefault();
            }
            Glide.KWHzl(this).EZpvd(str).OLrzqt((RX<?>) c5448ScOLrzqt).EZpvd(taskDescription.KWHzl()).OLrzqt(taskDescription.KWHzl()).AEQbTJ(taskDescription.KWHzl()).AEQbTJ(new C5405Ql(), new RoundedCornersTransformation(taskDescription.AEQbTJ(), 0)).EZpvd(this.copydefault.OLrzqt);
            return;
        }
        Glide.KWHzl(this).KWHzl(taskDescription.copydefault()).EZpvd(taskDescription.KWHzl()).OLrzqt(taskDescription.KWHzl()).AEQbTJ(taskDescription.KWHzl()).AEQbTJ(new C5405Ql(), new RoundedCornersTransformation(taskDescription.AEQbTJ(), 0)).EZpvd(this.copydefault.OLrzqt);
    }

    private final void copydefault(final StateListAnimator stateListAnimator) {
        if (stateListAnimator == null) {
            this.copydefault.gEmmrt.setVisibility(8);
            this.copydefault.KWHzl.setVisibility(8);
            this.copydefault.AYXKKw.setVisibility(8);
            this.copydefault.AhwBna.setVisibility(8);
            this.copydefault.EZpvd.setVisibility(8);
            this.copydefault.EZpvd.setOnClickListener(null);
            return;
        }
        if (stateListAnimator.AEQbTJ().length() > 0 || stateListAnimator.OLrzqt().length() > 0) {
            this.copydefault.gEmmrt.setVisibility(0);
            this.copydefault.gEmmrt.copydefault(16.0f, 28.0f);
            this.copydefault.gEmmrt.setMinTextWidth(80);
            C57479yjG c57479yjG = this.copydefault.gEmmrt;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (stateListAnimator.AEQbTJ().length() > 0) {
                arrayList.add(stateListAnimator.AEQbTJ());
            }
            if (stateListAnimator.OLrzqt().length() > 0) {
                if (stateListAnimator.AEQbTJ().length() <= 0) {
                    arrayList.add(stateListAnimator.OLrzqt());
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    spannableStringBuilder.append(stateListAnimator.OLrzqt());
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder.length(), 17);
                    arrayList.add(new android.text.SpannedString(spannableStringBuilder));
                }
            }
            C57479yjG.setTexts$default(c57479yjG, arrayList, null, 2, null);
        } else {
            this.copydefault.gEmmrt.setVisibility(8);
        }
        if (stateListAnimator.EZpvd().length() > 0) {
            this.copydefault.KWHzl.setVisibility(0);
            this.copydefault.KWHzl.setText(stateListAnimator.EZpvd());
            EZpvd(true);
        } else {
            this.copydefault.KWHzl.setVisibility(8);
            EZpvd(false);
        }
        if (stateListAnimator.AYXKKw().length() > 0) {
            if (stateListAnimator.EZpvd().length() > 0) {
                this.copydefault.AhwBna.setVisibility(0);
                this.copydefault.AhwBna.setText(stateListAnimator.AYXKKw());
                this.copydefault.AYXKKw.setVisibility(8);
            } else {
                this.copydefault.AYXKKw.setVisibility(0);
                this.copydefault.AYXKKw.setText(stateListAnimator.AYXKKw());
                this.copydefault.AhwBna.setVisibility(8);
                OLrzqt();
            }
        } else {
            this.copydefault.AYXKKw.setVisibility(8);
            this.copydefault.AhwBna.setVisibility(8);
        }
        this.copydefault.EZpvd.setOnClickListener(null);
        if (stateListAnimator.copydefault() != null) {
            this.copydefault.EZpvd.setVisibility(0);
            int iDpInt$default = C55298xhM.dpInt$default(stateListAnimator.copydefault().OLrzqt(), (android.content.Context) null, 1, (java.lang.Object) null);
            ViewGroup.LayoutParams layoutParams = this.copydefault.EZpvd.getLayoutParams();
            layoutParams.width = iDpInt$default;
            layoutParams.height = iDpInt$default;
            this.copydefault.EZpvd.setLayoutParams(layoutParams);
            Glide.KWHzl(this).KWHzl(stateListAnimator.copydefault().copydefault()).EZpvd(stateListAnimator.copydefault().KWHzl()).OLrzqt(stateListAnimator.copydefault().KWHzl()).EZpvd(this.copydefault.EZpvd);
            if (stateListAnimator.KWHzl() != null) {
                this.copydefault.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.yjm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C57512yjn.setupContent$lambda$5(stateListAnimator, view);
                    }
                });
            }
            KWHzl(true);
            return;
        }
        this.copydefault.EZpvd.setVisibility(8);
        KWHzl(false);
    }

    public static final void setupContent$lambda$5(StateListAnimator stateListAnimator, android.view.View view) {
        Function0<Unit> function0KWHzl = stateListAnimator.KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
    }

    public final void OLrzqt() {
        EZpvd();
        this.OLrzqt = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.yjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C57512yjn.OLrzqt(this.EZpvd);
            }
        };
        this.copydefault.gEmmrt.getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
    }

    public static final void OLrzqt(C57512yjn c57512yjn) {
        C57479yjG c57479yjG = c57512yjn.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c57479yjG, "");
        int iApplyDimension = (int) android.util.TypedValue.applyDimension(2, (c57479yjG.EZpvd() - c57479yjG.KWHzl()) / 3.0f, c57512yjn.getContext().getResources().getDisplayMetrics());
        ViewGroup.LayoutParams layoutParams = c57512yjn.copydefault.AYXKKw.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || marginLayoutParams.bottomMargin == iApplyDimension) {
            return;
        }
        marginLayoutParams.bottomMargin = iApplyDimension;
        c57512yjn.copydefault.AYXKKw.setLayoutParams(marginLayoutParams);
    }

    public final void EZpvd() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.OLrzqt;
        if (onGlobalLayoutListener == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = this.copydefault.gEmmrt.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.OLrzqt = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EZpvd();
    }

    public final void KWHzl(boolean z) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        if (z) {
            constraintSet.connect(this.copydefault.gEmmrt.getId(), 7, this.copydefault.EZpvd.getId(), 6);
        } else {
            constraintSet.connect(this.copydefault.gEmmrt.getId(), 7, this.copydefault.AYXKKw.getId(), 6);
        }
        constraintSet.applyTo(this);
    }

    public final void EZpvd(boolean z) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        if (z) {
            constraintSet.connect(this.copydefault.gEmmrt.getId(), 7, this.copydefault.KWHzl.getId(), 6);
        } else {
            constraintSet.connect(this.copydefault.gEmmrt.getId(), 7, this.copydefault.AYXKKw.getId(), 6);
        }
        constraintSet.applyTo(this);
    }

    private final void copydefault(java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.copydefault.valueOf.setVisibility(8);
        } else {
            this.copydefault.valueOf.setVisibility(0);
            this.copydefault.valueOf.setText(charSequence);
        }
    }
}
