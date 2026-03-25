package com.okinc.business.market.features.smart_money.signal.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFragment$checkLoginStatus$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25389ivm;
import o.C29542kvc;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9854bdT;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalFragment$checkLoginStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onPostLogin;
    int label;
    final /* synthetic */ C29542kvc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalFragment$checkLoginStatus$2(C29542kvc c29542kvc, Function0<Unit> function0, Continuation<? super SignalFragment$checkLoginStatus$2> continuation) {
        super(2, continuation);
        this.this$0 = c29542kvc;
        this.$onPostLogin = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalFragment$checkLoginStatus$2(this.this$0, this.$onPostLogin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalFragment$checkLoginStatus$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        DappSignArgs dappSignArgs;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SignalAlertViewModel signalAlertViewModelFARcdN = this.this$0.fARcdN();
            this.label = 1;
            obj = signalAlertViewModelFARcdN.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objOLrzqt)) {
                    objOLrzqt = null;
                }
                dappSignArgs = (DappSignArgs) objOLrzqt;
                if (dappSignArgs != null) {
                    return Unit.INSTANCE;
                }
                InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class);
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                final C29542kvc c29542kvc = this.this$0;
                final Function0<Unit> function0 = this.$onPostLogin;
                interfaceC9854bdT.EZpvd(contextRequireContext, dappSignArgs, new Function1() { // from class: o.kvr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SignalFragment$checkLoginStatus$2.invokeSuspend$lambda$0(c29542kvc, function0, (android.os.Bundle) obj2);
                    }
                }, null);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            SignalAlertViewModel signalAlertViewModelFARcdN2 = this.this$0.fARcdN();
            this.label = 2;
            objOLrzqt = signalAlertViewModelFARcdN2.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7383isFailureimpl(objOLrzqt)) {
            }
            dappSignArgs = (DappSignArgs) objOLrzqt;
            if (dappSignArgs != null) {
            }
        } else {
            this.$onPostLogin.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C29542kvc c29542kvc, Function0 function0, Bundle bundle) {
        LifecycleOwner viewLifecycleOwner = c29542kvc.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SignalFragment$checkLoginStatus$2$1$1(c29542kvc, bundle, function0, null), 3, null);
        return Unit.INSTANCE;
    }
}
