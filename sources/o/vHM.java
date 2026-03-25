package o;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class vHM extends AbstractC49945uyC<uUQ, EmptyPresenter> {
    public final int OLrzqt = C48033uCm.Activity.bindToGooglePlayService;
    public final float copydefault = 0.98f;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vHN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vHM.isConnected();
        }
    });

    public static final boolean OLrzqt(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    public static final /* synthetic */ uUQ KWHzl(vHM vhm) {
        return vhm.values();
    }

    private final java.util.List<vFZ> ejfBZ() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    public static final java.util.List isConnected() {
        return yDY.gEmmrt(new vFZ("trigger", C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatCallback)), new vFZ("tp_sl", C33070mpX.AYXKKw(C55688xof.Application.onCommand)), new vFZ("start_build", C33070mpX.AYXKKw(C55688xof.Application.addCancellableCallbackactivity_release)));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    public static final class Application implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                vHM.KWHzl(vHM.this).copydefault.setCurrentItem(tab.getPosition());
            }
        }
    }

    private final void fARcdN() {
        values().OLrzqt.AEQbTJ(new Application());
        values().copydefault.setAdapter(new C47976uAj(this, ejfBZ(), null, 4, null));
        new TabLayoutMediator(values().OLrzqt.copydefault(), values().copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                vHM.OLrzqt(this.copydefault, tab, i);
            }
        }).attach();
    }

    public static final void OLrzqt(vHM vhm, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return vHM.OLrzqt(view);
            }
        });
        tab.setText(vhm.ejfBZ().get(i).OLrzqt());
    }
}
