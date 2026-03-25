package com.okinc.tradeuilib.borrowdata.simplemodeborrow;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.unify_trade.biz.LeverageReq;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C49483upR;
import o.C56111xwe;
import o.C56168xxi;
import o.C56175xxp;
import o.xBF;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BorrowedCoinAdjustLeverPresenter extends AbsPresenter {
    public static final Application Companion = new Application(null);
    public static final int EZpvd;
    public final C56111xwe<List<LeverIntervalData>> AEQbTJ;
    public final C56175xxp AYXKKw;
    public final C56111xwe<ArrayList<LeverageReq>> AhwBna;
    public final C56111xwe<List<AdjustLeverRequiredData>> KWHzl;
    public final TradeLiveData<C49483upR> OLrzqt;
    public final xBF copydefault;
    public final C56168xxi gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = C56111xwe.AEQbTJ;
        EZpvd = i | C56168xxi.OLrzqt | i | TradeLiveData.$stable | i | C56175xxp.copydefault | xBF.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBF AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ArrayList<LeverageReq>> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<LeverIntervalData>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C49483upR> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<AdjustLeverRequiredData>> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56175xxp djBIcL() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowedCoinAdjustLeverPresenter(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new xBF();
        this.AYXKKw = new C56175xxp();
        this.AEQbTJ = new C56111xwe<>();
        this.AhwBna = new C56111xwe<>();
        this.OLrzqt = new TradeLiveData<>(new C49483upR(null, null, null, 7, null));
        this.gEmmrt = new C56168xxi();
        this.KWHzl = new C56111xwe<>();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.borrowdata.simplemodeborrow.BorrowedCoinAdjustLeverPresenter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.copydefault(this.copydefault, this.AYXKKw);
    }

    public final void copydefault(String str) {
        xBF xbf = this.copydefault;
        xbf.AEQbTJ(this.AEQbTJ);
        xbf.KWHzl((String) null);
        xbf.AEQbTJ((String) null);
        xbf.EZpvd("MARGIN");
        xbf.OLrzqt("cross");
        xbf.copydefault(str);
        xKK.Activity.execute$default(xbf, 0L, 1, null);
        xbf.AhwBna();
    }

    public final void KWHzl(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        LeverageReq leverageReq = new LeverageReq("", str, str2, "cross", "");
        C56175xxp c56175xxp = this.AYXKKw;
        c56175xxp.AEQbTJ(this.AhwBna);
        c56175xxp.AEQbTJ(leverageReq);
        xKK.Activity.execute$default(c56175xxp, 0L, 1, null);
        c56175xxp.AhwBna();
    }

    public final void EZpvd(@NotNull String str, String str2, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (str.length() == 0) {
            function0.invoke();
            return;
        }
        C56168xxi c56168xxi = this.gEmmrt;
        c56168xxi.KWHzl("MARGIN");
        c56168xxi.copydefault("cross");
        c56168xxi.EZpvd(str2);
        c56168xxi.OLrzqt(str);
        c56168xxi.AEQbTJ(this.KWHzl);
        xKK.Activity.execute$default(c56168xxi, 0L, 1, null);
        c56168xxi.AhwBna();
    }

    public final void KWHzl(@NotNull Object obj) {
        String minLevel;
        String maxLevel;
        String percents;
        Intrinsics.checkNotNullParameter(obj, "");
        LeverIntervalData leverIntervalData = (LeverIntervalData) CollectionsKt___CollectionsKt.firstOrNull((ArrayList) obj);
        String maxLevel2 = leverIntervalData != null ? leverIntervalData.getMaxLevel() : null;
        C49483upR value = this.OLrzqt.getValue();
        if (C33129mqd.gEmmrt(maxLevel2, value != null ? value.OLrzqt() : null)) {
            TradeLiveData<C49483upR> tradeLiveData = this.OLrzqt;
            if (leverIntervalData == null || (minLevel = leverIntervalData.getMinLevel()) == null) {
                minLevel = "0.01";
            }
            if (leverIntervalData == null || (maxLevel = leverIntervalData.getMaxLevel()) == null) {
                maxLevel = "50";
            }
            if (leverIntervalData == null || (percents = leverIntervalData.getPercents()) == null) {
                percents = "1,2,3,5,10,20,30,50";
            }
            tradeLiveData.setValue(new C49483upR(minLevel, maxLevel, percents));
        }
    }

    public final boolean AEQbTJ(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return (C33129mqd.gEmmrt(str, str2) || C33129mqd.AEQbTJ(str, str3)) ? false : true;
    }
}
