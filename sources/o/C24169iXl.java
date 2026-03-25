package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iXl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C24169iXl implements ViewModelProvider.Factory {
    public final iXG AYXKKw;
    public final InterfaceC23639iDv AhwBna;
    public final InterfaceC24171iXn AkhnZx;
    public final CoroutineDispatcher EZpvd;
    public final iXG KWHzl;
    public final InterfaceC23693iFv OLrzqt;
    public final iXH copydefault;
    public final iXN djBIcL;
    public final iGJ gEmmrt;
    public final C26695jhF isConnected;
    public final iGK valueOf;
    public final C23597iCg values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C24169iXl(@NotNull iXG ixg, @NotNull iXG ixg2, @NotNull iGJ igj, @NotNull iGK igk, @NotNull iXN ixn, @NotNull InterfaceC24171iXn interfaceC24171iXn, @NotNull iXH ixh, @NotNull InterfaceC23693iFv interfaceC23693iFv, @NotNull C23597iCg c23597iCg, @NotNull InterfaceC23639iDv interfaceC23639iDv, @NotNull C26695jhF c26695jhF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ixg, "");
        Intrinsics.checkNotNullParameter(ixg2, "");
        Intrinsics.checkNotNullParameter(igj, "");
        Intrinsics.checkNotNullParameter(igk, "");
        Intrinsics.checkNotNullParameter(ixn, "");
        Intrinsics.checkNotNullParameter(interfaceC24171iXn, "");
        Intrinsics.checkNotNullParameter(ixh, "");
        Intrinsics.checkNotNullParameter(interfaceC23693iFv, "");
        Intrinsics.checkNotNullParameter(c23597iCg, "");
        Intrinsics.checkNotNullParameter(interfaceC23639iDv, "");
        Intrinsics.checkNotNullParameter(c26695jhF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = ixg;
        this.AYXKKw = ixg2;
        this.gEmmrt = igj;
        this.valueOf = igk;
        this.djBIcL = ixn;
        this.AkhnZx = interfaceC24171iXn;
        this.copydefault = ixh;
        this.OLrzqt = interfaceC23693iFv;
        this.values = c23597iCg;
        this.AhwBna = interfaceC23639iDv;
        this.isConnected = c26695jhF;
        this.EZpvd = coroutineDispatcher;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(@NotNull java.lang.Class<T> cls, @NotNull CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(creationExtras, "");
        if (!Intrinsics.EZpvd(cls, AbstractC24170iXm.class)) {
            throw new java.lang.IllegalStateException("This ViewModelFactory only supports BaseTransactionViewModel");
        }
        TransactionConfig transactionConfig = (TransactionConfig) creationExtras.get(C24172iXo.OLrzqt);
        if (transactionConfig == null) {
            throw new java.lang.IllegalStateException("TransactionConfig not provided!");
        }
        iXE ixeAEQbTJ = this.gEmmrt.AEQbTJ(transactionConfig);
        if (transactionConfig.wlaJM()) {
            return new C26661jgY(transactionConfig, this.KWHzl, ixeAEQbTJ, this.djBIcL, this.copydefault, this.AkhnZx, this.values, this.AhwBna, this.isConnected, this.EZpvd);
        }
        if (transactionConfig.AxsJAY()) {
            return new C26714jhY(transactionConfig, this.AYXKKw, ixeAEQbTJ, this.djBIcL, this.copydefault, this.AkhnZx, this.values, this.OLrzqt, this.AhwBna, this.isConnected, this.EZpvd);
        }
        if (transactionConfig.QOLQEE()) {
            return new C26714jhY(transactionConfig, this.valueOf.OLrzqt(transactionConfig), ixeAEQbTJ, this.djBIcL, this.copydefault, this.AkhnZx, this.values, this.OLrzqt, this.AhwBna, this.isConnected, this.EZpvd);
        }
        throw new java.lang.IllegalStateException("No suitable ViewModel Found!");
    }

    /* JADX INFO: renamed from: o.iXl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iXl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final CreationExtras AEQbTJ(@NotNull TransactionConfig transactionConfig) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
            mutableCreationExtras.set(C24172iXo.OLrzqt, transactionConfig);
            return mutableCreationExtras;
        }
    }
}
