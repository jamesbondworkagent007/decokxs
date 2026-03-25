package o;

import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41113qkg extends AbstractC52792wYn {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public java.util.List<? extends PeriodEnum> AhwBna;
    public java.lang.String EZpvd;
    public DialogInterface.OnDismissListener OLrzqt;
    public java.lang.String KWHzl = "RANKING_PERIOD_1D";
    public java.util.ArrayList<C55276xgr> AEQbTJ = new java.util.ArrayList<>();

    public C41113qkg() {
        java.lang.String strAYXKKw;
        java.util.List<PeriodEnum> listCopydefault = new C41626quP(null, null, 3, null).copydefault();
        this.AhwBna = listCopydefault;
        PeriodEnum periodEnum = (PeriodEnum) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, 0);
        this.EZpvd = (periodEnum == null || (strAYXKKw = C33070mpX.AYXKKw(periodEnum.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    /* JADX INFO: renamed from: o.qkg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qkg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C41113qkg OLrzqt() {
            return new C41113qkg();
        }
    }

    public final void copydefault() {
        this.AEQbTJ.clear();
        for (PeriodEnum periodEnum : this.AhwBna) {
            periodEnum.setSelected(Intrinsics.EZpvd((java.lang.Object) periodEnum.getInputPara(), (java.lang.Object) EZpvd(this.KWHzl).getInputPara()));
            java.util.ArrayList<C55276xgr> arrayList = this.AEQbTJ;
            java.lang.String string = getString(periodEnum.getTitleResId());
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new C55276xgr(string, periodEnum, null, periodEnum.isSelected(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        java.util.List<PeriodEnum> listCopydefault;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key.current_select_period")) != null) {
            this.KWHzl = string;
            this.EZpvd = C33070mpX.AYXKKw(EZpvd(string).getTitleResId());
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (arguments2.getBoolean("key.is_all_period", true)) {
                listCopydefault = new C41626quP(null, null, 3, null).AEQbTJ();
            } else {
                listCopydefault = new C41626quP(null, null, 3, null).copydefault();
            }
            this.AhwBna = listCopydefault;
        }
        copydefault();
    }

    public final PeriodEnum EZpvd(java.lang.String str) {
        try {
            return PeriodEnum.valueOf(str);
        } catch (java.lang.Exception unused) {
            return PeriodEnum.RANKING_PERIOD_1D;
        }
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iOLrzqt = C55298xhM.OLrzqt(12, contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        constraintLayout.setPaddingRelative(0, iOLrzqt, 0, C55298xhM.OLrzqt(24, contextRequireContext2));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(0);
        c55198xfS.setSingleOneColumnData(this.AEQbTJ, new yHO() { // from class: o.qki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C41113qkg.OLrzqt(this.copydefault, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit OLrzqt(C41113qkg c41113qkg, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.String strName;
        PeriodEnum periodEnum = (PeriodEnum) CollectionsKt___CollectionsKt.AkhnZx(c41113qkg.AhwBna, CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C55276xgr>) ((java.util.List<? extends java.lang.Object>) c41113qkg.AEQbTJ), c55276xgr));
        if (periodEnum == null || (strName = periodEnum.name()) == null) {
            strName = "RANKING_PERIOD_1D";
        }
        c41113qkg.KWHzl = strName;
        c41113qkg.EZpvd = java.lang.String.valueOf(c55276xgr != null ? c55276xgr.AhwBna() : null);
        int i = 0;
        for (java.lang.Object obj : c41113qkg.AhwBna) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((PeriodEnum) obj).setSelected(i == CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C55276xgr>) ((java.util.List<? extends java.lang.Object>) c41113qkg.AEQbTJ), c55276xgr));
            i++;
        }
        c41113qkg.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key.request_key_ranking")) != null) {
            FragmentKt.setFragmentResult(this, string, BundleKt.bundleOf(C56390yDp.OLrzqt("key.select_period", this.KWHzl), C56390yDp.OLrzqt("key.select_period_string", this.EZpvd)));
        }
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.OLrzqt;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
