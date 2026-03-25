package com.okinc.nft.ui.kline;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.socket.UDWsArgV5ForWeb3;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.nft.ui.kline.MLNKLineChart;
import com.okinc.nft.ui.kline.bean.TokenCandleParam;
import com.okinc.nft.ui.kline.bean.UDKLineCandleData;
import com.okinc.rxutils.SubHelper;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C33024moe;
import o.C33129mqd;
import o.C35965oKg;
import o.C35969oKk;
import o.C36246oUr;
import o.C43296rmc;
import o.C43601rsP;
import o.C43603rsR;
import o.C43606rsU;
import o.C43669rte;
import o.C56391yDq;
import o.C58266yxz;
import o.C7594aml;
import o.C8017aul;
import o.InterfaceC35981oKw;
import o.InterfaceC43666rtb;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC60044zuT;
import o.pFN;
import o.pGV;
import o.yBP;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public final class MLNKLineChart extends UDView<View> {
    public InterfaceC58217yxC AYXKKw;
    public LuaFunction AhwBna;
    public LuaFunction AkhnZx;
    public LuaFunction DbNXlk;
    public final TaskDescription KWHzl;
    public LuaFunction copydefault;
    public LuaFunction djBIcL;
    public InterfaceC58217yxC fARcdN;
    public LuaFunction fetchVPNInfo;
    public pGV gEmmrt;
    public LuaFunction isConnected;
    public C43669rte valueOf;
    public LuaFunction values;
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final String[] AEQbTJ = {"configTimeInterval", "initView", "setTimeChangeCallback", "setOpenDrawingToolsCallback", "setScreenOrientationChangedCallback", "setLoadMoreCandleDataCallback", "setChartStateCallback", "setSharePageCallback", "resetChartView", "loadKLineData", "loadKLineHistoryData", "setDataFormatter", "setChannelGenerator", "addHistoryKline", "updateKlineData", "refreshKlineData", "release"};
    public static final String OLrzqt = MLNKLineChart.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final List OLrzqt(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.nft.ui.kline.MLNKLineChart.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] KWHzl() {
            return MLNKLineChart.AEQbTJ;
        }
    }

    @InterfaceC60044zuT
    public MLNKLineChart(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = new TaskDescription();
    }

    public static final class TaskDescription implements InterfaceC43666rtb {
        public TaskDescription() {
        }

        @Override // o.InterfaceC43666rtb
        public void KWHzl(List<C35965oKg> list, String str) {
            Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            MLNKLineChart.this.KWHzl(1);
            if (MLNKLineChart.this.djBIcL == null) {
                pGV pgv = MLNKLineChart.this.gEmmrt;
                if (pgv != null) {
                    pgv.OLrzqt(list);
                }
                if (list.isEmpty()) {
                    MLNKLineChart.this.KWHzl(3);
                    return;
                } else {
                    MLNKLineChart.this.KWHzl(4);
                    return;
                }
            }
            MLNKLineChart mLNKLineChart = MLNKLineChart.this;
            try {
                Result.Application application = Result.Companion;
                LuaFunction luaFunction = mLNKLineChart.djBIcL;
                Intrinsics.copydefault(luaFunction);
                objM7377constructorimpl = Result.m7377constructorimpl(luaFunction.invoke(new UDArray[]{new UDArray(mLNKLineChart.globals, (List) list)}));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            final MLNKLineChart mLNKLineChart2 = MLNKLineChart.this;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl((LuaValue[]) objM7377constructorimpl);
                final Function1 function1 = new Function1() { // from class: o.rso
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MLNKLineChart.TaskDescription.KWHzl((LuaValue[]) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.rsw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return MLNKLineChart.TaskDescription.KWHzl(function1, obj);
                    }
                }).copydefault(yBP.KWHzl()).KWHzl(C58266yxz.OLrzqt());
                final Function1 function12 = new Function1() { // from class: o.rsu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MLNKLineChart.TaskDescription.OLrzqt(mLNKLineChart2, (java.util.ArrayList) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rst
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        MLNKLineChart.TaskDescription.OLrzqt(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.rsv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MLNKLineChart.TaskDescription.copydefault((java.lang.Throwable) obj);
                    }
                };
                mLNKLineChart2.AYXKKw = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rsx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        MLNKLineChart.TaskDescription.valueOf(function13, obj);
                    }
                });
            }
            MLNKLineChart mLNKLineChart3 = MLNKLineChart.this;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                String str2 = MLNKLineChart.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                C43296rmc.AEQbTJ(str2, "format invoke error:" + thM7380exceptionOrNullimpl.getMessage());
                if (Intrinsics.EZpvd((Object) str, (Object) "http")) {
                    mLNKLineChart3.KWHzl(2);
                }
            }
            if (list.isEmpty()) {
                MLNKLineChart.this.KWHzl(3);
            } else {
                MLNKLineChart.this.KWHzl(4);
            }
        }

        public static final ArrayList KWHzl(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ArrayList) function1.invoke(obj);
        }

        public static final ArrayList KWHzl(LuaValue[] luaValueArr) {
            Object objAEQbTJ;
            Intrinsics.checkNotNullParameter(luaValueArr, "");
            ArrayList arrayList = new ArrayList();
            LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
            if (luaValue == null || (objAEQbTJ = C8017aul.AEQbTJ(luaValue, (Class<Object>) UDArray.class)) == null) {
                return arrayList;
            }
            List listEZpvd = ((UDArray) objAEQbTJ).EZpvd();
            Intrinsics.copydefault(listEZpvd, "");
            ArrayList arrayList2 = new ArrayList(listEZpvd);
            luaValue.destroy();
            return arrayList2;
        }

        public static final void OLrzqt(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(MLNKLineChart mLNKLineChart, ArrayList arrayList) {
            pGV pgv = mLNKLineChart.gEmmrt;
            if (pgv != null) {
                Intrinsics.copydefault(arrayList);
                pgv.OLrzqt(arrayList);
            }
            return Unit.INSTANCE;
        }

        public static final void valueOf(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(Throwable th) {
            String str = MLNKLineChart.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(str, "");
            C43296rmc.AEQbTJ(str, "UDArray to List error:" + th.getMessage());
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC43666rtb
        public void AEQbTJ(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (Intrinsics.EZpvd((Object) str2, (Object) "http")) {
                MLNKLineChart.this.KWHzl(2);
            }
            C36246oUr.copydefault().isConnected(false);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        pGV pgv = new pGV(contextAubY, null, 2, null);
        this.gEmmrt = pgv;
        Intrinsics.copydefault(pgv);
        return pgv;
    }

    public static final class ActionBar implements InterfaceC35981oKw {
        public ActionBar() {
        }

        @Override // o.InterfaceC35981oKw
        public void AEQbTJ() {
            InterfaceC35981oKw.ActionBar.OLrzqt(this);
        }

        @Override // o.InterfaceC35981oKw
        public void AEQbTJ(String str) {
            InterfaceC35981oKw.ActionBar.KWHzl(this, str);
        }

        @Override // o.InterfaceC35981oKw
        public void EZpvd(String str) {
            InterfaceC35981oKw.ActionBar.EZpvd(this, str);
        }

        @Override // o.InterfaceC35981oKw
        public void KWHzl() {
            InterfaceC35981oKw.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC35981oKw
        public void KWHzl(int i) {
            InterfaceC35981oKw.ActionBar.KWHzl(this, i);
        }

        @Override // o.InterfaceC35981oKw
        public void KWHzl(boolean z) {
            InterfaceC35981oKw.ActionBar.KWHzl(this, z);
        }

        @Override // o.InterfaceC35981oKw
        public void copydefault(String str, int i) {
            InterfaceC35981oKw.ActionBar.EZpvd(this, str, i);
        }

        @Override // o.InterfaceC35981oKw
        public void copydefault(boolean z) {
            InterfaceC35981oKw.ActionBar.AEQbTJ(this, z);
        }

        @Override // o.InterfaceC35981oKw
        public void AEQbTJ(int i) {
            LuaFunction luaFunction = MLNKLineChart.this.values;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)));
            }
        }

        @Override // o.InterfaceC35981oKw
        public void copydefault() {
            LuaFunction luaFunction = MLNKLineChart.this.DbNXlk;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(new LuaValue[0]));
            }
        }

        @Override // o.InterfaceC35981oKw
        public void EZpvd() {
            LuaFunction luaFunction = MLNKLineChart.this.isConnected;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rNumber(1.0d));
            }
        }

        @Override // o.InterfaceC35981oKw
        public void OLrzqt() {
            LuaFunction luaFunction = MLNKLineChart.this.isConnected;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rNumber(2.0d));
            }
        }

        @Override // o.InterfaceC35981oKw
        public void OLrzqt(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            LuaFunction luaFunction = MLNKLineChart.this.AkhnZx;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rString(str));
            }
        }

        @Override // o.InterfaceC35981oKw
        public void djBIcL() {
            LuaFunction luaFunction = MLNKLineChart.this.fetchVPNInfo;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(new LuaValue[0]));
            }
        }
    }

    public final void AYXKKw() {
        pGV pgv = this.gEmmrt;
        if (pgv != null) {
            pgv.setMultiChartViewClickListener(new ActionBar());
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSharePageCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.fetchVPNInfo(this.copydefault, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit fetchVPNInfo(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.fetchVPNInfo = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTimeChangeCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rrZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.fIwbmz(this.OLrzqt, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit fIwbmz(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.values = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOpenDrawingToolsCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.isConnected(this.copydefault, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit isConnected(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.DbNXlk = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setScreenOrientationChangedCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.values(this.KWHzl, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit values(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.isConnected = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setLoadMoreCandleDataCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.DbNXlk(this.KWHzl, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit DbNXlk(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.AkhnZx = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChartStateCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.AhwBna(this.copydefault, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit AhwBna(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.AhwBna = luaFunction;
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        LuaFunction luaFunction = this.AhwBna;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(i));
        }
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(MLNKLineChart mLNKLineChart, List list) {
        pGV pgv;
        C36246oUr.copydefault().isConnected(list.size() < C33129mqd.AhwBna("300"));
        if (C33129mqd.KWHzl((Collection) list) && (pgv = mLNKLineChart.gEmmrt) != null) {
            Intrinsics.copydefault(list);
            pgv.KWHzl(list);
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Throwable th) {
        C36246oUr.copydefault().isConnected(false);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDataFormatter(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rrU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.AkhnZx(this.AEQbTJ, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit AkhnZx(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.djBIcL = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] release(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        SubHelper.AEQbTJ(this);
        C43669rte c43669rte = this.valueOf;
        if (c43669rte != null) {
            c43669rte.AhwBna();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.fARcdN;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AYXKKw;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        C36246oUr.copydefault().isConnected(false);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setChannelGenerator(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.gEmmrt(this.KWHzl, (LuaFunction) obj);
            }
        }, 1, null);
        return null;
    }

    public static final Unit gEmmrt(MLNKLineChart mLNKLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNKLineChart.copydefault = luaFunction;
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(MLNKLineChart mLNKLineChart, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        pGV pgv = mLNKLineChart.gEmmrt;
        if (pgv == null) {
            return null;
        }
        pgv.OLrzqt(list);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull UDArray uDArray, @NotNull final Function1<? super List<C35965oKg>, Unit> function1) {
        Intrinsics.checkNotNullParameter(uDArray, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(uDArray.EZpvd());
        final Function1 function12 = new Function1() { // from class: o.rsg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.OLrzqt((java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.rse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return MLNKLineChart.gEmmrt(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.rsi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.KWHzl((java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.rsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return MLNKLineChart.AYXKKw(function13, obj);
            }
        }).copydefault(yBP.KWHzl()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function14 = new Function1() { // from class: o.rsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.OLrzqt(function1, (java.util.List) obj);
            }
        };
        this.fARcdN = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.rsk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MLNKLineChart.valueOf(function14, obj);
            }
        });
    }

    public static final List gEmmrt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List AYXKKw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List KWHzl(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UDKLineCandleData) it.next()).getMData());
        }
        return arrayList;
    }

    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, List list) {
        Intrinsics.copydefault(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MLNKLineChart mLNKLineChart, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        pGV pgv = mLNKLineChart.gEmmrt;
        if (pgv == null) {
            return null;
        }
        pgv.KWHzl(list);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] getCurrentTime(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (this.gEmmrt != null) {
            return LuaValue.rNumber(r3.AEQbTJ());
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] refreshKlineData(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        pGV pgv = this.gEmmrt;
        if (pgv == null) {
            return null;
        }
        pgv.EZpvd();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] configTimeInterval(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        pFN pfn = pFN.OLrzqt;
        C43601rsP c43601rsP = C43601rsP.EZpvd;
        pfn.EZpvd(javaString, c43601rsP);
        c43601rsP.valueOf();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] initView(@NotNull LuaValue[] luaValueArr) {
        Object objAEQbTJ;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || (objAEQbTJ = C8017aul.AEQbTJ(luaValue, (Class<Object>) MLNKLineChartConfig.class)) == null) {
            return null;
        }
        C35969oKk mConfig = ((MLNKLineChartConfig) objAEQbTJ).getMConfig();
        pGV pgv = this.gEmmrt;
        if (pgv != null) {
            Context contextAubY = AubY();
            Intrinsics.copydefault(contextAubY, "");
            pgv.AEQbTJ((FragmentActivity) contextAubY, mConfig);
        }
        AYXKKw();
        luaValue.destroy();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] loadKLineHistoryData(@NotNull LuaValue[] luaValueArr) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            str = "";
        } else {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            str = javaString;
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 == null || !luaValue2.isString()) {
            str2 = "";
        } else {
            String javaString2 = luaValue2.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString2, "");
            C43603rsR.AEQbTJ.KWHzl(javaString2);
            str2 = javaString2;
        }
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        if (luaValue3 == null || !luaValue3.isString()) {
            str3 = "";
        } else {
            String javaString3 = luaValue3.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString3, "");
            str3 = javaString3;
        }
        pGV pgv = this.gEmmrt;
        if (pgv == null) {
            return null;
        }
        int iIntValue = Integer.valueOf(pgv.AEQbTJ()).intValue();
        C43603rsR c43603rsR = C43603rsR.AEQbTJ;
        TimeIntervalItem timeIntervalItemOLrzqt = c43603rsR.OLrzqt(iIntValue);
        if (timeIntervalItemOLrzqt == null) {
            return null;
        }
        C36246oUr.copydefault().isConnected(true);
        C43606rsU c43606rsU = C43606rsU.EZpvd;
        TokenCandleParam tokenCandleParam = new TokenCandleParam(str, str2, str3, null, c43603rsR.OLrzqt(timeIntervalItemOLrzqt), null, null, 104, null);
        Context contextAubY = AubY();
        Intrinsics.copydefault(contextAubY, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) c43606rsU.KWHzl(tokenCandleParam, (FragmentActivity) contextAubY));
        final Function1 function1 = new Function1() { // from class: o.rsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rsq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MLNKLineChart.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MLNKLineChart.djBIcL(function12, obj);
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] loadKLineData(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        WsArgV5ForWeb3 javaUserdata;
        Object objAEQbTJ;
        String javaString3 = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            javaString = "";
        } else {
            javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 == null || !luaValue2.isString()) {
            javaString2 = "";
        } else {
            javaString2 = luaValue2.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString2, "");
            C43603rsR.AEQbTJ.KWHzl(javaString2);
        }
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        if (luaValue3 == null || (objAEQbTJ = C8017aul.AEQbTJ(luaValue3, (Class<Object>) UDWsArgV5ForWeb3.class)) == null) {
            javaUserdata = null;
        } else {
            javaUserdata = ((UDWsArgV5ForWeb3) objAEQbTJ).getJavaUserdata();
            luaValue3.destroy();
        }
        if (this.valueOf == null) {
            this.valueOf = new C43669rte(javaString, javaString2, this.KWHzl);
        }
        KWHzl(0);
        pGV pgv = this.gEmmrt;
        if (pgv != null) {
            int iIntValue = Integer.valueOf(pgv.AEQbTJ()).intValue();
            C43603rsR c43603rsR = C43603rsR.AEQbTJ;
            TimeIntervalItem timeIntervalItemOLrzqt = c43603rsR.OLrzqt(iIntValue);
            if (timeIntervalItemOLrzqt != null) {
                String strOLrzqt = c43603rsR.OLrzqt(timeIntervalItemOLrzqt);
                LuaFunction luaFunction = this.copydefault;
                if (luaFunction != null) {
                    LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.rString(strOLrzqt));
                    LuaValue luaValue4 = luaValueArrInvoke != null ? (LuaValue) yDV.gEmmrt(luaValueArrInvoke, 0) : null;
                    if (luaValue4 != null && luaValue4.isString()) {
                        javaString3 = luaValue4.toJavaString();
                    }
                }
                C43669rte c43669rte = this.valueOf;
                if (c43669rte != null) {
                    c43669rte.EZpvd(c43603rsR.OLrzqt(timeIntervalItemOLrzqt), javaString3, javaUserdata);
                }
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] resetChartView(@NotNull LuaValue[] luaValueArr) {
        String str;
        String str2;
        String javaString;
        String str3;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        int i = 0;
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            str = "";
        } else {
            String javaString2 = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString2, "");
            str = javaString2;
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 == null || !luaValue2.isString()) {
            str2 = "";
        } else {
            String javaString3 = luaValue2.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString3, "");
            str2 = javaString3;
        }
        int i2 = 2;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        if (luaValue3 != null && luaValue3.isInt()) {
            i2 = luaValue3.toInt();
        }
        int i3 = i2;
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        if (luaValue4 != null && luaValue4.isInt()) {
            i = luaValue4.toInt();
        }
        int i4 = i;
        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
        if (luaValue5 == null || !luaValue5.isString()) {
            javaString = "TYPE_KLINE";
        } else {
            javaString = luaValue5.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
        }
        String str4 = javaString;
        LuaValue luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 5);
        if (luaValue6 == null || !luaValue6.isString()) {
            str3 = "";
        } else {
            String javaString4 = luaValue6.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString4, "");
            str3 = javaString4;
        }
        LuaValue luaValue7 = (LuaValue) yDV.gEmmrt(luaValueArr, 6);
        int i5 = (luaValue7 == null || !luaValue7.isInt()) ? 4 : luaValue7.toInt();
        pGV pgv = this.gEmmrt;
        if (pgv == null) {
            return null;
        }
        pgv.copydefault(str, str2, str4, i3, i5, i4, str3);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] updateKlineData(@NotNull LuaValue[] luaValueArr) {
        Object objAEQbTJ;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || (objAEQbTJ = C8017aul.AEQbTJ(luaValue, (Class<Object>) UDArray.class)) == null) {
            return null;
        }
        AEQbTJ((UDArray) objAEQbTJ, new Function1() { // from class: o.rsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.valueOf(this.copydefault, (java.util.List) obj);
            }
        });
        luaValue.destroy();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] addHistoryKline(@NotNull LuaValue[] luaValueArr) {
        Object objAEQbTJ;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || (objAEQbTJ = C8017aul.AEQbTJ(luaValue, (Class<Object>) UDArray.class)) == null) {
            return null;
        }
        AEQbTJ((UDArray) objAEQbTJ, new Function1() { // from class: o.rsr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNKLineChart.copydefault(this.EZpvd, (java.util.List) obj);
            }
        });
        luaValue.destroy();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setKLineChartMarginTop(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        int i = luaValue.toInt();
        pGV pgv = this.gEmmrt;
        if (pgv == null) {
            return null;
        }
        pgv.setMarginTop(i);
        return null;
    }
}
