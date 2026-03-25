package com.okinc.im.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class H5XBotMessageBean {
    private String channel;
    private String chat_id;
    private String env;
    private String language;
    private String lastMsg;
    private Long lastMsgTime;
    private String nick;
    private Integer source;
    private Long ticket_id;
    private Integer typeSuffix;
    private String uuid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public H5XBotMessageBean() {
        this((String) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Long) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lastMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.ticket_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.lastMsgTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.env;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.typeSuffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chat_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final H5XBotMessageBean copy(String str, Long l, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Long l2) {
        return new H5XBotMessageBean(str, l, num, str2, str3, str4, num2, str5, str6, str7, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5XBotMessageBean)) {
            return false;
        }
        H5XBotMessageBean h5XBotMessageBean = (H5XBotMessageBean) obj;
        return Intrinsics.EZpvd((Object) this.lastMsg, (Object) h5XBotMessageBean.lastMsg) && Intrinsics.EZpvd(this.lastMsgTime, h5XBotMessageBean.lastMsgTime) && Intrinsics.EZpvd(this.source, h5XBotMessageBean.source) && Intrinsics.EZpvd((Object) this.uuid, (Object) h5XBotMessageBean.uuid) && Intrinsics.EZpvd((Object) this.language, (Object) h5XBotMessageBean.language) && Intrinsics.EZpvd((Object) this.env, (Object) h5XBotMessageBean.env) && Intrinsics.EZpvd(this.typeSuffix, h5XBotMessageBean.typeSuffix) && Intrinsics.EZpvd((Object) this.channel, (Object) h5XBotMessageBean.channel) && Intrinsics.EZpvd((Object) this.chat_id, (Object) h5XBotMessageBean.chat_id) && Intrinsics.EZpvd((Object) this.nick, (Object) h5XBotMessageBean.nick) && Intrinsics.EZpvd(this.ticket_id, h5XBotMessageBean.ticket_id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChat_id() {
        return this.chat_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnv() {
        return this.env;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastMsg() {
        return this.lastMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLastMsgTime() {
        return this.lastMsgTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNick() {
        return this.nick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTicket_id() {
        return this.ticket_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTypeSuffix() {
        return this.typeSuffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.lastMsg;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.lastMsgTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Integer num = this.source;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.uuid;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.language;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.env;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.typeSuffix;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.channel;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.chat_id;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nick;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        Long l2 = this.ticket_id;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannel(String str) {
        this.channel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChat_id(String str) {
        this.chat_id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnv(String str) {
        this.env = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLanguage(String str) {
        this.language = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastMsg(String str) {
        this.lastMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastMsgTime(Long l) {
        this.lastMsgTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNick(String str) {
        this.nick = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(Integer num) {
        this.source = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTicket_id(Long l) {
        this.ticket_id = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTypeSuffix(Integer num) {
        this.typeSuffix = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUuid(String str) {
        this.uuid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "H5XBotMessageBean(lastMsg=" + this.lastMsg + ", lastMsgTime=" + this.lastMsgTime + ", source=" + this.source + ", uuid=" + this.uuid + ", language=" + this.language + ", env=" + this.env + ", typeSuffix=" + this.typeSuffix + ", channel=" + this.channel + ", chat_id=" + this.chat_id + ", nick=" + this.nick + ", ticket_id=" + this.ticket_id + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.H5XBotMessageBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<H5XBotMessageBean> serializer() {
            return H5XBotMessageBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ H5XBotMessageBean(int i, String str, Long l, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lastMsg = null;
        } else {
            this.lastMsg = str;
        }
        if ((i & 2) == 0) {
            this.lastMsgTime = null;
        } else {
            this.lastMsgTime = l;
        }
        if ((i & 4) == 0) {
            this.source = null;
        } else {
            this.source = num;
        }
        if ((i & 8) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str2;
        }
        if ((i & 16) == 0) {
            this.language = null;
        } else {
            this.language = str3;
        }
        if ((i & 32) == 0) {
            this.env = null;
        } else {
            this.env = str4;
        }
        if ((i & 64) == 0) {
            this.typeSuffix = null;
        } else {
            this.typeSuffix = num2;
        }
        if ((i & 128) == 0) {
            this.channel = null;
        } else {
            this.channel = str5;
        }
        if ((i & 256) == 0) {
            this.chat_id = null;
        } else {
            this.chat_id = str6;
        }
        if ((i & 512) == 0) {
            this.nick = null;
        } else {
            this.nick = str7;
        }
        if ((i & 1024) == 0) {
            this.ticket_id = null;
        } else {
            this.ticket_id = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(H5XBotMessageBean h5XBotMessageBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || h5XBotMessageBean.lastMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, h5XBotMessageBean.lastMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || h5XBotMessageBean.lastMsgTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, h5XBotMessageBean.lastMsgTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || h5XBotMessageBean.source != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, h5XBotMessageBean.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || h5XBotMessageBean.uuid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, h5XBotMessageBean.uuid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || h5XBotMessageBean.language != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, h5XBotMessageBean.language);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || h5XBotMessageBean.env != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, h5XBotMessageBean.env);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || h5XBotMessageBean.typeSuffix != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, h5XBotMessageBean.typeSuffix);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || h5XBotMessageBean.channel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, h5XBotMessageBean.channel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || h5XBotMessageBean.chat_id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, h5XBotMessageBean.chat_id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || h5XBotMessageBean.nick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, h5XBotMessageBean.nick);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && h5XBotMessageBean.ticket_id == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, h5XBotMessageBean.ticket_id);
    }

    public H5XBotMessageBean(String str, Long l, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Long l2) {
        this.lastMsg = str;
        this.lastMsgTime = l;
        this.source = num;
        this.uuid = str2;
        this.language = str3;
        this.env = str4;
        this.typeSuffix = num2;
        this.channel = str5;
        this.chat_id = str6;
        this.nick = str7;
        this.ticket_id = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.Long) : (null java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:11) call: com.okinc.im.bean.H5XBotMessageBean.<init>(java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ H5XBotMessageBean(String str, Long l, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) == 0 ? l2 : null);
    }
}
