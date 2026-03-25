package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.TokenAgeUnit;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingBuyInputPanelViewModel;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.JsonElement;
import o.C19900gTm;
import o.C19903gTp;
import o.C19927gUm;
import o.C19933gUs;
import o.C19936gUv;
import o.C19938gUx;
import o.C21997hUb;
import o.C22416heu;
import o.C23274hvD;
import o.C23311hvo;
import o.C23313hvq;
import o.C23317hvu;
import o.C23322hvz;
import o.C23428hxz;
import o.C24324ibg;
import o.C25332iui;
import o.C25352ivB;
import o.C25382ivf;
import o.C25389ivm;
import o.C25404iwA;
import o.C30449lbP;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C52812wZg;
import o.C55051xce;
import o.C55113xdn;
import o.C55173xeu;
import o.C55239xgG;
import o.C55249xgQ;
import o.C55296xhK;
import o.C55298xhM;
import o.C55320xhi;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC19683gLl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.ViewOnClickListenerC54939xaY;
import o.dTQ;
import o.gSV;
import o.gTA;
import o.gTB;
import o.gTC;
import o.gUB;
import o.gUR;
import o.hTL;
import o.yCM;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyActivity extends gSV implements C19936gUv.Activity, C19933gUs.Activity {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gSt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CopyTradingEditStrategyActivity.fetchVPNInfo(this.copydefault);
        }
    });

    @yCM
    public InterfaceC19683gLl walletUiService;

    public CopyTradingEditStrategyActivity() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(CopyTradingEditStrategyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$special$$inlined$viewModels$default$3
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
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(CopyTradingBuyInputPanelViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$special$$inlined$viewModels$default$6
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

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final InterfaceC19683gLl valueOf() {
        InterfaceC19683gLl interfaceC19683gLl = this.walletUiService;
        if (interfaceC19683gLl != null) {
            return interfaceC19683gLl;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final CopyTradingEditStrategyViewModel gEmmrt() {
        return (CopyTradingEditStrategyViewModel) this.KWHzl.getValue();
    }

    public final CopyTradingBuyInputPanelViewModel AYXKKw() {
        return (CopyTradingBuyInputPanelViewModel) this.EZpvd.getValue();
    }

    public final C23428hxz AhwBna() {
        return (C23428hxz) this.OLrzqt.getValue();
    }

    public static final C23428hxz fetchVPNInfo(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
        return C23428hxz.OLrzqt(copyTradingEditStrategyActivity.getLayoutInflater());
    }

    @Override // o.gSV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AhwBna().getRoot());
        fJNWhG();
        EZpvd(0);
        AhwBna().ejfBZ.setRetryClickListener(new View.OnClickListener() { // from class: o.gSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                CopyTradingEditStrategyActivity.EZpvd(this.KWHzl, view);
            }
        });
        EZpvd(AhwBna());
        KWHzl(AhwBna());
        AEQbTJ(AhwBna(), bundle == null);
        gEmmrt(AhwBna());
        AEQbTJ(AhwBna());
        copydefault(AhwBna());
        OLrzqt(AhwBna());
        AuCTel();
        gEmmrt().AubY();
    }

    public static final void EZpvd(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, View view) {
        copyTradingEditStrategyActivity.EZpvd(0);
        copyTradingEditStrategyActivity.gEmmrt().getFieldNames();
    }

    private final void fJNWhG() {
        C23428hxz c23428hxzAhwBna = AhwBna();
        c23428hxzAhwBna.getRoot().setContentDescription("web3_dex_copytrading_edit_container");
        c23428hxzAhwBna.AuCTel.setContentDescription("web3_dex_copytrading_edit_expires_row");
        c23428hxzAhwBna.EZpvd.setContentDescription("web3_dex_copytrading_edit_confirm_btn");
    }

    @Override // o.C19936gUv.Activity
    public void DbNXlk() {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(gEmmrt(), TrackButtonName.EXPAND_FILTERS.getButtonName(), null, 2, null);
    }

    @Override // o.C19933gUs.Activity
    public void fetchVPNInfo() {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(gEmmrt(), TrackButtonName.ADD_BLOCK_TOKEN.getButtonName(), null, 2, null);
    }

    private final void AuCTel() {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$observeData$1(this, null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$observeData$2(this, null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$observeData$3(this, null), 3, null);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ CopyTradingEditStrategyActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = copyTradingEditStrategyActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.AEQbTJ;
                CopyTradingEditStrategyViewModel.trackClickEvent$default(this.copydefault.gEmmrt(), TrackButtonName.EXPIRATION_EXPLAIN.getButtonName(), null, 2, null);
                Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.v), c55320xhi.getContext().getString(C23274hvD.Fragment.hfdhUn)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (Object) null).show();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ CopyTradingEditStrategyActivity AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = copyTradingEditStrategyActivity;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.gLl.StateListAnimator.showRechargeDialog$default(o.gLl, o.mov, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.Integer, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (Intrinsics.EZpvd(((C52794wYp) this.KWHzl).getTag(), Boolean.TRUE)) {
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = this.AEQbTJ.AYXKKw().AEQbTJ();
                    if (dexMultiTokenInfoBeanAEQbTJ != null) {
                        InterfaceC19683gLl interfaceC19683gLlValueOf = this.AEQbTJ.valueOf();
                        CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.AEQbTJ;
                        String chainId = dexMultiTokenInfoBeanAEQbTJ.getChainId();
                        if (dexMultiTokenInfoBeanAEQbTJ.isMainChainCoin()) {
                            dexMultiTokenInfoBeanAEQbTJ = null;
                        }
                        String tokenContractAddress = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getTokenContractAddress() : null;
                        InterfaceC19683gLl.StateListAnimator.showRechargeDialog$default(interfaceC19683gLlValueOf, copyTradingEditStrategyActivity, chainId, tokenContractAddress == null ? "" : tokenContractAddress, null, null, null, 56, null);
                        return;
                    }
                    return;
                }
                FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C30449lbP.copydefault(supportFragmentManager, null, this.AEQbTJ.new TaskDescription());
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ CopyTradingEditStrategyActivity EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = copyTradingEditStrategyActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
        }
    }

    public final void EZpvd(final C23428hxz c23428hxz) {
        getSupportFragmentManager().setFragmentResultListener("CopyTradingEditStrategyNameBottomSheet.requestKey", this, new FragmentResultListener() { // from class: o.gSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                CopyTradingEditStrategyActivity.AEQbTJ(this.OLrzqt, str, bundle);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(c23428hxz.getRoot(), new OnApplyWindowInsetsListener() { // from class: o.gSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return CopyTradingEditStrategyActivity.EZpvd(c23428hxz, this, view, windowInsetsCompat);
            }
        });
        Context context = c23428hxz.getRoot().getContext();
        Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.reset);
        if (drawable != null) {
            Intrinsics.copydefault(context);
            drawable.setBounds(0, 0, C55298xhM.OLrzqt(20, context), C55298xhM.OLrzqt(20, context));
        }
        TextViewCompat.setCompoundDrawablesRelative(c23428hxz.fIwbmz, null, null, drawable, null);
        ImageView imageView = c23428hxz.valueOf;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindAppBar$4(this, c23428hxz, context, null), 3, null);
    }

    public static final void AEQbTJ(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        String string = bundle.getString("KEY_STRATEGY_NAME");
        if (string == null || string.length() == 0) {
            return;
        }
        copyTradingEditStrategyActivity.gEmmrt().EZpvd(new gTB.ActionBar(string));
    }

    public static final WindowInsetsCompat EZpvd(C23428hxz c23428hxz, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
        NestedScrollView nestedScrollView = c23428hxz.values;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int i = 0;
            layoutParams2.bottomToBottom = zIsVisible ? 0 : -1;
            if (zIsVisible) {
                Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
                Intrinsics.checkNotNullExpressionValue(insets2, "");
                i = insets2.bottom - insets.bottom;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i;
            layoutParams2.bottomToTop = zIsVisible ? -1 : c23428hxz.AhwBna.getId();
            nestedScrollView.setLayoutParams(layoutParams2);
            if (!zIsVisible) {
                FrameLayout frameLayoutOLrzqt = copyTradingEditStrategyActivity.AhwBna().getRoot();
                Intrinsics.checkNotNullExpressionValue(frameLayoutOLrzqt, "");
                copyTradingEditStrategyActivity.clearAllEditTextFocus(frameLayoutOLrzqt);
            }
            view.setPaddingRelative(view.getPaddingStart(), insets.top, view.getPaddingEnd(), view.getPaddingBottom());
            return windowInsetsCompat;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void clearAllEditTextFocus(View view) {
        if (view instanceof EditText) {
            view.clearFocus();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                clearAllEditTextFocus(childAt);
            }
        }
    }

    public final void KWHzl(C23428hxz c23428hxz) {
        getSupportFragmentManager().setFragmentResultListener("SelectNetworkBottomSheet.requestKey", this, new FragmentResultListener() { // from class: o.gSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                CopyTradingEditStrategyActivity.OLrzqt(this.AEQbTJ, str, bundle);
            }
        });
        c23428hxz.OLrzqt.setOnChainClickListener(new Function0() { // from class: o.gSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CopyTradingEditStrategyActivity.valueOf(this.OLrzqt);
            }
        });
        c23428hxz.OLrzqt.setAddressTextChangedListener(new Function1() { // from class: o.gSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingEditStrategyActivity.copydefault(this.copydefault, (java.lang.String) obj);
            }
        });
        c23428hxz.OLrzqt.setEnabled(!gEmmrt().uzCIH());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindAddress$4(this, c23428hxz, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindAddress$5(this, c23428hxz, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hTL.ActionBar.show$default(o.hTL$ActionBar, androidx.fragment.app.FragmentManager, o.hUb, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public static final Unit valueOf(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
        hTL.ActionBar actionBar = hTL.Companion;
        FragmentManager supportFragmentManager = copyTradingEditStrategyActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        hTL.ActionBar.show$default(actionBar, supportFragmentManager, new C21997hUb(NetworkSource.CopyTrading, copyTradingEditStrategyActivity.gEmmrt().EZpvd(), false, copyTradingEditStrategyActivity.gEmmrt().AuCTel().getType(), true, null, false, true, 96, null), null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copyTradingEditStrategyActivity.gEmmrt().copydefault(str);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C23428hxz c23428hxz, boolean z) {
        if (z) {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindBuySellSettings$1(this, null), 3, null);
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindBuySellSettings$2(this, c23428hxz, null), 3, null);
        }
    }

    public final void gEmmrt(final C23428hxz c23428hxz) {
        c23428hxz.DbNXlk.setCallback$OKDex_dex_impl(this);
        c23428hxz.DbNXlk.EZpvd().setCallback$OKDex_dex_impl(this);
        getSupportFragmentManager().setFragmentResultListener("CopyTradingEditStrategyActivity.tokenAgeMin", this, new FragmentResultListener() { // from class: o.gSz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                CopyTradingEditStrategyActivity.copydefault(c23428hxz, this, str, bundle);
            }
        });
        getSupportFragmentManager().setFragmentResultListener("CopyTradingEditStrategyActivity.tokenAgeMax", this, new FragmentResultListener() { // from class: o.gSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                CopyTradingEditStrategyActivity.AEQbTJ(c23428hxz, this, str, bundle);
            }
        });
        c23428hxz.DbNXlk.KWHzl().setOnMinUnitClickListener(new View.OnClickListener() { // from class: o.gSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                CopyTradingEditStrategyActivity.AEQbTJ(c23428hxz, this, view);
            }
        });
        c23428hxz.DbNXlk.KWHzl().setOnMaxUnitClickListener(new View.OnClickListener() { // from class: o.gSy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                CopyTradingEditStrategyActivity.OLrzqt(c23428hxz, this, view);
            }
        });
        c23428hxz.DbNXlk.setOnFilterChangedListener(new Function1() { // from class: o.gSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingEditStrategyActivity.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c23428hxz.DbNXlk.setTitles();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindTokenFilters$6(this, c23428hxz, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindTokenFilters$7(this, c23428hxz, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindTokenFilters$8(this, null), 3, null);
    }

    public static final void AEQbTJ(C23428hxz c23428hxz, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, View view) {
        C19903gTp.StateListAnimator stateListAnimator = C19903gTp.Companion;
        InterfaceC56445yFq<TokenAgeUnit> entries = TokenAgeUnit.getEntries();
        RangeFilterUnit rangeFilterUnitOLrzqt = c23428hxz.DbNXlk.KWHzl().OLrzqt();
        if (rangeFilterUnitOLrzqt == null) {
            rangeFilterUnitOLrzqt = TokenAgeUnit.Sec;
        }
        stateListAnimator.copydefault(entries, rangeFilterUnitOLrzqt, "CopyTradingEditStrategyActivity.tokenAgeMin").show(copyTradingEditStrategyActivity.getSupportFragmentManager(), "CopyTradingEditStrategyActivity.tokenAgeMin");
    }

    public static final void OLrzqt(C23428hxz c23428hxz, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, View view) {
        C19903gTp.StateListAnimator stateListAnimator = C19903gTp.Companion;
        InterfaceC56445yFq<TokenAgeUnit> entries = TokenAgeUnit.getEntries();
        RangeFilterUnit rangeFilterUnitAEQbTJ = c23428hxz.DbNXlk.KWHzl().AEQbTJ();
        if (rangeFilterUnitAEQbTJ == null) {
            rangeFilterUnitAEQbTJ = TokenAgeUnit.Sec;
        }
        stateListAnimator.copydefault(entries, rangeFilterUnitAEQbTJ, "CopyTradingEditStrategyActivity.tokenAgeMax").show(copyTradingEditStrategyActivity.getSupportFragmentManager(), "CopyTradingEditStrategyActivity.tokenAgeMax");
    }

    public static final Unit EZpvd(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, boolean z) {
        copyTradingEditStrategyActivity.ejfBZ();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C23428hxz c23428hxz) {
        getSupportFragmentManager().setFragmentResultListener("CopyTradingExpireContainerDialog.requestKey", this, new FragmentResultListener() { // from class: o.gSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                CopyTradingEditStrategyActivity.gEmmrt(this.copydefault, str, bundle);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindExpiresAfter$2(this, c23428hxz, null), 3, null);
        c23428hxz.AYXKKw.setTextAppearance(C52761wXj.LoaderManager.valueOf);
        C55320xhi c55320xhi = c23428hxz.AYXKKw;
        c55320xhi.setOnClickListener(new ActionBar(c55320xhi, 1000L, this));
        Context context = c23428hxz.AuCTel.getContext();
        Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.DGUQLI);
        if (drawable != null) {
            Intrinsics.copydefault(context);
            drawable.setBounds(0, 0, C55298xhM.OLrzqt(16, context), C55298xhM.OLrzqt(16, context));
        }
        TextViewCompat.setCompoundDrawablesRelative(c23428hxz.AuCTel, null, null, drawable, null);
        gEmmrt().AEQbTJ();
    }

    public final void copydefault(C23428hxz c23428hxz) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindServiceFee$1(this, c23428hxz, null), 3, null);
    }

    public final void OLrzqt(C23428hxz c23428hxz) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindConfirmButton$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$bindConfirmButton$2(this, null), 3, null);
        C52794wYp c52794wYp = c23428hxz.EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    public static final class TaskDescription implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            CopyTradingEditStrategyActivity.this.djBIcL();
        }
    }

    public final void djBIcL() {
        Pair pairOLrzqt;
        if (gEmmrt().iwGUEr()) {
            pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(C23274hvD.Fragment.fZc), Integer.valueOf(C23274hvD.Fragment.sILrnl));
        } else if (gEmmrt().getNewProxyInstance()) {
            pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(C23274hvD.Fragment.ORWKdN), Integer.valueOf(C23274hvD.Fragment.QKDJJA));
        } else {
            iwGUEr();
            return;
        }
        int iIntValue = ((Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((Number) pairOLrzqt.component2()).intValue();
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.zEHIKV), C33070mpX.AYXKKw(iIntValue));
        viewOnClickListenerC54939xaY.EZpvd(iIntValue2, new View.OnClickListener() { // from class: o.gSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                CopyTradingEditStrategyActivity.KWHzl(this.copydefault, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.dPkBzA, new View.OnClickListener() { // from class: o.gSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                CopyTradingEditStrategyActivity.OLrzqt(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault(copyTradingEditStrategyActivity, copyTradingEditStrategyActivity.gEmmrt().OLrzqt(), Boolean.TRUE, "");
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        copyTradingEditStrategyActivity.iwGUEr();
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void iwGUEr() {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingEditStrategyActivity$submitOrder$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super BuySettings> continuation) throws Throwable {
        CopyTradingEditStrategyActivity$getBuySetting$1 copyTradingEditStrategyActivity$getBuySetting$1;
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        CopyTradeDetail copyTradeDetailEZpvd;
        BuySettings buySettings;
        if (continuation instanceof CopyTradingEditStrategyActivity$getBuySetting$1) {
            copyTradingEditStrategyActivity$getBuySetting$1 = (CopyTradingEditStrategyActivity$getBuySetting$1) continuation;
            int i3 = copyTradingEditStrategyActivity$getBuySetting$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyActivity$getBuySetting$1.label = i3 - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyActivity$getBuySetting$1 = new CopyTradingEditStrategyActivity$getBuySetting$1(this, continuation);
            }
        }
        Object obj = copyTradingEditStrategyActivity$getBuySetting$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = copyTradingEditStrategyActivity$getBuySetting$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            int i5 = AYXKKw().DbNXlk() ? 2 : 1;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = gEmmrt().copydefault();
            String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            if (!C33129mqd.OLrzqt((CharSequence) tokenContractAddress)) {
                tokenContractAddress = null;
            }
            if (tokenContractAddress == null) {
                Result<gTC> value = gEmmrt().fJNWhG().getValue();
                if (value != null) {
                    Object objM7386unboximpl = value.m7386unboximpl();
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    gTC gtc = (gTC) objM7386unboximpl;
                    tokenContractAddress = (gtc == null || (copyTradeDetailEZpvd = gtc.EZpvd()) == null || (buySettings = copyTradeDetailEZpvd.getBuySettings()) == null) ? null : buySettings.getTokenAddress();
                    if (tokenContractAddress == null) {
                        tokenContractAddress = "";
                    }
                }
            }
            String second = !AYXKKw().DbNXlk() ? AYXKKw().valueOf().getSecond() : "";
            String second2 = AYXKKw().DbNXlk() ? AYXKKw().AYXKKw().getValue().getSecond() : "";
            String second3 = AYXKKw().DbNXlk() ? AYXKKw().valueOf().getSecond() : "";
            int i6 = !AYXKKw().AhwBna().getValue().booleanValue() ? 1 : 0;
            CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelGEmmrt = gEmmrt();
            copyTradingEditStrategyActivity$getBuySetting$1.L$0 = tokenContractAddress;
            copyTradingEditStrategyActivity$getBuySetting$1.L$1 = second;
            copyTradingEditStrategyActivity$getBuySetting$1.L$2 = second2;
            copyTradingEditStrategyActivity$getBuySetting$1.L$3 = second3;
            copyTradingEditStrategyActivity$getBuySetting$1.I$0 = i5;
            copyTradingEditStrategyActivity$getBuySetting$1.I$1 = i6;
            copyTradingEditStrategyActivity$getBuySetting$1.label = 1;
            Object buySellPreset$default = CopyTradingEditStrategyViewModel.getBuySellPreset$default(copyTradingEditStrategyViewModelGEmmrt, false, copyTradingEditStrategyActivity$getBuySetting$1, 1, null);
            if (buySellPreset$default == objCopydefault) {
                return objCopydefault;
            }
            str = second3;
            i = i6;
            i2 = i5;
            str2 = second2;
            str3 = second;
            str4 = tokenContractAddress;
            obj = buySellPreset$default;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = copyTradingEditStrategyActivity$getBuySetting$1.I$1;
            int i7 = copyTradingEditStrategyActivity$getBuySetting$1.I$0;
            String str5 = (String) copyTradingEditStrategyActivity$getBuySetting$1.L$3;
            String str6 = (String) copyTradingEditStrategyActivity$getBuySetting$1.L$2;
            String str7 = (String) copyTradingEditStrategyActivity$getBuySetting$1.L$1;
            String str8 = (String) copyTradingEditStrategyActivity$getBuySetting$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            i2 = i7;
        }
        CopyTradingPreset copyTradingPreset = (CopyTradingPreset) obj;
        if (copyTradingPreset == null) {
            copyTradingPreset = new CopyTradingPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null);
        }
        return new BuySettings(i2, str4, str3, str2, str, i != 0, copyTradingPreset);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super SellSettings> continuation) throws Throwable {
        CopyTradingEditStrategyActivity$getSellSettings$1 copyTradingEditStrategyActivity$getSellSettings$1;
        List<Rules> listAhwBna;
        Object objKWHzl;
        int i;
        String str;
        C55239xgG c55239xgGAEQbTJ;
        C55239xgG c55239xgGKWHzl;
        C19938gUx c19938gUxCopydefault;
        gUB gubEZpvd;
        if (continuation instanceof CopyTradingEditStrategyActivity$getSellSettings$1) {
            copyTradingEditStrategyActivity$getSellSettings$1 = (CopyTradingEditStrategyActivity$getSellSettings$1) continuation;
            int i2 = copyTradingEditStrategyActivity$getSellSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyActivity$getSellSettings$1.label = i2 - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyActivity$getSellSettings$1 = new CopyTradingEditStrategyActivity$getSellSettings$1(this, continuation);
            }
        }
        Object obj = copyTradingEditStrategyActivity$getSellSettings$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = copyTradingEditStrategyActivity$getSellSettings$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            C19900gTm c19900gTm = (C19900gTm) AhwBna().fetchVPNInfo.getFragment();
            if (c19900gTm == null) {
                return null;
            }
            C19927gUm c19927gUmOLrzqt = c19900gTm.OLrzqt();
            List<CopyTradingAutoSellStrategy> listEZpvd = (c19927gUmOLrzqt == null || (c19938gUxCopydefault = c19927gUmOLrzqt.copydefault()) == null || (gubEZpvd = c19938gUxCopydefault.EZpvd()) == null) ? null : gubEZpvd.EZpvd();
            C19927gUm c19927gUmOLrzqt2 = c19900gTm.OLrzqt();
            boolean z = c19927gUmOLrzqt2 != null && (c55239xgGKWHzl = c19927gUmOLrzqt2.KWHzl()) != null && c55239xgGKWHzl.isChecked() && C33129mqd.KWHzl((Collection) listEZpvd);
            C19927gUm c19927gUmOLrzqt3 = c19900gTm.OLrzqt();
            int i4 = (c19927gUmOLrzqt3 == null || (c55239xgGAEQbTJ = c19927gUmOLrzqt3.AEQbTJ()) == null || !c55239xgGAEQbTJ.isChecked()) ? 0 : 1;
            String str2 = (i4 == 0 || !z) ? i4 != 0 ? "1" : z ? "2" : null : "3";
            if (z) {
                listAhwBna = listEZpvd != null ? gUR.KWHzl(listEZpvd) : null;
                if (listAhwBna == null) {
                }
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelGEmmrt = gEmmrt();
                copyTradingEditStrategyActivity$getSellSettings$1.L$0 = str2;
                copyTradingEditStrategyActivity$getSellSettings$1.L$1 = listAhwBna;
                copyTradingEditStrategyActivity$getSellSettings$1.I$0 = i4;
                copyTradingEditStrategyActivity$getSellSettings$1.label = 1;
                objKWHzl = copyTradingEditStrategyViewModelGEmmrt.KWHzl(true, copyTradingEditStrategyActivity$getSellSettings$1);
                if (objKWHzl != objCopydefault) {
                }
            } else {
                listAhwBna = yDY.AhwBna();
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelGEmmrt2 = gEmmrt();
                copyTradingEditStrategyActivity$getSellSettings$1.L$0 = str2;
                copyTradingEditStrategyActivity$getSellSettings$1.L$1 = listAhwBna;
                copyTradingEditStrategyActivity$getSellSettings$1.I$0 = i4;
                copyTradingEditStrategyActivity$getSellSettings$1.label = 1;
                objKWHzl = copyTradingEditStrategyViewModelGEmmrt2.KWHzl(true, copyTradingEditStrategyActivity$getSellSettings$1);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                i = i4;
                obj = objKWHzl;
                str = str2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = copyTradingEditStrategyActivity$getSellSettings$1.I$0;
            listAhwBna = (List) copyTradingEditStrategyActivity$getSellSettings$1.L$1;
            str = (String) copyTradingEditStrategyActivity$getSellSettings$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        CopyTradingPreset copyTradingPreset = (CopyTradingPreset) obj;
        if (copyTradingPreset == null) {
            copyTradingPreset = new CopyTradingPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null);
        }
        return new SellSettings(i != 0, str, listAhwBna, copyTradingPreset);
    }

    public final void isConnected() {
        AppCompatTextView appCompatTextView = AhwBna().fARcdN;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(0);
        AhwBna().EZpvd.setEnabled(true);
        AhwBna().EZpvd.setTag(Boolean.TRUE);
        AhwBna().EZpvd.setOKDSType(259);
        C52794wYp c52794wYp = AhwBna().EZpvd;
        int i = C23274hvD.Fragment.HJWChPdIKEqB;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = AYXKKw().AEQbTJ();
        String tokenSymbol = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        c52794wYp.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol))));
        AppCompatTextView appCompatTextView2 = AhwBna().fARcdN;
        int i2 = C23274hvD.Fragment.apAOXX;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = C56390yDp.OLrzqt("num", C23322hvz.toLocalizedNumber$default(gEmmrt().DbNXlk(), false, (RoundingMode) null, false, false, 15, (Object) null));
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2 = AYXKKw().AEQbTJ();
        String tokenSymbol2 = dexMultiTokenInfoBeanAEQbTJ2 != null ? dexMultiTokenInfoBeanAEQbTJ2.getTokenSymbol() : null;
        pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, tokenSymbol2 != null ? tokenSymbol2 : "");
        appCompatTextView2.setText(C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        if (AYXKKw().AEQbTJ() != null) {
            String strDbNXlk = gEmmrt().DbNXlk();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = AYXKKw().AEQbTJ();
            if (C23313hvq.OLrzqt(strDbNXlk, dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getAmountNum() : null)) {
                isConnected();
                return;
            }
        }
        AhwBna().EZpvd.setOKDSType(257);
        AhwBna().EZpvd.setTag(Boolean.FALSE);
        AhwBna().EZpvd.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DGGHxk));
        AppCompatTextView appCompatTextView = AhwBna().fARcdN;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        if (!(gEmmrt().KWHzl().getValue() instanceof gTA.ActionBar)) {
            AhwBna().EZpvd.setEnabled(false);
            return;
        }
        if (!AYXKKw().valueOf().getFirst().booleanValue()) {
            AhwBna().EZpvd.setEnabled(false);
            return;
        }
        if (!AYXKKw().AYXKKw().getValue().getFirst().booleanValue()) {
            AhwBna().EZpvd.setEnabled(false);
        } else if (!AhwBna().DbNXlk.AYXKKw()) {
            AhwBna().EZpvd.setEnabled(false);
        } else {
            AhwBna().EZpvd.setEnabled(true);
        }
    }

    public final void EZpvd(int i) {
        if (i == 0) {
            ConstraintLayout constraintLayout = AhwBna().djBIcL;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            C55113xdn c55113xdn = AhwBna().AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(0);
            C55173xeu c55173xeu = AhwBna().ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            return;
        }
        if (i == 1) {
            ConstraintLayout constraintLayout2 = AhwBna().djBIcL;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            C55113xdn c55113xdn2 = AhwBna().AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
            c55113xdn2.setVisibility(8);
            C55173xeu c55173xeu2 = AhwBna().ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(0);
            return;
        }
        ConstraintLayout constraintLayout3 = AhwBna().djBIcL;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(0);
        C55113xdn c55113xdn3 = AhwBna().AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
        c55113xdn3.setVisibility(8);
        C55173xeu c55173xeu3 = AhwBna().ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
        c55173xeu3.setVisibility(8);
    }

    public final void AkhnZx() {
        TabLayout.Tab tabAt;
        TabLayout.TabView tabView;
        TabLayout.Tab tabAt2;
        TabLayout.TabView tabView2;
        CopyTradingBuyInputPanelFragment copyTradingBuyInputPanelFragment = (CopyTradingBuyInputPanelFragment) AhwBna().KWHzl.getFragment();
        if (copyTradingBuyInputPanelFragment != null && C22416heu.gHZMYf() && copyTradingBuyInputPanelFragment.isResumed()) {
            ArrayList arrayList = new ArrayList();
            C23317hvu.EZpvd(true);
            C55249xgQ c55249xgQEZpvd = copyTradingBuyInputPanelFragment.EZpvd();
            if (c55249xgQEZpvd != null && (tabAt2 = c55249xgQEZpvd.getTabAt(0)) != null && (tabView2 = tabAt2.view) != null) {
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(tabView2);
                stateListAnimator.EZpvd(1);
                stateListAnimator.AEQbTJ("");
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.gkZNMa));
                arrayList.add(stateListAnimator);
            }
            C55249xgQ c55249xgQEZpvd2 = copyTradingBuyInputPanelFragment.EZpvd();
            if (c55249xgQEZpvd2 != null && (tabAt = c55249xgQEZpvd2.getTabAt(1)) != null && (tabView = tabAt.view) != null) {
                C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(tabView);
                stateListAnimator2.EZpvd(1);
                stateListAnimator2.AEQbTJ("");
                stateListAnimator2.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.gCZUJG));
                arrayList.add(stateListAnimator2);
            }
            C52812wZg c52812wZg = new C52812wZg(this);
            c52812wZg.EZpvd(arrayList);
            c52812wZg.OLrzqt(3);
            c52812wZg.AEQbTJ(new Function0() { // from class: o.gSC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CopyTradingEditStrategyActivity.KWHzl();
                }
            });
            c52812wZg.KWHzl(new Function0() { // from class: o.gSD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CopyTradingEditStrategyActivity.AEQbTJ();
                }
            });
            c52812wZg.KWHzl(false);
            C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
            if (c52794wYpAkhnZx != null) {
                c52794wYpAkhnZx.setVisibility(8);
            }
            c52812wZg.fARcdN();
        }
    }

    public static final Unit KWHzl() {
        C23317hvu.EZpvd(true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        C23317hvu.EZpvd(true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final C25332iui c25332iui, ServiceFeeInfo serviceFeeInfo) {
        ServiceFeeInfo serviceFeeInfoCopy;
        CharSequence percent$default;
        if (serviceFeeInfo != null) {
            serviceFeeInfoCopy = serviceFeeInfo.copy((131039 & 1) != 0 ? serviceFeeInfo.serviceFeeUsd : null, (131039 & 2) != 0 ? serviceFeeInfo.originalServiceFeeRate : null, (131039 & 4) != 0 ? serviceFeeInfo.discountedServiceFee : null, (131039 & 8) != 0 ? serviceFeeInfo.discountedServiceFeeRate : null, (131039 & 16) != 0 ? serviceFeeInfo.userId : null, (131039 & 32) != 0 ? serviceFeeInfo.isChargeVersion : "1", (131039 & 64) != 0 ? serviceFeeInfo.isDisplayServiceFee : null, (131039 & 128) != 0 ? serviceFeeInfo.feeTokenAddress : null, (131039 & 256) != 0 ? serviceFeeInfo.encryptServiceFeeData : null, (131039 & 512) != 0 ? serviceFeeInfo.faqUrl : null, (131039 & 1024) != 0 ? serviceFeeInfo.refCode : null, (131039 & 2048) != 0 ? serviceFeeInfo.referralCommissionRate : null, (131039 & 4096) != 0 ? serviceFeeInfo.referralCommissionAddress : null, (131039 & 8192) != 0 ? serviceFeeInfo.commissionDirection : false, (131039 & 16384) != 0 ? serviceFeeInfo.country : null, (131039 & 32768) != 0 ? serviceFeeInfo.nativeTokenCostAmt : null, (131039 & 65536) != 0 ? serviceFeeInfo.serviceFeeTokenSymbol : null);
        } else {
            serviceFeeInfoCopy = null;
        }
        if (serviceFeeInfoCopy == null || (percent$default = C25404iwA.AEQbTJ(serviceFeeInfoCopy)) == null) {
            percent$default = C23311hvo.formatPercent$default("0", false, 0, 0, null, null, 31, null);
        }
        c25332iui.setupServiceFee(percent$default, new Function0() { // from class: o.gSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CopyTradingEditStrategyActivity.EZpvd(this.AEQbTJ, c25332iui);
            }
        });
        c25332iui.setIsShowReferralView(gEmmrt().hDKMBd(), new Function0() { // from class: o.gSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CopyTradingEditStrategyActivity.KWHzl(this.OLrzqt, c25332iui);
            }
        });
    }

    public static final Unit EZpvd(final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C25332iui c25332iui) {
        CopyTradingEditStrategyViewModel.trackClickEvent$default(copyTradingEditStrategyActivity.gEmmrt(), TrackButtonName.SERVICE_FEE_EXPLAIN.getButtonName(), null, 2, null);
        Spannable spannableAEQbTJ = C24324ibg.Companion.EZpvd(C23274hvD.Fragment.setLocationManually).OLrzqt("article", C33070mpX.AYXKKw(C23274hvD.Fragment.onScrollChanged), (60 & 4) != 0 ? C55051xce.OLrzqt.valueOf() : null, (60 & 8) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : 0, (60 & 16) != 0 ? 0 : 0, (60 & 32) != 0, new Function0() { // from class: o.gSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CopyTradingEditStrategyActivity.AkhnZx(this.copydefault);
            }
        }).AEQbTJ();
        Context context = c25332iui.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.onViewAttachedToWindow), spannableAEQbTJ), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (Object) null).show();
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
        CopyTradingDefaultConfig copyTradingDefaultConfigKWHzl;
        ServiceFeeInfo serviceFeeInfo;
        String faqUrl;
        Result<gTC> value = copyTradingEditStrategyActivity.gEmmrt().fJNWhG().getValue();
        if (value != null) {
            Object objM7386unboximpl = value.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            gTC gtc = (gTC) objM7386unboximpl;
            if (gtc != null && (copyTradingDefaultConfigKWHzl = gtc.KWHzl()) != null && (serviceFeeInfo = copyTradingDefaultConfigKWHzl.getServiceFeeInfo()) != null && (faqUrl = serviceFeeInfo.getFaqUrl()) != null) {
                C25352ivB.OLrzqt(copyTradingEditStrategyActivity, faqUrl);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, final C25332iui c25332iui) {
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelGEmmrt = copyTradingEditStrategyActivity.gEmmrt();
        Context context = c25332iui.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        copyTradingEditStrategyViewModelGEmmrt.EZpvd(context, new Function1() { // from class: o.gSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingEditStrategyActivity.OLrzqt(this.EZpvd, c25332iui, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C25332iui c25332iui, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        copyTradingEditStrategyActivity.gEmmrt().getFieldNames();
        c25332iui.setIsShowReferralView(copyTradingEditStrategyActivity.gEmmrt().hDKMBd());
        return Unit.INSTANCE;
    }

    @Override // o.gSV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AhwBna().DbNXlk.setCallback$OKDex_dex_impl(null);
        AhwBna().DbNXlk.EZpvd().setCallback$OKDex_dex_impl(null);
        super.onDestroy();
    }

    public static final void OLrzqt(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ChainInfoResult chainInfoResult = (ChainInfoResult) ((Parcelable) BundleCompat.getParcelable(bundle, "SelectNetworkBottomSheet.result", ChainInfoResult.class));
        if (chainInfoResult == null) {
            return;
        }
        copyTradingEditStrategyActivity.gEmmrt().OLrzqt(TrackButtonName.CHANGE_NETWORK.getButtonName(), chainInfoResult.AEQbTJ());
        copyTradingEditStrategyActivity.gEmmrt().OLrzqt(chainInfoResult.copydefault());
        copyTradingEditStrategyActivity.gEmmrt().getFieldNames();
    }

    public static final void copydefault(C23428hxz c23428hxz, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, String str, Bundle bundle) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        RangeFilterUnit rangeFilterUnit = (RangeFilterUnit) ((Parcelable) BundleCompat.getParcelable(bundle, "CopyTradingRangeFilterUnitSelectionBottomSheet.selectedItem", RangeFilterUnit.class));
        if (rangeFilterUnit == null) {
            return;
        }
        if (Intrinsics.EZpvd((Object) rangeFilterUnit.getUnitValue(), (Object) "h")) {
            lowerCase = "hr";
        } else {
            Context context = c23428hxz.DbNXlk.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            lowerCase = rangeFilterUnit.getText(context).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        copyTradingEditStrategyActivity.gEmmrt().OLrzqt(TrackButtonName.MIN_TOKEN_AGE_UNIT.getButtonName(), lowerCase);
        c23428hxz.DbNXlk.KWHzl().setMinUnit(rangeFilterUnit);
    }

    public static final void AEQbTJ(C23428hxz c23428hxz, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, String str, Bundle bundle) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        RangeFilterUnit rangeFilterUnit = (RangeFilterUnit) ((Parcelable) BundleCompat.getParcelable(bundle, "CopyTradingRangeFilterUnitSelectionBottomSheet.selectedItem", RangeFilterUnit.class));
        if (rangeFilterUnit == null) {
            return;
        }
        if (Intrinsics.EZpvd((Object) rangeFilterUnit.getUnitValue(), (Object) "h")) {
            lowerCase = "hr";
        } else {
            Context context = c23428hxz.DbNXlk.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            lowerCase = rangeFilterUnit.getText(context).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        copyTradingEditStrategyActivity.gEmmrt().OLrzqt(TrackButtonName.MAX_TOKEN_AGE_UNIT.getButtonName(), lowerCase);
        c23428hxz.DbNXlk.KWHzl().setMaxUnit(rangeFilterUnit);
    }

    public static final void gEmmrt(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ExpireTimeData expireTimeData = (ExpireTimeData) ((Parcelable) BundleCompat.getParcelable(bundle, "CopyTradingExpireContainerDialog.expireTimeData", ExpireTimeData.class));
        if (expireTimeData == null) {
            return;
        }
        copyTradingEditStrategyActivity.gEmmrt().EZpvd(expireTimeData);
    }

    @Override // o.gSV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.gSV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.gSV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.gSV, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
