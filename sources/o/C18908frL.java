package o;

import com.okinc.business.defi.wallet.mine.search.domain.usecase.ClearSearchHistoryUseCase$invoke$1;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.ClearSearchHistoryUseCase$invoke$2$1;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.ClearSearchHistoryUseCase$invoke$2$wallet$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18908frL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C18943fru EZpvd;

    @yCM
    public C18908frL(@NotNull C18943fru c18943fru, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c18943fru, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c18943fru;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.frL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.frL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<Unit>> continuation) {
        ClearSearchHistoryUseCase$invoke$1 clearSearchHistoryUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C18908frL c18908frL;
        AbstractC12782ctV abstractC12782ctV;
        C18908frL c18908frL2;
        if (continuation instanceof ClearSearchHistoryUseCase$invoke$1) {
            clearSearchHistoryUseCase$invoke$1 = (ClearSearchHistoryUseCase$invoke$1) continuation;
            int i = clearSearchHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                clearSearchHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                clearSearchHistoryUseCase$invoke$1 = new ClearSearchHistoryUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = clearSearchHistoryUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = clearSearchHistoryUseCase$invoke$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            Result.Application application2 = Result.Companion;
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            ClearSearchHistoryUseCase$invoke$2$wallet$1 clearSearchHistoryUseCase$invoke$2$wallet$1 = new ClearSearchHistoryUseCase$invoke$2$wallet$1(null);
            clearSearchHistoryUseCase$invoke$1.L$0 = this;
            clearSearchHistoryUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, clearSearchHistoryUseCase$invoke$2$wallet$1, clearSearchHistoryUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c18908frL = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC12782ctV = (AbstractC12782ctV) clearSearchHistoryUseCase$invoke$1.L$1;
                c18908frL2 = (C18908frL) clearSearchHistoryUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                c18908frL2.EZpvd.OLrzqt(abstractC12782ctV.DbNXlk());
                pUU.EZpvd("ClearSearchHistoryUseCase", "Successfully cleared local search history");
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(Unit.INSTANCE)));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("ClearSearchHistoryUseCase", "Failed to clear search history: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
                }
                return ((Result) objM7377constructorimpl).m7386unboximpl();
            }
            c18908frL = (C18908frL) clearSearchHistoryUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objWithContext;
        if (abstractC12782ctV2 == null) {
            pUU.copydefault("ClearSearchHistoryUseCase", "No main wallet found, cannot clear history");
            Result.Application application5 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("No main wallet found")));
        }
        CoroutineDispatcher coroutineDispatcher2 = c18908frL.AEQbTJ;
        ClearSearchHistoryUseCase$invoke$2$1 clearSearchHistoryUseCase$invoke$2$1 = new ClearSearchHistoryUseCase$invoke$2$1(null);
        clearSearchHistoryUseCase$invoke$1.L$0 = c18908frL;
        clearSearchHistoryUseCase$invoke$1.L$1 = abstractC12782ctV2;
        clearSearchHistoryUseCase$invoke$1.label = 2;
        if (BuildersKt.withContext(coroutineDispatcher2, clearSearchHistoryUseCase$invoke$2$1, clearSearchHistoryUseCase$invoke$1) == objCopydefault) {
            return objCopydefault;
        }
        abstractC12782ctV = abstractC12782ctV2;
        c18908frL2 = c18908frL;
        c18908frL2.EZpvd.OLrzqt(abstractC12782ctV.DbNXlk());
        pUU.EZpvd("ClearSearchHistoryUseCase", "Successfully cleared local search history");
        Result.Application application32 = Result.Companion;
        objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(Unit.INSTANCE)));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return ((Result) objM7377constructorimpl).m7386unboximpl();
    }
}
