package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.data.BuyFrequencyOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lBF extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC31445luE AEQbTJ;
    public java.util.List<BuyFrequencyOption> EZpvd = yDY.AhwBna();
    public Function1<? super BuyFrequencyOption, Unit> KWHzl = new Function1() { // from class: o.lBK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return lBF.AEQbTJ((BuyFrequencyOption) obj);
        }
    };
    public C43316rmw copydefault = new C43316rmw();

    public static final Unit AEQbTJ(BuyFrequencyOption buyFrequencyOption) {
        Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.EZpvd.isEmpty() || this.KWHzl == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31445luE abstractC31445luEAEQbTJ = AbstractC31445luE.AEQbTJ(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        this.AEQbTJ = abstractC31445luEAEQbTJ;
        if (abstractC31445luEAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC31445luEAEQbTJ = null;
        }
        RecyclerView recyclerView = abstractC31445luEAEQbTJ.OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        android.content.Context context = getContext();
        if (context != null) {
            recyclerView.addItemDecoration(new C57593ylO(context.getResources().getDimensionPixelSize(mDC.Activity.copydefault), false, false));
        }
        C43316rmw c43316rmw = this.copydefault;
        c43316rmw.setItems(this.EZpvd);
        c43316rmw.notifyDataSetChanged();
        recyclerView.setAdapter(c43316rmw);
        this.copydefault.register(BuyFrequencyOption.class, new lBB(new Function1() { // from class: o.lBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBF.OLrzqt(this.AEQbTJ, (BuyFrequencyOption) obj);
            }
        }));
    }

    public static final Unit OLrzqt(lBF lbf, BuyFrequencyOption buyFrequencyOption) {
        Intrinsics.checkNotNullParameter(buyFrequencyOption, "");
        Function1<? super BuyFrequencyOption, Unit> function1 = lbf.KWHzl;
        if (function1 != null) {
            function1.invoke(buyFrequencyOption);
        }
        lbf.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.KWHzl == null) {
            dismissAllowingStateLoss();
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lBF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final lBF KWHzl(@NotNull java.util.List<BuyFrequencyOption> list, @NotNull Function1<? super BuyFrequencyOption, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            lBF lbf = new lBF();
            lbf.EZpvd = list;
            lbf.KWHzl = function1;
            return lbf;
        }
    }
}
