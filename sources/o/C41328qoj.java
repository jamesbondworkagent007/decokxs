package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41328qoj extends AbstractC49393unh {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C42643raL OLrzqt;

    /* JADX INFO: renamed from: o.qoj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qoj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<ChargeGroupVo> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull java.util.List<CategoryGroupVo> list2, CategoryGroupVo categoryGroupVo, boolean z, @NotNull java.util.List<? extends PeriodEnum> list3, PeriodEnum periodEnum) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(chargeGroupVo, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            C41298qoF.AEQbTJ.EZpvd("MarketDiscoverSpotFilterBottomSheet", "show chargeGroupList: " + list);
            C41328qoj c41328qoj = new C41328qoj();
            kotlin.Pair[] pairArr = new kotlin.Pair[7];
            pairArr[0] = C56390yDp.OLrzqt("extra.key.unit_list", new java.util.ArrayList(list));
            pairArr[1] = C56390yDp.OLrzqt("extra.key.unit_selected", chargeGroupVo);
            pairArr[2] = C56390yDp.OLrzqt("extra.key.category_list", new java.util.ArrayList(list2));
            pairArr[3] = C56390yDp.OLrzqt("extra.key.category_selected", categoryGroupVo);
            pairArr[4] = C56390yDp.OLrzqt("extra.key.is_selected_ranking", java.lang.Boolean.valueOf(z));
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
            java.util.Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((PeriodEnum) it.next()).name());
            }
            pairArr[5] = C56390yDp.OLrzqt("extra.key.period_list", new java.util.ArrayList(arrayList));
            pairArr[6] = C56390yDp.OLrzqt("extra.key.period_selected", periodEnum != null ? periodEnum.name() : null);
            ((C41328qoj) jSA.EZpvd(c41328qoj, pairArr)).show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.RhjxDW));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setVisibility(0);
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, o.qob] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, o.qnX] */
    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.ArrayList arrayList;
        PeriodEnum periodEnumValueOf;
        PeriodEnum periodEnumValueOf2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments == null) {
            dismissAllowingStateLoss();
            return;
        }
        java.util.ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "extra.key.unit_list", ChargeGroupVo.class);
        if (parcelableArrayList == null) {
            dismissAllowingStateLoss();
            return;
        }
        ChargeGroupVo chargeGroupVo = (ChargeGroupVo) BundleCompat.getParcelable(arguments, "extra.key.unit_selected", ChargeGroupVo.class);
        if (chargeGroupVo == null) {
            dismissAllowingStateLoss();
            return;
        }
        java.util.ArrayList parcelableArrayList2 = BundleCompat.getParcelableArrayList(arguments, "extra.key.category_list", CategoryGroupVo.class);
        CategoryGroupVo categoryGroupVo = (CategoryGroupVo) BundleCompat.getParcelable(arguments, "extra.key.category_selected", CategoryGroupVo.class);
        java.util.ArrayList<java.lang.String> stringArrayList = arguments.getStringArrayList("extra.key.period_list");
        if (stringArrayList != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str : stringArrayList) {
                try {
                    Intrinsics.copydefault((java.lang.Object) str);
                    periodEnumValueOf2 = PeriodEnum.valueOf(str);
                } catch (java.lang.Exception unused) {
                    periodEnumValueOf2 = null;
                }
                if (periodEnumValueOf2 != null) {
                    arrayList.add(periodEnumValueOf2);
                }
            }
        } else {
            arrayList = null;
        }
        java.lang.String string = arguments.getString("extra.key.period_selected");
        if (string != null) {
            try {
                periodEnumValueOf = PeriodEnum.valueOf(string);
            } catch (java.lang.Exception unused2) {
                periodEnumValueOf = null;
            }
        } else {
            periodEnumValueOf = null;
        }
        boolean z = arguments.getBoolean("extra.key.is_selected_ranking");
        C42643raL c42643raLKWHzl = C42643raL.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        C41322qod c41322qod = new C41322qod(parcelableArrayList, chargeGroupVo, java.lang.Boolean.valueOf(z));
        c42643raLKWHzl.OLrzqt.setLayoutManager(new GridLayoutManager(getContext(), 3));
        c42643raLKWHzl.OLrzqt.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        c42643raLKWHzl.OLrzqt.setAdapter(c41322qod);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty() || categoryGroupVo == null) {
            android.widget.TextView textView = c42643raLKWHzl.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            RecyclerView recyclerView = c42643raLKWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = c42643raLKWHzl.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            RecyclerView recyclerView2 = c42643raLKWHzl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(0);
            objectRef.element = new C41263qnX(parcelableArrayList2, categoryGroupVo);
            c42643raLKWHzl.EZpvd.setLayoutManager(new GridLayoutManager(getContext(), 3));
            c42643raLKWHzl.EZpvd.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
            c42643raLKWHzl.EZpvd.setAdapter((RecyclerView.Adapter) objectRef.element);
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if (arrayList == null || arrayList.isEmpty() || periodEnumValueOf == null) {
            android.widget.TextView textView3 = c42643raLKWHzl.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            RecyclerView recyclerView3 = c42643raLKWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
            recyclerView3.setVisibility(8);
        } else {
            android.widget.TextView textView4 = c42643raLKWHzl.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            RecyclerView recyclerView4 = c42643raLKWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
            recyclerView4.setVisibility(0);
            objectRef2.element = new C41320qob(arrayList, periodEnumValueOf);
            c42643raLKWHzl.copydefault.setLayoutManager(new GridLayoutManager(getContext(), 3));
            c42643raLKWHzl.copydefault.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
            c42643raLKWHzl.copydefault.setAdapter((RecyclerView.Adapter) objectRef2.element);
        }
        C52794wYp c52794wYp = c42643raLKWHzl.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, c41322qod, objectRef, objectRef2));
        this.OLrzqt = c42643raLKWHzl;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.qoj$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C41328qoj AhwBna;
        public final /* synthetic */ C41322qod EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Ref.ObjectRef OLrzqt;
        public final /* synthetic */ Ref.ObjectRef copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C41328qoj c41328qoj, C41322qod c41322qod, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.AhwBna = c41328qoj;
            this.EZpvd = c41322qod;
            this.OLrzqt = objectRef;
            this.copydefault = objectRef2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            PeriodEnum periodEnumKWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C41328qoj c41328qoj = this.AhwBna;
                java.lang.String name = C41328qoj.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = C56390yDp.OLrzqt("key.selected_unit", this.EZpvd.KWHzl());
                C41263qnX c41263qnX = (C41263qnX) this.OLrzqt.element;
                java.lang.String strName = null;
                pairArr[1] = C56390yDp.OLrzqt("key.selected_category", c41263qnX != null ? c41263qnX.copydefault() : null);
                C41320qob c41320qob = (C41320qob) this.copydefault.element;
                if (c41320qob != null && (periodEnumKWHzl = c41320qob.KWHzl()) != null) {
                    strName = periodEnumKWHzl.name();
                }
                pairArr[2] = C56390yDp.OLrzqt("key.selected_period", strName);
                FragmentKt.setFragmentResult(c41328qoj, name, BundleKt.bundleOf(pairArr));
                this.AhwBna.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.qoj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C41328qoj AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C41328qoj c41328qoj) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c41328qoj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
