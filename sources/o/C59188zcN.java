package o;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59188zcN {
    public static final C59188zcN EZpvd = new C59188zcN();
    public static boolean copydefault;

    /* JADX INFO: renamed from: o.zcN$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull InterfaceC59382zfw interfaceC59382zfw2) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw2, "");
        return isSubtypeOf$default(this, typeCheckerState, interfaceC59382zfw, interfaceC59382zfw2, false, 8, null);
    }

    private C59188zcN() {
    }

    public static /* synthetic */ boolean isSubtypeOf$default(C59188zcN c59188zcN, TypeCheckerState typeCheckerState, InterfaceC59382zfw interfaceC59382zfw, InterfaceC59382zfw interfaceC59382zfw2, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c59188zcN.OLrzqt(typeCheckerState, interfaceC59382zfw, interfaceC59382zfw2, z);
    }

    public final boolean OLrzqt(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull InterfaceC59382zfw interfaceC59382zfw2, boolean z) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw2, "");
        if (interfaceC59382zfw == interfaceC59382zfw2) {
            return true;
        }
        if (typeCheckerState.OLrzqt(interfaceC59382zfw, interfaceC59382zfw2)) {
            return copydefault(typeCheckerState, interfaceC59382zfw, interfaceC59382zfw2, z);
        }
        return false;
    }

    public final boolean KWHzl(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull InterfaceC59382zfw interfaceC59382zfw2) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw2, "");
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (interfaceC59382zfw == interfaceC59382zfw2) {
            return true;
        }
        C59188zcN c59188zcN = EZpvd;
        if (c59188zcN.AEQbTJ(interfaceC59384zfyOLrzqt, interfaceC59382zfw) && c59188zcN.AEQbTJ(interfaceC59384zfyOLrzqt, interfaceC59382zfw2)) {
            InterfaceC59382zfw interfaceC59382zfwAEQbTJ = typeCheckerState.AEQbTJ(typeCheckerState.copydefault(interfaceC59382zfw));
            InterfaceC59382zfw interfaceC59382zfwAEQbTJ2 = typeCheckerState.AEQbTJ(typeCheckerState.copydefault(interfaceC59382zfw2));
            InterfaceC59381zfv interfaceC59381zfvFJNWhG = interfaceC59384zfyOLrzqt.fJNWhG(interfaceC59382zfwAEQbTJ);
            if (!interfaceC59384zfyOLrzqt.copydefault(interfaceC59384zfyOLrzqt.iwGUEr(interfaceC59382zfwAEQbTJ), interfaceC59384zfyOLrzqt.iwGUEr(interfaceC59382zfwAEQbTJ2))) {
                return false;
            }
            if (interfaceC59384zfyOLrzqt.AEQbTJ((InterfaceC59382zfw) interfaceC59381zfvFJNWhG) == 0) {
                return interfaceC59384zfyOLrzqt.gEmmrt(interfaceC59382zfwAEQbTJ) || interfaceC59384zfyOLrzqt.gEmmrt(interfaceC59382zfwAEQbTJ2) || interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfvFJNWhG) == interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59384zfyOLrzqt.fJNWhG(interfaceC59382zfwAEQbTJ2));
            }
        }
        return isSubtypeOf$default(c59188zcN, typeCheckerState, interfaceC59382zfw, interfaceC59382zfw2, false, 8, null) && isSubtypeOf$default(c59188zcN, typeCheckerState, interfaceC59382zfw2, interfaceC59382zfw, false, 8, null);
    }

    public final boolean copydefault(TypeCheckerState typeCheckerState, InterfaceC59382zfw interfaceC59382zfw, InterfaceC59382zfw interfaceC59382zfw2, boolean z) {
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        InterfaceC59382zfw interfaceC59382zfwAEQbTJ = typeCheckerState.AEQbTJ(typeCheckerState.copydefault(interfaceC59382zfw));
        InterfaceC59382zfw interfaceC59382zfwAEQbTJ2 = typeCheckerState.AEQbTJ(typeCheckerState.copydefault(interfaceC59382zfw2));
        C59188zcN c59188zcN = EZpvd;
        java.lang.Boolean boolAEQbTJ = c59188zcN.AEQbTJ(typeCheckerState, interfaceC59384zfyOLrzqt.fJNWhG(interfaceC59382zfwAEQbTJ), interfaceC59384zfyOLrzqt.getNewProxyInstance(interfaceC59382zfwAEQbTJ2));
        if (boolAEQbTJ != null) {
            boolean zBooleanValue = boolAEQbTJ.booleanValue();
            typeCheckerState.AEQbTJ(interfaceC59382zfwAEQbTJ, interfaceC59382zfwAEQbTJ2, z);
            return zBooleanValue;
        }
        java.lang.Boolean boolAEQbTJ2 = typeCheckerState.AEQbTJ(interfaceC59382zfwAEQbTJ, interfaceC59382zfwAEQbTJ2, z);
        return boolAEQbTJ2 != null ? boolAEQbTJ2.booleanValue() : c59188zcN.EZpvd(typeCheckerState, interfaceC59384zfyOLrzqt.fJNWhG(interfaceC59382zfwAEQbTJ), interfaceC59384zfyOLrzqt.getNewProxyInstance(interfaceC59382zfwAEQbTJ2));
    }

    public final java.lang.Boolean copydefault(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (!interfaceC59384zfyOLrzqt.gEmmrt(interfaceC59381zfv) && !interfaceC59384zfyOLrzqt.gEmmrt(interfaceC59381zfv2)) {
            return null;
        }
        if (OLrzqt(interfaceC59384zfyOLrzqt, interfaceC59381zfv) && OLrzqt(interfaceC59384zfyOLrzqt, interfaceC59381zfv2)) {
            return java.lang.Boolean.TRUE;
        }
        if (interfaceC59384zfyOLrzqt.gEmmrt(interfaceC59381zfv)) {
            if (OLrzqt(interfaceC59384zfyOLrzqt, typeCheckerState, interfaceC59381zfv, interfaceC59381zfv2, false)) {
                return java.lang.Boolean.TRUE;
            }
        } else if (interfaceC59384zfyOLrzqt.gEmmrt(interfaceC59381zfv2) && (AEQbTJ(interfaceC59384zfyOLrzqt, interfaceC59381zfv) || OLrzqt(interfaceC59384zfyOLrzqt, typeCheckerState, interfaceC59381zfv2, interfaceC59381zfv, true))) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }

    public static final boolean OLrzqt(InterfaceC59384zfy interfaceC59384zfy, TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2, boolean z) {
        java.util.Collection<InterfaceC59382zfw> collectionAkhnZx = interfaceC59384zfy.AkhnZx(interfaceC59381zfv);
        if (!(collectionAkhnZx instanceof java.util.Collection) || !collectionAkhnZx.isEmpty()) {
            for (InterfaceC59382zfw interfaceC59382zfw : collectionAkhnZx) {
                if (Intrinsics.EZpvd(interfaceC59384zfy.iwGUEr(interfaceC59382zfw), interfaceC59384zfy.fetchVPNInfo(interfaceC59381zfv2)) || (z && isSubtypeOf$default(EZpvd, typeCheckerState, interfaceC59381zfv2, interfaceC59382zfw, false, 8, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean AEQbTJ(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv) {
        InterfaceC59385zfz interfaceC59385zfzFetchVPNInfo = interfaceC59384zfy.fetchVPNInfo(interfaceC59381zfv);
        if (interfaceC59385zfzFetchVPNInfo instanceof InterfaceC59375zfp) {
            java.util.Collection<InterfaceC59382zfw> collectionAuCTel = interfaceC59384zfy.AuCTel(interfaceC59385zfzFetchVPNInfo);
            if (!(collectionAuCTel instanceof java.util.Collection) || !collectionAuCTel.isEmpty()) {
                java.util.Iterator<T> it = collectionAuCTel.iterator();
                while (it.hasNext()) {
                    InterfaceC59381zfv interfaceC59381zfvOLrzqt = interfaceC59384zfy.OLrzqt((InterfaceC59382zfw) it.next());
                    if (interfaceC59381zfvOLrzqt != null && interfaceC59384zfy.gEmmrt(interfaceC59381zfvOLrzqt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean copydefault(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv) {
        InterfaceC59382zfw interfaceC59382zfwOLrzqt;
        InterfaceC59381zfv newProxyInstance;
        return (interfaceC59381zfv instanceof InterfaceC59377zfr) && (interfaceC59382zfwOLrzqt = interfaceC59384zfy.OLrzqt(interfaceC59384zfy.EZpvd(interfaceC59384zfy.OLrzqt((InterfaceC59377zfr) interfaceC59381zfv)))) != null && (newProxyInstance = interfaceC59384zfy.getNewProxyInstance(interfaceC59382zfwOLrzqt)) != null && interfaceC59384zfy.gEmmrt(newProxyInstance);
    }

    public static final boolean OLrzqt(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv) {
        return interfaceC59384zfy.gEmmrt(interfaceC59381zfv) || copydefault(interfaceC59384zfy, interfaceC59381zfv);
    }

    public final boolean OLrzqt(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv) {
        TypeCheckerState.ActionBar actionBar;
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        InterfaceC59385zfz interfaceC59385zfzFetchVPNInfo = interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv);
        if (interfaceC59384zfyOLrzqt.valueOf(interfaceC59385zfzFetchVPNInfo)) {
            return interfaceC59384zfyOLrzqt.values(interfaceC59385zfzFetchVPNInfo);
        }
        if (interfaceC59384zfyOLrzqt.values(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv))) {
            return true;
        }
        typeCheckerState.AEQbTJ();
        ArrayDeque<InterfaceC59381zfv> arrayDequeKWHzl = typeCheckerState.KWHzl();
        Intrinsics.copydefault(arrayDequeKWHzl);
        java.util.Set<InterfaceC59381zfv> setCopydefault = typeCheckerState.copydefault();
        Intrinsics.copydefault(setCopydefault);
        arrayDequeKWHzl.push(interfaceC59381zfv);
        while (!arrayDequeKWHzl.isEmpty()) {
            InterfaceC59381zfv interfaceC59381zfvPop = arrayDequeKWHzl.pop();
            Intrinsics.copydefault(interfaceC59381zfvPop);
            if (setCopydefault.add(interfaceC59381zfvPop)) {
                if (interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59381zfvPop)) {
                    actionBar = TypeCheckerState.ActionBar.StateListAnimator.EZpvd;
                } else {
                    actionBar = TypeCheckerState.ActionBar.Application.OLrzqt;
                }
                if (!(!Intrinsics.EZpvd(actionBar, TypeCheckerState.ActionBar.StateListAnimator.EZpvd))) {
                    actionBar = null;
                }
                if (actionBar == null) {
                    continue;
                } else {
                    InterfaceC59384zfy interfaceC59384zfyOLrzqt2 = typeCheckerState.OLrzqt();
                    java.util.Iterator<InterfaceC59382zfw> it = interfaceC59384zfyOLrzqt2.AuCTel(interfaceC59384zfyOLrzqt2.fetchVPNInfo(interfaceC59381zfvPop)).iterator();
                    while (it.hasNext()) {
                        InterfaceC59381zfv interfaceC59381zfvOLrzqt = actionBar.OLrzqt(typeCheckerState, it.next());
                        if (interfaceC59384zfyOLrzqt.values(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfvOLrzqt))) {
                            typeCheckerState.EZpvd();
                            return true;
                        }
                        arrayDequeKWHzl.add(interfaceC59381zfvOLrzqt);
                    }
                }
            }
        }
        typeCheckerState.EZpvd();
        return false;
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.addSubtypeConstraint$default(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, o.zfw, o.zfw, boolean, int, java.lang.Object):java.lang.Boolean */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        java.util.Collection<InterfaceC59381zfv> arrayList;
        InterfaceC59382zfw interfaceC59382zfwOLrzqt;
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (copydefault) {
            if (!interfaceC59384zfyOLrzqt.AYXKKw(interfaceC59381zfv) && !interfaceC59384zfyOLrzqt.DbNXlk(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv))) {
                typeCheckerState.EZpvd(interfaceC59381zfv);
            }
            if (!interfaceC59384zfyOLrzqt.AYXKKw(interfaceC59381zfv2)) {
                typeCheckerState.EZpvd(interfaceC59381zfv2);
            }
        }
        boolean z = false;
        if (!C59189zcO.EZpvd.EZpvd(typeCheckerState, interfaceC59381zfv, interfaceC59381zfv2)) {
            return false;
        }
        C59188zcN c59188zcN = EZpvd;
        java.lang.Boolean boolCopydefault = c59188zcN.copydefault(typeCheckerState, interfaceC59381zfv, interfaceC59381zfv2);
        if (boolCopydefault != null) {
            boolean zBooleanValue = boolCopydefault.booleanValue();
            TypeCheckerState.addSubtypeConstraint$default(typeCheckerState, interfaceC59381zfv, interfaceC59381zfv2, false, 4, null);
            return zBooleanValue;
        }
        InterfaceC59385zfz interfaceC59385zfzFetchVPNInfo = interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv2);
        boolean z2 = true;
        if ((interfaceC59384zfyOLrzqt.copydefault(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv), interfaceC59385zfzFetchVPNInfo) && interfaceC59384zfyOLrzqt.AkhnZx(interfaceC59385zfzFetchVPNInfo) == 0) || interfaceC59384zfyOLrzqt.gEmmrt(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv2))) {
            return true;
        }
        java.util.List<InterfaceC59381zfv> listAEQbTJ = c59188zcN.AEQbTJ(typeCheckerState, interfaceC59381zfv, interfaceC59385zfzFetchVPNInfo);
        int i = 10;
        if (listAEQbTJ.size() > 1) {
            InterfaceC59384zfy interfaceC59384zfyOLrzqt2 = typeCheckerState.OLrzqt();
            InterfaceC59338zfE interfaceC59338zfE = interfaceC59384zfyOLrzqt2 instanceof InterfaceC59338zfE ? (InterfaceC59338zfE) interfaceC59384zfyOLrzqt2 : null;
            if (interfaceC59338zfE != null && interfaceC59338zfE.AEQbTJ()) {
                arrayList = new LinkedHashSet();
                for (InterfaceC59381zfv interfaceC59381zfv3 : listAEQbTJ) {
                    InterfaceC59381zfv interfaceC59381zfvOLrzqt = interfaceC59384zfyOLrzqt.OLrzqt(typeCheckerState.AEQbTJ(interfaceC59381zfv3));
                    if (interfaceC59381zfvOLrzqt != null) {
                        interfaceC59381zfv3 = interfaceC59381zfvOLrzqt;
                    }
                    arrayList.add(interfaceC59381zfv3);
                }
            } else {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                for (InterfaceC59381zfv interfaceC59381zfv4 : listAEQbTJ) {
                    InterfaceC59381zfv interfaceC59381zfvOLrzqt2 = interfaceC59384zfyOLrzqt.OLrzqt(typeCheckerState.AEQbTJ(interfaceC59381zfv4));
                    if (interfaceC59381zfvOLrzqt2 != null) {
                        interfaceC59381zfv4 = interfaceC59381zfvOLrzqt2;
                    }
                    arrayList.add(interfaceC59381zfv4);
                }
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return EZpvd.OLrzqt(typeCheckerState, interfaceC59381zfv);
        }
        if (size == 1) {
            return EZpvd.copydefault(typeCheckerState, interfaceC59384zfyOLrzqt.EZpvd((InterfaceC59381zfv) CollectionsKt___CollectionsKt.dNCPSb(arrayList)), interfaceC59381zfv2);
        }
        ArgumentList argumentList = new ArgumentList(interfaceC59384zfyOLrzqt.AkhnZx(interfaceC59385zfzFetchVPNInfo));
        int iAkhnZx = interfaceC59384zfyOLrzqt.AkhnZx(interfaceC59385zfzFetchVPNInfo);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < iAkhnZx) {
            z3 = (z3 || interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59384zfyOLrzqt.EZpvd(interfaceC59385zfzFetchVPNInfo, i2)) != TypeVariance.OUT) ? z2 : z;
            if (!z3) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, i));
                for (InterfaceC59381zfv interfaceC59381zfv5 : arrayList) {
                    InterfaceC59334zfA interfaceC59334zfAKWHzl = interfaceC59384zfyOLrzqt.KWHzl(interfaceC59381zfv5, i2);
                    if (interfaceC59334zfAKWHzl != null) {
                        if (interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59334zfAKWHzl) != TypeVariance.INV) {
                            interfaceC59334zfAKWHzl = null;
                        }
                        if (interfaceC59334zfAKWHzl != null && (interfaceC59382zfwOLrzqt = interfaceC59384zfyOLrzqt.OLrzqt(interfaceC59334zfAKWHzl)) != null) {
                            arrayList2.add(interfaceC59382zfwOLrzqt);
                        }
                    }
                    throw new java.lang.IllegalStateException(("Incorrect type: " + interfaceC59381zfv5 + ", subType: " + interfaceC59381zfv + ", superType: " + interfaceC59381zfv2).toString());
                }
                argumentList.add(interfaceC59384zfyOLrzqt.copydefault(interfaceC59384zfyOLrzqt.KWHzl(arrayList2)));
            }
            i2++;
            z = false;
            z2 = true;
            i = 10;
        }
        if (z3 || !EZpvd.copydefault(typeCheckerState, argumentList, interfaceC59381zfv2)) {
            return typeCheckerState.copydefault(new C59190zcP(arrayList, typeCheckerState, interfaceC59384zfyOLrzqt, interfaceC59381zfv2));
        }
        return true;
    }

    public static final Unit AEQbTJ(java.util.Collection collection, TypeCheckerState typeCheckerState, InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv, TypeCheckerState.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            taskDescription.EZpvd(new C59195zcU(typeCheckerState, interfaceC59384zfy, (InterfaceC59381zfv) it.next(), interfaceC59381zfv));
        }
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(TypeCheckerState typeCheckerState, InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        return EZpvd.copydefault(typeCheckerState, interfaceC59384zfy.EZpvd(interfaceC59381zfv), interfaceC59381zfv2);
    }

    public final boolean copydefault(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59382zfw interfaceC59382zfw, InterfaceC59382zfw interfaceC59382zfw2, InterfaceC59385zfz interfaceC59385zfz) {
        InterfaceC59383zfx interfaceC59383zfxKWHzl;
        InterfaceC59381zfv interfaceC59381zfvOLrzqt = interfaceC59384zfy.OLrzqt(interfaceC59382zfw);
        if (!(interfaceC59381zfvOLrzqt instanceof InterfaceC59377zfr)) {
            return false;
        }
        InterfaceC59377zfr interfaceC59377zfr = (InterfaceC59377zfr) interfaceC59381zfvOLrzqt;
        if (interfaceC59384zfy.EZpvd(interfaceC59377zfr) || !interfaceC59384zfy.EZpvd(interfaceC59384zfy.EZpvd(interfaceC59384zfy.OLrzqt(interfaceC59377zfr))) || interfaceC59384zfy.KWHzl(interfaceC59377zfr) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        InterfaceC59385zfz interfaceC59385zfzIwGUEr = interfaceC59384zfy.iwGUEr(interfaceC59382zfw2);
        InterfaceC59339zfF interfaceC59339zfF = interfaceC59385zfzIwGUEr instanceof InterfaceC59339zfF ? (InterfaceC59339zfF) interfaceC59385zfzIwGUEr : null;
        return (interfaceC59339zfF == null || (interfaceC59383zfxKWHzl = interfaceC59384zfy.KWHzl(interfaceC59339zfF)) == null || !interfaceC59384zfy.KWHzl(interfaceC59383zfxKWHzl, interfaceC59385zfz)) ? false : true;
    }

    public final boolean copydefault(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59378zfs interfaceC59378zfs, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
        boolean zKWHzl;
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59378zfs, "");
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        InterfaceC59385zfz interfaceC59385zfzFetchVPNInfo = interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv);
        int iAEQbTJ = interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59378zfs);
        int iAkhnZx = interfaceC59384zfyOLrzqt.AkhnZx(interfaceC59385zfzFetchVPNInfo);
        if (iAEQbTJ != iAkhnZx || iAEQbTJ != interfaceC59384zfyOLrzqt.AEQbTJ((InterfaceC59382zfw) interfaceC59381zfv)) {
            return false;
        }
        for (int i = 0; i < iAkhnZx; i++) {
            InterfaceC59334zfA interfaceC59334zfACopydefault = interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfv, i);
            InterfaceC59382zfw interfaceC59382zfwOLrzqt = interfaceC59384zfyOLrzqt.OLrzqt(interfaceC59334zfACopydefault);
            if (interfaceC59382zfwOLrzqt != null) {
                InterfaceC59334zfA interfaceC59334zfAEZpvd = interfaceC59384zfyOLrzqt.EZpvd(interfaceC59378zfs, i);
                interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59334zfAEZpvd);
                TypeVariance typeVariance = TypeVariance.INV;
                InterfaceC59382zfw interfaceC59382zfwOLrzqt2 = interfaceC59384zfyOLrzqt.OLrzqt(interfaceC59334zfAEZpvd);
                Intrinsics.copydefault(interfaceC59382zfwOLrzqt2);
                C59188zcN c59188zcN = EZpvd;
                TypeVariance typeVarianceCopydefault = c59188zcN.copydefault(interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59384zfyOLrzqt.EZpvd(interfaceC59385zfzFetchVPNInfo, i)), interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59334zfACopydefault));
                if (typeVarianceCopydefault == null) {
                    return typeCheckerState.valueOf();
                }
                if (typeVarianceCopydefault != typeVariance || (!c59188zcN.copydefault(interfaceC59384zfyOLrzqt, interfaceC59382zfwOLrzqt2, interfaceC59382zfwOLrzqt, interfaceC59385zfzFetchVPNInfo) && !c59188zcN.copydefault(interfaceC59384zfyOLrzqt, interfaceC59382zfwOLrzqt, interfaceC59382zfwOLrzqt2, interfaceC59385zfzFetchVPNInfo))) {
                    if (typeCheckerState.OLrzqt > 100) {
                        throw new java.lang.IllegalStateException(("Arguments depth is too high. Some related argument: " + interfaceC59382zfwOLrzqt2).toString());
                    }
                    typeCheckerState.OLrzqt++;
                    int i2 = Application.KWHzl[typeVarianceCopydefault.ordinal()];
                    if (i2 == 1) {
                        zKWHzl = c59188zcN.KWHzl(typeCheckerState, interfaceC59382zfwOLrzqt2, interfaceC59382zfwOLrzqt);
                    } else if (i2 == 2) {
                        zKWHzl = isSubtypeOf$default(c59188zcN, typeCheckerState, interfaceC59382zfwOLrzqt2, interfaceC59382zfwOLrzqt, false, 8, null);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zKWHzl = isSubtypeOf$default(c59188zcN, typeCheckerState, interfaceC59382zfwOLrzqt, interfaceC59382zfwOLrzqt2, false, 8, null);
                    }
                    typeCheckerState.OLrzqt--;
                    if (!zKWHzl) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean AEQbTJ(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59382zfw interfaceC59382zfw) {
        return (!interfaceC59384zfy.AhwBna(interfaceC59384zfy.iwGUEr(interfaceC59382zfw)) || interfaceC59384zfy.fetchVPNInfo(interfaceC59382zfw) || interfaceC59384zfy.AhwBna(interfaceC59382zfw) || interfaceC59384zfy.AkhnZx(interfaceC59382zfw) || interfaceC59384zfy.DbNXlk(interfaceC59382zfw)) ? false : true;
    }

    public final TypeVariance copydefault(@NotNull TypeVariance typeVariance, @NotNull TypeVariance typeVariance2) {
        Intrinsics.checkNotNullParameter(typeVariance, "");
        Intrinsics.checkNotNullParameter(typeVariance2, "");
        TypeVariance typeVariance3 = TypeVariance.INV;
        if (typeVariance == typeVariance3) {
            return typeVariance2;
        }
        if (typeVariance2 == typeVariance3 || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    public final boolean EZpvd(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        if (interfaceC59384zfy.fetchVPNInfo(interfaceC59381zfv) != interfaceC59384zfy.fetchVPNInfo(interfaceC59381zfv2)) {
            return false;
        }
        if (interfaceC59384zfy.copydefault(interfaceC59381zfv) || !interfaceC59384zfy.copydefault(interfaceC59381zfv2)) {
            return !interfaceC59384zfy.values((InterfaceC59382zfw) interfaceC59381zfv) || interfaceC59384zfy.values((InterfaceC59382zfw) interfaceC59381zfv2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean AEQbTJ(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        InterfaceC59383zfx interfaceC59383zfxOLrzqt;
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (interfaceC59384zfyOLrzqt.isConnected(interfaceC59381zfv) || interfaceC59384zfyOLrzqt.isConnected(interfaceC59381zfv2)) {
            return typeCheckerState.valueOf() ? java.lang.Boolean.TRUE : (!interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfv) || interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfv2)) ? java.lang.Boolean.valueOf(C59192zcR.AEQbTJ.EZpvd(interfaceC59384zfyOLrzqt, interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfv, false), interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfv2, false))) : java.lang.Boolean.FALSE;
        }
        if (interfaceC59384zfyOLrzqt.AhwBna(interfaceC59381zfv) && interfaceC59384zfyOLrzqt.AhwBna(interfaceC59381zfv2)) {
            return java.lang.Boolean.valueOf(EZpvd.EZpvd(interfaceC59384zfyOLrzqt, interfaceC59381zfv, interfaceC59381zfv2) || typeCheckerState.AYXKKw());
        }
        if (interfaceC59384zfyOLrzqt.valueOf(interfaceC59381zfv) || interfaceC59384zfyOLrzqt.valueOf(interfaceC59381zfv2)) {
            return java.lang.Boolean.valueOf(typeCheckerState.AYXKKw());
        }
        InterfaceC59377zfr interfaceC59377zfrOLrzqt = interfaceC59384zfyOLrzqt.OLrzqt(interfaceC59381zfv2);
        InterfaceC59382zfw interfaceC59382zfwCopydefault = interfaceC59377zfrOLrzqt != null ? interfaceC59384zfyOLrzqt.copydefault(interfaceC59377zfrOLrzqt) : null;
        if (interfaceC59377zfrOLrzqt != null && interfaceC59382zfwCopydefault != null) {
            if (interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfv2)) {
                interfaceC59382zfwCopydefault = interfaceC59384zfyOLrzqt.EZpvd(interfaceC59382zfwCopydefault, true);
            } else if (interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfv2)) {
                interfaceC59382zfwCopydefault = interfaceC59384zfyOLrzqt.hDKMBd(interfaceC59382zfwCopydefault);
            }
            InterfaceC59382zfw interfaceC59382zfw = interfaceC59382zfwCopydefault;
            int i = Application.EZpvd[typeCheckerState.OLrzqt(interfaceC59381zfv, interfaceC59377zfrOLrzqt).ordinal()];
            if (i == 1) {
                return java.lang.Boolean.valueOf(isSubtypeOf$default(EZpvd, typeCheckerState, interfaceC59381zfv, interfaceC59382zfw, false, 8, null));
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (isSubtypeOf$default(EZpvd, typeCheckerState, interfaceC59381zfv, interfaceC59382zfw, false, 8, null)) {
                return java.lang.Boolean.TRUE;
            }
        }
        InterfaceC59385zfz interfaceC59385zfzFetchVPNInfo = interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv2);
        if (interfaceC59384zfyOLrzqt.DbNXlk(interfaceC59385zfzFetchVPNInfo)) {
            interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfv2);
            java.util.Collection<InterfaceC59382zfw> collectionAuCTel = interfaceC59384zfyOLrzqt.AuCTel(interfaceC59385zfzFetchVPNInfo);
            if ((collectionAuCTel instanceof java.util.Collection) && collectionAuCTel.isEmpty()) {
                z = true;
            } else {
                java.util.Iterator<T> it = collectionAuCTel.iterator();
                while (it.hasNext()) {
                    if (!isSubtypeOf$default(EZpvd, typeCheckerState, interfaceC59381zfv, (InterfaceC59382zfw) it.next(), false, 8, null)) {
                        break;
                    }
                }
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        InterfaceC59385zfz interfaceC59385zfzFetchVPNInfo2 = interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv);
        if (!(interfaceC59381zfv instanceof InterfaceC59377zfr)) {
            if (interfaceC59384zfyOLrzqt.DbNXlk(interfaceC59385zfzFetchVPNInfo2)) {
                java.util.Collection<InterfaceC59382zfw> collectionAuCTel2 = interfaceC59384zfyOLrzqt.AuCTel(interfaceC59385zfzFetchVPNInfo2);
                if (!(collectionAuCTel2 instanceof java.util.Collection) || !collectionAuCTel2.isEmpty()) {
                    java.util.Iterator<T> it2 = collectionAuCTel2.iterator();
                    while (it2.hasNext()) {
                        if (!(((InterfaceC59382zfw) it2.next()) instanceof InterfaceC59377zfr)) {
                            break;
                        }
                    }
                    interfaceC59383zfxOLrzqt = EZpvd.OLrzqt(typeCheckerState.OLrzqt(), interfaceC59381zfv2, interfaceC59381zfv);
                    if (interfaceC59383zfxOLrzqt != null) {
                        return java.lang.Boolean.TRUE;
                    }
                }
            }
        } else {
            interfaceC59383zfxOLrzqt = EZpvd.OLrzqt(typeCheckerState.OLrzqt(), interfaceC59381zfv2, interfaceC59381zfv);
            if (interfaceC59383zfxOLrzqt != null && interfaceC59384zfyOLrzqt.KWHzl(interfaceC59383zfxOLrzqt, interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv2))) {
                return java.lang.Boolean.TRUE;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        return r8.EZpvd(r8.iwGUEr(r9), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC59383zfx OLrzqt(InterfaceC59384zfy interfaceC59384zfy, InterfaceC59382zfw interfaceC59382zfw, InterfaceC59382zfw interfaceC59382zfw2) {
        InterfaceC59382zfw interfaceC59382zfwOLrzqt;
        int iAEQbTJ = interfaceC59384zfy.AEQbTJ(interfaceC59382zfw);
        int i = 0;
        while (true) {
            if (i >= iAEQbTJ) {
                return null;
            }
            InterfaceC59334zfA interfaceC59334zfACopydefault = interfaceC59384zfy.copydefault(interfaceC59382zfw, i);
            InterfaceC59334zfA interfaceC59334zfA = interfaceC59384zfy.EZpvd(interfaceC59334zfACopydefault) ^ true ? interfaceC59334zfACopydefault : null;
            if (interfaceC59334zfA != null && (interfaceC59382zfwOLrzqt = interfaceC59384zfy.OLrzqt(interfaceC59334zfA)) != null) {
                boolean z = interfaceC59384zfy.valueOf((InterfaceC59382zfw) interfaceC59384zfy.fJNWhG(interfaceC59382zfwOLrzqt)) && interfaceC59384zfy.valueOf((InterfaceC59382zfw) interfaceC59384zfy.fJNWhG(interfaceC59382zfw2));
                if (Intrinsics.EZpvd(interfaceC59382zfwOLrzqt, interfaceC59382zfw2) || (z && Intrinsics.EZpvd(interfaceC59384zfy.iwGUEr(interfaceC59382zfwOLrzqt), interfaceC59384zfy.iwGUEr(interfaceC59382zfw2)))) {
                    break;
                }
                InterfaceC59383zfx interfaceC59383zfxOLrzqt = OLrzqt(interfaceC59384zfy, interfaceC59382zfwOLrzqt, interfaceC59382zfw2);
                if (interfaceC59383zfxOLrzqt != null) {
                    return interfaceC59383zfxOLrzqt;
                }
            }
            i++;
        }
    }

    public final java.util.List<InterfaceC59381zfv> EZpvd(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59385zfz interfaceC59385zfz) {
        TypeCheckerState.ActionBar actionBarValues;
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        java.util.List<InterfaceC59380zfu> listKWHzl = interfaceC59384zfyOLrzqt.KWHzl(interfaceC59381zfv, interfaceC59385zfz);
        if (listKWHzl != null) {
            return listKWHzl;
        }
        if (!interfaceC59384zfyOLrzqt.valueOf(interfaceC59385zfz) && interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59381zfv)) {
            return yDY.AhwBna();
        }
        if (interfaceC59384zfyOLrzqt.AYXKKw(interfaceC59385zfz)) {
            if (interfaceC59384zfyOLrzqt.copydefault(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv), interfaceC59385zfz)) {
                InterfaceC59381zfv interfaceC59381zfvOLrzqt = interfaceC59384zfyOLrzqt.OLrzqt(interfaceC59381zfv, CaptureStatus.FOR_SUBTYPING);
                if (interfaceC59381zfvOLrzqt != null) {
                    interfaceC59381zfv = interfaceC59381zfvOLrzqt;
                }
                return C56402yEa.EZpvd(interfaceC59381zfv);
            }
            return yDY.AhwBna();
        }
        C59387zgA c59387zgA = new C59387zgA();
        typeCheckerState.AEQbTJ();
        ArrayDeque<InterfaceC59381zfv> arrayDequeKWHzl = typeCheckerState.KWHzl();
        Intrinsics.copydefault(arrayDequeKWHzl);
        java.util.Set<InterfaceC59381zfv> setCopydefault = typeCheckerState.copydefault();
        Intrinsics.copydefault(setCopydefault);
        arrayDequeKWHzl.push(interfaceC59381zfv);
        while (!arrayDequeKWHzl.isEmpty()) {
            InterfaceC59381zfv interfaceC59381zfvPop = arrayDequeKWHzl.pop();
            Intrinsics.copydefault(interfaceC59381zfvPop);
            if (setCopydefault.add(interfaceC59381zfvPop)) {
                InterfaceC59381zfv interfaceC59381zfvOLrzqt2 = interfaceC59384zfyOLrzqt.OLrzqt(interfaceC59381zfvPop, CaptureStatus.FOR_SUBTYPING);
                if (interfaceC59381zfvOLrzqt2 == null) {
                    interfaceC59381zfvOLrzqt2 = interfaceC59381zfvPop;
                }
                if (interfaceC59384zfyOLrzqt.copydefault(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfvOLrzqt2), interfaceC59385zfz)) {
                    c59387zgA.add(interfaceC59381zfvOLrzqt2);
                    actionBarValues = TypeCheckerState.ActionBar.StateListAnimator.EZpvd;
                } else if (interfaceC59384zfyOLrzqt.AEQbTJ((InterfaceC59382zfw) interfaceC59381zfvOLrzqt2) == 0) {
                    actionBarValues = TypeCheckerState.ActionBar.Application.OLrzqt;
                } else {
                    actionBarValues = typeCheckerState.OLrzqt().values(interfaceC59381zfvOLrzqt2);
                }
                if (!(!Intrinsics.EZpvd(actionBarValues, TypeCheckerState.ActionBar.StateListAnimator.EZpvd))) {
                    actionBarValues = null;
                }
                if (actionBarValues != null) {
                    InterfaceC59384zfy interfaceC59384zfyOLrzqt2 = typeCheckerState.OLrzqt();
                    java.util.Iterator<InterfaceC59382zfw> it = interfaceC59384zfyOLrzqt2.AuCTel(interfaceC59384zfyOLrzqt2.fetchVPNInfo(interfaceC59381zfvPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeKWHzl.add(actionBarValues.OLrzqt(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.EZpvd();
        return c59387zgA;
    }

    public final java.util.List<InterfaceC59381zfv> KWHzl(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59385zfz interfaceC59385zfz) {
        return EZpvd(typeCheckerState, EZpvd(typeCheckerState, interfaceC59381zfv, interfaceC59385zfz));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends o.zfv> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<InterfaceC59381zfv> EZpvd(TypeCheckerState typeCheckerState, java.util.List<? extends InterfaceC59381zfv> list) {
        int i;
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (list.size() < 2) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InterfaceC59378zfs interfaceC59378zfsEZpvd = interfaceC59384zfyOLrzqt.EZpvd((InterfaceC59381zfv) obj);
            int iAEQbTJ = interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59378zfsEZpvd);
            while (true) {
                if (i < iAEQbTJ) {
                    InterfaceC59382zfw interfaceC59382zfwOLrzqt = interfaceC59384zfyOLrzqt.OLrzqt(interfaceC59384zfyOLrzqt.EZpvd(interfaceC59378zfsEZpvd, i));
                    i = (interfaceC59382zfwOLrzqt != null ? interfaceC59384zfyOLrzqt.KWHzl(interfaceC59382zfwOLrzqt) : null) == null ? i + 1 : 0;
                } else {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    public final java.util.List<InterfaceC59381zfv> AEQbTJ(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
        TypeCheckerState.ActionBar actionBar;
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59381zfv)) {
            return EZpvd.KWHzl(typeCheckerState, interfaceC59381zfv, interfaceC59385zfz);
        }
        if (!interfaceC59384zfyOLrzqt.valueOf(interfaceC59385zfz) && !interfaceC59384zfyOLrzqt.isConnected(interfaceC59385zfz)) {
            return EZpvd.EZpvd(typeCheckerState, interfaceC59381zfv, interfaceC59385zfz);
        }
        C59387zgA<InterfaceC59381zfv> c59387zgA = new C59387zgA();
        typeCheckerState.AEQbTJ();
        ArrayDeque<InterfaceC59381zfv> arrayDequeKWHzl = typeCheckerState.KWHzl();
        Intrinsics.copydefault(arrayDequeKWHzl);
        java.util.Set<InterfaceC59381zfv> setCopydefault = typeCheckerState.copydefault();
        Intrinsics.copydefault(setCopydefault);
        arrayDequeKWHzl.push(interfaceC59381zfv);
        while (!arrayDequeKWHzl.isEmpty()) {
            InterfaceC59381zfv interfaceC59381zfvPop = arrayDequeKWHzl.pop();
            Intrinsics.copydefault(interfaceC59381zfvPop);
            if (setCopydefault.add(interfaceC59381zfvPop)) {
                if (interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59381zfvPop)) {
                    c59387zgA.add(interfaceC59381zfvPop);
                    actionBar = TypeCheckerState.ActionBar.StateListAnimator.EZpvd;
                } else {
                    actionBar = TypeCheckerState.ActionBar.Application.OLrzqt;
                }
                if (!(!Intrinsics.EZpvd(actionBar, TypeCheckerState.ActionBar.StateListAnimator.EZpvd))) {
                    actionBar = null;
                }
                if (actionBar != null) {
                    InterfaceC59384zfy interfaceC59384zfyOLrzqt2 = typeCheckerState.OLrzqt();
                    java.util.Iterator<InterfaceC59382zfw> it = interfaceC59384zfyOLrzqt2.AuCTel(interfaceC59384zfyOLrzqt2.fetchVPNInfo(interfaceC59381zfvPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeKWHzl.add(actionBar.OLrzqt(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (InterfaceC59381zfv interfaceC59381zfv2 : c59387zgA) {
            C59188zcN c59188zcN = EZpvd;
            Intrinsics.copydefault(interfaceC59381zfv2);
            C56406yEe.KWHzl(arrayList, c59188zcN.KWHzl(typeCheckerState, interfaceC59381zfv2, interfaceC59385zfz));
        }
        return arrayList;
    }
}
