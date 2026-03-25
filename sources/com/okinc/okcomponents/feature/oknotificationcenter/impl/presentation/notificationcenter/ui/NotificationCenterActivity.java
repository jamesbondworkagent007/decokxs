package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterSettingsBottomsheetFragment;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.viewmodel.NotificationCenterViewModel;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationpermissions.NotificationPermissionReminderBottomsheetFragment;
import com.okinc.okuser.data.User;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.AbstractActivityC44643sam;
import o.AbstractC42599rYv;
import o.C33070mpX;
import o.C42588rYk;
import o.C42590rYm;
import o.C42596rYs;
import o.C43251rlk;
import o.C44639sai;
import o.C44656saz;
import o.C55296xhK;
import o.C55326xho;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.C59462zhW;
import o.C59519zia;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.rXL;
import o.rXQ;
import o.rXV;
import o.wYC;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterActivity extends AbstractActivityC44643sam<AbstractC42599rYv> {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AkhnZx;
    public Handler DbNXlk;
    public Runnable fetchVPNInfo;

    @yCM
    public C42596rYs sharedPreferences;
    public final boolean valueOf;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.saq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return NotificationCenterActivity.AYXKKw(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sau
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return NotificationCenterActivity.valueOf(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.sas
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return NotificationCenterActivity.AYXKKw();
        }
    });
    public final int gEmmrt = rXV.StateListAnimator.copydefault;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.sat
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return NotificationCenterActivity.gEmmrt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.valueOf;
    }

    public NotificationCenterActivity() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(NotificationCenterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity$special$$inlined$viewModels$default$3
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

    private final rXL AuCTel() {
        return (rXL) this.AYXKKw.getValue();
    }

    public static final rXL AYXKKw(NotificationCenterActivity notificationCenterActivity) {
        String stringExtra = notificationCenterActivity.getIntent().getStringExtra("ARG_NOTIFICATION_CHANNEL_ID");
        if (stringExtra != null) {
            return rXL.Companion.EZpvd(stringExtra);
        }
        return null;
    }

    public static final String valueOf(NotificationCenterActivity notificationCenterActivity) {
        Intent intent = notificationCenterActivity.getIntent();
        if (intent != null) {
            return intent.getStringExtra("ARG_CUSTOM_TITLE");
        }
        return null;
    }

    public final String DbNXlk() {
        return (String) this.AhwBna.getValue();
    }

    public static final InterfaceC47278tmy AYXKKw() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public final InterfaceC47278tmy fetchVPNInfo() {
        return (InterfaceC47278tmy) this.values.getValue();
    }

    public final C42596rYs AkhnZx() {
        C42596rYs c42596rYs = this.sharedPreferences;
        if (c42596rYs != null) {
            return c42596rYs;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ Intent createIntent$default(Activity activity, Context context, String str, NotificationCategory notificationCategory, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                notificationCategory = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return activity.AEQbTJ(context, str, notificationCategory, str2);
        }

        public final Intent AEQbTJ(@NotNull Context context, String str, NotificationCategory notificationCategory, String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) NotificationCenterActivity.class);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("ARG_NOTIFICATION_CHANNEL_ID", str);
            pairArr[1] = C56390yDp.OLrzqt("ARG_TAB_NAVIGATION_CATEGORY_ID", notificationCategory != null ? notificationCategory.getValue() : null);
            pairArr[2] = C56390yDp.OLrzqt("ARG_CUSTOM_TITLE", str2);
            intent.putExtras(BundleKt.bundleOf(pairArr));
            return intent;
        }
    }

    private final NotificationCenterViewModel fARcdN() {
        return (NotificationCenterViewModel) this.AkhnZx.getValue();
    }

    public static final rXQ gEmmrt() {
        return (rXQ) C43251rlk.copydefault(rXQ.class);
    }

    public final rXQ isConnected() {
        return (rXQ) this.isConnected.getValue();
    }

    @Override // o.AbstractActivityC44643sam, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hDKMBd();
        getNewProxyInstance();
        fIwbmz();
        uzCIH();
        values();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        setSupportActionBar(((AbstractC42599rYv) KWHzl()).KWHzl);
        Toolbar toolbar = ((AbstractC42599rYv) KWHzl()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        TextView textView = ((AbstractC42599rYv) KWHzl()).copydefault;
        String strDbNXlk = DbNXlk();
        if (strDbNXlk == null) {
            rXL rxlAuCTel = AuCTel();
            strDbNXlk = rxlAuCTel != null ? rxlAuCTel.copydefault() : null;
            if (strDbNXlk == null) {
                strDbNXlk = C33070mpX.AYXKKw(rXV.TaskDescription.fJNWhG);
            }
        }
        setupActionBarTitle(toolbar, textView, strDbNXlk);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
        }
        AbstractC42599rYv abstractC42599rYv = (AbstractC42599rYv) KWHzl();
        wYC wyc = abstractC42599rYv.AEQbTJ;
        wyc.setOnClickListener(new StateListAnimator(wyc, 1000L, this));
        ImageView imageView = abstractC42599rYv.EZpvd;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
    }

    private final void getNewProxyInstance() {
        getSupportFragmentManager().beginTransaction().replace(rXV.ActionBar.values, C44656saz.Companion.AEQbTJ(AuCTel())).commit();
    }

    public final void fIwbmz() {
        getSupportFragmentManager().setFragmentResultListener("NotificationCenterSettingsBottomsheetFragment", this, new FragmentResultListener() { // from class: o.sar
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                NotificationCenterActivity.AEQbTJ(this.copydefault, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(NotificationCenterActivity notificationCenterActivity, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        NotificationCenterSettingsBottomsheetFragment.SettingsOption settingsOption = (NotificationCenterSettingsBottomsheetFragment.SettingsOption) bundle.getParcelable("REQUEST_KEY_NOTIFICATION_CENTER_SETTINGS");
        if (Intrinsics.EZpvd(settingsOption, NotificationCenterSettingsBottomsheetFragment.SettingsOption.MarkAllAsRead.KWHzl)) {
            C44639sai.Companion.KWHzl().copydefault(notificationCenterActivity.fARcdN().djBIcL());
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(rXV.TaskDescription.values), 0, 1, (Object) null);
        } else if (Intrinsics.EZpvd(settingsOption, NotificationCenterSettingsBottomsheetFragment.SettingsOption.CustomiseNotifications.EZpvd)) {
            if (Intrinsics.EZpvd((Object) notificationCenterActivity.getIntent().getStringExtra("ARG_NOTIFICATION_CHANNEL_ID"), (Object) "EXTRA_KEY_FROM_COPY_TRADING")) {
                notificationCenterActivity.fARcdN().AkhnZx();
            } else {
                rXQ.Activity.startAppPushAdvancedSettingsPageForResult$default(notificationCenterActivity.isConnected(), notificationCenterActivity, AppNotificationBizType.CEFI, 100, null, 8, null);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rYk.collectOnLifecycle$default(kotlinx.coroutines.flow.Flow, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$State, o.yHO, int, java.lang.Object):void */
    private final void uzCIH() {
        C42588rYk.collectOnLifecycle$default(fARcdN().AhwBna(), this, null, new NotificationCenterActivity$initViewModel$1(this, null), 2, null);
        C42588rYk.collectOnLifecycle$default(fARcdN().copydefault(), this, null, new NotificationCenterActivity$initViewModel$2(null), 2, null);
        C42588rYk.collectOnLifecycle$default(fARcdN().AYXKKw(), this, null, new NotificationCenterActivity$initViewModel$3(this, null), 2, null);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ NotificationCenterActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, NotificationCenterActivity notificationCenterActivity) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = notificationCenterActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.ejfBZ();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ NotificationCenterActivity EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, NotificationCenterActivity notificationCenterActivity) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = notificationCenterActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
        }
    }

    public final void ejfBZ() {
        if (!fARcdN().AhwBna().getValue().isEmpty()) {
            NotificationCenterSettingsBottomsheetFragment.Companion.AEQbTJ(fARcdN().AhwBna().getValue()).show(getSupportFragmentManager(), "NotificationCenterSettingsBottomsheetFragment");
        }
    }

    public final void values() {
        Handler handler;
        if (!C42590rYm.OLrzqt.copydefault(this) && fJNWhG()) {
            Runnable runnable = this.fetchVPNInfo;
            if (runnable != null && (handler = this.DbNXlk) != null) {
                handler.removeCallbacks(runnable);
            }
            this.DbNXlk = new Handler(Looper.getMainLooper());
            Runnable runnable2 = new Runnable() { // from class: o.say
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationCenterActivity.copydefault(this.KWHzl);
                }
            };
            this.fetchVPNInfo = runnable2;
            Handler handler2 = this.DbNXlk;
            if (handler2 != null) {
                handler2.postDelayed(runnable2, 500L);
            }
        }
    }

    public static final void copydefault(NotificationCenterActivity notificationCenterActivity) {
        if (!notificationCenterActivity.isFinishing() && !notificationCenterActivity.isDestroyed()) {
            NotificationPermissionReminderBottomsheetFragment.Companion.KWHzl().show(notificationCenterActivity.getSupportFragmentManager(), "NotificationPermissionReminder");
        }
        notificationCenterActivity.fetchVPNInfo = null;
    }

    public final boolean fJNWhG() {
        String uid;
        User userOLrzqt = fetchVPNInfo().OLrzqt();
        if (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) {
            uid = "logged_out_state";
        }
        long jOLrzqt = AkhnZx().OLrzqt("notification_permission_reminder_" + uid, 0L);
        if (jOLrzqt == 0) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        return jOLrzqt <= jCurrentTimeMillis - C59462zhW.gEmmrt(C59519zia.EZpvd(3, DurationUnit.DAYS));
    }

    @Override // o.AbstractActivityC44643sam, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Handler handler;
        super.onDestroy();
        Runnable runnable = this.fetchVPNInfo;
        if (runnable != null && (handler = this.DbNXlk) != null) {
            handler.removeCallbacks(runnable);
        }
        this.DbNXlk = null;
        this.fetchVPNInfo = null;
    }

    @Override // o.AbstractActivityC44643sam, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44643sam, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44643sam, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44643sam, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
