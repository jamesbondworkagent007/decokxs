package com.okinc.crcore.coreapi.net.responsebean.content;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommunityPostResponseBean implements Parcelable {
    private final CommunityAuthorResponseBean author;
    private final String content;
    private final String contentId;
    private final String enTitle;
    private final Integer formatTypeRaw;
    private final List<CommunityImageResponseBean> imageList;
    private final boolean isLiked;
    private final int likeCount;
    private final long publishTime;
    private final CommunityPostReferencedContentResponseBean referencedContent;
    private final List<CommunityAuthorResponseBean> retweetAuthorInfo;
    private final Integer retweetTotal;
    private final String shareUrl;
    private final String sourcePlatform;
    private final String title;
    private final List<CommunityTokenResponseBean> tokens;
    private final String translatedContent;
    private final String translatedTitle;
    private final int viewCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CommunityPostResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(CommunityImageResponseBean$$serializer.INSTANCE), null, new ArrayListSerializer(CommunityAuthorResponseBean$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(CommunityTokenResponseBean$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<CommunityPostResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityPostResponseBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            CommunityAuthorResponseBean communityAuthorResponseBeanCreateFromParcel = CommunityAuthorResponseBean.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(CommunityImageResponseBean.CREATOR.createFromParcel(parcel));
            }
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(CommunityAuthorResponseBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBeanCreateFromParcel = parcel.readInt() != 0 ? CommunityPostReferencedContentResponseBean.CREATOR.createFromParcel(parcel) : null;
            long j = parcel.readLong();
            String string6 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList4.add(CommunityTokenResponseBean.CREATOR.createFromParcel(parcel));
            }
            return new CommunityPostResponseBean(communityAuthorResponseBeanCreateFromParcel, string, numValueOf, string2, string3, string4, string5, arrayList2, numValueOf2, arrayList, communityPostReferencedContentResponseBeanCreateFromParcel, j, string6, arrayList4, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityPostResponseBean[] newArray(int i) {
            return new CommunityPostResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommunityPostResponseBean() {
        this((CommunityAuthorResponseBean) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (List) null, (CommunityPostReferencedContentResponseBean) null, 0L, (String) null, (List) null, false, 0, 0, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final Integer component3() {
        return this.formatTypeRaw;
    }

    @SerialName("formatType")
    private static /* synthetic */ void getFormatTypeRaw$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityAuthorResponseBean component1() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityAuthorResponseBean> component10() {
        return this.retweetAuthorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityPostReferencedContentResponseBean component11() {
        return this.referencedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component12() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sourcePlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityTokenResponseBean> component14() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.isLiked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.translatedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contentId;
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
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.enTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityImageResponseBean> component8() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.retweetTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityPostResponseBean copy(@NotNull CommunityAuthorResponseBean communityAuthorResponseBean, @NotNull String str, Integer num, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull List<CommunityImageResponseBean> list, Integer num2, List<CommunityAuthorResponseBean> list2, CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean, long j, @NotNull String str6, @NotNull List<CommunityTokenResponseBean> list3, boolean z, int i, int i2, @NotNull String str7, String str8) {
        Intrinsics.checkNotNullParameter(communityAuthorResponseBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CommunityPostResponseBean(communityAuthorResponseBean, str, num, str2, str3, str4, str5, list, num2, list2, communityPostReferencedContentResponseBean, j, str6, list3, z, i, i2, str7, str8);
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
        if (!(obj instanceof CommunityPostResponseBean)) {
            return false;
        }
        CommunityPostResponseBean communityPostResponseBean = (CommunityPostResponseBean) obj;
        return Intrinsics.EZpvd(this.author, communityPostResponseBean.author) && Intrinsics.EZpvd((Object) this.contentId, (Object) communityPostResponseBean.contentId) && Intrinsics.EZpvd(this.formatTypeRaw, communityPostResponseBean.formatTypeRaw) && Intrinsics.EZpvd((Object) this.content, (Object) communityPostResponseBean.content) && Intrinsics.EZpvd((Object) this.translatedContent, (Object) communityPostResponseBean.translatedContent) && Intrinsics.EZpvd((Object) this.title, (Object) communityPostResponseBean.title) && Intrinsics.EZpvd((Object) this.enTitle, (Object) communityPostResponseBean.enTitle) && Intrinsics.EZpvd(this.imageList, communityPostResponseBean.imageList) && Intrinsics.EZpvd(this.retweetTotal, communityPostResponseBean.retweetTotal) && Intrinsics.EZpvd(this.retweetAuthorInfo, communityPostResponseBean.retweetAuthorInfo) && Intrinsics.EZpvd(this.referencedContent, communityPostResponseBean.referencedContent) && this.publishTime == communityPostResponseBean.publishTime && Intrinsics.EZpvd((Object) this.sourcePlatform, (Object) communityPostResponseBean.sourcePlatform) && Intrinsics.EZpvd(this.tokens, communityPostResponseBean.tokens) && this.isLiked == communityPostResponseBean.isLiked && this.likeCount == communityPostResponseBean.likeCount && this.viewCount == communityPostResponseBean.viewCount && Intrinsics.EZpvd((Object) this.shareUrl, (Object) communityPostResponseBean.shareUrl) && Intrinsics.EZpvd((Object) this.translatedTitle, (Object) communityPostResponseBean.translatedTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityAuthorResponseBean getAuthor() {
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
    public final String getEnTitle() {
        return this.enTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityImageResponseBean> getImageList() {
        return this.imageList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLikeCount() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishTime() {
        return this.publishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityPostReferencedContentResponseBean getReferencedContent() {
        return this.referencedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityAuthorResponseBean> getRetweetAuthorInfo() {
        return this.retweetAuthorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRetweetTotal() {
        return this.retweetTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourcePlatform() {
        return this.sourcePlatform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommunityTokenResponseBean> getTokens() {
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
    public final int getViewCount() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.author.hashCode();
        int iHashCode2 = this.contentId.hashCode();
        Integer num = this.formatTypeRaw;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = this.content.hashCode();
        int iHashCode5 = this.translatedContent.hashCode();
        String str = this.title;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.enTitle;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.imageList.hashCode();
        Integer num2 = this.retweetTotal;
        int iHashCode9 = num2 == null ? 0 : num2.hashCode();
        List<CommunityAuthorResponseBean> list = this.retweetAuthorInfo;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean = this.referencedContent;
        int iHashCode11 = communityPostReferencedContentResponseBean == null ? 0 : communityPostReferencedContentResponseBean.hashCode();
        int iHashCode12 = Long.hashCode(this.publishTime);
        int iHashCode13 = this.sourcePlatform.hashCode();
        int iHashCode14 = this.tokens.hashCode();
        int iHashCode15 = Boolean.hashCode(this.isLiked);
        int iHashCode16 = Integer.hashCode(this.likeCount);
        int iHashCode17 = Integer.hashCode(this.viewCount);
        int iHashCode18 = this.shareUrl.hashCode();
        String str3 = this.translatedTitle;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str3 == null ? 0 : str3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLiked() {
        return this.isLiked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunityPostResponseBean(author=" + this.author + ", contentId=" + this.contentId + ", formatTypeRaw=" + this.formatTypeRaw + ", content=" + this.content + ", translatedContent=" + this.translatedContent + ", title=" + this.title + ", enTitle=" + this.enTitle + ", imageList=" + this.imageList + ", retweetTotal=" + this.retweetTotal + ", retweetAuthorInfo=" + this.retweetAuthorInfo + ", referencedContent=" + this.referencedContent + ", publishTime=" + this.publishTime + ", sourcePlatform=" + this.sourcePlatform + ", tokens=" + this.tokens + ", isLiked=" + this.isLiked + ", likeCount=" + this.likeCount + ", viewCount=" + this.viewCount + ", shareUrl=" + this.shareUrl + ", translatedTitle=" + this.translatedTitle + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.author.writeToParcel(parcel, i);
        parcel.writeString(this.contentId);
        Integer num = this.formatTypeRaw;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.content);
        parcel.writeString(this.translatedContent);
        parcel.writeString(this.title);
        parcel.writeString(this.enTitle);
        List<CommunityImageResponseBean> list = this.imageList;
        parcel.writeInt(list.size());
        Iterator<CommunityImageResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Integer num2 = this.retweetTotal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<CommunityAuthorResponseBean> list2 = this.retweetAuthorInfo;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<CommunityAuthorResponseBean> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean = this.referencedContent;
        if (communityPostReferencedContentResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            communityPostReferencedContentResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.publishTime);
        parcel.writeString(this.sourcePlatform);
        List<CommunityTokenResponseBean> list3 = this.tokens;
        parcel.writeInt(list3.size());
        Iterator<CommunityTokenResponseBean> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isLiked ? 1 : 0);
        parcel.writeInt(this.likeCount);
        parcel.writeInt(this.viewCount);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.translatedTitle);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunityPostResponseBean> serializer() {
            return CommunityPostResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunityPostResponseBean(int i, CommunityAuthorResponseBean communityAuthorResponseBean, String str, Integer num, String str2, String str3, String str4, String str5, List list, Integer num2, List list2, CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean, long j, String str6, List list3, boolean z, int i2, int i3, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        this.author = (i & 1) == 0 ? new CommunityAuthorResponseBean((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null) : communityAuthorResponseBean;
        if ((i & 2) == 0) {
            this.contentId = "";
        } else {
            this.contentId = str;
        }
        if ((i & 4) == 0) {
            this.formatTypeRaw = null;
        } else {
            this.formatTypeRaw = num;
        }
        if ((i & 8) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 16) == 0) {
            this.translatedContent = "";
        } else {
            this.translatedContent = str3;
        }
        if ((i & 32) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 64) == 0) {
            this.enTitle = null;
        } else {
            this.enTitle = str5;
        }
        this.imageList = (i & 128) == 0 ? yDY.AhwBna() : list;
        if ((i & 256) == 0) {
            this.retweetTotal = null;
        } else {
            this.retweetTotal = num2;
        }
        if ((i & 512) == 0) {
            this.retweetAuthorInfo = null;
        } else {
            this.retweetAuthorInfo = list2;
        }
        if ((i & 1024) == 0) {
            this.referencedContent = null;
        } else {
            this.referencedContent = communityPostReferencedContentResponseBean;
        }
        this.publishTime = (i & 2048) == 0 ? 0L : j;
        if ((i & 4096) == 0) {
            this.sourcePlatform = "";
        } else {
            this.sourcePlatform = str6;
        }
        this.tokens = (i & 8192) == 0 ? yDY.AhwBna() : list3;
        if ((i & 16384) == 0) {
            this.isLiked = false;
        } else {
            this.isLiked = z;
        }
        if ((32768 & i) == 0) {
            this.likeCount = 0;
        } else {
            this.likeCount = i2;
        }
        if ((65536 & i) == 0) {
            this.viewCount = 0;
        } else {
            this.viewCount = i3;
        }
        if ((131072 & i) == 0) {
            this.shareUrl = "";
        } else {
            this.shareUrl = str7;
        }
        if ((i & 262144) == 0) {
            this.translatedTitle = null;
        } else {
            this.translatedTitle = str8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [12=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CommunityPostResponseBean communityPostResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(communityPostResponseBean.author, new CommunityAuthorResponseBean((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, CommunityAuthorResponseBean$$serializer.INSTANCE, communityPostResponseBean.author);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) communityPostResponseBean.contentId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, communityPostResponseBean.contentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || communityPostResponseBean.formatTypeRaw != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, communityPostResponseBean.formatTypeRaw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) communityPostResponseBean.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, communityPostResponseBean.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) communityPostResponseBean.translatedContent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, communityPostResponseBean.translatedContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || communityPostResponseBean.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, communityPostResponseBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || communityPostResponseBean.enTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, communityPostResponseBean.enTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(communityPostResponseBean.imageList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], communityPostResponseBean.imageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || communityPostResponseBean.retweetTotal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, communityPostResponseBean.retweetTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || communityPostResponseBean.retweetAuthorInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], communityPostResponseBean.retweetAuthorInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || communityPostResponseBean.referencedContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, CommunityPostReferencedContentResponseBean$$serializer.INSTANCE, communityPostResponseBean.referencedContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || communityPostResponseBean.publishTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 11, communityPostResponseBean.publishTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) communityPostResponseBean.sourcePlatform, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, communityPostResponseBean.sourcePlatform);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(communityPostResponseBean.tokens, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], communityPostResponseBean.tokens);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || communityPostResponseBean.isLiked) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, communityPostResponseBean.isLiked);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || communityPostResponseBean.likeCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, communityPostResponseBean.likeCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || communityPostResponseBean.viewCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, communityPostResponseBean.viewCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) communityPostResponseBean.shareUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, communityPostResponseBean.shareUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && communityPostResponseBean.translatedTitle == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, communityPostResponseBean.translatedTitle);
    }

    public CommunityPostResponseBean(@NotNull CommunityAuthorResponseBean communityAuthorResponseBean, @NotNull String str, Integer num, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull List<CommunityImageResponseBean> list, Integer num2, List<CommunityAuthorResponseBean> list2, CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean, long j, @NotNull String str6, @NotNull List<CommunityTokenResponseBean> list3, boolean z, int i, int i2, @NotNull String str7, String str8) {
        Intrinsics.checkNotNullParameter(communityAuthorResponseBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.author = communityAuthorResponseBean;
        this.contentId = str;
        this.formatTypeRaw = num;
        this.content = str2;
        this.translatedContent = str3;
        this.title = str4;
        this.enTitle = str5;
        this.imageList = list;
        this.retweetTotal = num2;
        this.retweetAuthorInfo = list2;
        this.referencedContent = communityPostReferencedContentResponseBean;
        this.publishTime = j;
        this.sourcePlatform = str6;
        this.tokens = list3;
        this.isLiked = z;
        this.likeCount = i;
        this.viewCount = i2;
        this.shareUrl = str7;
        this.translatedTitle = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ea: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:17) call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0022: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r29v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0055: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005d: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r31v0 java.util.List))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostReferencedContentResponseBean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostReferencedContentResponseBean) : (r32v0 com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostReferencedContentResponseBean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x006d: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.util.List:0x008b: TERNARY null = ((wrap:int:0x0080: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0084: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r36v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009b: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r39v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.content.CommunityImageResponseBean>, java.lang.Integer, java.util.List<com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean>, com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostReferencedContentResponseBean, long, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.content.CommunityTokenResponseBean>, boolean, int, int, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostResponseBean.<init>(com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.util.List, com.okinc.crcore.coreapi.net.responsebean.content.CommunityPostReferencedContentResponseBean, long, java.lang.String, java.util.List, boolean, int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommunityPostResponseBean(CommunityAuthorResponseBean communityAuthorResponseBean, String str, Integer num, String str2, String str3, String str4, String str5, List list, Integer num2, List list2, CommunityPostReferencedContentResponseBean communityPostReferencedContentResponseBean, long j, String str6, List list3, boolean z, int i, int i2, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new CommunityAuthorResponseBean((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null) : communityAuthorResponseBean, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? yDY.AhwBna() : list, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : list2, (i3 & 1024) != 0 ? null : communityPostReferencedContentResponseBean, (i3 & 2048) != 0 ? 0L : j, (i3 & 4096) != 0 ? "" : str6, (i3 & 8192) != 0 ? yDY.AhwBna() : list3, (i3 & 16384) != 0 ? false : z, (i3 & 32768) != 0 ? 0 : i, (i3 & 65536) == 0 ? i2 : 0, (i3 & 131072) != 0 ? "" : str7, (i3 & 262144) != 0 ? null : str8);
    }

    public final CommunityPostFormatType getPostFormatType() {
        Integer num = this.formatTypeRaw;
        if (num != null && num.intValue() == 1) {
            return CommunityPostFormatType.RICH_TEXT;
        }
        if (num != null && num.intValue() == 2) {
            return CommunityPostFormatType.NORMAL_TEXT;
        }
        return null;
    }
}
