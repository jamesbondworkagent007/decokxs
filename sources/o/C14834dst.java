package o;

import com.okinc.business.defi.dapp.base.FragmentNavigator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dst, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14834dst extends AbstractC14835dsu {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final int copydefault = dLX.Application.AwvSrB;
    public androidx.fragment.app.Fragment AEQbTJ;
    public Function1<? super androidx.fragment.app.Fragment, Unit> EZpvd;
    public volatile boolean djBIcL;

    @Override // o.InterfaceC15111dyE
    public boolean az_() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return dLX.Fragment.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.dst$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dst.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final int AEQbTJ() {
            return C14834dst.copydefault;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dst$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C14834dst newInstance$default(Application application, androidx.fragment.app.Fragment fragment, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return application.OLrzqt(fragment, function1);
        }

        public final C14834dst OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, Function1<? super androidx.fragment.app.Fragment, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragment, "");
            C14834dst c14834dst = new C14834dst();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("child_fragment", fragment.getClass().getName());
            c14834dst.setArguments(bundle);
            c14834dst.AEQbTJ = fragment;
            c14834dst.EZpvd = function1;
            return c14834dst;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.Fragment fragment = this.AEQbTJ;
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().add(copydefault, fragment).commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            closeContainer$default(this, null, 1, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.djBIcL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    public static /* synthetic */ void closeContainer$default(C14834dst c14834dst, FragmentNavigator.Application application, int i, java.lang.Object obj) {
        c14834dst.EZpvd((i & 1) != 0 ? new FragmentNavigator.Application(0, 0, 0, 0, false, true, null, null, false, false, 976, null) : application);
    }

    public final void EZpvd(FragmentNavigator.Application application) {
        java.lang.Object objM7377constructorimpl;
        this.djBIcL = true;
        try {
            Result.Application application2 = Result.Companion;
            FragmentNavigator.StateListAnimator stateListAnimator = FragmentNavigator.Companion;
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(FragmentNavigator.StateListAnimator.from$default(stateListAnimator, parentFragmentManager, null, 2, null).OLrzqt(this, application)));
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(getTAG(), "closeContainer ===> " + thM7380exceptionOrNullimpl.getMessage());
        }
    }
}
