package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C13062cyk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WalletEntity>>, Object> {
    final /* synthetic */ C13062cyk.StateListAnimator<C13062cyk.TaskDescription> $requestEosResult;
    final /* synthetic */ C13062cyk.StateListAnimator<C13062cyk.TaskDescription> $requestSegwitResult;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1(C13062cyk.StateListAnimator<C13062cyk.TaskDescription> stateListAnimator, C13062cyk.StateListAnimator<C13062cyk.TaskDescription> stateListAnimator2, Continuation<? super WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1> continuation) {
        super(2, continuation);
        this.$requestSegwitResult = stateListAnimator;
        this.$requestEosResult = stateListAnimator2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1(this.$requestSegwitResult, this.$requestEosResult, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WalletEntity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WalletEntity>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WalletEntity>> continuation) {
        return ((WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Set setDXXBbs = CollectionsKt___CollectionsKt.DXXBbs(this.$requestSegwitResult.OLrzqt().copydefault());
            setDXXBbs.addAll(this.$requestEosResult.OLrzqt().copydefault());
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setDXXBbs);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
