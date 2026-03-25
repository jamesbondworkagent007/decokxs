package o;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.okex.center.bean.AssistantConfig;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sfk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44906sfk {
    public static InterfaceC58217yxC AYXKKw;
    public static InterfaceC58217yxC AhwBna;
    public static volatile boolean copydefault;
    public static final C44906sfk OLrzqt = new C44906sfk();
    public static final java.util.List<java.lang.String> EZpvd = new java.util.ArrayList();
    public static final java.lang.Object KWHzl = new java.lang.Object();
    public static final int AEQbTJ = 8;

    private C44906sfk() {
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        boolean zContains;
        boolean zContains2;
        Intrinsics.checkNotNullParameter(str, "");
        if (copydefault) {
            synchronized (KWHzl) {
                zContains2 = EZpvd.contains(str);
            }
            return zContains2;
        }
        synchronized (KWHzl) {
            if (!copydefault) {
                C44906sfk c44906sfk = OLrzqt;
                c44906sfk.EZpvd("cache not init,start local cache===");
                c44906sfk.AEQbTJ();
            }
            zContains = EZpvd.contains(str);
        }
        return zContains;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strJoinToString$default;
        java.lang.String strJoinToString$default2;
        if (copydefault) {
            synchronized (KWHzl) {
                java.util.ArrayList arrayList = new java.util.ArrayList(EZpvd);
                strJoinToString$default2 = arrayList.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
            }
            return strJoinToString$default2;
        }
        synchronized (KWHzl) {
            if (!copydefault) {
                C44906sfk c44906sfk = OLrzqt;
                c44906sfk.EZpvd("cache not init,start local cache===");
                c44906sfk.AEQbTJ();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(EZpvd);
            strJoinToString$default = arrayList2.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null);
        }
        return strJoinToString$default;
    }

    public final void KWHzl() {
        EZpvd("start synFeatures===");
        InterfaceC58217yxC interfaceC58217yxC = AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(InterfaceC44921sfz.Companion.AEQbTJ().KWHzl(CacheStrategy.FIRST_NETWORK, Integer.MAX_VALUE), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.sfu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44906sfk.OLrzqt((AssistantConfig) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.sfr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C44906sfk.fetchVPNInfo(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.sfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44906sfk.djBIcL((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.sfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C44906sfk.DbNXlk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(abstractC58185ywXDjBIcL);
        final Function1 function13 = new Function1() { // from class: o.sfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44906sfk.EZpvd((java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.sfg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C44906sfk.AkhnZx(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.sfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44906sfk.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        AhwBna = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.sfn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C44906sfk.isConnected(function14, obj);
            }
        });
    }

    public static final java.lang.Boolean fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean OLrzqt(AssistantConfig assistantConfig) {
        Intrinsics.checkNotNullParameter(assistantConfig, "");
        java.util.List<java.lang.String> features = assistantConfig.getFeatures();
        if (features == null) {
            features = yDY.AhwBna();
        }
        OLrzqt.AEQbTJ(features);
        return java.lang.Boolean.TRUE;
    }

    public static final java.lang.Boolean DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean djBIcL(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C44906sfk c44906sfk = OLrzqt;
        c44906sfk.EZpvd("synFeatures failed " + th.getMessage() + "===");
        c44906sfk.AEQbTJ();
        return java.lang.Boolean.FALSE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Boolean bool) {
        AhwBna = null;
        OLrzqt.EZpvd("synFeatures success===");
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        AhwBna = null;
        OLrzqt.EZpvd("synFeatures failed===");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(InterfaceC44921sfz.Companion.AEQbTJ().KWHzl(CacheStrategy.ONLY_CACHE, Integer.MAX_VALUE), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.sfh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44906sfk.EZpvd((AssistantConfig) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.sfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C44906sfk.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(abstractC58185ywXAEQbTJ);
        final Function1 function12 = new Function1() { // from class: o.sfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44906sfk.AEQbTJ((Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.sfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C44906sfk.valueOf(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.sfm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44906sfk.EZpvd((java.lang.Throwable) obj);
            }
        };
        AYXKKw = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.sft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C44906sfk.djBIcL(function13, obj);
            }
        });
    }

    public static final Unit gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit EZpvd(AssistantConfig assistantConfig) {
        Intrinsics.checkNotNullParameter(assistantConfig, "");
        java.util.List<java.lang.String> features = assistantConfig.getFeatures();
        if (features == null) {
            features = yDY.AhwBna();
        }
        OLrzqt.AEQbTJ(features);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Unit unit) {
        AYXKKw = null;
        OLrzqt.EZpvd("load Features cache success===");
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        AYXKKw = null;
        OLrzqt.EZpvd("load Features cache failed===");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.util.List<java.lang.String> list) {
        synchronized (KWHzl) {
            java.util.List<java.lang.String> list2 = EZpvd;
            list2.clear();
            if (C33129mqd.KWHzl((java.util.Collection) list)) {
                list2.addAll(list);
            }
            copydefault = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void EZpvd(java.lang.String str) {
        if (C52762wXk.copydefault()) {
            pUU.EZpvd("SupportAssistantFeaturesHelper", str);
        }
    }
}
