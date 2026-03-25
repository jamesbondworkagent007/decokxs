package o;

import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46881tfY {
    public static final OrderType KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "one_time") ? OrderType.ONE_TIME : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring") ? OrderType.RECURRING : OrderType.NONE;
    }
}
