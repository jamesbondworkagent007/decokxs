package com.okinc.market.common.biz_spot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AnnounceDetail implements Parcelable {
    private String blockBrowser;
    private String brief;
    private String classification;
    private String currencyId;
    private String facebook;
    private long flowTotal;
    private String fullName;
    private String github;
    private String icon;
    private String introduce;
    private String investor;
    private ArrayList<Investors> investors;
    private long issueTime;
    private String issueTotal;
    private String link;
    private ArrayList<Members> members;
    private String officialUrl;
    private String project;
    private String projectId;
    private String status;
    private String telegram;
    private String title;
    private String twitter;
    private String weChat;
    private String whitePaper;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AnnounceDetail> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(Investors$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(Members$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<AnnounceDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnounceDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new AnnounceDetail();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnounceDetail[] newArray(int i) {
            return new AnnounceDetail[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockBrowser() {
        return this.blockBrowser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrief() {
        return this.brief;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClassification() {
        return this.classification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFacebook() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFlowTotal() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGithub() {
        return this.github;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestor() {
        return this.investor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Investors> getInvestors() {
        return this.investors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getIssueTime() {
        return this.issueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssueTotal() {
        return this.issueTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Members> getMembers() {
        return this.members;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialUrl() {
        return this.officialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProject() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTelegram() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwitter() {
        return this.twitter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeChat() {
        return this.weChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWhitePaper() {
        return this.whitePaper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlockBrowser(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.blockBrowser = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrief(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.brief = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClassification(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.classification = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFacebook(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.facebook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlowTotal(long j) {
        this.flowTotal = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGithub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.github = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntroduce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.introduce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestors(ArrayList<Investors> arrayList) {
        this.investors = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIssueTime(long j) {
        this.issueTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIssueTotal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.issueTotal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.link = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMembers(ArrayList<Members> arrayList) {
        this.members = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfficialUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.officialUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.project = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.projectId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTelegram(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.telegram = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTwitter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.twitter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeChat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.weChat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWhitePaper(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.whitePaper = str;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.AnnounceDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnnounceDetail> serializer() {
            return AnnounceDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnnounceDetail(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, ArrayList arrayList, String str8, long j2, String str9, String str10, ArrayList arrayList2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.brief = "";
        } else {
            this.brief = str;
        }
        if ((i & 2) == 0) {
            this.classification = "";
        } else {
            this.classification = str2;
        }
        if ((i & 4) == 0) {
            this.facebook = "";
        } else {
            this.facebook = str3;
        }
        if ((i & 8) == 0) {
            this.flowTotal = 0L;
        } else {
            this.flowTotal = j;
        }
        if ((i & 16) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str4;
        }
        if ((i & 32) == 0) {
            this.github = "";
        } else {
            this.github = str5;
        }
        if ((i & 64) == 0) {
            this.icon = "";
        } else {
            this.icon = str6;
        }
        if ((i & 128) == 0) {
            this.introduce = "";
        } else {
            this.introduce = str7;
        }
        if ((i & 256) == 0) {
            this.investors = null;
        } else {
            this.investors = arrayList;
        }
        if ((i & 512) == 0) {
            this.investor = "";
        } else {
            this.investor = str8;
        }
        this.issueTime = (i & 1024) != 0 ? j2 : 0L;
        if ((i & 2048) == 0) {
            this.issueTotal = "";
        } else {
            this.issueTotal = str9;
        }
        if ((i & 4096) == 0) {
            this.link = "";
        } else {
            this.link = str10;
        }
        if ((i & 8192) == 0) {
            this.members = null;
        } else {
            this.members = arrayList2;
        }
        if ((i & 16384) == 0) {
            this.officialUrl = "";
        } else {
            this.officialUrl = str11;
        }
        if ((32768 & i) == 0) {
            this.project = "";
        } else {
            this.project = str12;
        }
        if ((65536 & i) == 0) {
            this.projectId = "";
        } else {
            this.projectId = str13;
        }
        if ((131072 & i) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str14;
        }
        if ((262144 & i) == 0) {
            this.status = "";
        } else {
            this.status = str15;
        }
        if ((524288 & i) == 0) {
            this.telegram = "";
        } else {
            this.telegram = str16;
        }
        if ((1048576 & i) == 0) {
            this.title = "";
        } else {
            this.title = str17;
        }
        if ((2097152 & i) == 0) {
            this.twitter = "";
        } else {
            this.twitter = str18;
        }
        if ((4194304 & i) == 0) {
            this.weChat = "";
        } else {
            this.weChat = str19;
        }
        if ((8388608 & i) == 0) {
            this.whitePaper = "";
        } else {
            this.whitePaper = str20;
        }
        if ((i & 16777216) == 0) {
            this.blockBrowser = "";
        } else {
            this.blockBrowser = str21;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(AnnounceDetail announceDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) announceDetail.brief, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, announceDetail.brief);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) announceDetail.classification, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, announceDetail.classification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) announceDetail.facebook, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, announceDetail.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || announceDetail.flowTotal != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, announceDetail.flowTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) announceDetail.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, announceDetail.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) announceDetail.github, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, announceDetail.github);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) announceDetail.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, announceDetail.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) announceDetail.introduce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, announceDetail.introduce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || announceDetail.investors != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], announceDetail.investors);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) announceDetail.investor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, announceDetail.investor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || announceDetail.issueTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 10, announceDetail.issueTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) announceDetail.issueTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, announceDetail.issueTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) announceDetail.link, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, announceDetail.link);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || announceDetail.members != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], announceDetail.members);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) announceDetail.officialUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, announceDetail.officialUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) announceDetail.project, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, announceDetail.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) announceDetail.projectId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, announceDetail.projectId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) announceDetail.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, announceDetail.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) announceDetail.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, announceDetail.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) announceDetail.telegram, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, announceDetail.telegram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) announceDetail.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, announceDetail.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) announceDetail.twitter, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, announceDetail.twitter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) announceDetail.weChat, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, announceDetail.weChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) announceDetail.whitePaper, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, announceDetail.whitePaper);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) && Intrinsics.EZpvd((Object) announceDetail.blockBrowser, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 24, announceDetail.blockBrowser);
    }

    public AnnounceDetail() {
        this.brief = "";
        this.classification = "";
        this.facebook = "";
        this.fullName = "";
        this.github = "";
        this.icon = "";
        this.introduce = "";
        this.investor = "";
        this.issueTotal = "";
        this.link = "";
        this.officialUrl = "";
        this.project = "";
        this.projectId = "";
        this.currencyId = "";
        this.status = "";
        this.telegram = "";
        this.title = "";
        this.twitter = "";
        this.weChat = "";
        this.whitePaper = "";
        this.blockBrowser = "";
    }
}
