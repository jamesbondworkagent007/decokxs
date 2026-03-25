package com.reown.sign.engine.use_case.calls;

import com.reown.android.Core;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.android.pairing.model.mapper.PairingMapperKt;
import com.reown.sign.engine.model.EngineDO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetPairingsUseCase implements GetPairingsUseCaseInterface {
    public final PairingInterface pairingInterface;

    public GetPairingsUseCase(@NotNull PairingInterface pairingInterface) {
        Intrinsics.checkNotNullParameter(pairingInterface, "");
        this.pairingInterface = pairingInterface;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.GetPairingsUseCase$getListOfSettledPairings$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends EngineDO.PairingSettle>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return GetPairingsUseCase.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends EngineDO.PairingSettle>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<EngineDO.PairingSettle>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<EngineDO.PairingSettle>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<Core.Model.Pairing> pairings = GetPairingsUseCase.this.pairingInterface.getPairings();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(pairings, 10));
                Iterator<T> it = pairings.iterator();
                while (it.hasNext()) {
                    Pairing pairing = PairingMapperKt.toPairing((Core.Model.Pairing) it.next());
                    arrayList.add(new EngineDO.PairingSettle(pairing.getTopic(), pairing.getPeerAppMetaData()));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.GetPairingsUseCaseInterface
    public Object getListOfSettledPairings(@NotNull Continuation<? super List<EngineDO.PairingSettle>> continuation) {
        return SupervisorKt.supervisorScope(new AnonymousClass2(null), continuation);
    }
}
