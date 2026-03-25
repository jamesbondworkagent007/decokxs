package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InHouseIMGetAgoraTokenResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String appId;
    public final String token;
    public final String uid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGetAgoraTokenResponse() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMGetAgoraTokenResponse copy$default(InHouseIMGetAgoraTokenResponse inHouseIMGetAgoraTokenResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inHouseIMGetAgoraTokenResponse.appId;
        }
        if ((i & 2) != 0) {
            str2 = inHouseIMGetAgoraTokenResponse.token;
        }
        if ((i & 4) != 0) {
            str3 = inHouseIMGetAgoraTokenResponse.uid;
        }
        return inHouseIMGetAgoraTokenResponse.copydefault(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGetAgoraTokenResponse copydefault(String str, String str2, String str3) {
        return new InHouseIMGetAgoraTokenResponse(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMGetAgoraTokenResponse)) {
            return false;
        }
        InHouseIMGetAgoraTokenResponse inHouseIMGetAgoraTokenResponse = (InHouseIMGetAgoraTokenResponse) obj;
        return Intrinsics.EZpvd((Object) this.appId, (Object) inHouseIMGetAgoraTokenResponse.appId) && Intrinsics.EZpvd((Object) this.token, (Object) inHouseIMGetAgoraTokenResponse.token) && Intrinsics.EZpvd((Object) this.uid, (Object) inHouseIMGetAgoraTokenResponse.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.appId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.token;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGetAgoraTokenResponse(appId=" + this.appId + ", token=" + this.token + ", uid=" + this.uid + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGetAgoraTokenResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGetAgoraTokenResponse> serializer() {
            return InHouseIMGetAgoraTokenResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGetAgoraTokenResponse(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.appId = null;
        } else {
            this.appId = str;
        }
        if ((i & 2) == 0) {
            this.token = null;
        } else {
            this.token = str2;
        }
        if ((i & 4) == 0) {
            this.uid = null;
        } else {
            this.uid = str3;
        }
    }

    public static final /* synthetic */ void KWHzl(InHouseIMGetAgoraTokenResponse inHouseIMGetAgoraTokenResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMGetAgoraTokenResponse.appId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inHouseIMGetAgoraTokenResponse.appId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMGetAgoraTokenResponse.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMGetAgoraTokenResponse.token);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && inHouseIMGetAgoraTokenResponse.uid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inHouseIMGetAgoraTokenResponse.uid);
    }

    public InHouseIMGetAgoraTokenResponse(String str, String str2, String str3) {
        this.appId = str;
        this.token = str2;
        this.uid = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.InHouseIMGetAgoraTokenResponse.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InHouseIMGetAgoraTokenResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
