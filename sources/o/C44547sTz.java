package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.oklive.api.model.StreamStatus;
import com.okinc.oklive.app.data.LiveStreamStatus;
import com.okinc.oklive.app.data.model.remote.ChatroomInfo;
import com.okinc.oklive.app.data.model.remote.ChatroomPermissions;
import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.model.remote.LivestreamOwner;
import com.okinc.oklive.app.data.model.remote.PullUrl;
import com.okinc.oklive.app.data.model.remote.TokenToPromote;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44547sTz {
    public static final C44547sTz KWHzl = new C44547sTz();

    private C44547sTz() {
    }

    public final boolean AEQbTJ(@NotNull LivestreamInfoResponse livestreamInfoResponse) {
        Intrinsics.checkNotNullParameter(livestreamInfoResponse, "");
        LiveStreamStatus status = livestreamInfoResponse.getStatus();
        return status != null && status.getCode() == StreamStatus.LIVE.ordinal();
    }

    public final java.lang.String EZpvd(java.util.List<PullUrl> list) {
        java.lang.Object next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("hd", 3), C56390yDp.OLrzqt("sd", 2), C56390yDp.OLrzqt("ld", 1));
        java.util.Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) mapGEmmrt.get(((PullUrl) next).getQuality());
                int iIntValue = num != null ? num.intValue() : 0;
                do {
                    java.lang.Object next2 = it.next();
                    java.lang.Integer num2 = (java.lang.Integer) mapGEmmrt.get(((PullUrl) next2).getQuality());
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        PullUrl pullUrl = (PullUrl) next;
        if (pullUrl != null) {
            return pullUrl.getUrl();
        }
        return null;
    }

    public final java.lang.String AEQbTJ(java.util.List<PullUrl> list, @NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        if (list == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((PullUrl) next).getQuality(), (java.lang.Object) str)) {
                break;
            }
        }
        PullUrl pullUrl = (PullUrl) next;
        if (pullUrl != null) {
            return pullUrl.getUrl();
        }
        return null;
    }

    public final boolean EZpvd(ChatroomInfo chatroomInfo) {
        java.lang.Integer enabled;
        if (chatroomInfo == null || (enabled = chatroomInfo.getEnabled()) == null || enabled.intValue() != 1) {
            return false;
        }
        ChatroomPermissions permissions = chatroomInfo.getPermissions();
        return permissions == null || !Intrinsics.EZpvd(permissions.isMuted(), java.lang.Boolean.TRUE);
    }

    public final java.lang.String AEQbTJ(ChatroomInfo chatroomInfo) {
        java.lang.Integer role = chatroomInfo != null ? chatroomInfo.getRole() : null;
        return (role != null && role.intValue() == 0) ? "STREAMER" : (role != null && role.intValue() == 2) ? "MODERATOR" : (role != null && role.intValue() == 3) ? "VIEWER" : "UNKNOWN";
    }

    public final LivestreamInfoResponse KWHzl(LivestreamInfoResponse livestreamInfoResponse) {
        ChatroomInfo chatroom;
        java.util.List<PullUrl> pullUrlList;
        pUU.EZpvd("LivestreamDataConverter", "Processing livestream: " + (livestreamInfoResponse != null ? livestreamInfoResponse.getTitle() : null));
        pUU.EZpvd("LivestreamDataConverter", "Channel ID: " + (livestreamInfoResponse != null ? livestreamInfoResponse.getChannelId() : null));
        pUU.EZpvd("LivestreamDataConverter", "Status: " + (livestreamInfoResponse != null ? livestreamInfoResponse.getStatus() : null));
        pUU.EZpvd("LivestreamDataConverter", "Current viewers: " + (livestreamInfoResponse != null ? livestreamInfoResponse.getCurrentViews() : null));
        if (livestreamInfoResponse != null && (pullUrlList = livestreamInfoResponse.getPullUrlList()) != null) {
            for (PullUrl pullUrl : pullUrlList) {
                pUU.EZpvd("LivestreamDataConverter", "Available quality: " + pullUrl.getQuality() + " - " + pullUrl.getProtocol());
            }
        }
        if (livestreamInfoResponse != null && (chatroom = livestreamInfoResponse.getChatroom()) != null) {
            pUU.EZpvd("LivestreamDataConverter", "Chatroom enabled: " + chatroom.getEnabled());
            C44547sTz c44547sTz = KWHzl;
            pUU.EZpvd("LivestreamDataConverter", "User role: " + c44547sTz.AEQbTJ(chatroom));
            pUU.EZpvd("LivestreamDataConverter", "Can send message: " + c44547sTz.EZpvd(chatroom));
        }
        return livestreamInfoResponse;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> EZpvd(@NotNull LivestreamInfoResponse livestreamInfoResponse) {
        java.lang.Integer enabled;
        Intrinsics.checkNotNullParameter(livestreamInfoResponse, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[13];
        pairArr[0] = C56390yDp.OLrzqt(RemoteMessageConst.Notification.CHANNEL_ID, livestreamInfoResponse.getChannelId());
        pairArr[1] = C56390yDp.OLrzqt("title", livestreamInfoResponse.getTitle());
        LiveStreamStatus status = livestreamInfoResponse.getStatus();
        pairArr[2] = C56390yDp.OLrzqt("status", status != null ? java.lang.Integer.valueOf(status.getCode()) : null);
        pairArr[3] = C56390yDp.OLrzqt("isLive", java.lang.Boolean.valueOf(AEQbTJ(livestreamInfoResponse)));
        pairArr[4] = C56390yDp.OLrzqt("viewerCount", livestreamInfoResponse.getCurrentViews());
        pairArr[5] = C56390yDp.OLrzqt("hasRecording", java.lang.Boolean.valueOf(Intrinsics.EZpvd(livestreamInfoResponse.getAllowRecording(), java.lang.Boolean.TRUE)));
        pairArr[6] = C56390yDp.OLrzqt("streamDuration", livestreamInfoResponse.getStreamDuration());
        LivestreamOwner owner = livestreamInfoResponse.getOwner();
        pairArr[7] = C56390yDp.OLrzqt("ownerUid", owner != null ? java.lang.Long.valueOf(owner.getUserUid()) : null);
        LivestreamOwner owner2 = livestreamInfoResponse.getOwner();
        pairArr[8] = C56390yDp.OLrzqt("ownerNickname", owner2 != null ? owner2.getNickname() : null);
        ChatroomInfo chatroom = livestreamInfoResponse.getChatroom();
        pairArr[9] = C56390yDp.OLrzqt("chatroomEnabled", java.lang.Boolean.valueOf((chatroom == null || (enabled = chatroom.getEnabled()) == null || enabled.intValue() != 1) ? false : true));
        pairArr[10] = C56390yDp.OLrzqt("userRole", AEQbTJ(livestreamInfoResponse.getChatroom()));
        pairArr[11] = C56390yDp.OLrzqt("tokenPromoted", java.lang.Boolean.valueOf(livestreamInfoResponse.getTokenToPromote() != null));
        TokenToPromote tokenToPromote = livestreamInfoResponse.getTokenToPromote();
        pairArr[12] = C56390yDp.OLrzqt("tokenSymbol", tokenToPromote != null ? tokenToPromote.getTokenSymbol() : null);
        return C56424yEw.gEmmrt(pairArr);
    }

    public final boolean OLrzqt(@NotNull LivestreamInfoResponse livestreamInfoResponse) {
        Intrinsics.checkNotNullParameter(livestreamInfoResponse, "");
        return (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) livestreamInfoResponse.getChannelId()) ^ true) && livestreamInfoResponse.getStatus() != null;
    }
}
