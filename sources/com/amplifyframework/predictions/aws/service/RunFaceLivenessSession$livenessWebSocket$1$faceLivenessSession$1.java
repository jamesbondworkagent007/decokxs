package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.predictions.models.VideoEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$1 extends FunctionReferenceImpl implements Function1<VideoEvent, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RunFaceLivenessSession$livenessWebSocket$1$faceLivenessSession$1(Object obj) {
        super(1, obj, RunFaceLivenessSession.class, "processVideoEvent", "processVideoEvent(Lcom/amplifyframework/predictions/models/VideoEvent;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(VideoEvent videoEvent) {
        invoke2(videoEvent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull VideoEvent videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "");
        ((RunFaceLivenessSession) this.receiver).processVideoEvent(videoEvent);
    }
}
