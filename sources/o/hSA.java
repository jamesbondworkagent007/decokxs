package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexlogic.liquiditypools.LiquidityType;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes6.dex */
public final class hSA extends C21967hSz {
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.C21967hSz, o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hDM> c25435iwf, @NotNull hSH hsh) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(hsh, "");
        super.onBindViewHolder(c25435iwf, hsh);
        if (hsh instanceof hSE) {
            hDM hdm = (hDM) c25435iwf.EZpvd();
            AppCompatTextView appCompatTextView = hdm.copydefault;
            Intrinsics.copydefault(appCompatTextView);
            C55296xhK.OLrzqt(appCompatTextView, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(14.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(14.0f));
            hSE hse = (hSE) hsh;
            java.lang.String strCopydefault = hse.copydefault();
            if (C23313hvq.copydefault(LiquidityType.REMOVE_LIQUIDITY.getValue(), hse.KWHzl())) {
                appCompatTextView.setText(hSP.OLrzqt(strCopydefault, "-"));
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                appCompatTextView.setTextColor(C33512mxp.tradeFallDefault$default(c33512mxp, context, 0.0f, 2, null));
            } else {
                appCompatTextView.setText(hSP.OLrzqt(strCopydefault, Marker.ANY_NON_NULL_MARKER));
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                appCompatTextView.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp2, context2, 0.0f, 2, null));
            }
            AppCompatTextView appCompatTextView2 = hdm.KWHzl;
            appCompatTextView2.setText(hse.EZpvd());
            Intrinsics.copydefault(appCompatTextView2);
            C55296xhK.OLrzqt(appCompatTextView2, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(14.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(14.0f));
            appCompatTextView2.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        }
    }
}
