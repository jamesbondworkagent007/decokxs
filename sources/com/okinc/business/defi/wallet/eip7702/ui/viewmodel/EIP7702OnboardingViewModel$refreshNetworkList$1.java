package com.okinc.business.defi.wallet.eip7702.ui.viewmodel;

import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C10854bwM;
import o.C15272eCe;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.eCD;

/* JADX INFO: loaded from: classes18.dex */
public final class EIP7702OnboardingViewModel$refreshNetworkList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $afterBlock;
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $beforeBlock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ eCD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EIP7702OnboardingViewModel$refreshNetworkList$1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function22, eCD ecd, Continuation<? super EIP7702OnboardingViewModel$refreshNetworkList$1> continuation) {
        super(2, continuation);
        this.$beforeBlock = function2;
        this.$afterBlock = function22;
        this.this$0 = ecd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EIP7702OnboardingViewModel$refreshNetworkList$1 eIP7702OnboardingViewModel$refreshNetworkList$1 = new EIP7702OnboardingViewModel$refreshNetworkList$1(this.$beforeBlock, this.$afterBlock, this.this$0, continuation);
        eIP7702OnboardingViewModel$refreshNetworkList$1.L$0 = obj;
        return eIP7702OnboardingViewModel$refreshNetworkList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EIP7702OnboardingViewModel$refreshNetworkList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:67|(1:(1:(1:(1:(1:(3:9|63|64)(2:10|11))(5:12|58|(2:60|(1:62))|63|64))(7:13|53|(2:55|(1:57))|58|(0)|63|64))(18:14|71|15|30|(5:33|(1:35)(1:36)|(3:73|38|76)(1:75)|74|31)|72|39|(1:41)|42|47|(2:49|(1:51))|52|53|(0)|58|(0)|63|64))(1:19))(2:20|(2:22|(1:24)))|25|69|26|(1:28)(16:29|30|(1:31)|72|39|(0)|42|47|(0)|52|53|(0)|58|(0)|63|64)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[Catch: all -> 0x0054, CancellationException -> 0x0150, TryCatch #0 {CancellationException -> 0x0150, blocks: (B:15:0x0048, B:30:0x0094, B:31:0x00a6, B:33:0x00ac, B:38:0x00dc, B:36:0x00c4, B:39:0x00e0, B:41:0x00e6, B:42:0x00ec, B:26:0x0078), top: B:67:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: all -> 0x0054, CancellationException -> 0x0150, TryCatch #0 {CancellationException -> 0x0150, blocks: (B:15:0x0048, B:30:0x0094, B:31:0x00a6, B:33:0x00ac, B:38:0x00dc, B:36:0x00c4, B:39:0x00e0, B:41:0x00e6, B:42:0x00ec, B:26:0x0078), top: B:67:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        eCD ecd;
        Object objM7386unboximpl;
        CoroutineScope coroutineScope3;
        Object objM7377constructorimpl;
        Object obj2;
        CoroutineScope coroutineScope4;
        List arrayList;
        Function2<CoroutineScope, Continuation<? super Unit>, Object> function2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function22 = this.$beforeBlock;
                if (function22 != null) {
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (function22.invoke(coroutineScope, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C56391yDq.AEQbTJ(obj);
                                return Unit.INSTANCE;
                            }
                            coroutineScope4 = (CoroutineScope) this.L$0;
                            C56391yDq.AEQbTJ(obj);
                            function2 = this.$afterBlock;
                            if (function2 != null) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 5;
                                if (function2.invoke(coroutineScope4, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        Object obj3 = this.L$1;
                        CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        obj2 = obj3;
                        coroutineScope4 = coroutineScope5;
                        eCD ecd2 = this.this$0;
                        if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                            MutableStateFlow mutableStateFlow = ecd2.AEQbTJ;
                            List listEZpvd = C56402yEa.EZpvd(EIP7702UIState.StateListAnimator.KWHzl);
                            this.L$0 = coroutineScope4;
                            this.L$1 = obj2;
                            this.label = 4;
                            if (mutableStateFlow.emit(listEZpvd, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        function2 = this.$afterBlock;
                        if (function2 != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    ecd = (eCD) this.L$1;
                    coroutineScope3 = (CoroutineScope) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objM7386unboximpl = ((Result) obj).m7386unboximpl();
                        C56391yDq.AEQbTJ(objM7386unboximpl);
                        List<EIP7702ChainStatusResp.ChainStatusItem> chainList = ((EIP7702ChainStatusResp) objM7386unboximpl).getChainList();
                        arrayList = new ArrayList();
                        for (EIP7702ChainStatusResp.ChainStatusItem chainStatusItem : chainList) {
                            C10854bwM c10854bwMCopydefault = ecd.copydefault.copydefault(chainStatusItem.getChainIndex());
                            EIP7702UIState.Activity activity = c10854bwMCopydefault == null ? null : new EIP7702UIState.Activity(c10854bwMCopydefault.copydefault(), c10854bwMCopydefault.djBIcL(), c10854bwMCopydefault.fetchVPNInfo(), c10854bwMCopydefault.isConnected(), chainStatusItem);
                            if (activity != null) {
                                arrayList.add(activity);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = C56402yEa.EZpvd(EIP7702UIState.Application.AEQbTJ);
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                    } catch (Throwable th) {
                        th = th;
                        coroutineScope2 = coroutineScope3;
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        coroutineScope3 = coroutineScope2;
                    }
                    eCD ecd3 = this.this$0;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        MutableStateFlow mutableStateFlow2 = ecd3.AEQbTJ;
                        this.L$0 = coroutineScope3;
                        this.L$1 = objM7377constructorimpl;
                        this.label = 3;
                        if (mutableStateFlow2.emit((List) objM7377constructorimpl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    obj2 = objM7377constructorimpl;
                    coroutineScope4 = coroutineScope3;
                    eCD ecd22 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                    }
                    function2 = this.$afterBlock;
                    if (function2 != null) {
                    }
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            coroutineScope2 = coroutineScope;
            ecd = this.this$0;
            Result.Application application2 = Result.Companion;
            C15272eCe c15272eCe = ecd.EZpvd;
            String strAEQbTJ = ecd.AEQbTJ();
            this.L$0 = coroutineScope2;
            this.L$1 = ecd;
            this.label = 2;
            Object objAEQbTJ = c15272eCe.AEQbTJ(strAEQbTJ, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objAEQbTJ;
            coroutineScope3 = coroutineScope2;
            C56391yDq.AEQbTJ(objM7386unboximpl);
            List<EIP7702ChainStatusResp.ChainStatusItem> chainList2 = ((EIP7702ChainStatusResp) objM7386unboximpl).getChainList();
            arrayList = new ArrayList();
            while (r7.hasNext()) {
            }
            if (arrayList.isEmpty()) {
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
            eCD ecd32 = this.this$0;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
            obj2 = objM7377constructorimpl;
            coroutineScope4 = coroutineScope3;
            eCD ecd222 = this.this$0;
            if (Result.m7380exceptionOrNullimpl(obj2) != null) {
            }
            function2 = this.$afterBlock;
            if (function2 != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
