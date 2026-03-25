package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.okex.rating.bean.RatingLabelDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class syG extends AbstractC45381soi<RatingLabelDisplayModel, ActionBar> {
    public Activity copydefault;

    public interface Activity {
        void copydefault(long j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = activity;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47464tqY abstractC47464tqYKWHzl = AbstractC47464tqY.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47464tqYKWHzl, "");
        abstractC47464tqYKWHzl.getRoot().setLayoutParams(new FlexboxLayoutManager.LayoutParams(-2, -2));
        return new ActionBar(this, abstractC47464tqYKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        RatingLabelDisplayModel ratingLabelDisplayModel = copydefault().getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(ratingLabelDisplayModel, "");
        actionBar.EZpvd(ratingLabelDisplayModel);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull RatingLabelDisplayModel ratingLabelDisplayModel, @NotNull RatingLabelDisplayModel ratingLabelDisplayModel2) {
        Intrinsics.checkNotNullParameter(ratingLabelDisplayModel, "");
        Intrinsics.checkNotNullParameter(ratingLabelDisplayModel2, "");
        return ratingLabelDisplayModel.getId() == ratingLabelDisplayModel2.getId();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull RatingLabelDisplayModel ratingLabelDisplayModel, @NotNull RatingLabelDisplayModel ratingLabelDisplayModel2) {
        Intrinsics.checkNotNullParameter(ratingLabelDisplayModel, "");
        Intrinsics.checkNotNullParameter(ratingLabelDisplayModel2, "");
        return ratingLabelDisplayModel.isSelected() == ratingLabelDisplayModel2.isSelected() && Intrinsics.EZpvd((java.lang.Object) ratingLabelDisplayModel.getText(), (java.lang.Object) ratingLabelDisplayModel2.getText());
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC47464tqY KWHzl;
        public final /* synthetic */ syG OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull syG syg, AbstractC47464tqY abstractC47464tqY) {
            super(abstractC47464tqY.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47464tqY, "");
            this.OLrzqt = syg;
            this.KWHzl = abstractC47464tqY;
        }

        public final void EZpvd(@NotNull RatingLabelDisplayModel ratingLabelDisplayModel) {
            Intrinsics.checkNotNullParameter(ratingLabelDisplayModel, "");
            wYS wys = this.KWHzl.EZpvd;
            wys.setText(ratingLabelDisplayModel.getText());
            wys.setSelected(ratingLabelDisplayModel.isSelected());
            wYS wys2 = this.KWHzl.EZpvd;
            wys2.setOnClickListener(new Application(wys2, 1000L, this.OLrzqt, ratingLabelDisplayModel));
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ syG AEQbTJ;
            public final /* synthetic */ RatingLabelDisplayModel EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, syG syg, RatingLabelDisplayModel ratingLabelDisplayModel) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.AEQbTJ = syg;
                this.EZpvd = ratingLabelDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    Activity activity = this.AEQbTJ.copydefault;
                    if (activity != null) {
                        activity.copydefault(this.EZpvd.getId());
                    }
                }
            }
        }
    }
}
