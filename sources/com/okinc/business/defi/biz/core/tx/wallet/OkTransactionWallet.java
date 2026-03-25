package com.okinc.business.defi.biz.core.tx.wallet;

import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.C10525bqB;
import o.C10854bwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OkTransactionWallet {
    public static final int $stable = 8;
    private String mAmount;
    private String mCanTransferAmount;
    private String mCanTransferChainAmount;
    private ChainAddress mChainAddress;
    private String mChainAmount;
    private String mChainCurrencyAmount;
    private C10854bwM mCoinMeta;
    private String mCurrencyAmount;
    private AbstractC12782ctV mWallet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final AbstractC12782ctV component1() {
        return this.mWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final C10854bwM component2() {
        return this.mCoinMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final ChainAddress component3() {
        return this.mChainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component4() {
        return this.mAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component5() {
        return this.mCanTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component6() {
        return this.mCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component7() {
        return this.mChainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component8() {
        return this.mCanTransferChainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component9() {
        return this.mChainCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkTransactionWallet copy(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return new OkTransactionWallet(abstractC12782ctV, c10854bwM, chainAddress, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OkTransactionWallet)) {
            return false;
        }
        OkTransactionWallet okTransactionWallet = (OkTransactionWallet) obj;
        return Intrinsics.EZpvd(this.mWallet, okTransactionWallet.mWallet) && Intrinsics.EZpvd(this.mCoinMeta, okTransactionWallet.mCoinMeta) && Intrinsics.EZpvd(this.mChainAddress, okTransactionWallet.mChainAddress) && Intrinsics.EZpvd((Object) this.mAmount, (Object) okTransactionWallet.mAmount) && Intrinsics.EZpvd((Object) this.mCanTransferAmount, (Object) okTransactionWallet.mCanTransferAmount) && Intrinsics.EZpvd((Object) this.mCurrencyAmount, (Object) okTransactionWallet.mCurrencyAmount) && Intrinsics.EZpvd((Object) this.mChainAmount, (Object) okTransactionWallet.mChainAmount) && Intrinsics.EZpvd((Object) this.mCanTransferChainAmount, (Object) okTransactionWallet.mCanTransferChainAmount) && Intrinsics.EZpvd((Object) this.mChainCurrencyAmount, (Object) okTransactionWallet.mChainCurrencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanTransferChainAmount() {
        String str = this.mCanTransferChainAmount;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanTransferCoinAmount() {
        String str = this.mCanTransferAmount;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainAddress getChainAddress() {
        return this.mChainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAmount() {
        String str = this.mChainAmount;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainCurrencyAmount() {
        String str = this.mChainCurrencyAmount;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        String str = this.mAmount;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM getCoinMeta() {
        return this.mCoinMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        String str = this.mCurrencyAmount;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV getWallet() {
        return this.mWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.mWallet.hashCode();
        int iHashCode2 = this.mCoinMeta.hashCode();
        int iHashCode3 = this.mChainAddress.hashCode();
        String str = this.mAmount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.mCanTransferAmount;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mCurrencyAmount;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mChainAmount;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.mCanTransferChainAmount;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.mChainCurrencyAmount;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OkTransactionWallet(mWallet=" + this.mWallet + ", mCoinMeta=" + this.mCoinMeta + ", mChainAddress=" + this.mChainAddress + ", mAmount=" + this.mAmount + ", mCanTransferAmount=" + this.mCanTransferAmount + ", mCurrencyAmount=" + this.mCurrencyAmount + ", mChainAmount=" + this.mChainAmount + ", mCanTransferChainAmount=" + this.mCanTransferChainAmount + ", mChainCurrencyAmount=" + this.mChainCurrencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void updateCanTransferChainAmount(String str) {
        this.mCanTransferChainAmount = str;
    }

    public OkTransactionWallet(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        this.mWallet = abstractC12782ctV;
        this.mCoinMeta = c10854bwM;
        this.mChainAddress = chainAddress;
        this.mAmount = str;
        this.mCanTransferAmount = str2;
        this.mCurrencyAmount = str3;
        this.mChainAmount = str4;
        this.mCanTransferChainAmount = str5;
        this.mChainCurrencyAmount = str6;
    }

    public final C10854bwM getChainMeta() {
        return this.mCoinMeta.KWHzl();
    }

    public final String getAddress() {
        if (!getCoinMeta().DarRvM()) {
            return getChainAddress().getAddress();
        }
        AbstractC12782ctV abstractC12782ctV = this.mWallet;
        C10854bwM chainMeta = getChainMeta();
        ChainAddress chainAddressOLrzqt = abstractC12782ctV.OLrzqt(chainMeta != null ? Long.valueOf(chainMeta.AhwBna()) : null);
        String address = chainAddressOLrzqt != null ? chainAddressOLrzqt.getAddress() : null;
        return address == null ? "" : address;
    }

    public final void updateCanTransferCoinAmount(String str) {
        this.mCanTransferAmount = str;
        if (this.mCoinMeta.hUfVAv()) {
            this.mAmount = str;
        }
    }

    public final void updateCoin(C10525bqB c10525bqB) {
        if (c10525bqB == null) {
            return;
        }
        this.mWallet = c10525bqB.values();
        this.mCoinMeta = c10525bqB.KWHzl();
        if (!c10525bqB.KWHzl().hUfVAv()) {
            this.mAmount = c10525bqB.copydefault();
        }
        if (!c10525bqB.KWHzl().AxsJAYaxsJAY() && !C10854bwM.isXRCToken$default(c10525bqB.KWHzl(), null, 1, null)) {
            this.mCanTransferAmount = c10525bqB.copydefault();
        }
        this.mCurrencyAmount = c10525bqB.AhwBna();
    }

    public final void updateChain(C10525bqB c10525bqB) {
        if (c10525bqB == null) {
            return;
        }
        this.mWallet = c10525bqB.values();
        this.mChainAmount = c10525bqB.copydefault();
        this.mCanTransferChainAmount = c10525bqB.copydefault();
        this.mChainCurrencyAmount = c10525bqB.AhwBna();
    }
}
