package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
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

/* JADX INFO: renamed from: o.pff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38768pff extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public oMU AEQbTJ;
    public java.util.ArrayList<DrawLineData.DrawLineFiboBean> EZpvd = new java.util.ArrayList<>();
    public final C43316rmw KWHzl = new C43316rmw();
    public InterfaceC35980oKv OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull InterfaceC35980oKv interfaceC35980oKv) {
        Intrinsics.checkNotNullParameter(interfaceC35980oKv, "");
        this.OLrzqt = interfaceC35980oKv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C35964oKf.Application.gasjUx;
    }

    /* JADX INFO: renamed from: o.pff$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pff.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C38768pff AEQbTJ() {
            return new C38768pff();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C52794wYp c52794wYp;
        android.view.View root;
        android.view.View root2;
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = (oMU) DataBindingUtil.bind(view);
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function1 = new Function1() { // from class: o.pfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38768pff.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.pfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C38768pff.EZpvd(function1, obj);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.pfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38768pff.AEQbTJ(this.copydefault, (Unit) obj);
            }
        };
        abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.pfn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C38768pff.KWHzl(function12, obj);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null && (activity instanceof ActivityC36345oYi)) {
            if (((ActivityC36345oYi) activity).getDelegate().getLocalNightMode() == 2) {
                oMU omu = this.AEQbTJ;
                if (omu != null && (root2 = omu.getRoot()) != null) {
                    root2.setBackgroundColor(getResources().getColor(C52761wXj.Activity.djBIcL));
                }
            } else {
                oMU omu2 = this.AEQbTJ;
                if (omu2 != null && (root = omu2.getRoot()) != null) {
                    root.setBackgroundColor(getResources().getColor(C52761wXj.Activity.EZpvd));
                }
            }
        }
        oMU omu3 = this.AEQbTJ;
        if (omu3 == null || (c52794wYp = omu3.copydefault) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.pfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C38768pff.OLrzqt(this.copydefault, view2);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit KWHzl(C38768pff c38768pff, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c38768pff.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C38768pff c38768pff, Unit unit) {
        c38768pff.AEQbTJ();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c38768pff, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C38768pff c38768pff, android.view.View view) {
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(c38768pff.EZpvd);
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineItemIsConnected.setFiboList(c38768pff.EZpvd);
        }
        pEB.OLrzqt.AEQbTJ(c38768pff.EZpvd);
        InterfaceC35980oKv interfaceC35980oKv = c38768pff.OLrzqt;
        if (interfaceC35980oKv != null) {
            interfaceC35980oKv.AEQbTJ();
        }
    }

    public final void copydefault() {
        java.util.ArrayList<DrawLineData.DrawLineFiboBean> arrayListDjBIcL = DrawLineData.copydefault.djBIcL();
        java.util.ArrayList<DrawLineData.DrawLineFiboBean> arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayListDjBIcL, 10));
        java.util.Iterator<T> it = arrayListDjBIcL.iterator();
        while (it.hasNext()) {
            arrayList.add((DrawLineData.DrawLineFiboBean) xVA.EZpvd((DrawLineData.DrawLineFiboBean) it.next()));
        }
        this.EZpvd = arrayList;
    }

    public final void AEQbTJ() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C43316rmw c43316rmw = this.KWHzl;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43316rmw.register(DrawLineData.DrawLineFiboBean.class, new C39524ptv(contextRequireContext, new Function2() { // from class: o.pfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C38768pff.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue());
            }
        }, new Function2() { // from class: o.pfm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C38768pff.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue(), ((java.lang.Float) obj2).floatValue());
            }
        }));
        oMU omu = this.AEQbTJ;
        if (omu != null && (recyclerView2 = omu.EZpvd) != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        oMU omu2 = this.AEQbTJ;
        if (omu2 != null && (recyclerView = omu2.EZpvd) != null) {
            recyclerView.setAdapter(this.KWHzl);
        }
        this.KWHzl.setItems(this.EZpvd);
    }

    public static final Unit KWHzl(C38768pff c38768pff, int i, boolean z) {
        c38768pff.EZpvd.get(i).setSelected(z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C38768pff c38768pff, int i, float f) {
        c38768pff.EZpvd.get(i).setPercent(f);
        return Unit.INSTANCE;
    }
}
