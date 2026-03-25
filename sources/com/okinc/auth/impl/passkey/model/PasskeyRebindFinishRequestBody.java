package com.okinc.auth.impl.passkey.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyRebindFinishRequestBody {

    @SerializedName("inHouseVer")
    private final Integer inHouseVer;
    public final boolean isInHouse;
    public final RegistrationFinishBody responseJson;
    public final String scenario;
    public final String workflowToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRebindFinishRequestBody copy$default(PasskeyRebindFinishRequestBody passkeyRebindFinishRequestBody, boolean z, Integer num, String str, RegistrationFinishBody registrationFinishBody, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passkeyRebindFinishRequestBody.isInHouse;
        }
        if ((i & 2) != 0) {
            num = passkeyRebindFinishRequestBody.inHouseVer;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = passkeyRebindFinishRequestBody.workflowToken;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            registrationFinishBody = passkeyRebindFinishRequestBody.responseJson;
        }
        RegistrationFinishBody registrationFinishBody2 = registrationFinishBody;
        if ((i & 16) != 0) {
            str2 = passkeyRebindFinishRequestBody.scenario;
        }
        return passkeyRebindFinishRequestBody.EZpvd(z, num2, str3, registrationFinishBody2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRebindFinishRequestBody EZpvd(boolean z, Integer num, @NotNull String str, @NotNull RegistrationFinishBody registrationFinishBody, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(registrationFinishBody, "");
        return new PasskeyRebindFinishRequestBody(z, num, str, registrationFinishBody, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyRebindFinishRequestBody)) {
            return false;
        }
        PasskeyRebindFinishRequestBody passkeyRebindFinishRequestBody = (PasskeyRebindFinishRequestBody) obj;
        return this.isInHouse == passkeyRebindFinishRequestBody.isInHouse && Intrinsics.EZpvd(this.inHouseVer, passkeyRebindFinishRequestBody.inHouseVer) && Intrinsics.EZpvd((Object) this.workflowToken, (Object) passkeyRebindFinishRequestBody.workflowToken) && Intrinsics.EZpvd(this.responseJson, passkeyRebindFinishRequestBody.responseJson) && Intrinsics.EZpvd((Object) this.scenario, (Object) passkeyRebindFinishRequestBody.scenario);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isInHouse);
        Integer num = this.inHouseVer;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.workflowToken.hashCode();
        int iHashCode4 = this.responseJson.hashCode();
        String str = this.scenario;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRebindFinishRequestBody(isInHouse=" + this.isInHouse + ", inHouseVer=" + this.inHouseVer + ", workflowToken=" + this.workflowToken + ", responseJson=" + this.responseJson + ", scenario=" + this.scenario + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyRebindFinishRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyRebindFinishRequestBody> serializer() {
            return PasskeyRebindFinishRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyRebindFinishRequestBody(int i, boolean z, Integer num, String str, RegistrationFinishBody registrationFinishBody, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i, 9, PasskeyRebindFinishRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.isInHouse = z;
        if ((i & 2) == 0) {
            this.inHouseVer = null;
        } else {
            this.inHouseVer = num;
        }
        if ((i & 4) == 0) {
            this.workflowToken = "";
        } else {
            this.workflowToken = str;
        }
        this.responseJson = registrationFinishBody;
        if ((i & 16) == 0) {
            this.scenario = null;
        } else {
            this.scenario = str2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(PasskeyRebindFinishRequestBody passkeyRebindFinishRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, passkeyRebindFinishRequestBody.isInHouse);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || passkeyRebindFinishRequestBody.inHouseVer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, passkeyRebindFinishRequestBody.inHouseVer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) passkeyRebindFinishRequestBody.workflowToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, passkeyRebindFinishRequestBody.workflowToken);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, RegistrationFinishBody$$serializer.INSTANCE, passkeyRebindFinishRequestBody.responseJson);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && passkeyRebindFinishRequestBody.scenario == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, passkeyRebindFinishRequestBody.scenario);
    }

    public PasskeyRebindFinishRequestBody(boolean z, Integer num, @NotNull String str, @NotNull RegistrationFinishBody registrationFinishBody, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(registrationFinishBody, "");
        this.isInHouse = z;
        this.inHouseVer = num;
        this.workflowToken = str;
        this.responseJson = registrationFinishBody;
        this.scenario = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 boolean)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (r11v0 com.okinc.auth.impl.passkey.model.RegistrationFinishBody)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(boolean, java.lang.Integer, java.lang.String, com.okinc.auth.impl.passkey.model.RegistrationFinishBody, java.lang.String):void (m)] (LINE:378) call: com.okinc.auth.impl.passkey.model.PasskeyRebindFinishRequestBody.<init>(boolean, java.lang.Integer, java.lang.String, com.okinc.auth.impl.passkey.model.RegistrationFinishBody, java.lang.String):void type: THIS */
    public /* synthetic */ PasskeyRebindFinishRequestBody(boolean z, Integer num, String str, RegistrationFinishBody registrationFinishBody, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str, registrationFinishBody, (i & 16) != 0 ? null : str2);
    }
}
