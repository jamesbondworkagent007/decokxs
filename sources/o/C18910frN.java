package o;

import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.DeleteSearchHistoryItemUseCase$deleteDAppHistory$1;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.DeleteSearchHistoryItemUseCase$deleteDAppHistory$2;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.DeleteSearchHistoryItemUseCase$deleteLocalHistory$1;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.DeleteSearchHistoryItemUseCase$deleteLocalHistory$wallet$1;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.DeleteSearchHistoryItemUseCase$invoke$1;
import com.okinc.dapp.bean.DappSearchResultBean;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18910frN {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C18943fru EZpvd;

    /* JADX INFO: renamed from: o.frN$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SearchType.values().length];
            try {
                iArr[SearchType.DAPP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    @yCM
    public C18910frN(@NotNull C18943fru c18943fru, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c18943fru, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c18943fru;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.frN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.frN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C18989fsn c18989fsn, @NotNull Continuation<? super Result<Unit>> continuation) {
        DeleteSearchHistoryItemUseCase$invoke$1 deleteSearchHistoryItemUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof DeleteSearchHistoryItemUseCase$invoke$1) {
            deleteSearchHistoryItemUseCase$invoke$1 = (DeleteSearchHistoryItemUseCase$invoke$1) continuation;
            int i = deleteSearchHistoryItemUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteSearchHistoryItemUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteSearchHistoryItemUseCase$invoke$1 = new DeleteSearchHistoryItemUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteSearchHistoryItemUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteSearchHistoryItemUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                if (Activity.AEQbTJ[c18989fsn.AEQbTJ().gEmmrt().ordinal()] == 1) {
                    deleteSearchHistoryItemUseCase$invoke$1.label = 1;
                    if (KWHzl(c18989fsn, deleteSearchHistoryItemUseCase$invoke$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    deleteSearchHistoryItemUseCase$invoke$1.label = 2;
                    if (copydefault(c18989fsn, deleteSearchHistoryItemUseCase$invoke$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(Unit.INSTANCE)));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("DeleteSearchHistoryItemUseCase", "Failed to delete search history item: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
        }
        return ((Result) objM7377constructorimpl).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(C18989fsn c18989fsn, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DeleteSearchHistoryItemUseCase$deleteDAppHistory$1 deleteSearchHistoryItemUseCase$deleteDAppHistory$1;
        DAppSearchHistory dAppSearchHistory;
        if (continuation instanceof DeleteSearchHistoryItemUseCase$deleteDAppHistory$1) {
            deleteSearchHistoryItemUseCase$deleteDAppHistory$1 = (DeleteSearchHistoryItemUseCase$deleteDAppHistory$1) continuation;
            int i = deleteSearchHistoryItemUseCase$deleteDAppHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteSearchHistoryItemUseCase$deleteDAppHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteSearchHistoryItemUseCase$deleteDAppHistory$1 = new DeleteSearchHistoryItemUseCase$deleteDAppHistory$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteSearchHistoryItemUseCase$deleteDAppHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteSearchHistoryItemUseCase$deleteDAppHistory$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                SearchHistoryItem searchHistoryItemAEQbTJ = c18989fsn.AEQbTJ();
                DAppSearchHistory dAppSearchHistory2 = searchHistoryItemAEQbTJ instanceof DAppSearchHistory ? (DAppSearchHistory) searchHistoryItemAEQbTJ : null;
                if (dAppSearchHistory2 == null) {
                    pUU.copydefault("DeleteSearchHistoryItemUseCase", "Item is not a DAppSearchHistory, cannot delete from repository");
                    return Unit.INSTANCE;
                }
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(dAppSearchHistory2.OLrzqt()));
                java.lang.String strCopydefault = dAppSearchHistory2.copydefault();
                java.lang.String strDjBIcL = dAppSearchHistory2.djBIcL();
                java.lang.String strAEQbTJ = dAppSearchHistory2.AEQbTJ();
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                DappSearchResultBean dappSearchResultBean = new DappSearchResultBean((java.lang.String) null, 0, strDjBIcL, strGEmmrt, strAEQbTJ, (java.lang.String) null, (java.lang.String) null, strCopydefault, "", false, (java.util.List) null, 0L, 3681, (DefaultConstructorMarker) null);
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                DeleteSearchHistoryItemUseCase$deleteDAppHistory$2 deleteSearchHistoryItemUseCase$deleteDAppHistory$2 = new DeleteSearchHistoryItemUseCase$deleteDAppHistory$2(dappSearchResultBean, null);
                deleteSearchHistoryItemUseCase$deleteDAppHistory$1.L$0 = dAppSearchHistory2;
                deleteSearchHistoryItemUseCase$deleteDAppHistory$1.label = 1;
                if (BuildersKt.withContext(coroutineDispatcher, deleteSearchHistoryItemUseCase$deleteDAppHistory$2, deleteSearchHistoryItemUseCase$deleteDAppHistory$1) == objCopydefault) {
                    return objCopydefault;
                }
                dAppSearchHistory = dAppSearchHistory2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dAppSearchHistory = (DAppSearchHistory) deleteSearchHistoryItemUseCase$deleteDAppHistory$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            pUU.EZpvd("DeleteSearchHistoryItemUseCase", "Successfully deleted DApp history: " + dAppSearchHistory.copydefault() + " (id: " + dAppSearchHistory.OLrzqt() + ")");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DeleteSearchHistoryItemUseCase", "Error deleting DApp history: " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(C18989fsn c18989fsn, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DeleteSearchHistoryItemUseCase$deleteLocalHistory$1 deleteSearchHistoryItemUseCase$deleteLocalHistory$1;
        C18910frN c18910frN;
        if (continuation instanceof DeleteSearchHistoryItemUseCase$deleteLocalHistory$1) {
            deleteSearchHistoryItemUseCase$deleteLocalHistory$1 = (DeleteSearchHistoryItemUseCase$deleteLocalHistory$1) continuation;
            int i = deleteSearchHistoryItemUseCase$deleteLocalHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteSearchHistoryItemUseCase$deleteLocalHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteSearchHistoryItemUseCase$deleteLocalHistory$1 = new DeleteSearchHistoryItemUseCase$deleteLocalHistory$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = deleteSearchHistoryItemUseCase$deleteLocalHistory$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteSearchHistoryItemUseCase$deleteLocalHistory$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            DeleteSearchHistoryItemUseCase$deleteLocalHistory$wallet$1 deleteSearchHistoryItemUseCase$deleteLocalHistory$wallet$1 = new DeleteSearchHistoryItemUseCase$deleteLocalHistory$wallet$1(null);
            deleteSearchHistoryItemUseCase$deleteLocalHistory$1.L$0 = this;
            deleteSearchHistoryItemUseCase$deleteLocalHistory$1.L$1 = c18989fsn;
            deleteSearchHistoryItemUseCase$deleteLocalHistory$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, deleteSearchHistoryItemUseCase$deleteLocalHistory$wallet$1, deleteSearchHistoryItemUseCase$deleteLocalHistory$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c18910frN = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18989fsn = (C18989fsn) deleteSearchHistoryItemUseCase$deleteLocalHistory$1.L$1;
            c18910frN = (C18910frN) deleteSearchHistoryItemUseCase$deleteLocalHistory$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objWithContext;
        if (abstractC12782ctV == null) {
            pUU.copydefault("DeleteSearchHistoryItemUseCase", "No main wallet found, cannot delete local history item");
            return Unit.INSTANCE;
        }
        java.lang.String strValueOf = c18989fsn.AEQbTJ().valueOf();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValueOf)) {
            pUU.copydefault("DeleteSearchHistoryItemUseCase", "Empty unique key, cannot delete item");
            return Unit.INSTANCE;
        }
        c18910frN.EZpvd.OLrzqt(abstractC12782ctV.DbNXlk(), strValueOf);
        pUU.EZpvd("DeleteSearchHistoryItemUseCase", "Successfully deleted local history: " + c18989fsn.copydefault());
        return Unit.INSTANCE;
    }
}
