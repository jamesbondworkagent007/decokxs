package o;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iVA extends iTL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C23842iLi AEQbTJ;
    public final boolean KWHzl;
    public iVF OLrzqt;
    public final java.util.List<InvestOrder> copydefault = new java.util.ArrayList();
    public java.lang.String AhwBna = "";
    public final MutableLiveData<InvestOrder> gEmmrt = new MutableLiveData<>(null);

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(iVF ivf) {
        this.OLrzqt = ivf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.KWHzl;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVA.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final iVA EZpvd(@NotNull java.util.ArrayList<InvestOrder> arrayList, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            iVA iva = new iVA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("investOrders", arrayList);
            bundle.putString("type", str);
            iva.setArguments(bundle);
            return iva;
        }
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23842iLi c23842iLiKWHzl = C23842iLi.KWHzl(layoutInflater, viewGroup, false);
        this.AEQbTJ = c23842iLiKWHzl;
        if (c23842iLiKWHzl == null) {
            Intrinsics.gEmmrt("");
            c23842iLiKWHzl = null;
        }
        android.widget.LinearLayout root = c23842iLiKWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
        KWHzl();
    }

    public final void KWHzl() {
        java.util.ArrayList<InvestOrder> parcelableArrayList;
        android.os.Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("investOrders")) != null) {
            for (InvestOrder investOrder : parcelableArrayList) {
                if (!z && investOrder.isAllowedRedeem()) {
                    this.gEmmrt.setValue(investOrder);
                    z = true;
                }
                java.util.List<InvestOrder> list = this.copydefault;
                Intrinsics.copydefault(investOrder);
                list.add(investOrder);
            }
        }
        C23842iLi c23842iLi = this.AEQbTJ;
        java.lang.String string = null;
        if (c23842iLi == null) {
            Intrinsics.gEmmrt("");
            c23842iLi = null;
        }
        C52794wYp c52794wYp = c23842iLi.OLrzqt;
        if (z) {
            android.content.Context context = getContext();
            if (context != null) {
                string = context.getString(C25493ixk.FragmentManager.ODCBUN);
            }
        } else {
            android.content.Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(C25493ixk.FragmentManager.ROgMPW);
            }
        }
        c52794wYp.setText(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [82=4] */
    private final void EZpvd() {
        android.os.Bundle arguments = getArguments();
        C23842iLi c23842iLi = null;
        java.lang.String string = arguments != null ? arguments.getString("type") : null;
        if (string == null) {
            string = "";
        }
        this.AhwBna = string;
        C23842iLi c23842iLi2 = this.AEQbTJ;
        if (c23842iLi2 == null) {
            Intrinsics.gEmmrt("");
            c23842iLi2 = null;
        }
        c23842iLi2.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireActivity()));
        C23842iLi c23842iLi3 = this.AEQbTJ;
        if (c23842iLi3 == null) {
            Intrinsics.gEmmrt("");
            c23842iLi3 = null;
        }
        c23842iLi3.AEQbTJ.setAdapter(Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "TYPE_SUI") ? new iSS(this.copydefault, new Application(), new Function0() { // from class: o.iVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iVA.AEQbTJ(this.copydefault);
            }
        }) : new iSM(this.copydefault, new Function1() { // from class: o.iVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iVA.copydefault(this.KWHzl, (InvestOrder) obj);
            }
        }));
        C23842iLi c23842iLi4 = this.AEQbTJ;
        if (c23842iLi4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23842iLi = c23842iLi4;
        }
        c23842iLi.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.iVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                iVA.KWHzl(this.OLrzqt, view);
            }
        });
        this.gEmmrt.observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.iVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iVA.EZpvd(this.EZpvd, (InvestOrder) obj);
            }
        }));
    }

    public static final class Application implements iSO {
        public Application() {
        }

        @Override // o.iSO
        public void KWHzl(InvestOrder investOrder) {
            Intrinsics.checkNotNullParameter(investOrder, "");
            iVA.this.gEmmrt.setValue(investOrder);
            C23842iLi c23842iLi = iVA.this.AEQbTJ;
            if (c23842iLi == null) {
                Intrinsics.gEmmrt("");
                c23842iLi = null;
            }
            RecyclerView.Adapter adapter = c23842iLi.AEQbTJ.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    public static final java.lang.String AEQbTJ(iVA iva) {
        InvestOrder value = iva.gEmmrt.getValue();
        java.lang.String redeemId = value != null ? value.getRedeemId() : null;
        return redeemId == null ? "" : redeemId;
    }

    public static final Unit copydefault(iVA iva, InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "");
        iva.gEmmrt.setValue(investOrder);
        C23842iLi c23842iLi = iva.AEQbTJ;
        if (c23842iLi == null) {
            Intrinsics.gEmmrt("");
            c23842iLi = null;
        }
        RecyclerView.Adapter adapter = c23842iLi.AEQbTJ.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(iVA iva, android.view.View view) {
        iVF ivf;
        InvestOrder value = iva.gEmmrt.getValue();
        if (value != null && (ivf = iva.OLrzqt) != null) {
            ivf.AEQbTJ(value);
        }
        iva.dismiss();
    }

    public static final Unit EZpvd(iVA iva, InvestOrder investOrder) {
        C23842iLi c23842iLi = iva.AEQbTJ;
        if (c23842iLi == null) {
            Intrinsics.gEmmrt("");
            c23842iLi = null;
        }
        c23842iLi.OLrzqt.setEnabled(investOrder != null && investOrder.isAllowedRedeem());
        return Unit.INSTANCE;
    }

    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJO ijoOLrzqt = iJO.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijoOLrzqt, "");
        android.widget.ImageView imageView = ijoOLrzqt.EZpvd;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        android.widget.TextView textView = ijoOLrzqt.AEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "TYPE_SUI")) {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.YFmri);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.GFUIi);
        }
        textView.setText(strAYXKKw);
        return ijoOLrzqt.getRoot();
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ iVA KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, iVA iva) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = iva;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }
}
