package o;

import com.okinc.find_ui.features.opportunity.overall.data.datasource.IMarketOverallDataSource;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketDataPo;
import com.okinc.find_ui.features.opportunity.overall.data.repo.MarketOverallRepository$getMarketData$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34938nlr {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C34940nlt AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoroutineDispatcher OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public C34938nlr(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C34940nlt c34940nlt) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c34940nlt, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c34940nlt;
    }

    /* JADX INFO: renamed from: o.nlr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nlr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, int i, @NotNull IMarketOverallDataSource.PayloadPeriod payloadPeriod, @NotNull Continuation<? super java.util.List<MarketDataPo>> continuation) {
        return BuildersKt.withContext(OLrzqt(), new MarketOverallRepository$getMarketData$2(this, str, i, payloadPeriod, null), continuation);
    }
}
