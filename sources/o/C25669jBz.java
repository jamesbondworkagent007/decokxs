package o;

import com.google.gson.annotations.SerializedName;
import com.okinc.business.market.data.model.CompactTagData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25669jBz {
    public static final int $stable = 8;

    @SerializedName("cid")
    private final int chainId;

    @SerializedName("lt")
    private final long lt;

    @SerializedName("ntb")
    private final java.lang.String networkTokenBalance;

    @SerializedName("pt")
    private final java.lang.String periodType;

    @SerializedName("ph")
    private final java.util.List<java.util.List<java.lang.String>> ph;

    @SerializedName("pnl")
    private final java.lang.String pnl;

    @SerializedName("roi")
    private final java.lang.String roi;

    @SerializedName("t")
    private final java.util.List<CompactTagData> tags;

    @SerializedName("txs")
    private final int txs;

    @SerializedName("wa")
    private final java.lang.String walletAddress;

    @SerializedName("wltn")
    private final java.util.List<java.lang.Integer> winLossToken;

    @SerializedName("wr")
    private final java.lang.String winRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.lt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CompactTagData> AYXKKw() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.txs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.winRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.networkTokenBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25669jBz EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<CompactTagData> list, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<java.lang.Integer> list2, int i2, long j, @NotNull java.util.List<? extends java.util.List<java.lang.String>> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new C25669jBz(str, list, i, str2, str3, str4, str5, str6, list2, i2, j, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> OLrzqt() {
        return this.ph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.roi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25669jBz)) {
            return false;
        }
        C25669jBz c25669jBz = (C25669jBz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.walletAddress, (java.lang.Object) c25669jBz.walletAddress) && Intrinsics.EZpvd(this.tags, c25669jBz.tags) && this.chainId == c25669jBz.chainId && Intrinsics.EZpvd((java.lang.Object) this.networkTokenBalance, (java.lang.Object) c25669jBz.networkTokenBalance) && Intrinsics.EZpvd((java.lang.Object) this.periodType, (java.lang.Object) c25669jBz.periodType) && Intrinsics.EZpvd((java.lang.Object) this.pnl, (java.lang.Object) c25669jBz.pnl) && Intrinsics.EZpvd((java.lang.Object) this.roi, (java.lang.Object) c25669jBz.roi) && Intrinsics.EZpvd((java.lang.Object) this.winRate, (java.lang.Object) c25669jBz.winRate) && Intrinsics.EZpvd(this.winLossToken, c25669jBz.winLossToken) && this.txs == c25669jBz.txs && this.lt == c25669jBz.lt && Intrinsics.EZpvd(this.ph, c25669jBz.ph);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.walletAddress.hashCode() * 31) + this.tags.hashCode()) * 31) + java.lang.Integer.hashCode(this.chainId)) * 31) + this.networkTokenBalance.hashCode()) * 31) + this.periodType.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.roi.hashCode()) * 31) + this.winRate.hashCode()) * 31) + this.winLossToken.hashCode()) * 31) + java.lang.Integer.hashCode(this.txs)) * 31) + java.lang.Long.hashCode(this.lt)) * 31) + this.ph.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> isConnected() {
        return this.winLossToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardCardData(walletAddress=" + this.walletAddress + ", tags=" + this.tags + ", chainId=" + this.chainId + ", networkTokenBalance=" + this.networkTokenBalance + ", periodType=" + this.periodType + ", pnl=" + this.pnl + ", roi=" + this.roi + ", winRate=" + this.winRate + ", winLossToken=" + this.winLossToken + ", txs=" + this.txs + ", lt=" + this.lt + ", ph=" + this.ph + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.pnl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25669jBz(@NotNull java.lang.String str, @NotNull java.util.List<CompactTagData> list, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.util.List<java.lang.Integer> list2, int i2, long j, @NotNull java.util.List<? extends java.util.List<java.lang.String>> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.walletAddress = str;
        this.tags = list;
        this.chainId = i;
        this.networkTokenBalance = str2;
        this.periodType = str3;
        this.pnl = str4;
        this.roi = str5;
        this.winRate = str6;
        this.winLossToken = list2;
        this.txs = i2;
        this.lt = j;
        this.ph = list3;
    }
}
