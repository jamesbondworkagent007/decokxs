package o;

import com.immomo.mls.InitData;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC7340ahw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.riA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43056riA {
    public static final C43056riA AEQbTJ = new C43056riA();
    public static final java.util.Map<java.lang.String, Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.Boolean>> KWHzl = new LinkedHashMap();
    public static final int EZpvd = 8;

    private C43056riA() {
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull Function2<? super android.content.Context, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        KWHzl.put(str, function2);
    }

    /* JADX INFO: renamed from: o.riA$Activity */
    public static final class Activity implements InterfaceC7340ahw {
        public final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> EZpvd;
        public final /* synthetic */ android.content.Context KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        public Activity(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.lang.String str) {
            this.KWHzl = context;
            this.EZpvd = map;
            this.OLrzqt = str;
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            android.content.Intent intent = new android.content.Intent(this.KWHzl, (java.lang.Class<?>) C43056riA.AEQbTJ.copydefault(this.EZpvd));
            InitData initDataCopydefault = C7327ahj.copydefault(C7788aqT.AEQbTJ().AEQbTJ(this.KWHzl, "MLNRouter.lua"));
            Intrinsics.checkNotNullExpressionValue(initDataCopydefault, "");
            if (initDataCopydefault.KWHzl == null) {
                initDataCopydefault.KWHzl = new java.util.HashMap();
            }
            java.util.HashMap map = initDataCopydefault.KWHzl;
            if (map != null) {
                java.lang.String str = this.OLrzqt;
                java.util.Map<java.lang.String, java.lang.Object> map2 = this.EZpvd;
                map.put("to", str);
                if (map2 != null) {
                    map.putAll(map2);
                }
            }
            intent.putExtras(C7327ahj.OLrzqt(initDataCopydefault));
            this.KWHzl.startActivity(intent);
        }
    }

    public final void KWHzl(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C43082ria.copydefault(applicationContext, new Activity(context, map, str));
    }

    /* JADX INFO: renamed from: o.riA$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC7340ahw {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> copydefault;

        public StateListAnimator(java.util.Map<java.lang.String, ? extends java.lang.Object> map, android.content.Context context, java.lang.String str) {
            this.copydefault = map;
            this.AEQbTJ = context;
            this.OLrzqt = str;
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            C43056riA c43056riA = C43056riA.AEQbTJ;
            android.content.Intent intent = new android.content.Intent(this.AEQbTJ, (java.lang.Class<?>) c43056riA.copydefault(this.copydefault));
            intent.putExtras(c43056riA.AEQbTJ(this.AEQbTJ, this.OLrzqt, this.copydefault));
            this.AEQbTJ.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void enterLua$default(C43056riA c43056riA, android.content.Context context, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        c43056riA.KWHzl(context, str, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C43082ria.copydefault(applicationContext, new StateListAnimator(map, context, str));
    }

    /* JADX INFO: renamed from: o.riA$Application */
    public static final class Application implements InterfaceC7340ahw {
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        public Application(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            this.EZpvd = context;
            this.OLrzqt = str;
            this.KWHzl = map;
        }

        @Override // o.InterfaceC7340ahw
        public void EZpvd(java.lang.Throwable th) {
            InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
        }

        @Override // o.InterfaceC7340ahw
        public void OLrzqt() {
            android.content.Intent intent = new android.content.Intent(this.EZpvd, (java.lang.Class<?>) ActivityC43071riP.class);
            intent.putExtras(C43056riA.AEQbTJ.AEQbTJ(this.EZpvd, this.OLrzqt, this.KWHzl));
            this.EZpvd.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void presentLua$default(C43056riA c43056riA, android.content.Context context, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        c43056riA.copydefault(context, str, map);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C43082ria.copydefault(applicationContext, new Application(context, str, map));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ android.os.Bundle createInitData$default(C43056riA c43056riA, android.content.Context context, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return c43056riA.AEQbTJ(context, str, map);
    }

    public final android.os.Bundle AEQbTJ(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.HashMap map2;
        InitData initDataCopydefault = C7327ahj.copydefault(C7788aqT.AEQbTJ().AEQbTJ(context, str));
        Intrinsics.checkNotNullExpressionValue(initDataCopydefault, "");
        if (initDataCopydefault.KWHzl == null) {
            initDataCopydefault.KWHzl = new java.util.HashMap();
        }
        if (map != null && (map2 = initDataCopydefault.KWHzl) != null) {
            map2.putAll(map);
        }
        android.os.Bundle bundleOLrzqt = C7327ahj.OLrzqt(initDataCopydefault);
        Intrinsics.checkNotNullExpressionValue(bundleOLrzqt, "");
        return bundleOLrzqt;
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.HashMap map2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.Boolean> function2 = KWHzl.get(map.get("appid"));
        if (function2 == null || !function2.invoke(context, map).booleanValue()) {
            InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
            if (interfaceC7298ahGKWHzl != null) {
                interfaceC7298ahGKWHzl.AEQbTJ("openDeepLink", null, map);
            }
            android.content.Intent intent = new android.content.Intent(context, copydefault(map));
            InitData initDataCopydefault = C7327ahj.copydefault("");
            Intrinsics.checkNotNullExpressionValue(initDataCopydefault, "");
            initDataCopydefault.KWHzl();
            if (initDataCopydefault.KWHzl == null) {
                initDataCopydefault.KWHzl = new java.util.HashMap();
            }
            java.util.HashMap map3 = initDataCopydefault.KWHzl;
            if (map3 != null) {
                map3.putAll(map);
            }
            if (map.containsKey("pageurl") && (map2 = initDataCopydefault.KWHzl) != null) {
                java.lang.Object obj = map.get("pageurl");
                Intrinsics.copydefault(obj, "");
                map2.put("pageurl", URLEncoder.encode((java.lang.String) obj, com.google.android.exoplayer2.C.UTF8_NAME));
            }
            intent.putExtras(C7327ahj.OLrzqt(initDataCopydefault));
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitData createInitDataForMiniApp$default(C43056riA c43056riA, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return c43056riA.EZpvd(str, str2, map);
    }

    public final InitData EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InitData initDataCopydefault = C7327ahj.copydefault("");
        Intrinsics.checkNotNullExpressionValue(initDataCopydefault, "");
        initDataCopydefault.KWHzl();
        if (initDataCopydefault.KWHzl == null) {
            initDataCopydefault.KWHzl = new java.util.HashMap();
        }
        java.util.HashMap map2 = initDataCopydefault.KWHzl;
        if (map2 != null) {
            map2.put("appid", str);
            map2.put("pageurl", str2);
            if (map != null) {
                map2.putAll(map);
            }
        }
        return initDataCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ android.os.Bundle createExtrasForMiniApp$default(C43056riA c43056riA, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return c43056riA.OLrzqt(str, str2, map);
    }

    public final android.os.Bundle OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.os.Bundle bundleOLrzqt = C7327ahj.OLrzqt(EZpvd(str, str2, map));
        Intrinsics.checkNotNullExpressionValue(bundleOLrzqt, "");
        return bundleOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigateToMiniApp$default(C43056riA c43056riA, android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        c43056riA.copydefault(context, str, str2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Intent intent = new android.content.Intent(context, copydefault(map));
        intent.putExtras(OLrzqt(str, str2, map));
        if (map != null && map.containsKey("IS_SECURE")) {
            java.lang.Object obj = map.get("IS_SECURE");
            Intrinsics.copydefault(obj, "");
            intent.putExtra("IS_SECURE", ((java.lang.Boolean) obj).booleanValue());
        }
        context.startActivity(intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.riA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void presentToMiniApp$default(C43056riA c43056riA, android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        c43056riA.OLrzqt(context, str, str2, map);
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC43071riP.class);
        ActivityC43071riP.Companion.OLrzqt((java.lang.String) (map != null ? map.get("theme") : null));
        intent.putExtras(OLrzqt(str, str2, map));
        context.startActivity(intent);
    }

    public final java.lang.Class<? extends ActivityC43139rje> copydefault(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        ActivityC43139rje.Companion.OLrzqt((java.lang.String) (map != null ? map.get("theme") : null));
        return (map == null || !map.containsKey("translucent")) ? ActivityC43139rje.class : ActivityC43142rjh.class;
    }
}
