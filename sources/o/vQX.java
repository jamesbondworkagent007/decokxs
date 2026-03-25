package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class vQX extends AbstractC49945uyC<uUQ, EmptyPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final int copydefault = C48033uCm.Activity.bindToGooglePlayService;
    public float AEQbTJ = 0.98f;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.vQT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vQX.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vQY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vQX.isConnected();
        }
    });

    public static final boolean EZpvd(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ uUQ OLrzqt(vQX vqx) {
        return vqx.values();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vQX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ vQX newInstance$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return actionBar.copydefault(str);
        }

        public final vQX copydefault(java.lang.String str) {
            vQX vqx = new vQX();
            vqx.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("PreSelectedTabKey", str)));
            return vqx;
        }
    }

    public final java.lang.String fIwbmz() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String copydefault(vQX vqx) {
        android.os.Bundle arguments = vqx.getArguments();
        if (arguments != null) {
            return arguments.getString("PreSelectedTabKey");
        }
        return null;
    }

    private final java.util.List<vPZ> fJNWhG() {
        return (java.util.List) this.KWHzl.getValue();
    }

    public static final java.util.List isConnected() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new vPZ("trailing_grid", C33070mpX.AYXKKw(C55688xof.Application.handleMediaPlayPauseKeySingleTapIfPending)));
        listOLrzqt.add(new vPZ("trigger_condition", C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallback)));
        listOLrzqt.add(new vPZ("tp_sl", C33070mpX.AYXKKw(C55688xof.Application.onCommand)));
        if (!C56071xvr.gEmmrt.ejfBZ() && ((interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) == null || !interfaceC55881xsMCopydefault.EZpvd())) {
            listOLrzqt.add(new vPZ("SmartEarn", C33070mpX.AYXKKw(C48033uCm.Fragment.DzCpqu)));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                vQX.OLrzqt(vQX.this).copydefault.setCurrentItem(tab.getPosition());
            }
        }
    }

    private final void AuCTel() {
        values().OLrzqt.AEQbTJ(new TaskDescription());
        values().copydefault.setAdapter(new C47976uAj(this, fJNWhG(), null, 4, null));
        new TabLayoutMediator(values().OLrzqt.copydefault(), values().copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vQW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                vQX.copydefault(this.EZpvd, tab, i);
            }
        }).attach();
        if (fIwbmz() != null) {
            java.util.Iterator<vPZ> it = fJNWhG().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().copydefault(), (java.lang.Object) fIwbmz())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                values().copydefault.setCurrentItem(i, false);
            }
        }
    }

    public static final void copydefault(vQX vqx, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return vQX.EZpvd(view);
            }
        });
        tab.setText(vqx.fJNWhG().get(i).AEQbTJ());
    }
}
