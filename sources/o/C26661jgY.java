package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestTransactionViewModel$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC26680jgr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26661jgY extends AbstractC24170iXm {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int wlaJM = 8;
    public static final java.util.Set<java.lang.Integer> zLjUOn = yEE.AhwBna(0, 1, 11, 38, 36);
    public final iXH AwvSrB;
    public boolean AxsJAY;
    public final C26695jhF DTwDnp;
    public final InterfaceC23639iDv ORxRYg;
    public final C23597iCg OcIXYQ;
    public final InterfaceC24171iXn QKVWgx;
    public final iXN QOLQEE;
    public final CoroutineDispatcher gHZMYf;
    public final iXG sSMYrx;
    public final iXE zuBGHE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26661jgY(@NotNull TransactionConfig transactionConfig, @NotNull iXG ixg, @NotNull iXE ixe, @NotNull iXN ixn, @NotNull iXH ixh, @NotNull InterfaceC24171iXn interfaceC24171iXn, @NotNull C23597iCg c23597iCg, @NotNull InterfaceC23639iDv interfaceC23639iDv, @NotNull C26695jhF c26695jhF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(transactionConfig, ixg, ixe, ixn, ixh, interfaceC24171iXn, interfaceC23639iDv, c26695jhF, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(ixg, "");
        Intrinsics.checkNotNullParameter(ixe, "");
        Intrinsics.checkNotNullParameter(ixn, "");
        Intrinsics.checkNotNullParameter(ixh, "");
        Intrinsics.checkNotNullParameter(interfaceC24171iXn, "");
        Intrinsics.checkNotNullParameter(c23597iCg, "");
        Intrinsics.checkNotNullParameter(interfaceC23639iDv, "");
        Intrinsics.checkNotNullParameter(c26695jhF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.sSMYrx = ixg;
        this.zuBGHE = ixe;
        this.QOLQEE = ixn;
        this.AwvSrB = ixh;
        this.QKVWgx = interfaceC24171iXn;
        this.OcIXYQ = c23597iCg;
        this.ORxRYg = interfaceC23639iDv;
        this.DTwDnp = c26695jhF;
        this.gHZMYf = coroutineDispatcher;
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestTransactionViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.jgY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jgY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final boolean AEQbTJ(java.lang.Integer num) {
            return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) C26661jgY.zLjUOn), num);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC24170iXm
    public iXB AEQbTJ(@NotNull InitialInfoModel initialInfoModel) {
        java.lang.String amount;
        java.util.List<InvestTokenWithAmount> listAYXKKw;
        java.lang.String tokenAddress;
        Intrinsics.checkNotNullParameter(initialInfoModel, "");
        TransactionConfig transactionConfigValues = values();
        java.lang.Object obj = null;
        if (!transactionConfigValues.fetchVPNInfo() || this.AxsJAY) {
            return null;
        }
        this.AxsJAY = true;
        InvestInputData investInputData = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(transactionConfigValues.valueOf());
        if (investInputData == null || (amount = investInputData.getAmount()) == null) {
            amount = "0";
        }
        java.lang.String str = amount;
        InitialInfoModel.InvestInitialInfo investInitialInfo = initialInfoModel instanceof InitialInfoModel.InvestInitialInfo ? (InitialInfoModel.InvestInitialInfo) initialInfoModel : null;
        if (investInitialInfo != null && (listAYXKKw = investInitialInfo.AYXKKw()) != null) {
            java.util.Iterator<T> it = listAYXKKw.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) next;
                InvestInputData investInputData2 = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(transactionConfigValues.valueOf());
                if (investInputData2 != null && (tokenAddress = investInputData2.getTokenAddress()) != null && tokenAddress.length() > 0) {
                    java.lang.String tokenAddress2 = investTokenWithAmount.getTokenAddress();
                    InvestInputData investInputData3 = (InvestInputData) CollectionsKt___CollectionsKt.firstOrNull(transactionConfigValues.valueOf());
                    if (Intrinsics.EZpvd((java.lang.Object) tokenAddress2, (java.lang.Object) (investInputData3 != null ? investInputData3.getTokenAddress() : null))) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (InvestTokenWithAmount) obj;
        }
        return new iXB(str, obj, TransactionStage.CONFIRMATION, null, null, null, 0L, null, 0, false, false, true, 2040, null);
    }

    public final void EZpvd(@NotNull InterfaceC26680jgr interfaceC26680jgr) {
        Intrinsics.checkNotNullParameter(interfaceC26680jgr, "");
        iXB value = super.fetchVPNInfo().getValue();
        if (value == null) {
            value = new iXB("", null, null, null, null, null, 0L, null, 0, false, false, false, 4092, null);
        }
        iXB ixbKWHzl = value;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (interfaceC26680jgr instanceof InterfaceC26680jgr.Activity) {
            InterfaceC26680jgr.Activity activity = (InterfaceC26680jgr.Activity) interfaceC26680jgr;
            ixbKWHzl = ixbKWHzl.KWHzl((4091 & 1) != 0 ? ixbKWHzl.copydefault : activity.OLrzqt(), (4091 & 2) != 0 ? ixbKWHzl.valueOf : activity.KWHzl(), (4091 & 4) != 0 ? ixbKWHzl.AkhnZx : TransactionStage.INPUT, (4091 & 8) != 0 ? ixbKWHzl.OLrzqt : "", (4091 & 16) != 0 ? ixbKWHzl.AYXKKw : null, (4091 & 32) != 0 ? ixbKWHzl.gEmmrt : null, (4091 & 64) != 0 ? ixbKWHzl.fetchVPNInfo : 0L, (4091 & 128) != 0 ? ixbKWHzl.djBIcL : null, (4091 & 256) != 0 ? ixbKWHzl.AEQbTJ : 0, (4091 & 512) != 0 ? ixbKWHzl.AhwBna : activity.AEQbTJ(), (4091 & 1024) != 0 ? ixbKWHzl.KWHzl : false, (4091 & 2048) != 0 ? ixbKWHzl.EZpvd : false);
        } else if (interfaceC26680jgr instanceof InterfaceC26680jgr.StateListAnimator) {
            ixbKWHzl = ixbKWHzl.KWHzl((4091 & 1) != 0 ? ixbKWHzl.copydefault : null, (4091 & 2) != 0 ? ixbKWHzl.valueOf : null, (4091 & 4) != 0 ? ixbKWHzl.AkhnZx : TransactionStage.CONFIRMATION, (4091 & 8) != 0 ? ixbKWHzl.OLrzqt : null, (4091 & 16) != 0 ? ixbKWHzl.AYXKKw : null, (4091 & 32) != 0 ? ixbKWHzl.gEmmrt : null, (4091 & 64) != 0 ? ixbKWHzl.fetchVPNInfo : jCurrentTimeMillis, (4091 & 128) != 0 ? ixbKWHzl.djBIcL : null, (4091 & 256) != 0 ? ixbKWHzl.AEQbTJ : 0, (4091 & 512) != 0 ? ixbKWHzl.AhwBna : false, (4091 & 1024) != 0 ? ixbKWHzl.KWHzl : false, (4091 & 2048) != 0 ? ixbKWHzl.EZpvd : false);
        } else if (interfaceC26680jgr instanceof InterfaceC26680jgr.Application) {
            ixbKWHzl = ixbKWHzl.KWHzl((4091 & 1) != 0 ? ixbKWHzl.copydefault : ixbKWHzl.EZpvd(), (4091 & 2) != 0 ? ixbKWHzl.valueOf : ixbKWHzl.djBIcL(), (4091 & 4) != 0 ? ixbKWHzl.AkhnZx : TransactionStage.APPROVAL, (4091 & 8) != 0 ? ixbKWHzl.OLrzqt : null, (4091 & 16) != 0 ? ixbKWHzl.AYXKKw : null, (4091 & 32) != 0 ? ixbKWHzl.gEmmrt : null, (4091 & 64) != 0 ? ixbKWHzl.fetchVPNInfo : jCurrentTimeMillis, (4091 & 128) != 0 ? ixbKWHzl.djBIcL : null, (4091 & 256) != 0 ? ixbKWHzl.AEQbTJ : 0, (4091 & 512) != 0 ? ixbKWHzl.AhwBna : false, (4091 & 1024) != 0 ? ixbKWHzl.KWHzl : false, (4091 & 2048) != 0 ? ixbKWHzl.EZpvd : false);
        } else if (interfaceC26680jgr instanceof InterfaceC26680jgr.TaskDescription) {
            super.fJNWhG();
            return;
        } else if (interfaceC26680jgr instanceof InterfaceC26680jgr.ActionBar) {
            ixbKWHzl = ixbKWHzl.KWHzl((4091 & 1) != 0 ? ixbKWHzl.copydefault : null, (4091 & 2) != 0 ? ixbKWHzl.valueOf : null, (4091 & 4) != 0 ? ixbKWHzl.AkhnZx : null, (4091 & 8) != 0 ? ixbKWHzl.OLrzqt : ((InterfaceC26680jgr.ActionBar) interfaceC26680jgr).EZpvd(), (4091 & 16) != 0 ? ixbKWHzl.AYXKKw : null, (4091 & 32) != 0 ? ixbKWHzl.gEmmrt : null, (4091 & 64) != 0 ? ixbKWHzl.fetchVPNInfo : 0L, (4091 & 128) != 0 ? ixbKWHzl.djBIcL : null, (4091 & 256) != 0 ? ixbKWHzl.AEQbTJ : 0, (4091 & 512) != 0 ? ixbKWHzl.AhwBna : false, (4091 & 1024) != 0 ? ixbKWHzl.KWHzl : false, (4091 & 2048) != 0 ? ixbKWHzl.EZpvd : false);
        }
        super.copydefault(ixbKWHzl);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iXm.fetchInitialInfo$default(o.iXm, com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        KWHzl(transactionConfig);
        AbstractC24170iXm.fetchInitialInfo$default(this, null, 1, null);
    }

    @Override // o.AbstractC24170iXm, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
