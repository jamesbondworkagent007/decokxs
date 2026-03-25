package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oSJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36211oTj extends AbstractC59533zio<oSJ.StateListAnimator, TaskDescription> {
    public final oSP OLrzqt;

    public C36211oTj(@NotNull oSP osp) {
        Intrinsics.checkNotNullParameter(osp, "");
        this.OLrzqt = osp;
    }

    /* JADX INFO: renamed from: o.oTj$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final C36047oNh AEQbTJ;
        public final /* synthetic */ C36211oTj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36047oNh KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36211oTj c36211oTj, C36047oNh c36047oNh) {
            super(c36047oNh.getRoot());
            Intrinsics.checkNotNullParameter(c36047oNh, "");
            this.copydefault = c36211oTj;
            this.AEQbTJ = c36047oNh;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36047oNh c36047oNhCopydefault = C36047oNh.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36047oNhCopydefault, "");
        return new TaskDescription(this, c36047oNhCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull final oSJ.StateListAnimator stateListAnimator) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C36047oNh c36047oNhKWHzl = taskDescription.KWHzl();
        LinearLayoutCompat root = c36047oNhKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(stateListAnimator.EZpvd() ^ true ? 4 : 0);
        if (stateListAnimator.copydefault()) {
            c36047oNhKWHzl.OLrzqt.setHelperLabelType(1);
            c36047oNhKWHzl.OLrzqt.setUnderlineStyle(0);
        } else {
            c36047oNhKWHzl.OLrzqt.setHelperLabelType(2);
        }
        C55312xha c55312xhaValueOf = c36047oNhKWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(stateListAnimator.OLrzqt());
        }
        C55312xha c55312xhaValueOf2 = c36047oNhKWHzl.OLrzqt.valueOf();
        if (c55312xhaValueOf2 != null) {
            c55312xhaValueOf2.setOnClickListener(new Activity(c55312xhaValueOf2, 1000L, stateListAnimator, this, c36047oNhKWHzl));
        }
        c36047oNhKWHzl.EZpvd.setOnCheckedChangeListener(null);
        c36047oNhKWHzl.EZpvd.setChecked(stateListAnimator.AEQbTJ());
        c36047oNhKWHzl.EZpvd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.oTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C36211oTj.KWHzl(this.EZpvd, stateListAnimator, compoundButton, z);
            }
        });
    }

    public static final void KWHzl(C36211oTj c36211oTj, oSJ.StateListAnimator stateListAnimator, android.widget.CompoundButton compoundButton, boolean z) {
        c36211oTj.OLrzqt.OLrzqt(stateListAnimator, z);
    }

    /* JADX INFO: renamed from: o.oTj$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C36211oTj AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C36047oNh KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ oSJ.StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, oSJ.StateListAnimator stateListAnimator, C36211oTj c36211oTj, C36047oNh c36047oNh) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = stateListAnimator;
            this.AEQbTJ = c36211oTj;
            this.KWHzl = c36047oNh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.copydefault.copydefault()) {
                    this.AEQbTJ.OLrzqt.copydefault(this.copydefault);
                } else {
                    this.KWHzl.EZpvd.setChecked(!r7.isChecked());
                }
            }
        }
    }
}
