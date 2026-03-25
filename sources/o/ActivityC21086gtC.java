package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalAssetCoinsActivity$initRecyclerView$1$1$5;
import com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalAssetCoinsActivity$onCreate$1;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectCoinBean;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC21086gtC;
import o.Bitmap;
import o.C13754dXa;
import o.C21051gsU;
import o.C21084gtA;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gtC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC21086gtC extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final ActivityResultLauncher<C21084gtA.StateListAnimator> AEQbTJ;
    public final ActivityResultLauncher<android.content.Context> AYXKKw;
    public AbstractC16427eji EZpvd;
    public final C43316rmw KWHzl;
    public boolean copydefault;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: renamed from: o.gtC$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.gtC$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            android.widget.ImageView imageView;
            java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
            AbstractC16427eji abstractC16427eji = ActivityC21086gtC.this.EZpvd;
            if (abstractC16427eji == null) {
                Intrinsics.gEmmrt("");
                abstractC16427eji = null;
            }
            if (abstractC16427eji != null && (imageView = abstractC16427eji.copydefault) != null) {
                imageView.setVisibility(Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "") ^ true ? 0 : 8);
            }
            if (strValueOf.length() == 0) {
                ActivityC21086gtC.this.KWHzl().EZpvd();
            } else {
                ActivityC21086gtC.this.KWHzl().copydefault(C33129mqd.gEmmrt(charSequence));
            }
        }
    }

    public ActivityC21086gtC() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalAssetCoinsActivity$special$$inlined$viewModels$default$1
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
        };
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C21120gtk.class);
        Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalAssetCoinsActivity$special$$inlined$viewModels$default$2
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
        };
        final byte b = 0 == true ? 1 : 0;
        this.djBIcL = new ViewModelLazy(interfaceC56551yJoAEQbTJ, function02, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalAssetCoinsActivity$special$$inlined$viewModels$default$3
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
                Function0 function03 = b;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.KWHzl = new C43316rmw();
        this.copydefault = true;
        InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        this.AYXKKw = interfaceC8106awV != null ? registerForActivityResult(interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.gtK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC21086gtC.OLrzqt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }) : null;
        ActivityResultLauncher<C21084gtA.StateListAnimator> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new C21084gtA(), new ActivityResultCallback() { // from class: o.gtI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC21086gtC.OLrzqt(this.KWHzl, (java.lang.Integer) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    public final C21120gtk KWHzl() {
        return (C21120gtk) this.djBIcL.getValue();
    }

    private final boolean gEmmrt() {
        return getIntent().getBooleanExtra("is_first_time_use", false);
    }

    private final java.lang.String AhwBna() {
        java.lang.String stringExtra = getIntent().getStringExtra("walletId");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final void OLrzqt(ActivityC21086gtC activityC21086gtC, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC21086gtC.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.gtC$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gtC.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ android.content.Intent newInstance$default(StateListAnimator stateListAnimator, android.content.Context context, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return stateListAnimator.copydefault(context, str, z, z2);
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) ActivityC21086gtC.class).putExtra("walletId", str).putExtra("animatorType", z).putExtra("is_first_time_use", z2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    public final boolean copydefault() {
        return getIntent().getBooleanExtra("animatorType", true);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        if (copydefault()) {
            overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.valueOf);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16427eji abstractC16427eji = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WithdrawalAssetCoinsActivity$onCreate$1(null), 3, null);
        if (copydefault()) {
            overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        }
        this.EZpvd = (AbstractC16427eji) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.dmfpNf);
        if (copydefault()) {
            AbstractC16427eji abstractC16427eji2 = this.EZpvd;
            if (abstractC16427eji2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16427eji = abstractC16427eji2;
            }
            abstractC16427eji.AEQbTJ.setBackImage(C32113mPz.TaskDescription.copydefault);
        }
        AYXKKw();
        if (!gEmmrt()) {
            KWHzl().KWHzl(AhwBna());
        }
        valueOf();
        AEQbTJ();
        C21027grx.copydefault.copydefault(false);
    }

    private final void AYXKKw() {
        djBIcL();
        AbstractC16427eji abstractC16427eji = this.EZpvd;
        if (abstractC16427eji == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji = null;
        }
        AppCompatTextView appCompatTextView = abstractC16427eji.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        copydefault(appCompatTextView, new Function0() { // from class: o.gtP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC21086gtC.djBIcL(this.OLrzqt);
            }
        });
    }

    public static final Unit djBIcL(ActivityC21086gtC activityC21086gtC) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) dZP.OLrzqt.AhwBna())) {
            C21027grx c21027grx = C21027grx.copydefault;
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC21086gtC.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c21027grx.OLrzqt(supportFragmentManager);
            C14494dmX.KWHzl.EZpvd("WithdrawExchangeSelectCrypto_Btm_Button_Click", "exchange_account");
        } else {
            C55326xho.toast$default(C13754dXa.FragmentManager.ActivityResultRegistryKtrememberLauncherForActivityResultkey1, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        AbstractC16427eji abstractC16427eji = this.EZpvd;
        AbstractC16427eji abstractC16427eji2 = null;
        if (abstractC16427eji == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji = null;
        }
        OKEditText oKEditText = abstractC16427eji.EZpvd;
        if (oKEditText != null) {
            oKEditText.addTextChangedListener(new Application());
        }
        AbstractC16427eji abstractC16427eji3 = this.EZpvd;
        if (abstractC16427eji3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji3 = null;
        }
        android.widget.ImageView imageView = abstractC16427eji3.copydefault;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.gtU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC21086gtC.copydefault(this.EZpvd, view);
                }
            });
        }
        AbstractC16427eji abstractC16427eji4 = this.EZpvd;
        if (abstractC16427eji4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16427eji2 = abstractC16427eji4;
        }
        OKEditText oKEditText2 = abstractC16427eji2.EZpvd;
        if (oKEditText2 != null) {
            oKEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gtJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    ActivityC21086gtC.KWHzl(view, z);
                }
            });
        }
    }

    public static final void copydefault(ActivityC21086gtC activityC21086gtC, android.view.View view) {
        AbstractC16427eji abstractC16427eji = activityC21086gtC.EZpvd;
        if (abstractC16427eji == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji = null;
        }
        OKEditText oKEditText = abstractC16427eji.EZpvd;
        if (oKEditText != null) {
            oKEditText.setText((java.lang.CharSequence) null);
        }
    }

    public static final void KWHzl(android.view.View view, boolean z) {
        C14494dmX.KWHzl.EZpvd("WithdrawExchangeSelectCrypto_Btm_Button_Click", "search");
    }

    public final void AEQbTJ() {
        java.lang.String strDbNXlk;
        java.lang.String strFJNWhG;
        java.lang.String strValues;
        if (!gEmmrt()) {
            this.KWHzl.setItems(yDY.copydefault(new C14318djG()));
            this.KWHzl.notifyDataSetChanged();
            KWHzl().AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.gtQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC21086gtC.AEQbTJ(this.EZpvd, (Bitmap) obj);
                }
            }));
            return;
        }
        AbstractC16427eji abstractC16427eji = this.EZpvd;
        if (abstractC16427eji == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji = null;
        }
        ConstraintLayout constraintLayout = abstractC16427eji.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl((java.lang.Long) 818L);
        C43316rmw c43316rmw = this.KWHzl;
        if (c10854bwMKWHzl == null || (strDbNXlk = c10854bwMKWHzl.DbNXlk()) == null) {
            strDbNXlk = "https://static.okx.com/cdn/wallet/logo/USDT-991ffed9-e495-4d1b-80c2-a4c5f96ce22d.png";
        }
        java.lang.String str = strDbNXlk;
        if (c10854bwMKWHzl == null || (strFJNWhG = c10854bwMKWHzl.fJNWhG()) == null) {
            strFJNWhG = "USDT";
        }
        java.lang.String str2 = strFJNWhG;
        if (c10854bwMKWHzl == null || (strValues = c10854bwMKWHzl.values()) == null) {
            strValues = "Tether";
        }
        c43316rmw.setItems(C56402yEa.EZpvd(new ExchangeSelectCoinBean(str, str2, strValues, "1000.00", "7240.00", (java.lang.Integer) 7, java.lang.Boolean.TRUE, (java.util.ArrayList) null, (java.lang.String) null, 256, (DefaultConstructorMarker) null)));
        this.KWHzl.notifyDataSetChanged();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(final ActivityC21086gtC activityC21086gtC, Bitmap bitmap) {
        if (!(bitmap instanceof Bitmap.TaskDescription)) {
            if (!(bitmap instanceof Bitmap.StateListAnimator) && !(bitmap instanceof Bitmap.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((java.util.ArrayList) bitmap.OLrzqt()) == null) {
                activityC21086gtC.KWHzl.setItems(new java.util.ArrayList());
            } else {
                AbstractC16427eji abstractC16427eji = activityC21086gtC.EZpvd;
                if (abstractC16427eji == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16427eji = null;
                }
                ConstraintLayout constraintLayout = abstractC16427eji.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(activityC21086gtC.KWHzl().OLrzqt() ? 0 : 8);
                C43316rmw c43316rmw = activityC21086gtC.KWHzl;
                java.lang.Object objOLrzqt = bitmap.OLrzqt();
                Intrinsics.copydefault(objOLrzqt);
                c43316rmw.setItems((java.util.List) objOLrzqt);
            }
            if (bitmap instanceof Bitmap.ActionBar) {
                if (!activityC21086gtC.KWHzl.getItems().isEmpty()) {
                    java.util.List<?> items = activityC21086gtC.KWHzl.getItems();
                    Intrinsics.checkNotNullExpressionValue(items, "");
                    if (CollectionsKt___CollectionsKt.firstOrNull(items) instanceof C14316djE) {
                        activityC21086gtC.KWHzl.setItems(yDY.copydefault(new C14317djF(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk), 0, new Function0() { // from class: o.gtM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return ActivityC21086gtC.AhwBna(this.OLrzqt);
                            }
                        }, 8, null)));
                    }
                }
            }
            activityC21086gtC.KWHzl.notifyDataSetChanged();
            rVN.reportFullyDrawn$default((android.app.Activity) activityC21086gtC, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ActivityC21086gtC activityC21086gtC) {
        activityC21086gtC.KWHzl.setItems(yDY.copydefault(new C14318djG()));
        activityC21086gtC.KWHzl.notifyDataSetChanged();
        activityC21086gtC.KWHzl().KWHzl(activityC21086gtC.AhwBna());
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        AbstractC16427eji abstractC16427eji = this.EZpvd;
        if (abstractC16427eji == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji = null;
        }
        RecyclerView recyclerView = abstractC16427eji.OLrzqt;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C43316rmw c43316rmw = this.KWHzl;
        c43316rmw.register(C14318djG.class, new Activity(C13754dXa.TaskDescription.QYNZmZ));
        c43316rmw.register(ExchangeSelectCoinBean.class, new C21051gsU(KWHzl(), new C21051gsU.StateListAnimator() { // from class: o.gtN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C21051gsU.StateListAnimator
            public final void AEQbTJ(ExchangeSelectCoinBean exchangeSelectCoinBean) {
                ActivityC21086gtC.EZpvd(this.EZpvd, exchangeSelectCoinBean);
            }
        }));
        c43316rmw.register(C14316djE.class).copydefault(new C21116gtg(), new C21110gta()).AEQbTJ(new InterfaceC59531zim() { // from class: o.gtO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return ActivityC21086gtC.KWHzl(i, (C14316djE) obj);
            }
        });
        c43316rmw.register(C14317djF.class, new TaskDescription(WithdrawalAssetCoinsActivity$initRecyclerView$1$1$5.INSTANCE));
        recyclerView.setAdapter(c43316rmw);
    }

    /* JADX INFO: renamed from: o.gtC$Activity */
    public static final class Activity extends C43318rmy<C14318djG, AbstractC17092ewK> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17092ewK> c43312rms, C14318djG c14318djG) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14318djG, "");
        }

        public Activity(int i) {
            super(i, 0);
        }
    }

    public static final void EZpvd(ActivityC21086gtC activityC21086gtC, ExchangeSelectCoinBean exchangeSelectCoinBean) {
        if (exchangeSelectCoinBean != null && Intrinsics.EZpvd(exchangeSelectCoinBean.isSupportWallet(), java.lang.Boolean.TRUE)) {
            activityC21086gtC.AEQbTJ(exchangeSelectCoinBean);
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onContentChanged), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C14494dmX.KWHzl.EZpvd("WithdrawExchangeSelectCrypto_Btm_Button_Click", "select_crypto");
    }

    public static final int KWHzl(int i, C14316djE c14316djE) {
        Intrinsics.checkNotNullParameter(c14316djE, "");
        return c14316djE.AEQbTJ() == 0 ? 0 : 1;
    }

    /* JADX INFO: renamed from: o.gtC$TaskDescription */
    public static final class TaskDescription extends AbstractC19608gIr<C14317djF, C17089ewH> {
        public TaskDescription(WithdrawalAssetCoinsActivity$initRecyclerView$1$1$5 withdrawalAssetCoinsActivity$initRecyclerView$1$1$5) {
            super(withdrawalAssetCoinsActivity$initRecyclerView$1$1$5);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
        @Override // o.AbstractC19608gIr
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C17089ewH c17089ewH, final C14317djF c14317djF) {
            Intrinsics.checkNotNullParameter(c17089ewH, "");
            Intrinsics.checkNotNullParameter(c14317djF, "");
            ViewGroup.LayoutParams layoutParams = c17089ewH.OLrzqt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C55298xhM.dp2px$default(76.0f, null, 1, null);
            c17089ewH.OLrzqt.setLayoutParams(marginLayoutParams);
            C55173xeu c55173xeu = c17089ewH.OLrzqt;
            c55173xeu.setTitle(c14317djF.EZpvd());
            c55173xeu.setSubTitle((java.lang.CharSequence) c14317djF.OLrzqt());
            java.lang.String strCopydefault = c14317djF.copydefault();
            if (strCopydefault == null) {
                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.QbewEr);
            }
            c55173xeu.setRetry(strCopydefault);
            if (c14317djF.KWHzl() != null) {
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.gtT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC21086gtC.TaskDescription.KWHzl(c14317djF, view);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KWHzl(C14317djF c14317djF, android.view.View view) {
            c14317djF.KWHzl().invoke();
        }
    }

    public final void AEQbTJ(ExchangeSelectCoinBean exchangeSelectCoinBean) {
        ActivityResultLauncher<C21084gtA.StateListAnimator> activityResultLauncher = this.AEQbTJ;
        java.lang.Integer currencyId = exchangeSelectCoinBean.getCurrencyId();
        Intrinsics.copydefault(currencyId);
        int iIntValue = currencyId.intValue();
        java.lang.String strAhwBna = AhwBna();
        java.util.Collection networks = exchangeSelectCoinBean.getNetworks();
        if (networks == null) {
            networks = yDY.AhwBna();
        }
        activityResultLauncher.launch(new C21084gtA.StateListAnimator(iIntValue, strAhwBna, new java.util.ArrayList(networks), false, null, 24, null));
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getAction() == 1) {
            C21120gtk c21120gtkKWHzl = KWHzl();
            AbstractC16427eji abstractC16427eji = this.EZpvd;
            AbstractC16427eji abstractC16427eji2 = null;
            if (abstractC16427eji == null) {
                Intrinsics.gEmmrt("");
                abstractC16427eji = null;
            }
            if (c21120gtkKWHzl.KWHzl(abstractC16427eji.AYXKKw, rawX, rawY)) {
                AbstractC16427eji abstractC16427eji3 = this.EZpvd;
                if (abstractC16427eji3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16427eji3 = null;
                }
                abstractC16427eji3.EZpvd.setFocusable(true);
                AbstractC16427eji abstractC16427eji4 = this.EZpvd;
                if (abstractC16427eji4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16427eji4 = null;
                }
                abstractC16427eji4.EZpvd.setFocusableInTouchMode(true);
                AbstractC16427eji abstractC16427eji5 = this.EZpvd;
                if (abstractC16427eji5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16427eji5 = null;
                }
                abstractC16427eji5.EZpvd.setCursorVisible(true);
                AbstractC16427eji abstractC16427eji6 = this.EZpvd;
                if (abstractC16427eji6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16427eji2 = abstractC16427eji6;
                }
                C33570myu.AEQbTJ((android.content.Context) this, (android.widget.EditText) abstractC16427eji2.EZpvd);
            } else {
                AbstractC16427eji abstractC16427eji7 = this.EZpvd;
                if (abstractC16427eji7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16427eji7 = null;
                }
                abstractC16427eji7.EZpvd.setFocusable(false);
                AbstractC16427eji abstractC16427eji8 = this.EZpvd;
                if (abstractC16427eji8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16427eji8 = null;
                }
                abstractC16427eji8.EZpvd.setCursorVisible(false);
                AbstractC16427eji abstractC16427eji9 = this.EZpvd;
                if (abstractC16427eji9 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16427eji9 = null;
                }
                abstractC16427eji9.EZpvd.setFocusableInTouchMode(false);
                AbstractC16427eji abstractC16427eji10 = this.EZpvd;
                if (abstractC16427eji10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16427eji2 = abstractC16427eji10;
                }
                C33570myu.AEQbTJ((android.content.Context) this, (android.view.View) abstractC16427eji2.EZpvd);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.copydefault) {
            super.onBackPressed();
            C14494dmX.KWHzl.EZpvd("WithdrawExchangeSelectCrypto_Btm_Button_Click", "return");
        }
    }

    public static final void OLrzqt(ActivityC21086gtC activityC21086gtC, java.lang.Integer num) {
        if (num != null && num.intValue() == -1) {
            activityC21086gtC.setResult(-1);
            activityC21086gtC.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gtC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setExchangeAccount$default(ActivityC21086gtC activityC21086gtC, android.widget.TextView textView, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        activityC21086gtC.copydefault(textView, (Function0<Unit>) function0);
    }

    public final void copydefault(final android.widget.TextView textView, final Function0<Unit> function0) {
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.PipHintTrackerKttrackPipAnimationHintView2) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.emit, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str))) + "\u200b";
        textView.setText(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.gtL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21086gtC.KWHzl(textView, (java.util.List) obj);
            }
        }, 14, null));
        textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(textView, str2, str, new Function0() { // from class: o.gtH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC21086gtC.OLrzqt(function0);
            }
        }));
    }

    public static final Unit KWHzl(android.widget.TextView textView, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = C52761wXj.ActionBar.DCUTEI;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C55366xib.KWHzl(i, context)));
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function0 function0) {
        if (function0 != null) {
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        AbstractC16427eji abstractC16427eji = this.EZpvd;
        if (abstractC16427eji == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji = null;
        }
        abstractC16427eji.OLrzqt.post(new java.lang.Runnable() { // from class: o.gtS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC21086gtC.AYXKKw(this.copydefault);
            }
        });
    }

    public static final void AYXKKw(final ActivityC21086gtC activityC21086gtC) {
        android.view.View viewFindViewByPosition;
        AbstractC16427eji abstractC16427eji = activityC21086gtC.EZpvd;
        if (abstractC16427eji == null) {
            Intrinsics.gEmmrt("");
            abstractC16427eji = null;
        }
        RecyclerView.LayoutManager layoutManager = abstractC16427eji.OLrzqt.getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(0)) == null) {
            return;
        }
        java.lang.String string = activityC21086gtC.getString(C13754dXa.FragmentManager.newStarRating);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = activityC21086gtC.getString(C13754dXa.FragmentManager.newThumbRating);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        C21022grs.EZpvd(activityC21086gtC, viewFindViewByPosition, string, string2, 1, 3, (1536 & 64) != 0 ? 0 : 4, (1536 & 128) != 0 ? 0 : -C55298xhM.OLrzqt(10, (android.content.Context) activityC21086gtC), (1536 & 256) != 0 ? 0 : -C55298xhM.OLrzqt(10, (android.content.Context) activityC21086gtC), (1536 & 512) != 0 ? 0 : 0, (1536 & 1024) != 0 ? 0 : 0, new Function0() { // from class: o.gtR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ActivityC21086gtC.DbNXlk(this.KWHzl));
            }
        }, new Function0() { // from class: o.gtV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ActivityC21086gtC.isConnected(this.OLrzqt));
            }
        });
        activityC21086gtC.copydefault = false;
    }

    public static final boolean DbNXlk(ActivityC21086gtC activityC21086gtC) {
        ExchangeSelectCoinBean exchangeSelectCoinBean = (ExchangeSelectCoinBean) activityC21086gtC.KWHzl.AEQbTJ(0);
        if (exchangeSelectCoinBean == null) {
            return false;
        }
        ActivityResultLauncher<C21084gtA.StateListAnimator> activityResultLauncher = activityC21086gtC.AEQbTJ;
        java.lang.Integer currencyId = exchangeSelectCoinBean.getCurrencyId();
        Intrinsics.copydefault(currencyId);
        activityResultLauncher.launch(new C21084gtA.StateListAnimator(currencyId.intValue(), activityC21086gtC.AhwBna(), new java.util.ArrayList(), activityC21086gtC.gEmmrt(), null, 16, null));
        return true;
    }

    public static final boolean isConnected(ActivityC21086gtC activityC21086gtC) {
        if (dZP.OLrzqt.valueOf()) {
            activityC21086gtC.EZpvd();
            return true;
        }
        ActivityResultLauncher<android.content.Context> activityResultLauncher = activityC21086gtC.AYXKKw;
        if (activityResultLauncher == null) {
            return true;
        }
        activityResultLauncher.launch(activityC21086gtC);
        return true;
    }

    public final void EZpvd() {
        startActivity(Companion.copydefault(this, AhwBna(), copydefault(), false));
        setResult(-1);
        finish();
        overridePendingTransition(copydefault() ? com.google.android.material.R.anim.design_bottom_sheet_slide_in : C52761wXj.Application.isConnected, copydefault() ? com.google.android.material.R.anim.design_bottom_sheet_slide_out : C52761wXj.Application.AuCTel);
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.copydefault);
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
