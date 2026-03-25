package o;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import com.okinc.planet.domain.remote.dto.PublisherTopicRes;
import com.okinc.planet.domain.usecase.PlanetGetPublisherTopicUserUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46352tRd extends AbstractC46360tRl<CacheStrategy, kotlin.Pair<? extends java.util.List<? extends PublisherTopicInfo>, ? extends java.lang.Boolean>> {
    public final CoroutineDispatcher AEQbTJ;
    public final tQV KWHzl;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC46360tRl
    public /* bridge */ /* synthetic */ java.lang.Object AEQbTJ(CacheStrategy cacheStrategy, Continuation<? super kotlin.Pair<? extends java.util.List<? extends PublisherTopicInfo>, ? extends java.lang.Boolean>> continuation) {
        return AEQbTJ2(cacheStrategy, (Continuation<? super kotlin.Pair<? extends java.util.List<PublisherTopicInfo>, java.lang.Boolean>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46352tRd(@NotNull tQV tqv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(tqv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = tqv;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ2(@NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super kotlin.Pair<? extends java.util.List<PublisherTopicInfo>, java.lang.Boolean>> continuation) throws java.lang.Throwable {
        PlanetGetPublisherTopicUserUseCase$execute$1 planetGetPublisherTopicUserUseCase$execute$1;
        java.lang.String str;
        if (continuation instanceof PlanetGetPublisherTopicUserUseCase$execute$1) {
            planetGetPublisherTopicUserUseCase$execute$1 = (PlanetGetPublisherTopicUserUseCase$execute$1) continuation;
            int i = planetGetPublisherTopicUserUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetGetPublisherTopicUserUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                planetGetPublisherTopicUserUseCase$execute$1 = new PlanetGetPublisherTopicUserUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = planetGetPublisherTopicUserUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetGetPublisherTopicUserUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                tQV tqv = this.KWHzl;
                java.lang.String strName = cacheStrategy.name();
                planetGetPublisherTopicUserUseCase$execute$1.label = 1;
                objOLrzqt = tqv.OLrzqt(strName, planetGetPublisherTopicUserUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            return C56390yDp.OLrzqt(((PublisherTopicRes) ((AbstractC43419rot) objOLrzqt).AEQbTJ()).getActivityTagList(), C56443yFo.KWHzl(false));
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
