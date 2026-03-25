package o;

import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.home_token_list.domain.MapHomeTokenUseCase$mapToDomainModel$1;
import com.okinc.business.market.features.home_token_list.domain.MapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28541kci {
    public final C27784kDf AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final C29712kyn copydefault;

    @yCM
    public C28541kci(@NotNull C29712kyn c29712kyn, @NotNull C27784kDf c27784kDf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(c27784kDf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c29712kyn;
        this.AEQbTJ = c27784kDf;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull HomeTokenData homeTokenData, @NotNull Continuation<? super Result<HomeToken>> continuation) throws java.lang.Throwable {
        MapHomeTokenUseCase$mapToDomainModel$1 mapHomeTokenUseCase$mapToDomainModel$1;
        if (continuation instanceof MapHomeTokenUseCase$mapToDomainModel$1) {
            mapHomeTokenUseCase$mapToDomainModel$1 = (MapHomeTokenUseCase$mapToDomainModel$1) continuation;
            int i = mapHomeTokenUseCase$mapToDomainModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapHomeTokenUseCase$mapToDomainModel$1.label = i - Integer.MIN_VALUE;
            } else {
                mapHomeTokenUseCase$mapToDomainModel$1 = new MapHomeTokenUseCase$mapToDomainModel$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapHomeTokenUseCase$mapToDomainModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapHomeTokenUseCase$mapToDomainModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            MapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1 mapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1 = new MapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1(null, homeTokenData, this);
            mapHomeTokenUseCase$mapToDomainModel$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1, mapHomeTokenUseCase$mapToDomainModel$1);
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
