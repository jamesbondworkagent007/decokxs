package com.okinc.crcore.coreapi.net.responsebean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AnnounceDetailResponseBean {
    private final String blockBrowser;
    private final String brief;
    private final String classification;
    private final String classificationId;
    private final String currencyId;
    private final String esgUrl;
    private final String facebook;
    private final long flowTotal;
    private final String fullName;
    private final String github;
    private final String icon;
    private final String introduce;
    private final String investor;
    private final ArrayList<InvestorsApiModel> investors;
    private final long issueTime;
    private final String issueTotal;
    private final String link;
    private final ArrayList<MembersResponseBean> members;
    private final String officialUrl;
    private final String project;
    private final String projectId;
    private final boolean showEsgLink;
    private final boolean showWarningText;
    private final String status;
    private final String telegram;
    private final String title;
    private final String twitter;
    private final String weChat;
    private final String whitePaper;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestorsApiModel$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(MembersResponseBean$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnounceDetailResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, 0L, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, 536870911, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.brief;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<InvestorsApiModel> component10() {
        return this.investors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.investor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component12() {
        return this.issueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.issueTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<MembersResponseBean> component15() {
        return this.members;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.officialUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.project;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.classification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.telegram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.twitter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.weChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.whitePaper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.blockBrowser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.showWarningText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.showEsgLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.esgUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.classificationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.facebook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.github;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnnounceDetailResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull ArrayList<InvestorsApiModel> arrayList, @NotNull String str9, long j2, @NotNull String str10, @NotNull String str11, @NotNull ArrayList<MembersResponseBean> arrayList2, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z, boolean z2, @NotNull String str23) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        return new AnnounceDetailResponseBean(str, str2, str3, str4, j, str5, str6, str7, str8, arrayList, str9, j2, str10, str11, arrayList2, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, z, z2, str23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnounceDetailResponseBean)) {
            return false;
        }
        AnnounceDetailResponseBean announceDetailResponseBean = (AnnounceDetailResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.brief, (Object) announceDetailResponseBean.brief) && Intrinsics.EZpvd((Object) this.classification, (Object) announceDetailResponseBean.classification) && Intrinsics.EZpvd((Object) this.classificationId, (Object) announceDetailResponseBean.classificationId) && Intrinsics.EZpvd((Object) this.facebook, (Object) announceDetailResponseBean.facebook) && this.flowTotal == announceDetailResponseBean.flowTotal && Intrinsics.EZpvd((Object) this.fullName, (Object) announceDetailResponseBean.fullName) && Intrinsics.EZpvd((Object) this.github, (Object) announceDetailResponseBean.github) && Intrinsics.EZpvd((Object) this.icon, (Object) announceDetailResponseBean.icon) && Intrinsics.EZpvd((Object) this.introduce, (Object) announceDetailResponseBean.introduce) && Intrinsics.EZpvd(this.investors, announceDetailResponseBean.investors) && Intrinsics.EZpvd((Object) this.investor, (Object) announceDetailResponseBean.investor) && this.issueTime == announceDetailResponseBean.issueTime && Intrinsics.EZpvd((Object) this.issueTotal, (Object) announceDetailResponseBean.issueTotal) && Intrinsics.EZpvd((Object) this.link, (Object) announceDetailResponseBean.link) && Intrinsics.EZpvd(this.members, announceDetailResponseBean.members) && Intrinsics.EZpvd((Object) this.officialUrl, (Object) announceDetailResponseBean.officialUrl) && Intrinsics.EZpvd((Object) this.project, (Object) announceDetailResponseBean.project) && Intrinsics.EZpvd((Object) this.projectId, (Object) announceDetailResponseBean.projectId) && Intrinsics.EZpvd((Object) this.currencyId, (Object) announceDetailResponseBean.currencyId) && Intrinsics.EZpvd((Object) this.status, (Object) announceDetailResponseBean.status) && Intrinsics.EZpvd((Object) this.telegram, (Object) announceDetailResponseBean.telegram) && Intrinsics.EZpvd((Object) this.title, (Object) announceDetailResponseBean.title) && Intrinsics.EZpvd((Object) this.twitter, (Object) announceDetailResponseBean.twitter) && Intrinsics.EZpvd((Object) this.weChat, (Object) announceDetailResponseBean.weChat) && Intrinsics.EZpvd((Object) this.whitePaper, (Object) announceDetailResponseBean.whitePaper) && Intrinsics.EZpvd((Object) this.blockBrowser, (Object) announceDetailResponseBean.blockBrowser) && this.showWarningText == announceDetailResponseBean.showWarningText && this.showEsgLink == announceDetailResponseBean.showEsgLink && Intrinsics.EZpvd((Object) this.esgUrl, (Object) announceDetailResponseBean.esgUrl);
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
    public final String getClassificationId() {
        return this.classificationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEsgUrl() {
        return this.esgUrl;
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
    public final ArrayList<InvestorsApiModel> getInvestors() {
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
    public final ArrayList<MembersResponseBean> getMembers() {
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
    public final boolean getShowEsgLink() {
        return this.showEsgLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowWarningText() {
        return this.showWarningText;
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
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((this.brief.hashCode() * 31) + this.classification.hashCode()) * 31) + this.classificationId.hashCode()) * 31) + this.facebook.hashCode()) * 31) + Long.hashCode(this.flowTotal)) * 31) + this.fullName.hashCode()) * 31) + this.github.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.introduce.hashCode()) * 31) + this.investors.hashCode()) * 31) + this.investor.hashCode()) * 31) + Long.hashCode(this.issueTime)) * 31) + this.issueTotal.hashCode()) * 31) + this.link.hashCode()) * 31) + this.members.hashCode()) * 31) + this.officialUrl.hashCode()) * 31) + this.project.hashCode()) * 31) + this.projectId.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.status.hashCode()) * 31) + this.telegram.hashCode()) * 31) + this.title.hashCode()) * 31) + this.twitter.hashCode()) * 31) + this.weChat.hashCode()) * 31) + this.whitePaper.hashCode()) * 31) + this.blockBrowser.hashCode()) * 31) + Boolean.hashCode(this.showWarningText)) * 31) + Boolean.hashCode(this.showEsgLink)) * 31) + this.esgUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AnnounceDetailResponseBean(brief=" + this.brief + ", classification=" + this.classification + ", classificationId=" + this.classificationId + ", facebook=" + this.facebook + ", flowTotal=" + this.flowTotal + ", fullName=" + this.fullName + ", github=" + this.github + ", icon=" + this.icon + ", introduce=" + this.introduce + ", investors=" + this.investors + ", investor=" + this.investor + ", issueTime=" + this.issueTime + ", issueTotal=" + this.issueTotal + ", link=" + this.link + ", members=" + this.members + ", officialUrl=" + this.officialUrl + ", project=" + this.project + ", projectId=" + this.projectId + ", currencyId=" + this.currencyId + ", status=" + this.status + ", telegram=" + this.telegram + ", title=" + this.title + ", twitter=" + this.twitter + ", weChat=" + this.weChat + ", whitePaper=" + this.whitePaper + ", blockBrowser=" + this.blockBrowser + ", showWarningText=" + this.showWarningText + ", showEsgLink=" + this.showEsgLink + ", esgUrl=" + this.esgUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.AnnounceDetailResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AnnounceDetailResponseBean> serializer() {
            return AnnounceDetailResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnnounceDetailResponseBean(int i, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, ArrayList arrayList, String str9, long j2, String str10, String str11, ArrayList arrayList2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z, boolean z2, String str23, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.classificationId = "";
        } else {
            this.classificationId = str3;
        }
        if ((i & 8) == 0) {
            this.facebook = "";
        } else {
            this.facebook = str4;
        }
        if ((i & 16) == 0) {
            this.flowTotal = 0L;
        } else {
            this.flowTotal = j;
        }
        if ((i & 32) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str5;
        }
        if ((i & 64) == 0) {
            this.github = "";
        } else {
            this.github = str6;
        }
        if ((i & 128) == 0) {
            this.icon = "";
        } else {
            this.icon = str7;
        }
        if ((i & 256) == 0) {
            this.introduce = "";
        } else {
            this.introduce = str8;
        }
        this.investors = (i & 512) == 0 ? new ArrayList() : arrayList;
        if ((i & 1024) == 0) {
            this.investor = "";
        } else {
            this.investor = str9;
        }
        this.issueTime = (i & 2048) != 0 ? j2 : 0L;
        if ((i & 4096) == 0) {
            this.issueTotal = "";
        } else {
            this.issueTotal = str10;
        }
        if ((i & 8192) == 0) {
            this.link = "";
        } else {
            this.link = str11;
        }
        this.members = (i & 16384) == 0 ? new ArrayList() : arrayList2;
        if ((32768 & i) == 0) {
            this.officialUrl = "";
        } else {
            this.officialUrl = str12;
        }
        if ((65536 & i) == 0) {
            this.project = "";
        } else {
            this.project = str13;
        }
        if ((131072 & i) == 0) {
            this.projectId = "";
        } else {
            this.projectId = str14;
        }
        if ((262144 & i) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str15;
        }
        if ((524288 & i) == 0) {
            this.status = "";
        } else {
            this.status = str16;
        }
        if ((1048576 & i) == 0) {
            this.telegram = "";
        } else {
            this.telegram = str17;
        }
        if ((2097152 & i) == 0) {
            this.title = "";
        } else {
            this.title = str18;
        }
        if ((4194304 & i) == 0) {
            this.twitter = "";
        } else {
            this.twitter = str19;
        }
        if ((8388608 & i) == 0) {
            this.weChat = "";
        } else {
            this.weChat = str20;
        }
        if ((16777216 & i) == 0) {
            this.whitePaper = "";
        } else {
            this.whitePaper = str21;
        }
        if ((33554432 & i) == 0) {
            this.blockBrowser = "";
        } else {
            this.blockBrowser = str22;
        }
        if ((67108864 & i) == 0) {
            this.showWarningText = false;
        } else {
            this.showWarningText = z;
        }
        if ((134217728 & i) == 0) {
            this.showEsgLink = false;
        } else {
            this.showEsgLink = z2;
        }
        if ((i & 268435456) == 0) {
            this.esgUrl = "";
        } else {
            this.esgUrl = str23;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(AnnounceDetailResponseBean announceDetailResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.brief, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, announceDetailResponseBean.brief);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.classification, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, announceDetailResponseBean.classification);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.classificationId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, announceDetailResponseBean.classificationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.facebook, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, announceDetailResponseBean.facebook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || announceDetailResponseBean.flowTotal != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, announceDetailResponseBean.flowTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, announceDetailResponseBean.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.github, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, announceDetailResponseBean.github);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, announceDetailResponseBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.introduce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, announceDetailResponseBean.introduce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(announceDetailResponseBean.investors, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], announceDetailResponseBean.investors);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.investor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, announceDetailResponseBean.investor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || announceDetailResponseBean.issueTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 11, announceDetailResponseBean.issueTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.issueTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, announceDetailResponseBean.issueTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.link, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, announceDetailResponseBean.link);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(announceDetailResponseBean.members, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], announceDetailResponseBean.members);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.officialUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, announceDetailResponseBean.officialUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.project, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, announceDetailResponseBean.project);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.projectId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, announceDetailResponseBean.projectId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, announceDetailResponseBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, announceDetailResponseBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.telegram, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, announceDetailResponseBean.telegram);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, announceDetailResponseBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.twitter, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, announceDetailResponseBean.twitter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.weChat, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, announceDetailResponseBean.weChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.whitePaper, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, announceDetailResponseBean.whitePaper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) announceDetailResponseBean.blockBrowser, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, announceDetailResponseBean.blockBrowser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || announceDetailResponseBean.showWarningText) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, announceDetailResponseBean.showWarningText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || announceDetailResponseBean.showEsgLink) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, announceDetailResponseBean.showEsgLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && Intrinsics.EZpvd((Object) announceDetailResponseBean.esgUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 28, announceDetailResponseBean.esgUrl);
    }

    public AnnounceDetailResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull ArrayList<InvestorsApiModel> arrayList, @NotNull String str9, long j2, @NotNull String str10, @NotNull String str11, @NotNull ArrayList<MembersResponseBean> arrayList2, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z, boolean z2, @NotNull String str23) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        this.brief = str;
        this.classification = str2;
        this.classificationId = str3;
        this.facebook = str4;
        this.flowTotal = j;
        this.fullName = str5;
        this.github = str6;
        this.icon = str7;
        this.introduce = str8;
        this.investors = arrayList;
        this.investor = str9;
        this.issueTime = j2;
        this.issueTotal = str10;
        this.link = str11;
        this.members = arrayList2;
        this.officialUrl = str12;
        this.project = str13;
        this.projectId = str14;
        this.currencyId = str15;
        this.status = str16;
        this.telegram = str17;
        this.title = str18;
        this.twitter = str19;
        this.weChat = str20;
        this.whitePaper = str21;
        this.blockBrowser = str22;
        this.showWarningText = z;
        this.showEsgLink = z2;
        this.esgUrl = str23;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0165: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r37v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x004d: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:20) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r43v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0061: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r45v0 long))
  (wrap:java.lang.String:0x0075: TERNARY null = ((wrap:int:0x006c: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:0x0080: TERNARY null = ((wrap:int:0x0077: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0082: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0088: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:25) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r49v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a7: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c8: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d3: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00de: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e9: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f4: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ff: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x010a: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0117: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) == (0 int)) ? (r62v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0120: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.InvestorsApiModel>, java.lang.String, long, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.MembersResponseBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.AnnounceDetailResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, long, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AnnounceDetailResponseBean(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, ArrayList arrayList, String str9, long j2, String str10, String str11, ArrayList arrayList2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z, boolean z2, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? new ArrayList() : arrayList, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? 0L : j2, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? new ArrayList() : arrayList2, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? "" : str14, (i & 262144) != 0 ? "" : str15, (i & 524288) != 0 ? "" : str16, (i & 1048576) != 0 ? "" : str17, (i & 2097152) != 0 ? "" : str18, (i & 4194304) != 0 ? "" : str19, (i & 8388608) != 0 ? "" : str20, (i & 16777216) != 0 ? "" : str21, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str22, (i & 67108864) != 0 ? false : z, (i & 134217728) == 0 ? z2 : false, (i & 268435456) != 0 ? "" : str23);
    }
}
