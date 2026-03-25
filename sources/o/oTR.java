package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTR extends AbstractC59533zio<oTB.ActionBar, Activity> {
    public final oTG OLrzqt;

    public oTR(@NotNull oTG otg) {
        Intrinsics.checkNotNullParameter(otg, "");
        this.OLrzqt = otg;
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final C36046oNg AEQbTJ;
        public final /* synthetic */ oTR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36046oNg EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull oTR otr, C36046oNg c36046oNg) {
            super(c36046oNg.getRoot());
            Intrinsics.checkNotNullParameter(c36046oNg, "");
            this.copydefault = otr;
            this.AEQbTJ = c36046oNg;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36046oNg c36046oNgKWHzl = C36046oNg.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36046oNgKWHzl, "");
        return new Activity(this, c36046oNgKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull oTB.ActionBar actionBar) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        C36046oNg c36046oNgEZpvd = activity.EZpvd();
        C55258xgZ c55258xgZ = c36046oNgEZpvd.EZpvd;
        java.lang.String strEZpvd = actionBar.EZpvd();
        c55258xgZ.setHelperLabelType((strEZpvd == null || strEZpvd.length() == 0) ? 2 : 0);
        C55258xgZ c55258xgZ2 = c36046oNgEZpvd.EZpvd;
        c55258xgZ2.setOnClickListener(new StateListAnimator(c55258xgZ2, 1000L, actionBar, this));
        C55312xha c55312xhaValueOf = c36046oNgEZpvd.EZpvd.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(actionBar.copydefault());
        }
        java.lang.Integer numAEQbTJ = actionBar.AEQbTJ();
        if (numAEQbTJ != null) {
            c36046oNgEZpvd.KWHzl.setImageResource(numAEQbTJ.intValue());
        }
        LinearLayoutCompat root = c36046oNgEZpvd.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, actionBar));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ oTR AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ oTB.ActionBar KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, oTR otr, oTB.ActionBar actionBar) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = otr;
            this.KWHzl = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt.EZpvd(this.KWHzl);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ oTB.ActionBar EZpvd;
        public final /* synthetic */ oTR KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, oTB.ActionBar actionBar, oTR otr) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = actionBar;
            this.KWHzl = otr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd.EZpvd())) {
                    this.KWHzl.OLrzqt.AEQbTJ(this.EZpvd);
                } else {
                    this.KWHzl.OLrzqt.EZpvd(this.EZpvd);
                }
            }
        }
    }
}
