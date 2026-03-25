package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.group.info.GroupProfileActivityV2$collectPaymentEvents$1;
import com.okinc.im.imui.group.info.GroupProfileActivityV2$collectStandardEvents$1;
import com.okinc.im.imui.group.info.GroupProfileActivityV2$collectStandardEvents$2;
import com.okinc.im.imui.group.info.GroupProfileActivityV2$collectUiStates$1;
import com.okinc.im.imui.group.info.GroupProfileActivityV2$onActivityResult$1;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import com.okinc.im.imui.group.management.adapter.GroupSettingsAdapter;
import com.okinc.im.imui.group.management.registry.ProfileSettingKeys;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C55284xgz;
import o.nRV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nSR extends AbstractActivityC34146nTc<AbstractC33872nIz> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final int EZpvd;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nST
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nSR.AuCTel();
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nSV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nSR.gEmmrt(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.EZpvd;
    }

    public nSR() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(GroupProfileViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.info.GroupProfileActivityV2$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.info.GroupProfileActivityV2$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.info.GroupProfileActivityV2$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.nSY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                nSR.EZpvd(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nSR.djBIcL(this.AEQbTJ);
            }
        });
        this.EZpvd = C35399nuc.Dialog.getNewProxyInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupProfileViewModel AkhnZx() {
        return (GroupProfileViewModel) this.djBIcL.getValue();
    }

    private final GroupSettingsAdapter isConnected() {
        return (GroupSettingsAdapter) this.valueOf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupSettingsAdapter AuCTel() {
        return new GroupSettingsAdapter();
    }

    public final C34235nWl djBIcL() {
        return (C34235nWl) this.AYXKKw.getValue();
    }

    public static final C34235nWl gEmmrt(nSR nsr) {
        return new C34235nWl(nsr, nsr.AkhnZx());
    }

    public static final void EZpvd(nSR nsr, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.lang.String stringExtra = data != null ? data.getStringExtra("RESULT_KEY_SUCCESS_MESSAGE") : null;
            if (stringExtra == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stringExtra)) {
                return;
            }
            nsr.copydefault(stringExtra);
        }
    }

    public static final class ActionBar implements InterfaceC35282nsQ {
        public ActionBar() {
        }

        @Override // o.InterfaceC35282nsQ
        public void KWHzl(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            nSR.this.AkhnZx().OLrzqt(true);
        }
    }

    public final ActionBar valueOf() {
        return (ActionBar) this.AEQbTJ.getValue();
    }

    public static final ActionBar djBIcL(nSR nsr) {
        return nsr.new ActionBar();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nSR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) nSR.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("group_id", str)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC34146nTc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ejfBZ();
        fIwbmz();
    }

    @Override // o.AbstractActivityC34146nTc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C32866mlf.onEvent$default("IMChat_Full_Detail_View", (TrackChannel[]) null, new Function1() { // from class: o.nSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nSR.KWHzl(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C36597odv.registerIMSimpleMessageEventManager$default(C36597odv.KWHzl, valueOf(), AkhnZx().AYXKKw(), null, 4, null);
    }

    public static final Unit KWHzl(nSR nsr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "channel_id", C33129mqd.gEmmrt(nsr.AkhnZx().AYXKKw()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_type", "0", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC34146nTc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        C36597odv.KWHzl.OLrzqt(valueOf());
        super.onPause();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        AbstractC33872nIz abstractC33872nIz = (AbstractC33872nIz) KWHzl();
        wYC wyc = abstractC33872nIz.KWHzl;
        wyc.setOnClickListener(new Activity(wyc, 1000L, this));
        android.widget.ImageView imageView = abstractC33872nIz.EZpvd;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        abstractC33872nIz.gEmmrt.setRetry(C33070mpX.AYXKKw(C35399nuc.LoaderManager.isConnected));
        abstractC33872nIz.gEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.nSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nSR.AEQbTJ(this.AEQbTJ, view);
            }
        });
        abstractC33872nIz.AhwBna.setAdapter(isConnected());
    }

    public static final void AEQbTJ(nSR nsr, android.view.View view) {
        nsr.AkhnZx().OLrzqt(true);
    }

    private final void fIwbmz() {
        AhwBna();
        gEmmrt();
        OLrzqt();
    }

    public final void AhwBna() {
        C37721ozF.collectOnLifecycle$default(AkhnZx().AhwBna(), this, (Lifecycle.State) null, new GroupProfileActivityV2$collectUiStates$1(this, null), 2, (java.lang.Object) null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ nSR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, nSR nsr) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = nsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.getOnBackPressedDispatcher().onBackPressed();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ nSR KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, nSR nsr) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = nsr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                nRV.StateListAnimator stateListAnimator = nRV.Companion;
                nSR nsr = this.KWHzl;
                this.KWHzl.OLrzqt.launch(stateListAnimator.OLrzqt(nsr, nsr.AkhnZx().djBIcL()));
            }
        }
    }

    public final void gEmmrt() {
        C37721ozF.collectOnLifecycle$default(AkhnZx().valueOf(), this, (Lifecycle.State) null, new GroupProfileActivityV2$collectStandardEvents$1(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AkhnZx().gEmmrt(), this, (Lifecycle.State) null, new GroupProfileActivityV2$collectStandardEvents$2(this, null), 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        C37721ozF.collectOnLifecycle$default(AkhnZx().AEQbTJ(), this, (Lifecycle.State) null, new GroupProfileActivityV2$collectPaymentEvents$1(this, null), 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(C34150nTg c34150nTg) {
        android.widget.ImageView imageView = ((AbstractC33872nIz) KWHzl()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c34150nTg.KWHzl() ? 0 : 8);
        java.util.List<ProfileSettingKeys> listCopydefault = c34150nTg.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            C35694oAf c35694oAfKWHzl = djBIcL().KWHzl((ProfileSettingKeys) it.next());
            if (c35694oAfKWHzl != null) {
                arrayList.add(c35694oAfKWHzl);
            }
        }
        isConnected().KWHzl(arrayList);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        GroupInfo groupInfoDjBIcL = AkhnZx().djBIcL();
        if (i != 1 || i2 != -1 || intent == null || groupInfoDjBIcL == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupProfileActivityV2$onActivityResult$1(groupInfoDjBIcL, intent, this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.lang.String str) {
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.view.View root = ((AbstractC33872nIz) KWHzl()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C55284xgz c55284xgzKWHzl = activity.KWHzl(root, str);
        if (c55284xgzKWHzl != null) {
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    public final void AYXKKw() {
        nSO nsoKWHzl = nSO.Companion.KWHzl();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        nsoKWHzl.show(supportFragmentManager);
    }

    @Override // o.AbstractActivityC34146nTc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34146nTc, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
