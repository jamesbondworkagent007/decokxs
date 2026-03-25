package com.okinc.network.okg.dns.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class PingCname {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String cname;
    private final long duration;
    private final int errorCode;
    private final String ip;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PingCname copy$default(PingCname pingCname, String str, String str2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pingCname.cname;
        }
        if ((i2 & 2) != 0) {
            str2 = pingCname.ip;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = pingCname.duration;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = pingCname.errorCode;
        }
        return pingCname.copy(str, str3, j2, i);
    }

    @SerialName("cname")
    public static /* synthetic */ void getCname$annotations() {
    }

    @SerialName("duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("error_code")
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @SerialName("ip")
    public static /* synthetic */ void getIp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PingCname copy(@NotNull String str, String str2, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PingCname(str, str2, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PingCname)) {
            return false;
        }
        PingCname pingCname = (PingCname) obj;
        return Intrinsics.EZpvd((Object) this.cname, (Object) pingCname.cname) && Intrinsics.EZpvd((Object) this.ip, (Object) pingCname.ip) && this.duration == pingCname.duration && this.errorCode == pingCname.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCname() {
        return this.cname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIp() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.cname.hashCode();
        String str = this.ip;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.duration)) * 31) + Integer.hashCode(this.errorCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PingCname(cname=" + this.cname + ", ip=" + this.ip + ", duration=" + this.duration + ", errorCode=" + this.errorCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.PingCname.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PingCname> serializer() {
            return PingCname$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PingCname(int i, String str, String str2, long j, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PingCname$$serializer.INSTANCE.getDescriptor());
        }
        this.cname = str;
        this.ip = str2;
        this.duration = j;
        if ((i & 8) == 0) {
            this.errorCode = 0;
        } else {
            this.errorCode = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(PingCname pingCname, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pingCname.cname);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pingCname.ip);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, pingCname.duration);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && pingCname.errorCode == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, pingCname.errorCode);
    }

    public PingCname(@NotNull String str, String str2, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cname = str;
        this.ip = str2;
        this.duration = j;
        this.errorCode = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 long)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
 A[MD:(java.lang.String, java.lang.String, long, int):void (m)] (LINE:139) call: com.okinc.network.okg.dns.model.PingCname.<init>(java.lang.String, java.lang.String, long, int):void type: THIS */
    public /* synthetic */ PingCname(String str, String str2, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, (i2 & 8) != 0 ? 0 : i);
    }
}
