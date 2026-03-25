package com.okinc.business.dexui.main.dappredirect;

import androidx.lifecycle.ViewModel;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C21686hIo;
import o.C22380heK;
import o.hHS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexDappRedirectViewModel extends ViewModel {
    public final StateFlow<hHS> EZpvd;
    public final MutableStateFlow<hHS> OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<hHS> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public DexDappRedirectViewModel() {
        MutableStateFlow<hHS> MutableStateFlow = StateFlowKt.MutableStateFlow(hHS.Application.EZpvd);
        this.OLrzqt = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void EZpvd(@NotNull hHS hhs) {
        Intrinsics.checkNotNullParameter(hhs, "");
        this.OLrzqt.setValue(hhs);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.OLrzqt.setValue(hHS.Application.EZpvd);
        C21686hIo.AEQbTJ(C22380heK.OLrzqt.copydefault(str).fetchVPNInfo().KWHzl(str2, str3, str4, str5), z, (Function1<? super hHS, Unit>) new Function1() { // from class: o.hIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexDappRedirectViewModel.EZpvd(this.AEQbTJ, (hHS) obj);
            }
        });
    }

    public static final Unit EZpvd(DexDappRedirectViewModel dexDappRedirectViewModel, hHS hhs) {
        Intrinsics.checkNotNullParameter(hhs, "");
        dexDappRedirectViewModel.OLrzqt.setValue(hhs);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.OLrzqt.setValue(hHS.Application.EZpvd);
        C21686hIo.AEQbTJ(C22380heK.OLrzqt.copydefault(str).OLrzqt().EZpvd(str2, str3, str4, str5), true, (Function1<? super hHS, Unit>) new Function1() { // from class: o.hIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexDappRedirectViewModel.copydefault(this.OLrzqt, (hHS) obj);
            }
        });
    }

    public static final Unit copydefault(DexDappRedirectViewModel dexDappRedirectViewModel, hHS hhs) {
        Intrinsics.checkNotNullParameter(hhs, "");
        dexDappRedirectViewModel.OLrzqt.setValue(hhs);
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.dappredirect.DexDappRedirectViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
