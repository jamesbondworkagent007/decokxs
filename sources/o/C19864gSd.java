package o;

import com.okinc.business.dex.trade.copytrading.domain.repository.CoinAssetRepositoryImpl$getTokenInfo$2;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19864gSd implements InterfaceC19862gSb {
    public final InterfaceC23234huQ OLrzqt;

    @yCM
    public C19864gSd(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.OLrzqt = interfaceC23234huQ;
    }

    @Override // o.InterfaceC19862gSb
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DexMultiTokenInfoBean, OKServerException>> continuation) {
        return kAB.EZpvd(new CoinAssetRepositoryImpl$getTokenInfo$2(this, str, str2, str3, str4, str5, null), continuation);
    }
}
