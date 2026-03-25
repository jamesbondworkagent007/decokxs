package com.okinc.kline.features.kline.bottom.marketevents.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class MarketEventPushPo {
    private final List<EventItem> data;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(MarketEventPushPo$EventItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventPushPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketEventPushPo copy$default(MarketEventPushPo marketEventPushPo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketEventPushPo.data;
        }
        return marketEventPushPo.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EventItem> component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketEventPushPo copy(@NotNull List<EventItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new MarketEventPushPo(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketEventPushPo) && Intrinsics.EZpvd(this.data, ((MarketEventPushPo) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EventItem> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketEventPushPo(data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventPushPo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketEventPushPo> serializer() {
            return MarketEventPushPo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketEventPushPo(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MarketEventPushPo$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
    }

    public MarketEventPushPo(@NotNull List<EventItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    @Serializable
    public static final class EventItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String ts;
        public final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public EventItem() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EventItem copy$default(EventItem eventItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eventItem.type;
            }
            if ((i & 2) != 0) {
                str2 = eventItem.ts;
            }
            return eventItem.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EventItem EZpvd(String str, String str2) {
            return new EventItem(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventItem)) {
                return false;
            }
            EventItem eventItem = (EventItem) obj;
            return Intrinsics.EZpvd((Object) this.type, (Object) eventItem.type) && Intrinsics.EZpvd((Object) this.ts, (Object) eventItem.ts);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.type;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.ts;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EventItem(type=" + this.type + ", ts=" + this.ts + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventPushPo.EventItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<EventItem> serializer() {
                return MarketEventPushPo$EventItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ EventItem(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.type = null;
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.ts = null;
            } else {
                this.ts = str2;
            }
        }

        public static final /* synthetic */ void AEQbTJ(EventItem eventItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eventItem.type != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, eventItem.type);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && eventItem.ts == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eventItem.ts);
        }

        public EventItem(String str, String str2) {
            this.type = str;
            this.ts = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventPushPo.EventItem.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ EventItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
