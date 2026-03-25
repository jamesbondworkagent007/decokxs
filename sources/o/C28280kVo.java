package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.repository.MemeCoinRepositoryImpl$checkTokenPair$2;
import com.okinc.business.trade.features.home.meme.repository.MemeCoinRepositoryImpl$memeSearch$2;
import com.okinc.business.trade.features.home.meme.repository.MemeCoinRepositoryImpl$tokenAdd$2;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.business.trade.features.home.ui.meme.data.MemeSearchBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28280kVo implements InterfaceC28274kVi {
    public final InterfaceC23234huQ KWHzl;

    @yCM
    public C28280kVo(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.KWHzl = interfaceC23234huQ;
    }

    @Override // o.InterfaceC28274kVi
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<MemeSearchBean, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeCoinRepositoryImpl$memeSearch$2(this, str, str2, str3, str4, null), continuation);
    }

    @Override // o.InterfaceC28274kVi
    public java.lang.Object copydefault(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeCoinRepositoryImpl$tokenAdd$2(this, dexMultiTokenDetailReq, null), continuation);
    }

    @Override // o.InterfaceC28274kVi
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<ValidateTokensResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeCoinRepositoryImpl$checkTokenPair$2(this, str, str5, str4, str3, str2, null), continuation);
    }
}
