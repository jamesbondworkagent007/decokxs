package o;

import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oSJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36217oTp extends AbstractC59533zio<oSJ.TaskDescription, ActionBar> {
    public final oSP KWHzl;

    public C36217oTp(@NotNull oSP osp) {
        Intrinsics.checkNotNullParameter(osp, "");
        this.KWHzl = osp;
    }

    /* JADX INFO: renamed from: o.oTp$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final C36051oNl AEQbTJ;
        public final /* synthetic */ C36217oTp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36051oNl EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36217oTp c36217oTp, C36051oNl c36051oNl) {
            super(c36051oNl.getRoot());
            Intrinsics.checkNotNullParameter(c36051oNl, "");
            this.copydefault = c36217oTp;
            this.AEQbTJ = c36051oNl;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36051oNl c36051oNlEZpvd = C36051oNl.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36051oNlEZpvd, "");
        return new ActionBar(this, c36051oNlEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull oSJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AppCompatSeekBar appCompatSeekBar = actionBar.EZpvd().OLrzqt;
        appCompatSeekBar.setProgress(taskDescription.AEQbTJ());
        appCompatSeekBar.setOnSeekBarChangeListener(new Activity());
    }

    /* JADX INFO: renamed from: o.oTp$Activity */
    public static final class Activity implements SeekBar.OnSeekBarChangeListener {
        public Activity() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            C36217oTp.this.KWHzl.OLrzqt(seekBar, i, z);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            C36217oTp.this.KWHzl.EZpvd(seekBar);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            C36217oTp.this.KWHzl.AEQbTJ(seekBar);
        }
    }
}
