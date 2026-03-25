package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.im.imui.group.members.GroupMembersActivity$initViewModel$1;
import com.okinc.im.imui.group.members.GroupMembersActivity$initViewModel$2;
import com.okinc.im.imui.group.members.GroupMembersActivity$initViewModel$3;
import com.okinc.im.imui.group.members.GroupMembersActivity$initViewModel$4;
import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.nXY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nWQ extends AbstractActivityC34256nXf<AbstractC33869nIw> implements nXY.ActionBar {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm djBIcL;
    public C35626nys gEmmrt;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nXc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nWQ.fetchVPNInfo(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nWZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(nWQ.AuCTel(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nXb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nWQ.ejfBZ(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nXa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nWQ.fARcdN(this.EZpvd);
        }
    });
    public final int KWHzl = C35399nuc.Dialog.getFieldNames;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.KWHzl;
    }

    public nWQ() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(GroupMemberListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.members.GroupMembersActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.members.GroupMembersActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.members.GroupMembersActivity$special$$inlined$viewModels$default$3
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

    private final GroupMemberListViewModel AkhnZx() {
        return (GroupMemberListViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String fetchVPNInfo(nWQ nwq) {
        java.lang.String stringExtra = nwq.getIntent().getStringExtra("ARG_GROUP_ID");
        return stringExtra == null ? "" : stringExtra;
    }

    private final boolean ejfBZ() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean AuCTel(nWQ nwq) {
        return nwq.getIntent().getBooleanExtra("ARG_IS_VIP_GROUP", false);
    }

    /* JADX DEBUG: Possible override for method o.nXf.OLrzqt()V */
    public final nXW OLrzqt() {
        return (nXW) this.valueOf.getValue();
    }

    public static final nXW ejfBZ(nWQ nwq) {
        androidx.fragment.app.FragmentManager supportFragmentManager = nwq.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Lifecycle lifecycle = nwq.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        return new nXW(supportFragmentManager, lifecycle, nwq.ejfBZ());
    }

    /* JADX DEBUG: Possible override for method o.nXf.EZpvd()V */
    public final nXY EZpvd() {
        return (nXY) this.AYXKKw.getValue();
    }

    public static final nXY fARcdN(nWQ nwq) {
        nXY nxy = new nXY();
        nxy.KWHzl(nwq);
        return nxy;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nWQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) nWQ.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_GROUP_ID", str), C56390yDp.OLrzqt("ARG_IS_VIP_GROUP", java.lang.Boolean.valueOf(z))));
            return intent;
        }
    }

    @Override // o.AbstractActivityC34256nXf, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        fJNWhG();
        AYXKKw();
        DbNXlk();
        AkhnZx().OLrzqt(fetchVPNInfo());
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        C35626nys c35626nys = this.gEmmrt;
        if (c35626nys != null) {
            c35626nys.dismissAllowingStateLoss();
        }
        super.onStop();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        android.view.View next;
        AbstractC33869nIw abstractC33869nIw = (AbstractC33869nIw) KWHzl();
        C33606mzd.copydefault(abstractC33869nIw.AYXKKw.KWHzl(), this, new Function1() { // from class: o.nWT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nWQ.KWHzl(this.EZpvd, (java.lang.CharSequence) obj);
            }
        });
        wYC wyc = abstractC33869nIw.KWHzl;
        wyc.setOnClickListener(new Application(wyc, 1000L, this));
        abstractC33869nIw.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nWU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nWQ.EZpvd(this.copydefault, view);
            }
        });
        abstractC33869nIw.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nWQ.AYXKKw(this.KWHzl, view);
            }
        });
        C52794wYp c52794wYp = abstractC33869nIw.OLrzqt;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        C55173xeu c55173xeu = abstractC33869nIw.AkhnZx;
        c55173xeu.setRetry(C33070mpX.AYXKKw(C35399nuc.LoaderManager.isConnected));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.nWV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nWQ.OLrzqt(this.KWHzl, view);
            }
        });
        abstractC33869nIw.AhwBna.setAdapter(EZpvd());
        ViewPager2 viewPager2 = abstractC33869nIw.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(viewPager2).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof RecyclerView) {
                    break;
                }
            }
        }
        android.view.View view = next;
        if (view != null) {
            view.setOverScrollMode(2);
        }
        abstractC33869nIw.fIwbmz.setAdapter(OLrzqt());
        abstractC33869nIw.fIwbmz.setOffscreenPageLimit(10);
        new TabLayoutMediator(abstractC33869nIw.djBIcL, abstractC33869nIw.fIwbmz, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.nXd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                nWQ.EZpvd(this.KWHzl, tab, i);
            }
        }).attach();
    }

    public static final Unit KWHzl(nWQ nwq, java.lang.CharSequence charSequence) {
        nwq.AkhnZx().copydefault(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(charSequence)).toString());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(nWQ nwq, android.view.View view) {
        nwq.AkhnZx().KWHzl(true);
    }

    public static final void AYXKKw(nWQ nwq, android.view.View view) {
        nwq.AkhnZx().KWHzl(false);
    }

    public static final void OLrzqt(nWQ nwq, android.view.View view) {
        GroupMemberListViewModel.refreshGroupMemberInfo$default(nwq.AkhnZx(), null, 1, null);
    }

    public static final void EZpvd(nWQ nwq, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        C54989xbV c54989xbV = new C54989xbV(nwq, null, 0, 6, null);
        c54989xbV.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c54989xbV.setStyle(0);
        c54989xbV.setOKDSSize(-5);
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        textViewEZpvd.setId(android.view.View.generateViewId());
        textViewEZpvd.setText(nwq.OLrzqt().EZpvd(i));
        tab.setCustomView(c54989xbV);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ nWQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, nWQ nwq) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = nwq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.getOnBackPressedDispatcher().onBackPressed();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ nWQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, nWQ nwq) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = nwq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.djBIcL();
            }
        }
    }

    public final void AYXKKw() {
        for (Map.Entry entry : C56424yEw.gEmmrt(C56390yDp.OLrzqt("REQUEST_KEY_DISMISSED", new Function0() { // from class: o.nWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nWQ.AkhnZx(this.AEQbTJ);
            }
        }), C56390yDp.OLrzqt("REQUEST_KEY_MEMBER_REMOVED", new Function0() { // from class: o.nWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nWQ.isConnected(this.EZpvd);
            }
        })).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            final Function0 function0 = (Function0) entry.getValue();
            getSupportFragmentManager().setFragmentResultListener(str, this, new FragmentResultListener() { // from class: o.nWY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                    nWQ.KWHzl(function0, str2, bundle);
                }
            });
        }
    }

    public static final Unit AkhnZx(nWQ nwq) {
        nwq.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(nWQ nwq) {
        nwq.valueOf();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function0 function0, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        function0.invoke();
    }

    private final void DbNXlk() {
        C37721ozF.collectOnLifecycle$default(AkhnZx().valueOf(), this, (Lifecycle.State) null, new GroupMembersActivity$initViewModel$1(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AkhnZx().OLrzqt(), this, (Lifecycle.State) null, new GroupMembersActivity$initViewModel$2(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AkhnZx().AYXKKw(), this, (Lifecycle.State) null, new GroupMembersActivity$initViewModel$3(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(AkhnZx().EZpvd(), this, (Lifecycle.State) null, new GroupMembersActivity$initViewModel$4(this, null), 2, (java.lang.Object) null);
    }

    @Override // o.nXY.ActionBar
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AkhnZx().OLrzqt(str, false);
    }

    public final void djBIcL() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.EZpvd(C35399nuc.Fragment.isConnected, AkhnZx().EZpvd().getValue().size()));
        viewOnClickListenerC54939xaY.copydefault(AkhnZx().gEmmrt() ? C35399nuc.LoaderManager.OKvQBs : C35399nuc.LoaderManager.htlTjW);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.USBtdM, new View.OnClickListener() { // from class: o.nWP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nWQ.OLrzqt(viewOnClickListenerC54939xaY, this, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35399nuc.LoaderManager.iwGUEr, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, nWQ nwq, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        nwq.AkhnZx().DbNXlk();
    }

    public final void AhwBna() {
        C35626nys c35626nys = this.gEmmrt;
        AkhnZx().EZpvd(c35626nys != null ? c35626nys.EZpvd() : null);
    }

    public final void valueOf() {
        C33764nEz.startIMChat$default(C33764nEz.OLrzqt, this, fetchVPNInfo(), null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    @Override // o.AbstractActivityC34256nXf, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34256nXf, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34256nXf, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34256nXf, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
