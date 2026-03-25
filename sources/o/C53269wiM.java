package o;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wiM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53269wiM extends AbstractC32996moC {
    public RecyclerView EZpvd;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final int OLrzqt = C48033uCm.Activity.YFmri;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wiL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53269wiM.AEQbTJ();
        }
    });
    public java.util.ArrayList<ExplainItemModel> copydefault = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AEQbTJ() {
        return new C43316rmw();
    }

    private final C43316rmw OLrzqt() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.wiM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wiM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C53269wiM KWHzl(@NotNull java.util.ArrayList<ExplainItemModel> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            C53269wiM c53269wiM = new C53269wiM();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("explain_items", arrayList);
            c53269wiM.setArguments(bundle);
            return c53269wiM;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("explain_items") : null;
        this.copydefault = serializable instanceof java.util.ArrayList ? (java.util.ArrayList) serializable : null;
        this.EZpvd = (RecyclerView) view.findViewById(C48033uCm.Application.dtVxwd);
        C43316rmw c43316rmwOLrzqt = OLrzqt();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c43316rmwOLrzqt.register(ExplainItemModel.class, new C53151wgA(fragmentActivityRequireActivity));
        java.util.ArrayList<ExplainItemModel> arrayList = this.copydefault;
        if (arrayList != null) {
            OLrzqt().setItems(arrayList);
        }
        RecyclerView recyclerView = this.EZpvd;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        RecyclerView recyclerView2 = this.EZpvd;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        wPQ.OLrzqt(recyclerView2);
        RecyclerView recyclerView3 = this.EZpvd;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(OLrzqt());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
