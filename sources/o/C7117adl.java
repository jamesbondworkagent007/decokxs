package o;

import o.C7121adp;

/* JADX INFO: renamed from: o.adl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7117adl implements InterfaceC7127adv {
    public C7121adp AEQbTJ;
    public C7121adp.Activity EZpvd;
    public C7081adB KWHzl;
    public java.lang.String copydefault;

    public C7117adl(C7121adp c7121adp, java.lang.String str, C7081adB c7081adB, C7121adp.Activity activity) {
        this.AEQbTJ = c7121adp;
        this.copydefault = str;
        this.KWHzl = c7081adB;
        this.EZpvd = activity;
    }

    @Override // o.InterfaceC7127adv
    public java.lang.String OLrzqt(C7126adu c7126adu) {
        if (!c7126adu.AEQbTJ()) {
            throw new java.lang.IllegalArgumentException("period is not set");
        }
        return AEQbTJ(c7126adu.OLrzqt, c7126adu.copydefault, c7126adu.KWHzl);
    }

    @Override // o.InterfaceC7127adv
    public InterfaceC7127adv AEQbTJ(java.lang.String str) {
        if (this.copydefault.equals(str)) {
            return this;
        }
        return new C7117adl(this.AEQbTJ, str, this.AEQbTJ.AEQbTJ(str), this.EZpvd);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r18v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r18v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r19v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r19v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(int i, boolean z, int[] iArr) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        int i5;
        char c;
        boolean zKWHzl;
        int[] iArr2 = iArr;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 1;
            if (i6 >= iArr2.length) {
                break;
            }
            if (iArr2[i6] > 0) {
                i7 |= 1 << i6;
            }
            i6++;
        }
        if (!this.KWHzl.EZpvd()) {
            int i8 = 1;
            int i9 = 0;
            while (i9 < iArr2.length) {
                if ((i7 & i8) != 0 && iArr2[i9] == 1) {
                    i7 &= ~i8;
                }
                i9++;
                i8 <<= 1;
            }
            if (i7 == 0) {
                return null;
            }
        }
        if (this.KWHzl.KWHzl() != 0) {
            byte b = C7080adA.AEQbTJ.isConnected;
            int i10 = 1 << b;
            if ((i10 & i7) != 0) {
                byte b2 = C7080adA.gEmmrt.isConnected;
                int i11 = 1 << b2;
                int iKWHzl = this.KWHzl.KWHzl();
                if (iKWHzl != 1) {
                    if (iKWHzl == 2 && (i11 & i7) != 0) {
                        iArr2[b2] = iArr2[b2] + ((iArr2[b] - 1) / 1000);
                    }
                    z2 = false;
                } else {
                    if ((i7 & i11) == 0) {
                        i7 |= i11;
                        iArr2[b2] = 1;
                    }
                    iArr2[b2] = iArr2[b2] + ((iArr2[b] - 1) / 1000);
                }
                i7 &= ~i10;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        int length = iArr2.length - 1;
        int i12 = 0;
        while (i12 < iArr2.length && ((1 << i12) & i7) == 0) {
            i12++;
        }
        while (length > i12 && ((1 << length) & i7) == 0) {
            length--;
        }
        int i13 = i12;
        while (true) {
            if (i13 > length) {
                z3 = true;
                break;
            }
            if (((1 << i13) & i7) != 0 && iArr2[i13] > 1) {
                z3 = false;
                break;
            }
            i13++;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        C7121adp.Activity activity = this.EZpvd;
        int i14 = (!activity.KWHzl || z3) ? 0 : i;
        int i15 = (!activity.AEQbTJ || z3) ? 0 : z ? 2 : 1;
        boolean zEZpvd = this.KWHzl.EZpvd(i14, i15, stringBuffer);
        boolean z5 = i12 != length;
        boolean z6 = this.EZpvd.copydefault != 0;
        boolean z7 = true;
        int i16 = i12;
        boolean z8 = zEZpvd;
        int i17 = 0;
        while (i16 <= length) {
            if (i17 != 0) {
                this.KWHzl.OLrzqt(stringBuffer);
                z4 = i2;
                i4 = i16;
                i3 = 0;
            } else {
                i3 = i17;
                z4 = z7;
                i4 = i16;
            }
            while (true) {
                i5 = i4 + 1;
                if (i5 >= length || ((i2 << i5) & i7) != 0) {
                    break;
                }
                i3 = i2;
                i4 = i5;
            }
            C7080adA c7080adA = C7080adA.AYXKKw[i16];
            int i18 = iArr2[i16];
            C7121adp.Activity activity2 = this.EZpvd;
            int i19 = activity2.EZpvd;
            if (i16 != length) {
                i19 = 0;
            } else if (z2) {
                i19 = 5;
            }
            boolean z9 = i16 == length ? i2 : 0;
            int i20 = i16;
            int i21 = i19;
            int i22 = i14;
            java.lang.StringBuffer stringBuffer2 = stringBuffer;
            boolean zCopydefault = this.KWHzl.copydefault(c7080adA, i18 - 1, i21, activity2.OLrzqt, z6, z8, z5, z9, z4, stringBuffer2);
            byte b3 = this.EZpvd.copydefault;
            if (b3 == 0 || i5 > length) {
                c = 2;
                zKWHzl = false;
            } else {
                boolean z10 = i20 == i12;
                c = 2;
                zKWHzl = this.KWHzl.KWHzl(c7080adA, b3 == 2, z10, i5 == length, stringBuffer2);
            }
            int i23 = i3 | (zCopydefault ? 1 : 0);
            i14 = i22;
            stringBuffer = stringBuffer2;
            i16 = i5;
            z8 = zKWHzl;
            i17 = i23;
            i2 = 1;
            z7 = false;
            iArr2 = iArr;
        }
        java.lang.StringBuffer stringBuffer3 = stringBuffer;
        this.KWHzl.KWHzl(i14, i15, stringBuffer3);
        return stringBuffer3.toString();
    }
}
