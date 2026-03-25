package com.okinc.okimcore.model.room.inhouseim;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMConversationSimpleInfoEntity {
    public static final int $stable = 0;
    private final String channelId;
    private final String endMsgSeq;
    private final InGroupStatus inGroupStatus;
    private final int isFlagged;
    private final String lastMsgTime;
    private final String lastReadMsgSeq;
    private final int pinnedStatus;
    private final String startMsgSeq;
    private final String updateTime;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, InGroupStatus.Companion.serializer(), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMConversationSimpleInfoEntity() {
        this((String) null, (String) null, 0, 0, (InGroupStatus) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lastMsgTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InGroupStatus component5() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.endMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMConversationSimpleInfoEntity copy(@NotNull String str, @NotNull String str2, int i, int i2, InGroupStatus inGroupStatus, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InHouseIMConversationSimpleInfoEntity(str, str2, i, i2, inGroupStatus, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMConversationSimpleInfoEntity)) {
            return false;
        }
        InHouseIMConversationSimpleInfoEntity inHouseIMConversationSimpleInfoEntity = (InHouseIMConversationSimpleInfoEntity) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMConversationSimpleInfoEntity.channelId) && Intrinsics.EZpvd((Object) this.lastMsgTime, (Object) inHouseIMConversationSimpleInfoEntity.lastMsgTime) && this.pinnedStatus == inHouseIMConversationSimpleInfoEntity.pinnedStatus && this.isFlagged == inHouseIMConversationSimpleInfoEntity.isFlagged && this.inGroupStatus == inHouseIMConversationSimpleInfoEntity.inGroupStatus && Intrinsics.EZpvd((Object) this.lastReadMsgSeq, (Object) inHouseIMConversationSimpleInfoEntity.lastReadMsgSeq) && Intrinsics.EZpvd((Object) this.startMsgSeq, (Object) inHouseIMConversationSimpleInfoEntity.startMsgSeq) && Intrinsics.EZpvd((Object) this.endMsgSeq, (Object) inHouseIMConversationSimpleInfoEntity.endMsgSeq) && Intrinsics.EZpvd((Object) this.updateTime, (Object) inHouseIMConversationSimpleInfoEntity.updateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndMsgSeq() {
        return this.endMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InGroupStatus getInGroupStatus() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastMsgTime() {
        return this.lastMsgTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastReadMsgSeq() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPinnedStatus() {
        return this.pinnedStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartMsgSeq() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        int iHashCode2 = this.lastMsgTime.hashCode();
        int iHashCode3 = Integer.hashCode(this.pinnedStatus);
        int iHashCode4 = Integer.hashCode(this.isFlagged);
        InGroupStatus inGroupStatus = this.inGroupStatus;
        int iHashCode5 = inGroupStatus == null ? 0 : inGroupStatus.hashCode();
        String str = this.lastReadMsgSeq;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.startMsgSeq;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.endMsgSeq;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.updateTime;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isFlagged() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMConversationSimpleInfoEntity(channelId=" + this.channelId + ", lastMsgTime=" + this.lastMsgTime + ", pinnedStatus=" + this.pinnedStatus + ", isFlagged=" + this.isFlagged + ", inGroupStatus=" + this.inGroupStatus + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", startMsgSeq=" + this.startMsgSeq + ", endMsgSeq=" + this.endMsgSeq + ", updateTime=" + this.updateTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMConversationSimpleInfoEntity> serializer() {
            return InHouseIMConversationSimpleInfoEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMConversationSimpleInfoEntity(int i, String str, String str2, int i2, int i3, InGroupStatus inGroupStatus, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.channelId = "";
        } else {
            this.channelId = str;
        }
        if ((i & 2) == 0) {
            this.lastMsgTime = "";
        } else {
            this.lastMsgTime = str2;
        }
        if ((i & 4) == 0) {
            this.pinnedStatus = 0;
        } else {
            this.pinnedStatus = i2;
        }
        if ((i & 8) == 0) {
            this.isFlagged = 0;
        } else {
            this.isFlagged = i3;
        }
        if ((i & 16) == 0) {
            this.inGroupStatus = null;
        } else {
            this.inGroupStatus = inGroupStatus;
        }
        if ((i & 32) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = str3;
        }
        if ((i & 64) == 0) {
            this.startMsgSeq = null;
        } else {
            this.startMsgSeq = str4;
        }
        if ((i & 128) == 0) {
            this.endMsgSeq = null;
        } else {
            this.endMsgSeq = str5;
        }
        if ((i & 256) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMConversationSimpleInfoEntity inHouseIMConversationSimpleInfoEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inHouseIMConversationSimpleInfoEntity.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, inHouseIMConversationSimpleInfoEntity.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inHouseIMConversationSimpleInfoEntity.lastMsgTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, inHouseIMConversationSimpleInfoEntity.lastMsgTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMConversationSimpleInfoEntity.pinnedStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, inHouseIMConversationSimpleInfoEntity.pinnedStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMConversationSimpleInfoEntity.isFlagged != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, inHouseIMConversationSimpleInfoEntity.isFlagged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMConversationSimpleInfoEntity.inGroupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], inHouseIMConversationSimpleInfoEntity.inGroupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMConversationSimpleInfoEntity.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, inHouseIMConversationSimpleInfoEntity.lastReadMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMConversationSimpleInfoEntity.startMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, inHouseIMConversationSimpleInfoEntity.startMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMConversationSimpleInfoEntity.endMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, inHouseIMConversationSimpleInfoEntity.endMsgSeq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && inHouseIMConversationSimpleInfoEntity.updateTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, inHouseIMConversationSimpleInfoEntity.updateTime);
    }

    public InHouseIMConversationSimpleInfoEntity(@NotNull String str, @NotNull String str2, int i, int i2, InGroupStatus inGroupStatus, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelId = str;
        this.lastMsgTime = str2;
        this.pinnedStatus = i;
        this.isFlagged = i2;
        this.inGroupStatus = inGroupStatus;
        this.lastReadMsgSeq = str3;
        this.startMsgSeq = str4;
        this.endMsgSeq = str5;
        this.updateTime = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r14v0 int) : (0 int))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus) : (r15v0 com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, int, com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity.<init>(java.lang.String, java.lang.String, int, int, com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InHouseIMConversationSimpleInfoEntity(String str, String str2, int i, int i2, InGroupStatus inGroupStatus, String str3, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? null : inGroupStatus, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) == 0 ? str6 : null);
    }
}
