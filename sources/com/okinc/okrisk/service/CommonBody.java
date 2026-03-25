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
public final class CommonBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String et;
    private final int pm;
    private final int pv;
    private final String rid;
    private final String scene;
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
    public final String component5() {
        return this.sv;
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
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, int i2, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new CommonBody(str, str2, str3, i, str4, i2, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonBody)) {
            return false;
        }
        CommonBody commonBody = (CommonBody) obj;
        return Intrinsics.EZpvd((Object) this.sid, (Object) commonBody.sid) && Intrinsics.EZpvd((Object) this.et, (Object) commonBody.et) && Intrinsics.EZpvd((Object) this.st, (Object) commonBody.st) && this.pm == commonBody.pm && Intrinsics.EZpvd((Object) this.sv, (Object) commonBody.sv) && this.pv == commonBody.pv && Intrinsics.EZpvd((Object) this.rid, (Object) commonBody.rid) && Intrinsics.EZpvd((Object) this.scene, (Object) commonBody.scene);
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
    public final String getScene() {
        return this.scene;
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
        return (((((((((((((this.sid.hashCode() * 31) + this.et.hashCode()) * 31) + this.st.hashCode()) * 31) + Integer.hashCode(this.pm)) * 31) + this.sv.hashCode()) * 31) + Integer.hashCode(this.pv)) * 31) + this.rid.hashCode()) * 31) + this.scene.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonBody(sid=" + this.sid + ", et=" + this.et + ", st=" + this.st + ", pm=" + this.pm + ", sv=" + this.sv + ", pv=" + this.pv + ", rid=" + this.rid + ", scene=" + this.scene + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.CommonBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonBody> serializer() {
            return CommonBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommonBody(int i, String str, String str2, String str3, int i2, String str4, int i3, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, CommonBody$$serializer.INSTANCE.getDescriptor());
        }
        this.sid = str;
        this.et = str2;
        this.st = str3;
        this.pm = i2;
        this.sv = str4;
        if ((i & 32) == 0) {
            this.pv = 0;
        } else {
            this.pv = i3;
        }
        if ((i & 64) == 0) {
            this.rid = "";
        } else {
            this.rid = str5;
        }
        if ((i & 128) == 0) {
            this.scene = "";
        } else {
            this.scene = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(CommonBody commonBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, commonBody.sid);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, commonBody.et);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, commonBody.st);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, commonBody.pm);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, commonBody.sv);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || commonBody.pv != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, commonBody.pv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) commonBody.rid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, commonBody.rid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) commonBody.scene, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, commonBody.scene);
    }

    public CommonBody(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, int i2, @NotNull String str5, @NotNull String str6) {
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
        this.sv = str4;
        this.pv = i2;
        this.rid = str5;
        this.scene = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 int)
  (r16v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.okrisk.service.CommonBody.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommonBody(String str, String str2, String str3, int i, String str4, int i2, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6);
    }
}
