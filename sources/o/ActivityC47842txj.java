package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_create_centre.data.HistoryData;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC47842txj extends AbstractActivityC47505trP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public C46229tMp EZpvd;
    public boolean OLrzqt;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX INFO: renamed from: o.txj$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulView.Status.values().length];
            try {
                iArr[StatefulView.Status.Error.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulView.Status.Empty.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulView.Status.Content.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.txj$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public final void OLrzqt(C46471tVo c46471tVo) {
    }

    public ActivityC47842txj() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(C47855txw.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_create_centre.ui.EarningsHistoryActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_create_centre.ui.EarningsHistoryActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_create_centre.ui.EarningsHistoryActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: renamed from: o.txj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC47842txj.class);
        }
    }

    public final C47855txw EZpvd() {
        return (C47855txw) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46229tMp c46229tMpCopydefault = C46229tMp.copydefault(getLayoutInflater());
        this.EZpvd = c46229tMpCopydefault;
        if (c46229tMpCopydefault == null) {
            Intrinsics.gEmmrt("");
            c46229tMpCopydefault = null;
        }
        setContentView(c46229tMpCopydefault.getRoot());
        djBIcL();
        valueOf();
        EZpvd().OLrzqt(true);
    }

    private final void djBIcL() {
        gEmmrt();
        OLrzqt();
        AhwBna();
    }

    private final void gEmmrt() {
        C46229tMp c46229tMp = this.EZpvd;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        C33537myN c33537myN = c46229tMp.AEQbTJ;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.txn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47842txj.OLrzqt(this.AEQbTJ, view);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void OLrzqt(ActivityC47842txj activityC47842txj, android.view.View view) {
        activityC47842txj.finish();
    }

    private final void OLrzqt() {
        C46229tMp c46229tMp = this.EZpvd;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        RecyclerView recyclerView = c46229tMp.copydefault;
        recyclerView.setLayoutManager(C33047mpA.KWHzl(recyclerView.getContext()));
        this.copydefault.register(C47777twX.class, new C47856txx());
        this.copydefault.register(C47771twR.class, new C47849txq());
        this.copydefault.register(java.lang.String.class, new C47854txv());
        this.copydefault.register(C47773twT.class, new C47853txu());
        this.copydefault.register(HistoryData.class, new C47851txs(new Function1() { // from class: o.txp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47842txj.EZpvd(this.copydefault, (HistoryData) obj);
            }
        }));
        recyclerView.setAdapter(this.copydefault);
        AEQbTJ();
    }

    public static final Unit EZpvd(ActivityC47842txj activityC47842txj, HistoryData historyData) {
        Intrinsics.checkNotNullParameter(historyData, "");
        pUU.EZpvd(activityC47842txj.getTAG(), "Earnings item clicked: " + historyData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.txj$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            ActivityC47842txj.this.copydefault();
        }
    }

    public final void AEQbTJ() {
        C46229tMp c46229tMp = this.EZpvd;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        c46229tMp.copydefault.addOnScrollListener(new Activity());
    }

    public final void copydefault() {
        android.view.View viewFindViewByPosition;
        android.view.View viewFindViewByPosition2;
        C46229tMp c46229tMp = this.EZpvd;
        C46229tMp c46229tMp2 = null;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        RecyclerView.LayoutManager layoutManager = c46229tMp.copydefault.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        java.util.List<?> items = this.copydefault.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        if (items.isEmpty()) {
            EZpvd(false, null, 0.0f);
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1) {
            EZpvd(false, null, 0.0f);
            return;
        }
        int size = items.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (items.get(i) instanceof C47771twR) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            EZpvd(false, null, 0.0f);
            return;
        }
        if (iFindFirstVisibleItemPosition <= i && (iFindFirstVisibleItemPosition != i || (viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(i)) == null || viewFindViewByPosition2.getTop() >= 0)) {
            EZpvd(false, null, 0.0f);
            return;
        }
        int i2 = i + 1;
        if (i2 <= iFindFirstVisibleItemPosition) {
            while (true) {
                if (iFindFirstVisibleItemPosition < items.size() && (items.get(iFindFirstVisibleItemPosition) instanceof java.lang.String)) {
                    break;
                } else if (iFindFirstVisibleItemPosition == i2) {
                    break;
                } else {
                    iFindFirstVisibleItemPosition--;
                }
            }
            iFindFirstVisibleItemPosition = -1;
        } else {
            iFindFirstVisibleItemPosition = -1;
        }
        if (iFindFirstVisibleItemPosition == -1) {
            int size2 = items.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                if (items.get(i2) instanceof java.lang.String) {
                    iFindFirstVisibleItemPosition = i2;
                    break;
                }
                i2++;
            }
        }
        if (iFindFirstVisibleItemPosition != -1) {
            java.lang.Object obj = items.get(iFindFirstVisibleItemPosition);
            Intrinsics.copydefault(obj, "");
            java.lang.String str = (java.lang.String) obj;
            int i3 = iFindFirstVisibleItemPosition + 1;
            int size3 = items.size();
            while (true) {
                if (i3 >= size3) {
                    i3 = -1;
                    break;
                } else if (items.get(i3) instanceof java.lang.String) {
                    break;
                } else {
                    i3++;
                }
            }
            C46229tMp c46229tMp3 = this.EZpvd;
            if (c46229tMp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46229tMp2 = c46229tMp3;
            }
            int height = c46229tMp2.AhwBna.getHeight();
            if (i3 != -1 && height > 0 && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i3)) != null && viewFindViewByPosition.getBottom() <= height) {
                java.lang.Object obj2 = items.get(i3);
                Intrinsics.copydefault(obj2, "");
                str = (java.lang.String) obj2;
            }
            EZpvd(true, str, 0.0f);
            return;
        }
        C46229tMp c46229tMp4 = this.EZpvd;
        if (c46229tMp4 == null) {
            Intrinsics.gEmmrt("");
            c46229tMp4 = null;
        }
        android.widget.LinearLayout linearLayout = c46229tMp4.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (linearLayout.getVisibility() == 0) {
            return;
        }
        EZpvd(false, null, 0.0f);
    }

    public final void EZpvd(boolean z, java.lang.String str, float f) {
        C46229tMp c46229tMp = this.EZpvd;
        C46229tMp c46229tMp2 = null;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        c46229tMp.AhwBna.setTranslationY(f);
        if (str != null) {
            C46229tMp c46229tMp3 = this.EZpvd;
            if (c46229tMp3 == null) {
                Intrinsics.gEmmrt("");
                c46229tMp3 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) c46229tMp3.gEmmrt.getText(), (java.lang.Object) str)) {
                C46229tMp c46229tMp4 = this.EZpvd;
                if (c46229tMp4 == null) {
                    Intrinsics.gEmmrt("");
                    c46229tMp4 = null;
                }
                c46229tMp4.gEmmrt.setText(str);
            }
        }
        C46229tMp c46229tMp5 = this.EZpvd;
        if (c46229tMp5 == null) {
            Intrinsics.gEmmrt("");
            c46229tMp5 = null;
        }
        android.widget.LinearLayout linearLayout = c46229tMp5.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if ((linearLayout.getVisibility() == 0) != z) {
            C46229tMp c46229tMp6 = this.EZpvd;
            if (c46229tMp6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46229tMp2 = c46229tMp6;
            }
            android.widget.LinearLayout linearLayout2 = c46229tMp2.AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(z ? 0 : 8);
        }
    }

    public final void KWHzl() {
        C46229tMp c46229tMp = this.EZpvd;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        android.widget.LinearLayout linearLayout = c46229tMp.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
    }

    private final void AhwBna() {
        C46229tMp c46229tMp = this.EZpvd;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        final C33546myW c33546myW = c46229tMp.EZpvd;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.txm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC47842txj.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.txo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC47842txj.AEQbTJ(this.EZpvd, c33546myW, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(ActivityC47842txj activityC47842txj, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC47842txj.EZpvd().OLrzqt(false);
    }

    public static final void AEQbTJ(ActivityC47842txj activityC47842txj, C33546myW c33546myW, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (activityC47842txj.EZpvd().AhwBna()) {
            return;
        }
        c33546myW.AYXKKw();
    }

    private final void valueOf() {
        EZpvd().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.txt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47842txj.AEQbTJ(this.EZpvd, (C47857txy) obj);
            }
        }));
        EZpvd().AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.txr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47842txj.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(ActivityC47842txj activityC47842txj, C47857txy c47857txy) {
        C55113xdn c55113xdn;
        pUU.EZpvd(activityC47842txj.getTAG(), "UIState -> status: " + c47857txy.AEQbTJ() + ", size: " + c47857txy.OLrzqt().size() + ", cursor: " + c47857txy.KWHzl());
        C46229tMp c46229tMp = activityC47842txj.EZpvd;
        C46229tMp c46229tMp2 = null;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        C55237xgE c55237xgE = c46229tMp.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
        C46229tMp c46229tMp3 = activityC47842txj.EZpvd;
        if (c46229tMp3 == null) {
            Intrinsics.gEmmrt("");
            c46229tMp3 = null;
        }
        C33546myW c33546myW = c46229tMp3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c55237xgE.setStatus(c47857txy.AEQbTJ());
        int i = Application.EZpvd[c47857txy.AEQbTJ().ordinal()];
        if (i == 1) {
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            activityC47842txj.KWHzl();
            android.view.View viewAEQbTJ = c55237xgE.AEQbTJ(StatefulView.Status.Error);
            activityC47842txj.AEQbTJ(viewAEQbTJ != null ? (C46471tVo) viewAEQbTJ.findViewById(C47501trL.TaskDescription.vLaW) : null, c47857txy.copydefault());
            if (!activityC47842txj.OLrzqt) {
                activityC47842txj.OLrzqt = true;
                rVN.reportFullyDrawn$default((android.app.Activity) activityC47842txj, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 2) {
            c33546myW.AhwBna(false);
            c33546myW.AEQbTJ();
            activityC47842txj.KWHzl();
            android.view.View viewAEQbTJ2 = c55237xgE.AEQbTJ(StatefulView.Status.Empty);
            activityC47842txj.OLrzqt(viewAEQbTJ2 != null ? (C46471tVo) viewAEQbTJ2.findViewById(C47501trL.TaskDescription.swzYdv) : null);
            if (!activityC47842txj.OLrzqt) {
                activityC47842txj.OLrzqt = true;
                rVN.reportFullyDrawn$default((android.app.Activity) activityC47842txj, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (i == 3) {
            if (c47857txy.AhwBna()) {
                if (c47857txy.EZpvd()) {
                    c33546myW.AhwBna(true);
                    c33546myW.AEQbTJ();
                } else {
                    c33546myW.AhwBna(false);
                    c33546myW.OLrzqt();
                }
            } else if (c47857txy.EZpvd()) {
                c33546myW.AhwBna(true);
                c33546myW.valueOf();
            } else {
                c33546myW.AhwBna(false);
                c33546myW.AYXKKw();
            }
            activityC47842txj.copydefault.setItems(c47857txy.OLrzqt());
            activityC47842txj.copydefault.notifyDataSetChanged();
            if (!activityC47842txj.OLrzqt) {
                activityC47842txj.OLrzqt = true;
                rVN.reportFullyDrawn$default((android.app.Activity) activityC47842txj, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else {
            activityC47842txj.KWHzl();
            StatefulView.Status status = StatefulView.Status.Loading;
            android.view.View viewAEQbTJ3 = c55237xgE.AEQbTJ(status);
            if (viewAEQbTJ3 != null && (c55113xdn = (C55113xdn) viewAEQbTJ3.findViewById(C47501trL.TaskDescription.registerUser)) != null) {
                c55113xdn.setAnimation(C47501trL.PendingIntent.copydefault);
            }
            C46229tMp c46229tMp4 = activityC47842txj.EZpvd;
            if (c46229tMp4 == null) {
                Intrinsics.gEmmrt("");
                c46229tMp4 = null;
            }
            c46229tMp4.djBIcL.setLoadingDelayedTime(0L);
            C46229tMp c46229tMp5 = activityC47842txj.EZpvd;
            if (c46229tMp5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46229tMp2 = c46229tMp5;
            }
            c46229tMp2.djBIcL.setStatus(status);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC47842txj activityC47842txj, java.lang.String str) {
        C46229tMp c46229tMp = activityC47842txj.EZpvd;
        if (c46229tMp == null) {
            Intrinsics.gEmmrt("");
            c46229tMp = null;
        }
        c46229tMp.EZpvd.valueOf();
        if (str != null) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C46471tVo c46471tVo, int i) {
        if (c46471tVo != null) {
            c46471tVo.setNetworkError(i > 0 ? 6 : 8, i > 0 ? C47501trL.Fragment.gwTjWJ : C47501trL.Fragment.RdAHlO, i > 0 ? C47501trL.Fragment.dHguZz : C47501trL.Fragment.hBpjJd, C47501trL.Fragment.QHmsKR, new Function0() { // from class: o.txl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC47842txj.OLrzqt(this.EZpvd);
                }
            });
        }
    }

    public static final Unit OLrzqt(ActivityC47842txj activityC47842txj) {
        activityC47842txj.EZpvd().OLrzqt(true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
