package o;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.dexui.main.market.detail.fragment.check.widget.CoinRiskListBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hSQ extends AbstractC25436iwg<C2296AGh, hAM> {
    public java.lang.String AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hSQ(@NotNull java.lang.String str) {
        super(CoinRiskListBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hAM> c25435iwf, @NotNull C2296AGh c2296AGh) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c2296AGh, "");
        android.content.Context context = ((hAM) c25435iwf.EZpvd()).getRoot().getContext();
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairAEQbTJ = jNK.AEQbTJ(c2296AGh.OLrzqt());
        int iIntValue = pairAEQbTJ.component1().intValue();
        int iIntValue2 = pairAEQbTJ.component2().intValue();
        Intrinsics.copydefault(context);
        int iKWHzl = C25382ivf.KWHzl(context, iIntValue2);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, iIntValue);
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, android.content.res.ColorStateList.valueOf(iKWHzl));
        } else {
            drawable = null;
        }
        hAM ham = (hAM) c25435iwf.EZpvd();
        ham.copydefault.setImageDrawable(drawable);
        ham.AEQbTJ.setText(c2296AGh.copydefault());
        ham.KWHzl.setText(c2296AGh.KWHzl());
        android.view.View view = ham.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(getAdapter().getItems().size() + (-1) != getPosition(c25435iwf) ? 0 : 8);
    }
}
