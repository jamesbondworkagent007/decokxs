package o;

import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.business.defi.biz.model.wallet.EsCapeData;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$2;
import com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$3;
import com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$onCreate$4;
import com.okinc.business.defi.wallet.mpc.viewModel.EscapeMpcWalletAccountListViewModel;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC17435fFf extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public AbstractC16309ehW EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public java.lang.String AYXKKw = "";
    public java.lang.String AhwBna = "";
    public boolean copydefault = true;

    /* JADX INFO: renamed from: o.fFf$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    public ActivityC17435fFf() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(EscapeMpcWalletAccountListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$special$$inlined$viewModels$default$3
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
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(fGT.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletAccountListActivity$special$$inlined$viewModels$default$6
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

    /* JADX INFO: renamed from: o.fFf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fFf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17435fFf.class);
            intent.putExtra("root_wallet_id", str);
            intent.putExtra("mpcId", str2);
            context.startActivity(intent);
        }
    }

    public final EscapeMpcWalletAccountListViewModel AEQbTJ() {
        return (EscapeMpcWalletAccountListViewModel) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fGT OLrzqt() {
        return (fGT) this.djBIcL.getValue();
    }

    private final void copydefault() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AYXKKw = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("mpcId");
        this.AhwBna = stringExtra2 != null ? stringExtra2 : "";
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16309ehW) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.djSkpj);
        copydefault();
        KWHzl();
        AbstractC16309ehW abstractC16309ehW = this.EZpvd;
        if (abstractC16309ehW == null) {
            Intrinsics.gEmmrt("");
            abstractC16309ehW = null;
        }
        OKAlertBanner oKAlertBanner = abstractC16309ehW.AEQbTJ;
        oKAlertBanner.setVisibility(8);
        oKAlertBanner.setLeadingIcon(ContextCompat.getDrawable(this, C13754dXa.Activity.UeEOUB));
        AEQbTJ().AEQbTJ(this.AYXKKw);
        AEQbTJ().EZpvd(this.AhwBna);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapeMpcWalletAccountListActivity$onCreate$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapeMpcWalletAccountListActivity$onCreate$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapeMpcWalletAccountListActivity$onCreate$4(this, null), 3, null);
        OLrzqt().AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.fFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17435fFf.OLrzqt(this.KWHzl, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC17435fFf activityC17435fFf, java.lang.Integer num) {
        activityC17435fFf.dismissLoadingWithLogo();
        if (num != null && num.intValue() == 0) {
            activityC17435fFf.EZpvd();
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            activityC17435fFf.AEQbTJ(num.intValue());
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.copydefault) {
            this.copydefault = false;
        } else {
            AEQbTJ().EZpvd(AEQbTJ().gEmmrt());
        }
    }

    private final void KWHzl() {
        AbstractC16309ehW abstractC16309ehW = this.EZpvd;
        AbstractC16309ehW abstractC16309ehW2 = null;
        if (abstractC16309ehW == null) {
            Intrinsics.gEmmrt("");
            abstractC16309ehW = null;
        }
        abstractC16309ehW.OLrzqt.setHasFixedSize(true);
        AbstractC16309ehW abstractC16309ehW3 = this.EZpvd;
        if (abstractC16309ehW3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16309ehW2 = abstractC16309ehW3;
        }
        abstractC16309ehW2.OLrzqt.setAdapter(this.AEQbTJ);
        this.AEQbTJ.register(EsCapeData.class, new C17542fJe(new Function1() { // from class: o.fFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17435fFf.EZpvd(this.KWHzl, (EsCapeData) obj);
            }
        }));
    }

    public static final Unit EZpvd(final ActivityC17435fFf activityC17435fFf, final EsCapeData esCapeData) {
        Intrinsics.checkNotNullParameter(esCapeData, "");
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC17435fFf.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14461dlr(supportFragmentManager, "mpcEscape-accountList", new Function1() { // from class: o.fFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17435fFf.OLrzqt(this.EZpvd, esCapeData, (java.lang.String) obj);
            }
        }, null, null, false, 56, null).EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC17435fFf activityC17435fFf, EsCapeData esCapeData, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC17435fFf.showLoadingWithLogo();
        activityC17435fFf.AEQbTJ().EZpvd(str, esCapeData.getAddressIndex());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.scanPackages);
    }

    private final void EZpvd() {
        C14571dnv c14571dnvOLrzqt = C14571dnv.Companion.OLrzqt();
        c14571dnvOLrzqt.AEQbTJ(new Function1() { // from class: o.fFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17435fFf.KWHzl(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
        c14571dnvOLrzqt.show(getSupportFragmentManager(), "EscapeUrgentEnterActivity");
    }

    public static final Unit KWHzl(ActivityC17435fFf activityC17435fFf, int i) {
        activityC17435fFf.AEQbTJ(i);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final int i) {
        final AbstractC12784ctX abstractC12784ctXAhwBna = AEQbTJ().AhwBna();
        if (abstractC12784ctXAhwBna == null || AEQbTJ().KWHzl() == null) {
            return;
        }
        setForceDismiss(false);
        showLoading(0L);
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(this, i);
        if (interfaceC14334djWOLrzqt != null) {
            interfaceC14334djWOLrzqt.KWHzl(this, i, new Function0() { // from class: o.fFl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC17435fFf.KWHzl(this.copydefault, i, abstractC12784ctXAhwBna);
                }
            });
        }
    }

    public static final Unit KWHzl(final ActivityC17435fFf activityC17435fFf, int i, final AbstractC12784ctX abstractC12784ctX) {
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(activityC17435fFf, i);
        if (interfaceC14373dkIEZpvd != null) {
            java.lang.String str = activityC17435fFf.AhwBna;
            EscapeMpcWalletAccountListViewModel.Application applicationKWHzl = activityC17435fFf.AEQbTJ().KWHzl();
            java.lang.String strEZpvd = applicationKWHzl != null ? applicationKWHzl.EZpvd() : null;
            Intrinsics.copydefault((java.lang.Object) strEZpvd);
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC17435fFf.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC14373dkIEZpvd.KWHzl(str, strEZpvd, supportFragmentManager, activityC17435fFf, new Function2() { // from class: o.fFi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC17435fFf.EZpvd(abstractC12784ctX, activityC17435fFf, (MPCWalletShareBean) obj, (java.lang.String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC12784ctX abstractC12784ctX, final ActivityC17435fFf activityC17435fFf, MPCWalletShareBean mPCWalletShareBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(mPCWalletShareBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl());
        EscapeMpcWalletAccountListViewModel.Application applicationKWHzl = activityC17435fFf.AEQbTJ().KWHzl();
        MpcWalletDecodeInfo mpcWalletDecodeInfoKWHzl = applicationKWHzl != null ? applicationKWHzl.KWHzl() : null;
        Intrinsics.copydefault(mpcWalletDecodeInfoKWHzl);
        mpcWalletDecodeInfoKWHzl.setEcdsaP3(mPCWalletShareBean.getEcdsaP3());
        mpcWalletDecodeInfoKWHzl.setEcdsaShare3(mPCWalletShareBean.getEcdsaShare3());
        mpcWalletDecodeInfoKWHzl.setEd25519Share3(mPCWalletShareBean.getEd25519Share3());
        mpcWalletDecodeInfoKWHzl.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
        mpcWalletDecodeInfoKWHzl.setEscape(1);
        EscapeMpcWalletAccountListViewModel.Application applicationKWHzl2 = activityC17435fFf.AEQbTJ().KWHzl();
        java.lang.String strEZpvd = applicationKWHzl2 != null ? applicationKWHzl2.EZpvd() : null;
        Intrinsics.copydefault((java.lang.Object) strEZpvd);
        EscapeMpcWalletAccountListViewModel.Application applicationKWHzl3 = activityC17435fFf.AEQbTJ().KWHzl();
        java.lang.String strCopydefault = applicationKWHzl3 != null ? applicationKWHzl3.copydefault() : null;
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        abstractC12782ctV.AEQbTJ(C10964byQ.copydefault(strEZpvd, strCopydefault, mpcWalletDecodeInfoKWHzl));
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        java.lang.String encryptShareKey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEncryptShareKey() : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        java.lang.Integer numValueOf = mpcWalletEncodeInfoQSBOWP2 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP2.getStatus()) : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
        AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, numValueOf, null, null, mpcWalletEncodeInfoQSBOWP3 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP3.isEscape()) : null, encryptShareKey, null, 77, null);
        final Function1 function1 = new Function1() { // from class: o.fFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17435fFf.EZpvd(this.copydefault, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17435fFf.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fFo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17435fFf.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        activityC17435fFf.addDisposable(abstractC58260yxtUpdateMpcWalletInfo$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17435fFf.OLrzqt(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC17435fFf activityC17435fFf, java.lang.Integer num) {
        activityC17435fFf.dismissLoading();
        EscapeMpcWalletAccountListViewModel escapeMpcWalletAccountListViewModelAEQbTJ = activityC17435fFf.AEQbTJ();
        EscapeMpcWalletAccountListViewModel.Application applicationKWHzl = activityC17435fFf.AEQbTJ().KWHzl();
        MpcWalletDecodeInfo mpcWalletDecodeInfoKWHzl = applicationKWHzl != null ? applicationKWHzl.KWHzl() : null;
        Intrinsics.copydefault(mpcWalletDecodeInfoKWHzl);
        escapeMpcWalletAccountListViewModelAEQbTJ.AEQbTJ(mpcWalletDecodeInfoKWHzl);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC17435fFf activityC17435fFf, java.lang.Throwable th) {
        activityC17435fFf.dismissLoading();
        return Unit.INSTANCE;
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
    public void onStart() {
        super.onStart();
    }
}
