package com.okinc.im.imui.messageV2.view.banner.inputdisablestate;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.imui.messageV2.view.banner.inputdisablestate.InputDisableStateBannerViewModel;
import com.okinc.okimcore.model.im.DisableGroupChatMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKVipAccessMessage;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C35751oCi;
import o.C35752oCj;
import o.C35754oCl;
import o.C36552odC;
import o.C36553odD;
import o.C36554odE;
import o.C44373sNk;
import o.C44467sQx;
import o.InterfaceC44293sKl;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.oDA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class InputDisableStateBannerViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final oDA AEQbTJ;
    public final LiveData<Boolean> AYXKKw;
    public final LiveData<Boolean> AhwBna;
    public final C35751oCi AkhnZx;
    public final C35754oCl DbNXlk;
    public final LiveData<C36554odE> EZpvd;
    public final MutableLiveData<String> KWHzl;
    public final LiveData<C36553odD> OLrzqt;
    public final LiveData<StringResource> djBIcL;
    public final C35752oCj fetchVPNInfo;
    public final LiveData<Boolean> gEmmrt;
    public final InterfaceC44293sKl isConnected;
    public final LiveData<C36552odC> valueOf;
    public final TaskDescription values;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final boolean OLrzqt(C36552odC c36552odC) {
        return c36552odC != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<StringResource> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> djBIcL() {
        return this.AYXKKw;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.banner.inputdisablestate.InputDisableStateBannerViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public InputDisableStateBannerViewModel(@NotNull oDA oda, @NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull C35754oCl c35754oCl, @NotNull C35752oCj c35752oCj, @NotNull C35751oCi c35751oCi) {
        Intrinsics.checkNotNullParameter(oda, "");
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(c35754oCl, "");
        Intrinsics.checkNotNullParameter(c35752oCj, "");
        Intrinsics.checkNotNullParameter(c35751oCi, "");
        this.AEQbTJ = oda;
        this.isConnected = interfaceC44293sKl;
        this.DbNXlk = c35754oCl;
        this.fetchVPNInfo = c35752oCj;
        this.AkhnZx = c35751oCi;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        LiveData<C36552odC> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.ohi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.valueOf(this.copydefault, (java.lang.String) obj);
            }
        });
        this.valueOf = liveDataSwitchMap;
        LiveData<C36554odE> liveDataSwitchMap2 = Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.ohj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        this.EZpvd = liveDataSwitchMap2;
        LiveData<C36553odD> liveDataSwitchMap3 = Transformations.switchMap(mutableLiveData, new Function1() { // from class: o.ohk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        });
        this.OLrzqt = liveDataSwitchMap3;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveDataSwitchMap, new Application(new Function1() { // from class: o.ohl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.copydefault(mediatorLiveData, this, (C36552odC) obj);
            }
        }));
        mediatorLiveData.addSource(liveDataSwitchMap2, new Application(new Function1() { // from class: o.ohr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.valueOf(mediatorLiveData, this, (C36554odE) obj);
            }
        }));
        mediatorLiveData.addSource(liveDataSwitchMap3, new Application(new Function1() { // from class: o.oho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.gEmmrt(mediatorLiveData, this, (C36553odD) obj);
            }
        }));
        this.AhwBna = mediatorLiveData;
        this.gEmmrt = Transformations.map(liveDataSwitchMap, new Function1() { // from class: o.ohp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(InputDisableStateBannerViewModel.OLrzqt((C36552odC) obj));
            }
        });
        final MediatorLiveData mediatorLiveData2 = new MediatorLiveData();
        mediatorLiveData2.addSource(liveDataSwitchMap2, new Application(new Function1() { // from class: o.ohq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.KWHzl(mediatorLiveData2, this, (C36554odE) obj);
            }
        }));
        mediatorLiveData2.addSource(liveDataSwitchMap3, new Application(new Function1() { // from class: o.ohs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.AEQbTJ(mediatorLiveData2, this, (C36553odD) obj);
            }
        }));
        this.AYXKKw = mediatorLiveData2;
        final MediatorLiveData mediatorLiveData3 = new MediatorLiveData();
        mediatorLiveData3.addSource(liveDataSwitchMap2, new Application(new Function1() { // from class: o.ohn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.copydefault(mediatorLiveData3, this, (C36554odE) obj);
            }
        }));
        mediatorLiveData3.addSource(liveDataSwitchMap3, new Application(new Function1() { // from class: o.ohm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InputDisableStateBannerViewModel.EZpvd(mediatorLiveData3, this, (C36553odD) obj);
            }
        }));
        this.djBIcL = mediatorLiveData3;
        this.values = new TaskDescription();
    }

    public static final LiveData valueOf(InputDisableStateBannerViewModel inputDisableStateBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(inputDisableStateBannerViewModel.DbNXlk.OLrzqt(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData KWHzl(InputDisableStateBannerViewModel inputDisableStateBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(inputDisableStateBannerViewModel.fetchVPNInfo.copydefault(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData EZpvd(InputDisableStateBannerViewModel inputDisableStateBannerViewModel, String str) {
        if (str == null) {
            return new MutableLiveData(null);
        }
        return FlowLiveDataConversions.asLiveData$default(inputDisableStateBannerViewModel.AkhnZx.OLrzqt(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, InputDisableStateBannerViewModel inputDisableStateBannerViewModel, C36552odC c36552odC) {
        mediatorLiveData.setValue(Boolean.valueOf(inputDisableStateBannerViewModel.valueOf()));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(MediatorLiveData mediatorLiveData, InputDisableStateBannerViewModel inputDisableStateBannerViewModel, C36554odE c36554odE) {
        mediatorLiveData.setValue(Boolean.valueOf(inputDisableStateBannerViewModel.valueOf()));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(MediatorLiveData mediatorLiveData, InputDisableStateBannerViewModel inputDisableStateBannerViewModel, C36553odD c36553odD) {
        mediatorLiveData.setValue(Boolean.valueOf(inputDisableStateBannerViewModel.valueOf()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, InputDisableStateBannerViewModel inputDisableStateBannerViewModel, C36554odE c36554odE) {
        mediatorLiveData.setValue(Boolean.valueOf(inputDisableStateBannerViewModel.OLrzqt()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, InputDisableStateBannerViewModel inputDisableStateBannerViewModel, C36553odD c36553odD) {
        mediatorLiveData.setValue(Boolean.valueOf(inputDisableStateBannerViewModel.OLrzqt()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, InputDisableStateBannerViewModel inputDisableStateBannerViewModel, C36554odE c36554odE) {
        mediatorLiveData.setValue(inputDisableStateBannerViewModel.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MediatorLiveData mediatorLiveData, InputDisableStateBannerViewModel inputDisableStateBannerViewModel, C36553odD c36553odD) {
        mediatorLiveData.setValue(inputDisableStateBannerViewModel.copydefault());
        return Unit.INSTANCE;
    }

    public static final class TaskDescription extends C44373sNk {
        public TaskDescription() {
        }

        @Override // o.C44373sNk, o.InterfaceC44291sKj
        public void KWHzl(C44467sQx c44467sQx) {
            Intrinsics.checkNotNullParameter(c44467sQx, "");
            OKMessage oKMessageCopydefault = c44467sQx.copydefault();
            if (Intrinsics.EZpvd(oKMessageCopydefault.getTargetId(), InputDisableStateBannerViewModel.this.KWHzl.getValue())) {
                if ((oKMessageCopydefault.getContent() instanceof DisableGroupChatMessage) || (oKMessageCopydefault.getContent() instanceof OKVipAccessMessage)) {
                    InputDisableStateBannerViewModel.this.KWHzl();
                }
            }
        }
    }

    public final boolean valueOf() {
        return (this.valueOf.getValue() == null && this.EZpvd.getValue() == null && this.OLrzqt.getValue() == null) ? false : true;
    }

    public final boolean OLrzqt() {
        return (this.EZpvd.getValue() == null && this.OLrzqt.getValue() == null) ? false : true;
    }

    public final StringResource copydefault() {
        C36554odE value = this.EZpvd.getValue();
        C36553odD value2 = this.OLrzqt.getValue();
        if (value != null) {
            return new StringResource.Res(C35399nuc.LoaderManager.zvzmfz);
        }
        if (value2 != null) {
            return new StringResource.Res(C35399nuc.LoaderManager.WS);
        }
        return null;
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setValue(str);
        InterfaceC44293sKl interfaceC44293sKl = this.isConnected;
        interfaceC44293sKl.AEQbTJ(this.values);
        interfaceC44293sKl.OLrzqt(this.values);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InputDisableStateBannerViewModel$fetchGroupInfo$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.isConnected.AEQbTJ(this.values);
    }
}
