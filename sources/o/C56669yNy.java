package o;

import java.util.Collections;
import java.util.ServiceLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import o.InterfaceC59356zfW;
import o.yOE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56669yNy {
    public static final InterfaceC59070zaB AEQbTJ;
    public static final yNC AYXKKw;
    public static final java.util.Set<yNC> AhwBna;
    public static final yNC AkhnZx;
    public static final java.util.Map<yNC, java.lang.Integer> DbNXlk;

    @java.lang.Deprecated
    public static final InterfaceC59070zaB EZpvd;
    public static final yNC KWHzl;
    public static final yNC OLrzqt;
    public static final yNC copydefault;
    public static final InterfaceC59070zaB djBIcL;
    public static final yNC fIwbmz;
    public static final java.util.Map<yOD, yNC> fJNWhG;
    public static final yNC fetchVPNInfo;
    public static final InterfaceC59356zfW gEmmrt;
    public static final yNC isConnected;
    public static final yNC valueOf;
    public static final yNC values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 16) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(@NotNull yNC ync) {
        if (ync == null) {
            EZpvd(14);
        }
        return ync == AkhnZx || ync == values;
    }

    static {
        yNA yna = new yNA(yOE.StateListAnimator.OLrzqt) { // from class: o.yNy.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ void KWHzl(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "what";
                } else if (i != 2) {
                    objArr[0] = "descriptor";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "isVisible";
                } else {
                    objArr[2] = "hasContainingSourceFile";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            public final boolean copydefault(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
                if (interfaceC56665yNu == null) {
                    KWHzl(0);
                }
                return yYH.KWHzl(interfaceC56665yNu) != InterfaceC56684yOm.EZpvd;
            }

            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x005f */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:? */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yNx */
            /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: o.yNu */
            /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: o.yNu */
            /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: o.yNu */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == 0) {
                    KWHzl(1);
                }
                if (interfaceC56665yNu == null) {
                    KWHzl(2);
                }
                if (yYH.ejfBZ(interfaceC56668yNx) && copydefault(interfaceC56665yNu)) {
                    return C56669yNy.KWHzl(interfaceC56668yNx, interfaceC56665yNu);
                }
                if (interfaceC56668yNx instanceof InterfaceC56660yNp) {
                    InterfaceC56659yNo interfaceC56659yNoAuCTel = ((InterfaceC56660yNp) interfaceC56668yNx).AuCTel();
                    if (z && yYH.fARcdN(interfaceC56659yNoAuCTel) && yYH.ejfBZ(interfaceC56659yNoAuCTel) && (interfaceC56665yNu instanceof InterfaceC56660yNp) && yYH.ejfBZ(interfaceC56665yNu.AYXKKw()) && C56669yNy.KWHzl(interfaceC56668yNx, interfaceC56665yNu)) {
                        return true;
                    }
                }
                while (interfaceC56668yNx != 0) {
                    interfaceC56668yNx = interfaceC56668yNx.AYXKKw();
                    if (((interfaceC56668yNx instanceof InterfaceC56658yNn) && !yYH.isConnected(interfaceC56668yNx)) || (interfaceC56668yNx instanceof yNW)) {
                        break;
                    }
                }
                if (interfaceC56668yNx == 0) {
                    return false;
                }
                while (interfaceC56665yNu != null) {
                    if (interfaceC56668yNx == interfaceC56665yNu) {
                        return true;
                    }
                    if (interfaceC56665yNu instanceof yNW) {
                        return (interfaceC56668yNx instanceof yNW) && ((yNW) interfaceC56668yNx).KWHzl().equals(((yNW) interfaceC56665yNu).KWHzl()) && yYH.AEQbTJ(interfaceC56665yNu, interfaceC56668yNx);
                    }
                    interfaceC56665yNu = interfaceC56665yNu.AYXKKw();
                }
                return false;
            }
        };
        AkhnZx = yna;
        yNA yna2 = new yNA(yOE.PendingIntent.copydefault) { // from class: o.yNy.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void KWHzl(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                InterfaceC56665yNu interfaceC56665yNuAEQbTJ;
                if (interfaceC56668yNx == null) {
                    KWHzl(0);
                }
                if (interfaceC56665yNu == null) {
                    KWHzl(1);
                }
                if (C56669yNy.AkhnZx.KWHzl(interfaceC59070zaB, interfaceC56668yNx, interfaceC56665yNu, z)) {
                    if (interfaceC59070zaB == C56669yNy.AEQbTJ) {
                        return true;
                    }
                    if (interfaceC59070zaB != C56669yNy.djBIcL && (interfaceC56665yNuAEQbTJ = yYH.AEQbTJ(interfaceC56668yNx, (java.lang.Class<InterfaceC56665yNu>) InterfaceC56658yNn.class)) != null && (interfaceC59070zaB instanceof InterfaceC59069zaA)) {
                        return ((InterfaceC59069zaA) interfaceC59070zaB).AEQbTJ().zuBGHE().equals(interfaceC56665yNuAEQbTJ.AhwBna());
                    }
                }
                return false;
            }
        };
        values = yna2;
        yNA yna3 = new yNA(yOE.LoaderManager.AEQbTJ) { // from class: o.yNy.9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void AEQbTJ(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "whatDeclaration";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "fromClass";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
                if (i == 2 || i == 3) {
                    objArr[2] = "doesReceiverFitForProtectedVisibility";
                } else {
                    objArr[2] = "isVisible";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                InterfaceC56658yNn interfaceC56658yNn;
                if (interfaceC56668yNx == null) {
                    AEQbTJ(0);
                }
                if (interfaceC56665yNu == null) {
                    AEQbTJ(1);
                }
                InterfaceC56658yNn interfaceC56658yNn2 = (InterfaceC56658yNn) yYH.AEQbTJ(interfaceC56668yNx, InterfaceC56658yNn.class);
                InterfaceC56658yNn interfaceC56658yNn3 = (InterfaceC56658yNn) yYH.EZpvd(interfaceC56665yNu, InterfaceC56658yNn.class, false);
                if (interfaceC56658yNn3 == null) {
                    return false;
                }
                if (interfaceC56658yNn2 != null && yYH.isConnected(interfaceC56658yNn2) && (interfaceC56658yNn = (InterfaceC56658yNn) yYH.AEQbTJ(interfaceC56658yNn2, InterfaceC56658yNn.class)) != null && yYH.EZpvd(interfaceC56658yNn3, interfaceC56658yNn)) {
                    return true;
                }
                InterfaceC56668yNx interfaceC56668yNxAEQbTJ = yYH.AEQbTJ(interfaceC56668yNx);
                InterfaceC56658yNn interfaceC56658yNn4 = (InterfaceC56658yNn) yYH.AEQbTJ(interfaceC56668yNxAEQbTJ, InterfaceC56658yNn.class);
                if (interfaceC56658yNn4 == null) {
                    return false;
                }
                if (yYH.EZpvd(interfaceC56658yNn3, interfaceC56658yNn4) && AEQbTJ(interfaceC59070zaB, interfaceC56668yNxAEQbTJ, interfaceC56658yNn3)) {
                    return true;
                }
                return KWHzl(interfaceC59070zaB, interfaceC56668yNx, interfaceC56658yNn3.AYXKKw(), z);
            }

            public final boolean AEQbTJ(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56658yNn interfaceC56658yNn) {
                AbstractC59233zdF abstractC59233zdFOLrzqt;
                if (interfaceC56668yNx == null) {
                    AEQbTJ(2);
                }
                if (interfaceC56658yNn == null) {
                    AEQbTJ(3);
                }
                if (interfaceC59070zaB == C56669yNy.EZpvd) {
                    return false;
                }
                if (!(interfaceC56668yNx instanceof CallableMemberDescriptor) || (interfaceC56668yNx instanceof InterfaceC56660yNp) || interfaceC59070zaB == C56669yNy.AEQbTJ) {
                    return true;
                }
                if (interfaceC59070zaB == C56669yNy.djBIcL || interfaceC59070zaB == null) {
                    return false;
                }
                if (interfaceC59070zaB instanceof InterfaceC59118zax) {
                    abstractC59233zdFOLrzqt = ((InterfaceC59118zax) interfaceC59070zaB).AEQbTJ();
                } else {
                    abstractC59233zdFOLrzqt = interfaceC59070zaB.OLrzqt();
                }
                return yYH.KWHzl(abstractC59233zdFOLrzqt, interfaceC56658yNn) || C59275zdv.OLrzqt(abstractC59233zdFOLrzqt);
            }
        };
        isConnected = yna3;
        yNA yna4 = new yNA(yOE.Application.KWHzl) { // from class: o.yNy.8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void AEQbTJ(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    AEQbTJ(0);
                }
                if (interfaceC56665yNu == null) {
                    AEQbTJ(1);
                }
                if (yYH.OLrzqt(interfaceC56665yNu).EZpvd(yYH.OLrzqt(interfaceC56668yNx))) {
                    return C56669yNy.gEmmrt.KWHzl(interfaceC56668yNx, interfaceC56665yNu);
                }
                return false;
            }
        };
        KWHzl = yna4;
        yNA yna5 = new yNA(yOE.Fragment.OLrzqt) { // from class: o.yNy.6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void AEQbTJ(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    AEQbTJ(0);
                }
                if (interfaceC56665yNu == null) {
                    AEQbTJ(1);
                }
                return true;
            }
        };
        fetchVPNInfo = yna5;
        yNA yna6 = new yNA(yOE.ActionBar.EZpvd) { // from class: o.yNy.10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void EZpvd(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    EZpvd(0);
                }
                if (interfaceC56665yNu == null) {
                    EZpvd(1);
                }
                throw new java.lang.IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        };
        AYXKKw = yna6;
        yNA yna7 = new yNA(yOE.Activity.EZpvd) { // from class: o.yNy.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void OLrzqt(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    OLrzqt(0);
                }
                if (interfaceC56665yNu == null) {
                    OLrzqt(1);
                }
                throw new java.lang.IllegalStateException("Visibility is unknown yet");
            }
        };
        copydefault = yna7;
        yNA yna8 = new yNA(yOE.TaskDescription.AEQbTJ) { // from class: o.yNy.14
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void AEQbTJ(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    AEQbTJ(0);
                }
                if (interfaceC56665yNu == null) {
                    AEQbTJ(1);
                }
                return false;
            }
        };
        valueOf = yna8;
        yNA yna9 = new yNA(yOE.Dialog.OLrzqt) { // from class: o.yNy.12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void copydefault(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    copydefault(0);
                }
                if (interfaceC56665yNu == null) {
                    copydefault(1);
                }
                return false;
            }
        };
        fIwbmz = yna9;
        AhwBna = Collections.unmodifiableSet(yEE.AhwBna(yna, yna2, yna4, yna6));
        java.util.HashMap mapAEQbTJ = C59433zgu.AEQbTJ(4);
        mapAEQbTJ.put(yna2, 0);
        mapAEQbTJ.put(yna, 0);
        mapAEQbTJ.put(yna4, 1);
        mapAEQbTJ.put(yna3, 1);
        mapAEQbTJ.put(yna5, 2);
        DbNXlk = Collections.unmodifiableMap(mapAEQbTJ);
        OLrzqt = yna5;
        djBIcL = new InterfaceC59070zaB() { // from class: o.yNy.2
            @Override // o.InterfaceC59070zaB
            public AbstractC59233zdF OLrzqt() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        AEQbTJ = new InterfaceC59070zaB() { // from class: o.yNy.4
            @Override // o.InterfaceC59070zaB
            public AbstractC59233zdF OLrzqt() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        EZpvd = new InterfaceC59070zaB() { // from class: o.yNy.1
            @Override // o.InterfaceC59070zaB
            public AbstractC59233zdF OLrzqt() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        java.util.Iterator it = ServiceLoader.load(InterfaceC59356zfW.class, InterfaceC59356zfW.class.getClassLoader()).iterator();
        gEmmrt = it.hasNext() ? (InterfaceC59356zfW) it.next() : InterfaceC59356zfW.Activity.AEQbTJ;
        fJNWhG = new java.util.HashMap();
        AEQbTJ(yna);
        AEQbTJ(yna2);
        AEQbTJ(yna3);
        AEQbTJ(yna4);
        AEQbTJ(yna5);
        AEQbTJ(yna6);
        AEQbTJ(yna7);
        AEQbTJ(yna8);
        AEQbTJ(yna9);
    }

    public static boolean KWHzl(@NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
        if (interfaceC56668yNx == null) {
            EZpvd(2);
        }
        if (interfaceC56665yNu == null) {
            EZpvd(3);
        }
        return EZpvd(AEQbTJ, interfaceC56668yNx, interfaceC56665yNu, z) == null;
    }

    public static boolean KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull InterfaceC56665yNu interfaceC56665yNu2) {
        if (interfaceC56665yNu == null) {
            EZpvd(6);
        }
        if (interfaceC56665yNu2 == null) {
            EZpvd(7);
        }
        InterfaceC56684yOm interfaceC56684yOmKWHzl = yYH.KWHzl(interfaceC56665yNu2);
        if (interfaceC56684yOmKWHzl != InterfaceC56684yOm.EZpvd) {
            return interfaceC56684yOmKWHzl.equals(yYH.KWHzl(interfaceC56665yNu));
        }
        return false;
    }

    public static InterfaceC56668yNx EZpvd(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
        InterfaceC56668yNx interfaceC56668yNxEZpvd;
        if (interfaceC56668yNx == null) {
            EZpvd(8);
        }
        if (interfaceC56665yNu == null) {
            EZpvd(9);
        }
        for (InterfaceC56668yNx interfaceC56668yNx2 = (InterfaceC56668yNx) interfaceC56668yNx.AhwBna(); interfaceC56668yNx2 != null && interfaceC56668yNx2.getNewProxyInstance() != AYXKKw; interfaceC56668yNx2 = (InterfaceC56668yNx) yYH.AEQbTJ(interfaceC56668yNx2, InterfaceC56668yNx.class)) {
            if (!interfaceC56668yNx2.getNewProxyInstance().KWHzl(interfaceC59070zaB, interfaceC56668yNx2, interfaceC56665yNu, z)) {
                return interfaceC56668yNx2;
            }
        }
        if (!(interfaceC56668yNx instanceof yPQ) || (interfaceC56668yNxEZpvd = EZpvd(interfaceC59070zaB, ((yPQ) interfaceC56668yNx).ejfBZ(), interfaceC56665yNu, z)) == null) {
            return null;
        }
        return interfaceC56668yNxEZpvd;
    }

    public static java.lang.Integer AEQbTJ(@NotNull yNC ync, @NotNull yNC ync2) {
        if (ync == null) {
            EZpvd(12);
        }
        if (ync2 == null) {
            EZpvd(13);
        }
        java.lang.Integer numKWHzl = ync.KWHzl(ync2);
        if (numKWHzl != null) {
            return numKWHzl;
        }
        java.lang.Integer numKWHzl2 = ync2.KWHzl(ync);
        if (numKWHzl2 != null) {
            return java.lang.Integer.valueOf(-numKWHzl2.intValue());
        }
        return null;
    }

    public static void AEQbTJ(yNC ync) {
        fJNWhG.put(ync.copydefault(), ync);
    }

    public static yNC EZpvd(@NotNull yOD yod) {
        if (yod == null) {
            EZpvd(15);
        }
        yNC ync = fJNWhG.get(yod);
        if (ync != null) {
            return ync;
        }
        throw new java.lang.IllegalArgumentException("Inapplicable visibility: " + yod);
    }
}
