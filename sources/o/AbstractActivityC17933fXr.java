package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.transaction.BaseTransactionActivity$handleTransaction$1;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractActivityC17933fXr extends AbstractActivityC33013moT implements InterfaceC57493yjU {
    public boolean AYXKKw = true;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public android.view.View KWHzl;
    public final boolean copydefault;
    public android.view.View djBIcL;
    public final boolean gEmmrt;
    public SignDataArgs<?> valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public static final java.util.HashMap<java.lang.String, SignDataArgs<?>> EZpvd = new java.util.HashMap<>();
    public static final java.util.HashMap<java.lang.String, OKWBaseTransaction<?>> OLrzqt = new java.util.HashMap<>(1);

    /* JADX INFO: renamed from: o.fXr$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public static final boolean KWHzl(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    public abstract void AEQbTJ(@NotNull OKWBaseTransaction<?> oKWBaseTransaction);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.gEmmrt;
    }

    public AbstractActivityC17933fXr() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(fXM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.BaseTransactionActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transaction.BaseTransactionActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.BaseTransactionActivity$special$$inlined$viewModels$default$3
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
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(C20318ged.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.BaseTransactionActivity$special$$inlined$viewModels$default$5
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
        }, new Function0() { // from class: o.fXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC17933fXr.isConnected();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.BaseTransactionActivity$special$$inlined$viewModels$default$6
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

    /* JADX INFO: renamed from: o.fXr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fXr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent EZpvd(@NotNull SignDataArgs<?> signDataArgs) {
            Intrinsics.checkNotNullParameter(signDataArgs, "");
            android.content.Intent intent = new android.content.Intent();
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            AbstractActivityC17933fXr.EZpvd.put(string, signDataArgs);
            intent.putExtra("uniqueKey", string);
            return intent;
        }

        public final android.content.Intent AEQbTJ(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
            Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
            android.content.Intent intent = new android.content.Intent();
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            AbstractActivityC17933fXr.OLrzqt.put(string, oKWBaseTransaction);
            intent.putExtra("uniqueKey", string);
            return intent;
        }
    }

    public final fXM<OKWBaseTransaction<?>> AEQbTJ() {
        return (fXM) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20318ged fetchVPNInfo() {
        return (C20318ged) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory isConnected() {
        return C20318ged.Companion.KWHzl();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        try {
            setContentView(C13754dXa.TaskDescription.OqFWZa);
            final android.view.View viewFindViewById = findViewById(C13754dXa.ActionBar.gFTCsA);
            if (viewFindViewById == null) {
                finish();
                return;
            }
            this.KWHzl = viewFindViewById;
            AEQbTJ().EZpvd().observe(this, new Application(new Function1() { // from class: o.fXC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractActivityC17933fXr.AEQbTJ(this.EZpvd, viewFindViewById, (kotlin.Pair) obj);
                }
            }));
            java.lang.String stringExtra = getIntent().getStringExtra("uniqueKey");
            final SignDataArgs<?> signDataArgs = (SignDataArgs) C56532yIw.AEQbTJ(EZpvd).remove(stringExtra);
            C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
            if (valueOf()) {
                return;
            }
            if (signDataArgs == null) {
                OKWBaseTransaction oKWBaseTransaction = (OKWBaseTransaction) C56532yIw.AEQbTJ(OLrzqt).remove(stringExtra);
                if (oKWBaseTransaction != null) {
                    if (c33537myN == null) {
                        finish();
                        return;
                    } else {
                        findViewById(C13754dXa.ActionBar.DfrfUJ).setVisibility(0);
                        AEQbTJ().copydefault(oKWBaseTransaction);
                        return;
                    }
                }
                return;
            }
            this.valueOf = signDataArgs;
            if (c33537myN == null) {
                finish();
                return;
            }
            C55173xeu c55173xeu = (C55173xeu) findViewById(C13754dXa.ActionBar.RihMUf);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
            c55173xeu.setImage(C52761wXj.TaskDescription.getSerial);
            C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fXx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractActivityC17933fXr.KWHzl(viewFindViewById, this, signDataArgs, obj);
                }
            });
            copydefault(signDataArgs);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    public static final Unit AEQbTJ(AbstractActivityC17933fXr abstractActivityC17933fXr, android.view.View view, kotlin.Pair pair) {
        OKWBaseTransaction<?> oKWBaseTransaction = (OKWBaseTransaction) pair.component1();
        pUU.copydefault(abstractActivityC17933fXr.getTAG(), "transaction = " + oKWBaseTransaction);
        abstractActivityC17933fXr.copydefault(oKWBaseTransaction, view);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(android.view.View view, AbstractActivityC17933fXr abstractActivityC17933fXr, SignDataArgs signDataArgs, java.lang.Object obj) {
        view.setVisibility(8);
        abstractActivityC17933fXr.copydefault(signDataArgs);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fXM.initTransaction$default(o.fXM, com.okinc.business.defi.api.model.tx.signdata.SignDataArgs, boolean, boolean, int, java.lang.Object):void */
    public final void copydefault(@NotNull SignDataArgs<?> signDataArgs) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        showLoadingWithLogo();
        fXM.initTransaction$default(AEQbTJ(), signDataArgs, false, false, 6, null);
    }

    public final void copydefault(OKWBaseTransaction<?> oKWBaseTransaction, android.view.View view) {
        if (oKWBaseTransaction == null) {
            dismissLoadingWithLogo();
            view.setVisibility(0);
        } else {
            gEmmrt();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseTransactionActivity$handleTransaction$1(this, oKWBaseTransaction, view, null), 3, null);
        }
    }

    @Override // o.ActivityC52757wXf, o.InterfaceC33075mpc
    public void showLoadingWithLogo() {
        C55113xdn c55113xdn = (C55113xdn) findViewById(C13754dXa.ActionBar.access100);
        if (c55113xdn != null) {
            c55113xdn.setVisibility(0);
        }
        android.view.View viewFindViewById = findViewById(C13754dXa.ActionBar.INotificationSideChannelStubProxy);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        OLrzqt(true);
        AEQbTJ().copydefault().setValue(java.lang.Boolean.TRUE);
    }

    @Override // o.ActivityC52757wXf, o.InterfaceC33075mpc
    public void dismissLoadingWithLogo() {
        OLrzqt(false);
        AEQbTJ().copydefault().setValue(java.lang.Boolean.FALSE);
        C55113xdn c55113xdn = (C55113xdn) findViewById(C13754dXa.ActionBar.access100);
        if (c55113xdn != null) {
            c55113xdn.setVisibility(8);
        }
        android.view.View viewFindViewById = findViewById(C13754dXa.ActionBar.INotificationSideChannelStubProxy);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // o.InterfaceC57493yjU
    public void OLrzqt() {
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN == null) {
            return;
        }
        c33537myN.setBackImageVisible(8);
    }

    @Override // o.InterfaceC57493yjU
    public void AhwBna() {
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN == null) {
            return;
        }
        c33537myN.setBackImageVisible(0);
    }

    public final void gEmmrt() {
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN == null) {
            return;
        }
        c33537myN.setSubDoVisible(8);
        c33537myN.setSubDoImageVisible(8);
        c33537myN.getDoImage().setImageDrawable(null);
        c33537myN.getDoImage().setOnClickListener(null);
    }

    @Override // o.InterfaceC57493yjU
    public void OLrzqt(@NotNull Function1<? super android.widget.ImageView, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN == null) {
            return;
        }
        if (c33537myN.getDoImage().getVisibility() != 0) {
            c33537myN.setSubDoVisible(0);
            c33537myN.setSubDoImageVisible(0);
        }
        android.widget.ImageView doImage = c33537myN.getDoImage();
        Intrinsics.checkNotNullExpressionValue(doImage, "");
        function1.invoke(doImage);
    }

    @Override // o.InterfaceC57493yjU
    public void djBIcL() {
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN == null) {
            return;
        }
        c33537myN.setSubDoImageVisible(0);
        c33537myN.setSubDoVisible(8);
    }

    @Override // o.InterfaceC57493yjU
    public void DbNXlk() {
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN != null && c33537myN.getDoImage().getVisibility() == 0) {
            c33537myN.setSubDoVisible(0);
        }
    }

    public final void OLrzqt(boolean z) {
        if (this.djBIcL == null) {
            this.djBIcL = new android.view.View(this);
        }
        android.view.View view = this.djBIcL;
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: o.fXy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    return AbstractActivityC17933fXr.KWHzl(view2, motionEvent);
                }
            });
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        android.view.View decorView = getWindow().getDecorView();
        android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
        if (frameLayout != null) {
            if (z) {
                android.view.View view2 = this.djBIcL;
                if ((view2 != null ? view2.getParent() : null) != null) {
                    android.view.View view3 = this.djBIcL;
                    android.view.ViewParent parent = view3 != null ? view3.getParent() : null;
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(this.djBIcL);
                    }
                }
                frameLayout.addView(this.djBIcL, layoutParams);
                return;
            }
            frameLayout.removeView(this.djBIcL);
            this.djBIcL = null;
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        MutableLiveData<java.lang.Boolean> mutableLiveDataCopydefault;
        fXM<OKWBaseTransaction<?>> fxmAEQbTJ = AEQbTJ();
        if (fxmAEQbTJ == null || (mutableLiveDataCopydefault = fxmAEQbTJ.copydefault()) == null || !Intrinsics.EZpvd(mutableLiveDataCopydefault.getValue(), java.lang.Boolean.FALSE)) {
            return;
        }
        super.onBackPressed();
    }

    public final void copydefault(final C10854bwM c10854bwM, final boolean z, final java.util.List<CustomChainMeta> list, final OKWBaseTransaction<?> oKWBaseTransaction) {
        C20081gaE c20081gaEEZpvd = C20081gaE.Companion.EZpvd(c10854bwM.djBIcL(), c10854bwM.RJOkX(), z, list);
        c20081gaEEZpvd.EZpvd(new Function1() { // from class: o.fXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC17933fXr.OLrzqt(this.EZpvd, c10854bwM, z, oKWBaseTransaction, list, (java.lang.String) obj);
            }
        });
        c20081gaEEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.fXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                AbstractActivityC17933fXr.AEQbTJ(oKWBaseTransaction, dialogInterface);
            }
        });
        if (getMActivity().isFinishing() || getMActivity().isDestroyed() || getSupportFragmentManager().isStateSaved()) {
            return;
        }
        try {
            c20081gaEEZpvd.show(getSupportFragmentManager(), "MultipleRpcUrlChooseDialogFragment");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        this.AYXKKw = false;
    }

    public static final Unit OLrzqt(AbstractActivityC17933fXr abstractActivityC17933fXr, C10854bwM c10854bwM, boolean z, OKWBaseTransaction oKWBaseTransaction, java.util.List list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault(abstractActivityC17933fXr.getTAG(), "selectedRpcUrl = " + str + " chainMeta.rpcUrl = " + c10854bwM.RJOkX());
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c10854bwM.RJOkX())) {
            abstractActivityC17933fXr.EZpvd(c10854bwM, z, str, oKWBaseTransaction, list);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(OKWBaseTransaction oKWBaseTransaction, android.content.DialogInterface dialogInterface) {
        oKWBaseTransaction.OJuSTm().setChangedCustomRpc(true);
    }

    public final void EZpvd(final C10854bwM c10854bwM, final boolean z, final java.lang.String str, final OKWBaseTransaction<?> oKWBaseTransaction, final java.util.List<CustomChainMeta> list) {
        if (str.length() > 0) {
            showLoadingWithLogo();
            SignDataArgs<SignData> signDataArgsOJuSTm = oKWBaseTransaction.OJuSTm();
            AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtEZpvd = C8396bBt.AEQbTJ.EZpvd(signDataArgsOJuSTm.copy((16613371 & 1) != 0 ? signDataArgsOJuSTm.walletId : null, (16613371 & 2) != 0 ? signDataArgsOJuSTm.walletAddress : null, (16613371 & 4) != 0 ? signDataArgsOJuSTm.generalChainId : ((CustomChainMeta) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).EZpvd(), (16613371 & 8) != 0 ? signDataArgsOJuSTm.signData : null, (16613371 & 16) != 0 ? signDataArgsOJuSTm.dapp : null, (16613371 & 32) != 0 ? signDataArgsOJuSTm.wcId : null, (16613371 & 64) != 0 ? signDataArgsOJuSTm.wcTopic : null, (16613371 & 128) != 0 ? signDataArgsOJuSTm.mpcSignType : null, (16613371 & 256) != 0 ? signDataArgsOJuSTm.aaMessageSignType : null, (16613371 & 512) != 0 ? signDataArgsOJuSTm.solanaSignType : null, (16613371 & 1024) != 0 ? signDataArgsOJuSTm.txSource : null, (16613371 & 2048) != 0 ? signDataArgsOJuSTm.bizType : null, (16613371 & 4096) != 0 ? signDataArgsOJuSTm.walletTxDataExtra : null, (16613371 & 8192) != 0 ? signDataArgsOJuSTm.txToastCheckBizLine : null, (16613371 & 16384) != 0 ? signDataArgsOJuSTm.txToastCheckPayload : null, (16613371 & 32768) != 0 ? signDataArgsOJuSTm.broadcastDelegate : null, (16613371 & 65536) != 0 ? signDataArgsOJuSTm.inquiryCallback : null, (16613371 & 131072) != 0 ? signDataArgsOJuSTm.isChangedCustomRpc : true, (16613371 & 262144) != 0 ? signDataArgsOJuSTm.needReleaseTransfer : false, (16613371 & 524288) != 0 ? signDataArgsOJuSTm.checkTypeFailList : null, (16613371 & 1048576) != 0 ? signDataArgsOJuSTm.forceCheckKys : false, (16613371 & 2097152) != 0 ? signDataArgsOJuSTm.useDexGasParamsOnEVM : false, (16613371 & 4194304) != 0 ? signDataArgsOJuSTm.useDefaultUI : false, (16613371 & 8388608) != 0 ? signDataArgsOJuSTm.isTeeMode : false), str, false);
            final Function1 function1 = new Function1() { // from class: o.fXw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractActivityC17933fXr.OLrzqt(this.AEQbTJ, oKWBaseTransaction, c10854bwM, z, str, list, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM<? super kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fXD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractActivityC17933fXr.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.fXB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractActivityC17933fXr.OLrzqt(this.copydefault, c10854bwM, z, str, oKWBaseTransaction, list, (java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fXE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractActivityC17933fXr.copydefault(function12, obj);
                }
            }));
            return;
        }
        oKWBaseTransaction.OJuSTm().setChangedCustomRpc(true);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractActivityC17933fXr abstractActivityC17933fXr, OKWBaseTransaction oKWBaseTransaction, C10854bwM c10854bwM, boolean z, java.lang.String str, java.util.List list, kotlin.Pair pair) {
        if (pair.getFirst() != null) {
            fXM<OKWBaseTransaction<?>> fxmAEQbTJ = abstractActivityC17933fXr.AEQbTJ();
            java.lang.Object first = pair.getFirst();
            Intrinsics.copydefault(first);
            fxmAEQbTJ.copydefault((OKWBaseTransaction) first);
            oKWBaseTransaction.fFgQHt();
        } else {
            abstractActivityC17933fXr.AEQbTJ(c10854bwM, z, str, oKWBaseTransaction, list);
            pUU.copydefault(abstractActivityC17933fXr.getTAG(), "error message = " + pair.getSecond());
        }
        abstractActivityC17933fXr.dismissLoadingWithLogo();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractActivityC17933fXr abstractActivityC17933fXr, C10854bwM c10854bwM, boolean z, java.lang.String str, OKWBaseTransaction oKWBaseTransaction, java.util.List list, java.lang.Throwable th) {
        pUU.copydefault(abstractActivityC17933fXr.getTAG(), "error message = " + th.getMessage());
        abstractActivityC17933fXr.dismissLoadingWithLogo();
        abstractActivityC17933fXr.AEQbTJ(c10854bwM, z, str, oKWBaseTransaction, list);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final C10854bwM c10854bwM, final boolean z, final java.lang.String str, final OKWBaseTransaction<?> oKWBaseTransaction, final java.util.List<CustomChainMeta> list) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(getMActivity());
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.multiple));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.StringRes));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.StyleRes), new View.OnClickListener() { // from class: o.fXz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC17933fXr.AEQbTJ(viewOnClickListenerC54939xaY, this, c10854bwM, z, str, oKWBaseTransaction, list, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.StringDef), new View.OnClickListener() { // from class: o.fXA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC17933fXr.EZpvd(viewOnClickListenerC54939xaY, this, c10854bwM, z, list, oKWBaseTransaction, view);
            }
        });
        if (getMActivity().isFinishing() || getMActivity().isDestroyed()) {
            return;
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractActivityC17933fXr abstractActivityC17933fXr, C10854bwM c10854bwM, boolean z, java.lang.String str, OKWBaseTransaction oKWBaseTransaction, java.util.List list, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        abstractActivityC17933fXr.EZpvd(c10854bwM, z, str, oKWBaseTransaction, list);
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractActivityC17933fXr abstractActivityC17933fXr, C10854bwM c10854bwM, boolean z, java.util.List list, OKWBaseTransaction oKWBaseTransaction, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        abstractActivityC17933fXr.copydefault(c10854bwM, z, list, oKWBaseTransaction);
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
