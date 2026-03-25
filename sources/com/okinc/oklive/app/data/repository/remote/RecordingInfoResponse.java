package com.okinc.oklive.app.data.repository.remote;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.biz.net.bean.EVM5792Capability;
import com.okinc.oklive.app.data.model.remote.LivestreamOwner;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.sFC;

/* JADX INFO: loaded from: classes16.dex */
public final class RecordingInfoResponse {
    public static final int $stable = 8;

    @SerializedName("accessType")
    private final Integer accessType;

    @SerializedName(RemoteMessageConst.Notification.CHANNEL_ID)
    private final String channelId;

    @SerializedName("contentTags")
    private final List<RecordingTag> contentTags;

    @SerializedName("duration")
    private final Long duration;

    @SerializedName("featuredTokenList")
    private final List<String> featuredTokenList;

    @SerializedName("instrumentTags")
    private final List<RecordingTag> instrumentTags;

    @SerializedName("owner")
    private final LivestreamOwner owner;

    @SerializedName("playInfo")
    private final RecordingPlayInfo playInfo;

    @SerializedName(EVM5792Capability.EVM5792Atomic.STATUS_READY)
    private final Boolean ready;

    @SerializedName("recorded")
    private final Boolean recorded;

    @SerializedName("shareCode")
    private final String shareCode;

    @SerializedName("shortLink")
    private final String shortLink;

    @SerializedName("startTime")
    private final String startTime;

    @SerializedName("status")
    private final Integer status;

    @SerializedName("stream")
    private final String stream;

    @SerializedName("streamerUid")
    private final long streamerUid;

    @SerializedName("thumbnailPath")
    private final String thumbnailPath;

    @SerializedName("title")
    private final String title;

    @SerializedName("tokenTags")
    private final List<RecordingTokenTag> tokenTags;

    @SerializedName("totalViewCount")
    private final String totalViewCount;

    @SerializedName("vid")
    private final String vid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.vid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.accessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.recorded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.ready;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.totalViewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingTag> component14() {
        return this.contentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingTag> component15() {
        return this.instrumentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingTokenTag> component16() {
        return this.tokenTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component17() {
        return this.featuredTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingPlayInfo component18() {
        return this.playInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamOwner component19() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.streamerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.shareCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.stream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.thumbnailPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingInfoResponse copy(String str, long j, String str2, String str3, String str4, String str5, String str6, Long l, Integer num, Integer num2, Boolean bool, Boolean bool2, String str7, List<RecordingTag> list, List<RecordingTag> list2, List<RecordingTokenTag> list3, List<String> list4, RecordingPlayInfo recordingPlayInfo, LivestreamOwner livestreamOwner, String str8, String str9) {
        return new RecordingInfoResponse(str, j, str2, str3, str4, str5, str6, l, num, num2, bool, bool2, str7, list, list2, list3, list4, recordingPlayInfo, livestreamOwner, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordingInfoResponse)) {
            return false;
        }
        RecordingInfoResponse recordingInfoResponse = (RecordingInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.vid, (Object) recordingInfoResponse.vid) && this.streamerUid == recordingInfoResponse.streamerUid && Intrinsics.EZpvd((Object) this.channelId, (Object) recordingInfoResponse.channelId) && Intrinsics.EZpvd((Object) this.stream, (Object) recordingInfoResponse.stream) && Intrinsics.EZpvd((Object) this.title, (Object) recordingInfoResponse.title) && Intrinsics.EZpvd((Object) this.thumbnailPath, (Object) recordingInfoResponse.thumbnailPath) && Intrinsics.EZpvd((Object) this.startTime, (Object) recordingInfoResponse.startTime) && Intrinsics.EZpvd(this.duration, recordingInfoResponse.duration) && Intrinsics.EZpvd(this.status, recordingInfoResponse.status) && Intrinsics.EZpvd(this.accessType, recordingInfoResponse.accessType) && Intrinsics.EZpvd(this.recorded, recordingInfoResponse.recorded) && Intrinsics.EZpvd(this.ready, recordingInfoResponse.ready) && Intrinsics.EZpvd((Object) this.totalViewCount, (Object) recordingInfoResponse.totalViewCount) && Intrinsics.EZpvd(this.contentTags, recordingInfoResponse.contentTags) && Intrinsics.EZpvd(this.instrumentTags, recordingInfoResponse.instrumentTags) && Intrinsics.EZpvd(this.tokenTags, recordingInfoResponse.tokenTags) && Intrinsics.EZpvd(this.featuredTokenList, recordingInfoResponse.featuredTokenList) && Intrinsics.EZpvd(this.playInfo, recordingInfoResponse.playInfo) && Intrinsics.EZpvd(this.owner, recordingInfoResponse.owner) && Intrinsics.EZpvd((Object) this.shortLink, (Object) recordingInfoResponse.shortLink) && Intrinsics.EZpvd((Object) this.shareCode, (Object) recordingInfoResponse.shareCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAccessType() {
        return this.accessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingTag> getContentTags() {
        return this.contentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getFeaturedTokenList() {
        return this.featuredTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingTag> getInstrumentTags() {
        return this.instrumentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamOwner getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecordingPlayInfo getPlayInfo() {
        return this.playInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReady() {
        return this.ready;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRecorded() {
        return this.recorded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLink() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStream() {
        return this.stream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStreamerUid() {
        return this.streamerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecordingTokenTag> getTokenTags() {
        return this.tokenTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalViewCount() {
        return this.totalViewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVid() {
        return this.vid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.vid;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Long.hashCode(this.streamerUid);
        String str2 = this.channelId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.stream;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.thumbnailPath;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.startTime;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        Long l = this.duration;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Integer num = this.status;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        Integer num2 = this.accessType;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.recorded;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.ready;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        String str7 = this.totalViewCount;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        List<RecordingTag> list = this.contentTags;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        List<RecordingTag> list2 = this.instrumentTags;
        int iHashCode15 = list2 == null ? 0 : list2.hashCode();
        List<RecordingTokenTag> list3 = this.tokenTags;
        int iHashCode16 = list3 == null ? 0 : list3.hashCode();
        List<String> list4 = this.featuredTokenList;
        int iHashCode17 = list4 == null ? 0 : list4.hashCode();
        RecordingPlayInfo recordingPlayInfo = this.playInfo;
        int iHashCode18 = recordingPlayInfo == null ? 0 : recordingPlayInfo.hashCode();
        LivestreamOwner livestreamOwner = this.owner;
        int iHashCode19 = livestreamOwner == null ? 0 : livestreamOwner.hashCode();
        String str8 = this.shortLink;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.shareCode;
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecordingInfoResponse(vid=" + this.vid + ", streamerUid=" + this.streamerUid + ", channelId=" + this.channelId + ", stream=" + this.stream + ", title=" + this.title + ", thumbnailPath=" + this.thumbnailPath + ", startTime=" + this.startTime + ", duration=" + this.duration + ", status=" + this.status + ", accessType=" + this.accessType + ", recorded=" + this.recorded + ", ready=" + this.ready + ", totalViewCount=" + this.totalViewCount + ", contentTags=" + this.contentTags + ", instrumentTags=" + this.instrumentTags + ", tokenTags=" + this.tokenTags + ", featuredTokenList=" + this.featuredTokenList + ", playInfo=" + this.playInfo + ", owner=" + this.owner + ", shortLink=" + this.shortLink + ", shareCode=" + this.shareCode + ")";
    }

    public RecordingInfoResponse(String str, long j, String str2, String str3, String str4, String str5, String str6, Long l, Integer num, Integer num2, Boolean bool, Boolean bool2, String str7, List<RecordingTag> list, List<RecordingTag> list2, List<RecordingTokenTag> list3, List<String> list4, RecordingPlayInfo recordingPlayInfo, LivestreamOwner livestreamOwner, String str8, String str9) {
        this.vid = str;
        this.streamerUid = j;
        this.channelId = str2;
        this.stream = str3;
        this.title = str4;
        this.thumbnailPath = str5;
        this.startTime = str6;
        this.duration = l;
        this.status = num;
        this.accessType = num2;
        this.recorded = bool;
        this.ready = bool2;
        this.totalViewCount = str7;
        this.contentTags = list;
        this.instrumentTags = list2;
        this.tokenTags = list3;
        this.featuredTokenList = list4;
        this.playInfo = recordingPlayInfo;
        this.owner = livestreamOwner;
        this.shortLink = str8;
        this.shareCode = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (r28v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r49v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r49v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r35v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003b: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r36v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0043: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r37v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0065: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r41v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006e: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r42v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007a: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r43v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0084: ARITH (65536 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r44v0 java.util.List))
  (wrap:com.okinc.oklive.app.data.repository.remote.RecordingPlayInfo:?: TERNARY null = ((wrap:int:0x008e: ARITH (131072 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.repository.remote.RecordingPlayInfo) : (r45v0 com.okinc.oklive.app.data.repository.remote.RecordingPlayInfo))
  (wrap:com.okinc.oklive.app.data.model.remote.LivestreamOwner:?: TERNARY null = ((wrap:int:0x0098: ARITH (262144 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.LivestreamOwner) : (r46v0 com.okinc.oklive.app.data.model.remote.LivestreamOwner))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a2: ARITH (524288 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r49v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List<com.okinc.oklive.app.data.repository.remote.RecordingTag>, java.util.List<com.okinc.oklive.app.data.repository.remote.RecordingTag>, java.util.List<com.okinc.oklive.app.data.repository.remote.RecordingTokenTag>, java.util.List<java.lang.String>, com.okinc.oklive.app.data.repository.remote.RecordingPlayInfo, com.okinc.oklive.app.data.model.remote.LivestreamOwner, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, com.okinc.oklive.app.data.repository.remote.RecordingPlayInfo, com.okinc.oklive.app.data.model.remote.LivestreamOwner, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecordingInfoResponse(String str, long j, String str2, String str3, String str4, String str5, String str6, Long l, Integer num, Integer num2, Boolean bool, Boolean bool2, String str7, List list, List list2, List list3, List list4, RecordingPlayInfo recordingPlayInfo, LivestreamOwner livestreamOwner, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : list2, (32768 & i) != 0 ? null : list3, (65536 & i) != 0 ? null : list4, (131072 & i) != 0 ? null : recordingPlayInfo, (262144 & i) != 0 ? null : livestreamOwner, (524288 & i) != 0 ? null : str8, (i & 1048576) != 0 ? null : str9);
    }

    public final String getCdnThumbnailPath() {
        String str = this.thumbnailPath;
        if (str != null) {
            return sFC.OLrzqt(str);
        }
        return null;
    }
}
