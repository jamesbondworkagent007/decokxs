package o;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import com.okinc.planet.domain.usecase.PlanetGetPublisherCoinTokenUserUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46353tRe extends AbstractC46360tRl<CacheStrategy, kotlin.Pair<? extends java.util.List<? extends PublisherTokenInfo>, ? extends java.lang.Boolean>> {
    public final tQV AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46353tRe(@NotNull tQV tqv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(tqv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = tqv;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC46360tRl
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super kotlin.Pair<? extends java.util.List<PublisherTokenInfo>, java.lang.Boolean>> continuation) throws java.lang.Throwable {
        PlanetGetPublisherCoinTokenUserUseCase$execute$1 planetGetPublisherCoinTokenUserUseCase$execute$1;
        java.lang.String str;
        if (continuation instanceof PlanetGetPublisherCoinTokenUserUseCase$execute$1) {
            planetGetPublisherCoinTokenUserUseCase$execute$1 = (PlanetGetPublisherCoinTokenUserUseCase$execute$1) continuation;
            int i = planetGetPublisherCoinTokenUserUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetPublisherCoinTokenUserUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetPublisherCoinTokenUserUseCase$execute$1 = new PlanetGetPublisherCoinTokenUserUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = planetGetPublisherCoinTokenUserUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetPublisherCoinTokenUserUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                tQV tqv = this.AEQbTJ;
                java.lang.String strName = cacheStrategy.name();
                planetGetPublisherCoinTokenUserUseCase$execute$1.label = 1;
                objAEQbTJ = tqv.AEQbTJ(strName, planetGetPublisherCoinTokenUserUseCase$execute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return C56390yDp.OLrzqt((java.util.List) ((AbstractC43419rot) objAEQbTJ).AEQbTJ(), C56443yFo.KWHzl(false));
        } catch (java.lang.Throwable th) {
            if (th instanceof ResponseFailedException) {
                java.lang.String message = th.getMessage();
                ResponseFailedException responseFailedException = th;
                str = "message:" + message + " detailMsg:" + responseFailedException.getDetailMsg() + " code:" + responseFailedException.getCode();
            } else {
                str = "{" + C56379yDe.AEQbTJ(th);
            }
            pUU.copydefault("getPublisherTokenList", str);
            return C56390yDp.OLrzqt(null, C56443yFo.KWHzl(true));
        }
    }
}
