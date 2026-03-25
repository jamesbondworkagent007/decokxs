package com.okinc.business.defi.wallet.common.tonconnect;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C15974ebF;
import o.C16058eck;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectManager$validateConnectRequest$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ValidateCanConnectResult>, Object> {
    final /* synthetic */ DAppInitialRequest $dAppRequest;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C16058eck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectManager$validateConnectRequest$4(C16058eck c16058eck, DAppInitialRequest dAppInitialRequest, AbstractC12782ctV abstractC12782ctV, Continuation<? super TonConnectManager$validateConnectRequest$4> continuation) {
        super(2, continuation);
        this.this$0 = c16058eck;
        this.$dAppRequest = dAppInitialRequest;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonConnectManager$validateConnectRequest$4(this.this$0, this.$dAppRequest, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidateCanConnectResult> continuation) {
        return ((TonConnectManager$validateConnectRequest$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0.AhwBna;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dAppRequest, this.this$0, this.$wallet, null);
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
            pUU.AEQbTJ("TonConnectManager", "validateConnectRequest ensureWalletCoreInit failed", e);
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.tonconnect.TonConnectManager$validateConnectRequest$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super ValidateCanConnectResult>, Object> {
        final /* synthetic */ DAppInitialRequest $dAppRequest;
        final /* synthetic */ AbstractC12782ctV $wallet;
        int label;
        final /* synthetic */ C16058eck this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DAppInitialRequest dAppInitialRequest, C16058eck c16058eck, AbstractC12782ctV abstractC12782ctV, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$dAppRequest = dAppInitialRequest;
            this.this$0 = c16058eck;
            this.$wallet = abstractC12782ctV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$dAppRequest, this.this$0, this.$wallet, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ValidateCanConnectResult> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("TonConnectManager", "Connection request: " + this.$dAppRequest);
                if (this.this$0.fARcdN.valueOf()) {
                    Activity activityOLrzqt = this.this$0.OLrzqt();
                    FragmentActivity fragmentActivity = activityOLrzqt instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt : null;
                    if (this.$wallet.fetchVPNInfo(607L) && fragmentActivity != null) {
                        pUU.EZpvd("TonConnectManager", "Show upgrade dialog for TON");
                        CoroutineDispatcher coroutineDispatcher = this.this$0.isConnected;
                        TonConnectManager$validateConnectRequest$4$1$isTonActivated$1 tonConnectManager$validateConnectRequest$4$1$isTonActivated$1 = new TonConnectManager$validateConnectRequest$4$1$isTonActivated$1(this.this$0, fragmentActivity, null);
                        this.label = 1;
                        obj = BuildersKt.withContext(coroutineDispatcher, tonConnectManager$validateConnectRequest$4$1$isTonActivated$1, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        return invokeSuspend$validateRequest$default(this.$dAppRequest, this.this$0, this.$wallet, false, 8, null);
                    }
                } else {
                    return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.ENCRYPTED_STORAGE_NOT_INIT, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return invokeSuspend$validateRequest(this.$dAppRequest, this.this$0, this.$wallet, true);
            }
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.WALLET_NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.fullyDrawnReported));
        }

        public static /* synthetic */ ValidateCanConnectResult invokeSuspend$validateRequest$default(DAppInitialRequest dAppInitialRequest, C16058eck c16058eck, AbstractC12782ctV abstractC12782ctV, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return invokeSuspend$validateRequest(dAppInitialRequest, c16058eck, abstractC12782ctV, z);
        }

        private static final ValidateCanConnectResult invokeSuspend$validateRequest(DAppInitialRequest dAppInitialRequest, C16058eck c16058eck, AbstractC12782ctV abstractC12782ctV, boolean z) {
            if (dAppInitialRequest != null) {
                c16058eck.AEQbTJ = dAppInitialRequest;
                BuildersKt__Builders_commonKt.launch$default(c16058eck.DbNXlk, null, null, new TonConnectManager$validateConnectRequest$4$1$validateRequest$1(c16058eck, dAppInitialRequest, null), 3, null);
            }
            if (abstractC12782ctV.QKudOq() || z) {
                if (abstractC12782ctV.zLjUOn()) {
                    if (c16058eck.AEQbTJ != null) {
                        return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NONE, null, 2, null);
                    }
                    return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_TCV2, Integer.valueOf(C13754dXa.FragmentManager.addOnReportDrawnListener));
                }
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.WALLET_NOT_BACKED_UP, Integer.valueOf(C13754dXa.FragmentManager.HJWChPdIKEqB));
            }
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.WALLET_NOT_SUPPORTED, Integer.valueOf(C13754dXa.FragmentManager.fullyDrawnReported));
        }
    }
}
