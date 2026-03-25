package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wiR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53274wiR extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public uSY KWHzl;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wiP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53274wiR.OLrzqt();
        }
    });
    public java.lang.String copydefault = "";
    public java.util.ArrayList<ExplainItemModel> OLrzqt = new java.util.ArrayList<>();

    private final C43316rmw EZpvd() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw OLrzqt() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.wiR$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wiR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wiR$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C53274wiR newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                arrayList = null;
            }
            return stateListAnimator.AEQbTJ(str, arrayList);
        }

        public final C53274wiR AEQbTJ(java.lang.String str, java.util.ArrayList<ExplainItemModel> arrayList) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("page_title", str);
            bundle.putSerializable("page_detail", arrayList);
            C53274wiR c53274wiR = new C53274wiR();
            c53274wiR.setArguments(bundle);
            return c53274wiR;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(this.copydefault);
        wxq.valueOf().setVisibility(this.copydefault.length() > 0 ? 0 : 8);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = (uSY) DataBindingUtil.inflate(getCustomLayoutInflater(), C48033uCm.Activity.YFmri, constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments != null && (string = arguments.getString("page_title", "")) != null) {
            str = string;
        }
        this.copydefault = str;
        android.os.Bundle arguments2 = getArguments();
        this.OLrzqt = (java.util.ArrayList) (arguments2 != null ? arguments2.getSerializable("page_detail") : null);
    }

    private final void copydefault() {
        C43316rmw c43316rmwEZpvd = EZpvd();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c43316rmwEZpvd.register(ExplainItemModel.class, new C53151wgA(fragmentActivityRequireActivity));
        java.util.ArrayList<ExplainItemModel> arrayList = this.OLrzqt;
        if (arrayList != null) {
            EZpvd().setItems(arrayList);
        }
        uSY usy = this.KWHzl;
        uSY usy2 = null;
        if (usy == null) {
            Intrinsics.gEmmrt("");
            usy = null;
        }
        usy.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireActivity()));
        uSY usy3 = this.KWHzl;
        if (usy3 == null) {
            Intrinsics.gEmmrt("");
            usy3 = null;
        }
        RecyclerView recyclerView = usy3.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        wPQ.OLrzqt(recyclerView);
        uSY usy4 = this.KWHzl;
        if (usy4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            usy2 = usy4;
        }
        usy2.AEQbTJ.setAdapter(EZpvd());
    }
}
