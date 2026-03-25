package o;

import com.okinc.business.market.data.model.BannerEventData;
import com.okinc.business.market.features.event.repo.BannerEventRepositoryImpl$getBanners$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jRT implements jRU {
    public final int KWHzl;
    public final InterfaceC23229huL OLrzqt;
    public final java.lang.String copydefault;

    @yCM
    public jRT(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.OLrzqt = interfaceC23229huL;
        this.copydefault = "recLocs";
        this.KWHzl = 3;
    }

    @Override // o.jRU
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<BannerEventData>, OKServerException>> continuation) {
        return kAB.EZpvd(new BannerEventRepositoryImpl$getBanners$2(this, null), continuation);
    }
}
