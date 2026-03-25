package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.http.LivenessWebSocket;
import com.amplifyframework.predictions.aws.models.ColorChallenge;
import com.amplifyframework.predictions.aws.models.ColorChallengeResponse;
import com.amplifyframework.predictions.aws.models.ColorChallengeType;
import com.amplifyframework.predictions.aws.models.ColorDisplayInformation;
import com.amplifyframework.predictions.aws.models.FaceTargetChallenge;
import com.amplifyframework.predictions.aws.models.FaceTargetChallengeResponse;
import com.amplifyframework.predictions.aws.models.FaceTargetMatchingParameters;
import com.amplifyframework.predictions.aws.models.InitialFaceDetected;
import com.amplifyframework.predictions.aws.models.RgbColor;
import com.amplifyframework.predictions.aws.models.liveness.ChallengeConfig;
import com.amplifyframework.predictions.aws.models.liveness.ColorSequence;
import com.amplifyframework.predictions.aws.models.liveness.FaceMovementAndLightServerChallenge;
import com.amplifyframework.predictions.aws.models.liveness.FreshnessColor;
import com.amplifyframework.predictions.aws.models.liveness.OvalParameters;
import com.amplifyframework.predictions.aws.models.liveness.SessionInformation;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import com.amplifyframework.predictions.models.FaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSessionChallenge;
import com.amplifyframework.predictions.models.FaceLivenessSessionInformation;
import com.amplifyframework.predictions.models.VideoEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC52805wZ;
import o.yDY;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RunFaceLivenessSession {
    private final InterfaceC52805wZ credentialsProvider;
    private final String livenessEndpoint;
    private final LivenessWebSocket livenessWebSocket;
    private final String originAwsWssDomain;
    private final String proxyTarget;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC52805wZ getCredentialsProvider() {
        return this.credentialsProvider;
    }

    public RunFaceLivenessSession(@NotNull String str, @NotNull FaceLivenessSessionInformation faceLivenessSessionInformation, @NotNull InterfaceC52805wZ interfaceC52805wZ, String str2, @NotNull final Consumer<FaceLivenessSession> consumer, @NotNull final Action action, @NotNull final Consumer<PredictionsException> consumer2, Consumer<OkHttpClient.Builder> consumer3, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(faceLivenessSessionInformation, "");
        Intrinsics.checkNotNullParameter(interfaceC52805wZ, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.credentialsProvider = interfaceC52805wZ;
        String str4 = "streaming-rekognition." + faceLivenessSessionInformation.getRegion() + ".amazonaws.com";
        this.originAwsWssDomain = str4;
        String str5 = "wss://" + str4 + ":443";
        this.livenessEndpoint = str5;
        String str6 = str5 + "/start-face-liveness-session-websocket";
        this.proxyTarget = str6;
        LivenessWebSocket livenessWebSocket = new LivenessWebSocket(interfaceC52805wZ, str6 + "?session-id=" + str + "&challenge-versions=" + faceLivenessSessionInformation.getChallengeVersions() + "&video-width=" + ((int) faceLivenessSessionInformation.getVideoWidth()) + "&video-height=" + ((int) faceLivenessSessionInformation.getVideoHeight()), faceLivenessSessionInformation.getRegion(), faceLivenessSessionInformation, str2, new Consumer() { // from class: com.amplifyframework.predictions.aws.service.RunFaceLivenessSession$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RunFaceLivenessSession.livenessWebSocket$lambda$0(this.f$0, consumer, (SessionInformation) obj);
            }
        }, new Consumer() { // from class: com.amplifyframework.predictions.aws.service.RunFaceLivenessSession$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                RunFaceLivenessSession.livenessWebSocket$lambda$2(consumer2, (PredictionsException) obj);
            }
        }, new Action() { // from class: com.amplifyframework.predictions.aws.service.RunFaceLivenessSession$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Action
            public final void call() {
                RunFaceLivenessSession.livenessWebSocket$lambda$1(action);
            }
        }, consumer3, str3, str6, z);
        livenessWebSocket.start();
        this.livenessWebSocket = livenessWebSocket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void livenessWebSocket$lambda$0(RunFaceLivenessSession runFaceLivenessSession, Consumer consumer, SessionInformation sessionInformation) {
        Intrinsics.checkNotNullParameter(runFaceLivenessSession, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(sessionInformation, "");
        consumer.accept(new FaceLivenessSession(runFaceLivenessSession.processSessionInformation(sessionInformation), new RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$1(runFaceLivenessSession), new RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$2(runFaceLivenessSession), new RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$3(runFaceLivenessSession)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void livenessWebSocket$lambda$1(Action action) {
        Intrinsics.checkNotNullParameter(action, "");
        action.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void livenessWebSocket$lambda$2(Consumer consumer, PredictionsException predictionsException) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(predictionsException, "");
        consumer.accept(predictionsException);
    }

    private final List<FaceLivenessSessionChallenge> processSessionInformation(SessionInformation sessionInformation) {
        FaceMovementAndLightServerChallenge faceMovementAndLightChallenge = sessionInformation.getChallenge().getFaceMovementAndLightChallenge();
        ArrayList arrayList = new ArrayList();
        OvalParameters ovalParameters = faceMovementAndLightChallenge.getOvalParameters();
        ChallengeConfig challengeConfig = faceMovementAndLightChallenge.getChallengeConfig();
        arrayList.add(new FaceTargetChallenge(ovalParameters.getWidth(), ovalParameters.getHeight(), ovalParameters.getCenterX(), ovalParameters.getCenterY(), new FaceTargetMatchingParameters(challengeConfig.getOvalIouThreshold(), challengeConfig.getOvalIouWidthThreshold(), challengeConfig.getOvalIouHeightThreshold(), challengeConfig.getFaceIouWidthThreshold(), challengeConfig.getFaceIouHeightThreshold(), challengeConfig.getOvalFitTimeout())));
        ColorChallengeType colorChallengeType = ColorChallengeType.SEQUENTIAL;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : faceMovementAndLightChallenge.getColorSequences()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ColorSequence colorSequence = (ColorSequence) obj;
            List<Integer> rgb = colorSequence.getFreshnessColor().getRGB();
            boolean z = true;
            RgbColor rgbColor = new RgbColor(rgb.get(0).intValue(), rgb.get(1).intValue(), rgb.get(2).intValue());
            float flatDisplayDuration = colorSequence.getFlatDisplayDuration();
            if (colorSequence.getFlatDisplayDuration() == 0.0f) {
                flatDisplayDuration = colorSequence.getDownscrollDuration();
            } else {
                z = false;
            }
            arrayList2.add(new ColorDisplayInformation(rgbColor, flatDisplayDuration, z));
            i++;
        }
        arrayList.add(new ColorChallenge(this.livenessWebSocket.getChallengeId$aws_predictions_release(), colorChallengeType, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2)));
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processVideoEvent(VideoEvent videoEvent) {
        this.livenessWebSocket.sendVideoEvent(videoEvent.getBytes(), videoEvent.getTimestamp().getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processChallengeResponseEvent(ChallengeResponseEvent challengeResponseEvent) {
        if (challengeResponseEvent instanceof InitialFaceDetected) {
            InitialFaceDetected initialFaceDetected = (InitialFaceDetected) challengeResponseEvent;
            this.livenessWebSocket.sendInitialFaceDetectedEvent(initialFaceDetected.getFaceLocation(), initialFaceDetected.getTimestamp().getTime());
        } else if (challengeResponseEvent instanceof ColorChallengeResponse) {
            ColorChallengeResponse colorChallengeResponse = (ColorChallengeResponse) challengeResponseEvent;
            List listGEmmrt = yDY.gEmmrt(Integer.valueOf(colorChallengeResponse.getCurrentColor().getRed()), Integer.valueOf(colorChallengeResponse.getCurrentColor().getGreen()), Integer.valueOf(colorChallengeResponse.getCurrentColor().getBlue()));
            this.livenessWebSocket.sendColorDisplayedEvent(new FreshnessColor(listGEmmrt), new FreshnessColor(colorChallengeResponse.getPreviousColor() != null ? yDY.gEmmrt(Integer.valueOf(colorChallengeResponse.getPreviousColor().getRed()), Integer.valueOf(colorChallengeResponse.getPreviousColor().getGreen()), Integer.valueOf(colorChallengeResponse.getPreviousColor().getBlue())) : listGEmmrt), colorChallengeResponse.getColorSequenceIndex(), colorChallengeResponse.getCurrentColorStartTime().getTime());
        } else if (challengeResponseEvent instanceof FaceTargetChallengeResponse) {
            FaceTargetChallengeResponse faceTargetChallengeResponse = (FaceTargetChallengeResponse) challengeResponseEvent;
            this.livenessWebSocket.sendFinalEvent(faceTargetChallengeResponse.getTargetLocation(), faceTargetChallengeResponse.getFaceInTargetStartTimestamp().getTime(), faceTargetChallengeResponse.getFaceInTargetEndTimestamp().getTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLivenessSession(Integer num) {
        Unit unit;
        this.livenessWebSocket.setClientStoppedSession$aws_predictions_release(true);
        if (num != null) {
            this.livenessWebSocket.destroy(num.intValue());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LivenessWebSocket.destroy$default(this.livenessWebSocket, 0, 1, null);
        }
    }
}
