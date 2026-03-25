package o;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.business.featureflag.FeatureFlag;
import com.okinc.business.market.features.data.domain.usecase.HoldersChartUseCase$getChartData$1;
import com.okinc.business.market.features.data.domain.usecase.HoldersChartUseCase$getChartDataFromNative$1;
import com.okinc.business.market.features.data.domain.usecase.HoldersChartUseCase$getChartDataFromNative0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.data.domain.usecase.HoldersChartUseCase$getChartDataFromRust$1;
import com.okinc.business.market.features.data.domain.usecase.HoldersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jQF {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final C7002aZy AEQbTJ;
    public final jQJ KWHzl;
    public final InterfaceC25414iwK OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public jQF(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull jQJ jqj, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull C7002aZy c7002aZy) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(jqj, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(c7002aZy, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = jqj;
        this.OLrzqt = interfaceC25414iwK;
        this.AEQbTJ = c7002aZy;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jQF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<jQD>> continuation) throws java.lang.Throwable {
        HoldersChartUseCase$getChartData$1 holdersChartUseCase$getChartData$1;
        java.lang.Object objKWHzl;
        jQF jqf;
        if (continuation instanceof HoldersChartUseCase$getChartData$1) {
            holdersChartUseCase$getChartData$1 = (HoldersChartUseCase$getChartData$1) continuation;
            int i = holdersChartUseCase$getChartData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holdersChartUseCase$getChartData$1.label = i - Integer.MIN_VALUE;
            } else {
                holdersChartUseCase$getChartData$1 = new HoldersChartUseCase$getChartData$1(this, continuation);
            }
        }
        java.lang.Object obj = holdersChartUseCase$getChartData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holdersChartUseCase$getChartData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.OLrzqt.KWHzl()) {
                holdersChartUseCase$getChartData$1.L$0 = this;
                holdersChartUseCase$getChartData$1.L$1 = str;
                holdersChartUseCase$getChartData$1.L$2 = str2;
                holdersChartUseCase$getChartData$1.label = 1;
                objKWHzl = KWHzl(str, str2, holdersChartUseCase$getChartData$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                jqf = this;
            } else {
                holdersChartUseCase$getChartData$1.label = 3;
                java.lang.Object objAEQbTJ = AEQbTJ(str, str2, holdersChartUseCase$getChartData$1);
                return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
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
            str2 = (java.lang.String) holdersChartUseCase$getChartData$1.L$2;
            str = (java.lang.String) holdersChartUseCase$getChartData$1.L$1;
            jqf = (jQF) holdersChartUseCase$getChartData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl((jQD) objKWHzl);
        }
        jqf.KWHzl(thM7380exceptionOrNullimpl);
        holdersChartUseCase$getChartData$1.L$0 = null;
        holdersChartUseCase$getChartData$1.L$1 = null;
        holdersChartUseCase$getChartData$1.L$2 = null;
        holdersChartUseCase$getChartData$1.label = 2;
        java.lang.Object objAEQbTJ2 = jqf.AEQbTJ(str, str2, holdersChartUseCase$getChartData$1);
        return objAEQbTJ2 == objCopydefault ? objCopydefault : objAEQbTJ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, Continuation<? super Result<jQD>> continuation) throws java.lang.Throwable {
        HoldersChartUseCase$getChartDataFromRust$1 holdersChartUseCase$getChartDataFromRust$1;
        if (continuation instanceof HoldersChartUseCase$getChartDataFromRust$1) {
            holdersChartUseCase$getChartDataFromRust$1 = (HoldersChartUseCase$getChartDataFromRust$1) continuation;
            int i = holdersChartUseCase$getChartDataFromRust$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holdersChartUseCase$getChartDataFromRust$1.label = i - Integer.MIN_VALUE;
            } else {
                holdersChartUseCase$getChartDataFromRust$1 = new HoldersChartUseCase$getChartDataFromRust$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = holdersChartUseCase$getChartDataFromRust$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holdersChartUseCase$getChartDataFromRust$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            HoldersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1 holdersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1 = new HoldersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            holdersChartUseCase$getChartDataFromRust$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, holdersChartUseCase$getChartDataFromRust0E7RQCE$$inlined$dexRunCatching$1, holdersChartUseCase$getChartDataFromRust$1);
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
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, Continuation<? super Result<jQD>> continuation) throws java.lang.Throwable {
        HoldersChartUseCase$getChartDataFromNative$1 holdersChartUseCase$getChartDataFromNative$1;
        if (continuation instanceof HoldersChartUseCase$getChartDataFromNative$1) {
            holdersChartUseCase$getChartDataFromNative$1 = (HoldersChartUseCase$getChartDataFromNative$1) continuation;
            int i = holdersChartUseCase$getChartDataFromNative$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holdersChartUseCase$getChartDataFromNative$1.label = i - Integer.MIN_VALUE;
            } else {
                holdersChartUseCase$getChartDataFromNative$1 = new HoldersChartUseCase$getChartDataFromNative$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = holdersChartUseCase$getChartDataFromNative$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holdersChartUseCase$getChartDataFromNative$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            HoldersChartUseCase$getChartDataFromNative0E7RQCE$$inlined$dexRunCatching$1 holdersChartUseCase$getChartDataFromNative0E7RQCE$$inlined$dexRunCatching$1 = new HoldersChartUseCase$getChartDataFromNative0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            holdersChartUseCase$getChartDataFromNative$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, holdersChartUseCase$getChartDataFromNative0E7RQCE$$inlined$dexRunCatching$1, holdersChartUseCase$getChartDataFromNative$1);
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

    public final void KWHzl(java.lang.Throwable th) {
        pUU.AEQbTJ("HoldersChartUseCase", "Rust call failed, falling back to native", th);
        C6777aVl.Companion.EZpvd(th);
        C7002aZy c7002aZy = this.AEQbTJ;
        FeatureFlag featureFlag = FeatureFlag.DEX_MARKET_DATA_RUST;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        c7002aZy.EZpvd(featureFlag, message);
    }

    public final jQD OLrzqt(AAI aai) {
        java.util.List<AAM> listAEQbTJ = aai.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((AAM) it.next()));
        }
        java.util.List<AAM> listOLrzqt = aai.OLrzqt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it2 = listOLrzqt.iterator();
        while (it2.hasNext()) {
            arrayList2.add(EZpvd((AAM) it2.next()));
        }
        java.util.List<AAK> listValueOf = aai.valueOf();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        java.util.Iterator<T> it3 = listValueOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(EZpvd((AAK) it3.next()));
        }
        java.util.List<AAK> listGEmmrt = aai.gEmmrt();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator<T> it4 = listGEmmrt.iterator();
        while (it4.hasNext()) {
            arrayList4.add(EZpvd((AAK) it4.next()));
        }
        java.util.List<AAK> listAYXKKw = aai.AYXKKw();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        java.util.Iterator<T> it5 = listAYXKKw.iterator();
        while (it5.hasNext()) {
            arrayList5.add(EZpvd((AAK) it5.next()));
        }
        java.util.List<AAJ> listKWHzl = aai.KWHzl();
        java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it6 = listKWHzl.iterator();
        while (it6.hasNext()) {
            arrayList6.add(OLrzqt((AAJ) it6.next()));
        }
        java.util.List<AAJ> listDjBIcL = aai.djBIcL();
        java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        java.util.Iterator<T> it7 = listDjBIcL.iterator();
        while (it7.hasNext()) {
            arrayList7.add(OLrzqt((AAJ) it7.next()));
        }
        java.util.List<AAJ> listCopydefault = aai.copydefault();
        java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it8 = listCopydefault.iterator();
        while (it8.hasNext()) {
            arrayList8.add(OLrzqt((AAJ) it8.next()));
        }
        java.util.List<AAJ> listAhwBna = aai.AhwBna();
        java.util.ArrayList arrayList9 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it9 = listAhwBna.iterator();
        while (it9.hasNext()) {
            arrayList9.add(OLrzqt((AAJ) it9.next()));
        }
        java.util.List<AAJ> listEZpvd = aai.EZpvd();
        java.util.ArrayList arrayList10 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it10 = listEZpvd.iterator();
        while (it10.hasNext()) {
            arrayList10.add(OLrzqt((AAJ) it10.next()));
        }
        return new jQD(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, "");
    }

    public final ChartDataUIItem EZpvd(AAM aam) {
        return new ChartDataUIItem(aam.AEQbTJ(), aam.OLrzqt(), null, 4, null);
    }

    public final ChartDataUIItem EZpvd(AAK aak) {
        return new ChartDataUIItem(aak.AEQbTJ(), aak.copydefault(), aak.EZpvd());
    }

    public final ChartDataUIItem OLrzqt(AAJ aaj) {
        return new ChartDataUIItem(aaj.KWHzl(), aaj.copydefault(), null, 4, null);
    }
}
