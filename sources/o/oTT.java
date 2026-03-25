package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTT extends AbstractC59533zio<oTB.TaskDescription, StateListAnimator> {
    public final oTG OLrzqt;

    public oTT(@NotNull oTG otg) {
        Intrinsics.checkNotNullParameter(otg, "");
        this.OLrzqt = otg;
    }

    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C36050oNk AEQbTJ;
        public final /* synthetic */ oTT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36050oNk copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull oTT ott, C36050oNk c36050oNk) {
            super(c36050oNk.getRoot());
            Intrinsics.checkNotNullParameter(c36050oNk, "");
            this.copydefault = ott;
            this.AEQbTJ = c36050oNk;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36050oNk c36050oNkKWHzl = C36050oNk.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36050oNkKWHzl, "");
        return new StateListAnimator(this, c36050oNkKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final oTB.TaskDescription taskDescription) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        final C36050oNk c36050oNkCopydefault = stateListAnimator.copydefault();
        C55258xgZ c55258xgZ = c36050oNkCopydefault.copydefault;
        java.lang.String strEZpvd = taskDescription.EZpvd();
        c55258xgZ.setHelperLabelType((strEZpvd == null || strEZpvd.length() == 0) ? 2 : 0);
        C55258xgZ c55258xgZ2 = c36050oNkCopydefault.copydefault;
        c55258xgZ2.setOnClickListener(new Application(c55258xgZ2, 1000L, taskDescription, this));
        C55312xha c55312xhaValueOf = c36050oNkCopydefault.copydefault.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(taskDescription.copydefault());
        }
        c36050oNkCopydefault.KWHzl.setOnCheckedChangeListener(null);
        c36050oNkCopydefault.KWHzl.setChecked(taskDescription.AEQbTJ());
        c36050oNkCopydefault.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                oTT.OLrzqt(this.AEQbTJ, taskDescription, c36050oNkCopydefault, compoundButton, z);
            }
        });
        AppCompatImageView appCompatImageView = c36050oNkCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(taskDescription.gEmmrt() ? 0 : 8);
    }

    public static final void OLrzqt(oTT ott, oTB.TaskDescription taskDescription, C36050oNk c36050oNk, android.widget.CompoundButton compoundButton, boolean z) {
        ott.OLrzqt.copydefault(taskDescription, z);
        AppCompatImageView appCompatImageView = c36050oNk.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(8);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ oTB.TaskDescription EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ oTT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, oTB.TaskDescription taskDescription, oTT ott) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = taskDescription;
            this.copydefault = ott;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd.EZpvd())) {
                    this.copydefault.OLrzqt.AEQbTJ(this.EZpvd);
                }
            }
        }
    }
}
