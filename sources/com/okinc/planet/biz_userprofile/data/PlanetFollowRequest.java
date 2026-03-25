package com.okinc.planet.biz_userprofile.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C46411tTi;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PlanetFollowRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String authorId;
    public final String channelId;
    public final String passBasicCheck;
    public final boolean status;
    public final String uid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetFollowRequest copy$default(PlanetFollowRequest planetFollowRequest, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = planetFollowRequest.status;
        }
        if ((i & 2) != 0) {
            str = planetFollowRequest.authorId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = planetFollowRequest.uid;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = planetFollowRequest.channelId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = planetFollowRequest.passBasicCheck;
        }
        return planetFollowRequest.AEQbTJ(z, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetFollowRequest AEQbTJ(boolean z, String str, String str2, String str3, String str4) {
        return new PlanetFollowRequest(z, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanetFollowRequest)) {
            return false;
        }
        PlanetFollowRequest planetFollowRequest = (PlanetFollowRequest) obj;
        return this.status == planetFollowRequest.status && Intrinsics.EZpvd((Object) this.authorId, (Object) planetFollowRequest.authorId) && Intrinsics.EZpvd((Object) this.uid, (Object) planetFollowRequest.uid) && Intrinsics.EZpvd((Object) this.channelId, (Object) planetFollowRequest.channelId) && Intrinsics.EZpvd((Object) this.passBasicCheck, (Object) planetFollowRequest.passBasicCheck);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.status);
        String str = this.authorId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.uid;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.channelId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.passBasicCheck;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetFollowRequest(status=" + this.status + ", authorId=" + this.authorId + ", uid=" + this.uid + ", channelId=" + this.channelId + ", passBasicCheck=" + this.passBasicCheck + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetFollowRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlanetFollowRequest> serializer() {
            return PlanetFollowRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlanetFollowRequest(int i, boolean z, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PlanetFollowRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.status = z;
        if ((i & 2) == 0) {
            this.authorId = "";
        } else {
            this.authorId = str;
        }
        if ((i & 4) == 0) {
            this.uid = "";
        } else {
            this.uid = str2;
        }
        if ((i & 8) == 0) {
            this.channelId = "";
        } else {
            this.channelId = str3;
        }
        if ((i & 16) == 0) {
            this.passBasicCheck = "";
        } else {
            this.passBasicCheck = str4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(PlanetFollowRequest planetFollowRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, C46411tTi.OLrzqt, Boolean.valueOf(planetFollowRequest.status));
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) planetFollowRequest.authorId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, planetFollowRequest.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) planetFollowRequest.uid, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, planetFollowRequest.uid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) planetFollowRequest.channelId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, planetFollowRequest.channelId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) planetFollowRequest.passBasicCheck, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, planetFollowRequest.passBasicCheck);
    }

    public PlanetFollowRequest(boolean z, String str, String str2, String str3, String str4) {
        this.status = z;
        this.authorId = str;
        this.uid = str2;
        this.channelId = str3;
        this.passBasicCheck = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r8v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.planet.biz_userprofile.data.PlanetFollowRequest.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlanetFollowRequest(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
