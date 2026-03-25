package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.CoinInfoAddressInfoBean;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.business.defi.biz.net.bean.CoinInfoSocialMediaBean;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinInfoActivity$initFlowListener$1;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetCoinInformationViewModel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C19595gIe;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eYy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC15886eYy extends eXK {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public DialogC55112xdm AhwBna;
    public AddressTokenAsset AkhnZx;
    public boolean DbNXlk;
    public AbstractC16320ehh djBIcL;
    public final InterfaceC56387yDm valueOf;
    public java.util.List<CoinInfoAddressInfoBean> AYXKKw = new java.util.ArrayList();
    public long gEmmrt = Long.MIN_VALUE;
    public java.lang.String values = "";

    public ActivityC15886eYy() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(AddressProfileAssetCoinInformationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinInfoActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinInfoActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinInfoActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.eYy$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull android.app.Activity activity, @NotNull AddressTokenAsset addressTokenAsset) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(addressTokenAsset, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC15886eYy.class);
            intent.putExtra("tokenAsset", addressTokenAsset);
            activity.startActivity(intent);
        }
    }

    /* JADX DEBUG: Possible override for method o.eXK.AEQbTJ()V */
    public final AddressProfileAssetCoinInformationViewModel AEQbTJ() {
        return (AddressProfileAssetCoinInformationViewModel) this.valueOf.getValue();
    }

    @Override // o.eXK, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        AddressTokenAsset addressTokenAsset;
        super.onCreate(bundle);
        this.djBIcL = (AbstractC16320ehh) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.hDKMBd);
        if (Build.VERSION.SDK_INT >= 33) {
            addressTokenAsset = (AddressTokenAsset) getIntent().getParcelableExtra("tokenAsset", AddressTokenAsset.class);
        } else {
            addressTokenAsset = (AddressTokenAsset) getIntent().getParcelableExtra("tokenAsset");
        }
        this.AkhnZx = addressTokenAsset;
        if (addressTokenAsset == null) {
            finish();
            return;
        }
        if (addressTokenAsset != null) {
            EZpvd(addressTokenAsset);
            java.util.List<AddressCoinBalanceDetail> coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails();
            if (coinBalanceDetails != null) {
                this.gEmmrt = ((AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.AuCTelauCTel(coinBalanceDetails)).getChainIndex();
                java.lang.String address = ((AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.AuCTelauCTel(coinBalanceDetails)).getAddress();
                if (address == null) {
                    address = "";
                }
                this.values = address;
                java.util.ArrayList<AddressCoinBalanceDetail> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : coinBalanceDetails) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) ((AddressCoinBalanceDetail) obj).getAddress())) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (AddressCoinBalanceDetail addressCoinBalanceDetail : arrayList) {
                    arrayList2.add(new CoinInfoAddressInfoBean(addressCoinBalanceDetail.getChainImageUrl(), addressCoinBalanceDetail.getChainName(), addressCoinBalanceDetail.getAddress(), addressCoinBalanceDetail.getExplorerUrl()));
                }
                this.AYXKKw = arrayList2;
            }
        }
        AbstractC16320ehh abstractC16320ehh = this.djBIcL;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        android.widget.ImageView imageView = abstractC16320ehh.valueOf;
        imageView.setOnClickListener(new AssistContent(imageView, 1000L, this));
        gEmmrt();
        AYXKKw();
    }

    private final void AYXKKw() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new ProfileAssetCoinInfoActivity$initFlowListener$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        if (this.AhwBna == null) {
            this.AhwBna = new DialogC55112xdm(this, C13754dXa.LoaderManager.isConnected);
        }
        DialogC55112xdm dialogC55112xdm = this.AhwBna;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.show();
        }
        AEQbTJ().KWHzl(this.gEmmrt, this.values);
    }

    public final void EZpvd(AddressTokenAsset addressTokenAsset) {
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrCopydefault = Glide.copydefault((FragmentActivity) this);
        java.lang.String imageUrl = addressTokenAsset.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        C5335Nt c5335NtEZpvd = componentCallbacks2C5333NrCopydefault.EZpvd(imageUrl).copydefault(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext()));
        AbstractC16320ehh abstractC16320ehh = this.djBIcL;
        AbstractC16320ehh abstractC16320ehh2 = null;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        c5335NtEZpvd.EZpvd(abstractC16320ehh.EZpvd);
        AbstractC16320ehh abstractC16320ehh3 = this.djBIcL;
        if (abstractC16320ehh3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh3 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16320ehh3.AubY.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int i = C13754dXa.ActionBar.ibrGus;
            layoutParams2.topToTop = i;
            layoutParams2.bottomToBottom = i;
            layoutParams2.startToEnd = i;
            AbstractC16320ehh abstractC16320ehh4 = this.djBIcL;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.AubY.setLayoutParams(layoutParams2);
        }
        AbstractC16320ehh abstractC16320ehh5 = this.djBIcL;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.AubY.setText(addressTokenAsset.getSymbol());
        AbstractC16320ehh abstractC16320ehh6 = this.djBIcL;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16320ehh2 = abstractC16320ehh6;
        }
        abstractC16320ehh2.zsXlph.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.eYy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC15886eYy EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC15886eYy activityC15886eYy) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC15886eYy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.EZpvd);
                AbstractC16320ehh abstractC16320ehh = this.EZpvd.djBIcL;
                if (abstractC16320ehh == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh = null;
                }
                viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.fIwbmz.getText());
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.GLcwwN));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), (View.OnClickListener) new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC15886eYy KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, ActivityC15886eYy activityC15886eYy) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = activityC15886eYy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ActivityC15886eYy EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ CoinInfoBean OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC15886eYy activityC15886eYy, CoinInfoBean coinInfoBean) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = activityC15886eYy;
            this.OLrzqt = coinInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC15886eYy activityC15886eYy = this.EZpvd;
                java.util.List<java.lang.String> technicalDoc = this.OLrzqt.getTechnicalDoc();
                Intrinsics.copydefault(technicalDoc);
                activityC15886eYy.AEQbTJ(technicalDoc.get(0));
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC15886eYy OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC15886eYy activityC15886eYy) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = activityC15886eYy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.OLrzqt.DbNXlk) {
                    AbstractC16320ehh abstractC16320ehh = this.OLrzqt.djBIcL;
                    if (abstractC16320ehh == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh = null;
                    }
                    abstractC16320ehh.wlaJM.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OAhWiU));
                    AbstractC16320ehh abstractC16320ehh2 = this.OLrzqt.djBIcL;
                    if (abstractC16320ehh2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh2 = null;
                    }
                    abstractC16320ehh2.AhwBna.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
                    AbstractC16320ehh abstractC16320ehh3 = this.OLrzqt.djBIcL;
                    if (abstractC16320ehh3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh3 = null;
                    }
                    java.util.Iterator<java.lang.Integer> it = C56548yJl.AhwBna(3, abstractC16320ehh3.fetchVPNInfo.getChildCount()).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((AbstractC56415yEn) it).nextInt();
                        AbstractC16320ehh abstractC16320ehh4 = this.OLrzqt.djBIcL;
                        if (abstractC16320ehh4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16320ehh4 = null;
                        }
                        abstractC16320ehh4.fetchVPNInfo.getChildAt(iNextInt).setVisibility(8);
                    }
                } else {
                    AbstractC16320ehh abstractC16320ehh5 = this.OLrzqt.djBIcL;
                    if (abstractC16320ehh5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh5 = null;
                    }
                    abstractC16320ehh5.wlaJM.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aQtmcU));
                    AbstractC16320ehh abstractC16320ehh6 = this.OLrzqt.djBIcL;
                    if (abstractC16320ehh6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh6 = null;
                    }
                    abstractC16320ehh6.AhwBna.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
                    AbstractC16320ehh abstractC16320ehh7 = this.OLrzqt.djBIcL;
                    if (abstractC16320ehh7 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh7 = null;
                    }
                    java.util.Iterator<java.lang.Integer> it2 = C56548yJl.AhwBna(3, abstractC16320ehh7.fetchVPNInfo.getChildCount()).iterator();
                    while (it2.hasNext()) {
                        int iNextInt2 = ((AbstractC56415yEn) it2).nextInt();
                        AbstractC16320ehh abstractC16320ehh8 = this.OLrzqt.djBIcL;
                        if (abstractC16320ehh8 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16320ehh8 = null;
                        }
                        abstractC16320ehh8.fetchVPNInfo.getChildAt(iNextInt2).setVisibility(0);
                    }
                }
                this.OLrzqt.DbNXlk = !r7.DbNXlk;
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ActivityC15886eYy AEQbTJ;
        public final /* synthetic */ CoinInfoBean EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC15886eYy activityC15886eYy, CoinInfoBean coinInfoBean) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC15886eYy;
            this.EZpvd = coinInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityC15886eYy activityC15886eYy = this.AEQbTJ;
                java.util.List<java.lang.String> website = this.EZpvd.getWebsite();
                Intrinsics.copydefault(website);
                activityC15886eYy.AEQbTJ(website.get(0));
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ CoinInfoBean OLrzqt;
        public final /* synthetic */ ActivityC15886eYy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC15886eYy activityC15886eYy, CoinInfoBean coinInfoBean) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = activityC15886eYy;
            this.OLrzqt = coinInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ActivityC15886eYy activityC15886eYy = this.copydefault;
                CoinInfoBean coinInfoBean = this.OLrzqt;
                activityC15886eYy.AEQbTJ(coinInfoBean != null ? coinInfoBean.getExplorerUrl() : null);
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC15886eYy KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC15886eYy activityC15886eYy) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = activityC15886eYy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.KWHzl);
                AbstractC16320ehh abstractC16320ehh = this.KWHzl.djBIcL;
                if (abstractC16320ehh == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh = null;
                }
                viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.uzCIH.getText());
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.GPCHlQ));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), (View.OnClickListener) new PictureInPictureParams(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC15886eYy KWHzl;
        public final /* synthetic */ CoinInfoAddressInfoBean OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC15886eYy activityC15886eYy, CoinInfoAddressInfoBean coinInfoAddressInfoBean) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = activityC15886eYy;
            this.OLrzqt = coinInfoAddressInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.Object systemService = this.KWHzl.getSystemService("clipboard");
                Intrinsics.copydefault(systemService, "");
                ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, this.OLrzqt.getAddress()));
                C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.GQzpsZ);
                java.lang.String address = this.OLrzqt.getAddress();
                stateListAnimator.AEQbTJ(strAYXKKw, address != null ? address : "").KWHzl(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC15886eYy KWHzl;
        public final /* synthetic */ CoinInfoAddressInfoBean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC15886eYy activityC15886eYy, CoinInfoAddressInfoBean coinInfoAddressInfoBean) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = activityC15886eYy;
            this.copydefault = coinInfoAddressInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ(this.copydefault.getExplorerUrl());
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ ActivityC15886eYy AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ CoinInfoSocialMediaBean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, ActivityC15886eYy activityC15886eYy, CoinInfoSocialMediaBean coinInfoSocialMediaBean) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC15886eYy;
            this.copydefault = coinInfoSocialMediaBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ(this.copydefault.getUrl());
            }
        }
    }

    /* JADX INFO: renamed from: o.eYy$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC15886eYy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, ActivityC15886eYy activityC15886eYy) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = activityC15886eYy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
                AbstractC16320ehh abstractC16320ehh = this.copydefault.djBIcL;
                if (abstractC16320ehh == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh = null;
                }
                viewOnClickListenerC54939xaY.setTitle(abstractC16320ehh.getNewProxyInstance.getText());
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dbUqJD));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sILrnl), (View.OnClickListener) new SharedElementCallback(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public final void AEQbTJ(CoinInfoBean coinInfoBean) {
        AbstractC16320ehh abstractC16320ehh = this.djBIcL;
        AbstractC16320ehh abstractC16320ehh2 = null;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        android.widget.ImageView imageView = abstractC16320ehh.OLrzqt;
        imageView.setOnClickListener(new PendingIntent(imageView, 1000L, this));
        if ((coinInfoBean != null ? coinInfoBean.getMarketCap() : null) == null) {
            AbstractC16320ehh abstractC16320ehh3 = this.djBIcL;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.getFieldNames.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.djBIcL;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh2 = abstractC16320ehh4;
            }
            abstractC16320ehh2.hDKMBd.setVisibility(0);
            return;
        }
        AbstractC16320ehh abstractC16320ehh5 = this.djBIcL;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.getFieldNames.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh6 = this.djBIcL;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.hDKMBd.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.djBIcL;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16320ehh2 = abstractC16320ehh7;
        }
        abstractC16320ehh2.getFieldNames.setText(C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(C54862xYb.OLrzqt(coinInfoBean.getMarketCap(), java.lang.Double.valueOf(C54864xYd.AEQbTJ.OLrzqt()))), null, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, false, 25, null));
    }

    /* JADX INFO: renamed from: o.eYy$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public final void EZpvd(CoinInfoBean coinInfoBean) {
        AbstractC16320ehh abstractC16320ehh = this.djBIcL;
        AbstractC16320ehh abstractC16320ehh2 = null;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        android.widget.ImageView imageView = abstractC16320ehh.copydefault;
        imageView.setOnClickListener(new VoiceInteractor(imageView, 1000L, this));
        if ((coinInfoBean != null ? coinInfoBean.getMaxSupply() : null) == null) {
            AbstractC16320ehh abstractC16320ehh3 = this.djBIcL;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.AuCTelauCTel.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.djBIcL;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh2 = abstractC16320ehh4;
            }
            abstractC16320ehh2.iwGUEr.setVisibility(0);
            return;
        }
        AbstractC16320ehh abstractC16320ehh5 = this.djBIcL;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.AuCTelauCTel.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh6 = this.djBIcL;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.iwGUEr.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.djBIcL;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.AuCTelauCTel.setText(C54873xYm.formatSpecificNum$default(C33129mqd.EZpvd(coinInfoBean.getMaxSupply()), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null));
    }

    /* JADX INFO: renamed from: o.eYy$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public final void OLrzqt(CoinInfoBean coinInfoBean) {
        AbstractC16320ehh abstractC16320ehh = this.djBIcL;
        AbstractC16320ehh abstractC16320ehh2 = null;
        if (abstractC16320ehh == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh = null;
        }
        android.widget.ImageView imageView = abstractC16320ehh.AEQbTJ;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        if ((coinInfoBean != null ? coinInfoBean.getCirculatingSupply() : null) == null) {
            AbstractC16320ehh abstractC16320ehh3 = this.djBIcL;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.fARcdN.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.djBIcL;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh2 = abstractC16320ehh4;
            }
            abstractC16320ehh2.ejfBZ.setVisibility(0);
            return;
        }
        AbstractC16320ehh abstractC16320ehh5 = this.djBIcL;
        if (abstractC16320ehh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh5 = null;
        }
        abstractC16320ehh5.fARcdN.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh6 = this.djBIcL;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.ejfBZ.setVisibility(8);
        AbstractC16320ehh abstractC16320ehh7 = this.djBIcL;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.fARcdN.setText(C54873xYm.formatSpecificNum$default(C33129mqd.EZpvd(coinInfoBean.getCirculatingSupply()), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null));
    }

    /* JADX INFO: renamed from: o.eYy$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public final void djBIcL() {
        AbstractC16320ehh abstractC16320ehh = null;
        if (!(!this.AYXKKw.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh2 = this.djBIcL;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.AuCTel.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh3 = this.djBIcL;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.fetchVPNInfo.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh4 = this.djBIcL;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.DbNXlk.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh5 = this.djBIcL;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh = abstractC16320ehh5;
            }
            abstractC16320ehh.AxsJAY.setVisibility(8);
            return;
        }
        AbstractC16320ehh abstractC16320ehh6 = this.djBIcL;
        if (abstractC16320ehh6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh6 = null;
        }
        abstractC16320ehh6.AuCTel.setVisibility(0);
        AbstractC16320ehh abstractC16320ehh7 = this.djBIcL;
        if (abstractC16320ehh7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh7 = null;
        }
        abstractC16320ehh7.fetchVPNInfo.setVisibility(0);
        if (this.AYXKKw.size() > 3) {
            AbstractC16320ehh abstractC16320ehh8 = this.djBIcL;
            if (abstractC16320ehh8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh8 = null;
            }
            abstractC16320ehh8.DbNXlk.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh9 = this.djBIcL;
            if (abstractC16320ehh9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh9 = null;
            }
            abstractC16320ehh9.AxsJAY.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh10 = this.djBIcL;
            if (abstractC16320ehh10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh10 = null;
            }
            android.widget.LinearLayout linearLayout = abstractC16320ehh10.DbNXlk;
            linearLayout.setOnClickListener(new Fragment(linearLayout, 1000L, this));
        } else {
            AbstractC16320ehh abstractC16320ehh11 = this.djBIcL;
            if (abstractC16320ehh11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh11 = null;
            }
            abstractC16320ehh11.DbNXlk.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh12 = this.djBIcL;
            if (abstractC16320ehh12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh12 = null;
            }
            abstractC16320ehh12.AxsJAY.setVisibility(8);
        }
        int i = 0;
        for (java.lang.Object obj : this.AYXKKw) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            CoinInfoAddressInfoBean coinInfoAddressInfoBean = (CoinInfoAddressInfoBean) obj;
            AbstractC16320ehh abstractC16320ehh13 = this.djBIcL;
            if (abstractC16320ehh13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh13 = null;
            }
            android.widget.LinearLayout linearLayout2 = abstractC16320ehh13.fetchVPNInfo;
            AbstractC16320ehh abstractC16320ehh14 = this.djBIcL;
            if (abstractC16320ehh14 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh14 = null;
            }
            android.widget.LinearLayout linearLayout3 = abstractC16320ehh14.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout2.addView(copydefault(linearLayout3, coinInfoAddressInfoBean, i < 3));
            i++;
        }
    }

    public final android.view.View copydefault(android.view.ViewGroup viewGroup, CoinInfoAddressInfoBean coinInfoAddressInfoBean, boolean z) {
        java.lang.String strOLrzqt;
        java.lang.Character chWlaJM;
        java.lang.String string;
        android.view.View viewInflate = getLayoutInflater().inflate(C13754dXa.TaskDescription.DcMfJKgMxgjU, viewGroup, false);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinInfoAddressInfoBean.getImageUrl())) {
            strOLrzqt = coinInfoAddressInfoBean.getImageUrl();
        } else {
            java.lang.String chainName = coinInfoAddressInfoBean.getChainName();
            if (chainName == null || (chWlaJM = C59454zhO.wlaJM(chainName)) == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                strOLrzqt = "";
            }
        }
        coinInfoAddressInfoBean.setImageUrl(strOLrzqt);
        Glide.copydefault((FragmentActivity) this).EZpvd(coinInfoAddressInfoBean.getImageUrl()).copydefault(C52761wXj.TaskDescription.aHXSQp).KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext())).EZpvd((android.widget.ImageView) viewInflate.findViewById(C13754dXa.ActionBar.ibrGus));
        ((android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.setOnBackInvokedDispatcher)).setText(coinInfoAddressInfoBean.getChainName());
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.onStart);
        textView.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, coinInfoAddressInfoBean.getAddress(), false, 2, null));
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this, coinInfoAddressInfoBean));
        android.view.View viewFindViewById = viewInflate.findViewById(C13754dXa.ActionBar.DRtzUu);
        viewFindViewById.setOnClickListener(new TaskDescription(viewFindViewById, 1000L, this, coinInfoAddressInfoBean));
        viewInflate.setVisibility(z ? 0 : 8);
        Intrinsics.copydefault(viewInflate);
        return viewInflate;
    }

    public final void KWHzl(CoinInfoBean coinInfoBean) {
        boolean z;
        java.util.List<java.lang.String> technicalDoc;
        java.util.List<java.lang.String> website;
        boolean z2 = true;
        AbstractC16320ehh abstractC16320ehh = null;
        if (coinInfoBean == null || (website = coinInfoBean.getWebsite()) == null || !(!website.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh2 = this.djBIcL;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh2 = null;
            }
            abstractC16320ehh2.gEmmrt.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh3 = this.djBIcL;
            if (abstractC16320ehh3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh3 = null;
            }
            abstractC16320ehh3.gHZMYf.setVisibility(8);
            z = false;
        } else {
            AbstractC16320ehh abstractC16320ehh4 = this.djBIcL;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.gEmmrt.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh5 = this.djBIcL;
            if (abstractC16320ehh5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh5 = null;
            }
            abstractC16320ehh5.gHZMYf.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh6 = this.djBIcL;
            if (abstractC16320ehh6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh6 = null;
            }
            android.widget.TextView textView = abstractC16320ehh6.gHZMYf;
            textView.setOnClickListener(new FragmentManager(textView, 1000L, this, coinInfoBean));
            z = true;
        }
        if (coinInfoBean == null || (technicalDoc = coinInfoBean.getTechnicalDoc()) == null || !(!technicalDoc.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh7 = this.djBIcL;
            if (abstractC16320ehh7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh7 = null;
            }
            abstractC16320ehh7.AYXKKw.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh8 = this.djBIcL;
            if (abstractC16320ehh8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh8 = null;
            }
            abstractC16320ehh8.sSMYrx.setVisibility(8);
        } else {
            AbstractC16320ehh abstractC16320ehh9 = this.djBIcL;
            if (abstractC16320ehh9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh9 = null;
            }
            abstractC16320ehh9.AYXKKw.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh10 = this.djBIcL;
            if (abstractC16320ehh10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh10 = null;
            }
            abstractC16320ehh10.sSMYrx.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh11 = this.djBIcL;
            if (abstractC16320ehh11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh11 = null;
            }
            android.widget.TextView textView2 = abstractC16320ehh11.sSMYrx;
            textView2.setOnClickListener(new Dialog(textView2, 1000L, this, coinInfoBean));
            z = true;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinInfoBean != null ? coinInfoBean.getExplorerUrl() : null))) {
            AbstractC16320ehh abstractC16320ehh12 = this.djBIcL;
            if (abstractC16320ehh12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh12 = null;
            }
            abstractC16320ehh12.djBIcL.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh13 = this.djBIcL;
            if (abstractC16320ehh13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh13 = null;
            }
            abstractC16320ehh13.zuBGHE.setVisibility(0);
            AbstractC16320ehh abstractC16320ehh14 = this.djBIcL;
            if (abstractC16320ehh14 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh14 = null;
            }
            android.widget.TextView textView3 = abstractC16320ehh14.zuBGHE;
            textView3.setOnClickListener(new LoaderManager(textView3, 1000L, this, coinInfoBean));
        } else {
            AbstractC16320ehh abstractC16320ehh15 = this.djBIcL;
            if (abstractC16320ehh15 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh15 = null;
            }
            abstractC16320ehh15.djBIcL.setVisibility(8);
            AbstractC16320ehh abstractC16320ehh16 = this.djBIcL;
            if (abstractC16320ehh16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh16 = null;
            }
            abstractC16320ehh16.zuBGHE.setVisibility(8);
            z2 = z;
        }
        AbstractC16320ehh abstractC16320ehh17 = this.djBIcL;
        if (abstractC16320ehh17 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16320ehh = abstractC16320ehh17;
        }
        abstractC16320ehh.fJNWhG.setVisibility(z2 ? 0 : 8);
    }

    public final void copydefault(CoinInfoBean coinInfoBean) {
        java.util.List<CoinInfoSocialMediaBean> socialMedia;
        AbstractC16320ehh abstractC16320ehh = null;
        if (coinInfoBean == null || (socialMedia = coinInfoBean.getSocialMedia()) == null || !(!socialMedia.isEmpty())) {
            AbstractC16320ehh abstractC16320ehh2 = this.djBIcL;
            if (abstractC16320ehh2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16320ehh = abstractC16320ehh2;
            }
            abstractC16320ehh.zLjUOn.setVisibility(8);
            return;
        }
        AbstractC16320ehh abstractC16320ehh3 = this.djBIcL;
        if (abstractC16320ehh3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16320ehh3 = null;
        }
        abstractC16320ehh3.zLjUOn.setVisibility(0);
        java.util.List<CoinInfoSocialMediaBean> socialMedia2 = coinInfoBean.getSocialMedia();
        Intrinsics.copydefault(socialMedia2);
        for (CoinInfoSocialMediaBean coinInfoSocialMediaBean : socialMedia2) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(this);
            Glide.copydefault((FragmentActivity) this).EZpvd(coinInfoSocialMediaBean.getIcon()).KWHzl(C13754dXa.Activity.fHqPtx).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext())).EZpvd((android.widget.ImageView) appCompatImageView);
            appCompatImageView.setOnClickListener(new TaskStackBuilder(appCompatImageView, 1000L, this, coinInfoSocialMediaBean));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) C33052mpF.dp$default(32, (android.content.Context) null, 1, (java.lang.Object) null), (int) C33052mpF.dp$default(32, (android.content.Context) null, 1, (java.lang.Object) null));
            layoutParams.setMarginEnd((int) C33052mpF.dp$default(13, (android.content.Context) null, 1, (java.lang.Object) null));
            AbstractC16320ehh abstractC16320ehh4 = this.djBIcL;
            if (abstractC16320ehh4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16320ehh4 = null;
            }
            abstractC16320ehh4.values.addView(appCompatImageView, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    @Override // o.eXK, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eXK, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eXK, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eXK, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
