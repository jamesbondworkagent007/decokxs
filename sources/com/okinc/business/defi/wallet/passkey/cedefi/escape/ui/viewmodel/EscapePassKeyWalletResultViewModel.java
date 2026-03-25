package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C17654fNi;
import o.yCM;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletResultViewModel extends ViewModel {
    public final List<Long> AEQbTJ;
    public final Map<Long, Boolean> KWHzl;
    public final Flow<Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<Long, Boolean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<Boolean> copydefault() {
        return this.copydefault;
    }

    @yCM
    public EscapePassKeyWalletResultViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C17654fNi c17654fNi) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c17654fNi, "");
        this.KWHzl = new LinkedHashMap();
        long[] jArr = (long[]) savedStateHandle.get("order_id_list");
        List<Long> listAhwBna = (jArr == null || (listAhwBna = yDV.OLrzqt(jArr)) == null) ? yDY.AhwBna() : listAhwBna;
        this.AEQbTJ = listAhwBna;
        Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            this.KWHzl.put(Long.valueOf(((Number) it.next()).longValue()), Boolean.FALSE);
        }
        this.copydefault = FlowKt.transformLatest(c17654fNi.OLrzqt(), new EscapePassKeyWalletResultViewModel$special$$inlined$flatMapLatest$1(null, this));
    }
}
