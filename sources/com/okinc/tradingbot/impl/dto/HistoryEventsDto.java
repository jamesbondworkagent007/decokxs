package com.okinc.tradingbot.impl.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class HistoryEventsDto {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<DetailArg> detailsArgs;
    public final String eventStatus;
    public final long eventTime;
    public final String eventTitle;
    public final String eventType;
    public final List<Message> messages;
    public final Map<String, String> requestParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryEventsDto() {
        this((String) null, (String) null, (String) null, (List) null, (Map) null, (List) null, 0L, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DetailArg> AEQbTJ() {
        return this.detailsArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> AhwBna() {
        return this.requestParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryEventsDto KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<DetailArg> list, @NotNull Map<String, String> map, @NotNull List<Message> list2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new HistoryEventsDto(str, str2, str3, list, map, list2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.eventTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryEventsDto)) {
            return false;
        }
        HistoryEventsDto historyEventsDto = (HistoryEventsDto) obj;
        return Intrinsics.EZpvd((Object) this.eventStatus, (Object) historyEventsDto.eventStatus) && Intrinsics.EZpvd((Object) this.eventType, (Object) historyEventsDto.eventType) && Intrinsics.EZpvd((Object) this.eventTitle, (Object) historyEventsDto.eventTitle) && Intrinsics.EZpvd(this.detailsArgs, historyEventsDto.detailsArgs) && Intrinsics.EZpvd(this.requestParams, historyEventsDto.requestParams) && Intrinsics.EZpvd(this.messages, historyEventsDto.messages) && this.eventTime == historyEventsDto.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.eventStatus.hashCode() * 31) + this.eventType.hashCode()) * 31) + this.eventTitle.hashCode()) * 31) + this.detailsArgs.hashCode()) * 31) + this.requestParams.hashCode()) * 31) + this.messages.hashCode()) * 31) + Long.hashCode(this.eventTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryEventsDto(eventStatus=" + this.eventStatus + ", eventType=" + this.eventType + ", eventTitle=" + this.eventTitle + ", detailsArgs=" + this.detailsArgs + ", requestParams=" + this.requestParams + ", messages=" + this.messages + ", eventTime=" + this.eventTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Message> valueOf() {
        return this.messages;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.HistoryEventsDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryEventsDto> serializer() {
            return HistoryEventsDto$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(DetailArg$$serializer.INSTANCE), new LinkedHashMapSerializer(stringSerializer, stringSerializer), new ArrayListSerializer(Message$$serializer.INSTANCE), null};
    }

    public /* synthetic */ HistoryEventsDto(int i, String str, String str2, String str3, List list, Map map, List list2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.eventStatus = "";
        } else {
            this.eventStatus = str;
        }
        if ((i & 2) == 0) {
            this.eventType = "";
        } else {
            this.eventType = str2;
        }
        if ((i & 4) == 0) {
            this.eventTitle = "";
        } else {
            this.eventTitle = str3;
        }
        if ((i & 8) == 0) {
            this.detailsArgs = yDY.AhwBna();
        } else {
            this.detailsArgs = list;
        }
        if ((i & 16) == 0) {
            this.requestParams = new LinkedHashMap();
        } else {
            this.requestParams = map;
        }
        if ((i & 32) == 0) {
            this.messages = yDY.AhwBna();
        } else {
            this.messages = list2;
        }
        if ((i & 64) == 0) {
            this.eventTime = 0L;
        } else {
            this.eventTime = j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=4] */
    public static final /* synthetic */ void AEQbTJ(HistoryEventsDto historyEventsDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) historyEventsDto.eventStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, historyEventsDto.eventStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) historyEventsDto.eventType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, historyEventsDto.eventType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) historyEventsDto.eventTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, historyEventsDto.eventTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(historyEventsDto.detailsArgs, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], historyEventsDto.detailsArgs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(historyEventsDto.requestParams, new LinkedHashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], historyEventsDto.requestParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(historyEventsDto.messages, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], historyEventsDto.messages);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && historyEventsDto.eventTime == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 6, historyEventsDto.eventTime);
    }

    public HistoryEventsDto(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<DetailArg> list, @NotNull Map<String, String> map, @NotNull List<Message> list2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.eventStatus = str;
        this.eventType = str2;
        this.eventTitle = str3;
        this.detailsArgs = list;
        this.requestParams = map;
        this.messages = list2;
        this.eventTime = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.util.List:0x001e: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r9v0 java.util.List))
  (wrap:java.util.Map:0x0028: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0025: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:12) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r10v0 java.util.Map))
  (wrap:java.util.List:0x0031: TERNARY null = ((wrap:int:0x0029: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r11v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.dto.DetailArg>, java.util.Map<java.lang.String, java.lang.String>, java.util.List<com.okinc.tradingbot.impl.dto.Message>, long):void (m)] (LINE:7) call: com.okinc.tradingbot.impl.dto.HistoryEventsDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.util.List, long):void type: THIS */
    public /* synthetic */ HistoryEventsDto(String str, String str2, String str3, List list, Map map, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? new LinkedHashMap() : map, (i & 32) != 0 ? yDY.AhwBna() : list2, (i & 64) != 0 ? 0L : j);
    }
}
