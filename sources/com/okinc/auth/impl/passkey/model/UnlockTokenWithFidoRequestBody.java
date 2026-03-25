package com.okinc.auth.impl.passkey.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class UnlockTokenWithFidoRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("authenticatorAttachment")
    private final String authenticatorAttachment;

    @SerializedName("clientExtensionResults")
    private final ClientExtensionResultsData clientExtensionResults;

    @SerializedName("id")
    private final String id;

    @SerializedName("rawId")
    private final String rawId;

    @SerializedName("response")
    private final ResponseData response;

    @SerializedName("type")
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnlockTokenWithFidoRequestBody copy$default(UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, String str, String str2, String str3, String str4, ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unlockTokenWithFidoRequestBody.type;
        }
        if ((i & 2) != 0) {
            str2 = unlockTokenWithFidoRequestBody.id;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = unlockTokenWithFidoRequestBody.rawId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = unlockTokenWithFidoRequestBody.authenticatorAttachment;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            responseData = unlockTokenWithFidoRequestBody.response;
        }
        ResponseData responseData2 = responseData;
        if ((i & 32) != 0) {
            clientExtensionResultsData = unlockTokenWithFidoRequestBody.clientExtensionResults;
        }
        return unlockTokenWithFidoRequestBody.AEQbTJ(str, str5, str6, str7, responseData2, clientExtensionResultsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnlockTokenWithFidoRequestBody AEQbTJ(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        return new UnlockTokenWithFidoRequestBody(str, str2, str3, str4, responseData, clientExtensionResultsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockTokenWithFidoRequestBody)) {
            return false;
        }
        UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody = (UnlockTokenWithFidoRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) unlockTokenWithFidoRequestBody.type) && Intrinsics.EZpvd((Object) this.id, (Object) unlockTokenWithFidoRequestBody.id) && Intrinsics.EZpvd((Object) this.rawId, (Object) unlockTokenWithFidoRequestBody.rawId) && Intrinsics.EZpvd((Object) this.authenticatorAttachment, (Object) unlockTokenWithFidoRequestBody.authenticatorAttachment) && Intrinsics.EZpvd(this.response, unlockTokenWithFidoRequestBody.response) && Intrinsics.EZpvd(this.clientExtensionResults, unlockTokenWithFidoRequestBody.clientExtensionResults);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.id.hashCode();
        String str = this.rawId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.authenticatorAttachment;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.response.hashCode();
        ClientExtensionResultsData clientExtensionResultsData = this.clientExtensionResults;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (clientExtensionResultsData != null ? clientExtensionResultsData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnlockTokenWithFidoRequestBody(type=" + this.type + ", id=" + this.id + ", rawId=" + this.rawId + ", authenticatorAttachment=" + this.authenticatorAttachment + ", response=" + this.response + ", clientExtensionResults=" + this.clientExtensionResults + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnlockTokenWithFidoRequestBody> serializer() {
            return UnlockTokenWithFidoRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnlockTokenWithFidoRequestBody(int i, String str, String str2, String str3, String str4, ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i, 19, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.id = str2;
        if ((i & 4) == 0) {
            this.rawId = null;
        } else {
            this.rawId = str3;
        }
        if ((i & 8) == 0) {
            this.authenticatorAttachment = null;
        } else {
            this.authenticatorAttachment = str4;
        }
        this.response = responseData;
        if ((i & 32) == 0) {
            this.clientExtensionResults = null;
        } else {
            this.clientExtensionResults = clientExtensionResultsData;
        }
    }

    public static final /* synthetic */ void EZpvd(UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, unlockTokenWithFidoRequestBody.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, unlockTokenWithFidoRequestBody.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || unlockTokenWithFidoRequestBody.rawId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, unlockTokenWithFidoRequestBody.rawId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || unlockTokenWithFidoRequestBody.authenticatorAttachment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, unlockTokenWithFidoRequestBody.authenticatorAttachment);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, UnlockTokenWithFidoRequestBody$ResponseData$$serializer.INSTANCE, unlockTokenWithFidoRequestBody.response);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && unlockTokenWithFidoRequestBody.clientExtensionResults == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, UnlockTokenWithFidoRequestBody$ClientExtensionResultsData$$serializer.INSTANCE, unlockTokenWithFidoRequestBody.clientExtensionResults);
    }

    public UnlockTokenWithFidoRequestBody(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        this.type = str;
        this.id = str2;
        this.rawId = str3;
        this.authenticatorAttachment = str4;
        this.response = responseData;
        this.clientExtensionResults = clientExtensionResultsData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (r14v0 com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ResponseData)
  (wrap:com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ClientExtensionResultsData:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ClientExtensionResultsData) : (r15v0 com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ClientExtensionResultsData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ResponseData, com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ClientExtensionResultsData):void (m)] (LINE:71) call: com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ResponseData, com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$ClientExtensionResultsData):void type: THIS */
    public /* synthetic */ UnlockTokenWithFidoRequestBody(String str, String str2, String str3, String str4, ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, responseData, (i & 32) != 0 ? null : clientExtensionResultsData);
    }

    @Serializable
    public static final class ResponseData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        @SerializedName("authenticatorData")
        private final String authenticatorData;

        @SerializedName("clientDataJSON")
        private final String clientDataJSON;

        @SerializedName("signature")
        private final String signature;

        @SerializedName("userHandle")
        private final String userHandle;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ResponseData() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResponseData copy$default(ResponseData responseData, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = responseData.clientDataJSON;
            }
            if ((i & 2) != 0) {
                str2 = responseData.authenticatorData;
            }
            if ((i & 4) != 0) {
                str3 = responseData.signature;
            }
            if ((i & 8) != 0) {
                str4 = responseData.userHandle;
            }
            return responseData.OLrzqt(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResponseData OLrzqt(String str, String str2, String str3, String str4) {
            return new ResponseData(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseData)) {
                return false;
            }
            ResponseData responseData = (ResponseData) obj;
            return Intrinsics.EZpvd((Object) this.clientDataJSON, (Object) responseData.clientDataJSON) && Intrinsics.EZpvd((Object) this.authenticatorData, (Object) responseData.authenticatorData) && Intrinsics.EZpvd((Object) this.signature, (Object) responseData.signature) && Intrinsics.EZpvd((Object) this.userHandle, (Object) responseData.userHandle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.clientDataJSON;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.authenticatorData;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.signature;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.userHandle;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResponseData(clientDataJSON=" + this.clientDataJSON + ", authenticatorData=" + this.authenticatorData + ", signature=" + this.signature + ", userHandle=" + this.userHandle + ")";
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody.ResponseData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ResponseData> serializer() {
                return UnlockTokenWithFidoRequestBody$ResponseData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ResponseData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.clientDataJSON = null;
            } else {
                this.clientDataJSON = str;
            }
            if ((i & 2) == 0) {
                this.authenticatorData = null;
            } else {
                this.authenticatorData = str2;
            }
            if ((i & 4) == 0) {
                this.signature = null;
            } else {
                this.signature = str3;
            }
            if ((i & 8) == 0) {
                this.userHandle = null;
            } else {
                this.userHandle = str4;
            }
        }

        public static final /* synthetic */ void KWHzl(ResponseData responseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || responseData.clientDataJSON != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, responseData.clientDataJSON);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || responseData.authenticatorData != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, responseData.authenticatorData);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || responseData.signature != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, responseData.signature);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && responseData.userHandle == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, responseData.userHandle);
        }

        public ResponseData(String str, String str2, String str3, String str4) {
            this.clientDataJSON = str;
            this.authenticatorData = str2;
            this.signature = str3;
            this.userHandle = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:87) call: com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody.ResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ResponseData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    @Serializable
    public static final class ClientExtensionResultsData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        @SerializedName("credProps")
        private final CredPropsData credProps;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClientExtensionResultsData() {
            this((CredPropsData) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ClientExtensionResultsData copy$default(ClientExtensionResultsData clientExtensionResultsData, CredPropsData credPropsData, int i, Object obj) {
            if ((i & 1) != 0) {
                credPropsData = clientExtensionResultsData.credProps;
            }
            return clientExtensionResultsData.AEQbTJ(credPropsData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClientExtensionResultsData AEQbTJ(CredPropsData credPropsData) {
            return new ClientExtensionResultsData(credPropsData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientExtensionResultsData) && Intrinsics.EZpvd(this.credProps, ((ClientExtensionResultsData) obj).credProps);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            CredPropsData credPropsData = this.credProps;
            if (credPropsData == null) {
                return 0;
            }
            return credPropsData.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ClientExtensionResultsData(credProps=" + this.credProps + ")";
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody.ClientExtensionResultsData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ClientExtensionResultsData> serializer() {
                return UnlockTokenWithFidoRequestBody$ClientExtensionResultsData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ClientExtensionResultsData(int i, CredPropsData credPropsData, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.credProps = null;
            } else {
                this.credProps = credPropsData;
            }
        }

        public static final /* synthetic */ void AEQbTJ(ClientExtensionResultsData clientExtensionResultsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && clientExtensionResultsData.credProps == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, UnlockTokenWithFidoRequestBody$CredPropsData$$serializer.INSTANCE, clientExtensionResultsData.credProps);
        }

        public ClientExtensionResultsData(CredPropsData credPropsData) {
            this.credProps = credPropsData;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$CredPropsData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$CredPropsData) : (r1v0 com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$CredPropsData))
 A[MD:(com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$CredPropsData):void (m)] (LINE:99) call: com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody.ClientExtensionResultsData.<init>(com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$CredPropsData):void type: THIS */
        public /* synthetic */ ClientExtensionResultsData(CredPropsData credPropsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : credPropsData);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @Serializable
    public static final class CredPropsData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        @SerializedName("rk")
        private final boolean rk;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CredPropsData copy$default(CredPropsData credPropsData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = credPropsData.rk;
            }
            return credPropsData.OLrzqt(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CredPropsData OLrzqt(boolean z) {
            return new CredPropsData(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CredPropsData) && this.rk == ((CredPropsData) obj).rk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.rk);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CredPropsData(rk=" + this.rk + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody.CredPropsData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CredPropsData> serializer() {
                return UnlockTokenWithFidoRequestBody$CredPropsData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CredPropsData(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, UnlockTokenWithFidoRequestBody$CredPropsData$$serializer.INSTANCE.getDescriptor());
            }
            this.rk = z;
        }

        public CredPropsData(boolean z) {
            this.rk = z;
        }
    }
}
