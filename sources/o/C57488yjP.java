package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57488yjP extends ConstraintLayout {
    public android.widget.ImageView EZpvd;
    public C55251xgS KWHzl;
    public android.widget.TextView OLrzqt;
    public C57483yjK copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57483yjK AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55251xgS copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageView(android.widget.ImageView imageView) {
        this.EZpvd = imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkTagView(C55251xgS c55251xgS) {
        this.KWHzl = c55251xgS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTitleHorizontalView(android.widget.TextView textView) {
        this.OLrzqt = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextView(C57483yjK c57483yjK) {
        this.copydefault = c57483yjK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57488yjP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C57406yhn.TaskDescription.djBIcL, (android.view.ViewGroup) this, true);
        this.EZpvd = (android.widget.ImageView) findViewById(C57406yhn.StateListAnimator.zsXlph);
        this.copydefault = (C57483yjK) findViewById(C57406yhn.StateListAnimator.DGOPHZDGOPHZ);
        this.KWHzl = (C55251xgS) findViewById(C57406yhn.StateListAnimator.RVsVBY);
        this.OLrzqt = (android.widget.TextView) findViewById(C57406yhn.StateListAnimator.DCUTEIdCUTEI);
    }

    public final void setOKTagOrButtonConstraint(int i) {
        if (i == 0) {
            android.widget.ImageView imageView = this.EZpvd;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C55251xgS c55251xgS = this.KWHzl;
            if (c55251xgS != null) {
                c55251xgS.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 1) {
            android.widget.ImageView imageView2 = this.EZpvd;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            C55251xgS c55251xgS2 = this.KWHzl;
            if (c55251xgS2 != null) {
                c55251xgS2.setVisibility(0);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        android.widget.ImageView imageView3 = this.EZpvd;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        C55251xgS c55251xgS3 = this.KWHzl;
        if (c55251xgS3 != null) {
            c55251xgS3.setVisibility(8);
        }
    }

    public final void setConstraintLayoutAttr(int i, int i2) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(i, 7, i2, 6);
        constraintSet.applyTo(this);
    }

    /* JADX INFO: renamed from: o.yjP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yjP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
