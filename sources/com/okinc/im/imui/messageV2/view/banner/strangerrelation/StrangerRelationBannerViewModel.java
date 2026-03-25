package com.okinc.im.imui.messageV2.view.banner.strangerrelation;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C32989mnw;
import o.C35758oCp;
import o.C35859oGi;
import o.C35863oGm;
import o.C36557odH;
import o.oCI;
import o.oDZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class StrangerRelationBannerViewModel extends ViewModel {
    public boolean AYXKKw;
    public final LiveData<Boolean> AhwBna;
    public final C35758oCp AkhnZx;
    public final C35863oGm DbNXlk;
    public final LiveData<OKConversation> EZpvd;
    public final MutableLiveData<C32989mnw<RelationInfo>> KWHzl;
    public final MutableLiveData<C32989mnw<RelationInfo>> OLrzqt;
    public final MutableLiveData<String> copydefault;
    public final oDZ djBIcL;
    public IMPageType ejfBZ;
    public final LiveData<RelationInfo> fARcdN;
    public final MutableLiveData<C36557odH> fJNWhG;
    public final LiveData<C32989mnw<RelationInfo>> fetchVPNInfo;
    public final C35859oGi gEmmrt;
    public final oCI isConnected;
    public Job valueOf;
    public final LiveData<C32989mnw<RelationInfo>> values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public static final boolean KWHzl(C36557odH c36557odH) {
        return c36557odH != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<OKConversation> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RelationInfo> KWHzl() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<RelationInfo>> OLrzqt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<RelationInfo>> copydefault() {
        return this.values;
    }

    @yCM
    public StrangerRelationBannerViewModel(@NotNull oCI oci, @NotNull C35863oGm c35863oGm, @NotNull C35859oGi c35859oGi, @NotNull oDZ odz, @NotNull C35758oCp c35758oCp) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(odz, "");
        Intrinsics.checkNotNullParameter(c35758oCp, "");
        this.isConnected = oci;
        this.DbNXlk = c35863oGm;
        this.gEmmrt = c35859oGi;
        this.djBIcL = odz;
        this.AkhnZx = c35758oCp;
        MutableLiveData<C32989mnw<RelationInfo>> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.values = mutableLiveData;
        MutableLiveData<C32989mnw<RelationInfo>> mutableLiveData2 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData2;
        this.fetchVPNInfo = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>(null);
        this.copydefault = mutableLiveData3;
        this.EZpvd = Transformations.switchMap(mutableLiveData3, new Function1() { // from class: o.oiw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return StrangerRelationBannerViewModel.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        });
        this.fARcdN = Transformations.switchMap(mutableLiveData3, new Function1() { // from class: o.oix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return StrangerRelationBannerViewModel.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        });
        MutableLiveData<C36557odH> mutableLiveData4 = new MutableLiveData<>(null);
        this.fJNWhG = mutableLiveData4;
        this.AhwBna = Transformations.distinctUntilChanged(Transformations.map(mutableLiveData4, new Function1() { // from class: o.oiz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(StrangerRelationBannerViewModel.KWHzl((C36557odH) obj));
            }
        }));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.strangerrelation.StrangerRelationBannerViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final LiveData AEQbTJ(StrangerRelationBannerViewModel strangerRelationBannerViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(strangerRelationBannerViewModel.isConnected.KWHzl(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData copydefault(StrangerRelationBannerViewModel strangerRelationBannerViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(strangerRelationBannerViewModel.DbNXlk.EZpvd(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void AEQbTJ(String str, IMPageType iMPageType) {
        this.copydefault.setValue(str);
        this.ejfBZ = iMPageType;
    }

    public final void AhwBna() {
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.valueOf = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StrangerRelationBannerViewModel$observeStrangerRelationBannerUseCase$1(this, null), 2, null);
    }

    public final void AYXKKw() {
        OKConversation value = this.EZpvd.getValue();
        RelationInfo value2 = this.fARcdN.getValue();
        if (value == null || value2 == null) {
            return;
        }
        this.OLrzqt.setValue(new C32989mnw<>(value2));
    }

    public final void gEmmrt() {
        OKConversation value = this.EZpvd.getValue();
        RelationInfo value2 = this.fARcdN.getValue();
        if (value == null || value2 == null) {
            return;
        }
        this.KWHzl.setValue(new C32989mnw<>(value2));
    }

    public final void djBIcL() {
        OKConversation value = this.EZpvd.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrangerRelationBannerViewModel$loadRelationInfo$1$1(this, value, null), 3, null);
        }
    }
}
