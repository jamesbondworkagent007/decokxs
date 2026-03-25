package o;

import com.okinc.business.invest_biz.data.bean.response.AdditionalData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23651iEg {
    @yCM
    public C23651iEg() {
    }

    public final java.util.List<iED> KWHzl(@NotNull java.util.List<AdditionalData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (AdditionalData additionalData : list) {
            arrayList.add(new iED(additionalData.OLrzqt(), additionalData.copydefault().OLrzqt(), additionalData.copydefault().AEQbTJ(), additionalData.copydefault().KWHzl()));
        }
        return arrayList;
    }
}
