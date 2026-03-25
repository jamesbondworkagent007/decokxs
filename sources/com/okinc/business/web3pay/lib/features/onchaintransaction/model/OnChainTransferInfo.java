package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OnChainTransferInfo {
    private final String mfaSessionId;
    private final boolean need2FA;
    private final boolean needToDeployContract;
    private final boolean needToSyncPasskey;
    private final JsonElement serverOption;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnChainTransferInfo copy$default(OnChainTransferInfo onChainTransferInfo, boolean z, String str, JsonElement jsonElement, boolean z2, boolean z3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onChainTransferInfo.need2FA;
        }
        if ((i & 2) != 0) {
            str = onChainTransferInfo.uopHash;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            jsonElement = onChainTransferInfo.serverOption;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i & 8) != 0) {
            z2 = onChainTransferInfo.needToDeployContract;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = onChainTransferInfo.needToSyncPasskey;
        }
        boolean z5 = z3;
        if ((i & 32) != 0) {
            str2 = onChainTransferInfo.mfaSessionId;
        }
        return onChainTransferInfo.copy(z, str3, jsonElement2, z4, z5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component3() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.needToDeployContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needToSyncPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnChainTransferInfo copy(boolean z, @NotNull String str, @NotNull JsonElement jsonElement, boolean z2, boolean z3, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new OnChainTransferInfo(z, str, jsonElement, z2, z3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnChainTransferInfo)) {
            return false;
        }
        OnChainTransferInfo onChainTransferInfo = (OnChainTransferInfo) obj;
        return this.need2FA == onChainTransferInfo.need2FA && Intrinsics.EZpvd((Object) this.uopHash, (Object) onChainTransferInfo.uopHash) && Intrinsics.EZpvd(this.serverOption, onChainTransferInfo.serverOption) && this.needToDeployContract == onChainTransferInfo.needToDeployContract && this.needToSyncPasskey == onChainTransferInfo.needToSyncPasskey && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) onChainTransferInfo.mfaSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMfaSessionId() {
        return this.mfaSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeed2FA() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedToDeployContract() {
        return this.needToDeployContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedToSyncPasskey() {
        return this.needToSyncPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getServerOption() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.need2FA);
        int iHashCode2 = this.uopHash.hashCode();
        int iHashCode3 = this.serverOption.hashCode();
        int iHashCode4 = Boolean.hashCode(this.needToDeployContract);
        int iHashCode5 = Boolean.hashCode(this.needToSyncPasskey);
        String str = this.mfaSessionId;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnChainTransferInfo(need2FA=" + this.need2FA + ", uopHash=" + this.uopHash + ", serverOption=" + this.serverOption + ", needToDeployContract=" + this.needToDeployContract + ", needToSyncPasskey=" + this.needToSyncPasskey + ", mfaSessionId=" + this.mfaSessionId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnChainTransferInfo> serializer() {
            return OnChainTransferInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnChainTransferInfo(int i, boolean z, String str, JsonElement jsonElement, boolean z2, boolean z3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, OnChainTransferInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.need2FA = z;
        this.uopHash = str;
        this.serverOption = jsonElement;
        this.needToDeployContract = z2;
        this.needToSyncPasskey = z3;
        if ((i & 32) == 0) {
            this.mfaSessionId = null;
        } else {
            this.mfaSessionId = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OnChainTransferInfo onChainTransferInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, onChainTransferInfo.need2FA);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onChainTransferInfo.uopHash);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, onChainTransferInfo.serverOption);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, onChainTransferInfo.needToDeployContract);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, onChainTransferInfo.needToSyncPasskey);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && onChainTransferInfo.mfaSessionId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, onChainTransferInfo.mfaSessionId);
    }

    public OnChainTransferInfo(boolean z, @NotNull String str, @NotNull JsonElement jsonElement, boolean z2, boolean z3, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.need2FA = z;
        this.uopHash = str;
        this.serverOption = jsonElement;
        this.needToDeployContract = z2;
        this.needToSyncPasskey = z3;
        this.mfaSessionId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 boolean)
  (r9v0 java.lang.String)
  (r10v0 kotlinx.serialization.json.JsonElement)
  (r11v0 boolean)
  (r12v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(boolean, java.lang.String, kotlinx.serialization.json.JsonElement, boolean, boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferInfo.<init>(boolean, java.lang.String, kotlinx.serialization.json.JsonElement, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ OnChainTransferInfo(boolean z, String str, JsonElement jsonElement, boolean z2, boolean z3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, jsonElement, z2, z3, (i & 32) != 0 ? null : str2);
    }
}
