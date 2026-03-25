package com.okinc.buysell.ui.pro.transaction.list.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.ui.pro.transaction.list.bean.FiatThirdPartyOrder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C30193lPh;
import o.C30200lPo;
import o.C32989mnw;
import o.InterfaceC31764mDa;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FiatCryptoOrderViewModel extends ViewModel {
    public final int AEQbTJ;
    public final MutableLiveData<C32989mnw<Boolean>> AYXKKw;
    public final MutableLiveData<C32989mnw<TaskDescription>> AhwBna;
    public int EZpvd;
    public final InterfaceC31764mDa KWHzl;
    public int OLrzqt;
    public String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<TaskDescription>> KWHzl() {
        return this.AhwBna;
    }

    @yCM
    public FiatCryptoOrderViewModel(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.KWHzl = interfaceC31764mDa;
        this.copydefault = "buy_sell";
        this.OLrzqt = 1;
        this.AEQbTJ = 30;
        this.AYXKKw = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
    }

    public static final class TaskDescription {
        public final boolean EZpvd;
        public final List<FiatThirdPartyOrder> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.ui.pro.transaction.list.viewmodel.FiatCryptoOrderViewModel$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = taskDescription.EZpvd;
            }
            return taskDescription.EZpvd(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull List<FiatThirdPartyOrder> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new TaskDescription(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<FiatThirdPartyOrder> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OrdersDisplayInfo(dataList=" + this.OLrzqt + ", append=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull List<FiatThirdPartyOrder> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.EZpvd = z;
        }
    }

    public final void AEQbTJ(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        AEQbTJ(i, this.AEQbTJ);
    }

    public final void AEQbTJ(int i, int i2) {
        C30200lPo c30200lPo = new C30200lPo();
        c30200lPo.OLrzqt(i2);
        c30200lPo.copydefault(i);
        C30193lPh c30193lPh = C30193lPh.copydefault;
        c30200lPo.AEQbTJ(c30193lPh.OLrzqt() == null ? this.copydefault : c30193lPh.OLrzqt());
        c30200lPo.OLrzqt(c30193lPh.EZpvd());
        c30200lPo.KWHzl(c30193lPh.copydefault());
        copydefault(c30200lPo, i);
        this.OLrzqt = i;
        this.EZpvd = i2;
    }

    public final void EZpvd() {
        int i = this.OLrzqt + 1;
        this.OLrzqt = i;
        AEQbTJ(i, this.EZpvd);
    }

    public final void copydefault(C30200lPo c30200lPo, int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FiatCryptoOrderViewModel$loadOrders$1(this, c30200lPo, i, null), 3, null);
    }
}
