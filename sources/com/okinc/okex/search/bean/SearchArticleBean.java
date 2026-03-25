package com.okinc.okex.search.bean;

import com.okinc.okex.center.bean.enums.CategorySlug;
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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchArticleBean {
    public static final int $stable = 0;
    private final String categoryName;
    private final CategorySlug categorySlug;
    private final String content;
    private final Integer okxLikesNums;
    private final Long publishTime;
    private final String rootSectionId;
    private final String sectionSlug;
    private final String slug;
    private final String title;
    private final Long updateTime;
    private final String url;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, CategorySlug.Companion.serializer(), null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchArticleBean() {
        this((String) null, (CategorySlug) null, (String) null, (Integer) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategorySlug component2() {
        return this.categorySlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.okxLikesNums;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rootSectionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sectionSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchArticleBean copy(String str, CategorySlug categorySlug, String str2, Integer num, Long l, String str3, String str4, String str5, String str6, Long l2, String str7) {
        return new SearchArticleBean(str, categorySlug, str2, num, l, str3, str4, str5, str6, l2, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchArticleBean)) {
            return false;
        }
        SearchArticleBean searchArticleBean = (SearchArticleBean) obj;
        return Intrinsics.EZpvd((Object) this.categoryName, (Object) searchArticleBean.categoryName) && this.categorySlug == searchArticleBean.categorySlug && Intrinsics.EZpvd((Object) this.content, (Object) searchArticleBean.content) && Intrinsics.EZpvd(this.okxLikesNums, searchArticleBean.okxLikesNums) && Intrinsics.EZpvd(this.publishTime, searchArticleBean.publishTime) && Intrinsics.EZpvd((Object) this.rootSectionId, (Object) searchArticleBean.rootSectionId) && Intrinsics.EZpvd((Object) this.sectionSlug, (Object) searchArticleBean.sectionSlug) && Intrinsics.EZpvd((Object) this.slug, (Object) searchArticleBean.slug) && Intrinsics.EZpvd((Object) this.title, (Object) searchArticleBean.title) && Intrinsics.EZpvd(this.updateTime, searchArticleBean.updateTime) && Intrinsics.EZpvd((Object) this.url, (Object) searchArticleBean.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategorySlug getCategorySlug() {
        return this.categorySlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOkxLikesNums() {
        return this.okxLikesNums;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPublishTime() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRootSectionId() {
        return this.rootSectionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionSlug() {
        return this.sectionSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.categoryName;
        int iHashCode = str == null ? 0 : str.hashCode();
        CategorySlug categorySlug = this.categorySlug;
        int iHashCode2 = categorySlug == null ? 0 : categorySlug.hashCode();
        String str2 = this.content;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.okxLikesNums;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Long l = this.publishTime;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str3 = this.rootSectionId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.sectionSlug;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.slug;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.title;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        Long l2 = this.updateTime;
        int iHashCode10 = l2 == null ? 0 : l2.hashCode();
        String str7 = this.url;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchArticleBean(categoryName=" + this.categoryName + ", categorySlug=" + this.categorySlug + ", content=" + this.content + ", okxLikesNums=" + this.okxLikesNums + ", publishTime=" + this.publishTime + ", rootSectionId=" + this.rootSectionId + ", sectionSlug=" + this.sectionSlug + ", slug=" + this.slug + ", title=" + this.title + ", updateTime=" + this.updateTime + ", url=" + this.url + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.bean.SearchArticleBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchArticleBean> serializer() {
            return SearchArticleBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchArticleBean(int i, String str, CategorySlug categorySlug, String str2, Integer num, Long l, String str3, String str4, String str5, String str6, Long l2, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.categoryName = null;
        } else {
            this.categoryName = str;
        }
        if ((i & 2) == 0) {
            this.categorySlug = null;
        } else {
            this.categorySlug = categorySlug;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i & 8) == 0) {
            this.okxLikesNums = null;
        } else {
            this.okxLikesNums = num;
        }
        if ((i & 16) == 0) {
            this.publishTime = null;
        } else {
            this.publishTime = l;
        }
        if ((i & 32) == 0) {
            this.rootSectionId = null;
        } else {
            this.rootSectionId = str3;
        }
        if ((i & 64) == 0) {
            this.sectionSlug = null;
        } else {
            this.sectionSlug = str4;
        }
        if ((i & 128) == 0) {
            this.slug = null;
        } else {
            this.slug = str5;
        }
        if ((i & 256) == 0) {
            this.title = null;
        } else {
            this.title = str6;
        }
        if ((i & 512) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = l2;
        }
        if ((i & 1024) == 0) {
            this.url = null;
        } else {
            this.url = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchArticleBean searchArticleBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchArticleBean.categoryName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, searchArticleBean.categoryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || searchArticleBean.categorySlug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], searchArticleBean.categorySlug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || searchArticleBean.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, searchArticleBean.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || searchArticleBean.okxLikesNums != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, searchArticleBean.okxLikesNums);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || searchArticleBean.publishTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, searchArticleBean.publishTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || searchArticleBean.rootSectionId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, searchArticleBean.rootSectionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || searchArticleBean.sectionSlug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, searchArticleBean.sectionSlug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || searchArticleBean.slug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, searchArticleBean.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || searchArticleBean.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, searchArticleBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || searchArticleBean.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, searchArticleBean.updateTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && searchArticleBean.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, searchArticleBean.url);
    }

    public SearchArticleBean(String str, CategorySlug categorySlug, String str2, Integer num, Long l, String str3, String str4, String str5, String str6, Long l2, String str7) {
        this.categoryName = str;
        this.categorySlug = categorySlug;
        this.content = str2;
        this.okxLikesNums = num;
        this.publishTime = l;
        this.rootSectionId = str3;
        this.sectionSlug = str4;
        this.slug = str5;
        this.title = str6;
        this.updateTime = l2;
        this.url = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.enums.CategorySlug:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.enums.CategorySlug) : (r14v0 com.okinc.okex.center.bean.enums.CategorySlug))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, com.okinc.okex.center.bean.enums.CategorySlug, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:21) call: com.okinc.okex.search.bean.SearchArticleBean.<init>(java.lang.String, com.okinc.okex.center.bean.enums.CategorySlug, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ SearchArticleBean(String str, CategorySlug categorySlug, String str2, Integer num, Long l, String str3, String str4, String str5, String str6, Long l2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : categorySlug, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : l2, (i & 1024) == 0 ? str7 : null);
    }
}
