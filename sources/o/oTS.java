package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.oTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTS extends AbstractC59533zio<oTB.StateListAnimator, Activity> {
    public final oTG EZpvd;

    public oTS(@NotNull oTG otg) {
        Intrinsics.checkNotNullParameter(otg, "");
        this.EZpvd = otg;
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final C36052oNm AEQbTJ;
        public final /* synthetic */ oTS KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36052oNm AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull oTS ots, C36052oNm c36052oNm) {
            super(c36052oNm.getRoot());
            Intrinsics.checkNotNullParameter(c36052oNm, "");
            this.KWHzl = ots;
            this.AEQbTJ = c36052oNm;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36052oNm c36052oNmAEQbTJ = C36052oNm.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36052oNmAEQbTJ, "");
        return new Activity(this, c36052oNmAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull oTB.StateListAnimator stateListAnimator) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C36052oNm c36052oNmAEQbTJ = activity.AEQbTJ();
        C55258xgZ c55258xgZ = c36052oNmAEQbTJ.KWHzl;
        java.lang.String strEZpvd = stateListAnimator.EZpvd();
        int i = 0;
        c55258xgZ.setHelperLabelType((strEZpvd == null || strEZpvd.length() == 0) ? 2 : 0);
        C55258xgZ c55258xgZ2 = c36052oNmAEQbTJ.KWHzl;
        c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, stateListAnimator, this));
        C55312xha c55312xhaValueOf = c36052oNmAEQbTJ.KWHzl.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(stateListAnimator.copydefault());
        }
        if (stateListAnimator.AEQbTJ() == null) {
            android.widget.FrameLayout frameLayout = c36052oNmAEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
        } else {
            android.widget.FrameLayout frameLayout2 = c36052oNmAEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(0);
            c36052oNmAEQbTJ.AEQbTJ.setBackgroundColor(stateListAnimator.AEQbTJ().intValue());
            android.widget.FrameLayout frameLayout3 = c36052oNmAEQbTJ.EZpvd;
            frameLayout3.setOnClickListener(new Application(frameLayout3, 1000L, this, c36052oNmAEQbTJ, stateListAnimator));
        }
        if (!stateListAnimator.gEmmrt().isEmpty()) {
            C55249xgQ c55249xgQ = c36052oNmAEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
            AEQbTJ(c55249xgQ, stateListAnimator);
        } else if (!stateListAnimator.djBIcL().isEmpty()) {
            C55249xgQ c55249xgQ2 = c36052oNmAEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
            KWHzl(c55249xgQ2, stateListAnimator);
        } else {
            c36052oNmAEQbTJ.copydefault.removeAllTabs();
        }
        C55249xgQ c55249xgQ3 = c36052oNmAEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ3, "");
        if (!(!stateListAnimator.gEmmrt().isEmpty()) && !(!stateListAnimator.djBIcL().isEmpty())) {
            i = 8;
        }
        c55249xgQ3.setVisibility(i);
    }

    public final void AEQbTJ(C55249xgQ c55249xgQ, oTB.StateListAnimator stateListAnimator) {
        if (c55249xgQ.getTabCount() != stateListAnimator.gEmmrt().size()) {
            c55249xgQ.removeAllTabs();
            java.util.Iterator it = CollectionsKt___CollectionsKt.QfsBiF(stateListAnimator.gEmmrt()).iterator();
            while (it.hasNext()) {
                c55249xgQ.addTab(c55249xgQ.newTab().setIcon((android.graphics.drawable.Drawable) it.next()));
            }
        } else {
            int i = 0;
            for (java.lang.Object obj : CollectionsKt___CollectionsKt.QfsBiF(stateListAnimator.gEmmrt())) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
                TabLayout.Tab tabAt = c55249xgQ.getTabAt(i);
                if (tabAt != null) {
                    tabAt.setText("");
                    tabAt.setIcon(drawable);
                }
                i++;
            }
        }
        TabLayout.Tab tabAt2 = c55249xgQ.getTabAt(stateListAnimator.AhwBna());
        if (tabAt2 != null) {
            tabAt2.select();
        }
        EZpvd(c55249xgQ, stateListAnimator);
    }

    public final void KWHzl(C55249xgQ c55249xgQ, oTB.StateListAnimator stateListAnimator) {
        if (c55249xgQ.getTabCount() != stateListAnimator.djBIcL().size()) {
            c55249xgQ.removeAllTabs();
            java.util.Iterator<T> it = stateListAnimator.djBIcL().iterator();
            while (it.hasNext()) {
                c55249xgQ.addTab(c55249xgQ.newTab().setText((java.lang.String) it.next()));
            }
        } else {
            int i = 0;
            for (java.lang.Object obj : stateListAnimator.djBIcL()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                TabLayout.Tab tabAt = c55249xgQ.getTabAt(i);
                if (tabAt != null) {
                    tabAt.setIcon((android.graphics.drawable.Drawable) null);
                    tabAt.setText(str);
                }
                i++;
            }
        }
        TabLayout.Tab tabAt2 = c55249xgQ.getTabAt(stateListAnimator.AhwBna());
        if (tabAt2 != null) {
            tabAt2.select();
        }
        EZpvd(c55249xgQ, stateListAnimator);
    }

    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ oTB.StateListAnimator AEQbTJ;
        public final /* synthetic */ oTS OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription(oTB.StateListAnimator stateListAnimator, oTS ots) {
            this.AEQbTJ = stateListAnimator;
            this.OLrzqt = ots;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            int iIndexOf;
            Intrinsics.checkNotNullParameter(tab, "");
            oTB.StateListAnimator stateListAnimator = this.AEQbTJ;
            if (!stateListAnimator.djBIcL().isEmpty()) {
                iIndexOf = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.CharSequence>) ((java.util.List<? extends java.lang.Object>) this.AEQbTJ.djBIcL()), tab.getText());
            } else {
                iIndexOf = this.AEQbTJ.gEmmrt().isEmpty() ^ true ? this.AEQbTJ.gEmmrt().indexOf(tab.getIcon()) : 0;
            }
            stateListAnimator.KWHzl(iIndexOf);
            this.OLrzqt.EZpvd.EZpvd(this.AEQbTJ);
        }
    }

    public final void EZpvd(C55249xgQ c55249xgQ, oTB.StateListAnimator stateListAnimator) {
        c55249xgQ.clearOnTabSelectedListeners();
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription(stateListAnimator, this));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ oTS EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ oTB.StateListAnimator OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, oTB.StateListAnimator stateListAnimator, oTS ots) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = stateListAnimator;
            this.EZpvd = ots;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.EZpvd())) {
                    this.EZpvd.EZpvd.AEQbTJ(this.OLrzqt);
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ oTS AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C36052oNm OLrzqt;
        public final /* synthetic */ oTB.StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, oTS ots, C36052oNm c36052oNm, oTB.StateListAnimator stateListAnimator) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = ots;
            this.OLrzqt = c36052oNm;
            this.copydefault = stateListAnimator;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                oTG otg = this.AEQbTJ.EZpvd;
                LinearLayoutCompat root = this.OLrzqt.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                otg.KWHzl(root, this.copydefault);
            }
        }
    }
}
