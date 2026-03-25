package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSPushIndicator {
    public final String channelId;
    public final List<WSSendMessageDetailData> messageList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(WSSendMessageDetailData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WSPushIndicator() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.WSPushIndicator */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WSPushIndicator copy$default(WSPushIndicator wSPushIndicator, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSPushIndicator.channelId;
        }
        if ((i & 2) != 0) {
            list = wSPushIndicator.messageList;
        }
        return wSPushIndicator.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WSSendMessageDetailData> KWHzl() {
        return this.messageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSPushIndicator copydefault(String str, @NotNull List<WSSendMessageDetailData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WSPushIndicator(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSPushIndicator)) {
            return false;
        }
        WSPushIndicator wSPushIndicator = (WSPushIndicator) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) wSPushIndicator.channelId) && Intrinsics.EZpvd(this.messageList, wSPushIndicator.messageList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.channelId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.messageList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSPushIndicator(channelId=" + this.channelId + ", messageList=" + this.messageList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSPushIndicator.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSPushIndicator> serializer() {
            return WSPushIndicator$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSPushIndicator(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.channelId = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.messageList = yDY.AhwBna();
        } else {
            this.messageList = list;
        }
    }

    public static final /* synthetic */ void KWHzl(WSPushIndicator wSPushIndicator, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || wSPushIndicator.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, wSPushIndicator.channelId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(wSPushIndicator.messageList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], wSPushIndicator.messageList);
    }

    public WSPushIndicator(String str, @NotNull List<WSSendMessageDetailData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.channelId = str;
        this.messageList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData>):void (m)] (LINE:15) call: com.okinc.okimcore.model.im.inhouseim.ws.WSPushIndicator.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WSPushIndicator(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
