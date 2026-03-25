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
public final class GridEventHistoryDto {
    public final List<Message> args;
    public final List<DetailArg> detailsArgs;
    public final long eventTime;
    public final String eventTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DetailArg$$serializer.INSTANCE), new ArrayListSerializer(Message$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridEventHistoryDto() {
        this((String) null, (List) null, (List) null, 0L, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.tradingbot.impl.dto.GridEventHistoryDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridEventHistoryDto copy$default(GridEventHistoryDto gridEventHistoryDto, String str, List list, List list2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridEventHistoryDto.eventTitle;
        }
        if ((i & 2) != 0) {
            list = gridEventHistoryDto.detailsArgs;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = gridEventHistoryDto.args;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            j = gridEventHistoryDto.eventTime;
        }
        return gridEventHistoryDto.AEQbTJ(str, list3, list4, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridEventHistoryDto AEQbTJ(@NotNull String str, @NotNull List<DetailArg> list, @NotNull List<Message> list2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new GridEventHistoryDto(str, list, list2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridEventHistoryDto)) {
            return false;
        }
        GridEventHistoryDto gridEventHistoryDto = (GridEventHistoryDto) obj;
        return Intrinsics.EZpvd((Object) this.eventTitle, (Object) gridEventHistoryDto.eventTitle) && Intrinsics.EZpvd(this.detailsArgs, gridEventHistoryDto.detailsArgs) && Intrinsics.EZpvd(this.args, gridEventHistoryDto.args) && this.eventTime == gridEventHistoryDto.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.eventTitle.hashCode() * 31) + this.detailsArgs.hashCode()) * 31) + this.args.hashCode()) * 31) + Long.hashCode(this.eventTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridEventHistoryDto(eventTitle=" + this.eventTitle + ", detailsArgs=" + this.detailsArgs + ", args=" + this.args + ", eventTime=" + this.eventTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.GridEventHistoryDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridEventHistoryDto> serializer() {
            return GridEventHistoryDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridEventHistoryDto(int i, String str, List list, List list2, long j, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void AEQbTJ(GridEventHistoryDto gridEventHistoryDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridEventHistoryDto.eventTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridEventHistoryDto.eventTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(gridEventHistoryDto.detailsArgs, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], gridEventHistoryDto.detailsArgs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(gridEventHistoryDto.args, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], gridEventHistoryDto.args);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && gridEventHistoryDto.eventTime == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 3, gridEventHistoryDto.eventTime);
    }

    public GridEventHistoryDto(@NotNull String str, @NotNull List<DetailArg> list, @NotNull List<Message> list2, long j) {
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
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r5v0 java.util.List))
  (wrap:java.util.List:0x0017: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0013: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r6v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
 A[MD:(java.lang.String, java.util.List<com.okinc.tradingbot.impl.dto.DetailArg>, java.util.List<com.okinc.tradingbot.impl.dto.Message>, long):void (m)] (LINE:7) call: com.okinc.tradingbot.impl.dto.GridEventHistoryDto.<init>(java.lang.String, java.util.List, java.util.List, long):void type: THIS */
    public /* synthetic */ GridEventHistoryDto(String str, List list, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? 0L : j);
    }

    public final HistoryEventsDto AEQbTJ() {
        return new HistoryEventsDto("", "", this.eventTitle, this.detailsArgs, (Map) null, this.args, this.eventTime, 16, (DefaultConstructorMarker) null);
    }
}
