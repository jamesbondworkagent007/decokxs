package com.okinc.business.market.features.meme.protocol_filter.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C56403yEb;
import o.InterfaceC28823khz;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeProtocolFilterViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<List<InterfaceC28823khz.ActionBar>> AEQbTJ;
    public final StateFlow<List<InterfaceC28823khz.ActionBar>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<InterfaceC28823khz.ActionBar>> OLrzqt() {
        return this.KWHzl;
    }

    @yCM
    public MemeProtocolFilterViewModel() {
        MutableStateFlow<List<InterfaceC28823khz.ActionBar>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(@NotNull List<InterfaceC28823khz.ActionBar> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.setValue(list);
    }

    public final boolean AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<List<InterfaceC28823khz.ActionBar>> mutableStateFlow = this.AEQbTJ;
        List<InterfaceC28823khz.ActionBar> value = this.KWHzl.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        boolean zEZpvd = true;
        for (InterfaceC28823khz.ActionBar actionBarCopy$default : value) {
            if (Intrinsics.EZpvd((Object) actionBarCopy$default.OLrzqt(), (Object) str)) {
                zEZpvd = actionBarCopy$default.EZpvd();
                actionBarCopy$default = InterfaceC28823khz.ActionBar.copy$default(actionBarCopy$default, null, null, null, !actionBarCopy$default.EZpvd(), 7, null);
            }
            arrayList.add(actionBarCopy$default);
        }
        mutableStateFlow.setValue(arrayList);
        return !zEZpvd;
    }

    public final void AEQbTJ() {
        MutableStateFlow<List<InterfaceC28823khz.ActionBar>> mutableStateFlow = this.AEQbTJ;
        List<InterfaceC28823khz.ActionBar> value = this.KWHzl.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(InterfaceC28823khz.ActionBar.copy$default((InterfaceC28823khz.ActionBar) it.next(), null, null, null, true, 7, null));
        }
        mutableStateFlow.setValue(arrayList);
    }

    public final void copydefault() {
        MutableStateFlow<List<InterfaceC28823khz.ActionBar>> mutableStateFlow = this.AEQbTJ;
        List<InterfaceC28823khz.ActionBar> value = this.KWHzl.getValue();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(InterfaceC28823khz.ActionBar.copy$default((InterfaceC28823khz.ActionBar) it.next(), null, null, null, false, 7, null));
        }
        mutableStateFlow.setValue(arrayList);
    }
}
