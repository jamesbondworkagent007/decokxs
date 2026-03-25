package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsAdvancedActivity$bindData$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.viewmodel.NotificationSettingsAdvancedViewModel;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rZC extends AbstractActivityC42630rZz {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final C59534zip djBIcL = new C59534zip();
    public final InterfaceC56387yDm gEmmrt;
    public rYC valueOf;

    public rZC() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(NotificationSettingsAdvancedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsAdvancedActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsAdvancedActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsAdvancedActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.rZz.EZpvd()V */
    public final NotificationSettingsAdvancedViewModel EZpvd() {
        return (NotificationSettingsAdvancedViewModel) this.gEmmrt.getValue();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rZC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) rZC.class);
            intent.putExtra("type", i);
            context.startActivity(intent);
            return intent;
        }
    }

    @Override // o.AbstractActivityC42630rZz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        rYC rycEZpvd = rYC.EZpvd(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(rycEZpvd, "");
        rycEZpvd.OLrzqt.getTitle().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        rycEZpvd.OLrzqt.getTitle().setTypeface(ResourcesCompat.getFont(rycEZpvd.OLrzqt.getTitle().getContext(), C52761wXj.Dialog.gEmmrt));
        rycEZpvd.OLrzqt.getTitle().setTextColor(ContextCompat.getColor(this, C52761wXj.Activity.fdOvFl));
        rycEZpvd.OLrzqt.getTitle().setTextSize(18.0f);
        this.valueOf = rycEZpvd;
        setContentView(rycEZpvd.getRoot());
        gEmmrt();
        AhwBna();
        EZpvd().EZpvd(getIntent().getIntExtra("type", 1));
    }

    @Override // o.AbstractActivityC42630rZz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((InterfaceC45752swP) C43251rlk.copydefault(InterfaceC45752swP.class)).AEQbTJ(this, UKBannerType.APPROVED_6OCT23);
        EZpvd().copydefault();
    }

    private final void gEmmrt() {
        this.djBIcL.register(rZP.class, new rZX());
        this.djBIcL.register(rZQ.class, new rZM(new Function1() { // from class: o.rZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rZC.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        rYC ryc = this.valueOf;
        rYC ryc2 = null;
        if (ryc == null) {
            Intrinsics.gEmmrt("");
            ryc = null;
        }
        ryc.valueOf.setLayoutManager(linearLayoutManager);
        rYC ryc3 = this.valueOf;
        if (ryc3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ryc2 = ryc3;
        }
        ryc2.valueOf.setAdapter(this.djBIcL);
    }

    public static final Unit KWHzl(rZC rzc, int i) {
        rzc.EZpvd(i);
        return Unit.INSTANCE;
    }

    private final void AhwBna() {
        C42588rYk.collectLatestOnLifecycle$default(EZpvd().OLrzqt(), this, null, new NotificationSettingsAdvancedActivity$bindData$1(this, null), 2, null);
    }

    public final void valueOf() {
        rYC ryc = this.valueOf;
        if (ryc == null) {
            Intrinsics.gEmmrt("");
            ryc = null;
        }
        RecyclerView recyclerView = ryc.valueOf;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        rYC ryc2 = this.valueOf;
        if (ryc2 == null) {
            Intrinsics.gEmmrt("");
            ryc2 = null;
        }
        C55113xdn.showLoading$default(ryc2.EZpvd, 0L, 1, null);
    }

    public final void djBIcL() {
        rYC ryc = this.valueOf;
        if (ryc == null) {
            Intrinsics.gEmmrt("");
            ryc = null;
        }
        ryc.EZpvd.copydefault();
        rYC ryc2 = this.valueOf;
        if (ryc2 == null) {
            Intrinsics.gEmmrt("");
            ryc2 = null;
        }
        RecyclerView recyclerView = ryc2.valueOf;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(8);
        rYC ryc3 = this.valueOf;
        if (ryc3 == null) {
            Intrinsics.gEmmrt("");
            ryc3 = null;
        }
        C55173xeu c55173xeu = ryc3.copydefault;
        java.lang.String string = getString(rXV.TaskDescription.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string);
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string2 = getString(rXV.TaskDescription.AuCTel);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.rZG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rZC.AEQbTJ(this.AEQbTJ, view);
            }
        });
        rVN.reportFullyDrawn$default((android.app.Activity) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(rZC rzc, android.view.View view) {
        rzc.EZpvd().copydefault();
    }

    public final void KWHzl(java.util.List<NotificationAdvancedSettings> list) {
        rYC ryc = this.valueOf;
        if (ryc == null) {
            Intrinsics.gEmmrt("");
            ryc = null;
        }
        RecyclerView recyclerView = ryc.valueOf;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(0);
        rYC ryc2 = this.valueOf;
        if (ryc2 == null) {
            Intrinsics.gEmmrt("");
            ryc2 = null;
        }
        ryc2.EZpvd.copydefault();
        this.djBIcL.setItems(EZpvd().OLrzqt(list));
        this.djBIcL.notifyDataSetChanged();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(int i) {
        NotificationSettingChannel notificationSettingChannelAEQbTJ = EZpvd().AEQbTJ(i);
        if (notificationSettingChannelAEQbTJ != null) {
            rZK.Companion.KWHzl(this, notificationSettingChannelAEQbTJ, getIntent().getIntExtra("type", 1));
        }
    }

    @Override // o.AbstractActivityC42630rZz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // o.AbstractActivityC42630rZz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC42630rZz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC42630rZz, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
