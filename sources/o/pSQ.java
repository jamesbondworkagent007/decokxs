package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.localization.report.LocalizationReportApi;
import com.okinc.localization.report.LocalizationReportData;
import com.okinc.localization.report.LocalizationReportManager$buildProcessor$1$1;
import com.okinc.localization.report.ReportUsedSource;
import com.okinc.localization.report.SupportType;
import com.okinc.localization.report.db.UsedSourceDataBase;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.processors.PublishProcessor;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pSQ {
    public static boolean AEQbTJ;
    public static long AkhnZx;
    public static volatile yBC<Function0<Unit>> KWHzl;
    public static boolean OLrzqt;
    public static android.app.Application valueOf;
    public static final pSQ copydefault = new pSQ();
    public static java.lang.String AYXKKw = "";
    public static java.lang.String AhwBna = "";
    public static java.lang.String djBIcL = "";
    public static final ConcurrentHashMap<java.lang.String, C38291pTi> DbNXlk = new ConcurrentHashMap<>();
    public static final java.util.Map<java.lang.String, java.lang.String> values = new ConcurrentHashMap();
    public static AtomicBoolean isConnected = new AtomicBoolean(false);
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.pSY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pSQ.gEmmrt();
        }
    });
    public static final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.pSZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pSQ.valueOf();
        }
    });
    public static final java.util.Set<java.lang.String> ejfBZ = new LinkedHashSet();
    public static final int EZpvd = 8;

    public static final void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AuCTel() {
        OLrzqt = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fJNWhG() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.String> isConnected() {
        return ejfBZ;
    }

    private pSQ() {
    }

    public final Gson DbNXlk() {
        return (Gson) gEmmrt.getValue();
    }

    public static final Gson gEmmrt() {
        return new GsonBuilder().create();
    }

    public final PublishProcessor<C38291pTi> AkhnZx() {
        return (PublishProcessor) fetchVPNInfo.getValue();
    }

    public static final PublishProcessor valueOf() {
        return copydefault.AYXKKw();
    }

    public final PublishProcessor<C38291pTi> AYXKKw() {
        PublishProcessor<C38291pTi> publishProcessorIsConnected = PublishProcessor.isConnected();
        AbstractC58185ywX<java.util.List<C38291pTi>> abstractC58185ywXAEQbTJ = publishProcessorIsConnected.AYXKKw().AEQbTJ(pSK.KWHzl.OLrzqt());
        final LocalizationReportManager$buildProcessor$1$1 localizationReportManager$buildProcessor$1$1 = new LocalizationReportManager$buildProcessor$1$1(copydefault);
        abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                pSQ.AhwBna(localizationReportManager$buildProcessor$1$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(publishProcessorIsConnected, "");
        return publishProcessorIsConnected;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull android.app.Application application, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (isConnected.get()) {
            return;
        }
        valueOf = application;
        AhwBna = C32979mnm.EZpvd.EZpvd();
        android.app.Application application2 = valueOf;
        if (application2 == null) {
            Intrinsics.gEmmrt("");
            application2 = null;
        }
        djBIcL = java.lang.String.valueOf(C34703nhO.copydefault(application2));
        AYXKKw = str;
        long jLongValue = SPUtils.getLong("l10n_last_report_time", 0L).longValue();
        AkhnZx = jLongValue;
        if (jLongValue == 0) {
            ejfBZ();
        }
        pUU.KWHzl("LocalizationReportManager", "init --> mLastReportTimeStamp time: " + AkhnZx + ", Thread: " + java.lang.Thread.currentThread());
        copydefault("initQueryExistSource", new Function0() { // from class: o.pTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pSQ.djBIcL();
            }
        });
        isConnected.compareAndSet(false, true);
    }

    public static final Unit djBIcL() {
        copydefault.fIwbmz();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (pSK.KWHzl.copydefault()) {
            return;
        }
        OLrzqt("reportPlaceHolderUsedKey", new Function0() { // from class: o.pST
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pSQ.copydefault(str, str2);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = values.get(str);
        if (str3 != null) {
            copydefault.AEQbTJ(str3, str2, str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void reportUsedKey$default(pSQ psq, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        psq.OLrzqt(str, str2, str3);
    }

    public final void OLrzqt(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        if (pSK.KWHzl.copydefault()) {
            return;
        }
        OLrzqt("reportUsedKey", new Function0() { // from class: o.pTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pSQ.KWHzl(str, str2, str3);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        copydefault.AEQbTJ(str, str2, str3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void reportUsedKeyInternal$default(pSQ psq, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        psq.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pTs.isKeyUseForAndroidOrInvalid$OKLocalization_localization$default(o.pTs, java.lang.String, java.lang.String, int, java.lang.Object):boolean */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (C38301pTs.isKeyUseForAndroidOrInvalid$OKLocalization_localization$default(C38301pTs.OLrzqt, str, null, 2, null)) {
            return;
        }
        if (str3 != null) {
            java.util.Map<java.lang.String, java.lang.String> map = values;
            if (map.containsKey(str3) && map.containsValue(str)) {
                map.remove(str3);
                str4 = str2;
            } else {
                str4 = null;
            }
        }
        if (str2 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "{", false, 2, (java.lang.Object) null)) {
            values.put(str2, str);
        } else {
            OLrzqt(str, SupportType.KEY, str4);
        }
    }

    public final void AEQbTJ(@NotNull java.util.Locale locale, java.util.Locale locale2) {
        java.lang.String strAYXKKw;
        final java.lang.String str = "";
        Intrinsics.checkNotNullParameter(locale, "");
        if (locale2 != null && (strAYXKKw = C38303pTu.AYXKKw(locale2)) != null) {
            str = strAYXKKw;
        }
        final java.lang.String strAYXKKw2 = C38303pTu.AYXKKw(locale);
        if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw2, (java.lang.Object) str)) {
            return;
        }
        pUU.valueOf("LocalizationReportManager", "trackReportLocale, record locale different. currentTag:" + str + ", defaultLocale:" + strAYXKKw2);
        C32866mlf.EZpvd("language_locale_mismatch_in_report", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pSQ.KWHzl(str, strAYXKKw2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "currentTag", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "defaultLocale", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void reportUsedSource$default(pSQ psq, java.lang.String str, SupportType supportType, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        psq.EZpvd(str, supportType, str2);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final SupportType supportType, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(supportType, "");
        if (pSK.KWHzl.copydefault()) {
            return;
        }
        OLrzqt("reportUsedSource", new Function0() { // from class: o.pSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pSQ.KWHzl(str, supportType, str2);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, SupportType supportType, java.lang.String str2) {
        copydefault.OLrzqt(str, supportType, str2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void reportUsedSourceInternal$default(pSQ psq, java.lang.String str, SupportType supportType, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        psq.OLrzqt(str, supportType, str2);
    }

    public final void OLrzqt(java.lang.String str, SupportType supportType, java.lang.String str2) {
        java.lang.String strKWHzl;
        if (AEQbTJ(str) || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        if (str2 != null) {
            pSC psc = pSC.AEQbTJ;
            strKWHzl = psc.KWHzl();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            AEQbTJ(locale, psc.AEQbTJ());
        } else {
            strKWHzl = null;
        }
        C38291pTi c38291pTi = new C38291pTi(supportType.getType(), str, false, AhwBna, str2, strKWHzl, !OLrzqt);
        if (supportType == SupportType.KEY && !OLrzqt) {
            ejfBZ.add(str);
        }
        DbNXlk.put(str, c38291pTi);
        if (isConnected.get()) {
            AkhnZx().onNext(c38291pTi);
        }
    }

    public static /* synthetic */ void reportUsedSourceForRuntimeTracking$default(pSQ psq, java.lang.String str, SupportType supportType, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        psq.copydefault(str, supportType, str2);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull SupportType supportType, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(supportType, "");
        if (!pSK.KWHzl.copydefault() && fJNWhG()) {
            EZpvd(str, supportType, str2);
        }
    }

    public final void fARcdN() {
        int size;
        int iEZpvd;
        C38291pTi c38291pTi;
        try {
            java.util.List<C38291pTi> listAhwBna = AhwBna();
            long jValues = values();
            long j = AkhnZx;
            pSK psk = pSK.KWHzl;
            if (jValues - j <= psk.AEQbTJ() && listAhwBna.size() < psk.EZpvd()) {
                pUU.EZpvd("LocalizationReportManager", "checkForReport() needReport false: " + listAhwBna.size());
                return;
            }
            for (C38291pTi c38291pTi2 : listAhwBna) {
                ConcurrentHashMap<java.lang.String, C38291pTi> concurrentHashMap = DbNXlk;
                if (concurrentHashMap.get(c38291pTi2.AhwBna()) != null && (c38291pTi = concurrentHashMap.get(c38291pTi2.AhwBna())) != null) {
                    c38291pTi.AEQbTJ(true);
                }
            }
            ejfBZ();
            int size2 = listAhwBna.size();
            pSK psk2 = pSK.KWHzl;
            if (size2 % psk2.EZpvd() == 0) {
                size = listAhwBna.size() / psk2.EZpvd();
            } else {
                size = (listAhwBna.size() / psk2.EZpvd()) + 1;
            }
            for (int i = 0; i < size; i++) {
                pSK psk3 = pSK.KWHzl;
                int iEZpvd2 = psk3.EZpvd() * i;
                if (psk3.EZpvd() + iEZpvd2 > listAhwBna.size()) {
                    iEZpvd = listAhwBna.size();
                } else {
                    iEZpvd = psk3.EZpvd() + iEZpvd2;
                }
                KWHzl(listAhwBna.subList(iEZpvd2, iEZpvd));
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("LocalizationReportManager", "reportDataToServer exception: " + e);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.localization.report.LocalizationReportApi.TaskDescription.reportEvents$default(com.okinc.localization.report.LocalizationReportApi, okhttp3.RequestBody, com.okinc.network.okg.cor.SubdomainStrategy, int, java.lang.Object):o.ywX */
    public final void KWHzl(@NotNull final java.util.List<C38291pTi> list) {
        RequestBody requestBodyEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty() || (requestBodyEZpvd = EZpvd(list)) == null) {
            return;
        }
        C33527myD.subscribeOnIO$default(LocalizationReportApi.TaskDescription.reportEvents$default(LocalizationReportApi.Companion.OLrzqt(), requestBodyEZpvd, null, 2, null), new Function1() { // from class: o.pTc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pSQ.OLrzqt((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.pTa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pSQ.OLrzqt(list, (ResponseBody) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.valueOf("LocalizationReportManager", "localization report error: " + th);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final java.util.List list, ResponseBody responseBody) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(responseBody, "");
        pUU.KWHzl("LocalizationReportManager", "localization report success: " + responseBody.string());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C38291pTi) it.next()).AEQbTJ(true);
        }
        copydefault.copydefault("updateSources", new Function0() { // from class: o.pSU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pSQ.copydefault(list);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.util.List list) {
        try {
            UsedSourceDataBase.Companion.EZpvd().EZpvd().copydefault(list);
            pUU.EZpvd("LocalizationReportManager", "updateSources used source: " + list.size() + ", " + list);
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("LocalizationReportManager", th);
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return DbNXlk.get(str) != null;
    }

    public final void ejfBZ() {
        long jValues = values();
        AkhnZx = jValues;
        SPUtils.put("l10n_last_report_time", java.lang.Long.valueOf(jValues));
    }

    public final java.util.List<C38291pTi> AhwBna() {
        java.util.Collection<C38291pTi> collectionValues = DbNXlk.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            if (!((C38291pTi) obj).AYXKKw()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final long values() {
        return java.lang.System.nanoTime() / 1000000;
    }

    public final RequestBody EZpvd(java.util.List<C38291pTi> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C38291pTi c38291pTi : list) {
            arrayList.add(new ReportUsedSource(c38291pTi.OLrzqt(), c38291pTi.AhwBna(), c38291pTi.KWHzl(), c38291pTi.copydefault(), c38291pTi.EZpvd()));
        }
        java.lang.String json = DbNXlk().toJson(new LocalizationReportData(AhwBna, djBIcL, AYXKKw, arrayList, (java.lang.String) null, 16, (DefaultConstructorMarker) null));
        pUU.EZpvd("LocalizationReportManager", "buildRequestBody : " + json);
        if (json != null) {
            return RequestBody.Companion.create(json, MediaType.Companion.get(EIP1271Verifier.mediaTypeString));
        }
        return null;
    }

    public final void OLrzqt(@NotNull java.util.List<C38291pTi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            UsedSourceDataBase.Companion.EZpvd().EZpvd().OLrzqt(list);
            pUU.EZpvd("LocalizationReportManager", "insertSource sourceList: " + list);
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("LocalizationReportManager", th);
        }
        fARcdN();
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.pTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                pSQ.KWHzl(function0, str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        pSK psk = pSK.KWHzl;
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.copydefault(psk.KWHzl()).KWHzl(psk.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.pTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pSQ.EZpvd((java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                pSQ.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.pSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return pSQ.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                pSQ.valueOf(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function0 function0, java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            function0.invoke();
            interfaceC58184ywW.onNext(str);
            interfaceC58184ywW.onComplete();
        } catch (java.lang.Throwable th) {
            interfaceC58184ywW.onError(th);
        }
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str, final Function0<Unit> function0) {
        fetchVPNInfo().onNext(new Function0() { // from class: o.pSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return pSQ.OLrzqt(function0);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final yBC<Function0<Unit>> fetchVPNInfo() {
        yBC<Function0<Unit>> ybcFetchVPNInfo = KWHzl;
        if (ybcFetchVPNInfo == null) {
            synchronized (this) {
                ybcFetchVPNInfo = KWHzl;
                if (ybcFetchVPNInfo == null) {
                    ybcFetchVPNInfo = PublishProcessor.isConnected().fetchVPNInfo();
                    KWHzl = ybcFetchVPNInfo;
                    AbstractC58185ywX<Function0<Unit>> abstractC58185ywXOLrzqt = ybcFetchVPNInfo.OLrzqt(1000L, new InterfaceC58222yxH() { // from class: o.pTb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58222yxH
                        public final void run() {
                            pSQ.copydefault();
                        }
                    }, BackpressureOverflowStrategy.DROP_LATEST);
                    pSK psk = pSK.KWHzl;
                    AbstractC58185ywX<Function0<Unit>> abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.copydefault(psk.KWHzl()).KWHzl(psk.KWHzl());
                    final Function1 function1 = new Function1() { // from class: o.pTf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return pSQ.KWHzl((Function0) obj);
                        }
                    };
                    InterfaceC58227yxM<? super Function0<Unit>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pTe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            pSQ.AYXKKw(function1, obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.pTg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return pSQ.gEmmrt((java.lang.Throwable) obj);
                        }
                    };
                    abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pTd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            pSQ.gEmmrt(function12, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(ybcFetchVPNInfo, "");
                }
            }
        }
        return ybcFetchVPNInfo;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function0 function0) {
        try {
            function0.invoke();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(java.lang.Throwable th) {
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        try {
            ConcurrentHashMap<java.lang.String, C38291pTi> concurrentHashMap = DbNXlk;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, C38291pTi> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().AEQbTJ().length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) entry.getValue().AEQbTJ())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((C38291pTi) ((Map.Entry) it.next()).getValue()).EZpvd(AhwBna);
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (C38291pTi c38291pTi : UsedSourceDataBase.Companion.EZpvd().EZpvd().EZpvd()) {
                    if (!Intrinsics.EZpvd((java.lang.Object) c38291pTi.AEQbTJ(), (java.lang.Object) AhwBna)) {
                        arrayList.add(c38291pTi);
                    } else {
                        DbNXlk.put(c38291pTi.AhwBna(), c38291pTi);
                    }
                }
                if (!arrayList.isEmpty()) {
                    pUU.KWHzl("LocalizationReportManager", "queryExistSource ===== exist not current version source: " + arrayList.size());
                    if (AhwBna.length() > 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) AhwBna))) {
                        UsedSourceDataBase.Companion.EZpvd().EZpvd().AEQbTJ(AhwBna);
                    }
                }
                fARcdN();
            } catch (java.lang.Throwable th) {
                pUU.AEQbTJ("LocalizationReportManager", th);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("LocalizationReportManager", "queryExistSource exception: " + Unit.INSTANCE);
        }
    }
}
