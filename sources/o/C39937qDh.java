package o;

import com.okinc.market.search.features.main.recommend.hot.domain.ApplyWatchingUseCase$invoke$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39937qDh extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>>, java.util.List<? extends C39994qFk>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd2((kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>>) obj, (Continuation<? super java.util.List<C39994qFk>>) continuation);
    }

    @yCM
    public C39937qDh(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qDh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDh.TaskDescription.<init>():void type: THIS */
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
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> pair, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) {
        ApplyWatchingUseCase$invoke$1 applyWatchingUseCase$invoke$1;
        long j;
        if (continuation instanceof ApplyWatchingUseCase$invoke$1) {
            applyWatchingUseCase$invoke$1 = (ApplyWatchingUseCase$invoke$1) continuation;
            int i = applyWatchingUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyWatchingUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                applyWatchingUseCase$invoke$1 = new ApplyWatchingUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = applyWatchingUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyWatchingUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            applyWatchingUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            applyWatchingUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(pair, (Continuation) applyWatchingUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = applyWatchingUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("ApplyWatchingUseCase", "ApplyWatchingUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
    public java.lang.Object EZpvd2(@NotNull kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> pair, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) {
        java.util.List<C39994qFk> listComponent1 = pair.component1();
        java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>> mapComponent2 = pair.component2();
        if (listComponent1.isEmpty()) {
            C40375qTn.w$default(C40375qTn.AEQbTJ, "ApplyWatchingUseCase", "hotList or watchingMap is null or empty, skip.", null, 4, null);
            return listComponent1;
        }
        return C40376qTo.OLrzqt(listComponent1, mapComponent2);
    }
}
