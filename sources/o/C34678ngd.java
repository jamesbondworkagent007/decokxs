package o;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.trade.features.home.advanced.repository.AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34678ngd implements InterfaceC34676ngb {
    public final InterfaceC32162mRu AEQbTJ;

    @yCM
    public C34678ngd(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        this.AEQbTJ = interfaceC32162mRu;
    }

    @Override // o.InterfaceC34676ngb
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<LatestMarketInfoBean, OKServerException>> continuation) {
        return C34583nen.AEQbTJ(new AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2(this, str2, str3, str, str4, null), continuation);
    }
}
