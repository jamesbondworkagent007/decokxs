package com.ibm.icu.text;

import com.ibm.icu.util.ULocale;
import java.text.Format;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UFormat extends Format {
    private static final long serialVersionUID = -4964390515840164416L;
    private ULocale actualLocale;
    private ULocale validLocale;

    public static abstract class SpanField extends Format.Field {
        private static final long serialVersionUID = -4732719509273350606L;

        public SpanField(String str) {
            super(str);
        }
    }

    public final ULocale getLocale(ULocale.StateListAnimator stateListAnimator) {
        return stateListAnimator == ULocale.ACTUAL_LOCALE ? this.actualLocale : this.validLocale;
    }

    public final void setLocale(ULocale uLocale, ULocale uLocale2) {
        if ((uLocale == null) != (uLocale2 == null)) {
            throw new IllegalArgumentException();
        }
        this.validLocale = uLocale;
        this.actualLocale = uLocale2;
    }
}
