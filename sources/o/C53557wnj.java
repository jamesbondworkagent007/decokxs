package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53557wnj extends AbstractC59533zio<SelectCoinData, C53564wnq> {
    public final java.lang.String AEQbTJ;
    public final Function2<SelectCoinData, wYK, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.unify_trade.bot.data.SelectCoinData, ? super o.wYK, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C53557wnj(@NotNull java.lang.String str, @NotNull Function2<? super SelectCoinData, ? super wYK, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = str;
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C53564wnq onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.DcNNRp, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C53564wnq((AbstractC50956vdt) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C53564wnq c53564wnq, @NotNull final SelectCoinData selectCoinData) {
        Intrinsics.checkNotNullParameter(c53564wnq, "");
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        if (!selectCoinData.isShow() && !selectCoinData.isSearchVisible() && !selectCoinData.isSelected()) {
            android.view.View root = c53564wnq.KWHzl().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            OLrzqt(root, false);
            return;
        }
        android.view.View root2 = c53564wnq.KWHzl().getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        OLrzqt(root2, true);
        final AbstractC50956vdt abstractC50956vdtKWHzl = c53564wnq.KWHzl();
        abstractC50956vdtKWHzl.EZpvd.setSelected(selectCoinData.isSelected());
        abstractC50956vdtKWHzl.KWHzl.setText(selectCoinData.getName());
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(abstractC50956vdtKWHzl.AEQbTJ.getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        java.lang.String icon = selectCoinData.getIcon();
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, icon != null ? icon : "", "lfit", 72, 72).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(abstractC50956vdtKWHzl.AEQbTJ.getContext())).EZpvd(abstractC50956vdtKWHzl.AEQbTJ);
        abstractC50956vdtKWHzl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.wnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53557wnj.EZpvd(this.AEQbTJ, selectCoinData, c53564wnq, abstractC50956vdtKWHzl, view);
            }
        });
    }

    public static final void EZpvd(C53557wnj c53557wnj, SelectCoinData selectCoinData, C53564wnq c53564wnq, AbstractC50956vdt abstractC50956vdt, android.view.View view) {
        FuzzySearchEventTracker.EZpvd.KWHzl(FuzzySearchEventSourceEnum.OKTRADE_RECURRING.getSource(), c53557wnj.AEQbTJ, C33129mqd.gEmmrt(selectCoinData.getPrimary()), C33129mqd.gEmmrt(selectCoinData.getSecondary()), C33129mqd.gEmmrt(java.lang.Double.valueOf(selectCoinData.getPrimarySimilarity())), C33129mqd.gEmmrt(java.lang.Double.valueOf(selectCoinData.getPrimarySimilarity())), C33129mqd.gEmmrt(java.lang.Integer.valueOf(c53564wnq.getAbsoluteAdapterPosition() + 1)));
        Function2<SelectCoinData, wYK, Unit> function2 = c53557wnj.KWHzl;
        wYK wyk = abstractC50956vdt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        function2.invoke(selectCoinData, wyk);
    }

    private final void OLrzqt(android.view.View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = z ? -2 : 0;
        view.setLayoutParams(layoutParams);
    }
}
