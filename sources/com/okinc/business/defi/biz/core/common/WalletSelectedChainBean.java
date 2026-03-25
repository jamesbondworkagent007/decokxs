package com.okinc.business.defi.biz.core.common;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletSelectedChainBean {
    public static final int $stable = 0;
    private final String chainIconUrl;
    private final String chainId;
    private final String chainName;
    private final String generalChainId;
    private final String rpcUrl;
    private final String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSelectedChainBean copy$default(WalletSelectedChainBean walletSelectedChainBean, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSelectedChainBean.walletId;
        }
        if ((i & 2) != 0) {
            str2 = walletSelectedChainBean.chainId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = walletSelectedChainBean.generalChainId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = walletSelectedChainBean.rpcUrl;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = walletSelectedChainBean.chainName;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = walletSelectedChainBean.chainIconUrl;
        }
        return walletSelectedChainBean.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.rpcUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSelectedChainBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new WalletSelectedChainBean(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSelectedChainBean)) {
            return false;
        }
        WalletSelectedChainBean walletSelectedChainBean = (WalletSelectedChainBean) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletSelectedChainBean.walletId) && Intrinsics.EZpvd((Object) this.chainId, (Object) walletSelectedChainBean.chainId) && Intrinsics.EZpvd((Object) this.generalChainId, (Object) walletSelectedChainBean.generalChainId) && Intrinsics.EZpvd((Object) this.rpcUrl, (Object) walletSelectedChainBean.rpcUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) walletSelectedChainBean.chainName) && Intrinsics.EZpvd((Object) this.chainIconUrl, (Object) walletSelectedChainBean.chainIconUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIconUrl() {
        return this.chainIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGeneralChainId() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRpcUrl() {
        return this.rpcUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.generalChainId.hashCode()) * 31) + this.rpcUrl.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainIconUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSelectedChainBean(walletId=" + this.walletId + ", chainId=" + this.chainId + ", generalChainId=" + this.generalChainId + ", rpcUrl=" + this.rpcUrl + ", chainName=" + this.chainName + ", chainIconUrl=" + this.chainIconUrl + ")";
    }

    public WalletSelectedChainBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.walletId = str;
        this.chainId = str2;
        this.generalChainId = str3;
        this.rpcUrl = str4;
        this.chainName = str5;
        this.chainIconUrl = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.common.WalletSelectedChainBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletSelectedChainBean(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final boolean isAllNetwork() {
        return Intrinsics.EZpvd((Object) this.chainId, (Object) "-9223372036854775808");
    }

    public final boolean isSingleMode() {
        return C33129mqd.OLrzqt((CharSequence) this.rpcUrl);
    }
}
