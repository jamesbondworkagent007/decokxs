package com.okinc.auth.impl.facerecognition.model;

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
public final class FaceRecognitionResultRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String areaCode;
    public final int businessId;
    public final String businessRecordId;
    public final String email;
    public final String phone;
    public final String sessionId;
    public final String uuid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceRecognitionResultRequest copy$default(FaceRecognitionResultRequest faceRecognitionResultRequest, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = faceRecognitionResultRequest.businessId;
        }
        if ((i2 & 2) != 0) {
            str = faceRecognitionResultRequest.sessionId;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = faceRecognitionResultRequest.businessRecordId;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = faceRecognitionResultRequest.uuid;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = faceRecognitionResultRequest.email;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = faceRecognitionResultRequest.areaCode;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = faceRecognitionResultRequest.phone;
        }
        return faceRecognitionResultRequest.EZpvd(i, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceRecognitionResultRequest EZpvd(int i, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FaceRecognitionResultRequest(i, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceRecognitionResultRequest)) {
            return false;
        }
        FaceRecognitionResultRequest faceRecognitionResultRequest = (FaceRecognitionResultRequest) obj;
        return this.businessId == faceRecognitionResultRequest.businessId && Intrinsics.EZpvd((Object) this.sessionId, (Object) faceRecognitionResultRequest.sessionId) && Intrinsics.EZpvd((Object) this.businessRecordId, (Object) faceRecognitionResultRequest.businessRecordId) && Intrinsics.EZpvd((Object) this.uuid, (Object) faceRecognitionResultRequest.uuid) && Intrinsics.EZpvd((Object) this.email, (Object) faceRecognitionResultRequest.email) && Intrinsics.EZpvd((Object) this.areaCode, (Object) faceRecognitionResultRequest.areaCode) && Intrinsics.EZpvd((Object) this.phone, (Object) faceRecognitionResultRequest.phone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.businessId);
        int iHashCode2 = this.sessionId.hashCode();
        int iHashCode3 = this.businessRecordId.hashCode();
        String str = this.uuid;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.areaCode;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.phone;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceRecognitionResultRequest(businessId=" + this.businessId + ", sessionId=" + this.sessionId + ", businessRecordId=" + this.businessRecordId + ", uuid=" + this.uuid + ", email=" + this.email + ", areaCode=" + this.areaCode + ", phone=" + this.phone + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FaceRecognitionResultRequest> serializer() {
            return FaceRecognitionResultRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaceRecognitionResultRequest(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, FaceRecognitionResultRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.businessId = i2;
        this.sessionId = str;
        this.businessRecordId = str2;
        if ((i & 8) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str3;
        }
        if ((i & 16) == 0) {
            this.email = null;
        } else {
            this.email = str4;
        }
        if ((i & 32) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str5;
        }
        if ((i & 64) == 0) {
            this.phone = null;
        } else {
            this.phone = str6;
        }
    }

    public static final /* synthetic */ void AEQbTJ(FaceRecognitionResultRequest faceRecognitionResultRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, faceRecognitionResultRequest.businessId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, faceRecognitionResultRequest.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, faceRecognitionResultRequest.businessRecordId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || faceRecognitionResultRequest.uuid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, faceRecognitionResultRequest.uuid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || faceRecognitionResultRequest.email != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, faceRecognitionResultRequest.email);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || faceRecognitionResultRequest.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, faceRecognitionResultRequest.areaCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && faceRecognitionResultRequest.phone == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, faceRecognitionResultRequest.phone);
    }

    public FaceRecognitionResultRequest(int i, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.businessId = i;
        this.sessionId = str;
        this.businessRecordId = str2;
        this.uuid = str3;
        this.email = str4;
        this.areaCode = str5;
        this.phone = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.auth.impl.facerecognition.model.FaceRecognitionResultRequest.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FaceRecognitionResultRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6);
    }
}
