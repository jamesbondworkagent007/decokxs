package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C37263oqY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.orx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37341orx extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public C33901nKa valueOf;
    public final C59534zip AEQbTJ = new C59534zip();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.orA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37341orx.copydefault(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.orz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37341orx.AEQbTJ(this.copydefault);
        }
    });
    public final TaskDescription EZpvd = new TaskDescription();

    private final java.lang.String AEQbTJ() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String copydefault(C37341orx c37341orx) {
        android.os.Bundle arguments = c37341orx.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("arg_title") : null;
        return string == null ? "" : string;
    }

    public final java.util.List<PhoneRelation> OLrzqt() {
        return (java.util.List) this.KWHzl.getValue();
    }

    public static final java.util.List AEQbTJ(C37341orx c37341orx) {
        android.os.Bundle arguments = c37341orx.getArguments();
        java.util.ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("arg_local_relation_list") : null;
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    /* JADX INFO: renamed from: o.orx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.orx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C37341orx OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<PhoneRelation> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            C37341orx c37341orx = new C37341orx();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg_title", str);
            bundle.putParcelableArrayList("arg_local_relation_list", new java.util.ArrayList<>(list));
            c37341orx.setArguments(bundle);
            return c37341orx;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(AEQbTJ());
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.valueOf = C33901nKa.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        EZpvd();
    }

    public final void EZpvd() {
        C59534zip c59534zip = this.AEQbTJ;
        C37263oqY c37263oqY = new C37263oqY();
        c37263oqY.AEQbTJ(this.EZpvd);
        Unit unit = Unit.INSTANCE;
        c59534zip.register(PhoneRelation.class, c37263oqY);
        C33901nKa c33901nKa = this.valueOf;
        if (c33901nKa != null) {
            RecyclerView recyclerView = c33901nKa.EZpvd;
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            recyclerView.setAdapter(this.AEQbTJ);
        }
        this.AEQbTJ.setItems(OLrzqt());
    }

    /* JADX INFO: renamed from: o.orx$TaskDescription */
    public static final class TaskDescription implements C37263oqY.StateListAnimator {
        public TaskDescription() {
        }

        @Override // o.C37263oqY.StateListAnimator
        public void AEQbTJ(PhoneRelation phoneRelation) {
            Intrinsics.checkNotNullParameter(phoneRelation, "");
            pUU.KWHzl("GroupedLocalContactSelectionBottomSheet", "local relation selected clicked");
            FragmentKt.setFragmentResult(C37341orx.this, "REQUEST_KEY_SELECTION_LOCAL_RELATION", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_SELECTED_RELATION", phoneRelation)));
            C37341orx.this.dismiss();
        }
    }
}
