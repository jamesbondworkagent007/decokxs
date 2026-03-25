package o;

import com.okinc.business.market.features.overview.domain.RwaTradingStatus;
import com.okinc.business.market.features.rwa.ui.RwaStatusItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29166koX extends AbstractC25436iwg<RwaTradingStatus, hCU> {
    public C29166koX() {
        super(RwaStatusItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCU> c25435iwf, @NotNull RwaTradingStatus rwaTradingStatus) {
        kotlin.Pair pair;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(rwaTradingStatus, "");
        hCU hcu = (hCU) c25435iwf.EZpvd();
        android.content.Context context = hcu.getRoot().getContext();
        Intrinsics.copydefault(context);
        if (C33054mpH.AEQbTJ(context)) {
            pair = new kotlin.Pair(rwaTradingStatus.AEQbTJ(), rwaTradingStatus.KWHzl());
        } else {
            pair = new kotlin.Pair(rwaTradingStatus.OLrzqt(), rwaTradingStatus.EZpvd());
        }
        java.lang.String str = (java.lang.String) pair.component1();
        java.lang.String str2 = (java.lang.String) pair.component2();
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairOLrzqt = C29164koV.OLrzqt(str, context);
        int iIntValue = pairOLrzqt.component1().intValue();
        int iIntValue2 = pairOLrzqt.component2().intValue();
        android.widget.ImageView imageView = hcu.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.AEQbTJ(imageView, str2);
        hcu.copydefault.setColorFilter(iIntValue);
        hcu.copydefault.setBackground(C25386ivj.generateSolidBackground$default(C55298xhM.KWHzl(2.0f, context), java.lang.Integer.valueOf(iIntValue2), 0.0f, null, 12, null));
        hcu.KWHzl.setText(rwaTradingStatus.AYXKKw());
        hcu.EZpvd.setText(rwaTradingStatus.copydefault());
    }
}
