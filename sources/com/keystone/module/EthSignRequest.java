package com.keystone.module;

import com.keystone.sdk.KeystoneEthereumSDK;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EthSignRequest {
    private final String address;
    private final int chainId;
    private final KeystoneEthereumSDK.DataType dataType;
    private final String origin;
    private final String path;
    private final String requestId;
    private final String signData;
    private final String xfp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneEthereumSDK.DataType component3() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EthSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull KeystoneEthereumSDK.DataType dataType, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new EthSignRequest(str, str2, dataType, i, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EthSignRequest)) {
            return false;
        }
        EthSignRequest ethSignRequest = (EthSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) ethSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) ethSignRequest.signData) && this.dataType == ethSignRequest.dataType && this.chainId == ethSignRequest.chainId && Intrinsics.EZpvd((Object) this.path, (Object) ethSignRequest.path) && Intrinsics.EZpvd((Object) this.xfp, (Object) ethSignRequest.xfp) && Intrinsics.EZpvd((Object) this.address, (Object) ethSignRequest.address) && Intrinsics.EZpvd((Object) this.origin, (Object) ethSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneEthereumSDK.DataType getDataType() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXfp() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.dataType.hashCode()) * 31) + Integer.hashCode(this.chainId)) * 31) + this.path.hashCode()) * 31) + this.xfp.hashCode()) * 31) + this.address.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EthSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", dataType=" + this.dataType + ", chainId=" + this.chainId + ", path=" + this.path + ", xfp=" + this.xfp + ", address=" + this.address + ", origin=" + this.origin + ')';
    }

    public EthSignRequest(@NotNull String str, @NotNull String str2, @NotNull KeystoneEthereumSDK.DataType dataType, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.requestId = str;
        this.signData = str2;
        this.dataType = dataType;
        this.chainId = i;
        this.path = str3;
        this.xfp = str4;
        this.address = str5;
        this.origin = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 com.keystone.sdk.KeystoneEthereumSDK$DataType)
  (r16v0 int)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneEthereumSDK$DataType, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5) call: com.keystone.module.EthSignRequest.<init>(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneEthereumSDK$DataType, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EthSignRequest(String str, String str2, KeystoneEthereumSDK.DataType dataType, int i, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dataType, i, str3, str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6);
    }
}
