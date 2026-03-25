package com.okinc.im.imui.sticker.viewmodel;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerSettingsViewModel$subtitle$1 extends SuspendLambda implements yHO<Long, Long, Continuation<? super Pair<? extends Long, ? extends Long>>, Object> {
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StickerSettingsViewModel$subtitle$1(Continuation<? super StickerSettingsViewModel$subtitle$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(long j, long j2, Continuation<? super Pair<Long, Long>> continuation) {
        StickerSettingsViewModel$subtitle$1 stickerSettingsViewModel$subtitle$1 = new StickerSettingsViewModel$subtitle$1(continuation);
        stickerSettingsViewModel$subtitle$1.J$0 = j;
        stickerSettingsViewModel$subtitle$1.J$1 = j2;
        return stickerSettingsViewModel$subtitle$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(Long l, Long l2, Continuation<? super Pair<? extends Long, ? extends Long>> continuation) {
        return invoke(l.longValue(), l2.longValue(), (Continuation<? super Pair<Long, Long>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return new Pair(C56443yFo.KWHzl(this.J$0), C56443yFo.KWHzl(this.J$1));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
