package com.okinc.okimcore.model.im.inhouseim.ws;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class StreamPlaceHolderMessageData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean complete;
    private final String content;
    private final Integer contentFormat;
    private final String placeholderSeq;
    private final String streamId;
    private final String subSeq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StreamPlaceHolderMessageData() {
        this((String) null, (String) null, (Integer) null, (String) null, (String) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StreamPlaceHolderMessageData copy$default(StreamPlaceHolderMessageData streamPlaceHolderMessageData, String str, String str2, Integer num, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamPlaceHolderMessageData.streamId;
        }
        if ((i & 2) != 0) {
            str2 = streamPlaceHolderMessageData.content;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            num = streamPlaceHolderMessageData.contentFormat;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = streamPlaceHolderMessageData.subSeq;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = streamPlaceHolderMessageData.placeholderSeq;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            bool = streamPlaceHolderMessageData.complete;
        }
        return streamPlaceHolderMessageData.copy(str, str5, num2, str6, str7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.streamId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.contentFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.subSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.placeholderSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.complete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StreamPlaceHolderMessageData copy(String str, String str2, Integer num, String str3, String str4, Boolean bool) {
        return new StreamPlaceHolderMessageData(str, str2, num, str3, str4, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamPlaceHolderMessageData)) {
            return false;
        }
        StreamPlaceHolderMessageData streamPlaceHolderMessageData = (StreamPlaceHolderMessageData) obj;
        return Intrinsics.EZpvd((Object) this.streamId, (Object) streamPlaceHolderMessageData.streamId) && Intrinsics.EZpvd((Object) this.content, (Object) streamPlaceHolderMessageData.content) && Intrinsics.EZpvd(this.contentFormat, streamPlaceHolderMessageData.contentFormat) && Intrinsics.EZpvd((Object) this.subSeq, (Object) streamPlaceHolderMessageData.subSeq) && Intrinsics.EZpvd((Object) this.placeholderSeq, (Object) streamPlaceHolderMessageData.placeholderSeq) && Intrinsics.EZpvd(this.complete, streamPlaceHolderMessageData.complete);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getComplete() {
        return this.complete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getContentFormat() {
        return this.contentFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceholderSeq() {
        return this.placeholderSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStreamId() {
        return this.streamId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubSeq() {
        return this.subSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.streamId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.contentFormat;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.subSeq;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.placeholderSeq;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.complete;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StreamPlaceHolderMessageData(streamId=" + this.streamId + ", content=" + this.content + ", contentFormat=" + this.contentFormat + ", subSeq=" + this.subSeq + ", placeholderSeq=" + this.placeholderSeq + ", complete=" + this.complete + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StreamPlaceHolderMessageData> serializer() {
            return StreamPlaceHolderMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StreamPlaceHolderMessageData(int i, String str, String str2, Integer num, String str3, String str4, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.streamId = null;
        } else {
            this.streamId = str;
        }
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i & 4) == 0) {
            this.contentFormat = null;
        } else {
            this.contentFormat = num;
        }
        if ((i & 8) == 0) {
            this.subSeq = null;
        } else {
            this.subSeq = str3;
        }
        if ((i & 16) == 0) {
            this.placeholderSeq = null;
        } else {
            this.placeholderSeq = str4;
        }
        if ((i & 32) == 0) {
            this.complete = null;
        } else {
            this.complete = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(StreamPlaceHolderMessageData streamPlaceHolderMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || streamPlaceHolderMessageData.streamId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, streamPlaceHolderMessageData.streamId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || streamPlaceHolderMessageData.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, streamPlaceHolderMessageData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || streamPlaceHolderMessageData.contentFormat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, streamPlaceHolderMessageData.contentFormat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || streamPlaceHolderMessageData.subSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, streamPlaceHolderMessageData.subSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || streamPlaceHolderMessageData.placeholderSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, streamPlaceHolderMessageData.placeholderSeq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && streamPlaceHolderMessageData.complete == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, streamPlaceHolderMessageData.complete);
    }

    public StreamPlaceHolderMessageData(String str, String str2, Integer num, String str3, String str4, Boolean bool) {
        this.streamId = str;
        this.content = str2;
        this.contentFormat = num;
        this.subSeq = str3;
        this.placeholderSeq = str4;
        this.complete = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.okimcore.model.im.inhouseim.ws.StreamPlaceHolderMessageData.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ StreamPlaceHolderMessageData(String str, String str2, Integer num, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool);
    }
}
