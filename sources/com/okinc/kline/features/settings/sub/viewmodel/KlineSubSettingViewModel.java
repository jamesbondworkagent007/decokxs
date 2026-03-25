package com.okinc.kline.features.settings.sub.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.api.bean.EntryType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.sub.viewmodel.KlineSubSettingViewModel;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49411unz;
import o.C36246oUr;
import o.C43251rlk;
import o.C56392yDr;
import o.InterfaceC46557tYt;
import o.InterfaceC56387yDm;
import o.oTD;
import o.oTZ;
import o.pDT;
import o.pEM;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineSubSettingViewModel extends AbstractC49411unz<oTZ> {
    public SettingEntryPoint EZpvd;
    public final oTD KWHzl;
    public final ChartViewOutSideConfig OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartViewOutSideConfig AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingEntryPoint copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public KlineSubSettingViewModel(@NotNull oTD otd) {
        super(new oTZ(null, 1, null));
        Intrinsics.checkNotNullParameter(otd, "");
        this.KWHzl = otd;
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        Intrinsics.checkNotNullExpressionValue(chartViewOutSideConfigZLjUOn, "");
        this.OLrzqt = chartViewOutSideConfigZLjUOn;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineSubSettingViewModel.OLrzqt();
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.settings.sub.viewmodel.KlineSubSettingViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final InterfaceC46557tYt OLrzqt() {
        return (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
    }

    public final InterfaceC46557tYt EZpvd() {
        return (InterfaceC46557tYt) this.copydefault.getValue();
    }

    public final void AEQbTJ(SettingEntryPoint settingEntryPoint) {
        if (settingEntryPoint == null) {
            return;
        }
        this.EZpvd = settingEntryPoint;
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineSubSettingViewModel$loadSettingList$1(this, settingEntryPoint, null), 3, null), "loadSettingList");
    }

    public static /* synthetic */ void reloadSettingList$default(KlineSubSettingViewModel klineSubSettingViewModel, EntryType entryType, int i, Object obj) {
        if ((i & 1) != 0) {
            entryType = null;
        }
        klineSubSettingViewModel.OLrzqt(entryType);
    }

    public final void OLrzqt(EntryType entryType) {
        SettingEntryPoint settingEntryPointOLrzqt;
        if (entryType != null) {
            SettingEntryPoint settingEntryPoint = this.EZpvd;
            if (settingEntryPoint != null) {
                settingEntryPointOLrzqt = settingEntryPoint.OLrzqt((32766 & 1) != 0 ? settingEntryPoint.KWHzl : entryType, (32766 & 2) != 0 ? settingEntryPoint.AEQbTJ : null, (32766 & 4) != 0 ? settingEntryPoint.copydefault : null, (32766 & 8) != 0 ? settingEntryPoint.fetchVPNInfo : null, (32766 & 16) != 0 ? settingEntryPoint.values : false, (32766 & 32) != 0 ? settingEntryPoint.EZpvd : false, (32766 & 64) != 0 ? settingEntryPoint.djBIcL : false, (32766 & 128) != 0 ? settingEntryPoint.AYXKKw : false, (32766 & 256) != 0 ? settingEntryPoint.AhwBna : false, (32766 & 512) != 0 ? settingEntryPoint.OLrzqt : false, (32766 & 1024) != 0 ? settingEntryPoint.gEmmrt : false, (32766 & 2048) != 0 ? settingEntryPoint.isConnected : false, (32766 & 4096) != 0 ? settingEntryPoint.valueOf : false, (32766 & 8192) != 0 ? settingEntryPoint.AkhnZx : false, (32766 & 16384) != 0 ? settingEntryPoint.DbNXlk : false);
            } else {
                settingEntryPointOLrzqt = null;
            }
            this.EZpvd = settingEntryPointOLrzqt;
        }
        AEQbTJ(this.EZpvd);
    }

    public final void gEmmrt() {
        ChartViewOutSideConfig chartViewOutSideConfig = this.OLrzqt;
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        pDT pdtKWHzl = stateListAnimator.KWHzl();
        pEM pem = pEM.AEQbTJ;
        chartViewOutSideConfig.setMCandleRiseColor(pdtKWHzl.copydefault(pem.copydefault()));
        this.OLrzqt.setMCandleDownColor(stateListAnimator.KWHzl().copydefault(pem.KWHzl()));
        C36246oUr.copydefault().OLrzqt(true);
        reloadSettingList$default(this, null, 1, null);
    }
}
