package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40753qdr extends AbstractC49393unh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C42641raJ AEQbTJ;

    /* JADX INFO: renamed from: o.qdr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qdr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<FuturesUnitVo> list, @NotNull FuturesTypeEnum futuresTypeEnum, @NotNull FuturesUnitVo futuresUnitVo, @NotNull java.util.List<CategoryGroupVo> list2, CategoryGroupVo categoryGroupVo, @NotNull java.util.List<? extends PeriodEnum> list3, PeriodEnum periodEnum) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
            Intrinsics.checkNotNullParameter(futuresUnitVo, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            C41298qoF.AEQbTJ.EZpvd("MarketDiscoverFuturesFilterBottomSheet", "show futuresUnitVoList: " + list);
            C40753qdr c40753qdr = new C40753qdr();
            kotlin.Pair[] pairArr = new kotlin.Pair[7];
            pairArr[0] = C56390yDp.OLrzqt("list", new java.util.ArrayList(list));
            pairArr[1] = C56390yDp.OLrzqt("key.selected_type", java.lang.Integer.valueOf(futuresTypeEnum.ordinal()));
            pairArr[2] = C56390yDp.OLrzqt("key.selected_unit", futuresUnitVo);
            pairArr[3] = C56390yDp.OLrzqt("extra.key.category_list", new java.util.ArrayList(list2));
            pairArr[4] = C56390yDp.OLrzqt("extra.key.category_selected", categoryGroupVo);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
            java.util.Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((PeriodEnum) it.next()).name());
            }
            pairArr[5] = C56390yDp.OLrzqt("extra.key.period_list", new java.util.ArrayList(arrayList));
            pairArr[6] = C56390yDp.OLrzqt("extra.key.period_selected", periodEnum != null ? periodEnum.name() : null);
            ((C40753qdr) jSA.EZpvd(c40753qdr, pairArr)).show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPDXdlte));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setVisibility(0);
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, o.qdg] */
    /* JADX WARN: Type inference failed for: r3v19, types: [T, o.qnX] */
    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        FuturesTypeEnum futuresTypeEnum;
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
        int i = arguments.getInt("key.selected_type");
        FuturesTypeEnum[] futuresTypeEnumArrValues = FuturesTypeEnum.values();
        int length = futuresTypeEnumArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                futuresTypeEnum = null;
                break;
            }
            futuresTypeEnum = futuresTypeEnumArrValues[i2];
            if (futuresTypeEnum.ordinal() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (futuresTypeEnum == null) {
            dismissAllowingStateLoss();
            return;
        }
        FuturesUnitVo futuresUnitVo = (FuturesUnitVo) BundleCompat.getParcelable(arguments, "key.selected_unit", FuturesUnitVo.class);
        if (futuresUnitVo == null) {
            dismissAllowingStateLoss();
            return;
        }
        java.util.ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "list", FuturesUnitVo.class);
        if (parcelableArrayList == null) {
            dismissAllowingStateLoss();
            return;
        }
        CategoryGroupVo categoryGroupVo = (CategoryGroupVo) BundleCompat.getParcelable(arguments, "extra.key.category_selected", CategoryGroupVo.class);
        java.util.ArrayList parcelableArrayList2 = BundleCompat.getParcelableArrayList(arguments, "extra.key.category_list", CategoryGroupVo.class);
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
        C42641raJ c42641raJAEQbTJ = C42641raJ.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        C40744qdi c40744qdi = new C40744qdi(parcelableArrayList, futuresUnitVo);
        java.util.List listGHZMYf = yDV.gHZMYf(FuturesTypeEnum.values());
        listGHZMYf.remove(FuturesTypeEnum.PERPETUAL_AND_EXPIRY);
        C40741qdf c40741qdf = new C40741qdf(listGHZMYf, futuresTypeEnum, new Function1() { // from class: o.qdn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40753qdr.copydefault((FuturesTypeEnum) obj);
            }
        });
        c42641raJAEQbTJ.EZpvd.setLayoutManager(new GridLayoutManager(getContext(), 3));
        c42641raJAEQbTJ.EZpvd.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        c42641raJAEQbTJ.EZpvd.setAdapter(c40741qdf);
        c42641raJAEQbTJ.djBIcL.setLayoutManager(new GridLayoutManager(getContext(), 3));
        c42641raJAEQbTJ.djBIcL.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        c42641raJAEQbTJ.djBIcL.setAdapter(c40744qdi);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty() || categoryGroupVo == null) {
            android.widget.TextView textView = c42641raJAEQbTJ.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            RecyclerView recyclerView = c42641raJAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = c42641raJAEQbTJ.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            RecyclerView recyclerView2 = c42641raJAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(0);
            objectRef.element = new C41263qnX(parcelableArrayList2, categoryGroupVo);
            c42641raJAEQbTJ.OLrzqt.setLayoutManager(new GridLayoutManager(getContext(), 3));
            c42641raJAEQbTJ.OLrzqt.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
            c42641raJAEQbTJ.OLrzqt.setAdapter((RecyclerView.Adapter) objectRef.element);
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if (arrayList == null || arrayList.isEmpty() || periodEnumValueOf == null) {
            android.widget.TextView textView3 = c42641raJAEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            RecyclerView recyclerView3 = c42641raJAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
            recyclerView3.setVisibility(8);
        } else {
            android.widget.TextView textView4 = c42641raJAEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(0);
            RecyclerView recyclerView4 = c42641raJAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
            recyclerView4.setVisibility(0);
            objectRef2.element = new C40742qdg(arrayList, periodEnumValueOf);
            c42641raJAEQbTJ.KWHzl.setLayoutManager(new GridLayoutManager(getContext(), 3));
            c42641raJAEQbTJ.KWHzl.addItemDecoration(new C57584ylF(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
            c42641raJAEQbTJ.KWHzl.setAdapter((RecyclerView.Adapter) objectRef2.element);
        }
        C52794wYp c52794wYp = c42641raJAEQbTJ.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, c40741qdf, c40744qdi, objectRef, objectRef2));
        this.AEQbTJ = c42641raJAEQbTJ;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(FuturesTypeEnum futuresTypeEnum) {
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qdr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C40753qdr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C40753qdr c40753qdr) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c40753qdr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.qdr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C40741qdf AEQbTJ;
        public final /* synthetic */ Ref.ObjectRef EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Ref.ObjectRef copydefault;
        public final /* synthetic */ C40753qdr gEmmrt;
        public final /* synthetic */ C40744qdi valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C40753qdr c40753qdr, C40741qdf c40741qdf, C40744qdi c40744qdi, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.gEmmrt = c40753qdr;
            this.AEQbTJ = c40741qdf;
            this.valueOf = c40744qdi;
            this.EZpvd = objectRef;
            this.copydefault = objectRef2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            PeriodEnum periodEnumCopydefault;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C40753qdr c40753qdr = this.gEmmrt;
                java.lang.String name = C40753qdr.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                kotlin.Pair[] pairArr = new kotlin.Pair[4];
                pairArr[0] = C56390yDp.OLrzqt("key.selected_type", java.lang.Integer.valueOf(this.AEQbTJ.copydefault().ordinal()));
                pairArr[1] = C56390yDp.OLrzqt("key.selected_unit", this.valueOf.copydefault());
                C41263qnX c41263qnX = (C41263qnX) this.EZpvd.element;
                java.lang.String strName = null;
                pairArr[2] = C56390yDp.OLrzqt("key.selected_category", c41263qnX != null ? c41263qnX.copydefault() : null);
                C40742qdg c40742qdg = (C40742qdg) this.copydefault.element;
                if (c40742qdg != null && (periodEnumCopydefault = c40742qdg.copydefault()) != null) {
                    strName = periodEnumCopydefault.name();
                }
                pairArr[3] = C56390yDp.OLrzqt("key.selected_period", strName);
                FragmentKt.setFragmentResult(c40753qdr, name, BundleKt.bundleOf(pairArr));
                this.gEmmrt.dismissAllowingStateLoss();
            }
        }
    }
}
