package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLW implements InterfaceC54501xKt<java.util.List<? extends CountDownInfo>, java.util.List<? extends CountDownInfo>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.List<CountDownInfo> KWHzl(@NotNull java.util.List<CountDownInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return OLrzqt(list);
    }

    public final java.util.List<CountDownInfo> OLrzqt(java.util.List<CountDownInfo> list) {
        for (CountDownInfo countDownInfo : list) {
            countDownInfo.setOnlineTime(C33129mqd.addS$default(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), C33129mqd.mulS$default(countDownInfo.getWaitOnlineTime(), 1000, null, null, null, 14, null), null, null, null, 14, null));
        }
        return list;
    }
}
