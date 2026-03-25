package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C15572eNh;
import o.C15935eaT;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$bindWalletConnectState$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$bindWalletConnectState$1$1$1(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV, Continuation<? super DefiHomeFragmentNew$bindWalletConnectState$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$bindWalletConnectState$1$1$1(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$bindWalletConnectState$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletConnectUtils walletConnectUtilsQfsBiF = this.this$0.QfsBiF();
            String strDbNXlk = this.$wallet.DbNXlk();
            this.label = 1;
            obj = walletConnectUtilsQfsBiF.copydefault(strDbNXlk, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                if (!C33129mqd.KWHzl((Collection) obj)) {
                    z = false;
                }
                if (z) {
                    C15572eNh c15572eNh = this.this$0;
                    AbstractC12782ctV abstractC12782ctV = this.$wallet;
                    Intrinsics.copydefault(abstractC12782ctV);
                    c15572eNh.AhwBna(abstractC12782ctV);
                }
                C15572eNh.valueOf(this.this$0, z);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!C33129mqd.KWHzl((Collection) obj) && !C33129mqd.KWHzl((Collection) this.this$0.QOLQEE().KWHzl(this.$wallet.DbNXlk()))) {
            C15935eaT c15935eaTDTwDnp = this.this$0.DTwDnp();
            String strDbNXlk2 = this.$wallet.DbNXlk();
            this.label = 2;
            obj = c15935eaTDTwDnp.EZpvd(strDbNXlk2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!C33129mqd.KWHzl((Collection) obj)) {
            }
        }
        if (z) {
        }
        C15572eNh.valueOf(this.this$0, z);
        return Unit.INSTANCE;
    }
}
