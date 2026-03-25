package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.premarket.PreMarketLandingMore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28099kOw extends AbstractC59533zio<PreMarketLandingMore, Activity> {
    public final Function0<Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.AEQbTJ;
    }

    public C28099kOw(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX INFO: renamed from: o.kOw$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity extends RecyclerView.ViewHolder {
        public static final int OLrzqt = C52794wYp.DbNXlk;
        public final C52794wYp AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52794wYp copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = (C52794wYp) view.findViewById(qZH.StateListAnimator.DjwCMv);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.iZzfmt, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull PreMarketLandingMore preMarketLandingMore) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(preMarketLandingMore, "");
        C52794wYp c52794wYpCopydefault = activity.copydefault();
        c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
    }

    /* JADX INFO: renamed from: o.kOw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C28099kOw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C28099kOw c28099kOw) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c28099kOw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.copydefault().invoke();
            }
        }
    }
}
