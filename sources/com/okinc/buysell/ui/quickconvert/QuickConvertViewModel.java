package com.okinc.buysell.ui.quickconvert;

import com.okinc.buysell.api.QuickConvertTokenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31943mJr;
import o.C33129mqd;
import o.C3634Ape;
import o.C3652Apw;
import o.C3809Asu;
import o.C3922AvC;
import o.C56403yEb;
import o.InterfaceC3650Apu;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class QuickConvertViewModel extends C31943mJr {
    public final StateListAnimator AEQbTJ;
    public List<QuickConvertTokenInfo> EZpvd;
    public final C3634Ape KWHzl;
    public String OLrzqt;
    public final MutableStateFlow<C3652Apw> copydefault;
    public final StateFlow<C3652Apw> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QuickConvertTokenInfo> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull List<QuickConvertTokenInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C3652Apw> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public QuickConvertViewModel(@NotNull C3634Ape c3634Ape) {
        Intrinsics.checkNotNullParameter(c3634Ape, "");
        this.KWHzl = c3634Ape;
        MutableStateFlow<C3652Apw> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.djBIcL = MutableStateFlow;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.AEQbTJ = stateListAnimator;
        this.EZpvd = yDY.AhwBna();
        this.OLrzqt = "";
        c3634Ape.copydefault(stateListAnimator);
    }

    public static final class StateListAnimator implements InterfaceC3650Apu {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC3650Apu
        public void OLrzqt(C3652Apw c3652Apw) {
            Intrinsics.checkNotNullParameter(c3652Apw, "");
            QuickConvertViewModel.this.copydefault.setValue(c3652Apw);
        }
    }

    public final void EZpvd() {
        this.KWHzl.AEQbTJ();
    }

    public final void AEQbTJ() {
        this.KWHzl.EZpvd();
    }

    public final void KWHzl(boolean z, boolean z2) {
        this.KWHzl.EZpvd(z, z2);
    }

    public final C3809Asu copydefault(QuickConvertTokenInfo quickConvertTokenInfo) {
        return new C3809Asu(quickConvertTokenInfo.getBaseCurrency(), C33129mqd.AEQbTJ(quickConvertTokenInfo.getBaseAmount()), quickConvertTokenInfo.getQuoteCurrency(), C33129mqd.AEQbTJ(quickConvertTokenInfo.getQuoteAmount()));
    }

    public final void EZpvd(boolean z, boolean z2) {
        List<QuickConvertTokenInfo> list = this.EZpvd;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((QuickConvertTokenInfo) it.next()));
        }
        this.KWHzl.copydefault(z, new C3922AvC(arrayList), z2);
    }
}
