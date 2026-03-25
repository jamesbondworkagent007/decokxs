package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C18951fsB;
import o.C18962fsM;
import o.C18980fse;
import o.C18997fsv;
import o.C19188fwa;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressSearchResultFragment$addDataListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18962fsM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSearchResultFragment$addDataListener$1(C18962fsM c18962fsM, Continuation<? super AddressSearchResultFragment$addDataListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c18962fsM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressSearchResultFragment$addDataListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressSearchResultFragment$addDataListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.search.ui.view.AddressSearchResultFragment$addDataListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C18980fse, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18962fsM this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18962fsM c18962fsM, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18962fsM;
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
        public final Object invoke(C18980fse c18980fse, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c18980fse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C18980fse c18980fse = (C18980fse) this.L$0;
                List<SearchAddressModel> listKWHzl = c18980fse.KWHzl();
                if (listKWHzl != null && !listKWHzl.isEmpty()) {
                    C19188fwa c19188fwaAEQbTJ = this.this$0.AEQbTJ();
                    List listOLrzqt = C56402yEa.OLrzqt();
                    listOLrzqt.add(new C18951fsB(8.0f, 0.0f, 2, null));
                    List<SearchAddressModel> listKWHzl2 = c18980fse.KWHzl();
                    ArrayList<SearchAddressModel> arrayList = new ArrayList();
                    for (Object obj2 : listKWHzl2) {
                        if (C33129mqd.OLrzqt((CharSequence) ((SearchAddressModel) obj2).getAddress())) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    for (SearchAddressModel searchAddressModel : arrayList) {
                        String address = searchAddressModel.getAddress();
                        if (address == null) {
                            address = "";
                        }
                        arrayList2.add(new C18997fsv(address, searchAddressModel.getChainIndexes()));
                    }
                    listOLrzqt.addAll(arrayList2);
                    C19188fwa.submitList$default(c19188fwaAEQbTJ, C56402yEa.fARcdN(listOLrzqt), null, 2, null);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    return Unit.INSTANCE;
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
            StateFlow<C18980fse> stateFlowOLrzqt = this.this$0.DbNXlk().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
