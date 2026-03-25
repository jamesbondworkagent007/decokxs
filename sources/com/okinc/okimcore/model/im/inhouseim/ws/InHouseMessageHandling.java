package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.sPZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseMessageHandling {
    private final int priority;
    private final long referenceSeq;
    private final WSSendMessageDetailData replaceMessage;
    private final MessageHandlingType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new sPZ(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseMessageHandling copy$default(InHouseMessageHandling inHouseMessageHandling, MessageHandlingType messageHandlingType, long j, int i, WSSendMessageDetailData wSSendMessageDetailData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            messageHandlingType = inHouseMessageHandling.type;
        }
        if ((i2 & 2) != 0) {
            j = inHouseMessageHandling.referenceSeq;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i = inHouseMessageHandling.priority;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            wSSendMessageDetailData = inHouseMessageHandling.replaceMessage;
        }
        return inHouseMessageHandling.copy(messageHandlingType, j2, i3, wSSendMessageDetailData);
    }

    @Serializable(with = sPZ.class)
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageHandlingType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.referenceSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData component4() {
        return this.replaceMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseMessageHandling copy(@NotNull MessageHandlingType messageHandlingType, long j, int i, WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(messageHandlingType, "");
        return new InHouseMessageHandling(messageHandlingType, j, i, wSSendMessageDetailData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseMessageHandling)) {
            return false;
        }
        InHouseMessageHandling inHouseMessageHandling = (InHouseMessageHandling) obj;
        return this.type == inHouseMessageHandling.type && this.referenceSeq == inHouseMessageHandling.referenceSeq && this.priority == inHouseMessageHandling.priority && Intrinsics.EZpvd(this.replaceMessage, inHouseMessageHandling.replaceMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReferenceSeq() {
        return this.referenceSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSSendMessageDetailData getReplaceMessage() {
        return this.replaceMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageHandlingType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = Long.hashCode(this.referenceSeq);
        int iHashCode3 = Integer.hashCode(this.priority);
        WSSendMessageDetailData wSSendMessageDetailData = this.replaceMessage;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (wSSendMessageDetailData == null ? 0 : wSSendMessageDetailData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseMessageHandling(type=" + this.type + ", referenceSeq=" + this.referenceSeq + ", priority=" + this.priority + ", replaceMessage=" + this.replaceMessage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseMessageHandling.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseMessageHandling> serializer() {
            return InHouseMessageHandling$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseMessageHandling(int i, MessageHandlingType messageHandlingType, long j, int i2, WSSendMessageDetailData wSSendMessageDetailData, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InHouseMessageHandling$$serializer.INSTANCE.getDescriptor());
        }
        this.type = messageHandlingType;
        this.referenceSeq = j;
        this.priority = i2;
        if ((i & 8) == 0) {
            this.replaceMessage = null;
        } else {
            this.replaceMessage = wSSendMessageDetailData;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseMessageHandling inHouseMessageHandling, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], inHouseMessageHandling.type);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, inHouseMessageHandling.referenceSeq);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, inHouseMessageHandling.priority);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && inHouseMessageHandling.replaceMessage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, WSSendMessageDetailData$$serializer.INSTANCE, inHouseMessageHandling.replaceMessage);
    }

    public InHouseMessageHandling(@NotNull MessageHandlingType messageHandlingType, long j, int i, WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(messageHandlingType, "");
        this.type = messageHandlingType;
        this.referenceSeq = j;
        this.priority = i;
        this.replaceMessage = wSSendMessageDetailData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r7v0 com.okinc.okimcore.model.im.inhouseim.ws.MessageHandlingType)
  (r8v0 long)
  (r10v0 int)
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData) : (r11v0 com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData))
 A[MD:(com.okinc.okimcore.model.im.inhouseim.ws.MessageHandlingType, long, int, com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData):void (m)] (LINE:9) call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseMessageHandling.<init>(com.okinc.okimcore.model.im.inhouseim.ws.MessageHandlingType, long, int, com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData):void type: THIS */
    public /* synthetic */ InHouseMessageHandling(MessageHandlingType messageHandlingType, long j, int i, WSSendMessageDetailData wSSendMessageDetailData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageHandlingType, j, i, (i2 & 8) != 0 ? null : wSSendMessageDetailData);
    }
}
