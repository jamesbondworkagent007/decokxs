package o;

import com.okinc.dexkline.market.data.model.CoinRiskData;
import com.okinc.dexkline.market.features.coincheck.repo.CoinCheckRepositoryImpl$getRiskCheck$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mWv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32298mWv implements InterfaceC32301mWy {
    public final InterfaceC32162mRu AEQbTJ;

    @yCM
    public C32298mWv(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        this.AEQbTJ = interfaceC32162mRu;
    }

    @Override // o.InterfaceC32301mWy
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<CoinRiskData, OKServerException>> continuation) {
        return C34583nen.AEQbTJ(new CoinCheckRepositoryImpl$getRiskCheck$2(this, str, str2, null), continuation);
    }
}
