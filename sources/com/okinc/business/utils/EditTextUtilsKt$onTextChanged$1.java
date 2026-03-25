package com.okinc.business.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C31194lpS;
import o.C55001xbh;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;

/* JADX INFO: loaded from: classes7.dex */
public final class EditTextUtilsKt$onTextChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $action;
    final /* synthetic */ long $debounceTimeOut;
    final /* synthetic */ C55001xbh $this_onTextChanged;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EditTextUtilsKt$onTextChanged$1(C55001xbh c55001xbh, long j, Function1<? super String, Unit> function1, Continuation<? super EditTextUtilsKt$onTextChanged$1> continuation) {
        super(2, continuation);
        this.$this_onTextChanged = c55001xbh;
        this.$debounceTimeOut = j;
        this.$action = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditTextUtilsKt$onTextChanged$1(this.$this_onTextChanged, this.$debounceTimeOut, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditTextUtilsKt$onTextChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<CharSequence> flowCopydefault = C31194lpS.copydefault(this.$this_onTextChanged);
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new ActionBar(FlowKt.m7442debounceHG0u8IE(flowCopydefault, C59519zia.AEQbTJ(this.$debounceTimeOut, DurationUnit.MILLISECONDS))), new Function2() { // from class: o.lpQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ((java.lang.String) obj2), (java.lang.Object) ((java.lang.String) obj3)));
                }
            });
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$action, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass3, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.utils.EditTextUtilsKt$onTextChanged$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $action;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super String, Unit> function1, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$action = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$action, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.$action.invoke((String) this.L$0);
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements Flow<String> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.utils.EditTextUtilsKt$onTextChanged$1$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                EditTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1 editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                CharSequence charSequenceHDKMBd;
                if (continuation instanceof EditTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (EditTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i = editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new EditTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                Object obj2 = editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    CharSequence charSequence = (CharSequence) obj;
                    String string = (charSequence == null || (charSequenceHDKMBd = StringsKt__StringsKt.hDKMBd(charSequence)) == null) ? null : charSequenceHDKMBd.toString();
                    if (string != null) {
                        editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(string, editTextUtilsKt$onTextChanged$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
