package com.okinc.ok_kyc_core.presentation.views;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddress;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses;
import com.okinc.ok_kyc_core.presentation.views.InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C33129mqd;
import o.C41973rBq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rGL;
import o.rOZ;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currInput;
    final /* synthetic */ AddressAutoComplete $it;
    final /* synthetic */ String $viewId;
    final /* synthetic */ rGL $viewModel;
    Object L$0;
    int label;
    final /* synthetic */ rOZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1(rOZ roz, String str, String str2, rGL rgl, AddressAutoComplete addressAutoComplete, Continuation<? super InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1> continuation) {
        super(2, continuation);
        this.this$0 = roz;
        this.$currInput = str;
        this.$viewId = str2;
        this.$viewModel = rgl;
        this.$it = addressAutoComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1(this.this$0, this.$currInput, this.$viewId, this.$viewModel, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.okinc.ok_kyc_core.data.remote.networkmodel.AutoCompleteAddresses] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new AutoCompleteAddresses(yDY.AhwBna());
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef2, this.$viewModel, this.$it, this.this$0, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!this.this$0.valueOf) {
            return Unit.INSTANCE;
        }
        List<AutoCompleteAddress> results = ((AutoCompleteAddresses) objectRef.element).getResults();
        if (results == null || results.isEmpty()) {
            PopupWindow popupWindow = this.this$0.copydefault;
            Boolean boolKWHzl = popupWindow != null ? C56443yFo.KWHzl(popupWindow.isShowing()) : null;
            Intrinsics.copydefault(boolKWHzl);
            if (boolKWHzl.booleanValue()) {
                PopupWindow popupWindow2 = this.this$0.copydefault;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                return Unit.INSTANCE;
            }
        }
        this.this$0.setDataList((AutoCompleteAddresses) objectRef.element, this.$currInput.length(), this.$viewId);
        if (C33129mqd.KWHzl((Collection) ((AutoCompleteAddresses) objectRef.element).getResults())) {
            PopupWindow popupWindow3 = this.this$0.copydefault;
            Boolean boolKWHzl2 = popupWindow3 != null ? C56443yFo.KWHzl(popupWindow3.isShowing()) : null;
            Intrinsics.copydefault(boolKWHzl2);
            if (!boolKWHzl2.booleanValue()) {
                Context context = this.this$0.getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null && !activity.isFinishing()) {
                    View root = this.this$0.KWHzl.getRoot();
                    final rOZ roz = this.this$0;
                    root.post(new Runnable() { // from class: o.rPg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1.invokeSuspend$lambda$0(roz);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.InputTextItemView$observe$1$1$12$afterTextChanged$2$run$3$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AutoCompleteAddresses> $addresses;
        final /* synthetic */ AddressAutoComplete $it;
        final /* synthetic */ rGL $viewModel;
        Object L$0;
        int label;
        final /* synthetic */ rOZ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<AutoCompleteAddresses> objectRef, rGL rgl, AddressAutoComplete addressAutoComplete, rOZ roz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$addresses = objectRef;
            this.$viewModel = rgl;
            this.$it = addressAutoComplete;
            this.this$0 = roz;
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
            Ref.ObjectRef<AutoCompleteAddresses> objectRef;
            T t;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef<AutoCompleteAddresses> objectRef2 = this.$addresses;
                C41973rBq c41973rBqEZpvd = this.$viewModel.gHZMYf().EZpvd();
                String listUri = this.$it.getListUri();
                Map<String, String> map = this.this$0.AYXKKw;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objOLrzqt = c41973rBqEZpvd.OLrzqt(listUri, map, this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(rOZ roz) {
        PopupWindow popupWindow = roz.copydefault;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(roz.KWHzl.getRoot(), 0, 0, 17);
        }
    }
}
