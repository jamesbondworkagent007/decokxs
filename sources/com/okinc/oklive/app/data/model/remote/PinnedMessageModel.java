package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PinnedMessageModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName(RemoteMessageConst.Notification.CHANNEL_ID)
    private final String channelId;

    @SerializedName("contentType")
    private final Integer contentType;

    @SerializedName("senderName")
    private final SenderName senderName;

    @SerializedName("seq")
    private final String seq;

    @SerializedName("textMessage")
    private final TextMessage textMessage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PinnedMessageModel() {
        this((String) null, (String) null, (Integer) null, (TextMessage) null, (SenderName) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PinnedMessageModel copy$default(PinnedMessageModel pinnedMessageModel, String str, String str2, Integer num, TextMessage textMessage, SenderName senderName, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinnedMessageModel.seq;
        }
        if ((i & 2) != 0) {
            str2 = pinnedMessageModel.channelId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = pinnedMessageModel.contentType;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            textMessage = pinnedMessageModel.textMessage;
        }
        TextMessage textMessage2 = textMessage;
        if ((i & 16) != 0) {
            senderName = pinnedMessageModel.senderName;
        }
        return pinnedMessageModel.copy(str, str3, num2, textMessage2, senderName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextMessage component4() {
        return this.textMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SenderName component5() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PinnedMessageModel copy(String str, String str2, Integer num, TextMessage textMessage, SenderName senderName) {
        return new PinnedMessageModel(str, str2, num, textMessage, senderName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinnedMessageModel)) {
            return false;
        }
        PinnedMessageModel pinnedMessageModel = (PinnedMessageModel) obj;
        return Intrinsics.EZpvd((Object) this.seq, (Object) pinnedMessageModel.seq) && Intrinsics.EZpvd((Object) this.channelId, (Object) pinnedMessageModel.channelId) && Intrinsics.EZpvd(this.contentType, pinnedMessageModel.contentType) && Intrinsics.EZpvd(this.textMessage, pinnedMessageModel.textMessage) && Intrinsics.EZpvd(this.senderName, pinnedMessageModel.senderName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SenderName getSenderName() {
        return this.senderName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextMessage getTextMessage() {
        return this.textMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.seq;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.channelId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.contentType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        TextMessage textMessage = this.textMessage;
        int iHashCode4 = textMessage == null ? 0 : textMessage.hashCode();
        SenderName senderName = this.senderName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (senderName != null ? senderName.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PinnedMessageModel(seq=" + this.seq + ", channelId=" + this.channelId + ", contentType=" + this.contentType + ", textMessage=" + this.textMessage + ", senderName=" + this.senderName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.data.model.remote.PinnedMessageModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PinnedMessageModel> serializer() {
            return PinnedMessageModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PinnedMessageModel(int i, String str, String str2, Integer num, TextMessage textMessage, SenderName senderName, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.seq = null;
        } else {
            this.seq = str;
        }
        if ((i & 2) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
        }
        if ((i & 4) == 0) {
            this.contentType = null;
        } else {
            this.contentType = num;
        }
        if ((i & 8) == 0) {
            this.textMessage = null;
        } else {
            this.textMessage = textMessage;
        }
        if ((i & 16) == 0) {
            this.senderName = null;
        } else {
            this.senderName = senderName;
        }
    }

    public static final /* synthetic */ void write$Self$OKLive_oklive_impl(PinnedMessageModel pinnedMessageModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pinnedMessageModel.seq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, pinnedMessageModel.seq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pinnedMessageModel.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pinnedMessageModel.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || pinnedMessageModel.contentType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, pinnedMessageModel.contentType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || pinnedMessageModel.textMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, PinnedMessageModel$TextMessage$$serializer.INSTANCE, pinnedMessageModel.textMessage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && pinnedMessageModel.senderName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, PinnedMessageModel$SenderName$$serializer.INSTANCE, pinnedMessageModel.senderName);
    }

    public PinnedMessageModel(String str, String str2, Integer num, TextMessage textMessage, SenderName senderName) {
        this.seq = str;
        this.channelId = str2;
        this.contentType = num;
        this.textMessage = textMessage;
        this.senderName = senderName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:com.okinc.oklive.app.data.model.remote.PinnedMessageModel$TextMessage:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.PinnedMessageModel$TextMessage) : (r8v0 com.okinc.oklive.app.data.model.remote.PinnedMessageModel$TextMessage))
  (wrap:com.okinc.oklive.app.data.model.remote.PinnedMessageModel$SenderName:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.PinnedMessageModel$SenderName) : (r9v0 com.okinc.oklive.app.data.model.remote.PinnedMessageModel$SenderName))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, com.okinc.oklive.app.data.model.remote.PinnedMessageModel$TextMessage, com.okinc.oklive.app.data.model.remote.PinnedMessageModel$SenderName):void (m)] (LINE:9) call: com.okinc.oklive.app.data.model.remote.PinnedMessageModel.<init>(java.lang.String, java.lang.String, java.lang.Integer, com.okinc.oklive.app.data.model.remote.PinnedMessageModel$TextMessage, com.okinc.oklive.app.data.model.remote.PinnedMessageModel$SenderName):void type: THIS */
    public /* synthetic */ PinnedMessageModel(String str, String str2, Integer num, TextMessage textMessage, SenderName senderName, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : textMessage, (i & 16) != 0 ? null : senderName);
    }

    @Serializable
    public static final class TextMessage {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        @SerializedName("text")
        private final String text;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TextMessage() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TextMessage copy$default(TextMessage textMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textMessage.text;
            }
            return textMessage.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextMessage copy(String str) {
            return new TextMessage(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextMessage) && Intrinsics.EZpvd((Object) this.text, (Object) ((TextMessage) obj).text);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.text;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TextMessage(text=" + this.text + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.data.model.remote.PinnedMessageModel.TextMessage.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TextMessage> serializer() {
                return PinnedMessageModel$TextMessage$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TextMessage(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.text = null;
            } else {
                this.text = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKLive_oklive_impl(TextMessage textMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && textMessage.text == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, textMessage.text);
        }

        public TextMessage(String str) {
            this.text = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:28) call: com.okinc.oklive.app.data.model.remote.PinnedMessageModel.TextMessage.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ TextMessage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Serializable
    public static final class SenderName {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        @SerializedName("nickname")
        private final String nickname;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SenderName() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SenderName copy$default(SenderName senderName, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = senderName.nickname;
            }
            return senderName.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SenderName copy(String str) {
            return new SenderName(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SenderName) && Intrinsics.EZpvd((Object) this.nickname, (Object) ((SenderName) obj).nickname);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNickname() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.nickname;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SenderName(nickname=" + this.nickname + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.data.model.remote.PinnedMessageModel.SenderName.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SenderName> serializer() {
                return PinnedMessageModel$SenderName$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SenderName(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKLive_oklive_impl(SenderName senderName, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && senderName.nickname == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, senderName.nickname);
        }

        public SenderName(String str) {
            this.nickname = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:35) call: com.okinc.oklive.app.data.model.remote.PinnedMessageModel.SenderName.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SenderName(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
