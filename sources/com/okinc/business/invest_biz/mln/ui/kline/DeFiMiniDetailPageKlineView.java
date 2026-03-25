package com.okinc.business.invest_biz.mln.ui.kline;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailPageKlineView;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsChartType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33041mov;
import o.C23940iOz;
import o.C26541jeK;
import o.C27393juO;
import o.C56392yDr;
import o.C58113yvE;
import o.C7322ahe;
import o.InterfaceC23937iOw;
import o.InterfaceC23938iOx;
import o.InterfaceC27387juI;
import o.InterfaceC56387yDm;
import o.InterfaceC60037zuM;
import o.InterfaceC60044zuT;
import o.iEM;
import o.iOA;
import o.iOB;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC60044zuT
public final class DeFiMiniDetailPageKlineView extends UDView<View> implements InterfaceC27387juI {
    public iOB AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public InvestmentKind AhwBna;
    public LuaFunction AkhnZx;
    public Integer DbNXlk;
    public LuaFunction KWHzl;
    public Long OLrzqt;
    public C26541jeK djBIcL;
    public long gEmmrt;
    public iEM isConnected;
    public C27393juO valueOf;
    public LuaFunction values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final String[] EZpvd = {"initChart", "initCallback", "refreshChart", "setChartDataCompletedCallback"};

    @InterfaceC60044zuT
    public DeFiMiniDetailPageKlineView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AhwBna = InvestmentKind.Default;
        this.OLrzqt = 0L;
        this.DbNXlk = -1;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.iOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DeFiMiniDetailPageKlineView.AhwBna(this.AEQbTJ);
            }
        });
    }

    public final C23940iOz valueOf() {
        return (C23940iOz) this.AYXKKw.getValue();
    }

    public static final C23940iOz AhwBna(DeFiMiniDetailPageKlineView deFiMiniDetailPageKlineView) {
        return deFiMiniDetailPageKlineView.gEmmrt();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailPageKlineView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] copydefault() {
            return DeFiMiniDetailPageKlineView.EZpvd;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    @InterfaceC60044zuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] initChart(LuaValue[] luaValueArr) {
        long j;
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = luaValue3 != null ? luaValue3.toLong() : 0L;
            } catch (Exception e) {
                pUU.copydefault("initChart error: " + e.getMessage());
                return null;
            }
        }
        this.gEmmrt = j;
        this.OLrzqt = (luaValueArr == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null) ? 1L : Long.valueOf(luaValue2.toLong());
        this.DbNXlk = (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null) ? -1 : Integer.valueOf(luaValue.toInt());
        AhwBna();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    @InterfaceC60044zuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] initCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction;
        LuaFunction luaFunction2;
        LuaValue luaValue;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue2 == null || (luaFunction = luaValue2.toLuaFunction()) == null) {
                    luaFunction = null;
                }
            } catch (Exception e) {
                pUU.copydefault("initCallback error: " + e.getMessage());
                return null;
            }
        }
        this.AkhnZx = luaFunction;
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null || (luaFunction2 = luaValue.toLuaFunction()) == null) {
            luaFunction2 = null;
        }
        this.values = luaFunction2;
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] refreshChart(LuaValue[] luaValueArr) {
        iOB iob = this.AEQbTJ;
        if (iob == null) {
            return null;
        }
        iob.KWHzl();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    @InterfaceC60044zuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue[] setChartDataCompletedCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue == null || (luaFunction = luaValue.toLuaFunction()) == null) {
                    luaFunction = null;
                }
            } catch (Exception e) {
                pUU.copydefault("requestCompleted: " + e.getMessage());
                return null;
            }
        }
        this.KWHzl = luaFunction;
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public FrameLayout AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C27393juO c27393juO = new C27393juO(contextAubY, null, 0, 6, null);
        this.valueOf = c27393juO;
        return c27393juO;
    }

    public final void AhwBna() {
        LifecycleCoroutineScope lifecycleScope;
        if (this.isConnected == null || this.djBIcL == null) {
            DbNXlk();
        }
        TaskDescription taskDescription = new TaskDescription();
        iEM iem = this.isConnected;
        if (iem == null) {
            Intrinsics.gEmmrt("");
            iem = null;
        }
        C26541jeK c26541jeK = this.djBIcL;
        if (c26541jeK == null) {
            Intrinsics.gEmmrt("");
            c26541jeK = null;
        }
        iOB iob = new iOB(new iOA(iem, c26541jeK));
        this.AEQbTJ = iob;
        iob.copydefault(taskDescription);
        C27393juO c27393juO = this.valueOf;
        if (c27393juO == null) {
            Intrinsics.gEmmrt("");
            c27393juO = null;
        }
        c27393juO.copydefault(this, taskDescription.copydefault());
        AbstractActivityC33041mov abstractActivityC33041movAYXKKw = AYXKKw();
        if (abstractActivityC33041movAYXKKw == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041movAYXKKw)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new DeFiMiniDetailPageKlineView$initializeChart$1(this, null), 3, null);
    }

    public final C23940iOz gEmmrt() {
        return ((InterfaceC23937iOw) C58113yvE.copydefault(AubY(), InterfaceC23937iOw.class)).copydefault();
    }

    public final void DbNXlk() {
        try {
            this.isConnected = valueOf().KWHzl();
            this.djBIcL = valueOf().copydefault();
        } catch (Exception unused) {
        }
    }

    @Override // o.InterfaceC27387juI
    public void copydefault(@NotNull ChartInterval chartInterval) {
        Intrinsics.checkNotNullParameter(chartInterval, "");
        iOB iob = this.AEQbTJ;
        if (iob == null || iob == null) {
            return;
        }
        iob.EZpvd(chartInterval);
    }

    @Override // o.InterfaceC27387juI
    public void AEQbTJ(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LuaFunction luaFunction = this.AkhnZx;
        if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaString.copydefault(str2), LuaString.copydefault(str), LuaBoolean.AEQbTJ(z), LuaBoolean.AEQbTJ(z2)});
        }
    }

    @Override // o.InterfaceC27387juI
    public void KWHzl(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LuaFunction luaFunction = this.values;
        if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaString.copydefault(str2), LuaString.copydefault(str), LuaBoolean.AEQbTJ(z)});
        }
    }

    public final AbstractActivityC33041mov AYXKKw() {
        Globals globals = this.globals;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) context;
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        iOB iob = this.AEQbTJ;
        if (iob != null) {
            iob.copydefault();
        }
        super.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes15.dex */
    public final class TaskDescription implements InterfaceC23938iOx {
        public final ProductDetailsChartType AEQbTJ = ProductDetailsChartType.Rate;
        public final long EZpvd;
        public final InvestmentKind OLrzqt;
        public final Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC23938iOx
        public InvestmentKind EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC23938iOx
        public long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ProductDetailsChartType copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            this.EZpvd = DeFiMiniDetailPageKlineView.this.gEmmrt;
            this.OLrzqt = DeFiMiniDetailPageKlineView.this.AhwBna;
            this.copydefault = DeFiMiniDetailPageKlineView.this.OLrzqt;
        }

        @Override // o.InterfaceC23938iOx
        public ChartInterval KWHzl() {
            return ChartInterval.Week;
        }
    }
}
