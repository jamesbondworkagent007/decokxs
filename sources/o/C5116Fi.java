package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5116Fi implements InterfaceC5095En {
    public final boolean AEQbTJ;
    public final XmlStreamReader EZpvd;
    public boolean KWHzl;

    public C5116Fi(@NotNull XmlStreamReader xmlStreamReader, boolean z) {
        Intrinsics.checkNotNullParameter(xmlStreamReader, "");
        this.EZpvd = xmlStreamReader;
        this.AEQbTJ = z;
        this.KWHzl = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5116Fi(@NotNull byte[] bArr, boolean z) {
        this(FB.KWHzl(bArr), z);
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 byte[])
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(byte[], boolean):void (m)] (LINE:40) call: o.Fi.<init>(byte[], boolean):void type: THIS */
    public /* synthetic */ C5116Fi(byte[] bArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? false : z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.Fk.AEQbTJ(aws.smithy.kotlin.runtime.serde.xml.XmlStreamReader, o.Eq):java.util.List */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0 A[EDGE_INSN: B:85:0x00f0->B:50:0x00f0 BREAK  A[LOOP:1: B:45:0x00e4->B:87:?], SYNTHETIC] */
    @Override // o.InterfaceC5095En
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC5095En.StateListAnimator EZpvd(@NotNull C5098Eq c5098Eq) {
        boolean z;
        boolean zEZpvd;
        FA.ActionBar actionBar;
        java.lang.Object next;
        FA faOLrzqt;
        boolean z2;
        Intrinsics.checkNotNullParameter(c5098Eq, "");
        boolean z3 = false;
        if (this.KWHzl) {
            java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5098Eq.AEQbTJ();
            if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
                java.util.Iterator<T> it = setAEQbTJ.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC5096Eo) it.next()) instanceof C5128Fu) {
                        this.KWHzl = false;
                        this.EZpvd.AEQbTJ();
                        java.util.Set<InterfaceC5096Eo> setAEQbTJ2 = c5098Eq.AEQbTJ();
                        if (!(setAEQbTJ2 instanceof java.util.Collection) || !setAEQbTJ2.isEmpty()) {
                            java.util.Iterator<T> it2 = setAEQbTJ2.iterator();
                            while (it2.hasNext()) {
                                if (((InterfaceC5096Eo) it2.next()) instanceof C5117Fj) {
                                    XmlStreamReader xmlStreamReader = this.EZpvd;
                                    FA faOLrzqt2 = xmlStreamReader.OLrzqt();
                                    do {
                                        if (faOLrzqt2 instanceof FA.ActionBar) {
                                            FA.Application applicationOLrzqt = ((FA.ActionBar) faOLrzqt2).OLrzqt();
                                            java.util.Iterator<T> it3 = c5098Eq.AEQbTJ().iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it3.next();
                                                if (((InterfaceC5096Eo) next).getClass() == C5117Fj.class) {
                                                    break;
                                                }
                                            }
                                            InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
                                            if (interfaceC5096Eo != null) {
                                                zEZpvd = Intrinsics.EZpvd(applicationOLrzqt, ((C5117Fj) interfaceC5096Eo).AEQbTJ());
                                            } else {
                                                throw new java.lang.IllegalArgumentException(("Expected to find trait " + C56524yIo.AEQbTJ(C5117Fj.class) + " in " + c5098Eq + " but was not present.").toString());
                                            }
                                        } else {
                                            zEZpvd = false;
                                        }
                                        if (!zEZpvd) {
                                            faOLrzqt2 = xmlStreamReader.AEQbTJ();
                                        }
                                        if (faOLrzqt2 == null) {
                                            break;
                                        }
                                    } while (!zEZpvd);
                                    actionBar = (FA.ActionBar) faOLrzqt2;
                                    if (actionBar == null) {
                                        throw new DeserializationException("Could not find a begin element for new struct");
                                    }
                                    if (this.AEQbTJ) {
                                        C5119Fl.KWHzl(c5098Eq, actionBar.OLrzqt().OLrzqt());
                                    }
                                }
                            }
                            XmlStreamReader xmlStreamReader2 = this.EZpvd;
                            faOLrzqt = xmlStreamReader2.OLrzqt();
                            do {
                                z2 = faOLrzqt instanceof FA.ActionBar;
                                if (!z2) {
                                    faOLrzqt = xmlStreamReader2.AEQbTJ();
                                }
                                if (faOLrzqt != null) {
                                    break;
                                }
                            } while (!z2);
                            actionBar = (FA.ActionBar) faOLrzqt;
                            if (actionBar == null) {
                            }
                        } else {
                            XmlStreamReader xmlStreamReader22 = this.EZpvd;
                            faOLrzqt = xmlStreamReader22.OLrzqt();
                            do {
                                z2 = faOLrzqt instanceof FA.ActionBar;
                                if (!z2) {
                                }
                                if (faOLrzqt != null) {
                                }
                            } while (!z2);
                            actionBar = (FA.ActionBar) faOLrzqt;
                            if (actionBar == null) {
                            }
                        }
                    }
                }
            }
            throw new DeserializationException("Top-level struct " + c5098Eq + " requires a XmlSerialName trait but has none.");
        }
        XmlStreamReader xmlStreamReader3 = this.EZpvd;
        FA faOLrzqt3 = xmlStreamReader3.OLrzqt();
        do {
            z = faOLrzqt3 instanceof FA.ActionBar;
            if (!z) {
                faOLrzqt3 = xmlStreamReader3.AEQbTJ();
            }
            if (faOLrzqt3 == null) {
                break;
            }
        } while (!z);
        java.util.List listCopydefault = C5118Fk.copydefault(this.EZpvd, c5098Eq);
        if (this.EZpvd.OLrzqt() instanceof FA.ActionBar) {
            FA faOLrzqt4 = this.EZpvd.OLrzqt();
            Intrinsics.copydefault(faOLrzqt4, "");
            FA.ActionBar actionBar2 = (FA.ActionBar) faOLrzqt4;
            java.util.Set<InterfaceC5096Eo> setAEQbTJ3 = c5098Eq.AEQbTJ();
            if (!(setAEQbTJ3 instanceof java.util.Collection) || !setAEQbTJ3.isEmpty()) {
                java.util.Iterator<T> it4 = setAEQbTJ3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((InterfaceC5096Eo) it4.next()) instanceof FC) {
                        z3 = true;
                        break;
                    }
                }
            }
            return new C5131Fx(c5098Eq, this.EZpvd.EZpvd(XmlStreamReader.SubtreeStartDepth.CURRENT), actionBar2, listCopydefault, z3);
        }
        throw new DeserializationException("Expected last parsed token to be " + C56524yIo.AEQbTJ(FA.ActionBar.class) + " but was " + this.EZpvd.OLrzqt());
    }

    @Override // o.InterfaceC5095En
    public InterfaceC5095En.ActionBar KWHzl(@NotNull C5101Et c5101Et) {
        XmlStreamReader.SubtreeStartDepth subtreeStartDepth;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        if ((setAEQbTJ instanceof java.util.Collection) && setAEQbTJ.isEmpty()) {
            subtreeStartDepth = XmlStreamReader.SubtreeStartDepth.CHILD;
        } else {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                    subtreeStartDepth = XmlStreamReader.SubtreeStartDepth.CURRENT;
                    break;
                }
            }
            subtreeStartDepth = XmlStreamReader.SubtreeStartDepth.CHILD;
        }
        return new C5120Fm(this.EZpvd.EZpvd(subtreeStartDepth), c5101Et, null, 4, null);
    }

    @Override // o.InterfaceC5095En
    public InterfaceC5095En.Activity AEQbTJ(@NotNull C5101Et c5101Et) {
        XmlStreamReader.SubtreeStartDepth subtreeStartDepth;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        if ((setAEQbTJ instanceof java.util.Collection) && setAEQbTJ.isEmpty()) {
            subtreeStartDepth = XmlStreamReader.SubtreeStartDepth.CHILD;
        } else {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                    subtreeStartDepth = XmlStreamReader.SubtreeStartDepth.CURRENT;
                    break;
                }
            }
            subtreeStartDepth = XmlStreamReader.SubtreeStartDepth.CHILD;
        }
        return new C5124Fq(this.EZpvd.EZpvd(subtreeStartDepth), c5101Et, null, 4, null);
    }
}
