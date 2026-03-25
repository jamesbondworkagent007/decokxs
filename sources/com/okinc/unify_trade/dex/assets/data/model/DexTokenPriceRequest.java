package com.okinc.unify_trade.dex.assets.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class DexTokenPriceRequest {
    public static final int $stable = 8;
    private final List<TokenList> tokenList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.dex.assets.data.model.DexTokenPriceRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexTokenPriceRequest copy$default(DexTokenPriceRequest dexTokenPriceRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexTokenPriceRequest.tokenList;
        }
        return dexTokenPriceRequest.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenList> component1() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenPriceRequest copy(@NotNull List<TokenList> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DexTokenPriceRequest(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DexTokenPriceRequest) && Intrinsics.EZpvd(this.tokenList, ((DexTokenPriceRequest) obj).tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenList> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.tokenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTokenPriceRequest(tokenList=" + this.tokenList + ")";
    }

    public DexTokenPriceRequest(@NotNull List<TokenList> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tokenList = list;
    }
}
