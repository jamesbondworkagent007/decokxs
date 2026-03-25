package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SuggestedActionBean;
import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.bean.enums.ContextualScenario;
import com.okinc.okex.center.viewmodel.SupportTroubleshootResultViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44760scx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootResultViewModel$parseResultData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SupportTroubleshootResultViewModel.ParseResult>, Object> {
    final /* synthetic */ TroubleshootResultPageData $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportTroubleshootResultViewModel this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContextualScenario.values().length];
            try {
                iArr[ContextualScenario.TransactionDepositCompleted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContextualScenario.TransactionP2PCancelledPaymentTimeout.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositUntradable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositUnfinished.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositErrorBelowMinimumBtc.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositErrorBelowMinimumNonBtc.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositErrorMissingTagMemo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositErrorIncorrectAddress.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositErrorNonSupportedToken.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ContextualScenario.TransactionDepositErrorNonOkxTransaction.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootResultViewModel$parseResultData$2(TroubleshootResultPageData troubleshootResultPageData, SupportTroubleshootResultViewModel supportTroubleshootResultViewModel, Continuation<? super SupportTroubleshootResultViewModel$parseResultData$2> continuation) {
        super(2, continuation);
        this.$result = troubleshootResultPageData;
        this.this$0 = supportTroubleshootResultViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportTroubleshootResultViewModel$parseResultData$2 supportTroubleshootResultViewModel$parseResultData$2 = new SupportTroubleshootResultViewModel$parseResultData$2(this.$result, this.this$0, continuation);
        supportTroubleshootResultViewModel$parseResultData$2.L$0 = obj;
        return supportTroubleshootResultViewModel$parseResultData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SupportTroubleshootResultViewModel.ParseResult> continuation) {
        return ((SupportTroubleshootResultViewModel$parseResultData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        SupportTroubleshootResultViewModel.ParseResult parseResult;
        SupportTroubleshootResultViewModel.ParseResult parseResult2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TroubleshootResultPageData troubleshootResultPageData = this.$result;
            SupportTroubleshootResultViewModel supportTroubleshootResultViewModel = this.this$0;
            try {
                Result.Application application = Result.Companion;
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (troubleshootResultPageData.getContextualScenario() == null) {
                throw new IllegalArgumentException("Missing Scenario Info".toString());
            }
            switch (StateListAnimator.AEQbTJ[troubleshootResultPageData.getScenarioKey().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    if (troubleshootResultPageData.getTransactionCard() == null) {
                        throw new IllegalArgumentException("Missing Transaction Info".toString());
                    }
                    parseResult = new SupportTroubleshootResultViewModel.ParseResult(supportTroubleshootResultViewModel.KWHzl(troubleshootResultPageData.getTransactionCard(), troubleshootResultPageData.getContextualScenario()), troubleshootResultPageData.getSelfServiceTools(), null, 4, null);
                    parseResult2 = parseResult;
                    objM7377constructorimpl = Result.m7377constructorimpl(parseResult2);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        return objM7377constructorimpl;
                    }
                    C44760scx.log$default("parseResultData: " + thM7380exceptionOrNullimpl.getMessage(), null, 2, null);
                    return new SupportTroubleshootResultViewModel.ParseResult(null, null, thM7380exceptionOrNullimpl);
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    parseResult2 = new SupportTroubleshootResultViewModel.ParseResult(supportTroubleshootResultViewModel.EZpvd(troubleshootResultPageData.getContextualScenario(), (SelfServiceToolBean) CollectionsKt___CollectionsKt.firstOrNull(troubleshootResultPageData.getSelfServiceTools())), null, null, 4, null);
                    objM7377constructorimpl = Result.m7377constructorimpl(parseResult2);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    break;
                case 10:
                    parseResult2 = new SupportTroubleshootResultViewModel.ParseResult(supportTroubleshootResultViewModel.copydefault(troubleshootResultPageData.getContextualScenario(), (List<SuggestedActionBean>) supportTroubleshootResultViewModel.copydefault((SelfServiceToolBean) CollectionsKt___CollectionsKt.firstOrNull(troubleshootResultPageData.getSelfServiceTools()))), null, null, 4, null);
                    objM7377constructorimpl = Result.m7377constructorimpl(parseResult2);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    break;
                default:
                    parseResult = new SupportTroubleshootResultViewModel.ParseResult(supportTroubleshootResultViewModel.EZpvd(troubleshootResultPageData.getContextualScenario(), null), troubleshootResultPageData.getSelfServiceTools(), null, 4, null);
                    parseResult2 = parseResult;
                    objM7377constructorimpl = Result.m7377constructorimpl(parseResult2);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    break;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
