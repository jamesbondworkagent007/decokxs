package com.okinc.okrisk.service;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DidBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cv;
    private final String did;
    private final String et;
    private final int pm;
    private final int pv;
    private final String rid;
    private final String sid;
    private final String st;
    private final String sv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.et;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.st;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.pm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.cv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.pv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.did;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.sv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DidBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, int i3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new DidBody(str, str2, str3, i, i2, i3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DidBody)) {
            return false;
        }
        DidBody didBody = (DidBody) obj;
        return Intrinsics.EZpvd((Object) this.sid, (Object) didBody.sid) && Intrinsics.EZpvd((Object) this.et, (Object) didBody.et) && Intrinsics.EZpvd((Object) this.st, (Object) didBody.st) && this.pm == didBody.pm && this.cv == didBody.cv && this.pv == didBody.pv && Intrinsics.EZpvd((Object) this.rid, (Object) didBody.rid) && Intrinsics.EZpvd((Object) this.did, (Object) didBody.did) && Intrinsics.EZpvd((Object) this.sv, (Object) didBody.sv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCv() {
        return this.cv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDid() {
        return this.did;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEt() {
        return this.et;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPm() {
        return this.pm;
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
    public final String getSid() {
        return this.sid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSt() {
        return this.st;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSv() {
        return this.sv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.sid.hashCode() * 31) + this.et.hashCode()) * 31) + this.st.hashCode()) * 31) + Integer.hashCode(this.pm)) * 31) + Integer.hashCode(this.cv)) * 31) + Integer.hashCode(this.pv)) * 31) + this.rid.hashCode()) * 31) + this.did.hashCode()) * 31) + this.sv.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DidBody(sid=" + this.sid + ", et=" + this.et + ", st=" + this.st + ", pm=" + this.pm + ", cv=" + this.cv + ", pv=" + this.pv + ", rid=" + this.rid + ", did=" + this.did + ", sv=" + this.sv + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.DidBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DidBody> serializer() {
            return DidBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DidBody(int i, String str, String str2, String str3, int i2, int i3, int i4, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DidBody$$serializer.INSTANCE.getDescriptor());
        }
        this.sid = str;
        this.et = str2;
        this.st = str3;
        if ((i & 8) == 0) {
            this.pm = 0;
        } else {
            this.pm = i2;
        }
        if ((i & 16) == 0) {
            this.cv = 0;
        } else {
            this.cv = i3;
        }
        if ((i & 32) == 0) {
            this.pv = 0;
        } else {
            this.pv = i4;
        }
        if ((i & 64) == 0) {
            this.rid = "";
        } else {
            this.rid = str4;
        }
        if ((i & 128) == 0) {
            this.did = "";
        } else {
            this.did = str5;
        }
        if ((i & 256) == 0) {
            this.sv = "";
        } else {
            this.sv = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(DidBody didBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, didBody.sid);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, didBody.et);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, didBody.st);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || didBody.pm != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, didBody.pm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || didBody.cv != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, didBody.cv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || didBody.pv != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, didBody.pv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) didBody.rid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, didBody.rid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) didBody.did, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, didBody.did);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) didBody.sv, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, didBody.sv);
    }

    public DidBody(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, int i3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.sid = str;
        this.et = str2;
        this.st = str3;
        this.pm = i;
        this.cv = i2;
        this.pv = i3;
        this.rid = str4;
        this.did = str5;
        this.sv = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.okrisk.service.DidBody.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DidBody(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6);
    }
}
