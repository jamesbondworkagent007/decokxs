package com.okinc.business.defi.wallet.tee.review.ui;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$10;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C17877fVp;
import o.C17922fXg;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.fVU;

/* JADX INFO: loaded from: classes18.dex */
public final class ReNewEnableActivity$observeViewModelState$10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReNewEnableActivity$observeViewModelState$10(fVU fvu, Continuation<? super ReNewEnableActivity$observeViewModelState$10> continuation) {
        super(2, continuation);
        this.this$0 = fvu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReNewEnableActivity$observeViewModelState$10(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReNewEnableActivity$observeViewModelState$10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$10$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<TeeMetadata, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fVU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fVU fvu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fvu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TeeMetadata teeMetadata, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(teeMetadata, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                TeeMetadata teeMetadata = (TeeMetadata) this.L$0;
                if (teeMetadata == null) {
                    return Unit.INSTANCE;
                }
                int iEZpvd = C17922fXg.EZpvd(teeMetadata);
                if (iEZpvd == 1) {
                    C17877fVp c17877fVpOLrzqt = C17877fVp.Companion.OLrzqt();
                    final fVU fvu = this.this$0;
                    Function0<Unit> function0 = new Function0() { // from class: o.fWi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ReNewEnableActivity$observeViewModelState$10.AnonymousClass1.invokeSuspend$lambda$0(fvu);
                        }
                    };
                    final fVU fvu2 = this.this$0;
                    c17877fVpOLrzqt.AEQbTJ(fvu, function0, new Function0() { // from class: o.fWh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ReNewEnableActivity$observeViewModelState$10.AnonymousClass1.invokeSuspend$lambda$3(fvu2);
                        }
                    });
                } else if (iEZpvd == 2) {
                    C17922fXg.KWHzl(teeMetadata);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(fVU fvu) {
            fvu.finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(fVU fvu) {
            Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.SlnMSS));
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, fvu, bundleBundleOf, null, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<TeeMetadata> stateFlowFetchVPNInfo = this.this$0.gEmmrt().fetchVPNInfo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowFetchVPNInfo, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
