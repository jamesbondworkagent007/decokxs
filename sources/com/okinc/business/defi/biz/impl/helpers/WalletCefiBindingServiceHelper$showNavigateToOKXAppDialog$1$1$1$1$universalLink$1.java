package com.okinc.business.defi.biz.impl.helpers;

import com.okinc.wallet.api.WalletCefiBindingService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.gJQ;
import o.gJS;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends gJQ>>, Object> {
    final /* synthetic */ WalletCefiBindingService.FragmentManager $config;
    final /* synthetic */ gJS $walletAddressBindRepository;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1(gJS gjs, WalletCefiBindingService.FragmentManager fragmentManager, Continuation<? super WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1> continuation) {
        super(2, continuation);
        this.$walletAddressBindRepository = gjs;
        this.$config = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1(this.$walletAddressBindRepository, this.$config, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends gJQ>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<gJQ>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<gJQ>> continuation) {
        return ((WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1$1$universalLink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            gJS gjs = this.$walletAddressBindRepository;
            String strKWHzl = this.$config.KWHzl();
            String strEZpvd = this.$config.EZpvd();
            String value = this.$config.OLrzqt().getValue();
            this.label = 1;
            objKWHzl = gjs.KWHzl(strKWHzl, strEZpvd, value, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objKWHzl);
    }
}
