package com.ibm.icu.text;

import com.ibm.icu.impl.FormattedValueStringBuilderImpl;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.UFormat;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.InvalidObjectException;
import java.text.Format;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;
import o.C7020abU;
import o.C7027acA;
import o.C7028acB;
import o.C7045acS;
import o.InterfaceC7054acb;

/* JADX INFO: loaded from: classes3.dex */
public final class ListFormatter {
    public final String AkhnZx;
    public final TaskDescription fetchVPNInfo;
    public final String isConnected;
    public final ULocale values;
    public static final String gEmmrt = copydefault("{0} y {1}", new StringBuilder());
    public static final String EZpvd = copydefault("{0} e {1}", new StringBuilder());
    public static final String AhwBna = copydefault("{0} o {1}", new StringBuilder());
    public static final String AYXKKw = copydefault("{0} u {1}", new StringBuilder());
    public static final Pattern copydefault = Pattern.compile("(i.*|hi|hi[^ae].*)", 2);
    public static final Pattern AEQbTJ = Pattern.compile("((o|ho|8).*|11)", 2);
    public static final String valueOf = copydefault("{0} ו{1}", new StringBuilder());
    public static final String djBIcL = copydefault("{0} ו-{1}", new StringBuilder());
    public static final Pattern OLrzqt = Pattern.compile("^[\\P{InHebrew}].*$");
    public static Activity KWHzl = new Activity(null);

    public interface TaskDescription {
        String KWHzl(String str);

        String OLrzqt(String str);
    }

    public enum Type {
        AND,
        OR,
        UNITS
    }

    public enum Width {
        WIDE,
        SHORT,
        NARROW
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 com.ibm.icu.util.ULocale)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ibm.icu.util.ULocale):void (m)] (LINE:41) call: com.ibm.icu.text.ListFormatter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ibm.icu.util.ULocale):void type: THIS */
    public /* synthetic */ ListFormatter(String str, String str2, String str3, String str4, ULocale uLocale, AnonymousClass2 anonymousClass2) {
        this(str, str2, str3, str4, uLocale);
    }

    /* JADX INFO: loaded from: classes14.dex */
    @Deprecated
    public enum Style {
        STANDARD("standard"),
        OR("or"),
        UNIT("unit"),
        UNIT_SHORT("unit-short"),
        UNIT_NARROW("unit-narrow");

        private final String name;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public String getName() {
            return this.name;
        }

        Style(String str) {
            this.name = str;
        }
    }

    public static final class SpanField extends UFormat.SpanField {
        public static final SpanField LIST_SPAN = new SpanField("list-span");
        private static final long serialVersionUID = 3563544214705634403L;

        private SpanField(String str) {
            super(str);
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        @Deprecated
        public Object readResolve() throws InvalidObjectException {
            String name = getName();
            SpanField spanField = LIST_SPAN;
            if (name.equals(spanField.getName())) {
                return spanField;
            }
            throw new InvalidObjectException("An invalid object.");
        }
    }

    public static final class Field extends Format.Field {
        private static final long serialVersionUID = -8071145668708265437L;
        public static Field LITERAL = new Field("literal");
        public static Field ELEMENT = new Field("element");

        private Field(String str) {
            super(str);
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        public Object readResolve() throws InvalidObjectException {
            if (getName().equals(LITERAL.getName())) {
                return LITERAL;
            }
            if (getName().equals(ELEMENT.getName())) {
                return ELEMENT;
            }
            throw new InvalidObjectException("An invalid object.");
        }
    }

    public ListFormatter(String str, String str2, String str3, String str4, ULocale uLocale) {
        this.AkhnZx = str2;
        this.isConnected = str3;
        this.values = uLocale;
        this.fetchVPNInfo = AEQbTJ(str, str4);
    }

    public static String copydefault(String str, StringBuilder sb) {
        return C7028acB.OLrzqt(str, sb, 2, 2);
    }

    public static ListFormatter KWHzl(ULocale uLocale, Type type, Width width) {
        String strEZpvd = EZpvd(type, width);
        if (strEZpvd == null) {
            throw new IllegalArgumentException("Invalid list format type/width");
        }
        return KWHzl.EZpvd(uLocale, strEZpvd);
    }

    @Deprecated
    public static ListFormatter EZpvd(ULocale uLocale, Style style) {
        return KWHzl.EZpvd(uLocale, style.getName());
    }

    public String AEQbTJ(Collection<?> collection) {
        return AEQbTJ(collection, false).toString();
    }

    public Application AEQbTJ(Collection<?> collection, boolean z) {
        Iterator<?> it = collection.iterator();
        int size = collection.size();
        if (size == 0) {
            return new Application("", z);
        }
        if (size == 1) {
            return new Application(it.next(), z);
        }
        int i = 2;
        if (size == 2) {
            Object next = it.next();
            Object next2 = it.next();
            return new Application(next, z).AEQbTJ(this.fetchVPNInfo.OLrzqt(String.valueOf(next2)), next2, 1);
        }
        Application application = new Application(it.next(), z);
        application.AEQbTJ(this.AkhnZx, it.next(), 1);
        while (true) {
            int i2 = size - 1;
            if (i < i2) {
                application.AEQbTJ(this.isConnected, it.next(), i);
                i++;
            } else {
                Object next3 = it.next();
                return application.AEQbTJ(this.fetchVPNInfo.KWHzl(String.valueOf(next3)), next3, i2);
            }
        }
    }

    public static final class StateListAnimator implements TaskDescription {
        public final String AEQbTJ;
        public final String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.text.ListFormatter.TaskDescription
        public String KWHzl(String str) {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.text.ListFormatter.TaskDescription
        public String OLrzqt(String str) {
            return this.KWHzl;
        }

        public StateListAnimator(String str, String str2) {
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    public static final class ActionBar implements TaskDescription {
        public final Pattern AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        public ActionBar(Pattern pattern, String str, String str2, String str3, String str4) {
            this.AEQbTJ = pattern;
            this.OLrzqt = str;
            this.copydefault = str2;
            this.EZpvd = str3;
            this.KWHzl = str4;
        }

        @Override // com.ibm.icu.text.ListFormatter.TaskDescription
        public String OLrzqt(String str) {
            return this.AEQbTJ.matcher(str).matches() ? this.OLrzqt : this.copydefault;
        }

        @Override // com.ibm.icu.text.ListFormatter.TaskDescription
        public String KWHzl(String str) {
            return this.AEQbTJ.matcher(str).matches() ? this.EZpvd : this.KWHzl;
        }
    }

    public final TaskDescription AEQbTJ(String str, String str2) {
        ULocale uLocale = this.values;
        if (uLocale != null) {
            String language = uLocale.getLanguage();
            if (language.equals("es")) {
                String str3 = gEmmrt;
                boolean zEquals = str.equals(str3);
                boolean zEquals2 = str2.equals(str3);
                if (zEquals || zEquals2) {
                    return new ActionBar(copydefault, zEquals ? EZpvd : str, str, zEquals2 ? EZpvd : str2, str2);
                }
                String str4 = AhwBna;
                boolean zEquals3 = str.equals(str4);
                boolean zEquals4 = str2.equals(str4);
                if (zEquals3 || zEquals4) {
                    return new ActionBar(AEQbTJ, zEquals3 ? AYXKKw : str, str, zEquals4 ? AYXKKw : str2, str2);
                }
            } else if (language.equals("he") || language.equals("iw")) {
                String str5 = valueOf;
                boolean zEquals5 = str.equals(str5);
                boolean zEquals6 = str2.equals(str5);
                if (zEquals5 || zEquals6) {
                    return new ActionBar(OLrzqt, zEquals5 ? djBIcL : str, str, zEquals6 ? djBIcL : str2, str2);
                }
            }
        }
        return new StateListAnimator(str, str2);
    }

    public static class Application {
        public C7020abU AEQbTJ;
        public boolean EZpvd;

        public Application(Object obj, boolean z) {
            C7020abU c7020abU = new C7020abU();
            this.AEQbTJ = c7020abU;
            this.EZpvd = z;
            c7020abU.OLrzqt(Field.LITERAL);
            EZpvd(obj, 0);
        }

        public Application AEQbTJ(String str, Object obj, int i) {
            this.AEQbTJ.copydefault(0);
            long jEZpvd = 0;
            while (true) {
                jEZpvd = C7028acB.TaskDescription.EZpvd(jEZpvd, str, this.AEQbTJ);
                if (jEZpvd == -1) {
                    return this;
                }
                if (C7028acB.TaskDescription.AEQbTJ(jEZpvd) == 0) {
                    C7020abU c7020abU = this.AEQbTJ;
                    c7020abU.copydefault(c7020abU.length());
                } else {
                    EZpvd(obj, i);
                }
            }
        }

        public final void EZpvd(Object obj, int i) {
            if (this.EZpvd) {
                FormattedValueStringBuilderImpl.StateListAnimator stateListAnimator = new FormattedValueStringBuilderImpl.StateListAnimator();
                stateListAnimator.EZpvd = SpanField.LIST_SPAN;
                stateListAnimator.OLrzqt = Field.ELEMENT;
                stateListAnimator.AEQbTJ = Integer.valueOf(i);
                this.AEQbTJ.OLrzqt(obj.toString(), stateListAnimator);
                return;
            }
            this.AEQbTJ.OLrzqt(obj.toString(), (Object) null);
        }

        public void OLrzqt(Appendable appendable) {
            C7045acS.copydefault((CharSequence) this.AEQbTJ, appendable);
        }

        public int KWHzl(int i) {
            return FormattedValueStringBuilderImpl.KWHzl(this.AEQbTJ, Integer.valueOf(i));
        }

        public String toString() {
            return this.AEQbTJ.toString();
        }
    }

    public static class Activity {
        public final InterfaceC7054acb<String, ListFormatter> EZpvd;

        private Activity() {
            this.EZpvd = new C7027acA();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:756) call: com.ibm.icu.text.ListFormatter.Activity.<init>():void type: THIS */
        public /* synthetic */ Activity(AnonymousClass2 anonymousClass2) {
            this();
        }

        public ListFormatter EZpvd(ULocale uLocale, String str) {
            String str2 = String.format("%s:%s", uLocale.toString(), str);
            ListFormatter listFormatterEZpvd = this.EZpvd.EZpvd(str2);
            if (listFormatterEZpvd != null) {
                return listFormatterEZpvd;
            }
            ListFormatter listFormatterOLrzqt = OLrzqt(uLocale, str);
            this.EZpvd.KWHzl(str2, listFormatterOLrzqt);
            return listFormatterOLrzqt;
        }

        public static ListFormatter OLrzqt(ULocale uLocale, String str) {
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
            StringBuilder sb = new StringBuilder();
            return new ListFormatter(ListFormatter.copydefault(iCUResourceBundle.valueOf("listPattern/" + str + "/2").getFieldNames(), sb), ListFormatter.copydefault(iCUResourceBundle.valueOf("listPattern/" + str + "/start").getFieldNames(), sb), ListFormatter.copydefault(iCUResourceBundle.valueOf("listPattern/" + str + "/middle").getFieldNames(), sb), ListFormatter.copydefault(iCUResourceBundle.valueOf("listPattern/" + str + "/end").getFieldNames(), sb), uLocale, null);
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.text.ListFormatter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[Type.values().length];
            KWHzl = iArr;
            try {
                iArr[Type.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[Type.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[Type.UNITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Width.values().length];
            AEQbTJ = iArr2;
            try {
                iArr2[Width.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[Width.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[Width.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String EZpvd(Type type, Width width) {
        int i = AnonymousClass2.KWHzl[type.ordinal()];
        if (i == 1) {
            int i2 = AnonymousClass2.AEQbTJ[width.ordinal()];
            if (i2 == 1) {
                return "standard";
            }
            if (i2 == 2) {
                return "standard-short";
            }
            if (i2 != 3) {
                return null;
            }
            return "standard-narrow";
        }
        if (i == 2) {
            int i3 = AnonymousClass2.AEQbTJ[width.ordinal()];
            if (i3 == 1) {
                return "or";
            }
            if (i3 == 2) {
                return "or-short";
            }
            if (i3 != 3) {
                return null;
            }
            return "or-narrow";
        }
        if (i != 3) {
            return null;
        }
        int i4 = AnonymousClass2.AEQbTJ[width.ordinal()];
        if (i4 == 1) {
            return "unit";
        }
        if (i4 == 2) {
            return "unit-short";
        }
        if (i4 != 3) {
            return null;
        }
        return "unit-narrow";
    }
}
