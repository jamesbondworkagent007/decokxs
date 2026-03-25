package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.utils.CoreValidator;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
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
public final class GetSessionProposalsUseCase implements GetSessionProposalsUseCaseInterface {
    public final ProposalStorageRepository proposalStorageRepository;

    public GetSessionProposalsUseCase(@NotNull ProposalStorageRepository proposalStorageRepository) {
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        this.proposalStorageRepository = proposalStorageRepository;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.GetSessionProposalsUseCase$getSessionProposals$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends EngineDO.SessionProposal>>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return GetSessionProposalsUseCase.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends EngineDO.SessionProposal>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<EngineDO.SessionProposal>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<EngineDO.SessionProposal>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ProposalStorageRepository proposalStorageRepository = GetSessionProposalsUseCase.this.proposalStorageRepository;
                this.label = 1;
                obj = proposalStorageRepository.getProposals$sign_release(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (((ProposalVO) obj2).getExpiry() == null || (!CoreValidator.INSTANCE.isExpired(r3))) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(EngineMapperKt.toEngineDO((ProposalVO) it.next()));
            }
            return arrayList2;
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.GetSessionProposalsUseCaseInterface
    public Object getSessionProposals(@NotNull Continuation<? super List<EngineDO.SessionProposal>> continuation) {
        return SupervisorKt.supervisorScope(new AnonymousClass2(null), continuation);
    }
}
