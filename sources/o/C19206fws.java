package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.mine.search.domain.type.SearchSortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19206fws extends wXX {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public C17167exg AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fwr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19206fws.EZpvd(this.copydefault);
        }
    });
    public final boolean OLrzqt;
    public Function1<? super SearchSortType, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.fws$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fws.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19206fws copydefault(@NotNull SearchSortType searchSortType, Function1<? super SearchSortType, Unit> function1) {
            Intrinsics.checkNotNullParameter(searchSortType, "");
            C19206fws c19206fws = new C19206fws();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("selected_sort", searchSortType);
            c19206fws.setArguments(bundle);
            c19206fws.copydefault = function1;
            return c19206fws;
        }
    }

    public final SearchSortType KWHzl() {
        return (SearchSortType) this.EZpvd.getValue();
    }

    public static final SearchSortType EZpvd(C19206fws c19206fws) {
        SearchSortType searchSortType;
        android.os.Bundle arguments = c19206fws.getArguments();
        return (arguments == null || (searchSortType = (SearchSortType) arguments.getParcelable("selected_sort")) == null) ? SearchSortType.DEFAULT : searchSortType;
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
        C17167exg c17167exgCopydefault = C17167exg.copydefault(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.AEQbTJ = c17167exgCopydefault;
        constraintLayout.addView(c17167exgCopydefault != null ? c17167exgCopydefault.getRoot() : null);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
    }

    private final void EZpvd() {
        C17167exg c17167exg = this.AEQbTJ;
        if (c17167exg != null) {
            wYC wyc = c17167exg.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(KWHzl() == SearchSortType.DEFAULT ? 0 : 8);
            wYC wyc2 = c17167exg.EZpvd;
            Intrinsics.checkNotNullExpressionValue(wyc2, "");
            wyc2.setVisibility(KWHzl() == SearchSortType.TURNOVER ? 0 : 8);
            c17167exg.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.fwt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19206fws.copydefault(this.OLrzqt, view);
                }
            });
            c17167exg.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.fwu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19206fws.AEQbTJ(this.KWHzl, view);
                }
            });
        }
    }

    public static final void copydefault(C19206fws c19206fws, android.view.View view) {
        c19206fws.OLrzqt(SearchSortType.DEFAULT);
    }

    public static final void AEQbTJ(C19206fws c19206fws, android.view.View view) {
        c19206fws.OLrzqt(SearchSortType.TURNOVER);
    }

    public final void OLrzqt(SearchSortType searchSortType) {
        Function1<? super SearchSortType, Unit> function1;
        if (searchSortType != KWHzl() && (function1 = this.copydefault) != null) {
            function1.invoke(searchSortType);
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }
}
