package o;

import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsChannelsActivity$setupObserver$1;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsChannelsActivity$setupObserver$2;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsChannelsActivity$setupObserver$3;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.viewmodel.NotificationSettingsChannelsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rZK extends rZD {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final C59534zip AhwBna = new C59534zip();
    public rYB valueOf;

    public rZK() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(NotificationSettingsChannelsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsChannelsActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsChannelsActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.ui.NotificationSettingsChannelsActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.rZD.KWHzl()V */
    public final NotificationSettingsChannelsViewModel KWHzl() {
        return (NotificationSettingsChannelsViewModel) this.AYXKKw.getValue();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rZK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull NotificationSettingChannel notificationSettingChannel, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(notificationSettingChannel, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) rZK.class);
            intent.putExtra("bizType", i);
            intent.putExtra("notification_channels", notificationSettingChannel);
            context.startActivity(intent);
            return intent;
        }
    }

    @Override // o.rZD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        java.lang.String msgName;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) intent.getParcelableExtra("notification_channels", NotificationSettingChannel.class);
        } else {
            parcelable = (NotificationSettingChannel) intent.getParcelableExtra("notification_channels");
        }
        NotificationSettingChannel notificationSettingChannel = (NotificationSettingChannel) parcelable;
        int intExtra = getIntent().getIntExtra("bizType", 1);
        rYB rybEZpvd = rYB.EZpvd(getLayoutInflater());
        this.valueOf = rybEZpvd;
        rYB ryb = null;
        if (rybEZpvd == null) {
            Intrinsics.gEmmrt("");
            rybEZpvd = null;
        }
        setContentView(rybEZpvd.getRoot());
        rYB ryb2 = this.valueOf;
        if (ryb2 == null) {
            Intrinsics.gEmmrt("");
            ryb2 = null;
        }
        android.widget.TextView title = ryb2.EZpvd.getTitle();
        if (notificationSettingChannel == null || (msgName = notificationSettingChannel.getMsgName()) == null) {
            msgName = "";
        }
        title.setText(msgName);
        rYB ryb3 = this.valueOf;
        if (ryb3 == null) {
            Intrinsics.gEmmrt("");
            ryb3 = null;
        }
        android.widget.TextView title2 = ryb3.EZpvd.getTitle();
        rYB ryb4 = this.valueOf;
        if (ryb4 == null) {
            Intrinsics.gEmmrt("");
            ryb4 = null;
        }
        title2.setTypeface(ResourcesCompat.getFont(ryb4.EZpvd.getTitle().getContext(), C52761wXj.Dialog.gEmmrt));
        rYB ryb5 = this.valueOf;
        if (ryb5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ryb = ryb5;
        }
        ryb.EZpvd.getTitle().setContentDescription("notification_settings_channels_title");
        if (notificationSettingChannel == null) {
            finish();
            return;
        }
        valueOf();
        AhwBna();
        KWHzl().OLrzqt(notificationSettingChannel, intExtra);
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NotificationSettingsChannelsActivity$setupObserver$1(this, null), 3, null);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new NotificationSettingsChannelsActivity$setupObserver$2(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new NotificationSettingsChannelsActivity$setupObserver$3(this, null));
    }

    private final void valueOf() {
        this.AhwBna.register(rZS.class, new rZU());
        this.AhwBna.register(rZV.class, new C44631saa());
        this.AhwBna.register(rZY.class, new rZN(new Function2() { // from class: o.rZH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return rZK.KWHzl(this.EZpvd, (rZY) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }));
        this.AhwBna.register(rZP.class, new rZX());
        this.AhwBna.register(SystemNotificationExample.class, new rZT());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        rYB ryb = this.valueOf;
        rYB ryb2 = null;
        if (ryb == null) {
            Intrinsics.gEmmrt("");
            ryb = null;
        }
        ryb.AEQbTJ.setLayoutManager(linearLayoutManager);
        rYB ryb3 = this.valueOf;
        if (ryb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ryb2 = ryb3;
        }
        ryb2.AEQbTJ.setAdapter(this.AhwBna);
    }

    public static final Unit KWHzl(rZK rzk, rZY rzy, boolean z) {
        Intrinsics.checkNotNullParameter(rzy, "");
        rzk.KWHzl().AEQbTJ(rzy, z);
        return Unit.INSTANCE;
    }

    @Override // o.rZD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.rZD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.rZD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.rZD, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
