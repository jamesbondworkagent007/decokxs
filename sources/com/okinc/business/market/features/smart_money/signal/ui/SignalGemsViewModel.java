package com.okinc.business.market.features.smart_money.signal.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C29481kuU;
import o.C29505kus;
import o.C33129mqd;
import o.InterfaceC29553kvn;
import o.yCM;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalGemsViewModel extends ViewModel {
    public C29481kuU AEQbTJ;
    public final C29505kus EZpvd;
    public final MutableStateFlow<InterfaceC29553kvn> KWHzl;
    public boolean OLrzqt;
    public List<SignalGemsCardsUiModel> copydefault;
    public final StateFlow<InterfaceC29553kvn> gEmmrt;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalGemsUiSortType.values().length];
            try {
                iArr[SignalGemsUiSortType.MARKET_CAP_INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignalGemsUiSortType.FIRST_SIGNAL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalGemsUiSortType.MARKET_CAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC29553kvn> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        boolean z = this.OLrzqt;
        this.OLrzqt = false;
        return z;
    }

    @yCM
    public SignalGemsViewModel(@NotNull C29505kus c29505kus) {
        Intrinsics.checkNotNullParameter(c29505kus, "");
        this.EZpvd = c29505kus;
        MutableStateFlow<InterfaceC29553kvn> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC29553kvn.TaskDescription.AEQbTJ);
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = yDY.AhwBna();
    }

    public final void AEQbTJ(@NotNull C29481kuU c29481kuU) {
        Intrinsics.checkNotNullParameter(c29481kuU, "");
        this.AEQbTJ = c29481kuU;
        List<SignalGemsCardsUiModel> listEZpvd = EZpvd(AEQbTJ(this.copydefault, c29481kuU.EZpvd()), c29481kuU.valueOf());
        this.OLrzqt = true;
        MutableStateFlow<InterfaceC29553kvn> mutableStateFlow = this.KWHzl;
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC29553kvn.StateListAnimator(listEZpvd, listEZpvd.isEmpty() && (this.copydefault.isEmpty() ^ true))));
    }

    public final List<SignalGemsCardsUiModel> AEQbTJ(List<SignalGemsCardsUiModel> list, SignalGemType signalGemType) {
        if (signalGemType == SignalGemType.ALL) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SignalGemsCardsUiModel) obj).valueOf().AEQbTJ() == SignalMultiplierTagType.Companion.EZpvd(signalGemType)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<SignalGemsCardsUiModel> EZpvd(List<SignalGemsCardsUiModel> list, SignalGemsUiSortType signalGemsUiSortType) {
        int i = TaskDescription.OLrzqt[signalGemsUiSortType.ordinal()];
        if (i == 1) {
            return list;
        }
        if (i == 2) {
            return CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar());
    }

    public final void KWHzl(@NotNull C29481kuU c29481kuU) {
        Intrinsics.checkNotNullParameter(c29481kuU, "");
        this.AEQbTJ = c29481kuU;
        MutableStateFlow<InterfaceC29553kvn> mutableStateFlow = this.KWHzl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), InterfaceC29553kvn.TaskDescription.AEQbTJ)) {
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalGemsViewModel$getSignalGems$2(this, c29481kuU, null), 3, null);
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Double.valueOf(C33129mqd.AEQbTJ(((SignalGemsCardsUiModel) t2).KWHzl())), Double.valueOf(C33129mqd.AEQbTJ(((SignalGemsCardsUiModel) t).KWHzl())));
        }
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Double.valueOf(C33129mqd.AEQbTJ(Long.valueOf(((SignalGemsCardsUiModel) t2).copydefault()))), Double.valueOf(C33129mqd.AEQbTJ(Long.valueOf(((SignalGemsCardsUiModel) t).copydefault()))));
        }
    }
}
