package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jIV extends C40529qZf {
    public static final ActionBar Companion = new ActionBar(null);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jIV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C40529qZf AEQbTJ(@NotNull Calendar calendar) {
            Intrinsics.checkNotNullParameter(calendar, "");
            jIV jiv = new jIV();
            jiv.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key.content_res_id", java.lang.Integer.valueOf(qZH.ActionBar.KDccX)), C56390yDp.OLrzqt("key.from_date_time", java.lang.Long.valueOf(calendar.getTime().getTime()))));
            return jiv;
        }
    }

    @Override // o.C40529qZf, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Calendar calendar = Calendar.getInstance(yCN.OLrzqt("Asia/Shanghai"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.add(14, (int) (calendar.getTime().getTime() - calendar2.getTime().getTime()));
        Date time = calendar2.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        java.lang.String time$default = pTA.formatTime$default(time, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        java.lang.String strCopydefault = C33069mpW.copydefault(qZH.PendingIntent.RLmrWm, C56424yEw.gEmmrt(C56390yDp.OLrzqt("startTime", time$default), C56390yDp.OLrzqt("endTime", time$default)));
        android.widget.TextView textView = (android.widget.TextView) constraintLayout.findViewById(qZH.StateListAnimator.iluEmO);
        if (textView != null) {
            textView.setText(strCopydefault);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
