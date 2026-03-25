package com.okinc.business.defi.wallet.mine.walletmanage;

import android.app.Instrumentation;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.walletmanage.SearchWalletActivity;
import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.ScanResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC17325fBd;
import o.C13754dXa;
import o.C16423eje;
import o.C17403fEa;
import o.C17408fEf;
import o.C17420fEr;
import o.C17428fEz;
import o.C17779fRz;
import o.C32866mlf;
import o.C33070mpX;
import o.C52761wXj;
import o.C55230xfy;
import o.C55366xib;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.dZK;
import o.fDM;
import o.fDP;
import o.fED;
import o.fEM;
import o.fEN;
import o.fEO;
import o.fEQ;
import o.fES;
import o.yCM;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletActivity extends AbstractActivityC17325fBd {
    public C16423eje AYXKKw;
    public final fEQ AhwBna = new fEQ(new Function1() { // from class: o.fBj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return SearchWalletActivity.AEQbTJ(this.copydefault, (C17420fEr) obj);
        }
    });
    public C17408fEf EZpvd;

    @yCM
    public fDM adapter;
    public RecyclerView.OnScrollListener djBIcL;
    public final InterfaceC56387yDm valueOf;

    public SearchWalletActivity() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(SearchWalletViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.walletmanage.SearchWalletActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.walletmanage.SearchWalletActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.walletmanage.SearchWalletActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.fBd.OLrzqt()V */
    public final fDM OLrzqt() {
        fDM fdm = this.adapter;
        if (fdm != null) {
            return fdm;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final SearchWalletViewModel AYXKKw() {
        return (SearchWalletViewModel) this.valueOf.getValue();
    }

    public static final Unit AEQbTJ(SearchWalletActivity searchWalletActivity, C17420fEr c17420fEr) {
        Intrinsics.checkNotNullParameter(c17420fEr, "");
        searchWalletActivity.AYXKKw().AEQbTJ(c17420fEr.EZpvd());
        C32866mlf.onEvent$default("Web3WalletManagement_SearchResult_Card_Click", (TrackChannel[]) null, new Function1() { // from class: o.fBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchWalletActivity.copydefault((EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC17325fBd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.AYXKKw = C16423eje.EZpvd(getLayoutInflater());
        this.EZpvd = new C17408fEf(new C17403fEa(C55366xib.KWHzl(C52761wXj.ActionBar.DCUTEI, this)));
        C16423eje c16423eje = this.AYXKKw;
        if (c16423eje == null) {
            Intrinsics.gEmmrt("");
            c16423eje = null;
        }
        setContentView(c16423eje.getRoot());
        gEmmrt();
        valueOf();
        AhwBna();
        DbNXlk();
    }

    private final void gEmmrt() {
        C16423eje c16423eje = this.AYXKKw;
        C16423eje c16423eje2 = null;
        if (c16423eje == null) {
            Intrinsics.gEmmrt("");
            c16423eje = null;
        }
        C55230xfy c55230xfy = c16423eje.KWHzl;
        c55230xfy.setShowCancelButton(true);
        c55230xfy.copydefault().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSessionToken));
        c55230xfy.setCancelCallback(new Function0() { // from class: o.fBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchWalletActivity.AhwBna(this.copydefault);
            }
        });
        c55230xfy.KWHzl().addTextChangedListener(new Activity());
        C16423eje c16423eje3 = this.AYXKKw;
        if (c16423eje3 == null) {
            Intrinsics.gEmmrt("");
            c16423eje3 = null;
        }
        c16423eje3.copydefault.setLayoutManager(new SafeLinearLayoutManager(this));
        C16423eje c16423eje4 = this.AYXKKw;
        if (c16423eje4 == null) {
            Intrinsics.gEmmrt("");
            c16423eje4 = null;
        }
        c16423eje4.copydefault.setAdapter(OLrzqt());
        C16423eje c16423eje5 = this.AYXKKw;
        if (c16423eje5 == null) {
            Intrinsics.gEmmrt("");
            c16423eje5 = null;
        }
        c16423eje5.KWHzl.setOnBackPressed(new Function0() { // from class: o.fBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchWalletActivity.AYXKKw(this.KWHzl);
            }
        });
        C16423eje c16423eje6 = this.AYXKKw;
        if (c16423eje6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16423eje2 = c16423eje6;
        }
        c16423eje2.copydefault.postDelayed(new Runnable() { // from class: o.fBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SearchWalletActivity.values(this.OLrzqt);
            }
        }, 500L);
    }

    public static final class Activity implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            SearchWalletActivity.this.AYXKKw().EZpvd(editable != null ? editable.toString() : null);
            fEQ feq = SearchWalletActivity.this.AhwBna;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            feq.EZpvd(string);
        }
    }

    public static final Unit AhwBna(SearchWalletActivity searchWalletActivity) {
        searchWalletActivity.values();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(SearchWalletActivity searchWalletActivity) {
        searchWalletActivity.values();
        return Unit.INSTANCE;
    }

    public static final void values(SearchWalletActivity searchWalletActivity) {
        C16423eje c16423eje = searchWalletActivity.AYXKKw;
        if (c16423eje == null) {
            Intrinsics.gEmmrt("");
            c16423eje = null;
        }
        RecyclerView recyclerView = c16423eje.copydefault;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        searchWalletActivity.djBIcL = C17779fRz.OLrzqt(recyclerView, searchWalletActivity);
    }

    private final void values() {
        onBackPressed();
        if (getIntent().getBooleanExtra("search_bar_only_icon", false)) {
            overridePendingTransition(C52761wXj.Application.EZpvd, C52761wXj.Application.copydefault);
        }
    }

    private final void valueOf() {
        OLrzqt().AEQbTJ(fEO.class, (fDP) new fES());
        OLrzqt().AEQbTJ(C17420fEr.class, (fDP) this.AhwBna);
        OLrzqt().AEQbTJ(fEM.class, (fDP) new fEN());
        OLrzqt().AEQbTJ(fED.class, (fDP) new C17428fEz());
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchWalletActivity$observeRootWalletSearchResultsState$1(this, null), 3, null);
    }

    private final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchWalletActivity$observeChangeWalletState$1(this, null), 3, null);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C16423eje c16423eje = this.AYXKKw;
        if (c16423eje == null) {
            Intrinsics.gEmmrt("");
            c16423eje = null;
        }
        C55230xfy c55230xfy = c16423eje.KWHzl;
        c55230xfy.KWHzl().setHint(getIntent().getStringExtra("search_bar_hint"));
        c55230xfy.setFocusable(true);
        c55230xfy.setFocusableInTouchMode(true);
        c55230xfy.requestFocus();
        c55230xfy.copydefault(c55230xfy.KWHzl());
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (Build.VERSION.SDK_INT >= 29 && !isFinishing()) {
            new Instrumentation().callActivityOnSaveInstanceState(this, new Bundle());
        }
        super.onStop();
    }

    public final void djBIcL() {
        dZK.AEQbTJ.AEQbTJ(this, new EnterWalletMainBean((Boolean) null, (String) null, (Integer) null, (String) null, true, true, (ScanResult) null, 79, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractActivityC17325fBd, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RecyclerView.OnScrollListener onScrollListener = this.djBIcL;
        if (onScrollListener != null) {
            C16423eje c16423eje = this.AYXKKw;
            if (c16423eje == null) {
                Intrinsics.gEmmrt("");
                c16423eje = null;
            }
            c16423eje.copydefault.removeOnScrollListener(onScrollListener);
        }
    }

    @Override // o.AbstractActivityC17325fBd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17325fBd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17325fBd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17325fBd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
