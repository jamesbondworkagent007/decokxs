package com.okinc.okex.center.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ChatbotUnreadMessageResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean hasUnread;
    private final String lastReadMsgSeq;
    private final Integer unreadCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatbotUnreadMessageResponse() {
        this((Boolean) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChatbotUnreadMessageResponse copy$default(ChatbotUnreadMessageResponse chatbotUnreadMessageResponse, Boolean bool, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = chatbotUnreadMessageResponse.hasUnread;
        }
        if ((i & 2) != 0) {
            num = chatbotUnreadMessageResponse.unreadCount;
        }
        if ((i & 4) != 0) {
            str = chatbotUnreadMessageResponse.lastReadMsgSeq;
        }
        return chatbotUnreadMessageResponse.copy(bool, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.hasUnread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.unreadCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatbotUnreadMessageResponse copy(Boolean bool, Integer num, String str) {
        return new ChatbotUnreadMessageResponse(bool, num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatbotUnreadMessageResponse)) {
            return false;
        }
        ChatbotUnreadMessageResponse chatbotUnreadMessageResponse = (ChatbotUnreadMessageResponse) obj;
        return Intrinsics.EZpvd(this.hasUnread, chatbotUnreadMessageResponse.hasUnread) && Intrinsics.EZpvd(this.unreadCount, chatbotUnreadMessageResponse.unreadCount) && Intrinsics.EZpvd((Object) this.lastReadMsgSeq, (Object) chatbotUnreadMessageResponse.lastReadMsgSeq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasUnread() {
        return this.hasUnread;
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
        Boolean bool = this.hasUnread;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Integer num = this.unreadCount;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.lastReadMsgSeq;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChatbotUnreadMessageResponse(hasUnread=" + this.hasUnread + ", unreadCount=" + this.unreadCount + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.ChatbotUnreadMessageResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatbotUnreadMessageResponse> serializer() {
            return ChatbotUnreadMessageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatbotUnreadMessageResponse(int i, Boolean bool, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.hasUnread = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.unreadCount = 0;
        } else {
            this.unreadCount = num;
        }
        if ((i & 4) == 0) {
            this.lastReadMsgSeq = "";
        } else {
            this.lastReadMsgSeq = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ChatbotUnreadMessageResponse chatbotUnreadMessageResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(chatbotUnreadMessageResponse.hasUnread, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, chatbotUnreadMessageResponse.hasUnread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num = chatbotUnreadMessageResponse.unreadCount) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, chatbotUnreadMessageResponse.unreadCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) chatbotUnreadMessageResponse.lastReadMsgSeq, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, chatbotUnreadMessageResponse.lastReadMsgSeq);
    }

    public ChatbotUnreadMessageResponse(Boolean bool, Integer num, String str) {
        this.hasUnread = bool;
        this.unreadCount = num;
        this.lastReadMsgSeq = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r1v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:96) call: com.okinc.okex.center.bean.ChatbotUnreadMessageResponse.<init>(java.lang.Boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ ChatbotUnreadMessageResponse(Boolean bool, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str);
    }
}
