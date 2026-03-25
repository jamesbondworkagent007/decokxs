package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18072fbW {
    public static final InterfaceC18129fca EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.Iterator it = C59405zgS.EZpvd(fragment.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) new Function1() { // from class: o.fcf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18072fbW.OLrzqt((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof InterfaceC18129fca) {
                break;
            }
        }
        if (next instanceof InterfaceC18129fca) {
            return (InterfaceC18129fca) next;
        }
        return null;
    }

    public static final androidx.fragment.app.Fragment OLrzqt(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public static /* synthetic */ void pushSearchContainer$default(InterfaceC18129fca interfaceC18129fca, C55230xfy c55230xfy, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "WalletSearchContainerFragment";
        }
        AEQbTJ(interfaceC18129fca, c55230xfy, str, str2);
    }

    public static final void AEQbTJ(@NotNull InterfaceC18129fca interfaceC18129fca, @NotNull C55230xfy c55230xfy, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(interfaceC18129fca, "");
        Intrinsics.checkNotNullParameter(c55230xfy, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        interfaceC18129fca.copydefault(WalletSearchContainerFragment.Companion.OLrzqt(new WalletSearchContainerFragment.Config(false, "home", new WalletSearchContainerFragment.Config.DisplayOptions(str, true))), str2, C18132fcd.AEQbTJ(new WalletNavigator.Application(0, 0, 0, 0, false, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null), c55230xfy, str));
    }

    public static /* synthetic */ boolean clearBackStack$default(InterfaceC18129fca interfaceC18129fca, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return EZpvd(interfaceC18129fca, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean EZpvd(@NotNull InterfaceC18129fca interfaceC18129fca, boolean z) {
        boolean zPopBackStackImmediate;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objValueOf;
        Intrinsics.checkNotNullParameter(interfaceC18129fca, "");
        java.util.List<androidx.fragment.app.Fragment> fragments = interfaceC18129fca.EZpvd().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.util.Iterator<T> it = fragments.iterator();
        while (true) {
            zPopBackStackImmediate = true;
            if (!it.hasNext()) {
                break;
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) it.next();
            if ((fragment instanceof WalletNavigator) && fragment.isAdded() && ((WalletNavigator) fragment).EZpvd().getBackStackEntryCount() > 0) {
                try {
                    Result.Application application = Result.Companion;
                    if (z) {
                        objValueOf = java.lang.Boolean.valueOf(((WalletNavigator) fragment).EZpvd().popBackStackImmediate((java.lang.String) null, 1));
                    } else {
                        ((WalletNavigator) fragment).EZpvd().popBackStack((java.lang.String) null, 1);
                        objValueOf = Unit.INSTANCE;
                    }
                    objM7377constructorimpl2 = Result.m7377constructorimpl(objValueOf);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("WalletNavigator", "Failed to clear child backstack for " + fragment.getClass().getSimpleName(), thM7380exceptionOrNullimpl);
                }
            }
        }
        if (interfaceC18129fca.EZpvd().getBackStackEntryCount() <= 0) {
            return false;
        }
        try {
            Result.Application application3 = Result.Companion;
            if (z) {
                zPopBackStackImmediate = interfaceC18129fca.EZpvd().popBackStackImmediate((java.lang.String) null, 1);
            } else {
                interfaceC18129fca.EZpvd().popBackStack((java.lang.String) null, 1);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(zPopBackStackImmediate));
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl2 != null) {
            pUU.AEQbTJ("WalletNavigator", "Failed to clear backstack", thM7380exceptionOrNullimpl2);
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }
}
