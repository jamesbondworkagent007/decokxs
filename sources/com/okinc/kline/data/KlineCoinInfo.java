package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.market.common.biz_spot.AnnounceDetail;
import com.okinc.market.common.biz_spot.AnnounceDetail$$serializer;
import com.okinc.market.common.biz_spot.Members;
import com.okinc.market.common.biz_spot.Members$$serializer;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineCoinInfo implements Parcelable {
    private ArrayList<AgencySource> agency;
    private AnnounceDetail announceDetail;
    private ArrayList<Allot> coinAllot;
    private String flowTotal;
    private String fullName;
    private String hisHighPrice;
    private String hisHighPriceTs;
    private String hisLowPrice;
    private String hisLowPriceTs;
    private String hotRank;
    private String icon;
    private String industry;
    private String introduce;
    private String issuePrice;
    private String issueTime;
    private String marCap;
    private String marCapPer;
    private String marketCap;
    private String marketCapRank;
    private String maxSup;
    private String maxSupMar;
    private ArrayList<Members> members;
    private NarrativeItem narrative;
    private String project;
    private ArrayList<String> pubChain;
    private String selNumPer;
    private ArrayList<SocialMediaItem> socialMediaList;
    private boolean supportTokenUnlock;
    private String volumeMarketCapRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlineCoinInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, new ArrayListSerializer(Allot$$serializer.INSTANCE), new ArrayListSerializer(AgencySource$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(SocialMediaItem$$serializer.INSTANCE), new ArrayListSerializer(Members$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<KlineCoinInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineCoinInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new KlineCoinInfo();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineCoinInfo[] newArray(int i) {
            return new KlineCoinInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AgencySource> getAgency() {
        return this.agency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnounceDetail getAnnounceDetail() {
        return this.announceDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Allot> getCoinAllot() {
        return this.coinAllot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlowTotal() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHisHighPrice() {
        return this.hisHighPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHisHighPriceTs() {
        return this.hisHighPriceTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHisLowPrice() {
        return this.hisLowPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHisLowPriceTs() {
        return this.hisLowPriceTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotRank() {
        return this.hotRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndustry() {
        return this.industry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssuePrice() {
        return this.issuePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssueTime() {
        return this.issueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarCap() {
        return this.marCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarCapPer() {
        return this.marCapPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapRank() {
        return this.marketCapRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSup() {
        return this.maxSup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSupMar() {
        return this.maxSupMar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Members> getMembers() {
        return this.members;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NarrativeItem getNarrative() {
        return this.narrative;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProject() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getPubChain() {
        return this.pubChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelNumPer() {
        return this.selNumPer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SocialMediaItem> getSocialMediaList() {
        return this.socialMediaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportTokenUnlock() {
        return this.supportTokenUnlock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeMarketCapRatio() {
        return this.volumeMarketCapRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAgency(ArrayList<AgencySource> arrayList) {
        this.agency = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnounceDetail(AnnounceDetail announceDetail) {
        this.announceDetail = announceDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAllot(ArrayList<Allot> arrayList) {
        this.coinAllot = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlowTotal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.flowTotal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHisHighPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hisHighPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHisHighPriceTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hisHighPriceTs = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHisLowPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hisLowPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHisLowPriceTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hisLowPriceTs = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotRank(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hotRank = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndustry(String str) {
        this.industry = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntroduce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.introduce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIssuePrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issuePrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIssueTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issueTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarCap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarCapPer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marCapPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketCap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marketCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketCapRank(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marketCapRank = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSup(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSup = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSupMar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxSupMar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMembers(ArrayList<Members> arrayList) {
        this.members = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNarrative(NarrativeItem narrativeItem) {
        this.narrative = narrativeItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.project = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPubChain(ArrayList<String> arrayList) {
        this.pubChain = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelNumPer(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.selNumPer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSocialMediaList(ArrayList<SocialMediaItem> arrayList) {
        this.socialMediaList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportTokenUnlock(boolean z) {
        this.supportTokenUnlock = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolumeMarketCapRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volumeMarketCapRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.data.KlineCoinInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineCoinInfo> serializer() {
            return KlineCoinInfo$$serializer.INSTANCE;
        }
    }

    public KlineCoinInfo() {
        this.hotRank = "";
        this.marCapPer = "";
        this.selNumPer = "";
        this.hisHighPrice = "";
        this.hisHighPriceTs = "";
        this.hisLowPrice = "";
        this.hisLowPriceTs = "";
        this.pubChain = new ArrayList<>();
        this.maxSup = "";
        this.maxSupMar = "";
        this.coinAllot = new ArrayList<>();
        this.agency = new ArrayList<>();
        this.introduce = "";
        this.volumeMarketCapRatio = "";
        this.icon = "";
        this.project = "";
        this.fullName = "";
        this.marketCapRank = "";
        this.marCap = "";
        this.issueTime = "";
        this.flowTotal = "";
        this.marketCap = "";
        this.issuePrice = "";
        this.industry = "";
    }

    public /* synthetic */ KlineCoinInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, String str8, String str9, ArrayList arrayList2, ArrayList arrayList3, AnnounceDetail announceDetail, String str10, NarrativeItem narrativeItem, ArrayList arrayList4, ArrayList arrayList5, String str11, String str12, String str13, String str14, boolean z, String str15, String str16, String str17, String str18, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.hotRank = "";
        } else {
            this.hotRank = str;
        }
        if ((i & 2) == 0) {
            this.marCapPer = "";
        } else {
            this.marCapPer = str2;
        }
        if ((i & 4) == 0) {
            this.selNumPer = "";
        } else {
            this.selNumPer = str3;
        }
        if ((i & 8) == 0) {
            this.hisHighPrice = "";
        } else {
            this.hisHighPrice = str4;
        }
        if ((i & 16) == 0) {
            this.hisHighPriceTs = "";
        } else {
            this.hisHighPriceTs = str5;
        }
        if ((i & 32) == 0) {
            this.hisLowPrice = "";
        } else {
            this.hisLowPrice = str6;
        }
        if ((i & 64) == 0) {
            this.hisLowPriceTs = "";
        } else {
            this.hisLowPriceTs = str7;
        }
        this.pubChain = (i & 128) == 0 ? new ArrayList() : arrayList;
        if ((i & 256) == 0) {
            this.maxSup = "";
        } else {
            this.maxSup = str8;
        }
        if ((i & 512) == 0) {
            this.maxSupMar = "";
        } else {
            this.maxSupMar = str9;
        }
        this.coinAllot = (i & 1024) == 0 ? new ArrayList() : arrayList2;
        this.agency = (i & 2048) == 0 ? new ArrayList() : arrayList3;
        if ((i & 4096) == 0) {
            this.announceDetail = null;
        } else {
            this.announceDetail = announceDetail;
        }
        if ((i & 8192) == 0) {
            this.introduce = "";
        } else {
            this.introduce = str10;
        }
        if ((i & 16384) == 0) {
            this.narrative = null;
        } else {
            this.narrative = narrativeItem;
        }
        if ((32768 & i) == 0) {
            this.socialMediaList = null;
        } else {
            this.socialMediaList = arrayList4;
        }
        if ((65536 & i) == 0) {
            this.members = null;
        } else {
            this.members = arrayList5;
        }
        if ((131072 & i) == 0) {
            this.volumeMarketCapRatio = "";
        } else {
            this.volumeMarketCapRatio = str11;
        }
        if ((262144 & i) == 0) {
            this.icon = "";
        } else {
            this.icon = str12;
        }
        if ((524288 & i) == 0) {
            this.project = "";
        } else {
            this.project = str13;
        }
        if ((1048576 & i) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str14;
        }
        this.supportTokenUnlock = (2097152 & i) == 0 ? false : z;
        if ((4194304 & i) == 0) {
            this.marketCapRank = "";
        } else {
            this.marketCapRank = str15;
        }
        if ((8388608 & i) == 0) {
            this.marCap = "";
        } else {
            this.marCap = str16;
        }
        if ((16777216 & i) == 0) {
            this.issueTime = "";
        } else {
            this.issueTime = str17;
        }
        if ((33554432 & i) == 0) {
            this.flowTotal = "";
        } else {
            this.flowTotal = str18;
        }
        if ((67108864 & i) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str19;
        }
        if ((134217728 & i) == 0) {
            this.issuePrice = "";
        } else {
            this.issuePrice = str20;
        }
        if ((i & 268435456) == 0) {
            this.industry = "";
        } else {
            this.industry = str21;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [17=4] */
    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(KlineCoinInfo klineCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) klineCoinInfo.hotRank, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, klineCoinInfo.hotRank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) klineCoinInfo.marCapPer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, klineCoinInfo.marCapPer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) klineCoinInfo.selNumPer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, klineCoinInfo.selNumPer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) klineCoinInfo.hisHighPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, klineCoinInfo.hisHighPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) klineCoinInfo.hisHighPriceTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, klineCoinInfo.hisHighPriceTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) klineCoinInfo.hisLowPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, klineCoinInfo.hisLowPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) klineCoinInfo.hisLowPriceTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, klineCoinInfo.hisLowPriceTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(klineCoinInfo.pubChain, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], klineCoinInfo.pubChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) klineCoinInfo.maxSup, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, klineCoinInfo.maxSup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) klineCoinInfo.maxSupMar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, klineCoinInfo.maxSupMar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(klineCoinInfo.coinAllot, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], klineCoinInfo.coinAllot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(klineCoinInfo.agency, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], klineCoinInfo.agency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || klineCoinInfo.announceDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, AnnounceDetail$$serializer.INSTANCE, klineCoinInfo.announceDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) klineCoinInfo.introduce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, klineCoinInfo.introduce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || klineCoinInfo.narrative != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, NarrativeItem$$serializer.INSTANCE, klineCoinInfo.narrative);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || klineCoinInfo.socialMediaList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], klineCoinInfo.socialMediaList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || klineCoinInfo.members != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], klineCoinInfo.members);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) klineCoinInfo.volumeMarketCapRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, klineCoinInfo.volumeMarketCapRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) klineCoinInfo.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, klineCoinInfo.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) klineCoinInfo.project, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, klineCoinInfo.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) klineCoinInfo.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, klineCoinInfo.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || klineCoinInfo.supportTokenUnlock) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, klineCoinInfo.supportTokenUnlock);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) klineCoinInfo.marketCapRank, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, klineCoinInfo.marketCapRank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) klineCoinInfo.marCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, klineCoinInfo.marCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) klineCoinInfo.issueTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, klineCoinInfo.issueTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) klineCoinInfo.flowTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, klineCoinInfo.flowTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) klineCoinInfo.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, klineCoinInfo.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) klineCoinInfo.issuePrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, klineCoinInfo.issuePrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && Intrinsics.EZpvd((Object) klineCoinInfo.industry, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, klineCoinInfo.industry);
    }
}
