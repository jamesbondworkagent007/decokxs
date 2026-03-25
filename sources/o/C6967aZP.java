package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6967aZP {
    public static /* synthetic */ C22404hei mapToEventTransactionBaseProperty$default(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 64) != 0) {
            str5 = "";
        }
        return AEQbTJ(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, str, str2, str3, str4, str5);
    }

    public static final C22404hei AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        java.lang.String chainName = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        java.lang.String tokenContractAddress = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        java.lang.String tokenContractAddress2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenContractAddress() : null;
        if (tokenContractAddress2 == null) {
            tokenContractAddress2 = "";
        }
        java.lang.String tokenSymbol = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        java.lang.String tokenSymbol2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenSymbol() : null;
        return new C22404hei(chainName, str5, tokenContractAddress, tokenContractAddress2, tokenSymbol, tokenSymbol2 == null ? "" : tokenSymbol2, str, str2, str3, str4);
    }
}
