package com.okinc.core.ok_app.homepage.lite;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.okinc.core.ok_app.homepage.lite.TabUIElementsManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C33160mrH;
import o.C55298xhM;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC33217msL;
import o.InterfaceC33218msM;
import o.InterfaceC33338mua;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TabUIElementsManager implements InterfaceC33218msM {
    public Lifecycle AYXKKw;
    public FrameLayout DbNXlk;
    public InterfaceC33338mua OLrzqt;
    public FragmentManager copydefault;
    public boolean djBIcL;
    public ObjectAnimator gEmmrt;
    public FrameLayout isConnected;
    public int valueOf;
    public final String EZpvd = "TabUIElementsManager";
    public final Map<String, InterfaceC33217msL> KWHzl = new LinkedHashMap();
    public final Map<String, InterfaceC33217msL> AEQbTJ = new LinkedHashMap();
    public StickyFooterAnimationState AhwBna = StickyFooterAnimationState.HIDDEN;

    public static final class TaskDescription implements View.OnLayoutChangeListener {
        public final /* synthetic */ Map EZpvd;
        public final /* synthetic */ String OLrzqt;

        public TaskDescription(Map map, String str) {
            this.EZpvd = map;
            this.OLrzqt = str;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            pUU.EZpvd(TabUIElementsManager.this.EZpvd, "Sticky footer layout done: " + view.getMeasuredHeight());
            InterfaceC33338mua interfaceC33338mua = (InterfaceC33338mua) this.EZpvd.get(this.OLrzqt);
            if (interfaceC33338mua != null) {
                interfaceC33338mua.OLrzqt(view);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StickyFooterAnimationState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ StickyFooterAnimationState[] $VALUES;
        public static final StickyFooterAnimationState SHOWING = new StickyFooterAnimationState("SHOWING", 0);
        public static final StickyFooterAnimationState SHOWN = new StickyFooterAnimationState("SHOWN", 1);
        public static final StickyFooterAnimationState HIDING = new StickyFooterAnimationState("HIDING", 2);
        public static final StickyFooterAnimationState HIDDEN = new StickyFooterAnimationState("HIDDEN", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ StickyFooterAnimationState[] $values() {
            return new StickyFooterAnimationState[]{SHOWING, SHOWN, HIDING, HIDDEN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<StickyFooterAnimationState> getEntries() {
            return $ENTRIES;
        }

        private StickyFooterAnimationState(String str, int i) {
        }

        static {
            StickyFooterAnimationState[] stickyFooterAnimationStateArr$values = $values();
            $VALUES = stickyFooterAnimationStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(stickyFooterAnimationStateArr$values);
        }

        public static StickyFooterAnimationState valueOf(String str) {
            return (StickyFooterAnimationState) Enum.valueOf(StickyFooterAnimationState.class, str);
        }

        public static StickyFooterAnimationState[] values() {
            return (StickyFooterAnimationState[]) $VALUES.clone();
        }
    }

    public final void OLrzqt(@NotNull FragmentManager fragmentManager, @NotNull FrameLayout frameLayout, @NotNull FrameLayout frameLayout2, @NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(frameLayout, "");
        Intrinsics.checkNotNullParameter(frameLayout2, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.copydefault = fragmentManager;
        this.DbNXlk = frameLayout;
        this.isConnected = frameLayout2;
        this.AYXKKw = lifecycle;
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.valueOf = C55298xhM.OLrzqt(2, context);
    }

    public final void OLrzqt(String str, @NotNull String str2, @NotNull Map<String, ? extends InterfaceC33338mua> map) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        KWHzl(str2, map);
        copydefault(str2, map);
        EZpvd(str, str2, map);
    }

    public final void EZpvd(String str, @NotNull String str2, @NotNull Map<String, ? extends InterfaceC33338mua> map) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC33338mua interfaceC33338mua = map.get(str);
        if (interfaceC33338mua != null) {
            interfaceC33338mua.gEmmrt();
        }
        InterfaceC33338mua interfaceC33338mua2 = map.get(str2);
        if (interfaceC33338mua2 != null) {
            interfaceC33338mua2.OLrzqt(this);
        }
        this.OLrzqt = interfaceC33338mua2;
    }

    public final void AEQbTJ() {
        ObjectAnimator objectAnimator = this.gEmmrt;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.gEmmrt = null;
        this.AhwBna = StickyFooterAnimationState.HIDDEN;
        InterfaceC33338mua interfaceC33338mua = this.OLrzqt;
        if (interfaceC33338mua != null) {
            interfaceC33338mua.gEmmrt();
        }
        this.OLrzqt = null;
        this.KWHzl.clear();
        this.AEQbTJ.clear();
        this.copydefault = null;
        this.DbNXlk = null;
        this.isConnected = null;
        this.AYXKKw = null;
    }

    public final void EZpvd(@NotNull Map<String, ? extends InterfaceC33338mua> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC33338mua) it.next()).gEmmrt();
        }
    }

    public final InterfaceC33217msL EZpvd(String str, Map<String, ? extends InterfaceC33338mua> map) {
        InterfaceC33217msL interfaceC33217msLValueOf;
        InterfaceC33338mua interfaceC33338mua = map.get(str);
        return (interfaceC33338mua == null || (interfaceC33217msLValueOf = interfaceC33338mua.valueOf()) == null) ? this.KWHzl.get(str) : interfaceC33217msLValueOf;
    }

    public final InterfaceC33217msL AEQbTJ(String str, Map<String, ? extends InterfaceC33338mua> map) {
        InterfaceC33217msL interfaceC33217msLAYXKKw;
        InterfaceC33338mua interfaceC33338mua = map.get(str);
        return (interfaceC33338mua == null || (interfaceC33217msLAYXKKw = interfaceC33338mua.AYXKKw()) == null) ? this.AEQbTJ.get(str) : interfaceC33217msLAYXKKw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.core.ok_app.homepage.lite.TabUIElementsManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateTopBar$default(TabUIElementsManager tabUIElementsManager, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        tabUIElementsManager.KWHzl(str, map);
    }

    public final void KWHzl(String str, Map<String, ? extends InterfaceC33338mua> map) {
        final FrameLayout frameLayout;
        FragmentManager fragmentManager = this.copydefault;
        if (fragmentManager == null || (frameLayout = this.DbNXlk) == null) {
            return;
        }
        Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(C33160mrH.StateListAnimator.AubY);
        if (fragmentFindFragmentById != null) {
            fragmentManager.beginTransaction().remove(fragmentFindFragmentById).runOnCommit(new Runnable() { // from class: o.mtS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    TabUIElementsManager.KWHzl(frameLayout);
                }
            }).commitAllowingStateLoss();
        }
        InterfaceC33217msL interfaceC33217msLEZpvd = EZpvd(str, map);
        Fragment fragmentEZpvd = interfaceC33217msLEZpvd != null ? interfaceC33217msLEZpvd.EZpvd() : null;
        pUU.KWHzl(this.EZpvd, "updateTopBar: pageId=" + str + ", shouldShow=" + (interfaceC33217msLEZpvd != null ? Boolean.valueOf(interfaceC33217msLEZpvd.KWHzl()) : null) + ", fragment=" + (fragmentEZpvd != null ? fragmentEZpvd.getClass().getSimpleName() : null));
        if (interfaceC33217msLEZpvd != null && interfaceC33217msLEZpvd.KWHzl() && fragmentEZpvd != null) {
            pUU.KWHzl(this.EZpvd, "updateTopBar: Adding fragment to container");
            fragmentManager.beginTransaction().replace(C33160mrH.StateListAnimator.AubY, fragmentEZpvd).runOnCommit(new Runnable() { // from class: o.mtZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    TabUIElementsManager.copydefault(frameLayout);
                }
            }).commitAllowingStateLoss();
        } else {
            pUU.KWHzl(this.EZpvd, "updateTopBar: NOT adding fragment");
        }
    }

    public static final void KWHzl(FrameLayout frameLayout) {
        frameLayout.setVisibility(8);
    }

    public static final void copydefault(FrameLayout frameLayout) {
        frameLayout.setVisibility(0);
    }

    public final void copydefault(final String str, final Map<String, ? extends InterfaceC33338mua> map) {
        final FrameLayout frameLayout;
        FragmentManager fragmentManager = this.copydefault;
        if (fragmentManager == null || (frameLayout = this.isConnected) == null) {
            return;
        }
        Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(C33160mrH.StateListAnimator.wlaJM);
        if (fragmentFindFragmentById != null) {
            fragmentManager.beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
        }
        frameLayout.setVisibility(8);
        this.djBIcL = false;
        InterfaceC33217msL interfaceC33217msLAEQbTJ = AEQbTJ(str, map);
        Fragment fragmentEZpvd = interfaceC33217msLAEQbTJ != null ? interfaceC33217msLAEQbTJ.EZpvd() : null;
        if (interfaceC33217msLAEQbTJ != null && interfaceC33217msLAEQbTJ.KWHzl() && fragmentEZpvd != null) {
            this.djBIcL = true;
            fragmentManager.beginTransaction().replace(C33160mrH.StateListAnimator.wlaJM, fragmentEZpvd).commitAllowingStateLoss();
            frameLayout.setVisibility(0);
            this.AhwBna = StickyFooterAnimationState.SHOWN;
            frameLayout.post(new Runnable() { // from class: o.mtU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    TabUIElementsManager.EZpvd(frameLayout, this, map, str);
                }
            });
            return;
        }
        this.AhwBna = StickyFooterAnimationState.HIDDEN;
    }

    public static final void EZpvd(FrameLayout frameLayout, TabUIElementsManager tabUIElementsManager, Map map, String str) {
        if (ViewCompat.isLaidOut(frameLayout) && !frameLayout.isLayoutRequested()) {
            pUU.EZpvd(tabUIElementsManager.EZpvd, "Sticky footer layout done: " + frameLayout.getMeasuredHeight());
            InterfaceC33338mua interfaceC33338mua = (InterfaceC33338mua) map.get(str);
            if (interfaceC33338mua != null) {
                interfaceC33338mua.OLrzqt(frameLayout);
                return;
            }
            return;
        }
        frameLayout.addOnLayoutChangeListener(tabUIElementsManager.new TaskDescription(map, str));
    }
}
