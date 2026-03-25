package com.amplifyframework.predictions.aws.service;

import java.io.IOException;
import java.net.URL;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.AccelerateDecelerateInterpolator;
import o.AccessibilityInteractionClient;
import o.AccessibilityManager;
import o.AccessibilityRequestPreparer;
import o.AnimationUtils;
import o.AnticipateInterpolator;
import o.AnticipateOvershootInterpolator;
import o.BounceInterpolator;
import o.CaptioningManager;
import o.ClipRectAnimation;
import o.GridLayoutAnimationController;
import o.InterfaceC5037Ch;
import o.InterfaceC52805wZ;
import o.Interpolator;
import o.LinearInterpolator;
import o.OvershootInterpolator;
import o.PathInterpolator;
import o.ViewHierarchyEncoder;
import o.WindowInfo;
import o.WindowManagerGlobal;
import o.WindowManagerImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonPollyPresigningClient implements ViewHierarchyEncoder {
    private final ViewHierarchyEncoder pollyClient;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.pollyClient.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object deleteLexicon(@NotNull WindowManagerGlobal windowManagerGlobal, @NotNull Continuation<? super WindowInfo> continuation) {
        return this.pollyClient.deleteLexicon(windowManagerGlobal, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object describeVoices(@NotNull WindowManagerImpl windowManagerImpl, @NotNull Continuation<? super AccessibilityManager> continuation) {
        return this.pollyClient.describeVoices(windowManagerImpl, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getConfig()Lo/yg; */
    @Override // o.ViewHierarchyEncoder
    /* JADX INFO: renamed from: getConfig, reason: merged with bridge method [inline-methods] */
    public ViewHierarchyEncoder.StateListAnimator m6027getConfig() {
        return this.pollyClient.m6027getConfig();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object getLexicon(@NotNull AccessibilityInteractionClient accessibilityInteractionClient, @NotNull Continuation<? super AccessibilityRequestPreparer> continuation) {
        return this.pollyClient.getLexicon(accessibilityInteractionClient, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object getSpeechSynthesisTask(@NotNull AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, @NotNull Continuation<? super CaptioningManager> continuation) {
        return this.pollyClient.getSpeechSynthesisTask(accelerateDecelerateInterpolator, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object listLexicons(@NotNull AnimationUtils animationUtils, @NotNull Continuation<? super AnticipateInterpolator> continuation) {
        return this.pollyClient.listLexicons(animationUtils, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object listSpeechSynthesisTasks(@NotNull BounceInterpolator bounceInterpolator, @NotNull Continuation<? super AnticipateOvershootInterpolator> continuation) {
        return this.pollyClient.listSpeechSynthesisTasks(bounceInterpolator, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object putLexicon(@NotNull GridLayoutAnimationController gridLayoutAnimationController, @NotNull Continuation<? super Interpolator> continuation) {
        return this.pollyClient.putLexicon(gridLayoutAnimationController, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public Object startSpeechSynthesisTask(@NotNull ClipRectAnimation clipRectAnimation, @NotNull Continuation<? super OvershootInterpolator> continuation) {
        return this.pollyClient.startSpeechSynthesisTask(clipRectAnimation, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.ViewHierarchyEncoder
    public <T> Object synthesizeSpeech(@NotNull PathInterpolator pathInterpolator, @NotNull Function2<? super LinearInterpolator, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return this.pollyClient.synthesizeSpeech(pathInterpolator, function2, continuation);
    }

    public AmazonPollyPresigningClient(@NotNull ViewHierarchyEncoder viewHierarchyEncoder) {
        Intrinsics.checkNotNullParameter(viewHierarchyEncoder, "");
        this.pollyClient = viewHierarchyEncoder;
    }

    public final URL getPresignedSynthesizeSpeechUrl(@NotNull PathInterpolator pathInterpolator) {
        Intrinsics.checkNotNullParameter(pathInterpolator, "");
        return getPresignedSynthesizeSpeechUrl(pathInterpolator, PresignedSynthesizeSpeechUrlOptions.Companion.defaults());
    }

    public final URL getPresignedSynthesizeSpeechUrl(@NotNull PathInterpolator pathInterpolator, @NotNull PresignedSynthesizeSpeechUrlOptions presignedSynthesizeSpeechUrlOptions) {
        Intrinsics.checkNotNullParameter(pathInterpolator, "");
        Intrinsics.checkNotNullParameter(presignedSynthesizeSpeechUrlOptions, "");
        InterfaceC52805wZ credentialsProvider = presignedSynthesizeSpeechUrlOptions.getCredentialsProvider();
        if (credentialsProvider == null) {
            credentialsProvider = m6027getConfig().EZpvd();
        }
        return new URL(((InterfaceC5037Ch) BuildersKt__BuildersKt.runBlocking$default(null, new AmazonPollyPresigningClient$getPresignedSynthesizeSpeechUrl$presignedRequest$1(credentialsProvider, this, pathInterpolator, presignedSynthesizeSpeechUrlOptions, null), 1, null)).AEQbTJ().toString());
    }
}
