package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.network.okg.unifieddomain.DomainType;
import com.okinc.network.okg.unifieddomain.ReportControl;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43461rpi {
    public static yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> AEQbTJ;
    public static final C43461rpi copydefault = new C43461rpi();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rpg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43461rpi.EZpvd();
        }
    });
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.Boolean bool, java.lang.String str, DomainType domainType, java.lang.String str2, java.lang.String str3) {
        reportFileDownloadResult$default(this, bool, str, domainType, str2, str3, null, 32, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yht) {
        AEQbTJ = yht;
    }

    private C43461rpi() {
    }

    public final ReportControl AEQbTJ() {
        return (ReportControl) OLrzqt.getValue();
    }

    public static final ReportControl EZpvd() {
        return new ReportControl();
    }

    public final void AEQbTJ(int i) {
        pUU.KWHzl("NetActionEventReport", "setMaxReportsPerMinuteForCore, maxReports: " + i);
        AEQbTJ().EZpvd(ReportControl.ReportType.CORE, i);
    }

    public final void OLrzqt(int i) {
        pUU.KWHzl("NetActionEventReport", "setMaxReportsPerMinuteForFileDownload, maxReports: " + i);
        AEQbTJ().EZpvd(ReportControl.ReportType.FILE_DOWNLOAD, i);
    }

    public final void KWHzl(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
        yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yht;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (OLrzqt() && (yht = AEQbTJ) != null) {
            try {
                Result.Application application = Result.Companion;
                ReportControl.ReportType reportType = ReportControl.ReportType.CORE;
                C43461rpi c43461rpi = copydefault;
                if (c43461rpi.AEQbTJ().KWHzl(reportType)) {
                    java.lang.String str3 = z ? "0" : MultiTransferSignData.DEFAULT_INTERVAL;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("attr_1", str);
                    if (!list.isEmpty()) {
                        linkedHashMap.put("attr_2", C33490mxT.OLrzqt(list));
                    }
                    if (!list2.isEmpty()) {
                        linkedHashMap.put("attr_3", C33490mxT.OLrzqt(list2));
                    }
                    if (str2.length() > 0) {
                        linkedHashMap.put("attr_4", str2);
                    }
                    yht.invoke("uni_domains_availability", str3, null, linkedHashMap);
                    c43461rpi.AEQbTJ().AEQbTJ(reportType);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    public static /* synthetic */ void reportFileDownloadResult$default(C43461rpi c43461rpi, java.lang.Boolean bool, java.lang.String str, DomainType domainType, java.lang.String str2, java.lang.String str3, ReportControl reportControl, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            reportControl = c43461rpi.AEQbTJ();
        }
        c43461rpi.EZpvd(bool, str, domainType, str2, str3, reportControl);
    }

    public final void EZpvd(java.lang.Boolean bool, java.lang.String str, DomainType domainType, java.lang.String str2, java.lang.String str3, @NotNull ReportControl reportControl) {
        yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yht;
        Intrinsics.checkNotNullParameter(reportControl, "");
        if (bool == null || str2 == null || str3 == null || !OLrzqt() || (yht = AEQbTJ) == null) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            ReportControl.ReportType reportType = ReportControl.ReportType.FILE_DOWNLOAD;
            if (reportControl.KWHzl(reportType)) {
                java.lang.String str4 = bool.booleanValue() ? "0" : "1";
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (domainType != null) {
                    linkedHashMap.put("attr_1", domainType.name());
                }
                HttpUrl.Companion companion = HttpUrl.Companion;
                HttpUrl httpUrl = companion.get(str2);
                HttpUrl httpUrl2 = companion.get(str3);
                linkedHashMap.put("attr_2", httpUrl.encodedPath());
                linkedHashMap.put("attr_3", httpUrl.scheme() + "://" + httpUrl.host());
                linkedHashMap.put("attr_4", httpUrl2.scheme() + "://" + httpUrl2.host());
                linkedHashMap.put("attr_5", str3);
                yht.invoke("resource_download_task_result", str4, str, linkedHashMap);
                reportControl.AEQbTJ(reportType);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yht;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (OLrzqt() && (yht = AEQbTJ) != null) {
            try {
                Result.Application application = Result.Companion;
                java.lang.String str3 = z ? "0" : MultiTransferSignData.DEFAULT_INTERVAL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("attr_1", str);
                linkedHashMap.put("attr_2", str2);
                yht.invoke("current_uni_domain_availability", str3, null, linkedHashMap);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    public final void copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        yHT<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yht;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (OLrzqt() && (yht = AEQbTJ) != null) {
            try {
                Result.Application application = Result.Companion;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("attr_1", java.lang.String.valueOf(z));
                linkedHashMap.put("attr_2", str3);
                linkedHashMap.put("attr_3", str);
                linkedHashMap.put("attr_4", str2);
                yht.invoke("cor_domain_call", "1", null, linkedHashMap);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    public final boolean OLrzqt() {
        return C43308rmo.OLrzqt(C32979mnm.EZpvd.OLrzqt()) && C43396roW.EZpvd().AYXKKw().booleanValue();
    }
}
