package o;

import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.DomainsUtils;
import com.okinc.network.okg.dns.WebViewConfig;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.log.NetEventAnalysisParamProxy;
import com.okinc.network.okg.log.NetEventData;
import com.okinc.okuser.data.Token;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43292rmY {
    public static Function1<? super java.lang.Integer, java.lang.Boolean> AYXKKw;
    public static boolean AkhnZx;
    public static Function1<? super NetworkStringEnum, java.lang.String> AwvSrB;
    public static yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> AxsJAY;
    public static boolean DTwDnp;
    public static boolean DbNXlk;
    public static android.app.Application EZpvd;
    public static java.lang.String KWHzl;
    public static yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> copydefault;
    public static boolean djBIcL;
    public static Function1<? super java.lang.String, Unit> ejfBZ;
    public static volatile boolean fARcdN;
    public static java.lang.String fIwbmz;
    public static Function2<? super Interceptor.Chain, ? super Request.Builder, Unit> gEmmrt;
    public static Function2<? super java.lang.String, ? super java.util.ArrayList<NetEventAnalysisParamProxy>, Unit> gHZMYf;
    public static boolean getFieldNames;
    public static yHO<? super java.lang.Throwable, ? super java.util.Map<java.lang.String, java.lang.String>, ? super java.lang.Boolean, Unit> isConnected;
    public static boolean sSMYrx;
    public static java.util.Map<java.lang.String, java.lang.String> valueOf;
    public static Function0<Unit> zLjUOn;
    public static Function2<? super java.lang.String, ? super java.lang.String, Unit> zsXlph;
    public static boolean zuBGHE;
    public static final C43292rmY OLrzqt = new C43292rmY();
    public static java.lang.String values = "";
    public static java.lang.String QOLQEE = "";
    public static java.lang.String OcIXYQ = "";
    public static java.util.Map<java.lang.String, java.lang.String> AuCTelauCTel = new LinkedHashMap();
    public static boolean fetchVPNInfo = true;
    public static boolean AhwBna = true;
    public static boolean AubY = true;
    public static WebViewConfig ORxRYg = new WebViewConfig(null, null, null, 7, null);
    public static boolean uzCIH = true;
    public static final java.util.HashSet<java.lang.String> wlaJM = new java.util.HashSet<>();
    public static Function1<? super NetEventData, Unit> getNewProxyInstance = new Function1() { // from class: o.rmU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C43292rmY.KWHzl((NetEventData) obj);
        }
    };
    public static Function1<? super NetEventData, Unit> hDKMBd = new Function1() { // from class: o.rmW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C43292rmY.copydefault((NetEventData) obj);
        }
    };
    public static final InterfaceC56387yDm<InterfaceC47278tmy> fJNWhG = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rmZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43292rmY.gEmmrt();
        }
    });
    public static final java.lang.Object iwGUEr = new java.lang.Object();
    public static final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.rnd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C43292rmY.copydefault());
        }
    });
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull WebViewConfig webViewConfig) {
        Intrinsics.checkNotNullParameter(webViewConfig, "");
        ORxRYg = webViewConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function1<? super NetEventData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        hDKMBd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yht) {
        copydefault = yht;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        uzCIH = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean>, kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> */
    public final Function1<java.lang.Integer, java.lang.Boolean> AYXKKw() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.ArrayList<com.okinc.network.okg.log.NetEventAnalysisParamProxy>, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.util.ArrayList<com.okinc.network.okg.log.NetEventAnalysisParamProxy>, kotlin.Unit> */
    public final Function2<java.lang.String, java.util.ArrayList<NetEventAnalysisParamProxy>, Unit> AubY() {
        return gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAY() {
        return OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super java.lang.String, Unit> function1) {
        ejfBZ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        zsXlph = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(yHO<? super java.lang.Throwable, ? super java.util.Map<java.lang.String, java.lang.String>, ? super java.lang.Boolean, Unit> yho) {
        isConnected = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        AubY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super NetEventData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        getNewProxyInstance = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function2<? super java.lang.String, ? super java.util.ArrayList<NetEventAnalysisParamProxy>, Unit> function2) {
        gHZMYf = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super NetworkStringEnum, java.lang.String> function1) {
        AwvSrB = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function2<? super Interceptor.Chain, ? super Request.Builder, Unit> function2) {
        gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        AxsJAY = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ORxRYg() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QKVWgx() {
        return DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QOLQEE() {
        return fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        fIwbmz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        zLjUOn = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        getFieldNames = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL() {
        valueOf = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        DTwDnp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fARcdN() {
        return fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.network.okg.log.NetEventData, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.network.okg.log.NetEventData, kotlin.Unit> */
    public final Function1<NetEventData, Unit> fIwbmz() {
        return hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super okhttp3.Interceptor$Chain, ? super okhttp3.Request$Builder, kotlin.Unit>, kotlin.jvm.functions.Function2<okhttp3.Interceptor$Chain, okhttp3.Request$Builder, kotlin.Unit> */
    public final Function2<Interceptor.Chain, Request.Builder, Unit> fetchVPNInfo() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        zuBGHE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf() {
        return sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getNewProxyInstance() {
        return zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.network.okg.log.NetEventData, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.network.okg.log.NetEventData, kotlin.Unit> */
    public final Function1<NetEventData, Unit> hDKMBd() {
        return getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super java.lang.Throwable, ? super java.util.Map<java.lang.String, java.lang.String>, ? super java.lang.Boolean, kotlin.Unit>, o.yHO<java.lang.Throwable, java.util.Map<java.lang.String, java.lang.String>, java.lang.Boolean, kotlin.Unit> */
    public final yHO<java.lang.Throwable, java.util.Map<java.lang.String, java.lang.String>, java.lang.Boolean, Unit> isConnected() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewConfig sSMYrx() {
        return ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> */
    public final Function2<java.lang.String, java.lang.String, Unit> uzCIH() {
        return zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit>, o.yHT<java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit> */
    public final yHT<java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, Unit> valueOf() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        sSMYrx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> values() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashSet<java.lang.String> wlaJM() {
        return wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> zLjUOn() {
        return AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.network.okg.config.NetworkStringEnum, java.lang.String>, kotlin.jvm.functions.Function1<com.okinc.network.okg.config.NetworkStringEnum, java.lang.String> */
    public final Function1<NetworkStringEnum, java.lang.String> zsXlph() {
        return AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return QOLQEE;
    }

    private C43292rmY() {
    }

    public final void copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AuCTelauCTel.clear();
        AuCTelauCTel.putAll(map);
    }

    public static final Unit KWHzl(NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(netEventData, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(NetEventData netEventData) {
        Intrinsics.checkNotNullParameter(netEventData, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        valueOf = C56423yEv.EZpvd(C56390yDp.OLrzqt(str, str2));
    }

    public static final InterfaceC47278tmy gEmmrt() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public final InterfaceC47278tmy AwvSrB() {
        return fJNWhG.getValue();
    }

    public final boolean OcIXYQ() {
        return ((java.lang.Boolean) AuCTel.getValue()).booleanValue();
    }

    public static final boolean copydefault() {
        return C43467rpo.EZpvd.copydefault();
    }

    public final void AEQbTJ(@NotNull android.app.Application application, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, java.util.ArrayList<Interceptor> arrayList) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (DbNXlk) {
            return;
        }
        DbNXlk = true;
        EZpvd = application;
        AkhnZx = z;
        KWHzl(str, str2, str4);
        OLrzqt(z, arrayList);
        C43396roW.EZpvd().OLrzqt(application);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rmY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initWithChains$default(C43292rmY c43292rmY, android.app.Application application, java.util.List list, Triple triple, boolean z, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            triple = new Triple(null, null, null);
        }
        Triple triple2 = triple;
        if ((i & 8) != 0) {
            z = false;
        }
        c43292rmY.KWHzl(application, list, triple2, z, (i & 16) != 0 ? null : arrayList);
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return (str == null || str.length() == 0) ? str2 : str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rmY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addCommonInterceptor$default(C43292rmY c43292rmY, boolean z, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        c43292rmY.OLrzqt(z, arrayList);
    }

    public final void OLrzqt(final boolean z, final java.util.ArrayList<Interceptor> arrayList) {
        C43282rmO c43282rmO = C43282rmO.OLrzqt;
        c43282rmO.KWHzl(new Function1() { // from class: o.rmV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43292rmY.EZpvd(z, arrayList, (C43286rmS) obj);
            }
        });
        C43398roY.copydefault.AEQbTJ(c43282rmO.OLrzqt());
    }

    public static final Unit EZpvd(boolean z, java.util.ArrayList arrayList, C43286rmS c43286rmS) {
        Intrinsics.checkNotNullParameter(c43286rmS, "");
        if (z || C34703nhO.EZpvd().booleanValue()) {
            c43286rmS.KWHzl(new C6879aXh());
        }
        if (OLrzqt.OcIXYQ()) {
            c43286rmS.KWHzl(new C6877aXf());
        }
        c43286rmS.KWHzl(new C6886aXo());
        c43286rmS.KWHzl(new C43334rnN(DohTypeEnum.HTTP));
        c43286rmS.KWHzl(new C6881aXj());
        c43286rmS.KWHzl(new C6880aXi());
        c43286rmS.KWHzl(new C6897aXz(0L, 1, null));
        c43286rmS.KWHzl(C6851aXF.EZpvd);
        c43286rmS.KWHzl(new C6882aXk());
        c43286rmS.KWHzl(new C6876aXe(new Function0() { // from class: o.rmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43292rmY.OLrzqt();
            }
        }));
        c43286rmS.KWHzl(new C6847aXB(fJNWhG));
        c43286rmS.KWHzl(new C6894aXw());
        if (z && arrayList != null) {
            pUU.KWHzl("OKNetworkConfig", " --- Add network debug interceptor begin --- ");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Interceptor interceptor = (Interceptor) it.next();
                pUU.KWHzl("OKNetworkConfig", "Add network debug interceptor: " + interceptor);
                c43286rmS.OLrzqt(interceptor);
            }
            pUU.KWHzl("OKNetworkConfig", " +++ Add network debug interceptor end +++ ");
        }
        return Unit.INSTANCE;
    }

    public static final Token OLrzqt() {
        return OLrzqt.AwvSrB().AhwBna();
    }

    public static /* synthetic */ void updateUrl$default(C43292rmY c43292rmY, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c43292rmY.KWHzl(str, str2, str3);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        values = str;
        java.lang.String strEZpvd = C43372rnz.copydefault.EZpvd(DohTypeEnum.HTTP);
        boolean z = false;
        if (AkhnZx && !StringsKt__StringsKt.contains$default((java.lang.CharSequence) values, (java.lang.CharSequence) strEZpvd, false, 2, (java.lang.Object) null)) {
            z = true;
        }
        fARcdN = z;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            Intrinsics.copydefault((java.lang.Object) str2);
            QOLQEE = str2;
        }
        if (str3 != null && C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            OcIXYQ = str3;
        }
        DTwDnp();
    }

    public final void DTwDnp() {
        synchronized (iwGUEr) {
            yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho = AxsJAY;
            if (yho != null) {
                yho.invoke(values, QOLQEE, OcIXYQ);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final android.content.Context DbNXlk() {
        android.app.Application application = EZpvd;
        return application != null ? application : C32979mnm.EZpvd.OLrzqt();
    }

    public final void KWHzl(@NotNull android.app.Application application, @NotNull java.util.List<DoHChain> list, @NotNull Triple<java.lang.String, java.lang.String, java.lang.String> triple, boolean z, java.util.ArrayList<Interceptor> arrayList) {
        java.lang.String strKWHzl = "";
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(triple, "");
        if (DbNXlk) {
            return;
        }
        DbNXlk = true;
        EZpvd = application;
        AkhnZx = z;
        java.lang.String strKWHzl2 = "";
        java.lang.String strKWHzl3 = strKWHzl2;
        for (DoHChain doHChain : list) {
            DomainsUtils domainsUtils = DomainsUtils.INSTANCE;
            if (Intrinsics.EZpvd(doHChain, domainsUtils.getOkxHttpMain())) {
                strKWHzl = OLrzqt.KWHzl(triple.getFirst(), doHChain.getHolder().toString());
            } else if (Intrinsics.EZpvd(doHChain, domainsUtils.getOkxWsV5())) {
                strKWHzl2 = OLrzqt.KWHzl(triple.getSecond(), doHChain.getHolder().toString());
            } else if (Intrinsics.EZpvd(doHChain, domainsUtils.getWeb3WsDex())) {
                strKWHzl3 = OLrzqt.KWHzl(triple.getThird(), doHChain.getHolder().toString());
            }
        }
        KWHzl(strKWHzl, strKWHzl2, strKWHzl3);
        OLrzqt(z, arrayList);
        C43396roW.EZpvd().OLrzqt(application);
    }

    public final void copydefault(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                wlaJM.add((java.lang.String) it.next());
            }
        }
    }
}
