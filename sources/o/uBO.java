package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.tradeuilib.widget.tradewith.TradeWithCryptoSelectDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uBO extends AbstractC59533zio<TradeWithCryptoSelectDialog.CryptoData, uBW> {
    public final Function1<TradeWithCryptoSelectDialog.CryptoData, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.tradeuilib.widget.tradewith.TradeWithCryptoSelectDialog$CryptoData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public uBO(@NotNull Function1<? super TradeWithCryptoSelectDialog.CryptoData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public uBW onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C49511upt.StateListAnimator.QUSxYX, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new uBW((AbstractC49621urx) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull uBW ubw, @NotNull final TradeWithCryptoSelectDialog.CryptoData cryptoData) {
        Intrinsics.checkNotNullParameter(ubw, "");
        Intrinsics.checkNotNullParameter(cryptoData, "");
        AbstractC49621urx abstractC49621urxKWHzl = ubw.KWHzl();
        android.widget.ImageView imageView = abstractC49621urxKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(cryptoData.isSelected() ? 0 : 8);
        abstractC49621urxKWHzl.KWHzl.setText(cryptoData.getCryptoName());
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(abstractC49621urxKWHzl.AEQbTJ.getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        java.lang.String cryptoIconUrl = cryptoData.getCryptoIconUrl();
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, cryptoIconUrl != null ? cryptoIconUrl : "", "lfit", 72, 72).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(abstractC49621urxKWHzl.AEQbTJ.getContext())).EZpvd(abstractC49621urxKWHzl.AEQbTJ);
        abstractC49621urxKWHzl.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.uBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uBO.KWHzl(this.AEQbTJ, cryptoData, view);
            }
        });
    }

    public static final void KWHzl(uBO ubo, TradeWithCryptoSelectDialog.CryptoData cryptoData, android.view.View view) {
        ubo.OLrzqt.invoke(cryptoData);
    }
}
