package com.okinc.business.market.features.meme.aped_together.ui;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C25389ivm;
import o.C28586kda;
import o.C28655keq;
import o.InterfaceC28618keF;
import o.jAH;
import o.jAO;
import o.kKG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ApedTogetherViewModel extends AbstractC33073mpa {
    public final jAH AEQbTJ;
    public final jAO AYXKKw;
    public final Set<String> AhwBna;
    public final Map<String, TrackingAddressAlias> EZpvd;
    public final StateFlow<InterfaceC28618keF> KWHzl;
    public final C28655keq OLrzqt;
    public final MutableStateFlow<InterfaceC28618keF> copydefault;
    public final C28586kda djBIcL;
    public final kKG gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28618keF> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<InterfaceC28618keF> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public ApedTogetherViewModel(@NotNull C28655keq c28655keq, @NotNull kKG kkg, @NotNull C28586kda c28586kda, @NotNull jAO jao, @NotNull jAH jah) {
        Intrinsics.checkNotNullParameter(c28655keq, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(jao, "");
        Intrinsics.checkNotNullParameter(jah, "");
        this.OLrzqt = c28655keq;
        this.gEmmrt = kkg;
        this.djBIcL = c28586kda;
        this.AYXKKw = jao;
        this.AEQbTJ = jah;
        this.AhwBna = new LinkedHashSet();
        this.EZpvd = new LinkedHashMap();
        MutableStateFlow<InterfaceC28618keF> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28618keF.TaskDescription.EZpvd);
        this.copydefault = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault(str);
        AEQbTJ(str, str2);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ApedTogetherViewModel$loadAliases$1(this, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new ApedTogetherViewModel$loadApedData$1(this, str, str2, null), 3, null);
    }
}
