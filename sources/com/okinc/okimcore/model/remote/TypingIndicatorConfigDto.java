package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TypingIndicatorConfigDto {
    private final List<Integer> allowedRolesInLargeGroup;
    private final Boolean chatroomEnabled;
    private final Long expiryMs;
    private final Boolean groupChatEnabled;
    private final Boolean individualChatEnabled;
    private final Integer largeGroupThreshold;
    private final Long throttleIntervalMs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TypingIndicatorConfigDto() {
        this((Long) null, (Long) null, (Integer) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okimcore.model.remote.TypingIndicatorConfigDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypingIndicatorConfigDto copy$default(TypingIndicatorConfigDto typingIndicatorConfigDto, Long l, Long l2, Integer num, List list, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = typingIndicatorConfigDto.throttleIntervalMs;
        }
        if ((i & 2) != 0) {
            l2 = typingIndicatorConfigDto.expiryMs;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            num = typingIndicatorConfigDto.largeGroupThreshold;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            list = typingIndicatorConfigDto.allowedRolesInLargeGroup;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            bool = typingIndicatorConfigDto.individualChatEnabled;
        }
        Boolean bool4 = bool;
        if ((i & 32) != 0) {
            bool2 = typingIndicatorConfigDto.groupChatEnabled;
        }
        Boolean bool5 = bool2;
        if ((i & 64) != 0) {
            bool3 = typingIndicatorConfigDto.chatroomEnabled;
        }
        return typingIndicatorConfigDto.copy(l, l3, num2, list2, bool4, bool5, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.throttleIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.expiryMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.largeGroupThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.allowedRolesInLargeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.individualChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.groupChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.chatroomEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TypingIndicatorConfigDto copy(Long l, Long l2, Integer num, List<Integer> list, Boolean bool, Boolean bool2, Boolean bool3) {
        return new TypingIndicatorConfigDto(l, l2, num, list, bool, bool2, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypingIndicatorConfigDto)) {
            return false;
        }
        TypingIndicatorConfigDto typingIndicatorConfigDto = (TypingIndicatorConfigDto) obj;
        return Intrinsics.EZpvd(this.throttleIntervalMs, typingIndicatorConfigDto.throttleIntervalMs) && Intrinsics.EZpvd(this.expiryMs, typingIndicatorConfigDto.expiryMs) && Intrinsics.EZpvd(this.largeGroupThreshold, typingIndicatorConfigDto.largeGroupThreshold) && Intrinsics.EZpvd(this.allowedRolesInLargeGroup, typingIndicatorConfigDto.allowedRolesInLargeGroup) && Intrinsics.EZpvd(this.individualChatEnabled, typingIndicatorConfigDto.individualChatEnabled) && Intrinsics.EZpvd(this.groupChatEnabled, typingIndicatorConfigDto.groupChatEnabled) && Intrinsics.EZpvd(this.chatroomEnabled, typingIndicatorConfigDto.chatroomEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getAllowedRolesInLargeGroup() {
        return this.allowedRolesInLargeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getChatroomEnabled() {
        return this.chatroomEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiryMs() {
        return this.expiryMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getGroupChatEnabled() {
        return this.groupChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIndividualChatEnabled() {
        return this.individualChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLargeGroupThreshold() {
        return this.largeGroupThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getThrottleIntervalMs() {
        return this.throttleIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.throttleIntervalMs;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.expiryMs;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        Integer num = this.largeGroupThreshold;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        List<Integer> list = this.allowedRolesInLargeGroup;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Boolean bool = this.individualChatEnabled;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.groupChatEnabled;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.chatroomEnabled;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TypingIndicatorConfigDto(throttleIntervalMs=" + this.throttleIntervalMs + ", expiryMs=" + this.expiryMs + ", largeGroupThreshold=" + this.largeGroupThreshold + ", allowedRolesInLargeGroup=" + this.allowedRolesInLargeGroup + ", individualChatEnabled=" + this.individualChatEnabled + ", groupChatEnabled=" + this.groupChatEnabled + ", chatroomEnabled=" + this.chatroomEnabled + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.TypingIndicatorConfigDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TypingIndicatorConfigDto> serializer() {
            return TypingIndicatorConfigDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TypingIndicatorConfigDto(int i, Long l, Long l2, Integer num, List list, Boolean bool, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.throttleIntervalMs = null;
        } else {
            this.throttleIntervalMs = l;
        }
        if ((i & 2) == 0) {
            this.expiryMs = null;
        } else {
            this.expiryMs = l2;
        }
        if ((i & 4) == 0) {
            this.largeGroupThreshold = null;
        } else {
            this.largeGroupThreshold = num;
        }
        if ((i & 8) == 0) {
            this.allowedRolesInLargeGroup = null;
        } else {
            this.allowedRolesInLargeGroup = list;
        }
        if ((i & 16) == 0) {
            this.individualChatEnabled = null;
        } else {
            this.individualChatEnabled = bool;
        }
        if ((i & 32) == 0) {
            this.groupChatEnabled = null;
        } else {
            this.groupChatEnabled = bool2;
        }
        if ((i & 64) == 0) {
            this.chatroomEnabled = null;
        } else {
            this.chatroomEnabled = bool3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(TypingIndicatorConfigDto typingIndicatorConfigDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || typingIndicatorConfigDto.throttleIntervalMs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, typingIndicatorConfigDto.throttleIntervalMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || typingIndicatorConfigDto.expiryMs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, typingIndicatorConfigDto.expiryMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || typingIndicatorConfigDto.largeGroupThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, typingIndicatorConfigDto.largeGroupThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || typingIndicatorConfigDto.allowedRolesInLargeGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], typingIndicatorConfigDto.allowedRolesInLargeGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || typingIndicatorConfigDto.individualChatEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, typingIndicatorConfigDto.individualChatEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || typingIndicatorConfigDto.groupChatEnabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, typingIndicatorConfigDto.groupChatEnabled);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && typingIndicatorConfigDto.chatroomEnabled == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, typingIndicatorConfigDto.chatroomEnabled);
    }

    public TypingIndicatorConfigDto(Long l, Long l2, Integer num, List<Integer> list, Boolean bool, Boolean bool2, Boolean bool3) {
        this.throttleIntervalMs = l;
        this.expiryMs = l2;
        this.largeGroupThreshold = num;
        this.allowedRolesInLargeGroup = list;
        this.individualChatEnabled = bool;
        this.groupChatEnabled = bool2;
        this.chatroomEnabled = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r12v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r13v0 java.lang.Boolean))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.Integer, java.util.List<java.lang.Integer>, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:31) call: com.okinc.okimcore.model.remote.TypingIndicatorConfigDto.<init>(java.lang.Long, java.lang.Long, java.lang.Integer, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TypingIndicatorConfigDto(Long l, Long l2, Integer num, List list, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3);
    }
}
