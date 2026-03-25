package com.keystone.module;

import com.keystone.sdk.KeystoneEvmSDK;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EvmSignRequest {
    private final EvmAccount account;
    private final int customChainIdentifier;
    private final KeystoneEvmSDK.DataType dataType;
    private final String origin;
    private final String requestId;
    private final String signData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EvmSignRequest copy$default(EvmSignRequest evmSignRequest, String str, String str2, KeystoneEvmSDK.DataType dataType, int i, EvmAccount evmAccount, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = evmSignRequest.requestId;
        }
        if ((i2 & 2) != 0) {
            str2 = evmSignRequest.signData;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            dataType = evmSignRequest.dataType;
        }
        KeystoneEvmSDK.DataType dataType2 = dataType;
        if ((i2 & 8) != 0) {
            i = evmSignRequest.customChainIdentifier;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            evmAccount = evmSignRequest.account;
        }
        EvmAccount evmAccount2 = evmAccount;
        if ((i2 & 32) != 0) {
            str3 = evmSignRequest.origin;
        }
        return evmSignRequest.copy(str, str4, dataType2, i3, evmAccount2, str3);
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
    public final KeystoneEvmSDK.DataType component3() {
        return this.dataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.customChainIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmAccount component5() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull KeystoneEvmSDK.DataType dataType, int i, @NotNull EvmAccount evmAccount, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataType, "");
        Intrinsics.checkNotNullParameter(evmAccount, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EvmSignRequest(str, str2, dataType, i, evmAccount, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvmSignRequest)) {
            return false;
        }
        EvmSignRequest evmSignRequest = (EvmSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) evmSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) evmSignRequest.signData) && this.dataType == evmSignRequest.dataType && this.customChainIdentifier == evmSignRequest.customChainIdentifier && Intrinsics.EZpvd(this.account, evmSignRequest.account) && Intrinsics.EZpvd((Object) this.origin, (Object) evmSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmAccount getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCustomChainIdentifier() {
        return this.customChainIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneEvmSDK.DataType getDataType() {
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
        return (((((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.dataType.hashCode()) * 31) + Integer.hashCode(this.customChainIdentifier)) * 31) + this.account.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvmSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", dataType=" + this.dataType + ", customChainIdentifier=" + this.customChainIdentifier + ", account=" + this.account + ", origin=" + this.origin + ')';
    }

    public EvmSignRequest(@NotNull String str, @NotNull String str2, @NotNull KeystoneEvmSDK.DataType dataType, int i, @NotNull EvmAccount evmAccount, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataType, "");
        Intrinsics.checkNotNullParameter(evmAccount, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = str;
        this.signData = str2;
        this.dataType = dataType;
        this.customChainIdentifier = i;
        this.account = evmAccount;
        this.origin = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 com.keystone.sdk.KeystoneEvmSDK$DataType)
  (r11v0 int)
  (r12v0 com.keystone.module.EvmAccount)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneEvmSDK$DataType, int, com.keystone.module.EvmAccount, java.lang.String):void (m)] (LINE:11) call: com.keystone.module.EvmSignRequest.<init>(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneEvmSDK$DataType, int, com.keystone.module.EvmAccount, java.lang.String):void type: THIS */
    public /* synthetic */ EvmSignRequest(String str, String str2, KeystoneEvmSDK.DataType dataType, int i, EvmAccount evmAccount, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dataType, i, evmAccount, (i2 & 32) != 0 ? "" : str3);
    }
}
