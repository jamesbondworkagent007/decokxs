package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetSelectionActivityViewModel extends AbstractC33073mpa {
    public final LiveData<String> OLrzqt;
    public final MutableLiveData<String> copydefault;
    public MutableLiveData<PresetUserParams> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<String> EZpvd = new MutableLiveData<>();
    public final MutableLiveData<String> AEQbTJ = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public PresetSelectionActivityViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.OLrzqt = mutableLiveData;
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setValue(str);
    }
}
