package o;

import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.business.market.features.home_favorite_list.domain.MapHomeFavoriteTokenUseCase$mapToDomainModel$1;
import com.okinc.business.market.features.home_favorite_list.domain.MapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28413kaM {
    public final CoroutineDispatcher AEQbTJ;
    public final C29712kyn EZpvd;

    @yCM
    public C28413kaM(@NotNull C29712kyn c29712kyn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c29712kyn;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull HomeFavoriteTokenData homeFavoriteTokenData, @NotNull Continuation<? super Result<C28422kaV>> continuation) throws java.lang.Throwable {
        MapHomeFavoriteTokenUseCase$mapToDomainModel$1 mapHomeFavoriteTokenUseCase$mapToDomainModel$1;
        if (continuation instanceof MapHomeFavoriteTokenUseCase$mapToDomainModel$1) {
            mapHomeFavoriteTokenUseCase$mapToDomainModel$1 = (MapHomeFavoriteTokenUseCase$mapToDomainModel$1) continuation;
            int i = mapHomeFavoriteTokenUseCase$mapToDomainModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapHomeFavoriteTokenUseCase$mapToDomainModel$1.label = i - Integer.MIN_VALUE;
            } else {
                mapHomeFavoriteTokenUseCase$mapToDomainModel$1 = new MapHomeFavoriteTokenUseCase$mapToDomainModel$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapHomeFavoriteTokenUseCase$mapToDomainModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapHomeFavoriteTokenUseCase$mapToDomainModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            MapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1 mapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1 = new MapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1(null, homeFavoriteTokenData, this);
            mapHomeFavoriteTokenUseCase$mapToDomainModel$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1, mapHomeFavoriteTokenUseCase$mapToDomainModel$1);
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
}
