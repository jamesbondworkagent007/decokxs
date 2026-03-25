package o;

import com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData;
import com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingFilterCacheContainer;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingFilterCacheRepository$getLastSelectedChainId$1;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingFilterCacheRepository$loadCacheContainer$1;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingFilterCacheRepository$loadFilterCache$1;
import com.okinc.business.market.features.scanner.surge.trending.repo.SurgeTrendingFilterCacheRepository$saveFilterCache$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C29298kqx {
    public final C27670jza copydefault;

    @yCM
    public C29298kqx(@NotNull C27670jza c27670jza) {
        Intrinsics.checkNotNullParameter(c27670jza, "");
        this.copydefault = c27670jza;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull C29346krs c29346krs, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SurgeTrendingFilterCacheRepository$saveFilterCache$1 surgeTrendingFilterCacheRepository$saveFilterCache$1;
        java.lang.String str2;
        C29346krs c29346krs2;
        java.lang.Object objAEQbTJ;
        C29298kqx c29298kqx;
        if (continuation instanceof SurgeTrendingFilterCacheRepository$saveFilterCache$1) {
            surgeTrendingFilterCacheRepository$saveFilterCache$1 = (SurgeTrendingFilterCacheRepository$saveFilterCache$1) continuation;
            int i = surgeTrendingFilterCacheRepository$saveFilterCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeTrendingFilterCacheRepository$saveFilterCache$1.label = i - Integer.MIN_VALUE;
            } else {
                surgeTrendingFilterCacheRepository$saveFilterCache$1 = new SurgeTrendingFilterCacheRepository$saveFilterCache$1(this, continuation);
            }
        }
        java.lang.Object obj = surgeTrendingFilterCacheRepository$saveFilterCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = surgeTrendingFilterCacheRepository$saveFilterCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (str.length() == 0) {
                return Unit.INSTANCE;
            }
            surgeTrendingFilterCacheRepository$saveFilterCache$1.L$0 = this;
            str2 = str;
            surgeTrendingFilterCacheRepository$saveFilterCache$1.L$1 = str2;
            c29346krs2 = c29346krs;
            surgeTrendingFilterCacheRepository$saveFilterCache$1.L$2 = c29346krs2;
            surgeTrendingFilterCacheRepository$saveFilterCache$1.label = 1;
            objAEQbTJ = AEQbTJ(surgeTrendingFilterCacheRepository$saveFilterCache$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c29298kqx = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                return Unit.INSTANCE;
            }
            c29346krs2 = (C29346krs) surgeTrendingFilterCacheRepository$saveFilterCache$1.L$2;
            java.lang.String str3 = (java.lang.String) surgeTrendingFilterCacheRepository$saveFilterCache$1.L$1;
            c29298kqx = (C29298kqx) surgeTrendingFilterCacheRepository$saveFilterCache$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            str2 = str3;
        }
        SurgeTrendingChainFilterData surgeTrendingChainFilterData = new SurgeTrendingChainFilterData(c29346krs2.copydefault(), c29346krs2.AEQbTJ().KWHzl(), c29346krs2.OLrzqt().OLrzqt(), c29346krs2.OLrzqt().AEQbTJ(), c29346krs2.OLrzqt().gEmmrt(), c29346krs2.OLrzqt().valueOf(), c29346krs2.OLrzqt().djBIcL(), c29346krs2.OLrzqt().copydefault(), c29346krs2.OLrzqt().AYXKKw().getValue(), c29346krs2.OLrzqt().KWHzl(), c29346krs2.OLrzqt().EZpvd());
        java.util.Map mapIsConnected = C56424yEw.isConnected(((SurgeTrendingFilterCacheContainer) objAEQbTJ).getChainFilters());
        mapIsConnected.put(str2, surgeTrendingChainFilterData);
        C27670jza c27670jza = c29298kqx.copydefault;
        KSerializer<SurgeTrendingFilterCacheContainer> kSerializerSerializer = SurgeTrendingFilterCacheContainer.Companion.serializer();
        SurgeTrendingFilterCacheContainer surgeTrendingFilterCacheContainer = new SurgeTrendingFilterCacheContainer(str2, mapIsConnected);
        surgeTrendingFilterCacheRepository$saveFilterCache$1.L$0 = null;
        surgeTrendingFilterCacheRepository$saveFilterCache$1.L$1 = null;
        surgeTrendingFilterCacheRepository$saveFilterCache$1.L$2 = null;
        surgeTrendingFilterCacheRepository$saveFilterCache$1.label = 2;
        if (c27670jza.EZpvd("dex_surge_trending_filter_cache", kSerializerSerializer, surgeTrendingFilterCacheContainer, surgeTrendingFilterCacheRepository$saveFilterCache$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super SurgeTrendingChainFilterData> continuation) throws java.lang.Throwable {
        SurgeTrendingFilterCacheRepository$loadFilterCache$1 surgeTrendingFilterCacheRepository$loadFilterCache$1;
        if (continuation instanceof SurgeTrendingFilterCacheRepository$loadFilterCache$1) {
            surgeTrendingFilterCacheRepository$loadFilterCache$1 = (SurgeTrendingFilterCacheRepository$loadFilterCache$1) continuation;
            int i = surgeTrendingFilterCacheRepository$loadFilterCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeTrendingFilterCacheRepository$loadFilterCache$1.label = i - Integer.MIN_VALUE;
            } else {
                surgeTrendingFilterCacheRepository$loadFilterCache$1 = new SurgeTrendingFilterCacheRepository$loadFilterCache$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = surgeTrendingFilterCacheRepository$loadFilterCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = surgeTrendingFilterCacheRepository$loadFilterCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (str.length() == 0) {
                return null;
            }
            surgeTrendingFilterCacheRepository$loadFilterCache$1.L$0 = str;
            surgeTrendingFilterCacheRepository$loadFilterCache$1.label = 1;
            objAEQbTJ = AEQbTJ(surgeTrendingFilterCacheRepository$loadFilterCache$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) surgeTrendingFilterCacheRepository$loadFilterCache$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((SurgeTrendingFilterCacheContainer) objAEQbTJ).getChainFilters().get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        SurgeTrendingFilterCacheRepository$getLastSelectedChainId$1 surgeTrendingFilterCacheRepository$getLastSelectedChainId$1;
        if (continuation instanceof SurgeTrendingFilterCacheRepository$getLastSelectedChainId$1) {
            surgeTrendingFilterCacheRepository$getLastSelectedChainId$1 = (SurgeTrendingFilterCacheRepository$getLastSelectedChainId$1) continuation;
            int i = surgeTrendingFilterCacheRepository$getLastSelectedChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeTrendingFilterCacheRepository$getLastSelectedChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                surgeTrendingFilterCacheRepository$getLastSelectedChainId$1 = new SurgeTrendingFilterCacheRepository$getLastSelectedChainId$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = surgeTrendingFilterCacheRepository$getLastSelectedChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = surgeTrendingFilterCacheRepository$getLastSelectedChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            surgeTrendingFilterCacheRepository$getLastSelectedChainId$1.label = 1;
            objAEQbTJ = AEQbTJ(surgeTrendingFilterCacheRepository$getLastSelectedChainId$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.lang.String lastSelectedChainId = ((SurgeTrendingFilterCacheContainer) objAEQbTJ).getLastSelectedChainId();
        if (lastSelectedChainId.length() > 0) {
            return lastSelectedChainId;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super SurgeTrendingFilterCacheContainer> continuation) throws java.lang.Throwable {
        SurgeTrendingFilterCacheRepository$loadCacheContainer$1 surgeTrendingFilterCacheRepository$loadCacheContainer$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof SurgeTrendingFilterCacheRepository$loadCacheContainer$1) {
            surgeTrendingFilterCacheRepository$loadCacheContainer$1 = (SurgeTrendingFilterCacheRepository$loadCacheContainer$1) continuation;
            int i = surgeTrendingFilterCacheRepository$loadCacheContainer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                surgeTrendingFilterCacheRepository$loadCacheContainer$1.label = i - Integer.MIN_VALUE;
            } else {
                surgeTrendingFilterCacheRepository$loadCacheContainer$1 = new SurgeTrendingFilterCacheRepository$loadCacheContainer$1(this, continuation);
            }
        }
        java.lang.Object obj = surgeTrendingFilterCacheRepository$loadCacheContainer$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = surgeTrendingFilterCacheRepository$loadCacheContainer$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C27670jza c27670jza = this.copydefault;
            KSerializer<SurgeTrendingFilterCacheContainer> kSerializerSerializer = SurgeTrendingFilterCacheContainer.Companion.serializer();
            surgeTrendingFilterCacheRepository$loadCacheContainer$1.label = 1;
            objAEQbTJ = c27670jza.AEQbTJ("dex_surge_trending_filter_cache", kSerializerSerializer, surgeTrendingFilterCacheRepository$loadCacheContainer$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.String str = null;
        byte b = 0;
        byte b2 = 0;
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        SurgeTrendingFilterCacheContainer surgeTrendingFilterCacheContainer = (SurgeTrendingFilterCacheContainer) objAEQbTJ;
        if (surgeTrendingFilterCacheContainer != null) {
            return surgeTrendingFilterCacheContainer;
        }
        return new SurgeTrendingFilterCacheContainer(str, (java.util.Map) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
    }
}
