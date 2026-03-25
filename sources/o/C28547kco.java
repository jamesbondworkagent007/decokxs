package o;

import com.okinc.business.market.data.model.HomeTabRequest;
import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.data.model.HomepageConfigResponse;
import com.okinc.business.market.features.home_token_list.repo.TokenRankingRepo$getHomepageConfig$1;
import com.okinc.business.market.features.home_token_list.repo.TokenRankingRepo$getHomepageConfiggIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.home_token_list.repo.TokenRankingRepo$getTokenList$1;
import com.okinc.business.market.features.home_token_list.repo.TokenRankingRepo$getTokenListWithAggregate$1;
import com.okinc.business.market.features.home_token_list.repo.TokenRankingRepo$getTokenListWithAggregategIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.home_token_list.repo.TokenRankingRepo$getTokenListgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28547kco {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC27595jyE KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C28547kco(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27595jyE;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Continuation<? super Result<? extends java.util.List<HomeTokenData>>> continuation) throws java.lang.Throwable {
        TokenRankingRepo$getTokenList$1 tokenRankingRepo$getTokenList$1;
        if (continuation instanceof TokenRankingRepo$getTokenList$1) {
            tokenRankingRepo$getTokenList$1 = (TokenRankingRepo$getTokenList$1) continuation;
            int i = tokenRankingRepo$getTokenList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenRankingRepo$getTokenList$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenRankingRepo$getTokenList$1 = new TokenRankingRepo$getTokenList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tokenRankingRepo$getTokenList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenRankingRepo$getTokenList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TokenRankingRepo$getTokenListgIAlus$$inlined$dexRunCatching$1 tokenRankingRepo$getTokenListgIAlus$$inlined$dexRunCatching$1 = new TokenRankingRepo$getTokenListgIAlus$$inlined$dexRunCatching$1(null, this, map);
            tokenRankingRepo$getTokenList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tokenRankingRepo$getTokenListgIAlus$$inlined$dexRunCatching$1, tokenRankingRepo$getTokenList$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull Continuation<? super Result<C28545kcm>> continuation) throws java.lang.Throwable {
        TokenRankingRepo$getTokenListWithAggregate$1 tokenRankingRepo$getTokenListWithAggregate$1;
        if (continuation instanceof TokenRankingRepo$getTokenListWithAggregate$1) {
            tokenRankingRepo$getTokenListWithAggregate$1 = (TokenRankingRepo$getTokenListWithAggregate$1) continuation;
            int i = tokenRankingRepo$getTokenListWithAggregate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenRankingRepo$getTokenListWithAggregate$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenRankingRepo$getTokenListWithAggregate$1 = new TokenRankingRepo$getTokenListWithAggregate$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tokenRankingRepo$getTokenListWithAggregate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenRankingRepo$getTokenListWithAggregate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TokenRankingRepo$getTokenListWithAggregategIAlus$$inlined$dexRunCatching$1 tokenRankingRepo$getTokenListWithAggregategIAlus$$inlined$dexRunCatching$1 = new TokenRankingRepo$getTokenListWithAggregategIAlus$$inlined$dexRunCatching$1(null, this, map);
            tokenRankingRepo$getTokenListWithAggregate$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tokenRankingRepo$getTokenListWithAggregategIAlus$$inlined$dexRunCatching$1, tokenRankingRepo$getTokenListWithAggregate$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull HomeTabRequest homeTabRequest, @NotNull Continuation<? super Result<HomepageConfigResponse>> continuation) throws java.lang.Throwable {
        TokenRankingRepo$getHomepageConfig$1 tokenRankingRepo$getHomepageConfig$1;
        if (continuation instanceof TokenRankingRepo$getHomepageConfig$1) {
            tokenRankingRepo$getHomepageConfig$1 = (TokenRankingRepo$getHomepageConfig$1) continuation;
            int i = tokenRankingRepo$getHomepageConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenRankingRepo$getHomepageConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenRankingRepo$getHomepageConfig$1 = new TokenRankingRepo$getHomepageConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tokenRankingRepo$getHomepageConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenRankingRepo$getHomepageConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            TokenRankingRepo$getHomepageConfiggIAlus$$inlined$dexRunCatching$1 tokenRankingRepo$getHomepageConfiggIAlus$$inlined$dexRunCatching$1 = new TokenRankingRepo$getHomepageConfiggIAlus$$inlined$dexRunCatching$1(null, this, homeTabRequest);
            tokenRankingRepo$getHomepageConfig$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tokenRankingRepo$getHomepageConfiggIAlus$$inlined$dexRunCatching$1, tokenRankingRepo$getHomepageConfig$1);
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

    /* JADX INFO: renamed from: getHomepageConfig-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8662getHomepageConfiggIAlus$default(C28547kco c28547kco, HomeTabRequest homeTabRequest, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            homeTabRequest = HomeTabRequest.EOA;
        }
        return c28547kco.OLrzqt(homeTabRequest, (Continuation<? super Result<HomepageConfigResponse>>) continuation);
    }

    /* JADX INFO: renamed from: o.kco$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kco.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
