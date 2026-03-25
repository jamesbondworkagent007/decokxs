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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class NewsFlashArticle implements Parcelable {
    private final String content;
    private final String contentId;
    private final Boolean important;
    private final NewsFlashMentionDetail mentionDetail;
    private final String orderTag;
    private final String publishTime;
    private final String title;
    private final List<SpotlightToken> tokens;
    private final String translatedContent;
    private final String translatedTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewsFlashArticle> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(SpotlightToken$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<NewsFlashArticle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsFlashArticle createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SpotlightToken.CREATOR.createFromParcel(parcel));
                }
            }
            return new NewsFlashArticle(string, string2, string3, string4, string5, string6, arrayList, parcel.readInt() == 0 ? null : NewsFlashMentionDetail.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsFlashArticle[] newArray(int i) {
            return new NewsFlashArticle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewsFlashArticle() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (NewsFlashMentionDetail) null, (String) null, (Boolean) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.important;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.translatedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.translatedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotlightToken> component7() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsFlashMentionDetail component8() {
        return this.mentionDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsFlashArticle copy(String str, String str2, String str3, String str4, String str5, String str6, List<SpotlightToken> list, NewsFlashMentionDetail newsFlashMentionDetail, String str7, Boolean bool) {
        return new NewsFlashArticle(str, str2, str3, str4, str5, str6, list, newsFlashMentionDetail, str7, bool);
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
        if (!(obj instanceof NewsFlashArticle)) {
            return false;
        }
        NewsFlashArticle newsFlashArticle = (NewsFlashArticle) obj;
        return Intrinsics.EZpvd((Object) this.contentId, (Object) newsFlashArticle.contentId) && Intrinsics.EZpvd((Object) this.title, (Object) newsFlashArticle.title) && Intrinsics.EZpvd((Object) this.translatedTitle, (Object) newsFlashArticle.translatedTitle) && Intrinsics.EZpvd((Object) this.content, (Object) newsFlashArticle.content) && Intrinsics.EZpvd((Object) this.translatedContent, (Object) newsFlashArticle.translatedContent) && Intrinsics.EZpvd((Object) this.publishTime, (Object) newsFlashArticle.publishTime) && Intrinsics.EZpvd(this.tokens, newsFlashArticle.tokens) && Intrinsics.EZpvd(this.mentionDetail, newsFlashArticle.mentionDetail) && Intrinsics.EZpvd((Object) this.orderTag, (Object) newsFlashArticle.orderTag) && Intrinsics.EZpvd(this.important, newsFlashArticle.important);
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
    public final Boolean getImportant() {
        return this.important;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsFlashMentionDetail getMentionDetail() {
        return this.mentionDetail;
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
    public final String getTitle() {
        return this.title;
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
    public final String getTranslatedTitle() {
        return this.translatedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.contentId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.translatedTitle;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.content;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.translatedContent;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.publishTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        List<SpotlightToken> list = this.tokens;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        NewsFlashMentionDetail newsFlashMentionDetail = this.mentionDetail;
        int iHashCode8 = newsFlashMentionDetail == null ? 0 : newsFlashMentionDetail.hashCode();
        String str7 = this.orderTag;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.important;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewsFlashArticle(contentId=" + this.contentId + ", title=" + this.title + ", translatedTitle=" + this.translatedTitle + ", content=" + this.content + ", translatedContent=" + this.translatedContent + ", publishTime=" + this.publishTime + ", tokens=" + this.tokens + ", mentionDetail=" + this.mentionDetail + ", orderTag=" + this.orderTag + ", important=" + this.important + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contentId);
        parcel.writeString(this.title);
        parcel.writeString(this.translatedTitle);
        parcel.writeString(this.content);
        parcel.writeString(this.translatedContent);
        parcel.writeString(this.publishTime);
        List<SpotlightToken> list = this.tokens;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SpotlightToken> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        NewsFlashMentionDetail newsFlashMentionDetail = this.mentionDetail;
        if (newsFlashMentionDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsFlashMentionDetail.writeToParcel(parcel, i);
        }
        parcel.writeString(this.orderTag);
        Boolean bool = this.important;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.NewsFlashArticle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewsFlashArticle> serializer() {
            return NewsFlashArticle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewsFlashArticle(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, NewsFlashMentionDetail newsFlashMentionDetail, String str7, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contentId = null;
        } else {
            this.contentId = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.translatedTitle = null;
        } else {
            this.translatedTitle = str3;
        }
        if ((i & 8) == 0) {
            this.content = null;
        } else {
            this.content = str4;
        }
        if ((i & 16) == 0) {
            this.translatedContent = null;
        } else {
            this.translatedContent = str5;
        }
        if ((i & 32) == 0) {
            this.publishTime = null;
        } else {
            this.publishTime = str6;
        }
        if ((i & 64) == 0) {
            this.tokens = null;
        } else {
            this.tokens = list;
        }
        if ((i & 128) == 0) {
            this.mentionDetail = null;
        } else {
            this.mentionDetail = newsFlashMentionDetail;
        }
        if ((i & 256) == 0) {
            this.orderTag = null;
        } else {
            this.orderTag = str7;
        }
        if ((i & 512) == 0) {
            this.important = null;
        } else {
            this.important = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(NewsFlashArticle newsFlashArticle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || newsFlashArticle.contentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, newsFlashArticle.contentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || newsFlashArticle.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, newsFlashArticle.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || newsFlashArticle.translatedTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, newsFlashArticle.translatedTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || newsFlashArticle.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, newsFlashArticle.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || newsFlashArticle.translatedContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, newsFlashArticle.translatedContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || newsFlashArticle.publishTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, newsFlashArticle.publishTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || newsFlashArticle.tokens != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], newsFlashArticle.tokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || newsFlashArticle.mentionDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, NewsFlashMentionDetail$$serializer.INSTANCE, newsFlashArticle.mentionDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || newsFlashArticle.orderTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, newsFlashArticle.orderTag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && newsFlashArticle.important == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, newsFlashArticle.important);
    }

    public NewsFlashArticle(String str, String str2, String str3, String str4, String str5, String str6, List<SpotlightToken> list, NewsFlashMentionDetail newsFlashMentionDetail, String str7, Boolean bool) {
        this.contentId = str;
        this.title = str2;
        this.translatedTitle = str3;
        this.content = str4;
        this.translatedContent = str5;
        this.publishTime = str6;
        this.tokens = list;
        this.mentionDetail = newsFlashMentionDetail;
        this.orderTag = str7;
        this.important = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:com.okinc.planet.biz_content.leaderboard.bean.NewsFlashMentionDetail:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_content.leaderboard.bean.NewsFlashMentionDetail) : (r19v0 com.okinc.planet.biz_content.leaderboard.bean.NewsFlashMentionDetail))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken>, com.okinc.planet.biz_content.leaderboard.bean.NewsFlashMentionDetail, java.lang.String, java.lang.Boolean):void (m)] (LINE:26) call: com.okinc.planet.biz_content.leaderboard.bean.NewsFlashArticle.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.planet.biz_content.leaderboard.bean.NewsFlashMentionDetail, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ NewsFlashArticle(String str, String str2, String str3, String str4, String str5, String str6, List list, NewsFlashMentionDetail newsFlashMentionDetail, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : newsFlashMentionDetail, (i & 256) != 0 ? null : str7, (i & 512) == 0 ? bool : null);
    }
}
