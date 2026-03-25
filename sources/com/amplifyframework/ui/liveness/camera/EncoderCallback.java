package com.amplifyframework.ui.liveness.camera;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.amplifyframework.ui.liveness.common.LivenessEvent;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C32868mlh;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EncoderCallback extends MediaCodec.Callback {
    public static final int $stable = 0;
    private final Function2<Integer, MediaCodec.BufferInfo, Unit> handleFrame;
    private final Function1<MediaCodec.CodecException, Unit> onEncoderError;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(@NotNull MediaCodec mediaCodec, int i) {
        Intrinsics.checkNotNullParameter(mediaCodec, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(@NotNull MediaCodec mediaCodec, @NotNull MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaCodec, "");
        Intrinsics.checkNotNullParameter(mediaFormat, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.media.MediaCodec$BufferInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super android.media.MediaCodec$CodecException, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public EncoderCallback(@NotNull Function2<? super Integer, ? super MediaCodec.BufferInfo, Unit> function2, @NotNull Function1<? super MediaCodec.CodecException, Unit> function1) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.handleFrame = function2;
        this.onEncoderError = function1;
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(@NotNull MediaCodec mediaCodec, int i, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(mediaCodec, "");
        Intrinsics.checkNotNullParameter(bufferInfo, "");
        this.handleFrame.invoke(Integer.valueOf(i), bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(@NotNull MediaCodec mediaCodec, @NotNull final MediaCodec.CodecException codecException) {
        Intrinsics.checkNotNullParameter(mediaCodec, "");
        Intrinsics.checkNotNullParameter(codecException, "");
        if (!codecException.isTransient()) {
            pUU.KWHzl(LivenessVideoEncoder.TAG, "MediaCodec encoder error (non-transient): " + codecException);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_ERROR_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.EncoderCallback$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EncoderCallback.onError$lambda$0(codecException, (EventParamsList) obj);
                }
            });
            this.onEncoderError.invoke(codecException);
            return;
        }
        pUU.KWHzl(LivenessVideoEncoder.TAG, "Transient MediaCodec encoder error: " + codecException);
        TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_ERROR_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.EncoderCallback$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EncoderCallback.onError$lambda$1(codecException, (EventParamsList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onError$lambda$0(MediaCodec.CodecException codecException, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "MediaCodec encoder error (non-transient): " + codecException, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onError$lambda$1(MediaCodec.CodecException codecException, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "Transient MediaCodec encoder error: " + codecException, false, 4, null);
        return Unit.INSTANCE;
    }
}
