package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationActivityViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.oDU;
import o.oDW;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectRelationActivityViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public MutableLiveData<List<String>> AEQbTJ;
    public final oDU AYXKKw;
    public final oDW AhwBna;
    public MutableLiveData<List<String>> KWHzl;
    public final LiveData<List<String>> OLrzqt;
    public final MutableLiveData<Integer> copydefault;
    public final LiveData<Integer> djBIcL;
    public final LiveData<Integer> gEmmrt;
    public final LiveData<List<String>> valueOf;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<String>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public SelectRelationActivityViewModel(@NotNull oDU odu, @NotNull oDW odw) {
        Intrinsics.checkNotNullParameter(odu, "");
        Intrinsics.checkNotNullParameter(odw, "");
        this.AYXKKw = odu;
        this.AhwBna = odw;
        this.KWHzl = new MutableLiveData<>();
        MutableLiveData<List<String>> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.OLrzqt = this.KWHzl;
        this.valueOf = mutableLiveData;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(this.AEQbTJ, new Activity(new Function1() { // from class: o.otJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SelectRelationActivityViewModel.OLrzqt(mediatorLiveData, this, (java.util.List) obj);
            }
        }));
        mediatorLiveData.addSource(this.KWHzl, new Activity(new Function1() { // from class: o.otN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SelectRelationActivityViewModel.EZpvd(mediatorLiveData, this, (java.util.List) obj);
            }
        }));
        this.gEmmrt = mediatorLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.copydefault = mutableLiveData2;
        this.djBIcL = mutableLiveData2;
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, SelectRelationActivityViewModel selectRelationActivityViewModel, List list) {
        mediatorLiveData.setValue(Integer.valueOf(selectRelationActivityViewModel.EZpvd()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MediatorLiveData mediatorLiveData, SelectRelationActivityViewModel selectRelationActivityViewModel, List list) {
        mediatorLiveData.setValue(Integer.valueOf(selectRelationActivityViewModel.EZpvd()));
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationActivityViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectRelationActivityViewModel$init$1(this, str, list, null), 3, null);
    }

    public final int EZpvd() {
        List<String> value = this.KWHzl.getValue();
        int size = value != null ? value.size() : 0;
        List<String> value2 = this.AEQbTJ.getValue();
        return size + (value2 != null ? value2.size() : 0);
    }

    public final void copydefault(List<String> list) {
        pUU.KWHzl("SelectRelationActivityViewModel", "completed list updated, size:" + (list != null ? Integer.valueOf(list.size()) : null));
        MutableLiveData<List<String>> mutableLiveData = this.KWHzl;
        if (list == null) {
            list = yDY.AhwBna();
        }
        mutableLiveData.setValue(list);
    }

    public final void OLrzqt(List<String> list) {
        pUU.KWHzl("SelectRelationActivityViewModel", "selected list updated, size:" + (list != null ? Integer.valueOf(list.size()) : null));
        MutableLiveData<List<String>> mutableLiveData = this.AEQbTJ;
        if (list == null) {
            list = yDY.AhwBna();
        }
        mutableLiveData.setValue(list);
    }
}
