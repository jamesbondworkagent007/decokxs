package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTP extends AbstractC59533zio<oTB.Application, StateListAnimator> {
    public final oTG copydefault;

    public oTP(@NotNull oTG otg) {
        Intrinsics.checkNotNullParameter(otg, "");
        this.copydefault = otg;
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C36048oNi EZpvd;
        public final /* synthetic */ oTP copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36048oNi EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull oTP otp, C36048oNi c36048oNi) {
            super(c36048oNi.getRoot());
            Intrinsics.checkNotNullParameter(c36048oNi, "");
            this.copydefault = otp;
            this.EZpvd = c36048oNi;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36048oNi c36048oNiAEQbTJ = C36048oNi.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36048oNiAEQbTJ, "");
        return new StateListAnimator(this, c36048oNiAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull oTB.Application application) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(application, "");
        C36048oNi c36048oNiEZpvd = stateListAnimator.EZpvd();
        C55258xgZ c55258xgZ = c36048oNiEZpvd.copydefault;
        java.lang.String strEZpvd = application.EZpvd();
        c55258xgZ.setHelperLabelType((strEZpvd == null || strEZpvd.length() == 0) ? 2 : 0);
        C55258xgZ c55258xgZ2 = c36048oNiEZpvd.copydefault;
        c55258xgZ2.setOnClickListener(new Application(c55258xgZ2, 1000L, application, this));
        C55312xha c55312xhaValueOf = c36048oNiEZpvd.copydefault.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(application.copydefault());
        }
        LinearLayoutCompat root = c36048oNiEZpvd.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, application));
        c36048oNiEZpvd.EZpvd.setText(application.AEQbTJ());
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ oTP EZpvd;
        public final /* synthetic */ oTB.Application KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, oTP otp, oTB.Application application) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = otp;
            this.KWHzl = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault.KWHzl(this.KWHzl);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ oTB.Application AEQbTJ;
        public final /* synthetic */ oTP KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, oTB.Application application, oTP otp) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = application;
            this.KWHzl = otp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.EZpvd())) {
                    this.KWHzl.copydefault.AEQbTJ(this.AEQbTJ);
                } else {
                    this.KWHzl.copydefault.KWHzl(this.AEQbTJ);
                }
            }
        }
    }
}
