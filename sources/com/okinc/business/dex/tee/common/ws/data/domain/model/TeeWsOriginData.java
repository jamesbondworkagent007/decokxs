package com.okinc.business.dex.tee.common.ws.data.domain.model;

import com.okinc.mln_ui.ui.okkit.UdToast;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C31200lpY;
import o.C43284rmQ;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TeeWsOriginData {
    private final long chainId;
    private final JsonObject data;
    private final int eventType;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final int component1() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeWsOriginData copy$default(TeeWsOriginData teeWsOriginData, int i, long j, String str, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teeWsOriginData.eventType;
        }
        if ((i2 & 2) != 0) {
            j = teeWsOriginData.chainId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = teeWsOriginData.userWalletAddress;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            jsonObject = teeWsOriginData.data;
        }
        return teeWsOriginData.copy(i, j2, str2, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeWsOriginData copy(int i, long j, @NotNull String str, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TeeWsOriginData(i, j, str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeWsOriginData)) {
            return false;
        }
        TeeWsOriginData teeWsOriginData = (TeeWsOriginData) obj;
        return this.eventType == teeWsOriginData.eventType && this.chainId == teeWsOriginData.chainId && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) teeWsOriginData.userWalletAddress) && Intrinsics.EZpvd(this.data, teeWsOriginData.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.eventType);
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = this.userWalletAddress.hashCode();
        JsonObject jsonObject = this.data;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeWsOriginData(eventType=" + this.eventType + ", chainId=" + this.chainId + ", userWalletAddress=" + this.userWalletAddress + ", data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeWsOriginData> serializer() {
            return TeeWsOriginData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeWsOriginData(int i, int i2, long j, String str, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TeeWsOriginData$$serializer.INSTANCE.getDescriptor());
        }
        this.eventType = i2;
        this.chainId = j;
        this.userWalletAddress = str;
        this.data = jsonObject;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeWsOriginData teeWsOriginData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, teeWsOriginData.eventType);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, teeWsOriginData.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, teeWsOriginData.userWalletAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, JsonObjectSerializer.INSTANCE, teeWsOriginData.data);
    }

    public TeeWsOriginData(int i, long j, @NotNull String str, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventType = i;
        this.chainId = j;
        this.userWalletAddress = str;
        this.data = jsonObject;
    }

    public final EventType getType() {
        return EventType.Companion.AEQbTJ(this.eventType);
    }

    public final TeeWsData getTeeWsData() {
        JsonObject jsonObject = this.data;
        if (jsonObject != null) {
            return (TeeWsData) C43284rmQ.KWHzl().decodeFromJsonElement(TeeWsData.Companion.serializer(), jsonObject);
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EventType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final Activity Companion;
        private final int type;
        public static final EventType OpenOrderStatusChanged = new EventType("OpenOrderStatusChanged", 0, 0);
        public static final EventType StrategyOrderStatusChanged = new EventType("StrategyOrderStatusChanged", 1, 1);
        public static final EventType PnlUpdated = new EventType("PnlUpdated", 2, 2);
        public static final EventType Toast = new EventType(UdToast.LUA_CLASS_NAME, 3, 3);
        public static final EventType OpenOrderCreated = new EventType("OpenOrderCreated", 4, 4);
        public static final EventType StrategyCreateUpdate = new EventType("StrategyCreateUpdate", 5, 5);
        public static final EventType StrategyTrigger = new EventType("StrategyTrigger", 6, 6);
        public static final EventType PositionUpdate = new EventType("PositionUpdate", 7, 7);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{OpenOrderStatusChanged, StrategyOrderStatusChanged, PnlUpdated, Toast, OpenOrderCreated, StrategyCreateUpdate, StrategyTrigger, PositionUpdate};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EventType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        private EventType(String str, int i, int i2) {
            this.type = i2;
        }

        static {
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(eventTypeArr$values);
            Companion = new Activity(null);
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData.EventType.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public final EventType AEQbTJ(int i) {
                EventType next;
                Iterator<EventType> it = EventType.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.getType() == i) {
                        break;
                    }
                }
                EventType eventType = next;
                if (eventType != null) {
                    return eventType;
                }
                return (EventType) C31200lpY.copydefault(EventType.OpenOrderStatusChanged, "unsupported eventType=" + i);
            }
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }
}
