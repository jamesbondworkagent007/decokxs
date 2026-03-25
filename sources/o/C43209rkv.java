package o;

import com.okinc.mlnservice.sse.GrowthSSEBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.rkv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43209rkv {
    public static volatile java.lang.String AEQbTJ;
    public static volatile InterfaceC58217yxC OLrzqt;
    public static volatile int copydefault;
    public static volatile InterfaceC7835arN djBIcL;
    public static volatile InterfaceC7835arN gEmmrt;
    public static final C43209rkv EZpvd = new C43209rkv();
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.rky
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43209rkv.KWHzl();
        }
    });
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return copydefault;
    }

    private C43209rkv() {
    }

    public static final android.os.Handler KWHzl() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final android.os.Handler gEmmrt() {
        return (android.os.Handler) AhwBna.getValue();
    }

    public final void AEQbTJ(@NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            valueOf();
            gEmmrt = interfaceC7835arN;
            djBIcL = interfaceC7835arN2;
            AEQbTJ = EZpvd(str, AEQbTJ(map));
            C43167rkF c43167rkF = new C43167rkF();
            java.lang.String str2 = AEQbTJ;
            AbstractC58247yxg abstractC58247yxgObserveOn = C43167rkF.openAsObservable$default(c43167rkF, str2 == null ? str : str2, null, null, 6, null).subscribeOn(yBP.AEQbTJ()).observeOn(yBP.AEQbTJ());
            final Function1 function1 = new Function1() { // from class: o.rkx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43209rkv.OLrzqt((InterfaceC58217yxC) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgDoOnSubscribe = abstractC58247yxgObserveOn.doOnSubscribe(new InterfaceC58227yxM() { // from class: o.rkw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C43209rkv.AEQbTJ(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.rkD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43209rkv.AEQbTJ((GrowthSSEBean) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rkC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C43209rkv.EZpvd(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.rkz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43209rkv.copydefault((java.lang.Throwable) obj);
                }
            };
            OLrzqt = abstractC58247yxgDoOnSubscribe.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rkB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C43209rkv.gEmmrt(function13, obj);
                }
            }, new InterfaceC58222yxH() { // from class: o.rkA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    C43209rkv.EZpvd();
                }
            });
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(InterfaceC58217yxC interfaceC58217yxC) {
        EZpvd.copydefault(1, "");
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(GrowthSSEBean growthSSEBean) {
        java.lang.String event = growthSSEBean.getEvent();
        if (event == null) {
            event = "";
        }
        java.lang.String id = growthSSEBean.getId();
        if (id == null) {
            id = "";
        }
        java.lang.String data = growthSSEBean.getData();
        if (data == null) {
            data = "";
        }
        if (C59449zhJ.gEmmrt(event, "connected", true)) {
            EZpvd.copydefault(2, "");
        }
        EZpvd.OLrzqt(event, id, data);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        C43209rkv c43209rkv = EZpvd;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c43209rkv.copydefault(3, message);
        c43209rkv.valueOf();
        return Unit.INSTANCE;
    }

    public static final void EZpvd() {
        C43209rkv c43209rkv = EZpvd;
        c43209rkv.copydefault(4, "");
        c43209rkv.valueOf();
    }

    public final void AYXKKw() {
        synchronized (this) {
            valueOf();
            copydefault(4, "");
        }
    }

    public final boolean AhwBna() {
        InterfaceC58217yxC interfaceC58217yxC = OLrzqt;
        return (interfaceC58217yxC == null || interfaceC58217yxC.isDisposed()) ? false : true;
    }

    public final void valueOf() {
        try {
            InterfaceC58217yxC interfaceC58217yxC = OLrzqt;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        } catch (java.lang.Throwable unused) {
        }
        OLrzqt = null;
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        gEmmrt().post(new java.lang.Runnable() { // from class: o.rkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C43209rkv.EZpvd(str, str2, str3);
            }
        });
    }

    public static final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            InterfaceC7835arN interfaceC7835arN = gEmmrt;
            if (interfaceC7835arN != null) {
                interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaString.copydefault(str2), LuaString.copydefault(str3));
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void OLrzqt(final int i, final java.lang.String str) {
        gEmmrt().post(new java.lang.Runnable() { // from class: o.rkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C43209rkv.EZpvd(i, str);
            }
        });
    }

    public static final void EZpvd(int i, java.lang.String str) {
        try {
            InterfaceC7835arN interfaceC7835arN = djBIcL;
            if (interfaceC7835arN != null) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = LuaNumber.valueOf(i);
                objArr[1] = (str == null || str.length() == 0) ? LuaValue.Nil() : LuaString.copydefault(str);
                interfaceC7835arN.EZpvd(objArr);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void copydefault(int i, java.lang.String str) {
        if (copydefault != i) {
            copydefault = i;
            OLrzqt(i, str);
        }
    }

    public final java.lang.String EZpvd(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        HttpUrl httpUrl;
        if (map == null || map.isEmpty() || (httpUrl = HttpUrl.Companion.parse(str)) == null) {
            return str;
        }
        HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
        for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key.length() > 0) {
                builderNewBuilder.addQueryParameter(key, value);
            }
        }
        return builderNewBuilder.build().toString();
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ(java.lang.Object obj) {
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (key != null && value != null) {
                    linkedHashMap.put(key.toString(), value.toString());
                }
            }
            return linkedHashMap;
        }
        return C56424yEw.KWHzl();
    }
}
