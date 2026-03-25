package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lIW extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public C31489luw KWHzl;
    public C3682AqZ OLrzqt;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C31489luw c31489luwCopydefault = C31489luw.copydefault(android.view.LayoutInflater.from(getContext()));
        this.KWHzl = c31489luwCopydefault;
        if (c31489luwCopydefault == null) {
            Intrinsics.gEmmrt("");
            c31489luwCopydefault = null;
        }
        constraintLayout.addView(c31489luwCopydefault.getRoot(), -1, -2);
        OLrzqt();
    }

    public final void OLrzqt() {
        KWHzl();
        copydefault();
        EZpvd();
        AEQbTJ();
    }

    public final void KWHzl() {
        C3682AqZ c3682AqZ = this.OLrzqt;
        C31489luw c31489luw = null;
        if (c3682AqZ == null) {
            Intrinsics.gEmmrt("");
            c3682AqZ = null;
        }
        C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        java.lang.String strAYXKKw = c3686AqdAkhnZx != null ? c3686AqdAkhnZx.AYXKKw() : null;
        C3682AqZ c3682AqZ2 = this.OLrzqt;
        if (c3682AqZ2 == null) {
            Intrinsics.gEmmrt("");
            c3682AqZ2 = null;
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c3682AqZ2.fetchVPNInfo(), (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode());
        C31489luw c31489luw2 = this.KWHzl;
        if (c31489luw2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c31489luw = c31489luw2;
        }
        if (strAYXKKw != null && strAYXKKw.length() != 0 && zEZpvd) {
            c31489luw.values.setText(strAYXKKw);
            c31489luw.gEmmrt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DGUQLIdZmdUa));
            c31489luw.EZpvd.setVisibility(0);
            return;
        }
        c31489luw.EZpvd.setVisibility(8);
    }

    public final void copydefault() {
        C3682AqZ c3682AqZ = this.OLrzqt;
        C31489luw c31489luw = null;
        if (c3682AqZ == null) {
            Intrinsics.gEmmrt("");
            c3682AqZ = null;
        }
        C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        java.lang.String strAhwBna = c3686AqdAkhnZx != null ? c3686AqdAkhnZx.AhwBna() : null;
        C31489luw c31489luw2 = this.KWHzl;
        if (c31489luw2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c31489luw = c31489luw2;
        }
        if (strAhwBna == null || strAhwBna.length() == 0) {
            c31489luw.copydefault.setVisibility(8);
            return;
        }
        c31489luw.copydefault.setVisibility(0);
        c31489luw.valueOf.setText(strAhwBna);
        c31489luw.djBIcL.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.hvKCwS));
    }

    public final void EZpvd() {
        C3682AqZ c3682AqZ = this.OLrzqt;
        C31489luw c31489luw = null;
        if (c3682AqZ == null) {
            Intrinsics.gEmmrt("");
            c3682AqZ = null;
        }
        C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        java.lang.String strGEmmrt = c3686AqdAkhnZx != null ? c3686AqdAkhnZx.gEmmrt() : null;
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(c3686AqdAkhnZx != null ? c3686AqdAkhnZx.values() : null), null, C38307pTy.Companion.KWHzl(0, 2), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), null, 17, null);
        C31489luw c31489luw2 = this.KWHzl;
        if (c31489luw2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c31489luw = c31489luw2;
        }
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            c31489luw.OLrzqt.setVisibility(8);
            return;
        }
        c31489luw.OLrzqt.setVisibility(0);
        c31489luw.isConnected.setText(strGEmmrt);
        c31489luw.DbNXlk.setText(C33069mpW.copydefault(this, C31351lsQ.Activity.gtCCJH, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("serviceFeeRate", iCUPercent$default))));
    }

    public final void AEQbTJ() {
        C3682AqZ c3682AqZ = this.OLrzqt;
        C31489luw c31489luw = null;
        if (c3682AqZ == null) {
            Intrinsics.gEmmrt("");
            c3682AqZ = null;
        }
        C3686Aqd c3686AqdAkhnZx = c3682AqZ.AkhnZx();
        java.lang.String strValueOf = c3686AqdAkhnZx != null ? c3686AqdAkhnZx.valueOf() : null;
        C31489luw c31489luw2 = this.KWHzl;
        if (c31489luw2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c31489luw = c31489luw2;
        }
        if (strValueOf == null || strValueOf.length() == 0) {
            c31489luw.AhwBna.setVisibility(8);
        } else {
            c31489luw.AhwBna.setVisibility(0);
            c31489luw.ejfBZ.setText(strValueOf);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final lIW copydefault(@NotNull C3682AqZ c3682AqZ) {
            Intrinsics.checkNotNullParameter(c3682AqZ, "");
            lIW liw = new lIW();
            liw.OLrzqt = c3682AqZ;
            return liw;
        }
    }
}
