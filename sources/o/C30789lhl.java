package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30789lhl {
    @yCM
    public C30789lhl() {
    }

    public final java.util.List<UIPricingToken> OLrzqt(@NotNull java.util.List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new UIPricingToken((DexMultiTokenInfoBean) obj, i == 0));
            i++;
        }
        return arrayList;
    }
}
