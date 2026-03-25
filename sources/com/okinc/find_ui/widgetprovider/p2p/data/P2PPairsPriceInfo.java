package com.okinc.find_ui.widgetprovider.p2p.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class P2PPairsPriceInfo {
    public static final int $stable = 0;
    private final String crypto;
    private final String cryptoIconUrl;
    private final String fiat;
    private final String fiatGraphicSymbol;
    private final String price;
    private final String side;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ P2PPairsPriceInfo copy$default(P2PPairsPriceInfo p2PPairsPriceInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = p2PPairsPriceInfo.price;
        }
        if ((i & 2) != 0) {
            str2 = p2PPairsPriceInfo.side;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = p2PPairsPriceInfo.fiat;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = p2PPairsPriceInfo.crypto;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = p2PPairsPriceInfo.fiatGraphicSymbol;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = p2PPairsPriceInfo.cryptoIconUrl;
        }
        return p2PPairsPriceInfo.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fiatGraphicSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cryptoIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P2PPairsPriceInfo copy(@NotNull String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        return new P2PPairsPriceInfo(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PPairsPriceInfo)) {
            return false;
        }
        P2PPairsPriceInfo p2PPairsPriceInfo = (P2PPairsPriceInfo) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) p2PPairsPriceInfo.price) && Intrinsics.EZpvd((Object) this.side, (Object) p2PPairsPriceInfo.side) && Intrinsics.EZpvd((Object) this.fiat, (Object) p2PPairsPriceInfo.fiat) && Intrinsics.EZpvd((Object) this.crypto, (Object) p2PPairsPriceInfo.crypto) && Intrinsics.EZpvd((Object) this.fiatGraphicSymbol, (Object) p2PPairsPriceInfo.fiatGraphicSymbol) && Intrinsics.EZpvd((Object) this.cryptoIconUrl, (Object) p2PPairsPriceInfo.cryptoIconUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrypto() {
        return this.crypto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoIconUrl() {
        return this.cryptoIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiat() {
        return this.fiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatGraphicSymbol() {
        return this.fiatGraphicSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.price.hashCode();
        String str = this.side;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.fiat;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.crypto;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fiatGraphicSymbol;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.cryptoIconUrl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "P2PPairsPriceInfo(price=" + this.price + ", side=" + this.side + ", fiat=" + this.fiat + ", crypto=" + this.crypto + ", fiatGraphicSymbol=" + this.fiatGraphicSymbol + ", cryptoIconUrl=" + this.cryptoIconUrl + ")";
    }

    public P2PPairsPriceInfo(@NotNull String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
        this.side = str2;
        this.fiat = str3;
        this.crypto = str4;
        this.fiatGraphicSymbol = str5;
        this.cryptoIconUrl = str6;
    }
}
