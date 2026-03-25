package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import com.okinc.okex.center.viewmodel.SupportRecentActivitiesListViewModel$loadNextData$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC45154skT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.slk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45224slk extends AbstractC33073mpa {
    public final MutableLiveData<java.util.List<TransactionDisplayModelV2>> AEQbTJ;
    public final TransactionType AYXKKw;
    public final MutableLiveData<SelfServiceToolBean> EZpvd;
    public final MutableLiveData<java.lang.Boolean> KWHzl;
    public final MutableStateFlow<AbstractC45154skT> OLrzqt;
    public final MutableLiveData<java.lang.Integer> copydefault;
    public final C45351soE gEmmrt;
    public final StateFlow<AbstractC45154skT> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Integer> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<TransactionDisplayModelV2>> AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC45154skT> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<SelfServiceToolBean> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionType OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45351soE djBIcL() {
        return this.gEmmrt;
    }

    @yCM
    public C45224slk(@NotNull TransactionType transactionType, @NotNull C45351soE c45351soE) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(c45351soE, "");
        this.AYXKKw = transactionType;
        this.gEmmrt = c45351soE;
        MutableStateFlow<AbstractC45154skT> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC45154skT.ActionBar.AEQbTJ);
        this.OLrzqt = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.AEQbTJ = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
    }

    public final void AEQbTJ(@NotNull java.util.List<TransactionDisplayModelV2> list, SelfServiceTools selfServiceTools) {
        java.util.List<SelfServiceToolBean> list2;
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.setValue(list);
        this.copydefault.setValue(1);
        this.EZpvd.setValue((selfServiceTools == null || (list2 = selfServiceTools.getList()) == null) ? null : (SelfServiceToolBean) CollectionsKt___CollectionsKt.firstOrNull(list2));
    }

    public final void KWHzl(boolean z) {
        this.KWHzl.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void copydefault(@NotNull TransactionType transactionType, @NotNull java.util.List<TransactionDisplayModelV2> list) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (transactionType == this.AYXKKw) {
            MutableLiveData<java.lang.Integer> mutableLiveData = this.copydefault;
            java.lang.Integer value = mutableLiveData.getValue();
            mutableLiveData.setValue(value != null ? java.lang.Integer.valueOf(value.intValue() + 1) : null);
            MutableLiveData<java.util.List<TransactionDisplayModelV2>> mutableLiveData2 = this.AEQbTJ;
            mutableLiveData2.setValue(this.gEmmrt.KWHzl(mutableLiveData2.getValue(), list));
            return;
        }
        this.copydefault.setValue(1);
    }

    public final void OLrzqt(int i, int i2, @NotNull TransactionType transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new SupportRecentActivitiesListViewModel$loadNextData$1(this, i, i2, transactionType, null), 2, null);
        }
    }
}
