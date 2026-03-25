package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedWalletUseCase$buildAccountInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AccountInfo>, Object> {
    final /* synthetic */ boolean $canUseSmartAccount;
    int label;
    final /* synthetic */ C28196kSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedWalletUseCase$buildAccountInfo$2(C28196kSl c28196kSl, boolean z, Continuation<? super AdvancedWalletUseCase$buildAccountInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = c28196kSl;
        this.$canUseSmartAccount = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedWalletUseCase$buildAccountInfo$2(this.this$0, this.$canUseSmartAccount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AccountInfo> continuation) {
        return ((AdvancedWalletUseCase$buildAccountInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strDbNXlk;
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
        if (this.$canUseSmartAccount) {
            String strEjfBZ = interfaceC9738bbJ != null ? interfaceC9738bbJ.ejfBZ() : null;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(1);
            Boolean boolKWHzl = C56443yFo.KWHzl(this.this$0.AEQbTJ.copydefault());
            strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
            return new AccountInfo(strEjfBZ, numAEQbTJ, boolKWHzl, strDbNXlk != null ? strDbNXlk : "");
        }
        strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        return new AccountInfo((String) null, C56443yFo.AEQbTJ(2), C56443yFo.KWHzl(this.this$0.AEQbTJ.copydefault()), strDbNXlk == null ? "" : strDbNXlk, 1, (DefaultConstructorMarker) null);
    }
}
