package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TextMessageData {
    public static final KSerializer<Object>[] $childSerializers;
    public final Integer atType;
    public final List<InhouseIMAtUser> atUserList;
    public final List<String> longTextList;
    public String quotedMsgSeq;
    public final SiteMeta siteMeta;
    public final String text;
    public final List<String> urlList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TextMessageData() {
        this((Integer) null, (List) null, (String) null, (List) null, (String) null, (List) null, (SiteMeta) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextMessageData copy$default(TextMessageData textMessageData, Integer num, List list, String str, List list2, String str2, List list3, SiteMeta siteMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            num = textMessageData.atType;
        }
        if ((i & 2) != 0) {
            list = textMessageData.atUserList;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            str = textMessageData.text;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            list2 = textMessageData.longTextList;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            str2 = textMessageData.quotedMsgSeq;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            list3 = textMessageData.urlList;
        }
        List list6 = list3;
        if ((i & 64) != 0) {
            siteMeta = textMessageData.siteMeta;
        }
        return textMessageData.KWHzl(num, list4, str3, list5, str4, list6, siteMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InhouseIMAtUser> AEQbTJ() {
        return this.atUserList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AYXKKw() {
        return this.urlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.atType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextMessageData KWHzl(Integer num, List<InhouseIMAtUser> list, String str, List<String> list2, String str2, List<String> list3, SiteMeta siteMeta) {
        return new TextMessageData(num, list, str, list2, str2, list3, siteMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SiteMeta OLrzqt() {
        return this.siteMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMessageData)) {
            return false;
        }
        TextMessageData textMessageData = (TextMessageData) obj;
        return Intrinsics.EZpvd(this.atType, textMessageData.atType) && Intrinsics.EZpvd(this.atUserList, textMessageData.atUserList) && Intrinsics.EZpvd((Object) this.text, (Object) textMessageData.text) && Intrinsics.EZpvd(this.longTextList, textMessageData.longTextList) && Intrinsics.EZpvd((Object) this.quotedMsgSeq, (Object) textMessageData.quotedMsgSeq) && Intrinsics.EZpvd(this.urlList, textMessageData.urlList) && Intrinsics.EZpvd(this.siteMeta, textMessageData.siteMeta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.atType;
        int iHashCode = num == null ? 0 : num.hashCode();
        List<InhouseIMAtUser> list = this.atUserList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.text;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<String> list2 = this.longTextList;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.quotedMsgSeq;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        List<String> list3 = this.urlList;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        SiteMeta siteMeta = this.siteMeta;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (siteMeta != null ? siteMeta.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TextMessageData(atType=" + this.atType + ", atUserList=" + this.atUserList + ", text=" + this.text + ", longTextList=" + this.longTextList + ", quotedMsgSeq=" + this.quotedMsgSeq + ", urlList=" + this.urlList + ", siteMeta=" + this.siteMeta + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TextMessageData> serializer() {
            return TextMessageData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(InhouseIMAtUser$$serializer.INSTANCE), null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null};
    }

    public /* synthetic */ TextMessageData(int i, Integer num, List list, String str, List list2, String str2, List list3, SiteMeta siteMeta, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.atType = null;
        } else {
            this.atType = num;
        }
        if ((i & 2) == 0) {
            this.atUserList = null;
        } else {
            this.atUserList = list;
        }
        if ((i & 4) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 8) == 0) {
            this.longTextList = null;
        } else {
            this.longTextList = list2;
        }
        if ((i & 16) == 0) {
            this.quotedMsgSeq = null;
        } else {
            this.quotedMsgSeq = str2;
        }
        if ((i & 32) == 0) {
            this.urlList = null;
        } else {
            this.urlList = list3;
        }
        if ((i & 64) == 0) {
            this.siteMeta = null;
        } else {
            this.siteMeta = siteMeta;
        }
    }

    public static final /* synthetic */ void KWHzl(TextMessageData textMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || textMessageData.atType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, textMessageData.atType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || textMessageData.atUserList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], textMessageData.atUserList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || textMessageData.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, textMessageData.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || textMessageData.longTextList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], textMessageData.longTextList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || textMessageData.quotedMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, textMessageData.quotedMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || textMessageData.urlList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], textMessageData.urlList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && textMessageData.siteMeta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, SiteMeta$$serializer.INSTANCE, textMessageData.siteMeta);
    }

    public TextMessageData(Integer num, List<InhouseIMAtUser> list, String str, List<String> list2, String str2, List<String> list3, SiteMeta siteMeta) {
        this.atType = num;
        this.atUserList = list;
        this.text = str;
        this.longTextList = list2;
        this.quotedMsgSeq = str2;
        this.urlList = list3;
        this.siteMeta = siteMeta;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta) : (r13v0 com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta))
 A[MD:(java.lang.Integer, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser>, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta):void (m)] (LINE:56) call: com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData.<init>(java.lang.Integer, java.util.List, java.lang.String, java.util.List, java.lang.String, java.util.List, com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta):void type: THIS */
    public /* synthetic */ TextMessageData(Integer num, List list, String str, List list2, String str2, List list3, SiteMeta siteMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : siteMeta);
    }
}
