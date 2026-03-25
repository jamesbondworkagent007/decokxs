package o;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.BotExplainGatherData;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.BotExplainGatherPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wiJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53266wiJ extends AbstractC49945uyC<uUQ, BotExplainGatherPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final int copydefault = C48033uCm.Activity.bindToGooglePlayService;
    public float AEQbTJ = 0.98f;

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

    public static final /* synthetic */ uUQ OLrzqt(C53266wiJ c53266wiJ) {
        return c53266wiJ.values();
    }

    /* JADX INFO: renamed from: o.wiJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wiJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wiJ$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void show$default(TaskDescription taskDescription, java.lang.String str, java.util.ArrayList arrayList, androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                arrayList = null;
            }
            taskDescription.EZpvd(str, arrayList, fragmentManager);
        }

        public final void EZpvd(java.lang.String str, java.util.ArrayList<BotExplainGatherData> arrayList, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C53266wiJ c53266wiJ = new C53266wiJ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("page_title", str);
            bundle.putParcelableArrayList("page_detail", arrayList);
            c53266wiJ.setArguments(bundle);
            c53266wiJ.show(fragmentManager, C53266wiJ.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        BotExplainGatherPresenter botExplainGatherPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        botExplainGatherPresenterOLrzqt.KWHzl(arguments != null ? arguments.getParcelableArrayList("page_detail") : null);
        copydefault();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    /* JADX INFO: renamed from: o.wiJ$Application */
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
                int position = tab.getPosition();
                C53266wiJ c53266wiJ = C53266wiJ.this;
                C53266wiJ.OLrzqt(c53266wiJ).copydefault.setCurrentItem(position, c53266wiJ.OLrzqt().OLrzqt());
            }
        }
    }

    private final void copydefault() {
        values().OLrzqt.AEQbTJ(new Application());
        values().copydefault.registerOnPageChangeCallback(new ActionBar());
        values().copydefault.setAdapter(new C47976uAj(this, OLrzqt().copydefault(), null, 4, null));
        new TabLayoutMediator(values().OLrzqt.copydefault(), values().copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wiK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C53266wiJ.copydefault(this.EZpvd, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: o.wiJ$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            C53266wiJ.this.OLrzqt().OLrzqt(i2 > 0);
        }
    }

    public static final void copydefault(C53266wiJ c53266wiJ, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c53266wiJ.OLrzqt().copydefault().get(i).copydefault());
    }
}
