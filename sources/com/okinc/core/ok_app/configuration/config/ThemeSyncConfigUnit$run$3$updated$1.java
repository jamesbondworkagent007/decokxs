package com.okinc.core.ok_app.configuration.config;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33290mtf;
import o.C33512mxp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class ThemeSyncConfigUnit$run$3$updated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ int $colorTheme;
    final /* synthetic */ int $upDown;
    int label;
    final /* synthetic */ C33290mtf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSyncConfigUnit$run$3$updated$1(C33290mtf c33290mtf, int i, int i2, Continuation<? super ThemeSyncConfigUnit$run$3$updated$1> continuation) {
        super(2, continuation);
        this.this$0 = c33290mtf;
        this.$upDown = i;
        this.$colorTheme = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThemeSyncConfigUnit$run$3$updated$1(this.this$0, this.$upDown, this.$colorTheme, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ThemeSyncConfigUnit$run$3$updated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl();
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            return C56443yFo.KWHzl(c33512mxp.copydefault(this.$upDown) || c33512mxp.OLrzqt(this.$colorTheme));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
