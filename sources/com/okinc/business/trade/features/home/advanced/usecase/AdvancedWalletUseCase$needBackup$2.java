package com.okinc.business.trade.features.home.advanced.usecase;

import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C28196kSl;
import o.C31205lpd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedWalletUseCase$needBackup$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ C28196kSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedWalletUseCase$needBackup$2(C28196kSl c28196kSl, AbstractActivityC33041mov abstractActivityC33041mov, String str, Continuation<? super AdvancedWalletUseCase$needBackup$2> continuation) {
        super(2, continuation);
        this.this$0 = c28196kSl;
        this.$activity = abstractActivityC33041mov;
        this.$source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedWalletUseCase$needBackup$2(this.this$0, this.$activity, this.$source, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((AdvancedWalletUseCase$needBackup$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractActivityC33041mov abstractActivityC33041mov;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28196kSl c28196kSl = this.this$0;
            this.label = 1;
            obj = c28196kSl.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        if (interfaceC9738bbJ == null) {
            return C56443yFo.KWHzl(true);
        }
        boolean zZLjUOn = interfaceC9738bbJ.zLjUOn();
        if (!zZLjUOn && (abstractActivityC33041mov = this.$activity) != null) {
            String str = this.$source;
            FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C31205lpd.AEQbTJ(abstractActivityC33041mov, str, supportFragmentManager, interfaceC9738bbJ);
        }
        return C56443yFo.KWHzl(!zZLjUOn);
    }
}
