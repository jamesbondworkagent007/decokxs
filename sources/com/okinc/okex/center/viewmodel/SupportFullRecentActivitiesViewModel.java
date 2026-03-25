package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.okex.center.bean.FullRecentActivityPageDataV2;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.viewmodel.SupportFullRecentActivitiesViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC45154skT;
import o.C33069mpW;
import o.C33129mqd;
import o.C45351soE;
import o.C47315tni;
import o.C56390yDp;
import o.C56423yEv;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportFullRecentActivitiesViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final LiveData<String> AEQbTJ;
    public final C45351soE AYXKKw;
    public MutableLiveData<FullRecentActivityPageDataV2> KWHzl;
    public final MutableStateFlow<AbstractC45154skT> OLrzqt;
    public final MutableLiveData<Map<TransactionType, Boolean>> copydefault;
    public final StateFlow<AbstractC45154skT> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC45154skT> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Map<TransactionType, Boolean>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> OLrzqt() {
        return this.AEQbTJ;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportFullRecentActivitiesViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public SupportFullRecentActivitiesViewModel(@NotNull C45351soE c45351soE) {
        Intrinsics.checkNotNullParameter(c45351soE, "");
        this.AYXKKw = c45351soE;
        MutableStateFlow<AbstractC45154skT> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC45154skT.ActionBar.AEQbTJ);
        this.OLrzqt = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.AEQbTJ = Transformations.map(this.KWHzl, new Function1() { // from class: o.skU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportFullRecentActivitiesViewModel.copydefault((FullRecentActivityPageDataV2) obj);
            }
        });
    }

    public static final String copydefault(FullRecentActivityPageDataV2 fullRecentActivityPageDataV2) {
        return C33069mpW.copydefault(C47315tni.PendingIntent.getNewProxyInstance, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C33129mqd.gEmmrt(Integer.valueOf(fullRecentActivityPageDataV2.getNumberOfDays())))));
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new SupportFullRecentActivitiesViewModel$loadData$1(this, null), 2, null);
    }
}
