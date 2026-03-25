package o;

import com.okinc.unify_trade.biz.subscribe.EstimatedPriceData;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49464uoz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54083wxf implements InterfaceC54501xKt<java.util.List<? extends EstimatedPriceData>, AbstractC49464uoz.Activity> {
    public final java.lang.String EZpvd;

    public C54083wxf(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public AbstractC49464uoz.Activity KWHzl(@NotNull java.util.List<EstimatedPriceData> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedPriceData) next).getInstId(), (java.lang.Object) this.EZpvd)) {
                break;
            }
        }
        EstimatedPriceData estimatedPriceData = (EstimatedPriceData) next;
        if (estimatedPriceData != null) {
            return new AbstractC49464uoz.Activity(estimatedPriceData.getInstType(), estimatedPriceData.getInstId(), estimatedPriceData.getSettlePx(), null, 8, null);
        }
        return null;
    }
}
