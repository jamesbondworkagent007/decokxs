package o;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.MapTagUseCase$map$1;
import com.okinc.business.market.features.tag.domain.MapTagUseCase$map$3;
import com.okinc.business.market.features.tag.domain.MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.tag.domain.MapTagUseCase$mapgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29712kyn {
    public final C29715kyq AEQbTJ;
    public final C29708kyj KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C29712kyn(@NotNull C29715kyq c29715kyq, @NotNull C29708kyj c29708kyj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        Intrinsics.checkNotNullParameter(c29708kyj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c29715kyq;
        this.KWHzl = c29708kyj;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull CompactTagData compactTagData, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Integer num, java.lang.Float f4, @NotNull Continuation<? super Result<TagWrapper>> continuation) throws java.lang.Throwable {
        MapTagUseCase$map$1 mapTagUseCase$map$1;
        if (continuation instanceof MapTagUseCase$map$1) {
            mapTagUseCase$map$1 = (MapTagUseCase$map$1) continuation;
            int i = mapTagUseCase$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapTagUseCase$map$1.label = i - Integer.MIN_VALUE;
            } else {
                mapTagUseCase$map$1 = new MapTagUseCase$map$1(this, continuation);
            }
        }
        MapTagUseCase$map$1 mapTagUseCase$map$12 = mapTagUseCase$map$1;
        java.lang.Object objWithContext = mapTagUseCase$map$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapTagUseCase$map$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1 mapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1 = new MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1(null, f, f2, num, f3, f4, compactTagData, this);
            mapTagUseCase$map$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1, mapTagUseCase$map$12);
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
    public final java.lang.Object AEQbTJ(@NotNull CompactTag compactTag, @NotNull Continuation<? super Result<TagWrapper>> continuation) throws java.lang.Throwable {
        MapTagUseCase$map$3 mapTagUseCase$map$3;
        if (continuation instanceof MapTagUseCase$map$3) {
            mapTagUseCase$map$3 = (MapTagUseCase$map$3) continuation;
            int i = mapTagUseCase$map$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapTagUseCase$map$3.label = i - Integer.MIN_VALUE;
            } else {
                mapTagUseCase$map$3 = new MapTagUseCase$map$3(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapTagUseCase$map$3.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapTagUseCase$map$3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            MapTagUseCase$mapgIAlus$$inlined$dexRunCatching$1 mapTagUseCase$mapgIAlus$$inlined$dexRunCatching$1 = new MapTagUseCase$mapgIAlus$$inlined$dexRunCatching$1(null, compactTag, this);
            mapTagUseCase$map$3.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapTagUseCase$mapgIAlus$$inlined$dexRunCatching$1, mapTagUseCase$map$3);
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
