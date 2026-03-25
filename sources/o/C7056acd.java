package o;

import com.ibm.icu.impl.CacheValue;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.UResourceBundle;
import com.ibm.icu.util.UResourceTypeMismatchException;
import java.util.TreeSet;
import o.C7061aci;

/* JADX INFO: renamed from: o.acd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7056acd extends ICUResourceBundle {
    public int AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DbNXlk() {
        return this.AhwBna;
    }

    public C7056acd(C7056acd c7056acd, java.lang.String str, int i) {
        super(c7056acd, str);
        this.AhwBna = i;
    }

    public C7056acd(ICUResourceBundle.ActionBar actionBar) {
        super(actionBar);
        this.AhwBna = actionBar.copydefault.EZpvd();
    }

    public final ICUResourceBundle EZpvd(java.lang.String str, int i, java.util.HashMap<java.lang.String, java.lang.String> map, UResourceBundle uResourceBundle) {
        int iAEQbTJ = C7061aci.AEQbTJ(i);
        if (iAEQbTJ != 14) {
            switch (iAEQbTJ) {
                case 0:
                case 6:
                    return new FragmentManager(this, str, i);
                case 1:
                    return new TaskDescription(this, str, i);
                case 2:
                case 4:
                case 5:
                    return new PendingIntent(this, str, i);
                case 3:
                    return ICUResourceBundle.copydefault(this, null, 0, str, i, map, uResourceBundle);
                case 7:
                    return new Activity(this, str, i);
                case 8:
                case 9:
                    return new StateListAnimator(this, str, i);
                default:
                    throw new java.lang.IllegalStateException("The resource type is unknown");
            }
        }
        return new Application(this, str, i);
    }

    /* JADX INFO: renamed from: o.acd$TaskDescription */
    public static final class TaskDescription extends C7056acd {
        @Override // com.ibm.icu.util.UResourceBundle
        public int AuCTel() {
            return 1;
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public java.nio.ByteBuffer ejfBZ() {
            return this.djBIcL.copydefault.gEmmrt(this.AhwBna);
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public byte[] copydefault(byte[] bArr) {
            return this.djBIcL.copydefault.EZpvd(this.AhwBna, bArr);
        }

        public TaskDescription(C7056acd c7056acd, java.lang.String str, int i) {
            super(c7056acd, str, i);
        }
    }

    /* JADX INFO: renamed from: o.acd$Activity */
    public static final class Activity extends C7056acd {
        @Override // com.ibm.icu.util.UResourceBundle
        public int AuCTel() {
            return 7;
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public int fIwbmz() {
            return C7061aci.KWHzl(this.AhwBna);
        }

        public Activity(C7056acd c7056acd, java.lang.String str, int i) {
            super(c7056acd, str, i);
        }
    }

    /* JADX INFO: renamed from: o.acd$FragmentManager */
    public static final class FragmentManager extends C7056acd {
        public java.lang.String AYXKKw;

        @Override // com.ibm.icu.util.UResourceBundle
        public int AuCTel() {
            return 0;
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public java.lang.String getFieldNames() {
            java.lang.String str = this.AYXKKw;
            return str != null ? str : this.djBIcL.copydefault.fARcdN(this.AhwBna);
        }

        public FragmentManager(C7056acd c7056acd, java.lang.String str, int i) {
            super(c7056acd, str, i);
            java.lang.String strFARcdN = this.djBIcL.copydefault.fARcdN(i);
            if (strFARcdN.length() < 12 || CacheValue.copydefault()) {
                this.AYXKKw = strFARcdN;
            }
        }
    }

    /* JADX INFO: renamed from: o.acd$Application */
    public static final class Application extends C7056acd {
        @Override // com.ibm.icu.util.UResourceBundle
        public int AuCTel() {
            return 14;
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public int[] uzCIH() {
            return this.djBIcL.copydefault.AkhnZx(this.AhwBna);
        }

        public Application(C7056acd c7056acd, java.lang.String str, int i) {
            super(c7056acd, str, i);
        }
    }

    /* JADX INFO: renamed from: o.acd$ActionBar */
    public static abstract class ActionBar extends C7056acd {
        public C7061aci.Activity valueOf;

        @Override // com.ibm.icu.util.UResourceBundle
        public int fARcdN() {
            return this.valueOf.KWHzl();
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public java.lang.String copydefault(int i) {
            int iCopydefault = this.valueOf.copydefault(this.djBIcL.copydefault, i);
            if (iCopydefault == -1) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            java.lang.String strFARcdN = this.djBIcL.copydefault.fARcdN(iCopydefault);
            return strFARcdN != null ? strFARcdN : super.copydefault(i);
        }

        public int AEQbTJ(int i) {
            return this.valueOf.copydefault(this.djBIcL.copydefault, i);
        }

        public UResourceBundle copydefault(int i, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, UResourceBundle uResourceBundle) {
            int iAEQbTJ = AEQbTJ(i);
            if (iAEQbTJ == -1) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return EZpvd(str, iAEQbTJ, map, uResourceBundle);
        }

        public ActionBar(C7056acd c7056acd, java.lang.String str, int i) {
            super(c7056acd, str, i);
        }

        public ActionBar(ICUResourceBundle.ActionBar actionBar) {
            super(actionBar);
        }
    }

    /* JADX INFO: renamed from: o.acd$StateListAnimator */
    public static class StateListAnimator extends ActionBar {
        @Override // com.ibm.icu.util.UResourceBundle
        public int AuCTel() {
            return 8;
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public java.lang.String[] fJNWhG() {
            C7061aci c7061aci = this.djBIcL.copydefault;
            int iKWHzl = this.valueOf.KWHzl();
            java.lang.String[] strArr = new java.lang.String[iKWHzl];
            for (int i = 0; i < iKWHzl; i++) {
                java.lang.String strFARcdN = c7061aci.fARcdN(this.valueOf.copydefault(c7061aci, i));
                if (strFARcdN == null) {
                    throw new UResourceTypeMismatchException("");
                }
                strArr[i] = strFARcdN;
            }
            return strArr;
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public java.lang.String[] isConnected() {
            return fJNWhG();
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public UResourceBundle AEQbTJ(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, UResourceBundle uResourceBundle) {
            return copydefault(java.lang.Integer.parseInt(str), str, map, uResourceBundle);
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public UResourceBundle EZpvd(int i, java.util.HashMap<java.lang.String, java.lang.String> map, UResourceBundle uResourceBundle) {
            return copydefault(i, java.lang.Integer.toString(i), map, uResourceBundle);
        }

        public StateListAnimator(C7056acd c7056acd, java.lang.String str, int i) {
            super(c7056acd, str, i);
            this.valueOf = this.djBIcL.copydefault.AYXKKw(i);
        }
    }

    /* JADX INFO: renamed from: o.acd$PendingIntent */
    public static class PendingIntent extends ActionBar {
        @Override // com.ibm.icu.util.UResourceBundle
        public int AuCTel() {
            return 2;
        }

        @Override // com.ibm.icu.util.UResourceBundle, java.util.ResourceBundle
        public java.util.Set<java.lang.String> handleKeySet() {
            C7061aci c7061aci = this.djBIcL.copydefault;
            TreeSet treeSet = new TreeSet();
            C7061aci.FragmentManager fragmentManager = (C7061aci.FragmentManager) this.valueOf;
            for (int i = 0; i < fragmentManager.KWHzl(); i++) {
                treeSet.add(fragmentManager.AEQbTJ(c7061aci, i));
            }
            return treeSet;
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public UResourceBundle AEQbTJ(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, UResourceBundle uResourceBundle) {
            int iEZpvd = ((C7061aci.FragmentManager) this.valueOf).EZpvd(this.djBIcL.copydefault, str);
            if (iEZpvd < 0) {
                return null;
            }
            return EZpvd(str, AEQbTJ(iEZpvd), map, uResourceBundle);
        }

        @Override // com.ibm.icu.util.UResourceBundle
        public UResourceBundle EZpvd(int i, java.util.HashMap<java.lang.String, java.lang.String> map, UResourceBundle uResourceBundle) {
            java.lang.String strAEQbTJ = ((C7061aci.FragmentManager) this.valueOf).AEQbTJ(this.djBIcL.copydefault, i);
            if (strAEQbTJ == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            return EZpvd(strAEQbTJ, AEQbTJ(i), map, uResourceBundle);
        }

        @Override // com.ibm.icu.util.UResourceBundle, java.util.ResourceBundle
        public java.lang.Object handleGetObject(java.lang.String str) {
            C7061aci c7061aci = this.djBIcL.copydefault;
            int iEZpvd = ((C7061aci.FragmentManager) this.valueOf).EZpvd(c7061aci, str);
            if (iEZpvd >= 0) {
                int iCopydefault = this.valueOf.copydefault(c7061aci, iEZpvd);
                java.lang.String strFARcdN = c7061aci.fARcdN(iCopydefault);
                if (strFARcdN != null) {
                    return strFARcdN;
                }
                C7061aci.StateListAnimator stateListAnimatorAYXKKw = c7061aci.AYXKKw(iCopydefault);
                if (stateListAnimatorAYXKKw != null) {
                    int iKWHzl = stateListAnimatorAYXKKw.KWHzl();
                    java.lang.String[] strArr = new java.lang.String[iKWHzl];
                    for (int i = 0; i != iKWHzl; i++) {
                        java.lang.String strFARcdN2 = c7061aci.fARcdN(stateListAnimatorAYXKKw.copydefault(c7061aci, i));
                        if (strFARcdN2 != null) {
                            strArr[i] = strFARcdN2;
                        }
                    }
                    return strArr;
                }
            }
            return super.handleGetObject(str);
        }

        public java.lang.String AhwBna(java.lang.String str) {
            C7061aci c7061aci = this.djBIcL.copydefault;
            int iEZpvd = ((C7061aci.FragmentManager) this.valueOf).EZpvd(c7061aci, str);
            if (iEZpvd < 0) {
                return null;
            }
            return c7061aci.fARcdN(this.valueOf.copydefault(c7061aci, iEZpvd));
        }

        public PendingIntent(C7056acd c7056acd, java.lang.String str, int i) {
            super(c7056acd, str, i);
            this.valueOf = this.djBIcL.copydefault.fIwbmz(i);
        }

        public PendingIntent(ICUResourceBundle.ActionBar actionBar, int i) {
            super(actionBar);
            this.valueOf = actionBar.copydefault.fIwbmz(i);
        }
    }
}
