package com.okinc.business.market.data.model.history;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class NativeTokenPriceData {
    public static final int $stable = 0;
    private final String nativeTokenAddress;
    private final String price;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final String wrapperTokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NativeTokenPriceData() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NativeTokenPriceData copy$default(NativeTokenPriceData nativeTokenPriceData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeTokenPriceData.price;
        }
        if ((i & 2) != 0) {
            str2 = nativeTokenPriceData.nativeTokenAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = nativeTokenPriceData.wrapperTokenAddress;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = nativeTokenPriceData.tokenSymbol;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = nativeTokenPriceData.tokenLogoUrl;
        }
        return nativeTokenPriceData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nativeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NativeTokenPriceData copy(String str, String str2, String str3, String str4, String str5) {
        return new NativeTokenPriceData(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeTokenPriceData)) {
            return false;
        }
        NativeTokenPriceData nativeTokenPriceData = (NativeTokenPriceData) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) nativeTokenPriceData.price) && Intrinsics.EZpvd((Object) this.nativeTokenAddress, (Object) nativeTokenPriceData.nativeTokenAddress) && Intrinsics.EZpvd((Object) this.wrapperTokenAddress, (Object) nativeTokenPriceData.wrapperTokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) nativeTokenPriceData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) nativeTokenPriceData.tokenLogoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenAddress() {
        return this.nativeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWrapperTokenAddress() {
        return this.wrapperTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.price;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nativeTokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.wrapperTokenAddress;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenSymbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenLogoUrl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NativeTokenPriceData(price=" + this.price + ", nativeTokenAddress=" + this.nativeTokenAddress + ", wrapperTokenAddress=" + this.wrapperTokenAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ")";
    }

    public NativeTokenPriceData(String str, String str2, String str3, String str4, String str5) {
        this.price = str;
        this.nativeTokenAddress = str2;
        this.wrapperTokenAddress = str3;
        this.tokenSymbol = str4;
        this.tokenLogoUrl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.business.market.data.model.history.NativeTokenPriceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NativeTokenPriceData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
