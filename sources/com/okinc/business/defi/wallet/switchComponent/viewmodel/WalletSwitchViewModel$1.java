package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C17781fSa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC17773fRt;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$1(C17781fSa c17781fSa, Continuation<? super WalletSwitchViewModel$1> continuation) {
        super(1, continuation);
        this.this$0 = c17781fSa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WalletSwitchViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((WalletSwitchViewModel$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C17781fSa c17781fSa;
        InterfaceC9738bbJ interfaceC9738bbJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c17781fSa = this.this$0;
            CurrentWalletSwitchConfig currentWalletSwitchConfigKWHzl = c17781fSa.KWHzl();
            CurrentWalletSelectMode currentWalletSelectModeAEQbTJ = currentWalletSwitchConfigKWHzl != null ? currentWalletSwitchConfigKWHzl.AEQbTJ() : null;
            if (Intrinsics.EZpvd(currentWalletSelectModeAEQbTJ, CurrentWalletSelectMode.MainWalletSelected.KWHzl)) {
                InterfaceC17773fRt interfaceC17773fRt = this.this$0.AwvSrB;
                this.L$0 = c17781fSa;
                this.label = 1;
                obj = interfaceC17773fRt.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            } else if (currentWalletSelectModeAEQbTJ instanceof CurrentWalletSelectMode.WalletSelectedById) {
                InterfaceC17773fRt interfaceC17773fRt2 = this.this$0.AwvSrB;
                String strOLrzqt = ((CurrentWalletSelectMode.WalletSelectedById) currentWalletSelectModeAEQbTJ).OLrzqt();
                this.L$0 = c17781fSa;
                this.label = 2;
                obj = interfaceC17773fRt2.copydefault(strOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            } else {
                interfaceC9738bbJ = null;
            }
        } else if (i == 1) {
            c17781fSa = (C17781fSa) this.L$0;
            C56391yDq.AEQbTJ(obj);
            interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            c17781fSa = (C17781fSa) this.L$0;
            C56391yDq.AEQbTJ(obj);
            interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        }
        c17781fSa.values = interfaceC9738bbJ;
        C17781fSa c17781fSa2 = this.this$0;
        this.L$0 = null;
        this.label = 3;
        if (c17781fSa2.copydefault((Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
