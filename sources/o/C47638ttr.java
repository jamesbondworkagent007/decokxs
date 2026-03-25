package o;

import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47638ttr;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ttr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47638ttr {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final C47638ttr EZpvd;
    public final Application AEQbTJ;
    public final Application KWHzl;
    public final Application OLrzqt;
    public final Application copydefault;
    public final Application gEmmrt;
    public final Application valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47638ttr copy$default(C47638ttr c47638ttr, Application application, Application application2, Application application3, Application application4, Application application5, Application application6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            application = c47638ttr.OLrzqt;
        }
        if ((i & 2) != 0) {
            application2 = c47638ttr.valueOf;
        }
        Application application7 = application2;
        if ((i & 4) != 0) {
            application3 = c47638ttr.gEmmrt;
        }
        Application application8 = application3;
        if ((i & 8) != 0) {
            application4 = c47638ttr.KWHzl;
        }
        Application application9 = application4;
        if ((i & 16) != 0) {
            application5 = c47638ttr.AEQbTJ;
        }
        Application application10 = application5;
        if ((i & 32) != 0) {
            application6 = c47638ttr.copydefault;
        }
        return c47638ttr.EZpvd(application, application7, application8, application9, application10, application6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47638ttr EZpvd(@NotNull Application application, @NotNull Application application2, @NotNull Application application3, @NotNull Application application4, @NotNull Application application5, @NotNull Application application6) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(application2, "");
        Intrinsics.checkNotNullParameter(application3, "");
        Intrinsics.checkNotNullParameter(application4, "");
        Intrinsics.checkNotNullParameter(application5, "");
        Intrinsics.checkNotNullParameter(application6, "");
        return new C47638ttr(application, application2, application3, application4, application5, application6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47638ttr)) {
            return false;
        }
        C47638ttr c47638ttr = (C47638ttr) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c47638ttr.OLrzqt) && Intrinsics.EZpvd(this.valueOf, c47638ttr.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c47638ttr.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, c47638ttr.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c47638ttr.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c47638ttr.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderboardOrderConfig(articles=" + this.OLrzqt + ", orbiters=" + this.valueOf + ", traders=" + this.gEmmrt + ", groups=" + this.KWHzl + ", following=" + this.AEQbTJ + ", latestNews=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application valueOf() {
        return this.valueOf;
    }

    public C47638ttr(@NotNull Application application, @NotNull Application application2, @NotNull Application application3, @NotNull Application application4, @NotNull Application application5, @NotNull Application application6) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(application2, "");
        Intrinsics.checkNotNullParameter(application3, "");
        Intrinsics.checkNotNullParameter(application4, "");
        Intrinsics.checkNotNullParameter(application5, "");
        Intrinsics.checkNotNullParameter(application6, "");
        this.OLrzqt = application;
        this.valueOf = application2;
        this.gEmmrt = application3;
        this.KWHzl = application4;
        this.AEQbTJ = application5;
        this.copydefault = application6;
    }

    /* JADX INFO: renamed from: o.ttr$Application */
    public static final class Application {
        public final int EZpvd;
        public final int OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, int i, int i2, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = application.OLrzqt;
            }
            if ((i3 & 2) != 0) {
                i2 = application.EZpvd;
            }
            if ((i3 & 4) != 0) {
                z = application.copydefault;
            }
            return application.AEQbTJ(i, i2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(int i, int i2, boolean z) {
            return new Application(i, i2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.OLrzqt == application.OLrzqt && this.EZpvd == application.EZpvd && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SectionConfig(index=" + this.OLrzqt + ", number=" + this.EZpvd + ", enable=" + this.copydefault + ")";
        }

        public Application(int i, int i2, boolean z) {
            this.OLrzqt = i;
            this.EZpvd = i2;
            this.copydefault = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(int, int, boolean):void (m)] (LINE:34) call: o.ttr.Application.<init>(int, int, boolean):void type: THIS */
        public /* synthetic */ Application(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? true : z);
        }
    }

    public final boolean AEQbTJ(@NotNull C47638ttr c47638ttr) {
        Intrinsics.checkNotNullParameter(c47638ttr, "");
        return this.AEQbTJ.KWHzl() == c47638ttr.AEQbTJ.KWHzl() && this.OLrzqt.KWHzl() == c47638ttr.OLrzqt.KWHzl() && this.valueOf.KWHzl() == c47638ttr.valueOf.KWHzl() && this.gEmmrt.KWHzl() == c47638ttr.gEmmrt.KWHzl() && this.KWHzl.KWHzl() == c47638ttr.KWHzl.KWHzl() && this.copydefault.KWHzl() == c47638ttr.copydefault.KWHzl();
    }

    public final java.lang.String gEmmrt() {
        return "order: " + CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.EZpvd(yDY.gEmmrt(C56390yDp.OLrzqt("following", this.AEQbTJ), C56390yDp.OLrzqt("articles", this.OLrzqt), C56390yDp.OLrzqt("orbiters", this.valueOf), C56390yDp.OLrzqt("traders", this.gEmmrt), C56390yDp.OLrzqt("groups", this.KWHzl), C56390yDp.OLrzqt("latestNews", this.copydefault)), new Activity()), " ", null, null, 0, null, new Function1() { // from class: o.ttp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47638ttr.copydefault((kotlin.Pair) obj);
            }
        }, 30, null);
    }

    public static final java.lang.CharSequence copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.component1();
        Application application = (Application) pair.component2();
        return "[" + application.KWHzl() + "]" + str + ContainerUtils.KEY_VALUE_DELIMITER + application.OLrzqt() + ",enable=" + application.AEQbTJ();
    }

    public final boolean djBIcL() {
        return (this.gEmmrt.AEQbTJ() || this.valueOf.AEQbTJ() || this.OLrzqt.AEQbTJ() || this.AEQbTJ.AEQbTJ() || this.KWHzl.AEQbTJ() || this.copydefault.AEQbTJ()) ? false : true;
    }

    /* JADX INFO: renamed from: o.ttr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ttr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean AEQbTJ(int i) {
            return i >= 0;
        }

        public static final boolean OLrzqt(int i) {
            return i > 0;
        }

        private StateListAnimator() {
        }

        public final C47638ttr copydefault() {
            return C47638ttr.EZpvd;
        }

        public final C47638ttr OLrzqt(JSONObject jSONObject) {
            if (jSONObject == null) {
                return copydefault();
            }
            try {
                return AEQbTJ(parseSection$default(this, jSONObject.optJSONObject("following"), 0, 10, false, 8, null), parseSection$default(this, jSONObject.optJSONObject("articles"), 1, 3, false, 8, null), parseSection$default(this, jSONObject.optJSONObject("orbiters"), 2, 5, false, 8, null), parseSection$default(this, jSONObject.optJSONObject("traders"), 4, 2, false, 8, null), parseSection$default(this, jSONObject.optJSONObject("groups"), 5, 1, false, 8, null), parseSection$default(this, jSONObject.optJSONObject("news"), 3, 3, false, 8, null));
            } catch (java.lang.Exception unused) {
                return copydefault();
            }
        }

        public final C47638ttr AEQbTJ(Application application, Application application2, Application application3, Application application4, Application application5, Application application6) {
            int i = 0;
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(yDY.gEmmrt(new Triple("following", application, 0), new Triple("articles", application2, 1), new Triple("orbiters", application3, 2), new Triple("traders", application4, 4), new Triple("groups", application5, 5), new Triple("news", application6, 3)), yET.OLrzqt(new Function1() { // from class: o.ttq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47638ttr.StateListAnimator.OLrzqt((Triple) obj);
                }
            }, new Function1() { // from class: o.tts
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C47638ttr.StateListAnimator.AEQbTJ((Triple) obj);
                }
            }));
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (java.lang.Object obj : listEZpvd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                Triple triple = (Triple) obj;
                java.lang.String str = (java.lang.String) triple.component1();
                Application application7 = (Application) triple.component2();
                arrayList.add(C56390yDp.OLrzqt(str, new Application(i, application7.OLrzqt(), application7.AEQbTJ())));
                i++;
            }
            java.util.Map mapCopydefault = C56424yEw.copydefault(arrayList);
            java.lang.Object obj2 = mapCopydefault.get("following");
            Intrinsics.copydefault(obj2);
            Application application8 = (Application) obj2;
            java.lang.Object obj3 = mapCopydefault.get("articles");
            Intrinsics.copydefault(obj3);
            Application application9 = (Application) obj3;
            java.lang.Object obj4 = mapCopydefault.get("orbiters");
            Intrinsics.copydefault(obj4);
            Application application10 = (Application) obj4;
            java.lang.Object obj5 = mapCopydefault.get("traders");
            Intrinsics.copydefault(obj5);
            Application application11 = (Application) obj5;
            java.lang.Object obj6 = mapCopydefault.get("groups");
            Intrinsics.copydefault(obj6);
            java.lang.Object obj7 = mapCopydefault.get("news");
            Intrinsics.copydefault(obj7);
            return new C47638ttr(application9, application10, application11, (Application) obj6, application8, (Application) obj7);
        }

        public static final java.lang.Comparable AEQbTJ(Triple triple) {
            Intrinsics.checkNotNullParameter(triple, "");
            return (java.lang.Comparable) triple.getThird();
        }

        public static final java.lang.Comparable OLrzqt(Triple triple) {
            Intrinsics.checkNotNullParameter(triple, "");
            return java.lang.Integer.valueOf(((Application) triple.getSecond()).KWHzl());
        }

        public static /* synthetic */ Application parseSection$default(StateListAnimator stateListAnimator, JSONObject jSONObject, int i, int i2, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 8) != 0) {
                z = true;
            }
            return stateListAnimator.OLrzqt(jSONObject, i, i2, z);
        }

        public final Application OLrzqt(JSONObject jSONObject, int i, int i2, boolean z) {
            if (jSONObject == null) {
                return new Application(i, i2, z);
            }
            int iKWHzl = KWHzl(jSONObject, "index", i, new Function1() { // from class: o.ttu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C47638ttr.StateListAnimator.AEQbTJ(((java.lang.Integer) obj).intValue()));
                }
            });
            int iKWHzl2 = KWHzl(jSONObject, DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, i2, new Function1() { // from class: o.ttv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C47638ttr.StateListAnimator.OLrzqt(((java.lang.Integer) obj).intValue()));
                }
            });
            if (jSONObject.has("enable")) {
                z = KWHzl(jSONObject);
            }
            return new Application(iKWHzl, iKWHzl2, z);
        }

        public final int KWHzl(JSONObject jSONObject, java.lang.String str, int i, Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
            try {
                java.lang.Object objOpt = jSONObject.opt(str);
                if (objOpt == null) {
                    return i;
                }
                int iIntValue = objOpt instanceof java.lang.Number ? ((java.lang.Number) objOpt).intValue() : C33129mqd.AhwBna(objOpt.toString());
                return function1.invoke(java.lang.Integer.valueOf(iIntValue)).booleanValue() ? iIntValue : i;
            } catch (java.lang.Throwable unused) {
                return i;
            }
        }

        public final boolean KWHzl(JSONObject jSONObject) {
            try {
                java.lang.Object objOpt = jSONObject.opt("enable");
                if (objOpt == null) {
                    return true;
                }
                if (objOpt instanceof java.lang.Boolean) {
                    return ((java.lang.Boolean) objOpt).booleanValue();
                }
                java.lang.String lowerCase = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) objOpt.toString()).toString().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "false") && !Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "0")) {
                    if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "true")) {
                        Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "1");
                    }
                    return true;
                }
                return false;
            } catch (java.lang.Throwable unused) {
                return true;
            }
        }
    }

    static {
        int i = 4;
        EZpvd = new C47638ttr(new Application(1, 3, false, i, null), new Application(2, 5, false, 4, null), new Application(i, 2, false, 4, null), new Application(5, 1, false, 4, null), new Application(0, 10, false, 4, null), new Application(3, 3, false, 4, null));
    }

    /* JADX INFO: renamed from: o.ttr$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((Application) ((kotlin.Pair) t).component2()).KWHzl()), java.lang.Integer.valueOf(((Application) ((kotlin.Pair) t2).component2()).KWHzl()));
        }
    }
}
