package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class FaceLivenessSession {
    private final List<FaceLivenessSessionChallenge> challenges;
    private final Function1<ChallengeResponseEvent, Unit> onChallengeResponseEvent;
    private final Function1<VideoEvent, Unit> onVideoEvent;
    private final Function1<Integer, Unit> stopLivenessSession;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FaceLivenessSessionChallenge> getChallenges() {
        return this.challenges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void stopSession() {
        stopSession$default(this, null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.amplifyframework.predictions.models.FaceLivenessSessionChallenge> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.amplifyframework.predictions.models.VideoEvent, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.amplifyframework.predictions.models.ChallengeResponseEvent, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceLivenessSession(@NotNull List<? extends FaceLivenessSessionChallenge> list, @NotNull Function1<? super VideoEvent, Unit> function1, @NotNull Function1<? super ChallengeResponseEvent, Unit> function12, @NotNull Function1<? super Integer, Unit> function13) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.challenges = list;
        this.onVideoEvent = function1;
        this.onChallengeResponseEvent = function12;
        this.stopLivenessSession = function13;
    }

    public final void sendVideoEvent(@NotNull VideoEvent videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "");
        this.onVideoEvent.invoke(videoEvent);
    }

    public final void sendChallengeResponseEvent(@NotNull ChallengeResponseEvent challengeResponseEvent) {
        Intrinsics.checkNotNullParameter(challengeResponseEvent, "");
        this.onChallengeResponseEvent.invoke(challengeResponseEvent);
    }

    public static /* synthetic */ void stopSession$default(FaceLivenessSession faceLivenessSession, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        faceLivenessSession.stopSession(num);
    }

    public final void stopSession(Integer num) {
        this.stopLivenessSession.invoke(num);
    }
}
