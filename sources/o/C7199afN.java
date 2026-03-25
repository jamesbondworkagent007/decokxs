package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ULocale;
import java.util.MissingResourceException;
import o.AbstractC7192afG;
import o.C7059acg;

/* JADX INFO: renamed from: o.afN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7199afN extends AbstractC7192afG.StateListAnimator {
    public static final C7059acg AEQbTJ = new StateListAnimator();
    public static final java.lang.String[] EZpvd = {"grapheme", "word", "line", "sentence", "title"};

    @Override // o.AbstractC7192afG.StateListAnimator
    public AbstractC7192afG KWHzl(ULocale uLocale, int i) {
        C7059acg c7059acg = AEQbTJ;
        if (c7059acg.valueOf()) {
            return copydefault(uLocale, i);
        }
        ULocale[] uLocaleArr = new ULocale[1];
        AbstractC7192afG abstractC7192afG = (AbstractC7192afG) c7059acg.copydefault(uLocale, i, uLocaleArr);
        ULocale uLocale2 = uLocaleArr[0];
        abstractC7192afG.KWHzl(uLocale2, uLocale2);
        return abstractC7192afG;
    }

    /* JADX INFO: renamed from: o.afN$StateListAnimator */
    public static class StateListAnimator extends C7059acg {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C7059acg
        public java.lang.String KWHzl() {
            return "";
        }

        public StateListAnimator() {
            super("BreakIterator");
            copydefault(new ActionBar());
            AYXKKw();
        }

        /* JADX INFO: renamed from: o.afN$StateListAnimator$ActionBar */
        public class ActionBar extends C7059acg.StateListAnimator {
            public ActionBar() {
            }

            @Override // o.C7059acg.StateListAnimator, o.C7059acg.ActionBar
            public java.lang.Object OLrzqt(ULocale uLocale, int i, C7062acj c7062acj) {
                return C7199afN.copydefault(uLocale, i);
            }
        }
    }

    public static AbstractC7192afG copydefault(ULocale uLocale, int i) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String keywordValue;
        java.lang.String keywordValue2;
        ICUResourceBundle iCUResourceBundleOLrzqt = ICUResourceBundle.OLrzqt("com/ibm/icu/impl/data/icudt68b/brkitr", uLocale, ICUResourceBundle.OpenType.LOCALE_ROOT);
        C7287agw c7287agwKWHzl = null;
        if (i == 2 && (keywordValue2 = uLocale.getKeywordValue("lb")) != null && (keywordValue2.equals("strict") || keywordValue2.equals("normal") || keywordValue2.equals("loose"))) {
            str = "_" + keywordValue2;
        } else {
            str = null;
        }
        try {
            if (str == null) {
                str2 = EZpvd[i];
            } else {
                str2 = EZpvd[i] + str;
            }
            try {
                c7287agwKWHzl = C7287agw.KWHzl(C7024abY.OLrzqt("brkitr/" + iCUResourceBundleOLrzqt.djBIcL("boundaries/" + str2)));
            } catch (java.io.IOException e) {
                C7006abE.AEQbTJ(e);
            }
            ULocale uLocaleForLocale = ULocale.forLocale(iCUResourceBundleOLrzqt.getLocale());
            c7287agwKWHzl.KWHzl(uLocaleForLocale, uLocaleForLocale);
            return (i == 3 && (keywordValue = uLocale.getKeywordValue("ss")) != null && keywordValue.equals("standard")) ? AbstractC7267agc.copydefault(new ULocale(uLocale.getBaseName())).KWHzl(c7287agwKWHzl) : c7287agwKWHzl;
        } catch (java.lang.Exception e2) {
            throw new MissingResourceException(e2.toString(), "", "");
        }
    }
}
