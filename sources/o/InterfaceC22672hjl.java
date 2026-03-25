package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SimpleConfigBeanItem;
import com.okinc.business.dexlogic.bean.SwapBridgeDAppInfo;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hjl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22672hjl {
    void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean);

    boolean AEQbTJ(@NotNull java.lang.String str);

    java.util.ArrayList<SimpleConfigBeanItem> AhwBna();

    AbstractC58185ywX<TokenCheckInfo> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean);

    DexMultiTokenInfoBean KWHzl();

    AbstractC58185ywX<ResponseData<java.util.List<SwapBridgeDAppInfo>>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void KWHzl(int i);

    DexMultiTokenInfoBean fetchVPNInfo();

    int isConnected();
}
