package o;

import com.ibm.icu.util.CodePointTrie;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import o.AbstractC7210afY;
import o.C7074acv;

/* JADX INFO: renamed from: o.agw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7287agw extends AbstractC7192afG {
    public static final java.util.List<InterfaceC7274agj> EZpvd;
    public static final boolean KWHzl;
    public static final C7246agH OLrzqt;

    @java.lang.Deprecated
    public static final java.lang.String copydefault;
    public boolean AkhnZx;
    public int AuCTel;
    public int[] DbNXlk;
    public int fARcdN;

    @java.lang.Deprecated
    public C7074acv fJNWhG;
    public java.util.List<InterfaceC7274agj> fetchVPNInfo;
    public CharacterIterator ejfBZ = new StringCharacterIterator("");
    public StateListAnimator AEQbTJ = new StateListAnimator();
    public TaskDescription values = new TaskDescription();
    public int isConnected = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7192afG
    public CharacterIterator copydefault() {
        return this.ejfBZ;
    }

    private C7287agw() {
        java.util.List<InterfaceC7274agj> list = EZpvd;
        synchronized (list) {
            this.fetchVPNInfo = new java.util.ArrayList(list);
        }
    }

    @java.lang.Deprecated
    public static C7287agw KWHzl(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        C7287agw c7287agw = new C7287agw();
        C7074acv c7074acvOLrzqt = C7074acv.OLrzqt(byteBuffer);
        c7287agw.fJNWhG = c7074acvOLrzqt;
        c7287agw.DbNXlk = new int[c7074acvOLrzqt.KWHzl.KWHzl];
        return c7287agw;
    }

    @Override // o.AbstractC7192afG
    public java.lang.Object clone() {
        C7287agw c7287agw = (C7287agw) super.clone();
        CharacterIterator characterIterator = this.ejfBZ;
        if (characterIterator != null) {
            c7287agw.ejfBZ = (CharacterIterator) characterIterator.clone();
        }
        java.util.List<InterfaceC7274agj> list = EZpvd;
        synchronized (list) {
            c7287agw.fetchVPNInfo = new java.util.ArrayList(list);
        }
        c7287agw.DbNXlk = new int[this.fJNWhG.KWHzl.KWHzl];
        c7287agw.AEQbTJ = c7287agw.new StateListAnimator(this.AEQbTJ);
        c7287agw.values = c7287agw.new TaskDescription(this.values);
        return c7287agw;
    }

    public boolean equals(java.lang.Object obj) {
        CharacterIterator characterIterator;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        try {
            C7287agw c7287agw = (C7287agw) obj;
            C7074acv c7074acv = this.fJNWhG;
            C7074acv c7074acv2 = c7287agw.fJNWhG;
            if (c7074acv != c7074acv2 && (c7074acv == null || c7074acv2 == null)) {
                return false;
            }
            if (c7074acv != null && c7074acv2 != null && !c7074acv.EZpvd.equals(c7074acv2.EZpvd)) {
                return false;
            }
            CharacterIterator characterIterator2 = this.ejfBZ;
            if (characterIterator2 == null && c7287agw.ejfBZ == null) {
                return true;
            }
            if (characterIterator2 != null && (characterIterator = c7287agw.ejfBZ) != null && characterIterator2.equals(characterIterator)) {
                return this.fARcdN == c7287agw.fARcdN;
            }
            return false;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public java.lang.String toString() {
        C7074acv c7074acv = this.fJNWhG;
        return c7074acv != null ? c7074acv.EZpvd : "";
    }

    public int hashCode() {
        return this.fJNWhG.EZpvd.hashCode();
    }

    static {
        KWHzl = C7060ach.AEQbTJ("rbbi") && C7060ach.copydefault("rbbi").indexOf("trace") >= 0;
        C7246agH c7246agH = new C7246agH();
        OLrzqt = c7246agH;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        EZpvd = arrayList;
        arrayList.add(c7246agH);
        copydefault = C7060ach.AEQbTJ("rbbi") ? C7060ach.copydefault("rbbi") : null;
    }

    @Override // o.AbstractC7192afG
    public int EZpvd() {
        CharacterIterator characterIterator = this.ejfBZ;
        if (characterIterator == null) {
            return -1;
        }
        characterIterator.first();
        int index = this.ejfBZ.getIndex();
        if (!this.AEQbTJ.copydefault(index)) {
            this.AEQbTJ.KWHzl(index);
        }
        this.AEQbTJ.KWHzl();
        return this.fARcdN;
    }

    @Override // o.AbstractC7192afG
    public int KWHzl() {
        this.AEQbTJ.copydefault();
        if (this.AkhnZx) {
            return -1;
        }
        return this.fARcdN;
    }

    @Override // o.AbstractC7192afG
    public void OLrzqt(CharacterIterator characterIterator) {
        if (characterIterator != null) {
            this.AEQbTJ.copydefault(characterIterator.getBeginIndex(), 0);
        } else {
            this.AEQbTJ.AYXKKw();
        }
        this.values.OLrzqt();
        this.ejfBZ = characterIterator;
        EZpvd();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x008d */
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
    public final InterfaceC7274agj copydefault(int i) {
        InterfaceC7274agj c7203afR;
        for (InterfaceC7274agj interfaceC7274agj : this.fetchVPNInfo) {
            if (interfaceC7274agj.AEQbTJ(i)) {
                return interfaceC7274agj;
            }
        }
        java.util.List<InterfaceC7274agj> list = EZpvd;
        synchronized (list) {
            for (InterfaceC7274agj interfaceC7274agj2 : list) {
                if (interfaceC7274agj2.AEQbTJ(i)) {
                    this.fetchVPNInfo.add(interfaceC7274agj2);
                    return interfaceC7274agj2;
                }
            }
            int iCopydefault = C7223afl.copydefault(i, 4106);
            if (iCopydefault == 22 || iCopydefault == 20) {
                iCopydefault = 17;
            }
            try {
                if (iCopydefault == 17) {
                    c7203afR = new C7203afR(false);
                } else if (iCopydefault == 18) {
                    c7203afR = new C7203afR(true);
                } else if (iCopydefault == 23) {
                    c7203afR = new C7273agi();
                } else if (iCopydefault == 24) {
                    c7203afR = new C7270agf();
                } else if (iCopydefault == 28) {
                    c7203afR = new C7198afM();
                } else if (iCopydefault == 38) {
                    c7203afR = new C7240agB();
                } else {
                    C7246agH c7246agH = OLrzqt;
                    c7246agH.OLrzqt(i);
                    c7203afR = c7246agH;
                }
            } catch (java.io.IOException unused) {
                c7203afR = null;
            }
            if (c7203afR != null && c7203afR != OLrzqt) {
                EZpvd.add(c7203afR);
                this.fetchVPNInfo.add(c7203afR);
            }
            return c7203afR;
        }
    }

    public final int OLrzqt() {
        short s;
        int index;
        char c;
        short s2;
        short sCopydefault;
        short s3;
        int i;
        boolean z = KWHzl;
        if (z) {
            java.lang.System.out.println("Handle Next   pos      char  state category");
        }
        this.AuCTel = 0;
        this.isConnected = 0;
        CharacterIterator characterIterator = this.ejfBZ;
        C7074acv c7074acv = this.fJNWhG;
        CodePointTrie codePointTrie = c7074acv.AhwBna;
        char[] cArr = c7074acv.KWHzl.AhwBna;
        int i2 = this.fARcdN;
        characterIterator.setIndex(i2);
        int iCurrent = characterIterator.current();
        short s4 = 1;
        if (iCurrent >= 55296 && (iCurrent = C7017abR.copydefault(characterIterator, iCurrent)) == Integer.MAX_VALUE) {
            this.AkhnZx = true;
            return -1;
        }
        int iAEQbTJ = this.fJNWhG.AEQbTJ(1);
        C7074acv.Application application = this.fJNWhG.KWHzl;
        int i3 = application.copydefault;
        int i4 = application.OLrzqt;
        if ((i3 & 2) != 0) {
            if (z) {
                java.io.PrintStream printStream = java.lang.System.out;
                printStream.print("            " + C7074acv.AEQbTJ(characterIterator.getIndex(), 5));
                printStream.print(C7074acv.KWHzl(iCurrent, 10));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(C7074acv.AEQbTJ(1, 7));
                s = 2;
                sb.append(C7074acv.AEQbTJ(2, 6));
                printStream.println(sb.toString());
            } else {
                s = 2;
            }
            index = i2;
            c = 1;
            sCopydefault = s;
            s2 = 0;
        } else {
            s = 2;
            index = i2;
            c = 1;
            s2 = 1;
            sCopydefault = 3;
        }
        while (c != 0) {
            if (iCurrent == Integer.MAX_VALUE) {
                if (s2 == s) {
                    break;
                }
                sCopydefault = s4;
                s2 = 2;
            } else if (s2 == s4) {
                sCopydefault = (short) codePointTrie.copydefault(iCurrent);
                if (sCopydefault >= i4) {
                    this.isConnected += s4;
                }
                if (KWHzl) {
                    java.io.PrintStream printStream2 = java.lang.System.out;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("            ");
                    s3 = s2;
                    sb2.append(C7074acv.AEQbTJ(characterIterator.getIndex(), 5));
                    printStream2.print(sb2.toString());
                    printStream2.print(C7074acv.KWHzl(iCurrent, 10));
                    printStream2.println(C7074acv.AEQbTJ(c, 7) + C7074acv.AEQbTJ(sCopydefault, 6));
                } else {
                    s3 = s2;
                }
                int next = characterIterator.next();
                if (next >= 55296) {
                    next = C7017abR.copydefault(characterIterator, next);
                }
                iCurrent = next;
                s2 = s3;
            } else {
                s2 = 1;
            }
            char c2 = cArr[iAEQbTJ + 3 + sCopydefault];
            int iAEQbTJ2 = this.fJNWhG.AEQbTJ(c2);
            char c3 = cArr[iAEQbTJ2];
            if (c3 == 1) {
                int index2 = characterIterator.getIndex();
                if (iCurrent >= 65536 && iCurrent <= 1114111) {
                    index2--;
                }
                index = index2;
                this.AuCTel = cArr[iAEQbTJ2 + 2];
            } else if (c3 > 1 && (i = this.DbNXlk[c3]) >= 0) {
                this.AuCTel = cArr[iAEQbTJ2 + 2];
                this.fARcdN = i;
                return i;
            }
            char c4 = cArr[iAEQbTJ2 + 1];
            if (c4 != 0) {
                int index3 = characterIterator.getIndex();
                if (iCurrent >= 65536 && iCurrent <= 1114111) {
                    index3--;
                }
                this.DbNXlk[c4] = index3;
            }
            s = 2;
            s4 = 1;
            iAEQbTJ = iAEQbTJ2;
            c = c2;
        }
        if (index == i2) {
            if (KWHzl) {
                java.lang.System.out.println("Iterator did not move. Advancing by 1.");
            }
            characterIterator.setIndex(i2);
            C7017abR.OLrzqt(characterIterator);
            index = characterIterator.getIndex();
            this.AuCTel = 0;
        }
        this.fARcdN = index;
        if (KWHzl) {
            java.lang.System.out.println("result = " + index);
        }
        return index;
    }

    public final int EZpvd(int i) {
        CharacterIterator characterIterator = this.ejfBZ;
        C7074acv c7074acv = this.fJNWhG;
        CodePointTrie codePointTrie = c7074acv.AhwBna;
        char[] cArr = c7074acv.OLrzqt.AhwBna;
        copydefault(characterIterator, i);
        if (KWHzl) {
            java.lang.System.out.print("Handle Previous   pos   char  state category");
        }
        if (characterIterator.getIndex() == characterIterator.getBeginIndex()) {
            return -1;
        }
        char c = 1;
        int iAEQbTJ = this.fJNWhG.AEQbTJ(1);
        for (int iKWHzl = C7017abR.KWHzl(characterIterator); iKWHzl != Integer.MAX_VALUE; iKWHzl = C7017abR.KWHzl(characterIterator)) {
            short sCopydefault = (short) codePointTrie.copydefault(iKWHzl);
            if (KWHzl) {
                java.io.PrintStream printStream = java.lang.System.out;
                printStream.print("            " + C7074acv.AEQbTJ(characterIterator.getIndex(), 5));
                printStream.print(C7074acv.KWHzl(iKWHzl, 10));
                printStream.println(C7074acv.AEQbTJ(c, 7) + C7074acv.AEQbTJ(sCopydefault, 6));
            }
            c = cArr[iAEQbTJ + 3 + sCopydefault];
            iAEQbTJ = this.fJNWhG.AEQbTJ(c);
            if (c == 0) {
                break;
            }
        }
        int index = characterIterator.getIndex();
        if (KWHzl) {
            java.lang.System.out.println("result = " + index);
        }
        return index;
    }

    public static int copydefault(CharacterIterator characterIterator, int i) {
        if (i <= characterIterator.getBeginIndex()) {
            characterIterator.first();
        } else if (i >= characterIterator.getEndIndex()) {
            characterIterator.setIndex(characterIterator.getEndIndex());
        } else if (java.lang.Character.isLowSurrogate(characterIterator.setIndex(i)) && !java.lang.Character.isHighSurrogate(characterIterator.previous())) {
            characterIterator.next();
        }
        return characterIterator.getIndex();
    }

    /* JADX INFO: renamed from: o.agw$TaskDescription */
    public class TaskDescription {
        public int AEQbTJ;
        public int AYXKKw;
        public int EZpvd;
        public int KWHzl;
        public AbstractC7210afY.Activity OLrzqt;
        public int copydefault;
        public int djBIcL;
        public int gEmmrt;

        public void OLrzqt() {
            this.gEmmrt = -1;
            this.AYXKKw = 0;
            this.copydefault = 0;
            this.EZpvd = 0;
            this.KWHzl = 0;
            this.OLrzqt.KWHzl();
        }

        public boolean copydefault(int i) {
            if (i >= this.copydefault || i < this.AYXKKw) {
                this.gEmmrt = -1;
                return false;
            }
            int i2 = this.gEmmrt;
            if (i2 >= 0 && i2 < this.OLrzqt.AYXKKw() && this.OLrzqt.KWHzl(this.gEmmrt) == i) {
                int i3 = this.gEmmrt + 1;
                this.gEmmrt = i3;
                if (i3 >= this.OLrzqt.AYXKKw()) {
                    this.gEmmrt = -1;
                    return false;
                }
                this.AEQbTJ = this.OLrzqt.KWHzl(this.gEmmrt);
                this.djBIcL = this.KWHzl;
                return true;
            }
            this.gEmmrt = 0;
            while (this.gEmmrt < this.OLrzqt.AYXKKw()) {
                int iKWHzl = this.OLrzqt.KWHzl(this.gEmmrt);
                if (iKWHzl > i) {
                    this.AEQbTJ = iKWHzl;
                    this.djBIcL = this.KWHzl;
                    return true;
                }
                this.gEmmrt++;
            }
            this.gEmmrt = -1;
            return false;
        }

        public boolean EZpvd(int i) {
            int i2;
            if (i <= this.AYXKKw || i > (i2 = this.copydefault)) {
                this.gEmmrt = -1;
                return false;
            }
            if (i == i2) {
                this.gEmmrt = this.OLrzqt.AYXKKw() - 1;
            }
            int i3 = this.gEmmrt;
            if (i3 > 0 && i3 < this.OLrzqt.AYXKKw() && this.OLrzqt.KWHzl(this.gEmmrt) == i) {
                int i4 = this.gEmmrt - 1;
                this.gEmmrt = i4;
                int iKWHzl = this.OLrzqt.KWHzl(i4);
                this.AEQbTJ = iKWHzl;
                this.djBIcL = iKWHzl == this.AYXKKw ? this.EZpvd : this.KWHzl;
                return true;
            }
            if (this.gEmmrt == 0) {
                this.gEmmrt = -1;
                return false;
            }
            int iAYXKKw = this.OLrzqt.AYXKKw();
            while (true) {
                int i5 = iAYXKKw - 1;
                this.gEmmrt = i5;
                if (i5 < 0) {
                    this.gEmmrt = -1;
                    return false;
                }
                int iKWHzl2 = this.OLrzqt.KWHzl(i5);
                if (iKWHzl2 < i) {
                    this.AEQbTJ = iKWHzl2;
                    this.djBIcL = iKWHzl2 == this.AYXKKw ? this.EZpvd : this.KWHzl;
                    return true;
                }
                iAYXKKw = this.gEmmrt;
            }
        }

        public void copydefault(int i, int i2, int i3, int i4) {
            int iCopydefault;
            if (i2 - i <= 1) {
                return;
            }
            OLrzqt();
            this.EZpvd = i3;
            this.KWHzl = i4;
            C7287agw.this.ejfBZ.setIndex(i);
            int iAEQbTJ = C7017abR.AEQbTJ(C7287agw.this.ejfBZ);
            short sCopydefault = (short) C7287agw.this.fJNWhG.AhwBna.copydefault(iAEQbTJ);
            int i5 = C7287agw.this.fJNWhG.KWHzl.OLrzqt;
            int iKWHzl = 0;
            while (true) {
                int index = C7287agw.this.ejfBZ.getIndex();
                if (index < i2 && sCopydefault < i5) {
                    iAEQbTJ = C7017abR.OLrzqt(C7287agw.this.ejfBZ);
                    iCopydefault = C7287agw.this.fJNWhG.AhwBna.copydefault(iAEQbTJ);
                } else {
                    if (index >= i2) {
                        break;
                    }
                    InterfaceC7274agj interfaceC7274agjCopydefault = C7287agw.this.copydefault(iAEQbTJ);
                    if (interfaceC7274agjCopydefault != null) {
                        iKWHzl += interfaceC7274agjCopydefault.KWHzl(C7287agw.this.ejfBZ, i, i2, this.OLrzqt);
                    }
                    iAEQbTJ = C7017abR.AEQbTJ(C7287agw.this.ejfBZ);
                    iCopydefault = C7287agw.this.fJNWhG.AhwBna.copydefault(iAEQbTJ);
                }
                sCopydefault = (short) iCopydefault;
            }
            if (iKWHzl > 0) {
                if (i < this.OLrzqt.KWHzl(0)) {
                    this.OLrzqt.OLrzqt(i);
                }
                if (i2 > this.OLrzqt.EZpvd()) {
                    this.OLrzqt.AEQbTJ(i2);
                }
                this.gEmmrt = 0;
                this.AYXKKw = this.OLrzqt.KWHzl(0);
                this.copydefault = this.OLrzqt.EZpvd();
            }
        }

        public TaskDescription() {
            this.gEmmrt = -1;
            this.OLrzqt = new AbstractC7210afY.Activity();
        }

        public TaskDescription(TaskDescription taskDescription) {
            try {
                this.OLrzqt = (AbstractC7210afY.Activity) taskDescription.OLrzqt.clone();
                this.gEmmrt = taskDescription.gEmmrt;
                this.AYXKKw = taskDescription.AYXKKw;
                this.copydefault = taskDescription.copydefault;
                this.EZpvd = taskDescription.EZpvd;
                this.KWHzl = taskDescription.KWHzl;
                this.AEQbTJ = taskDescription.AEQbTJ;
                this.djBIcL = taskDescription.djBIcL;
            } catch (java.lang.CloneNotSupportedException e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: o.agw$StateListAnimator */
    public class StateListAnimator {
        public int AEQbTJ;
        public int AYXKKw;
        public int EZpvd;
        public int[] KWHzl;
        public int OLrzqt;
        public AbstractC7210afY.Activity copydefault;
        public short[] valueOf;

        public final int OLrzqt(int i) {
            return i & 127;
        }

        public StateListAnimator() {
            this.KWHzl = new int[128];
            this.valueOf = new short[128];
            this.copydefault = new AbstractC7210afY.Activity();
            AYXKKw();
        }

        public void copydefault(int i, int i2) {
            this.EZpvd = 0;
            this.OLrzqt = 0;
            this.AYXKKw = i;
            this.AEQbTJ = 0;
            this.KWHzl[0] = i;
            this.valueOf[0] = (short) i2;
        }

        public void AYXKKw() {
            copydefault(0, 0);
        }

        public void copydefault() {
            int i = this.AEQbTJ;
            if (i == this.OLrzqt) {
                C7287agw.this.AkhnZx = !AEQbTJ();
                C7287agw.this.fARcdN = this.AYXKKw;
                C7287agw.this.AuCTel = this.valueOf[this.AEQbTJ];
                return;
            }
            int iOLrzqt = OLrzqt(i + 1);
            this.AEQbTJ = iOLrzqt;
            this.AYXKKw = C7287agw.this.fARcdN = this.KWHzl[iOLrzqt];
            C7287agw.this.AuCTel = this.valueOf[this.AEQbTJ];
        }

        public void OLrzqt() {
            int i = this.AEQbTJ;
            if (i == this.EZpvd) {
                EZpvd();
            } else {
                int iOLrzqt = OLrzqt(i - 1);
                this.AEQbTJ = iOLrzqt;
                this.AYXKKw = this.KWHzl[iOLrzqt];
            }
            C7287agw.this.AkhnZx = this.AEQbTJ == i;
            C7287agw.this.fARcdN = this.AYXKKw;
            C7287agw.this.AuCTel = this.valueOf[this.AEQbTJ];
        }

        public int KWHzl() {
            C7287agw.this.fARcdN = this.AYXKKw;
            C7287agw.this.AuCTel = this.valueOf[this.AEQbTJ];
            C7287agw.this.AkhnZx = false;
            return this.AYXKKw;
        }

        public boolean KWHzl(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int[] iArr = this.KWHzl;
            if (i < iArr[this.EZpvd] - 15 || i > iArr[this.OLrzqt] + 15) {
                int beginIndex = C7287agw.this.ejfBZ.getBeginIndex();
                if (i > beginIndex + 20) {
                    int iEZpvd = C7287agw.this.EZpvd(i);
                    if (iEZpvd > beginIndex) {
                        C7287agw.this.fARcdN = iEZpvd;
                        beginIndex = C7287agw.this.OLrzqt();
                        if (beginIndex == iEZpvd + 1 || (beginIndex == iEZpvd + 2 && java.lang.Character.isHighSurrogate(C7287agw.this.ejfBZ.setIndex(iEZpvd)) && java.lang.Character.isLowSurrogate(C7287agw.this.ejfBZ.next()))) {
                            beginIndex = C7287agw.this.OLrzqt();
                        }
                    }
                    i2 = C7287agw.this.AuCTel;
                } else {
                    i2 = 0;
                }
                copydefault(beginIndex, i2);
            }
            int[] iArr2 = this.KWHzl;
            if (iArr2[this.OLrzqt] < i) {
                do {
                    int[] iArr3 = this.KWHzl;
                    int i6 = this.OLrzqt;
                    int i7 = iArr3[i6];
                    if (i7 >= i) {
                        this.AEQbTJ = i6;
                        this.AYXKKw = i7;
                        while (this.AYXKKw > i) {
                            OLrzqt();
                        }
                        return true;
                    }
                } while (AEQbTJ());
                return false;
            }
            if (iArr2[this.EZpvd] > i) {
                while (true) {
                    int[] iArr4 = this.KWHzl;
                    i3 = this.EZpvd;
                    i4 = iArr4[i3];
                    if (i4 <= i) {
                        break;
                    }
                    EZpvd();
                }
                this.AEQbTJ = i3;
                this.AYXKKw = i4;
                while (true) {
                    i5 = this.AYXKKw;
                    if (i5 >= i) {
                        break;
                    }
                    copydefault();
                }
                if (i5 > i) {
                    OLrzqt();
                }
            }
            return true;
        }

        public boolean AEQbTJ() {
            int iOLrzqt;
            int[] iArr = this.KWHzl;
            int i = this.OLrzqt;
            int i2 = iArr[i];
            short s = this.valueOf[i];
            if (C7287agw.this.values.copydefault(i2)) {
                OLrzqt(C7287agw.this.values.AEQbTJ, C7287agw.this.values.djBIcL, true);
                return true;
            }
            C7287agw.this.fARcdN = i2;
            int iOLrzqt2 = C7287agw.this.OLrzqt();
            if (iOLrzqt2 == -1) {
                return false;
            }
            int i3 = C7287agw.this.AuCTel;
            if (C7287agw.this.isConnected > 0) {
                C7287agw.this.values.copydefault(i2, iOLrzqt2, s, i3);
                if (C7287agw.this.values.copydefault(i2)) {
                    OLrzqt(C7287agw.this.values.AEQbTJ, C7287agw.this.values.djBIcL, true);
                    return true;
                }
            }
            OLrzqt(iOLrzqt2, i3, true);
            for (int i4 = 0; i4 < 6 && (iOLrzqt = C7287agw.this.OLrzqt()) != -1 && C7287agw.this.isConnected <= 0; i4++) {
                OLrzqt(iOLrzqt, C7287agw.this.AuCTel, false);
            }
            return true;
        }

        public boolean EZpvd() {
            int iOLrzqt;
            int i;
            boolean z;
            int beginIndex = C7287agw.this.ejfBZ.getBeginIndex();
            int i2 = this.KWHzl[this.EZpvd];
            if (i2 == beginIndex) {
                return false;
            }
            boolean z2 = true;
            if (C7287agw.this.values.EZpvd(i2)) {
                EZpvd(C7287agw.this.values.AEQbTJ, C7287agw.this.values.djBIcL, true);
                return true;
            }
            int iEZpvd = i2;
            do {
                int i3 = iEZpvd - 30;
                iEZpvd = i3 <= beginIndex ? beginIndex : C7287agw.this.EZpvd(i3);
                if (iEZpvd == -1 || iEZpvd == beginIndex) {
                    iOLrzqt = beginIndex;
                    i = 0;
                } else {
                    C7287agw.this.fARcdN = iEZpvd;
                    iOLrzqt = C7287agw.this.OLrzqt();
                    if (iOLrzqt == iEZpvd + 1 || (iOLrzqt == iEZpvd + 2 && java.lang.Character.isHighSurrogate(C7287agw.this.ejfBZ.setIndex(iEZpvd)) && java.lang.Character.isLowSurrogate(C7287agw.this.ejfBZ.next()))) {
                        iOLrzqt = C7287agw.this.OLrzqt();
                    }
                    i = C7287agw.this.AuCTel;
                }
            } while (iOLrzqt >= i2);
            this.copydefault.KWHzl();
            this.copydefault.AEQbTJ(iOLrzqt);
            this.copydefault.AEQbTJ(i);
            while (true) {
                int i4 = C7287agw.this.fARcdN = iOLrzqt;
                int iOLrzqt2 = C7287agw.this.OLrzqt();
                int i5 = C7287agw.this.AuCTel;
                if (iOLrzqt2 == -1) {
                    break;
                }
                if (C7287agw.this.isConnected != 0) {
                    C7287agw.this.values.copydefault(i4, iOLrzqt2, i, i5);
                    z = false;
                    while (true) {
                        if (!C7287agw.this.values.copydefault(i4)) {
                            break;
                        }
                        iOLrzqt2 = C7287agw.this.values.AEQbTJ;
                        i5 = C7287agw.this.values.djBIcL;
                        if (iOLrzqt2 >= i2) {
                            z = true;
                            break;
                        }
                        this.copydefault.AEQbTJ(iOLrzqt2);
                        this.copydefault.AEQbTJ(i5);
                        i4 = iOLrzqt2;
                        z = true;
                    }
                } else {
                    z = false;
                }
                int i6 = i5;
                iOLrzqt = iOLrzqt2;
                if (!z && iOLrzqt < i2) {
                    this.copydefault.AEQbTJ(iOLrzqt);
                    this.copydefault.AEQbTJ(i6);
                }
                if (iOLrzqt >= i2) {
                    break;
                }
                i = i6;
            }
            if (this.copydefault.AEQbTJ()) {
                z2 = false;
            } else {
                EZpvd(this.copydefault.OLrzqt(), this.copydefault.OLrzqt(), true);
            }
            while (!this.copydefault.AEQbTJ()) {
                if (!EZpvd(this.copydefault.OLrzqt(), this.copydefault.OLrzqt(), false)) {
                    break;
                }
            }
            return z2;
        }

        public void OLrzqt(int i, int i2, boolean z) {
            int iOLrzqt = OLrzqt(this.OLrzqt + 1);
            int i3 = this.EZpvd;
            if (iOLrzqt == i3) {
                this.EZpvd = OLrzqt(i3 + 6);
            }
            this.KWHzl[iOLrzqt] = i;
            this.valueOf[iOLrzqt] = (short) i2;
            this.OLrzqt = iOLrzqt;
            if (z) {
                this.AEQbTJ = iOLrzqt;
                this.AYXKKw = i;
            }
        }

        public boolean EZpvd(int i, int i2, boolean z) {
            int iOLrzqt = OLrzqt(this.EZpvd - 1);
            int i3 = this.OLrzqt;
            if (iOLrzqt == i3) {
                if (this.AEQbTJ == i3 && !z) {
                    return false;
                }
                this.OLrzqt = OLrzqt(i3 - 1);
            }
            this.KWHzl[iOLrzqt] = i;
            this.valueOf[iOLrzqt] = (short) i2;
            this.EZpvd = iOLrzqt;
            if (z) {
                this.AEQbTJ = iOLrzqt;
                this.AYXKKw = i;
            }
            return true;
        }

        public boolean copydefault(int i) {
            int i2;
            int i3;
            int[] iArr = this.KWHzl;
            int iOLrzqt = this.EZpvd;
            int i4 = iArr[iOLrzqt];
            if (i < i4 || i > (i3 = iArr[(i2 = this.OLrzqt)])) {
                return false;
            }
            if (i == i4) {
                this.AEQbTJ = iOLrzqt;
                this.AYXKKw = i4;
                return true;
            }
            if (i == i3) {
                this.AEQbTJ = i2;
                this.AYXKKw = i3;
                return true;
            }
            while (iOLrzqt != i2) {
                int iOLrzqt2 = OLrzqt(((iOLrzqt + i2) + (iOLrzqt > i2 ? 128 : 0)) / 2);
                if (this.KWHzl[iOLrzqt2] > i) {
                    i2 = iOLrzqt2;
                } else {
                    iOLrzqt = OLrzqt(iOLrzqt2 + 1);
                }
            }
            int iOLrzqt3 = OLrzqt(i2 - 1);
            this.AEQbTJ = iOLrzqt3;
            this.AYXKKw = this.KWHzl[iOLrzqt3];
            return true;
        }

        public StateListAnimator(StateListAnimator stateListAnimator) {
            this.KWHzl = new int[128];
            this.valueOf = new short[128];
            this.copydefault = new AbstractC7210afY.Activity();
            this.EZpvd = stateListAnimator.EZpvd;
            this.OLrzqt = stateListAnimator.OLrzqt;
            this.AYXKKw = stateListAnimator.AYXKKw;
            this.AEQbTJ = stateListAnimator.AEQbTJ;
            this.KWHzl = (int[]) stateListAnimator.KWHzl.clone();
            this.valueOf = (short[]) stateListAnimator.valueOf.clone();
            this.copydefault = new AbstractC7210afY.Activity();
        }
    }
}
