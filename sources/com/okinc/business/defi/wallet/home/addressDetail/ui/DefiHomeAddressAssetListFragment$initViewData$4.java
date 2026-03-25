package com.okinc.business.defi.wallet.home.addressDetail.ui;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C13754dXa;
import o.C15840eXf;
import o.C16590emm;
import o.C33064mpR;
import o.C33070mpX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWT;
import o.pUU;
import o.rVN;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeAddressAssetListFragment$initViewData$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15840eXf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeAddressAssetListFragment$initViewData$4(C15840eXf c15840eXf, Continuation<? super DefiHomeAddressAssetListFragment$initViewData$4> continuation) {
        super(2, continuation);
        this.this$0 = c15840eXf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeAddressAssetListFragment$initViewData$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeAddressAssetListFragment$initViewData$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$initViewData$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<eWT, List<? extends AddressTokenAsset>, Continuation<? super List<? extends Object>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ C15840eXf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15840eXf c15840eXf, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = c15840eXf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(eWT ewt, List<? extends AddressTokenAsset> list, Continuation<? super List<? extends Object>> continuation) {
            return invoke2(ewt, (List<AddressTokenAsset>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(eWT ewt, List<AddressTokenAsset> list, Continuation<? super List<? extends Object>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = ewt;
            anonymousClass1.L$1 = list;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zAdd;
            List<Long> listOLrzqt;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                eWT ewt = (eWT) this.L$0;
                List list = (List) this.L$1;
                if (ewt == null) {
                    return yDY.AhwBna();
                }
                ArrayList arrayList = new ArrayList();
                if ((list == null || list.isEmpty()) && 1 == this.this$0.EZpvd().AYXKKw()) {
                    if (this.this$0.AEQbTJ != Long.MIN_VALUE && this.this$0.EZpvd().OLrzqt() != null && (listOLrzqt = this.this$0.EZpvd().OLrzqt()) != null && !listOLrzqt.contains(C56443yFo.KWHzl(this.this$0.AEQbTJ))) {
                        zAdd = arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setShuffleMode));
                    } else {
                        zAdd = arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aeJQwa));
                    }
                    C56443yFo.KWHzl(zAdd);
                } else if (C33129mqd.KWHzl((Collection) list)) {
                    Intrinsics.copydefault(list);
                    arrayList.addAll(list);
                }
                return arrayList;
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
            Flow flowFlowCombine = FlowKt.flowCombine(this.this$0.EZpvd().ejfBZ(), this.this$0.EZpvd().isConnected(), new AnonymousClass1(this.this$0, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowCombine, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$initViewData$4$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15840eXf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C15840eXf c15840eXf, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c15840eXf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends Object> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                try {
                    C16590emm c16590emm = this.this$0.djBIcL;
                    if (c16590emm == null) {
                        Intrinsics.gEmmrt("");
                        c16590emm = null;
                    }
                    c16590emm.copydefault.scrollToPosition(0);
                    C33064mpR.OLrzqt(this.this$0.copydefault, (List<? extends Object>) list);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } catch (Exception e) {
                    pUU.copydefault(this.this$0.getTAG(), "error message : " + e.getMessage());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
