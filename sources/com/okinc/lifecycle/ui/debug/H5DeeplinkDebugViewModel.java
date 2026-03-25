package com.okinc.lifecycle.ui.debug;

import android.content.Context;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.core.util.SPUtils;
import com.okinc.web.WebActivity;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC38177pPb;
import o.C38092pLy;
import o.C56390yDp;
import o.InterfaceC38091pLx;
import o.InterfaceC38106pMl;
import o.InterfaceC38117pMw;
import o.InterfaceC43294rma;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class H5DeeplinkDebugViewModel extends ViewModel {
    public final InterfaceC43294rma AEQbTJ;
    public final InterfaceC38106pMl AYXKKw;
    public final InterfaceC38117pMw AhwBna;
    public final MutableStateFlow<List<C38092pLy>> EZpvd;
    public final MutableStateFlow<AbstractC38177pPb> KWHzl;
    public final StateFlow<AbstractC38177pPb> OLrzqt;
    public final StateFlow<List<C38092pLy>> copydefault;
    public final InterfaceC38091pLx gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC38177pPb> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C38092pLy>> EZpvd() {
        return this.copydefault;
    }

    @yCM
    public H5DeeplinkDebugViewModel(@NotNull InterfaceC38106pMl interfaceC38106pMl, @NotNull InterfaceC38117pMw interfaceC38117pMw, @NotNull InterfaceC38091pLx interfaceC38091pLx, @NotNull InterfaceC43294rma interfaceC43294rma) {
        Intrinsics.checkNotNullParameter(interfaceC38106pMl, "");
        Intrinsics.checkNotNullParameter(interfaceC38117pMw, "");
        Intrinsics.checkNotNullParameter(interfaceC38091pLx, "");
        Intrinsics.checkNotNullParameter(interfaceC43294rma, "");
        this.AYXKKw = interfaceC38106pMl;
        this.AhwBna = interfaceC38117pMw;
        this.gEmmrt = interfaceC38091pLx;
        this.AEQbTJ = interfaceC43294rma;
        MutableStateFlow<List<C38092pLy>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC38177pPb> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new H5DeeplinkDebugViewModel$getH5DeeplinkMappings$1(this, null), 3, null);
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("ish5processorenabledlocal", false);
    }

    public static /* synthetic */ void processUrl$default(H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "https://www.okx.com/markets/prices";
        }
        h5DeeplinkDebugViewModel.copydefault(str);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!KWHzl()) {
            this.KWHzl.setValue(new AbstractC38177pPb.Application(str));
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new H5DeeplinkDebugViewModel$processUrl$1(this, new URI(str), str, null), 3, null);
        }
    }

    public static /* synthetic */ void startWebView$default(H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "https://www.okx.com/markets/prices";
        }
        h5DeeplinkDebugViewModel.KWHzl(context, str);
    }

    public final void KWHzl(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
    }

    public final void KWHzl(@NotNull Context context, @NotNull AbstractC38177pPb.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new H5DeeplinkDebugViewModel$navigate$1(this, context, actionBar, null), 3, null);
    }
}
