package com.okinc.buysell.ui.bsc.cryptolist;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.buysell.view.cryptolist.SearchHistoryItem;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31538lvs;
import o.AbstractC31905mIg;
import o.C30350lVc;
import o.C30353lVf;
import o.C31351lsQ;
import o.C31479lum;
import o.C32989mnw;
import o.C33061mpO;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C43316rmw;
import o.C43453rpa;
import o.C52761wXj;
import o.C52794wYp;
import o.C55173xeu;
import o.C55230xfy;
import o.C55296xhK;
import o.C56392yDr;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC31670lzr;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.lAP;
import o.lDB;
import o.lDU;
import o.lEJ;
import o.mHA;
import o.mHG;
import o.mHT;
import o.sxI;
import o.wXX;
import o.wYC;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListFragment extends lEJ<AbstractC31538lvs> {
    public static final Companion Companion = new Companion(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public boolean EZpvd;
    public lDU KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final C43316rmw djBIcL;
    public Function1<? super CurrencyToken, Unit> gEmmrt;
    public lDU valueOf;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Companion.ListType.values().length];
            try {
                iArr[Companion.ListType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.ListType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super CurrencyToken, Unit> function1) {
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC31538lvs OLrzqt(BuySellCryptoListFragment buySellCryptoListFragment) {
        return (AbstractC31538lvs) buySellCryptoListFragment.isConnected();
    }

    public BuySellCryptoListFragment() {
        super(C31351lsQ.ActionBar.QfsBiF);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BuySellCryptoListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lDB.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$activityViewModels$default$3
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lAP.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment$special$$inlined$activityViewModels$default$6
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
        this.djBIcL = new C43316rmw();
    }

    public BuySellCryptoListViewModel AYXKKw() {
        return (BuySellCryptoListViewModel) this.AYXKKw.getValue();
    }

    public final lDB AEQbTJ() {
        return (lDB) this.AEQbTJ.getValue();
    }

    public final lAP OLrzqt() {
        return (lAP) this.copydefault.getValue();
    }

    @Override // o.AbstractC31907mIi
    public void djBIcL() {
        Companion.ListType listType;
        String string;
        AYXKKw().KWHzl(((sxI) C43251rlk.copydefault(sxI.class)).AEQbTJ());
        BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw = AYXKKw();
        buySellCryptoListViewModelAYXKKw.AEQbTJ(false);
        Bundle arguments = getArguments();
        if (arguments == null || (listType = (Companion.ListType) arguments.getParcelable("list_type")) == null) {
            listType = Companion.ListType.BUY;
        }
        buySellCryptoListViewModelAYXKKw.KWHzl(listType);
        if (buySellCryptoListViewModelAYXKKw.AhwBna() == Companion.ListType.BUY) {
            BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw2 = AYXKKw();
            Bundle arguments2 = getArguments();
            String string2 = arguments2 != null ? arguments2.getString("selected_token") : null;
            String str = string2 == null ? "" : string2;
            Bundle arguments3 = getArguments();
            string = arguments3 != null ? arguments3.getString("selected_currency") : null;
            buySellCryptoListViewModelAYXKKw2.AEQbTJ(new BuySellCryptoListViewModel.TaskDescription(AudioStats.AUDIO_AMPLITUDE_NONE, str, string == null ? "" : string, false, 9, null));
        } else {
            BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw3 = AYXKKw();
            Bundle arguments4 = getArguments();
            String string3 = arguments4 != null ? arguments4.getString("selected_token") : null;
            String str2 = string3 == null ? "" : string3;
            Bundle arguments5 = getArguments();
            string = arguments5 != null ? arguments5.getString("selected_currency") : null;
            String str3 = string == null ? "" : string;
            Bundle arguments6 = getArguments();
            buySellCryptoListViewModelAYXKKw3.KWHzl(new BuySellCryptoListViewModel.Activity(str2, str3, arguments6 != null ? arguments6.getBoolean("has_verification_status") : false, false, 8, null));
        }
        Bundle arguments7 = getArguments();
        this.EZpvd = arguments7 != null ? arguments7.getBoolean("is_from_bottomsheet") : false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            AYXKKw().AEQbTJ();
            return;
        }
        BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw = AYXKKw();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        buySellCryptoListViewModelAYXKKw.KWHzl(viewLifecycleOwner);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC31907mIi
    public void gEmmrt() {
        String strAYXKKw;
        showLoading(2000L);
        AbstractC31538lvs abstractC31538lvs = (AbstractC31538lvs) isConnected();
        if (this.EZpvd) {
            abstractC31538lvs.gEmmrt.setVisibility(8);
        } else {
            abstractC31538lvs.gEmmrt.setVisibility(0);
            wYC wyc = abstractC31538lvs.AYXKKw;
            wyc.setOnClickListener(new LoaderManager(wyc, 1000L, this));
            if (AYXKKw().AhwBna() == Companion.ListType.BUY) {
                abstractC31538lvs.valueOf.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.Dmq));
            } else {
                abstractC31538lvs.valueOf.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.zblBkD));
            }
        }
        BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw = AYXKKw();
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        boolean zKWHzl = c43453rpa.KWHzl(contextRequireContext);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        buySellCryptoListViewModelAYXKKw.copydefault(false, zKWHzl, viewLifecycleOwner);
        this.djBIcL.register(SearchHistoryItem.class, new C30353lVf(new Function1() { // from class: o.lDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.EZpvd(this.OLrzqt, (SearchHistoryItem) obj);
            }
        }));
        this.KWHzl = new lDU(AYXKKw().AhwBna(), AYXKKw().copydefault(), AYXKKw().gEmmrt(), new Function1() { // from class: o.lDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.KWHzl(this.EZpvd, (CurrencyToken) obj);
            }
        });
        this.valueOf = new lDU(AYXKKw().AhwBna(), AYXKKw().copydefault(), AYXKKw().gEmmrt(), new Function1() { // from class: o.lDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.AEQbTJ(this.OLrzqt, (CurrencyToken) obj);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(requireView(), new OnApplyWindowInsetsListener() { // from class: o.lDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return BuySellCryptoListFragment.KWHzl(this.KWHzl, view, windowInsetsCompat);
            }
        });
        C55230xfy c55230xfy = ((AbstractC31538lvs) isConnected()).EZpvd;
        c55230xfy.KWHzl().setHint(C33070mpX.AYXKKw(C31351lsQ.Activity.QSBOWP));
        mHG.AEQbTJ(c55230xfy.KWHzl(), AYXKKw().isConnected() ? 300L : 0L, LifecycleOwnerKt.getLifecycleScope(this), new Function1() { // from class: o.lDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.EZpvd(this.AEQbTJ, (java.lang.CharSequence) obj);
            }
        });
        c55230xfy.KWHzl().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                BuySellCryptoListFragment.OLrzqt(this.KWHzl, view, z);
            }
        });
        c55230xfy.setClearCallback(new Function0() { // from class: o.lDJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BuySellCryptoListFragment.AYXKKw(this.OLrzqt);
            }
        });
        C31479lum c31479lum = ((AbstractC31538lvs) isConnected()).AEQbTJ;
        TextView textView = c31479lum.AEQbTJ;
        int i = Application.OLrzqt[AYXKKw().AhwBna().ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.fBE);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DIIpTV);
        }
        textView.setText(strAYXKKw);
        c31479lum.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DUUtXg));
        RecyclerView recyclerView = c31479lum.EZpvd;
        recyclerView.setAdapter(this.djBIcL);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = c31479lum.KWHzl;
        lDU ldu = this.KWHzl;
        if (ldu == null) {
            Intrinsics.gEmmrt("");
            ldu = null;
        }
        recyclerView2.setAdapter(ldu);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        recyclerView2.setItemAnimator(null);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemViewCacheSize(20);
        try {
            Fragment fragmentRequireParentFragment = requireParentFragment();
            wXX wxx = fragmentRequireParentFragment instanceof wXX ? (wXX) fragmentRequireParentFragment : null;
            Dialog dialog = wxx != null ? wxx.getDialog() : null;
            BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
            if (bottomSheetDialog != null) {
                recyclerView2.addOnItemTouchListener(new TaskDescription(bottomSheetDialog));
            }
        } catch (Exception unused) {
        }
        RecyclerView recyclerView3 = c31479lum.gEmmrt;
        lDU ldu2 = this.valueOf;
        if (ldu2 == null) {
            Intrinsics.gEmmrt("");
            ldu2 = null;
        }
        recyclerView3.setAdapter(ldu2);
        recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext(), 1, false));
        recyclerView3.setItemAnimator(null);
        recyclerView3.setItemViewCacheSize(20);
        try {
            Fragment fragmentRequireParentFragment2 = requireParentFragment();
            wXX wxx2 = fragmentRequireParentFragment2 instanceof wXX ? (wXX) fragmentRequireParentFragment2 : null;
            Dialog dialog2 = wxx2 != null ? wxx2.getDialog() : null;
            BottomSheetDialog bottomSheetDialog2 = dialog2 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog2 : null;
            if (bottomSheetDialog2 != null) {
                recyclerView3.addOnItemTouchListener(new StateListAnimator(bottomSheetDialog2));
            }
        } catch (Exception unused2) {
        }
        wYC wyc2 = c31479lum.AYXKKw;
        wyc2.setOnClickListener(new ActionBar(wyc2, 1000L, this, c31479lum));
    }

    public static final Unit EZpvd(BuySellCryptoListFragment buySellCryptoListFragment, SearchHistoryItem searchHistoryItem) {
        Intrinsics.checkNotNullParameter(searchHistoryItem, "");
        if (searchHistoryItem instanceof SearchHistoryItem.HistoryTokenItem) {
            BuySellCryptoListViewModel.addOrRemoveSearchHistories$default(buySellCryptoListFragment.AYXKKw(), searchHistoryItem, null, 2, null);
            Function1<? super CurrencyToken, Unit> function1 = buySellCryptoListFragment.gEmmrt;
            if (function1 != null) {
                function1.invoke(((SearchHistoryItem.HistoryTokenItem) searchHistoryItem).getCurrencyToken());
            }
            buySellCryptoListFragment.KWHzl();
        } else {
            if (!(searchHistoryItem instanceof SearchHistoryItem.HistoryDexItem)) {
                throw new NoWhenBranchMatchedException();
            }
            BuySellCryptoListViewModel.addOrRemoveSearchHistories$default(buySellCryptoListFragment.AYXKKw(), searchHistoryItem, null, 2, null);
            Function1<? super CurrencyToken, Unit> function12 = buySellCryptoListFragment.gEmmrt;
            if (function12 != null) {
                function12.invoke(((SearchHistoryItem.HistoryDexItem) searchHistoryItem).getCurrencyToken());
            }
            buySellCryptoListFragment.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BuySellCryptoListFragment buySellCryptoListFragment, CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        buySellCryptoListFragment.AEQbTJ(currencyToken);
        BuySellCryptoListViewModel.addOrRemoveSearchHistories$default(buySellCryptoListFragment.AYXKKw(), buySellCryptoListFragment.AYXKKw().AEQbTJ(currencyToken), null, 2, null);
        Function1<? super CurrencyToken, Unit> function1 = buySellCryptoListFragment.gEmmrt;
        if (function1 != null) {
            function1.invoke(currencyToken);
        }
        buySellCryptoListFragment.KWHzl();
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ BuySellCryptoListFragment EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ C31479lum copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, BuySellCryptoListFragment buySellCryptoListFragment, C31479lum c31479lum) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = buySellCryptoListFragment;
            this.copydefault = c31479lum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AYXKKw().EZpvd();
                BuySellCryptoListFragment.OLrzqt(this.EZpvd).AEQbTJ.getRoot().scrollBy(0, this.copydefault.OLrzqt.getHeight());
                this.copydefault.OLrzqt.setVisibility(8);
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ BuySellCryptoListFragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, BuySellCryptoListFragment buySellCryptoListFragment) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = buySellCryptoListFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt().EZpvd();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ BuySellCryptoListFragment KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, BuySellCryptoListFragment buySellCryptoListFragment) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = buySellCryptoListFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel.addOrRemoveSearchHistories$default(com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel, com.okinc.buysell.view.cryptolist.SearchHistoryItem, com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel$SearchHistoryOperation, int, java.lang.Object):void */
    public static final Unit AEQbTJ(BuySellCryptoListFragment buySellCryptoListFragment, CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        buySellCryptoListFragment.OLrzqt(currencyToken);
        buySellCryptoListFragment.AEQbTJ(currencyToken);
        BuySellCryptoListViewModel.addOrRemoveSearchHistories$default(buySellCryptoListFragment.AYXKKw(), buySellCryptoListFragment.AYXKKw().AEQbTJ(currencyToken), null, 2, null);
        Function1<? super CurrencyToken, Unit> function1 = buySellCryptoListFragment.gEmmrt;
        if (function1 != null) {
            function1.invoke(currencyToken);
        }
        buySellCryptoListFragment.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat KWHzl(BuySellCryptoListFragment buySellCryptoListFragment, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        if (!windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime())) {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).EZpvd.KWHzl().clearFocus();
        }
        return windowInsetsCompat;
    }

    public static final Unit EZpvd(BuySellCryptoListFragment buySellCryptoListFragment, CharSequence charSequence) {
        BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw = buySellCryptoListFragment.AYXKKw();
        String strValueOf = String.valueOf(charSequence);
        LifecycleOwner viewLifecycleOwner = buySellCryptoListFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        buySellCryptoListViewModelAYXKKw.KWHzl(strValueOf, viewLifecycleOwner);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(BuySellCryptoListFragment buySellCryptoListFragment, View view, boolean z) {
        if (z) {
            buySellCryptoListFragment.AYXKKw().EZpvd("crypto_search", (6 & 2) != 0 ? new C30350lVc(null, null, null, null, false, null, null, null, null, null, 1023, null) : null, (6 & 4) != 0 ? false : false);
        }
    }

    public static final Unit AYXKKw(BuySellCryptoListFragment buySellCryptoListFragment) {
        BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw = buySellCryptoListFragment.AYXKKw();
        LifecycleOwner viewLifecycleOwner = buySellCryptoListFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        buySellCryptoListViewModelAYXKKw.KWHzl("", viewLifecycleOwner);
        buySellCryptoListFragment.AYXKKw().EZpvd("delete_search", (6 & 2) != 0 ? new C30350lVc(null, null, null, null, false, null, null, null, null, null, 1023, null) : null, (6 & 4) != 0 ? false : false);
        return Unit.INSTANCE;
    }

    public static final class TaskDescription extends RecyclerView.SimpleOnItemTouchListener {
        public final /* synthetic */ BottomSheetDialog OLrzqt;

        public TaskDescription(BottomSheetDialog bottomSheetDialog) {
            this.OLrzqt = bottomSheetDialog;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                BottomSheetDialog bottomSheetDialog = this.OLrzqt;
                if (bottomSheetDialog.getBehavior().isDraggable()) {
                    bottomSheetDialog.getBehavior().setDraggable(false);
                }
            } else if (action == 1) {
                BottomSheetDialog bottomSheetDialog2 = this.OLrzqt;
                if (!bottomSheetDialog2.getBehavior().isDraggable()) {
                    bottomSheetDialog2.getBehavior().setDraggable(true);
                }
            } else if (action != 2) {
                if (action == 3) {
                }
            }
            return false;
        }
    }

    public static final class StateListAnimator extends RecyclerView.SimpleOnItemTouchListener {
        public final /* synthetic */ BottomSheetDialog copydefault;

        public StateListAnimator(BottomSheetDialog bottomSheetDialog) {
            this.copydefault = bottomSheetDialog;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                BottomSheetDialog bottomSheetDialog = this.copydefault;
                if (bottomSheetDialog.getBehavior().isDraggable()) {
                    bottomSheetDialog.getBehavior().setDraggable(false);
                }
            } else if (action == 1) {
                BottomSheetDialog bottomSheetDialog2 = this.copydefault;
                if (!bottomSheetDialog2.getBehavior().isDraggable()) {
                    bottomSheetDialog2.getBehavior().setDraggable(true);
                }
            } else if (action != 2) {
                if (action == 3) {
                }
            }
            return false;
        }
    }

    public final void KWHzl() {
        if (this.EZpvd) {
            AEQbTJ().copydefault();
        }
    }

    @Override // o.AbstractC31907mIi
    public void EZpvd() {
        BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw = AYXKKw();
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<AbstractC31905mIg>> liveDataValues = buySellCryptoListViewModelAYXKKw.values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataValues, viewLifecycleOwner, new Function1() { // from class: o.lDz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.copydefault(this.EZpvd, (AbstractC31905mIg) obj);
            }
        });
        LiveData<C32989mnw<Boolean>> liveDataDbNXlk = buySellCryptoListViewModelAYXKKw.DbNXlk();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataDbNXlk, viewLifecycleOwner2, new Function1() { // from class: o.lDL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<List<SearchHistoryItem>>> liveDataValueOf = buySellCryptoListViewModelAYXKKw.valueOf();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataValueOf, viewLifecycleOwner3, new Function1() { // from class: o.lDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.gEmmrt(this.EZpvd, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<List<CryptoListItem>>> liveDataKWHzl = buySellCryptoListViewModelAYXKKw.KWHzl();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataKWHzl, viewLifecycleOwner4, new Function1() { // from class: o.lDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.AhwBna(this.KWHzl, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<List<CryptoListItem>>> liveDataFetchVPNInfo = buySellCryptoListViewModelAYXKKw.fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner5, new Function1() { // from class: o.lDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.valueOf(this.OLrzqt, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<List<CryptoListItem>>> liveDataOLrzqt = buySellCryptoListViewModelAYXKKw.OLrzqt();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataOLrzqt, viewLifecycleOwner6, new Function1() { // from class: o.lDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.AYXKKw(this.OLrzqt, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<List<CryptoListItem>>> liveDataDjBIcL = buySellCryptoListViewModelAYXKKw.djBIcL();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataDjBIcL, viewLifecycleOwner7, new Function1() { // from class: o.lDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.DbNXlk(this.EZpvd, (java.util.List) obj);
            }
        });
    }

    public static final Unit copydefault(BuySellCryptoListFragment buySellCryptoListFragment, AbstractC31905mIg abstractC31905mIg) {
        Intrinsics.checkNotNullParameter(abstractC31905mIg, "");
        if (abstractC31905mIg instanceof AbstractC31905mIg.Activity) {
            buySellCryptoListFragment.fIwbmz();
        } else if (abstractC31905mIg instanceof AbstractC31905mIg.TaskDescription) {
            buySellCryptoListFragment.AuCTel();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(BuySellCryptoListFragment buySellCryptoListFragment, boolean z) {
        TextView textView = ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).KWHzl;
        if (!z) {
            textView.setVisibility(8);
            return Unit.INSTANCE;
        }
        textView.setVisibility(0);
        String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.copydefault);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.OLrzqt);
        textView.setText(buySellCryptoListFragment.AEQbTJ(strAYXKKw + " " + strAYXKKw2, strAYXKKw2));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(BuySellCryptoListFragment buySellCryptoListFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((Collection) list) && !buySellCryptoListFragment.AYXKKw().AkhnZx()) {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.OLrzqt.setVisibility(0);
            C43316rmw c43316rmw = buySellCryptoListFragment.djBIcL;
            c43316rmw.setItems(list);
            c43316rmw.notifyDataSetChanged();
        } else {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.OLrzqt.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mHT.submitList$default(o.mHT, java.util.List, java.lang.Runnable, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(BuySellCryptoListFragment buySellCryptoListFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.gEmmrt.setVisibility(8);
        if (C33129mqd.KWHzl((Collection) list)) {
            buySellCryptoListFragment.valueOf();
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.KWHzl.setVisibility(0);
            boolean zAEQbTJ = ((sxI) C43251rlk.copydefault(sxI.class)).AEQbTJ();
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) list);
            if (zAEQbTJ) {
                listFJNWhG.add(new CryptoListItem.StateListAnimator("", "", "", "", C33070mpX.AYXKKw(C31351lsQ.Activity.sTzBva)));
            }
            lDU ldu = buySellCryptoListFragment.KWHzl;
            if (ldu == null) {
                Intrinsics.gEmmrt("");
                ldu = null;
            }
            mHT.submitList$default(ldu, listFJNWhG, null, 2, null);
        } else {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.KWHzl.setVisibility(8);
            buySellCryptoListFragment.AuCTel();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(BuySellCryptoListFragment buySellCryptoListFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.gEmmrt.setVisibility(8);
        if (C33129mqd.KWHzl((Collection) list)) {
            buySellCryptoListFragment.valueOf();
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.KWHzl.setVisibility(0);
            lDU ldu = buySellCryptoListFragment.KWHzl;
            if (ldu == null) {
                Intrinsics.gEmmrt("");
                ldu = null;
            }
            mHT.submitList$default(ldu, list, null, 2, null);
        } else {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.KWHzl.setVisibility(8);
            buySellCryptoListFragment.values();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(final BuySellCryptoListFragment buySellCryptoListFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.OLrzqt.setVisibility(8);
        ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.KWHzl.setVisibility(8);
        if (C33129mqd.KWHzl((Collection) list)) {
            buySellCryptoListFragment.valueOf();
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.gEmmrt.setVisibility(0);
            lDU ldu = buySellCryptoListFragment.valueOf;
            if (ldu == null) {
                Intrinsics.gEmmrt("");
                ldu = null;
            }
            ldu.copydefault(list, new Runnable() { // from class: o.lDK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    BuySellCryptoListFragment.EZpvd(this.KWHzl);
                }
            });
        } else {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.gEmmrt.setVisibility(8);
            buySellCryptoListFragment.AhwBna();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(BuySellCryptoListFragment buySellCryptoListFragment) {
        if (buySellCryptoListFragment.AYXKKw().fIwbmz()) {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.gEmmrt.scrollToPosition(0);
            buySellCryptoListFragment.AYXKKw().EZpvd(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit DbNXlk(BuySellCryptoListFragment buySellCryptoListFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.OLrzqt.setVisibility(8);
        ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.KWHzl.setVisibility(8);
        if (C33129mqd.KWHzl((Collection) list)) {
            buySellCryptoListFragment.valueOf();
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.gEmmrt.setVisibility(0);
            lDU ldu = buySellCryptoListFragment.valueOf;
            if (ldu == null) {
                Intrinsics.gEmmrt("");
                ldu = null;
            }
            mHT.submitList$default(ldu, list, null, 2, null);
        } else {
            ((AbstractC31538lvs) buySellCryptoListFragment.isConnected()).AEQbTJ.gEmmrt.setVisibility(8);
            buySellCryptoListFragment.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public final CharSequence AEQbTJ(String str, String str2) {
        return C33061mpO.setupSpanStyles$default(C33069mpW.getFormattedString$default(str, null, 2, null), new String[]{str2}, 0, null, false, new Function1() { // from class: o.lDH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.fetchVPNInfo(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit fetchVPNInfo(BuySellCryptoListFragment buySellCryptoListFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(buySellCryptoListFragment.getContext(), C52761wXj.LoaderManager.DTwDnp));
        list.add(buySellCryptoListFragment.new Activity());
        return Unit.INSTANCE;
    }

    public static final class Activity extends ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            FragmentActivity fragmentActivityRequireActivity = BuySellCryptoListFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC31670lzr.copydefault(fragmentActivityRequireActivity);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        AbstractC31538lvs abstractC31538lvs = (AbstractC31538lvs) isConnected();
        abstractC31538lvs.DbNXlk.setVisibility(0);
        abstractC31538lvs.AEQbTJ.getRoot().setVisibility(8);
        abstractC31538lvs.djBIcL.setVisibility(8);
        abstractC31538lvs.OLrzqt.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        AEQbTJ(true);
        dismissLoading();
        AbstractC31538lvs abstractC31538lvs = (AbstractC31538lvs) isConnected();
        abstractC31538lvs.DbNXlk.setVisibility(8);
        abstractC31538lvs.AEQbTJ.getRoot().setVisibility(0);
        abstractC31538lvs.djBIcL.setVisibility(8);
        abstractC31538lvs.OLrzqt.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        AEQbTJ(false);
        dismissLoading();
        AbstractC31538lvs abstractC31538lvs = (AbstractC31538lvs) isConnected();
        abstractC31538lvs.DbNXlk.setVisibility(8);
        abstractC31538lvs.AEQbTJ.getRoot().setVisibility(8);
        abstractC31538lvs.OLrzqt.setVisibility(0);
        abstractC31538lvs.AhwBna.setVisibility(8);
        C55173xeu c55173xeu = abstractC31538lvs.djBIcL;
        c55173xeu.setVisibility(0);
        c55173xeu.setImage(C52761wXj.TaskDescription.HJWChPRAkuRW);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.AxsJAYaxsJAY));
        c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.hUfVAv));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C31351lsQ.Activity.fvQaOB));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.lDx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                BuySellCryptoListFragment.OLrzqt(this.OLrzqt, view);
            }
        });
    }

    public static final void OLrzqt(BuySellCryptoListFragment buySellCryptoListFragment, View view) {
        BuySellCryptoListViewModel buySellCryptoListViewModelAYXKKw = buySellCryptoListFragment.AYXKKw();
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        Context contextRequireContext = buySellCryptoListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        boolean zKWHzl = c43453rpa.KWHzl(contextRequireContext);
        LifecycleOwner viewLifecycleOwner = buySellCryptoListFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        buySellCryptoListViewModelAYXKKw.copydefault(true, zKWHzl, viewLifecycleOwner);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        AEQbTJ(true);
        dismissLoading();
        AbstractC31538lvs abstractC31538lvs = (AbstractC31538lvs) isConnected();
        abstractC31538lvs.DbNXlk.setVisibility(8);
        abstractC31538lvs.AEQbTJ.getRoot().setVisibility(8);
        abstractC31538lvs.OLrzqt.setVisibility(0);
        if (this.EZpvd) {
            abstractC31538lvs.AhwBna.setVisibility(8);
        } else {
            C52794wYp c52794wYp = abstractC31538lvs.AhwBna;
            c52794wYp.setVisibility(0);
            c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
            Intrinsics.copydefault(c52794wYp);
        }
        C55173xeu c55173xeu = abstractC31538lvs.djBIcL;
        c55173xeu.setVisibility(0);
        c55173xeu.setImage(C52761wXj.TaskDescription.HJWChPRGtXKCDKRTZD);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.QwvEab));
        c55173xeu.setSubTitle((CharSequence) "");
        c55173xeu.setRetry("");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        dismissLoading();
        AbstractC31538lvs abstractC31538lvs = (AbstractC31538lvs) isConnected();
        abstractC31538lvs.DbNXlk.setVisibility(8);
        abstractC31538lvs.AEQbTJ.getRoot().setVisibility(8);
        abstractC31538lvs.OLrzqt.setVisibility(0);
        abstractC31538lvs.AhwBna.setVisibility(8);
        C55173xeu c55173xeu = abstractC31538lvs.djBIcL;
        c55173xeu.setVisibility(0);
        c55173xeu.setImage(C52761wXj.TaskDescription.HJWChPRGtXKC);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.OBJEWx));
        c55173xeu.setSubTitle((CharSequence) "");
        c55173xeu.setRetry("");
    }

    public final void OLrzqt(CurrencyToken currencyToken) {
        List listAhwBna;
        Object next;
        boolean zEZpvd;
        boolean zEZpvd2;
        int i = Application.OLrzqt[AYXKKw().AhwBna().ordinal()];
        if (i == 1) {
            listAhwBna = (List) mHA.OLrzqt.AEQbTJ(AYXKKw().OLrzqt());
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listAhwBna = (List) mHA.OLrzqt.AEQbTJ(AYXKKw().djBIcL());
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
        }
        Iterator it = listAhwBna.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CryptoListItem cryptoListItem = (CryptoListItem) next;
            if (cryptoListItem instanceof CryptoListItem.BuyCryptoListItem) {
                zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyCryptoListItem) cryptoListItem).getCryptoId(), (Object) currencyToken.getCurrency());
            } else if (cryptoListItem instanceof CryptoListItem.ActionBar) {
                zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.ActionBar) cryptoListItem).getCryptoId(), (Object) currencyToken.getCurrency());
            } else if (cryptoListItem instanceof CryptoListItem.BuyDexListItem) {
                zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyDexListItem) cryptoListItem).AEQbTJ().getSymbol(), (Object) currencyToken.getCurrency());
            } else if (cryptoListItem instanceof CryptoListItem.Application) {
                zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.Application) cryptoListItem).OLrzqt().getSymbol(), (Object) currencyToken.getCurrency());
            } else {
                continue;
            }
            if (zEZpvd2) {
                break;
            }
        }
        CryptoListItem cryptoListItem2 = (CryptoListItem) next;
        Iterator it2 = listAhwBna.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            CryptoListItem cryptoListItem3 = (CryptoListItem) it2.next();
            if (cryptoListItem3 instanceof CryptoListItem.BuyCryptoListItem) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyCryptoListItem) cryptoListItem3).getCryptoId(), (Object) currencyToken.getCurrency());
            } else if (cryptoListItem3 instanceof CryptoListItem.ActionBar) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.ActionBar) cryptoListItem3).getCryptoId(), (Object) currencyToken.getCurrency());
            } else if (cryptoListItem3 instanceof CryptoListItem.BuyDexListItem) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyDexListItem) cryptoListItem3).AEQbTJ().getSymbol(), (Object) currencyToken.getCurrency());
            } else if (cryptoListItem3 instanceof CryptoListItem.Application) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.Application) cryptoListItem3).OLrzqt().getSymbol(), (Object) currencyToken.getCurrency());
            } else {
                continue;
                i2++;
            }
            if (zEZpvd) {
                break;
            } else {
                i2++;
            }
        }
        AYXKKw().AEQbTJ(cryptoListItem2, i2, C33129mqd.OLrzqt((CharSequence) currencyToken.getDexInfo().getUniqueId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(CurrencyToken currencyToken) {
        List<CryptoListItem> listOLrzqt;
        CryptoListItem cryptoListItem;
        String strKWHzl;
        boolean zEZpvd;
        Object next;
        boolean zEZpvd2;
        int i = Application.OLrzqt[AYXKKw().AhwBna().ordinal()];
        if (i == 1) {
            C32989mnw<List<CryptoListItem>> value = AYXKKw().OLrzqt().getValue();
            if (value != null) {
                listOLrzqt = value.OLrzqt();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C32989mnw<List<CryptoListItem>> value2 = AYXKKw().djBIcL().getValue();
            listOLrzqt = value2 != null ? value2.OLrzqt() : null;
        }
        if (listOLrzqt != null) {
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CryptoListItem cryptoListItem2 = (CryptoListItem) next;
                if (cryptoListItem2 instanceof CryptoListItem.BuyCryptoListItem) {
                    zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyCryptoListItem) cryptoListItem2).EZpvd().getCurrencyId(), (Object) currencyToken.getCurrencyId());
                } else if (cryptoListItem2 instanceof CryptoListItem.ActionBar) {
                    zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.ActionBar) cryptoListItem2).EZpvd().getCurrencyId(), (Object) currencyToken.getCurrencyId());
                } else if (cryptoListItem2 instanceof CryptoListItem.BuyDexListItem) {
                    zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyDexListItem) cryptoListItem2).getCryptoId(), (Object) currencyToken.getDexInfo().getUniqueId());
                } else if (cryptoListItem2 instanceof CryptoListItem.Application) {
                    zEZpvd2 = Intrinsics.EZpvd((Object) ((CryptoListItem.Application) cryptoListItem2).getCryptoId(), (Object) currencyToken.getDexInfo().getUniqueId());
                } else {
                    continue;
                }
                if (zEZpvd2) {
                    break;
                }
            }
            cryptoListItem = (CryptoListItem) next;
        } else {
            cryptoListItem = null;
        }
        if (listOLrzqt == null) {
            int i2 = Application.OLrzqt[AYXKKw().AhwBna().ordinal()];
            if (i2 == 1) {
                listOLrzqt = (List) mHA.OLrzqt.AEQbTJ(AYXKKw().KWHzl());
                if (listOLrzqt == null) {
                    listOLrzqt = yDY.AhwBna();
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listOLrzqt = (List) mHA.OLrzqt.AEQbTJ(AYXKKw().fetchVPNInfo());
                if (listOLrzqt == null) {
                    listOLrzqt = yDY.AhwBna();
                }
            }
        }
        List<CryptoListItem> list = listOLrzqt;
        Iterator<CryptoListItem> it2 = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            }
            CryptoListItem next2 = it2.next();
            if (next2 instanceof CryptoListItem.BuyCryptoListItem) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyCryptoListItem) next2).EZpvd().getCurrencyId(), (Object) currencyToken.getCurrencyId());
            } else if (next2 instanceof CryptoListItem.ActionBar) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.ActionBar) next2).EZpvd().getCurrencyId(), (Object) currencyToken.getCurrencyId());
            } else if (next2 instanceof CryptoListItem.BuyDexListItem) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.BuyDexListItem) next2).getCryptoId(), (Object) currencyToken.getDexInfo().getUniqueId());
            } else if (next2 instanceof CryptoListItem.Application) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem.Application) next2).getCryptoId(), (Object) currencyToken.getDexInfo().getUniqueId());
            } else {
                continue;
                i3++;
            }
            if (zEZpvd) {
                break;
            } else {
                i3++;
            }
        }
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        String strGEmmrt = numValueOf != null ? C33129mqd.gEmmrt(Integer.valueOf(numValueOf.intValue() + 1)) : null;
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        String str = strGEmmrt;
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: o.lDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellCryptoListFragment.KWHzl((CryptoListItem) obj);
            }
        }, 30, null);
        int i4 = Application.OLrzqt[AYXKKw().AhwBna().ordinal()];
        if (i4 == 1) {
            strKWHzl = AYXKKw().copydefault().KWHzl();
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strKWHzl = AYXKKw().gEmmrt().EZpvd();
        }
        AYXKKw().EZpvd("select_crypto", new C30350lVc(null, strJoinToString$default, null, strKWHzl, C33129mqd.OLrzqt((CharSequence) currencyToken.getDexInfo().getUniqueId()), C33129mqd.OLrzqt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getPrimarySimilarity()) : null), C33129mqd.OLrzqt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getSecondarySimilarity()) : null), currencyToken.getCurrency(), str, null, 517, null), true);
    }

    public static final CharSequence KWHzl(CryptoListItem cryptoListItem) {
        Intrinsics.checkNotNullParameter(cryptoListItem, "");
        return cryptoListItem instanceof CryptoListItem.BuyCryptoListItem ? ((CryptoListItem.BuyCryptoListItem) cryptoListItem).getCryptoId() : cryptoListItem instanceof CryptoListItem.ActionBar ? ((CryptoListItem.ActionBar) cryptoListItem).getCryptoId() : cryptoListItem instanceof CryptoListItem.BuyDexListItem ? C33129mqd.gEmmrt(((CryptoListItem.BuyDexListItem) cryptoListItem).getSecondary()) : cryptoListItem instanceof CryptoListItem.Application ? C33129mqd.gEmmrt(((CryptoListItem.Application) cryptoListItem).getSecondary()) : "";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class ListType implements Parcelable {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ ListType[] $VALUES;
            public static final Parcelable.Creator<ListType> CREATOR;
            public static final ListType BUY = new ListType("BUY", 0);
            public static final ListType SELL = new ListType("SELL", 1);

            public static final class Creator implements Parcelable.Creator<ListType> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ListType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return ListType.valueOf(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ListType[] newArray(int i) {
                    return new ListType[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ ListType[] $values() {
                return new ListType[]{BUY, SELL};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<ListType> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(name());
            }

            private ListType(String str, int i) {
            }

            static {
                ListType[] listTypeArr$values = $values();
                $VALUES = listTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(listTypeArr$values);
                CREATOR = new Creator();
            }

            public static ListType valueOf(String str) {
                return (ListType) Enum.valueOf(ListType.class, str);
            }

            public static ListType[] values() {
                return (ListType[]) $VALUES.clone();
            }
        }

        public final BuySellCryptoListFragment EZpvd(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BuySellCryptoListFragment buySellCryptoListFragment = new BuySellCryptoListFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("list_type", ListType.SELL);
            bundle.putString("selected_token", str);
            bundle.putString("selected_currency", str2);
            bundle.putBoolean("has_verification_status", z);
            bundle.putBoolean("is_from_bottomsheet", z2);
            buySellCryptoListFragment.setArguments(bundle);
            return buySellCryptoListFragment;
        }

        public final BuySellCryptoListFragment AEQbTJ(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BuySellCryptoListFragment buySellCryptoListFragment = new BuySellCryptoListFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("list_type", ListType.BUY);
            bundle.putString("selected_token", str);
            bundle.putString("selected_currency", str2);
            bundle.putBoolean("is_from_bottomsheet", z);
            buySellCryptoListFragment.setArguments(bundle);
            return buySellCryptoListFragment;
        }
    }
}
