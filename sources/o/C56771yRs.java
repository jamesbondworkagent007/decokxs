package o;

import o.yPV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56771yRs {
    public static final yNC AEQbTJ;
    public static final yNC EZpvd;
    public static final java.util.Map<yOD, yNC> OLrzqt;
    public static final yNC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    static {
        yNA yna = new yNA(yPV.Application.OLrzqt) { // from class: o.yRs.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void OLrzqt(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "fromPackage";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "myPackage";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
                if (i == 2 || i == 3) {
                    objArr[2] = "visibleFromPackage";
                } else {
                    objArr[2] = "isVisible";
                }
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
                return C56771yRs.KWHzl(interfaceC56668yNx, interfaceC56665yNu);
            }
        };
        EZpvd = yna;
        yNA yna2 = new yNA(yPV.Activity.AEQbTJ) { // from class: o.yRs.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void KWHzl(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    KWHzl(0);
                }
                if (interfaceC56665yNu == null) {
                    KWHzl(1);
                }
                return C56771yRs.copydefault(interfaceC59070zaB, interfaceC56668yNx, interfaceC56665yNu);
            }
        };
        AEQbTJ = yna2;
        yNA yna3 = new yNA(yPV.TaskDescription.KWHzl) { // from class: o.yRs.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static /* synthetic */ void KWHzl(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // o.yNC
            public boolean KWHzl(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu, boolean z) {
                if (interfaceC56668yNx == null) {
                    KWHzl(0);
                }
                if (interfaceC56665yNu == null) {
                    KWHzl(1);
                }
                return C56771yRs.copydefault(interfaceC59070zaB, interfaceC56668yNx, interfaceC56665yNu);
            }
        };
        copydefault = yna3;
        OLrzqt = new java.util.HashMap();
        EZpvd(yna);
        EZpvd(yna2);
        EZpvd(yna3);
    }

    public static boolean copydefault(InterfaceC59070zaB interfaceC59070zaB, @NotNull InterfaceC56668yNx interfaceC56668yNx, @NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56668yNx == null) {
            AEQbTJ(0);
        }
        if (interfaceC56665yNu == null) {
            AEQbTJ(1);
        }
        if (KWHzl(yYH.AEQbTJ(interfaceC56668yNx), interfaceC56665yNu)) {
            return true;
        }
        return C56669yNy.isConnected.KWHzl(interfaceC59070zaB, interfaceC56668yNx, interfaceC56665yNu, false);
    }

    public static boolean KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull InterfaceC56665yNu interfaceC56665yNu2) {
        if (interfaceC56665yNu == null) {
            AEQbTJ(2);
        }
        if (interfaceC56665yNu2 == null) {
            AEQbTJ(3);
        }
        yNW ynw = (yNW) yYH.EZpvd(interfaceC56665yNu, yNW.class, false);
        yNW ynw2 = (yNW) yYH.EZpvd(interfaceC56665yNu2, yNW.class, false);
        return (ynw2 == null || ynw == null || !ynw.KWHzl().equals(ynw2.KWHzl())) ? false : true;
    }

    public static void EZpvd(yNC ync) {
        OLrzqt.put(ync.copydefault(), ync);
    }

    public static yNC copydefault(@NotNull yOD yod) {
        if (yod == null) {
            AEQbTJ(4);
        }
        yNC ync = OLrzqt.get(yod);
        if (ync != null) {
            return ync;
        }
        yNC yncEZpvd = C56669yNy.EZpvd(yod);
        if (yncEZpvd == null) {
            AEQbTJ(5);
        }
        return yncEZpvd;
    }
}
