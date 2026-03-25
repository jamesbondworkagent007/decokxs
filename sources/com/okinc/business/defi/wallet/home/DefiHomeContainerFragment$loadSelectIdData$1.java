package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC12782ctV;
import o.C10598brV;
import o.C10614brl;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerFragment$loadSelectIdData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ DefiHomeContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeContainerFragment$loadSelectIdData$1(AbstractC12782ctV abstractC12782ctV, DefiHomeContainerFragment defiHomeContainerFragment, Continuation<? super DefiHomeContainerFragment$loadSelectIdData$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = defiHomeContainerFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeContainerFragment$loadSelectIdData$1(this.$wallet, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeContainerFragment$loadSelectIdData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v16, types: [T, com.okinc.business.defi.biz.core.common.WalletSelectedChainBean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.okinc.business.defi.biz.core.common.WalletSelectedChainBean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String chainIconUrl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC12782ctV value = this.$wallet;
                DefiHomeContainerFragment defiHomeContainerFragment = this.this$0;
                Result.Application application = Result.Companion;
                if (value == null && (value = defiHomeContainerFragment.djBIcL().fARcdN().getValue()) == null) {
                    return Unit.INSTANCE;
                }
                C10614brl instance$default = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? KWHzl = instance$default.KWHzl(value.DbNXlk());
                objectRef.element = KWHzl;
                defiHomeContainerFragment.fetchVPNInfo = C33129mqd.valueOf(KWHzl.getChainId());
                if (defiHomeContainerFragment.fetchVPNInfo != Long.MIN_VALUE) {
                    if (defiHomeContainerFragment.fetchVPNInfo < 0 && C10598brV.AEQbTJ.KWHzl(defiHomeContainerFragment.fetchVPNInfo, ((WalletSelectedChainBean) objectRef.element).getRpcUrl()) == null) {
                        defiHomeContainerFragment.fetchVPNInfo = Long.MIN_VALUE;
                        instance$default.copydefault(value.DbNXlk());
                        objectRef.element = instance$default.KWHzl(value.DbNXlk());
                    } else {
                        chainIconUrl = ((WalletSelectedChainBean) objectRef.element).getChainIconUrl();
                        defiHomeContainerFragment.isConnected = chainIconUrl;
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        DefiHomeContainerFragment$loadSelectIdData$1$1$1 defiHomeContainerFragment$loadSelectIdData$1$1$1 = new DefiHomeContainerFragment$loadSelectIdData$1$1$1(defiHomeContainerFragment, objectRef, null);
                        this.label = 1;
                        obj = BuildersKt.withContext(main, defiHomeContainerFragment$loadSelectIdData$1$1$1, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                chainIconUrl = null;
                defiHomeContainerFragment.isConnected = chainIconUrl;
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                DefiHomeContainerFragment$loadSelectIdData$1$1$1 defiHomeContainerFragment$loadSelectIdData$1$1$12 = new DefiHomeContainerFragment$loadSelectIdData$1$1$1(defiHomeContainerFragment, objectRef, null);
                this.label = 1;
                obj = BuildersKt.withContext(main2, defiHomeContainerFragment$loadSelectIdData$1$1$12, this);
                if (obj == objCopydefault) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Unit) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        DefiHomeContainerFragment defiHomeContainerFragment2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(defiHomeContainerFragment2.getTAG(), "loadSelectIdData error message " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
