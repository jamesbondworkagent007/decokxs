package com.okinc.okrisk.service;

import com.okinc.okrisk.FingerprintIdStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DidResponse {
    public static final int $stable = 0;
    private final String cg;
    private final String e_deviceToken;
    private final String efp;
    private final String fingerprintId;
    private final FingerprintIdStatus status;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.okrisk.FingerprintIdStatus", FingerprintIdStatus.values()), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DidResponse copy$default(DidResponse didResponse, FingerprintIdStatus fingerprintIdStatus, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            fingerprintIdStatus = didResponse.status;
        }
        if ((i & 2) != 0) {
            str = didResponse.fingerprintId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = didResponse.efp;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = didResponse.e_deviceToken;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = didResponse.cg;
        }
        return didResponse.copy(fingerprintIdStatus, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FingerprintIdStatus component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fingerprintId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.efp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.e_deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DidResponse copy(@NotNull FingerprintIdStatus fingerprintIdStatus, @NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(fingerprintIdStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new DidResponse(fingerprintIdStatus, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DidResponse)) {
            return false;
        }
        DidResponse didResponse = (DidResponse) obj;
        return this.status == didResponse.status && Intrinsics.EZpvd((Object) this.fingerprintId, (Object) didResponse.fingerprintId) && Intrinsics.EZpvd((Object) this.efp, (Object) didResponse.efp) && Intrinsics.EZpvd((Object) this.e_deviceToken, (Object) didResponse.e_deviceToken) && Intrinsics.EZpvd((Object) this.cg, (Object) didResponse.cg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCg() {
        return this.cg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getE_deviceToken() {
        return this.e_deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEfp() {
        return this.efp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFingerprintId() {
        return this.fingerprintId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FingerprintIdStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.status.hashCode();
        int iHashCode2 = this.fingerprintId.hashCode();
        String str = this.efp;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.e_deviceToken;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cg;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DidResponse(status=" + this.status + ", fingerprintId=" + this.fingerprintId + ", efp=" + this.efp + ", e_deviceToken=" + this.e_deviceToken + ", cg=" + this.cg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.DidResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DidResponse> serializer() {
            return DidResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DidResponse(int i, FingerprintIdStatus fingerprintIdStatus, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DidResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = fingerprintIdStatus;
        this.fingerprintId = str;
        if ((i & 4) == 0) {
            this.efp = "";
        } else {
            this.efp = str2;
        }
        if ((i & 8) == 0) {
            this.e_deviceToken = "";
        } else {
            this.e_deviceToken = str3;
        }
        if ((i & 16) == 0) {
            this.cg = "";
        } else {
            this.cg = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(DidResponse didResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], didResponse.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, didResponse.fingerprintId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) didResponse.efp, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, didResponse.efp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) didResponse.e_deviceToken, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, didResponse.e_deviceToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) didResponse.cg, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, didResponse.cg);
    }

    public DidResponse(@NotNull FingerprintIdStatus fingerprintIdStatus, @NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(fingerprintIdStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.status = fingerprintIdStatus;
        this.fingerprintId = str;
        this.efp = str2;
        this.e_deviceToken = str3;
        this.cg = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r8v0 com.okinc.okrisk.FingerprintIdStatus)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(com.okinc.okrisk.FingerprintIdStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.okinc.okrisk.service.DidResponse.<init>(com.okinc.okrisk.FingerprintIdStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DidResponse(FingerprintIdStatus fingerprintIdStatus, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fingerprintIdStatus, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
