package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.oSJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36216oTo extends AbstractC59533zio<oSJ.Activity, ActionBar> {
    public final oSP AEQbTJ;

    public C36216oTo(@NotNull oSP osp) {
        Intrinsics.checkNotNullParameter(osp, "");
        this.AEQbTJ = osp;
    }

    /* JADX INFO: renamed from: o.oTo$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final C36054oNo EZpvd;
        public final /* synthetic */ C36216oTo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36054oNo EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36216oTo c36216oTo, C36054oNo c36054oNo) {
            super(c36054oNo.getRoot());
            Intrinsics.checkNotNullParameter(c36054oNo, "");
            this.OLrzqt = c36216oTo;
            this.EZpvd = c36054oNo;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36054oNo c36054oNoAEQbTJ = C36054oNo.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36054oNoAEQbTJ, "");
        return new ActionBar(this, c36054oNoAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull oSJ.Activity activity) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(activity, "");
        C36054oNo c36054oNoEZpvd = actionBar.EZpvd();
        LinearLayoutCompat root = c36054oNoEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(activity.AEQbTJ() ^ true ? 4 : 0);
        c36054oNoEZpvd.KWHzl.setText(activity.EZpvd());
        AppCompatImageView appCompatImageView = c36054oNoEZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(activity.OLrzqt() ? 0 : 8);
        c36054oNoEZpvd.AEQbTJ.setImageResource(activity.copydefault());
        android.view.View view = actionBar.itemView;
        view.setOnClickListener(new Application(view, 1000L, this, activity, c36054oNoEZpvd));
    }

    /* JADX INFO: renamed from: o.oTo$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C36054oNo KWHzl;
        public final /* synthetic */ oSJ.Activity OLrzqt;
        public final /* synthetic */ C36216oTo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C36216oTo c36216oTo, oSJ.Activity activity, C36054oNo c36054oNo) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c36216oTo;
            this.OLrzqt = activity;
            this.KWHzl = c36054oNo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AEQbTJ.copydefault(this.OLrzqt);
                AppCompatImageView appCompatImageView = this.KWHzl.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(8);
            }
        }
    }
}
