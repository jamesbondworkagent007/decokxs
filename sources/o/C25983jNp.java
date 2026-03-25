package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.features.chain_list.domain.FetchChainListUseCase$fetchChainList$1;
import com.okinc.business.market.features.chain_list.domain.FetchChainListUseCase$fetchChainList$2;
import com.okinc.business.market.features.chain_list.domain.FetchChainListUseCase$getMarketChainBeanList$2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25983jNp {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;

    @yCM
    public C25983jNp(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.jNp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jNp.Activity.<init>():void type: THIS */
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
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        FetchChainListUseCase$fetchChainList$1 fetchChainListUseCase$fetchChainList$1;
        if (continuation instanceof FetchChainListUseCase$fetchChainList$1) {
            fetchChainListUseCase$fetchChainList$1 = (FetchChainListUseCase$fetchChainList$1) continuation;
            int i = fetchChainListUseCase$fetchChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchChainListUseCase$fetchChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchChainListUseCase$fetchChainList$1 = new FetchChainListUseCase$fetchChainList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchChainListUseCase$fetchChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchChainListUseCase$fetchChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            FetchChainListUseCase$fetchChainList$2 fetchChainListUseCase$fetchChainList$2 = new FetchChainListUseCase$fetchChainList$2(this, null);
            fetchChainListUseCase$fetchChainList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchChainListUseCase$fetchChainList$2, fetchChainListUseCase$fetchChainList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<MarketChainBean>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new FetchChainListUseCase$getMarketChainBeanList$2(this, null), continuation);
    }

    public final MarketChainBean AEQbTJ(ABP abp) {
        return new MarketChainBean(abp.KWHzl(), abp.copydefault(), abp.AEQbTJ(), abp.gEmmrt(), abp.OLrzqt(), abp.AhwBna(), abp.djBIcL(), abp.fetchVPNInfo(), (java.lang.String) null, abp.AYXKKw(), 256, (DefaultConstructorMarker) null);
    }
}
