package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.mln.vm.DeFiMiniDetailAssetViewModel;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResult;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.uilab.reminder.OKReminder;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractActivityC33041mov;
import o.AbstractC27470jvm;
import o.C23735iHj;
import o.C25491ixi;
import o.C25528iyS;
import o.C25533iyX;
import o.C26534jeD;
import o.C26566jej;
import o.C26683jgu;
import o.C26684jgv;
import o.C27488jwD;
import o.C27493jwI;
import o.C27586jxw;
import o.C27589jxz;
import o.C33057mpK;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C54946xaf;
import o.C55113xdn;
import o.C55118xds;
import o.C55251xgS;
import o.C55296xhK;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC25466ixJ;
import o.InterfaceC56387yDm;
import o.iYF;
import o.iYR;
import o.iYT;
import o.pUU;
import o.wXQ;
import o.wYC;
import o.yCM;
import o.yIP;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AssetDetailsBottomSheet extends iYT implements InterfaceC25466ixJ {
    public C26566jej KWHzl;

    @yCM
    public C25528iyS claimTransactionHandler;
    public boolean valueOf;
    public static final /* synthetic */ yJA<Object>[] copydefault = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(AssetDetailsBottomSheet.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/DialogAssetDetailsBinding;", 0))};
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final yIP AEQbTJ = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.iYI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AssetDetailsBottomSheet.valueOf();
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.iYJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AssetDetailsBottomSheet.AhwBna(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iYH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AssetDetailsBottomSheet.djBIcL(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.iYL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AssetDetailsBottomSheet.gEmmrt(this.OLrzqt);
        }
    });

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.CLAIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonAction.ADD_LIQUIDITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public final C23735iHj DbNXlk() {
        return (C23735iHj) this.AEQbTJ.getValue(this, copydefault[0]);
    }

    public final void KWHzl(@NotNull C23735iHj c23735iHj) {
        Intrinsics.checkNotNullParameter(c23735iHj, "");
        this.AEQbTJ.KWHzl(this, copydefault[0], c23735iHj);
    }

    public final C25491ixi fetchVPNInfo() {
        return (C25491ixi) this.AYXKKw.getValue();
    }

    public static final C25491ixi valueOf() {
        return C25491ixi.copydefault;
    }

    public final C25528iyS gEmmrt() {
        C25528iyS c25528iyS = this.claimTransactionHandler;
        if (c25528iyS != null) {
            return c25528iyS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final AssetDetailsParams values() {
        return (AssetDetailsParams) this.gEmmrt.getValue();
    }

    public static final AssetDetailsParams AhwBna(AssetDetailsBottomSheet assetDetailsBottomSheet) {
        AssetDetailsParams assetDetailsParams;
        Bundle arguments = assetDetailsBottomSheet.getArguments();
        if (arguments == null || (assetDetailsParams = (AssetDetailsParams) arguments.getParcelable("key.params_asset_details")) == null) {
            throw new IllegalStateException("Must provide params".toString());
        }
        return assetDetailsParams;
    }

    public final iYF AYXKKw() {
        return (iYF) this.OLrzqt.getValue();
    }

    public static final iYF djBIcL(final AssetDetailsBottomSheet assetDetailsBottomSheet) {
        return new iYF(new Function2() { // from class: o.iYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AssetDetailsBottomSheet.KWHzl(this.OLrzqt, (ButtonAction) obj, (AssetRawData) obj2);
            }
        });
    }

    public static final Unit KWHzl(final AssetDetailsBottomSheet assetDetailsBottomSheet, ButtonAction buttonAction, AssetRawData assetRawData) {
        Intrinsics.checkNotNullParameter(buttonAction, "");
        Intrinsics.checkNotNullParameter(assetRawData, "");
        assetDetailsBottomSheet.copydefault(buttonAction, assetRawData, new Function1() { // from class: o.iYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AssetDetailsBottomSheet.AEQbTJ(this.KWHzl, (AssetDetailsResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AssetDetailsBottomSheet assetDetailsBottomSheet, AssetDetailsResult assetDetailsResult) {
        Intrinsics.checkNotNullParameter(assetDetailsResult, "");
        if (assetDetailsBottomSheet.isAdded() && !assetDetailsBottomSheet.isDetached()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("result.asset_details", assetDetailsResult);
            Unit unit = Unit.INSTANCE;
            FragmentKt.setFragmentResult(assetDetailsBottomSheet, "result.asset_details", bundle);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ iYR.Application AEQbTJ;
        public final /* synthetic */ C23735iHj EZpvd;
        public final /* synthetic */ AssetDetailsBottomSheet KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, AssetDetailsBottomSheet assetDetailsBottomSheet, C23735iHj c23735iHj, iYR.Application application) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = assetDetailsBottomSheet;
            this.EZpvd = c23735iHj;
            this.AEQbTJ = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.valueOf = !r7.valueOf;
                TextView textView = this.EZpvd.isConnected;
                AssetDetailsBottomSheet assetDetailsBottomSheet = this.KWHzl;
                textView.setText(assetDetailsBottomSheet.copydefault(this.AEQbTJ, assetDetailsBottomSheet.valueOf));
            }
        }
    }

    public final DeFiMiniDetailAssetViewModel isConnected() {
        return (DeFiMiniDetailAssetViewModel) this.djBIcL.getValue();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setCloseVisibility(false);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        InvestAction investActionCopydefault;
        C55118xds root;
        Drawable background;
        ProductDetailsByChain productDetailsByChainAEQbTJ;
        ChainInfo chainInfoAEQbTJ;
        ProductDetailsByChain productDetailsByChainAEQbTJ2;
        ProductDetailsByChain productDetailsByChainAEQbTJ3;
        ChainInfo chainInfoAEQbTJ2;
        String strEZpvd;
        ProductDetailsByChain productDetailsByChainAEQbTJ4;
        ChainInfo chainInfoAEQbTJ3;
        ProductDetailsByChain productDetailsByChainAEQbTJ5;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AssetRawData assetRawDataCopydefault = values().copydefault();
        long jOLrzqt = -1;
        long jOLrzqt2 = (assetRawDataCopydefault == null || (productDetailsByChainAEQbTJ5 = assetRawDataCopydefault.AEQbTJ()) == null) ? -1L : productDetailsByChainAEQbTJ5.OLrzqt();
        InvestmentKind investmentKind = InvestmentKind.Default;
        AssetRawData assetRawDataCopydefault2 = values().copydefault();
        if (assetRawDataCopydefault2 != null && (productDetailsByChainAEQbTJ4 = assetRawDataCopydefault2.AEQbTJ()) != null && (chainInfoAEQbTJ3 = productDetailsByChainAEQbTJ4.AEQbTJ()) != null) {
            jOLrzqt = chainInfoAEQbTJ3.OLrzqt();
        }
        long j = jOLrzqt;
        AssetRawData assetRawDataCopydefault3 = values().copydefault();
        ProductDetailsByChain productDetailsByChain = new ProductDetailsByChain(jOLrzqt2, investmentKind, new ChainInfo(j, (assetRawDataCopydefault3 == null || (productDetailsByChainAEQbTJ3 = assetRawDataCopydefault3.AEQbTJ()) == null || (chainInfoAEQbTJ2 = productDetailsByChainAEQbTJ3.AEQbTJ()) == null || (strEZpvd = chainInfoAEQbTJ2.EZpvd()) == null) ? "" : strEZpvd, null, null, null, 28, null), false, null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null);
        DeFiMiniDetailAssetViewModel deFiMiniDetailAssetViewModelIsConnected = isConnected();
        C26534jeD c26534jeD = new C26534jeD(this, fetchVPNInfo());
        C25528iyS c25528iySGEmmrt = gEmmrt();
        AssetRawData assetRawDataCopydefault4 = values().copydefault();
        long jOLrzqt3 = 0;
        long jOLrzqt4 = (assetRawDataCopydefault4 == null || (productDetailsByChainAEQbTJ2 = assetRawDataCopydefault4.AEQbTJ()) == null) ? 0L : productDetailsByChainAEQbTJ2.OLrzqt();
        AssetRawData assetRawDataCopydefault5 = values().copydefault();
        if (assetRawDataCopydefault5 != null && (productDetailsByChainAEQbTJ = assetRawDataCopydefault5.AEQbTJ()) != null && (chainInfoAEQbTJ = productDetailsByChainAEQbTJ.AEQbTJ()) != null) {
            jOLrzqt3 = chainInfoAEQbTJ.OLrzqt();
        }
        long j2 = jOLrzqt3;
        AssetRawData assetRawDataCopydefault6 = values().copydefault();
        if (assetRawDataCopydefault6 == null || (investActionCopydefault = assetRawDataCopydefault6.copydefault()) == null) {
            investActionCopydefault = InvestAction.Bonus;
        }
        this.KWHzl = new C26566jej(productDetailsByChain, this, deFiMiniDetailAssetViewModelIsConnected, c26534jeD, c25528iySGEmmrt, new C25533iyX(this, new C26684jgv(new C26683jgu(jOLrzqt4, j2, "dashboard", investActionCopydefault), false, 2, null)));
        C27589jxz.collectOnViewLifecycle$default(this, isConnected().EZpvd(), null, new TaskDescription(), 2, null);
        isConnected().OLrzqt(values());
        C54946xaf binding = getBinding();
        if (binding == null || (root = binding.getRoot()) == null || (background = root.getBackground()) == null) {
            return;
        }
        C33057mpK.copydefault(background, C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(iYR iyr, Continuation<? super Unit> continuation) {
            AssetDetailsBottomSheet.this.KWHzl(iyr);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        KWHzl(C23735iHj.AEQbTJ(LayoutInflater.from(requireContext())));
        constraintLayout.addView(DbNXlk().getRoot(), new ViewGroup.LayoutParams(-1, -2));
    }

    public final void KWHzl(iYR iyr) {
        if (iyr instanceof iYR.Application) {
            ConstraintLayout constraintLayout = DbNXlk().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            DbNXlk().OLrzqt.copydefault();
            EZpvd((iYR.Application) iyr);
            return;
        }
        if (iyr instanceof iYR.TaskDescription) {
            DbNXlk().OLrzqt.copydefault();
            pUU.copydefault(((iYR.TaskDescription) iyr).AEQbTJ());
        } else {
            if (!Intrinsics.EZpvd(iyr, iYR.StateListAnimator.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintLayout constraintLayout2 = DbNXlk().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            C55113xdn c55113xdn = DbNXlk().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(0);
            C55113xdn.showLoading$default(DbNXlk().OLrzqt, 0L, 1, null);
        }
    }

    public void EZpvd(@NotNull iYR.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        C23735iHj c23735iHjDbNXlk = DbNXlk();
        c23735iHjDbNXlk.fetchVPNInfo.setText(application.valueOf());
        TextView textView = c23735iHjDbNXlk.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((CharSequence) application.valueOf()) ? 0 : 8);
        if (values().KWHzl() == SheetType.BONUS && C33129mqd.OLrzqt((CharSequence) values().EZpvd())) {
            c23735iHjDbNXlk.AYXKKw.setVisibility(0);
            OKReminder oKReminder = c23735iHjDbNXlk.djBIcL;
            String strEZpvd = values().EZpvd();
            if (!(strEZpvd instanceof CharSequence)) {
                strEZpvd = null;
            }
            oKReminder.setMessage((CharSequence) strEZpvd);
            oKReminder.setStyle(0);
            oKReminder.setCloseIconVisibility(false);
        }
        c23735iHjDbNXlk.DbNXlk.setText(application.copydefault());
        TextView textView2 = c23735iHjDbNXlk.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((CharSequence) application.copydefault()) ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = c23735iHjDbNXlk.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(C33129mqd.OLrzqt((CharSequence) application.djBIcL()) ? 0 : 8);
        c23735iHjDbNXlk.fARcdN.setText(application.djBIcL());
        C55251xgS c55251xgS = c23735iHjDbNXlk.AuCTel;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(application.KWHzl() != null ? 0 : 8);
        C55251xgS c55251xgS2 = c23735iHjDbNXlk.AuCTel;
        Integer numAhwBna = application.AhwBna();
        if (numAhwBna != null) {
            c55251xgS2.setOKDSStyle(numAhwBna.intValue());
        }
        Integer numKWHzl = application.KWHzl();
        if (numKWHzl != null) {
            c55251xgS2.setText(C33070mpX.AYXKKw(numKWHzl.intValue()));
        }
        c23735iHjDbNXlk.values.setText(application.AYXKKw());
        TextView textView3 = c23735iHjDbNXlk.values;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(C33129mqd.OLrzqt((CharSequence) application.AYXKKw()) ? 0 : 8);
        boolean zDbNXlk = application.DbNXlk();
        this.valueOf = zDbNXlk;
        c23735iHjDbNXlk.isConnected.setText(copydefault(application, zDbNXlk));
        LinearLayoutCompat linearLayoutCompat2 = c23735iHjDbNXlk.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(C33129mqd.OLrzqt((CharSequence) application.EZpvd()) ? 0 : 8);
        wYC wyc = c23735iHjDbNXlk.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(C33129mqd.OLrzqt((CharSequence) application.AEQbTJ()) ? 0 : 8);
        wYC wyc2 = c23735iHjDbNXlk.KWHzl;
        wyc2.setOnClickListener(new Activity(wyc2, 1000L, this, c23735iHjDbNXlk, application));
        c23735iHjDbNXlk.AkhnZx.setText(C27488jwD.copydefault.KWHzl(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(application.gEmmrt()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null)));
        TextView textView4 = c23735iHjDbNXlk.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(C33129mqd.OLrzqt((CharSequence) application.gEmmrt()) ? 0 : 8);
        c23735iHjDbNXlk.valueOf.setAdapter(AYXKKw());
        AbstractC27470jvm.setData$default(AYXKKw(), application.OLrzqt(), null, 2, null);
    }

    public final String copydefault(iYR.Application application, boolean z) {
        if (z) {
            return application.AEQbTJ();
        }
        return application.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onClaim$default(AssetDetailsBottomSheet assetDetailsBottomSheet, ButtonAction buttonAction, AssetRawData assetRawData, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        assetDetailsBottomSheet.copydefault(buttonAction, assetRawData, (Function1<? super AssetDetailsResult, Unit>) function1);
    }

    public final void copydefault(ButtonAction buttonAction, AssetRawData assetRawData, Function1<? super AssetDetailsResult, Unit> function1) {
        ChainInfo chainInfoAEQbTJ;
        ProductDetailsByChain productDetailsByChainAEQbTJ = assetRawData.AEQbTJ();
        if (((productDetailsByChainAEQbTJ == null || (chainInfoAEQbTJ = productDetailsByChainAEQbTJ.AEQbTJ()) == null) ? null : Long.valueOf(chainInfoAEQbTJ.OLrzqt())) == null) {
            return;
        }
        if (values().AhwBna() == AssetDetailsSource.MINI_PROJECT) {
            String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(assetRawData.AEQbTJ().OLrzqt()));
            String strGEmmrt2 = C33129mqd.gEmmrt(Long.valueOf(assetRawData.AEQbTJ().AEQbTJ().OLrzqt()));
            int i = Application.AEQbTJ[buttonAction.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    fetchVPNInfo().EZpvd(strGEmmrt, strGEmmrt2, "add_liquidity");
                }
            } else if (assetRawData.AYXKKw()) {
                fetchVPNInfo().EZpvd(strGEmmrt, strGEmmrt2, "collect_fee");
            } else {
                fetchVPNInfo().EZpvd(strGEmmrt, strGEmmrt2, "claim_reward");
            }
        }
        if (buttonAction == ButtonAction.ADD_LIQUIDITY && function1 != null) {
            AssetDetailsResultType assetDetailsResultType = AssetDetailsResultType.ADD_LIQUIDITY;
            long jOLrzqt = assetRawData.AEQbTJ().AEQbTJ().OLrzqt();
            long jOLrzqt2 = assetRawData.AEQbTJ().OLrzqt();
            String strDjBIcL = assetRawData.djBIcL();
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            function1.invoke(new AssetDetailsResult(assetDetailsResultType, jOLrzqt, jOLrzqt2, strDjBIcL));
            dismiss();
        }
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AssetDetailsBottomSheet$onClaim$2(this, assetRawData, function1, null), 3, null);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final AssetDetailsBottomSheet KWHzl(@NotNull AssetDetailsParams assetDetailsParams) {
            Intrinsics.checkNotNullParameter(assetDetailsParams, "");
            AssetDetailsBottomSheet assetDetailsBottomSheet = new AssetDetailsBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.params_asset_details", assetDetailsParams);
            assetDetailsBottomSheet.setArguments(bundle);
            return assetDetailsBottomSheet;
        }
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope KWHzl() {
        return LifecycleOwnerKt.getLifecycleScope(this);
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
    }

    /* JADX DEBUG: Possible override for method o.iYT.OLrzqt()V */
    @Override // o.InterfaceC25466ixJ
    public FragmentManager OLrzqt() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        return parentFragmentManager;
    }

    @Override // o.InterfaceC25466ixJ
    public Context AEQbTJ() {
        return getContext();
    }

    @Override // o.InterfaceC25466ixJ
    public AbstractActivityC33041mov EZpvd() {
        FragmentActivity activity = getActivity();
        if (activity instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) activity;
        }
        return null;
    }

    public static final DeFiMiniDetailAssetViewModel gEmmrt(final AssetDetailsBottomSheet assetDetailsBottomSheet) {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet$viewModel_delegate$lambda$6$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return assetDetailsBottomSheet;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet$viewModel_delegate$lambda$6$$inlined$viewModels$default$2
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
        return (DeFiMiniDetailAssetViewModel) FragmentViewModelLazyKt.createViewModelLazy(assetDetailsBottomSheet, C56524yIo.AEQbTJ(DeFiMiniDetailAssetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet$viewModel_delegate$lambda$6$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet$viewModel_delegate$lambda$6$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet$viewModel_delegate$lambda$6$$inlined$viewModels$default$5
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
                    defaultViewModelProviderFactory = assetDetailsBottomSheet.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }
}
