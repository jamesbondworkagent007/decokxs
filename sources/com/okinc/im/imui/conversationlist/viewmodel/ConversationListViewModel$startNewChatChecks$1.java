package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel;
import com.okinc.im.usecase.conversation.CheckStartNewChatUseCase;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$startNewChatChecks$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CheckStartNewChatUseCase.CheckStep.values().length];
            try {
                iArr[CheckStartNewChatUseCase.CheckStep.Kyc.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$startNewChatChecks$1(ConversationListViewModel conversationListViewModel, Continuation<? super ConversationListViewModel$startNewChatChecks$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$startNewChatChecks$1 conversationListViewModel$startNewChatChecks$1 = new ConversationListViewModel$startNewChatChecks$1(this.this$0, continuation);
        conversationListViewModel$startNewChatChecks$1.L$0 = obj;
        return conversationListViewModel$startNewChatChecks$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$startNewChatChecks$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ConversationListViewModel conversationListViewModel = this.this$0;
                Result.Application application = Result.Companion;
                conversationListViewModel.QOLQEE().setValue(C56443yFo.KWHzl(true));
                CheckStartNewChatUseCase checkStartNewChatUseCase = conversationListViewModel.QbewEr;
                Set<CheckStartNewChatUseCase.CheckStep> setGGvvIC = conversationListViewModel.gGvvIC();
                this.label = 1;
                obj = checkStartNewChatUseCase.KWHzl(setGGvvIC, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((CheckStartNewChatUseCase.NewChatCheckResult) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ConversationListViewModel conversationListViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            CheckStartNewChatUseCase.NewChatCheckResult newChatCheckResult = (CheckStartNewChatUseCase.NewChatCheckResult) objM7377constructorimpl;
            conversationListViewModel2.QOLQEE().setValue(C56443yFo.KWHzl(false));
            conversationListViewModel2.gGvvIC().addAll(newChatCheckResult.getPassList());
            if (newChatCheckResult.isAllPass()) {
                pUU.KWHzl("ConversationListViewModel", "New chat check all pass");
                conversationListViewModel2.OcIXYQ().setValue(new C32989mnw<>(BaseConversationListViewModel.NewChatCheckState.Success));
            } else {
                pUU.KWHzl("ConversationListViewModel", "New chat check failed:" + newChatCheckResult.getFailedStep());
                CheckStartNewChatUseCase.CheckStep failedStep = newChatCheckResult.getFailedStep();
                if (failedStep != null && ActionBar.OLrzqt[failedStep.ordinal()] == 1) {
                    conversationListViewModel2.OcIXYQ().setValue(new C32989mnw<>(BaseConversationListViewModel.NewChatCheckState.ShowKycFlow));
                } else {
                    pUU.AEQbTJ("New chat check unexpected failed step:" + newChatCheckResult.getFailedStep());
                }
            }
        }
        ConversationListViewModel conversationListViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            conversationListViewModel3.QOLQEE().setValue(C56443yFo.KWHzl(false));
            pUU.KWHzl("ConversationListViewModel", "Start new chat checks failed:" + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
