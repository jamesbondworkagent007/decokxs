package com.okinc.cruilib.view.infinitescroll;

import androidx.annotation.StringRes;
import androidx.lifecycle.ViewModel;
import com.okinc.core.arch.data.StatefulData;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC32952mnL;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.InterfaceC58217yxC;
import o.mIO;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class InfiniteScrollViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<Integer> AEQbTJ;
    public final AbstractC32952mnL<List<OKCRListItem>> AYXKKw;
    public final Set<String> AhwBna;
    public int AkhnZx;
    public String DbNXlk;
    public boolean EZpvd;
    public final MutableSharedFlow<Boolean> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public boolean djBIcL;
    public final SharedFlow<Integer> ejfBZ;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public final SharedFlow<Unit> fetchVPNInfo;
    public int gEmmrt;
    public final SharedFlow<Boolean> isConnected;
    public final List<OKCRListItem> valueOf;
    public List<Object> values;

    public static final class Application extends AbstractC32952mnL<List<? extends OKCRListItem>> {
        @Override // o.AbstractC32952mnL
        public InterfaceC58217yxC EZpvd(long j) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.fIwbmz = z;
    }

    public abstract void EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<OKCRListItem> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> OLrzqt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.fIwbmz;
    }

    public void valueOf() {
    }

    public InfiniteScrollViewModel() {
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        this.AkhnZx = 2;
        this.AhwBna = new LinkedHashSet();
        this.values = yDY.AhwBna();
        this.AYXKKw = new Application();
        this.valueOf = new ArrayList();
        this.EZpvd = true;
    }

    public static /* synthetic */ void refreshItemList$default(InfiniteScrollViewModel infiniteScrollViewModel, RefreshAction refreshAction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshItemList");
        }
        if ((i & 1) != 0) {
            refreshAction = RefreshAction.DEFAULT;
        }
        infiniteScrollViewModel.AEQbTJ(refreshAction);
    }

    public void AEQbTJ(@NotNull RefreshAction refreshAction) {
        Intrinsics.checkNotNullParameter(refreshAction, "");
        RefreshAction refreshAction2 = RefreshAction.PULL_TO_REFRESH;
        if (!yDY.gEmmrt(refreshAction2, RefreshAction.ON_TAB_SWITCH).contains(refreshAction)) {
            this.AYXKKw.setValue(StatefulData.StateListAnimator.loading$default(StatefulData.Companion, null, 1, null));
        }
        this.DbNXlk = null;
        this.gEmmrt = 0;
        this.fJNWhG = true;
        copydefault(false);
        this.djBIcL = refreshAction == refreshAction2;
        valueOf();
        EZpvd();
    }

    public static /* synthetic */ mIO.Activity buildEmptyItem$default(InfiniteScrollViewModel infiniteScrollViewModel, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildEmptyItem");
        }
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return infiniteScrollViewModel.KWHzl(i, i2);
    }

    public mIO.Activity KWHzl(@StringRes int i, @StringRes int i2) {
        return new mIO.Activity("ID_EMPTY_ITEM", i, i2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RefreshAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RefreshAction[] $VALUES;
        public static final RefreshAction PULL_TO_REFRESH = new RefreshAction("PULL_TO_REFRESH", 0);
        public static final RefreshAction ON_TAB_SWITCH = new RefreshAction("ON_TAB_SWITCH", 1);
        public static final RefreshAction ON_VISIBLE = new RefreshAction("ON_VISIBLE", 2);
        public static final RefreshAction DEFAULT = new RefreshAction("DEFAULT", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RefreshAction[] $values() {
            return new RefreshAction[]{PULL_TO_REFRESH, ON_TAB_SWITCH, ON_VISIBLE, DEFAULT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RefreshAction> getEntries() {
            return $ENTRIES;
        }

        private RefreshAction(String str, int i) {
        }

        static {
            RefreshAction[] refreshActionArr$values = $values();
            $VALUES = refreshActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(refreshActionArr$values);
        }

        public static RefreshAction valueOf(String str) {
            return (RefreshAction) Enum.valueOf(RefreshAction.class, str);
        }

        public static RefreshAction[] values() {
            return (RefreshAction[]) $VALUES.clone();
        }
    }

    public final Object AEQbTJ(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Iterator<OKCRListItem> it = KWHzl().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((Object) it.next().getId(), (Object) str)) {
                break;
            }
            i++;
        }
        Object objEmit = this.AEQbTJ.emit(C56443yFo.AEQbTJ(i), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.view.infinitescroll.InfiniteScrollViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
