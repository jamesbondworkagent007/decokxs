package o;

import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34689ngo {
    public static final boolean AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        return Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean.getChainId(), (java.lang.Object) (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getChainId() : null)) && Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean.getTokenContractAddress(), (java.lang.Object) dexMultiTokenInfoBean2.getTokenContractAddress());
    }
}
