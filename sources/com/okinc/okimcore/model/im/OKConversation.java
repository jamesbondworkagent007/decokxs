package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon$$serializer;
import com.okinc.okimcore.model.room.inhouseim.ConversationStatus;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel$$serializer;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKConversation implements Parcelable {
    private String bizGroupName;
    private String contactId;
    private final List<ConversationIcon> conversationIcons;
    private final ConversationStatus conversationStatus;
    private String conversationTitle;
    private OKConversationType conversationType;
    private final Integer disbandServiceScenarioType;
    private DraftMessageModel draftMessageModel;
    private final String extra;
    private final Integer groupEntityType;
    private String groupName;
    private final GroupStatus groupStatus;
    private final GroupTagType groupType;
    private final InGroupStatus inGroupStatus;
    private boolean isFlagged;
    private boolean isNoDisturb;
    private boolean isTop;
    private final String lastReadMsgSeq;
    private OKMessageContent latestMessage;
    private Integer mentionedType;
    private Integer messageListTab;
    private OfficialTagInfo officialTagInfo;
    private String portraitUrl;
    private long receivedTime;
    private final Integer role;
    private String senderUserId;
    private OKMessage.SentStatus sentStatus;
    private long sentTime;
    private final boolean shouldFetchNameAndAvatarFromRemote;
    private final String startMsgSeq;
    private String targetId;
    private int unreadMentionedCount;
    private int unreadMessageCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKConversation> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {OKConversationType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, OKMessageContent.Companion.serializer(), OKMessage.SentStatus.Companion.serializer(), null, null, null, null, null, null, null, InGroupStatus.Companion.serializer(), GroupStatus.Companion.serializer(), EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.room.inhouseim.GroupTagType", GroupTagType.values()), null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.room.inhouseim.ConversationStatus", ConversationStatus.values()), null, null, null, new ArrayListSerializer(ConversationIcon$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<OKConversation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKConversation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            OKConversationType oKConversationTypeCreateFromParcel = OKConversationType.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i3 = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            OKMessageContent oKMessageContent = (OKMessageContent) parcel.readParcelable(OKConversation.class.getClassLoader());
            OKMessage.SentStatus sentStatusCreateFromParcel = parcel.readInt() == 0 ? null : OKMessage.SentStatus.CREATOR.createFromParcel(parcel);
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string7 = parcel.readString();
            DraftMessageModel draftMessageModelCreateFromParcel = parcel.readInt() == 0 ? null : DraftMessageModel.CREATOR.createFromParcel(parcel);
            OfficialTagInfo officialTagInfoCreateFromParcel = parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel);
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z4 = parcel.readInt() != 0;
            InGroupStatus inGroupStatusValueOf = InGroupStatus.valueOf(parcel.readString());
            GroupStatus groupStatusValueOf = GroupStatus.valueOf(parcel.readString());
            GroupTagType groupTagTypeValueOf = GroupTagType.valueOf(parcel.readString());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
            ConversationStatus conversationStatusValueOf = ConversationStatus.valueOf(parcel.readString());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (i3 != i4) {
                    arrayList2.add(ConversationIcon.CREATOR.createFromParcel(parcel));
                    i3++;
                    i4 = i4;
                }
                arrayList = arrayList2;
            }
            return new OKConversation(oKConversationTypeCreateFromParcel, string, string2, string3, string4, string5, string6, i, i2, numValueOf, z, z2, z3, oKMessageContent, sentStatusCreateFromParcel, j, j2, string7, draftMessageModelCreateFromParcel, officialTagInfoCreateFromParcel, numValueOf2, z4, inGroupStatusValueOf, groupStatusValueOf, groupTagTypeValueOf, numValueOf3, string8, conversationStatusValueOf, string9, string10, numValueOf4, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKConversation[] newArray(int i) {
            return new OKConversation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKConversation() {
        this((OKConversationType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (Integer) null, false, false, false, (OKMessageContent) null, (OKMessage.SentStatus) null, 0L, 0L, (String) null, (DraftMessageModel) null, (OfficialTagInfo) null, (Integer) null, false, (InGroupStatus) null, (GroupStatus) null, (GroupTagType) null, (Integer) null, (String) null, (ConversationStatus) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, -1, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversationType component1() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.mentionedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessageContent component14() {
        return this.latestMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage.SentStatus component15() {
        return this.sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component16() {
        return this.receivedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component17() {
        return this.sentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.senderUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMessageModel component19() {
        return this.draftMessageModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component20() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.messageListTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.shouldFetchNameAndAvatarFromRemote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InGroupStatus component23() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupStatus component24() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupTagType component25() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationStatus component28() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.groupEntityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> component32() {
        return this.conversationIcons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component33() {
        return this.disbandServiceScenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.conversationTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.portraitUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.unreadMessageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.unreadMentionedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversation copy(@NotNull OKConversationType oKConversationType, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, int i, int i2, Integer num, boolean z, boolean z2, boolean z3, OKMessageContent oKMessageContent, OKMessage.SentStatus sentStatus, long j, long j2, String str7, DraftMessageModel draftMessageModel, OfficialTagInfo officialTagInfo, Integer num2, boolean z4, @NotNull InGroupStatus inGroupStatus, @NotNull GroupStatus groupStatus, @NotNull GroupTagType groupTagType, Integer num3, String str8, @NotNull ConversationStatus conversationStatus, String str9, String str10, Integer num4, List<ConversationIcon> list, Integer num5) {
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inGroupStatus, "");
        Intrinsics.checkNotNullParameter(groupStatus, "");
        Intrinsics.checkNotNullParameter(groupTagType, "");
        Intrinsics.checkNotNullParameter(conversationStatus, "");
        return new OKConversation(oKConversationType, str, str2, str3, str4, str5, str6, i, i2, num, z, z2, z3, oKMessageContent, sentStatus, j, j2, str7, draftMessageModel, officialTagInfo, num2, z4, inGroupStatus, groupStatus, groupTagType, num3, str8, conversationStatus, str9, str10, num4, list, num5);
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
        if (!(obj instanceof OKConversation)) {
            return false;
        }
        OKConversation oKConversation = (OKConversation) obj;
        return this.conversationType == oKConversation.conversationType && Intrinsics.EZpvd((Object) this.targetId, (Object) oKConversation.targetId) && Intrinsics.EZpvd((Object) this.contactId, (Object) oKConversation.contactId) && Intrinsics.EZpvd((Object) this.conversationTitle, (Object) oKConversation.conversationTitle) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) oKConversation.bizGroupName) && Intrinsics.EZpvd((Object) this.groupName, (Object) oKConversation.groupName) && Intrinsics.EZpvd((Object) this.portraitUrl, (Object) oKConversation.portraitUrl) && this.unreadMessageCount == oKConversation.unreadMessageCount && this.unreadMentionedCount == oKConversation.unreadMentionedCount && Intrinsics.EZpvd(this.mentionedType, oKConversation.mentionedType) && this.isTop == oKConversation.isTop && this.isFlagged == oKConversation.isFlagged && this.isNoDisturb == oKConversation.isNoDisturb && Intrinsics.EZpvd(this.latestMessage, oKConversation.latestMessage) && this.sentStatus == oKConversation.sentStatus && this.receivedTime == oKConversation.receivedTime && this.sentTime == oKConversation.sentTime && Intrinsics.EZpvd((Object) this.senderUserId, (Object) oKConversation.senderUserId) && Intrinsics.EZpvd(this.draftMessageModel, oKConversation.draftMessageModel) && Intrinsics.EZpvd(this.officialTagInfo, oKConversation.officialTagInfo) && Intrinsics.EZpvd(this.messageListTab, oKConversation.messageListTab) && this.shouldFetchNameAndAvatarFromRemote == oKConversation.shouldFetchNameAndAvatarFromRemote && this.inGroupStatus == oKConversation.inGroupStatus && this.groupStatus == oKConversation.groupStatus && this.groupType == oKConversation.groupType && Intrinsics.EZpvd(this.role, oKConversation.role) && Intrinsics.EZpvd((Object) this.extra, (Object) oKConversation.extra) && this.conversationStatus == oKConversation.conversationStatus && Intrinsics.EZpvd((Object) this.lastReadMsgSeq, (Object) oKConversation.lastReadMsgSeq) && Intrinsics.EZpvd((Object) this.startMsgSeq, (Object) oKConversation.startMsgSeq) && Intrinsics.EZpvd(this.groupEntityType, oKConversation.groupEntityType) && Intrinsics.EZpvd(this.conversationIcons, oKConversation.conversationIcons) && Intrinsics.EZpvd(this.disbandServiceScenarioType, oKConversation.disbandServiceScenarioType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizGroupName() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactId() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConversationIcon> getConversationIcons() {
        return this.conversationIcons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationStatus getConversationStatus() {
        return this.conversationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversationType getConversationType() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisbandServiceScenarioType() {
        return this.disbandServiceScenarioType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftMessageModel getDraftMessageModel() {
        return this.draftMessageModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupEntityType() {
        return this.groupEntityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupStatus getGroupStatus() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupTagType getGroupType() {
        return this.groupType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InGroupStatus getInGroupStatus() {
        return this.inGroupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastReadMsgSeq() {
        return this.lastReadMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessageContent getLatestMessage() {
        return this.latestMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMentionedType() {
        return this.mentionedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMessageListTab() {
        return this.messageListTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTagInfo() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortraitUrl() {
        return this.portraitUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getReceivedTime() {
        return this.receivedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRole() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderUserId() {
        return this.senderUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage.SentStatus getSentStatus() {
        return this.sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSentTime() {
        return this.sentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldFetchNameAndAvatarFromRemote() {
        return this.shouldFetchNameAndAvatarFromRemote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartMsgSeq() {
        return this.startMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnreadMentionedCount() {
        return this.unreadMentionedCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnreadMessageCount() {
        return this.unreadMessageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = this.conversationType.hashCode();
        int iHashCode3 = this.targetId.hashCode();
        int iHashCode4 = this.contactId.hashCode();
        String str = this.conversationTitle;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.bizGroupName;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.groupName;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.portraitUrl;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        int iHashCode9 = Integer.hashCode(this.unreadMessageCount);
        int iHashCode10 = Integer.hashCode(this.unreadMentionedCount);
        Integer num = this.mentionedType;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isTop);
        int iHashCode13 = Boolean.hashCode(this.isFlagged);
        int iHashCode14 = Boolean.hashCode(this.isNoDisturb);
        OKMessageContent oKMessageContent = this.latestMessage;
        int iHashCode15 = oKMessageContent == null ? 0 : oKMessageContent.hashCode();
        OKMessage.SentStatus sentStatus = this.sentStatus;
        if (sentStatus == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = sentStatus.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode16 = Long.hashCode(this.receivedTime);
        int iHashCode17 = Long.hashCode(this.sentTime);
        String str5 = this.senderUserId;
        int iHashCode18 = str5 == null ? 0 : str5.hashCode();
        DraftMessageModel draftMessageModel = this.draftMessageModel;
        int iHashCode19 = draftMessageModel == null ? 0 : draftMessageModel.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTagInfo;
        int iHashCode20 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        Integer num2 = this.messageListTab;
        int iHashCode21 = num2 == null ? 0 : num2.hashCode();
        int iHashCode22 = Boolean.hashCode(this.shouldFetchNameAndAvatarFromRemote);
        int iHashCode23 = this.inGroupStatus.hashCode();
        int iHashCode24 = this.groupStatus.hashCode();
        int iHashCode25 = this.groupType.hashCode();
        Integer num3 = this.role;
        int iHashCode26 = num3 == null ? 0 : num3.hashCode();
        String str6 = this.extra;
        int iHashCode27 = str6 == null ? 0 : str6.hashCode();
        int iHashCode28 = this.conversationStatus.hashCode();
        String str7 = this.lastReadMsgSeq;
        int iHashCode29 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.startMsgSeq;
        int iHashCode30 = str8 == null ? 0 : str8.hashCode();
        Integer num4 = this.groupEntityType;
        int iHashCode31 = num4 == null ? 0 : num4.hashCode();
        List<ConversationIcon> list = this.conversationIcons;
        int iHashCode32 = list == null ? 0 : list.hashCode();
        Integer num5 = this.disbandServiceScenarioType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (num5 == null ? 0 : num5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFlagged() {
        return this.isFlagged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNoDisturb() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTop() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizGroupName(String str) {
        this.bizGroupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContactId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contactId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConversationTitle(String str) {
        this.conversationTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConversationType(@NotNull OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        this.conversationType = oKConversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDraftMessageModel(DraftMessageModel draftMessageModel) {
        this.draftMessageModel = draftMessageModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlagged(boolean z) {
        this.isFlagged = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupName(String str) {
        this.groupName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestMessage(OKMessageContent oKMessageContent) {
        this.latestMessage = oKMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMentionedType(Integer num) {
        this.mentionedType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessageListTab(Integer num) {
        this.messageListTab = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoDisturb(boolean z) {
        this.isNoDisturb = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfficialTagInfo(OfficialTagInfo officialTagInfo) {
        this.officialTagInfo = officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPortraitUrl(String str) {
        this.portraitUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceivedTime(long j) {
        this.receivedTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSenderUserId(String str) {
        this.senderUserId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSentStatus(OKMessage.SentStatus sentStatus) {
        this.sentStatus = sentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSentTime(long j) {
        this.sentTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTop(boolean z) {
        this.isTop = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnreadMentionedCount(int i) {
        this.unreadMentionedCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnreadMessageCount(int i) {
        this.unreadMessageCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKConversation(conversationType=" + this.conversationType + ", targetId=" + this.targetId + ", contactId=" + this.contactId + ", conversationTitle=" + this.conversationTitle + ", bizGroupName=" + this.bizGroupName + ", groupName=" + this.groupName + ", portraitUrl=" + this.portraitUrl + ", unreadMessageCount=" + this.unreadMessageCount + ", unreadMentionedCount=" + this.unreadMentionedCount + ", mentionedType=" + this.mentionedType + ", isTop=" + this.isTop + ", isFlagged=" + this.isFlagged + ", isNoDisturb=" + this.isNoDisturb + ", latestMessage=" + this.latestMessage + ", sentStatus=" + this.sentStatus + ", receivedTime=" + this.receivedTime + ", sentTime=" + this.sentTime + ", senderUserId=" + this.senderUserId + ", draftMessageModel=" + this.draftMessageModel + ", officialTagInfo=" + this.officialTagInfo + ", messageListTab=" + this.messageListTab + ", shouldFetchNameAndAvatarFromRemote=" + this.shouldFetchNameAndAvatarFromRemote + ", inGroupStatus=" + this.inGroupStatus + ", groupStatus=" + this.groupStatus + ", groupType=" + this.groupType + ", role=" + this.role + ", extra=" + this.extra + ", conversationStatus=" + this.conversationStatus + ", lastReadMsgSeq=" + this.lastReadMsgSeq + ", startMsgSeq=" + this.startMsgSeq + ", groupEntityType=" + this.groupEntityType + ", conversationIcons=" + this.conversationIcons + ", disbandServiceScenarioType=" + this.disbandServiceScenarioType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.conversationType.writeToParcel(parcel, i);
        parcel.writeString(this.targetId);
        parcel.writeString(this.contactId);
        parcel.writeString(this.conversationTitle);
        parcel.writeString(this.bizGroupName);
        parcel.writeString(this.groupName);
        parcel.writeString(this.portraitUrl);
        parcel.writeInt(this.unreadMessageCount);
        parcel.writeInt(this.unreadMentionedCount);
        Integer num = this.mentionedType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isTop ? 1 : 0);
        parcel.writeInt(this.isFlagged ? 1 : 0);
        parcel.writeInt(this.isNoDisturb ? 1 : 0);
        parcel.writeParcelable(this.latestMessage, i);
        OKMessage.SentStatus sentStatus = this.sentStatus;
        if (sentStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sentStatus.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.receivedTime);
        parcel.writeLong(this.sentTime);
        parcel.writeString(this.senderUserId);
        DraftMessageModel draftMessageModel = this.draftMessageModel;
        if (draftMessageModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            draftMessageModel.writeToParcel(parcel, i);
        }
        OfficialTagInfo officialTagInfo = this.officialTagInfo;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        Integer num2 = this.messageListTab;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.shouldFetchNameAndAvatarFromRemote ? 1 : 0);
        parcel.writeString(this.inGroupStatus.name());
        parcel.writeString(this.groupStatus.name());
        parcel.writeString(this.groupType.name());
        Integer num3 = this.role;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.extra);
        parcel.writeString(this.conversationStatus.name());
        parcel.writeString(this.lastReadMsgSeq);
        parcel.writeString(this.startMsgSeq);
        Integer num4 = this.groupEntityType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        List<ConversationIcon> list = this.conversationIcons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ConversationIcon> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Integer num5 = this.disbandServiceScenarioType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public /* synthetic */ OKConversation(int i, int i2, OKConversationType oKConversationType, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4, Integer num, boolean z, boolean z2, boolean z3, OKMessageContent oKMessageContent, OKMessage.SentStatus sentStatus, long j, long j2, String str7, DraftMessageModel draftMessageModel, OfficialTagInfo officialTagInfo, Integer num2, boolean z4, InGroupStatus inGroupStatus, GroupStatus groupStatus, GroupTagType groupTagType, Integer num3, String str8, ConversationStatus conversationStatus, String str9, String str10, Integer num4, List list, Integer num5, SerializationConstructorMarker serializationConstructorMarker) {
        this.conversationType = (i & 1) == 0 ? OKConversationType.NONE : oKConversationType;
        if ((i & 2) == 0) {
            this.targetId = "";
        } else {
            this.targetId = str;
        }
        if ((i & 4) == 0) {
            this.contactId = "";
        } else {
            this.contactId = str2;
        }
        if ((i & 8) == 0) {
            this.conversationTitle = null;
        } else {
            this.conversationTitle = str3;
        }
        if ((i & 16) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str4;
        }
        if ((i & 32) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str5;
        }
        if ((i & 64) == 0) {
            this.portraitUrl = null;
        } else {
            this.portraitUrl = str6;
        }
        if ((i & 128) == 0) {
            this.unreadMessageCount = 0;
        } else {
            this.unreadMessageCount = i3;
        }
        if ((i & 256) == 0) {
            this.unreadMentionedCount = 0;
        } else {
            this.unreadMentionedCount = i4;
        }
        if ((i & 512) == 0) {
            this.mentionedType = null;
        } else {
            this.mentionedType = num;
        }
        if ((i & 1024) == 0) {
            this.isTop = false;
        } else {
            this.isTop = z;
        }
        if ((i & 2048) == 0) {
            this.isFlagged = false;
        } else {
            this.isFlagged = z2;
        }
        this.isNoDisturb = (i & 4096) != 0 ? z3 : false;
        if ((i & 8192) == 0) {
            this.latestMessage = null;
        } else {
            this.latestMessage = oKMessageContent;
        }
        if ((i & 16384) == 0) {
            this.sentStatus = null;
        } else {
            this.sentStatus = sentStatus;
        }
        if ((32768 & i) == 0) {
            this.receivedTime = 0L;
        } else {
            this.receivedTime = j;
        }
        this.sentTime = (65536 & i) != 0 ? j2 : 0L;
        if ((131072 & i) == 0) {
            this.senderUserId = null;
        } else {
            this.senderUserId = str7;
        }
        if ((262144 & i) == 0) {
            this.draftMessageModel = null;
        } else {
            this.draftMessageModel = draftMessageModel;
        }
        if ((524288 & i) == 0) {
            this.officialTagInfo = null;
        } else {
            this.officialTagInfo = officialTagInfo;
        }
        this.messageListTab = (1048576 & i) == 0 ? 1 : num2;
        if ((2097152 & i) == 0) {
            this.shouldFetchNameAndAvatarFromRemote = true;
        } else {
            this.shouldFetchNameAndAvatarFromRemote = z4;
        }
        this.inGroupStatus = (4194304 & i) == 0 ? InGroupStatus.UNKNOWN : inGroupStatus;
        this.groupStatus = (8388608 & i) == 0 ? GroupStatus.UNKNOWN : groupStatus;
        this.groupType = (16777216 & i) == 0 ? GroupTagType.UNKNOWN : groupTagType;
        if ((33554432 & i) == 0) {
            this.role = null;
        } else {
            this.role = num3;
        }
        if ((67108864 & i) == 0) {
            this.extra = null;
        } else {
            this.extra = str8;
        }
        this.conversationStatus = (134217728 & i) == 0 ? ConversationStatus.UNKNOWN : conversationStatus;
        if ((268435456 & i) == 0) {
            this.lastReadMsgSeq = null;
        } else {
            this.lastReadMsgSeq = str9;
        }
        if ((536870912 & i) == 0) {
            this.startMsgSeq = null;
        } else {
            this.startMsgSeq = str10;
        }
        if ((1073741824 & i) == 0) {
            this.groupEntityType = null;
        } else {
            this.groupEntityType = num4;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.conversationIcons = null;
        } else {
            this.conversationIcons = list;
        }
        if ((i2 & 1) == 0) {
            this.disbandServiceScenarioType = null;
        } else {
            this.disbandServiceScenarioType = num5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [21=6] */
    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKConversation oKConversation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oKConversation.conversationType != OKConversationType.NONE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], oKConversation.conversationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKConversation.targetId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKConversation.targetId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) oKConversation.contactId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, oKConversation.contactId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || oKConversation.conversationTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, oKConversation.conversationTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || oKConversation.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, oKConversation.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || oKConversation.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, oKConversation.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || oKConversation.portraitUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, oKConversation.portraitUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || oKConversation.unreadMessageCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, oKConversation.unreadMessageCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKConversation.unreadMentionedCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, oKConversation.unreadMentionedCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKConversation.mentionedType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, oKConversation.mentionedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKConversation.isTop) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, oKConversation.isTop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKConversation.isFlagged) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, oKConversation.isFlagged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKConversation.isNoDisturb) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, oKConversation.isNoDisturb);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKConversation.latestMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], oKConversation.latestMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKConversation.sentStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], oKConversation.sentStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || oKConversation.receivedTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 15, oKConversation.receivedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKConversation.sentTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 16, oKConversation.sentTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || oKConversation.senderUserId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, oKConversation.senderUserId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || oKConversation.draftMessageModel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, DraftMessageModel$$serializer.INSTANCE, oKConversation.draftMessageModel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || oKConversation.officialTagInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, OfficialTagInfo$$serializer.INSTANCE, oKConversation.officialTagInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || (num = oKConversation.messageListTab) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, oKConversation.messageListTab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !oKConversation.shouldFetchNameAndAvatarFromRemote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, oKConversation.shouldFetchNameAndAvatarFromRemote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || oKConversation.inGroupStatus != InGroupStatus.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], oKConversation.inGroupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || oKConversation.groupStatus != GroupStatus.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], oKConversation.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || oKConversation.groupType != GroupTagType.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 24, kSerializerArr[24], oKConversation.groupType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || oKConversation.role != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, oKConversation.role);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || oKConversation.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, oKConversation.extra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || oKConversation.conversationStatus != ConversationStatus.UNKNOWN) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 27, kSerializerArr[27], oKConversation.conversationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || oKConversation.lastReadMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, oKConversation.lastReadMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || oKConversation.startMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, oKConversation.startMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || oKConversation.groupEntityType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, oKConversation.groupEntityType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || oKConversation.conversationIcons != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, kSerializerArr[31], oKConversation.conversationIcons);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) && oKConversation.disbandServiceScenarioType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, IntSerializer.INSTANCE, oKConversation.disbandServiceScenarioType);
    }

    public OKConversation(@NotNull OKConversationType oKConversationType, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, int i, int i2, Integer num, boolean z, boolean z2, boolean z3, OKMessageContent oKMessageContent, OKMessage.SentStatus sentStatus, long j, long j2, String str7, DraftMessageModel draftMessageModel, OfficialTagInfo officialTagInfo, Integer num2, boolean z4, @NotNull InGroupStatus inGroupStatus, @NotNull GroupStatus groupStatus, @NotNull GroupTagType groupTagType, Integer num3, String str8, @NotNull ConversationStatus conversationStatus, String str9, String str10, Integer num4, List<ConversationIcon> list, Integer num5) {
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inGroupStatus, "");
        Intrinsics.checkNotNullParameter(groupStatus, "");
        Intrinsics.checkNotNullParameter(groupTagType, "");
        Intrinsics.checkNotNullParameter(conversationStatus, "");
        this.conversationType = oKConversationType;
        this.targetId = str;
        this.contactId = str2;
        this.conversationTitle = str3;
        this.bizGroupName = str4;
        this.groupName = str5;
        this.portraitUrl = str6;
        this.unreadMessageCount = i;
        this.unreadMentionedCount = i2;
        this.mentionedType = num;
        this.isTop = z;
        this.isFlagged = z2;
        this.isNoDisturb = z3;
        this.latestMessage = oKMessageContent;
        this.sentStatus = sentStatus;
        this.receivedTime = j;
        this.sentTime = j2;
        this.senderUserId = str7;
        this.draftMessageModel = draftMessageModel;
        this.officialTagInfo = officialTagInfo;
        this.messageListTab = num2;
        this.shouldFetchNameAndAvatarFromRemote = z4;
        this.inGroupStatus = inGroupStatus;
        this.groupStatus = groupStatus;
        this.groupType = groupTagType;
        this.role = num3;
        this.extra = str8;
        this.conversationStatus = conversationStatus;
        this.lastReadMsgSeq = str9;
        this.startMsgSeq = str10;
        this.groupEntityType = num4;
        this.conversationIcons = list;
        this.disbandServiceScenarioType = num5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0188: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.OKConversationType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r72v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:25) com.okinc.okimcore.model.im.OKConversationType.NONE com.okinc.okimcore.model.im.OKConversationType) : (r37v0 com.okinc.okimcore.model.im.OKConversationType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r72v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r72v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r39v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r72v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r72v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r72v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r72v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r72v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r44v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r72v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004d: ARITH (r72v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r46v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r72v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r72v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r72v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r49v0 boolean) : false)
  (wrap:com.okinc.okimcore.model.im.OKMessageContent:?: TERNARY null = ((wrap:int:0x006c: ARITH (r72v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessageContent) : (r50v0 com.okinc.okimcore.model.im.OKMessageContent))
  (wrap:com.okinc.okimcore.model.im.OKMessage$SentStatus:?: TERNARY null = ((wrap:int:0x0074: ARITH (r72v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessage$SentStatus) : (r51v0 com.okinc.okimcore.model.im.OKMessage$SentStatus))
  (wrap:long:?: TERNARY null = ((wrap:int:0x007f: ARITH (r72v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r52v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x008c: ARITH (r72v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r54v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0095: ARITH (r72v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.room.inhouseim.DraftMessageModel:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r72v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.room.inhouseim.DraftMessageModel) : (r57v0 com.okinc.okimcore.model.room.inhouseim.DraftMessageModel))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r72v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r58v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r72v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r59v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r72v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? true : (r60v0 boolean))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r72v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d4: SGET  A[WRAPPED] (LINE:47) com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus.UNKNOWN com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus) : (r61v0 com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus:?: TERNARY null = ((wrap:int:0x00db: ARITH (r72v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00df: SGET  A[WRAPPED] (LINE:48) com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus.UNKNOWN com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus) : (r62v0 com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus))
  (wrap:com.okinc.okimcore.model.room.inhouseim.GroupTagType:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r72v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ea: SGET  A[WRAPPED] (LINE:49) com.okinc.okimcore.model.room.inhouseim.GroupTagType.UNKNOWN com.okinc.okimcore.model.room.inhouseim.GroupTagType) : (r63v0 com.okinc.okimcore.model.room.inhouseim.GroupTagType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r72v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r64v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r72v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.room.inhouseim.ConversationStatus:?: TERNARY null = ((wrap:int:0x0107: ARITH (r72v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x010b: SGET  A[WRAPPED] (LINE:52) com.okinc.okimcore.model.room.inhouseim.ConversationStatus.UNKNOWN com.okinc.okimcore.model.room.inhouseim.ConversationStatus) : (r66v0 com.okinc.okimcore.model.room.inhouseim.ConversationStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0112: ARITH (r72v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011d: ARITH (r72v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0128: ARITH (r72v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r69v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0133: ARITH (r72v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r70v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x013b: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r71v0 java.lang.Integer))
 A[MD:(com.okinc.okimcore.model.im.OKConversationType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.Integer, boolean, boolean, boolean, com.okinc.okimcore.model.im.OKMessageContent, com.okinc.okimcore.model.im.OKMessage$SentStatus, long, long, java.lang.String, com.okinc.okimcore.model.room.inhouseim.DraftMessageModel, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.Integer, boolean, com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus, com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus, com.okinc.okimcore.model.room.inhouseim.GroupTagType, java.lang.Integer, java.lang.String, com.okinc.okimcore.model.room.inhouseim.ConversationStatus, java.lang.String, java.lang.String, java.lang.Integer, java.util.List<com.okinc.okimcore.model.room.inhouseim.ConversationIcon>, java.lang.Integer):void (m)] (LINE:24) call: com.okinc.okimcore.model.im.OKConversation.<init>(com.okinc.okimcore.model.im.OKConversationType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.Integer, boolean, boolean, boolean, com.okinc.okimcore.model.im.OKMessageContent, com.okinc.okimcore.model.im.OKMessage$SentStatus, long, long, java.lang.String, com.okinc.okimcore.model.room.inhouseim.DraftMessageModel, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.Integer, boolean, com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus, com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus, com.okinc.okimcore.model.room.inhouseim.GroupTagType, java.lang.Integer, java.lang.String, com.okinc.okimcore.model.room.inhouseim.ConversationStatus, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ OKConversation(OKConversationType oKConversationType, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Integer num, boolean z, boolean z2, boolean z3, OKMessageContent oKMessageContent, OKMessage.SentStatus sentStatus, long j, long j2, String str7, DraftMessageModel draftMessageModel, OfficialTagInfo officialTagInfo, Integer num2, boolean z4, InGroupStatus inGroupStatus, GroupStatus groupStatus, GroupTagType groupTagType, Integer num3, String str8, ConversationStatus conversationStatus, String str9, String str10, Integer num4, List list, Integer num5, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? OKConversationType.NONE : oKConversationType, (i3 & 2) != 0 ? "" : str, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : str5, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 0 : i2, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? false : z2, (i3 & 4096) == 0 ? z3 : false, (i3 & 8192) != 0 ? null : oKMessageContent, (i3 & 16384) != 0 ? null : sentStatus, (i3 & 32768) != 0 ? 0L : j, (i3 & 65536) == 0 ? j2 : 0L, (i3 & 131072) != 0 ? null : str7, (i3 & 262144) != 0 ? null : draftMessageModel, (i3 & 524288) != 0 ? null : officialTagInfo, (i3 & 1048576) != 0 ? 1 : num2, (i3 & 2097152) != 0 ? true : z4, (i3 & 4194304) != 0 ? InGroupStatus.UNKNOWN : inGroupStatus, (i3 & 8388608) != 0 ? GroupStatus.UNKNOWN : groupStatus, (i3 & 16777216) != 0 ? GroupTagType.UNKNOWN : groupTagType, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : num3, (i3 & 67108864) != 0 ? null : str8, (i3 & 134217728) != 0 ? ConversationStatus.UNKNOWN : conversationStatus, (i3 & 268435456) != 0 ? null : str9, (i3 & 536870912) != 0 ? null : str10, (i3 & 1073741824) != 0 ? null : num4, (i3 & Integer.MIN_VALUE) != 0 ? null : list, (i4 & 1) != 0 ? null : num5);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKConversation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKConversation> serializer() {
            return OKConversation$$serializer.INSTANCE;
        }

        public final OKConversation AEQbTJ(@NotNull OKConversationType oKConversationType, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(oKConversationType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            OKConversation oKConversation = new OKConversation((OKConversationType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (Integer) null, false, false, false, (OKMessageContent) null, (OKMessage.SentStatus) null, 0L, 0L, (String) null, (DraftMessageModel) null, (OfficialTagInfo) null, (Integer) null, false, (InGroupStatus) null, (GroupStatus) null, (GroupTagType) null, (Integer) null, (String) null, (ConversationStatus) null, (String) null, (String) null, (Integer) null, (List) null, (Integer) null, -1, 1, (DefaultConstructorMarker) null);
            oKConversation.setTargetId(str);
            oKConversation.setContactId(str);
            oKConversation.setConversationType(oKConversationType);
            oKConversation.setConversationTitle(str2);
            return oKConversation;
        }
    }
}
