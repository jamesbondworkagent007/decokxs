package o;

import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.business.dex.trade.common.boost.model.LimitOrderConfirmResponse;
import com.okinc.business.dex.trade.common.boost.repository.BoostVolumeRepositoryImpl$confirmLimitOrder$2;
import com.okinc.business.dex.trade.common.boost.repository.BoostVolumeRepositoryImpl$estimateBoostVolume$2;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19754gOb implements gNX {
    public final InterfaceC23234huQ KWHzl;
    public final InterfaceC23225huH OLrzqt;

    @yCM
    public C19754gOb(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC23225huH interfaceC23225huH) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        this.KWHzl = interfaceC23234huQ;
        this.OLrzqt = interfaceC23225huH;
    }

    @Override // o.gNX
    public java.lang.Object EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull Continuation<? super AbstractC43419rot<BoostEstimateVolumeResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new BoostVolumeRepositoryImpl$estimateBoostVolume$2(this, i, str, str2, str3, str4, str5, str6, str7, null), continuation);
    }

    @Override // o.gNX
    public java.lang.Object EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, ServiceFeeInfo serviceFeeInfo, @NotNull Continuation<? super AbstractC43419rot<LimitOrderConfirmResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new BoostVolumeRepositoryImpl$confirmLimitOrder$2(this, i, str, str2, str3, str4, serviceFeeInfo, null), continuation);
    }
}
