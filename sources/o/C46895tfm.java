package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46895tfm extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C42909rfM AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tft
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C46895tfm.KWHzl(this.OLrzqt));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C42909rfM c42909rfM) {
        Intrinsics.checkNotNullParameter(c42909rfM, "");
        this.AEQbTJ = c42909rfM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.fMBJsc;
    }

    public final C42909rfM AEQbTJ() {
        C42909rfM c42909rfM = this.AEQbTJ;
        if (c42909rfM != null) {
            return c42909rfM;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final int KWHzl() {
        return ((java.lang.Number) this.EZpvd.getValue()).intValue();
    }

    public static final int KWHzl(C46895tfm c46895tfm) {
        android.os.Bundle arguments = c46895tfm.getArguments();
        if (arguments != null) {
            return arguments.getInt("source_type");
        }
        return 1;
    }

    /* JADX INFO: renamed from: o.tfm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tfm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C46895tfm OLrzqt(int i) {
            C46895tfm c46895tfm = new C46895tfm();
            c46895tfm.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("source_type", java.lang.Integer.valueOf(i))));
            return c46895tfm;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ(C42909rfM.KWHzl(view));
        ViewPager2 viewPager2 = AEQbTJ().KWHzl;
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setAdapter(new TaskDescription(KWHzl()));
        C55254xgV c55254xgV = AEQbTJ().copydefault;
        c55254xgV.KWHzl(true);
        new TabLayoutMediator(c55254xgV.copydefault(), AEQbTJ().KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.tfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C46895tfm.copydefault(tab, i);
            }
        }).attach();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(C33070mpX.AYXKKw(i == 0 ? qZH.PendingIntent.gAnGwV : qZH.PendingIntent.drbYRJ));
    }

    /* JADX INFO: renamed from: o.tfm$TaskDescription */
    public static final class TaskDescription extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements mAR {
        public android.view.View EZpvd;
        public android.view.View KWHzl;
        public final int OLrzqt;
        public final java.util.List<mAS> copydefault = yDY.gEmmrt(new StateListAnimator(), new Application());
        public static final ActionBar Companion = new ActionBar(null);
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mAR
        public java.util.List<mAS> KWHzl() {
            return this.copydefault;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }

        public TaskDescription(int i) {
            this.OLrzqt = i;
        }

        /* JADX INFO: renamed from: o.tfm$TaskDescription$ActionBar */
        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tfm.TaskDescription.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            LinearLayoutCompat root;
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                C42936rfn c42936rfnOLrzqt = C42936rfn.OLrzqt(layoutInflaterFrom, viewGroup, false);
                if (C27563jxZ.OLrzqt.DbNXlk()) {
                    ConstraintLayout constraintLayout = c42936rfnOLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    constraintLayout.setVisibility(yDY.gEmmrt(1, 4).contains(java.lang.Integer.valueOf(this.OLrzqt)) ? 0 : 8);
                    if (SPUtils.getBoolean("sp_key_prompt_ma_red_pot", true)) {
                        AppCompatTextView appCompatTextView = c42936rfnOLrzqt.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                        appCompatTextView.setVisibility(0);
                        SPUtils.put("sp_key_prompt_ma_red_pot", java.lang.Boolean.FALSE);
                    }
                } else {
                    ConstraintLayout constraintLayout2 = c42936rfnOLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                    constraintLayout2.setVisibility(8);
                }
                root = c42936rfnOLrzqt.getRoot();
            } else {
                root = C42935rfm.OLrzqt(layoutInflaterFrom, viewGroup, false).getRoot();
            }
            Intrinsics.copydefault(root);
            return new Activity(root);
        }

        /* JADX INFO: renamed from: o.tfm$TaskDescription$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public Activity(LinearLayoutCompat linearLayoutCompat) {
                super(linearLayoutCompat);
            }
        }

        /* JADX INFO: renamed from: o.tfm$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements mAS {
            public StateListAnimator() {
            }

            @Override // o.mAS
            public float EZpvd() {
                return java.lang.Math.max(C55298xhM.copydefault(372.0f, (android.content.Context) C43246rlf.OLrzqt.valueOf()), TaskDescription.this.AEQbTJ() != null ? r1.getMeasuredHeight() : 0.0f);
            }

            @Override // o.mAS
            public float AYXKKw() {
                return C33570myu.AEQbTJ();
            }
        }

        /* JADX INFO: renamed from: o.tfm$TaskDescription$Application */
        public static final class Application implements mAS {
            public Application() {
            }

            @Override // o.mAS
            public float EZpvd() {
                return java.lang.Math.max(C55298xhM.copydefault(164.0f, (android.content.Context) C43246rlf.OLrzqt.valueOf()), TaskDescription.this.EZpvd() != null ? r1.getMeasuredHeight() : 0.0f);
            }

            @Override // o.mAS
            public float AYXKKw() {
                return C33570myu.AEQbTJ();
            }
        }
    }
}
