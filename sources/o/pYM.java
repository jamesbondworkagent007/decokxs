package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.okinc.market.discover.features.filter.data.model.FilterCoinVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class pYM extends AbstractC40510qYn<FilterCoinVo.Coin, C42798rdH> {
    public final pYE KWHzl;

    public pYM(@NotNull pYE pye) {
        Intrinsics.checkNotNullParameter(pye, "");
        this.KWHzl = pye;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42798rdH AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42798rdH c42798rdHOLrzqt = C42798rdH.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42798rdHOLrzqt, "");
        return c42798rdHOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42798rdH c42798rdH, int i, @NotNull final FilterCoinVo.Coin coin) {
        Intrinsics.checkNotNullParameter(c42798rdH, "");
        Intrinsics.checkNotNullParameter(coin, "");
        android.content.Context context = c42798rdH.getRoot().getContext();
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, coin.EZpvd(), "lfit", 28, 28).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(context)).djBIcL().EZpvd((android.widget.ImageView) c42798rdH.KWHzl);
        if (coin.OLrzqt().length() == 0) {
            c42798rdH.OLrzqt.setText(coin.KWHzl());
        } else {
            AppCompatTextView appCompatTextView = c42798rdH.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            C40359qSy.addHighLightTv$default(appCompatTextView, coin.KWHzl(), coin.OLrzqt(), false, 8, null);
        }
        c42798rdH.AEQbTJ.setSelected(coin.AEQbTJ());
        c42798rdH.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.pYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pYM.OLrzqt(c42798rdH, coin, this, view);
            }
        });
    }

    public static final void OLrzqt(C42798rdH c42798rdH, FilterCoinVo.Coin coin, pYM pym, android.view.View view) {
        c42798rdH.AEQbTJ.setSelected(!coin.AEQbTJ());
        pym.KWHzl.copydefault(FilterCoinVo.Coin.copy$default(coin, null, null, c42798rdH.AEQbTJ.isSelected(), false, null, 27, null));
    }
}
