package com.okinc.kline.features.settings.sub.ui;

import android.content.Intent;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oTH;
import o.pBN;
import o.pFI;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineSettingActivity$enterClick$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ oTH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineSettingActivity$enterClick$5(oTH oth, Continuation<? super KlineSettingActivity$enterClick$5> continuation) {
        super(2, continuation);
        this.this$0 = oth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineSettingActivity$enterClick$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineSettingActivity$enterClick$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SettingEntryPoint settingEntryPointCopydefault = this.this$0.AYXKKw().copydefault();
            if (settingEntryPointCopydefault != null) {
                oTH oth = this.this$0;
                Intent intent = new Intent(oth, (Class<?>) pBN.class);
                intent.putExtra("contract", settingEntryPointCopydefault.copydefault());
                intent.putExtra("type", pFI.KWHzl(settingEntryPointCopydefault.AEQbTJ()));
                intent.putExtra("leverage", settingEntryPointCopydefault.EZpvd());
                oth.startActivity(intent);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
