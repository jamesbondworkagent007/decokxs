package o;

import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5120Fm implements InterfaceC5095En.ActionBar {
    public final java.lang.String AEQbTJ;
    public boolean EZpvd;
    public final C5101Et KWHzl;
    public final InterfaceC5100Es OLrzqt;
    public final boolean copydefault;
    public final XmlStreamReader gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public boolean AEQbTJ() {
        return this.OLrzqt.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public long AYXKKw() {
        return this.OLrzqt.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public double AhwBna() {
        return this.OLrzqt.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public int djBIcL() {
        return this.OLrzqt.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.String fetchVPNInfo() {
        return this.OLrzqt.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public java.lang.Void gEmmrt() {
        return this.OLrzqt.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5100Es
    public float valueOf() {
        return this.OLrzqt.valueOf();
    }

    public C5120Fm(@NotNull XmlStreamReader xmlStreamReader, @NotNull C5101Et c5101Et, @NotNull InterfaceC5100Es interfaceC5100Es) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(interfaceC5100Es, "");
        this.gEmmrt = xmlStreamReader;
        this.KWHzl = c5101Et;
        this.OLrzqt = interfaceC5100Es;
        boolean z = true;
        this.EZpvd = true;
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        if ((setAEQbTJ instanceof java.util.Collection) && setAEQbTJ.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                    break;
                }
            }
            z = false;
        }
        this.copydefault = z;
        java.util.Iterator<T> it2 = this.KWHzl.AEQbTJ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((InterfaceC5096Eo) next).getClass() == C5115Fh.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        C5115Fh c5115Fh = (C5115Fh) (interfaceC5096Eo instanceof C5115Fh ? interfaceC5096Eo : null);
        this.AEQbTJ = (c5115Fh == null ? C5115Fh.OLrzqt.OLrzqt() : c5115Fh).copydefault();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader)
  (r2v0 o.Et)
  (wrap:o.Es:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.Es:0x0006: CONSTRUCTOR (r1v0 aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader), (r2v0 o.Et) A[MD:(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et):void (m), WRAPPED] (LINE:156) call: o.Fs.<init>(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et):void type: CONSTRUCTOR) : (r3v0 o.Es))
 A[MD:(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et, o.Es):void (m)] (LINE:153) call: o.Fm.<init>(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Et, o.Es):void type: THIS */
    public /* synthetic */ C5120Fm(XmlStreamReader xmlStreamReader, C5101Et c5101Et, InterfaceC5100Es interfaceC5100Es, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlStreamReader, c5101Et, (i & 4) != 0 ? new C5126Fs(xmlStreamReader, c5101Et) : interfaceC5100Es);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // o.InterfaceC5095En.ActionBar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean EZpvd() {
        boolean zEZpvd;
        boolean z;
        if (!this.copydefault && this.EZpvd) {
            FA faPeek$default = XmlStreamReader.StateListAnimator.peek$default(this.gEmmrt, 0, 1, null);
            boolean z2 = (faPeek$default instanceof FA.ActionBar) && C5119Fl.EZpvd(this.KWHzl, ((FA.ActionBar) faPeek$default).OLrzqt().OLrzqt());
            if (faPeek$default == null) {
                z = false;
                if (z2 && !z) {
                    return false;
                }
                if (z2) {
                    this.gEmmrt.AEQbTJ();
                }
                this.EZpvd = false;
            } else {
                int iCopydefault = faPeek$default.copydefault();
                FA faOLrzqt = this.gEmmrt.OLrzqt();
                Intrinsics.copydefault(faOLrzqt);
                if (iCopydefault >= faOLrzqt.copydefault()) {
                    z = true;
                }
                if (z2) {
                }
                if (z2) {
                }
                this.EZpvd = false;
            }
        }
        if (this.copydefault) {
            FA faPeek$default2 = XmlStreamReader.StateListAnimator.peek$default(this.gEmmrt, 0, 1, null);
            if ((faPeek$default2 instanceof FA.StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) ((FA.StateListAnimator) faPeek$default2).AEQbTJ().AEQbTJ(), (java.lang.Object) C5119Fl.OLrzqt(this.KWHzl).AEQbTJ())) {
                this.gEmmrt.AEQbTJ();
                faPeek$default2 = XmlStreamReader.StateListAnimator.peek$default(this.gEmmrt, 0, 1, null);
            }
            java.util.List listValueOf = yDY.valueOf(this.gEmmrt.OLrzqt(), faPeek$default2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listValueOf) {
                if (obj instanceof FA.ActionBar) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((FA.ActionBar) it.next()).OLrzqt().AEQbTJ(), (java.lang.Object) C5119Fl.OLrzqt(this.KWHzl).AEQbTJ())) {
                    return true;
                }
            }
            return false;
        }
        XmlStreamReader xmlStreamReader = this.gEmmrt;
        FA faOLrzqt2 = xmlStreamReader.OLrzqt();
        do {
            zEZpvd = faOLrzqt2 instanceof FA.ActionBar ? Intrinsics.EZpvd((java.lang.Object) ((FA.ActionBar) faOLrzqt2).OLrzqt().AEQbTJ(), (java.lang.Object) this.AEQbTJ) : false;
            if (!zEZpvd) {
                faOLrzqt2 = xmlStreamReader.AEQbTJ();
            }
            if (faOLrzqt2 == null) {
                break;
            }
        } while (!zEZpvd);
        return FE.isNotTerminal$default((FA.ActionBar) faOLrzqt2, 0, 1, null);
    }

    @Override // o.InterfaceC5095En.ActionBar, o.InterfaceC5095En.Activity
    public boolean copydefault() {
        return !(XmlStreamReader.StateListAnimator.peek$default(this.gEmmrt, 0, 1, null) instanceof FA.StateListAnimator);
    }
}
