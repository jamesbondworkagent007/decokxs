package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedConfigRepositoryImpl$fetchMainConfig$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedConfigRepositoryImpl$getChainList$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedConfigRepositoryImpl$getLimitChainList$2;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28147kQq implements InterfaceC28150kQt {
    public final InterfaceC23234huQ AEQbTJ;
    public final InterfaceC23225huH copydefault;

    @yCM
    public C28147kQq(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC23225huH interfaceC23225huH) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        this.AEQbTJ = interfaceC23234huQ;
        this.copydefault = interfaceC23225huH;
    }

    @Override // o.InterfaceC28150kQt
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<AdvancedMainConfig>, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedConfigRepositoryImpl$fetchMainConfig$2(this, null), continuation);
    }

    @Override // o.InterfaceC28150kQt
    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedConfigRepositoryImpl$getChainList$2(this, null), continuation);
    }

    @Override // o.InterfaceC28150kQt
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DefiChainInfo>, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedConfigRepositoryImpl$getLimitChainList$2(this, null), continuation);
    }
}
