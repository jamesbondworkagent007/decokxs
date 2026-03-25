package com.ibm.icu.impl.units;

import androidx.core.view.InputDeviceCompat;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.StringTrieBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import o.C7215afd;
import o.C7216afe;
import o.C7218afg;
import o.C7244agF;
import o.C7251agM;

/* JADX INFO: loaded from: classes3.dex */
public class MeasureUnitImpl {
    public final ArrayList<C7215afd> EZpvd;
    public String KWHzl;
    public MeasureUnit.Complexity OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MeasureUnit.Complexity OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(MeasureUnit.Complexity complexity) {
        this.OLrzqt = complexity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArrayList<C7215afd> gEmmrt() {
        return this.EZpvd;
    }

    public MeasureUnitImpl() {
        this.KWHzl = null;
        this.OLrzqt = MeasureUnit.Complexity.SINGLE;
        this.EZpvd = new ArrayList<>();
    }

    public MeasureUnitImpl(C7215afd c7215afd) {
        this();
        EZpvd(c7215afd);
    }

    public static MeasureUnitImpl EZpvd(String str) {
        return UnitsParser.EZpvd(str);
    }

    public MeasureUnitImpl copydefault() {
        MeasureUnitImpl measureUnitImpl = new MeasureUnitImpl();
        measureUnitImpl.OLrzqt = this.OLrzqt;
        measureUnitImpl.KWHzl = this.KWHzl;
        Iterator<C7215afd> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            measureUnitImpl.EZpvd.add(it.next().OLrzqt());
        }
        return measureUnitImpl;
    }

    public void djBIcL() {
        this.KWHzl = null;
        for (C7215afd c7215afd : this.EZpvd) {
            c7215afd.copydefault(c7215afd.EZpvd() * (-1));
        }
    }

    public ArrayList<MeasureUnitImpl> EZpvd() {
        ArrayList<MeasureUnitImpl> arrayList = new ArrayList<>();
        if (OLrzqt() == MeasureUnit.Complexity.MIXED) {
            Iterator<C7215afd> it = gEmmrt().iterator();
            while (it.hasNext()) {
                arrayList.add(new MeasureUnitImpl(it.next()));
            }
            return arrayList;
        }
        arrayList.add(copydefault());
        return arrayList;
    }

    public void EZpvd(int i) {
        for (C7215afd c7215afd : this.EZpvd) {
            c7215afd.copydefault(c7215afd.EZpvd() * i);
        }
    }

    public boolean EZpvd(C7215afd c7215afd) {
        C7215afd c7215afd2 = null;
        this.KWHzl = null;
        if (c7215afd == null) {
            return false;
        }
        Iterator<C7215afd> it = this.EZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7215afd next = it.next();
            if (next.KWHzl(c7215afd)) {
                c7215afd2 = next;
                break;
            }
        }
        if (c7215afd2 != null) {
            c7215afd2.copydefault(c7215afd2.EZpvd() + c7215afd.EZpvd());
            return false;
        }
        this.EZpvd.add(c7215afd.OLrzqt());
        if (this.EZpvd.size() > 1 && this.OLrzqt == MeasureUnit.Complexity.SINGLE) {
            OLrzqt(MeasureUnit.Complexity.COMPOUND);
        }
        return true;
    }

    public MeasureUnit AEQbTJ() {
        return MeasureUnit.fromMeasureUnitImpl(this);
    }

    public C7215afd AhwBna() {
        if (this.EZpvd.size() == 0) {
            return new C7215afd();
        }
        if (this.EZpvd.size() == 1) {
            return this.EZpvd.get(0).OLrzqt();
        }
        throw new UnsupportedOperationException();
    }

    public void AYXKKw() {
        if (gEmmrt().size() == 0) {
            return;
        }
        if (this.OLrzqt == MeasureUnit.Complexity.COMPOUND) {
            Collections.sort(gEmmrt(), new ActionBar());
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = false;
        for (C7215afd c7215afd : gEmmrt()) {
            if (z && c7215afd.EZpvd() < 0) {
                z2 = true;
                z = false;
            } else if (c7215afd.EZpvd() < 0) {
                z2 = false;
            }
            String strKWHzl = c7215afd.KWHzl();
            if (OLrzqt() == MeasureUnit.Complexity.MIXED) {
                if (sb.length() != 0) {
                    sb.append("-and-");
                }
            } else if (z2) {
                if (sb.length() == 0) {
                    sb.append("per-");
                } else {
                    sb.append("-per-");
                }
            } else if (sb.length() != 0) {
                sb.append("-");
            }
            sb.append(strKWHzl);
        }
        this.KWHzl = sb.toString();
    }

    public enum CompoundPart {
        PER(0),
        TIMES(1),
        AND(2);

        private final int index;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getTrieIndex() {
            return this.index + 128;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getValue() {
            return this.index;
        }

        CompoundPart(int i) {
            this.index = i;
        }

        public static CompoundPart getCompoundPartFromTrieIndex(int i) {
            int i2 = i - 128;
            if (i2 == 0) {
                return PER;
            }
            if (i2 == 1) {
                return TIMES;
            }
            if (i2 == 2) {
                return AND;
            }
            throw new AssertionError("CompoundPart index must be 0, 1 or 2");
        }
    }

    public enum PowerPart {
        P2(2),
        P3(3),
        P4(4),
        P5(5),
        P6(6),
        P7(7),
        P8(8),
        P9(9),
        P10(10),
        P11(11),
        P12(12),
        P13(13),
        P14(14),
        P15(15);

        private final int power;

        public static int getPowerFromTrieIndex(int i) {
            return i + InputDeviceCompat.SOURCE_ANY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getTrieIndex() {
            return this.power + 256;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getValue() {
            return this.power;
        }

        PowerPart(int i) {
            this.power = i;
        }
    }

    public enum InitialCompoundPart {
        INITIAL_COMPOUND_PART_PER(0);

        private final int index;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getTrieIndex() {
            return this.index + 192;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getValue() {
            return this.index;
        }

        InitialCompoundPart(int i) {
            this.index = i;
        }

        public static InitialCompoundPart getInitialCompoundPartFromTrieIndex(int i) {
            if (i - 192 == 0) {
                return INITIAL_COMPOUND_PART_PER;
            }
            throw new IllegalArgumentException("Incorrect trieIndex");
        }
    }

    public static class UnitsParser {
        public static volatile C7244agF OLrzqt;
        public final C7244agF AYXKKw;
        public final String EZpvd;
        public int AEQbTJ = 0;
        public boolean copydefault = false;
        public boolean KWHzl = false;

        public UnitsParser(String str) {
            this.EZpvd = str;
            try {
                this.AYXKKw = OLrzqt.clone();
            } catch (CloneNotSupportedException unused) {
                throw new ICUCloneNotSupportedException();
            }
        }

        static {
            C7251agM c7251agM = new C7251agM();
            c7251agM.EZpvd("-per-", CompoundPart.PER.getTrieIndex());
            c7251agM.EZpvd("-", CompoundPart.TIMES.getTrieIndex());
            c7251agM.EZpvd("-and-", CompoundPart.AND.getTrieIndex());
            c7251agM.EZpvd("per-", InitialCompoundPart.INITIAL_COMPOUND_PART_PER.getTrieIndex());
            PowerPart powerPart = PowerPart.P2;
            c7251agM.EZpvd("square-", powerPart.getTrieIndex());
            PowerPart powerPart2 = PowerPart.P3;
            c7251agM.EZpvd("cubic-", powerPart2.getTrieIndex());
            c7251agM.EZpvd("pow2-", powerPart.getTrieIndex());
            c7251agM.EZpvd("pow3-", powerPart2.getTrieIndex());
            c7251agM.EZpvd("pow4-", PowerPart.P4.getTrieIndex());
            c7251agM.EZpvd("pow5-", PowerPart.P5.getTrieIndex());
            c7251agM.EZpvd("pow6-", PowerPart.P6.getTrieIndex());
            c7251agM.EZpvd("pow7-", PowerPart.P7.getTrieIndex());
            c7251agM.EZpvd("pow8-", PowerPart.P8.getTrieIndex());
            c7251agM.EZpvd("pow9-", PowerPart.P9.getTrieIndex());
            c7251agM.EZpvd("pow10-", PowerPart.P10.getTrieIndex());
            c7251agM.EZpvd("pow11-", PowerPart.P11.getTrieIndex());
            c7251agM.EZpvd("pow12-", PowerPart.P12.getTrieIndex());
            c7251agM.EZpvd("pow13-", PowerPart.P13.getTrieIndex());
            c7251agM.EZpvd("pow14-", PowerPart.P14.getTrieIndex());
            c7251agM.EZpvd("pow15-", PowerPart.P15.getTrieIndex());
            for (MeasureUnit.SIPrefix sIPrefix : MeasureUnit.SIPrefix.values()) {
                c7251agM.EZpvd(sIPrefix.getIdentifier(), EZpvd(sIPrefix));
            }
            String[] strArrOLrzqt = C7216afe.OLrzqt();
            for (int i = 0; i < strArrOLrzqt.length; i++) {
                c7251agM.EZpvd(strArrOLrzqt[i], i + 512);
            }
            OLrzqt = c7251agM.copydefault(StringTrieBuilder.Option.FAST);
        }

        public static MeasureUnitImpl EZpvd(String str) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            return new UnitsParser(str).AEQbTJ();
        }

        public static MeasureUnit.SIPrefix KWHzl(int i) {
            for (MeasureUnit.SIPrefix sIPrefix : MeasureUnit.SIPrefix.values()) {
                if (EZpvd(sIPrefix) == i) {
                    return sIPrefix;
                }
            }
            throw new IllegalArgumentException("Incorrect trieIndex");
        }

        public static int EZpvd(MeasureUnit.SIPrefix sIPrefix) {
            return sIPrefix.getPower() + 64;
        }

        public final MeasureUnitImpl AEQbTJ() {
            MeasureUnitImpl measureUnitImpl = new MeasureUnitImpl();
            if (this.EZpvd.isEmpty()) {
                return null;
            }
            while (EZpvd()) {
                this.KWHzl = false;
                boolean zEZpvd = measureUnitImpl.EZpvd(KWHzl());
                if (!this.KWHzl || zEZpvd) {
                    if (measureUnitImpl.EZpvd.size() >= 2) {
                        MeasureUnit.Complexity complexity = this.KWHzl ? MeasureUnit.Complexity.MIXED : MeasureUnit.Complexity.COMPOUND;
                        if (measureUnitImpl.gEmmrt().size() == 2) {
                            measureUnitImpl.OLrzqt(complexity);
                        } else if (measureUnitImpl.OLrzqt() != complexity) {
                            throw new IllegalArgumentException("Can't have mixed compound units");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Two similar units are not allowed in a mixed unit.");
                }
            }
            return measureUnitImpl;
        }

        public final C7215afd KWHzl() {
            C7215afd c7215afd = new C7215afd();
            char c = 0;
            boolean z = this.AEQbTJ == 0;
            Token tokenCopydefault = copydefault();
            if (z) {
                if (tokenCopydefault.AEQbTJ() == Token.Type.TYPE_INITIAL_COMPOUND_PART) {
                    this.copydefault = true;
                    c7215afd.copydefault(-1);
                    tokenCopydefault = copydefault();
                }
            } else {
                if (tokenCopydefault.AEQbTJ() != Token.Type.TYPE_COMPOUND_PART) {
                    throw new IllegalArgumentException("token type must be TYPE_COMPOUND_PART");
                }
                int i = AnonymousClass1.EZpvd[CompoundPart.getCompoundPartFromTrieIndex(tokenCopydefault.copydefault()).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (this.copydefault) {
                                throw new IllegalArgumentException("Can't start with \"-and-\", and mixed compound units");
                            }
                            this.KWHzl = true;
                        }
                    } else if (this.copydefault) {
                        c7215afd.copydefault(-1);
                    }
                } else {
                    if (this.KWHzl) {
                        throw new IllegalArgumentException("Mixed compound units not yet supported");
                    }
                    this.copydefault = true;
                    c7215afd.copydefault(-1);
                }
                tokenCopydefault = copydefault();
            }
            while (true) {
                int i2 = AnonymousClass1.copydefault[tokenCopydefault.AEQbTJ().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c7215afd.OLrzqt(tokenCopydefault.KWHzl(), C7216afe.OLrzqt());
                            return c7215afd;
                        }
                        throw new IllegalArgumentException();
                    }
                    if (c > 1) {
                        throw new IllegalArgumentException();
                    }
                    c7215afd.copydefault(tokenCopydefault.EZpvd());
                    c = 2;
                } else {
                    if (c > 0) {
                        throw new IllegalArgumentException();
                    }
                    c7215afd.copydefault(c7215afd.EZpvd() * tokenCopydefault.OLrzqt());
                    c = 1;
                }
                if (!EZpvd()) {
                    throw new IllegalArgumentException("We ran out of tokens before finding a complete single unit.");
                }
                tokenCopydefault = copydefault();
            }
        }

        public final boolean EZpvd() {
            return this.AEQbTJ < this.EZpvd.length();
        }

        public final Token copydefault() {
            this.AYXKKw.OLrzqt();
            int iEZpvd = -1;
            int i = -1;
            while (this.AEQbTJ < this.EZpvd.length()) {
                C7244agF c7244agF = this.AYXKKw;
                String str = this.EZpvd;
                int i2 = this.AEQbTJ;
                this.AEQbTJ = i2 + 1;
                BytesTrie.Result resultCopydefault = c7244agF.copydefault(str.charAt(i2));
                if (resultCopydefault == BytesTrie.Result.NO_MATCH) {
                    break;
                }
                if (resultCopydefault != BytesTrie.Result.NO_VALUE) {
                    iEZpvd = this.AYXKKw.EZpvd();
                    i = this.AEQbTJ;
                    if (resultCopydefault == BytesTrie.Result.FINAL_VALUE) {
                        break;
                    }
                    if (resultCopydefault != BytesTrie.Result.INTERMEDIATE_VALUE) {
                        throw new IllegalArgumentException("result must has an intermediate value");
                    }
                }
            }
            if (iEZpvd < 0) {
                throw new IllegalArgumentException("Encountered unknown token starting at index " + i);
            }
            this.AEQbTJ = i;
            return new Token(iEZpvd);
        }

        public static class Token {
            public final int KWHzl;
            public final Type copydefault;

            public enum Type {
                TYPE_UNDEFINED,
                TYPE_SI_PREFIX,
                TYPE_COMPOUND_PART,
                TYPE_INITIAL_COMPOUND_PART,
                TYPE_POWER_PART,
                TYPE_SIMPLE_UNIT
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Type AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int KWHzl() {
                return this.KWHzl - 512;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int copydefault() {
                return this.KWHzl;
            }

            public Token(int i) {
                this.KWHzl = i;
                this.copydefault = OLrzqt(i);
            }

            public MeasureUnit.SIPrefix EZpvd() {
                return UnitsParser.KWHzl(this.KWHzl);
            }

            public int OLrzqt() {
                return PowerPart.getPowerFromTrieIndex(this.KWHzl);
            }

            public final Type OLrzqt(int i) {
                if (i <= 0) {
                    throw new AssertionError("fMatch must have a positive value");
                }
                if (i < 128) {
                    return Type.TYPE_SI_PREFIX;
                }
                if (i < 192) {
                    return Type.TYPE_COMPOUND_PART;
                }
                if (i < 256) {
                    return Type.TYPE_INITIAL_COMPOUND_PART;
                }
                if (i < 512) {
                    return Type.TYPE_POWER_PART;
                }
                return Type.TYPE_SIMPLE_UNIT;
            }
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.units.MeasureUnitImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[UnitsParser.Token.Type.values().length];
            copydefault = iArr;
            try {
                iArr[UnitsParser.Token.Type.TYPE_POWER_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[UnitsParser.Token.Type.TYPE_SI_PREFIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[UnitsParser.Token.Type.TYPE_SIMPLE_UNIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CompoundPart.values().length];
            EZpvd = iArr2;
            try {
                iArr2[CompoundPart.PER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EZpvd[CompoundPart.TIMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EZpvd[CompoundPart.AND.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class StateListAnimator implements Comparator<MeasureUnitImpl> {
        public final C7218afg AEQbTJ;

        public StateListAnimator(C7218afg c7218afg) {
            this.AEQbTJ = c7218afg;
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public int compare(MeasureUnitImpl measureUnitImpl, MeasureUnitImpl measureUnitImpl2) {
            return new UnitConverter(measureUnitImpl, measureUnitImpl2, this.AEQbTJ).AEQbTJ(BigDecimal.valueOf(1L)).compareTo(BigDecimal.valueOf(1L));
        }
    }

    public static class ActionBar implements Comparator<C7215afd> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public int compare(C7215afd c7215afd, C7215afd c7215afd2) {
            return c7215afd.AEQbTJ(c7215afd2);
        }
    }

    public String toString() {
        return "MeasureUnitImpl [" + AEQbTJ().getIdentifier() + "]";
    }
}
