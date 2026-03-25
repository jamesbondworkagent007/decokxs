package com.okinc.im.usecase.share;

import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35872oGv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sFC;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckShareMessageAnimationUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C35872oGv.Activity>, Object> {
    final /* synthetic */ String $animationCdnPath;
    int label;
    final /* synthetic */ C35872oGv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckShareMessageAnimationUseCase$invoke$2(String str, C35872oGv c35872oGv, Continuation<? super CheckShareMessageAnimationUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$animationCdnPath = str;
        this.this$0 = c35872oGv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckShareMessageAnimationUseCase$invoke$2(this.$animationCdnPath, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C35872oGv.Activity> continuation) {
        return ((CheckShareMessageAnimationUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strOLrzqt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("ShareMessageAnimation", "invoke - cdnPath: " + this.$animationCdnPath);
            if (this.this$0.OLrzqt()) {
                pUU.EZpvd("ShareMessageAnimation", "invoke - Skip: within throttle period");
                return C35872oGv.Activity.Application.KWHzl;
            }
            String str = this.$animationCdnPath;
            String str2 = null;
            if (str != null) {
                if (!(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
                    str = null;
                }
                if (str != null && (strOLrzqt = sFC.OLrzqt(str)) != null && (!StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt))) {
                    str2 = strOLrzqt;
                }
            }
            if (str2 == null) {
                pUU.EZpvd("ShareMessageAnimation", "invoke - Skip: no valid animation URL (cdnPath: " + this.$animationCdnPath + ")");
                return C35872oGv.Activity.Application.KWHzl;
            }
            SPUtils.put("key_share_animation_last_played_time", C56443yFo.KWHzl(System.currentTimeMillis()));
            pUU.KWHzl("ShareMessageAnimation", "invoke - TriggerAnimation: " + str2);
            return new C35872oGv.Activity.TaskDescription(str2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
