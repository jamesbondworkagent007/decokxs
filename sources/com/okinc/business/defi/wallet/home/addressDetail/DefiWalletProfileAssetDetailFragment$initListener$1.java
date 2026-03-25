package com.okinc.business.defi.wallet.home.addressDetail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eVR;
import o.yHT;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$initListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$initListener$1(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$initListener$1> continuation) {
        super(2, continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletProfileAssetDetailFragment$initListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletProfileAssetDetailFragment$initListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$1$1, reason: invalid class name */
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowCombine = FlowKt.combine(this.this$0.DbNXlk().DbNXlk(), this.this$0.DbNXlk().EZpvd(), this.this$0.fetchVPNInfo().copydefault(), new C02651(this.this$0, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02651 extends SuspendLambda implements yHT<List<? extends ProfileAssetChooseNetworkDialogFragment.NetworkData>, List<? extends Long>, List<? extends Long>, Continuation<? super List<? extends ProfileAssetChooseNetworkDialogFragment.NetworkData>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;
            final /* synthetic */ eVR this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02651(eVR evr, Continuation<? super C02651> continuation) {
                super(4, continuation);
                this.this$0 = evr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Object invoke(List<? extends ProfileAssetChooseNetworkDialogFragment.NetworkData> list, List<? extends Long> list2, List<? extends Long> list3, Continuation<? super List<? extends ProfileAssetChooseNetworkDialogFragment.NetworkData>> continuation) {
                return invoke2((List<ProfileAssetChooseNetworkDialogFragment.NetworkData>) list, (List<Long>) list2, (List<Long>) list3, (Continuation<? super List<ProfileAssetChooseNetworkDialogFragment.NetworkData>>) continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<ProfileAssetChooseNetworkDialogFragment.NetworkData> list, List<Long> list2, List<Long> list3, Continuation<? super List<ProfileAssetChooseNetworkDialogFragment.NetworkData>> continuation) {
                C02651 c02651 = new C02651(this.this$0, continuation);
                c02651.L$0 = list;
                c02651.L$1 = list2;
                c02651.L$2 = list3;
                return c02651.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object next;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List list = (List) this.L$0;
                    List list2 = (List) this.L$1;
                    List list3 = (List) this.L$2;
                    if ((!list2.isEmpty()) && (!list.isEmpty())) {
                        Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(list2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (setOqFWZa.contains(C56443yFo.KWHzl(((ProfileAssetChooseNetworkDialogFragment.NetworkData) obj2).getChainId()))) {
                                arrayList.add(obj2);
                            }
                        }
                        list = arrayList;
                    }
                    if (!list3.isEmpty()) {
                        this.this$0.AxsJAY.clear();
                        eVR evr = this.this$0;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            long jLongValue = ((Number) it.next()).longValue();
                            if (!evr.AxsJAY.contains(C56443yFo.KWHzl(jLongValue))) {
                                evr.AxsJAY.add(C56443yFo.KWHzl(jLongValue));
                            }
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (((ProfileAssetChooseNetworkDialogFragment.NetworkData) next).getChainId() == jLongValue) {
                                    break;
                                }
                            }
                            ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = (ProfileAssetChooseNetworkDialogFragment.NetworkData) next;
                            if (networkData != null) {
                                evr.zuBGHE.add(new SupportPnlChainResponse(C56443yFo.KWHzl(jLongValue), networkData.getChainName(), networkData.getCoinUrl()));
                            }
                        }
                    }
                    return list;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ProfileAssetChooseNetworkDialogFragment.NetworkData>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ eVR this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(eVR evr, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = evr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
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
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object next;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<ProfileAssetChooseNetworkDialogFragment.NetworkData> list = (List) this.L$0;
                    if (list.isEmpty()) {
                        this.this$0.iwGUEr();
                        return Unit.INSTANCE;
                    }
                    this.this$0.DbNXlk().copydefault(list);
                    if (this.this$0.values == Long.MIN_VALUE) {
                        if (list.size() > 1) {
                            this.this$0.uzCIH();
                        } else {
                            this.this$0.copydefault((ProfileAssetChooseNetworkDialogFragment.NetworkData) CollectionsKt___CollectionsKt.AuCTelauCTel(list));
                        }
                    } else {
                        eVR evr = this.this$0;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((ProfileAssetChooseNetworkDialogFragment.NetworkData) next).getChainId() == evr.values) {
                                break;
                            }
                        }
                        ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = (ProfileAssetChooseNetworkDialogFragment.NetworkData) next;
                        if (networkData == null) {
                            this.this$0.uzCIH();
                        } else {
                            this.this$0.copydefault(networkData);
                        }
                    }
                    this.this$0.iwGUEr();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
