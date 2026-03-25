package com.okinc.ok_kyc_core.presentation.views.costomUIView;

import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43842rws;
import o.C41973rBq;
import o.C42405rRq;
import o.C43746rvB;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43709ruR;
import o.pUU;
import o.rAP;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class AddressSearchBottomSheet$searchAddress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $searchString;
    Object L$0;
    int label;
    final /* synthetic */ C42405rRq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSearchBottomSheet$searchAddress$1(C42405rRq c42405rRq, String str, Continuation<? super AddressSearchBottomSheet$searchAddress$1> continuation) {
        super(2, continuation);
        this.this$0 = c42405rRq;
        this.$searchString = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressSearchBottomSheet$searchAddress$1(this.this$0, this.$searchString, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressSearchBottomSheet$searchAddress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        AbstractC43842rws abstractC43842rws;
        String string;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        AbstractC43842rws abstractC43842rws2 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43842rws = this.this$0.AYXKKw;
                if (abstractC43842rws != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC43842rws2 = abstractC43842rws;
                }
                string = StringsKt__StringsKt.hDKMBd((CharSequence) abstractC43842rws2.AEQbTJ.EZpvd().getText().toString()).toString();
                pUU.KWHzl("AddressSearchBottomSheet", "searchString=" + this.$searchString + " currentSearch=" + string + " resultSize=" + ((AutoCompleteAddresses) objectRef.element).getResults().size());
                if (Intrinsics.EZpvd((Object) this.$searchString, (Object) string)) {
                    this.this$0.copydefault(this.$searchString, (AutoCompleteAddresses) objectRef.element);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("AddressSearchBottomSheet", "searchLogList=" + this.this$0.AEQbTJ());
        this.this$0.AEQbTJ().clear();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new AutoCompleteAddresses(yDY.AhwBna());
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.this$0, null);
        this.L$0 = objectRef2;
        this.label = 2;
        if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        objectRef = objectRef2;
        abstractC43842rws = this.this$0.AYXKKw;
        if (abstractC43842rws != null) {
        }
        string = StringsKt__StringsKt.hDKMBd((CharSequence) abstractC43842rws2.AEQbTJ.EZpvd().getText().toString()).toString();
        pUU.KWHzl("AddressSearchBottomSheet", "searchString=" + this.$searchString + " currentSearch=" + string + " resultSize=" + ((AutoCompleteAddresses) objectRef.element).getResults().size());
        if (Intrinsics.EZpvd((Object) this.$searchString, (Object) string)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.costomUIView.AddressSearchBottomSheet$searchAddress$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AutoCompleteAddresses> $addresses;
        Object L$0;
        int label;
        final /* synthetic */ C42405rRq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<AutoCompleteAddresses> objectRef, C42405rRq c42405rRq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$addresses = objectRef;
            this.this$0 = c42405rRq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$addresses, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v10, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r10v11, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef<AutoCompleteAddresses> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ("", new HashMap<>()), null, 4, null);
                Ref.ObjectRef<AutoCompleteAddresses> objectRef2 = this.$addresses;
                C41973rBq c41973rBq = new C41973rBq(c43746rvB);
                AddressAutoComplete addressAutoComplete = this.this$0.EZpvd;
                Intrinsics.copydefault(addressAutoComplete);
                String listUri = addressAutoComplete.getListUri();
                AddressAutoComplete addressAutoComplete2 = this.this$0.EZpvd;
                Intrinsics.copydefault(addressAutoComplete2);
                Map<String, String> listUriParams = addressAutoComplete2.getListUriParams();
                this.L$0 = objectRef2;
                this.label = 1;
                Object objOLrzqt = c41973rBq.OLrzqt(listUri, listUriParams, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                t = objOLrzqt;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                t = obj;
            }
            objectRef.element = t;
            return Unit.INSTANCE;
        }
    }
}
