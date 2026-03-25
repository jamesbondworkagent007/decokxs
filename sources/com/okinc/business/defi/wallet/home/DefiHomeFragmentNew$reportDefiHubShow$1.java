package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$reportDefiHubShow$1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C11010bzJ;
import o.C12827cuN;
import o.C15572eNh;
import o.C18304ffq;
import o.C56391yDq;
import o.C56442yFn;
import o.C58156yvv;
import o.InterfaceC58227yxM;
import o.eZZ;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$reportDefiHubShow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$reportDefiHubShow$1(C15572eNh c15572eNh, Continuation<? super DefiHomeFragmentNew$reportDefiHubShow$1> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$reportDefiHubShow$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$reportDefiHubShow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        final List<? extends AbstractC12782ctV> list;
        List<? extends AbstractC12782ctV> list2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), true, false, false, 6, null);
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtFetchAllWallets$default, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list = list2;
                AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ(), this.this$0);
                final C15572eNh c15572eNh = this.this$0;
                final Function1 function1 = new Function1() { // from class: o.eOT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return DefiHomeFragmentNew$reportDefiHubShow$1.invokeSuspend$lambda$4(list, c15572eNh, (java.lang.Boolean) obj2);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eOV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        function1.invoke(obj2);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.eOW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return DefiHomeFragmentNew$reportDefiHubShow$1.invokeSuspend$lambda$6((java.lang.Throwable) obj2);
                    }
                };
                Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eOZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        function12.invoke(obj2);
                    }
                }), "");
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = yDY.AhwBna();
        }
        list = (List) objM7377constructorimpl;
        C15572eNh c15572eNh2 = this.this$0;
        Intrinsics.copydefault(list);
        if (c15572eNh2.copydefault((List<? extends AbstractC12782ctV>) list)) {
            this.this$0.fARcdN = list;
            eZZ ezz = this.this$0.AYXKKw;
            this.L$0 = list;
            this.label = 2;
            if (ezz.copydefault(list, this) == objCopydefault) {
                return objCopydefault;
            }
            list2 = list;
            list = list2;
        }
        AbstractC58260yxt abstractC58260yxtKWHzl2 = C58156yvv.KWHzl(C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ(), this.this$0);
        final C15572eNh c15572eNh3 = this.this$0;
        final Function1 function13 = new Function1() { // from class: o.eOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiHomeFragmentNew$reportDefiHubShow$1.invokeSuspend$lambda$4(list, c15572eNh3, (java.lang.Boolean) obj2);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.eOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                function13.invoke(obj2);
            }
        };
        final Function1 function122 = new Function1() { // from class: o.eOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return DefiHomeFragmentNew$reportDefiHubShow$1.invokeSuspend$lambda$6((java.lang.Throwable) obj2);
            }
        };
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.eOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                function122.invoke(obj2);
            }
        }), "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(List list, C15572eNh c15572eNh, Boolean bool) {
        Object next;
        Intrinsics.copydefault(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC12782ctV) next).zuWLRA()) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
        C18304ffq c18304ffqAubY = c15572eNh.AubY();
        String tag = c15572eNh.getTAG();
        WalletType walletTypeQwvEab = abstractC12782ctV != null ? abstractC12782ctV.QwvEab() : null;
        String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        String str = strDbNXlk == null ? "" : strDbNXlk;
        Intrinsics.copydefault(bool);
        c18304ffqAubY.AEQbTJ(tag, walletTypeQwvEab, str, bool.booleanValue(), abstractC12782ctV != null && abstractC12782ctV.zLjUOn());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(Throwable th) {
        return Unit.INSTANCE;
    }
}
