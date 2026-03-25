package com.okinc.okex.common.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.SupportBannerBean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.C32989mnw;
import o.C45348soB;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OKSupportBaseViewModel extends AbstractC33073mpa {
    public final C45348soB KWHzl;
    public final MutableLiveData<C32989mnw<SupportBannerBean>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<SupportBannerBean>> EZpvd() {
        return this.copydefault;
    }

    @yCM
    public OKSupportBaseViewModel(@NotNull C45348soB c45348soB) {
        Intrinsics.checkNotNullParameter(c45348soB, "");
        this.KWHzl = c45348soB;
        this.copydefault = new MutableLiveData<>();
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKSupportBaseViewModel$checkSupportBanner$1(this, null), 3, null);
    }
}
