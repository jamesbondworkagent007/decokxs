package com.okinc.business.market.features.floatwindow;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.business.market.features.floatwindow.ui.FloatWindowViewModel;
import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import com.okinc.business.market.features.holdings.ui.PositionSortType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.view.OKSortTextView;
import com.reown.android.pulse.model.EventType;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC21875hPo;
import o.C26213jWc;
import o.C26231jWu;
import o.C26235jWy;
import o.C28444kar;
import o.C29229kph;
import o.C31200lpY;
import o.C32979mnm;
import o.C32986mnt;
import o.C33566myq;
import o.C33570myu;
import o.C55113xdn;
import o.C55173xeu;
import o.C55298xhM;
import o.C56390yDp;
import o.C56444yFp;
import o.C58114yvF;
import o.InterfaceC26229jWs;
import o.InterfaceC46547tYj;
import o.InterfaceC56445yFq;
import o.gKZ;
import o.jWB;
import o.jWL;
import o.jWM;
import o.jWN;
import o.jWO;
import o.jWP;
import o.jWQ;
import o.mND;
import o.mNF;
import o.mNN;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DexFloatWindowManager implements InterfaceC46547tYj {
    public static final int AEQbTJ;
    public static DexFloatWindowMode AYXKKw;
    public static DexFloatWindowMode AhwBna;
    public static int AkhnZx;
    public static int AuCTel;
    public static final TaskDescription DbNXlk;
    public static WeakReference<View> KWHzl;
    public static Job djBIcL;
    public static jWB ejfBZ;
    public static int fARcdN;
    public static final int fIwbmz;
    public static final int fJNWhG;
    public static final Application fetchVPNInfo;
    public static int gEmmrt;
    public static jWM getFieldNames;
    public static jWQ getNewProxyInstance;
    public static FloatWindowViewModel hDKMBd;
    public static jWL isConnected;
    public static CoroutineScope iwGUEr;
    public static C26235jWy uzCIH;
    public static jWL.Activity valueOf;
    public static jWP values;
    public static final DexFloatWindowManager copydefault = new DexFloatWindowManager();
    public static final String EZpvd = "DexFloatWindow";
    public static final android.app.Application OLrzqt = C32979mnm.EZpvd.OLrzqt();

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DexFloatWindowMode.values().length];
            try {
                iArr[DexFloatWindowMode.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DexFloatWindowMode.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DexFloatWindowMode.MINIMIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26235jWy fIwbmz() {
        return uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexFloatWindowMode fJNWhG() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexFloatWindowMode isConnected() {
        return AhwBna;
    }

    private DexFloatWindowManager() {
    }

    static {
        DexFloatWindowMode dexFloatWindowMode = DexFloatWindowMode.MEDIUM;
        AhwBna = dexFloatWindowMode;
        AYXKKw = dexFloatWindowMode;
        AkhnZx = 200;
        AuCTel = 200;
        fIwbmz = C55298xhM.dp2px$default(40.0f, null, 1, null);
        fJNWhG = C55298xhM.dp2px$default(92.0f, null, 1, null);
        DbNXlk = new TaskDescription();
        fetchVPNInfo = new Application();
        AEQbTJ = 8;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DexFloatWindowMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DexFloatWindowMode[] $VALUES;
        public static final DexFloatWindowMode MINIMIZE = new DexFloatWindowMode("MINIMIZE", 0);
        public static final DexFloatWindowMode MEDIUM = new DexFloatWindowMode(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1);
        public static final DexFloatWindowMode LARGE = new DexFloatWindowMode("LARGE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DexFloatWindowMode[] $values() {
            return new DexFloatWindowMode[]{MINIMIZE, MEDIUM, LARGE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DexFloatWindowMode> getEntries() {
            return $ENTRIES;
        }

        private DexFloatWindowMode(String str, int i) {
        }

        static {
            DexFloatWindowMode[] dexFloatWindowModeArr$values = $values();
            $VALUES = dexFloatWindowModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(dexFloatWindowModeArr$values);
        }

        public static DexFloatWindowMode valueOf(String str) {
            return (DexFloatWindowMode) Enum.valueOf(DexFloatWindowMode.class, str);
        }

        public static DexFloatWindowMode[] values() {
            return (DexFloatWindowMode[]) $VALUES.clone();
        }
    }

    public static final class TaskDescription implements mNN {
        @Override // o.mNN
        public void AYXKKw() {
        }

        @Override // o.mNN
        public void EZpvd() {
        }

        @Override // o.mNN
        public void KWHzl() {
        }

        @Override // o.mNN
        public void OLrzqt() {
        }

        @Override // o.mNN
        public void bi_() {
        }

        @Override // o.mNN
        public void copydefault() {
        }

        @Override // o.mNN
        public void OLrzqt(int i, int i2) {
            if (DexFloatWindowManager.AhwBna == DexFloatWindowMode.MEDIUM) {
                DexFloatWindowManager dexFloatWindowManager = DexFloatWindowManager.copydefault;
                DexFloatWindowManager.gEmmrt = i;
                DexFloatWindowManager.AkhnZx = i2;
                DexFloatWindowManager.fARcdN = i;
                DexFloatWindowManager.AuCTel = i2;
                return;
            }
            if (DexFloatWindowManager.AhwBna == DexFloatWindowMode.MINIMIZE) {
                DexFloatWindowManager dexFloatWindowManager2 = DexFloatWindowManager.copydefault;
                DexFloatWindowManager.gEmmrt = i;
                DexFloatWindowManager.AkhnZx = i2;
            }
        }
    }

    public static final class Application implements mNN {
        @Override // o.mNN
        public void EZpvd() {
        }

        @Override // o.mNN
        public void KWHzl() {
        }

        @Override // o.mNN
        public void OLrzqt() {
        }

        @Override // o.mNN
        public void OLrzqt(int i, int i2) {
            jWP jwp;
            if (DexFloatWindowManager.values == null || (jwp = DexFloatWindowManager.values) == null) {
                return;
            }
            jwp.setPosition(1);
        }

        @Override // o.mNN
        public void AYXKKw() {
            mNF mnfOLrzqt = mND.OLrzqt("dex_float_window");
            int iValueOf = mnfOLrzqt != null ? mnfOLrzqt.valueOf() : DexFloatWindowManager.gEmmrt;
            if (DexFloatWindowManager.values == null) {
                pUU.copydefault(DexFloatWindowManager.EZpvd, "Show: mFloatLayoutLogo is NULL!");
                return;
            }
            if (iValueOf > 0) {
                jWP jwp = DexFloatWindowManager.values;
                if (jwp != null) {
                    jwp.setPosition(2);
                    return;
                }
                return;
            }
            jWP jwp2 = DexFloatWindowManager.values;
            if (jwp2 != null) {
                jwp2.setPosition(0);
            }
        }

        @Override // o.mNN
        public void copydefault() {
            jWP jwp = DexFloatWindowManager.values;
            if (jwp != null) {
                jwp.setPosition(1);
            }
        }

        @Override // o.mNN
        public void bi_() {
            mNF mnfOLrzqt = mND.OLrzqt("dex_float_window");
            if (mnfOLrzqt == null || DexFloatWindowManager.AhwBna != DexFloatWindowMode.MINIMIZE) {
                return;
            }
            DexFloatWindowManager dexFloatWindowManager = DexFloatWindowManager.copydefault;
            DexFloatWindowManager.gEmmrt = mnfOLrzqt.valueOf();
            DexFloatWindowManager.AkhnZx = mnfOLrzqt.AhwBna();
            if (DexFloatWindowManager.values != null) {
                if (DexFloatWindowManager.gEmmrt > 0) {
                    jWP jwp = DexFloatWindowManager.values;
                    if (jwp != null) {
                        jwp.setPosition(2);
                        return;
                    }
                    return;
                }
                jWP jwp2 = DexFloatWindowManager.values;
                if (jwp2 != null) {
                    jwp2.setPosition(0);
                    return;
                }
                return;
            }
            pUU.copydefault(DexFloatWindowManager.EZpvd, "Move end: mFloatLayoutLogo is NULL!");
        }
    }

    public static /* synthetic */ void showFloatWindow$default(DexFloatWindowManager dexFloatWindowManager, DexFloatWindowMode dexFloatWindowMode, int i, Object obj) {
        if ((i & 1) != 0) {
            dexFloatWindowMode = dexFloatWindowManager.fARcdN();
        }
        dexFloatWindowManager.KWHzl(dexFloatWindowMode);
    }

    public final void KWHzl(@NotNull DexFloatWindowMode dexFloatWindowMode) {
        FloatWindowViewModel floatWindowViewModel;
        StateFlow<jWO> stateFlowAEQbTJ;
        FloatWindowViewModel floatWindowViewModel2;
        Intrinsics.checkNotNullParameter(dexFloatWindowMode, "");
        DexFloatWindowMode dexFloatWindowMode2 = AhwBna;
        DexFloatWindowMode dexFloatWindowMode3 = DexFloatWindowMode.MINIMIZE;
        boolean z = dexFloatWindowMode2 == dexFloatWindowMode3;
        if (z) {
            C29229kph.KWHzl(false);
        } else if (dexFloatWindowMode == dexFloatWindowMode3) {
            C29229kph.KWHzl(true);
        }
        try {
            if (getNewProxyInstance()) {
                mND.EZpvd("dex_float_window");
                WeakReference<View> weakReference = KWHzl;
                if (weakReference != null) {
                    weakReference.clear();
                }
                KWHzl = null;
                values = null;
            }
            if (dexFloatWindowMode == dexFloatWindowMode3) {
                AYXKKw = AhwBna;
            }
            AhwBna = dexFloatWindowMode;
            View viewEZpvd = EZpvd(dexFloatWindowMode);
            KWHzl = new WeakReference<>(viewEZpvd);
            if (z && (floatWindowViewModel2 = hDKMBd) != null) {
                floatWindowViewModel2.EZpvd();
            }
            AuCTelauCTel();
            Pair<Integer, Integer> pairCopydefault = copydefault(dexFloatWindowMode);
            int iIntValue = pairCopydefault.component1().intValue();
            int iIntValue2 = pairCopydefault.component2().intValue();
            C33566myq c33566myq = C33566myq.EZpvd;
            android.app.Application application = OLrzqt;
            StateListAnimator stateListAnimatorKWHzl = KWHzl(dexFloatWindowMode, c33566myq.EZpvd(application), c33566myq.OLrzqt(application), C33570myu.KWHzl(application));
            if (dexFloatWindowMode != DexFloatWindowMode.LARGE) {
                gEmmrt = stateListAnimatorKWHzl.AEQbTJ();
                AkhnZx = stateListAnimatorKWHzl.OLrzqt();
            }
            Activity activityEZpvd = EZpvd(dexFloatWindowMode, iIntValue2);
            mND.StateListAnimator stateListAnimatorOLrzqt = mND.KWHzl(application).EZpvd(viewEZpvd).AEQbTJ("dex_float_window").AEQbTJ(iIntValue).copydefault(stateListAnimatorKWHzl.AEQbTJ()).OLrzqt(stateListAnimatorKWHzl.OLrzqt());
            if (activityEZpvd.copydefault() > 0) {
                stateListAnimatorOLrzqt.EZpvd(activityEZpvd.copydefault());
            }
            stateListAnimatorOLrzqt.KWHzl(activityEZpvd.EZpvd()).EZpvd(activityEZpvd.AEQbTJ()).KWHzl(true).KWHzl();
            mNF mnfOLrzqt = mND.OLrzqt("dex_float_window");
            if (mnfOLrzqt != null) {
                mnfOLrzqt.isConnected();
            }
            if (dexFloatWindowMode == dexFloatWindowMode3) {
                FloatWindowViewModel floatWindowViewModel3 = hDKMBd;
                if (floatWindowViewModel3 != null) {
                    floatWindowViewModel3.valueOf();
                    return;
                }
                return;
            }
            if (z) {
                FloatWindowViewModel floatWindowViewModel4 = hDKMBd;
                if (floatWindowViewModel4 != null) {
                    FloatWindowViewModel.getHoldingToken$default(floatWindowViewModel4, false, true, 1, null);
                    return;
                }
                return;
            }
            FloatWindowViewModel floatWindowViewModel5 = hDKMBd;
            if ((((floatWindowViewModel5 == null || (stateFlowAEQbTJ = floatWindowViewModel5.AEQbTJ()) == null) ? null : stateFlowAEQbTJ.getValue()) instanceof jWO.Activity) || (floatWindowViewModel = hDKMBd) == null) {
                return;
            }
            FloatWindowViewModel.getHoldingToken$default(floatWindowViewModel, false, false, 1, null);
        } catch (Exception e) {
            pUU.AEQbTJ(EZpvd, "Failed to show float window", e);
        }
    }

    public final View EZpvd(DexFloatWindowMode dexFloatWindowMode) {
        jWL jwl = isConnected;
        if (jwl != null) {
            Function1<? super DexFloatWindowMode, Unit> function1 = new Function1() { // from class: o.jWj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexFloatWindowManager.OLrzqt((DexFloatWindowManager.DexFloatWindowMode) obj);
                }
            };
            Function1<? super jWL.Activity, Unit> function12 = new Function1() { // from class: o.jWk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexFloatWindowManager.KWHzl((jWL.Activity) obj);
                }
            };
            FloatWindowViewModel floatWindowViewModel = hDKMBd;
            final View viewOLrzqt = jwl.OLrzqt(dexFloatWindowMode, function1, function12, floatWindowViewModel != null ? floatWindowViewModel.copydefault() : true);
            if (viewOLrzqt != null) {
                if (dexFloatWindowMode == DexFloatWindowMode.MEDIUM && (viewOLrzqt instanceof ViewGroup)) {
                    C26213jWc c26213jWcCopydefault = C26231jWu.copydefault(viewOLrzqt, OLrzqt);
                    c26213jWcCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.jWl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            DexFloatWindowManager.EZpvd(viewOLrzqt, view);
                        }
                    });
                    return c26213jWcCopydefault;
                }
                if (dexFloatWindowMode == DexFloatWindowMode.MINIMIZE && (viewOLrzqt instanceof jWP)) {
                    values = (jWP) viewOLrzqt;
                }
                return viewOLrzqt;
            }
        }
        throw new IllegalStateException("LayoutFactory not initialized");
    }

    public static final Unit OLrzqt(DexFloatWindowMode dexFloatWindowMode) {
        Intrinsics.checkNotNullParameter(dexFloatWindowMode, "");
        copydefault.KWHzl(dexFloatWindowMode);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(jWL.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        valueOf = activity;
        copydefault.EZpvd(activity);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(View view, View view2) {
        jWB jwb;
        Intrinsics.copydefault(view2, "");
        C26213jWc c26213jWc = (C26213jWc) view2;
        jWL.Activity activity = valueOf;
        if (activity == null || (jwb = ejfBZ) == null) {
            return;
        }
        jwb.EZpvd(c26213jWc, view, activity, new Function0() { // from class: o.jWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexFloatWindowManager.AhwBna();
            }
        }, new Function0() { // from class: o.jWr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexFloatWindowManager.AkhnZx();
            }
        }, new Function0() { // from class: o.jWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexFloatWindowManager.DbNXlk();
            }
        }, new Function1() { // from class: o.jWq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexFloatWindowManager.OLrzqt((HoldingAsset) obj);
            }
        });
    }

    public static final Unit AhwBna() {
        copydefault.AEQbTJ(false);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx() {
        copydefault.AEQbTJ(true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.market.features.floatwindow.ui.FloatWindowViewModel.getHoldingToken$default(com.okinc.business.market.features.floatwindow.ui.FloatWindowViewModel, boolean, boolean, int, java.lang.Object):void */
    public static final Unit DbNXlk() {
        FloatWindowViewModel floatWindowViewModel = hDKMBd;
        if (floatWindowViewModel != null) {
            FloatWindowViewModel.getHoldingToken$default(floatWindowViewModel, false, false, 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(HoldingAsset holdingAsset) {
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        copydefault.EZpvd(holdingAsset);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final jWL.Activity activity) {
        C28444kar c28444karKWHzl;
        OKSortTextView oKSortTextView;
        AppCompatImageView appCompatImageView;
        final OKSortTextView oKSortTextView2;
        final OKSortTextView oKSortTextView3;
        C55173xeu c55173xeu;
        jWN jwnOLrzqt = activity.OLrzqt();
        if (jwnOLrzqt != null) {
            jwnOLrzqt.AEQbTJ(new Function2() { // from class: o.jWn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return DexFloatWindowManager.KWHzl(((java.lang.Integer) obj).intValue(), (HoldingAsset) obj2);
                }
            });
        }
        jWN jwnOLrzqt2 = activity.OLrzqt();
        if (jwnOLrzqt2 != null) {
            jwnOLrzqt2.copydefault(new Function2() { // from class: o.jWv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return DexFloatWindowManager.copydefault(((java.lang.Integer) obj).intValue(), (HoldingAsset) obj2);
                }
            });
        }
        WeakReference<C55173xeu> weakReferenceAYXKKw = activity.AYXKKw();
        if (weakReferenceAYXKKw != null && (c55173xeu = weakReferenceAYXKKw.get()) != null) {
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jWt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    DexFloatWindowManager.EZpvd(view);
                }
            });
        }
        WeakReference<OKSortTextView> weakReferenceAEQbTJ = activity.AEQbTJ();
        if (weakReferenceAEQbTJ != null && (oKSortTextView3 = weakReferenceAEQbTJ.get()) != null) {
            oKSortTextView3.setOnClickListener(new View.OnClickListener() { // from class: o.jWf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    DexFloatWindowManager.EZpvd(oKSortTextView3, activity, view);
                }
            });
        }
        WeakReference<OKSortTextView> weakReferenceEZpvd = activity.EZpvd();
        if (weakReferenceEZpvd != null && (oKSortTextView2 = weakReferenceEZpvd.get()) != null) {
            oKSortTextView2.setOnClickListener(new View.OnClickListener() { // from class: o.jWd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    DexFloatWindowManager.KWHzl(oKSortTextView2, activity, view);
                }
            });
        }
        WeakReference<AppCompatImageView> weakReferenceAhwBna = activity.AhwBna();
        if (weakReferenceAhwBna != null && (appCompatImageView = weakReferenceAhwBna.get()) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.jWe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    DexFloatWindowManager.AEQbTJ(view);
                }
            });
        }
        FloatWindowViewModel floatWindowViewModel = hDKMBd;
        if (floatWindowViewModel == null || (c28444karKWHzl = floatWindowViewModel.KWHzl()) == null) {
            return;
        }
        WeakReference<OKSortTextView> weakReferenceEZpvd2 = c28444karKWHzl.KWHzl() == PositionSortType.PNL ? activity.EZpvd() : activity.AEQbTJ();
        OKSortTextView.SortType sortType = c28444karKWHzl.EZpvd() ? OKSortTextView.SortType.DOWN : OKSortTextView.SortType.UP;
        if (weakReferenceEZpvd2 == null || (oKSortTextView = weakReferenceEZpvd2.get()) == null) {
            return;
        }
        oKSortTextView.setSortType(sortType, false);
    }

    public static final Unit KWHzl(int i, HoldingAsset holdingAsset) {
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        copydefault.AEQbTJ(holdingAsset);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(int i, HoldingAsset holdingAsset) {
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        copydefault.EZpvd(holdingAsset);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(View view) {
        FloatWindowViewModel floatWindowViewModel = hDKMBd;
        if (floatWindowViewModel != null) {
            FloatWindowViewModel.getHoldingToken$default(floatWindowViewModel, false, false, 3, null);
        }
    }

    public static final void EZpvd(OKSortTextView oKSortTextView, jWL.Activity activity, View view) {
        OKSortTextView oKSortTextView2;
        OKSortTextView.SortType sortTypeOLrzqt = copydefault.OLrzqt(oKSortTextView.AEQbTJ());
        OKSortTextView.setSortType$default(oKSortTextView, sortTypeOLrzqt, false, 2, null);
        WeakReference<OKSortTextView> weakReferenceEZpvd = activity.EZpvd();
        if (weakReferenceEZpvd != null && (oKSortTextView2 = weakReferenceEZpvd.get()) != null) {
            oKSortTextView2.setSortType(OKSortTextView.SortType.NONE, false);
        }
        FloatWindowViewModel floatWindowViewModel = hDKMBd;
        if (floatWindowViewModel != null) {
            floatWindowViewModel.AEQbTJ(new C28444kar(PositionSortType.BALANCE, sortTypeOLrzqt == OKSortTextView.SortType.DOWN));
        }
    }

    public static final void KWHzl(OKSortTextView oKSortTextView, jWL.Activity activity, View view) {
        OKSortTextView oKSortTextView2;
        OKSortTextView.SortType sortTypeOLrzqt = copydefault.OLrzqt(oKSortTextView.AEQbTJ());
        OKSortTextView.setSortType$default(oKSortTextView, sortTypeOLrzqt, false, 2, null);
        WeakReference<OKSortTextView> weakReferenceAEQbTJ = activity.AEQbTJ();
        if (weakReferenceAEQbTJ != null && (oKSortTextView2 = weakReferenceAEQbTJ.get()) != null) {
            oKSortTextView2.setSortType(OKSortTextView.SortType.NONE, false);
        }
        FloatWindowViewModel floatWindowViewModel = hDKMBd;
        if (floatWindowViewModel != null) {
            floatWindowViewModel.AEQbTJ(new C28444kar(PositionSortType.PNL, sortTypeOLrzqt == OKSortTextView.SortType.DOWN));
        }
    }

    public static final void AEQbTJ(View view) {
        copydefault.hDKMBd();
    }

    public final OKSortTextView.SortType OLrzqt(OKSortTextView.SortType sortType) {
        OKSortTextView.SortType sortType2 = OKSortTextView.SortType.DOWN;
        return sortType == sortType2 ? OKSortTextView.SortType.UP : sortType2;
    }

    public final Pair<Integer, Integer> copydefault(DexFloatWindowMode dexFloatWindowMode) {
        Pair<Integer, Integer> pairCopydefault;
        jWL jwl = isConnected;
        return (jwl == null || (pairCopydefault = jwl.copydefault(dexFloatWindowMode)) == null) ? new Pair<>(0, 0) : pairCopydefault;
    }

    public final StateListAnimator KWHzl(DexFloatWindowMode dexFloatWindowMode, int i, int i2, int i3) {
        int i4 = ActionBar.OLrzqt[dexFloatWindowMode.ordinal()];
        int i5 = 0;
        if (i4 == 1) {
            int i6 = gEmmrt;
            if (i6 > 0) {
                int i7 = fJNWhG;
                i5 = i6 + i7 > i ? i - i7 : i6;
            }
            int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(100.0f, null, 1, null);
            int iDp2px$default3 = C55298xhM.dp2px$default(260.0f, null, 1, null);
            int i8 = AkhnZx;
            if (i8 >= iDp2px$default) {
                int i9 = (i2 - i3) - iDp2px$default2;
                iDp2px$default = i8 + iDp2px$default3 > i9 ? i9 - iDp2px$default3 : i8;
            }
            return new StateListAnimator(i5, iDp2px$default);
        }
        if (i4 == 2) {
            return new StateListAnimator(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null));
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = gEmmrt;
        int i11 = AkhnZx;
        if (i10 <= 0) {
            i5 = i10;
        } else if (i10 > i / 2) {
            i5 = i - fIwbmz;
        }
        int i12 = (i2 - fIwbmz) - i3;
        if (i11 > i12) {
            i11 = i12;
        }
        return new StateListAnimator(i5, i11);
    }

    public final Activity EZpvd(DexFloatWindowMode dexFloatWindowMode, int i) {
        int i2 = ActionBar.OLrzqt[dexFloatWindowMode.ordinal()];
        if (i2 == 1) {
            return new Activity(0, 5, DbNXlk);
        }
        if (i2 == 2) {
            return new Activity(i, 1, DbNXlk);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new Activity(fIwbmz, 3, fetchVPNInfo);
    }

    public static final class StateListAnimator {
        public final int KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = stateListAnimator.copydefault;
            }
            if ((i3 & 2) != 0) {
                i2 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.copydefault(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(int i, int i2) {
            return new StateListAnimator(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.copydefault == stateListAnimator.copydefault && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.copydefault) * 31) + Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WindowPosition(x=" + this.copydefault + ", y=" + this.KWHzl + ")";
        }

        public StateListAnimator(int i, int i2) {
            this.copydefault = i;
            this.KWHzl = i2;
        }
    }

    public static final class Activity {
        public final int KWHzl;
        public final mNN OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, int i2, mNN mnn, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = activity.KWHzl;
            }
            if ((i3 & 2) != 0) {
                i2 = activity.copydefault;
            }
            if ((i3 & 4) != 0) {
                mnn = activity.OLrzqt;
            }
            return activity.EZpvd(i, i2, mnn);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final mNN AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(int i, int i2, @NotNull mNN mnn) {
            Intrinsics.checkNotNullParameter(mnn, "");
            return new Activity(i, i2, mnn);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.KWHzl == activity.KWHzl && this.copydefault == activity.copydefault && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Integer.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FloatWindowConfig(height=" + this.KWHzl + ", moveType=" + this.copydefault + ", viewStateListener=" + this.OLrzqt + ")";
        }

        public Activity(int i, int i2, @NotNull mNN mnn) {
            Intrinsics.checkNotNullParameter(mnn, "");
            this.KWHzl = i;
            this.copydefault = i2;
            this.OLrzqt = mnn;
        }
    }

    public final InterfaceC26229jWs ejfBZ() {
        try {
            if (uzCIH != null && getFieldNames != null && isConnected != null && getNewProxyInstance != null && ejfBZ != null) {
                return null;
            }
            InterfaceC26229jWs interfaceC26229jWs = (InterfaceC26229jWs) C58114yvF.OLrzqt(OLrzqt, InterfaceC26229jWs.class);
            uzCIH = interfaceC26229jWs.RcXXUw();
            getFieldNames = interfaceC26229jWs.djSkpj();
            isConnected = interfaceC26229jWs.QbewEr();
            getNewProxyInstance = interfaceC26229jWs.aKErDB();
            ejfBZ = interfaceC26229jWs.QfsBiF();
            return interfaceC26229jWs;
        } catch (Exception e) {
            pUU.AEQbTJ(EZpvd, "Failed to initialize managers", e);
            return null;
        }
    }

    public final void AuCTel() {
        try {
            if (hDKMBd != null) {
                return;
            }
            InterfaceC26229jWs interfaceC26229jWsEjfBZ = ejfBZ();
            if (interfaceC26229jWsEjfBZ == null) {
                interfaceC26229jWsEjfBZ = (InterfaceC26229jWs) C58114yvF.OLrzqt(OLrzqt, InterfaceC26229jWs.class);
            }
            hDKMBd = new FloatWindowViewModel(interfaceC26229jWsEjfBZ.UeEOUB(), interfaceC26229jWsEjfBZ.wlaJM());
            iwGUEr = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
            AuCTelauCTel();
        } catch (Exception e) {
            pUU.AEQbTJ(EZpvd, "Failed to initialize ViewModel", e);
        }
    }

    public final void AuCTelauCTel() {
        Job job = djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        CoroutineScope coroutineScope = iwGUEr;
        Job jobLaunch$default = coroutineScope != null ? BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DexFloatWindowManager$startDataObservation$1(null), 3, null) : null;
        djBIcL = jobLaunch$default;
        if (jobLaunch$default != null) {
            jobLaunch$default.invokeOnCompletion(new Function1() { // from class: o.jWi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexFloatWindowManager.AEQbTJ((java.lang.Throwable) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(Throwable th) {
        if (th != null) {
            pUU.copydefault(EZpvd, "Flow collection job completed with error: " + th);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final jWO jwo, boolean z) {
        WeakReference<ViewFlipper> weakReferenceFIwbmz;
        ViewFlipper viewFlipper;
        WeakReference<C55113xdn> weakReferenceGEmmrt;
        final List<HoldingAsset> listAhwBna;
        jWB jwb;
        WeakReference<View> weakReferenceDbNXlk;
        View view;
        WeakReference<C55113xdn> weakReferenceKWHzl;
        WeakReference<ViewFlipper> weakReferenceDjBIcL;
        jWL.Activity activity = valueOf;
        C55113xdn c55113xdn = null;
        jWN jwnOLrzqt = activity != null ? activity.OLrzqt() : null;
        if (z) {
            jWL.Activity activity2 = valueOf;
            viewFlipper = (activity2 == null || (weakReferenceDjBIcL = activity2.djBIcL()) == null) ? null : weakReferenceDjBIcL.get();
        } else {
            jWL.Activity activity3 = valueOf;
            if (activity3 != null && (weakReferenceFIwbmz = activity3.fIwbmz()) != null) {
                viewFlipper = weakReferenceFIwbmz.get();
            }
        }
        if (z) {
            jWL.Activity activity4 = valueOf;
            if (activity4 != null && (weakReferenceKWHzl = activity4.KWHzl()) != null) {
                c55113xdn = weakReferenceKWHzl.get();
            }
        } else {
            jWL.Activity activity5 = valueOf;
            if (activity5 != null && (weakReferenceGEmmrt = activity5.gEmmrt()) != null) {
                c55113xdn = weakReferenceGEmmrt.get();
            }
        }
        if (Intrinsics.EZpvd(jwo, jWO.StateListAnimator.KWHzl)) {
            if (viewFlipper != null) {
                viewFlipper.setDisplayedChild(FloatingView.LOADING.getPosition());
            }
            if (c55113xdn != null) {
                c55113xdn.playAnimation();
            }
            if (z) {
                return;
            }
            AEQbTJ(0, 0);
            return;
        }
        if (jwo instanceof jWO.Activity) {
            jWO.Activity activity6 = (jWO.Activity) jwo;
            if (activity6.copydefault().isEmpty()) {
                if (viewFlipper != null) {
                    viewFlipper.setDisplayedChild(FloatingView.EMPTY.getPosition());
                }
                jWL.Activity activity7 = valueOf;
                if (activity7 != null && (weakReferenceDbNXlk = activity7.DbNXlk()) != null && (view = weakReferenceDbNXlk.get()) != null) {
                    view.setVisibility(8);
                }
                if (jwnOLrzqt != null) {
                    jwnOLrzqt.submitList(yDY.AhwBna());
                }
                if (!z) {
                    AEQbTJ(0, 0);
                }
            } else {
                if (viewFlipper != null) {
                    viewFlipper.setDisplayedChild(FloatingView.DATA.getPosition());
                }
                if (!z) {
                    jWB jwb2 = ejfBZ;
                    int iCopydefault = jwb2 != null ? jwb2.copydefault() : 1;
                    int iMin = Math.min(iCopydefault, Math.max(1, (int) Math.ceil(((double) activity6.copydefault().size()) / ((double) 4))));
                    if (iMin != iCopydefault && (jwb = ejfBZ) != null) {
                        jwb.AEQbTJ(iMin);
                    }
                    jWB jwb3 = ejfBZ;
                    if (jwb3 == null || (listAhwBna = jwb3.OLrzqt(activity6.copydefault())) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    if (jwnOLrzqt != null) {
                        jwnOLrzqt.submitList(listAhwBna, new Runnable() { // from class: o.jWm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                DexFloatWindowManager.copydefault(listAhwBna, jwo);
                            }
                        });
                    }
                    zLjUOn();
                } else if (jwnOLrzqt != null) {
                    jwnOLrzqt.submitList(activity6.copydefault(), new Runnable() { // from class: o.jWg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            DexFloatWindowManager.copydefault(jwo);
                        }
                    });
                }
            }
            if (c55113xdn != null) {
                c55113xdn.pauseAnimation();
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(jwo, jWO.ActionBar.AEQbTJ)) {
            if (viewFlipper != null) {
                viewFlipper.setDisplayedChild(FloatingView.ERROR.getPosition());
            }
            if (c55113xdn != null) {
                c55113xdn.pauseAnimation();
            }
            if (z) {
                return;
            }
            AEQbTJ(0, 0);
            return;
        }
        if (!(jwo instanceof jWO.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        if (viewFlipper != null) {
            viewFlipper.setDisplayedChild(FloatingView.NO_WALLET.getPosition());
        }
        if (c55113xdn != null) {
            c55113xdn.pauseAnimation();
        }
        if (z) {
            return;
        }
        AEQbTJ(0, 0);
    }

    public static final void copydefault(jWO jwo) {
        jWL.Activity activity;
        WeakReference<RecyclerView> weakReferenceCopydefault;
        RecyclerView recyclerView;
        if (!((jWO.Activity) jwo).EZpvd() || (activity = valueOf) == null || (weakReferenceCopydefault = activity.copydefault()) == null || (recyclerView = weakReferenceCopydefault.get()) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public static final void copydefault(List list, jWO jwo) {
        copydefault.AEQbTJ(list.size(), ((jWO.Activity) jwo).copydefault().size());
    }

    public final void AEQbTJ(int i, int i2) {
        WeakReference<RecyclerView> weakReferenceIsConnected;
        RecyclerView recyclerView;
        jWL.Activity activity;
        WeakReference<ViewFlipper> weakReferenceFIwbmz;
        ViewFlipper viewFlipper;
        jWL.Activity activity2 = valueOf;
        if (activity2 == null || (weakReferenceIsConnected = activity2.isConnected()) == null || (recyclerView = weakReferenceIsConnected.get()) == null || (activity = valueOf) == null || (weakReferenceFIwbmz = activity.fIwbmz()) == null || (viewFlipper = weakReferenceFIwbmz.get()) == null) {
            return;
        }
        View childAt = recyclerView.getChildAt(0);
        int measuredHeight = childAt != null ? childAt.getMeasuredHeight() : C55298xhM.dp2px$default(56.0f, null, 1, null);
        if (i2 > 4) {
            i = 4;
        } else if (i == 0) {
            i = 2;
        }
        int i3 = measuredHeight * i;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i3;
            recyclerView.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = viewFlipper.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = i3;
                viewFlipper.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(boolean z) {
        int i;
        jWN jwnOLrzqt;
        StateFlow<jWO> stateFlowAEQbTJ;
        FloatWindowViewModel floatWindowViewModel = hDKMBd;
        jWO value = (floatWindowViewModel == null || (stateFlowAEQbTJ = floatWindowViewModel.AEQbTJ()) == null) ? null : stateFlowAEQbTJ.getValue();
        if (value instanceof jWO.Activity) {
            jWO.Activity activity = (jWO.Activity) value;
            if (!activity.copydefault().isEmpty()) {
                List<HoldingAsset> listCopydefault = activity.copydefault();
                final int size = listCopydefault.size();
                int iMax = Math.max(1, (int) Math.ceil(((double) size) / ((double) 4)));
                jWB jwb = ejfBZ;
                int iCopydefault = jwb != null ? jwb.copydefault() : 1;
                if (z) {
                    i = iCopydefault < iMax ? iCopydefault + 1 : iCopydefault;
                } else if (iCopydefault > 1) {
                    i = iCopydefault - 1;
                }
                if (i != iCopydefault) {
                    jWB jwb2 = ejfBZ;
                    if (jwb2 != null) {
                        jwb2.AEQbTJ(i);
                    }
                    int i2 = (i - 1) * 4;
                    final List<HoldingAsset> listSubList = listCopydefault.subList(i2, Math.min(i2 + 4, size));
                    jWL.Activity activity2 = valueOf;
                    if (activity2 != null && (jwnOLrzqt = activity2.OLrzqt()) != null) {
                        jwnOLrzqt.submitList(listSubList, new Runnable() { // from class: o.jWh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                DexFloatWindowManager.EZpvd(listSubList, size);
                            }
                        });
                    }
                    zLjUOn();
                }
            }
        }
    }

    public static final void EZpvd(List list, int i) {
        copydefault.AEQbTJ(list.size(), i);
    }

    public final void zLjUOn() {
        jWB jwb;
        StateFlow<jWO> stateFlowAEQbTJ;
        WeakReference<View> weakReferenceDbNXlk;
        View view;
        if (AhwBna != DexFloatWindowMode.MEDIUM) {
            return;
        }
        jWL.Activity activity = valueOf;
        if (activity != null && (weakReferenceDbNXlk = activity.DbNXlk()) != null && (view = weakReferenceDbNXlk.get()) != null) {
            view.setVisibility(0);
        }
        FloatWindowViewModel floatWindowViewModel = hDKMBd;
        jWO value = (floatWindowViewModel == null || (stateFlowAEQbTJ = floatWindowViewModel.AEQbTJ()) == null) ? null : stateFlowAEQbTJ.getValue();
        if (!(value instanceof jWO.Activity) || valueOf == null || (jwb = ejfBZ) == null) {
            return;
        }
        List<HoldingAsset> listCopydefault = ((jWO.Activity) value).copydefault();
        jWL.Activity activity2 = valueOf;
        WeakReference<TextView> weakReferenceValueOf = activity2 != null ? activity2.valueOf() : null;
        jWL.Activity activity3 = valueOf;
        WeakReference<View> weakReferenceDbNXlk2 = activity3 != null ? activity3.DbNXlk() : null;
        jWL.Activity activity4 = valueOf;
        WeakReference<ImageView> weakReferenceAkhnZx = activity4 != null ? activity4.AkhnZx() : null;
        jWL.Activity activity5 = valueOf;
        jwb.copydefault(listCopydefault, weakReferenceValueOf, weakReferenceDbNXlk2, weakReferenceAkhnZx, activity5 != null ? activity5.fetchVPNInfo() : null);
    }

    public final void values() {
        try {
            FloatWindowViewModel floatWindowViewModel = hDKMBd;
            if (floatWindowViewModel != null) {
                floatWindowViewModel.valueOf();
            }
            Job job = djBIcL;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            djBIcL = null;
            CoroutineScope coroutineScope = iwGUEr;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
            iwGUEr = null;
            hDKMBd = null;
        } catch (Exception e) {
            pUU.AEQbTJ(EZpvd, "Failed to cleanup ViewModel", e);
        }
    }

    public final void iwGUEr() {
        Pair pair;
        try {
            if (getNewProxyInstance()) {
                mNF mnfOLrzqt = mND.OLrzqt("dex_float_window");
                if (AhwBna == DexFloatWindowMode.LARGE) {
                    pair = new Pair(Integer.valueOf(fARcdN), Integer.valueOf(AuCTel));
                } else {
                    pair = new Pair(Integer.valueOf(mnfOLrzqt != null ? mnfOLrzqt.valueOf() : gEmmrt), Integer.valueOf(mnfOLrzqt != null ? mnfOLrzqt.AhwBna() : AkhnZx));
                }
                int iIntValue = ((Number) pair.component1()).intValue();
                int iIntValue2 = ((Number) pair.component2()).intValue();
                jWQ jwq = getNewProxyInstance;
                if (jwq != null) {
                    jwq.KWHzl(true, AhwBna, iIntValue, iIntValue2, CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()));
                }
                fetchVPNInfo();
            }
        } catch (Exception e) {
            pUU.AEQbTJ(EZpvd, "Failed to save state and destroy window", e);
        }
    }

    public final void uzCIH() {
        try {
            AuCTel();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new DexFloatWindowManager$restoreFromSavedState$1(null), 3, null);
        } catch (Exception e) {
            pUU.AEQbTJ(EZpvd, "Failed to restore from saved state", e);
        }
    }

    public final void fetchVPNInfo() {
        try {
            values();
            mND.EZpvd("dex_float_window");
            WeakReference<View> weakReference = KWHzl;
            if (weakReference != null) {
                weakReference.clear();
            }
            KWHzl = null;
            valueOf = null;
            values = null;
            DexFloatWindowMode dexFloatWindowMode = DexFloatWindowMode.MEDIUM;
            AhwBna = dexFloatWindowMode;
            AYXKKw = dexFloatWindowMode;
        } catch (Exception e) {
            pUU.AEQbTJ(EZpvd, "Failed to destroy float window", e);
        }
    }

    public final DexFloatWindowMode fARcdN() {
        return getNewProxyInstance() ? AhwBna : AYXKKw != DexFloatWindowMode.MINIMIZE ? AYXKKw : DexFloatWindowMode.MEDIUM;
    }

    public final boolean getNewProxyInstance() {
        mNF mnfOLrzqt = mND.OLrzqt("dex_float_window");
        if (mnfOLrzqt != null) {
            return mnfOLrzqt.values();
        }
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FloatingView {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FloatingView[] $VALUES;
        private final int position;
        public static final FloatingView DATA = new FloatingView("DATA", 0, 0);
        public static final FloatingView LOADING = new FloatingView("LOADING", 1, 1);
        public static final FloatingView EMPTY = new FloatingView("EMPTY", 2, 2);
        public static final FloatingView ERROR = new FloatingView(EventType.ERROR, 3, 3);
        public static final FloatingView NO_WALLET = new FloatingView("NO_WALLET", 4, 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FloatingView[] $values() {
            return new FloatingView[]{DATA, LOADING, EMPTY, ERROR, NO_WALLET};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FloatingView> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPosition() {
            return this.position;
        }

        private FloatingView(String str, int i, int i2) {
            this.position = i2;
        }

        static {
            FloatingView[] floatingViewArr$values = $values();
            $VALUES = floatingViewArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(floatingViewArr$values);
        }

        public static FloatingView valueOf(String str) {
            return (FloatingView) Enum.valueOf(FloatingView.class, str);
        }

        public static FloatingView[] values() {
            return (FloatingView[]) $VALUES.clone();
        }
    }

    public final void getFieldNames() {
        FloatWindowViewModel floatWindowViewModel;
        if (!getNewProxyInstance() || AhwBna == DexFloatWindowMode.MINIMIZE || (floatWindowViewModel = hDKMBd) == null) {
            return;
        }
        floatWindowViewModel.copydefault(true, true);
    }

    public final void EZpvd(HoldingAsset holdingAsset) {
        C29229kph.OLrzqt("token_detail");
        Intent intent = new Intent(OLrzqt, (Class<?>) ActivityC21875hPo.class);
        C31200lpY.EZpvd(intent, "floating_window");
        intent.putExtra("token_base", new TokenBase(holdingAsset.OLrzqt(), holdingAsset.fetchVPNInfo(), null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4, null));
        intent.putExtra("key.page_from", "floating_window");
        intent.addFlags(268435456);
        gKZ gkz = gKZ.EZpvd;
        String strOLrzqt = gkz.OLrzqt(gkz.AEQbTJ("dex/coin/detail"), C56390yDp.OLrzqt("chainId", holdingAsset.OLrzqt()), C56390yDp.OLrzqt("tokenContractAddress", holdingAsset.fetchVPNInfo()), C56390yDp.OLrzqt("tokenSymbol", holdingAsset.AkhnZx()), C56390yDp.OLrzqt("bizSource", "floating_window"));
        jWB jwb = ejfBZ;
        if (jwb != null) {
            jwb.copydefault(intent, strOLrzqt, 778);
        }
    }

    public final void AEQbTJ(@NotNull HoldingAsset holdingAsset) {
        Intrinsics.checkNotNullParameter(holdingAsset, "");
        C29229kph.OLrzqt("sell");
        gKZ gkz = gKZ.EZpvd;
        String strOLrzqt = gkz.OLrzqt(gkz.AEQbTJ("dex/swap"), C56390yDp.OLrzqt("fromChainId", holdingAsset.OLrzqt()), C56390yDp.OLrzqt("fromTokenContractAddress", holdingAsset.fetchVPNInfo()), C56390yDp.OLrzqt("isFromNative", Boolean.valueOf(holdingAsset.gEmmrt())), C56390yDp.OLrzqt("isOldTradingDialog", Boolean.TRUE), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, holdingAsset.values()), C56390yDp.OLrzqt("sourceType", 0), C56390yDp.OLrzqt("sourcePageName", "floating_window"));
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uri = Uri.parse(strOLrzqt);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        intent.setData(uri);
        intent.addFlags(268435456);
        if (C32986mnt.EZpvd.valueOf()) {
            intent.addFlags(67108864);
        }
        jWB jwb = ejfBZ;
        if (jwb != null) {
            FloatWindowViewModel floatWindowViewModel = hDKMBd;
            String strOLrzqt2 = floatWindowViewModel != null ? floatWindowViewModel.OLrzqt() : null;
            jwb.KWHzl(holdingAsset, strOLrzqt2 != null ? strOLrzqt2 : "", intent);
        }
    }

    public final void hDKMBd() {
        String strAEQbTJ = gKZ.EZpvd.AEQbTJ("wallet/preference/setting");
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uri = Uri.parse(strAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        intent.setData(uri);
        intent.addFlags(268435456);
        if (C32986mnt.EZpvd.valueOf()) {
            intent.addFlags(67108864);
        }
        jWB jwb = ejfBZ;
        if (jwb != null) {
            jwb.copydefault(intent, strAEQbTJ, 779);
        }
    }

    @Override // o.InterfaceC46547tYj
    public void AEQbTJ(int i) {
        getFieldNames();
    }
}
