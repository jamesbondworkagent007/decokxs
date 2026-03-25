package o;

import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.GetDAppSearchHistoryUseCase$invoke$1;
import com.okinc.dapp.bean.DappSearchResultBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18907frK {
    public final CoroutineDispatcher OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C18907frK(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.frK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.frK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final Flow<java.util.List<DAppSearchHistory>> OLrzqt() {
        return FlowKt.flow(new GetDAppSearchHistoryUseCase$invoke$1(this, null));
    }

    public final DAppSearchHistory KWHzl(DappSearchResultBean dappSearchResultBean) {
        try {
            java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(dappSearchResultBean.getId());
            return new DAppSearchHistory(fieldNames != null ? fieldNames.longValue() : 0L, dappSearchResultBean.getName(), dappSearchResultBean.getDeepLink(), dappSearchResultBean.getLogo(), dappSearchResultBean.getTimestamp());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("GetDAppSearchHistoryUseCase", "Error converting DappSearchResultBean: " + e.getMessage(), e);
            return new DAppSearchHistory(0L, dappSearchResultBean.getName(), dappSearchResultBean.getDeepLink(), null, dappSearchResultBean.getTimestamp());
        }
    }
}
