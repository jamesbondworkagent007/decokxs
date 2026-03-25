package com.okinc.business.defi.wallet.home.walletconnect;

import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C15935eaT;
import o.C16058eck;
import o.C18351fgk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletConnectViewModel$checkDAppSessions$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $it;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C18351fgk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectViewModel$checkDAppSessions$1$1(AbstractC12782ctV abstractC12782ctV, C18351fgk c18351fgk, Continuation<? super WalletConnectViewModel$checkDAppSessions$1$1> continuation) {
        super(2, continuation);
        this.$it = abstractC12782ctV;
        this.this$0 = c18351fgk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectViewModel$checkDAppSessions$1$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletConnectViewModel$checkDAppSessions$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<DAppSession> list;
        List<WCSessionMeta> list2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<WCSessionMeta> listAhwBna = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AhwBna(this.$it.DbNXlk());
            List<DAppSession> listKWHzl = C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null).KWHzl(this.$it.DbNXlk());
            C15935eaT instance$default = C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null);
            String strDbNXlk = this.$it.DbNXlk();
            this.L$0 = listAhwBna;
            this.L$1 = listKWHzl;
            this.label = 1;
            Object objEZpvd = instance$default.EZpvd(strDbNXlk, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            list = listKWHzl;
            list2 = listAhwBna;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$1;
            list2 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list3 = (List) obj;
        if ((list2 == null || list2.isEmpty()) && list.isEmpty() && list3.isEmpty()) {
            this.this$0.copydefault().setValue(C56443yFo.AEQbTJ(4));
        }
        return Unit.INSTANCE;
    }
}
