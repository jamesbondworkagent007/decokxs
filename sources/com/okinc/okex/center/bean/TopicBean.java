package com.okinc.okex.center.bean;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TopicBean {
    private final String description;
    private final String iconBright;
    private final String iconDark;
    private final String id;
    private final String slug;
    private final List<String> tags;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopicBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okex.center.bean.TopicBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopicBean copy$default(TopicBean topicBean, String str, String str2, String str3, String str4, String str5, List list, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topicBean.id;
        }
        if ((i & 2) != 0) {
            str2 = topicBean.title;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = topicBean.description;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = topicBean.iconDark;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = topicBean.iconBright;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            list = topicBean.tags;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            str6 = topicBean.slug;
        }
        return topicBean.copy(str, str7, str8, str9, str10, list2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopicBean copy(String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
        return new TopicBean(str, str2, str3, str4, str5, list, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicBean)) {
            return false;
        }
        TopicBean topicBean = (TopicBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) topicBean.id) && Intrinsics.EZpvd((Object) this.title, (Object) topicBean.title) && Intrinsics.EZpvd((Object) this.description, (Object) topicBean.description) && Intrinsics.EZpvd((Object) this.iconDark, (Object) topicBean.iconDark) && Intrinsics.EZpvd((Object) this.iconBright, (Object) topicBean.iconBright) && Intrinsics.EZpvd(this.tags, topicBean.tags) && Intrinsics.EZpvd((Object) this.slug, (Object) topicBean.slug);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconBright() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.description;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconDark;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.iconBright;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        List<String> list = this.tags;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str6 = this.slug;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopicBean(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", iconDark=" + this.iconDark + ", iconBright=" + this.iconBright + ", tags=" + this.tags + ", slug=" + this.slug + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TopicBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TopicBean> serializer() {
            return TopicBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TopicBean(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.iconDark = null;
        } else {
            this.iconDark = str4;
        }
        if ((i & 16) == 0) {
            this.iconBright = null;
        } else {
            this.iconBright = str5;
        }
        if ((i & 32) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 64) == 0) {
            this.slug = null;
        } else {
            this.slug = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TopicBean topicBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || topicBean.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, topicBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || topicBean.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, topicBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || topicBean.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, topicBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || topicBean.iconDark != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, topicBean.iconDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || topicBean.iconBright != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, topicBean.iconBright);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || topicBean.tags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], topicBean.tags);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && topicBean.slug == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, topicBean.slug);
    }

    public TopicBean(String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.iconDark = str4;
        this.iconBright = str5;
        this.tags = list;
        this.slug = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:18) call: com.okinc.okex.center.bean.TopicBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ TopicBean(String str, String str2, String str3, String str4, String str5, List list, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str6);
    }
}
