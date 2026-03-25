package com.okinc.business.defi.wallet.home.addressDetail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$3;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C32866mlf;
import o.C56391yDq;
import o.C56402yEa;
import o.C56406yEe;
import o.C56442yFn;
import o.C56443yFo;
import o.eVR;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$3(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$3> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$initListener$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ eVR this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eVR evr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = evr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02671 extends SuspendLambda implements Function2<List<? extends ProfileAssetChooseNetworkDialogFragment.NetworkData>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ eVR this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02671(eVR evr, Continuation<? super C02671> continuation) {
                super(2, continuation);
                this.this$0 = evr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02671 c02671 = new C02671(this.this$0, continuation);
                c02671.L$0 = obj;
                return c02671;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends ProfileAssetChooseNetworkDialogFragment.NetworkData> list, Continuation<? super Unit> continuation) {
                return invoke2((List<ProfileAssetChooseNetworkDialogFragment.NetworkData>) list, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<ProfileAssetChooseNetworkDialogFragment.NetworkData> list, Continuation<? super Unit> continuation) {
                return ((C02671) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object next;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    if (!this.this$0.AuCTel) {
                        this.this$0.AuCTel = true;
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                long chainId = ((ProfileAssetChooseNetworkDialogFragment.NetworkData) next).getChainId();
                                do {
                                    Object next2 = it.next();
                                    long chainId2 = ((ProfileAssetChooseNetworkDialogFragment.NetworkData) next2).getChainId();
                                    if (chainId > chainId2) {
                                        next = next2;
                                        chainId = chainId2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        final ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = (ProfileAssetChooseNetworkDialogFragment.NetworkData) next;
                        if (networkData != null) {
                            final eVR evr = this.this$0;
                            C32866mlf.onEvent$default("Web3profile_HomePage_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.eWn
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return DefiWalletProfileAssetDetailFragment$initListener$3.AnonymousClass1.C02671.invokeSuspend$lambda$2$lambda$1(evr, networkData, (EventParamsList) obj2);
                                }
                            }, 1, (Object) null);
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            C56406yEe.KWHzl(arrayList, C56402yEa.EZpvd(C56443yFo.KWHzl(((ProfileAssetChooseNetworkDialogFragment.NetworkData) it2.next()).getChainId())));
                        }
                        this.this$0.EZpvd((List<Long>) arrayList);
                        this.this$0.copydefault((List<Long>) arrayList);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2$lambda$1(eVR evr, ProfileAssetChooseNetworkDialogFragment.NetworkData networkData, EventParamsList eventParamsList) {
                EventParamsList.put$default(eventParamsList, WalletSearchRequest.SEARCH_SOURCE_ADDRESS, evr.sSMYrx(), false, 4, null);
                EventParamsList.put$default(eventParamsList, "chain", networkData.getChainName(), false, 4, null);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<List<ProfileAssetChooseNetworkDialogFragment.NetworkData>> sharedFlowDbNXlk = this.this$0.DbNXlk().DbNXlk();
                C02671 c02671 = new C02671(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowDbNXlk, c02671, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            eVR evr = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(evr, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(evr, state, anonymousClass1, this) == objCopydefault) {
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
