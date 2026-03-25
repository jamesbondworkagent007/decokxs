package o;

import com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData;
import com.okinc.dexkline.market.features.position.repo.LatestPnLRepositoryImpl$getLatestPnL$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34468nce implements InterfaceC34472nci {
    public final InterfaceC32260mVk AEQbTJ;

    @yCM
    public C34468nce(@NotNull InterfaceC32260mVk interfaceC32260mVk) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        this.AEQbTJ = interfaceC32260mVk;
    }

    @Override // o.InterfaceC34472nci
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<LatestPnLData, OKServerException>> continuation) {
        return C34583nen.AEQbTJ(new LatestPnLRepositoryImpl$getLatestPnL$2(str2, str, str3, this, null), continuation);
    }
}
