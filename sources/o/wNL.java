package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wNL extends AbstractC59533zio<DetailsData, wNM> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public wNM onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.fMBJsc, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new wNM((uWX) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull wNM wnm, @NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(wnm, "");
        Intrinsics.checkNotNullParameter(detailsData, "");
        uWX uwxAEQbTJ = wnm.AEQbTJ();
        if (uwxAEQbTJ.copydefault.getAdapter() == null) {
            uwxAEQbTJ.copydefault.setLayoutManager(new GridLayoutManager(uwxAEQbTJ.getRoot().getContext(), 2));
            uwxAEQbTJ.copydefault.addItemDecoration(new C57584ylF(2, 0, C55298xhM.dp2px$default(16.0f, null, 1, null)));
            C59534zip c59534zip = new C59534zip();
            android.content.Context context = uwxAEQbTJ.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context, null, false, 0, false, null, null, null, 254, null));
            uwxAEQbTJ.copydefault.setAdapter(c59534zip);
        }
        uwxAEQbTJ.EZpvd.setText(detailsData.getTvTitle());
        uwxAEQbTJ.OLrzqt.setText(detailsData.getType());
        uwxAEQbTJ.AEQbTJ.setText(detailsData.getTime());
        if (detailsData.getSideColor() != 0) {
            uwxAEQbTJ.OLrzqt.setTextColor(detailsData.getSideColor());
        }
        if (detailsData.getSideBgColor() != 0) {
            uwxAEQbTJ.OLrzqt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(detailsData.getSideBgColor()));
        }
        java.util.ArrayList<TacticsInsideItemData> subData = detailsData.getSubData();
        if (subData != null) {
            RecyclerView.Adapter adapter = uwxAEQbTJ.copydefault.getAdapter();
            Intrinsics.copydefault(adapter, "");
            C33064mpR.OLrzqt((C59534zip) adapter, subData);
        }
    }
}
