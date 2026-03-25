package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27130jpQ extends ConstraintLayout {
    public AbstractC23853iLt AEQbTJ;
    public View.OnClickListener EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.EZpvd = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27130jpQ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27130jpQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27130jpQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl(context, attributeSet, i);
    }

    public final void KWHzl(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        AbstractC23853iLt abstractC23853iLt = (AbstractC23853iLt) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C25493ixk.Activity.fGQ, this, true);
        this.AEQbTJ = abstractC23853iLt;
        if (abstractC23853iLt == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt = null;
        }
        android.widget.TextView textView = abstractC23853iLt.AEQbTJ;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
    }

    public final void setAddFoundsVisible(boolean z) {
        AbstractC23853iLt abstractC23853iLt = this.AEQbTJ;
        if (abstractC23853iLt == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt = null;
        }
        abstractC23853iLt.AEQbTJ.setVisibility(z ? 0 : 4);
    }

    public final void setData(@NotNull C25481ixY c25481ixY) {
        java.lang.String strLimitFmtNoZeroWithKMBMoreThanMillion$default;
        Intrinsics.checkNotNullParameter(c25481ixY, "");
        AbstractC23853iLt abstractC23853iLt = this.AEQbTJ;
        if (abstractC23853iLt == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt = null;
        }
        if (c25481ixY.EZpvd()) {
            return;
        }
        if (c25481ixY.AEQbTJ() == null || c25481ixY.AEQbTJ().getSecond().booleanValue()) {
            strLimitFmtNoZeroWithKMBMoreThanMillion$default = C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, c25481ixY.OLrzqt(), 6, 2, false, false, 24, null);
        } else {
            strLimitFmtNoZeroWithKMBMoreThanMillion$default = c25481ixY.AEQbTJ().getFirst();
        }
        android.widget.TextView textView = abstractC23853iLt.KWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C33069mpW.KWHzl(context, C25493ixk.FragmentManager.UeEOUB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", strLimitFmtNoZeroWithKMBMoreThanMillion$default), C56390yDp.OLrzqt("token", c25481ixY.KWHzl()))));
        post(new java.lang.Runnable() { // from class: o.jpO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27130jpQ.KWHzl(this.copydefault);
            }
        });
        abstractC23853iLt.AEQbTJ.setTag(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(C27130jpQ c27130jpQ) {
        c27130jpQ.AEQbTJ();
    }

    public final void AEQbTJ() {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        AbstractC23853iLt abstractC23853iLt = this.AEQbTJ;
        AbstractC23853iLt abstractC23853iLt2 = null;
        if (abstractC23853iLt == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt = null;
        }
        int width2 = abstractC23853iLt.AEQbTJ.getWidth();
        AbstractC23853iLt abstractC23853iLt3 = this.AEQbTJ;
        if (abstractC23853iLt3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt3 = null;
        }
        int width3 = abstractC23853iLt3.KWHzl.getWidth();
        AbstractC23853iLt abstractC23853iLt4 = this.AEQbTJ;
        if (abstractC23853iLt4 == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt4 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC23853iLt4.KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        if (width3 + width2 + ((ConstraintLayout.LayoutParams) layoutParams).getMarginEnd() > (width - paddingLeft) - paddingRight) {
            AbstractC23853iLt abstractC23853iLt5 = this.AEQbTJ;
            if (abstractC23853iLt5 == null) {
                Intrinsics.gEmmrt("");
                abstractC23853iLt5 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = abstractC23853iLt5.KWHzl.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
            layoutParams3.constrainedWidth = true;
            AbstractC23853iLt abstractC23853iLt6 = this.AEQbTJ;
            if (abstractC23853iLt6 == null) {
                Intrinsics.gEmmrt("");
                abstractC23853iLt6 = null;
            }
            layoutParams3.endToStart = abstractC23853iLt6.AEQbTJ.getId();
            layoutParams3.startToStart = 0;
            AbstractC23853iLt abstractC23853iLt7 = this.AEQbTJ;
            if (abstractC23853iLt7 == null) {
                Intrinsics.gEmmrt("");
                abstractC23853iLt7 = null;
            }
            ViewGroup.LayoutParams layoutParams4 = abstractC23853iLt7.AEQbTJ.getLayoutParams();
            Intrinsics.copydefault(layoutParams4, "");
            ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
            layoutParams5.startToEnd = -1;
            layoutParams5.endToEnd = 0;
            AbstractC23853iLt abstractC23853iLt8 = this.AEQbTJ;
            if (abstractC23853iLt8 == null) {
                Intrinsics.gEmmrt("");
                abstractC23853iLt8 = null;
            }
            abstractC23853iLt8.KWHzl.setLayoutParams(layoutParams3);
            AbstractC23853iLt abstractC23853iLt9 = this.AEQbTJ;
            if (abstractC23853iLt9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23853iLt2 = abstractC23853iLt9;
            }
            abstractC23853iLt2.AEQbTJ.setLayoutParams(layoutParams5);
            return;
        }
        AbstractC23853iLt abstractC23853iLt10 = this.AEQbTJ;
        if (abstractC23853iLt10 == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt10 = null;
        }
        ViewGroup.LayoutParams layoutParams6 = abstractC23853iLt10.KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams6, "");
        ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) layoutParams6;
        ((ViewGroup.MarginLayoutParams) layoutParams7).width = -2;
        layoutParams7.constrainedWidth = false;
        layoutParams7.endToStart = -1;
        layoutParams7.startToStart = 0;
        AbstractC23853iLt abstractC23853iLt11 = this.AEQbTJ;
        if (abstractC23853iLt11 == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt11 = null;
        }
        ViewGroup.LayoutParams layoutParams8 = abstractC23853iLt11.AEQbTJ.getLayoutParams();
        Intrinsics.copydefault(layoutParams8, "");
        ConstraintLayout.LayoutParams layoutParams9 = (ConstraintLayout.LayoutParams) layoutParams8;
        AbstractC23853iLt abstractC23853iLt12 = this.AEQbTJ;
        if (abstractC23853iLt12 == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt12 = null;
        }
        layoutParams9.startToEnd = abstractC23853iLt12.KWHzl.getId();
        layoutParams9.endToEnd = -1;
        AbstractC23853iLt abstractC23853iLt13 = this.AEQbTJ;
        if (abstractC23853iLt13 == null) {
            Intrinsics.gEmmrt("");
            abstractC23853iLt13 = null;
        }
        abstractC23853iLt13.KWHzl.setLayoutParams(layoutParams7);
        AbstractC23853iLt abstractC23853iLt14 = this.AEQbTJ;
        if (abstractC23853iLt14 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23853iLt2 = abstractC23853iLt14;
        }
        abstractC23853iLt2.AEQbTJ.setLayoutParams(layoutParams9);
    }

    /* JADX INFO: renamed from: o.jpQ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C27130jpQ OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27130jpQ c27130jpQ) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c27130jpQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.widget.TextView textView = (android.widget.TextView) this.AEQbTJ;
                View.OnClickListener onClickListener = this.OLrzqt.EZpvd;
                if (onClickListener != null) {
                    onClickListener.onClick(textView);
                }
            }
        }
    }
}
