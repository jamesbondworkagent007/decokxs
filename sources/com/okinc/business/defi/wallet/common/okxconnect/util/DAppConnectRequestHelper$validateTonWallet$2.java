package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
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
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C15974ebF;
import o.C16013ebs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DAppConnectRequestHelper$validateTonWallet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ValidateCanConnectResult>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$validateTonWallet$2(C16013ebs c16013ebs, AbstractC12782ctV abstractC12782ctV, Continuation<? super DAppConnectRequestHelper$validateTonWallet$2> continuation) {
        super(2, continuation);
        this.this$0 = c16013ebs;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$validateTonWallet$2(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidateCanConnectResult> continuation) {
        return ((DAppConnectRequestHelper$validateTonWallet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DAppConnectRequestHelper", "start validateTonWallet");
                C15974ebF c15974ebF = this.this$0.EZpvd;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$wallet, null);
                this.label = 1;
                obj = c15974ebF.KWHzl(anonymousClass1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return (ValidateCanConnectResult) obj;
        } catch (Exception e) {
            pUU.AEQbTJ("DAppConnectRequestHelper", "validateTonWallet ensureWalletCoreInit failed", e);
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$validateTonWallet$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ValidateCanConnectResult>, Object> {
        final /* synthetic */ AbstractC12782ctV $wallet;
        int label;
        final /* synthetic */ C16013ebs this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C16013ebs c16013ebs, AbstractC12782ctV abstractC12782ctV, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = c16013ebs;
            this.$wallet = abstractC12782ctV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$wallet, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ValidateCanConnectResult> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C16013ebs c16013ebs = this.this$0;
                this.label = 1;
                obj = c16013ebs.EZpvd((Continuation<? super Activity>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return invokeSuspend$validateTonRequest(this.$wallet, true);
                    }
                    return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.WALLET_NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.fullyDrawnReported));
                }
                C56391yDq.AEQbTJ(obj);
            }
            FragmentActivity fragmentActivity = obj instanceof FragmentActivity ? (FragmentActivity) obj : null;
            if (this.$wallet.fetchVPNInfo(607L) && fragmentActivity != null) {
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                if (supportFragmentManager.isStateSaved()) {
                    return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
                }
                pUU.KWHzl("DAppConnectRequestHelper", "Show upgrade dialog for TON");
                CoroutineDispatcher coroutineDispatcher = this.this$0.gEmmrt;
                DAppConnectRequestHelper$validateTonWallet$2$1$isTonActivated$1 dAppConnectRequestHelper$validateTonWallet$2$1$isTonActivated$1 = new DAppConnectRequestHelper$validateTonWallet$2$1$isTonActivated$1(this.this$0, supportFragmentManager, null);
                this.label = 2;
                obj = BuildersKt.withContext(coroutineDispatcher, dAppConnectRequestHelper$validateTonWallet$2$1$isTonActivated$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                return invokeSuspend$validateTonRequest$default(this.$wallet, false, 2, null);
            }
        }

        public static /* synthetic */ ValidateCanConnectResult invokeSuspend$validateTonRequest$default(AbstractC12782ctV abstractC12782ctV, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return invokeSuspend$validateTonRequest(abstractC12782ctV, z);
        }

        private static final ValidateCanConnectResult invokeSuspend$validateTonRequest(AbstractC12782ctV abstractC12782ctV, boolean z) {
            if (abstractC12782ctV.QKudOq() || z) {
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NONE, null, 2, null);
            }
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.WALLET_NOT_SUPPORTED, Integer.valueOf(C13754dXa.FragmentManager.fullyDrawnReported));
        }
    }
}
