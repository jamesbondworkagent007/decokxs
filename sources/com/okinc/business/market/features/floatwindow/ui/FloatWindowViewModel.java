package com.okinc.business.market.features.floatwindow.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.floatwindow.ui.FloatWindowViewModel;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import com.okinc.business.market.features.holdings.ui.PositionSortType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28434kah;
import o.C28444kar;
import o.C33129mqd;
import o.jWO;
import o.kKG;
import o.yCM;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FloatWindowViewModel extends ViewModel {
    public C28444kar AEQbTJ;
    public final C28434kah EZpvd;
    public final kKG KWHzl;
    public final MutableStateFlow<jWO> OLrzqt;
    public final StateFlow<jWO> copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PositionSortType.values().length];
            try {
                iArr[PositionSortType.BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionSortType.PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jWO> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28444kar KWHzl() {
        return this.AEQbTJ;
    }

    @yCM
    public FloatWindowViewModel(@NotNull C28434kah c28434kah, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(c28434kah, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.EZpvd = c28434kah;
        this.KWHzl = kkg;
        MutableStateFlow<jWO> MutableStateFlow = StateFlowKt.MutableStateFlow(jWO.StateListAnimator.KWHzl);
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        this.AEQbTJ = new C28444kar(null, false, 3, null);
    }

    public static /* synthetic */ void getHoldingToken$default(FloatWindowViewModel floatWindowViewModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        floatWindowViewModel.copydefault(z, z2);
    }

    public final void copydefault(boolean z, boolean z2) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new FloatWindowViewModel$getHoldingToken$1(this, z, z2, null), 3, null);
    }

    public final void djBIcL() {
        this.EZpvd.copydefault();
        jWO value = this.copydefault.getValue();
        jWO.Activity activity = value instanceof jWO.Activity ? (jWO.Activity) value : null;
        if (activity != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FloatWindowViewModel$subscribePnl$1$1(this, activity, null), 3, null);
        }
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FloatWindowViewModel$unsubscribePnl$1(this, null), 3, null);
    }

    public final void EZpvd() {
        this.OLrzqt.setValue(jWO.StateListAnimator.KWHzl);
    }

    public final void AEQbTJ(@NotNull C28444kar c28444kar) {
        Intrinsics.checkNotNullParameter(c28444kar, "");
        this.AEQbTJ = c28444kar;
        jWO value = this.copydefault.getValue();
        jWO.Activity activity = value instanceof jWO.Activity ? (jWO.Activity) value : null;
        if (activity != null) {
            this.OLrzqt.setValue(new jWO.Activity(KWHzl(activity.copydefault()), 0L, true, 2, null));
        }
    }

    public static final class Activity<T> implements Comparator {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            this.OLrzqt = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.OLrzqt;
            return yET.KWHzl((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
        }
    }

    public static final class ActionBar<T> implements Comparator {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            this.EZpvd = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.EZpvd;
            return yET.KWHzl((Comparable) function1.invoke(t2), (Comparable) function1.invoke(t));
        }
    }

    public static final float KWHzl(FloatWindowViewModel floatWindowViewModel, HoldingAsset holdingAsset) {
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        int i = TaskDescription.AEQbTJ[floatWindowViewModel.AEQbTJ.KWHzl().ordinal()];
        if (i == 1) {
            return C33129mqd.djBIcL(holdingAsset.KWHzl());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C33129mqd.djBIcL(holdingAsset.AuCTel());
    }

    public final boolean copydefault() {
        return !kKG.isTrackingWallet$default(this.KWHzl, null, 1, null);
    }

    public final String OLrzqt() {
        return this.KWHzl.OLrzqt();
    }

    public final List<HoldingAsset> KWHzl(@NotNull List<HoldingAsset> list) {
        Comparator activity;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            HoldingAsset holdingAsset = (HoldingAsset) obj;
            boolean z = false;
            boolean z2 = !Intrinsics.EZpvd((Object) holdingAsset.KWHzl(), (Object) "--") && holdingAsset.KWHzl().length() > 0;
            if (!Intrinsics.EZpvd((Object) holdingAsset.fARcdN(), (Object) "--") && holdingAsset.fARcdN().length() > 0) {
                z = true;
            }
            int i = TaskDescription.AEQbTJ[this.AEQbTJ.KWHzl().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = z;
            }
            if (z2) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        Function1 function1 = new Function1() { // from class: o.jWV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Float.valueOf(FloatWindowViewModel.KWHzl(this.EZpvd, (HoldingAsset) obj2));
            }
        };
        if (this.AEQbTJ.EZpvd()) {
            activity = new ActionBar(function1);
        } else {
            activity = new Activity(function1);
        }
        return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.EZpvd(list2, activity), (Iterable) list3);
    }
}
