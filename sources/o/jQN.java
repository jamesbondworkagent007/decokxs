package o;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import com.okinc.business.featureflag.FeatureFlag;
import com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChart$1;
import com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChartFromNative$1;
import com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChartFromRust$1;
import com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityList$1;
import com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityList0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jQN {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC25414iwK AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final jQL KWHzl;
    public final C7002aZy OLrzqt;

    @yCM
    public jQN(@NotNull jQL jql, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull C7002aZy c7002aZy) {
        Intrinsics.checkNotNullParameter(jql, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(c7002aZy, "");
        this.KWHzl = jql;
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = interfaceC25414iwK;
        this.OLrzqt = c7002aZy;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jQN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Result<jQC>> continuation) throws java.lang.Throwable {
        LiquidityDataUseCase$getLiquidityBarChart$1 liquidityDataUseCase$getLiquidityBarChart$1;
        java.lang.Object objCopydefault;
        jQN jqn;
        if (continuation instanceof LiquidityDataUseCase$getLiquidityBarChart$1) {
            liquidityDataUseCase$getLiquidityBarChart$1 = (LiquidityDataUseCase$getLiquidityBarChart$1) continuation;
            int i = liquidityDataUseCase$getLiquidityBarChart$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liquidityDataUseCase$getLiquidityBarChart$1.label = i - Integer.MIN_VALUE;
            } else {
                liquidityDataUseCase$getLiquidityBarChart$1 = new LiquidityDataUseCase$getLiquidityBarChart$1(this, continuation);
            }
        }
        java.lang.Object obj = liquidityDataUseCase$getLiquidityBarChart$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = liquidityDataUseCase$getLiquidityBarChart$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.AEQbTJ.KWHzl()) {
                liquidityDataUseCase$getLiquidityBarChart$1.L$0 = this;
                liquidityDataUseCase$getLiquidityBarChart$1.L$1 = str;
                liquidityDataUseCase$getLiquidityBarChart$1.L$2 = str2;
                liquidityDataUseCase$getLiquidityBarChart$1.L$3 = str3;
                liquidityDataUseCase$getLiquidityBarChart$1.label = 1;
                objCopydefault = copydefault(str, str2, str3, liquidityDataUseCase$getLiquidityBarChart$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                jqn = this;
            } else {
                liquidityDataUseCase$getLiquidityBarChart$1.label = 3;
                java.lang.Object objOLrzqt = OLrzqt(str, str2, str3, liquidityDataUseCase$getLiquidityBarChart$1);
                return objOLrzqt == objCopydefault2 ? objCopydefault2 : objOLrzqt;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            str3 = (java.lang.String) liquidityDataUseCase$getLiquidityBarChart$1.L$3;
            str2 = (java.lang.String) liquidityDataUseCase$getLiquidityBarChart$1.L$2;
            str = (java.lang.String) liquidityDataUseCase$getLiquidityBarChart$1.L$1;
            jqn = (jQN) liquidityDataUseCase$getLiquidityBarChart$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl((jQC) objCopydefault);
        }
        jqn.OLrzqt(thM7380exceptionOrNullimpl);
        liquidityDataUseCase$getLiquidityBarChart$1.L$0 = null;
        liquidityDataUseCase$getLiquidityBarChart$1.L$1 = null;
        liquidityDataUseCase$getLiquidityBarChart$1.L$2 = null;
        liquidityDataUseCase$getLiquidityBarChart$1.L$3 = null;
        liquidityDataUseCase$getLiquidityBarChart$1.label = 2;
        java.lang.Object objOLrzqt2 = jqn.OLrzqt(str, str2, str3, liquidityDataUseCase$getLiquidityBarChart$1);
        return objOLrzqt2 == objCopydefault2 ? objCopydefault2 : objOLrzqt2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation<? super Result<jQC>> continuation) throws java.lang.Throwable {
        LiquidityDataUseCase$getLiquidityBarChartFromRust$1 liquidityDataUseCase$getLiquidityBarChartFromRust$1;
        if (continuation instanceof LiquidityDataUseCase$getLiquidityBarChartFromRust$1) {
            liquidityDataUseCase$getLiquidityBarChartFromRust$1 = (LiquidityDataUseCase$getLiquidityBarChartFromRust$1) continuation;
            int i = liquidityDataUseCase$getLiquidityBarChartFromRust$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liquidityDataUseCase$getLiquidityBarChartFromRust$1.label = i - Integer.MIN_VALUE;
            } else {
                liquidityDataUseCase$getLiquidityBarChartFromRust$1 = new LiquidityDataUseCase$getLiquidityBarChartFromRust$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = liquidityDataUseCase$getLiquidityBarChartFromRust$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liquidityDataUseCase$getLiquidityBarChartFromRust$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            LiquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1 liquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1 = new LiquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1(null, str3, this, str, str2);
            liquidityDataUseCase$getLiquidityBarChartFromRust$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, liquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1, liquidityDataUseCase$getLiquidityBarChartFromRust$1);
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
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation<? super Result<jQC>> continuation) throws java.lang.Throwable {
        LiquidityDataUseCase$getLiquidityBarChartFromNative$1 liquidityDataUseCase$getLiquidityBarChartFromNative$1;
        if (continuation instanceof LiquidityDataUseCase$getLiquidityBarChartFromNative$1) {
            liquidityDataUseCase$getLiquidityBarChartFromNative$1 = (LiquidityDataUseCase$getLiquidityBarChartFromNative$1) continuation;
            int i = liquidityDataUseCase$getLiquidityBarChartFromNative$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liquidityDataUseCase$getLiquidityBarChartFromNative$1.label = i - Integer.MIN_VALUE;
            } else {
                liquidityDataUseCase$getLiquidityBarChartFromNative$1 = new LiquidityDataUseCase$getLiquidityBarChartFromNative$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = liquidityDataUseCase$getLiquidityBarChartFromNative$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liquidityDataUseCase$getLiquidityBarChartFromNative$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            LiquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1 liquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1 = new LiquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1(null, str3, this, str, str2);
            liquidityDataUseCase$getLiquidityBarChartFromNative$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, liquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1, liquidityDataUseCase$getLiquidityBarChartFromNative$1);
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
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<LiquidityPoolPairUIItem>>> continuation) throws java.lang.Throwable {
        LiquidityDataUseCase$getLiquidityList$1 liquidityDataUseCase$getLiquidityList$1;
        if (continuation instanceof LiquidityDataUseCase$getLiquidityList$1) {
            liquidityDataUseCase$getLiquidityList$1 = (LiquidityDataUseCase$getLiquidityList$1) continuation;
            int i = liquidityDataUseCase$getLiquidityList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liquidityDataUseCase$getLiquidityList$1.label = i - Integer.MIN_VALUE;
            } else {
                liquidityDataUseCase$getLiquidityList$1 = new LiquidityDataUseCase$getLiquidityList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = liquidityDataUseCase$getLiquidityList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liquidityDataUseCase$getLiquidityList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            LiquidityDataUseCase$getLiquidityList0E7RQCE$$inlined$dexRunCatching$1 liquidityDataUseCase$getLiquidityList0E7RQCE$$inlined$dexRunCatching$1 = new LiquidityDataUseCase$getLiquidityList0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            liquidityDataUseCase$getLiquidityList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, liquidityDataUseCase$getLiquidityList0E7RQCE$$inlined$dexRunCatching$1, liquidityDataUseCase$getLiquidityList$1);
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

    public final void OLrzqt(java.lang.Throwable th) {
        pUU.AEQbTJ("LiquidityDataUseCase", "Rust call failed, falling back to native", th);
        C6777aVl.Companion.EZpvd(th);
        C7002aZy c7002aZy = this.OLrzqt;
        FeatureFlag featureFlag = FeatureFlag.DEX_MARKET_DATA_RUST;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        c7002aZy.EZpvd(featureFlag, message);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jQC KWHzl(C2164ABf c2164ABf, java.lang.String str) {
        java.lang.String strOLrzqt;
        java.util.List<C2161ABc> listKWHzl;
        java.lang.Object next;
        C2159ABa c2159ABaOLrzqt = c2164ABf.OLrzqt();
        jQI jqi = null;
        if (c2159ABaOLrzqt == null || (listKWHzl = c2159ABaOLrzqt.KWHzl()) == null) {
            strOLrzqt = null;
        } else {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C2161ABc) next).EZpvd(), (java.lang.Object) "1")) {
                    break;
                }
            }
            C2161ABc c2161ABc = (C2161ABc) next;
            if (c2161ABc != null) {
                strOLrzqt = c2161ABc.OLrzqt();
            }
        }
        if (str == null) {
            str = strOLrzqt;
        }
        C2159ABa c2159ABaOLrzqt2 = c2164ABf.OLrzqt();
        if (c2159ABaOLrzqt2 != null) {
            java.util.List<C2161ABc> listKWHzl2 = c2159ABaOLrzqt2.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl2, 10));
            for (C2161ABc c2161ABc2 : listKWHzl2) {
                arrayList.add(new jQH(Intrinsics.EZpvd((java.lang.Object) c2161ABc2.OLrzqt(), (java.lang.Object) str), c2161ABc2.KWHzl(), c2161ABc2.OLrzqt()));
            }
            jqi = new jQI(arrayList);
        }
        java.util.List<C2163ABe> listKWHzl3 = c2164ABf.KWHzl();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl3, 10));
        for (C2163ABe c2163ABe : listKWHzl3) {
            arrayList2.add(new ChartDataUIItem(c2163ABe.EZpvd(), c2163ABe.copydefault(), null, 4, null));
        }
        return new jQC(jqi, arrayList2);
    }
}
