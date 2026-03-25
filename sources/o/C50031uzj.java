package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50031uzj extends android.widget.LinearLayout {
    public ConstraintLayout AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public C52812wZg AhwBna;
    public final android.widget.TextView AkhnZx;
    public android.widget.ImageView DbNXlk;
    public android.widget.LinearLayout EZpvd;
    public Function0<Unit> KWHzl;
    public java.lang.String OLrzqt;
    public android.widget.LinearLayout copydefault;
    public android.widget.ImageView djBIcL;
    public final C55320xhi fetchVPNInfo;
    public ConstraintSet gEmmrt;
    public final android.view.View valueOf;
    public final android.widget.FrameLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50031uzj(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C49511upt.StateListAnimator.AubY, this);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        this.valueOf = viewInflate;
        this.gEmmrt = new ConstraintSet();
        C55320xhi c55320xhi = (C55320xhi) viewInflate.findViewById(C49511upt.Application.AYXKKw);
        this.fetchVPNInfo = c55320xhi;
        c55320xhi.AYXKKw();
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.valueOf);
        this.values = (android.widget.FrameLayout) viewInflate.findViewById(C49511upt.Application.KWHzl);
        this.djBIcL = (android.widget.ImageView) viewInflate.findViewById(C49511upt.Application.copydefault);
        this.AYXKKw = (android.widget.FrameLayout) viewInflate.findViewById(C49511upt.Application.OLrzqt);
        this.AEQbTJ = (ConstraintLayout) viewInflate.findViewById(C49511upt.Application.AEQbTJ);
        this.EZpvd = (android.widget.LinearLayout) viewInflate.findViewById(C49511upt.Application.AhwBna);
        this.copydefault = (android.widget.LinearLayout) viewInflate.findViewById(C49511upt.Application.djBIcL);
        this.DbNXlk = (android.widget.ImageView) viewInflate.findViewById(C49511upt.Application.gGvvIC);
        this.gEmmrt.clone(this.AEQbTJ);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.fzHEvu);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl));
        }
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50031uzj(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = "";
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C49511upt.StateListAnimator.AubY, this);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        this.valueOf = viewInflate;
        this.gEmmrt = new ConstraintSet();
        C55320xhi c55320xhi = (C55320xhi) viewInflate.findViewById(C49511upt.Application.AYXKKw);
        this.fetchVPNInfo = c55320xhi;
        c55320xhi.AYXKKw();
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.valueOf);
        this.values = (android.widget.FrameLayout) viewInflate.findViewById(C49511upt.Application.KWHzl);
        this.djBIcL = (android.widget.ImageView) viewInflate.findViewById(C49511upt.Application.copydefault);
        this.AYXKKw = (android.widget.FrameLayout) viewInflate.findViewById(C49511upt.Application.OLrzqt);
        this.AEQbTJ = (ConstraintLayout) viewInflate.findViewById(C49511upt.Application.AEQbTJ);
        this.EZpvd = (android.widget.LinearLayout) viewInflate.findViewById(C49511upt.Application.AhwBna);
        this.copydefault = (android.widget.LinearLayout) viewInflate.findViewById(C49511upt.Application.djBIcL);
        this.DbNXlk = (android.widget.ImageView) viewInflate.findViewById(C49511upt.Application.gGvvIC);
        this.gEmmrt.clone(this.AEQbTJ);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.fzHEvu);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl));
        }
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50031uzj(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = "";
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C49511upt.StateListAnimator.AubY, this);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        this.valueOf = viewInflate;
        this.gEmmrt = new ConstraintSet();
        C55320xhi c55320xhi = (C55320xhi) viewInflate.findViewById(C49511upt.Application.AYXKKw);
        this.fetchVPNInfo = c55320xhi;
        c55320xhi.AYXKKw();
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.valueOf);
        this.values = (android.widget.FrameLayout) viewInflate.findViewById(C49511upt.Application.KWHzl);
        this.djBIcL = (android.widget.ImageView) viewInflate.findViewById(C49511upt.Application.copydefault);
        this.AYXKKw = (android.widget.FrameLayout) viewInflate.findViewById(C49511upt.Application.OLrzqt);
        this.AEQbTJ = (ConstraintLayout) viewInflate.findViewById(C49511upt.Application.AEQbTJ);
        this.EZpvd = (android.widget.LinearLayout) viewInflate.findViewById(C49511upt.Application.AhwBna);
        this.copydefault = (android.widget.LinearLayout) viewInflate.findViewById(C49511upt.Application.djBIcL);
        this.DbNXlk = (android.widget.ImageView) viewInflate.findViewById(C49511upt.Application.gGvvIC);
        this.gEmmrt.clone(this.AEQbTJ);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.fzHEvu);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), C52761wXj.Activity.fdOvFl));
        }
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setText(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fetchVPNInfo.setText(str);
        this.fetchVPNInfo.setVisibility(0);
        this.AkhnZx.setText(str2);
        this.OLrzqt = str3;
        OLrzqt();
    }

    public final void setTextWithIconFollowed(@NotNull java.lang.String str, java.lang.CharSequence charSequence, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fetchVPNInfo.setText(str);
        this.fetchVPNInfo.setVisibility(0);
        this.AkhnZx.setText(charSequence);
        this.OLrzqt = str2;
        AEQbTJ();
    }

    public final void setTextWithTextRightSide(@NotNull java.lang.String str, java.lang.CharSequence charSequence, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fetchVPNInfo.setText(str);
        this.fetchVPNInfo.setVisibility(0);
        this.AkhnZx.setText(charSequence);
        this.OLrzqt = str2;
        KWHzl();
    }

    public final void setTextWithoutLayout(@NotNull java.lang.String str, java.lang.CharSequence charSequence, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fetchVPNInfo.setText(str);
        this.fetchVPNInfo.setVisibility(0);
        this.AkhnZx.setText(charSequence);
        this.OLrzqt = str2;
    }

    public final void KWHzl(boolean z) {
        this.values.setVisibility(z ? 0 : 8);
    }

    public final void setIconVisibility(int i) {
        this.values.setVisibility(i);
    }

    public final void setShowClick(boolean z, @NotNull final View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        KWHzl(z);
        C8003auW.copydefault(this.values).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.uzp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C50031uzj.setShowClick$lambda$0(onClickListener, this, obj);
            }
        });
    }

    public static final void setShowClick$lambda$0(View.OnClickListener onClickListener, C50031uzj c50031uzj, java.lang.Object obj) {
        onClickListener.onClick(c50031uzj.values);
    }

    public final void OLrzqt(boolean z) {
        KWHzl(z);
    }

    public final void OLrzqt(boolean z, View.OnClickListener onClickListener) {
        if (z) {
            this.fetchVPNInfo.gEmmrt();
            this.fetchVPNInfo.setOnClickListener(onClickListener);
        } else {
            this.fetchVPNInfo.AYXKKw();
            this.fetchVPNInfo.setOnClickListener(new ActionBar());
        }
    }

    /* JADX INFO: renamed from: o.uzj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public ActionBar() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            Function0 function0;
            android.widget.ImageView imageView = C50031uzj.this.DbNXlk;
            if (imageView == null || imageView.getVisibility() != 0 || (function0 = C50031uzj.this.KWHzl) == null) {
                return;
            }
            function0.invoke();
        }
    }

    public static /* synthetic */ void setRightTipVisible$default(C50031uzj c50031uzj, boolean z, Function0 function0, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        c50031uzj.setRightTipVisible(z, function0, drawable);
    }

    public final void OLrzqt() {
        post(new java.lang.Runnable() { // from class: o.uzo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50031uzj.djBIcL(this.EZpvd);
            }
        });
    }

    public static final void djBIcL(C50031uzj c50031uzj) {
        int iEZpvd;
        android.widget.LinearLayout linearLayout = c50031uzj.EZpvd;
        int measuredWidth = linearLayout != null ? linearLayout.getMeasuredWidth() : 0;
        android.widget.LinearLayout linearLayout2 = c50031uzj.copydefault;
        int measuredWidth2 = linearLayout2 != null ? linearLayout2.getMeasuredWidth() : 0;
        int measuredWidth3 = c50031uzj.values.getVisibility() == 0 ? c50031uzj.values.getMeasuredWidth() : 0;
        int iEZpvd2 = (c50031uzj.values.getVisibility() == 8 || c50031uzj.values.getVisibility() == 4) ? 0 : C57676yms.EZpvd(C57601ylW.OLrzqt(), 16.0f);
        if (c50031uzj.AYXKKw.getVisibility() == 0) {
            iEZpvd = C57676yms.EZpvd(C57601ylW.OLrzqt(), 6.0f);
        } else {
            c50031uzj.AYXKKw.getVisibility();
            iEZpvd = 0;
        }
        if (measuredWidth + measuredWidth2 + iEZpvd2 + measuredWidth3 > c50031uzj.getMeasuredWidth()) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(c50031uzj.AEQbTJ);
            constraintSet.clear(C49511upt.Application.djBIcL);
            constraintSet.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 4, -iEZpvd);
            constraintSet.connect(C49511upt.Application.djBIcL, 6, 0, 6);
            constraintSet.connect(C49511upt.Application.AhwBna, 7, 0, 7);
            constraintSet.constrainWidth(C49511upt.Application.djBIcL, -2);
            constraintSet.constrainHeight(C49511upt.Application.djBIcL, -2);
            constraintSet.applyTo(c50031uzj.AEQbTJ);
            android.widget.LinearLayout linearLayout3 = c50031uzj.copydefault;
            if (linearLayout3 != null) {
                linearLayout3.setPaddingRelative(0, 0, 0, 0);
                return;
            }
            return;
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(c50031uzj.AEQbTJ);
        constraintSet2.clear(C49511upt.Application.djBIcL);
        constraintSet2.connect(C49511upt.Application.djBIcL, 4, C49511upt.Application.AhwBna, 4);
        constraintSet2.connect(C49511upt.Application.djBIcL, 7, C49511upt.Application.KWHzl, 6);
        constraintSet2.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 3);
        constraintSet2.connect(C49511upt.Application.AhwBna, 7, C49511upt.Application.djBIcL, 6);
        constraintSet2.constrainWidth(C49511upt.Application.djBIcL, -2);
        constraintSet2.constrainHeight(C49511upt.Application.djBIcL, -2);
        constraintSet2.applyTo(c50031uzj.AEQbTJ);
        android.widget.LinearLayout linearLayout4 = c50031uzj.copydefault;
        if (linearLayout4 != null) {
            linearLayout4.setPaddingRelative((int) C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
        }
    }

    public final void KWHzl() {
        post(new java.lang.Runnable() { // from class: o.uzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50031uzj.AhwBna(this.KWHzl);
            }
        });
    }

    public static final void AhwBna(C50031uzj c50031uzj) {
        android.widget.LinearLayout linearLayout = c50031uzj.EZpvd;
        int measuredWidth = linearLayout != null ? linearLayout.getMeasuredWidth() : 0;
        android.widget.LinearLayout linearLayout2 = c50031uzj.copydefault;
        int measuredWidth2 = (linearLayout2 != null ? linearLayout2.getMeasuredWidth() : 0) + measuredWidth + ((c50031uzj.values.getVisibility() == 8 || c50031uzj.values.getVisibility() == 4) ? 0 : C57676yms.EZpvd(C57601ylW.OLrzqt(), 8.0f));
        if (measuredWidth2 > c50031uzj.getMeasuredWidth() || (measuredWidth2 <= c50031uzj.getMeasuredWidth() && c50031uzj.AkhnZx.getLineCount() > 1)) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(c50031uzj.AEQbTJ);
            constraintSet.clear(C49511upt.Application.djBIcL);
            int measuredWidth3 = (int) (c50031uzj.getMeasuredWidth() * 0.6f);
            c50031uzj.AkhnZx.setMaxLines(2);
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredWidth3))) {
                android.widget.ImageView imageView = c50031uzj.DbNXlk;
                ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    int iDpInt$default = C55298xhM.dpInt$default(24.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                    layoutParams2.width = iDpInt$default;
                    layoutParams2.height = -2;
                    layoutParams2.weight = 0.0f;
                    android.widget.ImageView imageView2 = c50031uzj.DbNXlk;
                    if (imageView2 != null) {
                        imageView2.setLayoutParams(layoutParams2);
                    }
                    android.widget.ImageView imageView3 = c50031uzj.DbNXlk;
                    if (imageView3 != null) {
                        imageView3.setMinimumWidth(iDpInt$default);
                    }
                    android.widget.ImageView imageView4 = c50031uzj.DbNXlk;
                    if (imageView4 != null) {
                        imageView4.setMinimumHeight(C55298xhM.dpInt$default(24.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                    }
                }
                C55320xhi c55320xhi = c50031uzj.fetchVPNInfo;
                ViewGroup.LayoutParams layoutParams3 = c55320xhi != null ? c55320xhi.getLayoutParams() : null;
                LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.width = measuredWidth3 - C55298xhM.dpInt$default(24.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                    layoutParams4.height = -2;
                    layoutParams4.weight = 0.0f;
                    C55320xhi c55320xhi2 = c50031uzj.fetchVPNInfo;
                    if (c55320xhi2 != null) {
                        c55320xhi2.setLayoutParams(layoutParams4);
                    }
                }
                android.widget.LinearLayout linearLayout3 = c50031uzj.copydefault;
                ViewGroup.LayoutParams layoutParams5 = linearLayout3 != null ? linearLayout3.getLayoutParams() : null;
                LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.width = measuredWidth2 - measuredWidth3;
                    layoutParams6.height = -2;
                    layoutParams6.weight = 0.0f;
                    android.widget.LinearLayout linearLayout4 = c50031uzj.copydefault;
                    if (linearLayout4 != null) {
                        linearLayout4.setLayoutParams(layoutParams6);
                    }
                }
            } else {
                constraintSet.constrainWidth(C49511upt.Application.djBIcL, 0);
                constraintSet.setHorizontalWeight(C49511upt.Application.djBIcL, 1.0f);
            }
            constraintSet.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 3);
            constraintSet.connect(C49511upt.Application.djBIcL, 6, C49511upt.Application.AhwBna, 7);
            constraintSet.connect(C49511upt.Application.djBIcL, 7, C49511upt.Application.KWHzl, 6);
            constraintSet.constrainHeight(C49511upt.Application.djBIcL, -2);
            constraintSet.setVerticalBias(C49511upt.Application.djBIcL, 0.0f);
            constraintSet.constrainHeight(C49511upt.Application.AhwBna, -2);
            constraintSet.setHorizontalBias(C49511upt.Application.AhwBna, 0.0f);
            c50031uzj.AkhnZx.setEllipsize(TextUtils.TruncateAt.END);
            c50031uzj.AkhnZx.setTextAlignment(3);
            constraintSet.applyTo(c50031uzj.AEQbTJ);
            android.widget.LinearLayout linearLayout5 = c50031uzj.copydefault;
            if (linearLayout5 != null) {
                linearLayout5.setPaddingRelative(0, 0, 0, 0);
            }
            android.widget.LinearLayout linearLayout6 = c50031uzj.copydefault;
            if (linearLayout6 != null) {
                linearLayout6.requestLayout();
                return;
            }
            return;
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(c50031uzj.AEQbTJ);
        constraintSet2.clear(C49511upt.Application.djBIcL);
        constraintSet2.connect(C49511upt.Application.djBIcL, 4, C49511upt.Application.AhwBna, 4);
        constraintSet2.connect(C49511upt.Application.djBIcL, 7, C49511upt.Application.KWHzl, 6);
        constraintSet2.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 3);
        constraintSet2.connect(C49511upt.Application.AhwBna, 7, C49511upt.Application.djBIcL, 6);
        android.widget.LinearLayout linearLayout7 = c50031uzj.copydefault;
        ViewGroup.LayoutParams layoutParams7 = linearLayout7 != null ? linearLayout7.getLayoutParams() : null;
        LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.width = measuredWidth2 - measuredWidth;
            layoutParams8.height = -2;
            layoutParams8.weight = 0.0f;
            android.widget.LinearLayout linearLayout8 = c50031uzj.copydefault;
            if (linearLayout8 != null) {
                linearLayout8.setLayoutParams(layoutParams8);
            }
        }
        constraintSet2.constrainWidth(C49511upt.Application.djBIcL, -2);
        constraintSet2.constrainHeight(C49511upt.Application.djBIcL, -2);
        constraintSet2.applyTo(c50031uzj.AEQbTJ);
        android.widget.LinearLayout linearLayout9 = c50031uzj.copydefault;
        if (linearLayout9 != null) {
            linearLayout9.setPaddingRelative((int) C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
        }
        c50031uzj.AkhnZx.setMaxLines(1);
    }

    public final void AEQbTJ() {
        post(new java.lang.Runnable() { // from class: o.uzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50031uzj.gEmmrt(this.KWHzl);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gEmmrt(C50031uzj c50031uzj) {
        int iValueOf;
        java.lang.Integer num;
        int iEZpvd;
        int iEZpvd2;
        android.widget.ImageView imageView;
        android.widget.LinearLayout linearLayout = c50031uzj.EZpvd;
        int measuredWidth = linearLayout != null ? linearLayout.getMeasuredWidth() : 0;
        android.widget.LinearLayout linearLayout2 = c50031uzj.copydefault;
        int measuredWidth2 = linearLayout2 != null ? linearLayout2.getMeasuredWidth() : 0;
        if (c50031uzj.values.getVisibility() == 0) {
            android.widget.ImageView imageView2 = c50031uzj.djBIcL;
            if (imageView2 == null) {
                num = null;
                iEZpvd = (c50031uzj.values.getVisibility() != 8 || c50031uzj.values.getVisibility() == 4 || ((imageView = c50031uzj.DbNXlk) != null && imageView.getVisibility() == 0)) ? 0 : C57676yms.EZpvd(C57601ylW.OLrzqt(), 4.0f);
                if (c50031uzj.AYXKKw.getVisibility() != 0) {
                    iEZpvd2 = C57676yms.EZpvd(C57601ylW.OLrzqt(), 6.0f);
                } else {
                    c50031uzj.AYXKKw.getVisibility();
                    iEZpvd2 = 0;
                }
                if (!C33129mqd.AEQbTJ(C33129mqd.addS$default(C33129mqd.addS$default(C33129mqd.addS$default(java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredWidth2), null, null, null, 14, null), java.lang.Integer.valueOf(iEZpvd), null, null, null, 14, null), num, null, null, null, 14, null), java.lang.Integer.valueOf(c50031uzj.getMeasuredWidth()))) {
                    ConstraintSet constraintSet = new ConstraintSet();
                    constraintSet.clone(c50031uzj.AEQbTJ);
                    constraintSet.clear(C49511upt.Application.djBIcL);
                    if (c50031uzj.values.getVisibility() == 0) {
                        constraintSet.clear(C49511upt.Application.KWHzl);
                        constraintSet.connect(C49511upt.Application.KWHzl, 6, C49511upt.Application.djBIcL, 7);
                        constraintSet.connect(C49511upt.Application.KWHzl, 4, C49511upt.Application.djBIcL, 4);
                        constraintSet.connect(C49511upt.Application.KWHzl, 7, 0, 7);
                        constraintSet.connect(C49511upt.Application.KWHzl, 3, C49511upt.Application.djBIcL, 3);
                        constraintSet.setHorizontalBias(C49511upt.Application.KWHzl, 0.0f);
                        constraintSet.setVerticalBias(C49511upt.Application.copydefault, 0.5f);
                        constraintSet.clear(C49511upt.Application.djBIcL);
                        constraintSet.connect(C49511upt.Application.djBIcL, 4, 0, 4);
                        constraintSet.connect(C49511upt.Application.djBIcL, 6, 0, 6);
                        constraintSet.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 4);
                        constraintSet.connect(C49511upt.Application.djBIcL, 7, C49511upt.Application.KWHzl, 6);
                        constraintSet.setHorizontalBias(C49511upt.Application.djBIcL, 0.0f);
                        constraintSet.constrainWidth(C49511upt.Application.djBIcL, 0);
                    } else {
                        constraintSet.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 4, -iEZpvd2);
                        constraintSet.connect(C49511upt.Application.djBIcL, 6, 0, 6);
                        constraintSet.connect(C49511upt.Application.AhwBna, 7, 0, 7);
                    }
                    constraintSet.constrainWidth(C49511upt.Application.djBIcL, -2);
                    constraintSet.constrainHeight(C49511upt.Application.djBIcL, -2);
                    constraintSet.applyTo(c50031uzj.AEQbTJ);
                    android.widget.LinearLayout linearLayout3 = c50031uzj.copydefault;
                    if (linearLayout3 != null) {
                        linearLayout3.setPaddingRelative(0, 0, 0, 0);
                        return;
                    }
                    return;
                }
                ConstraintSet constraintSet2 = new ConstraintSet();
                constraintSet2.clone(c50031uzj.AEQbTJ);
                constraintSet2.clear(C49511upt.Application.djBIcL);
                if (c50031uzj.values.getVisibility() == 0) {
                    constraintSet2.clear(C49511upt.Application.KWHzl);
                    constraintSet2.connect(C49511upt.Application.KWHzl, 7, 0, 7);
                    constraintSet2.connect(C49511upt.Application.KWHzl, 3, C49511upt.Application.AhwBna, 3);
                    constraintSet2.connect(C49511upt.Application.KWHzl, 4, C49511upt.Application.AhwBna, 4);
                    constraintSet2.connect(C49511upt.Application.djBIcL, 7, C49511upt.Application.KWHzl, 6);
                    constraintSet2.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 3);
                    constraintSet2.connect(C49511upt.Application.djBIcL, 4, C49511upt.Application.AhwBna, 4);
                    constraintSet2.setHorizontalBias(C49511upt.Application.KWHzl, 1.0f);
                    constraintSet2.setHorizontalBias(C49511upt.Application.djBIcL, 1.0f);
                    constraintSet2.setVerticalBias(C49511upt.Application.copydefault, 0.5f);
                } else {
                    constraintSet2.connect(C49511upt.Application.djBIcL, 4, C49511upt.Application.AhwBna, 4);
                    constraintSet2.connect(C49511upt.Application.djBIcL, 7, C49511upt.Application.KWHzl, 6);
                    constraintSet2.connect(C49511upt.Application.djBIcL, 3, C49511upt.Application.AhwBna, 3);
                    constraintSet2.connect(C49511upt.Application.djBIcL, 7, 0, 7);
                    constraintSet2.connect(C49511upt.Application.AhwBna, 7, C49511upt.Application.djBIcL, 6);
                }
                constraintSet2.constrainWidth(C49511upt.Application.djBIcL, -2);
                constraintSet2.constrainHeight(C49511upt.Application.djBIcL, -2);
                constraintSet2.constrainWidth(C49511upt.Application.KWHzl, -2);
                constraintSet2.constrainWidth(C49511upt.Application.djBIcL, -2);
                constraintSet2.applyTo(c50031uzj.AEQbTJ);
                android.widget.LinearLayout linearLayout4 = c50031uzj.copydefault;
                if (linearLayout4 != null) {
                    linearLayout4.setPaddingRelative((int) C55298xhM.dp$default(4, (android.content.Context) null, 1, (java.lang.Object) null), 0, 0, 0);
                    return;
                }
                return;
            }
            iValueOf = java.lang.Integer.valueOf(imageView2.getMeasuredWidth());
        } else {
            iValueOf = 0;
        }
        num = iValueOf;
        if (c50031uzj.values.getVisibility() != 8) {
        }
        if (c50031uzj.AYXKKw.getVisibility() != 0) {
        }
        if (!C33129mqd.AEQbTJ(C33129mqd.addS$default(C33129mqd.addS$default(C33129mqd.addS$default(java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredWidth2), null, null, null, 14, null), java.lang.Integer.valueOf(iEZpvd), null, null, null, 14, null), num, null, null, null, 14, null), java.lang.Integer.valueOf(c50031uzj.getMeasuredWidth()))) {
        }
    }

    public static /* synthetic */ boolean showToolTipNow$default(C50031uzj c50031uzj, android.view.View view, java.lang.String str, java.lang.String str2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return c50031uzj.AEQbTJ(view, str, str2, function0);
    }

    public final boolean AEQbTJ(@NotNull final android.view.View view, final java.lang.String str, final java.lang.String str2, @NotNull final Function0<Unit> function0) {
        C56126xwt<Unit> c56126xwtEjfBZ;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (view.getVisibility() != 0 || getVisibility() != 0) {
            return false;
        }
        java.lang.Object context = getContext();
        ViewModelStoreOwner viewModelStoreOwner = context instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) context : null;
        C56132xwz c56132xwz = viewModelStoreOwner != null ? (C56132xwz) new ViewModelProvider(viewModelStoreOwner).get(C56132xwz.class) : null;
        if (c56132xwz != null && (c56126xwtEjfBZ = c56132xwz.ejfBZ()) != null) {
            c56126xwtEjfBZ.KWHzl(Unit.INSTANCE);
        }
        C50029uzh.EZpvd.copydefault(new java.lang.Runnable() { // from class: o.uzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50031uzj.copydefault(this.OLrzqt, view, function0, str, str2);
            }
        }, 50L);
        return true;
    }

    public static final void copydefault(C50031uzj c50031uzj, android.view.View view, Function0 function0, java.lang.String str, java.lang.String str2) {
        android.content.Context context = c50031uzj.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C52812wZg c52812wZg = new C52812wZg(context);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(1);
        stateListAnimator.AEQbTJ(str);
        stateListAnimator.OLrzqt(str2);
        c52812wZg.AEQbTJ(stateListAnimator);
        c52812wZg.OLrzqt(0);
        c52812wZg.KWHzl((Function0<Unit>) function0);
        c52812wZg.fARcdN();
        c50031uzj.AhwBna = c52812wZg;
    }

    public final void setTitleAppearance(int i) {
        this.fetchVPNInfo.setTextAppearance(i);
    }

    public final void setTitleColor(int i) {
        this.fetchVPNInfo.setTextColor(C33070mpX.copydefault(i));
    }

    public final void setContentAppearance(int i) {
        this.AkhnZx.setTextAppearance(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C52812wZg c52812wZg = this.AhwBna;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
    }

    public final void setRightTipVisible(boolean z, @NotNull final Function0<Unit> function0, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.widget.ImageView imageView = this.DbNXlk;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        if (drawable != null) {
            android.widget.ImageView imageView2 = this.DbNXlk;
            if (imageView2 != null) {
                imageView2.getImageTintList();
            }
            android.widget.ImageView imageView3 = this.DbNXlk;
            if (imageView3 != null) {
                imageView3.setImageDrawable(drawable);
            }
        }
        if (!z) {
            this.KWHzl = null;
            return;
        }
        this.KWHzl = function0;
        android.widget.LinearLayout linearLayout = this.EZpvd;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.uzm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
        }
        if (this.fetchVPNInfo.AEQbTJ()) {
            return;
        }
        this.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.uzn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                function0.invoke();
            }
        });
    }
}
