package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import java.math.RoundingMode;
import o.C38307pTy;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: loaded from: classes11.dex */
public final class wUB {
    public static final java.lang.String copydefault(long j) {
        java.lang.String strValueOf = java.lang.String.valueOf(j);
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault(C33129mqd.divS$default(strValueOf, "86400000", 0, null, null, 12, null));
        java.lang.String strRemS$default = C33129mqd.remS$default(strValueOf, "86400000", null, null, null, 14, null);
        return C33069mpW.copydefault(C55688xof.Application.ComponentActivityExternalSyntheticLambda3, C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, strCopydefault), C56390yDp.OLrzqt("hour", xmr.copydefault(C33129mqd.divS$default(strRemS$default, "3600000", 0, null, null, 12, null))), C56390yDp.OLrzqt("minute", xmr.copydefault(C33129mqd.divS$default(C33129mqd.remS$default(strRemS$default, "3600000", null, null, null, 14, null), "60000", 0, null, null, 12, null)))));
    }

    public static final java.lang.String OLrzqt(int i) {
        int i2 = i / 1440;
        int i3 = i % 1440;
        int i4 = i3 / 60;
        double d = ((double) i3) % ((double) 60);
        if (i2 > 0) {
            int i5 = C48033uCm.Fragment.dtVxwd;
            C38307pTy.Application application = C38307pTy.Companion;
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, pTB.formatICUNumber$default(java.lang.Integer.valueOf(i2), null, application.EZpvd(0), null, null, 13, null));
            kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("hour", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i4), null, application.EZpvd(0), null, null, 13, null));
            C38307pTy c38307pTyEZpvd = application.EZpvd(0);
            return C33069mpW.copydefault(i5, C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt("minute", pTB.formatICUNumber$default(java.lang.Double.valueOf(d), RoundingMode.UP, c38307pTyEZpvd, null, null, 12, null))));
        }
        if (i4 > 0) {
            int i6 = C48033uCm.Fragment.fRNHEq;
            C38307pTy.Application application2 = C38307pTy.Companion;
            kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt("hour", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i4), null, application2.EZpvd(0), null, null, 13, null));
            C38307pTy c38307pTyEZpvd2 = application2.EZpvd(0);
            return C33069mpW.copydefault(i6, C56424yEw.gEmmrt(pairOLrzqt3, C56390yDp.OLrzqt("minute", pTB.formatICUNumber$default(java.lang.Double.valueOf(d), RoundingMode.UP, c38307pTyEZpvd2, null, null, 12, null))));
        }
        int i7 = C48033uCm.Fragment.sJPPOI;
        C38307pTy c38307pTyEZpvd3 = C38307pTy.Companion.EZpvd(0);
        return C33069mpW.copydefault(i7, C56423yEv.EZpvd(C56390yDp.OLrzqt("minute", pTB.formatICUNumber$default(java.lang.Double.valueOf(d), RoundingMode.UP, c38307pTyEZpvd3, null, null, 12, null))));
    }

    public static final java.lang.String OLrzqt(double d) {
        int iCopydefault = C56548yJl.copydefault((int) java.lang.Math.ceil(d * ((double) 60)), 1);
        int i = iCopydefault / 1440;
        int i2 = iCopydefault % 1440;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i > 0) {
            int i5 = C48033uCm.Fragment.dtVxwd;
            C38307pTy.Application application = C38307pTy.Companion;
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, pTB.formatICUNumber$default(java.lang.Integer.valueOf(i), null, application.EZpvd(0), null, null, 13, null));
            kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt("hour", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i3), null, application.EZpvd(0), null, null, 13, null));
            C38307pTy c38307pTyEZpvd = application.EZpvd(0);
            return C33069mpW.copydefault(i5, C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt("minute", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i4), RoundingMode.UP, c38307pTyEZpvd, null, null, 12, null))));
        }
        if (i3 > 0) {
            int i6 = C48033uCm.Fragment.fRNHEq;
            C38307pTy.Application application2 = C38307pTy.Companion;
            kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt("hour", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i3), null, application2.EZpvd(0), null, null, 13, null));
            C38307pTy c38307pTyEZpvd2 = application2.EZpvd(0);
            return C33069mpW.copydefault(i6, C56424yEw.gEmmrt(pairOLrzqt3, C56390yDp.OLrzqt("minute", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i4), RoundingMode.UP, c38307pTyEZpvd2, null, null, 12, null))));
        }
        int i7 = C48033uCm.Fragment.sJPPOI;
        C38307pTy c38307pTyEZpvd3 = C38307pTy.Companion.EZpvd(0);
        return C33069mpW.copydefault(i7, C56423yEv.EZpvd(C56390yDp.OLrzqt("minute", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i4), RoundingMode.UP, c38307pTyEZpvd3, null, null, 12, null))));
    }
}
