package o;

import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.ULocale;
import java.util.MissingResourceException;
import o.AbstractC7206afU;
import o.C7059acg;
import o.C7062acj;

/* JADX INFO: renamed from: o.afQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7202afQ extends AbstractC7206afU.TaskDescription {
    public static C7059acg AEQbTJ = new StateListAnimator();

    @Override // o.AbstractC7206afU.TaskDescription
    public AbstractC7206afU copydefault(ULocale uLocale) {
        try {
            AbstractC7206afU abstractC7206afU = (AbstractC7206afU) AEQbTJ.OLrzqt(uLocale, new ULocale[1]);
            if (abstractC7206afU == null) {
                throw new MissingResourceException("Could not locate Collator data", "", "");
            }
            return (AbstractC7206afU) abstractC7206afU.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    /* JADX INFO: renamed from: o.afQ$StateListAnimator */
    public static class StateListAnimator extends C7059acg {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C7059acg
        public java.lang.String KWHzl() {
            return "";
        }

        public StateListAnimator() {
            super("Collator");
            copydefault(new Application());
            AYXKKw();
        }

        /* JADX INFO: renamed from: o.afQ$StateListAnimator$Application */
        public class Application extends C7059acg.StateListAnimator {
            public Application() {
                super("com/ibm/icu/impl/data/icudt68b/coll");
            }

            @Override // o.C7059acg.StateListAnimator, o.C7059acg.ActionBar
            public java.lang.Object OLrzqt(ULocale uLocale, int i, C7062acj c7062acj) {
                return C7202afQ.AEQbTJ(uLocale);
            }
        }

        @Override // o.C7062acj
        public java.lang.Object EZpvd(C7062acj.StateListAnimator stateListAnimator, java.lang.String[] strArr) {
            if (strArr != null) {
                strArr[0] = "root";
            }
            try {
                return C7202afQ.AEQbTJ(ULocale.ROOT);
            } catch (MissingResourceException unused) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC7206afU AEQbTJ(ULocale uLocale) {
        C7255agQ c7255agQ = new C7255agQ(ULocale.ROOT);
        return new C7286agv(C7051acY.OLrzqt(uLocale, (C7255agQ<ULocale>) c7255agQ), (ULocale) c7255agQ.copydefault);
    }
}
