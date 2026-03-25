package com.okinc.business.market.features.scanner.surge.signal.domain;

import androidx.camera.video.AudioStats;
import com.okinc.business.market.features.scanner.surge.signal.data.GemItem;
import com.okinc.business.market.features.scanner.surge.signal.data.GemItemWsData;
import com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.C22416heu;
import o.C29289kqo;
import o.C29295kqu;
import o.C29297kqw;
import o.C56391yDq;
import o.C56442yFn;
import o.C59443zhD;
import o.InterfaceC29294kqt;
import o.pUU;
import o.yET;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalGemsUseCase$subscribeWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ C29289kqo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalGemsUseCase$subscribeWs$1(C29289kqo c29289kqo, String str, Continuation<? super GetSignalGemsUseCase$subscribeWs$1> continuation) {
        super(2, continuation);
        this.this$0 = c29289kqo;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalGemsUseCase$subscribeWs$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetSignalGemsUseCase$subscribeWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (C22416heu.ejfBZ()) {
                return Unit.INSTANCE;
            }
            InterfaceC29294kqt interfaceC29294kqt = this.this$0.KWHzl;
            String str = this.$chainId;
            this.label = 1;
            obj = interfaceC29294kqt.copydefault(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (FlowKt.collectLatest((Flow) obj, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$subscribeWs$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SignalStatusWsData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C29289kqo this$0;

        /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$subscribeWs$1$1$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SignalStatusWsData.Type.values().length];
                try {
                    iArr[SignalStatusWsData.Type.SIGNAL_GEMS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C29289kqo c29289kqo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c29289kqo;
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
        public final Object invoke(SignalStatusWsData signalStatusWsData, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(signalStatusWsData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            JsonObject jsonObjectEZpvd;
            Object objM7377constructorimpl;
            Object value;
            C29297kqw c29297kqwCopydefault;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SignalStatusWsData signalStatusWsData = (SignalStatusWsData) this.L$0;
                SignalStatusWsData.Type typeKWHzl = signalStatusWsData.KWHzl();
                if (typeKWHzl != null && (jsonObjectEZpvd = signalStatusWsData.EZpvd()) != null) {
                    if (StateListAnimator.KWHzl[typeKWHzl.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C29289kqo c29289kqo = this.this$0;
                    try {
                        Result.Application application = Result.Companion;
                        Json json = c29289kqo.copydefault;
                        json.getSerializersModule();
                        GemItem gemItemAEQbTJ = ((GemItemWsData) json.decodeFromJsonElement(GemItemWsData.Companion.serializer(), jsonObjectEZpvd)).AEQbTJ();
                        objM7377constructorimpl = Result.m7377constructorimpl(gemItemAEQbTJ != null ? c29289kqo.AEQbTJ(gemItemAEQbTJ) : null);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th) {
                        pUU.AEQbTJ("DEX", "dexRunCatching", th);
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    C29295kqu c29295kqu = (C29295kqu) objM7377constructorimpl;
                    if (c29295kqu == null) {
                        return Unit.INSTANCE;
                    }
                    MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                    do {
                        value = mutableStateFlow.getValue();
                        C29297kqw c29297kqw = (C29297kqw) value;
                        if (c29297kqw != null) {
                            List<C29295kqu> listOLrzqt = c29297kqw.OLrzqt();
                            List<C29295kqu> arrayList = new ArrayList();
                            for (Object obj2 : listOLrzqt) {
                                C29295kqu c29295kqu2 = (C29295kqu) obj2;
                                if (Intrinsics.EZpvd((Object) c29295kqu2.djBIcL(), (Object) c29295kqu.djBIcL()) && Intrinsics.EZpvd((Object) c29295kqu2.OLrzqt(), (Object) c29295kqu.OLrzqt())) {
                                    Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(c29295kqu.KWHzl());
                                    long jLongValue = fieldNames != null ? fieldNames.longValue() : Long.MAX_VALUE;
                                    Long fieldNames2 = StringsKt__StringNumberConversionsKt.getFieldNames(c29295kqu2.KWHzl());
                                    if (jLongValue < (fieldNames2 != null ? fieldNames2.longValue() : Long.MAX_VALUE)) {
                                    }
                                }
                                arrayList.add(obj2);
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = CollectionsKt___CollectionsKt.copydefault((Collection<? extends C29295kqu>) arrayList, c29295kqu);
                                c29297kqwCopydefault = c29297kqw.copydefault(CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar()));
                            } else {
                                for (C29295kqu c29295kqu3 : arrayList) {
                                    if (Intrinsics.EZpvd((Object) c29295kqu3.djBIcL(), (Object) c29295kqu.djBIcL()) && Intrinsics.EZpvd((Object) c29295kqu3.OLrzqt(), (Object) c29295kqu.OLrzqt())) {
                                        break;
                                    }
                                }
                                arrayList = CollectionsKt___CollectionsKt.copydefault((Collection<? extends C29295kqu>) arrayList, c29295kqu);
                                c29297kqwCopydefault = c29297kqw.copydefault(CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar()));
                            }
                        } else {
                            c29297kqwCopydefault = null;
                        }
                    } while (!mutableStateFlow.compareAndSet(value, c29297kqwCopydefault));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$subscribeWs$1$1$ActionBar */
        public static final class ActionBar<T> implements Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Double dAuCTel = C59443zhD.AuCTel(((C29295kqu) t2).EZpvd());
                double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
                double dDoubleValue2 = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
                Double dAuCTel2 = C59443zhD.AuCTel(((C29295kqu) t).EZpvd());
                if (dAuCTel2 != null) {
                    dDoubleValue = dAuCTel2.doubleValue();
                }
                return yET.KWHzl(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue));
            }
        }
    }
}
