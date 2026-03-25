package com.okinc.planet.biz_userprofile.domain;

import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C46189tLc;
import o.C46195tLi;
import o.C56391yDq;
import o.C56442yFn;
import o.tQV;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetFetchSelfUserInfoUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C46189tLc>, Object> {
    final /* synthetic */ C46195tLi.StateListAnimator $input;
    int label;
    final /* synthetic */ C46195tLi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetFetchSelfUserInfoUseCase$execute$2(C46195tLi c46195tLi, C46195tLi.StateListAnimator stateListAnimator, Continuation<? super PlanetFetchSelfUserInfoUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c46195tLi;
        this.$input = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetFetchSelfUserInfoUseCase$execute$2(this.this$0, this.$input, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C46189tLc> continuation) {
        return ((PlanetFetchSelfUserInfoUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tQV tqv = this.this$0.copydefault;
            String strCopydefault = this.$input.KWHzl().copydefault();
            this.label = 1;
            obj = tQV.StateListAnimator.basicInfo$default(tqv, strCopydefault, null, null, this, 6, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        PlanetBasicUserInfoResp planetBasicUserInfoResp = (PlanetBasicUserInfoResp) ((AbstractC43419rot) obj).AEQbTJ();
        CoroutineDispatcher coroutineDispatcher = this.this$0.AEQbTJ;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$input, planetBasicUserInfoResp, null);
        this.label = 2;
        obj = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
        return obj == objCopydefault ? objCopydefault : obj;
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_userprofile.domain.PlanetFetchSelfUserInfoUseCase$execute$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C46189tLc>, Object> {
        final /* synthetic */ PlanetBasicUserInfoResp $basicInfo;
        final /* synthetic */ C46195tLi.StateListAnimator $input;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C46195tLi.StateListAnimator stateListAnimator, PlanetBasicUserInfoResp planetBasicUserInfoResp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$input = stateListAnimator;
            this.$basicInfo = planetBasicUserInfoResp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$input, this.$basicInfo, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C46189tLc> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.$input.KWHzl().KWHzl(this.$basicInfo);
                return C46189tLc.TaskDescription.map$default(C46189tLc.Companion, this.$basicInfo, true, this.$input.copydefault(), null, 8, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
