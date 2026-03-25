package com.okinc.business.defi.wallet.home.addressDetail.ui;

import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C15840eXf;
import o.C16590emm;
import o.C33064mpR;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C59534zip;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeAddressAssetListFragment$initViewData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15840eXf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeAddressAssetListFragment$initViewData$3(C15840eXf c15840eXf, Continuation<? super DefiHomeAddressAssetListFragment$initViewData$3> continuation) {
        super(2, continuation);
        this.this$0 = c15840eXf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeAddressAssetListFragment$initViewData$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeAddressAssetListFragment$initViewData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$initViewData$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends AddressTokenAsset>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15840eXf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15840eXf c15840eXf, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15840eXf;
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
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AddressTokenAsset> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AddressTokenAsset>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AddressTokenAsset> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                C16590emm c16590emm = this.this$0.djBIcL;
                if (c16590emm == null) {
                    Intrinsics.gEmmrt("");
                    c16590emm = null;
                }
                c16590emm.OLrzqt.valueOf();
                if (C33129mqd.KWHzl((Collection) list)) {
                    C59534zip c59534zip = this.this$0.copydefault;
                    Intrinsics.copydefault(list);
                    C33064mpR.AEQbTJ(c59534zip, list);
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
            MutableSharedFlow<List<AddressTokenAsset>> mutableSharedFlowFetchVPNInfo = this.this$0.EZpvd().fetchVPNInfo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlowFetchVPNInfo, anonymousClass1, this) == objCopydefault) {
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
