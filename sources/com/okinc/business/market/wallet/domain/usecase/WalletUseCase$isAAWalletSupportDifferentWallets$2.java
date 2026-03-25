package com.okinc.business.market.wallet.domain.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.kKG;

/* JADX INFO: loaded from: classes7.dex */
public final class WalletUseCase$isAAWalletSupportDifferentWallets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ kKG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUseCase$isAAWalletSupportDifferentWallets$2(kKG kkg, Continuation<? super WalletUseCase$isAAWalletSupportDifferentWallets$2> continuation) {
        super(2, continuation);
        this.this$0 = kkg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUseCase$isAAWalletSupportDifferentWallets$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((WalletUseCase$isAAWalletSupportDifferentWallets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC9738bbJ interfaceC9738bbJ;
        InterfaceC9738bbJ interfaceC9738bbJ2;
        InterfaceC9738bbJ interfaceC9738bbJ3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<Boolean> flowAYXKKw = this.this$0.OLrzqt.AYXKKw();
            this.label = 1;
            obj = FlowKt.first(flowAYXKKw, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
                    if (interfaceC9738bbJ != null || !interfaceC9738bbJ.getFieldNames()) {
                        Flow<InterfaceC9738bbJ> flowOLrzqt = this.this$0.OLrzqt.OLrzqt();
                        this.label = 3;
                        obj = FlowKt.firstOrNull(flowOLrzqt, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
                        if (interfaceC9738bbJ2 != null) {
                        }
                        Flow<InterfaceC9738bbJ> flowOLrzqt2 = this.this$0.OLrzqt.OLrzqt();
                        this.label = 4;
                        obj = FlowKt.firstOrNull(flowOLrzqt2, this);
                        if (obj == objCopydefault) {
                        }
                        interfaceC9738bbJ3 = (InterfaceC9738bbJ) obj;
                        if (interfaceC9738bbJ3 != null) {
                        }
                    }
                    return C56443yFo.KWHzl(z);
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    interfaceC9738bbJ3 = (InterfaceC9738bbJ) obj;
                    if (interfaceC9738bbJ3 != null || !interfaceC9738bbJ3.iwGUEr()) {
                        z = false;
                    }
                    return C56443yFo.KWHzl(z);
                }
                C56391yDq.AEQbTJ(obj);
                interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
                if (interfaceC9738bbJ2 != null || !interfaceC9738bbJ2.wlaJM()) {
                    Flow<InterfaceC9738bbJ> flowOLrzqt22 = this.this$0.OLrzqt.OLrzqt();
                    this.label = 4;
                    obj = FlowKt.firstOrNull(flowOLrzqt22, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    interfaceC9738bbJ3 = (InterfaceC9738bbJ) obj;
                    if (interfaceC9738bbJ3 != null) {
                        z = false;
                    }
                }
                return C56443yFo.KWHzl(z);
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Flow<InterfaceC9738bbJ> flowOLrzqt3 = this.this$0.OLrzqt.OLrzqt();
            this.label = 2;
            obj = FlowKt.firstOrNull(flowOLrzqt3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ != null) {
            }
            Flow<InterfaceC9738bbJ> flowOLrzqt4 = this.this$0.OLrzqt.OLrzqt();
            this.label = 3;
            obj = FlowKt.firstOrNull(flowOLrzqt4, this);
            if (obj == objCopydefault) {
            }
            interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ2 != null) {
            }
            Flow<InterfaceC9738bbJ> flowOLrzqt222 = this.this$0.OLrzqt.OLrzqt();
            this.label = 4;
            obj = FlowKt.firstOrNull(flowOLrzqt222, this);
            if (obj == objCopydefault) {
            }
            interfaceC9738bbJ3 = (InterfaceC9738bbJ) obj;
            if (interfaceC9738bbJ3 != null) {
            }
            return C56443yFo.KWHzl(z);
        }
        z = false;
        return C56443yFo.KWHzl(z);
    }
}
