package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.library.drawline.DrawLineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39353pqh extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public InterfaceC35980oKv OLrzqt;
    public java.util.ArrayList<DrawLineData.DrawLineFiboBean> AEQbTJ = new java.util.ArrayList<>();
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC35980oKv interfaceC35980oKv) {
        Intrinsics.checkNotNullParameter(interfaceC35980oKv, "");
        this.OLrzqt = interfaceC35980oKv;
    }

    /* JADX INFO: renamed from: o.pqh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pqh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C39353pqh OLrzqt() {
            return new C39353pqh();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        oMF.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function1 = new Function1() { // from class: o.pqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39353pqh.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.pqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C39353pqh.copydefault(function1, obj);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.pqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39353pqh.EZpvd(this.OLrzqt, (Unit) obj);
            }
        };
        abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.pqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39353pqh.EZpvd(function12, obj);
            }
        });
        C54946xaf binding = getBinding();
        if (binding == null || (constraintLayout = binding.AEQbTJ) == null || (rootView = constraintLayout.getRootView()) == null || (c52794wYp = (C52794wYp) rootView.findViewById(C35964oKf.StateListAnimator.djSkpj)) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.pqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C39353pqh.OLrzqt(this.KWHzl, view2);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit copydefault(C39353pqh c39353pqh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c39353pqh.copydefault();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C39353pqh c39353pqh, Unit unit) {
        c39353pqh.EZpvd();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39353pqh, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C39353pqh c39353pqh, android.view.View view) {
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(c39353pqh.AEQbTJ);
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineItemIsConnected.setFiboList(c39353pqh.AEQbTJ);
        }
        pEB.OLrzqt.AEQbTJ(c39353pqh.AEQbTJ);
        InterfaceC35980oKv interfaceC35980oKv = c39353pqh.OLrzqt;
        if (interfaceC35980oKv != null) {
            interfaceC35980oKv.AEQbTJ();
        }
        c39353pqh.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    private final void copydefault() {
        java.util.ArrayList<DrawLineData.DrawLineFiboBean> arrayListDjBIcL = DrawLineData.copydefault.djBIcL();
        java.util.ArrayList<DrawLineData.DrawLineFiboBean> arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayListDjBIcL, 10));
        java.util.Iterator<T> it = arrayListDjBIcL.iterator();
        while (it.hasNext()) {
            arrayList.add((DrawLineData.DrawLineFiboBean) xVA.EZpvd((DrawLineData.DrawLineFiboBean) it.next()));
        }
        this.AEQbTJ = arrayList;
    }

    private final void EZpvd() {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        C43316rmw c43316rmw = this.copydefault;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43316rmw.register(DrawLineData.DrawLineFiboBean.class, new C39524ptv(contextRequireContext, new Function2() { // from class: o.pql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C39353pqh.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue());
            }
        }, new Function2() { // from class: o.pqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C39353pqh.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue(), ((java.lang.Float) obj2).floatValue());
            }
        }));
        C54946xaf binding = getBinding();
        if (binding == null || (constraintLayout = binding.AEQbTJ) == null || (rootView = constraintLayout.getRootView()) == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(C35964oKf.StateListAnimator.requestPostMessageChannelWithExtras);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(this.copydefault);
        this.copydefault.setItems(this.AEQbTJ);
    }

    public static final Unit AEQbTJ(C39353pqh c39353pqh, int i, boolean z) {
        c39353pqh.AEQbTJ.get(i).setSelected(z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C39353pqh c39353pqh, int i, float f) {
        c39353pqh.AEQbTJ.get(i).setPercent(f);
        return Unit.INSTANCE;
    }
}
