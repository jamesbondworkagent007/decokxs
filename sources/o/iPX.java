package o;

import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.material3.TooltipKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.InvestBaseFilter;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.InvestOrderBean;
import com.okinc.business.invest_biz.data.bean.InvestOrderTypeFilter;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Date;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.DeserializationStrategy;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iPX extends AbstractActivityC33013moT {
    public C27329jtD AEQbTJ;
    public iGU EZpvd;
    public java.lang.Long KWHzl;
    public final C43316rmw OLrzqt = new C43316rmw();
    public C27329jtD copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm valueOf;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public static final class Fragment implements Function1<java.lang.String, InvestTransactionModel> {
        public static final Fragment KWHzl = new Fragment();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InvestTransactionModel invoke(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestTransactionModel.Companion.serializer(), str);
        }
    }

    public static final class Dialog implements Function0<java.lang.Object> {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(java.lang.String str, Function1 function1) {
            this.EZpvd = str;
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.iPX$Dialog$1] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final java.lang.String str = this.EZpvd;
            final Function1 function1 = this.AEQbTJ;
            return new ViewModelProvider.Factory() { // from class: o.iPX.Dialog.1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(java.lang.Class<T> cls) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    return new C23611iCu(str, function1);
                }
            };
        }
    }

    public iPX() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(C27099jom.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.InvestOrderListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.InvestOrderListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.InvestOrderListActivity$special$$inlined$viewModels$default$3
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
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(C23611iCu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.InvestOrderListActivity$special$$inlined$viewModels$default$5
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
        }, new Dialog("invest-tx-status-toast", Fragment.KWHzl), new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.InvestOrderListActivity$special$$inlined$viewModels$default$6
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

    public final C27099jom KWHzl() {
        return (C27099jom) this.valueOf.getValue();
    }

    private final C23611iCu<InvestTransactionModel> djBIcL() {
        return (C23611iCu) this.djBIcL.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (iGU) DataBindingUtil.setContentView(this, C25493ixk.Activity.AhwBna);
        valueOf();
        AYXKKw();
        showLoading();
        refresh$default(this, false, 1, null);
        EZpvd();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        refresh$default(this, false, 1, null);
        EZpvd();
    }

    private final void valueOf() {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        iGU igu = this.EZpvd;
        iGU igu2 = null;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        C33537myN c33537myN = igu.copydefault;
        Intrinsics.checkNotNullExpressionValue(c33537myN, "");
        C27569jxf.setTitleStyle$OKDeFi_invest_biz$default(c27569jxf, c33537myN, 0, 0, 3, null);
        iGU igu3 = this.EZpvd;
        if (igu3 == null) {
            Intrinsics.gEmmrt("");
            igu3 = null;
        }
        igu3.copydefault.setAppBarColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        iGU igu4 = this.EZpvd;
        if (igu4 == null) {
            Intrinsics.gEmmrt("");
            igu4 = null;
        }
        igu4.copydefault.setStatusBarColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        iGU igu5 = this.EZpvd;
        if (igu5 == null) {
            Intrinsics.gEmmrt("");
            igu5 = null;
        }
        igu5.gEmmrt.setNoMoreDataEffective(true);
        iGU igu6 = this.EZpvd;
        if (igu6 == null) {
            Intrinsics.gEmmrt("");
            igu6 = null;
        }
        igu6.gEmmrt.AYXKKw(true);
        iGU igu7 = this.EZpvd;
        if (igu7 == null) {
            Intrinsics.gEmmrt("");
            igu7 = null;
        }
        igu7.AEQbTJ.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        iGU igu8 = this.EZpvd;
        if (igu8 == null) {
            Intrinsics.gEmmrt("");
            igu8 = null;
        }
        InterfaceC57927yre interfaceC57927yreIsConnected = igu8.gEmmrt.isConnected();
        C27215jqw c27215jqw = interfaceC57927yreIsConnected instanceof C27215jqw ? (C27215jqw) interfaceC57927yreIsConnected : null;
        if (c27215jqw != null) {
            java.lang.String string = getString(C25493ixk.FragmentManager.DaRZkR);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c27215jqw.setNoMoreText(string);
        }
        iGU igu9 = this.EZpvd;
        if (igu9 == null) {
            Intrinsics.gEmmrt("");
            igu9 = null;
        }
        igu9.gEmmrt.OLrzqt((InterfaceC57901yrE) new Activity());
        iGU igu10 = this.EZpvd;
        if (igu10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            igu2 = igu10;
        }
        RecyclerView recyclerView = igu2.EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.OLrzqt);
        this.OLrzqt.register(InvestOrderBean.class, new StateListAnimator(recyclerView, this, C25493ixk.Activity.OxVOHk));
        C43316rmw c43316rmw = this.OLrzqt;
        java.lang.String string2 = getString(C25493ixk.FragmentManager.DcMfJKRKUgwx);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c43316rmw.register(C24073iTx.class, new C24074iTy(string2, 0, 0.0f, 6, null));
        AhwBna();
    }

    public static final class Activity implements InterfaceC57901yrE {
        public Activity() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            iPX.this.AEQbTJ(false);
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            iPX.this.AEQbTJ(true);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends C43318rmy<InvestOrderBean, iIZ> {
        public final /* synthetic */ RecyclerView AEQbTJ;
        public final int KWHzl;
        public final /* synthetic */ iPX OLrzqt;

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[InvestAction.values().length];
                try {
                    iArr[InvestAction.Subscription.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[InvestAction.Redeem.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[InvestAction.Claim.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[InvestAction.StartFarming.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[InvestAction.EndFarming.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[InvestAction.Mint.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[InvestAction.Repay.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[InvestAction.Borrow.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                copydefault = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(RecyclerView recyclerView, iPX ipx, int i) {
            super(i, 0);
            this.AEQbTJ = recyclerView;
            this.OLrzqt = ipx;
            android.content.Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.KWHzl = C55298xhM.copydefault(16.0f, context);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(C43312rms<iIZ> c43312rms, InvestOrderBean investOrderBean) {
            java.lang.String string;
            java.lang.String tokenLogo;
            java.lang.String tokenLogo2;
            java.lang.String tokenLogo3;
            java.lang.String platformName;
            java.lang.String string2;
            java.lang.String string3;
            android.graphics.drawable.Drawable drawableWrap;
            android.graphics.drawable.Drawable drawableWrap2;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(investOrderBean, "");
            super.onBindViewHolder((C43312rms) c43312rms, investOrderBean);
            ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
            iPX ipx = this.OLrzqt;
            RecyclerView recyclerView = this.AEQbTJ;
            iIZ iiz = (iIZ) viewDataBindingOLrzqt;
            int layoutPosition = c43312rms.getLayoutPosition() - 1;
            java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(investOrderBean.getCreateTime()), null, 1, null);
            if (layoutPosition >= 0 && layoutPosition < ipx.OLrzqt.getItemCount()) {
                java.lang.Object objAEQbTJ = ipx.OLrzqt.AEQbTJ(layoutPosition);
                Intrinsics.copydefault(objAEQbTJ, "");
                if (Intrinsics.EZpvd((java.lang.Object) pTA.formatSimpleDate$default(new Date(((InvestOrderBean) objAEQbTJ).getCreateTime()), null, 1, null), (java.lang.Object) simpleDate$default)) {
                    android.view.View view = iiz.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    view.setVisibility(8);
                    android.widget.TextView textView = iiz.valueOf;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(8);
                }
            } else {
                iiz.EZpvd.setVisibility(c43312rms.getLayoutPosition() == 0 ? 8 : 0);
                iiz.valueOf.setText(simpleDate$default);
                android.widget.TextView textView2 = iiz.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = iiz.copydefault;
            switch (Activity.copydefault[InvestAction.Companion.copydefault(C33129mqd.AhwBna(java.lang.Integer.valueOf(investOrderBean.getOrderType()))).ordinal()]) {
                case 1:
                    string = ipx.getString(C25493ixk.FragmentManager.DzkRMH);
                    break;
                case 2:
                    string = ipx.getString(C25493ixk.FragmentManager.DDjfYY);
                    break;
                case 3:
                    string = ipx.getString(C25493ixk.FragmentManager.DxnCrt);
                    break;
                case 4:
                    string = ipx.getString(C25493ixk.FragmentManager.DcMfJKfwDlxl);
                    break;
                case 5:
                    string = ipx.getString(C25493ixk.FragmentManager.DcMfJKsgNvtZ);
                    break;
                case 6:
                    string = ipx.getString(C25493ixk.FragmentManager.DGUQLIhJrIAr);
                    break;
                case 7:
                    string = ipx.getString(C25493ixk.FragmentManager.DRGLNw);
                    break;
                case 8:
                    string = ipx.getString(C25493ixk.FragmentManager.OuxcSI);
                    break;
                default:
                    string = "";
                    break;
            }
            textView3.setText(string);
            C27538jxA c27538jxA = C27538jxA.EZpvd;
            java.util.List<InvestLogoBaseVo> middleLogoList = investOrderBean.getMiddleLogoList();
            java.util.List<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator<T> it = middleLogoList.iterator();
            while (it.hasNext()) {
                java.lang.String tokenLogo4 = ((InvestLogoBaseVo) it.next()).getTokenLogo();
                if (tokenLogo4 != null) {
                    arrayList.add(tokenLogo4);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = C56402yEa.EZpvd("placeHolder");
            }
            InvestLogoBaseVo investLogoBaseVo = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(investOrderBean.getTopLeftLogoList());
            if (investLogoBaseVo == null || (tokenLogo = investLogoBaseVo.getTokenLogo()) == null) {
                tokenLogo = "";
            }
            InvestLogoBaseVo investLogoBaseVo2 = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(investOrderBean.getTopRightLogoList());
            if (investLogoBaseVo2 == null || (tokenLogo2 = investLogoBaseVo2.getTokenLogo()) == null) {
                tokenLogo2 = "";
            }
            InvestLogoBaseVo investLogoBaseVo3 = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(investOrderBean.getBottomRightLogoList());
            if (investLogoBaseVo3 == null || (tokenLogo3 = investLogoBaseVo3.getTokenLogo()) == null) {
                tokenLogo3 = "";
            }
            InvestmentLogoData investmentLogoDataEZpvd = c27538jxA.EZpvd(arrayList, tokenLogo, tokenLogo2, tokenLogo3);
            C27538jxA c27538jxA2 = C27538jxA.EZpvd;
            android.content.Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c27538jxA2.KWHzl(context, iiz.AEQbTJ, investmentLogoDataEZpvd, 32.0f, 16.0f, (96 & 32) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (96 & 64) != 0 ? 1.0f : 0.0f);
            iiz.gEmmrt.setText(investOrderBean.getInvestmentName());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) investOrderBean.getPoolId())) {
                platformName = "ID: " + investOrderBean.getPoolId();
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) investOrderBean.getInvestmentClassify())) {
                android.content.Context context2 = recyclerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                platformName = C33069mpW.KWHzl(context2, C25493ixk.FragmentManager.DsrFlB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("protocolName", investOrderBean.getPlatformName()), C56390yDp.OLrzqt("protocolType", investOrderBean.getInvestmentClassify())));
            } else {
                platformName = investOrderBean.getPlatformName();
            }
            iiz.isConnected.setText(platformName);
            iiz.AhwBna.setText(investOrderBean.getNetworkName());
            switch (investOrderBean.getOrderVoStatus()) {
                case 2:
                case 6:
                case 8:
                    android.widget.TextView textView4 = iiz.djBIcL;
                    if (investOrderBean.getCostTime().length() == 0) {
                        textView4.setVisibility(8);
                    } else {
                        textView4.setVisibility(0);
                        textView4.setText(ipx.getString(C25493ixk.FragmentManager.DGGHxk) + ipx.OLrzqt(investOrderBean) + ipx.getString(C25493ixk.FragmentManager.ExKek));
                    }
                    android.widget.TextView textView5 = iiz.AYXKKw;
                    int orderVoStatus = investOrderBean.getOrderVoStatus();
                    if (orderVoStatus == 2 || orderVoStatus == 8) {
                        string2 = ipx.getString(C25493ixk.FragmentManager.glVQsU);
                    } else {
                        string2 = ipx.getString(C25493ixk.FragmentManager.DwQSDd);
                    }
                    textView5.setText(string2);
                    textView5.setTextColor(ContextCompat.getColor(textView5.getContext(), C52761wXj.Activity.HJWChPQdUnVm));
                    C55113xdn c55113xdn = iiz.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(0);
                    iiz.KWHzl.setAnimation(C27543jxF.KWHzl(ipx) ? C25493ixk.Fragment.copydefault : C25493ixk.Fragment.AEQbTJ);
                    iiz.KWHzl.KWHzl(0L);
                    break;
                case 3:
                default:
                    android.widget.TextView textView6 = iiz.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView6, "");
                    textView6.setVisibility(8);
                    android.widget.TextView textView7 = iiz.AYXKKw;
                    textView7.setText("");
                    textView7.setCompoundDrawablesRelative(null, null, null, null);
                    C55113xdn c55113xdn2 = iiz.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                    c55113xdn2.setVisibility(8);
                    iiz.KWHzl.copydefault();
                    break;
                case 4:
                case 7:
                    android.widget.TextView textView8 = iiz.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView8, "");
                    textView8.setVisibility(8);
                    android.widget.TextView textView9 = iiz.AYXKKw;
                    if (investOrderBean.getOrderVoStatus() == 4) {
                        string3 = ipx.getString(C25493ixk.FragmentManager.DlmWDR);
                    } else {
                        string3 = ipx.getString(C25493ixk.FragmentManager.DcMfJKsuEgdN);
                    }
                    textView9.setText(string3);
                    textView9.setTextColor(ContextCompat.getColor(textView9.getContext(), C52761wXj.Activity.HJWChPUUMfbK));
                    android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView9.getContext(), C52761wXj.TaskDescription.TarCU);
                    if (drawable != null) {
                        drawableWrap = DrawableCompat.wrap(drawable);
                        Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
                        DrawableCompat.setTint(drawableWrap, C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
                    } else {
                        drawableWrap = null;
                    }
                    C55113xdn c55113xdn3 = iiz.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                    c55113xdn3.setVisibility(8);
                    iiz.KWHzl.copydefault();
                    if (drawableWrap != null) {
                        int i = this.KWHzl;
                        drawableWrap.setBounds(0, 0, i, i);
                    }
                    textView9.setCompoundDrawablesRelative(drawableWrap, null, null, null);
                    Intrinsics.copydefault(textView9);
                    break;
                case 5:
                    android.widget.TextView textView10 = iiz.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView10, "");
                    textView10.setVisibility(8);
                    android.widget.TextView textView11 = iiz.AYXKKw;
                    textView11.setText(ipx.getString(C25493ixk.FragmentManager.abAflu));
                    textView11.setTextColor(ContextCompat.getColor(textView11.getContext(), C52761wXj.Activity.onReceive));
                    android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(textView11.getContext(), C52761wXj.TaskDescription.gqESXP);
                    if (drawable2 != null) {
                        drawableWrap2 = DrawableCompat.wrap(drawable2);
                        Intrinsics.checkNotNullExpressionValue(drawableWrap2, "");
                        DrawableCompat.setTint(drawableWrap2, C33070mpX.copydefault(C52761wXj.Activity.onReceive));
                    } else {
                        drawableWrap2 = null;
                    }
                    C55113xdn c55113xdn4 = iiz.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                    c55113xdn4.setVisibility(8);
                    iiz.KWHzl.copydefault();
                    if (drawableWrap2 != null) {
                        int i2 = this.KWHzl;
                        drawableWrap2.setBounds(0, 0, i2, i2);
                    }
                    textView11.setCompoundDrawablesRelative(drawableWrap2, null, null, null);
                    Intrinsics.copydefault(textView11);
                    break;
            }
            ConstraintLayout constraintLayout = iiz.OLrzqt;
            constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 500L, ipx, investOrderBean));
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ iPX EZpvd;
            public final /* synthetic */ InvestOrderBean OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, iPX ipx, InvestOrderBean investOrderBean) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.EZpvd = ipx;
                this.OLrzqt = investOrderBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C27508jwX.AEQbTJ.copydefault(this.EZpvd, this.OLrzqt.getTxHash(), this.OLrzqt.getUopHash(), "defi");
                    this.EZpvd.OLrzqt(this.OLrzqt.getOrderId());
                }
            }
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ iPX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, iPX ipx) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = ipx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.AEQbTJ();
            }
        }
    }

    public final int OLrzqt(InvestOrderBean investOrderBean) {
        int iAhwBna = C33129mqd.AhwBna(investOrderBean.getCostTime()) / 60;
        if (iAhwBna > 0) {
            return iAhwBna;
        }
        return 1;
    }

    public final void AhwBna() {
        InvestBaseFilter investBaseFilterAEQbTJ = KWHzl().AEQbTJ();
        if (investBaseFilterAEQbTJ != null) {
            iGU igu = this.EZpvd;
            iGU igu2 = null;
            if (igu == null) {
                Intrinsics.gEmmrt("");
                igu = null;
            }
            igu.AYXKKw.setText(investBaseFilterAEQbTJ.getName());
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            iGU igu3 = this.EZpvd;
            if (igu3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                igu2 = igu3;
            }
            android.widget.ImageView imageView = igu2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            c27569jxf.AEQbTJ(imageView, investBaseFilterAEQbTJ.getIcon(), c27569jxf.AEQbTJ());
            this.KWHzl = investBaseFilterAEQbTJ.getChainId();
        }
    }

    public final void OLrzqt() {
        InvestOrderTypeFilter investOrderTypeFilterOLrzqt = KWHzl().OLrzqt();
        if (investOrderTypeFilterOLrzqt != null) {
            iGU igu = this.EZpvd;
            if (igu == null) {
                Intrinsics.gEmmrt("");
                igu = null;
            }
            igu.djBIcL.setText(investOrderTypeFilterOLrzqt.getName());
        }
    }

    public static /* synthetic */ void refresh$default(iPX ipx, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        ipx.AEQbTJ(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(final boolean z) {
        if (!z) {
            iGU igu = this.EZpvd;
            if (igu == null) {
                Intrinsics.gEmmrt("");
                igu = null;
            }
            C33546myW c33546myW = igu.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, false);
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.iPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPX.copydefault(this.copydefault, z, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iPX.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPX.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iPX.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jom.loadOrderList$default(o.jom, java.lang.String, java.lang.Long, java.util.List, boolean, int, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public static final Unit copydefault(final iPX ipx, boolean z, InterfaceC9738bbJ interfaceC9738bbJ) {
        C27099jom.loadOrderList$default(ipx.KWHzl(), interfaceC9738bbJ.DbNXlk(), ipx.KWHzl, C23580iBq.AEQbTJ.AEQbTJ(), !z, 0, new Function1() { // from class: o.iQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPX.AEQbTJ(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 16, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(iPX ipx, boolean z) {
        ipx.copydefault(z);
        ipx.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(iPX ipx, java.lang.Throwable th) {
        ipx.KWHzl(true, true);
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        iGU igu = this.EZpvd;
        iGU igu2 = null;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(igu.AYXKKw);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgCopydefault, "");
        C58156yvv.copydefault(abstractC58247yxgCopydefault, this).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iPX.KWHzl(this.EZpvd, obj);
            }
        });
        iGU igu3 = this.EZpvd;
        if (igu3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            igu2 = igu3;
        }
        android.widget.TextView textView = igu2.djBIcL;
        textView.setOnClickListener(new ActionBar(textView, 500L, this));
        KWHzl().copydefault().observe(this, new Application(new Function1() { // from class: o.iQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPX.EZpvd(this.EZpvd, (Triple) obj);
            }
        }));
        djBIcL().KWHzl().observe(this, new Application(new Function1() { // from class: o.iQm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPX.copydefault(this.AEQbTJ, (InvestTransactionModel) obj);
            }
        }));
        C27589jxz.collectOnLifecycle$default(this, KWHzl().EZpvd(), null, new TaskDescription(), 2, null);
    }

    public static final void KWHzl(iPX ipx, java.lang.Object obj) {
        ipx.copydefault();
    }

    public static final Unit EZpvd(iPX ipx, Triple triple) {
        if (((java.lang.Boolean) triple.getSecond()).booleanValue()) {
            rVN.reportFullyDrawn$default((android.app.Activity) ipx, true, (java.lang.String) null, 2, (java.lang.Object) null);
            C43316rmw c43316rmw = ipx.OLrzqt;
            java.util.Collection collectionCopydefault = (java.util.Collection) triple.getFirst();
            if (collectionCopydefault.isEmpty()) {
                collectionCopydefault = yDY.copydefault(C24073iTx.KWHzl);
            }
            c43316rmw.setItems((java.util.List) collectionCopydefault);
            ipx.OLrzqt.notifyDataSetChanged();
            ipx.KWHzl(false, false);
        } else {
            rVN.reportFullyDrawn$default((android.app.Activity) ipx, false, (java.lang.String) null, 2, (java.lang.Object) null);
            if (((java.lang.Boolean) triple.getThird()).booleanValue() && ipx.OLrzqt.getItems().isEmpty()) {
                ipx.KWHzl(true, true);
            } else {
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(ipx, C52761wXj.TaskDescription.OijiEz);
                if (drawable != null) {
                    drawable.setBounds(0, 0, C55298xhM.copydefault(96.0f, (android.content.Context) ipx), C55298xhM.copydefault(96.0f, (android.content.Context) ipx));
                    DrawableCompat.setTint(drawable, ContextCompat.getColor(ipx, C52761wXj.Activity.UCQKYV));
                }
                C55328xhq.show$default(C55328xhq.OLrzqt, ipx.getString(C25493ixk.FragmentManager.DcMfJKgMxgjU), drawable, 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(iPX ipx, InvestTransactionModel investTransactionModel) {
        java.lang.Integer txVoStatus;
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        java.util.List<?> items = ipx.OLrzqt.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int i = 0;
        for (java.lang.Object obj : items) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InvestOrderBean investOrderBean = obj instanceof InvestOrderBean ? (InvestOrderBean) obj : null;
            if (investOrderBean != null && Intrinsics.EZpvd((java.lang.Object) investOrderBean.getOrderId(), (java.lang.Object) investTransactionModel.getOrderId()) && (txVoStatus = investTransactionModel.getTxVoStatus()) != null) {
                investOrderBean.setOrderVoStatus(txVoStatus.intValue());
                ipx.OLrzqt.notifyItemChanged(i);
            }
            i++;
        }
        return Unit.INSTANCE;
    }

    public static final class LoaderManager implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            iPX.this.dismissLoading();
            iGU igu = iPX.this.EZpvd;
            if (igu == null) {
                Intrinsics.gEmmrt("");
                igu = null;
            }
            C55173xeu c55173xeu = igu.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(0);
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InvestOrderTypeFilter investOrderTypeFilter, Continuation<? super Unit> continuation) {
            iGU igu = iPX.this.EZpvd;
            if (igu == null) {
                Intrinsics.gEmmrt("");
                igu = null;
            }
            igu.djBIcL.setText(investOrderTypeFilter != null ? investOrderTypeFilter.getName() : null);
            return Unit.INSTANCE;
        }
    }

    public final void copydefault(boolean z) {
        dismissLoading();
        iGU igu = this.EZpvd;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        C33546myW c33546myW = igu.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, z);
    }

    public static /* synthetic */ void showErrorState$default(iPX ipx, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        ipx.KWHzl(z, z2);
    }

    public final void KWHzl(boolean z, boolean z2) {
        java.lang.String string;
        iGU igu = this.EZpvd;
        iGU igu2 = null;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        C33546myW c33546myW = igu.gEmmrt;
        boolean z3 = !z;
        c33546myW.djBIcL(z3);
        c33546myW.AhwBna(z3);
        if (z) {
            iGU igu3 = this.EZpvd;
            if (igu3 == null) {
                Intrinsics.gEmmrt("");
                igu3 = null;
            }
            C55173xeu c55173xeu = igu3.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.postDelayed(new LoaderManager(), TooltipKt.TooltipDuration);
            iGU igu4 = this.EZpvd;
            if (igu4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                igu2 = igu4;
            }
            C55173xeu c55173xeu2 = igu2.valueOf;
            if (z2) {
                string = C43422row.OLrzqt();
            } else {
                string = getString(C25493ixk.FragmentManager.DcMfJKRKUgwx);
                Intrinsics.copydefault((java.lang.Object) string);
            }
            c55173xeu2.setTitle(string);
            java.lang.String string2 = z2 ? getString(C25493ixk.FragmentManager.AEQbTJ) : "";
            Intrinsics.copydefault((java.lang.Object) string2);
            c55173xeu2.setRetry(string2);
            c55173xeu2.setEmptyTypeImage(z2 ? 8 : 7);
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.iPW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    iPX.OLrzqt(this.AEQbTJ, view);
                }
            });
            Intrinsics.copydefault(c55173xeu2);
            return;
        }
        iGU igu5 = this.EZpvd;
        if (igu5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            igu2 = igu5;
        }
        C55173xeu c55173xeu3 = igu2.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
        c55173xeu3.setVisibility(8);
    }

    public static final void OLrzqt(iPX ipx, android.view.View view) {
        iGU igu = ipx.EZpvd;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        C55173xeu c55173xeu = igu.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        ipx.showLoading();
        refresh$default(ipx, false, 1, null);
    }

    public final void copydefault() {
        if (this.AEQbTJ == null) {
            C27329jtD c27329jtD = new C27329jtD(this, new Function1() { // from class: o.iQh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iPX.OLrzqt(this.copydefault, (InvestBaseFilterItem) obj);
                }
            });
            this.AEQbTJ = c27329jtD;
            c27329jtD.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.iQe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    iPX.djBIcL(this.OLrzqt);
                }
            });
        }
        C27329jtD c27329jtD2 = this.AEQbTJ;
        if (c27329jtD2 != null && c27329jtD2.isShowing()) {
            C27329jtD c27329jtD3 = this.AEQbTJ;
            if (c27329jtD3 != null) {
                c27329jtD3.dismiss();
                return;
            }
            return;
        }
        iGU igu = this.EZpvd;
        iGU igu2 = null;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        igu.AYXKKw.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.OxVOHk, 0);
        C27329jtD c27329jtD4 = this.AEQbTJ;
        if (c27329jtD4 != null) {
            iGU igu3 = this.EZpvd;
            if (igu3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                igu2 = igu3;
            }
            android.widget.TextView textView = igu2.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c27329jtD4.OLrzqt(textView, KWHzl().AhwBna());
        }
    }

    public static final Unit OLrzqt(iPX ipx, InvestBaseFilterItem investBaseFilterItem) {
        Intrinsics.checkNotNullParameter(investBaseFilterItem, "");
        InvestBaseFilter investBaseFilterAEQbTJ = ipx.KWHzl().AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) (investBaseFilterAEQbTJ != null ? investBaseFilterAEQbTJ.getName() : null), (java.lang.Object) investBaseFilterItem.getName())) {
            return Unit.INSTANCE;
        }
        ipx.KWHzl().OLrzqt((InvestBaseFilter) investBaseFilterItem);
        ipx.AhwBna();
        ipx.showLoading();
        ipx.OLrzqt.getItems().clear();
        ipx.OLrzqt.notifyDataSetChanged();
        refresh$default(ipx, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(iPX ipx) {
        iGU igu = ipx.EZpvd;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        igu.AYXKKw.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.OJuSTm, 0);
    }

    public static final Unit KWHzl(iPX ipx, InvestBaseFilterItem investBaseFilterItem) {
        Intrinsics.checkNotNullParameter(investBaseFilterItem, "");
        InvestOrderTypeFilter investOrderTypeFilter = investBaseFilterItem instanceof InvestOrderTypeFilter ? (InvestOrderTypeFilter) investBaseFilterItem : null;
        if (investOrderTypeFilter == null) {
            return Unit.INSTANCE;
        }
        java.lang.String filterId = investOrderTypeFilter.getFilterId();
        InvestOrderTypeFilter value = ipx.KWHzl().EZpvd().getValue();
        if (Intrinsics.EZpvd((java.lang.Object) filterId, (java.lang.Object) (value != null ? value.getFilterId() : null))) {
            return Unit.INSTANCE;
        }
        ipx.KWHzl().OLrzqt(investOrderTypeFilter);
        ipx.showLoading();
        ipx.OLrzqt.getItems().clear();
        ipx.OLrzqt.notifyDataSetChanged();
        refresh$default(ipx, false, 1, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        if (this.copydefault == null) {
            C27329jtD c27329jtD = new C27329jtD(this, new Function1() { // from class: o.iQk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return iPX.KWHzl(this.AEQbTJ, (InvestBaseFilterItem) obj);
                }
            });
            c27329jtD.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.iQl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    iPX.gEmmrt(this.AEQbTJ);
                }
            });
            this.copydefault = c27329jtD;
        }
        C27329jtD c27329jtD2 = this.copydefault;
        if (c27329jtD2 != null && c27329jtD2.isShowing()) {
            C27329jtD c27329jtD3 = this.copydefault;
            if (c27329jtD3 != null) {
                c27329jtD3.dismiss();
                return;
            }
            return;
        }
        iGU igu = this.EZpvd;
        iGU igu2 = null;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        igu.djBIcL.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.OxVOHk, 0);
        C27329jtD c27329jtD4 = this.copydefault;
        if (c27329jtD4 != null) {
            iGU igu3 = this.EZpvd;
            if (igu3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                igu2 = igu3;
            }
            android.widget.TextView textView = igu2.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c27329jtD4.OLrzqt(textView, KWHzl().KWHzl());
        }
    }

    public static final void gEmmrt(iPX ipx) {
        iGU igu = ipx.EZpvd;
        if (igu == null) {
            Intrinsics.gEmmrt("");
            igu = null;
        }
        igu.djBIcL.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.OJuSTm, 0);
    }

    public final void EZpvd() {
        C27570jxg.investEvent$default("YieldOrder_Full_Page_View", null, null, 3, null);
    }

    public final void OLrzqt(final java.lang.String str) {
        C27570jxg.investEvent$default("YieldOrder_Full_Page_Click", null, new Function1() { // from class: o.iQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPX.copydefault(str, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.ORDER_ID, str, false);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C27569jxf.setStatusBarsStyle$OKDeFi_invest_biz$default(C27569jxf.OLrzqt, this, 0, 1, null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
