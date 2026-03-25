package com.okinc.okrisk.service;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DidResponseTmp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String cg;
    private final int cv;
    private final String e_deviceToken;
    private final String efp;
    private final String fingerprintId;
    private final int pv;
    private final String rid;
    private final int status;
    private final String ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
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
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.pv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.cg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.cv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DidResponseTmp copy(int i, @NotNull String str, String str2, String str3, String str4, int i2, String str5, int i3, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DidResponseTmp(i, str, str2, str3, str4, i2, str5, i3, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DidResponseTmp)) {
            return false;
        }
        DidResponseTmp didResponseTmp = (DidResponseTmp) obj;
        return this.status == didResponseTmp.status && Intrinsics.EZpvd((Object) this.fingerprintId, (Object) didResponseTmp.fingerprintId) && Intrinsics.EZpvd((Object) this.efp, (Object) didResponseTmp.efp) && Intrinsics.EZpvd((Object) this.e_deviceToken, (Object) didResponseTmp.e_deviceToken) && Intrinsics.EZpvd((Object) this.ts, (Object) didResponseTmp.ts) && this.pv == didResponseTmp.pv && Intrinsics.EZpvd((Object) this.cg, (Object) didResponseTmp.cg) && this.cv == didResponseTmp.cv && Intrinsics.EZpvd((Object) this.rid, (Object) didResponseTmp.rid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCg() {
        return this.cg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCv() {
        return this.cv;
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
    public final int getPv() {
        return this.pv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRid() {
        return this.rid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status);
        int iHashCode2 = this.fingerprintId.hashCode();
        String str = this.efp;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.e_deviceToken;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ts;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = Integer.hashCode(this.pv);
        String str4 = this.cg;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = Integer.hashCode(this.cv);
        String str5 = this.rid;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DidResponseTmp(status=" + this.status + ", fingerprintId=" + this.fingerprintId + ", efp=" + this.efp + ", e_deviceToken=" + this.e_deviceToken + ", ts=" + this.ts + ", pv=" + this.pv + ", cg=" + this.cg + ", cv=" + this.cv + ", rid=" + this.rid + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.DidResponseTmp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DidResponseTmp> serializer() {
            return DidResponseTmp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DidResponseTmp(int i, int i2, String str, String str2, String str3, String str4, int i3, String str5, int i4, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DidResponseTmp$$serializer.INSTANCE.getDescriptor());
        }
        this.status = i2;
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
            this.ts = "";
        } else {
            this.ts = str4;
        }
        if ((i & 32) == 0) {
            this.pv = 0;
        } else {
            this.pv = i3;
        }
        if ((i & 64) == 0) {
            this.cg = "";
        } else {
            this.cg = str5;
        }
        if ((i & 128) == 0) {
            this.cv = 0;
        } else {
            this.cv = i4;
        }
        if ((i & 256) == 0) {
            this.rid = "";
        } else {
            this.rid = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(DidResponseTmp didResponseTmp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, didResponseTmp.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, didResponseTmp.fingerprintId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) didResponseTmp.efp, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, didResponseTmp.efp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) didResponseTmp.e_deviceToken, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, didResponseTmp.e_deviceToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) didResponseTmp.ts, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, didResponseTmp.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || didResponseTmp.pv != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, didResponseTmp.pv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) didResponseTmp.cg, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, didResponseTmp.cg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || didResponseTmp.cv != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, didResponseTmp.cv);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) didResponseTmp.rid, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, didResponseTmp.rid);
    }

    public DidResponseTmp(int i, @NotNull String str, String str2, String str3, String str4, int i2, String str5, int i3, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = i;
        this.fingerprintId = str;
        this.efp = str2;
        this.e_deviceToken = str3;
        this.ts = str4;
        this.pv = i2;
        this.cg = str5;
        this.cv = i3;
        this.rid = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (r14v0 int)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String):void (m)] (LINE:35) call: com.okinc.okrisk.service.DidResponseTmp.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ DidResponseTmp(int i, String str, String str2, String str3, String str4, int i2, String str5, int i3, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? "" : str6);
    }
}
