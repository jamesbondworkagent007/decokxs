package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.UResourceBundle;
import java.util.Collections;
import o.C7207afV;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.abZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7025abZ extends C7207afV {
    public ICUResourceBundle EZpvd;
    public ICUResourceBundle OLrzqt;

    /* JADX INFO: renamed from: o.abZ$Application */
    public interface Application<T> {
        void AEQbTJ(java.lang.String str, java.lang.String str2, long j, long j2, int i, boolean z);

        java.util.List<T> EZpvd();

        int copydefault();
    }

    public C7025abZ() {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b/curr", "supplementalData", ICUResourceBundle.AEQbTJ);
        this.EZpvd = iCUResourceBundle.OLrzqt("CurrencyMap");
        this.OLrzqt = iCUResourceBundle.OLrzqt("CurrencyMeta");
    }

    @Override // o.C7207afV
    public java.util.List<java.lang.String> copydefault(C7207afV.ActionBar actionBar) {
        return copydefault(new StateListAnimator(), actionBar);
    }

    @Override // o.C7207afV
    public C7207afV.TaskDescription copydefault(java.lang.String str, Currency.CurrencyUsage currencyUsage) {
        ICUResourceBundle iCUResourceBundleGEmmrt = this.OLrzqt.gEmmrt(str);
        if (iCUResourceBundleGEmmrt == null) {
            iCUResourceBundleGEmmrt = this.OLrzqt.gEmmrt("DEFAULT");
        }
        int[] iArrUzCIH = iCUResourceBundleGEmmrt.uzCIH();
        if (currencyUsage == Currency.CurrencyUsage.CASH) {
            return new C7207afV.TaskDescription(iArrUzCIH[2], iArrUzCIH[3]);
        }
        if (currencyUsage == Currency.CurrencyUsage.STANDARD) {
            return new C7207afV.TaskDescription(iArrUzCIH[0], iArrUzCIH[1]);
        }
        return new C7207afV.TaskDescription(iArrUzCIH[0], iArrUzCIH[1]);
    }

    public final <T> java.util.List<T> copydefault(Application<T> application, C7207afV.ActionBar actionBar) {
        if (actionBar == null) {
            actionBar = C7207afV.ActionBar.copydefault();
        }
        int iCopydefault = application.copydefault();
        java.lang.String str = actionBar.copydefault;
        if (str != null) {
            iCopydefault |= 1;
        }
        if (actionBar.EZpvd != null) {
            iCopydefault |= 2;
        }
        if (actionBar.KWHzl != Long.MIN_VALUE || actionBar.valueOf != Long.MAX_VALUE) {
            iCopydefault |= 4;
        }
        if (actionBar.OLrzqt) {
            iCopydefault |= 8;
        }
        if (iCopydefault != 0) {
            if (str != null) {
                ICUResourceBundle iCUResourceBundleGEmmrt = this.EZpvd.gEmmrt(str);
                if (iCUResourceBundleGEmmrt != null) {
                    OLrzqt(application, actionBar, iCopydefault, iCUResourceBundleGEmmrt);
                }
            } else {
                for (int i = 0; i < this.EZpvd.fARcdN(); i++) {
                    OLrzqt(application, actionBar, iCopydefault, this.EZpvd.OLrzqt(i));
                }
            }
        }
        return application.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[PHI: r6 r8
  0x007c: PHI (r6v1 long) = (r6v0 long), (r6v2 long) binds: [B:21:0x0058, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]
  0x007c: PHI (r8v1 long) = (r8v0 long), (r8v2 long) binds: [B:21:0x0058, B:26:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void OLrzqt(Application<T> application, C7207afV.ActionBar actionBar, int i, ICUResourceBundle iCUResourceBundle) {
        java.lang.String fieldNames;
        boolean z;
        java.lang.String strAEQbTJ = iCUResourceBundle.AEQbTJ();
        boolean z2 = true;
        if (i == 1) {
            application.AEQbTJ(iCUResourceBundle.AEQbTJ(), null, 0L, 0L, -1, false);
            return;
        }
        boolean z3 = false;
        int i2 = 0;
        while (i2 < iCUResourceBundle.fARcdN()) {
            ICUResourceBundle iCUResourceBundleOLrzqt = iCUResourceBundle.OLrzqt(i2);
            if (iCUResourceBundleOLrzqt.fARcdN() != 0) {
                if ((i & 2) != 0) {
                    fieldNames = iCUResourceBundleOLrzqt.copydefault("id").getFieldNames();
                    java.lang.String str = actionBar.EZpvd;
                    if (str == null || str.equals(fieldNames)) {
                    }
                } else {
                    fieldNames = null;
                }
                java.lang.String str2 = fieldNames;
                long jAEQbTJ = Long.MIN_VALUE;
                long jAEQbTJ2 = Long.MAX_VALUE;
                if ((i & 4) != 0) {
                    jAEQbTJ = AEQbTJ(iCUResourceBundleOLrzqt.copydefault("from"), Long.MIN_VALUE, z3);
                    jAEQbTJ2 = AEQbTJ(iCUResourceBundleOLrzqt.copydefault("to"), Long.MAX_VALUE, z2);
                    if (actionBar.KWHzl <= jAEQbTJ2 && actionBar.valueOf >= jAEQbTJ) {
                        if ((i & 8) != 0) {
                            ICUResourceBundle iCUResourceBundleCopydefault = iCUResourceBundleOLrzqt.copydefault("tender");
                            boolean z4 = iCUResourceBundleCopydefault == null || "true".equals(iCUResourceBundleCopydefault.getFieldNames());
                            if (!actionBar.OLrzqt || z4) {
                                z = z4;
                            }
                        } else {
                            z = true;
                        }
                        application.AEQbTJ(strAEQbTJ, str2, jAEQbTJ, jAEQbTJ2, i2, z);
                    }
                }
            }
            i2++;
            z2 = true;
            z3 = false;
        }
    }

    public final long AEQbTJ(ICUResourceBundle iCUResourceBundle, long j, boolean z) {
        if (iCUResourceBundle == null) {
            return j;
        }
        int[] iArrUzCIH = iCUResourceBundle.uzCIH();
        return (((long) iArrUzCIH[0]) << 32) | (((long) iArrUzCIH[1]) & BodyPartID.bodyIdMax);
    }

    /* JADX INFO: renamed from: o.abZ$TaskDescription */
    public static class TaskDescription<T> {
        public java.util.Set<T> AEQbTJ = new java.util.HashSet();
        public java.util.List<T> EZpvd = new java.util.ArrayList();

        private TaskDescription() {
        }

        public static <T> TaskDescription<T> KWHzl() {
            return new TaskDescription<>();
        }

        public void KWHzl(T t) {
            if (this.AEQbTJ.contains(t)) {
                return;
            }
            this.EZpvd.add(t);
            this.AEQbTJ.add(t);
        }

        public java.util.List<T> EZpvd() {
            return Collections.unmodifiableList(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.abZ$StateListAnimator */
    public static class StateListAnimator implements Application<java.lang.String> {
        public final TaskDescription<java.lang.String> AEQbTJ;

        @Override // o.C7025abZ.Application
        public int copydefault() {
            return 2;
        }

        private StateListAnimator() {
            this.AEQbTJ = TaskDescription.KWHzl();
        }

        @Override // o.C7025abZ.Application
        public void AEQbTJ(java.lang.String str, java.lang.String str2, long j, long j2, int i, boolean z) {
            this.AEQbTJ.KWHzl(str2);
        }

        @Override // o.C7025abZ.Application
        public java.util.List<java.lang.String> EZpvd() {
            return this.AEQbTJ.EZpvd();
        }
    }
}
