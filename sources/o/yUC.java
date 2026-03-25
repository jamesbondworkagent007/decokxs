package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import o.C56884yVx;

/* JADX INFO: loaded from: classes13.dex */
public final class yUC {
    public static final C56857yUx AEQbTJ;
    public static final C56857yUx EZpvd = new C56857yUx(NullabilityQualifier.NULLABLE, null, false, false, 8, null);
    public static final java.util.Map<java.lang.String, C56882yVv> KWHzl;
    public static final C56857yUx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.Map<java.lang.String, C56882yVv> KWHzl() {
        return KWHzl;
    }

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        copydefault = new C56857yUx(nullabilityQualifier, null, false, false, 8, null);
        AEQbTJ = new C56857yUx(nullabilityQualifier, null, true, false, 8, null);
        C56894yWg c56894yWg = C56894yWg.AEQbTJ;
        java.lang.String strKWHzl = c56894yWg.KWHzl("Object");
        java.lang.String strOLrzqt = c56894yWg.OLrzqt("Predicate");
        java.lang.String strOLrzqt2 = c56894yWg.OLrzqt("Function");
        java.lang.String strOLrzqt3 = c56894yWg.OLrzqt("Consumer");
        java.lang.String strOLrzqt4 = c56894yWg.OLrzqt("BiFunction");
        java.lang.String strOLrzqt5 = c56894yWg.OLrzqt("BiConsumer");
        java.lang.String strOLrzqt6 = c56894yWg.OLrzqt("UnaryOperator");
        java.lang.String strAhwBna = c56894yWg.AhwBna("stream/Stream");
        java.lang.String strAhwBna2 = c56894yWg.AhwBna("Optional");
        C56884yVx c56884yVx = new C56884yVx();
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, c56894yWg.AhwBna("Iterator")), "forEachRemaining", null, new yUD(strOLrzqt3), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, c56894yWg.KWHzl("Iterable")), "spliterator", null, new C56859yUz(c56894yWg), 2, null);
        C56884yVx.Activity activity = new C56884yVx.Activity(c56884yVx, c56894yWg.AhwBna("Collection"));
        C56884yVx.Activity.function$default(activity, "removeIf", null, new yUN(strOLrzqt), 2, null);
        C56884yVx.Activity.function$default(activity, "stream", null, new yUU(strAhwBna), 2, null);
        C56884yVx.Activity.function$default(activity, "parallelStream", null, new C56872yVl(strAhwBna), 2, null);
        C56884yVx.Activity activity2 = new C56884yVx.Activity(c56884yVx, c56894yWg.AhwBna("List"));
        C56884yVx.Activity.function$default(activity2, "replaceAll", null, new C56878yVr(strOLrzqt6), 2, null);
        activity2.AEQbTJ("addFirst", "2.1", new C56877yVq(strKWHzl));
        activity2.AEQbTJ("addLast", "2.1", new C56875yVo(strKWHzl));
        activity2.AEQbTJ("removeFirst", "2.1", new C56876yVp(strKWHzl));
        activity2.AEQbTJ("removeLast", "2.1", new C56874yVn(strKWHzl));
        C56884yVx.Activity activity3 = new C56884yVx.Activity(c56884yVx, c56894yWg.AhwBna("LinkedList"));
        activity3.AEQbTJ("addFirst", "2.1", new yUA(strKWHzl));
        activity3.AEQbTJ("addLast", "2.1", new yUB(strKWHzl));
        activity3.AEQbTJ("removeFirst", "2.1", new yUF(strKWHzl));
        activity3.AEQbTJ("removeLast", "2.1", new yUI(strKWHzl));
        C56884yVx.Activity activity4 = new C56884yVx.Activity(c56884yVx, c56894yWg.AhwBna("LinkedHashSet"));
        activity4.AEQbTJ("addFirst", "2.2", new yUE(strKWHzl));
        activity4.AEQbTJ("addLast", "2.2", new yUG(strKWHzl));
        activity4.AEQbTJ("removeFirst", "2.2", new yUH(strKWHzl));
        activity4.AEQbTJ("removeLast", "2.2", new yUL(strKWHzl));
        activity4.AEQbTJ("getFirst", "2.2", new yUK(strKWHzl));
        activity4.AEQbTJ("getLast", "2.2", new yUJ(strKWHzl));
        C56884yVx.Activity activity5 = new C56884yVx.Activity(c56884yVx, c56894yWg.AhwBna("Map"));
        C56884yVx.Activity.function$default(activity5, "forEach", null, new yUM(strOLrzqt5), 2, null);
        C56884yVx.Activity.function$default(activity5, "putIfAbsent", null, new yUR(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(activity5, "replace", null, new yUS(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(activity5, "replace", null, new yUO(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(activity5, "replaceAll", null, new yUQ(strOLrzqt4), 2, null);
        C56884yVx.Activity.function$default(activity5, "compute", null, new yUP(strKWHzl, strOLrzqt4), 2, null);
        C56884yVx.Activity.function$default(activity5, "computeIfAbsent", null, new yUX(strKWHzl, strOLrzqt2), 2, null);
        C56884yVx.Activity.function$default(activity5, "computeIfPresent", null, new yUW(strKWHzl, strOLrzqt4), 2, null);
        C56884yVx.Activity.function$default(activity5, "merge", null, new yUT(strKWHzl, strOLrzqt4), 2, null);
        C56884yVx.Activity activity6 = new C56884yVx.Activity(c56884yVx, c56894yWg.AhwBna("LinkedHashMap"));
        activity6.AEQbTJ("putFirst", "2.2", new yUV(strKWHzl));
        activity6.AEQbTJ("putLast", "2.2", new C56863yVc(strKWHzl));
        C56884yVx.Activity activity7 = new C56884yVx.Activity(c56884yVx, strAhwBna2);
        C56884yVx.Activity.function$default(activity7, "empty", null, new C56862yVb(strAhwBna2), 2, null);
        C56884yVx.Activity.function$default(activity7, "of", null, new C56861yVa(strKWHzl, strAhwBna2), 2, null);
        C56884yVx.Activity.function$default(activity7, "ofNullable", null, new yUY(strKWHzl, strAhwBna2), 2, null);
        C56884yVx.Activity.function$default(activity7, "get", null, new yUZ(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(activity7, "ifPresent", null, new C56866yVf(strOLrzqt3), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, c56894yWg.KWHzl("ref/Reference")), "get", null, new C56868yVh(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, strOLrzqt), "test", null, new C56864yVd(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, c56894yWg.OLrzqt("BiPredicate")), "test", null, new C56867yVg(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, strOLrzqt3), "accept", null, new C56865yVe(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, strOLrzqt5), "accept", null, new C56869yVi(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, strOLrzqt2), "apply", null, new C56871yVk(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, strOLrzqt4), "apply", null, new C56870yVj(strKWHzl), 2, null);
        C56884yVx.Activity.function$default(new C56884yVx.Activity(c56884yVx, c56894yWg.OLrzqt("Supplier")), "get", null, new C56873yVm(strKWHzl), 2, null);
        KWHzl = c56884yVx.EZpvd();
    }

    public static final Unit KWHzl(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C56894yWg c56894yWg, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        java.lang.String strAhwBna = c56894yWg.AhwBna("Spliterator");
        C56857yUx c56857yUx = copydefault;
        taskDescription.KWHzl(strAhwBna, c56857yUx, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx, c56857yUx);
        taskDescription.KWHzl(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.KWHzl(str, c56857yUx, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit QOLQEE(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.KWHzl(str, c56857yUx, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit values(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx, c56857yUx, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(str, EZpvd);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(str, EZpvd);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx, c56857yUx, c56857yUx, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        C56857yUx c56857yUx2 = EZpvd;
        taskDescription.EZpvd(str2, c56857yUx, c56857yUx, c56857yUx2, c56857yUx2);
        taskDescription.KWHzl(str, c56857yUx2);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str2, c56857yUx, c56857yUx, c56857yUx);
        taskDescription.KWHzl(str, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        C56857yUx c56857yUx2 = AEQbTJ;
        C56857yUx c56857yUx3 = EZpvd;
        taskDescription.EZpvd(str2, c56857yUx, c56857yUx, c56857yUx2, c56857yUx3);
        taskDescription.KWHzl(str, c56857yUx3);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        C56857yUx c56857yUx2 = AEQbTJ;
        taskDescription.EZpvd(str, c56857yUx2);
        C56857yUx c56857yUx3 = EZpvd;
        taskDescription.EZpvd(str2, c56857yUx, c56857yUx2, c56857yUx2, c56857yUx3);
        taskDescription.KWHzl(str, c56857yUx3);
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(str, EZpvd);
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(str, EZpvd);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault, AEQbTJ);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = AEQbTJ;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(str2, copydefault, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.String str, java.lang.String str2, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, EZpvd);
        taskDescription.KWHzl(str2, copydefault, AEQbTJ);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, AEQbTJ);
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault, AEQbTJ);
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, EZpvd);
        return Unit.INSTANCE;
    }

    public static final Unit AubY(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        taskDescription.KWHzl(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    public static final Unit zsXlph(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(JvmPrimitiveType.BOOLEAN);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.EZpvd(str, copydefault);
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(str, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C56857yUx c56857yUx = copydefault;
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.EZpvd(str, c56857yUx);
        taskDescription.KWHzl(str, c56857yUx);
        return Unit.INSTANCE;
    }

    public static final Unit gHZMYf(java.lang.String str, C56884yVx.Activity.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.KWHzl(str, copydefault);
        return Unit.INSTANCE;
    }
}
