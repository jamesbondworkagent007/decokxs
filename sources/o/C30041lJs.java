package o;

import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lJs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30041lJs {
    public static final C30041lJs EZpvd = new C30041lJs();

    private C30041lJs() {
    }

    public final boolean AEQbTJ(@NotNull C3682AqZ c3682AqZ) {
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        return Intrinsics.EZpvd((java.lang.Object) c3682AqZ.zLjUOn(), (java.lang.Object) TradeType.TOPUP.getType()) || Intrinsics.EZpvd((java.lang.Object) c3682AqZ.fetchVPNInfo(), (java.lang.Object) ChannelPlatformCode.PIX_BUY.getCode());
    }
}
