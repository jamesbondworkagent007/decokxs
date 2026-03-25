package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.widget.bottom_sheet.SingleSelectionParams;
import com.okinc.business.market.widget.bottom_sheet.SingleSelectionUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31197lpV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C28019kLx extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public C23464hyi KWHzl;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kLz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C28019kLx.copydefault(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kLw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C28019kLx.KWHzl(this.AEQbTJ);
        }
    });

    public final SingleSelectionParams KWHzl() {
        return (SingleSelectionParams) this.EZpvd.getValue();
    }

    public static final SingleSelectionParams copydefault(C28019kLx c28019kLx) {
        SingleSelectionParams singleSelectionParams;
        android.os.Bundle arguments = c28019kLx.getArguments();
        return (arguments == null || (singleSelectionParams = (SingleSelectionParams) BundleCompat.getParcelable(arguments, "key.params", SingleSelectionParams.class)) == null) ? new SingleSelectionParams(null, null, null, 7, null) : singleSelectionParams;
    }

    public final kLC AEQbTJ() {
        java.lang.Object next;
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        java.util.Iterator it = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.Application.copydefault)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof kLC) {
                break;
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
        if (fragment != null) {
            return (kLC) (fragment instanceof kLC ? fragment : null);
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        return (kLC) (fragmentActivityRequireActivity instanceof kLC ? fragmentActivityRequireActivity : null);
    }

    private final kMM EZpvd() {
        return (kMM) this.AEQbTJ.getValue();
    }

    public static final kMM KWHzl(final C28019kLx c28019kLx) {
        kMM kmm = new kMM();
        kmm.register(SingleSelectionUiModel.class, new C28017kLv(new Function1() { // from class: o.kLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28019kLx.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        }));
        return kmm;
    }

    public static final Unit EZpvd(C28019kLx c28019kLx, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        kLC klcAEQbTJ = c28019kLx.AEQbTJ();
        if (klcAEQbTJ != null) {
            klcAEQbTJ.AEQbTJ(str, c28019kLx.KWHzl().OLrzqt());
        }
        c28019kLx.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RecyclerView root;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23464hyi c23464hyiCopydefault = C23464hyi.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        this.KWHzl = c23464hyiCopydefault;
        if (c23464hyiCopydefault != null && (root = c23464hyiCopydefault.getRoot()) != null) {
            root.setAdapter(EZpvd());
        }
        java.util.List<SingleSelectionUiModel> listKWHzl = KWHzl().KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (SingleSelectionUiModel singleSelectionUiModel : listKWHzl) {
            arrayList.add(SingleSelectionUiModel.copy$default(singleSelectionUiModel, null, null, Intrinsics.EZpvd((java.lang.Object) singleSelectionUiModel.KWHzl(), (java.lang.Object) KWHzl().EZpvd()), 3, null));
        }
        kMM.setData$default(EZpvd(), arrayList, null, 2, null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        kLC klcAEQbTJ = AEQbTJ();
        if (klcAEQbTJ != null) {
            klcAEQbTJ.EZpvd(KWHzl().OLrzqt());
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        kLC klcAEQbTJ = AEQbTJ();
        if (klcAEQbTJ != null) {
            klcAEQbTJ.EZpvd(KWHzl().OLrzqt());
        }
    }

    /* JADX INFO: renamed from: o.kLx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kLx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C28019kLx KWHzl(@NotNull SingleSelectionParams singleSelectionParams) {
            Intrinsics.checkNotNullParameter(singleSelectionParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", singleSelectionParams);
            C28019kLx c28019kLx = new C28019kLx();
            c28019kLx.setArguments(bundle);
            return c28019kLx;
        }
    }
}
