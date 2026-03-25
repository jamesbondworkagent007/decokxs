package com.okinc.preference.ui.apperance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import o.BnD;
import o.BnG;
import o.C4695Bnp;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.settings.DayNightMode;

/* JADX INFO: loaded from: classes10.dex */
public final class DayNightSettingViewModel extends ViewModel {
    public final MutableLiveData<DayNightMode> KWHzl;
    public final C4695Bnp OLrzqt;
    public final LiveData<DayNightMode> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<DayNightMode> copydefault() {
        return this.copydefault;
    }

    @yCM
    public DayNightSettingViewModel(@NotNull C4695Bnp c4695Bnp) {
        Intrinsics.checkNotNullParameter(c4695Bnp, "");
        this.OLrzqt = c4695Bnp;
        MutableLiveData<DayNightMode> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.copydefault = mutableLiveData;
    }

    public static final class Activity implements BnG {
        public Activity() {
        }

        @Override // o.BnG
        public void AEQbTJ(BnD bnD) {
            Intrinsics.checkNotNullParameter(bnD, "");
            DayNightSettingViewModel.this.KWHzl.setValue(bnD.copydefault());
        }
    }

    public final void EZpvd() {
        this.OLrzqt.EZpvd(new Activity());
    }

    public final void OLrzqt() {
        this.OLrzqt.KWHzl();
    }

    public final void KWHzl() {
        this.OLrzqt.AEQbTJ();
    }

    public final void AEQbTJ() {
        this.OLrzqt.OLrzqt();
    }
}
