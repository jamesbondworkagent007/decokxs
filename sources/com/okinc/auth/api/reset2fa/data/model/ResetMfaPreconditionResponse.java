package com.okinc.auth.api.reset2fa.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class ResetMfaPreconditionResponse implements java.io.Serializable {
    public static final String AVAILABLE_2FA_EMAIL = "EMAIL";
    public static final String AVAILABLE_2FA_GOOGLE = "AUTHENTICATOR";
    public static final String AVAILABLE_2FA_PHONE = "MOBILE";
    private final List<String> available2Fa;
    private final String maskedEmail;
    private final String maskedPhone;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ResetMfaPreconditionResponse() {
        this((List) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResetMfaPreconditionResponse copy$default(ResetMfaPreconditionResponse resetMfaPreconditionResponse, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = resetMfaPreconditionResponse.available2Fa;
        }
        if ((i & 2) != 0) {
            str = resetMfaPreconditionResponse.maskedEmail;
        }
        if ((i & 4) != 0) {
            str2 = resetMfaPreconditionResponse.maskedPhone;
        }
        return resetMfaPreconditionResponse.copy(list, str, str2);
    }

    @SerialName("available2Fa")
    public static /* synthetic */ void getAvailable2Fa$annotations() {
    }

    @SerialName("maskedEmail")
    public static /* synthetic */ void getMaskedEmail$annotations() {
    }

    @SerialName("maskedPhone")
    public static /* synthetic */ void getMaskedPhone$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.available2Fa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maskedEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maskedPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResetMfaPreconditionResponse copy(List<String> list, String str, String str2) {
        return new ResetMfaPreconditionResponse(list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetMfaPreconditionResponse)) {
            return false;
        }
        ResetMfaPreconditionResponse resetMfaPreconditionResponse = (ResetMfaPreconditionResponse) obj;
        return Intrinsics.EZpvd(this.available2Fa, resetMfaPreconditionResponse.available2Fa) && Intrinsics.EZpvd((Object) this.maskedEmail, (Object) resetMfaPreconditionResponse.maskedEmail) && Intrinsics.EZpvd((Object) this.maskedPhone, (Object) resetMfaPreconditionResponse.maskedPhone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAvailable2Fa() {
        return this.available2Fa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaskedEmail() {
        return this.maskedEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaskedPhone() {
        return this.maskedPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.available2Fa;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.maskedEmail;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.maskedPhone;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResetMfaPreconditionResponse(available2Fa=" + this.available2Fa + ", maskedEmail=" + this.maskedEmail + ", maskedPhone=" + this.maskedPhone + ")";
    }

    public /* synthetic */ ResetMfaPreconditionResponse(int i, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available2Fa = null;
        } else {
            this.available2Fa = list;
        }
        if ((i & 2) == 0) {
            this.maskedEmail = null;
        } else {
            this.maskedEmail = str;
        }
        if ((i & 4) == 0) {
            this.maskedPhone = null;
        } else {
            this.maskedPhone = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_api(ResetMfaPreconditionResponse resetMfaPreconditionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || resetMfaPreconditionResponse.available2Fa != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], resetMfaPreconditionResponse.available2Fa);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || resetMfaPreconditionResponse.maskedEmail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, resetMfaPreconditionResponse.maskedEmail);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && resetMfaPreconditionResponse.maskedPhone == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, resetMfaPreconditionResponse.maskedPhone);
    }

    public ResetMfaPreconditionResponse(List<String> list, String str, String str2) {
        this.available2Fa = list;
        this.maskedEmail = str;
        this.maskedPhone = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse.<init>(java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ResetMfaPreconditionResponse(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.reset2fa.data.model.ResetMfaPreconditionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ResetMfaPreconditionResponse> serializer() {
            return ResetMfaPreconditionResponse$$serializer.INSTANCE;
        }
    }

    public final boolean isMobile2faAvailable() {
        List<String> list = this.available2Fa;
        if (list != null) {
            return list.contains("MOBILE");
        }
        return false;
    }

    public final boolean isEmail2faAvailable() {
        List<String> list = this.available2Fa;
        if (list != null) {
            return list.contains("EMAIL");
        }
        return false;
    }

    public final boolean isAuthApp2faAvailable() {
        List<String> list = this.available2Fa;
        if (list != null) {
            return list.contains("AUTHENTICATOR");
        }
        return false;
    }
}
