package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentKt;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40778qeP extends AbstractC49393unh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public C42645raN copydefault;

    /* JADX INFO: renamed from: o.qeP$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qeP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C41298qoF.AEQbTJ.EZpvd("MarketDiscoverSpotFilterBottomSheet", "show periodDateList: " + list + ", selectedDate: " + str);
            ((C40778qeP) jSA.EZpvd(new C40778qeP(), C56390yDp.OLrzqt("list", new java.util.ArrayList(list)), C56390yDp.OLrzqt("date", str))).show(fragmentManager);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        java.util.ArrayList<java.lang.String> stringArrayList = requireArguments().getStringArrayList("list");
        if (stringArrayList == null) {
            dismissAllowingStateLoss();
            return;
        }
        java.lang.String string = requireArguments().getString("date", (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(stringArrayList));
        if (string == null) {
            dismissAllowingStateLoss();
            return;
        }
        this.AEQbTJ = string;
        C40801qem c40801qem = new C40801qem(stringArrayList, string != null ? string : "", new Function1() { // from class: o.qeQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40778qeP.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        C42645raN c42645raNKWHzl = C42645raN.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        c42645raNKWHzl.KWHzl.setLayoutManager(new WrapContentLinearLayoutManager(requireContext(), 1, false));
        c42645raNKWHzl.KWHzl.setAdapter(c40801qem);
        this.copydefault = c42645raNKWHzl;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C40778qeP c40778qeP, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c40778qeP.AEQbTJ = str;
        c40778qeP.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        java.lang.String name = C40778qeP.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("date", this.AEQbTJ);
        Unit unit = Unit.INSTANCE;
        FragmentKt.setFragmentResult(this, name, bundle);
        super.onDismiss(dialogInterface);
    }
}
