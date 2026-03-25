package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jCW extends RecyclerView.Adapter<Activity> {
    public int AEQbTJ;
    public final Function2<LeaderBoardSortModel, java.lang.Integer, Unit> EZpvd;
    public final java.util.List<LeaderBoardSortModel> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jCW(@NotNull java.util.List<LeaderBoardSortModel> list, Function2<? super LeaderBoardSortModel, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.EZpvd = function2;
        this.AEQbTJ = -1;
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final C21628hGk EZpvd;
        public final /* synthetic */ jCW KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21628hGk OLrzqt() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull jCW jcw, C21628hGk c21628hGk) {
            super(c21628hGk.getRoot());
            Intrinsics.checkNotNullParameter(c21628hGk, "");
            this.KWHzl = jcw;
            this.EZpvd = c21628hGk;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21628hGk c21628hGkOLrzqt = C21628hGk.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21628hGkOLrzqt, "");
        return new Activity(this, c21628hGkOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        final LeaderBoardSortModel leaderBoardSortModel = this.OLrzqt.get(activity.getBindingAdapterPosition());
        final C21628hGk c21628hGkOLrzqt = activity.OLrzqt();
        OKRegularCell oKRegularCell = c21628hGkOLrzqt.AEQbTJ;
        oKRegularCell.setTitle(leaderBoardSortModel.getFilterLabel());
        int i2 = 0;
        oKRegularCell.EZpvd().setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(oKRegularCell.getContext(), C52761wXj.Dialog.valueOf), 0));
        oKRegularCell.EZpvd().setTextSize(16.0f);
        AppCompatImageView appCompatImageView = c21628hGkOLrzqt.KWHzl;
        if (leaderBoardSortModel.isSelected()) {
            this.AEQbTJ = activity.getBindingAdapterPosition();
        } else {
            i2 = 8;
        }
        appCompatImageView.setVisibility(i2);
        C25352ivB.setOnDoubleCheckClickListener$default(oKRegularCell, 0L, new Function1() { // from class: o.jDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jCW.KWHzl(c21628hGkOLrzqt, this, leaderBoardSortModel, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C21628hGk c21628hGk, jCW jcw, LeaderBoardSortModel leaderBoardSortModel, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c21628hGk.KWHzl.setVisibility(0);
        Function2<LeaderBoardSortModel, java.lang.Integer, Unit> function2 = jcw.EZpvd;
        if (function2 != null) {
            function2.invoke(leaderBoardSortModel, java.lang.Integer.valueOf(jcw.AEQbTJ));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }
}
