package com.okinc.auth.impl.passkey.model;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56391yDq;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class RegistrationFinishBody {
    public final String authenticatorAttachment;
    public final ClientExtensionResultsData clientExtensionResults;
    public final String id;
    public final String rawId;
    public final ResponseData response;
    public final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegistrationFinishBody copy$default(RegistrationFinishBody registrationFinishBody, String str, String str2, String str3, String str4, ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registrationFinishBody.type;
        }
        if ((i & 2) != 0) {
            str2 = registrationFinishBody.id;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = registrationFinishBody.rawId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = registrationFinishBody.authenticatorAttachment;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            responseData = registrationFinishBody.response;
        }
        ResponseData responseData2 = responseData;
        if ((i & 32) != 0) {
            clientExtensionResultsData = registrationFinishBody.clientExtensionResults;
        }
        return registrationFinishBody.copydefault(str, str5, str6, str7, responseData2, clientExtensionResultsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegistrationFinishBody copydefault(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        return new RegistrationFinishBody(str, str2, str3, str4, responseData, clientExtensionResultsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistrationFinishBody)) {
            return false;
        }
        RegistrationFinishBody registrationFinishBody = (RegistrationFinishBody) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) registrationFinishBody.type) && Intrinsics.EZpvd((Object) this.id, (Object) registrationFinishBody.id) && Intrinsics.EZpvd((Object) this.rawId, (Object) registrationFinishBody.rawId) && Intrinsics.EZpvd((Object) this.authenticatorAttachment, (Object) registrationFinishBody.authenticatorAttachment) && Intrinsics.EZpvd(this.response, registrationFinishBody.response) && Intrinsics.EZpvd(this.clientExtensionResults, registrationFinishBody.clientExtensionResults);
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
        return "RegistrationFinishBody(type=" + this.type + ", id=" + this.id + ", rawId=" + this.rawId + ", authenticatorAttachment=" + this.authenticatorAttachment + ", response=" + this.response + ", clientExtensionResults=" + this.clientExtensionResults + ")";
    }

    public /* synthetic */ RegistrationFinishBody(int i, String str, String str2, String str3, String str4, ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i, 19, RegistrationFinishBody$$serializer.INSTANCE.getDescriptor());
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

    public static final /* synthetic */ void EZpvd(RegistrationFinishBody registrationFinishBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, registrationFinishBody.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, registrationFinishBody.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || registrationFinishBody.rawId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, registrationFinishBody.rawId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || registrationFinishBody.authenticatorAttachment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, registrationFinishBody.authenticatorAttachment);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, RegistrationFinishBody$ResponseData$$serializer.INSTANCE, registrationFinishBody.response);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && registrationFinishBody.clientExtensionResults == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, RegistrationFinishBody$ClientExtensionResultsData$$serializer.INSTANCE, registrationFinishBody.clientExtensionResults);
    }

    public RegistrationFinishBody(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData) {
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
  (r14v0 com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ResponseData)
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ClientExtensionResultsData:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ClientExtensionResultsData) : (r15v0 com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ClientExtensionResultsData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ResponseData, com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ClientExtensionResultsData):void (m)] (LINE:27) call: com.okinc.auth.impl.passkey.model.RegistrationFinishBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ResponseData, com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ClientExtensionResultsData):void type: THIS */
    public /* synthetic */ RegistrationFinishBody(String str, String str2, String str3, String str4, ResponseData responseData, ClientExtensionResultsData clientExtensionResultsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, responseData, (i & 32) != 0 ? null : clientExtensionResultsData);
    }

    @Serializable
    public static final class ResponseData {
        public final String attestationObject;
        public final String clientDataJSON;
        public final List<String> transports;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.model.RegistrationFinishBody$ResponseData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ResponseData copy$default(ResponseData responseData, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = responseData.clientDataJSON;
            }
            if ((i & 2) != 0) {
                str2 = responseData.attestationObject;
            }
            if ((i & 4) != 0) {
                list = responseData.transports;
            }
            return responseData.copydefault(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResponseData copydefault(@NotNull String str, @NotNull String str2, List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ResponseData(str, str2, list);
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
            return Intrinsics.EZpvd((Object) this.clientDataJSON, (Object) responseData.clientDataJSON) && Intrinsics.EZpvd((Object) this.attestationObject, (Object) responseData.attestationObject) && Intrinsics.EZpvd(this.transports, responseData.transports);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.clientDataJSON.hashCode();
            int iHashCode2 = this.attestationObject.hashCode();
            List<String> list = this.transports;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResponseData(clientDataJSON=" + this.clientDataJSON + ", attestationObject=" + this.attestationObject + ", transports=" + this.transports + ")";
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationFinishBody.ResponseData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ResponseData> serializer() {
                return RegistrationFinishBody$ResponseData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ResponseData(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, RegistrationFinishBody$ResponseData$$serializer.INSTANCE.getDescriptor());
            }
            this.clientDataJSON = str;
            this.attestationObject = str2;
            if ((i & 4) == 0) {
                this.transports = null;
            } else {
                this.transports = list;
            }
        }

        public static final /* synthetic */ void KWHzl(ResponseData responseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, responseData.clientDataJSON);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, responseData.attestationObject);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && responseData.transports == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], responseData.transports);
        }

        public ResponseData(@NotNull String str, @NotNull String str2, List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.clientDataJSON = str;
            this.attestationObject = str2;
            this.transports = list;
        }
    }

    @Serializable
    public static final class ClientExtensionResultsData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final CredPropsData credProps;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClientExtensionResultsData() {
            this((CredPropsData) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ClientExtensionResultsData copy$default(ClientExtensionResultsData clientExtensionResultsData, CredPropsData credPropsData, int i, Object obj) {
            if ((i & 1) != 0) {
                credPropsData = clientExtensionResultsData.credProps;
            }
            return clientExtensionResultsData.EZpvd(credPropsData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClientExtensionResultsData EZpvd(CredPropsData credPropsData) {
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

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationFinishBody.ClientExtensionResultsData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ClientExtensionResultsData> serializer() {
                return RegistrationFinishBody$ClientExtensionResultsData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ClientExtensionResultsData(int i, CredPropsData credPropsData, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.credProps = null;
            } else {
                this.credProps = credPropsData;
            }
        }

        public static final /* synthetic */ void EZpvd(ClientExtensionResultsData clientExtensionResultsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && clientExtensionResultsData.credProps == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RegistrationFinishBody$CredPropsData$$serializer.INSTANCE, clientExtensionResultsData.credProps);
        }

        public ClientExtensionResultsData(CredPropsData credPropsData) {
            this.credProps = credPropsData;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationFinishBody$CredPropsData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationFinishBody$CredPropsData) : (r1v0 com.okinc.auth.impl.passkey.model.RegistrationFinishBody$CredPropsData))
 A[MD:(com.okinc.auth.impl.passkey.model.RegistrationFinishBody$CredPropsData):void (m)] (LINE:52) call: com.okinc.auth.impl.passkey.model.RegistrationFinishBody.ClientExtensionResultsData.<init>(com.okinc.auth.impl.passkey.model.RegistrationFinishBody$CredPropsData):void type: THIS */
        public /* synthetic */ ClientExtensionResultsData(CredPropsData credPropsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : credPropsData);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    @Serializable
    public static final class CredPropsData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final Boolean rk;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CredPropsData() {
            this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CredPropsData copy$default(CredPropsData credPropsData, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = credPropsData.rk;
            }
            return credPropsData.copydefault(bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CredPropsData copydefault(Boolean bool) {
            return new CredPropsData(bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CredPropsData) && Intrinsics.EZpvd(this.rk, ((CredPropsData) obj).rk);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Boolean bool = this.rk;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CredPropsData(rk=" + this.rk + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationFinishBody.CredPropsData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CredPropsData> serializer() {
                return RegistrationFinishBody$CredPropsData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CredPropsData(int i, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.rk = null;
            } else {
                this.rk = bool;
            }
        }

        public static final /* synthetic */ void KWHzl(CredPropsData credPropsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && credPropsData.rk == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, credPropsData.rk);
        }

        public CredPropsData(Boolean bool) {
            this.rk = bool;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r1v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean):void (m)] (LINE:58) call: com.okinc.auth.impl.passkey.model.RegistrationFinishBody.CredPropsData.<init>(java.lang.Boolean):void type: THIS */
        public /* synthetic */ CredPropsData(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationFinishBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RegistrationFinishBody> serializer() {
            return RegistrationFinishBody$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x006a */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
        public final RegistrationFinishBody copydefault(@NotNull String str) throws Throwable {
            ?? AhwBna;
            JSONArray jSONArrayOptJSONArray;
            String str2 = "";
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("id");
                String strOptString2 = jSONObject.optString("rawId");
                String strOptString3 = jSONObject.optString("authenticatorAttachment");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("response");
                CredPropsData credPropsData = null;
                ?? r2 = 0;
                String strOptString4 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("clientDataJSON") : null;
                String strOptString5 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("attestationObject") : null;
                if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("transports")) != null) {
                    int length = jSONArrayOptJSONArray.length();
                    AhwBna = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        String strOptString6 = jSONArrayOptJSONArray.optString(i);
                        Intrinsics.checkNotNullExpressionValue(strOptString6, "");
                        if (Intrinsics.EZpvd((Object) strOptString6, (Object) "cable")) {
                            strOptString6 = "hybrid";
                        }
                        AhwBna.add(strOptString6);
                    }
                } else {
                    AhwBna = yDY.AhwBna();
                }
                Intrinsics.copydefault((Object) strOptString);
                String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                if (strOptString3 == null) {
                    strOptString3 = "";
                }
                if (strOptString4 == null) {
                    strOptString4 = "";
                }
                if (strOptString5 != null) {
                    str2 = strOptString5;
                }
                return new RegistrationFinishBody(string, strOptString, strOptString2, strOptString3, new ResponseData(strOptString4, str2, AhwBna), new ClientExtensionResultsData(credPropsData, 1, (DefaultConstructorMarker) (r2 == true ? 1 : 0)));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                C56391yDq.AEQbTJ(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
                throw new KotlinNothingValueException();
            }
        }
    }
}
