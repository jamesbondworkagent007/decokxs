package com.okinc.core.ok_app.configuration;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.core.ok_app.api.configuration.Scenario;
import com.okinc.core.ok_app.configuration.ConfigLoadingActivity;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractActivityC33226msU;
import o.AbstractC43238rlX;
import o.C32979mnm;
import o.C33070mpX;
import o.C33129mqd;
import o.C33160mrH;
import o.C33285mta;
import o.C33286mtb;
import o.C33289mte;
import o.C33293mti;
import o.C43246rlf;
import o.C43251rlk;
import o.C52794wYp;
import o.C54819xWm;
import o.C55178xez;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C58113yvE;
import o.C59449zhJ;
import o.InterfaceC33170mrR;
import o.InterfaceC33171mrS;
import o.InterfaceC33231msZ;
import o.InterfaceC35205nqt;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ConfigLoadingActivity extends AbstractActivityC33226msU implements InterfaceC33170mrR {
    public C33289mte KWHzl;

    @yCM
    public C33286mtb configEventCheckUseCase;

    @yCM
    public C33285mta configManager;

    @yCM
    public C33293mti languageSyncConfigUseCase;

    @yCM
    public InterfaceC33171mrS okAppService;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final AtomicBoolean OLrzqt = new AtomicBoolean(false);

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C33289mte c33289mte) {
        Intrinsics.checkNotNullParameter(c33289mte, "");
        this.KWHzl = c33289mte;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.configuration.ConfigLoadingActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            KWHzl().set(true);
            context.startActivity(copydefault(context));
            pUU.KWHzl("ConfigManager Loading", "start ConfigLoadingActivity");
        }

        public final Intent copydefault(Context context) {
            Intent intent = new Intent(context, (Class<?>) ConfigLoadingActivity.class);
            intent.setFlags(335544320);
            return intent;
        }

        public final AtomicBoolean KWHzl() {
            return ConfigLoadingActivity.OLrzqt;
        }
    }

    public final C33285mta djBIcL() {
        C33285mta c33285mta = this.configManager;
        if (c33285mta != null) {
            return c33285mta;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C33293mti valueOf() {
        C33293mti c33293mti = this.languageSyncConfigUseCase;
        if (c33293mti != null) {
            return c33293mti;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC33171mrS gEmmrt() {
        InterfaceC33171mrS interfaceC33171mrS = this.okAppService;
        if (interfaceC33171mrS != null) {
            return interfaceC33171mrS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C33286mtb AYXKKw() {
        C33286mtb c33286mtb = this.configEventCheckUseCase;
        if (c33286mtb != null) {
            return c33286mtb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C33289mte OLrzqt() {
        C33289mte c33289mte = this.KWHzl;
        if (c33289mte != null) {
            return c33289mte;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        pUU.KWHzl("ConfigManager Loading", "onNewIntent");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.configuration.ConfigLoadingActivity$onNewIntent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfigLoadingActivity.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow<Unit> mutableSharedFlowAhwBna = ConfigLoadingActivity.this.djBIcL().AhwBna();
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (mutableSharedFlowAhwBna.emit(unit, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractActivityC33226msU, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().getDecorView();
        super.onCreate(bundle);
        OLrzqt(C33289mte.EZpvd(getLayoutInflater()));
        setContentView(OLrzqt().getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(OLrzqt().KWHzl, new OnApplyWindowInsetsListener() { // from class: o.msS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ConfigLoadingActivity.OLrzqt(view, windowInsetsCompat);
            }
        });
        djBIcL().OLrzqt().observe(this, new Application(new Function1() { // from class: o.msQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConfigLoadingActivity.EZpvd(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        AhwBna();
        EZpvd(System.currentTimeMillis());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new Function1() { // from class: o.msT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConfigLoadingActivity.KWHzl((OnBackPressedCallback) obj);
            }
        }, 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass4(null), 3, null);
        AEQbTJ();
    }

    public static final WindowInsetsCompat OLrzqt(View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    public static final Unit EZpvd(ConfigLoadingActivity configLoadingActivity, Integer num) {
        String strAYXKKw;
        TextView textView = configLoadingActivity.OLrzqt().OLrzqt;
        if (num != null && num.intValue() == 0) {
            strAYXKKw = "";
        } else {
            Intrinsics.copydefault(num);
            strAYXKKw = C33070mpX.AYXKKw(num.intValue());
        }
        textView.setText(strAYXKKw);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.core.ok_app.configuration.ConfigLoadingActivity$onCreate$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfigLoadingActivity.this.new AnonymousClass4(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow<Unit> mutableSharedFlowAhwBna = ConfigLoadingActivity.this.djBIcL().AhwBna();
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (mutableSharedFlowAhwBna.emit(unit, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(long j) {
        FlowKt.launchIn(FlowKt.onEach(djBIcL().AYXKKw(), new ConfigLoadingActivity$listenFinishEvent$1(j, this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final String AEQbTJ(String str, Integer num) {
        return (num == null || !EZpvd(num.intValue())) ? str : C59449zhJ.replaceFirst$default(str, "exchange", DeeplinkMode.PAY.getMode(), false, 4, (Object) null);
    }

    public final boolean KWHzl() {
        boolean z;
        List<WeakReference<android.app.Activity>> listKWHzl = C32979mnm.EZpvd.KWHzl();
        if ((listKWHzl instanceof Collection) && listKWHzl.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                ComponentCallbacks2 componentCallbacks2 = (android.app.Activity) ((WeakReference) it.next()).get();
                if ((componentCallbacks2 instanceof InterfaceC35205nqt) && ((InterfaceC35205nqt) componentCallbacks2).AwvSrB()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        pUU.KWHzl("ConfigManager Loading", "checkHaveHomePage: " + z);
        return z;
    }

    @Override // o.AbstractActivityC33226msU, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AEQbTJ();
    }

    @Override // o.AbstractActivityC33226msU, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        OLrzqt.set(false);
        pUU.KWHzl("ConfigManager Loading", "onDestroy loading activity");
        super.onDestroy();
    }

    public final void AhwBna() {
        OLrzqt().AEQbTJ.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.msN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ConfigLoadingActivity.EZpvd(this.OLrzqt, view);
            }
        });
        OLrzqt().AEQbTJ.OLrzqt().setType(5);
        C52794wYp c52794wYpCopydefault = OLrzqt().AEQbTJ.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.values));
        }
        C52794wYp c52794wYpCopydefault2 = OLrzqt().AEQbTJ.OLrzqt().copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.msP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ConfigLoadingActivity.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
        FlowKt.launchIn(FlowKt.onEach(djBIcL().djBIcL(), new ConfigLoadingActivity$initRetryView$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public static final void EZpvd(ConfigLoadingActivity configLoadingActivity, View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(configLoadingActivity), null, null, new ConfigLoadingActivity$initRetryView$1$1(configLoadingActivity, null), 3, null);
        configLoadingActivity.finish();
    }

    public static final void AEQbTJ(ConfigLoadingActivity configLoadingActivity, View view) {
        configLoadingActivity.copydefault(false);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(configLoadingActivity), null, null, new ConfigLoadingActivity$initRetryView$2$1(configLoadingActivity, null), 3, null);
    }

    public final void copydefault(boolean z) {
        Group group = OLrzqt().copydefault;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ^ true ? 0 : 8);
        C55178xez c55178xez = OLrzqt().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55178xez, "");
        c55178xez.setVisibility(z ? 0 : 8);
        OLrzqt().AEQbTJ.AEQbTJ().setVisibility(8);
    }

    public final void AEQbTJ() {
        if (isFinishing()) {
            pUU.KWHzl("ConfigManager", "ConfigLoadingActivity is finishing");
            return;
        }
        Iterator<T> it = C32979mnm.EZpvd.KWHzl().iterator();
        boolean z = false;
        while (it.hasNext()) {
            android.app.Activity activity = (android.app.Activity) ((WeakReference) it.next()).get();
            if (z) {
                pUU.KWHzl("ConfigManager", "ConfigLoadingActivity is covered by " + activity);
                if (activity != null) {
                    activity.finish();
                }
            }
            if (Intrinsics.EZpvd(activity, this)) {
                pUU.KWHzl("ConfigManager", "bring configLoadingActivity to top");
                z = true;
            }
        }
    }

    public final boolean EZpvd(int i) {
        boolean zCopydefault = gEmmrt().copydefault(i);
        pUU.KWHzl("ConfigManager Loading", "target Mode: " + i + ", can switch: " + zCopydefault + "}");
        return zCopydefault;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription implements Function1<Boolean, Unit> {
        public final InterfaceC56387yDm KWHzl;
        public final Scenario OLrzqt;
        public final InterfaceC56387yDm copydefault;

        public TaskDescription(@NotNull Scenario scenario) {
            Intrinsics.checkNotNullParameter(scenario, "");
            this.OLrzqt = scenario;
            this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.msR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ConfigLoadingActivity.TaskDescription.KWHzl();
                }
            });
            this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.msX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ConfigLoadingActivity.TaskDescription.AEQbTJ();
                }
            });
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            AEQbTJ(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public static final InterfaceC43294rma KWHzl() {
            return (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        }

        public final InterfaceC43294rma OLrzqt() {
            return (InterfaceC43294rma) this.KWHzl.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C33285mta AYXKKw() {
            return (C33285mta) this.copydefault.getValue();
        }

        public static final C33285mta AEQbTJ() {
            return ((InterfaceC33231msZ) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC33231msZ.class)).flVtFt();
        }

        public void AEQbTJ(boolean z) {
            LifecycleCoroutineScope lifecycleScope;
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return;
            }
            AEQbTJ(activityAEQbTJ, this.OLrzqt.EZpvd());
            AppCompatActivity appCompatActivity = activityAEQbTJ instanceof AppCompatActivity ? (AppCompatActivity) activityAEQbTJ : null;
            if (appCompatActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new ConfigLoadingActivity$FinishCallback$invoke$1(this, null), 3, null);
        }

        public final void AEQbTJ(android.app.Activity activity, String str) {
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                pUU.KWHzl("ConfigManager Loading", "handle deeplink: " + str);
                InterfaceC43294rma.Application.processDeeplink$default(OLrzqt(), activity, str, null, null, false, new Function1() { // from class: o.msW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ConfigLoadingActivity.TaskDescription.KWHzl((AbstractC43238rlX) obj);
                    }
                }, 12, null);
            }
        }

        public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            pUU.KWHzl("ConfigManager Loading", "deeplink process: " + abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractActivityC33226msU, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33226msU, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33226msU, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
