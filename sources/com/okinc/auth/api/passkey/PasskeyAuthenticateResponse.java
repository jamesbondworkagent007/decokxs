package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.push.constants.MTPushConstants;
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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PasskeyAuthenticateResponse implements Parcelable {
    public static final int $stable = 0;
    private final String authenticatorAttachment;
    private final ClientExtensionResultsData clientExtensionResults;
    private final String id;
    private final Response response;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PasskeyAuthenticateResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PasskeyAuthenticateResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyAuthenticateResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyAuthenticateResponse(parcel.readString(), parcel.readString(), parcel.readString(), Response.CREATOR.createFromParcel(parcel), ClientExtensionResultsData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyAuthenticateResponse[] newArray(int i) {
            return new PasskeyAuthenticateResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyAuthenticateResponse copy$default(PasskeyAuthenticateResponse passkeyAuthenticateResponse, String str, String str2, String str3, Response response, ClientExtensionResultsData clientExtensionResultsData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyAuthenticateResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = passkeyAuthenticateResponse.type;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = passkeyAuthenticateResponse.authenticatorAttachment;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            response = passkeyAuthenticateResponse.response;
        }
        Response response2 = response;
        if ((i & 16) != 0) {
            clientExtensionResultsData = passkeyAuthenticateResponse.clientExtensionResults;
        }
        return passkeyAuthenticateResponse.copy(str, str4, str5, response2, clientExtensionResultsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.authenticatorAttachment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Response component4() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientExtensionResultsData component5() {
        return this.clientExtensionResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateResponse copy(String str, String str2, String str3, @NotNull Response response, @NotNull ClientExtensionResultsData clientExtensionResultsData) {
        Intrinsics.checkNotNullParameter(response, "");
        Intrinsics.checkNotNullParameter(clientExtensionResultsData, "");
        return new PasskeyAuthenticateResponse(str, str2, str3, response, clientExtensionResultsData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyAuthenticateResponse)) {
            return false;
        }
        PasskeyAuthenticateResponse passkeyAuthenticateResponse = (PasskeyAuthenticateResponse) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) passkeyAuthenticateResponse.id) && Intrinsics.EZpvd((Object) this.type, (Object) passkeyAuthenticateResponse.type) && Intrinsics.EZpvd((Object) this.authenticatorAttachment, (Object) passkeyAuthenticateResponse.authenticatorAttachment) && Intrinsics.EZpvd(this.response, passkeyAuthenticateResponse.response) && Intrinsics.EZpvd(this.clientExtensionResults, passkeyAuthenticateResponse.clientExtensionResults);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientExtensionResultsData getClientExtensionResults() {
        return this.clientExtensionResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Response getResponse() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.type;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.authenticatorAttachment;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.response.hashCode()) * 31) + this.clientExtensionResults.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyAuthenticateResponse(id=" + this.id + ", type=" + this.type + ", authenticatorAttachment=" + this.authenticatorAttachment + ", response=" + this.response + ", clientExtensionResults=" + this.clientExtensionResults + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.authenticatorAttachment);
        this.response.writeToParcel(parcel, i);
        this.clientExtensionResults.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyAuthenticateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyAuthenticateResponse> serializer() {
            return PasskeyAuthenticateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyAuthenticateResponse(int i, String str, String str2, String str3, Response response, ClientExtensionResultsData clientExtensionResultsData, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, PasskeyAuthenticateResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.authenticatorAttachment = null;
        } else {
            this.authenticatorAttachment = str3;
        }
        this.response = response;
        if ((i & 16) == 0) {
            this.clientExtensionResults = new ClientExtensionResultsData();
        } else {
            this.clientExtensionResults = clientExtensionResultsData;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_api(PasskeyAuthenticateResponse passkeyAuthenticateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || passkeyAuthenticateResponse.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, passkeyAuthenticateResponse.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || passkeyAuthenticateResponse.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, passkeyAuthenticateResponse.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || passkeyAuthenticateResponse.authenticatorAttachment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, passkeyAuthenticateResponse.authenticatorAttachment);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, PasskeyAuthenticateResponse$Response$$serializer.INSTANCE, passkeyAuthenticateResponse.response);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(passkeyAuthenticateResponse.clientExtensionResults, new ClientExtensionResultsData())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer.INSTANCE, passkeyAuthenticateResponse.clientExtensionResults);
    }

    public PasskeyAuthenticateResponse(String str, String str2, String str3, @NotNull Response response, @NotNull ClientExtensionResultsData clientExtensionResultsData) {
        Intrinsics.checkNotNullParameter(response, "");
        Intrinsics.checkNotNullParameter(clientExtensionResultsData, "");
        this.id = str;
        this.type = str2;
        this.authenticatorAttachment = str3;
        this.response = response;
        this.clientExtensionResults = clientExtensionResultsData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$Response)
  (wrap:com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$ClientExtensionResultsData:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$ClientExtensionResultsData:0x001c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:70) call: com.okinc.auth.api.passkey.PasskeyAuthenticateResponse.ClientExtensionResultsData.<init>():void type: CONSTRUCTOR) : (r12v0 com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$ClientExtensionResultsData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$Response, com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$ClientExtensionResultsData):void (m)] (LINE:65) call: com.okinc.auth.api.passkey.PasskeyAuthenticateResponse.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$Response, com.okinc.auth.api.passkey.PasskeyAuthenticateResponse$ClientExtensionResultsData):void type: THIS */
    public /* synthetic */ PasskeyAuthenticateResponse(String str, String str2, String str3, Response response, ClientExtensionResultsData clientExtensionResultsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, response, (i & 16) != 0 ? new ClientExtensionResultsData() : clientExtensionResultsData);
    }

    @Serializable
    public static final class Response implements Parcelable {
        public static final int $stable = 0;
        private final String authenticatorData;
        private final String clientDataJSON;
        private final String signature;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Response> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Response> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Response createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Response(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Response[] newArray(int i) {
                return new Response[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Response() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = response.clientDataJSON;
            }
            if ((i & 2) != 0) {
                str2 = response.authenticatorData;
            }
            if ((i & 4) != 0) {
                str3 = response.signature;
            }
            return response.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.clientDataJSON;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.authenticatorData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Response copy(String str, String str2, String str3) {
            return new Response(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            return Intrinsics.EZpvd((Object) this.clientDataJSON, (Object) response.clientDataJSON) && Intrinsics.EZpvd((Object) this.authenticatorData, (Object) response.authenticatorData) && Intrinsics.EZpvd((Object) this.signature, (Object) response.signature);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAuthenticatorData() {
            return this.authenticatorData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getClientDataJSON() {
            return this.clientDataJSON;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSignature() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.clientDataJSON;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.authenticatorData;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.signature;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Response(clientDataJSON=" + this.clientDataJSON + ", authenticatorData=" + this.authenticatorData + ", signature=" + this.signature + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.clientDataJSON);
            parcel.writeString(this.authenticatorData);
            parcel.writeString(this.signature);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyAuthenticateResponse.Response.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Response> serializer() {
                return PasskeyAuthenticateResponse$Response$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Response(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_api(Response response, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || response.clientDataJSON != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, response.clientDataJSON);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || response.authenticatorData != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, response.authenticatorData);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && response.signature == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, response.signature);
        }

        public Response(String str, String str2, String str3) {
            this.clientDataJSON = str;
            this.authenticatorData = str2;
            this.signature = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:76) call: com.okinc.auth.api.passkey.PasskeyAuthenticateResponse.Response.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Response(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    @Serializable
    public static final class ClientExtensionResultsData implements Parcelable {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ClientExtensionResultsData> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ClientExtensionResultsData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientExtensionResultsData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new ClientExtensionResultsData();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientExtensionResultsData[] newArray(int i) {
                return new ClientExtensionResultsData[i];
            }
        }

        public static final /* synthetic */ void write$Self$OKAuth_auth_api(ClientExtensionResultsData clientExtensionResultsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.PasskeyAuthenticateResponse.ClientExtensionResultsData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ClientExtensionResultsData> serializer() {
                return PasskeyAuthenticateResponse$ClientExtensionResultsData$$serializer.INSTANCE;
            }
        }

        public ClientExtensionResultsData() {
        }

        public /* synthetic */ ClientExtensionResultsData(int i, SerializationConstructorMarker serializationConstructorMarker) {
        }
    }

    public final boolean getIsExternalPasskey() {
        String str = this.authenticatorAttachment;
        if (Intrinsics.EZpvd((Object) str, (Object) "cross-platform")) {
            return true;
        }
        Intrinsics.EZpvd((Object) str, (Object) MTPushConstants.PlatformNode.KEY_PLATFORM);
        return false;
    }
}
