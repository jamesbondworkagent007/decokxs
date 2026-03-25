package o;

import android.graphics.Outline;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mIU extends ConstraintLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final mFV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIU(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.mIU.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ mIU(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mIU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        mFV mfvOLrzqt = mFV.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(mfvOLrzqt, "");
        this.copydefault = mfvOLrzqt;
    }

    public static /* synthetic */ void setupAvatarRow$default(mIU miu, java.util.List list, TaskDescription taskDescription, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            taskDescription = new TaskDescription(0, 0, 0, 0, 15, null);
        }
        miu.setupAvatarRow(list, taskDescription);
    }

    public final void setupAvatarRow(@NotNull java.util.List<java.lang.String> list, @NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (list.size() >= 4) {
            list = CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends java.lang.String>) CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 4), "");
        }
        mIT mit = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(mit, "");
        EZpvd(mit, list, taskDescription);
    }

    public final void EZpvd(android.widget.LinearLayout linearLayout, java.util.List<java.lang.String> list, TaskDescription taskDescription) {
        linearLayout.removeAllViews();
        int iAEQbTJ = AEQbTJ(taskDescription.AEQbTJ());
        int iAEQbTJ2 = AEQbTJ(taskDescription.KWHzl());
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            linearLayout.addView(OLrzqt(i, (java.lang.String) obj, iAEQbTJ, iAEQbTJ2, taskDescription));
            i++;
        }
        linearLayout.requestLayout();
    }

    public final android.widget.ImageView OLrzqt(int i, java.lang.String str, int i2, int i3, TaskDescription taskDescription) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        if (i > 0) {
            layoutParams.leftMargin = -i3;
        }
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (str.length() == 0) {
            imageView.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.GhqvEQ));
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
            setIconPadding(imageView, taskDescription.copydefault());
            setIcon(imageView, taskDescription.OLrzqt());
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new Application());
        } else {
            C33054mpH.KWHzl(imageView, str);
        }
        return imageView;
    }

    public static final class Application extends android.view.ViewOutlineProvider {
        public Application() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            int iAEQbTJ = mIU.this.AEQbTJ(24);
            outline.setRoundRect(0, 0, iAEQbTJ, iAEQbTJ, iAEQbTJ / 2.0f);
        }
    }

    public final void setIconPadding(android.widget.ImageView imageView, int i) {
        int iAEQbTJ = AEQbTJ(i);
        imageView.setPadding(iAEQbTJ, iAEQbTJ, iAEQbTJ, iAEQbTJ);
    }

    public final void setIcon(android.widget.ImageView imageView, int i) {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPOZOJIj);
        if (drawableKWHzl != null) {
            int iAEQbTJ = AEQbTJ(i);
            drawableKWHzl.setBounds(0, 0, iAEQbTJ, iAEQbTJ);
        } else {
            drawableKWHzl = null;
        }
        imageView.setImageDrawable(drawableKWHzl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AEQbTJ(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mIU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        public final int AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(0, 0, 0, 0, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = taskDescription.AEQbTJ;
            }
            if ((i5 & 2) != 0) {
                i2 = taskDescription.copydefault;
            }
            if ((i5 & 4) != 0) {
                i3 = taskDescription.EZpvd;
            }
            if ((i5 & 8) != 0) {
                i4 = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(i, i2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(int i, int i2, int i3, int i4) {
            return new TaskDescription(i, i2, i3, i4);
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
            return this.AEQbTJ == taskDescription.AEQbTJ && this.copydefault == taskDescription.copydefault && this.EZpvd == taskDescription.EZpvd && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AvatarRowConfig(imageSize=" + this.AEQbTJ + ", imageOverlapSpacing=" + this.copydefault + ", iconSize=" + this.EZpvd + ", iconPadding=" + this.KWHzl + ")";
        }

        public TaskDescription(int i, int i2, int i3, int i4) {
            this.AEQbTJ = i;
            this.copydefault = i2;
            this.EZpvd = i3;
            this.KWHzl = i4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (24 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (6 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (12 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (4 int) : (r4v0 int))
 A[MD:(int, int, int, int):void (m)] (LINE:122) call: o.mIU.TaskDescription.<init>(int, int, int, int):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 24 : i, (i5 & 2) != 0 ? 6 : i2, (i5 & 4) != 0 ? 12 : i3, (i5 & 8) != 0 ? 4 : i4);
        }
    }
}
