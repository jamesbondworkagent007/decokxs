package com.ibm.icu.impl;

import com.ibm.icu.util.ULocale;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;
import o.AbstractC7205afT;

/* JADX INFO: loaded from: classes3.dex */
public class CurrencyData {
    public static final StateListAnimator KWHzl;

    public interface StateListAnimator {
        TaskDescription OLrzqt(ULocale uLocale, boolean z);
    }

    public static abstract class TaskDescription extends AbstractC7205afT {
        public abstract Activity AEQbTJ(String str);

        public abstract CurrencySpacingInfo KWHzl();

        public abstract Map<String, String> copydefault();
    }

    private CurrencyData() {
    }

    public static final class Activity {
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;

        public Activity(String str, String str2, String str3, String str4) {
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.KWHzl = str4;
        }
    }

    public static final class CurrencySpacingInfo {
        public static final CurrencySpacingInfo EZpvd = new CurrencySpacingInfo("[:letter:]", "[:digit:]", " ", "[:letter:]", "[:digit:]", " ");
        public final String[][] KWHzl = (String[][]) Array.newInstance((Class<?>) String.class, SpacingType.COUNT.ordinal(), SpacingPattern.COUNT.ordinal());
        public boolean copydefault = false;
        public boolean AEQbTJ = false;

        public enum SpacingType {
            BEFORE,
            AFTER,
            COUNT
        }

        public enum SpacingPattern {
            CURRENCY_MATCH(0),
            SURROUNDING_MATCH(1),
            INSERT_BETWEEN(2),
            COUNT;

            static final /* synthetic */ boolean $assertionsDisabled = false;

            SpacingPattern(int i) {
            }
        }

        public CurrencySpacingInfo() {
        }

        public CurrencySpacingInfo(String... strArr) {
            int i = 0;
            for (int i2 = 0; i2 < SpacingType.COUNT.ordinal(); i2++) {
                for (int i3 = 0; i3 < SpacingPattern.COUNT.ordinal(); i3++) {
                    this.KWHzl[i2][i3] = strArr[i];
                    i++;
                }
            }
        }

        public void AEQbTJ(SpacingType spacingType, SpacingPattern spacingPattern, String str) {
            int iOrdinal = spacingType.ordinal();
            int iOrdinal2 = spacingPattern.ordinal();
            String[] strArr = this.KWHzl[iOrdinal];
            if (strArr[iOrdinal2] == null) {
                strArr[iOrdinal2] = str;
            }
        }

        public String[] KWHzl() {
            return this.KWHzl[SpacingType.BEFORE.ordinal()];
        }

        public String[] AEQbTJ() {
            return this.KWHzl[SpacingType.AFTER.ordinal()];
        }
    }

    static {
        StateListAnimator stateListAnimator;
        try {
            stateListAnimator = (StateListAnimator) ICUCurrencyDisplayInfoProvider.class.newInstance();
        } catch (Throwable unused) {
            stateListAnimator = new StateListAnimator() { // from class: com.ibm.icu.impl.CurrencyData.4
                @Override // com.ibm.icu.impl.CurrencyData.StateListAnimator
                public TaskDescription OLrzqt(ULocale uLocale, boolean z) {
                    return Application.OLrzqt(z);
                }
            };
        }
        KWHzl = stateListAnimator;
    }

    public static class Application extends TaskDescription {
        public final boolean copydefault;
        public static final TaskDescription EZpvd = new Application(true);
        public static final TaskDescription AEQbTJ = new Application(false);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final TaskDescription OLrzqt(boolean z) {
            return z ? EZpvd : AEQbTJ;
        }

        @Override // com.ibm.icu.impl.CurrencyData.TaskDescription
        public Activity AEQbTJ(String str) {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC7205afT
        public String EZpvd(String str) {
            if (this.copydefault) {
                return str;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC7205afT
        public String KWHzl(String str) {
            if (this.copydefault) {
                return str;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC7205afT
        public String OLrzqt(String str) {
            if (this.copydefault) {
                return str;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC7205afT
        public String OLrzqt(String str, String str2) {
            if (this.copydefault) {
                return str;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC7205afT
        public String copydefault(String str) {
            if (this.copydefault) {
                return str;
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC7205afT
        public String valueOf(String str) {
            if (this.copydefault) {
                return str;
            }
            return null;
        }

        public Application(boolean z) {
            this.copydefault = z;
        }

        @Override // o.AbstractC7205afT
        public Map<String, String> OLrzqt() {
            return Collections.emptyMap();
        }

        @Override // o.AbstractC7205afT
        public Map<String, String> AEQbTJ() {
            return Collections.emptyMap();
        }

        @Override // com.ibm.icu.impl.CurrencyData.TaskDescription
        public Map<String, String> copydefault() {
            if (this.copydefault) {
                return Collections.emptyMap();
            }
            return null;
        }

        @Override // com.ibm.icu.impl.CurrencyData.TaskDescription
        public CurrencySpacingInfo KWHzl() {
            if (this.copydefault) {
                return CurrencySpacingInfo.EZpvd;
            }
            return null;
        }
    }
}
