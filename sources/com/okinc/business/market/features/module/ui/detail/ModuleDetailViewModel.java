package com.okinc.business.market.features.module.ui.detail;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C28896kjS;
import o.InterfaceC28933kkC;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleDetailViewModel extends ViewModel {
    public final MutableStateFlow<InterfaceC28933kkC> AEQbTJ;
    public final StateFlow<InterfaceC28933kkC> EZpvd;
    public final C28896kjS KWHzl;
    public final MutableStateFlow<String> OLrzqt;
    public final StateFlow<String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28933kkC> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28896kjS valueOf() {
        return this.KWHzl;
    }

    @yCM
    public ModuleDetailViewModel(@NotNull C28896kjS c28896kjS) {
        Intrinsics.checkNotNullParameter(c28896kjS, "");
        this.KWHzl = c28896kjS;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("all");
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterfaceC28933kkC> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC28933kkC.ActionBar.EZpvd);
        this.AEQbTJ = MutableStateFlow2;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final String OLrzqt() {
        ModuleInfo moduleInfoEZpvd;
        InterfaceC28933kkC value = this.AEQbTJ.getValue();
        String strValueOf = null;
        InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
        if (taskDescription != null && (moduleInfoEZpvd = taskDescription.EZpvd()) != null) {
            strValueOf = moduleInfoEZpvd.valueOf();
        }
        return strValueOf == null ? "" : strValueOf;
    }

    public final String EZpvd() {
        ModuleInfo moduleInfoEZpvd;
        InterfaceC28933kkC value = this.AEQbTJ.getValue();
        String strOLrzqt = null;
        InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
        if (taskDescription != null && (moduleInfoEZpvd = taskDescription.EZpvd()) != null) {
            strOLrzqt = moduleInfoEZpvd.OLrzqt();
        }
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final String AEQbTJ() {
        ModuleInfo moduleInfoEZpvd;
        InterfaceC28933kkC value = this.AEQbTJ.getValue();
        String strDjBIcL = null;
        InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
        if (taskDescription != null && (moduleInfoEZpvd = taskDescription.EZpvd()) != null) {
            strDjBIcL = moduleInfoEZpvd.djBIcL();
        }
        return strDjBIcL == null ? "" : strDjBIcL;
    }

    public final String copydefault() {
        ModuleInfo moduleInfoEZpvd;
        InterfaceC28933kkC value = this.AEQbTJ.getValue();
        String strGEmmrt = null;
        InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
        if (taskDescription != null && (moduleInfoEZpvd = taskDescription.EZpvd()) != null) {
            strGEmmrt = moduleInfoEZpvd.gEmmrt();
        }
        return strGEmmrt == null ? "" : strGEmmrt;
    }

    public final void AEQbTJ(@NotNull ModuleInfo moduleInfo) {
        Intrinsics.checkNotNullParameter(moduleInfo, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) moduleInfo.OLrzqt())) {
            AEQbTJ(moduleInfo.valueOf(), moduleInfo.djBIcL(), moduleInfo.gEmmrt());
        } else {
            this.AEQbTJ.setValue(new InterfaceC28933kkC.TaskDescription(moduleInfo));
        }
    }

    public final void AEQbTJ(String str, String str2, String str3) {
        this.AEQbTJ.setValue(InterfaceC28933kkC.ActionBar.EZpvd);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ModuleDetailViewModel$setModuleInfoFromDeeplink$1(this, str2, str3, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setValue(str);
    }

    public final ModuleInfo EZpvd(ModuleInfo moduleInfo, String str, String str2) {
        String strDjBIcL = moduleInfo.djBIcL();
        String str3 = StringsKt__StringsKt.fARcdN((CharSequence) strDjBIcL) ? str : strDjBIcL;
        String strGEmmrt = moduleInfo.gEmmrt();
        return moduleInfo.OLrzqt((32755 & 1) != 0 ? moduleInfo.djBIcL : null, (32755 & 2) != 0 ? moduleInfo.OLrzqt : null, (32755 & 4) != 0 ? moduleInfo.gEmmrt : str3, (32755 & 8) != 0 ? moduleInfo.AYXKKw : StringsKt__StringsKt.fARcdN((CharSequence) strGEmmrt) ? str2 : strGEmmrt, (32755 & 16) != 0 ? moduleInfo.EZpvd : null, (32755 & 32) != 0 ? moduleInfo.valueOf : false, (32755 & 64) != 0 ? moduleInfo.AEQbTJ : null, (32755 & 128) != 0 ? moduleInfo.copydefault : null, (32755 & 256) != 0 ? moduleInfo.KWHzl : null, (32755 & 512) != 0 ? moduleInfo.values : null, (32755 & 1024) != 0 ? moduleInfo.AhwBna : false, (32755 & 2048) != 0 ? moduleInfo.isConnected : null, (32755 & 4096) != 0 ? moduleInfo.fetchVPNInfo : null, (32755 & 8192) != 0 ? moduleInfo.DbNXlk : null, (32755 & 16384) != 0 ? moduleInfo.AkhnZx : null);
    }
}
