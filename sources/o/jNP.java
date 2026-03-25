package o;

import com.okinc.business.market.features.coindetail.domain.MapSniperUseCase$map$1;
import com.okinc.business.market.features.coindetail.domain.MapSniperUseCase$map$3;
import com.okinc.business.market.features.coindetail.domain.MapSniperUseCase$map$5;
import com.okinc.business.market.features.coindetail.domain.MapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.coindetail.domain.MapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers;
import com.okinc.business.market.features.coindetail.domain.models.EarlyBuyersWs;
import com.okinc.business.market.features.coindetail.domain.models.SniperHolder;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNP {
    public final CoroutineDispatcher EZpvd;
    public final C29712kyn copydefault;

    @yCM
    public jNP(@NotNull C29712kyn c29712kyn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c29712kyn;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[Catch: all -> 0x00c7, CancellationException -> 0x00da, TryCatch #2 {CancellationException -> 0x00da, all -> 0x00c7, blocks: (B:12:0x0041, B:24:0x00a8, B:27:0x00af, B:29:0x00b3, B:18:0x0081, B:20:0x0087, B:31:0x00b9, B:17:0x005b), top: B:38:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[Catch: all -> 0x00c7, CancellationException -> 0x00da, TryCatch #2 {CancellationException -> 0x00da, all -> 0x00c7, blocks: (B:12:0x0041, B:24:0x00a8, B:27:0x00af, B:29:0x00b3, B:18:0x0081, B:20:0x0087, B:31:0x00b9, B:17:0x005b), top: B:38:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[Catch: all -> 0x00c7, CancellationException -> 0x00da, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00da, all -> 0x00c7, blocks: (B:12:0x0041, B:24:0x00a8, B:27:0x00af, B:29:0x00b3, B:18:0x0081, B:20:0x0087, B:31:0x00b9, B:17:0x005b), top: B:38:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a4 -> B:24:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull EarlyBuyers earlyBuyers, @NotNull Continuation<? super Result<C26029jPh>> continuation) {
        MapSniperUseCase$map$1 mapSniperUseCase$map$1;
        java.util.Iterator it;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        jNP jnp;
        java.lang.String str4;
        java.util.Collection collection;
        if (continuation instanceof MapSniperUseCase$map$1) {
            mapSniperUseCase$map$1 = (MapSniperUseCase$map$1) continuation;
            int i = mapSniperUseCase$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapSniperUseCase$map$1.label = i - Integer.MIN_VALUE;
            } else {
                mapSniperUseCase$map$1 = new MapSniperUseCase$map$1(this, continuation);
            }
        }
        java.lang.Object obj = mapSniperUseCase$map$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapSniperUseCase$map$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                java.lang.String totalBuyInAmountPercentage = earlyBuyers.getTotalBuyInAmountPercentage();
                java.lang.String totalHoldAmountPercentage = earlyBuyers.getTotalHoldAmountPercentage();
                java.lang.String tokenContractAddress = earlyBuyers.getTokenContractAddress();
                java.lang.String chainId = earlyBuyers.getChainId();
                java.util.List<SniperHolder> earlyBuyerDetailVOList = earlyBuyers.getEarlyBuyerDetailVOList();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                it = earlyBuyerDetailVOList.iterator();
                str = tokenContractAddress;
                str2 = chainId;
                str3 = totalBuyInAmountPercentage;
                jnp = this;
                str4 = totalHoldAmountPercentage;
                collection = arrayList;
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (java.util.Iterator) mapSniperUseCase$map$1.L$6;
                collection = (java.util.Collection) mapSniperUseCase$map$1.L$5;
                java.lang.String str5 = (java.lang.String) mapSniperUseCase$map$1.L$4;
                java.lang.String str6 = (java.lang.String) mapSniperUseCase$map$1.L$3;
                java.lang.String str7 = (java.lang.String) mapSniperUseCase$map$1.L$2;
                java.lang.String str8 = (java.lang.String) mapSniperUseCase$map$1.L$1;
                jNP jnp2 = (jNP) mapSniperUseCase$map$1.L$0;
                C56391yDq.AEQbTJ(obj);
                java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
                str3 = str5;
                java.lang.String str9 = str8;
                str = str7;
                str4 = str6;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                C26041jPt c26041jPt = (C26041jPt) objM7386unboximpl;
                if (c26041jPt != null) {
                    collection.add(c26041jPt);
                }
                jnp = jnp2;
                str2 = str9;
                if (it.hasNext()) {
                    SniperHolder sniperHolder = (SniperHolder) it.next();
                    mapSniperUseCase$map$1.L$0 = jnp;
                    mapSniperUseCase$map$1.L$1 = str2;
                    mapSniperUseCase$map$1.L$2 = str;
                    mapSniperUseCase$map$1.L$3 = str4;
                    mapSniperUseCase$map$1.L$4 = str3;
                    mapSniperUseCase$map$1.L$5 = collection;
                    mapSniperUseCase$map$1.L$6 = it;
                    mapSniperUseCase$map$1.label = 1;
                    java.lang.Object objCopydefault2 = jnp.copydefault(sniperHolder, mapSniperUseCase$map$1);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    java.lang.String str10 = str2;
                    jnp2 = jnp;
                    objM7386unboximpl = objCopydefault2;
                    str9 = str10;
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    }
                    C26041jPt c26041jPt2 = (C26041jPt) objM7386unboximpl;
                    if (c26041jPt2 != null) {
                    }
                    jnp = jnp2;
                    str2 = str9;
                    if (it.hasNext()) {
                        return Result.m7377constructorimpl(new C26029jPh(str3, str4, str, str2, (java.util.List) collection));
                    }
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull EarlyBuyersWs earlyBuyersWs, @NotNull java.util.List<C26041jPt> list, @NotNull Continuation<? super Result<C26029jPh>> continuation) throws java.lang.Throwable {
        MapSniperUseCase$map$3 mapSniperUseCase$map$3;
        if (continuation instanceof MapSniperUseCase$map$3) {
            mapSniperUseCase$map$3 = (MapSniperUseCase$map$3) continuation;
            int i = mapSniperUseCase$map$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapSniperUseCase$map$3.label = i - Integer.MIN_VALUE;
            } else {
                mapSniperUseCase$map$3 = new MapSniperUseCase$map$3(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapSniperUseCase$map$3.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapSniperUseCase$map$3.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            MapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1 mapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1 = new MapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1(null, list, earlyBuyersWs, this);
            mapSniperUseCase$map$3.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapSniperUseCase$map0E7RQCE$$inlined$dexRunCatching$1, mapSniperUseCase$map$3);
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jNP */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: map-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8639map0E7RQCE$default(jNP jnp, EarlyBuyersWs earlyBuyersWs, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        return jnp.copydefault(earlyBuyersWs, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull SniperHolder sniperHolder, @NotNull Continuation<? super Result<C26041jPt>> continuation) throws java.lang.Throwable {
        MapSniperUseCase$map$5 mapSniperUseCase$map$5;
        if (continuation instanceof MapSniperUseCase$map$5) {
            mapSniperUseCase$map$5 = (MapSniperUseCase$map$5) continuation;
            int i = mapSniperUseCase$map$5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapSniperUseCase$map$5.label = i - Integer.MIN_VALUE;
            } else {
                mapSniperUseCase$map$5 = new MapSniperUseCase$map$5(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapSniperUseCase$map$5.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapSniperUseCase$map$5.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            MapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1 mapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1 = new MapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1(null, sniperHolder, this);
            mapSniperUseCase$map$5.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapSniperUseCase$mapgIAlus$$inlined$dexRunCatching$1, mapSniperUseCase$map$5);
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
