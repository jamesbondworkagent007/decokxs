package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25332iui extends AbstractC24459ieI {
    public final hGP EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25332iui(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:12) call: o.iui.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C25332iui(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25332iui(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGP hgpEZpvd = hGP.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(hgpEZpvd, "");
        this.EZpvd = hgpEZpvd;
    }

    public final void setupServiceFee(@NotNull java.lang.CharSequence charSequence, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd.KWHzl.setText(charSequence);
        C55320xhi c55320xhi = this.EZpvd.AYXKKw;
        c55320xhi.setOnClickListener(new StateListAnimator(c55320xhi, 1000L, function0));
    }

    public final void setTitleColor(int i) {
        this.EZpvd.AYXKKw.setTextColor(i);
    }

    public final void setServiceFeeValueColor(int i) {
        this.EZpvd.KWHzl.setTextColor(i);
    }

    public final void setIsShowReferralView(boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C55251xgS c55251xgS = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(z ? 0 : 8);
        AppCompatImageView appCompatImageView = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        android.view.View viewAEQbTJ = AEQbTJ();
        viewAEQbTJ.setOnClickListener(new Activity(viewAEQbTJ, 1000L, z, function0));
    }

    public final void setIsShowReferralView(boolean z) {
        C55251xgS c55251xgS = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(z ? 0 : 8);
        AppCompatImageView appCompatImageView = this.EZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
    }

    public final void setValueSize(int i) {
        this.EZpvd.KWHzl.setTextAppearance(i);
    }

    @Override // o.AbstractC24459ieI
    public android.view.View AEQbTJ() {
        ConstraintLayout constraintLayout = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    /* JADX INFO: renamed from: o.iui$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, boolean z, Function0 function0) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = z;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.AEQbTJ) {
                    this.copydefault.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.iui$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }
}
