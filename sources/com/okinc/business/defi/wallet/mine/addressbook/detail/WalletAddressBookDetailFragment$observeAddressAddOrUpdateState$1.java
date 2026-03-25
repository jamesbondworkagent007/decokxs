package com.okinc.business.defi.wallet.mine.addressbook.detail;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C16623enS;
import o.C18713fnb;
import o.C33570myu;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18713fnb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1(C18713fnb c18713fnb, Continuation<? super WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18713fnb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.detail.WalletAddressBookDetailFragment$observeAddressAddOrUpdateState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Point<? extends Unit>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18713fnb this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18713fnb c18713fnb, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18713fnb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Point<? extends Unit> point, Continuation<? super Unit> continuation) {
            return invoke2((Point<Unit>) point, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Point<Unit> point, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(point, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C52794wYp c52794wYp;
            C52794wYp c52794wYp2;
            C52794wYp c52794wYp3;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Point point = (Point) this.L$0;
                if (point instanceof Point.StateListAnimator) {
                    C16623enS c16623enS = this.this$0.djBIcL;
                    if (c16623enS != null && (c52794wYp3 = c16623enS.KWHzl) != null) {
                        C52794wYp.startLoading$default(c52794wYp3, 0L, 1, null);
                    }
                } else if (point instanceof Point.Application) {
                    C16623enS c16623enS2 = this.this$0.djBIcL;
                    if (c16623enS2 != null && (c52794wYp2 = c16623enS2.KWHzl) != null) {
                        c52794wYp2.fIwbmz();
                    }
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity != null) {
                        C33570myu.copydefault((Activity) activity);
                    }
                    if (this.this$0.OLrzqt()) {
                        C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.GCXiNH, 0, 1, (Object) null);
                    } else {
                        C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.HJWChPOKBmQNaCIdOM, 0, 1, (Object) null);
                    }
                    this.this$0.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                } else if (point instanceof Point.TaskDescription) {
                    C16623enS c16623enS3 = this.this$0.djBIcL;
                    if (c16623enS3 != null && (c52794wYp = c16623enS3.KWHzl) != null) {
                        c52794wYp.fIwbmz();
                    }
                    pUU.copydefault(this.this$0.getTAG(), "observeAddressAddOrUpdateState error message :" + ((Point.TaskDescription) point).EZpvd());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Point<Unit>> stateFlowEZpvd = this.this$0.gEmmrt().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
