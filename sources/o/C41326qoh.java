package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentKt;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41326qoh extends AbstractC49393unh {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C42642raK OLrzqt;

    /* JADX INFO: renamed from: o.qoh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qoh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<ChargeGroupVo> list, @NotNull ChargeGroupVo chargeGroupVo) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(chargeGroupVo, "");
            C41298qoF.AEQbTJ.EZpvd("MarketDiscoverSpotFilterBottomSheet", "show chargeGroupList: " + list);
            ((C41326qoh) jSA.EZpvd(new C41326qoh(), C56390yDp.OLrzqt("list", new java.util.ArrayList(list)), C56390yDp.OLrzqt("select_target", chargeGroupVo))).show(fragmentManager);
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
        java.util.ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(requireArguments(), "list", ChargeGroupVo.class);
        if (parcelableArrayList == null) {
            dismissAllowingStateLoss();
            return;
        }
        ChargeGroupVo chargeGroupVo = (ChargeGroupVo) BundleCompat.getParcelable(requireArguments(), "select_target", ChargeGroupVo.class);
        if (chargeGroupVo == null) {
            dismissAllowingStateLoss();
            return;
        }
        C41262qnW c41262qnW = new C41262qnW(parcelableArrayList, chargeGroupVo, new Function1() { // from class: o.qoi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41326qoh.AEQbTJ(this.OLrzqt, (ChargeGroupVo) obj);
            }
        });
        C42642raK c42642raKCopydefault = C42642raK.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        c42642raKCopydefault.OLrzqt.setLayoutManager(new WrapContentLinearLayoutManager(requireContext(), 1, false));
        c42642raKCopydefault.OLrzqt.setAdapter(c41262qnW);
        this.OLrzqt = c42642raKCopydefault;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C41326qoh c41326qoh, ChargeGroupVo chargeGroupVo) {
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        java.lang.String name = C41326qoh.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("groupId", chargeGroupVo.OLrzqt().getId());
        Unit unit = Unit.INSTANCE;
        FragmentKt.setFragmentResult(c41326qoh, name, bundle);
        c41326qoh.dismissAllowingStateLoss();
        return unit;
    }
}
