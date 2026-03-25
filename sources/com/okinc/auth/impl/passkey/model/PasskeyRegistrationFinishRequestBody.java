package com.okinc.auth.impl.passkey.model;

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
public final class PasskeyRegistrationFinishRequestBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final Integer inHouseVer;
    public final boolean isInHouse;
    public final String responseJson;
    public final String scenario;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRegistrationFinishRequestBody copy$default(PasskeyRegistrationFinishRequestBody passkeyRegistrationFinishRequestBody, boolean z, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passkeyRegistrationFinishRequestBody.isInHouse;
        }
        if ((i & 2) != 0) {
            num = passkeyRegistrationFinishRequestBody.inHouseVer;
        }
        if ((i & 4) != 0) {
            str = passkeyRegistrationFinishRequestBody.responseJson;
        }
        if ((i & 8) != 0) {
            str2 = passkeyRegistrationFinishRequestBody.scenario;
        }
        return passkeyRegistrationFinishRequestBody.AEQbTJ(z, num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRegistrationFinishRequestBody AEQbTJ(boolean z, Integer num, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyRegistrationFinishRequestBody(z, num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyRegistrationFinishRequestBody)) {
            return false;
        }
        PasskeyRegistrationFinishRequestBody passkeyRegistrationFinishRequestBody = (PasskeyRegistrationFinishRequestBody) obj;
        return this.isInHouse == passkeyRegistrationFinishRequestBody.isInHouse && Intrinsics.EZpvd(this.inHouseVer, passkeyRegistrationFinishRequestBody.inHouseVer) && Intrinsics.EZpvd((Object) this.responseJson, (Object) passkeyRegistrationFinishRequestBody.responseJson) && Intrinsics.EZpvd((Object) this.scenario, (Object) passkeyRegistrationFinishRequestBody.scenario);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isInHouse);
        Integer num = this.inHouseVer;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.responseJson.hashCode();
        String str = this.scenario;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRegistrationFinishRequestBody(isInHouse=" + this.isInHouse + ", inHouseVer=" + this.inHouseVer + ", responseJson=" + this.responseJson + ", scenario=" + this.scenario + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyRegistrationFinishRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyRegistrationFinishRequestBody> serializer() {
            return PasskeyRegistrationFinishRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyRegistrationFinishRequestBody(int i, boolean z, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i, 5, PasskeyRegistrationFinishRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.isInHouse = z;
        if ((i & 2) == 0) {
            this.inHouseVer = null;
        } else {
            this.inHouseVer = num;
        }
        this.responseJson = str;
        if ((i & 8) == 0) {
            this.scenario = null;
        } else {
            this.scenario = str2;
        }
    }

    public static final /* synthetic */ void copydefault(PasskeyRegistrationFinishRequestBody passkeyRegistrationFinishRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, passkeyRegistrationFinishRequestBody.isInHouse);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || passkeyRegistrationFinishRequestBody.inHouseVer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, passkeyRegistrationFinishRequestBody.inHouseVer);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, passkeyRegistrationFinishRequestBody.responseJson);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && passkeyRegistrationFinishRequestBody.scenario == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, passkeyRegistrationFinishRequestBody.scenario);
    }

    public PasskeyRegistrationFinishRequestBody(boolean z, Integer num, @NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isInHouse = z;
        this.inHouseVer = num;
        this.responseJson = str;
        this.scenario = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 boolean)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (r4v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(boolean, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:342) call: com.okinc.auth.impl.passkey.model.PasskeyRegistrationFinishRequestBody.<init>(boolean, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PasskeyRegistrationFinishRequestBody(boolean z, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : num, str, (i & 8) != 0 ? null : str2);
    }
}
