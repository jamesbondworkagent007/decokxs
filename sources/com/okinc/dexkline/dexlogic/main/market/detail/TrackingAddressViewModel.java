package com.okinc.dexkline.dexlogic.main.market.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.market.features.address_tracker.domain.TrackingAddressAlias;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o.C34377nat;
import o.C34587ner;
import o.mUR;
import o.mVN;
import o.mVO;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TrackingAddressViewModel extends ViewModel {
    public final MutableLiveData<Long> AEQbTJ;
    public final C34377nat AYXKKw;
    public final C34587ner AhwBna;
    public final LiveData<Long> EZpvd;
    public final mVO KWHzl;
    public final mVN OLrzqt;
    public final Map<String, TrackingAddressAlias> copydefault;
    public final TrackingAddressParams gEmmrt;
    public final Set<String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Long> AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public TrackingAddressViewModel(@NotNull C34377nat c34377nat, @NotNull mVN mvn, @NotNull mVO mvo, @NotNull C34587ner c34587ner, @NotNull SavedStateHandle savedStateHandle) {
        TrackingAddressParams trackingAddressParams;
        Intrinsics.checkNotNullParameter(c34377nat, "");
        Intrinsics.checkNotNullParameter(mvn, "");
        Intrinsics.checkNotNullParameter(mvo, "");
        Intrinsics.checkNotNullParameter(c34587ner, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = c34377nat;
        this.OLrzqt = mvn;
        this.KWHzl = mvo;
        this.AhwBna = c34587ner;
        this.valueOf = new LinkedHashSet();
        this.copydefault = new LinkedHashMap();
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(null);
        this.AEQbTJ = mutableLiveData;
        this.EZpvd = mutableLiveData;
        TokenBase tokenBase = (TokenBase) savedStateHandle.get("token_base");
        if (tokenBase != null) {
            trackingAddressParams = new TrackingAddressParams(tokenBase.getChainId(), tokenBase.getTokenContractAddress(), tokenBase.getTokenSymbol());
        } else {
            trackingAddressParams = new TrackingAddressParams(null, null, null, 7, null);
        }
        this.gEmmrt = trackingAddressParams;
        AEQbTJ(false);
    }

    public static /* synthetic */ void reload$default(TrackingAddressViewModel trackingAddressViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        trackingAddressViewModel.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackingAddressViewModel$reload$1(this, z, null), 3, null);
    }

    public final boolean KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.valueOf.contains(str);
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackingAddressAlias trackingAddressAlias = this.copydefault.get(str);
        if (trackingAddressAlias != null) {
            return trackingAddressAlias.getAddressAlias();
        }
        return null;
    }
}
