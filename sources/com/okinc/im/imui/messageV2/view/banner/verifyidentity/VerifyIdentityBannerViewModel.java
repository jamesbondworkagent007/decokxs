package com.okinc.im.imui.messageV2.view.banner.verifyidentity;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32989mnw;
import o.C35755oCm;
import o.C35799oEc;
import o.C36565odP;
import o.oDZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class VerifyIdentityBannerViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C35799oEc AEQbTJ;
    public final LiveData<C36565odP> AYXKKw;
    public final oDZ EZpvd;
    public final MutableLiveData<C32989mnw<ActionBar>> KWHzl;
    public final MutableLiveData<String> OLrzqt;
    public final C35755oCm djBIcL;
    public IMPageType valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<ActionBar>> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C36565odP> OLrzqt() {
        return this.AYXKKw;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public VerifyIdentityBannerViewModel(@NotNull C35755oCm c35755oCm, @NotNull C35799oEc c35799oEc, @NotNull oDZ odz) {
        Intrinsics.checkNotNullParameter(c35755oCm, "");
        Intrinsics.checkNotNullParameter(c35799oEc, "");
        Intrinsics.checkNotNullParameter(odz, "");
        this.djBIcL = c35755oCm;
        this.AEQbTJ = c35799oEc;
        this.EZpvd = odz;
        this.KWHzl = new MutableLiveData<>();
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.AYXKKw = Transformations.distinctUntilChanged(Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.ojn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VerifyIdentityBannerViewModel.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }));
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.verifyidentity.VerifyIdentityBannerViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class StateListAnimator extends ActionBar {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private ActionBar() {
        }
    }

    public static final LiveData EZpvd(VerifyIdentityBannerViewModel verifyIdentityBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(verifyIdentityBannerViewModel.djBIcL.EZpvd(str, verifyIdentityBannerViewModel.valueOf), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public final void OLrzqt(String str, IMPageType iMPageType) {
        this.valueOf = iMPageType;
        this.OLrzqt.setValue(str);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyIdentityBannerViewModel$updateLatestKyc$1(this, null), 3, null);
    }
}
