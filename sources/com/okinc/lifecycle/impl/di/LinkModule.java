package com.okinc.lifecycle.impl.di;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.gson.Gson;
import com.okinc.components.track.ABTestManager;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.lifecycle.impl.di.LinkModule;
import com.okinc.modular.deeplinkv2.LinkSource;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43238rlX;
import o.C33129mqd;
import o.C34703nhO;
import o.C38064pKx;
import o.C38080pLm;
import o.C38083pLp;
import o.C38085pLr;
import o.C38086pLs;
import o.C38087pLt;
import o.C38095pMa;
import o.C38102pMh;
import o.C38103pMi;
import o.C38104pMj;
import o.C38105pMk;
import o.C38111pMq;
import o.C38112pMr;
import o.C38115pMu;
import o.C38116pMv;
import o.C38119pMy;
import o.C43239rlY;
import o.C43251rlk;
import o.C55328xhq;
import o.C56424yEw;
import o.C56524yIo;
import o.C59449zhJ;
import o.InterfaceC33171mrS;
import o.InterfaceC33174mrV;
import o.InterfaceC33253msv;
import o.InterfaceC38065pKy;
import o.InterfaceC38081pLn;
import o.InterfaceC38084pLq;
import o.InterfaceC38089pLv;
import o.InterfaceC38091pLx;
import o.InterfaceC38098pMd;
import o.InterfaceC38100pMf;
import o.InterfaceC38101pMg;
import o.InterfaceC38106pMl;
import o.InterfaceC38110pMp;
import o.InterfaceC38113pMs;
import o.InterfaceC38114pMt;
import o.InterfaceC38117pMw;
import o.InterfaceC38118pMx;
import o.InterfaceC38164pOp;
import o.InterfaceC43294rma;
import o.InterfaceC47278tmy;
import o.InterfaceC8104awT;
import o.InterfaceC8106awV;
import o.InterfaceC8108awX;
import o.kOG;
import o.pKH;
import o.pKI;
import o.pLA;
import o.pLC;
import o.pLD;
import o.pLE;
import o.pLH;
import o.pLJ;
import o.pLK;
import o.pLW;
import o.pMA;
import o.pME;
import o.pMF;
import o.pMI;
import o.pMJ;
import o.pMK;
import o.pML;
import o.pMM;
import o.pMU;
import o.pMV;
import o.pMX;
import o.pUU;
import o.yCR;
import o.yDV;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LinkModule {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public final InterfaceC38081pLn KWHzl(@NotNull C38086pLs c38086pLs) {
        Intrinsics.checkNotNullParameter(c38086pLs, "");
        return c38086pLs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @yCR
    public final InterfaceC38084pLq KWHzl(@NotNull C38085pLr c38085pLr) {
        Intrinsics.checkNotNullParameter(c38085pLr, "");
        return c38085pLr;
    }

    @yCR
    public final pMM AhwBna() {
        return new pMJ();
    }

    @yCR
    public final pMV EZpvd(@NotNull pMM pmm) {
        Intrinsics.checkNotNullParameter(pmm, "");
        return new pMU(pmm);
    }

    @yCR
    public final CoroutineScope values() {
        String name = LinkModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return CoroutineScopeKt.CoroutineScope(new CoroutineName(name).plus(Dispatchers.getMain()));
    }

    @yCR
    public final InterfaceC38089pLv AEQbTJ(@NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        return new C38087pLt(interfaceC33171mrS, C43239rlY.AEQbTJ, oKComplianceRestrictionService);
    }

    @yCR
    public final pLH AEQbTJ(@NotNull pLC plc) {
        Intrinsics.checkNotNullParameter(plc, "");
        return new pLJ(plc, new Function1() { // from class: o.pNH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LinkModule.valueOf((java.lang.String) obj);
            }
        });
    }

    public static final String valueOf(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String host = new URL(str).getHost();
            Intrinsics.checkNotNullExpressionValue(host, "");
            String lowerCase = host.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return lowerCase;
        } catch (Exception unused) {
            return str;
        }
    }

    @yCR
    public final InterfaceC38101pMg OLrzqt(@NotNull pMV pmv, @NotNull pMX pmx, @NotNull C38064pKx c38064pKx, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull InterfaceC38089pLv interfaceC38089pLv, @NotNull InterfaceC38118pMx interfaceC38118pMx, @NotNull InterfaceC38114pMt interfaceC38114pMt, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(c38064pKx, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(interfaceC38089pLv, "");
        Intrinsics.checkNotNullParameter(interfaceC38118pMx, "");
        Intrinsics.checkNotNullParameter(interfaceC38114pMt, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        return new C38103pMi(pmx, pmv, c38064pKx, interfaceC38081pLn, interfaceC38084pLq, interfaceC38089pLv, interfaceC38118pMx, interfaceC38114pMt, new Function1() { // from class: o.pNw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LinkModule.gEmmrt((java.lang.String) obj);
            }
        }, new Function2() { // from class: o.pND
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LinkModule.valueOf((java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function0() { // from class: o.pNC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(LinkModule.AYXKKw());
            }
        }, interfaceC47278tmy);
    }

    public static final Unit gEmmrt(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl(str, str2);
        return Unit.INSTANCE;
    }

    public static final boolean AYXKKw() {
        return C34703nhO.copydefault();
    }

    @yCR
    public final InterfaceC38110pMp copydefault(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        return new C38111pMq(oKComplianceRestrictionService, new Function0() { // from class: o.pNE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(LinkModule.KWHzl());
            }
        });
    }

    public static final boolean KWHzl() {
        InterfaceC33174mrV interfaceC33174mrV;
        List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33174mrV.class));
        return (listKWHzl == null || (interfaceC33174mrV = (InterfaceC33174mrV) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || !interfaceC33174mrV.copydefault()) ? false : true;
    }

    @yCR
    public final pMA KWHzl(@NotNull InterfaceC33171mrS interfaceC33171mrS) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        return new pMF(interfaceC33171mrS, (pKH) C43251rlk.OLrzqt(pKH.class));
    }

    @yCR
    public final InterfaceC38113pMs OLrzqt(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull pMK pmk, @NotNull InterfaceC33253msv interfaceC33253msv) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(pmk, "");
        Intrinsics.checkNotNullParameter(interfaceC33253msv, "");
        return new C38112pMr(interfaceC47278tmy, pmk, interfaceC33253msv);
    }

    @yCR
    public final InterfaceC38118pMx AkhnZx() {
        return new C38115pMu(new Function0() { // from class: o.pNz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(LinkModule.gEmmrt());
            }
        }, new Function0() { // from class: o.pNy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(LinkModule.djBIcL());
            }
        });
    }

    public static final boolean gEmmrt() {
        return C34703nhO.copydefault();
    }

    public static final boolean djBIcL() {
        return C34703nhO.AEQbTJ();
    }

    public static final Unit djBIcL(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        return Unit.INSTANCE;
    }

    @yCR
    public final C38080pLm fetchVPNInfo() {
        return new C38080pLm(new Function1() { // from class: o.pNK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LinkModule.djBIcL((java.lang.String) obj);
            }
        });
    }

    @yCR
    public final C38083pLp EZpvd(@NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38065pKy interfaceC38065pKy) {
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38065pKy, "");
        return new C38083pLp(interfaceC38081pLn, interfaceC38065pKy);
    }

    public static final boolean OLrzqt(LinkModule linkModule, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return linkModule.DbNXlk(str);
    }

    @yCR
    public final InterfaceC38117pMw AEQbTJ(@NotNull InterfaceC38106pMl interfaceC38106pMl) {
        Intrinsics.checkNotNullParameter(interfaceC38106pMl, "");
        return new C38116pMv(interfaceC38106pMl, new Function1() { // from class: o.pNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(LinkModule.OLrzqt(this.KWHzl, (java.lang.String) obj));
            }
        });
    }

    @yCR
    public final InterfaceC38106pMl fJNWhG() {
        return new C38105pMk(pLW.Companion.copydefault());
    }

    @yCR
    public final InterfaceC38091pLx EZpvd(@NotNull InterfaceC38117pMw interfaceC38117pMw, @NotNull pLH plh) {
        Intrinsics.checkNotNullParameter(interfaceC38117pMw, "");
        Intrinsics.checkNotNullParameter(plh, "");
        return new pLA(interfaceC38117pMw, plh);
    }

    @yCR
    public final InterfaceC38114pMt copydefault(@NotNull InterfaceC38084pLq interfaceC38084pLq) {
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        return new C38119pMy(interfaceC38084pLq, new Function1() { // from class: o.pNO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LinkModule.AYXKKw((java.lang.String) obj);
            }
        }, new yHO() { // from class: o.pNv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return LinkModule.OLrzqt((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final String AYXKKw(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((CharSequence) CollectionsKt___CollectionsKt.AuCTelauCTel(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"?"}, false, 0, 6, (Object) null)), new String[]{"://"}, false, 0, 6, (Object) null));
    }

    public static final String OLrzqt(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C59449zhJ.replace$default(str, "://" + str2, "://" + str3, false, 4, (Object) null);
    }

    @yCR
    public final pLE AEQbTJ(@NotNull InterfaceC38101pMg interfaceC38101pMg, @NotNull InterfaceC38098pMd interfaceC38098pMd, @NotNull InterfaceC38100pMf interfaceC38100pMf, @NotNull InterfaceC38118pMx interfaceC38118pMx, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull CoroutineScope coroutineScope, @NotNull InterfaceC38091pLx interfaceC38091pLx, @NotNull C38064pKx c38064pKx) {
        Intrinsics.checkNotNullParameter(interfaceC38101pMg, "");
        Intrinsics.checkNotNullParameter(interfaceC38098pMd, "");
        Intrinsics.checkNotNullParameter(interfaceC38100pMf, "");
        Intrinsics.checkNotNullParameter(interfaceC38118pMx, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(interfaceC38091pLx, "");
        Intrinsics.checkNotNullParameter(c38064pKx, "");
        return new pLK(interfaceC38101pMg, interfaceC38098pMd, interfaceC38100pMf, interfaceC38084pLq, interfaceC38081pLn, interfaceC38118pMx, coroutineScope, interfaceC38091pLx, c38064pKx, new Function2() { // from class: o.pNx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LinkModule.OLrzqt((java.lang.String) obj, (java.util.Map) obj2);
            }
        }, new Function2() { // from class: o.pNA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LinkModule.djBIcL((java.lang.String) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final String OLrzqt(String str, Map map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), C33129mqd.gEmmrt(entry.getValue()));
        }
        String string = builderBuildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final Unit djBIcL(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl(str, str2);
        return Unit.INSTANCE;
    }

    @yCR
    public final InterfaceC38100pMf KWHzl(@NotNull pMV pmv, @NotNull pMX pmx, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull InterfaceC38089pLv interfaceC38089pLv, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(interfaceC38089pLv, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        return new C38102pMh(pmv, pmx, interfaceC38089pLv, interfaceC38084pLq, interfaceC38081pLn, C43239rlY.AEQbTJ, new Function2() { // from class: o.pNB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LinkModule.AhwBna((java.lang.String) obj, (java.lang.String) obj2);
            }
        }, interfaceC47278tmy);
    }

    public static final Unit AhwBna(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl(str, str2);
        return Unit.INSTANCE;
    }

    @yCR
    public final C38104pMj copydefault(@NotNull InterfaceC38091pLx interfaceC38091pLx, @NotNull final pMM pmm, @NotNull pMV pmv) {
        Intrinsics.checkNotNullParameter(interfaceC38091pLx, "");
        Intrinsics.checkNotNullParameter(pmm, "");
        Intrinsics.checkNotNullParameter(pmv, "");
        return new C38104pMj(pmv, interfaceC38091pLx, new Function1() { // from class: o.pNG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LinkModule.EZpvd(pmm, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(pMM pmm, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (pmm.copydefault() != null) {
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            Context contextCopydefault = pmm.copydefault();
            Intrinsics.copydefault(contextCopydefault);
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, contextCopydefault, str, C56424yEw.KWHzl(), LinkSource.UNKNOWN_APP_LINK_HANDLER, false, new Function1() { // from class: o.pNF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LinkModule.KWHzl((AbstractC43238rlX) obj);
                }
            }, 16, null);
        } else {
            pUU.copydefault("UnknownAppLinkProcessor Failed to process deeplink - deeplink");
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @yCR
    public final InterfaceC38098pMd AEQbTJ(@NotNull pMV pmv, @NotNull pMX pmx, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull InterfaceC38089pLv interfaceC38089pLv, @NotNull kOG kog, pKI pki, @NotNull C38104pMj c38104pMj, @NotNull pLH plh, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(interfaceC38089pLv, "");
        Intrinsics.checkNotNullParameter(kog, "");
        Intrinsics.checkNotNullParameter(c38104pMj, "");
        Intrinsics.checkNotNullParameter(plh, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        return new C38095pMa(interfaceC38084pLq, pmv, pmx, interfaceC38081pLn, interfaceC38089pLv, C43239rlY.AEQbTJ, kog, pki, c38104pMj, plh, new Function1() { // from class: o.pNL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(LinkModule.KWHzl(this.OLrzqt, (java.lang.String) obj));
            }
        }, new Function2() { // from class: o.pNI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LinkModule.EZpvd((java.lang.String) obj, (java.lang.String) obj2);
            }
        }, interfaceC47278tmy);
    }

    public static final boolean KWHzl(LinkModule linkModule, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return linkModule.DbNXlk(str);
    }

    public static final Unit EZpvd(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl(str, str2);
        return Unit.INSTANCE;
    }

    @yCR
    public final pMI AEQbTJ(@NotNull InterfaceC38106pMl interfaceC38106pMl, @NotNull InterfaceC38101pMg interfaceC38101pMg, @NotNull pLC plc) {
        Intrinsics.checkNotNullParameter(interfaceC38106pMl, "");
        Intrinsics.checkNotNullParameter(interfaceC38101pMg, "");
        Intrinsics.checkNotNullParameter(plc, "");
        return new pME(interfaceC38106pMl, interfaceC38101pMg, plc);
    }

    @yCR
    public final InterfaceC38164pOp isConnected() {
        return InterfaceC38164pOp.Companion.AEQbTJ();
    }

    public final boolean DbNXlk(String str) {
        try {
            Locale locale = new Locale(str);
            String iSO3Language = locale.getISO3Language();
            Intrinsics.checkNotNullExpressionValue(iSO3Language, "");
            if (iSO3Language.length() > 0 && (Intrinsics.EZpvd((Object) locale.getLanguage(), (Object) str) || Intrinsics.EZpvd(locale.getLanguage(), CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null))))) {
                return true;
            }
            Locale[] availableLocales = Locale.getAvailableLocales();
            Intrinsics.checkNotNullExpressionValue(availableLocales, "");
            return yDV.valueOf(availableLocales, locale);
        } catch (Exception unused) {
            String[] iSOCountries = Locale.getISOCountries();
            Intrinsics.checkNotNullExpressionValue(iSOCountries, "");
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String upperCase = str.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return yDV.valueOf(iSOCountries, upperCase);
        }
    }

    @yCR
    public final pMK valueOf() {
        return new pML((InterfaceC8108awX) C43251rlk.OLrzqt(InterfaceC8108awX.class), (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class), (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class));
    }

    @yCR
    public final pLC DbNXlk() {
        return new pLD(new Function1() { // from class: o.pNs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LinkModule.AhwBna((java.lang.String) obj);
            }
        }, new Gson());
    }

    public static final String AhwBna(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.gEmmrt(ABTestManager.getPayload$default(ABTestManager.AEQbTJ, str, null, 2, null));
    }
}
