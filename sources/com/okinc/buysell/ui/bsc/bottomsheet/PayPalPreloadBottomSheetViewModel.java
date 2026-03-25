package com.okinc.buysell.ui.bsc.bottomsheet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.crcore.shared.net.responsebean.bsc.UserInfoBean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32989mnw;
import o.lyY;
import o.mHA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PayPalPreloadBottomSheetViewModel extends ViewModel {
    public final MutableLiveData<C32989mnw<UserInfoBean>> AEQbTJ;
    public final lyY EZpvd;
    public final MutableLiveData<C32989mnw<Boolean>> OLrzqt;
    public final MutableLiveData<C32989mnw<Boolean>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<UserInfoBean>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public PayPalPreloadBottomSheetViewModel(@NotNull lyY lyy) {
        Intrinsics.checkNotNullParameter(lyy, "");
        this.EZpvd = lyy;
        this.AEQbTJ = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
    }

    public final void KWHzl(boolean z) {
        mHA.OLrzqt.OLrzqt(this.OLrzqt, Boolean.valueOf(z));
    }

    public final void EZpvd(boolean z) {
        mHA.OLrzqt.OLrzqt(this.copydefault, Boolean.valueOf(z));
    }

    public final void EZpvd() {
        KWHzl(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PayPalPreloadBottomSheetViewModel$fetchUserInfo$1(this, null), 3, null);
    }
}
