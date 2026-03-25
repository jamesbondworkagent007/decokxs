package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.wallet.api.bean.WalletRechargeBean;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54829xWw;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedWalletUseCase$showRechargeDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $forFee;
    final /* synthetic */ String $tokenAddress;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedWalletUseCase$showRechargeDialog$2(boolean z, AbstractActivityC33041mov abstractActivityC33041mov, String str, String str2, Continuation<? super AdvancedWalletUseCase$showRechargeDialog$2> continuation) {
        super(2, continuation);
        this.$forFee = z;
        this.$activity = abstractActivityC33041mov;
        this.$chainId = str;
        this.$tokenAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedWalletUseCase$showRechargeDialog$2(this.$forFee, this.$activity, this.$chainId, this.$tokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedWalletUseCase$showRechargeDialog$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayListCopydefault = yDY.copydefault("dex");
            if (!this.$forFee) {
                arrayListCopydefault.add("gas_station");
            }
            InterfaceC54829xWw.ActionBar.showRechargeDialog$default((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class), this.$activity, new WalletRechargeBean(this.$chainId, this.$tokenAddress, "dex", "balance", arrayListCopydefault, (ArrayList) null, false, (String) null, 0, 448, (DefaultConstructorMarker) null), 0, null, 12, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
