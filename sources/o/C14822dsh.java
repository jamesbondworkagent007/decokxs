package o;

import androidx.activity.ComponentActivity;
import com.just.agentweb.DefaultWebClient;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.app.DiscoverDeeplinkHandler$executeDeeplink$2;
import com.okinc.business.defi.dapp.app.DiscoverDeeplinkHandler$executeDeeplink$3;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C14822dsh;
import o.InterfaceC43294rma;
import o.xWA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dsh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14822dsh implements InterfaceC43234rlT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final android.os.Handler EZpvd = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: o.dsh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dsh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.content.Context context, Function0<Unit> function0) {
            xWA xwa;
            Intrinsics.checkNotNullParameter(context, "");
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
            if (listKWHzl == null || (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
                return;
            }
            xWA.StateListAnimator.openDappPage$default(xwa, context, null, null, 6, null);
        }

        public final void KWHzl(@NotNull android.content.Context context, final Function0<Unit> function0) {
            InterfaceC9775bbu interfaceC9775bbu;
            Intrinsics.checkNotNullParameter(context, "");
            java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
            if (listKWHzl == null || (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
                return;
            }
            interfaceC9775bbu.AEQbTJ(context, java.lang.Integer.valueOf(C9768bbn.OLrzqt), C56424yEw.KWHzl(), new Function0() { // from class: o.dsq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14822dsh.StateListAnimator.AEQbTJ(function0);
                }
            });
        }

        public static final Unit AEQbTJ(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull final android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull final java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.util.List listKWHzl;
        xWA xwa;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        C15142dyj c15142dyj = C15142dyj.EZpvd;
        if (c15142dyj.KWHzl().isEmpty()) {
            C15142dyj.getRegexJson$default(c15142dyj, null, 1, null);
        }
        if (interfaceC43233rlS instanceof C14829dso) {
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) ((C14829dso) interfaceC43233rlS).OLrzqt(), (java.lang.CharSequence) "dapp/appmini", false, 2, (java.lang.Object) null)) {
                this.EZpvd.postDelayed(new java.lang.Runnable() { // from class: o.dsn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14822dsh.OLrzqt(map, this, context);
                    }
                }, 500L);
                return;
            }
            return;
        }
        if (interfaceC43233rlS instanceof C14832dsr) {
            if (!Intrinsics.EZpvd(map.get("page"), (java.lang.Object) "boost") || (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class))) == null || (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null || !xwa.KWHzl()) {
                if (((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new DiscoverDeeplinkHandler$executeDeeplink$2(null), 1, null)).booleanValue()) {
                    return;
                }
                Companion.copydefault(context, null);
                return;
            }
            Companion.KWHzl(context, null);
            return;
        }
        if ((interfaceC43233rlS instanceof C14824dsj) || (interfaceC43233rlS instanceof C14830dsp)) {
            if (((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new DiscoverDeeplinkHandler$executeDeeplink$3(null), 1, null)).booleanValue()) {
                return;
            }
            this.EZpvd.postDelayed(new java.lang.Runnable() { // from class: o.dsm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C14822dsh.KWHzl(this.AEQbTJ, context, map);
                }
            }, 800L);
        } else if (interfaceC43233rlS instanceof C14823dsi) {
            Companion.KWHzl(context, null);
        }
    }

    public static final void KWHzl(C14822dsh c14822dsh, android.content.Context context, java.util.Map map) {
        c14822dsh.EZpvd(context, map);
    }

    public final void AEQbTJ(android.content.Context context, android.os.Bundle bundle) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        for (java.lang.String str : setKeySet) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                map.put(str, obj);
            }
        }
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/home", map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    public final void EZpvd(final android.content.Context context, final java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        if (map.get("dappUrl") == null) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        java.lang.Object obj = map.get("dappUrl");
        Intrinsics.copydefault(obj, "");
        ?? r0 = (java.lang.String) obj;
        objectRef.element = r0;
        try {
            objectRef.element = URLDecoder.decode((java.lang.String) r0, "utf-8");
        } catch (java.lang.Exception unused) {
        }
        java.lang.String str = (java.lang.String) objectRef.element;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!C59449zhJ.startsWith$default(lowerCase, "http", false, 2, null)) {
            objectRef.element = DefaultWebClient.HTTPS_SCHEME + objectRef.element;
        }
        C15142dyj.EZpvd.OLrzqt((java.lang.String) objectRef.element, new Function1() { // from class: o.dsk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C14822dsh.KWHzl(context, map, objectRef, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(android.content.Context context, java.util.Map map, Ref.ObjectRef objectRef, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, str, null, new Function1() { // from class: o.dsl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14822dsh.copydefault((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else {
            java.lang.String string = map.get("subdomainstrategy") == null ? SubdomainStrategy.Global.INSTANCE.toString() : C33129mqd.gEmmrt(map.get("subdomainstrategy"));
            if (context instanceof AbstractActivityC33041mov) {
                C14923duc c14923duc = C14923duc.EZpvd;
                java.lang.String str2 = (java.lang.String) objectRef.element;
                c14923duc.AEQbTJ((ComponentActivity) context, c14923duc.copydefault(new DappSearchResultBean((java.lang.String) null, java.lang.Integer.parseInt("5"), str2, "0", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "Unknown", str2, false, (java.util.List) null, 0L, 3697, (DefaultConstructorMarker) null)), (20992 & 4) != 0 ? null : null, (20992 & 8) != 0 ? null : null, (Function0<Unit>) ((20992 & 16) != 0 ? null : null), (20992 & 32) != 0 ? false : true, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc.isConnected() : null), (20992 & 128) != 0, (20992 & 256) != 0 ? false : false, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : string, (20992 & 2048) != 0 ? "" : "deeplink", (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (20992 & 16384) != 0 ? null : null, (20992 & 32768) != 0 ? null : null);
            } else if (C54819xWm.KWHzl().AEQbTJ() instanceof ComponentActivity) {
                C14923duc c14923duc2 = C14923duc.EZpvd;
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                Intrinsics.copydefault(activityAEQbTJ, "");
                java.lang.String str3 = (java.lang.String) objectRef.element;
                c14923duc2.AEQbTJ((ComponentActivity) activityAEQbTJ, c14923duc2.copydefault(new DappSearchResultBean((java.lang.String) null, java.lang.Integer.parseInt("5"), str3, "0", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "Unknown", str3, false, (java.util.List) null, 0L, 3697, (DefaultConstructorMarker) null)), (20992 & 4) != 0 ? null : null, (20992 & 8) != 0 ? null : null, (Function0<Unit>) ((20992 & 16) != 0 ? null : null), (20992 & 32) != 0 ? false : true, (java.util.List<DappChains>) ((20992 & 64) != 0 ? c14923duc2.isConnected() : null), (20992 & 128) != 0, (20992 & 256) != 0 ? false : false, (Function1<? super PlatformItem, Unit>) ((20992 & 512) != 0 ? null : null), (20992 & 1024) != 0 ? SubdomainStrategy.Global.INSTANCE.toString() : string, (20992 & 2048) != 0 ? "" : "deeplink", (Function1<? super androidx.fragment.app.Fragment, Unit>) ((20992 & 4096) != 0 ? null : null), (20992 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (20992 & 16384) != 0 ? null : null, (20992 & 32768) != 0 ? null : null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(java.util.Map map, C14822dsh c14822dsh, android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        android.os.Bundle bundleEZpvd = C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]));
        bundleEZpvd.putString("jumpType", "jump");
        c14822dsh.AEQbTJ(context, bundleEZpvd);
    }
}
