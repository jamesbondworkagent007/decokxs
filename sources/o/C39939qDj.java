package o;

import com.okinc.market.search.features.main.recommend.hot.domain.ApplyTickerUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39939qDj extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends C41787qxR>>, java.util.List<? extends C39994qFk>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C39939qDj(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qDj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, C41787qxR>> pair, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) {
        ApplyTickerUseCase$invoke$1 applyTickerUseCase$invoke$1;
        long j;
        if (continuation instanceof ApplyTickerUseCase$invoke$1) {
            applyTickerUseCase$invoke$1 = (ApplyTickerUseCase$invoke$1) continuation;
            int i = applyTickerUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyTickerUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                applyTickerUseCase$invoke$1 = new ApplyTickerUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = applyTickerUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyTickerUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            applyTickerUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            applyTickerUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(pair, applyTickerUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = applyTickerUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.KWHzl("ApplyTickerUseCase", "ApplyTickerUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, C41787qxR>> pair, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) {
        java.util.List<C39994qFk> listComponent1 = pair.component1();
        java.util.Map<java.lang.String, C41787qxR> mapComponent2 = pair.component2();
        if (!listComponent1.isEmpty()) {
            if ((mapComponent2 != null ? C56443yFo.KWHzl(mapComponent2.isEmpty()) : null) != null) {
                return C40376qTo.AEQbTJ(listComponent1, mapComponent2);
            }
        }
        C40375qTn.w$default(C40375qTn.AEQbTJ, "ApplyTickerUseCase", "hotList or tickersMap is null or empty, skip.", null, 4, null);
        return listComponent1;
    }
}
