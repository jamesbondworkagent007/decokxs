package com.okinc.unify_trade.biz;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WatchListBean {
    private String alias;
    private String chainId;
    private String expTime;
    private String instId;
    private String instType;
    private String tokenContractAddress;
    private String tokenName;
    private String tokenSymbol;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlias(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.alias = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenSymbol = str;
    }

    public WatchListBean() {
        this.alias = "";
        this.expTime = "";
        this.instId = "";
        this.instType = "";
        this.chainId = "";
        this.tokenContractAddress = "";
        this.tokenName = "";
        this.tokenSymbol = "";
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.WatchListBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final WatchListBean AEQbTJ(@NotNull WatchListData watchListData) {
            Intrinsics.checkNotNullParameter(watchListData, "");
            return new WatchListBean(watchListData.getAlias(), watchListData.getExpTime(), watchListData.getInstId(), watchListData.getInstType(), watchListData.getChainId(), watchListData.getTokenContractAddress(), watchListData.getTokenSymbol(), watchListData.getTokenName());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchListBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        this();
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.alias = str;
        this.expTime = str2;
        this.instId = str3;
        this.instType = str4;
        this.chainId = str5;
        this.tokenContractAddress = str6;
        this.tokenSymbol = str7;
        this.tokenName = str8;
    }

    public final WatchListData getWatchlistData() {
        return new WatchListData(this.alias, this.expTime, this.instId, this.instType, this.chainId, this.tokenContractAddress, this.tokenSymbol, this.tokenName);
    }

    public final boolean isNotEmpty() {
        return C33129mqd.OLrzqt((CharSequence) this.instId) && C33129mqd.OLrzqt((CharSequence) this.instType);
    }

    public int hashCode() {
        return Objects.hash(this.alias, this.instId, this.instType, this.chainId, this.tokenContractAddress);
    }

    public boolean equals(Object obj) {
        if (obj instanceof WatchListBean) {
            WatchListBean watchListBean = (WatchListBean) obj;
            if (Intrinsics.EZpvd((Object) watchListBean.alias, (Object) this.alias) && Intrinsics.EZpvd((Object) watchListBean.instId, (Object) this.instId) && Intrinsics.EZpvd((Object) watchListBean.instType, (Object) this.instType) && Intrinsics.EZpvd((Object) watchListBean.chainId, (Object) this.chainId) && Intrinsics.EZpvd((Object) watchListBean.tokenContractAddress, (Object) this.tokenContractAddress)) {
                return true;
            }
        }
        return false;
    }
}
