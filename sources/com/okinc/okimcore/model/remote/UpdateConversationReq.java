package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UpdateConversationReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final Integer isFlagged;
    private final Integer lastReadMsgSeq;
    private final Integer lastReceivedMsgSeq;
    private final Integer pinnedStatus;
    private final Integer receiveMsgOption;
    private final Integer status;
    private final Integer unreadCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.receiveMsgOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.lastReceivedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateConversationReq copy(@NotNull String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UpdateConversationReq(str, num, num2, num3, num4, num5, num6, num7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateConversationReq)) {
            return false;
        }
        UpdateConversationReq updateConversationReq = (UpdateConversationReq) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) updateConversationReq.channelId) && Intrinsics.EZpvd(this.pinnedStatus, updateConversationReq.pinnedStatus) && Intrinsics.EZpvd(this.isFlagged, updateConversationReq.isFlagged) && Intrinsics.EZpvd(this.receiveMsgOption, updateConversationReq.receiveMsgOption) && Intrinsics.EZpvd(this.unreadCount, updateConversationReq.unreadCount) && Intrinsics.EZpvd(this.lastReceivedMsgSeq, updateConversationReq.lastReceivedMsgSeq) && Intrinsics.EZpvd(this.lastReadMsgSeq, updateConversationReq.lastReadMsgSeq) && Intrinsics.EZpvd(this.status, updateConversationReq.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLastReadMsgSeq() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLastReceivedMsgSeq() {
        return this.lastReceivedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPinnedStatus() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getReceiveMsgOption() {
        return this.receiveMsgOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        Integer num = this.pinnedStatus;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.isFlagged;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.receiveMsgOption;
        int iHashCode4 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.unreadCount;
        int iHashCode5 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.lastReceivedMsgSeq;
        int iHashCode6 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.lastReadMsgSeq;
        int iHashCode7 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.status;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num7 != null ? num7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isFlagged() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateConversationReq(channelId=" + this.channelId + ", pinnedStatus=" + this.pinnedStatus + ", isFlagged=" + this.isFlagged + ", receiveMsgOption=" + this.receiveMsgOption + ", unreadCount=" + this.unreadCount + ", lastReceivedMsgSeq=" + this.lastReceivedMsgSeq + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UpdateConversationReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateConversationReq> serializer() {
            return UpdateConversationReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateConversationReq(int i, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UpdateConversationReq$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        if ((i & 2) == 0) {
            this.pinnedStatus = null;
        } else {
            this.pinnedStatus = num;
        }
        if ((i & 4) == 0) {
            this.isFlagged = null;
        } else {
            this.isFlagged = num2;
        }
        if ((i & 8) == 0) {
            this.receiveMsgOption = null;
        } else {
            this.receiveMsgOption = num3;
        }
        if ((i & 16) == 0) {
            this.unreadCount = null;
        } else {
            this.unreadCount = num4;
        }
        if ((i & 32) == 0) {
            this.lastReceivedMsgSeq = null;
        } else {
            this.lastReceivedMsgSeq = num5;
        }
        if ((i & 64) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = num6;
        }
        if ((i & 128) == 0) {
            this.status = null;
        } else {
            this.status = num7;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UpdateConversationReq updateConversationReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, updateConversationReq.channelId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || updateConversationReq.pinnedStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, updateConversationReq.pinnedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || updateConversationReq.isFlagged != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, updateConversationReq.isFlagged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || updateConversationReq.receiveMsgOption != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, updateConversationReq.receiveMsgOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || updateConversationReq.unreadCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, updateConversationReq.unreadCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || updateConversationReq.lastReceivedMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, updateConversationReq.lastReceivedMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || updateConversationReq.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, updateConversationReq.lastReadMsgSeq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && updateConversationReq.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, updateConversationReq.status);
    }

    public UpdateConversationReq(@NotNull String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.pinnedStatus = num;
        this.isFlagged = num2;
        this.receiveMsgOption = num3;
        this.unreadCount = num4;
        this.lastReceivedMsgSeq = num5;
        this.lastReadMsgSeq = num6;
        this.status = num7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.okimcore.model.remote.UpdateConversationReq.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ UpdateConversationReq(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) == 0 ? num7 : null);
    }
}
