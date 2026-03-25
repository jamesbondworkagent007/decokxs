package com.okinc.im.call.repository;

import android.media.AudioRecord;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35235nrW;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$isMicrophoneAvailable$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ int $minBufferSize;
    final /* synthetic */ C35235nrW $this_runCatching;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$isMicrophoneAvailable$2$1(int i, C35235nrW c35235nrW, Continuation<? super CallRepositoryImpl$isMicrophoneAvailable$2$1> continuation) {
        super(2, continuation);
        this.$minBufferSize = i;
        this.$this_runCatching = c35235nrW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$isMicrophoneAvailable$2$1(this.$minBufferSize, this.$this_runCatching, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CallRepositoryImpl$isMicrophoneAvailable$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AudioRecord audioRecord = new AudioRecord(1, 44100, 16, 2, this.$minBufferSize);
            try {
                boolean z = true;
                if (audioRecord.getState() != 1) {
                    this.$this_runCatching.KWHzl("isMicrophoneAvailable: AudioRecord initialization failed - mic might be in use");
                    return C56443yFo.KWHzl(false);
                }
                audioRecord.startRecording();
                if (audioRecord.getRecordingState() != 3) {
                    z = false;
                }
                this.$this_runCatching.KWHzl("isMicrophoneAvailable: Check result=" + z);
                audioRecord.stop();
                audioRecord.release();
                return C56443yFo.KWHzl(z);
            } finally {
                audioRecord.stop();
                audioRecord.release();
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
