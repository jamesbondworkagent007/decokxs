package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.Modifier;

/* JADX INFO: renamed from: o.adX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7103adX implements InterfaceC7176aer {
    public final Modifier[] AEQbTJ;
    public final Modifier EZpvd;
    public final Modifier KWHzl;
    public boolean OLrzqt;
    public final Modifier copydefault;
    public final Modifier djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.OLrzqt = true;
    }

    public C7103adX(Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4) {
        this.djBIcL = modifier;
        this.EZpvd = modifier2;
        this.KWHzl = modifier3;
        this.copydefault = modifier4;
        this.AEQbTJ = null;
        this.OLrzqt = true;
    }

    public C7103adX() {
        this.djBIcL = null;
        this.EZpvd = null;
        this.KWHzl = null;
        this.copydefault = null;
        this.AEQbTJ = new Modifier[StandardPlural.COUNT * 4];
        this.OLrzqt = false;
    }

    public void AEQbTJ(Modifier.Signum signum, StandardPlural standardPlural, Modifier modifier) {
        this.AEQbTJ[copydefault(signum, standardPlural)] = modifier;
    }

    /* JADX INFO: renamed from: o.adX$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[Modifier.Signum.values().length];
            KWHzl = iArr;
            try {
                iArr[Modifier.Signum.POS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[Modifier.Signum.POS_ZERO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[Modifier.Signum.NEG_ZERO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[Modifier.Signum.NEG.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public Modifier KWHzl(Modifier.Signum signum) {
        int i = AnonymousClass3.KWHzl[signum.ordinal()];
        if (i == 1) {
            return this.djBIcL;
        }
        if (i == 2) {
            return this.EZpvd;
        }
        if (i == 3) {
            return this.KWHzl;
        }
        if (i == 4) {
            return this.copydefault;
        }
        throw new java.lang.AssertionError("Unreachable");
    }

    public Modifier EZpvd(Modifier.Signum signum, StandardPlural standardPlural) {
        return this.AEQbTJ[copydefault(signum, standardPlural)];
    }

    public static int copydefault(Modifier.Signum signum, StandardPlural standardPlural) {
        return (standardPlural.ordinal() * Modifier.Signum.COUNT) + signum.ordinal();
    }
}
