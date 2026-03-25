package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C56929yXo;
import o.yMB;
import o.yMM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yML {
    public static final C56929yXo AEQbTJ;
    public static final java.lang.String AYXKKw;
    public static final java.lang.String AhwBna;
    public static final java.util.HashMap<C56930yXp, C56933yXs> AkhnZx;
    public static final java.util.HashMap<C56930yXp, C56929yXo> DbNXlk;
    public static final C56929yXo EZpvd;
    public static final C56929yXo KWHzl;
    public static final yML OLrzqt;
    public static final C56933yXs copydefault;
    public static final java.lang.String djBIcL;
    public static final java.util.HashMap<C56930yXp, C56933yXs> ejfBZ;
    public static final java.util.HashMap<C56929yXo, C56929yXo> fARcdN;
    public static final java.util.List<Activity> fetchVPNInfo;
    public static final java.lang.String gEmmrt;
    public static final java.util.HashMap<C56930yXp, C56929yXo> isConnected;
    public static final C56929yXo valueOf;
    public static final java.util.HashMap<C56929yXo, C56929yXo> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Activity> KWHzl() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56933yXs copydefault() {
        return copydefault;
    }

    private yML() {
    }

    static {
        yML yml = new yML();
        OLrzqt = yml;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        yMM.TaskDescription taskDescription = yMM.TaskDescription.copydefault;
        sb.append(taskDescription.EZpvd());
        sb.append('.');
        sb.append(taskDescription.copydefault());
        AhwBna = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        yMM.Application application = yMM.Application.copydefault;
        sb2.append(application.EZpvd());
        sb2.append('.');
        sb2.append(application.copydefault());
        AYXKKw = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        yMM.Activity activity = yMM.Activity.copydefault;
        sb3.append(activity.EZpvd());
        sb3.append('.');
        sb3.append(activity.copydefault());
        djBIcL = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        yMM.ActionBar actionBar = yMM.ActionBar.copydefault;
        sb4.append(actionBar.EZpvd());
        sb4.append('.');
        sb4.append(actionBar.copydefault());
        gEmmrt = sb4.toString();
        C56929yXo.ActionBar actionBar2 = C56929yXo.AEQbTJ;
        C56929yXo c56929yXoKWHzl = actionBar2.KWHzl(new C56933yXs("kotlin.jvm.functions.FunctionN"));
        EZpvd = c56929yXoKWHzl;
        copydefault = c56929yXoKWHzl.AEQbTJ();
        C56934yXt c56934yXt = C56934yXt.QOLQEE;
        valueOf = c56934yXt.AkhnZx();
        AEQbTJ = c56934yXt.AYXKKw();
        KWHzl = yml.AEQbTJ(java.lang.Class.class);
        DbNXlk = new java.util.HashMap<>();
        isConnected = new java.util.HashMap<>();
        AkhnZx = new java.util.HashMap<>();
        ejfBZ = new java.util.HashMap<>();
        values = new java.util.HashMap<>();
        fARcdN = new java.util.HashMap<>();
        C56929yXo c56929yXoKWHzl2 = actionBar2.KWHzl(yMB.Application.zuBGHE);
        Activity activity2 = new Activity(yml.AEQbTJ(java.lang.Iterable.class), c56929yXoKWHzl2, new C56929yXo(c56929yXoKWHzl2.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.finit, c56929yXoKWHzl2.OLrzqt()), false));
        C56929yXo c56929yXoKWHzl3 = actionBar2.KWHzl(yMB.Application.AxsJAY);
        Activity activity3 = new Activity(yml.AEQbTJ(java.util.Iterator.class), c56929yXoKWHzl3, new C56929yXo(c56929yXoKWHzl3.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.fFgQHt, c56929yXoKWHzl3.OLrzqt()), false));
        C56929yXo c56929yXoKWHzl4 = actionBar2.KWHzl(yMB.Application.fIwbmz);
        Activity activity4 = new Activity(yml.AEQbTJ(java.util.Collection.class), c56929yXoKWHzl4, new C56929yXo(c56929yXoKWHzl4.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.fZBcTu, c56929yXoKWHzl4.OLrzqt()), false));
        C56929yXo c56929yXoKWHzl5 = actionBar2.KWHzl(yMB.Application.RcXXUw);
        Activity activity5 = new Activity(yml.AEQbTJ(java.util.List.class), c56929yXoKWHzl5, new C56929yXo(c56929yXoKWHzl5.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.dxcTrN, c56929yXoKWHzl5.OLrzqt()), false));
        C56929yXo c56929yXoKWHzl6 = actionBar2.KWHzl(yMB.Application.DarRvM);
        Activity activity6 = new Activity(yml.AEQbTJ(java.util.Set.class), c56929yXoKWHzl6, new C56929yXo(c56929yXoKWHzl6.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.fvQaOB, c56929yXoKWHzl6.OLrzqt()), false));
        C56929yXo c56929yXoKWHzl7 = actionBar2.KWHzl(yMB.Application.UeEOUB);
        Activity activity7 = new Activity(yml.AEQbTJ(java.util.ListIterator.class), c56929yXoKWHzl7, new C56929yXo(c56929yXoKWHzl7.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.gasjUx, c56929yXoKWHzl7.OLrzqt()), false));
        C56933yXs c56933yXs = yMB.Application.dNCPSb;
        C56929yXo c56929yXoKWHzl8 = actionBar2.KWHzl(c56933yXs);
        Activity activity8 = new Activity(yml.AEQbTJ(java.util.Map.class), c56929yXoKWHzl8, new C56929yXo(c56929yXoKWHzl8.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.giSNqX, c56929yXoKWHzl8.OLrzqt()), false));
        C56929yXo c56929yXoEZpvd = actionBar2.KWHzl(c56933yXs).EZpvd(yMB.Application.aKErDB.OLrzqt());
        java.util.List<Activity> listGEmmrt = yDY.gEmmrt(activity2, activity3, activity4, activity5, activity6, activity7, activity8, new Activity(yml.AEQbTJ(Map.Entry.class), c56929yXoEZpvd, new C56929yXo(c56929yXoEZpvd.OLrzqt(), C56931yXq.AEQbTJ(yMB.Application.gGvvIC, c56929yXoEZpvd.OLrzqt()), false)));
        fetchVPNInfo = listGEmmrt;
        yml.KWHzl(java.lang.Object.class, yMB.Application.isConnected);
        yml.KWHzl(java.lang.String.class, yMB.Application.DCJXGO);
        yml.KWHzl(java.lang.CharSequence.class, yMB.Application.AuCTel);
        yml.OLrzqt(java.lang.Throwable.class, yMB.Application.OuxcSI);
        yml.KWHzl(java.lang.Cloneable.class, yMB.Application.fJNWhG);
        yml.KWHzl(java.lang.Number.class, yMB.Application.iRxXKY);
        yml.OLrzqt(java.lang.Comparable.class, yMB.Application.iwGUEr);
        yml.KWHzl(java.lang.Enum.class, yMB.Application.valueOf);
        yml.OLrzqt(java.lang.annotation.Annotation.class, yMB.Application.AkhnZx);
        java.util.Iterator<Activity> it = listGEmmrt.iterator();
        while (it.hasNext()) {
            OLrzqt.OLrzqt(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            yML yml2 = OLrzqt;
            C56929yXo.ActionBar actionBar3 = C56929yXo.AEQbTJ;
            C56933yXs wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            Intrinsics.checkNotNullExpressionValue(wrapperFqName, "");
            C56929yXo c56929yXoKWHzl9 = actionBar3.KWHzl(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "");
            yml2.copydefault(c56929yXoKWHzl9, actionBar3.KWHzl(yMB.copydefault(primitiveType)));
        }
        for (C56929yXo c56929yXo : C56637yMt.EZpvd.copydefault()) {
            OLrzqt.copydefault(C56929yXo.AEQbTJ.KWHzl(new C56933yXs("kotlin.jvm.internal." + c56929yXo.AYXKKw().AEQbTJ() + "CompanionObject")), c56929yXo.EZpvd(C56938yXx.EZpvd));
        }
        for (int i = 0; i < 23; i++) {
            yML yml3 = OLrzqt;
            yml3.copydefault(C56929yXo.AEQbTJ.KWHzl(new C56933yXs("kotlin.jvm.functions.Function" + i)), yMB.OLrzqt(i));
            yml3.copydefault(new C56933yXs(AYXKKw + i), valueOf);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            yMM.ActionBar actionBar4 = yMM.ActionBar.copydefault;
            OLrzqt.copydefault(new C56933yXs((actionBar4.EZpvd() + '.' + actionBar4.copydefault()) + i2), valueOf);
        }
        yML yml4 = OLrzqt;
        yml4.copydefault(yMB.Application.flVtFt.djBIcL(), yml4.AEQbTJ(java.lang.Void.class));
    }

    public static final class Activity {
        public final C56929yXo AEQbTJ;
        public final C56929yXo EZpvd;
        public final C56929yXo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56929yXo copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.AEQbTJ + ", kotlinReadOnly=" + this.KWHzl + ", kotlinMutable=" + this.EZpvd + ')';
        }

        public Activity(@NotNull C56929yXo c56929yXo, @NotNull C56929yXo c56929yXo2, @NotNull C56929yXo c56929yXo3) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            Intrinsics.checkNotNullParameter(c56929yXo2, "");
            Intrinsics.checkNotNullParameter(c56929yXo3, "");
            this.AEQbTJ = c56929yXo;
            this.KWHzl = c56929yXo2;
            this.EZpvd = c56929yXo3;
        }
    }

    public final C56929yXo KWHzl(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return DbNXlk.get(c56933yXs.AYXKKw());
    }

    public final C56929yXo AEQbTJ(@NotNull C56930yXp c56930yXp) {
        Intrinsics.checkNotNullParameter(c56930yXp, "");
        if (!copydefault(c56930yXp, AhwBna) && !copydefault(c56930yXp, djBIcL)) {
            if (!copydefault(c56930yXp, AYXKKw) && !copydefault(c56930yXp, gEmmrt)) {
                return isConnected.get(c56930yXp);
            }
            return valueOf;
        }
        return EZpvd;
    }

    public final boolean copydefault(C56930yXp c56930yXp, java.lang.String str) {
        java.lang.Integer intOrNull;
        java.lang.String strKWHzl = c56930yXp.KWHzl();
        if (!C59449zhJ.startsWith$default(strKWHzl, str, false, 2, null)) {
            return false;
        }
        java.lang.String strSubstring = strKWHzl.substring(str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return (StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) strSubstring, '0', false, 2, (java.lang.Object) null) || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strSubstring)) == null || intOrNull.intValue() < 23) ? false : true;
    }

    public final void OLrzqt(Activity activity) {
        C56929yXo c56929yXoCopydefault = activity.copydefault();
        C56929yXo c56929yXoOLrzqt = activity.OLrzqt();
        C56929yXo c56929yXoEZpvd = activity.EZpvd();
        copydefault(c56929yXoCopydefault, c56929yXoOLrzqt);
        copydefault(c56929yXoEZpvd.AEQbTJ(), c56929yXoCopydefault);
        values.put(c56929yXoEZpvd, c56929yXoOLrzqt);
        fARcdN.put(c56929yXoOLrzqt, c56929yXoEZpvd);
        C56933yXs c56933yXsAEQbTJ = c56929yXoOLrzqt.AEQbTJ();
        C56933yXs c56933yXsAEQbTJ2 = c56929yXoEZpvd.AEQbTJ();
        AkhnZx.put(c56929yXoEZpvd.AEQbTJ().AYXKKw(), c56933yXsAEQbTJ);
        ejfBZ.put(c56933yXsAEQbTJ.AYXKKw(), c56933yXsAEQbTJ2);
    }

    public final void copydefault(C56929yXo c56929yXo, C56929yXo c56929yXo2) {
        EZpvd(c56929yXo, c56929yXo2);
        copydefault(c56929yXo2.AEQbTJ(), c56929yXo);
    }

    public final void KWHzl(java.lang.Class<?> cls, C56930yXp c56930yXp) {
        OLrzqt(cls, c56930yXp.djBIcL());
    }

    public final void OLrzqt(java.lang.Class<?> cls, C56933yXs c56933yXs) {
        copydefault(AEQbTJ(cls), C56929yXo.AEQbTJ.KWHzl(c56933yXs));
    }

    public final void EZpvd(C56929yXo c56929yXo, C56929yXo c56929yXo2) {
        DbNXlk.put(c56929yXo.AEQbTJ().AYXKKw(), c56929yXo2);
    }

    public final void copydefault(C56933yXs c56933yXs, C56929yXo c56929yXo) {
        isConnected.put(c56933yXs.AYXKKw(), c56929yXo);
    }

    public final C56933yXs KWHzl(C56930yXp c56930yXp) {
        return AkhnZx.get(c56930yXp);
    }

    public final C56933yXs EZpvd(C56930yXp c56930yXp) {
        return ejfBZ.get(c56930yXp);
    }

    public final boolean copydefault(C56930yXp c56930yXp) {
        return AkhnZx.containsKey(c56930yXp);
    }

    public final boolean OLrzqt(C56930yXp c56930yXp) {
        return ejfBZ.containsKey(c56930yXp);
    }

    public final C56929yXo AEQbTJ(java.lang.Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
            java.lang.String canonicalName = cls.getCanonicalName();
            Intrinsics.checkNotNullExpressionValue(canonicalName, "");
            return actionBar.KWHzl(new C56933yXs(canonicalName));
        }
        C56929yXo c56929yXoAEQbTJ = AEQbTJ(declaringClass);
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(cls.getSimpleName());
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return c56929yXoAEQbTJ.EZpvd(c56935yXuAEQbTJ);
    }
}
