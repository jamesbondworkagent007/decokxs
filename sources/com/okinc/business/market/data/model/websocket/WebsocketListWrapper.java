package com.okinc.business.market.data.model.websocket;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class WebsocketListWrapper<T> {
    public static final SerialDescriptor $cachedDescriptor;
    public final List<T> list;

    @SerializedName("pageNum")
    private final Integer pageNum;

    @SerializedName("pageSize")
    private final Integer pageSize;

    @SerializedName("t")
    private final Long t;

    @SerializedName("totalPage")
    private final Integer totalPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebsocketListWrapper() {
        this((List) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.data.model.websocket.WebsocketListWrapper */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebsocketListWrapper copy$default(WebsocketListWrapper websocketListWrapper, List list, Integer num, Integer num2, Long l, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = websocketListWrapper.list;
        }
        if ((i & 2) != 0) {
            num = websocketListWrapper.pageNum;
        }
        Integer num4 = num;
        if ((i & 4) != 0) {
            num2 = websocketListWrapper.pageSize;
        }
        Integer num5 = num2;
        if ((i & 8) != 0) {
            l = websocketListWrapper.t;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            num3 = websocketListWrapper.totalPage;
        }
        return websocketListWrapper.AEQbTJ(list, num4, num5, l2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebsocketListWrapper<T> AEQbTJ(List<? extends T> list, Integer num, Integer num2, Long l, Integer num3) {
        return new WebsocketListWrapper<>(list, num, num2, l, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long EZpvd() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.totalPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<T> OLrzqt() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebsocketListWrapper)) {
            return false;
        }
        WebsocketListWrapper websocketListWrapper = (WebsocketListWrapper) obj;
        return Intrinsics.EZpvd(this.list, websocketListWrapper.list) && Intrinsics.EZpvd(this.pageNum, websocketListWrapper.pageNum) && Intrinsics.EZpvd(this.pageSize, websocketListWrapper.pageSize) && Intrinsics.EZpvd(this.t, websocketListWrapper.t) && Intrinsics.EZpvd(this.totalPage, websocketListWrapper.totalPage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<T> list = this.list;
        int iHashCode = list == null ? 0 : list.hashCode();
        Integer num = this.pageNum;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.pageSize;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Long l = this.t;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Integer num3 = this.totalPage;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebsocketListWrapper(list=" + this.list + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", t=" + this.t + ", totalPage=" + this.totalPage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.websocket.WebsocketListWrapper.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> KSerializer<WebsocketListWrapper<T>> serializer(@NotNull KSerializer<T> kSerializer) {
            Intrinsics.checkNotNullParameter(kSerializer, "");
            return new WebsocketListWrapper$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.websocket.WebsocketListWrapper", null, 5);
        pluginGeneratedSerialDescriptor.addElement("list", true);
        pluginGeneratedSerialDescriptor.addElement("pageNum", true);
        pluginGeneratedSerialDescriptor.addElement("pageSize", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("totalPage", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ WebsocketListWrapper(int i, List list, Integer num, Integer num2, Long l, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        this.list = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.pageNum = null;
        } else {
            this.pageNum = num;
        }
        if ((i & 4) == 0) {
            this.pageSize = null;
        } else {
            this.pageSize = num2;
        }
        if ((i & 8) == 0) {
            this.t = null;
        } else {
            this.t = l;
        }
        if ((i & 16) == 0) {
            this.totalPage = null;
        } else {
            this.totalPage = num3;
        }
    }

    public static final /* synthetic */ void copydefault(WebsocketListWrapper websocketListWrapper, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(websocketListWrapper.list, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, new ArrayListSerializer(kSerializer), websocketListWrapper.list);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || websocketListWrapper.pageNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, websocketListWrapper.pageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || websocketListWrapper.pageSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, websocketListWrapper.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || websocketListWrapper.t != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, websocketListWrapper.t);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && websocketListWrapper.totalPage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, websocketListWrapper.totalPage);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public WebsocketListWrapper(List<? extends T> list, Integer num, Integer num2, Long l, Integer num3) {
        this.list = list;
        this.pageNum = num;
        this.pageSize = num2;
        this.t = l;
        this.totalPage = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r4v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.util.List<? extends T>, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer):void (m)] (LINE:8) call: com.okinc.business.market.data.model.websocket.WebsocketListWrapper.<init>(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Integer):void type: THIS */
    public /* synthetic */ WebsocketListWrapper(List list, Integer num, Integer num2, Long l, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l, (i & 16) == 0 ? num3 : null);
    }
}
