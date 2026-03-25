package com.okinc.okex.article.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.center.bean.enums.TopCategory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class SupportFaqArticle implements Parcelable {
    public static final int $stable = 0;
    private final String categoryName;
    private final CategorySlug categorySlug;
    private final Integer okxLikesNums;
    private final Long publishTime;
    private final String sectionSlug;
    private final String slug;
    private final String title;
    private final TopCategory topCategory;
    private final Long updateTime;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SupportFaqArticle> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, CategorySlug.Companion.serializer(), null, TopCategory.Companion.serializer(), null, null, null};

    public static final class Creator implements Parcelable.Creator<SupportFaqArticle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportFaqArticle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportFaqArticle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CategorySlug.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : TopCategory.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportFaqArticle[] newArray(int i) {
            return new SupportFaqArticle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportFaqArticle() {
        this((String) null, (String) null, (String) null, (String) null, (CategorySlug) null, (String) null, (TopCategory) null, (Long) null, (Long) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    @SerialName("categoryName")
    public static /* synthetic */ void getCategoryName$annotations() {
    }

    @SerialName("categorySlug")
    public static /* synthetic */ void getCategorySlug$annotations() {
    }

    @SerialName("okxLikesNums")
    public static /* synthetic */ void getOkxLikesNums$annotations() {
    }

    @SerialName("publishTime")
    public static /* synthetic */ void getPublishTime$annotations() {
    }

    @SerialName("sectionSlug")
    public static /* synthetic */ void getSectionSlug$annotations() {
    }

    @SerialName("slug")
    public static /* synthetic */ void getSlug$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("topCategory")
    public static /* synthetic */ void getTopCategory$annotations() {
    }

    @SerialName("updateTime")
    public static /* synthetic */ void getUpdateTime$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.okxLikesNums;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategorySlug component5() {
        return this.categorySlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sectionSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopCategory component7() {
        return this.topCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportFaqArticle copy(String str, String str2, String str3, String str4, CategorySlug categorySlug, String str5, TopCategory topCategory, Long l, Long l2, Integer num) {
        return new SupportFaqArticle(str, str2, str3, str4, categorySlug, str5, topCategory, l, l2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportFaqArticle)) {
            return false;
        }
        SupportFaqArticle supportFaqArticle = (SupportFaqArticle) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) supportFaqArticle.title) && Intrinsics.EZpvd((Object) this.url, (Object) supportFaqArticle.url) && Intrinsics.EZpvd((Object) this.slug, (Object) supportFaqArticle.slug) && Intrinsics.EZpvd((Object) this.categoryName, (Object) supportFaqArticle.categoryName) && this.categorySlug == supportFaqArticle.categorySlug && Intrinsics.EZpvd((Object) this.sectionSlug, (Object) supportFaqArticle.sectionSlug) && this.topCategory == supportFaqArticle.topCategory && Intrinsics.EZpvd(this.publishTime, supportFaqArticle.publishTime) && Intrinsics.EZpvd(this.updateTime, supportFaqArticle.updateTime) && Intrinsics.EZpvd(this.okxLikesNums, supportFaqArticle.okxLikesNums);
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
    public final Integer getOkxLikesNums() {
        return this.okxLikesNums;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPublishTime() {
        return this.publishTime;
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
    public final TopCategory getTopCategory() {
        return this.topCategory;
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
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.slug;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.categoryName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        CategorySlug categorySlug = this.categorySlug;
        int iHashCode5 = categorySlug == null ? 0 : categorySlug.hashCode();
        String str5 = this.sectionSlug;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        TopCategory topCategory = this.topCategory;
        int iHashCode7 = topCategory == null ? 0 : topCategory.hashCode();
        Long l = this.publishTime;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Long l2 = this.updateTime;
        int iHashCode9 = l2 == null ? 0 : l2.hashCode();
        Integer num = this.okxLikesNums;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportFaqArticle(title=" + this.title + ", url=" + this.url + ", slug=" + this.slug + ", categoryName=" + this.categoryName + ", categorySlug=" + this.categorySlug + ", sectionSlug=" + this.sectionSlug + ", topCategory=" + this.topCategory + ", publishTime=" + this.publishTime + ", updateTime=" + this.updateTime + ", okxLikesNums=" + this.okxLikesNums + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.slug);
        parcel.writeString(this.categoryName);
        CategorySlug categorySlug = this.categorySlug;
        if (categorySlug == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(categorySlug.name());
        }
        parcel.writeString(this.sectionSlug);
        TopCategory topCategory = this.topCategory;
        if (topCategory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(topCategory.name());
        }
        Long l = this.publishTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.updateTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num = this.okxLikesNums;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.article.bean.SupportFaqArticle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportFaqArticle> serializer() {
            return SupportFaqArticle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportFaqArticle(int i, String str, String str2, String str3, String str4, CategorySlug categorySlug, String str5, TopCategory topCategory, Long l, Long l2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.slug = null;
        } else {
            this.slug = str3;
        }
        if ((i & 8) == 0) {
            this.categoryName = null;
        } else {
            this.categoryName = str4;
        }
        if ((i & 16) == 0) {
            this.categorySlug = null;
        } else {
            this.categorySlug = categorySlug;
        }
        if ((i & 32) == 0) {
            this.sectionSlug = null;
        } else {
            this.sectionSlug = str5;
        }
        if ((i & 64) == 0) {
            this.topCategory = null;
        } else {
            this.topCategory = topCategory;
        }
        if ((i & 128) == 0) {
            this.publishTime = null;
        } else {
            this.publishTime = l;
        }
        if ((i & 256) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = l2;
        }
        if ((i & 512) == 0) {
            this.okxLikesNums = null;
        } else {
            this.okxLikesNums = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SupportFaqArticle supportFaqArticle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || supportFaqArticle.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, supportFaqArticle.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || supportFaqArticle.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, supportFaqArticle.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || supportFaqArticle.slug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, supportFaqArticle.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || supportFaqArticle.categoryName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, supportFaqArticle.categoryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || supportFaqArticle.categorySlug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], supportFaqArticle.categorySlug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || supportFaqArticle.sectionSlug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, supportFaqArticle.sectionSlug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || supportFaqArticle.topCategory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], supportFaqArticle.topCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || supportFaqArticle.publishTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, supportFaqArticle.publishTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || supportFaqArticle.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, supportFaqArticle.updateTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && supportFaqArticle.okxLikesNums == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, supportFaqArticle.okxLikesNums);
    }

    public SupportFaqArticle(String str, String str2, String str3, String str4, CategorySlug categorySlug, String str5, TopCategory topCategory, Long l, Long l2, Integer num) {
        this.title = str;
        this.url = str2;
        this.slug = str3;
        this.categoryName = str4;
        this.categorySlug = categorySlug;
        this.sectionSlug = str5;
        this.topCategory = topCategory;
        this.publishTime = l;
        this.updateTime = l2;
        this.okxLikesNums = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.enums.CategorySlug:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.enums.CategorySlug) : (r16v0 com.okinc.okex.center.bean.enums.CategorySlug))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.enums.TopCategory:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.enums.TopCategory) : (r18v0 com.okinc.okex.center.bean.enums.TopCategory))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.CategorySlug, java.lang.String, com.okinc.okex.center.bean.enums.TopCategory, java.lang.Long, java.lang.Long, java.lang.Integer):void (m)] (LINE:14) call: com.okinc.okex.article.bean.SupportFaqArticle.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.center.bean.enums.CategorySlug, java.lang.String, com.okinc.okex.center.bean.enums.TopCategory, java.lang.Long, java.lang.Long, java.lang.Integer):void type: THIS */
    public /* synthetic */ SupportFaqArticle(String str, String str2, String str3, String str4, CategorySlug categorySlug, String str5, TopCategory topCategory, Long l, Long l2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : categorySlug, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : topCategory, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : l2, (i & 512) == 0 ? num : null);
    }
}
