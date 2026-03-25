package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tKX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC46387tSl EZpvd;

    public tKX(@NotNull InterfaceC46387tSl interfaceC46387tSl) {
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        this.EZpvd = interfaceC46387tSl;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final tKX OLrzqt() {
            tKX tkxUfzxmz;
            synchronized (this) {
                tkxUfzxmz = tPF.copydefault.Ufzxmz();
            }
            return tkxUfzxmz;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tKX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openProfileEditPage$default(tKX tkx, FragmentActivity fragmentActivity, OrbitEditProfileScenario orbitEditProfileScenario, boolean z, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function2 = null;
        }
        tkx.AEQbTJ(fragmentActivity, orbitEditProfileScenario, z, function2);
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull OrbitEditProfileScenario orbitEditProfileScenario, boolean z, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(orbitEditProfileScenario, "");
        UserInfoService.Application.startEditProfileFlow$default((UserInfoService) C43251rlk.copydefault(UserInfoService.class), fragmentActivity, orbitEditProfileScenario.AEQbTJ(), null, new Application(fragmentActivity, function2, z, this), orbitEditProfileScenario.copydefault(), orbitEditProfileScenario.KWHzl(), orbitEditProfileScenario.OLrzqt(), 4, null);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application implements UserInfoService.Activity {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.String, Unit> EZpvd;
        public final /* synthetic */ tKX KWHzl;
        public final /* synthetic */ FragmentActivity OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(FragmentActivity fragmentActivity, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, boolean z, tKX tkx) {
            this.OLrzqt = fragmentActivity;
            this.EZpvd = function2;
            this.AEQbTJ = z;
            this.KWHzl = tkx;
        }
    }

    public static /* synthetic */ void upgrade2Orbiter$default(tKX tkx, FragmentActivity fragmentActivity, android.view.View view, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            view = null;
        }
        tkx.OLrzqt(fragmentActivity, view, z, function0);
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, android.view.View view, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!C46437tUh.OLrzqt.AEQbTJ()) {
            function0.invoke();
        } else if (this.EZpvd.AhwBna()) {
            function0.invoke();
        } else {
            ((tWL) C43251rlk.copydefault(tWL.class)).OLrzqt(fragmentActivity, view, z, new Function1() { // from class: o.tKV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tKX.EZpvd((kotlin.Pair) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.tKX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkProfileModified$default(tKX tkx, FragmentActivity fragmentActivity, OrbitEditProfileScenario orbitEditProfileScenario, boolean z, Function0 function0, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            orbitEditProfileScenario = OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl;
        }
        OrbitEditProfileScenario orbitEditProfileScenario2 = orbitEditProfileScenario;
        if ((i & 16) != 0) {
            function2 = null;
        }
        tkx.KWHzl(fragmentActivity, orbitEditProfileScenario2, z, function0, function2);
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull OrbitEditProfileScenario orbitEditProfileScenario, boolean z, @NotNull Function0<Unit> function0, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(orbitEditProfileScenario, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!C46437tUh.OLrzqt.AEQbTJ()) {
            function0.invoke();
        } else if (this.EZpvd.valueOf()) {
            function0.invoke();
        } else {
            AEQbTJ(fragmentActivity, orbitEditProfileScenario, z, function2);
        }
    }

    public final android.view.View copydefault(FragmentActivity fragmentActivity) {
        android.view.View childAt;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) fragmentActivity.findViewById(android.R.id.content);
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            return childAt;
        }
        if (viewGroup != null) {
            return viewGroup;
        }
        android.view.Window window = fragmentActivity.getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [136=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final OrbitEditProfileScenario copydefault(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1254885915:
                    if (str.equals("OrbitOnboarding")) {
                        return OrbitEditProfileScenario.OrbitOnboarding.AEQbTJ;
                    }
                    break;
                case -310873402:
                    if (str.equals("OrbitSetting")) {
                        return new OrbitEditProfileScenario.OrbitSetting(true);
                    }
                    break;
                case 1281258193:
                    if (str.equals("EnrollOrbiter")) {
                        return OrbitEditProfileScenario.EnrollOrbiter.AEQbTJ;
                    }
                    break;
                case 1626057963:
                    if (str.equals("CompleteOrbiterProfile")) {
                        return OrbitEditProfileScenario.CompleteOrbiterProfile.KWHzl;
                    }
                    break;
            }
        }
        return new OrbitEditProfileScenario.OrbitSetting(true);
    }
}
