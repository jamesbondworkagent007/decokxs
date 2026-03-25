package com.okinc.okex.common.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class VideoMeetingBean implements Parcelable {
    public static final int $stable = 0;
    public static final int DEFAULT_MEETING_DELAY_MS = 3000;
    public static final int ENV_DEV = 1;
    public static final int ENV_PRODUCTION = 3;
    public static final int ENV_TEST = 2;
    public static final int STATUS_CANCELLED = 6;
    public static final int STATUS_COMPLETED = 3;
    public static final int STATUS_DELETED = 7;
    public static final int STATUS_DISPATCH_FAILED = 10;
    public static final int STATUS_FAILED = 5;
    public static final int STATUS_INVITED_QUEUE = 8;
    public static final int STATUS_JOINED_QUEUE = 9;
    public static final int STATUS_MISSED = 4;
    public static final int STATUS_ONGOING = 2;
    public static final int STATUS_UPCOMING = 1;
    public static final int VIDEO_TYPE_FUTURE = 2;
    public static final int VIDEO_TYPE_IMMEDIATE = 1;
    public static final int VIDEO_TYPE_QUEUE = 3;
    private final Long agentJoinTime;
    private final String agentMsg;
    private final String agentNickName;
    private final Long appKey;
    private final Integer callType;
    private final String channelId;
    private final ChatMetadata chatMetadata;
    private final Integer env;
    private final String id;
    private final Long meetingTime;
    private final Long meetingTimeDiff;
    private final String meetingTimeIdentifier;
    private final VideoQueueInfo queueInfo;
    private final Long recentCallSleepTime;
    private final String rtcToken;
    private final Integer status;
    private final String subStatus;
    private final String uid;
    private final Long userJoinTime;
    private final Long videoMeetingCallSleepTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoMeetingBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VideoMeetingBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoMeetingBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VideoMeetingBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : ChatMetadata.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? VideoQueueInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoMeetingBean[] newArray(int i) {
            return new VideoMeetingBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VideoMeetingBean() {
        this((Long) null, (String) null, (Long) null, (String) null, (Integer) null, (String) null, (Long) null, (Long) null, (Long) null, (String) null, (Integer) null, (String) null, (Long) null, (Long) null, (ChatMetadata) null, (Integer) null, (VideoQueueInfo) null, (String) null, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.agentJoinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.rtcToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component13() {
        return this.userJoinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component14() {
        return this.videoMeetingCallSleepTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatMetadata component15() {
        return this.chatMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoQueueInfo component17() {
        return this.queueInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.agentNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.meetingTimeIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.agentMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.appKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.env;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.meetingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.meetingTimeDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.recentCallSleepTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoMeetingBean copy(Long l, String str, Long l2, String str2, Integer num, String str3, Long l3, Long l4, Long l5, String str4, Integer num2, String str5, Long l6, Long l7, ChatMetadata chatMetadata, Integer num3, VideoQueueInfo videoQueueInfo, String str6, String str7, String str8) {
        return new VideoMeetingBean(l, str, l2, str2, num, str3, l3, l4, l5, str4, num2, str5, l6, l7, chatMetadata, num3, videoQueueInfo, str6, str7, str8);
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
        if (!(obj instanceof VideoMeetingBean)) {
            return false;
        }
        VideoMeetingBean videoMeetingBean = (VideoMeetingBean) obj;
        return Intrinsics.EZpvd(this.agentJoinTime, videoMeetingBean.agentJoinTime) && Intrinsics.EZpvd((Object) this.agentMsg, (Object) videoMeetingBean.agentMsg) && Intrinsics.EZpvd(this.appKey, videoMeetingBean.appKey) && Intrinsics.EZpvd((Object) this.channelId, (Object) videoMeetingBean.channelId) && Intrinsics.EZpvd(this.env, videoMeetingBean.env) && Intrinsics.EZpvd((Object) this.id, (Object) videoMeetingBean.id) && Intrinsics.EZpvd(this.meetingTime, videoMeetingBean.meetingTime) && Intrinsics.EZpvd(this.meetingTimeDiff, videoMeetingBean.meetingTimeDiff) && Intrinsics.EZpvd(this.recentCallSleepTime, videoMeetingBean.recentCallSleepTime) && Intrinsics.EZpvd((Object) this.rtcToken, (Object) videoMeetingBean.rtcToken) && Intrinsics.EZpvd(this.status, videoMeetingBean.status) && Intrinsics.EZpvd((Object) this.uid, (Object) videoMeetingBean.uid) && Intrinsics.EZpvd(this.userJoinTime, videoMeetingBean.userJoinTime) && Intrinsics.EZpvd(this.videoMeetingCallSleepTime, videoMeetingBean.videoMeetingCallSleepTime) && Intrinsics.EZpvd(this.chatMetadata, videoMeetingBean.chatMetadata) && Intrinsics.EZpvd(this.callType, videoMeetingBean.callType) && Intrinsics.EZpvd(this.queueInfo, videoMeetingBean.queueInfo) && Intrinsics.EZpvd((Object) this.agentNickName, (Object) videoMeetingBean.agentNickName) && Intrinsics.EZpvd((Object) this.meetingTimeIdentifier, (Object) videoMeetingBean.meetingTimeIdentifier) && Intrinsics.EZpvd((Object) this.subStatus, (Object) videoMeetingBean.subStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAgentJoinTime() {
        return this.agentJoinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAgentMsg() {
        return this.agentMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAgentNickName() {
        return this.agentNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAppKey() {
        return this.appKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCallType() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatMetadata getChatMetadata() {
        return this.chatMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEnv() {
        return this.env;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMeetingTime() {
        return this.meetingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMeetingTimeDiff() {
        return this.meetingTimeDiff;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMeetingTimeIdentifier() {
        return this.meetingTimeIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoQueueInfo getQueueInfo() {
        return this.queueInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRecentCallSleepTime() {
        return this.recentCallSleepTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRtcToken() {
        return this.rtcToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubStatus() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUserJoinTime() {
        return this.userJoinTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getVideoMeetingCallSleepTime() {
        return this.videoMeetingCallSleepTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.agentJoinTime;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.agentMsg;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l2 = this.appKey;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.channelId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.env;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str3 = this.id;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Long l3 = this.meetingTime;
        int iHashCode7 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.meetingTimeDiff;
        int iHashCode8 = l4 == null ? 0 : l4.hashCode();
        Long l5 = this.recentCallSleepTime;
        int iHashCode9 = l5 == null ? 0 : l5.hashCode();
        String str4 = this.rtcToken;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.status;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.uid;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        Long l6 = this.userJoinTime;
        int iHashCode13 = l6 == null ? 0 : l6.hashCode();
        Long l7 = this.videoMeetingCallSleepTime;
        int iHashCode14 = l7 == null ? 0 : l7.hashCode();
        ChatMetadata chatMetadata = this.chatMetadata;
        int iHashCode15 = chatMetadata == null ? 0 : chatMetadata.hashCode();
        Integer num3 = this.callType;
        int iHashCode16 = num3 == null ? 0 : num3.hashCode();
        VideoQueueInfo videoQueueInfo = this.queueInfo;
        int iHashCode17 = videoQueueInfo == null ? 0 : videoQueueInfo.hashCode();
        String str6 = this.agentNickName;
        int iHashCode18 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.meetingTimeIdentifier;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.subStatus;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoMeetingBean(agentJoinTime=" + this.agentJoinTime + ", agentMsg=" + this.agentMsg + ", appKey=" + this.appKey + ", channelId=" + this.channelId + ", env=" + this.env + ", id=" + this.id + ", meetingTime=" + this.meetingTime + ", meetingTimeDiff=" + this.meetingTimeDiff + ", recentCallSleepTime=" + this.recentCallSleepTime + ", rtcToken=" + this.rtcToken + ", status=" + this.status + ", uid=" + this.uid + ", userJoinTime=" + this.userJoinTime + ", videoMeetingCallSleepTime=" + this.videoMeetingCallSleepTime + ", chatMetadata=" + this.chatMetadata + ", callType=" + this.callType + ", queueInfo=" + this.queueInfo + ", agentNickName=" + this.agentNickName + ", meetingTimeIdentifier=" + this.meetingTimeIdentifier + ", subStatus=" + this.subStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.agentJoinTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.agentMsg);
        Long l2 = this.appKey;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.channelId);
        Integer num = this.env;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.id);
        Long l3 = this.meetingTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.meetingTimeDiff;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Long l5 = this.recentCallSleepTime;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        parcel.writeString(this.rtcToken);
        Integer num2 = this.status;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.uid);
        Long l6 = this.userJoinTime;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        Long l7 = this.videoMeetingCallSleepTime;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        ChatMetadata chatMetadata = this.chatMetadata;
        if (chatMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatMetadata.writeToParcel(parcel, i);
        }
        Integer num3 = this.callType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        VideoQueueInfo videoQueueInfo = this.queueInfo;
        if (videoQueueInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoQueueInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.agentNickName);
        parcel.writeString(this.meetingTimeIdentifier);
        parcel.writeString(this.subStatus);
    }

    public /* synthetic */ VideoMeetingBean(int i, Long l, String str, Long l2, String str2, Integer num, String str3, Long l3, Long l4, Long l5, String str4, Integer num2, String str5, Long l6, Long l7, ChatMetadata chatMetadata, Integer num3, VideoQueueInfo videoQueueInfo, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.agentJoinTime = null;
        } else {
            this.agentJoinTime = l;
        }
        if ((i & 2) == 0) {
            this.agentMsg = null;
        } else {
            this.agentMsg = str;
        }
        if ((i & 4) == 0) {
            this.appKey = null;
        } else {
            this.appKey = l2;
        }
        if ((i & 8) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
        }
        if ((i & 16) == 0) {
            this.env = null;
        } else {
            this.env = num;
        }
        if ((i & 32) == 0) {
            this.id = null;
        } else {
            this.id = str3;
        }
        if ((i & 64) == 0) {
            this.meetingTime = null;
        } else {
            this.meetingTime = l3;
        }
        if ((i & 128) == 0) {
            this.meetingTimeDiff = null;
        } else {
            this.meetingTimeDiff = l4;
        }
        if ((i & 256) == 0) {
            this.recentCallSleepTime = null;
        } else {
            this.recentCallSleepTime = l5;
        }
        if ((i & 512) == 0) {
            this.rtcToken = null;
        } else {
            this.rtcToken = str4;
        }
        if ((i & 1024) == 0) {
            this.status = null;
        } else {
            this.status = num2;
        }
        if ((i & 2048) == 0) {
            this.uid = null;
        } else {
            this.uid = str5;
        }
        if ((i & 4096) == 0) {
            this.userJoinTime = null;
        } else {
            this.userJoinTime = l6;
        }
        if ((i & 8192) == 0) {
            this.videoMeetingCallSleepTime = null;
        } else {
            this.videoMeetingCallSleepTime = l7;
        }
        if ((i & 16384) == 0) {
            this.chatMetadata = null;
        } else {
            this.chatMetadata = chatMetadata;
        }
        if ((32768 & i) == 0) {
            this.callType = null;
        } else {
            this.callType = num3;
        }
        if ((65536 & i) == 0) {
            this.queueInfo = null;
        } else {
            this.queueInfo = videoQueueInfo;
        }
        if ((131072 & i) == 0) {
            this.agentNickName = null;
        } else {
            this.agentNickName = str6;
        }
        if ((262144 & i) == 0) {
            this.meetingTimeIdentifier = null;
        } else {
            this.meetingTimeIdentifier = str7;
        }
        if ((i & 524288) == 0) {
            this.subStatus = null;
        } else {
            this.subStatus = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_api(VideoMeetingBean videoMeetingBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || videoMeetingBean.agentJoinTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, videoMeetingBean.agentJoinTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || videoMeetingBean.agentMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, videoMeetingBean.agentMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || videoMeetingBean.appKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, videoMeetingBean.appKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || videoMeetingBean.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, videoMeetingBean.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || videoMeetingBean.env != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, videoMeetingBean.env);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || videoMeetingBean.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, videoMeetingBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || videoMeetingBean.meetingTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, videoMeetingBean.meetingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || videoMeetingBean.meetingTimeDiff != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, videoMeetingBean.meetingTimeDiff);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || videoMeetingBean.recentCallSleepTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, videoMeetingBean.recentCallSleepTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || videoMeetingBean.rtcToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, videoMeetingBean.rtcToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || videoMeetingBean.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, videoMeetingBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || videoMeetingBean.uid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, videoMeetingBean.uid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || videoMeetingBean.userJoinTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, videoMeetingBean.userJoinTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || videoMeetingBean.videoMeetingCallSleepTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, videoMeetingBean.videoMeetingCallSleepTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || videoMeetingBean.chatMetadata != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, ChatMetadata$$serializer.INSTANCE, videoMeetingBean.chatMetadata);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || videoMeetingBean.callType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, videoMeetingBean.callType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || videoMeetingBean.queueInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, VideoQueueInfo$$serializer.INSTANCE, videoMeetingBean.queueInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || videoMeetingBean.agentNickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, videoMeetingBean.agentNickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || videoMeetingBean.meetingTimeIdentifier != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, videoMeetingBean.meetingTimeIdentifier);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && videoMeetingBean.subStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, videoMeetingBean.subStatus);
    }

    public VideoMeetingBean(Long l, String str, Long l2, String str2, Integer num, String str3, Long l3, Long l4, Long l5, String str4, Integer num2, String str5, Long l6, Long l7, ChatMetadata chatMetadata, Integer num3, VideoQueueInfo videoQueueInfo, String str6, String str7, String str8) {
        this.agentJoinTime = l;
        this.agentMsg = str;
        this.appKey = l2;
        this.channelId = str2;
        this.env = num;
        this.id = str3;
        this.meetingTime = l3;
        this.meetingTimeDiff = l4;
        this.recentCallSleepTime = l5;
        this.rtcToken = str4;
        this.status = num2;
        this.uid = str5;
        this.userJoinTime = l6;
        this.videoMeetingCallSleepTime = l7;
        this.chatMetadata = chatMetadata;
        this.callType = num3;
        this.queueInfo = videoQueueInfo;
        this.agentNickName = str6;
        this.meetingTimeIdentifier = str7;
        this.subStatus = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00db: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0022: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003a: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0042: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r30v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0062: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r34v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x006a: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r35v0 java.lang.Long))
  (wrap:com.okinc.okex.common.bean.ChatMetadata:?: TERNARY null = ((wrap:int:0x0072: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.common.bean.ChatMetadata) : (r36v0 com.okinc.okex.common.bean.ChatMetadata))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007d: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r37v0 java.lang.Integer))
  (wrap:com.okinc.okex.common.bean.VideoQueueInfo:?: TERNARY null = ((wrap:int:0x0088: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.common.bean.VideoQueueInfo) : (r38v0 com.okinc.okex.common.bean.VideoQueueInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, com.okinc.okex.common.bean.ChatMetadata, java.lang.Integer, com.okinc.okex.common.bean.VideoQueueInfo, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:35) call: com.okinc.okex.common.bean.VideoMeetingBean.<init>(java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, com.okinc.okex.common.bean.ChatMetadata, java.lang.Integer, com.okinc.okex.common.bean.VideoQueueInfo, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VideoMeetingBean(Long l, String str, Long l2, String str2, Integer num, String str3, Long l3, Long l4, Long l5, String str4, Integer num2, String str5, Long l6, Long l7, ChatMetadata chatMetadata, Integer num3, VideoQueueInfo videoQueueInfo, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : l4, (i & 256) != 0 ? null : l5, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : l6, (i & 8192) != 0 ? null : l7, (i & 16384) != 0 ? null : chatMetadata, (i & 32768) != 0 ? null : num3, (i & 65536) != 0 ? null : videoQueueInfo, (i & 131072) != 0 ? null : str6, (i & 262144) != 0 ? null : str7, (i & 524288) != 0 ? null : str8);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.VideoMeetingBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VideoMeetingBean> serializer() {
            return VideoMeetingBean$$serializer.INSTANCE;
        }
    }
}
