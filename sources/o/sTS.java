package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.oklive.app.data.LiveStreamStatus;
import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.repository.remote.LiveStreamStatusModelResponse;
import com.okinc.oklive.app.data.repository.remote.LivestreamService;
import com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$clearLivestreamCache$2;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$fetchModeratorInvitationStatus$2;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$getLivestreamInfo$2;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$getLivestreamPreview$2;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$getLivestreamStatus$2;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$getRecordedStreams$2;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$getRecordingInfo$2;
import com.okinc.oklive.app.domain.LivestreamInfoImpl$updateLivestreamCache$2;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sTS implements sTP {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final LivestreamService AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final java.util.Map<java.lang.String, MutableStateFlow<LivestreamInfoResponse>> copydefault;

    @yCM
    public sTS(@NotNull LivestreamService livestreamService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(livestreamService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = livestreamService;
        this.EZpvd = coroutineDispatcher;
        this.copydefault = new LinkedHashMap();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sTS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.sTP
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super sTB> continuation) {
        return BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$getLivestreamStatus$2(str, this, null), continuation);
    }

    @Override // o.sTP
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super sTA> continuation) {
        return BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$getLivestreamInfo$2(str, this, null), continuation);
    }

    public java.lang.Object EZpvd(@NotNull LivestreamInfoResponse livestreamInfoResponse, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$updateLivestreamCache$2(livestreamInfoResponse, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.sTP
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$clearLivestreamCache$2(str, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.sTP
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super LiveStreamStatusModelResponse> continuation) {
        return BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$fetchModeratorInvitationStatus$2(str, this, null), continuation);
    }

    @Override // o.sTP
    public java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RecordingInfoResponse> continuation) {
        return BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$getRecordingInfo$2(str, str2, this, null), continuation);
    }

    @Override // o.sTP
    public java.lang.Object AEQbTJ(long j, int i, int i2, @NotNull Continuation<? super RecordedStreamsResponse> continuation) {
        return BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$getRecordedStreams$2(j, i, i2, this, null), continuation);
    }

    public final void OLrzqt(final LivestreamInfoResponse livestreamInfoResponse) {
        C32866mlf.EZpvd("livestream_view", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.sTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sTS.OLrzqt(livestreamInfoResponse, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(LivestreamInfoResponse livestreamInfoResponse, EventParamsList eventParamsList) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("channel_id", livestreamInfoResponse.getChannelId(), false);
        LiveStreamStatus status = livestreamInfoResponse.getStatus();
        eventParamsList.put("stream_status", java.lang.String.valueOf(status != null ? java.lang.Integer.valueOf(status.getCode()) : null), false);
        java.lang.Long currentViews = livestreamInfoResponse.getCurrentViews();
        if (currentViews == null || (string = currentViews.toString()) == null) {
            string = "0";
        }
        eventParamsList.put("viewer_count", string, false);
        eventParamsList.put("is_live", java.lang.String.valueOf(C44547sTz.KWHzl.AEQbTJ(livestreamInfoResponse)), false);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str, final int i, final java.lang.String str2) {
        C32866mlf.EZpvd("livestream_error", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.sTT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sTS.OLrzqt(str, i, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, int i, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("channel_id", str, false);
        eventParamsList.put("error_code", java.lang.String.valueOf(i), false);
        eventParamsList.put(EopTrackEvent.KEY_ERROR_MESSAGE, str2, true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final java.lang.String str, final LiveStreamStatus liveStreamStatus, final boolean z) {
        C32866mlf.EZpvd("livestream_status_check", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.sTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sTS.AEQbTJ(str, liveStreamStatus, z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, LiveStreamStatus liveStreamStatus, boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.SHARE_CODE, str, false);
        eventParamsList.put("stream_status", java.lang.String.valueOf(liveStreamStatus.getCode()), false);
        eventParamsList.put("status_success", java.lang.String.valueOf(z), false);
        return Unit.INSTANCE;
    }

    @Override // o.sTP
    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super LivestreamInfoResponse> continuation) {
        return BuildersKt.withContext(this.EZpvd, new LivestreamInfoImpl$getLivestreamPreview$2(j, this, null), continuation);
    }
}
