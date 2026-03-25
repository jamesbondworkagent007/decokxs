package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CeDefiTransferSignData extends BaseSignData {
    public static final int $stable = 8;
    private final String accountId;
    private final String chainIndex;
    private final int decimalNum;
    private final String displayName;
    private final int displayPrecision;
    private final String fromAddress;
    private final String imgUrl;
    private final boolean isToken;
    private final String originTokenAmount;
    private final String symbol;
    private final String toAddress;
    private final String tokenAddress;
    private String tokenAmount;
    private final String usdValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisplayPrecision() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginTokenAmount() {
        return this.originTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValue() {
        return this.usdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isToken() {
        return this.isToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAmount = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CeDefiTransferSignData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, @NotNull String str10) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.accountId = str;
        this.chainIndex = str2;
        this.tokenAddress = str3;
        this.fromAddress = str4;
        this.toAddress = str5;
        this.tokenAmount = str6;
        this.decimalNum = i;
        this.displayPrecision = i2;
        this.usdValue = str7;
        this.symbol = str8;
        this.imgUrl = str9;
        this.isToken = z;
        this.displayName = str10;
        this.originTokenAmount = str6;
    }
}
