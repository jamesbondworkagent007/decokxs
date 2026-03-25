package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import android.app.Activity;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletItemUIData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletLoadUIData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C33064mpR;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fKV;
import o.rVN;

/* JADX INFO: loaded from: classes23.dex */
public final class EscapedPassKeyWalletListActivity$observeUIState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fKV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapedPassKeyWalletListActivity$observeUIState$2(fKV fkv, Continuation<? super EscapedPassKeyWalletListActivity$observeUIState$2> continuation) {
        super(2, continuation);
        this.this$0 = fkv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapedPassKeyWalletListActivity$observeUIState$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapedPassKeyWalletListActivity$observeUIState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapedPassKeyWalletListActivity$observeUIState$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends EscapedWalletLoadUIData>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fKV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fKV fkv, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fkv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends EscapedWalletLoadUIData> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<EscapedWalletLoadUIData>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<EscapedWalletLoadUIData> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    this.this$0.fIwbmz();
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    this.this$0.AkhnZx();
                    this.this$0.KWHzl();
                    this.this$0.AYXKKw();
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    boolean zIsLoadMore = ((EscapedWalletLoadUIData) activity.copydefault()).isLoadMore();
                    List<EscapedWalletItemUIData> escapedWalletList = ((EscapedWalletLoadUIData) activity.copydefault()).getEscapedWalletListUIData().getEscapedWalletList();
                    if (zIsLoadMore) {
                        C33064mpR.KWHzl(this.this$0.fetchVPNInfo(), escapedWalletList);
                    } else if (!((EscapedWalletLoadUIData) activity.copydefault()).isFirstLoad() || !escapedWalletList.isEmpty()) {
                        this.this$0.fetchVPNInfo().AhwBna(escapedWalletList);
                    } else {
                        this.this$0.fARcdN();
                        return Unit.INSTANCE;
                    }
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    this.this$0.AkhnZx();
                    this.this$0.KWHzl();
                    this.this$0.fARcdN();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC49371unL<EscapedWalletLoadUIData>> stateFlowEZpvd = this.this$0.AEQbTJ().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
