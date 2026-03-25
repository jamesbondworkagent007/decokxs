package com.okinc.tradingbot.impl.dto;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RecurringEventHistoryDto {
    private final List<Message> args;
    private final List<DetailArg> detailsArgs;
    private final long eventTime;
    private final String eventTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DetailArg$$serializer.INSTANCE), new ArrayListSerializer(Message$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringEventHistoryDto() {
        this((String) null, (List) null, (List) null, 0L, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.tradingbot.impl.dto.RecurringEventHistoryDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringEventHistoryDto copy$default(RecurringEventHistoryDto recurringEventHistoryDto, String str, List list, List list2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringEventHistoryDto.eventTitle;
        }
        if ((i & 2) != 0) {
            list = recurringEventHistoryDto.detailsArgs;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = recurringEventHistoryDto.args;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            j = recurringEventHistoryDto.eventTime;
        }
        return recurringEventHistoryDto.copy(str, list3, list4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.eventTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DetailArg> component2() {
        return this.detailsArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Message> component3() {
        return this.args;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringEventHistoryDto copy(@NotNull String str, @NotNull List<DetailArg> list, @NotNull List<Message> list2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new RecurringEventHistoryDto(str, list, list2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringEventHistoryDto)) {
            return false;
        }
        RecurringEventHistoryDto recurringEventHistoryDto = (RecurringEventHistoryDto) obj;
        return Intrinsics.EZpvd((Object) this.eventTitle, (Object) recurringEventHistoryDto.eventTitle) && Intrinsics.EZpvd(this.detailsArgs, recurringEventHistoryDto.detailsArgs) && Intrinsics.EZpvd(this.args, recurringEventHistoryDto.args) && this.eventTime == recurringEventHistoryDto.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Message> getArgs() {
        return this.args;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DetailArg> getDetailsArgs() {
        return this.detailsArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventTime() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTitle() {
        return this.eventTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.eventTitle.hashCode() * 31) + this.detailsArgs.hashCode()) * 31) + this.args.hashCode()) * 31) + Long.hashCode(this.eventTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringEventHistoryDto(eventTitle=" + this.eventTitle + ", detailsArgs=" + this.detailsArgs + ", args=" + this.args + ", eventTime=" + this.eventTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.RecurringEventHistoryDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringEventHistoryDto> serializer() {
            return RecurringEventHistoryDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringEventHistoryDto(int i, String str, List list, List list2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        this.eventTitle = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.detailsArgs = yDY.AhwBna();
        } else {
            this.detailsArgs = list;
        }
        if ((i & 4) == 0) {
            this.args = yDY.AhwBna();
        } else {
            this.args = list2;
        }
        if ((i & 8) == 0) {
            this.eventTime = 0L;
        } else {
            this.eventTime = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(RecurringEventHistoryDto recurringEventHistoryDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recurringEventHistoryDto.eventTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringEventHistoryDto.eventTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(recurringEventHistoryDto.detailsArgs, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], recurringEventHistoryDto.detailsArgs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(recurringEventHistoryDto.args, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], recurringEventHistoryDto.args);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && recurringEventHistoryDto.eventTime == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 3, recurringEventHistoryDto.eventTime);
    }

    public RecurringEventHistoryDto(@NotNull String str, @NotNull List<DetailArg> list, @NotNull List<Message> list2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.eventTitle = str;
        this.detailsArgs = list;
        this.args = list2;
        this.eventTime = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r5v0 java.util.List))
  (wrap:java.util.List:0x0017: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0013: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r6v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
 A[MD:(java.lang.String, java.util.List<com.okinc.tradingbot.impl.dto.DetailArg>, java.util.List<com.okinc.tradingbot.impl.dto.Message>, long):void (m)] (LINE:9) call: com.okinc.tradingbot.impl.dto.RecurringEventHistoryDto.<init>(java.lang.String, java.util.List, java.util.List, long):void type: THIS */
    public /* synthetic */ RecurringEventHistoryDto(String str, List list, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? 0L : j);
    }

    public final HistoryEventsDto toHistoryEventsDto() {
        return new HistoryEventsDto("", "", this.eventTitle, this.detailsArgs, (Map) null, this.args, this.eventTime, 16, (DefaultConstructorMarker) null);
    }
}
