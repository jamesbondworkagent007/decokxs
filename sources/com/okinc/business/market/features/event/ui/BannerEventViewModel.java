package com.okinc.business.market.features.event.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.jRP;
import o.jRQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class BannerEventViewModel extends ViewModel {
    public final LiveData<List<jRP>> EZpvd;
    public final MutableLiveData<List<jRP>> KWHzl;
    public final jRQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<jRP>> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public BannerEventViewModel(@NotNull jRQ jrq) {
        Intrinsics.checkNotNullParameter(jrq, "");
        this.copydefault = jrq;
        MutableLiveData<List<jRP>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.EZpvd = mutableLiveData;
    }
}
