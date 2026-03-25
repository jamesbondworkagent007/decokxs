package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.C13983dcq;
import o.C13990dcx;
import o.C15974ebF;
import o.C33491mxU;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onSwitchEvmChain$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $chainIdHex;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onSwitchEvmChain$2$1$1(C15974ebF c15974ebF, String str, String str2, Continuation<? super DAppMethodHelper$onSwitchEvmChain$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$walletId = str;
        this.$chainIdHex = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onSwitchEvmChain$2$1$1(this.this$0, this.$walletId, this.$chainIdHex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onSwitchEvmChain$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str = this.$walletId;
            this.label = 1;
            obj = c15974ebF.KWHzl(str, (Continuation<? super AbstractC12782ctV>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List<C13983dcq> listCopydefault = C13990dcx.copydefault((AbstractC12782ctV) obj);
        String str2 = this.$chainIdHex;
        Iterator<T> it = listCopydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((C13983dcq) next).copydefault().EZpvd(), (Object) C33491mxU.OLrzqt(str2))) {
                break;
            }
        }
        C13983dcq c13983dcq = (C13983dcq) next;
        if (c13983dcq == null || (strAEQbTJ = c13983dcq.AEQbTJ()) == null) {
            throw new OKXConnectException(OKXConnectException.ErrorType.CHAIN_NOT_SUPPORTED, (String) null, 2, (DefaultConstructorMarker) null);
        }
        return strAEQbTJ;
    }
}
