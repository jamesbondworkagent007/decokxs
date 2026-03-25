package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.net.bean.ScanStatusResponseBody;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fqr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18887fqr extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC16345eiF EZpvd;
    public java.lang.String OLrzqt = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String copydefault = "";

    /* JADX INFO: renamed from: o.fqr$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    public ActivityC18887fqr() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(C18865fqV.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.scan.MPCScanResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.scan.MPCScanResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.scan.MPCScanResultActivity$special$$inlined$viewModels$default$3
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

    public final C18865fqV AEQbTJ() {
        return (C18865fqV) this.AhwBna.getValue();
    }

    /* JADX INFO: renamed from: o.fqr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fqr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18887fqr.class);
            intent.putExtra("publicKey", str);
            intent.putExtra("mpcId", str2);
            intent.putExtra("userId", str3);
            context.startActivity(intent);
        }
    }

    private final void KWHzl() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("publicKey") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.OLrzqt = stringExtra;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra2 = intent2 != null ? intent2.getStringExtra("mpcId") : null;
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.AEQbTJ = stringExtra2;
        android.content.Intent intent3 = getIntent();
        java.lang.String stringExtra3 = intent3 != null ? intent3.getStringExtra("userId") : null;
        this.copydefault = stringExtra3 != null ? stringExtra3 : "";
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
        this.EZpvd = (AbstractC16345eiF) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QKudOq);
        java.lang.String strOLrzqt = C18853fqJ.Companion.OLrzqt();
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.markerClass, C56424yEw.AYXKKw(C56390yDp.OLrzqt("acctname", strOLrzqt)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fbC)), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strOLrzqt, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strOLrzqt, 0, false, 6, (java.lang.Object) null) + strOLrzqt.length(), 33);
        AbstractC16345eiF abstractC16345eiF = this.EZpvd;
        AbstractC16345eiF abstractC16345eiF2 = null;
        if (abstractC16345eiF == null) {
            Intrinsics.gEmmrt("");
            abstractC16345eiF = null;
        }
        abstractC16345eiF.AhwBna.setText(spannableStringBuilder);
        AbstractC16345eiF abstractC16345eiF3 = this.EZpvd;
        if (abstractC16345eiF3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16345eiF3 = null;
        }
        abstractC16345eiF3.EZpvd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ActivityC18887fqr.KWHzl(this.EZpvd, compoundButton, z);
            }
        });
        AbstractC16345eiF abstractC16345eiF4 = this.EZpvd;
        if (abstractC16345eiF4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16345eiF4 = null;
        }
        abstractC16345eiF4.AEQbTJ.setBackListener(new View.OnClickListener() { // from class: o.fqt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18887fqr.KWHzl(this.copydefault, view);
            }
        });
        AbstractC16345eiF abstractC16345eiF5 = this.EZpvd;
        if (abstractC16345eiF5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16345eiF5 = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16345eiF5.OLrzqt);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        addDisposable(C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.fqw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18887fqr.AEQbTJ(this.KWHzl, obj);
            }
        }));
        AbstractC16345eiF abstractC16345eiF6 = this.EZpvd;
        if (abstractC16345eiF6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16345eiF2 = abstractC16345eiF6;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(abstractC16345eiF2.KWHzl).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        addDisposable(C58156yvv.copydefault(abstractC58247yxgThrottleFirst2, this).subscribe(new InterfaceC58227yxM() { // from class: o.fqs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18887fqr.copydefault(this.KWHzl, obj);
            }
        }));
        EZpvd();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18887fqr.copydefault(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(ActivityC18887fqr activityC18887fqr, android.widget.CompoundButton compoundButton, boolean z) {
        AbstractC16345eiF abstractC16345eiF = activityC18887fqr.EZpvd;
        if (abstractC16345eiF == null) {
            Intrinsics.gEmmrt("");
            abstractC16345eiF = null;
        }
        abstractC16345eiF.KWHzl.setEnabled(z);
    }

    public static final void KWHzl(ActivityC18887fqr activityC18887fqr, android.view.View view) {
        activityC18887fqr.onBackPressed();
    }

    public static final void AEQbTJ(ActivityC18887fqr activityC18887fqr, java.lang.Object obj) {
        activityC18887fqr.onBackPressed();
    }

    public static final void copydefault(final ActivityC18887fqr activityC18887fqr, java.lang.Object obj) {
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC18887fqr.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14461dlr(supportFragmentManager, "mpcScan", new Function1() { // from class: o.fqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC18887fqr.copydefault(this.AEQbTJ, (java.lang.String) obj2);
            }
        }, null, null, false, 56, null).EZpvd();
    }

    public static final Unit copydefault(ActivityC18887fqr activityC18887fqr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18887fqr.showLoadingAtOnce();
        activityC18887fqr.AEQbTJ().EZpvd(str, activityC18887fqr.AEQbTJ, activityC18887fqr.copydefault, activityC18887fqr.OLrzqt);
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC18887fqr activityC18887fqr) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18887fqr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        java.lang.String strEZpvd = C18853fqJ.Companion.EZpvd();
        if (strEZpvd.length() == 0) {
            strEZpvd = dZP.OLrzqt.EZpvd();
        }
        showLoadingAtOnce();
        AbstractC58185ywX<ResponseData<ScanStatusResponseBody>> abstractC58185ywXKWHzl = AEQbTJ().KWHzl(this.AEQbTJ, strEZpvd, this.OLrzqt, 1);
        final Function1 function1 = new Function1() { // from class: o.fqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18887fqr.KWHzl(this.OLrzqt, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<ScanStatusResponseBody>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18887fqr.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18887fqr.OLrzqt(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fqu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18887fqr.OLrzqt(function12, obj);
            }
        }));
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC18887fqr activityC18887fqr, ResponseData responseData) {
        activityC18887fqr.dismissLoading();
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC18887fqr activityC18887fqr, java.lang.Throwable th) {
        activityC18887fqr.dismissLoading();
        super.onBackPressed();
        return Unit.INSTANCE;
    }

    private final void EZpvd() {
        AEQbTJ().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.fqx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18887fqr.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC18887fqr activityC18887fqr, java.lang.Boolean bool) {
        if (bool == null) {
            return Unit.INSTANCE;
        }
        activityC18887fqr.dismissLoading();
        if (bool.booleanValue()) {
            activityC18887fqr.finish();
        }
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
