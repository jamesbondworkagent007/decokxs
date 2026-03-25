package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gBL extends ConstraintLayout {
    public Function0<Unit> AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public final C17105ewX djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSymbol(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfoClickInfo(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gBL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        this.KWHzl = "";
        this.EZpvd = "";
        this.copydefault = "";
        C17105ewX c17105ewXKWHzl = C17105ewX.KWHzl(android.view.LayoutInflater.from(context), this);
        this.djBIcL = c17105ewXKWHzl;
        c17105ewXKWHzl.EZpvd.setClickable(false);
        c17105ewXKWHzl.EZpvd.setFocusable(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gBL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gBL(@NotNull android.content.Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setOnAssetVisibilityToggled(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
        this.djBIcL.EZpvd.setClickable(true);
        this.djBIcL.EZpvd.setFocusable(true);
        ConstraintLayout constraintLayout = this.djBIcL.EZpvd;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this));
    }

    public static /* synthetic */ void setCoinCount$default(gBL gbl, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gbl.setCoinCount(str, z);
    }

    public final void setCoinCount(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.djBIcL.copydefault.setText(str);
    }

    public final void setValuation(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.djBIcL.OLrzqt.setText(str);
        post(new java.lang.Runnable() { // from class: o.gBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                gBL.KWHzl(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(gBL gbl) {
        gbl.EZpvd();
    }

    public final void EZpvd() {
        C21260gwR c21260gwR = this.djBIcL.copydefault;
        Intrinsics.checkNotNullExpressionValue(c21260gwR, "");
        AppCompatTextView appCompatTextView = this.djBIcL.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getX() > ((float) (c21260gwR.getWidth() / 2)) ? (int) (12 * getResources().getDisplayMetrics().density) : 0, appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ gBL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, gBL gbl) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = gbl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0 function0;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (!C13912dbY.copydefault.OLrzqt(!r7.djBIcL()) || (function0 = this.copydefault.AEQbTJ) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }
}
