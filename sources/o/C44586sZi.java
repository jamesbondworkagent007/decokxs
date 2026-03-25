package o;

import com.okinc.business.market.bean.PremarketExistPo;
import com.okinc.market.common.MarketHttpApi;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.app.MarketHomePreNetAction$preloadPremarketConfig$1;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_find.data.RankListRequest;
import com.okinc.unify_find.net.BizFindApiService;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.kFE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sZi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44586sZi extends AbstractC35163nqD<Unit> {
    public static Job AEQbTJ;
    public static Job KWHzl;
    public static Job copydefault;
    public static Job valueOf;
    public static final C44586sZi EZpvd = new C44586sZi();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Job job) {
        valueOf = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Job job) {
        copydefault = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job KWHzl() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Job job) {
        KWHzl = job;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job copydefault() {
        return valueOf;
    }

    private C44586sZi() {
    }

    public final void OLrzqt(Job job) {
        AEQbTJ = job;
        C8086awB.AEQbTJ.OLrzqt(job);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<IndexTickersData>>> EZpvd() {
        return MarketHttpApi.ActionBar.getIndexTickersOld$default((MarketHttpApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(MarketHttpApi.class)), C27983kKo.AEQbTJ(), "USD", null, "7", null, 0, 48, null);
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault(RankListRequest rankListRequest) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        java.lang.String strKWHzl = c33489mxS.KWHzl(RankListRequest.Companion.serializer(), rankListRequest);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        return new java.util.HashMap((java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketHomePreNetAction$preloadPremarketConfig$1 marketHomePreNetAction$preloadPremarketConfig$1;
        PremarketExistPo premarketExistPo;
        if (continuation instanceof MarketHomePreNetAction$preloadPremarketConfig$1) {
            marketHomePreNetAction$preloadPremarketConfig$1 = (MarketHomePreNetAction$preloadPremarketConfig$1) continuation;
            int i = marketHomePreNetAction$preloadPremarketConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketHomePreNetAction$preloadPremarketConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                marketHomePreNetAction$preloadPremarketConfig$1 = new MarketHomePreNetAction$preloadPremarketConfig$1(this, continuation);
            }
        }
        java.lang.Object premarketIsExist = marketHomePreNetAction$preloadPremarketConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketHomePreNetAction$preloadPremarketConfig$1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(premarketIsExist);
                Result.Application application = Result.Companion;
                BizFindApiService bizFindApiService = (BizFindApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizFindApiService.class));
                marketHomePreNetAction$preloadPremarketConfig$1.label = 1;
                premarketIsExist = bizFindApiService.getPremarketIsExist(marketHomePreNetAction$preloadPremarketConfig$1);
                if (premarketIsExist == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(premarketIsExist);
            }
            kFE.Activity activity = kFE.Companion;
            java.util.List list = (java.util.List) ((ResponseData) premarketIsExist).getData();
            if (list == null || (premarketExistPo = (PremarketExistPo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)) == null || !premarketExistPo.isExist()) {
                z = false;
            }
            activity.KWHzl(z);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
