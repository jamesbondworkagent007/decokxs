package com.okinc.business.market.features.module.domain;

import com.okinc.business.market.data.model.ModuleDetailData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25983jNp;
import o.C28896kjS;
import o.C28899kjV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28901kjX;

/* JADX INFO: loaded from: classes23.dex */
public final class ModuleUseCase$startModuleDetailWs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flow<? extends C28899kjV>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $channel;
    Object L$0;
    int label;
    final /* synthetic */ C28896kjS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleUseCase$startModuleDetailWs$2(C28896kjS c28896kjS, String str, String str2, Continuation<? super ModuleUseCase$startModuleDetailWs$2> continuation) {
        super(2, continuation);
        this.this$0 = c28896kjS;
        this.$channel = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleUseCase$startModuleDetailWs$2(this.this$0, this.$channel, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Flow<? extends C28899kjV>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Flow<C28899kjV>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Flow<C28899kjV>> continuation) {
        return ((ModuleUseCase$startModuleDetailWs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription implements Flow<C28899kjV> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C28896kjS KWHzl;
        public final /* synthetic */ List OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.market.features.module.domain.ModuleUseCase$startModuleDetailWs$2$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C28896kjS AEQbTJ;
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ List copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C28896kjS c28896kjS, List list) {
                this.KWHzl = flowCollector;
                this.AEQbTJ = c28896kjS;
                this.copydefault = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                ModuleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1 moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                C28899kjV c28899kjV;
                Object objM7386unboximpl;
                FlowCollector flowCollector2;
                if (continuation instanceof ModuleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1) {
                    moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1 = (ModuleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1 = new ModuleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.KWHzl;
                    ModuleDetailData moduleDetailData = (ModuleDetailData) obj;
                    if (moduleDetailData == null) {
                        c28899kjV = null;
                        moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                        moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.label = 2;
                        if (flowCollector.emit(c28899kjV, moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    C28896kjS c28896kjS = this.AEQbTJ;
                    List list = this.copydefault;
                    moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.L$0 = flowCollector;
                    moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    Object objEZpvd = c28896kjS.EZpvd(moduleDetailData, list, (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? null : null, moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7386unboximpl = objEZpvd;
                    flowCollector2 = flowCollector;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    flowCollector2 = (FlowCollector) moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                }
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                C28899kjV c28899kjV2 = (C28899kjV) objM7386unboximpl;
                flowCollector = flowCollector2;
                c28899kjV = c28899kjV2;
                moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(c28899kjV, moduleUseCase$startModuleDetailWs$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, C28896kjS c28896kjS, List list) {
            this.AEQbTJ = flow;
            this.KWHzl = c28896kjS;
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C28899kjV> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.KWHzl, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25983jNp c25983jNp = this.this$0.KWHzl;
            this.label = 1;
            obj = c25983jNp.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                return new TaskDescription((Flow) obj, this.this$0, list);
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list2 = (List) obj;
        InterfaceC28901kjX interfaceC28901kjX = this.this$0.valueOf;
        String str = this.$channel;
        String str2 = this.$chainId;
        this.L$0 = list2;
        this.label = 2;
        Object objCopydefault2 = interfaceC28901kjX.copydefault(str, str2, this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        list = list2;
        obj = objCopydefault2;
        return new TaskDescription((Flow) obj, this.this$0, list);
    }
}
