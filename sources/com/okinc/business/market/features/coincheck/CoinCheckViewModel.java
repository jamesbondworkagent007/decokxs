package com.okinc.business.market.features.coincheck;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C25389ivm;
import o.jNF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CoinCheckViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableLiveData<jNF> OLrzqt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<jNF> AEQbTJ() {
        return this.OLrzqt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.coincheck.CoinCheckViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public CoinCheckViewModel() {
    }

    public static /* synthetic */ void loadCoinCheckData$default(CoinCheckViewModel coinCheckViewModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        coinCheckViewModel.EZpvd(str, str2, z);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CoinCheckViewModel$loadCoinCheckData$1(this, z, str, str2, null), 3, null);
    }

    public final void OLrzqt() {
        this.OLrzqt.setValue(new jNF(false, null, true, 3, null));
    }
}
