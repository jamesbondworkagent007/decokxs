package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57524yjz extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final C57454yii copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57524yjz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57524yjz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.yjz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57524yjz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57524yjz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57454yii c57454yiiKWHzl = C57454yii.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57454yiiKWHzl, "");
        this.copydefault = c57454yiiKWHzl;
    }

    /* JADX INFO: renamed from: o.yjz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yjz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.yjz$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        public final java.lang.CharSequence KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                charSequence = actionBar.KWHzl;
            }
            return actionBar.copydefault(charSequence);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            return new ActionBar(charSequence);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TitleTextItem(text=" + ((java.lang.Object) this.KWHzl) + ")";
        }

        public ActionBar(@NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.KWHzl = charSequence;
        }
    }

    /* JADX INFO: renamed from: o.yjz$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application {
        public final android.graphics.drawable.Drawable EZpvd;
        public final int KWHzl;
        public final java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i, int i2, java.lang.Object obj2) {
            if ((i2 & 1) != 0) {
                obj = application.copydefault;
            }
            if ((i2 & 2) != 0) {
                drawable = application.EZpvd;
            }
            if ((i2 & 4) != 0) {
                i = application.KWHzl;
            }
            return application.EZpvd(obj, drawable, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.drawable.Drawable AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i) {
            return new Application(obj, drawable, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Object obj = this.copydefault;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            android.graphics.drawable.Drawable drawable = this.EZpvd;
            return (((iHashCode * 31) + (drawable != null ? drawable.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TXTitleIconBean(icon=" + this.copydefault + ", iconDefault=" + this.EZpvd + ", iconSize=" + this.KWHzl + ")";
        }

        public Application(java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i) {
            this.copydefault = obj;
            this.EZpvd = drawable;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r3v0 android.graphics.drawable.Drawable))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (72 int) : (r4v0 int))
 A[MD:(java.lang.Object, android.graphics.drawable.Drawable, int):void (m)] (LINE:53) call: o.yjz.Application.<init>(java.lang.Object, android.graphics.drawable.Drawable, int):void type: THIS */
        public /* synthetic */ Application(java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? null : drawable, (i2 & 4) != 0 ? 72 : i);
        }
    }

    /* JADX INFO: renamed from: o.yjz$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription {
        public final Application EZpvd;
        public final java.lang.CharSequence KWHzl;
        public final java.util.List<ActionBar> OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, null, null, 0, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yjz$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.util.List list, java.lang.CharSequence charSequence, Application application, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = taskDescription.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                charSequence = taskDescription.KWHzl;
            }
            if ((i2 & 4) != 0) {
                application = taskDescription.EZpvd;
            }
            if ((i2 & 8) != 0) {
                i = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(list, charSequence, application, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionBar> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull java.util.List<ActionBar> list, @NotNull java.lang.CharSequence charSequence, Application application, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return new TaskDescription(list, charSequence, application, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
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
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.copydefault == taskDescription.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            Application application = this.EZpvd;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (application == null ? 0 : application.hashCode())) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            java.util.List<ActionBar> list = this.OLrzqt;
            java.lang.CharSequence charSequence = this.KWHzl;
            return "TXTitleInfoBean(titleItems=" + list + ", subtitle=" + ((java.lang.Object) charSequence) + ", iconBean=" + this.EZpvd + ", textAlign=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull java.util.List<ActionBar> list, @NotNull java.lang.CharSequence charSequence, Application application, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.OLrzqt = list;
            this.KWHzl = charSequence;
            this.EZpvd = application;
            this.copydefault = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:67)) : (r1v0 java.util.List))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.CharSequence))
  (wrap:o.yjz$Application:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.yjz$Application) : (r3v0 o.yjz$Application))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.util.List<o.yjz$ActionBar>, java.lang.CharSequence, o.yjz$Application, int):void (m)] (LINE:66) call: o.yjz.TaskDescription.<init>(java.util.List, java.lang.CharSequence, o.yjz$Application, int):void type: THIS */
        public /* synthetic */ TaskDescription(java.util.List list, java.lang.String str, Application application, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? yDY.AhwBna() : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : application, (i2 & 8) != 0 ? 0 : i);
        }
    }

    public final void setData(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        setTitleText(taskDescription.AEQbTJ(), taskDescription.copydefault());
        setSubtitleText(taskDescription.KWHzl(), taskDescription.copydefault());
        Application applicationEZpvd = taskDescription.EZpvd();
        if (applicationEZpvd != null) {
            setIconImage(applicationEZpvd.EZpvd(), applicationEZpvd.AEQbTJ(), applicationEZpvd.copydefault());
        } else {
            this.copydefault.OLrzqt.setVisibility(8);
        }
    }

    public final void setTitleText(java.util.List<ActionBar> list, int i) {
        this.copydefault.KWHzl.removeAllViews();
        if (list.isEmpty()) {
            this.copydefault.KWHzl.setVisibility(8);
            return;
        }
        this.copydefault.KWHzl.setVisibility(0);
        this.copydefault.KWHzl.copydefault(java.lang.Integer.valueOf(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null)), java.lang.Integer.valueOf(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null)), java.lang.Integer.valueOf(i == 1 ? 8388611 : 1));
        for (ActionBar actionBar : list) {
            if (actionBar.OLrzqt().length() > 0) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                appCompatTextView.setText(actionBar.OLrzqt());
                appCompatTextView.setIncludeFontPadding(false);
                appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.hDKMBd);
                appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                appCompatTextView.setGravity(i == 1 ? 8388611 : 17);
                this.copydefault.KWHzl.addView(appCompatTextView);
            }
        }
    }

    public final void setSubtitleText(java.lang.CharSequence charSequence, int i) {
        if (charSequence.length() == 0) {
            this.copydefault.EZpvd.setVisibility(8);
            return;
        }
        this.copydefault.EZpvd.setVisibility(0);
        this.copydefault.EZpvd.setText(charSequence);
        this.copydefault.EZpvd.setGravity(i == 1 ? TextAlign.LEFT : 17);
    }

    public final void setIconImage(java.lang.Object obj, android.graphics.drawable.Drawable drawable, int i) {
        if (obj == null && drawable == null) {
            this.copydefault.OLrzqt.setVisibility(8);
            return;
        }
        this.copydefault.OLrzqt.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.copydefault.OLrzqt.getLayoutParams();
        layoutParams.width = C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.height = C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null);
        this.copydefault.OLrzqt.setLayoutParams(layoutParams);
        Glide.KWHzl(this).KWHzl(obj).EZpvd(drawable).OLrzqt(drawable).EZpvd(this.copydefault.OLrzqt);
    }
}
