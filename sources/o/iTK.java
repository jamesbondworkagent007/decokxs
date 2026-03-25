package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
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
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserUnClaimTokenInfo;
import com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$onCustomCreateView$1;
import com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$onCustomHeaderView$2;
import com.okinc.business.invest_biz.ui.viewmodel.InvestBatchClaimViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iTK extends iTG {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final boolean AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public Application valueOf;

    public interface Application {
        void EZpvd(@NotNull C25477ixU c25477ixU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.AhwBna;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iTK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final iTK copydefault(@NotNull InvestUserClaimInfoResponse investUserClaimInfoResponse, long j, int i, long j2, Application application) {
            Intrinsics.checkNotNullParameter(investUserClaimInfoResponse, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", investUserClaimInfoResponse);
            bundle.putLong("product_id", j);
            bundle.putLong("chain_id", j2);
            bundle.putInt("pageType", i);
            iTK itk = new iTK();
            itk.setArguments(bundle);
            itk.valueOf = application;
            return itk;
        }
    }

    public iTK() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestBatchClaimViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$special$$inlined$viewModels$default$5
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
    }

    public static final class TaskDescription extends C43318rmy<InvestUserUnClaimTokenInfo, AbstractC23773iIu> {
        public final Application AEQbTJ;

        public TaskDescription(Application application) {
            super(C25493ixk.Activity.DCJXGO, C25488ixf.OLrzqt);
            this.AEQbTJ = application;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC23773iIu> c43312rms, @NotNull InvestUserUnClaimTokenInfo investUserUnClaimTokenInfo, @NotNull java.util.List<java.lang.Object> list) {
            int i;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(investUserUnClaimTokenInfo, "");
            Intrinsics.checkNotNullParameter(list, "");
            super.onBindViewHolder(c43312rms, investUserUnClaimTokenInfo, list);
            AbstractC23773iIu abstractC23773iIu = (AbstractC23773iIu) c43312rms.OLrzqt();
            android.widget.TextView textView = abstractC23773iIu.gEmmrt;
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String coinAmount = investUserUnClaimTokenInfo.getCoinAmount();
            textView.setText(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, coinAmount == null ? "" : coinAmount, 6, 2, false, false, 24, null) + " " + investUserUnClaimTokenInfo.getTokenSymbol());
            android.widget.TextView textView2 = abstractC23773iIu.KWHzl;
            java.lang.String currencyAmount = investUserUnClaimTokenInfo.getCurrencyAmount();
            textView2.setText(C27492jwH.formatCurrencyData$default(c27492jwH, currencyAmount == null ? "" : currencyAmount, null, null, null, 14, null));
            android.widget.ImageView imageView = abstractC23773iIu.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, investUserUnClaimTokenInfo.getTokenLogo(), null, 0, 0, 14, null);
            android.content.Context context = c43312rms.itemView.getContext();
            InvestUserRewardDetailPromptInformation extraData = investUserUnClaimTokenInfo.getExtraData();
            if ((extraData != null ? extraData.getClaimTipInfo() : null) != null) {
                android.widget.LinearLayout linearLayout = abstractC23773iIu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                java.lang.Integer callDataRewardType = investUserUnClaimTokenInfo.getCallDataRewardType();
                if (callDataRewardType != null && callDataRewardType.intValue() == 1) {
                    int color = ContextCompat.getColor(context, C52761wXj.Activity.iLAtSv);
                    abstractC23773iIu.OLrzqt.setTextColor(color);
                    abstractC23773iIu.AEQbTJ.setColorFilter(color);
                } else if ((callDataRewardType != null && callDataRewardType.intValue() == 2) || (callDataRewardType != null && callDataRewardType.intValue() == 3)) {
                    int color2 = ContextCompat.getColor(context, C52761wXj.Activity.UlJrfe);
                    abstractC23773iIu.OLrzqt.setTextColor(color2);
                    abstractC23773iIu.AEQbTJ.setColorFilter(color2);
                } else {
                    android.widget.LinearLayout linearLayout2 = abstractC23773iIu.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                }
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                Intrinsics.copydefault(context);
                android.widget.TextView textView3 = abstractC23773iIu.OLrzqt;
                android.widget.LinearLayout linearLayout3 = abstractC23773iIu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                i = 8;
                c27569jxf.AEQbTJ(context, textView3, linearLayout3, investUserUnClaimTokenInfo.getExtraData().getClaimTipInfo(), (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
            } else {
                i = 8;
                android.widget.LinearLayout linearLayout4 = abstractC23773iIu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.setVisibility(8);
            }
            java.lang.Integer buttonType = investUserUnClaimTokenInfo.getButtonType();
            if (buttonType == null || buttonType.intValue() != 0) {
                if (buttonType != null && buttonType.intValue() == 2) {
                    C52794wYp c52794wYp = abstractC23773iIu.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                    c52794wYp.setVisibility(0);
                    abstractC23773iIu.copydefault.setEnabled(false);
                    abstractC23773iIu.copydefault.setText(C25493ixk.FragmentManager.DBxZfM);
                    return;
                }
                if (buttonType != null && buttonType.intValue() == 3) {
                    C52794wYp c52794wYp2 = abstractC23773iIu.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                    c52794wYp2.setVisibility(0);
                    abstractC23773iIu.copydefault.setEnabled(true);
                    abstractC23773iIu.copydefault.setText(C25493ixk.FragmentManager.DLWbHP);
                    C52794wYp c52794wYp3 = abstractC23773iIu.copydefault;
                    c52794wYp3.setOnClickListener(new Activity(c52794wYp3, 1000L, this, investUserUnClaimTokenInfo));
                    return;
                }
                pUU.copydefault("InvestBatchClaimDialog", "Hiding the button due to invalid buttonType: " + buttonType);
                C52794wYp c52794wYp4 = abstractC23773iIu.copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
                c52794wYp4.setVisibility(i);
                return;
            }
            C52794wYp c52794wYp5 = abstractC23773iIu.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp5, "");
            c52794wYp5.setVisibility(i);
        }

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ InvestUserUnClaimTokenInfo KWHzl;
            public final /* synthetic */ TaskDescription OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, TaskDescription taskDescription, InvestUserUnClaimTokenInfo investUserUnClaimTokenInfo) {
                this.EZpvd = view;
                this.copydefault = j;
                this.OLrzqt = taskDescription;
                this.KWHzl = investUserUnClaimTokenInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Application application = this.OLrzqt.AEQbTJ;
                    if (application != null) {
                        java.lang.String claimIndex = this.KWHzl.getClaimIndex();
                        java.util.List listEZpvd = claimIndex != null ? C56402yEa.EZpvd(claimIndex) : null;
                        java.lang.Integer callDataRewardType = this.KWHzl.getCallDataRewardType();
                        int i = (callDataRewardType != null && callDataRewardType.intValue() == 2) ? 1 : 0;
                        java.lang.String callDataExtJson = this.KWHzl.getCallDataExtJson();
                        application.EZpvd(new C25477ixU(listEZpvd, java.lang.Integer.valueOf(i), callDataExtJson != null ? C56402yEa.EZpvd(callDataExtJson) : null, null, 8, null));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.iTG.gEmmrt()V */
    public final InvestBatchClaimViewModel gEmmrt() {
        return (InvestBatchClaimViewModel) this.gEmmrt.getValue();
    }

    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJP ijpOLrzqt = iJP.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijpOLrzqt, "");
        android.widget.ImageView imageView = ijpOLrzqt.EZpvd;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestBatchClaimDialog$onCustomHeaderView$2(this, ijpOLrzqt, null), 3, null);
        ConstraintLayout root = ijpOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ iTK OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, iTK itk) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = itk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJQ ijqKWHzl = iJQ.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijqKWHzl, "");
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(InvestUserUnClaimTokenInfo.class, new TaskDescription(this.valueOf));
        ijqKWHzl.KWHzl.setAdapter(c43316rmw);
        ijqKWHzl.KWHzl.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestBatchClaimDialog$onCustomCreateView$1(this, c43316rmw, null), 3, null);
        ConstraintLayout root = ijqKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }
}
