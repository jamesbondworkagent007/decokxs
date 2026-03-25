package o;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.AddSearchHistoryUseCase$invoke$1;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.AddSearchHistoryUseCase$invoke$2$wallet$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18903frG {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final C18943fru EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C12827cuN OLrzqt;

    @yCM
    public C18903frG(@NotNull C12827cuN c12827cuN, @NotNull C18943fru c18943fru, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c18943fru, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c12827cuN;
        this.EZpvd = c18943fru;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.frG$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.frG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull SearchHistoryItem searchHistoryItem, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        AddSearchHistoryUseCase$invoke$1 addSearchHistoryUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        C18903frG c18903frG;
        java.util.List<? extends SearchType> listAhwBna;
        java.lang.Object objM7377constructorimpl2;
        if (continuation instanceof AddSearchHistoryUseCase$invoke$1) {
            addSearchHistoryUseCase$invoke$1 = (AddSearchHistoryUseCase$invoke$1) continuation;
            int i = addSearchHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addSearchHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                addSearchHistoryUseCase$invoke$1 = new AddSearchHistoryUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = addSearchHistoryUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addSearchHistoryUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                AddSearchHistoryUseCase$invoke$2$wallet$1 addSearchHistoryUseCase$invoke$2$wallet$1 = new AddSearchHistoryUseCase$invoke$2$wallet$1(this, null);
                addSearchHistoryUseCase$invoke$1.L$0 = this;
                addSearchHistoryUseCase$invoke$1.L$1 = searchHistoryItem;
                addSearchHistoryUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, addSearchHistoryUseCase$invoke$2$wallet$1, addSearchHistoryUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c18903frG = this;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                searchHistoryItem = (SearchHistoryItem) addSearchHistoryUseCase$invoke$1.L$1;
                c18903frG = (C18903frG) addSearchHistoryUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objWithContext;
            if (abstractC12782ctV == null) {
                pUU.copydefault("AddSearchHistoryUseCase", "No main wallet found, cannot add history");
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("No main wallet found")));
            } else {
                if (C15934eaS.OLrzqt(abstractC12782ctV)) {
                    listAhwBna = C56402yEa.EZpvd(SearchType.NFT_ASSET);
                } else {
                    listAhwBna = yDY.AhwBna();
                }
                c18903frG.EZpvd.KWHzl(abstractC12782ctV.DbNXlk(), searchHistoryItem, listAhwBna);
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(objM7377constructorimpl2));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("AddSearchHistoryUseCase", "Failed to add search history: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            Result.Application application5 = Result.Companion;
            objM7377constructorimpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
        }
        return ((Result) objM7377constructorimpl).m7386unboximpl();
    }
}
