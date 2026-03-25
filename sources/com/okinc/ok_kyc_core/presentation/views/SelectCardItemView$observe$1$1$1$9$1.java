package com.okinc.ok_kyc_core.presentation.views;

import java.util.Collection;
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
import o.AbstractC42074rFj;
import o.C56391yDq;
import o.C56442yFn;
import o.rAX;
import o.rBB;
import o.rBE;
import o.rGL;
import o.rQE;
import o.rRH;

/* JADX INFO: loaded from: classes23.dex */
public final class SelectCardItemView$observe$1$1$1$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ rRH $bottomSheet;
    final /* synthetic */ rAX<String> $cur;
    final /* synthetic */ List<rRH.Dialog> $dataSet;
    final /* synthetic */ Ref.BooleanRef $isGroupedValueUri;
    final /* synthetic */ Ref.ObjectRef<String> $preFilledValue;
    final /* synthetic */ Ref.ObjectRef<Map<String, String>> $queryMap;
    final /* synthetic */ Ref.ObjectRef<String> $subTitle;
    final /* synthetic */ Ref.ObjectRef<String> $uri;
    final /* synthetic */ AbstractC42074rFj $viewModel;
    int label;
    final /* synthetic */ rQE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCardItemView$observe$1$1$1$9$1(rQE rqe, Ref.ObjectRef<String> objectRef, rRH rrh, List<rRH.Dialog> list, Ref.ObjectRef<String> objectRef2, Ref.ObjectRef<String> objectRef3, rAX<String> rax, Ref.BooleanRef booleanRef, AbstractC42074rFj abstractC42074rFj, Ref.ObjectRef<Map<String, String>> objectRef4, Continuation<? super SelectCardItemView$observe$1$1$1$9$1> continuation) {
        super(2, continuation);
        this.this$0 = rqe;
        this.$uri = objectRef;
        this.$bottomSheet = rrh;
        this.$dataSet = list;
        this.$subTitle = objectRef2;
        this.$preFilledValue = objectRef3;
        this.$cur = rax;
        this.$isGroupedValueUri = booleanRef;
        this.$viewModel = abstractC42074rFj;
        this.$queryMap = objectRef4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectCardItemView$observe$1$1$1$9$1(this.this$0, this.$uri, this.$bottomSheet, this.$dataSet, this.$subTitle, this.$preFilledValue, this.$cur, this.$isGroupedValueUri, this.$viewModel, this.$queryMap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectCardItemView$observe$1$1$1$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.copydefault && (str = this.$uri.element) != null && str.length() != 0) {
                this.$bottomSheet.copydefault();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dataSet, this.$subTitle, this.this$0, this.$preFilledValue, this.$cur, this.$isGroupedValueUri, this.$viewModel, this.$uri, this.$queryMap, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            this.$bottomSheet.KWHzl(this.$dataSet, this.$subTitle.element, null, null);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.$bottomSheet.EZpvd();
        this.$bottomSheet.KWHzl(this.$dataSet, this.$subTitle.element, null, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.presentation.views.SelectCardItemView$observe$1$1$1$9$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ rAX<String> $cur;
        final /* synthetic */ List<rRH.Dialog> $dataSet;
        final /* synthetic */ Ref.BooleanRef $isGroupedValueUri;
        final /* synthetic */ Ref.ObjectRef<String> $preFilledValue;
        final /* synthetic */ Ref.ObjectRef<Map<String, String>> $queryMap;
        final /* synthetic */ Ref.ObjectRef<String> $subTitle;
        final /* synthetic */ Ref.ObjectRef<String> $uri;
        final /* synthetic */ AbstractC42074rFj $viewModel;
        int label;
        final /* synthetic */ rQE this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<rRH.Dialog> list, Ref.ObjectRef<String> objectRef, rQE rqe, Ref.ObjectRef<String> objectRef2, rAX<String> rax, Ref.BooleanRef booleanRef, AbstractC42074rFj abstractC42074rFj, Ref.ObjectRef<String> objectRef3, Ref.ObjectRef<Map<String, String>> objectRef4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dataSet = list;
            this.$subTitle = objectRef;
            this.this$0 = rqe;
            this.$preFilledValue = objectRef2;
            this.$cur = rax;
            this.$isGroupedValueUri = booleanRef;
            this.$viewModel = abstractC42074rFj;
            this.$uri = objectRef3;
            this.$queryMap = objectRef4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dataSet, this.$subTitle, this.this$0, this.$preFilledValue, this.$cur, this.$isGroupedValueUri, this.$viewModel, this.$uri, this.$queryMap, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String value;
            String str;
            Pair pair;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$dataSet.clear();
                this.$subTitle.element = "";
                if (this.this$0.EZpvd) {
                    value = this.$preFilledValue.element;
                } else {
                    value = this.$cur.getValue();
                    if (value == null) {
                        value = "";
                    }
                }
                if (this.$isGroupedValueUri.element) {
                    rBB rbbOLrzqt = ((rGL) this.$viewModel).gHZMYf().OLrzqt();
                    String str2 = this.$uri.element;
                    str = str2 != null ? str2 : "";
                    Map<String, String> linkedHashMap = this.$queryMap.element;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    this.label = 1;
                    obj = rbbOLrzqt.copydefault(str, linkedHashMap, value, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    pair = (Pair) obj;
                } else {
                    rBE rbeKWHzl = ((rGL) this.$viewModel).gHZMYf().KWHzl();
                    String str3 = this.$uri.element;
                    str = str3 != null ? str3 : "";
                    Map<String, String> linkedHashMap2 = this.$queryMap.element;
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap<>();
                    }
                    this.label = 2;
                    obj = rbeKWHzl.copydefault(str, linkedHashMap2, value, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    pair = (Pair) obj;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                pair = (Pair) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                pair = (Pair) obj;
            }
            this.$subTitle.element = pair.getFirst();
            this.$dataSet.addAll((Collection) pair.getSecond());
            this.this$0.copydefault = false;
            return Unit.INSTANCE;
        }
    }
}
