package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.oklive.app.common.util.BooleanOrIntDeserializer;
import com.okinc.oklive.app.data.LiveStreamStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.sFC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamInfoResponse {
    public static final String FLV_PROTOCOL = "flv";

    @SerializedName("allowRecording")
    @JsonAdapter(BooleanOrIntDeserializer.class)
    private final Boolean allowRecording;

    @SerializedName(RemoteMessageConst.Notification.CHANNEL_ID)
    private final String channelId;

    @SerializedName("chatroom")
    private final ChatroomInfo chatroom;

    @SerializedName("contentTags")
    private final List<ContentTag> contentTags;

    @SerializedName("currentServerTime")
    private final String currentServerTimeRaw;

    @SerializedName("currentViews")
    private final String currentViewsRaw;

    @SerializedName("instrumentTags")
    private final List<InstrumentTag> instrumentTags;

    @SerializedName("owner")
    private final LivestreamOwner owner;

    @SerializedName("pullUrlList")
    private final List<PullUrl> pullUrlList;

    @SerializedName("shareCode")
    private final String shareCode;

    @SerializedName("shortLink")
    private final String shortLink;

    @SerializedName("status")
    private final Integer statusCode;

    @SerializedName("streamDuration")
    private final String streamDurationRaw;

    @SerializedName("streamStartTime")
    private final String streamStartTimeRaw;

    @SerializedName("thumbnailPath")
    private final String thumbnailPath;

    @SerializedName("title")
    private final String title;

    @SerializedName("tokenTags")
    private final List<TokenTag> tokenTags;

    @SerializedName("tokenToPromote")
    private final TokenToPromote tokenToPromote;

    @SerializedName("tradeTag")
    private final String tradeTag;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.streamStartTimeRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currentServerTimeRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.streamDurationRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.currentViewsRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.shareCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamOwner component16() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PullUrl> component17() {
        return this.pullUrlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenToPromote component18() {
        return this.tokenToPromote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomInfo component19() {
        return this.chatroom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContentTag> component3() {
        return this.contentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentTag> component4() {
        return this.instrumentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenTag> component5() {
        return this.tokenTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tradeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.thumbnailPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.allowRecording;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamInfoResponse copy(@NotNull String str, @NotNull String str2, List<ContentTag> list, List<InstrumentTag> list2, List<TokenTag> list3, String str3, String str4, Integer num, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, LivestreamOwner livestreamOwner, List<PullUrl> list4, TokenToPromote tokenToPromote, ChatroomInfo chatroomInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LivestreamInfoResponse(str, str2, list, list2, list3, str3, str4, num, bool, str5, str6, str7, str8, str9, str10, livestreamOwner, list4, tokenToPromote, chatroomInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivestreamInfoResponse)) {
            return false;
        }
        LivestreamInfoResponse livestreamInfoResponse = (LivestreamInfoResponse) obj;
        return Intrinsics.EZpvd((Object) this.channelId, (Object) livestreamInfoResponse.channelId) && Intrinsics.EZpvd((Object) this.title, (Object) livestreamInfoResponse.title) && Intrinsics.EZpvd(this.contentTags, livestreamInfoResponse.contentTags) && Intrinsics.EZpvd(this.instrumentTags, livestreamInfoResponse.instrumentTags) && Intrinsics.EZpvd(this.tokenTags, livestreamInfoResponse.tokenTags) && Intrinsics.EZpvd((Object) this.tradeTag, (Object) livestreamInfoResponse.tradeTag) && Intrinsics.EZpvd((Object) this.thumbnailPath, (Object) livestreamInfoResponse.thumbnailPath) && Intrinsics.EZpvd(this.statusCode, livestreamInfoResponse.statusCode) && Intrinsics.EZpvd(this.allowRecording, livestreamInfoResponse.allowRecording) && Intrinsics.EZpvd((Object) this.streamStartTimeRaw, (Object) livestreamInfoResponse.streamStartTimeRaw) && Intrinsics.EZpvd((Object) this.currentServerTimeRaw, (Object) livestreamInfoResponse.currentServerTimeRaw) && Intrinsics.EZpvd((Object) this.streamDurationRaw, (Object) livestreamInfoResponse.streamDurationRaw) && Intrinsics.EZpvd((Object) this.currentViewsRaw, (Object) livestreamInfoResponse.currentViewsRaw) && Intrinsics.EZpvd((Object) this.shortLink, (Object) livestreamInfoResponse.shortLink) && Intrinsics.EZpvd((Object) this.shareCode, (Object) livestreamInfoResponse.shareCode) && Intrinsics.EZpvd(this.owner, livestreamInfoResponse.owner) && Intrinsics.EZpvd(this.pullUrlList, livestreamInfoResponse.pullUrlList) && Intrinsics.EZpvd(this.tokenToPromote, livestreamInfoResponse.tokenToPromote) && Intrinsics.EZpvd(this.chatroom, livestreamInfoResponse.chatroom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowRecording() {
        return this.allowRecording;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatroomInfo getChatroom() {
        return this.chatroom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ContentTag> getContentTags() {
        return this.contentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentServerTimeRaw() {
        return this.currentServerTimeRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentViewsRaw() {
        return this.currentViewsRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InstrumentTag> getInstrumentTags() {
        return this.instrumentTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivestreamOwner getOwner() {
        return this.owner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PullUrl> getPullUrlList() {
        return this.pullUrlList;
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
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStreamDurationRaw() {
        return this.streamDurationRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStreamStartTimeRaw() {
        return this.streamStartTimeRaw;
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
    public final List<TokenTag> getTokenTags() {
        return this.tokenTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenToPromote getTokenToPromote() {
        return this.tokenToPromote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeTag() {
        return this.tradeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        int iHashCode2 = this.title.hashCode();
        List<ContentTag> list = this.contentTags;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<InstrumentTag> list2 = this.instrumentTags;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        List<TokenTag> list3 = this.tokenTags;
        int iHashCode5 = list3 == null ? 0 : list3.hashCode();
        String str = this.tradeTag;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.thumbnailPath;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.statusCode;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Boolean bool = this.allowRecording;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str3 = this.streamStartTimeRaw;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currentServerTimeRaw;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.streamDurationRaw;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currentViewsRaw;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.shortLink;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.shareCode;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        LivestreamOwner livestreamOwner = this.owner;
        int iHashCode16 = livestreamOwner == null ? 0 : livestreamOwner.hashCode();
        List<PullUrl> list4 = this.pullUrlList;
        int iHashCode17 = list4 == null ? 0 : list4.hashCode();
        TokenToPromote tokenToPromote = this.tokenToPromote;
        int iHashCode18 = tokenToPromote == null ? 0 : tokenToPromote.hashCode();
        ChatroomInfo chatroomInfo = this.chatroom;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (chatroomInfo == null ? 0 : chatroomInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String resolveShareCode() {
        String str = this.shareCode;
        return str == null ? this.shortLink : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivestreamInfoResponse(channelId=" + this.channelId + ", title=" + this.title + ", contentTags=" + this.contentTags + ", instrumentTags=" + this.instrumentTags + ", tokenTags=" + this.tokenTags + ", tradeTag=" + this.tradeTag + ", thumbnailPath=" + this.thumbnailPath + ", statusCode=" + this.statusCode + ", allowRecording=" + this.allowRecording + ", streamStartTimeRaw=" + this.streamStartTimeRaw + ", currentServerTimeRaw=" + this.currentServerTimeRaw + ", streamDurationRaw=" + this.streamDurationRaw + ", currentViewsRaw=" + this.currentViewsRaw + ", shortLink=" + this.shortLink + ", shareCode=" + this.shareCode + ", owner=" + this.owner + ", pullUrlList=" + this.pullUrlList + ", tokenToPromote=" + this.tokenToPromote + ", chatroom=" + this.chatroom + ")";
    }

    public LivestreamInfoResponse(@NotNull String str, @NotNull String str2, List<ContentTag> list, List<InstrumentTag> list2, List<TokenTag> list3, String str3, String str4, Integer num, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, LivestreamOwner livestreamOwner, List<PullUrl> list4, TokenToPromote tokenToPromote, ChatroomInfo chatroomInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelId = str;
        this.title = str2;
        this.contentTags = list;
        this.instrumentTags = list2;
        this.tokenTags = list3;
        this.tradeTag = str3;
        this.thumbnailPath = str4;
        this.statusCode = num;
        this.allowRecording = bool;
        this.streamStartTimeRaw = str5;
        this.currentServerTimeRaw = str6;
        this.streamDurationRaw = str7;
        this.currentViewsRaw = str8;
        this.shortLink = str9;
        this.shareCode = str10;
        this.owner = livestreamOwner;
        this.pullUrlList = list4;
        this.tokenToPromote = tokenToPromote;
        this.chatroom = chatroomInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009d: CONSTRUCTOR 
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r27v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0013: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r28v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002b: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:com.okinc.oklive.app.data.model.remote.LivestreamOwner:?: TERNARY null = ((wrap:int:0x0071: ARITH (32768 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.LivestreamOwner) : (r39v0 com.okinc.oklive.app.data.model.remote.LivestreamOwner))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007b: ARITH (65536 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r40v0 java.util.List))
  (wrap:com.okinc.oklive.app.data.model.remote.TokenToPromote:?: TERNARY null = ((wrap:int:0x0085: ARITH (131072 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.TokenToPromote) : (r41v0 com.okinc.oklive.app.data.model.remote.TokenToPromote))
  (wrap:com.okinc.oklive.app.data.model.remote.ChatroomInfo:?: TERNARY null = ((wrap:int:0x008f: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.ChatroomInfo) : (r42v0 com.okinc.oklive.app.data.model.remote.ChatroomInfo))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.oklive.app.data.model.remote.ContentTag>, java.util.List<com.okinc.oklive.app.data.model.remote.InstrumentTag>, java.util.List<com.okinc.oklive.app.data.model.remote.TokenTag>, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.oklive.app.data.model.remote.LivestreamOwner, java.util.List<com.okinc.oklive.app.data.model.remote.PullUrl>, com.okinc.oklive.app.data.model.remote.TokenToPromote, com.okinc.oklive.app.data.model.remote.ChatroomInfo):void (m)] (LINE:15) call: com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.oklive.app.data.model.remote.LivestreamOwner, java.util.List, com.okinc.oklive.app.data.model.remote.TokenToPromote, com.okinc.oklive.app.data.model.remote.ChatroomInfo):void type: THIS */
    public /* synthetic */ LivestreamInfoResponse(String str, String str2, List list, List list2, List list3, String str3, String str4, Integer num, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, LivestreamOwner livestreamOwner, List list4, TokenToPromote tokenToPromote, ChatroomInfo chatroomInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, (32768 & i) != 0 ? null : livestreamOwner, (65536 & i) != 0 ? null : list4, (131072 & i) != 0 ? null : tokenToPromote, (i & 262144) != 0 ? null : chatroomInfo);
    }

    public final LiveStreamStatus getStatus() {
        Integer num = this.statusCode;
        if (num == null) {
            return null;
        }
        return LiveStreamStatus.Companion.OLrzqt(num.intValue());
    }

    public final Long getStreamStartTime() {
        String str = this.streamStartTimeRaw;
        if (str != null) {
            return StringsKt__StringNumberConversionsKt.getFieldNames(str);
        }
        return null;
    }

    public final Long getCurrentServerTime() {
        String str = this.currentServerTimeRaw;
        if (str != null) {
            return StringsKt__StringNumberConversionsKt.getFieldNames(str);
        }
        return null;
    }

    public final Long getStreamDuration() {
        String str = this.streamDurationRaw;
        if (str != null) {
            return StringsKt__StringNumberConversionsKt.getFieldNames(str);
        }
        return null;
    }

    public final Long getCurrentViews() {
        String str = this.currentViewsRaw;
        if (str != null) {
            return StringsKt__StringNumberConversionsKt.getFieldNames(str);
        }
        return null;
    }

    public final String getShareDeeplink() {
        String strResolveShareCode = resolveShareCode();
        if (strResolveShareCode == null) {
            return null;
        }
        return "okx://app/livestream/page?shareCode=" + strResolveShareCode;
    }

    public final String getCdnThumbnailPath() {
        String str = this.thumbnailPath;
        if (str != null) {
            return sFC.OLrzqt(str);
        }
        return null;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final List<PullUrl> getFLVPullUrl() {
        List<PullUrl> list = this.pullUrlList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String lowerCase = ((PullUrl) obj).getProtocol().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.EZpvd((Object) lowerCase, (Object) FLV_PROTOCOL)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
