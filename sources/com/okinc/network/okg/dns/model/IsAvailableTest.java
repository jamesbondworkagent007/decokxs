package com.okinc.network.okg.dns.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class IsAvailableTest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long duration;
    private final int errCode;
    private final String host;
    private final String ip;
    private final Long totalDuration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IsAvailableTest copy$default(IsAvailableTest isAvailableTest, String str, String str2, long j, Long l, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = isAvailableTest.host;
        }
        if ((i2 & 2) != 0) {
            str2 = isAvailableTest.ip;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = isAvailableTest.duration;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            l = isAvailableTest.totalDuration;
        }
        Long l2 = l;
        if ((i2 & 16) != 0) {
            i = isAvailableTest.errCode;
        }
        return isAvailableTest.copy(str, str3, j2, l2, i);
    }

    @SerialName("duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("error_code")
    public static /* synthetic */ void getErrCode$annotations() {
    }

    @SerialName("host")
    public static /* synthetic */ void getHost$annotations() {
    }

    @SerialName("ip")
    public static /* synthetic */ void getIp$annotations() {
    }

    @SerialName("total_duration")
    public static /* synthetic */ void getTotalDuration$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.host;
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
    public final Long component4() {
        return this.totalDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IsAvailableTest copy(String str, String str2, long j, Long l, int i) {
        return new IsAvailableTest(str, str2, j, l, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IsAvailableTest)) {
            return false;
        }
        IsAvailableTest isAvailableTest = (IsAvailableTest) obj;
        return Intrinsics.EZpvd((Object) this.host, (Object) isAvailableTest.host) && Intrinsics.EZpvd((Object) this.ip, (Object) isAvailableTest.ip) && this.duration == isAvailableTest.duration && Intrinsics.EZpvd(this.totalDuration, isAvailableTest.totalDuration) && this.errCode == isAvailableTest.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrCode() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHost() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIp() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.host;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ip;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Long.hashCode(this.duration);
        Long l = this.totalDuration;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0)) * 31) + Integer.hashCode(this.errCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IsAvailableTest(host=" + this.host + ", ip=" + this.ip + ", duration=" + this.duration + ", totalDuration=" + this.totalDuration + ", errCode=" + this.errCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.IsAvailableTest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IsAvailableTest> serializer() {
            return IsAvailableTest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IsAvailableTest(int i, String str, String str2, long j, Long l, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, IsAvailableTest$$serializer.INSTANCE.getDescriptor());
        }
        this.host = str;
        this.ip = str2;
        this.duration = j;
        this.totalDuration = l;
        if ((i & 16) == 0) {
            this.errCode = 0;
        } else {
            this.errCode = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(IsAvailableTest isAvailableTest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, isAvailableTest.host);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, isAvailableTest.ip);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, isAvailableTest.duration);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, isAvailableTest.totalDuration);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && isAvailableTest.errCode == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, isAvailableTest.errCode);
    }

    public IsAvailableTest(String str, String str2, long j, Long l, int i) {
        this.host = str;
        this.ip = str2;
        this.duration = j;
        this.totalDuration = l;
        this.errCode = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 long)
  (r12v0 java.lang.Long)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.Long, int):void (m)] (LINE:156) call: com.okinc.network.okg.dns.model.IsAvailableTest.<init>(java.lang.String, java.lang.String, long, java.lang.Long, int):void type: THIS */
    public /* synthetic */ IsAvailableTest(String str, String str2, long j, Long l, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, l, (i2 & 16) != 0 ? 0 : i);
    }
}
