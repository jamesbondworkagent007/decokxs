package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.immomo.mls.InitData;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54065wxN extends AbstractC43061riF {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final java.lang.String AEQbTJ = "AutoEarnBenefitPage";
    public final int KWHzl = C7343ahz.Activity.valueOf;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    public C54065wxN() {
        final Function0 function0 = new Function0() { // from class: o.wxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54065wxN.EZpvd(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnBenefitFragment$special$$inlined$viewModels$default$1
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AutoEarnPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnBenefitFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnBenefitFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnBenefitFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: renamed from: o.wxN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wxN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C54065wxN EZpvd(boolean z) {
            C54065wxN c54065wxN = new C54065wxN();
            c54065wxN.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("IS_EARN", java.lang.Boolean.valueOf(z))));
            return c54065wxN;
        }
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(C7343ahz.TaskDescription.OcIXYQ);
        }
        return null;
    }

    public final AutoEarnPresenter KWHzl() {
        return (AutoEarnPresenter) this.copydefault.getValue();
    }

    public static final ViewModelStoreOwner EZpvd(C54065wxN c54065wxN) {
        androidx.fragment.app.Fragment parentFragment = c54065wxN.getParentFragment();
        return parentFragment != null ? parentFragment : c54065wxN;
    }

    /* JADX INFO: renamed from: o.wxN$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.EZpvd;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = taskDescription.AYXKKw;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = taskDescription.gEmmrt;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = taskDescription.KWHzl;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = taskDescription.copydefault;
            }
            java.lang.String str11 = str6;
            if ((i & 64) != 0) {
                z = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(str, str7, str8, str9, str10, str11, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new TaskDescription(str, str2, str3, str4, str5, str6, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) taskDescription.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) taskDescription.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LuaAutoEarnStakingConfig(autoLendAmount=" + this.AEQbTJ + ", autoLendAmountFormatted=" + this.EZpvd + ", limitQuota=" + this.AYXKKw + ", limitQuotaFormatted=" + this.gEmmrt + ", apr=" + this.KWHzl + ", ccy=" + this.copydefault + ", hasLimit=" + this.OLrzqt + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.AYXKKw = str3;
            this.gEmmrt = str4;
            this.KWHzl = str5;
            this.copydefault = str6;
            this.OLrzqt = z;
        }
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        android.os.Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("IS_EARN") : true;
        AutoVipProfitInfo autoVipProfitInfoOLrzqt = KWHzl().OLrzqt();
        java.util.List<AutoEarnStakingConfig> autoEarn = z ? autoVipProfitInfoOLrzqt.getAutoEarn() : autoVipProfitInfoOLrzqt.getAutoStake();
        if (autoEarn == null) {
            autoEarn = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(autoEarn, 10));
        for (AutoEarnStakingConfig autoEarnStakingConfig : autoEarn) {
            arrayList.add(new TaskDescription(autoEarnStakingConfig.getAutoLendAmount(), C56033xvF.fmtICUCompactAmountWithSymbol$default(autoEarnStakingConfig.getCcy(), autoEarnStakingConfig.getAutoLendAmount(), true, null, null, null, 56, null), autoEarnStakingConfig.getLimitQuota(), C56033xvF.fmtICUCompactAmountWithSymbol$default(autoEarnStakingConfig.getCcy(), autoEarnStakingConfig.getLimitQuota(), true, null, null, null, 56, null), autoEarnStakingConfig.getApr(), autoEarnStakingConfig.getCcy(), autoEarnStakingConfig.getHasLimit()));
        }
        return C43056riA.AEQbTJ.EZpvd("okluatradingeco", "/bot/auto_earn/benefit", C56424yEw.gEmmrt(C56390yDp.OLrzqt("IS_EARN", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("CONFIG_LIST", C33488mxR.EZpvd(arrayList))));
    }
}
