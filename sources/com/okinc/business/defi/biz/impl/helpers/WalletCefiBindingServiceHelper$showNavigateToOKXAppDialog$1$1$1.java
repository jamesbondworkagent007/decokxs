package com.okinc.business.defi.biz.impl.helpers;

import com.okinc.wallet.api.WalletCefiBindingService;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C13850daP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.gJQ;
import o.gJS;
import o.pKD;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ WalletCefiBindingService.FragmentManager $config;
    final /* synthetic */ pKD $lifecycleLinkService;
    final /* synthetic */ gJS $walletAddressBindRepository;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1(pKD pkd, AbstractActivityC33041mov abstractActivityC33041mov, WalletCefiBindingService.FragmentManager fragmentManager, gJS gjs, Continuation<? super WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1> continuation) {
        super(2, continuation);
        this.$lifecycleLinkService = pkd;
        this.$activity = abstractActivityC33041mov;
        this.$config = fragmentManager;
        this.$walletAddressBindRepository = gjs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1(this.$lifecycleLinkService, this.$activity, this.$config, this.$walletAddressBindRepository, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractActivityC33041mov abstractActivityC33041mov;
        WalletCefiBindingService.FragmentManager fragmentManager;
        pKD pkd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pKD pkd2 = this.$lifecycleLinkService;
                abstractActivityC33041mov = this.$activity;
                WalletCefiBindingService.FragmentManager fragmentManager2 = this.$config;
                gJS gjs = this.$walletAddressBindRepository;
                Result.Application application = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1 walletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1 = new WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1(gjs, fragmentManager2, null);
                this.L$0 = pkd2;
                this.L$1 = abstractActivityC33041mov;
                this.L$2 = fragmentManager2;
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(io2, walletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1, this);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                fragmentManager = fragmentManager2;
                pkd = pkd2;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fragmentManager = (WalletCefiBindingService.FragmentManager) this.L$2;
                abstractActivityC33041mov = (AbstractActivityC33041mov) this.L$1;
                pkd = (pKD) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objM7386unboximpl);
            String strCopydefault = ((gJQ) objM7386unboximpl).copydefault();
            C13850daP c13850daP = C13850daP.KWHzl;
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(pkd.AEQbTJ(abstractActivityC33041mov, c13850daP.EZpvd(strCopydefault, c13850daP.OLrzqt(fragmentManager.AEQbTJ())))));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("WalletCefiBindingServiceHelper", "Error processing external link: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
