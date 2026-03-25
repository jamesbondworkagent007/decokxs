package o;

import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tvu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47747tvu extends androidx.fragment.app.Fragment {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public tNW EZpvd;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tvw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47747tvu.gEmmrt();
        }
    });
    public final java.util.Map<PlanetPublisherPluginType, android.view.View> valueOf = new LinkedHashMap();
    public final java.util.Set<PlanetPublisherPluginType> OLrzqt = new LinkedHashSet();

    private final C47736tvj AYXKKw() {
        return (C47736tvj) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C47736tvj gEmmrt() {
        return tPF.copydefault.akftKQ();
    }

    public final tNW copydefault() {
        tNW tnw = this.EZpvd;
        Intrinsics.copydefault(tnw);
        return tnw;
    }

    /* JADX INFO: renamed from: o.tvu$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tvu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C47747tvu newInstance$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return taskDescription.AEQbTJ(z);
        }

        public final C47747tvu AEQbTJ(boolean z) {
            C47747tvu c47747tvu = new C47747tvu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("test_mode", z);
            c47747tvu.setArguments(bundle);
            return c47747tvu;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.EZpvd = tNW.OLrzqt(layoutInflater, viewGroup, false);
        android.widget.LinearLayout root = copydefault().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw().OLrzqt(new Function2() { // from class: o.tvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C47747tvu.copydefault(this.KWHzl, (PlanetPublisherPluginType) obj, (android.view.View) obj2);
            }
        });
        KWHzl();
        view.post(new java.lang.Runnable() { // from class: o.tvC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47747tvu.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final Unit copydefault(C47747tvu c47747tvu, PlanetPublisherPluginType planetPublisherPluginType, android.view.View view) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        Intrinsics.checkNotNullParameter(view, "");
        try {
            pUU.EZpvd("PluginShortcutFragment", "Received shortcut view for plugin: " + planetPublisherPluginType.getValue());
            c47747tvu.copydefault().EZpvd.addView(view);
            c47747tvu.valueOf.put(planetPublisherPluginType, view);
            if (c47747tvu.OLrzqt.contains(planetPublisherPluginType)) {
                view.setVisibility(8);
                pUU.EZpvd("PluginShortcutFragment", "Applied pending hide for plugin: " + planetPublisherPluginType.getValue());
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PluginShortcutFragment", "Failed to add shortcut view", e);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C47747tvu c47747tvu) {
        if (c47747tvu.AEQbTJ) {
            return;
        }
        c47747tvu.AEQbTJ = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47747tvu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AYXKKw().KWHzl();
        this.EZpvd = null;
    }

    public final void KWHzl() {
        try {
            pUU.EZpvd("PluginShortcutFragment", "Loading plugin shortcuts");
            android.os.Bundle arguments = getArguments();
            boolean z = arguments != null ? arguments.getBoolean("test_mode", false) : false;
            pUU.EZpvd("PluginShortcutFragment", "Test mode: " + z);
            java.util.List<tWX> listAEQbTJ = AYXKKw().AEQbTJ(z);
            if (listAEQbTJ.isEmpty()) {
                pUU.EZpvd("PluginShortcutFragment", "No plugins support shortcuts (testMode: " + z + ")");
                copydefault().getRoot().setVisibility(8);
                return;
            }
            pUU.EZpvd("PluginShortcutFragment", "Found " + listAEQbTJ.size() + " plugins with shortcuts (testMode: " + z + ")");
            copydefault().EZpvd.removeAllViews();
            this.valueOf.clear();
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                EZpvd((tWX) it.next());
            }
            copydefault().getRoot().setVisibility(0);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PluginShortcutFragment", "Failed to load plugin shortcuts", e);
            copydefault().getRoot().setVisibility(8);
        }
    }

    public final void EZpvd(tWX twx) {
        try {
            pUU.EZpvd("PluginShortcutFragment", "Loading shortcut for plugin: " + twx.EZpvd().getValue());
            C47736tvj c47736tvjAYXKKw = AYXKKw();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c47736tvjAYXKKw.EZpvd(contextRequireContext, parentFragmentManager, twx.EZpvd());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PluginShortcutFragment", "Failed to load shortcut for plugin: " + twx.EZpvd().getValue(), e);
        }
    }

    public final void OLrzqt() {
        try {
            pUU.EZpvd("PluginShortcutFragment", "Hiding all shortcuts");
            java.util.Iterator<T> it = this.valueOf.values().iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setVisibility(8);
            }
            this.OLrzqt.addAll(this.valueOf.keySet());
            pUU.EZpvd("PluginShortcutFragment", "Successfully hid all shortcuts (" + this.valueOf.size() + " views)");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PluginShortcutFragment", "Failed to hide shortcuts", e);
        }
    }

    public final void AEQbTJ() {
        try {
            pUU.EZpvd("PluginShortcutFragment", "Showing all shortcuts");
            this.OLrzqt.clear();
            java.util.Iterator<T> it = this.valueOf.values().iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setVisibility(0);
            }
            pUU.EZpvd("PluginShortcutFragment", "Successfully showed all shortcuts");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PluginShortcutFragment", "Failed to show all shortcuts", e);
        }
    }
}
