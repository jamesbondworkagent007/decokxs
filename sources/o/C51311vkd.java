package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51311vkd extends AbstractC59533zio<SignalTriggerData, C51309vkb> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51309vkb onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.sRzUNh, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C51309vkb((AbstractC48632uYp) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51309vkb c51309vkb, @NotNull SignalTriggerData signalTriggerData) {
        Intrinsics.checkNotNullParameter(c51309vkb, "");
        Intrinsics.checkNotNullParameter(signalTriggerData, "");
        AbstractC48632uYp abstractC48632uYpEZpvd = c51309vkb.EZpvd();
        android.content.Context context = abstractC48632uYpEZpvd.getRoot().getContext();
        Glide.AEQbTJ(context).EZpvd(signalTriggerData.copydefault()).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(context)).djBIcL().EZpvd((android.widget.ImageView) abstractC48632uYpEZpvd.EZpvd);
        abstractC48632uYpEZpvd.OLrzqt.setText(signalTriggerData.KWHzl());
        abstractC48632uYpEZpvd.KWHzl.setText(signalTriggerData.EZpvd());
        abstractC48632uYpEZpvd.AEQbTJ.setText(signalTriggerData.OLrzqt());
        abstractC48632uYpEZpvd.valueOf.setText(signalTriggerData.AEQbTJ());
    }
}
