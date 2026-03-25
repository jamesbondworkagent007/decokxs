package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30503lcQ;
import o.AbstractC30510lcX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30567ldb extends ConstraintLayout {
    public final hHI KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30567ldb(@NotNull android.content.Context context) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        hHI hhiAEQbTJ = hHI.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(hhiAEQbTJ, "");
        this.KWHzl = hhiAEQbTJ;
        C55312xha c55312xhaValueOf = hhiAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setSingleLine();
        }
        C55312xha c55312xhaValueOf2 = hhiAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30567ldb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hHI hhiAEQbTJ = hHI.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(hhiAEQbTJ, "");
        this.KWHzl = hhiAEQbTJ;
        C55312xha c55312xhaValueOf = hhiAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setSingleLine();
        }
        C55312xha c55312xhaValueOf2 = hhiAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30567ldb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        hHI hhiAEQbTJ = hHI.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(hhiAEQbTJ, "");
        this.KWHzl = hhiAEQbTJ;
        C55312xha c55312xhaValueOf = hhiAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setSingleLine();
        }
        C55312xha c55312xhaValueOf2 = hhiAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final android.widget.LinearLayout OLrzqt() {
        android.widget.LinearLayout linearLayout = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final boolean copydefault() {
        return this.KWHzl.EZpvd.isChecked();
    }

    public final void setAutoSellEnabled(boolean z) {
        this.KWHzl.EZpvd.setCheckedIgnoreListener(z);
    }

    public final void setOnAutoSellCheckboxClickListener(final View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.KWHzl.EZpvd.setOnCheckedChangeListener(null);
            C55258xgZ c55258xgZ = this.KWHzl.KWHzl;
            c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L));
        } else {
            this.KWHzl.EZpvd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.lda
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C30567ldb.setOnAutoSellCheckboxClickListener$lambda$1(this.KWHzl, onClickListener, compoundButton, z);
                }
            });
            C55258xgZ c55258xgZ2 = this.KWHzl.KWHzl;
            c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, this));
        }
    }

    public static final void setOnAutoSellCheckboxClickListener$lambda$1(C30567ldb c30567ldb, View.OnClickListener onClickListener, android.widget.CompoundButton compoundButton, boolean z) {
        c30567ldb.KWHzl.EZpvd.setCheckedIgnoreListener(!z);
        onClickListener.onClick(compoundButton);
    }

    public final void setOnAutoSellTextClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.KWHzl.KWHzl.setOnClickListener(null);
        } else {
            C55296xhK.singleClick$default(this.KWHzl.KWHzl, onClickListener, 0L, 2, (java.lang.Object) null);
        }
    }

    public final void setOnEditButtonClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            this.KWHzl.OLrzqt.setOnClickListener(null);
        } else {
            C55296xhK.singleClick$default(this.KWHzl.OLrzqt, onClickListener, 0L, 2, (java.lang.Object) null);
        }
    }

    public final void setState(@NotNull AbstractC30503lcQ abstractC30503lcQ) {
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        if (Intrinsics.EZpvd(abstractC30503lcQ, AbstractC30503lcQ.Activity.AEQbTJ)) {
            this.KWHzl.EZpvd.setCheckedIgnoreListener(false);
            android.widget.ImageView imageView = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            return;
        }
        if (abstractC30503lcQ instanceof AbstractC30503lcQ.StateListAnimator) {
            this.KWHzl.EZpvd.setCheckedIgnoreListener(true);
            android.widget.ImageView imageView2 = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            return;
        }
        if (!(abstractC30503lcQ instanceof AbstractC30503lcQ.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        this.KWHzl.EZpvd.setCheckedIgnoreListener(true);
        android.widget.ImageView imageView3 = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(8);
    }

    public final void setEditVisibility(boolean z) {
        android.widget.ImageView imageView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void setStateNew(@NotNull AbstractC30510lcX abstractC30510lcX) {
        Intrinsics.checkNotNullParameter(abstractC30510lcX, "");
        if (Intrinsics.EZpvd(abstractC30510lcX, AbstractC30510lcX.Activity.EZpvd)) {
            this.KWHzl.EZpvd.setCheckedIgnoreListener(false);
            android.widget.ImageView imageView = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            return;
        }
        if (abstractC30510lcX instanceof AbstractC30510lcX.StateListAnimator) {
            this.KWHzl.EZpvd.setCheckedIgnoreListener(true);
            android.widget.ImageView imageView2 = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(((AbstractC30510lcX.StateListAnimator) abstractC30510lcX).EZpvd() ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: o.ldb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C30567ldb OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C30567ldb c30567ldb) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c30567ldb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.EZpvd.toggle();
            }
        }
    }

    /* JADX INFO: renamed from: o.ldb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j) {
            this.OLrzqt = view;
            this.EZpvd = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
            }
        }
    }
}
