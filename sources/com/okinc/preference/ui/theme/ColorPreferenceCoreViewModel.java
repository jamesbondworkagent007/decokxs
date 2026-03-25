package com.okinc.preference.ui.theme;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C46590tZz;
import o.C4661Bmi;
import o.C4663Bmk;
import o.C56442yFn;
import o.InterfaceC4660Bmh;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ColorPreferenceCoreViewModel extends ViewModel {
    public final C46590tZz AEQbTJ;
    public final C4663Bmk EZpvd;
    public final MutableLiveData<C4661Bmi> OLrzqt;
    public final LiveData<C4661Bmi> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C4661Bmi> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public ColorPreferenceCoreViewModel(@NotNull C46590tZz c46590tZz, @NotNull C4663Bmk c4663Bmk) {
        Intrinsics.checkNotNullParameter(c46590tZz, "");
        Intrinsics.checkNotNullParameter(c4663Bmk, "");
        this.AEQbTJ = c46590tZz;
        this.EZpvd = c4663Bmk;
        MutableLiveData<C4661Bmi> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.copydefault = mutableLiveData;
    }

    public static final class StateListAnimator implements InterfaceC4660Bmh {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC4660Bmh
        public void EZpvd(C4661Bmi c4661Bmi) {
            Intrinsics.checkNotNullParameter(c4661Bmi, "");
            ColorPreferenceCoreViewModel.this.OLrzqt.setValue(c4661Bmi);
        }
    }

    public final void copydefault() {
        this.EZpvd.AEQbTJ(new StateListAnimator());
    }

    public final Object AEQbTJ(boolean z, boolean z2, @NotNull Continuation<? super Unit> continuation) {
        if (!z) {
            this.AEQbTJ.KWHzl(!z2 ? 1 : 0);
        } else if (z2) {
            this.AEQbTJ.AEQbTJ();
        } else {
            this.AEQbTJ.EZpvd();
        }
        Object objEZpvd = this.EZpvd.EZpvd(z2, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public final Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation) {
        this.AEQbTJ.copydefault(!z ? 1 : 0);
        Object objAEQbTJ = this.EZpvd.AEQbTJ(z, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }
}
