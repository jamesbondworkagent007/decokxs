package com.keystone.module;

import com.keystone.sdk.KeystoneCosmosSDK;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CosmosSignRequest {
    private final List<CosmosAccount> accounts;
    private final KeystoneCosmosSDK.DataType dataType;
    private final String origin;
    private final String requestId;
    private final String signData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.keystone.module.CosmosSignRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CosmosSignRequest copy$default(CosmosSignRequest cosmosSignRequest, String str, String str2, KeystoneCosmosSDK.DataType dataType, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = cosmosSignRequest.signData;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            dataType = cosmosSignRequest.dataType;
        }
        KeystoneCosmosSDK.DataType dataType2 = dataType;
        if ((i & 8) != 0) {
            list = cosmosSignRequest.accounts;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str3 = cosmosSignRequest.origin;
        }
        return cosmosSignRequest.copy(str, str4, dataType2, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneCosmosSDK.DataType component3() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CosmosAccount> component4() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull KeystoneCosmosSDK.DataType dataType, @NotNull List<CosmosAccount> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CosmosSignRequest(str, str2, dataType, list, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignRequest)) {
            return false;
        }
        CosmosSignRequest cosmosSignRequest = (CosmosSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) cosmosSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) cosmosSignRequest.signData) && this.dataType == cosmosSignRequest.dataType && Intrinsics.EZpvd(this.accounts, cosmosSignRequest.accounts) && Intrinsics.EZpvd((Object) this.origin, (Object) cosmosSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CosmosAccount> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneCosmosSDK.DataType getDataType() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
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
    public int hashCode() {
        return (((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.dataType.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", dataType=" + this.dataType + ", accounts=" + this.accounts + ", origin=" + this.origin + ')';
    }

    public CosmosSignRequest(@NotNull String str, @NotNull String str2, @NotNull KeystoneCosmosSDK.DataType dataType, @NotNull List<CosmosAccount> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataType, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.signData = str2;
        this.dataType = dataType;
        this.accounts = list;
        this.origin = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 com.keystone.sdk.KeystoneCosmosSDK$DataType)
  (r10v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneCosmosSDK$DataType, java.util.List<com.keystone.module.CosmosAccount>, java.lang.String):void (m)] (LINE:11) call: com.keystone.module.CosmosSignRequest.<init>(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneCosmosSDK$DataType, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosSignRequest(String str, String str2, KeystoneCosmosSDK.DataType dataType, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dataType, list, (i & 16) != 0 ? "" : str3);
    }
}
