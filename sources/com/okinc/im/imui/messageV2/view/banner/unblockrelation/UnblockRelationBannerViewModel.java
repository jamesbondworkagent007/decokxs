package com.okinc.im.imui.messageV2.view.banner.unblockrelation;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32989mnw;
import o.C35757oCo;
import o.C35859oGi;
import o.C35863oGm;
import o.C36562odM;
import o.oCI;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class UnblockRelationBannerViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final C35859oGi AEQbTJ;
    public final LiveData<Boolean> AYXKKw;
    public final C35757oCo AhwBna;
    public final LiveData<OKConversation> EZpvd;
    public final MutableLiveData<C32989mnw<RelationInfo>> KWHzl;
    public final MutableLiveData<String> copydefault;
    public final oCI djBIcL;
    public final LiveData<C36562odM> fetchVPNInfo;
    public final LiveData<C32989mnw<RelationInfo>> gEmmrt;
    public final C35863oGm valueOf;
    public final LiveData<RelationInfo> values;

    public static final boolean OLrzqt(C36562odM c36562odM) {
        return c36562odM != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<RelationInfo>> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RelationInfo> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<OKConversation> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public UnblockRelationBannerViewModel(@NotNull oCI oci, @NotNull C35859oGi c35859oGi, @NotNull C35863oGm c35863oGm, @NotNull C35757oCo c35757oCo) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(c35757oCo, "");
        this.djBIcL = oci;
        this.AEQbTJ = c35859oGi;
        this.valueOf = c35863oGm;
        this.AhwBna = c35757oCo;
        MutableLiveData<C32989mnw<RelationInfo>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.gEmmrt = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>(null);
        this.copydefault = mutableLiveData2;
        this.EZpvd = Transformations.switchMap(mutableLiveData2, new Function1() { // from class: o.oiU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UnblockRelationBannerViewModel.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        this.values = Transformations.switchMap(mutableLiveData2, new Function1() { // from class: o.oiV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UnblockRelationBannerViewModel.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        });
        LiveData<C36562odM> liveDataSwitchMap = Transformations.switchMap(mutableLiveData2, new Function1() { // from class: o.oiX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UnblockRelationBannerViewModel.valueOf(this.KWHzl, (java.lang.String) obj);
            }
        });
        this.fetchVPNInfo = liveDataSwitchMap;
        this.AYXKKw = Transformations.map(liveDataSwitchMap, new Function1() { // from class: o.oiY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(UnblockRelationBannerViewModel.OLrzqt((C36562odM) obj));
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.unblockrelation.UnblockRelationBannerViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final LiveData AEQbTJ(UnblockRelationBannerViewModel unblockRelationBannerViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(unblockRelationBannerViewModel.djBIcL.KWHzl(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData OLrzqt(UnblockRelationBannerViewModel unblockRelationBannerViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(unblockRelationBannerViewModel.valueOf.EZpvd(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData valueOf(UnblockRelationBannerViewModel unblockRelationBannerViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(unblockRelationBannerViewModel.AhwBna.AEQbTJ(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void copydefault(String str) {
        this.copydefault.setValue(str);
    }

    public final void djBIcL() {
        OKConversation value = this.EZpvd.getValue();
        RelationInfo value2 = this.values.getValue();
        if (value == null || value2 == null) {
            return;
        }
        this.KWHzl.setValue(new C32989mnw<>(value2));
    }

    public final void AEQbTJ() {
        OKConversation value = this.EZpvd.getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new UnblockRelationBannerViewModel$loadRelationInfo$1$1(this, value, null), 3, null);
        }
    }
}
