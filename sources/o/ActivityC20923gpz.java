package o;

import android.os.Build;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$launcher$1$1;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$1;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$10;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$2;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$3;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$4;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$5;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$6;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$7;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$8;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$observeData$9;
import com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.MultiTransferInputAddressViewModel;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ReceiveAddressSavedInstanceData;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC20904gpg;
import o.C13754dXa;
import o.C52761wXj;
import o.C57227yeT;
import o.C57233yeZ;
import o.C9694baS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20923gpz extends AbstractActivityC33013moT implements InterfaceC20523giW {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public ReceiveAddressSavedInstanceData AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final ActivityResultLauncher<Unit> EZpvd;
    public final boolean KWHzl;
    public AbstractC16400ejH OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.KWHzl;
    }

    public ActivityC20923gpz() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(MultiTransferInputAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.gpJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC20923gpz.EZpvd();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.batch.multiReceiveAddress.DefiWalletMultiTransferInputAddressActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ScannerActivity.Activity.getResultContract$default(ScannerActivity.Companion, new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), false, null, true, false, null, false, null, 3941, null), yDY.AhwBna(), null, 4, null), new ActivityResultCallback() { // from class: o.gpH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC20923gpz.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }

    public static final ViewModelProvider.Factory EZpvd() {
        return MultiTransferInputAddressViewModel.Companion.EZpvd();
    }

    public final MultiTransferInputAddressViewModel AEQbTJ() {
        return (MultiTransferInputAddressViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.gpz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gpz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, @NotNull MultiTransferSignData multiTransferSignData, ReceiveAddressSavedInstanceData receiveAddressSavedInstanceData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(multiTransferSignData, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC20923gpz.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("wallet_id", str);
            bundle.putString("chain_id", str2);
            bundle.putParcelable("multi_transfer_sign_data", multiTransferSignData);
            bundle.putParcelable("saved_instance_data", receiveAddressSavedInstanceData);
            intent.putExtras(bundle);
            return intent;
        }
    }

    public static final void AEQbTJ(ActivityC20923gpz activityC20923gpz, java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC20923gpz), null, null, new DefiWalletMultiTransferInputAddressActivity$launcher$1$1(str, activityC20923gpz, null), 3, null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        final AbstractC16400ejH abstractC16400ejH = (AbstractC16400ejH) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.UlJrfe);
        if (abstractC16400ejH == null) {
            finish();
            return;
        }
        this.OLrzqt = abstractC16400ejH;
        AYXKKw();
        AEQbTJ().EZpvd(this, new Function1() { // from class: o.gpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20923gpz.EZpvd(this.EZpvd, abstractC16400ejH, (ExchangeAddressData) obj);
            }
        });
        OLrzqt();
        copydefault(abstractC16400ejH);
        EZpvd(abstractC16400ejH);
    }

    public static final Unit EZpvd(final ActivityC20923gpz activityC20923gpz, AbstractC16400ejH abstractC16400ejH, ExchangeAddressData exchangeAddressData) {
        activityC20923gpz.dismissLoading();
        abstractC16400ejH.AEQbTJ.setVisibility(0);
        activityC20923gpz.getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gpC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20923gpz.djBIcL(this.OLrzqt);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void djBIcL(ActivityC20923gpz activityC20923gpz) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20923gpz, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AYXKKw() {
        MultiTransferSignData multiTransferSignData;
        MultiTransferInputAddressViewModel multiTransferInputAddressViewModelAEQbTJ = AEQbTJ();
        int i = Build.VERSION.SDK_INT;
        ReceiveAddressSavedInstanceData receiveAddressSavedInstanceData = null;
        if (i >= 33) {
            android.os.Bundle extras = getIntent().getExtras();
            multiTransferSignData = extras != null ? (MultiTransferSignData) extras.getParcelable("multi_transfer_sign_data", MultiTransferSignData.class) : null;
        } else {
            android.os.Bundle extras2 = getIntent().getExtras();
            if (extras2 != null) {
                multiTransferSignData = (MultiTransferSignData) extras2.getParcelable("multi_transfer_sign_data");
            }
        }
        multiTransferInputAddressViewModelAEQbTJ.AEQbTJ(multiTransferSignData);
        if (i >= 33) {
            android.os.Bundle extras3 = getIntent().getExtras();
            if (extras3 != null) {
                receiveAddressSavedInstanceData = (ReceiveAddressSavedInstanceData) extras3.getParcelable("saved_instance_data", ReceiveAddressSavedInstanceData.class);
            }
        } else {
            android.os.Bundle extras4 = getIntent().getExtras();
            if (extras4 != null) {
                receiveAddressSavedInstanceData = (ReceiveAddressSavedInstanceData) extras4.getParcelable("saved_instance_data");
            }
        }
        this.AEQbTJ = receiveAddressSavedInstanceData;
        AEQbTJ().KWHzl(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.gpz$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC16400ejH OLrzqt;
        public final /* synthetic */ ActivityC20923gpz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC20923gpz activityC20923gpz, AbstractC16400ejH abstractC16400ejH) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = activityC20923gpz;
            this.OLrzqt = abstractC16400ejH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                try {
                    android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) ContextCompat.getSystemService(this.copydefault, android.content.ClipboardManager.class);
                    if (clipboardManager == null) {
                        return;
                    }
                    android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() > 0) {
                        java.lang.CharSequence text = primaryClip.getItemAt(0).getText();
                        Intrinsics.checkNotNullExpressionValue(text, "");
                        java.lang.CharSequence charSequenceHDKMBd = StringsKt__StringsKt.hDKMBd(text);
                        if (charSequenceHDKMBd != null && charSequenceHDKMBd.length() != 0) {
                            MultiTransferInputAddressViewModel multiTransferInputAddressViewModelAEQbTJ = this.copydefault.AEQbTJ();
                            if (multiTransferInputAddressViewModelAEQbTJ != null) {
                                multiTransferInputAddressViewModelAEQbTJ.EZpvd(charSequenceHDKMBd);
                            }
                            C33570myu.AEQbTJ(this.copydefault, this.OLrzqt.AkhnZx);
                            android.view.View currentFocus = this.copydefault.getCurrentFocus();
                            if (currentFocus != null) {
                                currentFocus.clearFocus();
                            }
                            C14681dpz.OLrzqt.AEQbTJ();
                            return;
                        }
                        C55328xhq.show$default(C55328xhq.OLrzqt, this.copydefault.getString(C13754dXa.FragmentManager.ComponentDialogExternalSyntheticApiModelOutline0), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                        return;
                    }
                    C55328xhq.show$default(C55328xhq.OLrzqt, this.copydefault.getString(C13754dXa.FragmentManager.ComponentDialogExternalSyntheticApiModelOutline0), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                } catch (java.lang.Exception e) {
                    java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("view", Web3SecurityTrackEvent.VALUE_PASTE));
                    C6777aVl.Companion.OLrzqt(e, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "dealInputLogic");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gpz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC20923gpz KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC20923gpz activityC20923gpz) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = activityC20923gpz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                try {
                    C33570myu.copydefault((android.app.Activity) this.KWHzl);
                    MultiTransferInputAddressViewModel multiTransferInputAddressViewModelAEQbTJ = this.KWHzl.AEQbTJ();
                    if (multiTransferInputAddressViewModelAEQbTJ != null) {
                        multiTransferInputAddressViewModelAEQbTJ.getFieldNames();
                    }
                } catch (java.lang.Exception e) {
                    java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("view", "primaryButton"));
                    C6777aVl.Companion.OLrzqt(e, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "dealInputLogic");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gpz$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC20923gpz EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC20923gpz activityC20923gpz) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC20923gpz;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String string;
            java.lang.String string2;
            java.util.ArrayList<java.lang.String> arrayList;
            android.os.Bundle extras;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC20904gpg.StateListAnimator stateListAnimator = ActivityC20904gpg.Companion;
                ActivityC20923gpz activityC20923gpz = this.EZpvd;
                MultiTransferSignData multiTransferSignDataFetchVPNInfo = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                int transferType = multiTransferSignDataFetchVPNInfo != null ? multiTransferSignDataFetchVPNInfo.getTransferType() : 1;
                MultiTransferSignData multiTransferSignDataFetchVPNInfo2 = this.EZpvd.AEQbTJ().fetchVPNInfo();
                if (multiTransferSignDataFetchVPNInfo2 == null || (string = java.lang.Long.valueOf(multiTransferSignDataFetchVPNInfo2.getCoinId()).toString()) == null) {
                    string = MultiTransferSignData.DEFAULT_INTERVAL;
                }
                java.lang.String str = string;
                android.content.Intent intent = this.EZpvd.getIntent();
                if (intent == null || (extras = intent.getExtras()) == null || (string2 = extras.getString("wallet_id")) == null) {
                    string2 = "";
                }
                java.lang.String str2 = string2;
                java.lang.String strGEmmrt = this.EZpvd.gEmmrt();
                MultiTransferSignData multiTransferSignDataFetchVPNInfo3 = this.EZpvd.AEQbTJ().fetchVPNInfo();
                if (multiTransferSignDataFetchVPNInfo3 == null || (arrayList = multiTransferSignDataFetchVPNInfo3.getFromAddress()) == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                android.content.Intent intentEZpvd = stateListAnimator.EZpvd(activityC20923gpz, transferType, str, str2, strGEmmrt, arrayList, this.EZpvd.AEQbTJ().djBIcL().size(), this.EZpvd.AEQbTJ().EZpvd());
                C9694baS.Application application = C9694baS.Companion;
                ActivityC20923gpz activityC20923gpz2 = this.EZpvd;
                application.EZpvd(activityC20923gpz2, intentEZpvd, activityC20923gpz2.new FragmentManager());
            }
        }
    }

    /* JADX INFO: renamed from: o.gpz$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC20923gpz OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC20923gpz activityC20923gpz) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC20923gpz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.launch(Unit.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: o.gpz$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC20923gpz OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC20923gpz activityC20923gpz) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = activityC20923gpz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                try {
                    MultiTransferInputAddressViewModel multiTransferInputAddressViewModelAEQbTJ = this.OLrzqt.AEQbTJ();
                    if (multiTransferInputAddressViewModelAEQbTJ != null) {
                        multiTransferInputAddressViewModelAEQbTJ.hDKMBd();
                    }
                } catch (java.lang.Exception e) {
                    java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("view", Web3SecurityTrackEvent.VALUE_CLEAR));
                    C6777aVl.Companion.OLrzqt(e, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "dealInputLogic");
                }
            }
        }
    }

    public final void copydefault(AbstractC16400ejH abstractC16400ejH) {
        try {
            ViewCompat.setOnApplyWindowInsetsListener(abstractC16400ejH.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.gpG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                    return ActivityC20923gpz.EZpvd(this.EZpvd, view, windowInsetsCompat);
                }
            });
            abstractC16400ejH.AkhnZx.setOnSingleAddressTextChangedListener(new StateListAnimator(AEQbTJ()));
            abstractC16400ejH.AkhnZx.setOnWordTextChangedListener(new Dialog(AEQbTJ()));
            abstractC16400ejH.AkhnZx.setOnWordFocusGainedListener(new Fragment(AEQbTJ()));
            abstractC16400ejH.AkhnZx.setOnWordBackspaceDownListener(new C57233yeZ.StateListAnimator() { // from class: o.gpx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C57233yeZ.StateListAnimator
                public final boolean copydefault(int i, java.lang.CharSequence charSequence) {
                    return ActivityC20923gpz.AEQbTJ(this.AEQbTJ, i, charSequence);
                }
            });
            abstractC16400ejH.AkhnZx.setOnWordEditorActionListener(new C57233yeZ.ActionBar() { // from class: o.gpv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C57233yeZ.ActionBar
                public final boolean copydefault(int i, int i2, android.view.KeyEvent keyEvent, java.lang.String str) {
                    return ActivityC20923gpz.OLrzqt(this.OLrzqt, i, i2, keyEvent, str);
                }
            });
            C52794wYp c52794wYp = abstractC16400ejH.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            C19604gIn.KWHzl(c52794wYp, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.hNurIN, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
            C52794wYp c52794wYp2 = abstractC16400ejH.EZpvd;
            if (c52794wYp2 != null) {
                c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
            }
            C52794wYp c52794wYp3 = abstractC16400ejH.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
            C19604gIn.KWHzl(c52794wYp3, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.ZxnNGp, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
            C52794wYp c52794wYp4 = abstractC16400ejH.fJNWhG;
            if (c52794wYp4 != null) {
                c52794wYp4.setOnClickListener(new ActionBar(c52794wYp4, 1000L, this, abstractC16400ejH));
            }
            C52794wYp c52794wYpCopydefault = abstractC16400ejH.copydefault.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
            }
        } catch (java.lang.Exception e) {
            java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("view", "dealInputLogic"));
            C6777aVl.Companion.OLrzqt(e, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "dealInputLogic");
        }
    }

    public static final WindowInsetsCompat EZpvd(ActivityC20923gpz activityC20923gpz, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), insets.bottom);
        activityC20923gpz.AEQbTJ().copydefault(windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime()));
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: o.gpz$StateListAnimator */
    public final /* synthetic */ class StateListAnimator implements InterfaceC57229yeV, InterfaceC56514yIe {
        public final /* synthetic */ MultiTransferInputAddressViewModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel) {
            this.OLrzqt = multiTransferInputAddressViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC57229yeV) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.OLrzqt, MultiTransferInputAddressViewModel.class, "onSingleAddressChanged", "onSingleAddressChanged(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC57229yeV
        public final void AEQbTJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            this.OLrzqt.AEQbTJ(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: o.gpz$Dialog */
    public final /* synthetic */ class Dialog implements C57233yeZ.Application, InterfaceC56514yIe {
        public final /* synthetic */ MultiTransferInputAddressViewModel AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel) {
            this.AEQbTJ = multiTransferInputAddressViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof C57233yeZ.Application) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(3, this.AEQbTJ, MultiTransferInputAddressViewModel.class, "onMultiAddressChanged", "onMultiAddressChanged(ILjava/lang/CharSequence;Ljava/lang/CharSequence;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.C57233yeZ.Application
        public final void copydefault(int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            this.AEQbTJ.EZpvd(i, charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: o.gpz$Fragment */
    public final /* synthetic */ class Fragment implements C57233yeZ.Activity, InterfaceC56514yIe {
        public final /* synthetic */ MultiTransferInputAddressViewModel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(MultiTransferInputAddressViewModel multiTransferInputAddressViewModel) {
            this.EZpvd = multiTransferInputAddressViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof C57233yeZ.Activity) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.EZpvd, MultiTransferInputAddressViewModel.class, "onMultiAddressFocusGained", "onMultiAddressFocusGained(I)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.C57233yeZ.Activity
        public final void EZpvd(int i) {
            this.EZpvd.KWHzl(i);
        }
    }

    public static final boolean AEQbTJ(ActivityC20923gpz activityC20923gpz, int i, java.lang.CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        activityC20923gpz.AEQbTJ().copydefault(C56402yEa.EZpvd(java.lang.Integer.valueOf(i)), false);
        return true;
    }

    public static final boolean OLrzqt(ActivityC20923gpz activityC20923gpz, int i, int i2, android.view.KeyEvent keyEvent, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i2 != 5) {
            return false;
        }
        if (str.length() > 0) {
            activityC20923gpz.AEQbTJ().AEQbTJ(i);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String gEmmrt() {
        android.os.Bundle extras;
        android.content.Intent intent = getIntent();
        C10854bwM c10854bwMAEQbTJ = C11627cVg.KWHzl.AEQbTJ(C33129mqd.valueOf((intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("coinId")), true);
        return C33129mqd.gEmmrt(c10854bwMAEQbTJ != null ? java.lang.Long.valueOf(c10854bwMAEQbTJ.fetchVPNInfo()) : null);
    }

    public final void EZpvd(AbstractC16400ejH abstractC16400ejH) {
        StateFlow<ErrorMessage> stateFlowOLrzqt = AEQbTJ().OLrzqt();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowOLrzqt, lifecycle, null, 2, null), new DefiWalletMultiTransferInputAddressActivity$observeData$1(abstractC16400ejH, this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<kotlin.Pair<java.lang.Integer, java.lang.Boolean>> stateFlowIsConnected = AEQbTJ().isConnected();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowIsConnected, lifecycle2, null, 2, null), new DefiWalletMultiTransferInputAddressActivity$observeData$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<java.lang.Integer> stateFlowAEQbTJ = AEQbTJ().AEQbTJ();
        Lifecycle lifecycle3 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle3, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowAEQbTJ, lifecycle3, null, 2, null), new DefiWalletMultiTransferInputAddressActivity$observeData$3(this, abstractC16400ejH, null)), LifecycleOwnerKt.getLifecycleScope(this));
        Flow<MultiTransferInputAddressViewModel.ActionBar> flowValues = AEQbTJ().values();
        Lifecycle lifecycle4 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle4, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(flowValues, lifecycle4, null, 2, null), new DefiWalletMultiTransferInputAddressActivity$observeData$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMultiTransferInputAddressActivity$observeData$5(this, abstractC16400ejH, null), 3, null);
        StateFlow<java.lang.Boolean> stateFlowEjfBZ = AEQbTJ().ejfBZ();
        Lifecycle lifecycle5 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle5, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowEjfBZ, lifecycle5, null, 2, null), new DefiWalletMultiTransferInputAddressActivity$observeData$6(abstractC16400ejH, null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<java.lang.Boolean> stateFlowFARcdN = AEQbTJ().fARcdN();
        Lifecycle lifecycle6 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle6, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowFARcdN, lifecycle6, null, 2, null), new DefiWalletMultiTransferInputAddressActivity$observeData$7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        StateFlow<java.lang.Boolean> stateFlowAuCTel = AEQbTJ().AuCTel();
        Lifecycle lifecycle7 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle7, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowAuCTel, lifecycle7, null, 2, null), new DefiWalletMultiTransferInputAddressActivity$observeData$8(abstractC16400ejH, null)), LifecycleOwnerKt.getLifecycleScope(this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMultiTransferInputAddressActivity$observeData$9(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletMultiTransferInputAddressActivity$observeData$10(this, null), 3, null);
    }

    public final void KWHzl(boolean z) {
        AbstractC16400ejH abstractC16400ejH = this.OLrzqt;
        if (abstractC16400ejH == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH = null;
        }
        abstractC16400ejH.OLrzqt.setExpanded(z);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        copydefault();
        super.onBackPressed();
    }

    public final void copydefault() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("data", AEQbTJ().fetchVPNInfo());
        intent.putExtra("saved_instance_data", AEQbTJ().fJNWhG());
        Unit unit = Unit.INSTANCE;
        setResult(0, intent);
    }

    public final void EZpvd(java.util.List<java.lang.String> list) {
        C9694baS.Companion.EZpvd(this, ActivityC20383gfp.Companion.AEQbTJ(this, copydefault(list)), new Function2() { // from class: o.gpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC20923gpz.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(ActivityC20923gpz activityC20923gpz, int i, android.content.Intent intent) {
        android.os.Bundle extras;
        MultiTransferSignData multiTransferSignData;
        java.lang.Integer numValueOf;
        android.os.Bundle extras2;
        if (i == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                multiTransferSignData = (intent == null || (extras2 = intent.getExtras()) == null) ? null : (MultiTransferSignData) extras2.getParcelable("data", MultiTransferSignData.class);
                if (multiTransferSignData != null) {
                    MultiTransferSignData multiTransferSignDataFetchVPNInfo = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                    if (multiTransferSignDataFetchVPNInfo == null || multiTransferSignDataFetchVPNInfo.getTransferType() != 2) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int i2 = 0;
                        for (java.lang.Object obj : activityC20923gpz.AEQbTJ().AkhnZx()) {
                            if (i2 < 0) {
                                yDY.AYXKKw();
                            }
                            java.util.ArrayList<TransferAddressData> toAddress = multiTransferSignData.getToAddress();
                            if (toAddress != null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                for (java.lang.Object obj2 : toAddress) {
                                    if (((TransferAddressData) obj2).getIndex() == i2) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                numValueOf = java.lang.Integer.valueOf(arrayList2.size());
                            } else {
                                numValueOf = null;
                            }
                            if (C33129mqd.valueOf(numValueOf, 0)) {
                                arrayList.add(java.lang.Integer.valueOf(i2));
                            }
                            i2++;
                        }
                        Collections.sort(arrayList, java.util.Comparator.reverseOrder());
                        if (!arrayList.isEmpty()) {
                            activityC20923gpz.AEQbTJ().copydefault((java.util.List<java.lang.Integer>) arrayList, true);
                        }
                    }
                    MultiTransferSignData multiTransferSignDataFetchVPNInfo2 = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                    if (multiTransferSignDataFetchVPNInfo2 == null || multiTransferSignDataFetchVPNInfo2.getTransferType() != 1) {
                        java.util.ArrayList<java.lang.String> fromAddress = multiTransferSignData.getFromAddress();
                        if (fromAddress == null) {
                            fromAddress = new java.util.ArrayList<>();
                        }
                        java.util.ArrayList<java.lang.String> walletId = multiTransferSignData.getWalletId();
                        if (walletId == null) {
                            walletId = new java.util.ArrayList<>();
                        }
                        if (C33129mqd.KWHzl((java.util.Collection) fromAddress) && C33129mqd.KWHzl((java.util.Collection) walletId)) {
                            MultiTransferSignData multiTransferSignDataFetchVPNInfo3 = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                            if (multiTransferSignDataFetchVPNInfo3 != null) {
                                multiTransferSignDataFetchVPNInfo3.setFromAddress(fromAddress);
                            }
                            MultiTransferSignData multiTransferSignDataFetchVPNInfo4 = activityC20923gpz.AEQbTJ().fetchVPNInfo();
                            if (multiTransferSignDataFetchVPNInfo4 != null) {
                                multiTransferSignDataFetchVPNInfo4.setWalletId(walletId);
                            }
                        }
                    }
                }
            } else {
                if (intent != null && (extras = intent.getExtras()) != null) {
                    multiTransferSignData = (MultiTransferSignData) extras.getParcelable("data");
                }
                if (multiTransferSignData != null) {
                }
            }
        }
        if (i == -1) {
            activityC20923gpz.setResult(i, intent);
            activityC20923gpz.finish();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.List<C57227yeT.TaskDescription> list) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (((C57227yeT.TaskDescription) obj).AhwBna()) {
                arrayList.add(java.lang.Integer.valueOf(i));
            }
            i++;
        }
        AbstractC16400ejH abstractC16400ejH = null;
        if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 0)) {
            AbstractC16400ejH abstractC16400ejH2 = this.OLrzqt;
            if (abstractC16400ejH2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16400ejH = abstractC16400ejH2;
            }
            abstractC16400ejH.values.setVisibility(8);
            return;
        }
        AbstractC16400ejH abstractC16400ejH3 = this.OLrzqt;
        if (abstractC16400ejH3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16400ejH = abstractC16400ejH3;
        }
        OKAlertBanner oKAlertBanner = abstractC16400ejH.values;
        oKAlertBanner.setVisibility(0);
        oKAlertBanner.setFunctionIconVisibility(false);
        oKAlertBanner.setPrimaryAction(C33070mpX.AYXKKw(C13754dXa.FragmentManager.LocalOnBackPressedDispatcherOwner), new Function0() { // from class: o.gpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC20923gpz.KWHzl(this.AEQbTJ, arrayList);
            }
        });
        android.content.Context context = oKAlertBanner.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        oKAlertBanner.setMessage(pTD.EZpvd(context, C13754dXa.Dialog.DbNXlk, arrayList.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(arrayList.size()))))));
        Intrinsics.copydefault(oKAlertBanner);
    }

    public static final Unit KWHzl(ActivityC20923gpz activityC20923gpz, java.util.ArrayList arrayList) {
        activityC20923gpz.AEQbTJ().AEQbTJ((java.util.ArrayList<java.lang.Integer>) arrayList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MultiTransferSignData copydefault(java.util.List<java.lang.String> list) {
        java.lang.Object next;
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList<java.lang.String> fromAddress;
        java.lang.Object next2;
        java.util.ArrayList<java.lang.String> walletId;
        java.lang.Object next3;
        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        MultiTransferSignData multiTransferSignDataFetchVPNInfo = AEQbTJ().fetchVPNInfo();
        java.lang.Integer numValueOf = multiTransferSignDataFetchVPNInfo != null ? java.lang.Integer.valueOf(multiTransferSignDataFetchVPNInfo.getTransferType()) : null;
        int i = 0;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            arrayList5 = new java.util.ArrayList();
            java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str3 = (java.lang.String) obj;
                arrayList6.add(java.lang.Boolean.valueOf(arrayList5.add(new TransferAddressData(i2, str3, AEQbTJ().EZpvd(str3), null, null, 24, null))));
                i2++;
            }
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList5.size()), 1)) {
                int size = arrayList5.size();
                while (i < size) {
                    MultiTransferSignData multiTransferSignDataFetchVPNInfo2 = AEQbTJ().fetchVPNInfo();
                    if (multiTransferSignDataFetchVPNInfo2 == null || (walletId = multiTransferSignDataFetchVPNInfo2.getWalletId()) == null) {
                        str = "";
                    } else {
                        java.util.Iterator<T> it = walletId.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it.next();
                            if (((java.lang.String) next3).length() > 0) {
                                break;
                            }
                        }
                        str = (java.lang.String) next3;
                        if (str == null) {
                        }
                    }
                    arrayList3.add(str);
                    MultiTransferSignData multiTransferSignDataFetchVPNInfo3 = AEQbTJ().fetchVPNInfo();
                    if (multiTransferSignDataFetchVPNInfo3 == null || (fromAddress = multiTransferSignDataFetchVPNInfo3.getFromAddress()) == null) {
                        str2 = "";
                    } else {
                        java.util.Iterator<T> it2 = fromAddress.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            if (((java.lang.String) next2).length() > 0) {
                                break;
                            }
                        }
                        str2 = (java.lang.String) next2;
                        if (str2 == null) {
                        }
                    }
                    arrayList4.add(str2);
                    i++;
                }
            } else {
                MultiTransferSignData multiTransferSignDataFetchVPNInfo4 = AEQbTJ().fetchVPNInfo();
                if (multiTransferSignDataFetchVPNInfo4 == null || (arrayList = multiTransferSignDataFetchVPNInfo4.getWalletId()) == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                arrayList3 = arrayList;
                MultiTransferSignData multiTransferSignDataFetchVPNInfo5 = AEQbTJ().fetchVPNInfo();
                if (multiTransferSignDataFetchVPNInfo5 == null || (arrayList2 = multiTransferSignDataFetchVPNInfo5.getFromAddress()) == null) {
                    arrayList2 = new java.util.ArrayList<>();
                }
                arrayList4 = arrayList2;
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            MultiTransferSignData multiTransferSignDataFetchVPNInfo6 = AEQbTJ().fetchVPNInfo();
            if (multiTransferSignDataFetchVPNInfo6 == null || (arrayList3 = multiTransferSignDataFetchVPNInfo6.getWalletId()) == null) {
                arrayList3 = new java.util.ArrayList<>();
            }
            MultiTransferSignData multiTransferSignDataFetchVPNInfo7 = AEQbTJ().fetchVPNInfo();
            if (multiTransferSignDataFetchVPNInfo7 == null || (arrayList4 = multiTransferSignDataFetchVPNInfo7.getFromAddress()) == null) {
                arrayList4 = new java.util.ArrayList<>();
            }
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList4.size()), 1)) {
                int size2 = arrayList4.size();
                while (i < size2) {
                    java.util.Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (((java.lang.String) next).length() > 0) {
                            break;
                        }
                    }
                    java.lang.String str4 = (java.lang.String) next;
                    java.lang.String str5 = str4 == null ? "" : str4;
                    arrayList5.add(new TransferAddressData(0, str5, AEQbTJ().EZpvd(str5), null, null, 24, null));
                    i++;
                }
            } else {
                arrayList5 = new java.util.ArrayList();
                java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it4 = list.iterator();
                while (true) {
                    int i3 = i;
                    if (!it4.hasNext()) {
                        break;
                    }
                    java.lang.Object next4 = it4.next();
                    i = i3 + 1;
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str6 = (java.lang.String) next4;
                    arrayList7.add(java.lang.Boolean.valueOf(arrayList5.add(new TransferAddressData(i3, str6, AEQbTJ().EZpvd(str6), null, null, 24, null))));
                }
            }
        } else {
            MultiTransferSignData multiTransferSignDataFetchVPNInfo8 = AEQbTJ().fetchVPNInfo();
            if (multiTransferSignDataFetchVPNInfo8 == null || (arrayList3 = multiTransferSignDataFetchVPNInfo8.getWalletId()) == null) {
                arrayList3 = new java.util.ArrayList<>();
            }
            MultiTransferSignData multiTransferSignDataFetchVPNInfo9 = AEQbTJ().fetchVPNInfo();
            if (multiTransferSignDataFetchVPNInfo9 == null || (arrayList4 = multiTransferSignDataFetchVPNInfo9.getFromAddress()) == null) {
                arrayList4 = new java.util.ArrayList<>();
            }
            arrayList5 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it5 = list.iterator();
            while (true) {
                int i4 = i;
                if (!it5.hasNext()) {
                    break;
                }
                java.lang.Object next5 = it5.next();
                i = i4 + 1;
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str7 = (java.lang.String) next5;
                arrayList8.add(java.lang.Boolean.valueOf(arrayList5.add(new TransferAddressData(i4, str7, AEQbTJ().EZpvd(str7), null, null, 24, null))));
            }
        }
        java.util.ArrayList<java.lang.String> arrayList9 = arrayList3;
        java.util.ArrayList<java.lang.String> arrayList10 = arrayList4;
        java.util.ArrayList arrayList11 = arrayList5;
        MultiTransferSignData multiTransferSignDataFetchVPNInfo10 = AEQbTJ().fetchVPNInfo();
        long coinId = multiTransferSignDataFetchVPNInfo10 != null ? multiTransferSignDataFetchVPNInfo10.getCoinId() : -1L;
        MultiTransferSignData multiTransferSignDataFetchVPNInfo11 = AEQbTJ().fetchVPNInfo();
        return new MultiTransferSignData(coinId, multiTransferSignDataFetchVPNInfo11 != null ? multiTransferSignDataFetchVPNInfo11.getTransferType() : MultiTransferMode.MODE_NONE.getValue(), arrayList9, arrayList10, arrayList11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        if (AEQbTJ().DbNXlk()) {
            AbstractC16400ejH abstractC16400ejH = this.OLrzqt;
            if (abstractC16400ejH == null) {
                Intrinsics.gEmmrt("");
                abstractC16400ejH = null;
            }
            abstractC16400ejH.fIwbmz.fullScroll(130);
            android.view.View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
            AEQbTJ().KWHzl(false);
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        int color = ContextCompat.getColor(this, C52761wXj.Activity.registerUser);
        boolean z = !C33492mxV.OLrzqt();
        C33567myr.AEQbTJ(this, z);
        getWindow().setNavigationBarColor(color);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
    }

    public final void OLrzqt() {
        AbstractC16400ejH abstractC16400ejH = this.OLrzqt;
        AbstractC16400ejH abstractC16400ejH2 = null;
        if (abstractC16400ejH == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH = null;
        }
        abstractC16400ejH.KWHzl.setExpandedTitleColor(0);
        AbstractC16400ejH abstractC16400ejH3 = this.OLrzqt;
        if (abstractC16400ejH3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH3 = null;
        }
        abstractC16400ejH3.fARcdN.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.gpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20923gpz.OLrzqt(this.AEQbTJ, view);
            }
        });
        AbstractC16400ejH abstractC16400ejH4 = this.OLrzqt;
        if (abstractC16400ejH4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH4 = null;
        }
        abstractC16400ejH4.djBIcL.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getData));
        AbstractC16400ejH abstractC16400ejH5 = this.OLrzqt;
        if (abstractC16400ejH5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH5 = null;
        }
        abstractC16400ejH5.fARcdN.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getData));
        AbstractC16400ejH abstractC16400ejH6 = this.OLrzqt;
        if (abstractC16400ejH6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH6 = null;
        }
        android.widget.ImageView imageView = abstractC16400ejH6.ejfBZ;
        if (imageView != null) {
            imageView.setOnClickListener(new PendingIntent(imageView, 1000L, this));
        }
        AbstractC16400ejH abstractC16400ejH7 = this.OLrzqt;
        if (abstractC16400ejH7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH7 = null;
        }
        abstractC16400ejH7.fARcdN.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.gpD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20923gpz.copydefault(this.copydefault, view);
            }
        });
        AbstractC16400ejH abstractC16400ejH8 = this.OLrzqt;
        if (abstractC16400ejH8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16400ejH8 = null;
        }
        android.widget.ImageView imageView2 = abstractC16400ejH8.isConnected;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new LoaderManager(imageView2, 1000L, this));
        }
        AbstractC16400ejH abstractC16400ejH9 = this.OLrzqt;
        if (abstractC16400ejH9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16400ejH2 = abstractC16400ejH9;
        }
        AppCompatImageView appCompatImageView = abstractC16400ejH2.gEmmrt;
        Intrinsics.copydefault(appCompatImageView);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim));
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.gpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20923gpz.AhwBna(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(ActivityC20923gpz activityC20923gpz, android.view.View view) {
        activityC20923gpz.finish();
    }

    public static final void copydefault(ActivityC20923gpz activityC20923gpz, android.view.View view) {
        activityC20923gpz.copydefault();
        activityC20923gpz.finish();
    }

    /* JADX INFO: renamed from: o.gpz$FragmentManager */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class FragmentManager implements Function2<java.lang.Integer, android.content.Intent, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.Integer num, android.content.Intent intent) {
            EZpvd(num.intValue(), intent);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void EZpvd(int i, android.content.Intent intent) {
            android.os.Bundle extras;
            java.util.List parcelableArrayList;
            android.os.Bundle extras2;
            ExchangeAddressData exchangeAddressData;
            android.os.Bundle extras3;
            android.os.Bundle extras4;
            if (i == 1010) {
                int i2 = Build.VERSION.SDK_INT;
                AbstractC16400ejH abstractC16400ejH = null;
                if (i2 >= 33) {
                    parcelableArrayList = (intent == null || (extras4 = intent.getExtras()) == null) ? null : extras4.getParcelableArrayList("result", AddressChildBean.class);
                } else if (intent != null && (extras = intent.getExtras()) != null) {
                    parcelableArrayList = extras.getParcelableArrayList("result");
                }
                if (parcelableArrayList == null) {
                    parcelableArrayList = yDY.AhwBna();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayList);
                if (i2 >= 33) {
                    exchangeAddressData = (intent == null || (extras3 = intent.getExtras()) == null) ? null : (ExchangeAddressData) extras3.getParcelable("data", ExchangeAddressData.class);
                } else if (intent != null && (extras2 = intent.getExtras()) != null) {
                    exchangeAddressData = (ExchangeAddressData) extras2.getParcelable("data");
                }
                ActivityC20923gpz.this.AEQbTJ().AEQbTJ(exchangeAddressData);
                ActivityC20923gpz.this.AEQbTJ().copydefault(CollectionsKt___CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, new Function1<AddressChildBean, java.lang.CharSequence>() { // from class: o.gpz.FragmentManager.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final java.lang.CharSequence invoke(AddressChildBean addressChildBean) {
                        return addressChildBean.getAddress();
                    }
                }, 30, null));
                ActivityC20923gpz activityC20923gpz = ActivityC20923gpz.this;
                AbstractC16400ejH abstractC16400ejH2 = activityC20923gpz.OLrzqt;
                if (abstractC16400ejH2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16400ejH = abstractC16400ejH2;
                }
                C33570myu.AEQbTJ(activityC20923gpz, abstractC16400ejH.AkhnZx);
                android.view.View currentFocus = ActivityC20923gpz.this.getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
            }
        }
    }

    public static final void AhwBna(ActivityC20923gpz activityC20923gpz, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC20923gpz);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnCompositionsnapshotStateObserver1));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), new View.OnClickListener() { // from class: o.gpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC20923gpz.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
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
