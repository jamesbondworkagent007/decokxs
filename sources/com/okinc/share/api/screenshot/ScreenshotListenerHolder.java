package com.okinc.share.api.screenshot;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.okinc.share.bean.MultiShareConfig;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48972ufk;
import o.C56427yEz;
import o.InterfaceC48970ufi;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ScreenshotListenerHolder {
    public static final ScreenshotListenerHolder KWHzl = new ScreenshotListenerHolder();
    public static final LinkedHashMap<String, ValueHolder> EZpvd = new LinkedHashMap<>();
    public static final int OLrzqt = 8;

    private ScreenshotListenerHolder() {
    }

    public final void OLrzqt(@NotNull Fragment fragment, @NotNull InterfaceC48970ufi interfaceC48970ufi) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC48970ufi, "");
        String strEZpvd = EZpvd(fragment);
        LinkedHashMap<String, ValueHolder> linkedHashMap = EZpvd;
        if (linkedHashMap.get(strEZpvd) == null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.registerFragmentLifecycleCallbacks(new Application(), false);
            boolean zIsResumed = fragment.isResumed();
            linkedHashMap.put(strEZpvd, new ValueHolder(zIsResumed, interfaceC48970ufi));
            pUU.EZpvd("ScreenshotListenerHolder", "installScreenshotListener:" + EZpvd(fragment) + " isResumed:" + zIsResumed + " size:" + linkedHashMap.size());
        }
    }

    public static final class Application extends FragmentManager.FragmentLifecycleCallbacks {
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            String strEZpvd = ScreenshotListenerHolder.KWHzl.EZpvd(fragment);
            ValueHolder valueHolder = (ValueHolder) ScreenshotListenerHolder.EZpvd.remove(strEZpvd);
            if (valueHolder != null) {
                valueHolder.setActivated(true);
                ScreenshotListenerHolder.EZpvd.put(strEZpvd, valueHolder);
                pUU.EZpvd("ScreenshotListenerHolder", "onFragmentResumed->Activated:" + strEZpvd + "  remainSize:" + ScreenshotListenerHolder.EZpvd.size());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentPaused(fragmentManager, fragment);
            String strEZpvd = ScreenshotListenerHolder.KWHzl.EZpvd(fragment);
            ValueHolder valueHolder = (ValueHolder) ScreenshotListenerHolder.EZpvd.get(strEZpvd);
            if (valueHolder != null) {
                valueHolder.setActivated(false);
                pUU.KWHzl("ScreenshotListenerHolder", "onFragmentPaused->Inactivated:" + strEZpvd + "  size:" + ScreenshotListenerHolder.EZpvd.size());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            String strEZpvd = ScreenshotListenerHolder.KWHzl.EZpvd(fragment);
            if (ScreenshotListenerHolder.EZpvd.containsKey(strEZpvd)) {
                ScreenshotListenerHolder.EZpvd.remove(strEZpvd);
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                pUU.EZpvd("ScreenshotListenerHolder", "onFragmentDestroyed->Removed:" + strEZpvd + "  size:" + ScreenshotListenerHolder.EZpvd.size());
            }
        }
    }

    public final InterfaceC48970ufi AEQbTJ() {
        LinkedHashMap<String, ValueHolder> linkedHashMap = EZpvd;
        Pair pair = (Pair) CollectionsKt___CollectionsKt.wlaJM(C56427yEz.AkhnZx(linkedHashMap));
        String str = pair != null ? (String) pair.getFirst() : null;
        pUU.KWHzl("ScreenshotListenerHolder", "findActivatedListener->lastFragment:" + str + " size:" + linkedHashMap.size());
        if (pair == null) {
            return null;
        }
        InterfaceC48970ufi listener = ((ValueHolder) pair.getSecond()).isActivated() ? ((ValueHolder) pair.getSecond()).getListener() : null;
        pUU.EZpvd("ScreenshotListenerHolder", "findActivatedListener:" + listener + "  isActivated:" + ((ValueHolder) pair.getSecond()).isActivated());
        return listener;
    }

    public final void EZpvd(@NotNull C48972ufk c48972ufk, @NotNull Function1<? super MultiShareConfig, Unit> function1) {
        Intrinsics.checkNotNullParameter(c48972ufk, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC48970ufi interfaceC48970ufiAEQbTJ = AEQbTJ();
        if (interfaceC48970ufiAEQbTJ != null) {
            try {
                interfaceC48970ufiAEQbTJ.KWHzl(c48972ufk, function1);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                pUU.copydefault("ScreenshotListenerHolder", "notifyOnScreenshot-> occur error:" + e.getMessage());
                return;
            }
        }
        pUU.copydefault("ScreenshotListenerHolder", "notifyOnScreenshot-> empty activated fragments:" + EZpvd);
    }

    public final String EZpvd(Fragment fragment) {
        return fragment.getClass().getName() + "@" + fragment.hashCode();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ValueHolder {
        public static final int $stable = 8;
        private boolean isActivated;
        private InterfaceC48970ufi listener;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC48970ufi getListener() {
            return this.listener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isActivated() {
            return this.isActivated;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setActivated(boolean z) {
            this.isActivated = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setListener(@NotNull InterfaceC48970ufi interfaceC48970ufi) {
            Intrinsics.checkNotNullParameter(interfaceC48970ufi, "");
            this.listener = interfaceC48970ufi;
        }

        public ValueHolder(boolean z, @NotNull InterfaceC48970ufi interfaceC48970ufi) {
            Intrinsics.checkNotNullParameter(interfaceC48970ufi, "");
            this.isActivated = z;
            this.listener = interfaceC48970ufi;
        }
    }
}
