package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewGroupKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.business.defi.wallet.hardware.bean.HardWareConnectGuide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eEB extends AbstractC57674ymq {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public AbstractC17017eup AEQbTJ;
    public Function0<Unit> OLrzqt;
    public boolean copydefault;
    public java.lang.Float KWHzl = java.lang.Float.valueOf(0.98f);
    public java.util.List<HardWareConnectGuide> AYXKKw = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public java.lang.Float OLrzqt() {
        return this.KWHzl;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eEB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eEB$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ eEB newInstance$default(Activity activity, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                arrayList = null;
            }
            return activity.EZpvd(arrayList);
        }

        public final eEB EZpvd(java.util.ArrayList<HardWareConnectGuide> arrayList) {
            eEB eeb = new eEB();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("dataList", arrayList);
            eeb.setArguments(bundle);
            return eeb;
        }
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
        show(fragmentManager, (java.lang.String) null);
    }

    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (arrayList = arguments.getParcelableArrayList("dataList")) == null) {
            arrayList = new java.util.ArrayList();
        }
        this.AYXKKw = arrayList;
        KWHzl(C13754dXa.Activity.fARcdN);
        AbstractC17017eup abstractC17017eupAEQbTJ = AbstractC17017eup.AEQbTJ(layoutInflater, viewGroup, false);
        this.AEQbTJ = abstractC17017eupAEQbTJ;
        AbstractC17017eup abstractC17017eup = null;
        if (abstractC17017eupAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC17017eupAEQbTJ = null;
        }
        abstractC17017eupAEQbTJ.copydefault.setAdapter(new ActionBar());
        AbstractC17017eup abstractC17017eup2 = this.AEQbTJ;
        if (abstractC17017eup2 == null) {
            Intrinsics.gEmmrt("");
            abstractC17017eup2 = null;
        }
        abstractC17017eup2.copydefault.registerOnPageChangeCallback(new StateListAnimator());
        AbstractC17017eup abstractC17017eup3 = this.AEQbTJ;
        if (abstractC17017eup3 == null) {
            Intrinsics.gEmmrt("");
            abstractC17017eup3 = null;
        }
        abstractC17017eup3.copydefault.setCurrentItem(0);
        AbstractC17017eup abstractC17017eup4 = this.AEQbTJ;
        if (abstractC17017eup4 == null) {
            Intrinsics.gEmmrt("");
            abstractC17017eup4 = null;
        }
        abstractC17017eup4.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.eEy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eEB.KWHzl(this.KWHzl, view);
            }
        });
        AbstractC17017eup abstractC17017eup5 = this.AEQbTJ;
        if (abstractC17017eup5 == null) {
            Intrinsics.gEmmrt("");
            abstractC17017eup5 = null;
        }
        abstractC17017eup5.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.eEz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eEB.EZpvd(this.KWHzl, view);
            }
        });
        int i = 0;
        for (java.lang.Object obj : this.AYXKKw) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.view.View view = new android.view.View(getActivity());
            view.setBackgroundResource(C13754dXa.Activity.KDccX);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, C55298xhM.dp2px$default(2.0f, null, 1, null), 1.0f);
            if (i != 0) {
                C55296xhK.AEQbTJ(layoutParams, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, 0, 0);
            } else {
                view.setSelected(true);
            }
            AbstractC17017eup abstractC17017eup6 = this.AEQbTJ;
            if (abstractC17017eup6 == null) {
                Intrinsics.gEmmrt("");
                abstractC17017eup6 = null;
            }
            abstractC17017eup6.EZpvd.addView(view, layoutParams);
            i++;
        }
        AbstractC17017eup abstractC17017eup7 = this.AEQbTJ;
        if (abstractC17017eup7 == null) {
            Intrinsics.gEmmrt("");
            abstractC17017eup7 = null;
        }
        abstractC17017eup7.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.eEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                eEB.djBIcL(this.EZpvd, view2);
            }
        });
        AbstractC17017eup abstractC17017eup8 = this.AEQbTJ;
        if (abstractC17017eup8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17017eup = abstractC17017eup8;
        }
        android.view.View root = abstractC17017eup.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final class StateListAnimator extends ViewPager2.OnPageChangeCallback {
        public StateListAnimator() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            AbstractC17017eup abstractC17017eup = eEB.this.AEQbTJ;
            AbstractC17017eup abstractC17017eup2 = null;
            if (abstractC17017eup == null) {
                Intrinsics.gEmmrt("");
                abstractC17017eup = null;
            }
            android.widget.LinearLayout linearLayout = abstractC17017eup.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            int i2 = 0;
            for (android.view.View view : ViewGroupKt.getChildren(linearLayout)) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                view.setSelected(i == i2);
                i2++;
            }
            AbstractC17017eup abstractC17017eup3 = eEB.this.AEQbTJ;
            if (abstractC17017eup3 == null) {
                Intrinsics.gEmmrt("");
                abstractC17017eup3 = null;
            }
            abstractC17017eup3.OLrzqt.setVisibility(i == yDY.AuCTel(eEB.this.AYXKKw) ? 8 : 0);
            AbstractC17017eup abstractC17017eup4 = eEB.this.AEQbTJ;
            if (abstractC17017eup4 == null) {
                Intrinsics.gEmmrt("");
                abstractC17017eup4 = null;
            }
            abstractC17017eup4.KWHzl.setVisibility(i == yDY.AuCTel(eEB.this.AYXKKw) ? 4 : 0);
            AbstractC17017eup abstractC17017eup5 = eEB.this.AEQbTJ;
            if (abstractC17017eup5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC17017eup2 = abstractC17017eup5;
            }
            abstractC17017eup2.AEQbTJ.setVisibility(i != yDY.AuCTel(eEB.this.AYXKKw) ? 8 : 0);
        }
    }

    public static final void KWHzl(eEB eeb, android.view.View view) {
        eeb.dismissAllowingStateLoss();
    }

    public static final void EZpvd(eEB eeb, android.view.View view) {
        AbstractC17017eup abstractC17017eup = eeb.AEQbTJ;
        AbstractC17017eup abstractC17017eup2 = null;
        if (abstractC17017eup == null) {
            Intrinsics.gEmmrt("");
            abstractC17017eup = null;
        }
        int currentItem = abstractC17017eup.copydefault.getCurrentItem();
        if (currentItem == yDY.AuCTel(eeb.AYXKKw)) {
            eeb.dismissAllowingStateLoss();
            return;
        }
        AbstractC17017eup abstractC17017eup3 = eeb.AEQbTJ;
        if (abstractC17017eup3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC17017eup2 = abstractC17017eup3;
        }
        abstractC17017eup2.copydefault.setCurrentItem(currentItem + 1);
    }

    public static final void djBIcL(eEB eeb, android.view.View view) {
        eeb.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.eEA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eEB.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(eEB eeb) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) eeb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final class ActionBar extends FragmentStateAdapter {
        public final java.util.List<TaskDescription> AEQbTJ;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
            super(eEB.this.getChildFragmentManager(), eEB.this.getLifecycle());
            kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, eEB.this.AYXKKw.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(intRangeAhwBna, 10));
            java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
            while (it.hasNext()) {
                arrayList.add(TaskDescription.Companion.KWHzl((HardWareConnectGuide) eEB.this.AYXKKw.get(((AbstractC56415yEn) it).nextInt())));
            }
            this.AEQbTJ = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return eEB.this.AYXKKw.size();
        }

        /* JADX DEBUG: Method merged with bridge method: createFragment(I)Landroidx/fragment/app/Fragment; */
        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public TaskDescription createFragment(int i) {
            return this.AEQbTJ.get(i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends androidx.fragment.app.Fragment {
        public static final Activity Companion = new Activity(null);

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eEB.TaskDescription.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public static /* synthetic */ TaskDescription newInstance$default(Activity activity, HardWareConnectGuide hardWareConnectGuide, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    hardWareConnectGuide = null;
                }
                return activity.KWHzl(hardWareConnectGuide);
            }

            public final TaskDescription KWHzl(HardWareConnectGuide hardWareConnectGuide) {
                TaskDescription taskDescription = new TaskDescription();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("data", hardWareConnectGuide);
                taskDescription.setArguments(bundle);
                return taskDescription;
            }
        }

        @Override // androidx.fragment.app.Fragment
        public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            return layoutInflater.inflate(C13754dXa.TaskDescription.RAQtXZ, viewGroup, false);
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
            HardWareConnectGuide hardWareConnectGuide;
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            android.os.Bundle arguments = getArguments();
            if (arguments == null || (hardWareConnectGuide = (HardWareConnectGuide) arguments.getParcelable("data")) == null) {
                return;
            }
            ((android.widget.TextView) view.findViewById(C13754dXa.ActionBar.setFillInIntent)).setText(hardWareConnectGuide.getPrimaryText());
            ((android.widget.TextView) view.findViewById(C13754dXa.ActionBar.ActivityResultContractsPickMultipleVisualMedia)).setText(hardWareConnectGuide.getSecondaryText());
            if (Intrinsics.EZpvd(hardWareConnectGuide.getSecondaryHasClickSpan(), java.lang.Boolean.TRUE)) {
                ((android.widget.TextView) view.findViewById(C13754dXa.ActionBar.ActivityResultContractsPickMultipleVisualMedia)).setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.Srftgn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
            java.lang.String imageRes = hardWareConnectGuide.getImageRes();
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault(imageRes, context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
            ConstraintSet constraintSet = new ConstraintSet();
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            constraintSet.clone(constraintLayout);
            constraintSet.setDimensionRatio(C13754dXa.ActionBar.Srftgn, "h," + hardWareConnectGuide.getImageDimensionRatio());
            constraintSet.applyTo(constraintLayout);
            android.view.View viewFindViewById2 = view.findViewById(C13754dXa.ActionBar.Srftgn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            C55296xhK.OLrzqt(viewFindViewById2, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), hardWareConnectGuide.getImageMarginBottom());
        }
    }
}
