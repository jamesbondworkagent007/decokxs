package com.okinc.im.imui.broadcastmessages;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractActivityC35387nuQ;
import o.C33860nIn;
import o.C35377nuF;
import o.C35389nuS;
import o.C35399nuc;
import o.C35461nvm;
import o.C35467nvs;
import o.C35474nvz;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessagesActivity extends AbstractActivityC35387nuQ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public C33860nIn AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C35377nuF.KWHzl(this);
    public final InterfaceC56387yDm OLrzqt;

    @yCM
    public C35389nuS broadcastMessagesMenuProvider;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;

    public BroadcastMessagesActivity() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(BroadcastMessagesActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$3
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
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(C35461nvm.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$6
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
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C35474nvz.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity$special$$inlined$viewModels$default$9
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

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.broadcastmessages.BroadcastMessagesActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final Intent AEQbTJ(@NotNull Context context, @NotNull BroadcastMessagePageParam broadcastMessagePageParam) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(broadcastMessagePageParam, "");
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) BroadcastMessagesActivity.class);
            intent.putExtras(C35377nuF.OLrzqt(broadcastMessagePageParam));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.nuQ.EZpvd()V */
    public final C35389nuS EZpvd() {
        C35389nuS c35389nuS = this.broadcastMessagesMenuProvider;
        if (c35389nuS != null) {
            return c35389nuS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final BroadcastMessagePageParam values() {
        return (BroadcastMessagePageParam) this.EZpvd.getValue();
    }

    public final BroadcastMessagesActivityViewModel KWHzl() {
        return (BroadcastMessagesActivityViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C35461nvm isConnected() {
        return (C35461nvm) this.copydefault.getValue();
    }

    /* JADX DEBUG: Possible override for method o.nuQ.AEQbTJ()V */
    public final C35474nvz AEQbTJ() {
        return (C35474nvz) this.OLrzqt.getValue();
    }

    public final void OLrzqt(BroadcastMessagePageParam broadcastMessagePageParam) {
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.ORmwhf, C35467nvs.Companion.KWHzl(broadcastMessagePageParam)).commitAllowingStateLoss();
    }

    @Override // o.AbstractActivityC35387nuQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeMenuProvider(EZpvd());
        this.AEQbTJ = null;
    }

    public final void valueOf() {
        C33860nIn c33860nIn = this.AEQbTJ;
        if (c33860nIn != null) {
            Toolbar toolbar = c33860nIn.KWHzl;
            Intrinsics.checkNotNullExpressionValue(toolbar, "");
            setupActionBarTitle(toolbar, c33860nIn.OLrzqt, getString(C35399nuc.LoaderManager.RJOkX));
        }
    }

    public final void AYXKKw() {
        addMenuProvider(EZpvd());
    }

    public final void gEmmrt() {
        BroadcastMessagePageParam broadcastMessagePageParamValues = values();
        if (broadcastMessagePageParamValues == null) {
            setResult(0);
            finish();
        } else {
            OLrzqt(broadcastMessagePageParamValues);
        }
    }

    public final void OLrzqt() {
        FlowKt.launchIn(FlowKt.onEach(KWHzl().EZpvd(), new BroadcastMessagesActivity$onConsumeViewModel$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(KWHzl().OLrzqt(), new BroadcastMessagesActivity$onConsumeViewModel$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(KWHzl().AEQbTJ(), new BroadcastMessagesActivity$onConsumeViewModel$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public static final class Application extends OnBackPressedCallback {
        public Application() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            BroadcastMessagesActivity.this.KWHzl().OLrzqt(BroadcastMessagesActivity.this.isConnected().copydefault(), BroadcastMessagesActivity.this.AEQbTJ().OLrzqt());
        }
    }

    public final void djBIcL() {
        getOnBackPressedDispatcher().addCallback(this, new Application());
    }

    @Override // o.AbstractActivityC35387nuQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33860nIn c33860nInAEQbTJ = C33860nIn.AEQbTJ(getLayoutInflater());
        this.AEQbTJ = c33860nInAEQbTJ;
        setContentView(c33860nInAEQbTJ != null ? c33860nInAEQbTJ.getRoot() : null);
        valueOf();
        AYXKKw();
        OLrzqt();
        gEmmrt();
        djBIcL();
        getWindow().getDecorView().post(new Runnable() { // from class: o.nuG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                BroadcastMessagesActivity.KWHzl(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(BroadcastMessagesActivity broadcastMessagesActivity) {
        rVN.reportFullyDrawn$default((Activity) broadcastMessagesActivity, true, (String) null, 2, (Object) null);
    }

    @Override // o.AbstractActivityC35387nuQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC35387nuQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC35387nuQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC35387nuQ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
