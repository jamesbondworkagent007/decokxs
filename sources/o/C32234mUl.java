package o;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.dexkline.dexui.main.market.detail.fragment.check.widget.CoinRiskListBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32234mUl extends mUT<C32250mVa, oNT> {
    public java.lang.String KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32234mUl(@NotNull java.lang.String str) {
        super(CoinRiskListBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull mUU<oNT> muu, @NotNull C32250mVa c32250mVa) {
        Intrinsics.checkNotNullParameter(muu, "");
        Intrinsics.checkNotNullParameter(c32250mVa, "");
        android.content.Context context = ((oNT) muu.KWHzl()).getRoot().getContext();
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairKWHzl = C32252mVc.KWHzl(c32250mVa.OLrzqt());
        int iIntValue = pairKWHzl.component1().intValue();
        int iIntValue2 = pairKWHzl.component2().intValue();
        Intrinsics.copydefault(context);
        int iEZpvd = mUM.EZpvd(context, iIntValue2);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, iIntValue);
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, android.content.res.ColorStateList.valueOf(iEZpvd));
        } else {
            drawable = null;
        }
        oNT ont = (oNT) muu.KWHzl();
        ont.copydefault.setImageDrawable(drawable);
        ont.AEQbTJ.setText(c32250mVa.copydefault());
        ont.KWHzl.setText(c32250mVa.KWHzl());
        android.view.View view = ont.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(getAdapter().getItems().size() + (-1) != getPosition(muu) ? 0 : 8);
    }
}
