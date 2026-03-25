package o;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailInvestInfo;
import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$onCreateContent$7;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailParams;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.viewmodel.DeFiTokenModelAssetDetailViewModel;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import o.iZT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24214iZc extends AbstractC24223iZl {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public java.lang.Integer AEQbTJ;
    public C55173xeu AYXKKw;
    public androidx.fragment.app.FragmentManager AhwBna;
    public android.widget.FrameLayout DbNXlk;
    public ConstraintLayout EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C24219iZh OLrzqt;
    public final java.util.Map<java.lang.String, java.lang.Boolean> djBIcL;
    public C55113xdn fetchVPNInfo;
    public iZT gEmmrt;
    public iZT valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.iZc$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DeFiTokenModelAssetDetail.StyleType.values().length];
            try {
                iArr[DeFiTokenModelAssetDetail.StyleType.POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24214iZc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:androidx.fragment.app.FragmentManager:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.fragment.app.FragmentManager) : (r2v0 androidx.fragment.app.FragmentManager))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(androidx.fragment.app.FragmentManager, java.lang.Integer):void (m)] (LINE:53) call: o.iZc.<init>(androidx.fragment.app.FragmentManager, java.lang.Integer):void type: THIS */
    public /* synthetic */ C24214iZc(androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fragmentManager, (i & 2) != 0 ? null : num);
    }

    public C24214iZc(androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        this.AhwBna = fragmentManager;
        this.AEQbTJ = num;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DeFiTokenModelAssetDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailBottomSheet$special$$inlined$viewModels$default$5
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
        this.djBIcL = new LinkedHashMap();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24214iZc.DbNXlk(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.iZl.EZpvd()V */
    public final DeFiTokenModelAssetDetailViewModel EZpvd() {
        return (DeFiTokenModelAssetDetailViewModel) this.values.getValue();
    }

    public static final iYU DbNXlk(C24214iZc c24214iZc) {
        return new iYU(c24214iZc, c24214iZc.AhwBna, c24214iZc.AEQbTJ);
    }

    public final iYU KWHzl() {
        return (iYU) this.KWHzl.getValue();
    }

    public final DeFiDashboardAssetDetailParams AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        DeFiDashboardAssetDetailParams deFiDashboardAssetDetailParams = arguments != null ? (DeFiDashboardAssetDetailParams) arguments.getParcelable("key_defi_novice_asset_detail_params") : null;
        DeFiDashboardAssetDetailParams deFiDashboardAssetDetailParams2 = deFiDashboardAssetDetailParams instanceof DeFiDashboardAssetDetailParams ? deFiDashboardAssetDetailParams : null;
        if (deFiDashboardAssetDetailParams2 != null) {
            return deFiDashboardAssetDetailParams2;
        }
        throw new java.lang.IllegalStateException("Must provide DeFiNoviceAssetDetailParams".toString());
    }

    public final void KWHzl(DeFiTokenModelAssetDetail deFiTokenModelAssetDetail) {
        boolean z = deFiTokenModelAssetDetail.AEQbTJ().size() <= 1;
        java.util.Iterator<T> it = deFiTokenModelAssetDetail.AEQbTJ().iterator();
        while (it.hasNext()) {
            this.djBIcL.put(KWHzl((C24236iZy) it.next()), java.lang.Boolean.valueOf(z));
        }
    }

    public final java.lang.String KWHzl(C24236iZy c24236iZy) {
        java.lang.String string;
        java.lang.Long lGEmmrt = c24236iZy.gEmmrt();
        return (lGEmmrt == null || (string = lGEmmrt.toString()) == null) ? CollectionsKt___CollectionsKt.joinToString$default(yDY.valueOf(c24236iZy.fIwbmz(), c24236iZy.DbNXlk(), c24236iZy.valueOf(), c24236iZy.AEQbTJ()), "_", null, null, 0, null, null, 62, null) : string;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        DeFiDashboardAssetDetailParams deFiDashboardAssetDetailParamsAEQbTJ = AEQbTJ();
        if (deFiDashboardAssetDetailParamsAEQbTJ instanceof DeFiDashboardAssetDetailParams.DeFiTokenModelAssetDetailParams) {
            DeFiTokenModelAssetDetailViewModel deFiTokenModelAssetDetailViewModelEZpvd = EZpvd();
            DeFiDashboardAssetDetailParams.DeFiTokenModelAssetDetailParams deFiTokenModelAssetDetailParams = (DeFiDashboardAssetDetailParams.DeFiTokenModelAssetDetailParams) deFiDashboardAssetDetailParamsAEQbTJ;
            long jKWHzl = deFiTokenModelAssetDetailParams.KWHzl();
            long jEZpvd = deFiTokenModelAssetDetailParams.EZpvd();
            java.lang.String strCopydefault = deFiTokenModelAssetDetailParams.copydefault();
            java.lang.String strOLrzqt = deFiTokenModelAssetDetailParams.OLrzqt();
            java.util.List<DashboardInvestmentInfo> listAEQbTJ = deFiTokenModelAssetDetailParams.AEQbTJ();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (DashboardInvestmentInfo dashboardInvestmentInfo : listAEQbTJ) {
                arrayList.add(new DashboardTokenDetailInvestInfo(dashboardInvestmentInfo.EZpvd(), dashboardInvestmentInfo.copydefault(), dashboardInvestmentInfo.AEQbTJ()));
            }
            deFiTokenModelAssetDetailViewModelEZpvd.OLrzqt(C56402yEa.EZpvd(new DashboardTokenDetailReq(jKWHzl, jEZpvd, strCopydefault, strOLrzqt, arrayList)));
            return;
        }
        if (!(deFiDashboardAssetDetailParamsAEQbTJ instanceof DeFiDashboardAssetDetailParams.DeFiProtocolModelAssetDetailParams)) {
            throw new NoWhenBranchMatchedException();
        }
        DeFiDashboardAssetDetailParams.DeFiProtocolModelAssetDetailParams deFiProtocolModelAssetDetailParams = (DeFiDashboardAssetDetailParams.DeFiProtocolModelAssetDetailParams) deFiDashboardAssetDetailParamsAEQbTJ;
        EZpvd().copydefault(deFiProtocolModelAssetDetailParams.KWHzl(), deFiProtocolModelAssetDetailParams.copydefault(), deFiProtocolModelAssetDetailParams.AEQbTJ(), deFiProtocolModelAssetDetailParams.EZpvd());
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = constraintLayout;
        this.OLrzqt = new C24219iZh(new Function1() { // from class: o.iZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24214iZc.AEQbTJ(this.EZpvd, (C24234iZw) obj);
            }
        }, new Function1() { // from class: o.iZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24214iZc.KWHzl(this.AEQbTJ, (C24237iZz) obj);
            }
        }, KWHzl(), new Function0() { // from class: o.iZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24214iZc.values(this.copydefault);
            }
        });
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setPadding(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(0.0f, null, 1, null));
        recyclerView.setAdapter(this.OLrzqt);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(requireContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, C55298xhM.dp2px$default(136.0f, null, 1, null));
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        frameLayout.setLayoutParams(layoutParams2);
        this.DbNXlk = frameLayout;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55113xdn c55113xdn = new C55113xdn(contextRequireContext, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C55298xhM.dp2px$default(60.0f, null, 1, null), C55298xhM.dp2px$default(60.0f, null, 1, null));
        layoutParams3.gravity = 17;
        c55113xdn.setLayoutParams(layoutParams3);
        c55113xdn.setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        c55113xdn.setRepeatCount(-1);
        c55113xdn.setRepeatMode(1);
        c55113xdn.setVisibility(8);
        this.fetchVPNInfo = c55113xdn;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        C55173xeu c55173xeu = new C55173xeu(contextRequireContext2, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        c55173xeu.setLayoutParams(layoutParams4);
        c55173xeu.setVisibility(8);
        this.AYXKKw = c55173xeu;
        android.widget.FrameLayout frameLayout2 = this.DbNXlk;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.fetchVPNInfo);
        }
        android.widget.FrameLayout frameLayout3 = this.DbNXlk;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.AYXKKw);
        }
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(this.DbNXlk);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DeFiDashboardAssetDetailBottomSheet$onCreateContent$7(this, recyclerView, null), 3, null);
    }

    public static final Unit AEQbTJ(C24214iZc c24214iZc, C24234iZw c24234iZw) {
        Intrinsics.checkNotNullParameter(c24234iZw, "");
        c24214iZc.djBIcL.put(c24234iZw.EZpvd(), java.lang.Boolean.valueOf(c24234iZw.KWHzl()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C24214iZc c24214iZc, C24237iZz c24237iZz) {
        Intrinsics.checkNotNullParameter(c24237iZz, "");
        c24214iZc.djBIcL.put(c24237iZz.OLrzqt(), java.lang.Boolean.valueOf(c24237iZz.EZpvd()));
        return Unit.INSTANCE;
    }

    public static final Unit values(C24214iZc c24214iZc) {
        c24214iZc.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(iZT izt, RecyclerView recyclerView, android.widget.FrameLayout frameLayout, C55113xdn c55113xdn, C55173xeu c55173xeu) {
        if (!(izt instanceof iZT.Application)) {
            if (!(izt instanceof iZT.TaskDescription)) {
                if (!(izt instanceof iZT.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                recyclerView.setVisibility(8);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                if (c55113xdn != null) {
                    c55113xdn.setVisibility(8);
                }
                if (c55173xeu != null) {
                    c55173xeu.setVisibility(0);
                }
                if (c55173xeu != null) {
                    c55173xeu.setEmptyTypeImage(9);
                }
                if (c55173xeu != null) {
                    c55173xeu.setSubTitle((java.lang.CharSequence) ((iZT.StateListAnimator) izt).OLrzqt());
                    return;
                }
                return;
            }
            recyclerView.setVisibility(0);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (c55113xdn != null) {
                c55113xdn.setVisibility(8);
            }
            if (c55173xeu != null) {
                c55173xeu.setVisibility(8);
            }
            iZT.TaskDescription taskDescription = (iZT.TaskDescription) izt;
            KWHzl(taskDescription.KWHzl());
            java.util.List<InterfaceC27436jvE> listEZpvd = EZpvd(taskDescription.KWHzl());
            if (!listEZpvd.isEmpty()) {
                C24219iZh c24219iZh = this.OLrzqt;
                if (c24219iZh != null) {
                    AbstractC27470jvm.setData$default(c24219iZh, listEZpvd, null, 2, null);
                    return;
                }
                return;
            }
            recyclerView.setVisibility(8);
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            if (c55113xdn != null) {
                c55113xdn.setVisibility(8);
            }
            if (c55173xeu != null) {
                c55173xeu.setVisibility(0);
            }
            if (c55173xeu != null) {
                c55173xeu.setEmptyTypeImage(4);
                return;
            }
            return;
        }
        recyclerView.setVisibility(8);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        if (c55113xdn != null) {
            c55113xdn.KWHzl(300L);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DeFiDashboardAssetDetailBottomSheet$onFooterCreated$1(this, wyf, null), 3, null);
    }

    public final java.util.List<InterfaceC27436jvE> EZpvd(DeFiTokenModelAssetDetail deFiTokenModelAssetDetail) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean zCopydefault = C24220iZi.copydefault(deFiTokenModelAssetDetail.AEQbTJ());
        for (C24236iZy c24236iZy : deFiTokenModelAssetDetail.AEQbTJ()) {
            java.lang.String strKWHzl = KWHzl(c24236iZy);
            boolean zEZpvd = Intrinsics.EZpvd(this.djBIcL.get(strKWHzl), java.lang.Boolean.TRUE);
            if (Application.KWHzl[c24236iZy.values().ordinal()] == 1) {
                arrayList.add(new C24237iZz(strKWHzl, c24236iZy, zCopydefault, zEZpvd, false, new Function1() { // from class: o.iZf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C24214iZc.AEQbTJ(this.KWHzl, (C24237iZz) obj);
                    }
                }, 16, null));
            } else {
                arrayList.add(new C24234iZw(strKWHzl, c24236iZy, zCopydefault, zEZpvd, false, new Function1() { // from class: o.iZg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C24214iZc.OLrzqt(this.AEQbTJ, (C24234iZw) obj);
                    }
                }, 16, null));
            }
        }
        InterfaceC27436jvE interfaceC27436jvE = (InterfaceC27436jvE) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        if (interfaceC27436jvE != null) {
            if (interfaceC27436jvE instanceof C24237iZz) {
                ((C24237iZz) interfaceC27436jvE).OLrzqt(true);
            } else if (interfaceC27436jvE instanceof C24234iZw) {
                ((C24234iZw) interfaceC27436jvE).OLrzqt(true);
            }
        }
        return arrayList;
    }

    public static final Unit AEQbTJ(C24214iZc c24214iZc, C24237iZz c24237iZz) {
        Intrinsics.checkNotNullParameter(c24237iZz, "");
        c24214iZc.djBIcL.put(c24237iZz.OLrzqt(), java.lang.Boolean.valueOf(c24237iZz.EZpvd()));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24214iZc c24214iZc, C24234iZw c24234iZw) {
        Intrinsics.checkNotNullParameter(c24234iZw, "");
        c24214iZc.djBIcL.put(c24234iZw.EZpvd(), java.lang.Boolean.valueOf(c24234iZw.KWHzl()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.iZc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iZc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C24214iZc newInstance$default(ActionBar actionBar, DeFiDashboardAssetDetailParams deFiDashboardAssetDetailParams, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                fragmentManager = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return actionBar.OLrzqt(deFiDashboardAssetDetailParams, fragmentManager, num);
        }

        public final C24214iZc OLrzqt(@NotNull DeFiDashboardAssetDetailParams deFiDashboardAssetDetailParams, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(deFiDashboardAssetDetailParams, "");
            C24214iZc c24214iZc = new C24214iZc(fragmentManager, num);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key_defi_novice_asset_detail_params", deFiDashboardAssetDetailParams);
            c24214iZc.setArguments(bundle);
            return c24214iZc;
        }
    }
}
