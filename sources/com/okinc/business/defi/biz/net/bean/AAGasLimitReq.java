package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class AAGasLimitReq {
    public static final int $stable = 8;
    private String address;
    private Long chainId;
    private String factory;
    private String factoryData;
    private String initCode;
    private String maxFeePerGas;
    private String maxPriorityFeePerGas;
    private String nonce;
    private List<AAGasLimitPaymaster> paymasterList;
    private String tokenAddress;
    private String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AAGasLimitPaymaster> component11() {
        return this.paymasterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.factoryData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAGasLimitReq copy(@NotNull String str, String str2, @NotNull String str3, Long l, @NotNull String str4, String str5, String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull List<AAGasLimitPaymaster> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AAGasLimitReq(str, str2, str3, l, str4, str5, str6, str7, str8, str9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAGasLimitReq)) {
            return false;
        }
        AAGasLimitReq aAGasLimitReq = (AAGasLimitReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) aAGasLimitReq.address) && Intrinsics.EZpvd((Object) this.nonce, (Object) aAGasLimitReq.nonce) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) aAGasLimitReq.tokenAddress) && Intrinsics.EZpvd(this.chainId, aAGasLimitReq.chainId) && Intrinsics.EZpvd((Object) this.value, (Object) aAGasLimitReq.value) && Intrinsics.EZpvd((Object) this.initCode, (Object) aAGasLimitReq.initCode) && Intrinsics.EZpvd((Object) this.factory, (Object) aAGasLimitReq.factory) && Intrinsics.EZpvd((Object) this.factoryData, (Object) aAGasLimitReq.factoryData) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) aAGasLimitReq.maxFeePerGas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) aAGasLimitReq.maxPriorityFeePerGas) && Intrinsics.EZpvd(this.paymasterList, aAGasLimitReq.paymasterList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactory() {
        return this.factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactoryData() {
        return this.factoryData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitCode() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AAGasLimitPaymaster> getPaymasterList() {
        return this.paymasterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        String str = this.nonce;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.tokenAddress.hashCode();
        Long l = this.chainId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        int iHashCode5 = this.value.hashCode();
        String str2 = this.initCode;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.factory;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.factoryData;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.maxFeePerGas.hashCode()) * 31) + this.maxPriorityFeePerGas.hashCode()) * 31) + this.paymasterList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactory(String str) {
        this.factory = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactoryData(String str) {
        this.factoryData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitCode(String str) {
        this.initCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFeePerGas(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPriorityFeePerGas(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPriorityFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterList(@NotNull List<AAGasLimitPaymaster> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.paymasterList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAGasLimitReq(address=" + this.address + ", nonce=" + this.nonce + ", tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ", value=" + this.value + ", initCode=" + this.initCode + ", factory=" + this.factory + ", factoryData=" + this.factoryData + ", maxFeePerGas=" + this.maxFeePerGas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", paymasterList=" + this.paymasterList + ")";
    }

    public AAGasLimitReq(@NotNull String str, String str2, @NotNull String str3, Long l, @NotNull String str4, String str5, String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull List<AAGasLimitPaymaster> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.address = str;
        this.nonce = str2;
        this.tokenAddress = str3;
        this.chainId = l;
        this.value = str4;
        this.initCode = str5;
        this.factory = str6;
        this.factoryData = str7;
        this.maxFeePerGas = str8;
        this.maxPriorityFeePerGas = str9;
        this.paymasterList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.Long)
  (r20v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.AAGasLimitPaymaster>):void (m)] (LINE:1326) call: com.okinc.business.defi.biz.net.bean.AAGasLimitReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AAGasLimitReq(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, l, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, str8, str9, list);
    }
}
