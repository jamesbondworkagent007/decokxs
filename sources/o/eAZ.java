package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.detail.DefiWalletDetailActivity$onCreate$1;
import com.okinc.business.defi.wallet.detail.DefiWalletDetailActivity$refreshListData$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC15412eHj;
import o.ActivityC17261ezU;
import o.ActivityC18321fgG;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C10604brb;
import o.C12827cuN;
import o.C13754dXa;
import o.C18521fjv;
import o.eBX;
import o.eHZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eAZ extends eBC implements eHZ.Application {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final ActivityResultLauncher<ActivityC15412eHj.StateListAnimator> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public java.lang.String AhwBna = "";
    public AbstractC16288ehB KWHzl;
    public final C15274eCg OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public AbstractC12784ctX djBIcL;
    public final C17237eyx gEmmrt;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    public eAZ() {
        C12827cuN.Application application = C12827cuN.Companion;
        final Function0 function0 = null;
        this.gEmmrt = new C17237eyx(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C17241ezA(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null)), 0 == true ? 1 : 0, 22, null);
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(fGT.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.detail.DefiWalletDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.detail.DefiWalletDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.detail.DefiWalletDetailActivity$special$$inlined$viewModels$default$3
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
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eAZ.values(this.EZpvd);
            }
        });
        this.OLrzqt = new C15274eCg(null, 1, null);
        ActivityResultLauncher<ActivityC15412eHj.StateListAnimator> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ActivityC15412eHj.Application.AEQbTJ, new ActivityResultCallback() { // from class: o.eAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                eAZ.AEQbTJ(this.KWHzl, (ActivityC15412eHj.ActionBar) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eAZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eAZ.class);
            intent.putExtra("root_wallet_id", str);
            context.startActivity(intent);
        }
    }

    private final void ejfBZ() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AhwBna = stringExtra;
    }

    public final fGT AYXKKw() {
        return (fGT) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw fIwbmz() {
        return (C43316rmw) this.copydefault.getValue();
    }

    public static final C43316rmw values(final eAZ eaz) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(eBX.Activity.class, new eBZ(new Function0() { // from class: o.eBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eAZ.AkhnZx(this.EZpvd);
            }
        }));
        c43316rmw.register(eBX.Application.class, new eBY());
        c43316rmw.register(eBX.Dialog.class, new C15269eCb());
        c43316rmw.register(eBX.ActionBar.class, new eBV(new Function1() { // from class: o.eBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.AEQbTJ(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        }));
        c43316rmw.register(eBX.LoaderManager.class, new eBU(new Function1() { // from class: o.eBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.copydefault(this.OLrzqt, (eBX.LoaderManager) obj);
            }
        }));
        c43316rmw.register(eBX.FragmentManager.class, new C15271eCd());
        c43316rmw.register(eBX.TaskDescription.class, new C15270eCc(new Function1() { // from class: o.eBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.copydefault(this.KWHzl, (AbstractC12784ctX) obj);
            }
        }));
        c43316rmw.register(eBX.StateListAnimator.class, new eBT(new Function0() { // from class: o.eBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eAZ.DbNXlk(this.OLrzqt);
            }
        }));
        return c43316rmw;
    }

    public static final Unit AkhnZx(eAZ eaz) {
        eaz.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(eAZ eaz, int i) {
        eaz.KWHzl(i);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(eAZ eaz, eBX.LoaderManager loaderManager) {
        Intrinsics.checkNotNullParameter(loaderManager, "");
        ActivityC15218eAe.Companion.copydefault(eaz, loaderManager.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(eAZ eaz, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        eaz.AEQbTJ(abstractC12784ctX);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(final eAZ eaz) {
        C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null).KWHzl(eaz, eaz, new Function0() { // from class: o.eBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eAZ.fIwbmz(this.KWHzl);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(eAZ eaz) {
        eaz.AEQbTJ();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C17237eyx c17237eyx = this.gEmmrt;
        java.lang.String str = this.AhwBna;
        AbstractC12784ctX abstractC12784ctX = this.djBIcL;
        AbstractC12784ctX abstractC12784ctX2 = null;
        if (abstractC12784ctX == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX = null;
        }
        WalletType walletTypeFJNWhG = abstractC12784ctX.fJNWhG();
        AbstractC12784ctX abstractC12784ctX3 = this.djBIcL;
        if (abstractC12784ctX3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC12784ctX2 = abstractC12784ctX3;
        }
        c17237eyx.EZpvd(new C17263ezW(this, str, walletTypeFJNWhG, abstractC12784ctX2.fJNWhG(), true, "DefiWalletDetailActivity", null, 64, null));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ eAZ KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eAZ eaz) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = eaz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.djBIcL();
            }
        }
    }

    public final void AEQbTJ() {
        showLoading();
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.eAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.EZpvd((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.eAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eAZ.gEmmrt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eAZ.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.eBb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eAZ.djBIcL(function13, obj);
            }
        }));
    }

    public static final java.lang.Boolean gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(eAZ eaz, java.lang.Boolean bool) {
        java.lang.Object objM7377constructorimpl;
        eaz.dismissLoading();
        if (bool.booleanValue()) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatItemCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "100"))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        } else {
            eaz.AuCTel();
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(eAZ eaz, java.lang.Throwable th) {
        eaz.dismissLoading();
        eaz.AuCTel();
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        fNC fnc = fNC.OLrzqt;
        AbstractC12784ctX abstractC12784ctX = this.djBIcL;
        if (abstractC12784ctX == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX = null;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        fNC.addWalletAccount$default(fnc, abstractC12784ctX, this, supportFragmentManager, null, "wallet_details", new Function2() { // from class: o.eBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eAZ.KWHzl(this.AEQbTJ, (WalletCreatedData) obj, (java.lang.Integer) obj2);
            }
        }, 8, null);
    }

    public static final Unit KWHzl(eAZ eaz, WalletCreatedData walletCreatedData, java.lang.Integer num) {
        fNC.OLrzqt.EZpvd(walletCreatedData, num);
        eaz.valueOf();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(eAZ eaz, ActivityC15412eHj.ActionBar actionBar) {
        if (actionBar instanceof ActivityC15412eHj.ActionBar.C0833ActionBar) {
            C15406eHd.KWHzl(eaz, ((ActivityC15412eHj.ActionBar.C0833ActionBar) actionBar).copydefault());
        }
    }

    @Override // o.eBC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16288ehB) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.AwvSrB);
        C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Entry_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        ejfBZ();
        AhwBna();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletDetailActivity$onCreate$1(this, null), 3, null);
    }

    public final void AhwBna() {
        if (this.AhwBna.length() == 0) {
            finish();
            return;
        }
        AbstractC16288ehB abstractC16288ehB = this.KWHzl;
        AbstractC16288ehB abstractC16288ehB2 = null;
        if (abstractC16288ehB == null) {
            Intrinsics.gEmmrt("");
            abstractC16288ehB = null;
        }
        abstractC16288ehB.copydefault.setAppBarTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getQueueTitle));
        AbstractC16288ehB abstractC16288ehB3 = this.KWHzl;
        if (abstractC16288ehB3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16288ehB3 = null;
        }
        abstractC16288ehB3.copydefault.setTitleTypeface("harmony_sans_bold.ttf");
        AbstractC16288ehB abstractC16288ehB4 = this.KWHzl;
        if (abstractC16288ehB4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16288ehB4 = null;
        }
        abstractC16288ehB4.EZpvd.setAdapter(fIwbmz());
        AYXKKw().AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.eBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.copydefault(this.KWHzl, (java.lang.Integer) obj);
            }
        }));
        AbstractC16288ehB abstractC16288ehB5 = this.KWHzl;
        if (abstractC16288ehB5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16288ehB2 = abstractC16288ehB5;
        }
        C52794wYp c52794wYp = abstractC16288ehB2.KWHzl;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    public static final Unit copydefault(eAZ eaz, java.lang.Integer num) {
        if (num != null && num.intValue() == 0) {
            eaz.dismissLoading();
            eaz.DbNXlk();
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            AbstractC12782ctV abstractC12782ctVEZpvd = eaz.AYXKKw().EZpvd();
            if (abstractC12782ctVEZpvd != null) {
                fGT fgtAYXKKw = eaz.AYXKKw();
                MpcWalletDecodeInfo mpcWalletDecodeInfoKWHzl = eaz.AYXKKw().KWHzl();
                Intrinsics.copydefault(mpcWalletDecodeInfoKWHzl);
                fgtAYXKKw.copydefault(eaz, mpcWalletDecodeInfoKWHzl, eaz.AYXKKw().AYXKKw(), eaz.AYXKKw().djBIcL(), num.intValue(), abstractC12782ctVEZpvd, "DefiWalletDetailActivity");
            }
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
            eaz.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    @Override // o.eBC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        valueOf();
    }

    public final void KWHzl() {
        try {
            C32866mlf.onEvent$default("Web3WalletWallet_Details_Address_View", (TrackChannel[]) null, new Function1() { // from class: o.eBm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eAZ.AEQbTJ(this.AEQbTJ, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "addDefiTrackEvent error message :" + e.getMessage());
        }
    }

    public static final Unit AEQbTJ(eAZ eaz, EventParamsList eventParamsList) {
        java.util.List<C9698baW> listAhwBna;
        C9698baW c9698baW;
        java.lang.String strOLrzqt;
        java.lang.String str;
        WalletType walletTypeQwvEab;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12784ctX abstractC12784ctX = eaz.djBIcL;
        java.lang.String strName = null;
        if (abstractC12784ctX == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX = null;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(abstractC12784ctX.KWHzl());
        if (abstractC12782ctV == null || !abstractC12782ctV.AuCTelauCTel()) {
            if (abstractC12782ctV != null && (listAhwBna = abstractC12782ctV.AhwBna()) != null && (c9698baW = (C9698baW) CollectionsKt___CollectionsKt.firstOrNull(listAhwBna)) != null) {
                strOLrzqt = c9698baW.OLrzqt();
                str = strOLrzqt;
            }
            str = null;
        } else {
            InterfaceC9780bbz interfaceC9780bbzCopydefault = abstractC12782ctV.copydefault(1L);
            if (interfaceC9780bbzCopydefault != null) {
                strOLrzqt = interfaceC9780bbzCopydefault.getAddress();
                str = strOLrzqt;
            }
            str = null;
        }
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "firstWalletAccountID", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, "firstWalletAddress", str == null ? "" : str, false, 4, null);
        if (abstractC12782ctV != null && (walletTypeQwvEab = abstractC12782ctV.QwvEab()) != null) {
            strName = walletTypeQwvEab.name();
        }
        EventParamsList.put$default(eventParamsList, "walletType", strName == null ? "" : strName, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletDetailActivity$refreshListData$1(this, null), 3, null);
    }

    public final void fetchVPNInfo() {
        C18521fjv.TaskDescription taskDescription = C18521fjv.Companion;
        AbstractC12784ctX abstractC12784ctX = this.djBIcL;
        AbstractC12784ctX abstractC12784ctX2 = null;
        if (abstractC12784ctX == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX = null;
        }
        java.lang.String strEZpvd = abstractC12784ctX.EZpvd();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.aappFQ);
        AbstractC12784ctX abstractC12784ctX3 = this.djBIcL;
        if (abstractC12784ctX3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC12784ctX2 = abstractC12784ctX3;
        }
        C18521fjv c18521fjvKWHzl = taskDescription.KWHzl(0, (20 & 2) != 0 ? "" : strEZpvd, (20 & 4) != 0 ? "" : null, (20 & 8) != 0 ? "" : strAYXKKw, (20 & 16) != 0 ? "" : null, (20 & 32) == 0 ? abstractC12784ctX2.AuCTel() : "");
        c18521fjvKWHzl.show(getSupportFragmentManager(), eAZ.class.getName());
        c18521fjvKWHzl.KWHzl(new Function1() { // from class: o.eBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(final eAZ eaz, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        eaz.showLoading();
        AbstractC12784ctX abstractC12784ctX = eaz.djBIcL;
        if (abstractC12784ctX == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX = null;
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(abstractC12784ctX.copydefault(str), eaz);
        final Function1 function1 = new Function1() { // from class: o.eBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.AEQbTJ(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eAZ.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.EZpvd(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        eaz.addDisposable(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eAZ.valueOf(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(eAZ eaz, java.lang.Integer num) {
        eaz.dismissLoading();
        eaz.valueOf();
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(eAZ eaz, java.lang.Throwable th) {
        eaz.dismissLoading();
        pUU.copydefault(eaz.getTAG(), "walletRename error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("back_option", "cloud", true));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(int i) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(int i) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("back_option", "seed", true));
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        AbstractC12784ctX abstractC12784ctX = null;
        if (i == 0) {
            C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Backup_Click", (TrackChannel[]) null, new Function1() { // from class: o.eBk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eAZ.KWHzl((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            AbstractC12784ctX abstractC12784ctX2 = this.djBIcL;
            if (abstractC12784ctX2 == null) {
                Intrinsics.gEmmrt("");
                abstractC12784ctX2 = null;
            }
            if (!abstractC12784ctX2.valueOf()) {
                AbstractC12784ctX abstractC12784ctX3 = this.djBIcL;
                if (abstractC12784ctX3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12784ctX3 = null;
                }
                if (!abstractC12784ctX3.AkhnZx()) {
                    eTW.Companion.EZpvd(this.AhwBna, 1, false, new Function1() { // from class: o.eBo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return eAZ.EZpvd(((java.lang.Integer) obj).intValue());
                        }
                    }, new Function1() { // from class: o.eBl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return eAZ.copydefault(((java.lang.Integer) obj).intValue());
                        }
                    }, new Function0() { // from class: o.eBt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return eAZ.OLrzqt();
                        }
                    }).show(getSupportFragmentManager(), eAZ.class.getName());
                    return;
                }
            }
            ActivityC17261ezU.StateListAnimator stateListAnimator = ActivityC17261ezU.Companion;
            java.lang.String str = this.AhwBna;
            AbstractC12784ctX abstractC12784ctX4 = this.djBIcL;
            if (abstractC12784ctX4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC12784ctX = abstractC12784ctX4;
            }
            stateListAnimator.AEQbTJ(this, str, abstractC12784ctX.AuCTel());
            return;
        }
        if (i == 1) {
            C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Backup_Click", (TrackChannel[]) null, new Function1() { // from class: o.eBp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eAZ.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            if (C13912dbY.copydefault.gEmmrt()) {
                ActivityC18750foL.StateListAnimator.startActivity$default(ActivityC18750foL.Companion, this, this.AhwBna, "route_defi_wallet_detail", 0, 8, null);
                return;
            } else {
                ActivityC18691fnF.Activity.startActivity$default(ActivityC18691fnF.Companion, this, this.AhwBna, "route_defi_wallet_detail", 0, 8, null);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        AbstractC12784ctX abstractC12784ctX5 = this.djBIcL;
        if (abstractC12784ctX5 == null) {
            Intrinsics.gEmmrt("");
            abstractC12784ctX5 = null;
        }
        if (abstractC12784ctX5.AEQbTJ()) {
            return;
        }
        ActivityC18321fgG.StateListAnimator stateListAnimator2 = ActivityC18321fgG.Companion;
        AbstractC12784ctX abstractC12784ctX6 = this.djBIcL;
        if (abstractC12784ctX6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC12784ctX = abstractC12784ctX6;
        }
        stateListAnimator2.KWHzl(this, ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl())).DbNXlk(), false);
    }

    public final void AEQbTJ(AbstractC12784ctX abstractC12784ctX) {
        if (abstractC12784ctX.fJNWhG() != WalletType.MPCWallet) {
            return;
        }
        C32866mlf.onEvent$default("Web3MPCEscape_Button_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (abstractC12784ctX.getNewProxyInstance()) {
            ActivityC17448fFs.Companion.KWHzl(this, abstractC12784ctX.EZpvd());
            return;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl());
        C32866mlf.onEvent$default("Web3WalletManagement_MPCEscape_Card_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AYXKKw().KWHzl(this, abstractC12782ctV, "DefiWalletDetailActivity", new Function0() { // from class: o.eBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eAZ.ejfBZ(this.AEQbTJ);
            }
        });
    }

    public static final Unit ejfBZ(eAZ eaz) {
        eaz.valueOf();
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        C14571dnv c14571dnvOLrzqt = C14571dnv.Companion.OLrzqt();
        c14571dnvOLrzqt.AEQbTJ(new Function1() { // from class: o.eBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eAZ.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
        c14571dnvOLrzqt.show(getSupportFragmentManager(), "DefiWalletDetailActivity");
    }

    public static final Unit EZpvd(eAZ eaz, int i) {
        AbstractC12782ctV abstractC12782ctVEZpvd = eaz.AYXKKw().EZpvd();
        if (abstractC12782ctVEZpvd != null) {
            fGT fgtAYXKKw = eaz.AYXKKw();
            MpcWalletDecodeInfo mpcWalletDecodeInfoKWHzl = eaz.AYXKKw().KWHzl();
            Intrinsics.copydefault(mpcWalletDecodeInfoKWHzl);
            fgtAYXKKw.copydefault(eaz, mpcWalletDecodeInfoKWHzl, eaz.AYXKKw().AYXKKw(), eaz.AYXKKw().djBIcL(), i, abstractC12782ctVEZpvd, "DefiWalletDetailActivity");
        }
        return Unit.INSTANCE;
    }

    @Override // o.eHZ.Application
    public void AEQbTJ(@NotNull OneKeyConnectedDevice oneKeyConnectedDevice) {
        Intrinsics.checkNotNullParameter(oneKeyConnectedDevice, "");
        this.AEQbTJ.launch(new ActivityC15412eHj.StateListAnimator(oneKeyConnectedDevice.getDevice().getConnectId(), oneKeyConnectedDevice.getDeviceId(), oneKeyConnectedDevice.getDevice().getDeviceType(), oneKeyConnectedDevice.getLabel(), 1));
    }

    public static final java.lang.Boolean EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            if (!C14090der.OLrzqt.AEQbTJ(abstractC12782ctV) || abstractC12782ctV.getPostValueLengthLimit() != IdentifierType.IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE || abstractC12782ctV.hBpjJd() != IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT) {
                arrayList.add(obj);
            }
        }
        return java.lang.Boolean.valueOf(arrayList.size() >= 100);
    }

    @Override // o.eBC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eBC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eBC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
