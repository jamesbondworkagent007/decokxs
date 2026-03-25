package com.okinc.ok_kyc_core.presentation.views;

import androidx.fragment.app.FragmentActivity;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Dependency;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormatCompleteAddresses;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C41975rBs;
import o.C42323rOp;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rGL;

/* JADX INFO: loaded from: classes23.dex */
public final class InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Dependency $it;
    final /* synthetic */ rGL $viewModel;
    Object L$0;
    int label;
    final /* synthetic */ C42323rOp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2(FragmentActivity fragmentActivity, C42323rOp c42323rOp, rGL rgl, Dependency dependency, Continuation<? super InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.this$0 = c42323rOp;
        this.$viewModel = rgl;
        this.$it = dependency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2(this.$activity, this.this$0, this.$viewModel, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            FragmentActivity fragmentActivity = this.$activity;
            if (fragmentActivity instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) fragmentActivity).showLoadingAtOnceCannotCancel();
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.$viewModel, this.$it, this.this$0, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        }
        FragmentActivity fragmentActivity2 = this.$activity;
        if (fragmentActivity2 instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) fragmentActivity2).dismissLoading();
        }
        if (!this.this$0.AEQbTJ) {
            return Unit.INSTANCE;
        }
        if (((List) objectRef.element).isEmpty()) {
            return Unit.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FormatCompleteAddresses formatCompleteAddresses : (List) objectRef.element) {
            String id = formatCompleteAddresses.getId();
            String value = formatCompleteAddresses.getValue();
            String str = "";
            if (value == null) {
                value = "";
            }
            String valueName = formatCompleteAddresses.getValueName();
            if (valueName != null) {
                str = valueName;
            }
            linkedHashMap.put(id, new Pair(value, str));
            pUU.OLrzqt("autoComplete", formatCompleteAddresses.getId() + ", " + formatCompleteAddresses.getValue() + ", " + formatCompleteAddresses.getValueName());
        }
        this.$viewModel.AuCTelauCTel().setValue(linkedHashMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.InputFormattedTextItemView$observe$1$1$9$afterTextChanged$1$2$run$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<List<FormatCompleteAddresses>> $addresses;
        final /* synthetic */ Dependency $it;
        final /* synthetic */ rGL $viewModel;
        Object L$0;
        int label;
        final /* synthetic */ C42323rOp this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<List<FormatCompleteAddresses>> objectRef, rGL rgl, Dependency dependency, C42323rOp c42323rOp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$addresses = objectRef;
            this.$viewModel = rgl;
            this.$it = dependency;
            this.this$0 = c42323rOp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$addresses, this.$viewModel, this.$it, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef<List<FormatCompleteAddresses>> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef<List<FormatCompleteAddresses>> objectRef2 = this.$addresses;
                C41975rBs c41975rBsAEQbTJ = this.$viewModel.gHZMYf().AEQbTJ();
                String url = this.$it.getUrl();
                Map<String, String> map = this.this$0.gEmmrt;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objCopydefault2 = c41975rBsAEQbTJ.copydefault(url, map, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                objectRef = objectRef2;
                t = objCopydefault2;
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
