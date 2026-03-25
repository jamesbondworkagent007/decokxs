package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.api.constant.ChainRegisterStatus;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$validateChainRegistration$2;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.C13754dXa;
import o.C16013ebs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.InterfaceC9844bdJ;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DAppConnectRequestHelper$validateChainRegistration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ValidateCanConnectResult>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$validateChainRegistration$2(C16013ebs c16013ebs, long j, AbstractC12782ctV abstractC12782ctV, Continuation<? super DAppConnectRequestHelper$validateChainRegistration$2> continuation) {
        super(2, continuation);
        this.this$0 = c16013ebs;
        this.$chainId = j;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$validateChainRegistration$2(this.this$0, this.$chainId, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidateCanConnectResult> continuation) {
        return ((DAppConnectRequestHelper$validateChainRegistration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwaitFirst;
        Boolean bool;
        Object objEZpvd;
        Object objWithContext;
        Boolean bool2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DAppConnectRequestHelper", "start validateChainRegistration");
            InterfaceC9844bdJ interfaceC9844bdJ = this.this$0.copydefault;
            long j = this.$chainId;
            AbstractC58185ywX<ChainRegisterStatus> abstractC58185ywXAEQbTJ = interfaceC9844bdJ.AEQbTJ(j, this.$wallet.EZpvd(j));
            final Function1 function1 = new Function1() { // from class: o.ebC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return DAppConnectRequestHelper$validateChainRegistration$2.invokeSuspend$lambda$0((ChainRegisterStatus) obj2);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ebE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return DAppConnectRequestHelper$validateChainRegistration$2.invokeSuspend$lambda$1(function1, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC60096zvdAEQbTJ, "");
            this.label = 1;
            objAwaitFirst = AwaitKt.awaitFirst(interfaceC60096zvdAEQbTJ, this);
            if (objAwaitFirst == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objAwaitFirst = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bool2 = (Boolean) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objWithContext = obj;
                if (!((Boolean) objWithContext).booleanValue()) {
                    return invokeSuspend$validateChainRegistered(bool2, true);
                }
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
            }
            bool = (Boolean) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            FragmentActivity fragmentActivity = !(objEZpvd instanceof FragmentActivity) ? (FragmentActivity) objEZpvd : null;
            if (bool.booleanValue() && fragmentActivity != null) {
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                if (supportFragmentManager.isStateSaved()) {
                    return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
                }
                pUU.KWHzl("DAppConnectRequestHelper", "Show upgrade dialog for chainId " + this.$chainId);
                CoroutineDispatcher coroutineDispatcher = this.this$0.gEmmrt;
                DAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1 dAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1 = new DAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1(this.this$0, fragmentActivity, this.$chainId, this.$wallet, supportFragmentManager, null);
                this.L$0 = bool;
                this.label = 3;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppConnectRequestHelper$validateChainRegistration$2$isChainUpgraded$1, this);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                bool2 = bool;
                if (!((Boolean) objWithContext).booleanValue()) {
                }
            } else {
                return invokeSuspend$validateChainRegistered$default(bool, false, 2, null);
            }
        }
        bool = (Boolean) objAwaitFirst;
        C16013ebs c16013ebs = this.this$0;
        this.L$0 = bool;
        this.label = 2;
        objEZpvd = c16013ebs.EZpvd((Continuation<? super Activity>) this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        if (!(objEZpvd instanceof FragmentActivity)) {
        }
        if (bool.booleanValue()) {
        }
        return invokeSuspend$validateChainRegistered$default(bool, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invokeSuspend$lambda$0(ChainRegisterStatus chainRegisterStatus) {
        return Boolean.valueOf(chainRegisterStatus == ChainRegisterStatus.REGISTERED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invokeSuspend$lambda$1(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    public static /* synthetic */ ValidateCanConnectResult invokeSuspend$validateChainRegistered$default(Boolean bool, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return invokeSuspend$validateChainRegistered(bool, z);
    }

    private static final ValidateCanConnectResult invokeSuspend$validateChainRegistered(Boolean bool, boolean z) {
        if (bool.booleanValue() || z) {
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NONE, null, 2, null);
        }
        return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, Integer.valueOf(C13754dXa.FragmentManager.reportRunnablelambda2));
    }
}
