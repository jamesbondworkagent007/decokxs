package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5124Fq implements InterfaceC5095En.Activity {
    public final InterfaceC5100Es EZpvd;
    public final C5101Et KWHzl;
    public final C5125Fr OLrzqt;
    public final XmlStreamReader copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public boolean AEQbTJ() {
        return this.EZpvd.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public long AYXKKw() {
        return this.EZpvd.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public double AhwBna() {
        return this.EZpvd.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public int djBIcL() {
        return this.EZpvd.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.String fetchVPNInfo() {
        return this.EZpvd.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.Void gEmmrt() {
        return this.EZpvd.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public float valueOf() {
        return this.EZpvd.valueOf();
    }

    public C5124Fq(@NotNull XmlStreamReader xmlStreamReader, @NotNull C5101Et c5101Et, @NotNull InterfaceC5100Es interfaceC5100Es) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(interfaceC5100Es, "");
        this.copydefault = xmlStreamReader;
        this.KWHzl = c5101Et;
        this.EZpvd = interfaceC5100Es;
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5125Fr.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        C5125Fr c5125Fr = (C5125Fr) (interfaceC5096Eo instanceof C5125Fr ? interfaceC5096Eo : null);
        this.OLrzqt = c5125Fr == null ? C5125Fr.EZpvd.KWHzl() : c5125Fr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader)
  (r2v0 o.Et)
  (wrap:o.Es:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.Es:0x0006: CONSTRUCTOR (r1v0 aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader), (r2v0 o.Et) A[MD:(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et):void (m), WRAPPED] (LINE:107) call: o.Fs.<init>(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et):void type: CONSTRUCTOR) : (r3v0 o.Es))
 A[MD:(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et, o.Es):void (m)] (LINE:104) call: o.Fq.<init>(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et, o.Es):void type: THIS */
    public /* synthetic */ C5124Fq(XmlStreamReader xmlStreamReader, C5101Et c5101Et, InterfaceC5100Es interfaceC5100Es, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlStreamReader, c5101Et, (i & 4) != 0 ? new C5126Fs(xmlStreamReader, c5101Et) : interfaceC5100Es);
    }

    @Override // o.InterfaceC5095En.Activity
    public boolean copydefault() {
        FA faCopydefault = this.copydefault.copydefault(1);
        if (faCopydefault == null) {
            throw new DeserializationException("Unexpected termination of token stream in " + this.KWHzl);
        }
        FA faCopydefault2 = this.copydefault.copydefault(2);
        if (faCopydefault2 != null) {
            return ((faCopydefault instanceof FA.StateListAnimator) || (faCopydefault2 instanceof FA.StateListAnimator)) ? false : true;
        }
        throw new DeserializationException("Unexpected termination of token stream in " + this.KWHzl);
    }

    @Override // o.InterfaceC5095En.Activity
    public boolean OLrzqt() {
        boolean z;
        java.lang.String strOLrzqt;
        boolean z2;
        boolean zEZpvd;
        FA.ActionBar actionBar;
        java.lang.Object next;
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = this.KWHzl.AEQbTJ();
        if ((setAEQbTJ instanceof java.util.Collection) && setAEQbTJ.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        FA fa = null;
        if (z) {
            java.util.Iterator<T> it2 = this.KWHzl.AEQbTJ().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((InterfaceC5096Eo) next).getClass() == C5128Fu.class) {
                    break;
                }
            }
            InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
            if (!(interfaceC5096Eo instanceof C5128Fu)) {
                interfaceC5096Eo = null;
            }
            C5128Fu c5128Fu = (C5128Fu) interfaceC5096Eo;
            if (c5128Fu == null || (strOLrzqt = c5128Fu.AEQbTJ()) == null) {
                strOLrzqt = this.OLrzqt.EZpvd();
            }
        } else if (!z) {
            strOLrzqt = this.OLrzqt.OLrzqt();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        java.util.Set<InterfaceC5096Eo> setAEQbTJ2 = this.KWHzl.AEQbTJ();
        if ((setAEQbTJ2 instanceof java.util.Collection) && setAEQbTJ2.isEmpty()) {
            z2 = false;
        } else {
            java.util.Iterator<T> it3 = setAEQbTJ2.iterator();
            while (it3.hasNext()) {
                if (((InterfaceC5096Eo) it3.next()) instanceof C5111Fd) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z2) {
            XmlStreamReader xmlStreamReader = this.copydefault;
            FA faOLrzqt = xmlStreamReader.OLrzqt();
            if (faOLrzqt == null || !(faOLrzqt instanceof FA.ActionBar)) {
                while (true) {
                    if (faOLrzqt instanceof FA.ActionBar) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((FA.ActionBar) faOLrzqt).OLrzqt().AEQbTJ(), (java.lang.Object) strOLrzqt)) {
                            FA faAEQbTJ = xmlStreamReader.AEQbTJ();
                            if (faAEQbTJ == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type aws.smithy.kotlin.runtime.serde.xml.XmlToken.BeginElement");
                            }
                            fa = (FA.ActionBar) faAEQbTJ;
                        }
                    } else {
                        xmlStreamReader.AEQbTJ();
                        faOLrzqt = XmlStreamReader.StateListAnimator.peek$default(xmlStreamReader, 0, 1, null);
                        if (faOLrzqt == null) {
                            break;
                        }
                    }
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) ((FA.ActionBar) faOLrzqt).OLrzqt().AEQbTJ(), (java.lang.Object) strOLrzqt)) {
                fa = faOLrzqt;
            }
            actionBar = (FA.ActionBar) fa;
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            XmlStreamReader xmlStreamReader2 = this.copydefault;
            FA faOLrzqt2 = xmlStreamReader2.OLrzqt();
            do {
                zEZpvd = faOLrzqt2 instanceof FA.ActionBar ? Intrinsics.EZpvd((java.lang.Object) ((FA.ActionBar) faOLrzqt2).OLrzqt().AEQbTJ(), (java.lang.Object) strOLrzqt) : false;
                if (!zEZpvd) {
                    faOLrzqt2 = xmlStreamReader2.AEQbTJ();
                }
                if (faOLrzqt2 == null) {
                    break;
                }
            } while (!zEZpvd);
            actionBar = (FA.ActionBar) faOLrzqt2;
        }
        return actionBar != null;
    }

    @Override // o.InterfaceC5095En.Activity
    public java.lang.String KWHzl() {
        boolean zEZpvd;
        XmlStreamReader xmlStreamReader = this.copydefault;
        FA faOLrzqt = xmlStreamReader.OLrzqt();
        do {
            zEZpvd = faOLrzqt instanceof FA.ActionBar ? Intrinsics.EZpvd((java.lang.Object) ((FA.ActionBar) faOLrzqt).OLrzqt().AEQbTJ(), (java.lang.Object) this.OLrzqt.EZpvd()) : false;
            if (!zEZpvd) {
                faOLrzqt = xmlStreamReader.AEQbTJ();
            }
            if (faOLrzqt == null) {
                break;
            }
        } while (!zEZpvd);
        if (((FA.ActionBar) faOLrzqt) == null) {
            throw new java.lang.IllegalStateException(("Unable to find key " + this.OLrzqt + ".key in " + this.KWHzl).toString());
        }
        FA faAEQbTJ = this.copydefault.AEQbTJ();
        if (faAEQbTJ == null) {
            throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + " but instead found null");
        }
        if (faAEQbTJ.getClass() == FA.Dialog.class) {
            this.copydefault.AEQbTJ();
            java.lang.String strOLrzqt = ((FA.Dialog) faAEQbTJ).OLrzqt();
            if (strOLrzqt != null) {
                return strOLrzqt;
            }
            throw new DeserializationException("Key unspecified in " + this.KWHzl);
        }
        throw new DeserializationException("Expected " + C56524yIo.AEQbTJ(FA.Dialog.class) + "; found " + C56524yIo.AEQbTJ(faAEQbTJ.getClass()) + " (" + faAEQbTJ + ')');
    }
}
