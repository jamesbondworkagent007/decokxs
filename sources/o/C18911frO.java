package o;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchType;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.GetSearchHistoryUseCase$invoke$1;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18911frO {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final C18943fru AEQbTJ;
    public final C18907frK EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C12827cuN copydefault;

    @yCM
    public C18911frO(@NotNull C12827cuN c12827cuN, @NotNull C18943fru c18943fru, @NotNull C18907frK c18907frK, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c18943fru, "");
        Intrinsics.checkNotNullParameter(c18907frK, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c12827cuN;
        this.AEQbTJ = c18943fru;
        this.EZpvd = c18907frK;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.frO$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.frO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final boolean copydefault() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(C59449zhJ.equals$default(ABTestManager.AEQbTJ.AEQbTJ("mobile_wallet_search_dapp_history_migration", AmplitudeName.WEB3), "true", false, 2, null)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) objM7377constructorimpl;
        pUU.KWHzl("GetSearchHistoryUseCase", "DApp search history feature flag: " + bool2.booleanValue());
        return bool2.booleanValue();
    }

    public final Flow<java.util.List<SearchHistoryItem>> KWHzl() {
        return FlowKt.flow(new GetSearchHistoryUseCase$invoke$1(this, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: ? extends com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<SearchHistoryItem> copydefault(java.util.List<? extends SearchHistoryItem> list, java.util.List<? extends SearchHistoryItem> list2, boolean z) {
        java.util.List<? extends SearchHistoryItem> arrayList;
        if (z) {
            try {
                arrayList = new java.util.ArrayList<>();
                for (java.lang.Object obj : list) {
                    SearchType searchTypeGEmmrt = ((SearchHistoryItem) obj).gEmmrt();
                    if (searchTypeGEmmrt != SearchType.DAPP && searchTypeGEmmrt != SearchType.WEBSITE) {
                        arrayList.add(obj);
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("GetSearchHistoryUseCase", "Error merging histories: " + e.getMessage(), e);
                return CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
            }
        } else {
            arrayList = list;
        }
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 20);
        java.util.List<SearchHistoryItem> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) list2), new TaskDescription());
        pUU.EZpvd("GetSearchHistoryUseCase", "Merged " + listEZpvd.size() + " items: " + listAhwBna.size() + " local + " + list2.size() + " DApps (flag: " + z + ")");
        return listEZpvd;
    }

    /* JADX INFO: renamed from: o.frO$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((SearchHistoryItem) t2).AhwBna()), java.lang.Long.valueOf(((SearchHistoryItem) t).AhwBna()));
        }
    }

    /* JADX INFO: renamed from: o.frO$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((SearchHistoryItem) t2).AhwBna()), java.lang.Long.valueOf(((SearchHistoryItem) t).AhwBna()));
        }
    }
}
