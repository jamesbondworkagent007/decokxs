package com.okinc.business.defi.wallet.custom;

import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC16283egx;
import o.AbstractC58260yxt;
import o.ActivityC16104edd;
import o.C10614brl;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CustomChainMeta $chain;
    int label;
    final /* synthetic */ ActivityC16104edd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1(ActivityC16104edd activityC16104edd, CustomChainMeta customChainMeta, Continuation<? super AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC16104edd;
        this.$chain = customChainMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1(this.this$0, this.$chain, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        AbstractC16283egx abstractC16283egx = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C12827cuN.Application application = C12827cuN.Companion;
            abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(application, null, 1, null).copydefault());
            if (abstractC12782ctV == null) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(application, null, 1, null).copydefault(false);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (abstractC12782ctV != null) {
                AbstractC16283egx abstractC16283egx2 = this.this$0.EZpvd;
                if (abstractC16283egx2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx = abstractC16283egx2;
                }
                abstractC16283egx.AEQbTJ.setVisibility(8);
                return Unit.INSTANCE;
            }
            WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(walletSelectedChainBeanKWHzl, this.$chain, this.this$0, null);
            this.label = 2;
            if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        abstractC12782ctV = (AbstractC12782ctV) obj;
        if (abstractC12782ctV != null) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.custom.AddCustomNetworkActivity$hideDeleteButtonIfNeeded$1$1$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CustomChainMeta $chain;
        final /* synthetic */ WalletSelectedChainBean $walletSelectedBean;
        int label;
        final /* synthetic */ ActivityC16104edd this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WalletSelectedChainBean walletSelectedChainBean, CustomChainMeta customChainMeta, ActivityC16104edd activityC16104edd, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$walletSelectedBean = walletSelectedChainBean;
            this.$chain = customChainMeta;
            this.this$0 = activityC16104edd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$walletSelectedBean, this.$chain, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC16283egx abstractC16283egx = null;
                if (!Intrinsics.EZpvd((Object) this.$walletSelectedBean.getChainId(), (Object) String.valueOf(this.$chain.EZpvd())) || !Intrinsics.EZpvd((Object) this.$chain.isConnected(), (Object) this.$walletSelectedBean.getRpcUrl())) {
                    AbstractC16283egx abstractC16283egx2 = this.this$0.EZpvd;
                    if (abstractC16283egx2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16283egx2 = null;
                    }
                    abstractC16283egx2.AEQbTJ.setVisibility(0);
                } else {
                    AbstractC16283egx abstractC16283egx3 = this.this$0.EZpvd;
                    if (abstractC16283egx3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16283egx3 = null;
                    }
                    abstractC16283egx3.AEQbTJ.setVisibility(8);
                }
                AbstractC16283egx abstractC16283egx4 = this.this$0.EZpvd;
                if (abstractC16283egx4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16283egx = abstractC16283egx4;
                }
                abstractC16283egx.KWHzl.OLrzqt();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
