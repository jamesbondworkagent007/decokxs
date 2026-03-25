package com.okinc.business.defi.wallet.home;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C11283cIm;
import o.C11291cIu;
import o.C13058cyg;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.eUI;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletViewModel$checkMainWalletSyncStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ eUI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$checkMainWalletSyncStatus$1(AbstractC12782ctV abstractC12782ctV, eUI eui, Continuation<? super WalletViewModel$checkMainWalletSyncStatus$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = eui;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletViewModel$checkMainWalletSyncStatus$1(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletViewModel$checkMainWalletSyncStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13058cyg instance$default = C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null);
            List<String> listEZpvd = C56402yEa.EZpvd(this.$wallet.DbNXlk());
            this.label = 1;
            obj = instance$default.OLrzqt(listEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C11291cIu c11291cIu = (C11291cIu) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
        List<C11283cIm> listCopydefault = c11291cIu != null ? c11291cIu.copydefault() : null;
        if (listCopydefault == null || listCopydefault.isEmpty()) {
            this.this$0.AhwBna.setValue(C56443yFo.KWHzl(true));
        }
        return Unit.INSTANCE;
    }
}
