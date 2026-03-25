package com.okinc.planet.biz_content.leaderboard.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class SpotlightArticle implements Parcelable {
    private final SpotlightAuthor author;
    private final String content;
    private final String contentId;
    private final List<SpotlightImage> imageList;
    private final Long likeCount;
    private final String orderTag;
    private final String publishTime;
    private final List<SpotlightToken> tokens;
    private final String translatedContent;
    private final Long viewCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotlightArticle> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(SpotlightImage$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(SpotlightToken$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SpotlightArticle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightArticle createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            SpotlightAuthor spotlightAuthorCreateFromParcel = parcel.readInt() == 0 ? null : SpotlightAuthor.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SpotlightImage.CREATOR.createFromParcel(parcel));
                }
            }
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SpotlightToken.CREATOR.createFromParcel(parcel));
                }
            }
            return new SpotlightArticle(string, spotlightAuthorCreateFromParcel, string2, string3, arrayList, string4, lValueOf, lValueOf2, string5, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightArticle[] newArray(int i) {
            return new SpotlightArticle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotlightArticle() {
        this((String) null, (SpotlightAuthor) null, (String) null, (String) null, (List) null, (String) null, (Long) null, (Long) null, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotlightToken> component10() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotlightAuthor component2() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.translatedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotlightImage> component5() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotlightArticle copy(String str, SpotlightAuthor spotlightAuthor, String str2, String str3, List<SpotlightImage> list, String str4, Long l, Long l2, String str5, List<SpotlightToken> list2) {
        return new SpotlightArticle(str, spotlightAuthor, str2, str3, list, str4, l, l2, str5, list2);
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
        if (!(obj instanceof SpotlightArticle)) {
            return false;
        }
        SpotlightArticle spotlightArticle = (SpotlightArticle) obj;
        return Intrinsics.EZpvd((Object) this.contentId, (Object) spotlightArticle.contentId) && Intrinsics.EZpvd(this.author, spotlightArticle.author) && Intrinsics.EZpvd((Object) this.content, (Object) spotlightArticle.content) && Intrinsics.EZpvd((Object) this.translatedContent, (Object) spotlightArticle.translatedContent) && Intrinsics.EZpvd(this.imageList, spotlightArticle.imageList) && Intrinsics.EZpvd((Object) this.publishTime, (Object) spotlightArticle.publishTime) && Intrinsics.EZpvd(this.likeCount, spotlightArticle.likeCount) && Intrinsics.EZpvd(this.viewCount, spotlightArticle.viewCount) && Intrinsics.EZpvd((Object) this.orderTag, (Object) spotlightArticle.orderTag) && Intrinsics.EZpvd(this.tokens, spotlightArticle.tokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotlightAuthor getAuthor() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotlightImage> getImageList() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLikeCount() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderTag() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublishTime() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotlightToken> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedContent() {
        return this.translatedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getViewCount() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.contentId;
        int iHashCode = str == null ? 0 : str.hashCode();
        SpotlightAuthor spotlightAuthor = this.author;
        int iHashCode2 = spotlightAuthor == null ? 0 : spotlightAuthor.hashCode();
        String str2 = this.content;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.translatedContent;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<SpotlightImage> list = this.imageList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str4 = this.publishTime;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Long l = this.likeCount;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        Long l2 = this.viewCount;
        int iHashCode8 = l2 == null ? 0 : l2.hashCode();
        String str5 = this.orderTag;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        List<SpotlightToken> list2 = this.tokens;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotlightArticle(contentId=" + this.contentId + ", author=" + this.author + ", content=" + this.content + ", translatedContent=" + this.translatedContent + ", imageList=" + this.imageList + ", publishTime=" + this.publishTime + ", likeCount=" + this.likeCount + ", viewCount=" + this.viewCount + ", orderTag=" + this.orderTag + ", tokens=" + this.tokens + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contentId);
        SpotlightAuthor spotlightAuthor = this.author;
        if (spotlightAuthor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spotlightAuthor.writeToParcel(parcel, i);
        }
        parcel.writeString(this.content);
        parcel.writeString(this.translatedContent);
        List<SpotlightImage> list = this.imageList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SpotlightImage> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.publishTime);
        Long l = this.likeCount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.viewCount;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.orderTag);
        List<SpotlightToken> list2 = this.tokens;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<SpotlightToken> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotlightArticle> serializer() {
            return SpotlightArticle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotlightArticle(int i, String str, SpotlightAuthor spotlightAuthor, String str2, String str3, List list, String str4, Long l, Long l2, String str5, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contentId = null;
        } else {
            this.contentId = str;
        }
        if ((i & 2) == 0) {
            this.author = null;
        } else {
            this.author = spotlightAuthor;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = str2;
        }
        if ((i & 8) == 0) {
            this.translatedContent = null;
        } else {
            this.translatedContent = str3;
        }
        if ((i & 16) == 0) {
            this.imageList = null;
        } else {
            this.imageList = list;
        }
        if ((i & 32) == 0) {
            this.publishTime = null;
        } else {
            this.publishTime = str4;
        }
        if ((i & 64) == 0) {
            this.likeCount = null;
        } else {
            this.likeCount = l;
        }
        if ((i & 128) == 0) {
            this.viewCount = null;
        } else {
            this.viewCount = l2;
        }
        if ((i & 256) == 0) {
            this.orderTag = null;
        } else {
            this.orderTag = str5;
        }
        if ((i & 512) == 0) {
            this.tokens = null;
        } else {
            this.tokens = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(SpotlightArticle spotlightArticle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotlightArticle.contentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotlightArticle.contentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotlightArticle.author != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SpotlightAuthor$$serializer.INSTANCE, spotlightArticle.author);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spotlightArticle.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotlightArticle.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || spotlightArticle.translatedContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spotlightArticle.translatedContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || spotlightArticle.imageList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], spotlightArticle.imageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || spotlightArticle.publishTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, spotlightArticle.publishTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || spotlightArticle.likeCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, spotlightArticle.likeCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || spotlightArticle.viewCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, spotlightArticle.viewCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || spotlightArticle.orderTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, spotlightArticle.orderTag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && spotlightArticle.tokens == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], spotlightArticle.tokens);
    }

    public SpotlightArticle(String str, SpotlightAuthor spotlightAuthor, String str2, String str3, List<SpotlightImage> list, String str4, Long l, Long l2, String str5, List<SpotlightToken> list2) {
        this.contentId = str;
        this.author = spotlightAuthor;
        this.content = str2;
        this.translatedContent = str3;
        this.imageList = list;
        this.publishTime = str4;
        this.likeCount = l;
        this.viewCount = l2;
        this.orderTag = str5;
        this.tokens = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor) : (r13v0 com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor, java.lang.String, java.lang.String, java.util.List<com.okinc.planet.biz_content.leaderboard.bean.SpotlightImage>, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.util.List<com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken>):void (m)] (LINE:28) call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle.<init>(java.lang.String, com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ SpotlightArticle(String str, SpotlightAuthor spotlightAuthor, String str2, String str3, List list, String str4, Long l, Long l2, String str5, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : spotlightAuthor, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : str5, (i & 512) == 0 ? list2 : null);
    }
}
