package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedMyAssetsRepositoryImpl$getAdvancedMyPositionList$2;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kQC implements InterfaceC28156kQz {
    public final kYC EZpvd;
    public final InterfaceC23234huQ copydefault;

    @yCM
    public kQC(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.copydefault = interfaceC23234huQ;
        this.EZpvd = kyc;
    }

    @Override // o.InterfaceC28156kQz
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.util.List<DexMultiTokenInfoBean> list, @NotNull AdvancedAssetsFilter advancedAssetsFilter, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedMyAssetsRepositoryImpl$getAdvancedMyPositionList$2(this, str, str2, str3, advancedAssetsFilter, list, null), continuation);
    }

    @Override // o.InterfaceC28156kQz
    public java.lang.Object OLrzqt(@NotNull AdvancedAssetsFilter advancedAssetsFilter, @NotNull Continuation<? super Unit> continuation) {
        SPUtils.put("key_dex_advanced_assets_filter", C23316hvt.OLrzqt(advancedAssetsFilter));
        return Unit.INSTANCE;
    }
}
