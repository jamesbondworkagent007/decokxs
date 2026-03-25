package o;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41304qoL {
    public static volatile boolean OLrzqt;
    public static volatile boolean copydefault;
    public static final C41304qoL KWHzl = new C41304qoL();
    public static final int AEQbTJ = 8;

    private C41304qoL() {
    }

    public static /* synthetic */ void dismiss$default(C41304qoL c41304qoL, androidx.fragment.app.Fragment fragment, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c41304qoL.OLrzqt(fragment, z);
    }

    public final void OLrzqt(@NotNull final androidx.fragment.app.Fragment fragment, boolean z) {
        final androidx.fragment.app.FragmentManager childFragmentManager;
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(fragment, "");
        if (copydefault || OLrzqt) {
            C41298qoF.w$default(C41298qoF.AEQbTJ, "MarketTwoLevelHelper", "dismiss ignored: operation in progress, isShowing=" + copydefault + ", isDismissing=" + OLrzqt, null, 4, null);
            return;
        }
        OLrzqt = true;
        try {
            C41298qoF c41298qoF = C41298qoF.AEQbTJ;
            c41298qoF.EZpvd("MarketTwoLevelHelper", "dismiss MarketsPage");
            InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
            if (interfaceC49317umK != null) {
                int iCopydefault = interfaceC49317umK.copydefault();
                androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null) {
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
                    if (!fragment.isVisible() && !z) {
                        c41298qoF.EZpvd("MarketTwoLevelHelper", "MarketDiscoverTwoLevelFragment is not visible, no need to dismiss");
                        return;
                    }
                    fragmentTransactionBeginTransaction.setCustomAnimations(0, C52761wXj.Application.fARcdN);
                    fragmentTransactionBeginTransaction.hide(fragment);
                    fragmentTransactionBeginTransaction.setMaxLifecycle(fragment, Lifecycle.State.STARTED);
                    c41298qoF.EZpvd("MarketTwoLevelHelper", "hide TwoLevelPage: " + fragment.getTag());
                    java.util.List<androidx.fragment.app.Fragment> fragments = childFragmentManager.getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments, "");
                    java.util.Iterator<T> it = fragments.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) next;
                        if ((fragment2 instanceof AbstractC43061riF) && ((AbstractC43061riF) fragment2).getView() != null) {
                            android.view.View view = ((AbstractC43061riF) fragment2).getView();
                            java.lang.Object parent = view != null ? view.getParent() : null;
                            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                            if (view2 != null && view2.getId() == iCopydefault) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    androidx.fragment.app.Fragment fragment3 = (androidx.fragment.app.Fragment) obj;
                    C41298qoF c41298qoF2 = C41298qoF.AEQbTJ;
                    c41298qoF2.EZpvd("MarketTwoLevelHelper", "hide OriginFragment");
                    if (fragment3 == null || fragmentTransactionBeginTransaction.setMaxLifecycle(fragment3, Lifecycle.State.RESUMED) == null) {
                        C41298qoF.w$default(c41298qoF2, "MarketTwoLevelHelper", "No originFragment found in container", null, 4, null);
                        Unit unit = Unit.INSTANCE;
                    }
                    fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                    android.view.View view3 = fragment.getView();
                    if (view3 != null) {
                        view3.postDelayed(new java.lang.Runnable() { // from class: o.qoM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                C41304qoL.EZpvd(fragment, childFragmentManager);
                            }
                        }, 250L);
                    }
                }
            }
        } finally {
            OLrzqt = false;
        }
    }

    public static final void EZpvd(androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager) {
        try {
            if (!fragment.isAdded()) {
                C41298qoF.AEQbTJ.EZpvd("MarketTwoLevelHelper", "skip remove: fragment state changed or show operation in progress");
            } else {
                fragmentManager.beginTransaction().remove(fragment).commitNowAllowingStateLoss();
                C41298qoF.AEQbTJ.EZpvd("MarketTwoLevelHelper", "remove TwoLevelPage after animation: " + fragment.getTag());
            }
        } catch (java.lang.Exception e) {
            C41298qoF.AEQbTJ.AEQbTJ("MarketTwoLevelHelper", "Failed to remove fragment after animation", e);
        }
    }
}
