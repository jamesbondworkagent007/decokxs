package com.okinc.business.defi.wallet.mine.addressbook.detail;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC16417ejY;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class AddressBookNetworkSelectionBottomSheet$observeSelectedNetworkChainIdsState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Object> $chainListSection;
    int label;
    final /* synthetic */ AddressBookNetworkSelectionBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookNetworkSelectionBottomSheet$observeSelectedNetworkChainIdsState$1(AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, List<Object> list, Continuation<? super AddressBookNetworkSelectionBottomSheet$observeSelectedNetworkChainIdsState$1> continuation) {
        super(2, continuation);
        this.this$0 = addressBookNetworkSelectionBottomSheet;
        this.$chainListSection = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressBookNetworkSelectionBottomSheet$observeSelectedNetworkChainIdsState$1(this.this$0, this.$chainListSection, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressBookNetworkSelectionBottomSheet$observeSelectedNetworkChainIdsState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.this$0.KWHzl().AYXKKw(), this.this$0.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chainListSection, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowWithLifecycle, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$observeSelectedNetworkChainIdsState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Set<? extends Long>, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $chainListSection;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AddressBookNetworkSelectionBottomSheet this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Object> list, AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$chainListSection = list;
            this.this$0 = addressBookNetworkSelectionBottomSheet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chainListSection, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Set<? extends Long> set, Continuation<? super Unit> continuation) {
            return invoke2((Set<Long>) set, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Set<Long> set, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Set set = (Set) this.L$0;
                List<Object> list = this.$chainListSection;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof AddressChainUiData) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (set.contains(C56443yFo.KWHzl(((AddressChainUiData) obj3).OLrzqt()))) {
                        arrayList2.add(obj3);
                    } else {
                        arrayList3.add(obj3);
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                List list2 = (List) pair.component1();
                List list3 = (List) pair.component2();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((AddressChainUiData) it.next()).OLrzqt(true);
                }
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    ((AddressChainUiData) it2.next()).OLrzqt(false);
                }
                AbstractC16417ejY abstractC16417ejY = this.this$0.AEQbTJ;
                if (abstractC16417ejY == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16417ejY = null;
                }
                abstractC16417ejY.EZpvd.fetchVPNInfo();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
