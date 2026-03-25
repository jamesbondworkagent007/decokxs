package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.debugtool.passkeyselfcheck.PasskeySelfCheckActivity$appendCredentialList$1;
import com.okinc.auth.impl.debugtool.passkeyselfcheck.PasskeySelfCheckViewModel;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC5718aBk extends AbstractActivityC5719aBl {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm djBIcL;
    public C8270aza valueOf;

    /* JADX INFO: renamed from: o.aBk$Activity */
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
    public final java.lang.String EZpvd(boolean z) {
        return z ? " true " : " false ";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault(boolean z) {
        return z ? " Compatible " : " Incompatible ";
    }

    public ActivityC5718aBk() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(PasskeySelfCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.debugtool.passkeyselfcheck.PasskeySelfCheckActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.debugtool.passkeyselfcheck.PasskeySelfCheckActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.debugtool.passkeyselfcheck.PasskeySelfCheckActivity$special$$inlined$viewModels$default$3
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

    public final PasskeySelfCheckViewModel AhwBna() {
        return (PasskeySelfCheckViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractActivityC5719aBl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C8270aza c8270azaEZpvd = C8270aza.EZpvd(getLayoutInflater());
        this.valueOf = c8270azaEZpvd;
        if (c8270azaEZpvd == null) {
            Intrinsics.gEmmrt("");
            c8270azaEZpvd = null;
        }
        setContentView(c8270azaEZpvd.getRoot());
        AYXKKw();
        gEmmrt();
        djBIcL();
        AhwBna().EZpvd();
    }

    public final void AYXKKw() {
        C8270aza c8270aza = this.valueOf;
        if (c8270aza == null) {
            Intrinsics.gEmmrt("");
            c8270aza = null;
        }
        c8270aza.AEQbTJ.setTitle("Passkey Self Check");
    }

    private final void gEmmrt() {
        AhwBna().OLrzqt().observe(this, new Activity(new Function1() { // from class: o.aBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC5718aBk.EZpvd(this.copydefault, (C5725aBr) obj);
            }
        }));
        AhwBna().KWHzl().observe(this, new Activity(new Function1() { // from class: o.aBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC5718aBk.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit EZpvd(ActivityC5718aBk activityC5718aBk, C5725aBr c5725aBr) {
        Intrinsics.copydefault(c5725aBr);
        activityC5718aBk.KWHzl(c5725aBr);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC5718aBk activityC5718aBk, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC5718aBk.showLoadingAtOnce();
        } else {
            activityC5718aBk.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        C8270aza c8270aza = this.valueOf;
        if (c8270aza == null) {
            Intrinsics.gEmmrt("");
            c8270aza = null;
        }
        C52794wYp c52794wYp = c8270aza.DbNXlk;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public final void KWHzl(C5725aBr c5725aBr) {
        C8270aza c8270aza = this.valueOf;
        C8270aza c8270aza2 = null;
        if (c8270aza == null) {
            Intrinsics.gEmmrt("");
            c8270aza = null;
        }
        android.widget.TextView textView = c8270aza.copydefault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Android Version: " + c5725aBr.copydefault());
        sb.append('\n');
        sb.append("Manufacturer & Model: " + c5725aBr.ejfBZ() + " - " + c5725aBr.djBIcL());
        sb.append('\n');
        textView.setText(sb.toString());
        C8270aza c8270aza3 = this.valueOf;
        if (c8270aza3 == null) {
            Intrinsics.gEmmrt("");
            c8270aza3 = null;
        }
        c8270aza3.DbNXlk.setText(c5725aBr.AhwBna().toString());
        C8270aza c8270aza4 = this.valueOf;
        if (c8270aza4 == null) {
            Intrinsics.gEmmrt("");
            c8270aza4 = null;
        }
        c8270aza4.KWHzl.setTitle("Credential Manager: " + copydefault(c5725aBr.valueOf()));
        C8270aza c8270aza5 = this.valueOf;
        if (c8270aza5 == null) {
            Intrinsics.gEmmrt("");
            c8270aza5 = null;
        }
        android.widget.TextView textView2 = c8270aza5.OLrzqt;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("Credential Manager AB: Always ON");
        sb2.append('\n');
        sb2.append("Android SDK ≥34: " + EZpvd(c5725aBr.KWHzl()));
        sb2.append('\n');
        sb2.append("Context Credential Service: " + EZpvd(c5725aBr.AYXKKw()));
        sb2.append('\n');
        sb2.append("China IP Detected: " + EZpvd(c5725aBr.OLrzqt()) + " ( China IP Bypass AB: " + EZpvd(c5725aBr.AEQbTJ()) + " )");
        sb2.append('\n');
        sb2.append("> Xiaomi AB: " + EZpvd(c5725aBr.getFieldNames()) + " & Is Xiaomi: " + EZpvd(c5725aBr.zsXlph()));
        sb2.append('\n');
        sb2.append("> Oppo AB: " + EZpvd(c5725aBr.AuCTel()) + " & Oversea AB: " + EZpvd(c5725aBr.uzCIH()) + " & Is Oppo: " + EZpvd(c5725aBr.wlaJM()));
        sb2.append('\n');
        textView2.setText(sb2.toString());
        C8270aza c8270aza6 = this.valueOf;
        if (c8270aza6 == null) {
            Intrinsics.gEmmrt("");
            c8270aza6 = null;
        }
        c8270aza6.djBIcL.setTitle("Google Fido2: " + copydefault(c5725aBr.fetchVPNInfo()));
        C8270aza c8270aza7 = this.valueOf;
        if (c8270aza7 == null) {
            Intrinsics.gEmmrt("");
            c8270aza7 = null;
        }
        c8270aza7.djBIcL.setDescription("Click to check Google Play Service");
        C8270aza c8270aza8 = this.valueOf;
        if (c8270aza8 == null) {
            Intrinsics.gEmmrt("");
            c8270aza8 = null;
        }
        OKRegularCell oKRegularCell = c8270aza8.djBIcL;
        oKRegularCell.setOnClickListener(new ActionBar(oKRegularCell, 1000L, this));
        C8270aza c8270aza9 = this.valueOf;
        if (c8270aza9 == null) {
            Intrinsics.gEmmrt("");
            c8270aza9 = null;
        }
        android.widget.TextView textView3 = c8270aza9.AhwBna;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append("State: " + c5725aBr.values());
        sb3.append('\n');
        sb3.append("- Android SDK ≥N: " + c5725aBr.fARcdN());
        sb3.append('\n');
        sb3.append("- China IP Detected: " + EZpvd(c5725aBr.OLrzqt()) + " ( China IP Bypass AB: " + EZpvd(c5725aBr.AEQbTJ()) + " )");
        sb3.append('\n');
        java.lang.String strEZpvd = EZpvd(c5725aBr.iwGUEr());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append("- Screen Lock Setup: ");
        sb4.append(strEZpvd);
        sb3.append(sb4.toString());
        sb3.append('\n');
        sb3.append("- Google Play Services: " + EZpvd(c5725aBr.fIwbmz()));
        sb3.append('\n');
        sb3.append("- Device SDK Support: " + EZpvd(c5725aBr.fJNWhG()));
        sb3.append('\n');
        textView3.setText(sb3.toString());
        C8270aza c8270aza10 = this.valueOf;
        if (c8270aza10 == null) {
            Intrinsics.gEmmrt("");
            c8270aza10 = null;
        }
        c8270aza10.AYXKKw.setTitle("OKX Passkey v1/v2: " + copydefault(c5725aBr.AkhnZx()));
        C8270aza c8270aza11 = this.valueOf;
        if (c8270aza11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c8270aza2 = c8270aza11;
        }
        android.widget.TextView textView4 = c8270aza2.gEmmrt;
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append("Version: v1");
        sb5.append('\n');
        sb5.append("State: " + copydefault(c5725aBr.gEmmrt()));
        sb5.append('\n');
        sb5.append("- Strong Biometric compatible: " + c5725aBr.EZpvd());
        sb5.append('\n');
        boolean zAuCTelauCTel = c5725aBr.AuCTelauCTel();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("- Strong Biometric enrolled: ");
        sb6.append(!zAuCTelauCTel);
        sb5.append(sb6.toString());
        sb5.append('\n');
        boolean newProxyInstance = c5725aBr.getNewProxyInstance();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append("- Hardware Compatible: ");
        sb7.append(!newProxyInstance);
        sb5.append(sb7.toString());
        sb5.append('\n');
        boolean zHDKMBd = c5725aBr.hDKMBd();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append("- Android version compatible: ");
        sb8.append(!zHDKMBd);
        sb5.append(sb8.toString());
        sb5.append('\n');
        sb5.append("---------------------------------------------------");
        sb5.append('\n');
        sb5.append("Version: v2");
        sb5.append('\n');
        sb5.append("State: " + copydefault(c5725aBr.DbNXlk()));
        sb5.append('\n');
        sb5.append("- Greyscale: " + c5725aBr.isConnected());
        sb5.append('\n');
        textView4.setText(sb5.toString());
        KWHzl();
    }

    public final java.lang.String copydefault(java.lang.Object obj) {
        java.lang.String string;
        if (obj == null || (string = obj.toString()) == null) {
            string = AbstractJsonLexerKt.NULL;
        }
        return StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringAfterLast$default(string, '.', (java.lang.String) null, 2, (java.lang.Object) null), '$', (java.lang.String) null, 2, (java.lang.Object) null), '@', (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PasskeySelfCheckActivity$appendCredentialList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.aBk$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC5718aBk OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC5718aBk activityC5718aBk) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = activityC5718aBk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                try {
                    android.net.Uri uri = android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.gms");
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    this.OLrzqt.startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
                } catch (java.lang.Exception e) {
                    pUU.copydefault("URL", "No app can handle this URL: https://play.google.com/store/apps/details?id=com.google.android.gms: " + e.getMessage());
                    java.lang.String message = e.getMessage();
                    if (message != null) {
                        C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.aBk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC5718aBk KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC5718aBk activityC5718aBk) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC5718aBk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AhwBna().EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.aBk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC5718aBk.class);
        }
    }

    @Override // o.AbstractActivityC5719aBl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC5719aBl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC5719aBl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC5719aBl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
