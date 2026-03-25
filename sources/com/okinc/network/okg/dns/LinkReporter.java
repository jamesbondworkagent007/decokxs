package com.okinc.network.okg.dns;

import android.os.SystemClock;
import com.okinc.network.okg.dns.LinkReporter;
import com.okinc.network.okg.dns.model.Attributes;
import com.okinc.network.okg.dns.model.BasicInfo;
import com.okinc.network.okg.dns.model.DnsReport;
import com.okinc.network.okg.dns.model.GetConfig;
import com.okinc.network.okg.dns.model.GetConfigResult;
import com.okinc.network.okg.dns.model.IsAvailableTest;
import com.okinc.network.okg.dns.model.Link;
import com.okinc.network.okg.dns.model.PingCname;
import com.okinc.network.okg.dns.model.Stages;
import com.okinc.utils.appmanager.BackgroundRecords;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.C32979mnm;
import o.C43292rmY;
import o.C43308rmo;
import o.C43405rof;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LinkReporter {
    private static final int COMMON_ERROR_CODE = -1;
    public static final int CONFIG_FROM_GOOGLE = 1;
    public static final int CONFIG_FROM_OKX = 2;
    private static final int MAX_MS_GET_AVAILABLE_CHECK_STAGE = 30000;
    private static final int MAX_MS_GET_CNAME_STAGE = 15000;
    private static final int MAX_MS_GET_CONFIG_STAGE = 15000;
    private static final String TAG = "LinkReporter";
    private volatile long prepareEndTime;
    private volatile long startTime;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    private final DnsReport reportData = new DnsReport((BasicInfo) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    private final Json jsonKt = JsonKt.Json$default(null, new Function1() { // from class: o.rnA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return LinkReporter.jsonKt$lambda$0((JsonBuilder) obj);
        }
    }, 1, null);
    private final AtomicBoolean reported = new AtomicBoolean(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DnsReport getReportData$OKNetwork_network() {
        return this.reportData;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.LinkReporter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jsonKt$lambda$0(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        return Unit.INSTANCE;
    }

    public final void setBasicInfo(@NotNull String str, boolean z, boolean z2, boolean z3, long j, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        long j2 = this.prepareEndTime;
        long j3 = this.startTime;
        this.reportData.setBasicInfo(new BasicInfo(str, String.valueOf(z), String.valueOf(z2), Long.valueOf(j2 - j3), String.valueOf(z3), Long.valueOf(j), new Attributes(z4, z5, false, 4, (DefaultConstructorMarker) null)));
    }

    public final void onStart() {
        this.startTime = SystemClock.elapsedRealtime();
    }

    public final void onPrepareFinish() {
        this.prepareEndTime = SystemClock.elapsedRealtime();
    }

    public final Stages onLinkStart(int i) {
        Link link = new Link(i, new Stages(null, null, null, 0L, 0L, 0L, 63, null));
        link.getStages().setStartTimeForGetConfig(SystemClock.elapsedRealtime());
        if (this.reportData.getLinks() == null) {
            this.reportData.setLinks(new ArrayList());
        }
        List<Link> links = this.reportData.getLinks();
        if (links != null) {
            links.add(link);
        }
        return link.getStages();
    }

    public final void onGetConfigSuccess(@NotNull Stages stages, @NotNull String str, @NotNull String str2, int i, @NotNull List<String> list, String str3, Integer num) {
        List<GetConfigResult> getConfigResult;
        Intrinsics.checkNotNullParameter(stages, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (stages.getGetConfig() == null) {
            stages.setGetConfig(new GetConfig(str, SystemClock.elapsedRealtime() - stages.getStartTimeForGetConfig(), 0, new ArrayList(), 4, (DefaultConstructorMarker) null));
        }
        GetConfigResult getConfigResult2 = new GetConfigResult(str2, Integer.valueOf(i), list, 0, str3, 8, (DefaultConstructorMarker) null);
        if (num != null) {
            getConfigResult2.setCategory(num.intValue());
        }
        GetConfig getConfig = stages.getGetConfig();
        if (getConfig == null || (getConfigResult = getConfig.getGetConfigResult()) == null) {
            return;
        }
        getConfigResult.add(getConfigResult2);
    }

    public final void onGetConfigFail(@NotNull Stages stages, @NotNull String str) {
        Intrinsics.checkNotNullParameter(stages, "");
        Intrinsics.checkNotNullParameter(str, "");
        stages.setGetConfig(new GetConfig(str, SystemClock.elapsedRealtime() - stages.getStartTimeForGetConfig(), -1, (List) null, 8, (DefaultConstructorMarker) null));
    }

    public final void onPingCNameStart(@NotNull Stages stages) {
        Intrinsics.checkNotNullParameter(stages, "");
        stages.setStartTimeForPingCNames(SystemClock.elapsedRealtime());
        stages.setPingCNames(new CopyOnWriteArrayList());
    }

    public static /* synthetic */ void onPingCNameSuccess$default(LinkReporter linkReporter, Stages stages, String str, String str2, Long l, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        linkReporter.onPingCNameSuccess(stages, str, str2, l);
    }

    public final void onPingCNameSuccess(@NotNull Stages stages, @NotNull String str, @NotNull String str2, Long l) {
        Intrinsics.checkNotNullParameter(stages, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        PingCname pingCname = new PingCname(str, str2, l != null ? l.longValue() : SystemClock.elapsedRealtime() - stages.getStartTimeForPingCNames(), 0, 8, (DefaultConstructorMarker) null);
        List<PingCname> pingCNames = stages.getPingCNames();
        if (pingCNames != null) {
            pingCNames.add(pingCname);
        }
    }

    public final void onPingCNameFail(@NotNull Stages stages, @NotNull String str) {
        Intrinsics.checkNotNullParameter(stages, "");
        Intrinsics.checkNotNullParameter(str, "");
        PingCname pingCname = new PingCname(str, null, SystemClock.elapsedRealtime() - stages.getStartTimeForPingCNames(), -1);
        List<PingCname> pingCNames = stages.getPingCNames();
        if (pingCNames != null) {
            pingCNames.add(pingCname);
        }
    }

    public final void onIsAvailableTestStart(@NotNull Stages stages) {
        Intrinsics.checkNotNullParameter(stages, "");
        stages.setStartTimeForIsAvailableTest(SystemClock.elapsedRealtime());
        stages.setAvailableTest(new CopyOnWriteArrayList());
    }

    public static /* synthetic */ void onIsAvailableTestSuccess$default(LinkReporter linkReporter, Stages stages, String str, String str2, Long l, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        linkReporter.onIsAvailableTestSuccess(stages, str, str2, l);
    }

    public final void onIsAvailableTestSuccess(@NotNull Stages stages, @NotNull String str, @NotNull String str2, Long l) {
        Intrinsics.checkNotNullParameter(stages, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IsAvailableTest isAvailableTest = new IsAvailableTest(str, str2, l != null ? l.longValue() : SystemClock.elapsedRealtime() - stages.getStartTimeForIsAvailableTest(), Long.valueOf(SystemClock.elapsedRealtime() - this.startTime), 0, 16, (DefaultConstructorMarker) null);
        List<IsAvailableTest> listIsAvailableTest = stages.isAvailableTest();
        if (listIsAvailableTest != null) {
            listIsAvailableTest.add(isAvailableTest);
        }
    }

    public static /* synthetic */ void onIsAvailableTestFail$default(LinkReporter linkReporter, Stages stages, String str, String str2, Long l, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        linkReporter.onIsAvailableTestFail(stages, str, str2, l);
    }

    public final void onIsAvailableTestFail(@NotNull Stages stages, @NotNull String str, @NotNull String str2, Long l) {
        Intrinsics.checkNotNullParameter(stages, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        IsAvailableTest isAvailableTest = new IsAvailableTest(str, str2, l != null ? l.longValue() : SystemClock.elapsedRealtime() - stages.getStartTimeForIsAvailableTest(), Long.valueOf(SystemClock.elapsedRealtime() - this.startTime), -1);
        List<IsAvailableTest> listIsAvailableTest = stages.isAvailableTest();
        if (listIsAvailableTest != null) {
            listIsAvailableTest.add(isAvailableTest);
        }
    }

    public final void onEnd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(TAG, "onEnd, from:" + str + ", totalDuration:" + (SystemClock.elapsedRealtime() - this.startTime) + JwtUtilsKt.JWT_DELIMITER);
        report();
    }

    private final void report() {
        if (C43292rmY.OLrzqt.AkhnZx()) {
            if (!this.reported.compareAndSet(false, true)) {
                pUU.copydefault(TAG, "LinkReporter has already reported, please create a new instance for each report. for:" + this.reportData);
                return;
            }
            if (C43308rmo.OLrzqt(C32979mnm.EZpvd.OLrzqt()) && !BackgroundRecords.INSTANCE.existBackgroundInRange(this.startTime, SystemClock.elapsedRealtime()) && isDataValid$OKNetwork_network(this.reportData)) {
                try {
                    C43405rof.EZpvd.OLrzqt(this.reportData);
                } catch (Exception e) {
                    pUU.AEQbTJ(TAG, "Failed to report DNS link data", e);
                }
            }
        }
    }

    public final boolean isDataValid$OKNetwork_network(@NotNull DnsReport dnsReport) {
        Intrinsics.checkNotNullParameter(dnsReport, "");
        List<Link> links = dnsReport.getLinks();
        if (links == null) {
            return false;
        }
        for (Link link : links) {
            GetConfig getConfig = link.getStages().getGetConfig();
            if (getConfig != null && getConfig.getDuration() > 15000) {
                pUU.KWHzl(TAG, "isDataValid, ignore get config too long:" + getConfig + ", startTime: " + link.getStages().getStartTimeForGetConfig());
                return false;
            }
            List<PingCname> pingCNames = link.getStages().getPingCNames();
            if (pingCNames != null) {
                for (PingCname pingCname : pingCNames) {
                    if (pingCname.getDuration() > 15000) {
                        pUU.KWHzl(TAG, "isDataValid, ignore ping cname too long:" + pingCname + ", startTime: " + link.getStages().getStartTimeForPingCNames());
                        return false;
                    }
                }
            }
            List<IsAvailableTest> listIsAvailableTest = link.getStages().isAvailableTest();
            if (listIsAvailableTest != null) {
                for (IsAvailableTest isAvailableTest : listIsAvailableTest) {
                    if (isAvailableTest.getDuration() > 30000) {
                        pUU.KWHzl(TAG, "isDataValid, ignore available too long:" + isAvailableTest + ",  startTime: " + link.getStages().getStartTimeForIsAvailableTest());
                        return false;
                    }
                }
            }
        }
        BasicInfo basicInfo = dnsReport.getBasicInfo();
        pUU.KWHzl(TAG, "isDataValid, is valid for " + (basicInfo != null ? basicInfo.getRootDomain() : null));
        return true;
    }

    public final boolean isReported$OKNetwork_network() {
        return this.reported.get();
    }
}
