package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.wallet.api.WalletDexService;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.xWN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kAz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27723kAz {
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static final gLC OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        for (androidx.fragment.app.Fragment parentFragment = fragment; parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof gLC) {
                return (gLC) parentFragment;
            }
        }
        return null;
    }

    public static final DexFragmentNavigator AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        gLC glcOLrzqt = OLrzqt(fragment);
        if (glcOLrzqt == null) {
            pUU.copydefault("DexFragmentNavigator", "No DexFragmentNavigator found in parent chain");
        }
        if (glcOLrzqt != null) {
            return glcOLrzqt.OLrzqt();
        }
        return null;
    }

    public static /* synthetic */ androidx.fragment.app.Fragment openWalletProfileAssetDetail$default(androidx.fragment.app.Fragment fragment, java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            arrayList = new java.util.ArrayList();
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return OLrzqt(fragment, str, arrayList, str2);
    }

    public static final androidx.fragment.app.Fragment OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull java.util.ArrayList<java.lang.Long> arrayList, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str2, "");
        androidx.fragment.app.Fragment fragmentCreateWalletProfileAssetDetailFragment$default = WalletDexService.Application.createWalletProfileAssetDetailFragment$default((WalletDexService) C43251rlk.copydefault(WalletDexService.class), str, arrayList, C33129mqd.valueOf(str2.length() == 0 ? Long.MIN_VALUE : str2), null, 8, null);
        fragmentCreateWalletProfileAssetDetailFragment$default.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.business.market.features.util.FragmentExtKt$openWalletProfileAssetDetail$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(false);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        });
        DexFragmentNavigator dexFragmentNavigatorAEQbTJ = AEQbTJ(fragment);
        if (dexFragmentNavigatorAEQbTJ != null) {
            dexFragmentNavigatorAEQbTJ.EZpvd(fragmentCreateWalletProfileAssetDetailFragment$default, (6 & 2) != 0 ? fragmentCreateWalletProfileAssetDetailFragment$default.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
        }
        return fragmentCreateWalletProfileAssetDetailFragment$default;
    }
}
