package com.okinc.im.imui.inputpanel.plugin;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.IMSource;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.sDZ;
import o.sGF;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioCallPluginHelper$jumpToAudioCall$6$conversation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKConversation>, Object> {
    final /* synthetic */ String $targetId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCallPluginHelper$jumpToAudioCall$6$conversation$1(String str, Continuation<? super AudioCallPluginHelper$jumpToAudioCall$6$conversation$1> continuation) {
        super(2, continuation);
        this.$targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioCallPluginHelper$jumpToAudioCall$6$conversation$1 audioCallPluginHelper$jumpToAudioCall$6$conversation$1 = new AudioCallPluginHelper$jumpToAudioCall$6$conversation$1(this.$targetId, continuation);
        audioCallPluginHelper$jumpToAudioCall$6$conversation$1.L$0 = obj;
        return audioCallPluginHelper$jumpToAudioCall$6$conversation$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKConversation> continuation) {
        return ((AudioCallPluginHelper$jumpToAudioCall$6$conversation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$targetId;
                Result.Application application = Result.Companion;
                sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
                OKConversationType oKConversationType = OKConversationType.PRIVATE;
                Intrinsics.copydefault((Object) str);
                Flow<Result<OKConversation>> flowAEQbTJ = sgfAYXKKw.AEQbTJ(str, oKConversationType, IMSource.P2P, (String) null);
                this.label = 1;
                obj = FlowKt.first(flowAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) objM7386unboximpl);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
