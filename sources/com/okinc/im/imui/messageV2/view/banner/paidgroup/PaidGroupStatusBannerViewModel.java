package com.okinc.im.imui.messageV2.view.banner.paidgroup;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.messageV2.view.banner.paidgroup.PaidGroupStatusBannerViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import o.C34165nTv;
import o.C37721ozF;
import o.oDG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PaidGroupStatusBannerViewModel extends ViewModel {
    public final C34165nTv AEQbTJ;
    public IMPageType AhwBna;
    public final LiveData<GroupInfo> EZpvd;
    public final MutableLiveData<String> KWHzl;
    public final MutableSharedFlow<C34165nTv.Activity> OLrzqt;
    public final SharedFlow<C34165nTv.Activity> copydefault;
    public final oDG gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<GroupInfo> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C34165nTv.Activity> copydefault() {
        return this.copydefault;
    }

    @yCM
    public PaidGroupStatusBannerViewModel(@NotNull oDG odg, @NotNull C34165nTv c34165nTv) {
        Intrinsics.checkNotNullParameter(odg, "");
        Intrinsics.checkNotNullParameter(c34165nTv, "");
        this.gEmmrt = odg;
        this.AEQbTJ = c34165nTv;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        MutableSharedFlow<C34165nTv.Activity> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.OLrzqt = mutableSharedFlowAEQbTJ;
        this.copydefault = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        this.EZpvd = Transformations.distinctUntilChanged(Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.ohR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PaidGroupStatusBannerViewModel.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final LiveData AEQbTJ(PaidGroupStatusBannerViewModel paidGroupStatusBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(paidGroupStatusBannerViewModel.gEmmrt.AEQbTJ(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void AEQbTJ(String str, IMPageType iMPageType) {
        this.AhwBna = iMPageType;
        this.KWHzl.setValue(str);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaidGroupStatusBannerViewModel$createPayment$1(this, null), 3, null);
    }
}
