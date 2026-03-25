package com.okinc.business.market.features.favorite_list_signal.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C25389ivm;
import o.C26109jSg;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FavoriteListSignalViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C26109jSg AEQbTJ;
    public final StateFlow<Long> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Long> EZpvd() {
        return this.KWHzl;
    }

    @yCM
    public FavoriteListSignalViewModel(@NotNull C26109jSg c26109jSg) {
        Intrinsics.checkNotNullParameter(c26109jSg, "");
        this.AEQbTJ = c26109jSg;
        this.KWHzl = c26109jSg.OLrzqt();
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new FavoriteListSignalViewModel$reset$1(this, null), 3, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.favorite_list_signal.ui.FavoriteListSignalViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
