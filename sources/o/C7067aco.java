package o;

import com.ibm.icu.text.Normalizer;
import com.ibm.icu.text.Normalizer2;
import o.C7069acq;

/* JADX INFO: renamed from: o.aco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7067aco {
    public final Activity AEQbTJ;
    public final C7069acq AhwBna;
    public final StateListAnimator KWHzl;
    public final StateListAnimator OLrzqt;
    public final ActionBar gEmmrt;
    public static AbstractC7013abN<java.lang.String, C7067aco, java.nio.ByteBuffer> copydefault = new AbstractC7078acz<java.lang.String, C7067aco, java.nio.ByteBuffer>() { // from class: o.aco.3
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public C7067aco copydefault(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            C7069acq c7069acqAEQbTJ;
            if (byteBuffer == null) {
                c7069acqAEQbTJ = new C7069acq().copydefault(str + ".nrm");
            } else {
                c7069acqAEQbTJ = new C7069acq().AEQbTJ(byteBuffer);
            }
            return new C7067aco(c7069acqAEQbTJ);
        }
    };
    public static final FragmentManager EZpvd = new FragmentManager();

    /* JADX INFO: renamed from: o.aco$FragmentManager */
    public static final class FragmentManager extends Normalizer2 {
        @Override // com.ibm.icu.text.Normalizer2
        public boolean KWHzl(java.lang.CharSequence charSequence) {
            return true;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean OLrzqt(int i) {
            return true;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean copydefault(int i) {
            return true;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public java.lang.StringBuilder copydefault(java.lang.CharSequence charSequence, java.lang.StringBuilder sb) {
            if (sb != charSequence) {
                sb.setLength(0);
                sb.append(charSequence);
                return sb;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // com.ibm.icu.text.Normalizer2
        public java.lang.StringBuilder EZpvd(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
            if (sb != charSequence) {
                sb.append(charSequence);
                return sb;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // com.ibm.icu.text.Normalizer2
        public java.lang.StringBuilder OLrzqt(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
            if (sb != charSequence) {
                sb.append(charSequence);
                return sb;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // com.ibm.icu.text.Normalizer2
        public Normalizer.QuickCheckResult OLrzqt(java.lang.CharSequence charSequence) {
            return Normalizer.DbNXlk;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public int copydefault(java.lang.CharSequence charSequence) {
            return charSequence.length();
        }
    }

    /* JADX INFO: renamed from: o.aco$Fragment */
    public static abstract class Fragment extends Normalizer2 {
        public final C7069acq AEQbTJ;

        public abstract int KWHzl(int i);

        public abstract void copydefault(java.lang.CharSequence charSequence, C7069acq.StateListAnimator stateListAnimator);

        public abstract void copydefault(java.lang.CharSequence charSequence, boolean z, C7069acq.StateListAnimator stateListAnimator);

        public Fragment(C7069acq c7069acq) {
            this.AEQbTJ = c7069acq;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public java.lang.StringBuilder copydefault(java.lang.CharSequence charSequence, java.lang.StringBuilder sb) {
            if (sb == charSequence) {
                throw new java.lang.IllegalArgumentException();
            }
            sb.setLength(0);
            copydefault(charSequence, new C7069acq.StateListAnimator(this.AEQbTJ, sb, charSequence.length()));
            return sb;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public java.lang.StringBuilder EZpvd(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
            return AEQbTJ(sb, charSequence, true);
        }

        @Override // com.ibm.icu.text.Normalizer2
        public java.lang.StringBuilder OLrzqt(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
            return AEQbTJ(sb, charSequence, false);
        }

        public java.lang.StringBuilder AEQbTJ(java.lang.StringBuilder sb, java.lang.CharSequence charSequence, boolean z) {
            if (sb == charSequence) {
                throw new java.lang.IllegalArgumentException();
            }
            copydefault(charSequence, z, new C7069acq.StateListAnimator(this.AEQbTJ, sb, sb.length() + charSequence.length()));
            return sb;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public int AEQbTJ(int i) {
            C7069acq c7069acq = this.AEQbTJ;
            return c7069acq.EZpvd(c7069acq.AkhnZx(i));
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean KWHzl(java.lang.CharSequence charSequence) {
            return charSequence.length() == copydefault(charSequence);
        }

        @Override // com.ibm.icu.text.Normalizer2
        public Normalizer.QuickCheckResult OLrzqt(java.lang.CharSequence charSequence) {
            return KWHzl(charSequence) ? Normalizer.DbNXlk : Normalizer.fetchVPNInfo;
        }
    }

    /* JADX INFO: renamed from: o.aco$Activity */
    public static final class Activity extends Fragment {
        public Activity(C7069acq c7069acq) {
            super(c7069acq);
        }

        @Override // o.C7067aco.Fragment
        public void copydefault(java.lang.CharSequence charSequence, C7069acq.StateListAnimator stateListAnimator) {
            this.AEQbTJ.copydefault(charSequence, 0, charSequence.length(), stateListAnimator);
        }

        @Override // o.C7067aco.Fragment
        public void copydefault(java.lang.CharSequence charSequence, boolean z, C7069acq.StateListAnimator stateListAnimator) {
            this.AEQbTJ.copydefault(charSequence, z, stateListAnimator);
        }

        @Override // com.ibm.icu.text.Normalizer2
        public int copydefault(java.lang.CharSequence charSequence) {
            return this.AEQbTJ.copydefault(charSequence, 0, charSequence.length(), null);
        }

        @Override // o.C7067aco.Fragment
        public int KWHzl(int i) {
            C7069acq c7069acq = this.AEQbTJ;
            return c7069acq.AubY(c7069acq.AkhnZx(i)) ? 1 : 0;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean copydefault(int i) {
            return this.AEQbTJ.fIwbmz(i);
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean OLrzqt(int i) {
            return this.AEQbTJ.getFieldNames(i);
        }
    }

    /* JADX INFO: renamed from: o.aco$StateListAnimator */
    public static final class StateListAnimator extends Fragment {
        public final boolean EZpvd;

        public StateListAnimator(C7069acq c7069acq, boolean z) {
            super(c7069acq);
            this.EZpvd = z;
        }

        @Override // o.C7067aco.Fragment
        public void copydefault(java.lang.CharSequence charSequence, C7069acq.StateListAnimator stateListAnimator) {
            this.AEQbTJ.copydefault(charSequence, 0, charSequence.length(), this.EZpvd, true, stateListAnimator);
        }

        @Override // o.C7067aco.Fragment
        public void copydefault(java.lang.CharSequence charSequence, boolean z, C7069acq.StateListAnimator stateListAnimator) {
            this.AEQbTJ.KWHzl(charSequence, z, this.EZpvd, stateListAnimator);
        }

        @Override // o.C7067aco.Fragment, com.ibm.icu.text.Normalizer2
        public boolean KWHzl(java.lang.CharSequence charSequence) {
            return this.AEQbTJ.copydefault(charSequence, 0, charSequence.length(), this.EZpvd, false, new C7069acq.StateListAnimator(this.AEQbTJ, new java.lang.StringBuilder(), 5));
        }

        @Override // o.C7067aco.Fragment, com.ibm.icu.text.Normalizer2
        public Normalizer.QuickCheckResult OLrzqt(java.lang.CharSequence charSequence) {
            int iOLrzqt = this.AEQbTJ.OLrzqt(charSequence, 0, charSequence.length(), this.EZpvd, false);
            if ((iOLrzqt & 1) != 0) {
                return Normalizer.valueOf;
            }
            if ((iOLrzqt >>> 1) == charSequence.length()) {
                return Normalizer.DbNXlk;
            }
            return Normalizer.fetchVPNInfo;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public int copydefault(java.lang.CharSequence charSequence) {
            return this.AEQbTJ.OLrzqt(charSequence, 0, charSequence.length(), this.EZpvd, true) >>> 1;
        }

        @Override // o.C7067aco.Fragment
        public int KWHzl(int i) {
            C7069acq c7069acq = this.AEQbTJ;
            return c7069acq.AhwBna(c7069acq.AkhnZx(i));
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean copydefault(int i) {
            return this.AEQbTJ.AuCTel(i);
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean OLrzqt(int i) {
            return this.AEQbTJ.copydefault(i, this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.aco$ActionBar */
    public static final class ActionBar extends Fragment {
        public ActionBar(C7069acq c7069acq) {
            super(c7069acq);
        }

        @Override // o.C7067aco.Fragment
        public void copydefault(java.lang.CharSequence charSequence, C7069acq.StateListAnimator stateListAnimator) {
            this.AEQbTJ.EZpvd(charSequence, 0, charSequence.length(), stateListAnimator);
        }

        @Override // o.C7067aco.Fragment
        public void copydefault(java.lang.CharSequence charSequence, boolean z, C7069acq.StateListAnimator stateListAnimator) {
            this.AEQbTJ.KWHzl(charSequence, z, stateListAnimator);
        }

        @Override // com.ibm.icu.text.Normalizer2
        public int copydefault(java.lang.CharSequence charSequence) {
            return this.AEQbTJ.EZpvd(charSequence, 0, charSequence.length(), null);
        }

        @Override // o.C7067aco.Fragment
        public int KWHzl(int i) {
            C7069acq c7069acq = this.AEQbTJ;
            return c7069acq.AubY(c7069acq.AkhnZx(i)) ? 1 : 0;
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean copydefault(int i) {
            return this.AEQbTJ.ejfBZ(i);
        }

        @Override // com.ibm.icu.text.Normalizer2
        public boolean OLrzqt(int i) {
            return this.AEQbTJ.wlaJM(i);
        }
    }

    public C7067aco(C7069acq c7069acq) {
        this.AhwBna = c7069acq;
        this.KWHzl = new StateListAnimator(c7069acq, false);
        this.AEQbTJ = new Activity(c7069acq);
        this.gEmmrt = new ActionBar(c7069acq);
        this.OLrzqt = new StateListAnimator(c7069acq, true);
    }

    public static C7067aco EZpvd(PendingIntent pendingIntent) {
        if (pendingIntent.OLrzqt == null) {
            return pendingIntent.EZpvd;
        }
        throw pendingIntent.OLrzqt;
    }

    public static C7067aco AEQbTJ() {
        return EZpvd(Application.EZpvd);
    }

    public static C7067aco OLrzqt() {
        return EZpvd(TaskDescription.OLrzqt);
    }

    public static C7067aco copydefault() {
        return EZpvd(Dialog.AEQbTJ);
    }

    public static Fragment KWHzl(int i) {
        if (i == 0) {
            return AEQbTJ().AEQbTJ;
        }
        if (i == 1) {
            return OLrzqt().AEQbTJ;
        }
        if (i == 2) {
            return AEQbTJ().KWHzl;
        }
        if (i != 3) {
            return null;
        }
        return OLrzqt().KWHzl;
    }

    public static Normalizer2 KWHzl() {
        return AEQbTJ().gEmmrt;
    }

    /* JADX INFO: renamed from: o.aco$PendingIntent */
    public static final class PendingIntent {
        public C7067aco EZpvd;
        public java.lang.RuntimeException OLrzqt;

        public PendingIntent(java.lang.String str) {
            try {
                this.EZpvd = new C7067aco(new C7069acq().copydefault(str + ".nrm"));
            } catch (java.lang.RuntimeException e) {
                this.OLrzqt = e;
            }
        }
    }

    /* JADX INFO: renamed from: o.aco$Application */
    public static final class Application {
        public static final PendingIntent EZpvd = new PendingIntent("nfc");

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.aco$TaskDescription */
    public static final class TaskDescription {
        public static final PendingIntent OLrzqt = new PendingIntent("nfkc");

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.aco$Dialog */
    public static final class Dialog {
        public static final PendingIntent AEQbTJ = new PendingIntent("nfkc_cf");

        private Dialog() {
        }
    }
}
