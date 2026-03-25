package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.PatternStringUtils;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: renamed from: o.aeA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7133aeA implements InterfaceC7141aeI {
    public static final java.util.Comparator<C7133aeA> EZpvd = new java.util.Comparator<C7133aeA>() { // from class: o.aeA.4
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public int compare(C7133aeA c7133aeA, C7133aeA c7133aeA2) {
            if (C7133aeA.KWHzl(c7133aeA.KWHzl) != C7133aeA.KWHzl(c7133aeA2.KWHzl)) {
                return C7133aeA.KWHzl(c7133aeA.KWHzl) > C7133aeA.KWHzl(c7133aeA2.KWHzl) ? -1 : 1;
            }
            if (C7133aeA.KWHzl(c7133aeA.copydefault) != C7133aeA.KWHzl(c7133aeA2.copydefault)) {
                return C7133aeA.KWHzl(c7133aeA.copydefault) > C7133aeA.KWHzl(c7133aeA2.copydefault) ? -1 : 1;
            }
            if (c7133aeA.equals(c7133aeA2)) {
                return 0;
            }
            return c7133aeA.hashCode() > c7133aeA2.hashCode() ? -1 : 1;
        }
    };
    public final int AEQbTJ;
    public final C7134aeB KWHzl;
    public final C7134aeB copydefault;

    public static boolean OLrzqt(InterfaceC7102adW interfaceC7102adW, C7139aeG c7139aeG, int i) {
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        java.lang.String strKWHzl3 = interfaceC7102adW.KWHzl(256);
        java.lang.String strKWHzl4 = interfaceC7102adW.KWHzl(0);
        if (interfaceC7102adW.OLrzqt()) {
            strKWHzl = interfaceC7102adW.KWHzl(768);
            strKWHzl2 = interfaceC7102adW.KWHzl(512);
        } else {
            strKWHzl = null;
            strKWHzl2 = null;
        }
        return ((i & 256) == 0 && C7105adZ.EZpvd(strKWHzl3, c7139aeG.EZpvd()) && C7105adZ.EZpvd(strKWHzl4, c7139aeG.EZpvd()) && C7105adZ.EZpvd(strKWHzl, c7139aeG.EZpvd()) && C7105adZ.EZpvd(strKWHzl2, c7139aeG.EZpvd()) && !C7105adZ.OLrzqt(strKWHzl4, -2) && !C7105adZ.OLrzqt(strKWHzl4, -1) && !C7105adZ.OLrzqt(strKWHzl2, -2) && !C7105adZ.OLrzqt(strKWHzl2, -1)) ? false : true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x00ca */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r21v0, types: [o.aeJ] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o.aeB] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, o.aeB] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OLrzqt(InterfaceC7102adW interfaceC7102adW, C7142aeJ c7142aeJ, C7135aeC c7135aeC, C7139aeG c7139aeG, int i) {
        int i2;
        PatternStringUtils.PatternSignType[] patternSignTypeArr;
        ?? r4;
        ?? r7;
        ?? r3;
        C7134aeB c7134aeB;
        ?? r12;
        ?? r72;
        if (OLrzqt(interfaceC7102adW, c7139aeG, i)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.ArrayList arrayList = new java.util.ArrayList(6);
            boolean z = (i & 128) != 0;
            PatternStringUtils.PatternSignType[] patternSignTypeArr2 = PatternStringUtils.PatternSignType.VALUES;
            int length = patternSignTypeArr2.length;
            ?? r32 = 0;
            ?? r42 = 0;
            int i3 = 0;
            while (i3 < length) {
                PatternStringUtils.PatternSignType patternSignType = patternSignTypeArr2[i3];
                PatternStringUtils.PatternSignType patternSignType2 = PatternStringUtils.PatternSignType.POS;
                if ((patternSignType != patternSignType2 || (i & 1024) == 0) && !(patternSignType == PatternStringUtils.PatternSignType.POS_SIGN && (i & 1024) == 0)) {
                    StandardPlural standardPlural = StandardPlural.OTHER;
                    ?? r122 = r42;
                    i2 = i3;
                    ?? r73 = r32;
                    patternSignTypeArr = patternSignTypeArr2;
                    PatternStringUtils.copydefault(interfaceC7102adW, true, patternSignType, standardPlural, false, sb);
                    ?? Copydefault = C7134aeB.copydefault(sb.toString(), c7135aeC, i);
                    PatternStringUtils.copydefault(interfaceC7102adW, false, patternSignType, standardPlural, false, sb);
                    ?? Copydefault2 = C7134aeB.copydefault(sb.toString(), c7135aeC, i);
                    if (patternSignType == patternSignType2) {
                        r7 = Copydefault2;
                        r4 = Copydefault;
                    } else {
                        if (Objects.equals(Copydefault, r122)) {
                            boolean zEquals = Objects.equals(Copydefault2, r73);
                            r72 = r73;
                            r12 = r122;
                        }
                        r4 = r122;
                        r7 = r73;
                    }
                    int i4 = patternSignType == PatternStringUtils.PatternSignType.NEG ? 1 : 0;
                    arrayList.add(EZpvd(Copydefault, Copydefault2, i4));
                    if (z && Copydefault != 0 && Copydefault2 != 0) {
                        if (patternSignType == patternSignType2 || !Copydefault.equals(r4)) {
                            c7134aeB = null;
                            arrayList.add(EZpvd(Copydefault, null, i4));
                        } else {
                            c7134aeB = null;
                        }
                        if (patternSignType == patternSignType2 || !Copydefault2.equals(r7)) {
                            arrayList.add(EZpvd(c7134aeB, Copydefault2, i4));
                        }
                    }
                    r3 = r7;
                    patternSignTypeArr2 = patternSignTypeArr;
                    i3 = i2 + 1;
                    r32 = r3;
                    r42 = r4;
                } else {
                    r72 = r32;
                    r12 = r42;
                    i2 = i3;
                    patternSignTypeArr = patternSignTypeArr2;
                }
                r3 = r72;
                r4 = r12;
                patternSignTypeArr2 = patternSignTypeArr;
                i3 = i2 + 1;
                r32 = r3;
                r42 = r4;
            }
            Collections.sort(arrayList, EZpvd);
            c7142aeJ.OLrzqt(arrayList);
        }
    }

    public static final C7133aeA EZpvd(C7134aeB c7134aeB, C7134aeB c7134aeB2, int i) {
        return new C7133aeA(c7134aeB, c7134aeB2, i);
    }

    public C7133aeA(C7134aeB c7134aeB, C7134aeB c7134aeB2, int i) {
        this.KWHzl = c7134aeB;
        this.copydefault = c7134aeB2;
        this.AEQbTJ = i;
    }

    @Override // o.InterfaceC7141aeI
    public boolean AEQbTJ(C7031acE c7031acE, C7145aeM c7145aeM) {
        boolean zAEQbTJ = false;
        if (!c7145aeM.copydefault()) {
            if (c7145aeM.copydefault == null && this.KWHzl != null) {
                int iAEQbTJ = c7031acE.AEQbTJ();
                zAEQbTJ = this.KWHzl.AEQbTJ(c7031acE, c7145aeM);
                if (iAEQbTJ != c7031acE.AEQbTJ()) {
                    c7145aeM.copydefault = this.KWHzl.KWHzl();
                }
            }
            return zAEQbTJ;
        }
        if (c7145aeM.gEmmrt == null && this.copydefault != null && copydefault(this.KWHzl, c7145aeM.copydefault)) {
            int iAEQbTJ2 = c7031acE.AEQbTJ();
            zAEQbTJ = this.copydefault.AEQbTJ(c7031acE, c7145aeM);
            if (iAEQbTJ2 != c7031acE.AEQbTJ()) {
                c7145aeM.gEmmrt = this.copydefault.KWHzl();
            }
        }
        return zAEQbTJ;
    }

    @Override // o.InterfaceC7141aeI
    public boolean OLrzqt(C7031acE c7031acE) {
        C7134aeB c7134aeB;
        C7134aeB c7134aeB2 = this.KWHzl;
        return (c7134aeB2 != null && c7134aeB2.OLrzqt(c7031acE)) || ((c7134aeB = this.copydefault) != null && c7134aeB.OLrzqt(c7031acE));
    }

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
        if (copydefault(this.KWHzl, c7145aeM.copydefault) && copydefault(this.copydefault, c7145aeM.gEmmrt)) {
            if (c7145aeM.copydefault == null) {
                c7145aeM.copydefault = "";
            }
            if (c7145aeM.gEmmrt == null) {
                c7145aeM.gEmmrt = "";
            }
            c7145aeM.AEQbTJ |= this.AEQbTJ;
            C7134aeB c7134aeB = this.KWHzl;
            if (c7134aeB != null) {
                c7134aeB.KWHzl(c7145aeM);
            }
            C7134aeB c7134aeB2 = this.copydefault;
            if (c7134aeB2 != null) {
                c7134aeB2.KWHzl(c7145aeM);
            }
        }
    }

    public static boolean copydefault(C7134aeB c7134aeB, java.lang.String str) {
        return (c7134aeB == null && str == null) || (c7134aeB != null && c7134aeB.KWHzl().equals(str));
    }

    public static int KWHzl(C7134aeB c7134aeB) {
        if (c7134aeB == null) {
            return 0;
        }
        return c7134aeB.KWHzl().length();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C7133aeA)) {
            return false;
        }
        C7133aeA c7133aeA = (C7133aeA) obj;
        return Objects.equals(this.KWHzl, c7133aeA.KWHzl) && Objects.equals(this.copydefault, c7133aeA.copydefault) && this.AEQbTJ == c7133aeA.AEQbTJ;
    }

    public int hashCode() {
        return (Objects.hashCode(this.KWHzl) ^ Objects.hashCode(this.copydefault)) ^ this.AEQbTJ;
    }

    public java.lang.String toString() {
        boolean z = (this.AEQbTJ & 1) != 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("<AffixMatcher");
        sb.append(z ? ":negative " : " ");
        sb.append(this.KWHzl);
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
        sb.append(this.copydefault);
        sb.append(">");
        return sb.toString();
    }
}
