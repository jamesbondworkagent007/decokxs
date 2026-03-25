package com.amplifyframework.ui.liveness.camera;

import android.media.MediaCodec;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LivenessVideoEncoder$encoder$1$1 extends FunctionReferenceImpl implements Function2<Integer, MediaCodec.BufferInfo, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LivenessVideoEncoder$encoder$1$1(Object obj) {
        super(2, obj, LivenessVideoEncoder.class, "handleFrame", "handleFrame(ILandroid/media/MediaCodec$BufferInfo;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Unit invoke(Integer num, MediaCodec.BufferInfo bufferInfo) {
        invoke(num.intValue(), bufferInfo);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(bufferInfo, "");
        ((LivenessVideoEncoder) this.receiver).handleFrame(i, bufferInfo);
    }
}
