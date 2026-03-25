package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DAppRequest {
    private final String caipChainId;
    private final String method;
    private final JsonObject params;
    private final String redirect;
    private final String requestId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DAppRequest copy$default(DAppRequest dAppRequest, String str, String str2, String str3, String str4, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dAppRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = dAppRequest.method;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = dAppRequest.caipChainId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = dAppRequest.redirect;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            jsonObject = dAppRequest.params;
        }
        return dAppRequest.copy(str, str5, str6, str7, jsonObject);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getCaipChainId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.caipChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component5() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppRequest copy(@NotNull String str, @NotNull String str2, String str3, String str4, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DAppRequest(str, str2, str3, str4, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppRequest)) {
            return false;
        }
        DAppRequest dAppRequest = (DAppRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) dAppRequest.requestId) && Intrinsics.EZpvd((Object) this.method, (Object) dAppRequest.method) && Intrinsics.EZpvd((Object) this.caipChainId, (Object) dAppRequest.caipChainId) && Intrinsics.EZpvd((Object) this.redirect, (Object) dAppRequest.redirect) && Intrinsics.EZpvd(this.params, dAppRequest.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCaipChainId() {
        return this.caipChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirect() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.requestId.hashCode();
        int iHashCode2 = this.method.hashCode();
        String str = this.caipChainId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.redirect;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        JsonObject jsonObject = this.params;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppRequest(requestId=" + this.requestId + ", method=" + this.method + ", caipChainId=" + this.caipChainId + ", redirect=" + this.redirect + ", params=" + this.params + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppRequest> serializer() {
            return DAppRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DAppRequest(int i, String str, String str2, String str3, String str4, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DAppRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.requestId = str;
        this.method = str2;
        if ((i & 4) == 0) {
            this.caipChainId = null;
        } else {
            this.caipChainId = str3;
        }
        if ((i & 8) == 0) {
            this.redirect = null;
        } else {
            this.redirect = str4;
        }
        if ((i & 16) == 0) {
            this.params = null;
        } else {
            this.params = jsonObject;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DAppRequest dAppRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dAppRequest.requestId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppRequest.method);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dAppRequest.caipChainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dAppRequest.caipChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dAppRequest.redirect != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dAppRequest.redirect);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dAppRequest.params == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, JsonObjectSerializer.INSTANCE, dAppRequest.params);
    }

    public DAppRequest(@NotNull String str, @NotNull String str2, String str3, String str4, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.requestId = str;
        this.method = str2;
        this.caipChainId = str3;
        this.redirect = str4;
        this.params = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r12v0 kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:10) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ DAppRequest(String str, String str2, String str3, String str4, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : jsonObject);
    }

    public final boolean isDisconnect() {
        return Intrinsics.EZpvd((Object) this.method, (Object) "disconnect");
    }

    public final boolean isSessionInfo() {
        return Intrinsics.EZpvd((Object) this.method, (Object) "session_info");
    }
}
