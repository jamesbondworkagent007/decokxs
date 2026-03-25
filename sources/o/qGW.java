package o;

import com.okinc.market.search.features.main.root.domain.usecase.SearchImChatsUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGW extends AbstractC49400uno<java.lang.String, java.util.List<? extends qGF>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC54577xNn EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final qGE copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public qGW(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull qGE qge) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qge, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
        this.copydefault = qge;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<qGF>> continuation) throws java.lang.Throwable {
        SearchImChatsUseCase$invoke$1 searchImChatsUseCase$invoke$1;
        long j;
        if (continuation instanceof SearchImChatsUseCase$invoke$1) {
            searchImChatsUseCase$invoke$1 = (SearchImChatsUseCase$invoke$1) continuation;
            int i = searchImChatsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchImChatsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchImChatsUseCase$invoke$1 = new SearchImChatsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = searchImChatsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchImChatsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            searchImChatsUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            searchImChatsUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(str, searchImChatsUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = searchImChatsUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("SearchImChatsUseCase", "SearchImChatsUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<qGF>> continuation) {
        InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
        if (interfaceC54577xNn != null && interfaceC54577xNn.EZpvd()) {
            C40375qTn.AEQbTJ.copydefault("SearchImChatsUseCase", "SearchImChatsUseCase ignore, simulate line");
            return null;
        }
        if (C55608xnE.OLrzqt()) {
            C40375qTn.AEQbTJ.copydefault("SearchImChatsUseCase", "SearchImChatsUseCase ignore, lite mode");
        }
        if (!C40379qTr.copydefault.AEQbTJ()) {
            C40375qTn.AEQbTJ.copydefault("SearchImChatsUseCase", "SearchImChatsUseCase ignore, IM chat search AB is disabled");
        }
        return this.copydefault.OLrzqt(str, continuation);
    }
}
