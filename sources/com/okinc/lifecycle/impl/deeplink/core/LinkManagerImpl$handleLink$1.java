package com.okinc.lifecycle.impl.deeplink.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC38098pMd;
import o.InterfaceC38100pMf;
import o.InterfaceC38101pMg;
import o.pLK;
import o.pMC;

/* JADX INFO: loaded from: classes9.dex */
public final class LinkManagerImpl$handleLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $formattedLink;
    final /* synthetic */ pLK.Application $linkManagerInterceptor;
    final /* synthetic */ boolean $shouldOpenExternal;
    final /* synthetic */ pMC $type;
    int label;
    final /* synthetic */ pLK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkManagerImpl$handleLink$1(pMC pmc, pLK plk, String str, boolean z, pLK.Application application, Continuation<? super LinkManagerImpl$handleLink$1> continuation) {
        super(2, continuation);
        this.$type = pmc;
        this.this$0 = plk;
        this.$formattedLink = str;
        this.$shouldOpenExternal = z;
        this.$linkManagerInterceptor = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkManagerImpl$handleLink$1(this.$type, this.this$0, this.$formattedLink, this.$shouldOpenExternal, this.$linkManagerInterceptor, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LinkManagerImpl$handleLink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pMC pmc = this.$type;
            if (pmc instanceof pMC.TaskDescription) {
                InterfaceC38101pMg interfaceC38101pMg = this.this$0.EZpvd;
                String str = this.$formattedLink;
                boolean z = this.$shouldOpenExternal;
                pLK.Application application = this.$linkManagerInterceptor;
                this.label = 1;
                if (interfaceC38101pMg.OLrzqt(str, z, application, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (pmc instanceof pMC.StateListAnimator) {
                InterfaceC38100pMf interfaceC38100pMf = this.this$0.values;
                String str2 = this.$formattedLink;
                boolean z2 = this.$shouldOpenExternal;
                pLK.Application application2 = this.$linkManagerInterceptor;
                this.label = 2;
                if (interfaceC38100pMf.KWHzl(str2, z2, application2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (pmc instanceof pMC.Activity) {
                InterfaceC38098pMd interfaceC38098pMd = this.this$0.KWHzl;
                String str3 = this.$formattedLink;
                boolean z3 = this.$shouldOpenExternal;
                pLK.Application application3 = this.$linkManagerInterceptor;
                this.label = 3;
                if (interfaceC38098pMd.AEQbTJ(str3, z3, application3, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
