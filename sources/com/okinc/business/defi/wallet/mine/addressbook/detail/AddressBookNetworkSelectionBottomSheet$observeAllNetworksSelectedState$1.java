package com.okinc.business.defi.wallet.mine.addressbook.detail;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet;
import java.util.Iterator;
import java.util.List;
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

/* JADX INFO: loaded from: classes18.dex */
public final class AddressBookNetworkSelectionBottomSheet$observeAllNetworksSelectedState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Object> $section0;
    int label;
    final /* synthetic */ AddressBookNetworkSelectionBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookNetworkSelectionBottomSheet$observeAllNetworksSelectedState$1(AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, List<Object> list, Continuation<? super AddressBookNetworkSelectionBottomSheet$observeAllNetworksSelectedState$1> continuation) {
        super(2, continuation);
        this.this$0 = addressBookNetworkSelectionBottomSheet;
        this.$section0 = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressBookNetworkSelectionBottomSheet$observeAllNetworksSelectedState$1(this.this$0, this.$section0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressBookNetworkSelectionBottomSheet$observeAllNetworksSelectedState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.this$0.KWHzl().OLrzqt(), this.this$0.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$section0, this.this$0, null);
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.addressbook.detail.AddressBookNetworkSelectionBottomSheet$observeAllNetworksSelectedState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $section0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ AddressBookNetworkSelectionBottomSheet this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Object> list, AddressBookNetworkSelectionBottomSheet addressBookNetworkSelectionBottomSheet, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$section0 = list;
            this.this$0 = addressBookNetworkSelectionBottomSheet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$section0, this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC16417ejY abstractC16417ejY;
            Object next;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                boolean z = this.Z$0;
                Iterator<T> it = this.$section0.iterator();
                while (true) {
                    abstractC16417ejY = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if ((next instanceof AddressBookNetworkSelectionBottomSheet.QuickSelectionItem) && ((AddressBookNetworkSelectionBottomSheet.QuickSelectionItem) next).AYXKKw()) {
                        break;
                    }
                }
                AddressBookNetworkSelectionBottomSheet.QuickSelectionItem quickSelectionItem = next instanceof AddressBookNetworkSelectionBottomSheet.QuickSelectionItem ? (AddressBookNetworkSelectionBottomSheet.QuickSelectionItem) next : null;
                if (quickSelectionItem != null) {
                    quickSelectionItem.OLrzqt(z);
                }
                AbstractC16417ejY abstractC16417ejY2 = this.this$0.AEQbTJ;
                if (abstractC16417ejY2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16417ejY = abstractC16417ejY2;
                }
                abstractC16417ejY.EZpvd.fetchVPNInfo();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
