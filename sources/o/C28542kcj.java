package o;

import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home_token_list.domain.GetHomeTokenListUseCase$getHomeTokenList$1;
import com.okinc.business.market.features.home_token_list.domain.GetHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28542kcj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final C25980jNm AEQbTJ;
    public final C28547kco AhwBna;
    public final C27783kDe KWHzl;
    public final jUB OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final kKG gEmmrt;
    public final C28541kci valueOf;

    @yCM
    public C28542kcj(@NotNull kKG kkg, @NotNull C25980jNm c25980jNm, @NotNull C28541kci c28541kci, @NotNull C28547kco c28547kco, @NotNull jUB jub, @NotNull C27783kDe c27783kDe, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c25980jNm, "");
        Intrinsics.checkNotNullParameter(c28541kci, "");
        Intrinsics.checkNotNullParameter(c28547kco, "");
        Intrinsics.checkNotNullParameter(jub, "");
        Intrinsics.checkNotNullParameter(c27783kDe, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = kkg;
        this.AEQbTJ = c25980jNm;
        this.valueOf = c28541kci;
        this.AhwBna = c28547kco;
        this.OLrzqt = jub;
        this.KWHzl = c27783kDe;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(AdvancedFilter advancedFilter, @NotNull Continuation<? super Result<? extends java.util.List<HomeToken>>> continuation) throws java.lang.Throwable {
        GetHomeTokenListUseCase$getHomeTokenList$1 getHomeTokenListUseCase$getHomeTokenList$1;
        if (continuation instanceof GetHomeTokenListUseCase$getHomeTokenList$1) {
            getHomeTokenListUseCase$getHomeTokenList$1 = (GetHomeTokenListUseCase$getHomeTokenList$1) continuation;
            int i = getHomeTokenListUseCase$getHomeTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHomeTokenListUseCase$getHomeTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                getHomeTokenListUseCase$getHomeTokenList$1 = new GetHomeTokenListUseCase$getHomeTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getHomeTokenListUseCase$getHomeTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHomeTokenListUseCase$getHomeTokenList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            GetHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1 getHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1 = new GetHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1(null, advancedFilter, this);
            getHomeTokenListUseCase$getHomeTokenList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1, getHomeTokenListUseCase$getHomeTokenList$1);
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

    /* JADX INFO: renamed from: o.kcj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kcj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
