package com.okinc.network.okg.dns.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class Stages {
    private GetConfig getConfig;
    private List<IsAvailableTest> isAvailableTest;
    private List<PingCname> pingCNames;
    private long startTimeForGetConfig;
    private long startTimeForIsAvailableTest;
    private long startTimeForPingCNames;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(PingCname$$serializer.INSTANCE), new ArrayListSerializer(IsAvailableTest$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Stages() {
        this(null, null, null, 0L, 0L, 0L, 63, null);
    }

    @SerialName("get_config")
    public static /* synthetic */ void getGetConfig$annotations() {
    }

    @SerialName("ping_cname")
    public static /* synthetic */ void getPingCNames$annotations() {
    }

    @Transient
    public static /* synthetic */ void getStartTimeForGetConfig$annotations() {
    }

    @Transient
    public static /* synthetic */ void getStartTimeForIsAvailableTest$annotations() {
    }

    @Transient
    public static /* synthetic */ void getStartTimeForPingCNames$annotations() {
    }

    @SerialName("isavailable_test")
    public static /* synthetic */ void isAvailableTest$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetConfig component1() {
        return this.getConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PingCname> component2() {
        return this.pingCNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IsAvailableTest> component3() {
        return this.isAvailableTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.startTimeForGetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.startTimeForPingCNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.startTimeForIsAvailableTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stages copy(GetConfig getConfig, List<PingCname> list, List<IsAvailableTest> list2, long j, long j2, long j3) {
        return new Stages(getConfig, list, list2, j, j2, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stages)) {
            return false;
        }
        Stages stages = (Stages) obj;
        return Intrinsics.EZpvd(this.getConfig, stages.getConfig) && Intrinsics.EZpvd(this.pingCNames, stages.pingCNames) && Intrinsics.EZpvd(this.isAvailableTest, stages.isAvailableTest) && this.startTimeForGetConfig == stages.startTimeForGetConfig && this.startTimeForPingCNames == stages.startTimeForPingCNames && this.startTimeForIsAvailableTest == stages.startTimeForIsAvailableTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetConfig getGetConfig() {
        return this.getConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PingCname> getPingCNames() {
        return this.pingCNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTimeForGetConfig() {
        return this.startTimeForGetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTimeForIsAvailableTest() {
        return this.startTimeForIsAvailableTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTimeForPingCNames() {
        return this.startTimeForPingCNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GetConfig getConfig = this.getConfig;
        int iHashCode = getConfig == null ? 0 : getConfig.hashCode();
        List<PingCname> list = this.pingCNames;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<IsAvailableTest> list2 = this.isAvailableTest;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + Long.hashCode(this.startTimeForGetConfig)) * 31) + Long.hashCode(this.startTimeForPingCNames)) * 31) + Long.hashCode(this.startTimeForIsAvailableTest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<IsAvailableTest> isAvailableTest() {
        return this.isAvailableTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableTest(List<IsAvailableTest> list) {
        this.isAvailableTest = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGetConfig(GetConfig getConfig) {
        this.getConfig = getConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPingCNames(List<PingCname> list) {
        this.pingCNames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTimeForGetConfig(long j) {
        this.startTimeForGetConfig = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTimeForIsAvailableTest(long j) {
        this.startTimeForIsAvailableTest = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTimeForPingCNames(long j) {
        this.startTimeForPingCNames = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Stages(getConfig=" + this.getConfig + ", pingCNames=" + this.pingCNames + ", isAvailableTest=" + this.isAvailableTest + ", startTimeForGetConfig=" + this.startTimeForGetConfig + ", startTimeForPingCNames=" + this.startTimeForPingCNames + ", startTimeForIsAvailableTest=" + this.startTimeForIsAvailableTest + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.Stages.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Stages> serializer() {
            return Stages$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Stages(int i, GetConfig getConfig, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.getConfig = null;
        } else {
            this.getConfig = getConfig;
        }
        if ((i & 2) == 0) {
            this.pingCNames = null;
        } else {
            this.pingCNames = list;
        }
        if ((i & 4) == 0) {
            this.isAvailableTest = null;
        } else {
            this.isAvailableTest = list2;
        }
        this.startTimeForGetConfig = 0L;
        this.startTimeForPingCNames = 0L;
        this.startTimeForIsAvailableTest = 0L;
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(Stages stages, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || stages.getConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, GetConfig$$serializer.INSTANCE, stages.getConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || stages.pingCNames != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], stages.pingCNames);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && stages.isAvailableTest == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], stages.isAvailableTest);
    }

    public Stages(GetConfig getConfig, List<PingCname> list, List<IsAvailableTest> list2, long j, long j2, long j3) {
        this.getConfig = getConfig;
        this.pingCNames = list;
        this.isAvailableTest = list2;
        this.startTimeForGetConfig = j;
        this.startTimeForPingCNames = j2;
        this.startTimeForIsAvailableTest = j3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:com.okinc.network.okg.dns.model.GetConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.network.okg.dns.model.GetConfig) : (r11v0 com.okinc.network.okg.dns.model.GetConfig))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r20v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.util.List) : (null java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001e: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r18v0 long) : (0 long))
 A[MD:(com.okinc.network.okg.dns.model.GetConfig, java.util.List<com.okinc.network.okg.dns.model.PingCname>, java.util.List<com.okinc.network.okg.dns.model.IsAvailableTest>, long, long, long):void (m)] (LINE:79) call: com.okinc.network.okg.dns.model.Stages.<init>(com.okinc.network.okg.dns.model.GetConfig, java.util.List, java.util.List, long, long, long):void type: THIS */
    public /* synthetic */ Stages(GetConfig getConfig, List list, List list2, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getConfig, (i & 2) != 0 ? null : list, (i & 4) == 0 ? list2 : null, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, (i & 32) == 0 ? j3 : 0L);
    }
}
