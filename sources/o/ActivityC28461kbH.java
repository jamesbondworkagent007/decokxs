package o;

import android.view.View;
import androidx.collection.ArrayMapKt;
import androidx.core.content.IntentCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditActivity$onGroupsSelected$1;
import com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditActivity$showGroupDeletionAlert$1$1$1;
import com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditParams;
import com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditViewModel;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC28464kbK;
import o.AbstractC28538kcf;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28415kaO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kbH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC28461kbH extends AbstractActivityC28462kbI implements kMO, kCQ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kbX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC28461kbH.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.kbW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC28461kbH.AYXKKw(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL;
    public C28479kbZ fetchVPNInfo;
    public C23384hxH gEmmrt;
    public kCM valueOf;

    /* JADX INFO: renamed from: o.kbH$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public ActivityC28461kbH() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(WatchlistEditViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditActivity$special$$inlined$viewModels$default$3
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

    public final WatchlistEditViewModel djBIcL() {
        return (WatchlistEditViewModel) this.djBIcL.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kbI.AEQbTJ()V */
    public final WatchlistEditParams AEQbTJ() {
        return (WatchlistEditParams) this.AYXKKw.getValue();
    }

    public static final WatchlistEditParams djBIcL(ActivityC28461kbH activityC28461kbH) {
        android.content.Intent intent = activityC28461kbH.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        WatchlistEditParams watchlistEditParams = (WatchlistEditParams) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "key.watchlist_edit", WatchlistEditParams.class));
        return watchlistEditParams == null ? (WatchlistEditParams) C31200lpY.throwIfDebug$default(new WatchlistEditParams("chain_id_all_network", 0, null, 4, null), null, 2, null) : watchlistEditParams;
    }

    private final ItemTouchHelper AYXKKw() {
        return (ItemTouchHelper) this.AhwBna.getValue();
    }

    public static final ItemTouchHelper AYXKKw(ActivityC28461kbH activityC28461kbH) {
        return new ItemTouchHelper(new kMR(activityC28461kbH));
    }

    /* JADX INFO: renamed from: o.kbH$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kbH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractActivityC28462kbI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23384hxH c23384hxHEZpvd = C23384hxH.EZpvd(getLayoutInflater());
        this.gEmmrt = c23384hxHEZpvd;
        setContentView(c23384hxHEZpvd != null ? c23384hxHEZpvd.getRoot() : null);
        this.valueOf = new kCM();
        DbNXlk();
        gEmmrt();
    }

    @Override // o.AbstractActivityC28462kbI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        djBIcL().AEQbTJ(AEQbTJ().copydefault(), AEQbTJ().EZpvd());
    }

    public static final Unit AEQbTJ(ActivityC28461kbH activityC28461kbH, C28422kaV c28422kaV) {
        Intrinsics.checkNotNullParameter(c28422kaV, "");
        activityC28461kbH.djBIcL().AEQbTJ(c28422kaV, activityC28461kbH.AEQbTJ().EZpvd());
        activityC28461kbH.EZpvd("pin_top");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC28461kbH activityC28461kbH, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        activityC28461kbH.OLrzqt((java.util.List<C28422kaV>) list);
        return Unit.INSTANCE;
    }

    private final void DbNXlk() {
        this.fetchVPNInfo = new C28479kbZ(AYXKKw(), new Function1() { // from class: o.kbU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28461kbH.AEQbTJ(this.copydefault, (C28422kaV) obj);
            }
        }, new Function1() { // from class: o.kbS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28461kbH.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        });
        C23384hxH c23384hxH = this.gEmmrt;
        if (c23384hxH != null) {
            c23384hxH.EZpvd.getTitle().setContentDescription("web3_dex_watchlist_edit_title_view");
            c23384hxH.EZpvd.setSubDoVisible(0);
            C33537myN c33537myN = c23384hxH.EZpvd;
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onLocationChanged);
            if (drawableKWHzl != null) {
                C33057mpK.copydefault(drawableKWHzl, C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            } else {
                drawableKWHzl = null;
            }
            c33537myN.setSubDoImageDrawable(drawableKWHzl);
            c23384hxH.EZpvd.setSubDoListener(new View.OnClickListener() { // from class: o.kbY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC28461kbH.KWHzl(this.OLrzqt, view);
                }
            });
            RecyclerView recyclerView = c23384hxH.gEmmrt;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.fetchVPNInfo);
            AYXKKw().attachToRecyclerView(recyclerView);
            android.widget.LinearLayout linearLayout = c23384hxH.valueOf;
            linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this, c23384hxH));
            android.widget.ImageView imageView = c23384hxH.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25352ivB.toggleSelectionState$default(imageView, false, false, null, 0, null, 0, 62, null);
            OLrzqt(yDY.AhwBna());
        }
    }

    public static final void KWHzl(ActivityC28461kbH activityC28461kbH, android.view.View view) {
        activityC28461kbH.valueOf();
    }

    public final void valueOf() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) ActivityC29450ktq.class);
        C31200lpY.EZpvd(intent, "default_trade");
        startActivity(intent);
    }

    private final void gEmmrt() {
        djBIcL().AEQbTJ().observe(this, new StateListAnimator(new Function1() { // from class: o.kbR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28461kbH.KWHzl(this.copydefault, (AbstractC28538kcf) obj);
            }
        }));
        djBIcL().EZpvd().observe(this, new StateListAnimator(new Function1() { // from class: o.kbT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28461kbH.OLrzqt(this.OLrzqt, (AbstractC28464kbK) obj);
            }
        }));
    }

    public static final Unit KWHzl(ActivityC28461kbH activityC28461kbH, AbstractC28538kcf abstractC28538kcf) {
        android.widget.LinearLayout linearLayout;
        C23384hxH c23384hxH = activityC28461kbH.gEmmrt;
        if (c23384hxH != null) {
            C55113xdn c55113xdn = c23384hxH.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(abstractC28538kcf instanceof AbstractC28538kcf.ActionBar ? 0 : 8);
            android.widget.LinearLayout linearLayout2 = c23384hxH.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(abstractC28538kcf instanceof AbstractC28538kcf.Activity ? 0 : 8);
            C55173xeu c55173xeu = c23384hxH.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(abstractC28538kcf instanceof AbstractC28538kcf.Application ? 0 : 8);
        }
        activityC28461kbH.copydefault(Intrinsics.EZpvd(abstractC28538kcf, AbstractC28538kcf.ActionBar.OLrzqt));
        if (abstractC28538kcf instanceof AbstractC28538kcf.Activity) {
            AbstractC28538kcf.Activity activity = (AbstractC28538kcf.Activity) abstractC28538kcf;
            if (activity.KWHzl().isEmpty()) {
                activityC28461kbH.EZpvd(true);
            } else {
                C23384hxH c23384hxH2 = activityC28461kbH.gEmmrt;
                if (c23384hxH2 != null && (linearLayout = c23384hxH2.AEQbTJ) != null) {
                    linearLayout.setVisibility(0);
                }
                C28479kbZ c28479kbZ = activityC28461kbH.fetchVPNInfo;
                if (c28479kbZ != null) {
                    c28479kbZ.EZpvd(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(activity.KWHzl()));
                }
            }
            rVN.reportFullyDrawn$default((android.app.Activity) activityC28461kbH, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd(abstractC28538kcf, AbstractC28538kcf.Application.EZpvd)) {
            setError$default(activityC28461kbH, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kbH$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC28461kbH EZpvd;
        public final /* synthetic */ C23384hxH KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC28461kbH activityC28461kbH, C23384hxH c23384hxH) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = activityC28461kbH;
            this.KWHzl = c23384hxH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List<C28422kaV> listKWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AbstractC28538kcf value = this.EZpvd.djBIcL().AEQbTJ().getValue();
                AbstractC28538kcf.Activity activity = value instanceof AbstractC28538kcf.Activity ? (AbstractC28538kcf.Activity) value : null;
                if (activity == null || (listKWHzl = activity.KWHzl()) == null || !(!listKWHzl.isEmpty())) {
                    return;
                }
                this.KWHzl.KWHzl.setSelected(!r0.isSelected());
                if (this.KWHzl.KWHzl.isSelected()) {
                    android.widget.ImageView imageView = this.KWHzl.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    C25352ivB.toggleSelectionState$default(imageView, true, false, null, 0, null, 0, 62, null);
                    C28479kbZ c28479kbZ = this.EZpvd.fetchVPNInfo;
                    if (c28479kbZ != null) {
                        c28479kbZ.OLrzqt(listKWHzl);
                    }
                    this.EZpvd.OLrzqt(listKWHzl);
                    return;
                }
                android.widget.ImageView imageView2 = this.KWHzl.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C25352ivB.toggleSelectionState$default(imageView2, false, false, null, 0, null, 0, 62, null);
                C28479kbZ c28479kbZ2 = this.EZpvd.fetchVPNInfo;
                if (c28479kbZ2 != null) {
                    c28479kbZ2.EZpvd();
                    c28479kbZ2.notifyDataSetChanged();
                }
                this.EZpvd.OLrzqt((java.util.List<C28422kaV>) yDY.AhwBna());
            }
        }
    }

    public static final Unit OLrzqt(ActivityC28461kbH activityC28461kbH, AbstractC28464kbK abstractC28464kbK) {
        if (Intrinsics.EZpvd(abstractC28464kbK, AbstractC28464kbK.Activity.AEQbTJ)) {
            activityC28461kbH.setResult(-1);
            C28479kbZ c28479kbZ = activityC28461kbH.fetchVPNInfo;
            if (c28479kbZ != null) {
                c28479kbZ.EZpvd();
            }
        } else if (Intrinsics.EZpvd(abstractC28464kbK, AbstractC28464kbK.Application.KWHzl)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(C23274hvD.Fragment.UscePu), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        } else {
            if (!Intrinsics.EZpvd(abstractC28464kbK, AbstractC28464kbK.TaskDescription.KWHzl)) {
                throw new NoWhenBranchMatchedException();
            }
            activityC28461kbH.setResult(-1);
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(boolean z) {
        C23384hxH c23384hxH = this.gEmmrt;
        if (c23384hxH != null) {
            if (z) {
                C55113xdn.showLoading$default(c23384hxH.copydefault, 0L, 1, null);
                c23384hxH.AEQbTJ.setVisibility(8);
                c23384hxH.OLrzqt.setVisibility(8);
                return;
            }
            c23384hxH.copydefault.copydefault();
        }
    }

    public static /* synthetic */ void setError$default(ActivityC28461kbH activityC28461kbH, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        activityC28461kbH.EZpvd(z);
    }

    private final void EZpvd(boolean z) {
        C23384hxH c23384hxH = this.gEmmrt;
        if (c23384hxH != null) {
            c23384hxH.AEQbTJ.setVisibility(8);
            c23384hxH.copydefault.setVisibility(8);
            c23384hxH.OLrzqt.setVisibility(0);
            if (z) {
                C55173xeu c55173xeu = c23384hxH.OLrzqt;
                c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.STbtMW));
                c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.closeSocket));
                c55173xeu.setEmptyTypeImage(7);
                c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.getSmallIconId));
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kbO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC28461kbH.copydefault(this.EZpvd, view);
                    }
                });
                return;
            }
            C55173xeu c55173xeu2 = c23384hxH.OLrzqt;
            c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            c55173xeu2.setEmptyTypeImage(8);
            c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.kbN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC28461kbH.AYXKKw(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void copydefault(ActivityC28461kbH activityC28461kbH, android.view.View view) {
        activityC28461kbH.valueOf();
    }

    public static final void AYXKKw(ActivityC28461kbH activityC28461kbH, android.view.View view) {
        activityC28461kbH.djBIcL().AEQbTJ(activityC28461kbH.AEQbTJ().copydefault(), activityC28461kbH.AEQbTJ().EZpvd());
    }

    public final void OLrzqt(final java.util.List<C28422kaV> list) {
        java.util.List<C28422kaV> listKWHzl;
        C23384hxH c23384hxH = this.gEmmrt;
        if (c23384hxH != null) {
            android.widget.ImageView imageView = c23384hxH.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            AbstractC28538kcf value = djBIcL().AEQbTJ().getValue();
            AbstractC28538kcf.Activity activity = value instanceof AbstractC28538kcf.Activity ? (AbstractC28538kcf.Activity) value : null;
            C25352ivB.toggleSelectionState$default(imageView, ((activity == null || (listKWHzl = activity.KWHzl()) == null) ? 0 : listKWHzl.size()) == list.size() && list.size() > 0, false, null, 0, null, 0, 62, null);
            android.widget.TextView textView = c23384hxH.AhwBna;
            if ((!list.isEmpty()) && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(AEQbTJ().KWHzl().size()), 1)) {
                textView.setText(C33069mpW.KWHzl(this, C23274hvD.Fragment.MediaControllerCompatApi21TransportControls, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(list.size())))));
                textView.setEnabled(true);
                int i = C52761wXj.Activity.fdOvFl;
                TextViewCompat.setCompoundDrawableTintList(textView, C25382ivf.copydefault(i));
                textView.setTextColor(C25382ivf.KWHzl(i));
                textView.setOnClickListener(new View.OnClickListener() { // from class: o.kbP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC28461kbH.KWHzl(this.KWHzl, list, view);
                    }
                });
            } else {
                textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi23TransportControls));
                textView.setEnabled(false);
                int i2 = C52761wXj.Activity.UlJrfe;
                TextViewCompat.setCompoundDrawableTintList(textView, C25382ivf.copydefault(i2));
                textView.setTextColor(C25382ivf.KWHzl(i2));
            }
            android.widget.TextView textView2 = c23384hxH.djBIcL;
            if (list.isEmpty()) {
                textView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.toLegacyStreamType));
                textView2.setEnabled(false);
                int i3 = C52761wXj.Activity.UlJrfe;
                TextViewCompat.setCompoundDrawableTintList(textView2, C25382ivf.copydefault(i3));
                textView2.setTextColor(C25382ivf.KWHzl(i3));
                return;
            }
            textView2.setText(C33069mpW.KWHzl(this, C23274hvD.Fragment.MediaControllerCompatApi23, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(list.size())))));
            textView2.setEnabled(true);
            int i4 = C52761wXj.Activity.DQzvGN;
            TextViewCompat.setCompoundDrawableTintList(textView2, C25382ivf.copydefault(i4));
            textView2.setTextColor(C25382ivf.KWHzl(i4));
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.kbM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC28461kbH.EZpvd(this.AEQbTJ, list, view);
                }
            });
        }
    }

    public static final void KWHzl(ActivityC28461kbH activityC28461kbH, java.util.List list, android.view.View view) {
        activityC28461kbH.copydefault((java.util.List<C28422kaV>) list);
        activityC28461kbH.EZpvd("add_to");
    }

    public static final void EZpvd(ActivityC28461kbH activityC28461kbH, java.util.List list, android.view.View view) {
        activityC28461kbH.AEQbTJ((java.util.List<C28422kaV>) list);
        activityC28461kbH.EZpvd("remove");
    }

    public final void AEQbTJ(final java.util.List<C28422kaV> list) {
        final wYK wyk = new wYK(this, null, 0, 6, null);
        wyk.setChecked(false);
        wyk.setEnabled(true);
        wyk.setOKDSSize(-5);
        wyk.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompat));
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.EZpvd(wyk);
        viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.fromMediaSession);
        viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.MediaControllerCompatApi24TransportControls);
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.fIwbmz, new View.OnClickListener() { // from class: o.kbV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC28461kbH.OLrzqt(viewOnClickListenerC54939xaY, wyk, this, list, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C23274hvD.Fragment.ORxRYg), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, wYK wyk, ActivityC28461kbH activityC28461kbH, java.util.List list, android.view.View view) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), null, null, new WatchlistEditActivity$showGroupDeletionAlert$1$1$1(wyk, activityC28461kbH, list, viewOnClickListenerC54939xaY, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.Object obj) {
        if (Result.m7384isSuccessimpl(obj)) {
            InterfaceC28415kaO interfaceC28415kaO = (InterfaceC28415kaO) obj;
            if (interfaceC28415kaO instanceof InterfaceC28415kaO.Dialog) {
                kCW.Companion.OLrzqt(new TokenGroupSelectionParams(((InterfaceC28415kaO.Dialog) interfaceC28415kaO).EZpvd(), GroupSelectionMode.BULK, null, 4, null)).show(getSupportFragmentManager(), "TokenGroupSelectionBottomSheet");
                return;
            } else {
                kCM kcm = this.valueOf;
                if (kcm != null) {
                    kcm.OLrzqt(interfaceC28415kaO, new Function0() { // from class: o.kbQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return ActivityC28461kbH.valueOf(this.KWHzl);
                        }
                    });
                }
            }
        }
        if (Result.m7380exceptionOrNullimpl(obj) != null) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (java.lang.Object) null);
        }
    }

    public static final Unit valueOf(ActivityC28461kbH activityC28461kbH) {
        android.widget.ImageView imageView;
        C23384hxH c23384hxH = activityC28461kbH.gEmmrt;
        if (c23384hxH != null && (imageView = c23384hxH.KWHzl) != null) {
            C25352ivB.toggleSelectionState$default(imageView, false, false, null, 0, null, 0, 62, null);
        }
        C28479kbZ c28479kbZ = activityC28461kbH.fetchVPNInfo;
        if (c28479kbZ != null) {
            c28479kbZ.EZpvd();
            c28479kbZ.notifyDataSetChanged();
        }
        activityC28461kbH.OLrzqt(yDY.AhwBna());
        activityC28461kbH.djBIcL().AEQbTJ(activityC28461kbH.AEQbTJ().copydefault(), activityC28461kbH.AEQbTJ().EZpvd());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC28462kbI, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.fetchVPNInfo = null;
        this.valueOf = null;
        super.onDestroy();
    }

    @Override // o.kMO
    public boolean KWHzl(int i, int i2) {
        C28479kbZ c28479kbZ = this.fetchVPNInfo;
        if (c28479kbZ != null) {
            c28479kbZ.OLrzqt(i, i2);
        }
        C28479kbZ c28479kbZ2 = this.fetchVPNInfo;
        if (c28479kbZ2 == null) {
            return true;
        }
        c28479kbZ2.notifyItemMoved(i, i2);
        return true;
    }

    @Override // o.kCQ
    public void AEQbTJ(@NotNull java.util.List<HomeToken> list, @NotNull kotlin.Pair<? extends java.util.List<java.lang.Integer>, ? extends java.util.List<java.lang.Integer>> pair) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pair, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WatchlistEditActivity$onGroupsSelected$1(pair, this, list, null), 3, null);
    }

    @Override // o.kMO
    public void AhwBna() {
        java.util.List<C28422kaV> listKWHzl;
        C28479kbZ c28479kbZ = this.fetchVPNInfo;
        if (c28479kbZ == null || (listKWHzl = c28479kbZ.KWHzl()) == null) {
            return;
        }
        djBIcL().copydefault(AEQbTJ().EZpvd(), listKWHzl);
        EZpvd("drag_move");
    }

    private final void EZpvd(java.lang.String str) {
        C21847hOn.EZpvd("DEXMarket_Watchlist_TokenManage_Click", str);
    }

    public final void copydefault(java.util.List<C28422kaV> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C28422kaV c28422kaV : list) {
            arrayList.add(new HomeToken(c28422kaV.EZpvd(), null, c28422kaV.AkhnZx(), c28422kaV.AuCTel(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 1048562, null));
        }
        kCW.Companion.OLrzqt(new TokenGroupSelectionParams(arrayList, GroupSelectionMode.BULK, java.lang.Integer.valueOf(AEQbTJ().EZpvd()))).show(getSupportFragmentManager(), "TokenGroupSelectionBottomSheet");
    }

    @Override // o.AbstractActivityC28462kbI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC28462kbI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC28462kbI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
