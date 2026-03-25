package com.okinc.planet.biz_content.leaderboard;

import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52792wYn;
import o.C32979mnm;
import o.C33070mpX;
import o.C47501trL;
import o.C47672tuY;
import o.C52761wXj;
import o.C55198xfS;
import o.C55276xgr;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC55274xgp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.pTD;
import o.wXQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TopTraderFilterBottomSheet extends AbstractC52792wYn {
    public final InterfaceC56387yDm EZpvd;
    public C55198xfS KWHzl;
    public final boolean OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static List<C55276xgr> copydefault = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TopTraderFilterBottomSheet show$default(Activity activity, List list, FragmentManager fragmentManager, Function0 function0, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return activity.KWHzl(list, fragmentManager, function0);
        }

        public final TopTraderFilterBottomSheet KWHzl(@NotNull List<C55276xgr> list, @NotNull FragmentManager fragmentManager, final Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            TopTraderFilterBottomSheet.copydefault = list;
            TopTraderFilterBottomSheet topTraderFilterBottomSheet = new TopTraderFilterBottomSheet();
            topTraderFilterBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.tuj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    TopTraderFilterBottomSheet.Activity.AEQbTJ(function0, dialogInterface);
                }
            });
            topTraderFilterBottomSheet.show(fragmentManager, TopTraderFilterBottomSheet.class.getSimpleName());
            return topTraderFilterBottomSheet;
        }

        public static final void AEQbTJ(Function0 function0, DialogInterface dialogInterface) {
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public TopTraderFilterBottomSheet() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47672tuY.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final C47672tuY OLrzqt() {
        return (C47672tuY) this.EZpvd.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.KWHzl = c55198xfS;
        c55198xfS.setType(1);
        InterfaceC55274xgp.StateListAnimator.setSingleOneColumnData$default(c55198xfS, copydefault, null, 2, null);
        copydefault(copydefault);
        copydefault(new Function2() { // from class: o.tud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return TopTraderFilterBottomSheet.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(TopTraderFilterBottomSheet topTraderFilterBottomSheet, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        if (c55276xgr.OLrzqt() instanceof SelectionPNL) {
            Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            SelectionPNL selectionPNL = (SelectionPNL) objOLrzqt;
            String value = selectionPNL.getValue();
            selectionPNL.getDesc();
            topTraderFilterBottomSheet.OLrzqt().KWHzl(value);
        } else if (c55276xgr.OLrzqt() instanceof SelectionDays) {
            Object objOLrzqt2 = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt2, "");
            SelectionDays selectionDays = (SelectionDays) objOLrzqt2;
            String value2 = selectionDays.getValue();
            selectionDays.getDesc();
            topTraderFilterBottomSheet.OLrzqt().copydefault(value2);
        }
        topTraderFilterBottomSheet.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(final List<C55276xgr> list) {
        int i;
        if (((C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(copydefault)).OLrzqt() instanceof SelectionPNL) {
            String strEZpvd = OLrzqt().EZpvd();
            i = (!Intrinsics.EZpvd((Object) strEZpvd, (Object) SelectionPNL.PNL_VALUE.getValue()) && Intrinsics.EZpvd((Object) strEZpvd, (Object) SelectionPNL.PNL_PERCENTAGE.getValue())) ? 1 : 0;
        } else if (((C55276xgr) CollectionsKt___CollectionsKt.AuCTelauCTel(copydefault)).OLrzqt() instanceof SelectionDays) {
            String strAEQbTJ = OLrzqt().AEQbTJ();
            if (!Intrinsics.EZpvd((Object) strAEQbTJ, (Object) SelectionDays.DAY_7.getValue())) {
                if (!Intrinsics.EZpvd((Object) strAEQbTJ, (Object) SelectionDays.DAY_30.getValue())) {
                    if (Intrinsics.EZpvd((Object) strAEQbTJ, (Object) SelectionDays.DAY_90.getValue())) {
                        i = 2;
                    } else if (Intrinsics.EZpvd((Object) strAEQbTJ, (Object) SelectionDays.YEAR_1.getValue())) {
                        i = 3;
                    }
                }
            }
        }
        C55276xgr c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.AkhnZx(list, i);
        if (c55276xgr == null) {
            c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        if (c55276xgr != null) {
            copydefault(c55276xgr, new Function1() { // from class: o.tuc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(TopTraderFilterBottomSheet.KWHzl(this.EZpvd, list, (C55276xgr) obj));
                }
            });
        }
    }

    public static final int KWHzl(TopTraderFilterBottomSheet topTraderFilterBottomSheet, List list, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        return topTraderFilterBottomSheet.copydefault((List<C55276xgr>) list, c55276xgr);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class SelectionPNL {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SelectionPNL[] $VALUES;
        private final String desc;
        private final String value;
        public static final SelectionPNL PNL_VALUE = new SelectionPNL("PNL_VALUE", 0, "pnl", C33070mpX.AYXKKw(C47501trL.Fragment.FYtjSf));
        public static final SelectionPNL PNL_PERCENTAGE = new SelectionPNL("PNL_PERCENTAGE", 1, "pnl_ratio", C33070mpX.AYXKKw(C47501trL.Fragment.finishInit));

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SelectionPNL[] $values() {
            return new SelectionPNL[]{PNL_VALUE, PNL_PERCENTAGE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SelectionPNL> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDesc() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private SelectionPNL(String str, int i, String str2, String str3) {
            this.value = str2;
            this.desc = str3;
        }

        static {
            SelectionPNL[] selectionPNLArr$values = $values();
            $VALUES = selectionPNLArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(selectionPNLArr$values);
        }

        public static SelectionPNL valueOf(String str) {
            return (SelectionPNL) Enum.valueOf(SelectionPNL.class, str);
        }

        public static SelectionPNL[] values() {
            return (SelectionPNL[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class SelectionDays {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SelectionDays[] $VALUES;
        public static final SelectionDays DAY_30;
        public static final SelectionDays DAY_7;
        public static final SelectionDays DAY_90;
        public static final SelectionDays YEAR_1;
        private final String desc;
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SelectionDays[] $values() {
            return new SelectionDays[]{DAY_7, DAY_30, DAY_90, YEAR_1};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SelectionDays> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDesc() {
            return this.desc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private SelectionDays(String str, int i, String str2, String str3) {
            this.value = str2;
            this.desc = str3;
        }

        static {
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            DAY_7 = new SelectionDays("DAY_7", 0, "7", pTD.EZpvd(c32979mnm.OLrzqt(), C47501trL.LoaderManager.KWHzl, 7, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 7))));
            DAY_30 = new SelectionDays("DAY_30", 1, "30", pTD.EZpvd(c32979mnm.OLrzqt(), C47501trL.LoaderManager.KWHzl, 30, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 30))));
            DAY_90 = new SelectionDays("DAY_90", 2, "90", pTD.EZpvd(c32979mnm.OLrzqt(), C47501trL.LoaderManager.KWHzl, 90, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 90))));
            YEAR_1 = new SelectionDays("YEAR_1", 3, "365", pTD.EZpvd(c32979mnm.OLrzqt(), C47501trL.LoaderManager.valueOf, 1, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 1))));
            SelectionDays[] selectionDaysArr$values = $values();
            $VALUES = selectionDaysArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(selectionDaysArr$values);
        }

        public static SelectionDays valueOf(String str) {
            return (SelectionDays) Enum.valueOf(SelectionDays.class, str);
        }

        public static SelectionDays[] values() {
            return (SelectionDays[]) $VALUES.clone();
        }
    }

    public final int copydefault(List<C55276xgr> list, C55276xgr c55276xgr) {
        Iterator<C55276xgr> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C55276xgr next = it.next();
            if (next.OLrzqt() instanceof SelectionPNL) {
                Object objOLrzqt = next.OLrzqt();
                Intrinsics.copydefault(objOLrzqt, "");
                SelectionPNL selectionPNL = (SelectionPNL) objOLrzqt;
                Object objOLrzqt2 = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt2, "");
                if (selectionPNL == ((SelectionPNL) objOLrzqt2)) {
                    break;
                }
                i++;
            } else {
                if (!(next.OLrzqt() instanceof SelectionDays)) {
                    break;
                }
                Object objOLrzqt3 = next.OLrzqt();
                Intrinsics.copydefault(objOLrzqt3, "");
                SelectionDays selectionDays = (SelectionDays) objOLrzqt3;
                Object objOLrzqt4 = c55276xgr.OLrzqt();
                Intrinsics.copydefault(objOLrzqt4, "");
                if (selectionDays == ((SelectionDays) objOLrzqt4)) {
                    break;
                }
                i++;
            }
        }
        return Math.max(0, i);
    }
}
