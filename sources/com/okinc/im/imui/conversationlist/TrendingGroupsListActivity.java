package com.okinc.im.imui.conversationlist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.conversationlist.TrendingGroupsListActivity;
import com.okinc.im.imui.conversationlist.viewmodel.TrendingGroupListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C34168nTy;
import o.C35399nuc;
import o.C35901oHx;
import o.C37721ozF;
import o.C55296xhK;
import o.C56524yIo;
import o.C7827arF;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.nFT;
import o.nGS;
import o.nIZ;
import o.wYC;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class TrendingGroupsListActivity extends nFT<nIZ> {
    public final int AYXKKw = C35399nuc.Dialog.QfsBiF;
    public nIZ djBIcL;
    public C35901oHx gEmmrt;

    @yCM
    public C34168nTy joinGroupEntryHelper;
    public final InterfaceC56387yDm valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return false;
    }

    public TrendingGroupsListActivity() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(TrendingGroupListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.conversationlist.TrendingGroupsListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.conversationlist.TrendingGroupsListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.conversationlist.TrendingGroupsListActivity$special$$inlined$viewModels$default$3
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

    public final C34168nTy djBIcL() {
        C34168nTy c34168nTy = this.joinGroupEntryHelper;
        if (c34168nTy != null) {
            return c34168nTy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.nFT.AhwBna()V */
    public final TrendingGroupListViewModel AhwBna() {
        return (TrendingGroupListViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversationlist.TrendingGroupsListActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Intent EZpvd(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context.getApplicationContext(), (Class<?>) TrendingGroupsListActivity.class);
        }
    }

    @Override // o.nFT, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nIZ nizCopydefault = nIZ.copydefault(getLayoutInflater());
        this.djBIcL = nizCopydefault;
        nIZ niz = null;
        if (nizCopydefault == null) {
            Intrinsics.gEmmrt("");
            nizCopydefault = null;
        }
        setSupportActionBar(nizCopydefault.valueOf);
        nIZ niz2 = this.djBIcL;
        if (niz2 == null) {
            Intrinsics.gEmmrt("");
            niz2 = null;
        }
        wYC wyc = niz2.KWHzl;
        wyc.setOnClickListener(new Activity(wyc, 1000L, this));
        nIZ niz3 = this.djBIcL;
        if (niz3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            niz = niz3;
        }
        setContentView(niz.getRoot());
        valueOf();
        fetchVPNInfo();
        AkhnZx();
        DbNXlk();
        AYXKKw();
    }

    public final void valueOf() {
        nIZ niz = this.djBIcL;
        if (niz == null) {
            Intrinsics.gEmmrt("");
            niz = null;
        }
        niz.EZpvd.setAnimationFromUrl(C7827arF.EZpvd("lottie/im/trending_groups_loading_level2.lottie", this, true));
    }

    private final void AkhnZx() {
        TrendingGroupListViewModel trendingGroupListViewModelAhwBna = AhwBna();
        C37721ozF.collectOnLifecycle$default(trendingGroupListViewModelAhwBna.KWHzl(), this, (Lifecycle.State) null, new TrendingGroupsListActivity$observeData$1$1(this, trendingGroupListViewModelAhwBna, null), 2, (Object) null);
    }

    private final void DbNXlk() {
        AhwBna().AEQbTJ().observe(this, new Application(new Function1() { // from class: o.nFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TrendingGroupsListActivity.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit KWHzl(TrendingGroupsListActivity trendingGroupsListActivity, Boolean bool) {
        if (bool.booleanValue()) {
            trendingGroupsListActivity.showLoading();
        } else {
            trendingGroupsListActivity.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        this.gEmmrt = new C35901oHx(new Function1() { // from class: o.nFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TrendingGroupsListActivity.copydefault(this.copydefault, (nGS) obj);
            }
        }, true, null, 4, null);
        nIZ niz = this.djBIcL;
        C35901oHx c35901oHx = null;
        if (niz == null) {
            Intrinsics.gEmmrt("");
            niz = null;
        }
        RecyclerView recyclerView = niz.copydefault;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C35901oHx c35901oHx2 = this.gEmmrt;
        if (c35901oHx2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c35901oHx = c35901oHx2;
        }
        recyclerView.setAdapter(c35901oHx);
    }

    public static final Unit copydefault(TrendingGroupsListActivity trendingGroupsListActivity, nGS ngs) {
        Intrinsics.checkNotNullParameter(ngs, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(trendingGroupsListActivity), null, null, new TrendingGroupsListActivity$setupRecyclerView$1$1(trendingGroupsListActivity, ngs, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrendingGroupsListActivity$loadTrendingGroups$1(this, null), 3, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ TrendingGroupsListActivity EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, TrendingGroupsListActivity trendingGroupsListActivity) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = trendingGroupsListActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
        }
    }

    @Override // o.nFT, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nFT, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nFT, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.nFT, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
