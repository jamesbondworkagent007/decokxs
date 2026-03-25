package com.okinc.im.imui.selectgroupvoicecallmember.viewmodel;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.oDU;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectGroupCallMemberViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableLiveData<Integer> AEQbTJ;
    public final LiveData<Unit> AYXKKw;
    public String AhwBna;
    public final MutableLiveData<Unit> EZpvd;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<Boolean> copydefault;
    public final LiveData<Boolean> djBIcL;
    public final MutableStateFlow<List<String>> gEmmrt;
    public final LiveData<Integer> isConnected;
    public final oDU valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public SelectGroupCallMemberViewModel(@NotNull oDU odu) {
        Intrinsics.checkNotNullParameter(odu, "");
        this.valueOf = odu;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.isConnected = mutableLiveData;
        this.OLrzqt = new MutableLiveData<>();
        this.gEmmrt = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.copydefault = new MutableLiveData<>();
        this.djBIcL = Transformations.map(EZpvd(), new Function1() { // from class: o.owV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SelectGroupCallMemberViewModel.AEQbTJ(this.EZpvd, (java.util.List) obj));
            }
        });
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.AYXKKw = mutableLiveData2;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final LiveData<List<String>> EZpvd() {
        return FlowLiveDataConversions.asLiveData$default(this.gEmmrt, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final boolean AEQbTJ(SelectGroupCallMemberViewModel selectGroupCallMemberViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return selectGroupCallMemberViewModel.KWHzl((List<String>) list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean KWHzl(List<String> list) {
        boolean z;
        if (!list.isEmpty()) {
            int size = list.size();
            Integer value = this.isConnected.getValue();
            Intrinsics.copydefault(value);
            z = size <= value.intValue();
        }
        pUU.KWHzl("SelectGroupCallMemberViewModel", "isNextActionAllowed:" + z);
        return z;
    }

    public final void KWHzl(String str) {
        this.AhwBna = str;
        EZpvd(str);
    }

    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("SelectGroupCallMemberViewModel", "Selected List updated, size:" + list.size());
        this.gEmmrt.setValue(list);
        this.EZpvd.setValue(Unit.INSTANCE);
    }

    private final void EZpvd(String str) {
        this.AEQbTJ.setValue(3000);
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectGroupCallMemberViewModel$loadMaxNumberAsync$1(this, str, null), 3, null);
        }
        pUU.EZpvd("SelectGroupCallMemberViewModel", "Get max number: " + this.AEQbTJ.getValue());
    }

    public final void OLrzqt(boolean z) {
        this.copydefault.setValue(Boolean.valueOf(z));
    }
}
