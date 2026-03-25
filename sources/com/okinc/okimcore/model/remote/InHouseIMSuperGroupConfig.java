package com.okinc.okimcore.model.remote;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMSuperGroupConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer capacity;
    private final Long orbiterPlusExpiryTimestamp;
    private final int showSuperGroupUpgradeStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMSuperGroupConfig copy$default(InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig, int i, Long l, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inHouseIMSuperGroupConfig.showSuperGroupUpgradeStatus;
        }
        if ((i2 & 2) != 0) {
            l = inHouseIMSuperGroupConfig.orbiterPlusExpiryTimestamp;
        }
        if ((i2 & 4) != 0) {
            num = inHouseIMSuperGroupConfig.capacity;
        }
        return inHouseIMSuperGroupConfig.copy(i, l, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.showSuperGroupUpgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.orbiterPlusExpiryTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.capacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMSuperGroupConfig copy(int i, Long l, Integer num) {
        return new InHouseIMSuperGroupConfig(i, l, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMSuperGroupConfig)) {
            return false;
        }
        InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig = (InHouseIMSuperGroupConfig) obj;
        return this.showSuperGroupUpgradeStatus == inHouseIMSuperGroupConfig.showSuperGroupUpgradeStatus && Intrinsics.EZpvd(this.orbiterPlusExpiryTimestamp, inHouseIMSuperGroupConfig.orbiterPlusExpiryTimestamp) && Intrinsics.EZpvd(this.capacity, inHouseIMSuperGroupConfig.capacity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCapacity() {
        return this.capacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getOrbiterPlusExpiryTimestamp() {
        return this.orbiterPlusExpiryTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowSuperGroupUpgradeStatus() {
        return this.showSuperGroupUpgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.showSuperGroupUpgradeStatus);
        Long l = this.orbiterPlusExpiryTimestamp;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Integer num = this.capacity;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMSuperGroupConfig(showSuperGroupUpgradeStatus=" + this.showSuperGroupUpgradeStatus + ", orbiterPlusExpiryTimestamp=" + this.orbiterPlusExpiryTimestamp + ", capacity=" + this.capacity + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMSuperGroupConfig> serializer() {
            return InHouseIMSuperGroupConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMSuperGroupConfig(int i, int i2, Long l, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InHouseIMSuperGroupConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.showSuperGroupUpgradeStatus = i2;
        if ((i & 2) == 0) {
            this.orbiterPlusExpiryTimestamp = 0L;
        } else {
            this.orbiterPlusExpiryTimestamp = l;
        }
        if ((i & 4) == 0) {
            this.capacity = null;
        } else {
            this.capacity = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMSuperGroupConfig inHouseIMSuperGroupConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, inHouseIMSuperGroupConfig.showSuperGroupUpgradeStatus);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l = inHouseIMSuperGroupConfig.orbiterPlusExpiryTimestamp) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, inHouseIMSuperGroupConfig.orbiterPlusExpiryTimestamp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && inHouseIMSuperGroupConfig.capacity == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, inHouseIMSuperGroupConfig.capacity);
    }

    public InHouseIMSuperGroupConfig(int i, Long l, Integer num) {
        this.showSuperGroupUpgradeStatus = i;
        this.orbiterPlusExpiryTimestamp = l;
        this.capacity = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r3v0 int)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r4v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(int, java.lang.Long, java.lang.Integer):void (m)] (LINE:204) call: com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig.<init>(int, java.lang.Long, java.lang.Integer):void type: THIS */
    public /* synthetic */ InHouseIMSuperGroupConfig(int i, Long l, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? 0L : l, (i2 & 4) != 0 ? null : num);
    }

    public final IncreaseGroupStatus getIncreaseGroupConfigStatus() {
        return IncreaseGroupStatus.Companion.copydefault(this.showSuperGroupUpgradeStatus);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IncreaseGroupStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ IncreaseGroupStatus[] $VALUES;
        public static final TaskDescription Companion;
        private final int value;
        public static final IncreaseGroupStatus NOT_ALLOWED = new IncreaseGroupStatus("NOT_ALLOWED", 0, 0);
        public static final IncreaseGroupStatus ALMOST_FULL = new IncreaseGroupStatus("ALMOST_FULL", 1, 1);
        public static final IncreaseGroupStatus IS_FULL = new IncreaseGroupStatus("IS_FULL", 2, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ IncreaseGroupStatus[] $values() {
            return new IncreaseGroupStatus[]{NOT_ALLOWED, ALMOST_FULL, IS_FULL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<IncreaseGroupStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private IncreaseGroupStatus(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            IncreaseGroupStatus[] increaseGroupStatusArr$values = $values();
            $VALUES = increaseGroupStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(increaseGroupStatusArr$values);
            Companion = new TaskDescription(null);
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMSuperGroupConfig.IncreaseGroupStatus.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final IncreaseGroupStatus copydefault(int i) {
                for (IncreaseGroupStatus increaseGroupStatus : IncreaseGroupStatus.values()) {
                    if (increaseGroupStatus.getValue() == i) {
                        return increaseGroupStatus;
                    }
                }
                return null;
            }

            public final boolean OLrzqt(IncreaseGroupStatus increaseGroupStatus) {
                return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends IncreaseGroupStatus>) ((Iterable<? extends Object>) yDY.gEmmrt(IncreaseGroupStatus.ALMOST_FULL, IncreaseGroupStatus.IS_FULL)), increaseGroupStatus);
            }
        }

        public static IncreaseGroupStatus valueOf(String str) {
            return (IncreaseGroupStatus) Enum.valueOf(IncreaseGroupStatus.class, str);
        }

        public static IncreaseGroupStatus[] values() {
            return (IncreaseGroupStatus[]) $VALUES.clone();
        }
    }
}
