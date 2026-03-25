package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtActivity$collectDataList$1;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtActivity$initView$1$1$1$2;
import com.okinc.business.defi.wallet.home.walletconnect.WalletConnectedData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C15935eaT;
import o.C16058eck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18287ffZ extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AbstractC16333ehu AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX INFO: renamed from: o.ffZ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ffZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18287ffZ.class);
            intent.putExtra("walletId", str);
            return intent;
        }
    }

    public ActivityC18287ffZ() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(C18345fge.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.fga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18287ffZ.AEQbTJ();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectConnectionMgmtActivity$special$$inlined$viewModels$default$3
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

    public final C18345fge copydefault() {
        return (C18345fge) this.KWHzl.getValue();
    }

    public static final C18345fge copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C18345fge(WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null), C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null), C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16333ehu abstractC16333ehuEZpvd = AbstractC16333ehu.EZpvd(getLayoutInflater());
        this.AEQbTJ = abstractC16333ehuEZpvd;
        if (abstractC16333ehuEZpvd == null) {
            Intrinsics.gEmmrt("");
            abstractC16333ehuEZpvd = null;
        }
        setContentView(abstractC16333ehuEZpvd.getRoot());
        EZpvd();
        OLrzqt();
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletConnectConnectionMgmtActivity$collectDataList$1(this, null), 3, null);
    }

    private final void OLrzqt() {
        AbstractC16333ehu abstractC16333ehu = this.AEQbTJ;
        if (abstractC16333ehu == null) {
            Intrinsics.gEmmrt("");
            abstractC16333ehu = null;
        }
        abstractC16333ehu.copydefault.setTitleTypeface("harmony_sans_bold.ttf");
        RecyclerView recyclerView = abstractC16333ehu.AEQbTJ;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C43316rmw c43316rmw = this.copydefault;
        c43316rmw.register(WalletConnectedData.class, new Activity(WalletConnectConnectionMgmtActivity$initView$1$1$1$2.INSTANCE));
        recyclerView.setAdapter(c43316rmw);
        C52794wYp c52794wYp = abstractC16333ehu.EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.ffZ$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity extends AbstractC19608gIr<WalletConnectedData, C16916esu> {
        public Activity(WalletConnectConnectionMgmtActivity$initView$1$1$1$2 walletConnectConnectionMgmtActivity$initView$1$1$1$2) {
            super(walletConnectConnectionMgmtActivity$initView$1$1$1$2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
        @Override // o.AbstractC19608gIr
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(C16916esu c16916esu, WalletConnectedData walletConnectedData) {
            Intrinsics.checkNotNullParameter(c16916esu, "");
            Intrinsics.checkNotNullParameter(walletConnectedData, "");
            ActivityC18287ffZ activityC18287ffZ = ActivityC18287ffZ.this;
            android.widget.ImageView imageView = c16916esu.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14725dqq.loadFixSizeBorderImage$default(imageView, walletConnectedData.getIconUrl(), C13754dXa.Activity.aKErDB, 0.0f, 44.0f, 0, false, 48, null);
            c16916esu.KWHzl.setText(walletConnectedData.getName());
            c16916esu.AhwBna.setText(walletConnectedData.getUrl());
            ConstraintLayout root = c16916esu.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, walletConnectedData, activityC18287ffZ));
            AppCompatImageView appCompatImageView = c16916esu.copydefault;
            appCompatImageView.setOnClickListener(new ViewOnClickListenerC0850Activity(appCompatImageView, 1000L, activityC18287ffZ, walletConnectedData));
        }

        /* JADX INFO: renamed from: o.ffZ$Activity$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ WalletConnectedData EZpvd;
            public final /* synthetic */ ActivityC18287ffZ KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, WalletConnectedData walletConnectedData, ActivityC18287ffZ activityC18287ffZ) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.EZpvd = walletConnectedData;
                this.KWHzl = activityC18287ffZ;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    int connectType = this.EZpvd.getConnectType();
                    if (connectType == 2 || connectType == 3) {
                        C16070ecw c16070ecwAEQbTJ = C16070ecw.Companion.AEQbTJ(this.EZpvd.getConnectType(), this.EZpvd.getTopicOrClientId());
                        androidx.fragment.app.FragmentManager supportFragmentManager = this.KWHzl.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        c16070ecwAEQbTJ.show(supportFragmentManager);
                        return;
                    }
                    C18348fgh c18348fghEZpvd = C18348fgh.Companion.EZpvd(this.EZpvd.getTopicOrClientId());
                    androidx.fragment.app.FragmentManager supportFragmentManager2 = this.KWHzl.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    c18348fghEZpvd.show(supportFragmentManager2);
                }
            }
        }

        /* JADX INFO: renamed from: o.ffZ$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0850Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ ActivityC18287ffZ OLrzqt;
            public final /* synthetic */ WalletConnectedData copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0850Activity(android.view.View view, long j, ActivityC18287ffZ activityC18287ffZ, WalletConnectedData walletConnectedData) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.OLrzqt = activityC18287ffZ;
                this.copydefault = walletConnectedData;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.OLrzqt.copydefault().copydefault(this.copydefault);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory AEQbTJ() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C18345fge.class), new Function1() { // from class: o.fgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18287ffZ.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    /* JADX INFO: renamed from: o.ffZ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC18287ffZ AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC18287ffZ activityC18287ffZ) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC18287ffZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.showLoading();
                this.AEQbTJ.copydefault().AEQbTJ();
            }
        }
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
