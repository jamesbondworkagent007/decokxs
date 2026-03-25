package com.okinc.okimcore.model.room.inhouseim;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ConversationUnreadUpdateEntity {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String lastReadMsgSeq;
    private final Integer unreadCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationUnreadUpdateEntity() {
        this((String) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConversationUnreadUpdateEntity copy$default(ConversationUnreadUpdateEntity conversationUnreadUpdateEntity, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationUnreadUpdateEntity.channelId;
        }
        if ((i & 2) != 0) {
            str2 = conversationUnreadUpdateEntity.lastReadMsgSeq;
        }
        if ((i & 4) != 0) {
            num = conversationUnreadUpdateEntity.unreadCount;
        }
        return conversationUnreadUpdateEntity.copy(str, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationUnreadUpdateEntity copy(@NotNull String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ConversationUnreadUpdateEntity(str, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationUnreadUpdateEntity)) {
            return false;
        }
        ConversationUnreadUpdateEntity conversationUnreadUpdateEntity = (ConversationUnreadUpdateEntity) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) conversationUnreadUpdateEntity.channelId) && Intrinsics.EZpvd((Object) this.lastReadMsgSeq, (Object) conversationUnreadUpdateEntity.lastReadMsgSeq) && Intrinsics.EZpvd(this.unreadCount, conversationUnreadUpdateEntity.unreadCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastReadMsgSeq() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        String str = this.lastReadMsgSeq;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.unreadCount;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConversationUnreadUpdateEntity(channelId=" + this.channelId + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", unreadCount=" + this.unreadCount + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.ConversationUnreadUpdateEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConversationUnreadUpdateEntity> serializer() {
            return ConversationUnreadUpdateEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConversationUnreadUpdateEntity(int i, String str, String str2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.channelId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = str2;
        }
        if ((i & 4) == 0) {
            this.unreadCount = null;
        } else {
            this.unreadCount = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ConversationUnreadUpdateEntity conversationUnreadUpdateEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) conversationUnreadUpdateEntity.channelId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, conversationUnreadUpdateEntity.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || conversationUnreadUpdateEntity.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, conversationUnreadUpdateEntity.lastReadMsgSeq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && conversationUnreadUpdateEntity.unreadCount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, conversationUnreadUpdateEntity.unreadCount);
    }

    public ConversationUnreadUpdateEntity(@NotNull String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
        this.lastReadMsgSeq = str2;
        this.unreadCount = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:8) call: com.okinc.okimcore.model.room.inhouseim.ConversationUnreadUpdateEntity.<init>(java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ ConversationUnreadUpdateEntity(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
