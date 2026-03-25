package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.crcore.coreapi.net.responsebean.AnnounceDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.InvestorsApiModel;
import com.okinc.crcore.coreapi.net.responsebean.MembersResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AnnounceDetailBean implements Parcelable {
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
    private final List<InvestorsBean> investors;
    private final long issueTime;
    private final String issueTotal;
    private final String link;
    private final List<MembersBean> members;
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
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AnnounceDetailBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AnnounceDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnounceDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j = parcel.readLong();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestorsBean.CREATOR.createFromParcel(parcel));
            }
            String string9 = parcel.readString();
            long j2 = parcel.readLong();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                arrayList2.add(MembersBean.CREATOR.createFromParcel(parcel));
                i4++;
                i3 = i3;
            }
            return new AnnounceDetailBean(string, string2, string3, string4, j, string5, string6, string7, string8, arrayList, string9, j2, string10, string11, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnnounceDetailBean[] newArray(int i) {
            return new AnnounceDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnounceDetailBean() {
        this(null, null, null, null, 0L, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870911, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.brief;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestorsBean> component10() {
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
    public final List<MembersBean> component15() {
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
    public final AnnounceDetailBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<InvestorsBean> list, @NotNull String str9, long j2, @NotNull String str10, @NotNull String str11, @NotNull List<MembersBean> list2, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z, boolean z2, @NotNull String str23) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list2, "");
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
        return new AnnounceDetailBean(str, str2, str3, str4, j, str5, str6, str7, str8, list, str9, j2, str10, str11, list2, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, z, z2, str23);
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
        if (!(obj instanceof AnnounceDetailBean)) {
            return false;
        }
        AnnounceDetailBean announceDetailBean = (AnnounceDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.brief, (Object) announceDetailBean.brief) && Intrinsics.EZpvd((Object) this.classification, (Object) announceDetailBean.classification) && Intrinsics.EZpvd((Object) this.classificationId, (Object) announceDetailBean.classificationId) && Intrinsics.EZpvd((Object) this.facebook, (Object) announceDetailBean.facebook) && this.flowTotal == announceDetailBean.flowTotal && Intrinsics.EZpvd((Object) this.fullName, (Object) announceDetailBean.fullName) && Intrinsics.EZpvd((Object) this.github, (Object) announceDetailBean.github) && Intrinsics.EZpvd((Object) this.icon, (Object) announceDetailBean.icon) && Intrinsics.EZpvd((Object) this.introduce, (Object) announceDetailBean.introduce) && Intrinsics.EZpvd(this.investors, announceDetailBean.investors) && Intrinsics.EZpvd((Object) this.investor, (Object) announceDetailBean.investor) && this.issueTime == announceDetailBean.issueTime && Intrinsics.EZpvd((Object) this.issueTotal, (Object) announceDetailBean.issueTotal) && Intrinsics.EZpvd((Object) this.link, (Object) announceDetailBean.link) && Intrinsics.EZpvd(this.members, announceDetailBean.members) && Intrinsics.EZpvd((Object) this.officialUrl, (Object) announceDetailBean.officialUrl) && Intrinsics.EZpvd((Object) this.project, (Object) announceDetailBean.project) && Intrinsics.EZpvd((Object) this.projectId, (Object) announceDetailBean.projectId) && Intrinsics.EZpvd((Object) this.currencyId, (Object) announceDetailBean.currencyId) && Intrinsics.EZpvd((Object) this.status, (Object) announceDetailBean.status) && Intrinsics.EZpvd((Object) this.telegram, (Object) announceDetailBean.telegram) && Intrinsics.EZpvd((Object) this.title, (Object) announceDetailBean.title) && Intrinsics.EZpvd((Object) this.twitter, (Object) announceDetailBean.twitter) && Intrinsics.EZpvd((Object) this.weChat, (Object) announceDetailBean.weChat) && Intrinsics.EZpvd((Object) this.whitePaper, (Object) announceDetailBean.whitePaper) && Intrinsics.EZpvd((Object) this.blockBrowser, (Object) announceDetailBean.blockBrowser) && this.showWarningText == announceDetailBean.showWarningText && this.showEsgLink == announceDetailBean.showEsgLink && Intrinsics.EZpvd((Object) this.esgUrl, (Object) announceDetailBean.esgUrl);
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
    public final List<InvestorsBean> getInvestors() {
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
    public final List<MembersBean> getMembers() {
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
        return "AnnounceDetailBean(brief=" + this.brief + ", classification=" + this.classification + ", classificationId=" + this.classificationId + ", facebook=" + this.facebook + ", flowTotal=" + this.flowTotal + ", fullName=" + this.fullName + ", github=" + this.github + ", icon=" + this.icon + ", introduce=" + this.introduce + ", investors=" + this.investors + ", investor=" + this.investor + ", issueTime=" + this.issueTime + ", issueTotal=" + this.issueTotal + ", link=" + this.link + ", members=" + this.members + ", officialUrl=" + this.officialUrl + ", project=" + this.project + ", projectId=" + this.projectId + ", currencyId=" + this.currencyId + ", status=" + this.status + ", telegram=" + this.telegram + ", title=" + this.title + ", twitter=" + this.twitter + ", weChat=" + this.weChat + ", whitePaper=" + this.whitePaper + ", blockBrowser=" + this.blockBrowser + ", showWarningText=" + this.showWarningText + ", showEsgLink=" + this.showEsgLink + ", esgUrl=" + this.esgUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.brief);
        parcel.writeString(this.classification);
        parcel.writeString(this.classificationId);
        parcel.writeString(this.facebook);
        parcel.writeLong(this.flowTotal);
        parcel.writeString(this.fullName);
        parcel.writeString(this.github);
        parcel.writeString(this.icon);
        parcel.writeString(this.introduce);
        List<InvestorsBean> list = this.investors;
        parcel.writeInt(list.size());
        Iterator<InvestorsBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.investor);
        parcel.writeLong(this.issueTime);
        parcel.writeString(this.issueTotal);
        parcel.writeString(this.link);
        List<MembersBean> list2 = this.members;
        parcel.writeInt(list2.size());
        Iterator<MembersBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.officialUrl);
        parcel.writeString(this.project);
        parcel.writeString(this.projectId);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.status);
        parcel.writeString(this.telegram);
        parcel.writeString(this.title);
        parcel.writeString(this.twitter);
        parcel.writeString(this.weChat);
        parcel.writeString(this.whitePaper);
        parcel.writeString(this.blockBrowser);
        parcel.writeInt(this.showWarningText ? 1 : 0);
        parcel.writeInt(this.showEsgLink ? 1 : 0);
        parcel.writeString(this.esgUrl);
    }

    public AnnounceDetailBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<InvestorsBean> list, @NotNull String str9, long j2, @NotNull String str10, @NotNull String str11, @NotNull List<MembersBean> list2, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z, boolean z2, @NotNull String str23) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(list2, "");
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
        this.investors = list;
        this.investor = str9;
        this.issueTime = j2;
        this.issueTotal = str10;
        this.link = str11;
        this.members = list2;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0163: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r37v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004d: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r43v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0060: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r45v0 long))
  (wrap:java.lang.String:0x0074: TERNARY null = ((wrap:int:0x006b: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:0x007f: TERNARY null = ((wrap:int:0x0076: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0081: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0085: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r49v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0108: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0115: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) == (0 int)) ? (r62v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011e: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.InvestorsBean>, java.lang.String, long, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.MembersBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.AnnounceDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, long, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AnnounceDetailBean(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, List list, String str9, long j2, String str10, String str11, List list2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z, boolean z2, String str23, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? yDY.AhwBna() : list, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? 0L : j2, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? yDY.AhwBna() : list2, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? "" : str13, (i & 131072) != 0 ? "" : str14, (i & 262144) != 0 ? "" : str15, (i & 524288) != 0 ? "" : str16, (i & 1048576) != 0 ? "" : str17, (i & 2097152) != 0 ? "" : str18, (i & 4194304) != 0 ? "" : str19, (i & 8388608) != 0 ? "" : str20, (i & 16777216) != 0 ? "" : str21, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str22, (i & 67108864) != 0 ? false : z, (i & 134217728) == 0 ? z2 : false, (i & 268435456) != 0 ? "" : str23);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.AnnounceDetailBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AnnounceDetailBean OLrzqt(@NotNull AnnounceDetailResponseBean announceDetailResponseBean) {
            Intrinsics.checkNotNullParameter(announceDetailResponseBean, "");
            String brief = announceDetailResponseBean.getBrief();
            String classification = announceDetailResponseBean.getClassification();
            String classificationId = announceDetailResponseBean.getClassificationId();
            String facebook = announceDetailResponseBean.getFacebook();
            long flowTotal = announceDetailResponseBean.getFlowTotal();
            String fullName = announceDetailResponseBean.getFullName();
            String github = announceDetailResponseBean.getGithub();
            String icon = announceDetailResponseBean.getIcon();
            String introduce = announceDetailResponseBean.getIntroduce();
            ArrayList<InvestorsApiModel> investors = announceDetailResponseBean.getInvestors();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(investors, 10));
            for (InvestorsApiModel investorsApiModel : investors) {
                arrayList.add(new InvestorsBean(investorsApiModel.getName(), investorsApiModel.getLogo()));
            }
            long issueTime = announceDetailResponseBean.getIssueTime();
            String link = announceDetailResponseBean.getLink();
            ArrayList<MembersResponseBean> members = announceDetailResponseBean.getMembers();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(members, 10));
            Iterator it = members.iterator();
            while (it.hasNext()) {
                MembersResponseBean membersResponseBean = (MembersResponseBean) it.next();
                arrayList2.add(new MembersBean(membersResponseBean.getHeadImage(), membersResponseBean.getIntroduce(), membersResponseBean.getName(), membersResponseBean.getPosition()));
                it = it;
                link = link;
                arrayList = arrayList;
            }
            return new AnnounceDetailBean(brief, classification, classificationId, facebook, flowTotal, fullName, github, icon, introduce, arrayList, null, issueTime, null, link, arrayList2, announceDetailResponseBean.getOfficialUrl(), announceDetailResponseBean.getProject(), announceDetailResponseBean.getProjectId(), announceDetailResponseBean.getCurrencyId(), announceDetailResponseBean.getStatus(), announceDetailResponseBean.getTelegram(), announceDetailResponseBean.getTitle(), announceDetailResponseBean.getTwitter(), announceDetailResponseBean.getWeChat(), announceDetailResponseBean.getWhitePaper(), announceDetailResponseBean.getBlockBrowser(), announceDetailResponseBean.getShowWarningText(), announceDetailResponseBean.getShowEsgLink(), announceDetailResponseBean.getEsgUrl(), 5120, null);
        }
    }
}
