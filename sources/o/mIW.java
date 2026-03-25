package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mIW extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final mGD AEQbTJ;
    public mHV EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIW(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mIW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.mIW.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ mIW(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mIW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        mGD mgdOLrzqt = mGD.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(mgdOLrzqt, "");
        this.AEQbTJ = mgdOLrzqt;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mDC.LoaderManager.djBIcL);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(mDC.LoaderManager.AkhnZx);
        if (string != null) {
            mgdOLrzqt.AEQbTJ.setText(string);
        }
        setChipIcon(typedArrayObtainStyledAttributes.getInt(mDC.LoaderManager.DbNXlk, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(mDC.LoaderManager.valueOf, 0);
        ViewGroup.LayoutParams layoutParams = mgdOLrzqt.OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(dimensionPixelSize);
        mgdOLrzqt.OLrzqt.setLayoutParams(layoutParams2);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        mHV mhvApplyTouchFeedback$default = C31899mIa.applyTouchFeedback$default((ViewDataBinding) mgdOLrzqt, mgdOLrzqt.KWHzl, false, 0, 6, (java.lang.Object) null);
        mhvApplyTouchFeedback$default.EZpvd(false);
        this.EZpvd = mhvApplyTouchFeedback$default;
    }

    public final void setChipText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ.setText(str);
    }

    public final void setOnClickListener(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        final android.view.View root = this.AEQbTJ.getRoot();
        root.setOnClickListener(new View.OnClickListener() { // from class: o.mIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mIW.KWHzl(root, function0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(android.view.View view, final Function0 function0, android.view.View view2) {
        view.post(new java.lang.Runnable() { // from class: o.mJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                mIW.OLrzqt(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function0 function0) {
        function0.invoke();
    }

    public final void setOnSingleClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.view.View root = this.AEQbTJ.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, root, function0));
    }

    public static final class Application implements java.lang.Runnable {
        public final /* synthetic */ Function0<Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.EZpvd.invoke();
        }
    }

    public final void setChipIcon(int i) {
        int i2;
        android.widget.ImageView imageView = this.AEQbTJ.OLrzqt;
        switch (i) {
            case 0:
                i2 = C52761wXj.TaskDescription.QOeQqh;
                break;
            case 1:
                i2 = C52761wXj.TaskDescription.nriSR;
                break;
            case 2:
                i2 = C52761wXj.TaskDescription.QVMIlx;
                break;
            case 3:
                i2 = C52761wXj.TaskDescription.aPFruk;
                break;
            case 4:
                i2 = C52761wXj.TaskDescription.FQNKFG;
                break;
            case 5:
                i2 = C52761wXj.TaskDescription.aeJQwa;
                break;
            case 6:
                i2 = C52761wXj.TaskDescription.dUDNAs;
                break;
            case 7:
                i2 = C52761wXj.TaskDescription.QSLkRj;
                break;
            default:
                return;
        }
        imageView.setImageResource(i2);
    }

    public final void setChipImageUrl(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            android.widget.ImageView imageView = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.KWHzl(imageView2, str);
            return;
        }
        android.widget.ImageView imageView3 = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
    }

    public final void setTouchFeedbackEnabled(boolean z) {
        mHV mhv = this.EZpvd;
        if (mhv != null) {
            mhv.EZpvd(z);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mIW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.view.View view2, Function0 function0) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = view2;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.post(new Application(this.EZpvd));
            }
        }
    }
}
