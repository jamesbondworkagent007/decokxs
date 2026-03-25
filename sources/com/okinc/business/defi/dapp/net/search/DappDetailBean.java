package com.okinc.business.defi.dapp.net.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappChains$$serializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappDetailBean implements Parcelable {
    private Integer category;
    private List<DappChains> chains;
    private int id;
    private boolean isFav;
    private String logo;
    private List<Metric> metricList;
    private String name;
    private String okxDeepLink;
    private Integer recommendCategory;
    private String recommendColor;
    private String recommendDeepLink;
    private String recommendIllustrate;
    private String recommendInfo;
    private String rewardInfo;
    private String securityScore;
    private String shortDescribe;
    private List<SocialMedia> socialMediaList;
    private List<String> tagsNameList;
    private List<Token> tokenList;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappDetailBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DappChains$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(DappDetailBean$SocialMedia$$serializer.INSTANCE), null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(DappDetailBean$Token$$serializer.INSTANCE), new ArrayListSerializer(DappDetailBean$Metric$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<DappDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappDetailBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(DappDetailBean.class.getClassLoader()));
                }
            }
            int i3 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(SocialMedia.CREATOR.createFromParcel(parcel));
                }
            }
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList3 = new ArrayList(i6);
                int i7 = 0;
                while (i7 != i6) {
                    arrayList3.add(Token.CREATOR.createFromParcel(parcel));
                    i7++;
                    i6 = i6;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                arrayList4 = arrayList3;
                int i9 = 0;
                while (i9 != i8) {
                    arrayList6.add(Metric.CREATOR.createFromParcel(parcel));
                    i9++;
                    i8 = i8;
                }
                arrayList5 = arrayList6;
            }
            return new DappDetailBean(numValueOf, arrayList, i3, z, string, string2, numValueOf2, string3, arrayList2, string4, arrayListCreateStringArrayList, string5, string6, string7, string8, string9, string10, arrayList4, arrayList5, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappDetailBean[] newArray(int i) {
            return new DappDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappDetailBean() {
        this((Integer) null, (List) null, 0, false, (String) null, (String) null, (Integer) null, (String) null, (List) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component11() {
        return this.tagsNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.recommendDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.recommendIllustrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.rewardInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.okxDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.recommendInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.recommendColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Token> component18() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Metric> component19() {
        return this.metricList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> component2() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.securityScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isFav;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.recommendCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SocialMedia> component9() {
        return this.socialMediaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappDetailBean copy(Integer num, List<DappChains> list, int i, boolean z, String str, String str2, Integer num2, String str3, List<SocialMedia> list2, String str4, List<String> list3, String str5, String str6, String str7, String str8, String str9, String str10, List<Token> list4, List<Metric> list5, String str11) {
        return new DappDetailBean(num, list, i, z, str, str2, num2, str3, list2, str4, list3, str5, str6, str7, str8, str9, str10, list4, list5, str11);
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
        if (!(obj instanceof DappDetailBean)) {
            return false;
        }
        DappDetailBean dappDetailBean = (DappDetailBean) obj;
        return Intrinsics.EZpvd(this.category, dappDetailBean.category) && Intrinsics.EZpvd(this.chains, dappDetailBean.chains) && this.id == dappDetailBean.id && this.isFav == dappDetailBean.isFav && Intrinsics.EZpvd((Object) this.logo, (Object) dappDetailBean.logo) && Intrinsics.EZpvd((Object) this.name, (Object) dappDetailBean.name) && Intrinsics.EZpvd(this.recommendCategory, dappDetailBean.recommendCategory) && Intrinsics.EZpvd((Object) this.shortDescribe, (Object) dappDetailBean.shortDescribe) && Intrinsics.EZpvd(this.socialMediaList, dappDetailBean.socialMediaList) && Intrinsics.EZpvd((Object) this.url, (Object) dappDetailBean.url) && Intrinsics.EZpvd(this.tagsNameList, dappDetailBean.tagsNameList) && Intrinsics.EZpvd((Object) this.recommendDeepLink, (Object) dappDetailBean.recommendDeepLink) && Intrinsics.EZpvd((Object) this.recommendIllustrate, (Object) dappDetailBean.recommendIllustrate) && Intrinsics.EZpvd((Object) this.rewardInfo, (Object) dappDetailBean.rewardInfo) && Intrinsics.EZpvd((Object) this.okxDeepLink, (Object) dappDetailBean.okxDeepLink) && Intrinsics.EZpvd((Object) this.recommendInfo, (Object) dappDetailBean.recommendInfo) && Intrinsics.EZpvd((Object) this.recommendColor, (Object) dappDetailBean.recommendColor) && Intrinsics.EZpvd(this.tokenList, dappDetailBean.tokenList) && Intrinsics.EZpvd(this.metricList, dappDetailBean.metricList) && Intrinsics.EZpvd((Object) this.securityScore, (Object) dappDetailBean.securityScore);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Metric> getMetricList() {
        return this.metricList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkxDeepLink() {
        return this.okxDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRecommendCategory() {
        return this.recommendCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendColor() {
        return this.recommendColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendDeepLink() {
        return this.recommendDeepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendIllustrate() {
        return this.recommendIllustrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendInfo() {
        return this.recommendInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardInfo() {
        return this.rewardInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecurityScore() {
        return this.securityScore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortDescribe() {
        return this.shortDescribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SocialMedia> getSocialMediaList() {
        return this.socialMediaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTagsNameList() {
        return this.tagsNameList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Token> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.category;
        int iHashCode = num == null ? 0 : num.hashCode();
        List<DappChains> list = this.chains;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = Integer.hashCode(this.id);
        int iHashCode4 = Boolean.hashCode(this.isFav);
        String str = this.logo;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.recommendCategory;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.shortDescribe;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        List<SocialMedia> list2 = this.socialMediaList;
        int iHashCode9 = list2 == null ? 0 : list2.hashCode();
        String str4 = this.url;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        List<String> list3 = this.tagsNameList;
        int iHashCode11 = list3 == null ? 0 : list3.hashCode();
        String str5 = this.recommendDeepLink;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.recommendIllustrate;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.rewardInfo;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.okxDeepLink;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.recommendInfo;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.recommendColor;
        int iHashCode17 = str10 == null ? 0 : str10.hashCode();
        List<Token> list4 = this.tokenList;
        int iHashCode18 = list4 == null ? 0 : list4.hashCode();
        List<Metric> list5 = this.metricList;
        int iHashCode19 = list5 == null ? 0 : list5.hashCode();
        String str11 = this.securityScore;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str11 == null ? 0 : str11.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFav() {
        return this.isFav;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(Integer num) {
        this.category = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChains(List<DappChains> list) {
        this.chains = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFav(boolean z) {
        this.isFav = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(int i) {
        this.id = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(String str) {
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMetricList(List<Metric> list) {
        this.metricList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkxDeepLink(String str) {
        this.okxDeepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendCategory(Integer num) {
        this.recommendCategory = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendColor(String str) {
        this.recommendColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendDeepLink(String str) {
        this.recommendDeepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendIllustrate(String str) {
        this.recommendIllustrate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendInfo(String str) {
        this.recommendInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardInfo(String str) {
        this.rewardInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecurityScore(String str) {
        this.securityScore = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortDescribe(String str) {
        this.shortDescribe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSocialMediaList(List<SocialMedia> list) {
        this.socialMediaList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagsNameList(List<String> list) {
        this.tagsNameList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenList(List<Token> list) {
        this.tokenList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappDetailBean(category=" + this.category + ", chains=" + this.chains + ", id=" + this.id + ", isFav=" + this.isFav + ", logo=" + this.logo + ", name=" + this.name + ", recommendCategory=" + this.recommendCategory + ", shortDescribe=" + this.shortDescribe + ", socialMediaList=" + this.socialMediaList + ", url=" + this.url + ", tagsNameList=" + this.tagsNameList + ", recommendDeepLink=" + this.recommendDeepLink + ", recommendIllustrate=" + this.recommendIllustrate + ", rewardInfo=" + this.rewardInfo + ", okxDeepLink=" + this.okxDeepLink + ", recommendInfo=" + this.recommendInfo + ", recommendColor=" + this.recommendColor + ", tokenList=" + this.tokenList + ", metricList=" + this.metricList + ", securityScore=" + this.securityScore + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.category;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<DappChains> list = this.chains;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DappChains> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeInt(this.id);
        parcel.writeInt(this.isFav ? 1 : 0);
        parcel.writeString(this.logo);
        parcel.writeString(this.name);
        Integer num2 = this.recommendCategory;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.shortDescribe);
        List<SocialMedia> list2 = this.socialMediaList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<SocialMedia> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.url);
        parcel.writeStringList(this.tagsNameList);
        parcel.writeString(this.recommendDeepLink);
        parcel.writeString(this.recommendIllustrate);
        parcel.writeString(this.rewardInfo);
        parcel.writeString(this.okxDeepLink);
        parcel.writeString(this.recommendInfo);
        parcel.writeString(this.recommendColor);
        List<Token> list3 = this.tokenList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<Token> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<Metric> list4 = this.metricList;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<Metric> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.securityScore);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.search.DappDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappDetailBean> serializer() {
            return DappDetailBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappDetailBean(int i, Integer num, List list, int i2, boolean z, String str, String str2, Integer num2, String str3, List list2, String str4, List list3, String str5, String str6, String str7, String str8, String str9, String str10, List list4, List list5, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        this.category = (i & 1) == 0 ? num : num;
        this.chains = (i & 2) == 0 ? yDY.AhwBna() : list;
        if ((i & 4) == 0) {
            this.id = 0;
        } else {
            this.id = i2;
        }
        if ((i & 8) == 0) {
            this.isFav = false;
        } else {
            this.isFav = z;
        }
        if ((i & 16) == 0) {
            this.logo = "";
        } else {
            this.logo = str;
        }
        if ((i & 32) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        this.recommendCategory = (i & 64) != 0 ? num2 : 0;
        if ((i & 128) == 0) {
            this.shortDescribe = "";
        } else {
            this.shortDescribe = str3;
        }
        this.socialMediaList = (i & 256) == 0 ? yDY.AhwBna() : list2;
        if ((i & 512) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        this.tagsNameList = (i & 1024) == 0 ? yDY.AhwBna() : list3;
        if ((i & 2048) == 0) {
            this.recommendDeepLink = "";
        } else {
            this.recommendDeepLink = str5;
        }
        if ((i & 4096) == 0) {
            this.recommendIllustrate = "";
        } else {
            this.recommendIllustrate = str6;
        }
        if ((i & 8192) == 0) {
            this.rewardInfo = "";
        } else {
            this.rewardInfo = str7;
        }
        if ((i & 16384) == 0) {
            this.okxDeepLink = "";
        } else {
            this.okxDeepLink = str8;
        }
        if ((32768 & i) == 0) {
            this.recommendInfo = "";
        } else {
            this.recommendInfo = str9;
        }
        if ((65536 & i) == 0) {
            this.recommendColor = "";
        } else {
            this.recommendColor = str10;
        }
        if ((131072 & i) == 0) {
            this.tokenList = null;
        } else {
            this.tokenList = list4;
        }
        if ((262144 & i) == 0) {
            this.metricList = null;
        } else {
            this.metricList = list5;
        }
        if ((i & 524288) == 0) {
            this.securityScore = null;
        } else {
            this.securityScore = str11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=4] */
    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappDetailBean dappDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num2 = dappDetailBean.category) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, dappDetailBean.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(dappDetailBean.chains, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], dappDetailBean.chains);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappDetailBean.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, dappDetailBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dappDetailBean.isFav) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, dappDetailBean.isFav);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dappDetailBean.logo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dappDetailBean.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dappDetailBean.name, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dappDetailBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num = dappDetailBean.recommendCategory) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, dappDetailBean.recommendCategory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dappDetailBean.shortDescribe, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dappDetailBean.shortDescribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(dappDetailBean.socialMediaList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], dappDetailBean.socialMediaList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dappDetailBean.url, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, dappDetailBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(dappDetailBean.tagsNameList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], dappDetailBean.tagsNameList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dappDetailBean.recommendDeepLink, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, dappDetailBean.recommendDeepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dappDetailBean.recommendIllustrate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, dappDetailBean.recommendIllustrate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dappDetailBean.rewardInfo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, dappDetailBean.rewardInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dappDetailBean.okxDeepLink, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, dappDetailBean.okxDeepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) dappDetailBean.recommendInfo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, dappDetailBean.recommendInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) dappDetailBean.recommendColor, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, dappDetailBean.recommendColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || dappDetailBean.tokenList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr[17], dappDetailBean.tokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || dappDetailBean.metricList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, kSerializerArr[18], dappDetailBean.metricList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && dappDetailBean.securityScore == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, dappDetailBean.securityScore);
    }

    public DappDetailBean(Integer num, List<DappChains> list, int i, boolean z, String str, String str2, Integer num2, String str3, List<SocialMedia> list2, String str4, List<String> list3, String str5, String str6, String str7, String str8, String str9, String str10, List<Token> list4, List<Metric> list5, String str11) {
        this.category = num;
        this.chains = list;
        this.id = i;
        this.isFav = z;
        this.logo = str;
        this.name = str2;
        this.recommendCategory = num2;
        this.shortDescribe = str3;
        this.socialMediaList = list2;
        this.url = str4;
        this.tagsNameList = list3;
        this.recommendDeepLink = str5;
        this.recommendIllustrate = str6;
        this.rewardInfo = str7;
        this.okxDeepLink = str8;
        this.recommendInfo = str9;
        this.recommendColor = str10;
        this.tokenList = list4;
        this.metricList = list5;
        this.securityScore = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DappDetailBean(Integer num, List list, int i, boolean z, String str, String str2, Integer num2, String str3, List list2, String str4, List list3, String str5, String str6, String str7, String str8, String str9, String str10, List list4, List list5, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? num : num, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? z : false, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) == 0 ? num2 : 0, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? yDY.AhwBna() : list2, (i2 & 512) != 0 ? "" : str4, (i2 & 1024) != 0 ? yDY.AhwBna() : list3, (i2 & 2048) != 0 ? "" : str5, (i2 & 4096) != 0 ? "" : str6, (i2 & 8192) != 0 ? "" : str7, (i2 & 16384) != 0 ? "" : str8, (i2 & 32768) != 0 ? "" : str9, (i2 & 65536) != 0 ? "" : str10, (i2 & 131072) != 0 ? null : list4, (i2 & 262144) != 0 ? null : list5, (i2 & 524288) == 0 ? str11 : null);
    }

    /* JADX INFO: loaded from: classes14.dex */
    @Serializable
    public static final class Chain implements Parcelable {
        private Integer chainId;
        private String dayTimeIcon;
        private String logo;
        private String nightIcon;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Chain> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<Chain> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Chain createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Chain(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Chain[] newArray(int i) {
                return new Chain[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Chain() {
            this((Integer) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Chain copy$default(Chain chain, Integer num, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                num = chain.chainId;
            }
            if ((i & 2) != 0) {
                str = chain.dayTimeIcon;
            }
            if ((i & 4) != 0) {
                str2 = chain.logo;
            }
            if ((i & 8) != 0) {
                str3 = chain.nightIcon;
            }
            return chain.copy(num, str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.dayTimeIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.nightIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Chain copy(Integer num, String str, String str2, String str3) {
            return new Chain(num, str, str2, str3);
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
            if (!(obj instanceof Chain)) {
                return false;
            }
            Chain chain = (Chain) obj;
            return Intrinsics.EZpvd(this.chainId, chain.chainId) && Intrinsics.EZpvd((Object) this.dayTimeIcon, (Object) chain.dayTimeIcon) && Intrinsics.EZpvd((Object) this.logo, (Object) chain.logo) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) chain.nightIcon);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDayTimeIcon() {
            return this.dayTimeIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLogo() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNightIcon() {
            return this.nightIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.chainId;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.dayTimeIcon;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.logo;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.nightIcon;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChainId(Integer num) {
            this.chainId = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDayTimeIcon(String str) {
            this.dayTimeIcon = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLogo(String str) {
            this.logo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNightIcon(String str) {
            this.nightIcon = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Chain(chainId=" + this.chainId + ", dayTimeIcon=" + this.dayTimeIcon + ", logo=" + this.logo + ", nightIcon=" + this.nightIcon + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer num = this.chainId;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.dayTimeIcon);
            parcel.writeString(this.logo);
            parcel.writeString(this.nightIcon);
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.search.DappDetailBean.Chain.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Chain> serializer() {
                return DappDetailBean$Chain$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Chain(int i, Integer num, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.chainId = (i & 1) == 0 ? 0 : num;
            if ((i & 2) == 0) {
                this.dayTimeIcon = "";
            } else {
                this.dayTimeIcon = str;
            }
            if ((i & 4) == 0) {
                this.logo = "";
            } else {
                this.logo = str2;
            }
            if ((i & 8) == 0) {
                this.nightIcon = "";
            } else {
                this.nightIcon = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(Chain chain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            Integer num;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = chain.chainId) == null || num.intValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, chain.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chain.dayTimeIcon, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, chain.dayTimeIcon);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) chain.logo, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, chain.logo);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) chain.nightIcon, (Object) "")) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, chain.nightIcon);
        }

        public Chain(Integer num, String str, String str2, String str3) {
            this.chainId = num;
            this.dayTimeIcon = str;
            this.logo = str2;
            this.nightIcon = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:39) call: com.okinc.business.defi.dapp.net.search.DappDetailBean.Chain.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Chain(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }
    }

    @Serializable
    public static final class SocialMedia implements Parcelable {
        private String link;
        private String socialMediaDayLogo;
        private String socialMediaName;
        private String socialMediaNightLogo;
        private int type;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SocialMedia> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SocialMedia> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SocialMedia createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SocialMedia(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SocialMedia[] newArray(int i) {
                return new SocialMedia[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SocialMedia copy$default(SocialMedia socialMedia, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = socialMedia.link;
            }
            if ((i2 & 2) != 0) {
                str2 = socialMedia.socialMediaDayLogo;
            }
            String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = socialMedia.socialMediaNightLogo;
            }
            String str6 = str3;
            if ((i2 & 8) != 0) {
                str4 = socialMedia.socialMediaName;
            }
            String str7 = str4;
            if ((i2 & 16) != 0) {
                i = socialMedia.type;
            }
            return socialMedia.copy(str, str5, str6, str7, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.link;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.socialMediaDayLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.socialMediaNightLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.socialMediaName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SocialMedia copy(String str, String str2, String str3, String str4, int i) {
            return new SocialMedia(str, str2, str3, str4, i);
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
            if (!(obj instanceof SocialMedia)) {
                return false;
            }
            SocialMedia socialMedia = (SocialMedia) obj;
            return Intrinsics.EZpvd((Object) this.link, (Object) socialMedia.link) && Intrinsics.EZpvd((Object) this.socialMediaDayLogo, (Object) socialMedia.socialMediaDayLogo) && Intrinsics.EZpvd((Object) this.socialMediaNightLogo, (Object) socialMedia.socialMediaNightLogo) && Intrinsics.EZpvd((Object) this.socialMediaName, (Object) socialMedia.socialMediaName) && this.type == socialMedia.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLink() {
            return this.link;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSocialMediaDayLogo() {
            return this.socialMediaDayLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSocialMediaName() {
            return this.socialMediaName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSocialMediaNightLogo() {
            return this.socialMediaNightLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.link;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.socialMediaDayLogo;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.socialMediaNightLogo;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.socialMediaName;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLink(String str) {
            this.link = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSocialMediaDayLogo(String str) {
            this.socialMediaDayLogo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSocialMediaName(String str) {
            this.socialMediaName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSocialMediaNightLogo(String str) {
            this.socialMediaNightLogo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setType(int i) {
            this.type = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SocialMedia(link=" + this.link + ", socialMediaDayLogo=" + this.socialMediaDayLogo + ", socialMediaNightLogo=" + this.socialMediaNightLogo + ", socialMediaName=" + this.socialMediaName + ", type=" + this.type + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.link);
            parcel.writeString(this.socialMediaDayLogo);
            parcel.writeString(this.socialMediaNightLogo);
            parcel.writeString(this.socialMediaName);
            parcel.writeInt(this.type);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.search.DappDetailBean.SocialMedia.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SocialMedia> serializer() {
                return DappDetailBean$SocialMedia$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SocialMedia(int i, String str, String str2, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (16 != (i & 16)) {
                PluginExceptionsKt.throwMissingFieldException(i, 16, DappDetailBean$SocialMedia$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.link = "";
            } else {
                this.link = str;
            }
            if ((i & 2) == 0) {
                this.socialMediaDayLogo = "";
            } else {
                this.socialMediaDayLogo = str2;
            }
            if ((i & 4) == 0) {
                this.socialMediaNightLogo = "";
            } else {
                this.socialMediaNightLogo = str3;
            }
            if ((i & 8) == 0) {
                this.socialMediaName = "";
            } else {
                this.socialMediaName = str4;
            }
            this.type = i2;
        }

        public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(SocialMedia socialMedia, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) socialMedia.link, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, socialMedia.link);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) socialMedia.socialMediaDayLogo, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, socialMedia.socialMediaDayLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) socialMedia.socialMediaNightLogo, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, socialMedia.socialMediaNightLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) socialMedia.socialMediaName, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, socialMedia.socialMediaName);
            }
            compositeEncoder.encodeIntElement(serialDescriptor, 4, socialMedia.type);
        }

        public SocialMedia(String str, String str2, String str3, String str4, int i) {
            this.link = str;
            this.socialMediaDayLogo = str2;
            this.socialMediaNightLogo = str3;
            this.socialMediaName = str4;
            this.type = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 int)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:50) call: com.okinc.business.defi.dapp.net.search.DappDetailBean.SocialMedia.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
        public /* synthetic */ SocialMedia(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, i);
        }
    }

    @Serializable
    public static final class Token implements Parcelable {
        private String chainId;
        private String tokenAddress;
        private String tokenChange;
        private String tokenLogo;
        private String tokenName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Token> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Token> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Token(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Token() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Token copy$default(Token token, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = token.tokenName;
            }
            if ((i & 2) != 0) {
                str2 = token.tokenChange;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = token.tokenAddress;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = token.chainId;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = token.tokenLogo;
            }
            return token.copy(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenChange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Token copy(String str, String str2, String str3, String str4, String str5) {
            return new Token(str, str2, str3, str4, str5);
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
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            return Intrinsics.EZpvd((Object) this.tokenName, (Object) token.tokenName) && Intrinsics.EZpvd((Object) this.tokenChange, (Object) token.tokenChange) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) token.tokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) token.chainId) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) token.tokenLogo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenChange() {
            return this.tokenChange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenLogo() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenName() {
            return this.tokenName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.tokenName;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.tokenChange;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.tokenAddress;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.chainId;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.tokenLogo;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChainId(String str) {
            this.chainId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTokenAddress(String str) {
            this.tokenAddress = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTokenChange(String str) {
            this.tokenChange = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTokenLogo(String str) {
            this.tokenLogo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTokenName(String str) {
            this.tokenName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Token(tokenName=" + this.tokenName + ", tokenChange=" + this.tokenChange + ", tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ", tokenLogo=" + this.tokenLogo + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.tokenName);
            parcel.writeString(this.tokenChange);
            parcel.writeString(this.tokenAddress);
            parcel.writeString(this.chainId);
            parcel.writeString(this.tokenLogo);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.search.DappDetailBean.Token.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Token> serializer() {
                return DappDetailBean$Token$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Token(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tokenName = "";
            } else {
                this.tokenName = str;
            }
            if ((i & 2) == 0) {
                this.tokenChange = "";
            } else {
                this.tokenChange = str2;
            }
            if ((i & 4) == 0) {
                this.tokenAddress = "";
            } else {
                this.tokenAddress = str3;
            }
            if ((i & 8) == 0) {
                this.chainId = "";
            } else {
                this.chainId = str4;
            }
            if ((i & 16) == 0) {
                this.tokenLogo = "";
            } else {
                this.tokenLogo = str5;
            }
        }

        public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(Token token, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) token.tokenName, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, token.tokenName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) token.tokenChange, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, token.tokenChange);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) token.tokenAddress, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, token.tokenAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) token.chainId, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, token.chainId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) token.tokenLogo, (Object) "")) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, token.tokenLogo);
        }

        public Token(String str, String str2, String str3, String str4, String str5) {
            this.tokenName = str;
            this.tokenChange = str2;
            this.tokenAddress = str3;
            this.chainId = str4;
            this.tokenLogo = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:61) call: com.okinc.business.defi.dapp.net.search.DappDetailBean.Token.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Token(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
        }
    }

    @Serializable
    public static final class Metric implements Parcelable {
        private String changeIn24h;
        private String name;
        private String value;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Metric> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Metric> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Metric createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Metric(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Metric[] newArray(int i) {
                return new Metric[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Metric() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Metric copy$default(Metric metric, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metric.name;
            }
            if ((i & 2) != 0) {
                str2 = metric.value;
            }
            if ((i & 4) != 0) {
                str3 = metric.changeIn24h;
            }
            return metric.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.changeIn24h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Metric copy(String str, String str2, String str3) {
            return new Metric(str, str2, str3);
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
            if (!(obj instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) obj;
            return Intrinsics.EZpvd((Object) this.name, (Object) metric.name) && Intrinsics.EZpvd((Object) this.value, (Object) metric.value) && Intrinsics.EZpvd((Object) this.changeIn24h, (Object) metric.changeIn24h);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChangeIn24h() {
            return this.changeIn24h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.name;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.value;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.changeIn24h;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChangeIn24h(String str) {
            this.changeIn24h = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setName(String str) {
            this.name = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setValue(String str) {
            this.value = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Metric(name=" + this.name + ", value=" + this.value + ", changeIn24h=" + this.changeIn24h + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.changeIn24h);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.search.DappDetailBean.Metric.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Metric> serializer() {
                return DappDetailBean$Metric$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Metric(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.name = "";
            } else {
                this.name = str;
            }
            if ((i & 2) == 0) {
                this.value = "";
            } else {
                this.value = str2;
            }
            if ((i & 4) == 0) {
                this.changeIn24h = null;
            } else {
                this.changeIn24h = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(Metric metric, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) metric.name, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, metric.name);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) metric.value, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, metric.value);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && metric.changeIn24h == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, metric.changeIn24h);
        }

        public Metric(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.changeIn24h = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:72) call: com.okinc.business.defi.dapp.net.search.DappDetailBean.Metric.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Metric(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
        }
    }
}
