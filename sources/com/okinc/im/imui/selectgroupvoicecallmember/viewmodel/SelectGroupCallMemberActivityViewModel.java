package com.okinc.im.imui.selectgroupvoicecallmember.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberActivityViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC33073mpa;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.oDI;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectGroupCallMemberActivityViewModel extends AbstractC33073mpa {
    public final LiveData<List<String>> AhwBna;
    public final LiveData<List<String>> EZpvd;
    public final MutableLiveData<Integer> KWHzl;
    public MutableLiveData<List<String>> OLrzqt;
    public MutableLiveData<List<String>> copydefault;
    public final LiveData<Integer> djBIcL;
    public final oDI gEmmrt;
    public final LiveData<Integer> valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<String>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public SelectGroupCallMemberActivityViewModel(@NotNull oDI odi) {
        Intrinsics.checkNotNullParameter(odi, "");
        this.gEmmrt = odi;
        this.OLrzqt = new MutableLiveData<>();
        MutableLiveData<List<String>> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.EZpvd = this.OLrzqt;
        this.AhwBna = mutableLiveData;
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(this.copydefault, new TaskDescription(new Function1() { // from class: o.owR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SelectGroupCallMemberActivityViewModel.copydefault(mediatorLiveData, this, (java.util.List) obj);
            }
        }));
        mediatorLiveData.addSource(this.OLrzqt, new TaskDescription(new Function1() { // from class: o.owQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SelectGroupCallMemberActivityViewModel.AEQbTJ(mediatorLiveData, this, (java.util.List) obj);
            }
        }));
        this.valueOf = mediatorLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData2;
        this.djBIcL = mutableLiveData2;
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, SelectGroupCallMemberActivityViewModel selectGroupCallMemberActivityViewModel, List list) {
        mediatorLiveData.setValue(Integer.valueOf(selectGroupCallMemberActivityViewModel.EZpvd()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, SelectGroupCallMemberActivityViewModel selectGroupCallMemberActivityViewModel, List list) {
        mediatorLiveData.setValue(Integer.valueOf(selectGroupCallMemberActivityViewModel.EZpvd()));
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberActivityViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void KWHzl(String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OLrzqt(list);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectGroupCallMemberActivityViewModel$init$1(this, str, null), 3, null);
    }

    private final int EZpvd() {
        List<String> value = this.OLrzqt.getValue();
        int size = value != null ? value.size() : 0;
        List<String> value2 = this.copydefault.getValue();
        return size + (value2 != null ? value2.size() : 0);
    }

    private final void OLrzqt(List<String> list) {
        pUU.KWHzl("SelectRelationActivityViewModel", "completed list updated, size:" + (list != null ? Integer.valueOf(list.size()) : null));
        MutableLiveData<List<String>> mutableLiveData = this.OLrzqt;
        if (list == null) {
            list = yDY.AhwBna();
        }
        mutableLiveData.setValue(list);
    }

    public final void EZpvd(List<String> list) {
        pUU.KWHzl("SelectRelationActivityViewModel", "selected list updated, size:" + (list != null ? Integer.valueOf(list.size()) : null));
        MutableLiveData<List<String>> mutableLiveData = this.copydefault;
        if (list == null) {
            list = yDY.AhwBna();
        }
        mutableLiveData.setValue(list);
    }
}
