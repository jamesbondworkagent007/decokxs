package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19903gTp extends AbstractC19906gTs {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public RangeFilterUnit EZpvd;

    /* JADX INFO: renamed from: o.gTp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gTp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C19903gTp copydefault(@NotNull java.util.List<? extends RangeFilterUnit> list, @NotNull RangeFilterUnit rangeFilterUnit, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(rangeFilterUnit, "");
            Intrinsics.checkNotNullParameter(str, "");
            C19903gTp c19903gTp = new C19903gTp();
            c19903gTp.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("CopyTradingRangeFilterUnitSelectionBottomSheet.items", new java.util.ArrayList(list)), C56390yDp.OLrzqt("CopyTradingRangeFilterUnitSelectionBottomSheet.selectedItem", rangeFilterUnit), C56390yDp.OLrzqt("CopyTradingRangeFilterUnitSelectionBottomSheet.requestKey", str)));
            return c19903gTp;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.ffGIBT), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.AxsJAYaxsJAY));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        android.os.Bundle arguments = getArguments();
        java.util.List<RangeFilterUnit> parcelableArrayList = arguments != null ? BundleCompat.getParcelableArrayList(arguments, "CopyTradingRangeFilterUnitSelectionBottomSheet.items", RangeFilterUnit.class) : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = yDY.AhwBna();
        }
        android.os.Bundle arguments2 = getArguments();
        this.EZpvd = arguments2 != null ? (RangeFilterUnit) ((android.os.Parcelable) BundleCompat.getParcelable(arguments2, "CopyTradingRangeFilterUnitSelectionBottomSheet.selectedItem", RangeFilterUnit.class)) : null;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(parcelableArrayList, 10));
        for (RangeFilterUnit rangeFilterUnit : parcelableArrayList) {
            android.content.Context context = c55198xfS.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            arrayList.add(new C55276xgr(rangeFilterUnit.getText(context), rangeFilterUnit, null, Intrinsics.EZpvd(rangeFilterUnit, this.EZpvd), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.gTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C19903gTp.AEQbTJ(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C19903gTp c19903gTp, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        RangeFilterUnit rangeFilterUnit = objOLrzqt instanceof RangeFilterUnit ? (RangeFilterUnit) objOLrzqt : null;
        if (rangeFilterUnit != null) {
            c19903gTp.EZpvd = rangeFilterUnit;
        }
        c19903gTp.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("CopyTradingRangeFilterUnitSelectionBottomSheet.requestKey")) == null) {
            return;
        }
        FragmentKt.setFragmentResult(this, string, BundleKt.bundleOf(C56390yDp.OLrzqt("CopyTradingRangeFilterUnitSelectionBottomSheet.selectedItem", this.EZpvd)));
    }
}
