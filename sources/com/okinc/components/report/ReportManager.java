package com.okinc.components.report;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.base.thread.TPM;
import com.okinc.base.utils.OkUtils;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.ReportMetricApi;
import com.okinc.components.report.db.EventData;
import com.okinc.components.report.db.ReportEventDataBase;
import com.okinc.components.track.ABTestManager;
import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.okg.log.LruLinkedHashMap;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC58185ywX;
import o.AbstractC58247yxg;
import o.AbstractC58253yxm;
import o.C32627mhE;
import o.C32725mix;
import o.C32727miz;
import o.C32927mmn;
import o.C32935mmv;
import o.C34703nhO;
import o.C43346rnZ;
import o.C43357rnk;
import o.C43466rpn;
import o.C54819xWm;
import o.C56391yDq;
import o.C56392yDr;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC32703mib;
import o.InterfaceC32710mii;
import o.InterfaceC32712mik;
import o.InterfaceC32855mlU;
import o.InterfaceC32926mmm;
import o.InterfaceC54816xWj;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58249yxi;
import o.InterfaceC58251yxk;
import o.pUU;
import o.xVW;
import o.xVY;
import o.yBI;
import o.yDV;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ReportManager {
    public static String AhwBna;
    public static InterfaceC58217yxC djBIcL;
    public static Function0<String> isConnected;
    public static final ReportManager AEQbTJ = new ReportManager();
    public static String valueOf = "";
    public static final AtomicBoolean AYXKKw = new AtomicBoolean(true);
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mia
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ReportManager.gEmmrt();
        }
    });
    public static final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.mhW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ReportManager.AhwBna();
        }
    });
    public static final InterfaceC56387yDm fetchVPNInfo = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mhY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ReportManager.valueOf();
        }
    });
    public static AtomicBoolean gEmmrt = new AtomicBoolean(false);
    public static final LruLinkedHashMap<String, EventData> KWHzl = new LruLinkedHashMap<>(128);
    public static ActionBar EZpvd = new ActionBar();
    public static final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.mif
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ReportManager.AYXKKw();
        }
    });
    public static final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.mid
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ReportManager.djBIcL());
        }
    });
    public static final int OLrzqt = 8;

    public static final class Activity implements TPM.Application {
        public final String EZpvd = "OKAnalytics";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.base.thread.TPM.Application
        public String EZpvd() {
            return this.EZpvd;
        }
    }

    public static final class StateListAnimator extends C32927mmn {
        public final String OLrzqt = "mobile_infra_apm_memory_android";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public String EZpvd() {
            return this.OLrzqt;
        }
    }

    public final void AEQbTJ(String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        AhwBna = str;
    }

    private ReportManager() {
    }

    public final AbstractC58253yxm isConnected() {
        return (AbstractC58253yxm) copydefault.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.base.thread.TPM.ActionBar.create$default(com.okinc.base.thread.TPM$ActionBar, java.lang.String, com.okinc.base.thread.TPM$Application, int, int, java.lang.Object):o.yxm */
    public static final AbstractC58253yxm gEmmrt() {
        return TPM.ActionBar.create$default(TPM.ActionBar.AEQbTJ, "Grafana.Common", new Activity(), 0, 4, null);
    }

    public final CoroutineScope values() {
        return (CoroutineScope) DbNXlk.getValue();
    }

    public static final CoroutineScope AhwBna() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(ExecutorsKt.from(TPM.AEQbTJ.AhwBna())));
    }

    public final boolean fARcdN() {
        return AYXKKw.get();
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("Grafana.Common", "footprintId==>" + str);
        valueOf = str;
    }

    public final String DbNXlk() {
        return (String) fetchVPNInfo.getValue();
    }

    public static final String valueOf() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class ActionBar implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            ReportManager.AEQbTJ.AuCTel();
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            ReportManager.AEQbTJ.fIwbmz();
        }
    }

    public final InterfaceC32926mmm AkhnZx() {
        return (InterfaceC32926mmm) AkhnZx.getValue();
    }

    public static final StateListAnimator AYXKKw() {
        return new StateListAnimator();
    }

    public final boolean fetchVPNInfo() {
        return ((Boolean) values.getValue()).booleanValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.components.track.ABTestManager.isEnabled$default(com.okinc.components.track.ABTestManager, o.mmm, com.okinc.components.track.amplitude.AmplitudeName, int, java.lang.Object):boolean */
    public static final boolean djBIcL() {
        return ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, AEQbTJ.AkhnZx(), null, 2, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32725mix c32725mix = C32725mix.KWHzl;
        pUU.EZpvd("Grafana.Common", "startUpLoad ---> " + c32725mix.OLrzqt() + " " + str + " " + xVW.copydefault());
        AhwBna = str;
        AYXKKw.set(false);
        if (c32725mix.copydefault()) {
            pUU.EZpvd("Grafana.Common", "startUpLoad start");
            C54819xWm.KWHzl().AEQbTJ(EZpvd);
            AuCTel();
            if (fetchVPNInfo()) {
                return;
            }
            OkUtils.AEQbTJ().registerActivityLifecycleCallbacks(new TaskDescription());
        }
    }

    public static final class TaskDescription implements Application.ActivityLifecycleCallbacks {
        public long EZpvd = 2000;
        public long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (System.currentTimeMillis() - this.copydefault > this.EZpvd) {
                this.copydefault = System.currentTimeMillis();
                ReportManager.AEQbTJ.copydefault(activity);
            }
        }
    }

    public final void copydefault(android.app.Activity activity) {
        BuildersKt__Builders_commonKt.launch$default(values(), null, null, new ReportManager$reportMemory$1(activity, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(long j, long j2, Continuation<? super Unit> continuation) throws Throwable {
        ReportManager$postMemoryErrors$1 reportManager$postMemoryErrors$1;
        if (continuation instanceof ReportManager$postMemoryErrors$1) {
            reportManager$postMemoryErrors$1 = (ReportManager$postMemoryErrors$1) continuation;
            int i = reportManager$postMemoryErrors$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportManager$postMemoryErrors$1.label = i - Integer.MIN_VALUE;
            } else {
                reportManager$postMemoryErrors$1 = new ReportManager$postMemoryErrors$1(this, continuation);
            }
        }
        Object obj = reportManager$postMemoryErrors$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reportManager$postMemoryErrors$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault();
            reportManager$postMemoryErrors$1.J$0 = j;
            reportManager$postMemoryErrors$1.J$1 = j2;
            reportManager$postMemoryErrors$1.label = 1;
            if (DelayKt.delay(5000L, reportManager$postMemoryErrors$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = reportManager$postMemoryErrors$1.J$1;
            j = reportManager$postMemoryErrors$1.J$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC32855mlU interfaceC32855mlUAEQbTJ = InterfaceC32855mlU.Companion.AEQbTJ();
        if (interfaceC32855mlUAEQbTJ != null) {
            interfaceC32855mlUAEQbTJ.copydefault(new MemoryAlarmException("Used memory reached 80%,current used memory is " + j + ",total memory is " + j2), null, null, null);
        }
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        if (djBIcL == null) {
            pUU.EZpvd("Grafana.Common", "--- startTimer ---");
            AbstractC58247yxg<Long> abstractC58247yxgRepeat = AbstractC58247yxg.timer(10L, TimeUnit.SECONDS, isConnected()).repeat();
            final Function1 function1 = new Function1() { // from class: o.mhH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ReportManager.isConnected((java.lang.Throwable) obj);
                }
            };
            AbstractC58247yxg<Long> abstractC58247yxgDoOnError = abstractC58247yxgRepeat.doOnError(new InterfaceC58227yxM() { // from class: o.mhQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ReportManager.OLrzqt(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.mhN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ReportManager.EZpvd((java.lang.Long) obj);
                }
            };
            djBIcL = abstractC58247yxgDoOnError.subscribe(new InterfaceC58227yxM() { // from class: o.mhM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ReportManager.AhwBna(function12, obj);
                }
            });
        }
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(Throwable th) {
        th.printStackTrace();
        Unit unit = Unit.INSTANCE;
        pUU.valueOf("Grafana.Common", "net event timer error: " + unit);
        return unit;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Long l) {
        AEQbTJ.fJNWhG();
        return Unit.INSTANCE;
    }

    public final void fIwbmz() {
        InterfaceC58217yxC interfaceC58217yxC = djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        djBIcL = null;
    }

    public static /* synthetic */ void addEvent$default(ReportManager reportManager, EventData eventData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        reportManager.EZpvd(eventData, z);
    }

    public final void EZpvd(@NotNull EventData eventData, boolean z) {
        Intrinsics.checkNotNullParameter(eventData, "");
        AEQbTJ("addEvent --->saveToDb:" + z + "  " + C32727miz.EZpvd(eventData));
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            EventData eventDataClone = eventData.m6663clone();
            Intrinsics.checkNotNullExpressionValue(eventDataClone, "");
            eventDataClone.setFootprintId(valueOf);
            AEQbTJ(eventDataClone);
            KWHzl.put(String.valueOf(eventDataClone.hashCode()), eventDataClone);
            AEQbTJ("cacheDataMap add data:" + eventDataClone + " cost time " + (System.currentTimeMillis() - jCurrentTimeMillis));
            return;
        }
        EZpvd(eventData);
    }

    public final void EZpvd(@NotNull final EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "");
        if (OkUtils.AEQbTJ() != null) {
            C32725mix c32725mix = C32725mix.KWHzl;
            if (c32725mix.copydefault()) {
                pUU.EZpvd("Grafana.Common", "addEvent ---> " + C32727miz.EZpvd(eventData));
                String path = eventData.getPath();
                if (path == null || path.length() == 0) {
                    eventData.setPath(c32725mix.KWHzl());
                }
                AbstractC58247yxg abstractC58247yxgSubscribeOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.mhL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        ReportManager.AEQbTJ(eventData, interfaceC58251yxk);
                    }
                }).subscribeOn(isConnected());
                final Function1 function1 = new Function1() { // from class: o.mhJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ReportManager.EZpvd((java.util.List) obj);
                    }
                };
                abstractC58247yxgSubscribeOn.subscribe(new InterfaceC58227yxM() { // from class: o.mhS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReportManager.AEQbTJ(function1, obj);
                    }
                });
            }
        }
    }

    public static final void AEQbTJ(EventData eventData, InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        eventData.setFootprintId(valueOf);
        EventData eventDataClone = eventData.m6663clone();
        Intrinsics.checkNotNullExpressionValue(eventDataClone, "");
        AEQbTJ.KWHzl(eventDataClone);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eventDataClone);
        interfaceC58251yxk.onNext(arrayList);
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(List list) {
        Intrinsics.copydefault(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventData eventData = (EventData) it.next();
            if (C32627mhE.AEQbTJ(eventData, EventAction.APP_MEMORY)) {
                ReportEventDataBase.ActionBar actionBar = ReportEventDataBase.Companion;
                InterfaceC58227yxM<Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mhR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReportManager.copydefault((java.lang.Boolean) obj);
                    }
                };
                InterfaceC58227yxM<Throwable> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.mhV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReportManager.valueOf((java.lang.Throwable) obj);
                    }
                };
                InterfaceC32703mib interfaceC32703mibCopydefault = actionBar.copydefault(EventData.class);
                Intrinsics.copydefault(interfaceC32703mibCopydefault, "");
                actionBar.KWHzl(interfaceC58227yxM, interfaceC58227yxM2, (InterfaceC32710mii) interfaceC32703mibCopydefault, eventData, valueOf);
            } else if (C32627mhE.AEQbTJ(eventData, EventAction.APP_ENV_RASP)) {
                ReportEventDataBase.ActionBar actionBar2 = ReportEventDataBase.Companion;
                InterfaceC58227yxM<Boolean> interfaceC58227yxM3 = new InterfaceC58227yxM() { // from class: o.mhU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReportManager.OLrzqt((java.lang.Boolean) obj);
                    }
                };
                InterfaceC58227yxM<Throwable> interfaceC58227yxM4 = new InterfaceC58227yxM() { // from class: o.mhT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReportManager.AhwBna((java.lang.Throwable) obj);
                    }
                };
                InterfaceC32703mib interfaceC32703mibCopydefault2 = actionBar2.copydefault(EventData.class);
                Intrinsics.copydefault(interfaceC32703mibCopydefault2, "");
                actionBar2.OLrzqt(interfaceC58227yxM3, interfaceC58227yxM4, (InterfaceC32710mii) interfaceC32703mibCopydefault2, eventData, valueOf);
            } else {
                ReportEventDataBase.ActionBar actionBar3 = ReportEventDataBase.Companion;
                actionBar3.copydefault(new InterfaceC58227yxM() { // from class: o.mhX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReportManager.OLrzqt((long[]) obj);
                    }
                }, new InterfaceC58227yxM() { // from class: o.mhZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReportManager.AYXKKw((java.lang.Throwable) obj);
                    }
                }, actionBar3.copydefault(EventData.class), eventData);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Boolean bool) {
        pUU.EZpvd("Grafana.Common", "onNext->addEvent() Memory Event success:" + bool);
    }

    public static final void valueOf(Throwable th) {
        pUU.valueOf("Grafana.Common", "onError->addEvent() error:" + th.getMessage());
    }

    public static final void OLrzqt(Boolean bool) {
        pUU.EZpvd("Grafana.Common", "onNext->addEvent() ENV_RASP Event success:" + bool);
    }

    public static final void AhwBna(Throwable th) {
        pUU.valueOf("Grafana.Common", "onError->addEvent() error:" + th.getMessage());
    }

    public static final void OLrzqt(long[] jArr) {
        Intrinsics.copydefault(jArr);
        pUU.EZpvd("Grafana.Common", "onNext->addEvent() success:" + yDV.OLrzqt(jArr));
    }

    public static final void AYXKKw(Throwable th) {
        pUU.valueOf("Grafana.Common", "onError->addEvent() error:" + th.getMessage());
    }

    public final void KWHzl(EventData eventData) {
        Map<String, String> linkedHashMap;
        String str;
        Map<String, String> attrs = eventData.getAttrs();
        if (attrs == null || (linkedHashMap = C56424yEw.isConnected(attrs)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        if (!linkedHashMap.containsKey(AppsFlyerProperties.CHANNEL)) {
            linkedHashMap.put(AppsFlyerProperties.CHANNEL, xVY.OLrzqt());
        }
        if (!linkedHashMap.containsKey("version")) {
            linkedHashMap.put("version", C34703nhO.valueOf(OkUtils.AEQbTJ()));
        }
        if (!linkedHashMap.containsKey("versionCode")) {
            linkedHashMap.put("versionCode", String.valueOf(C34703nhO.copydefault(OkUtils.AEQbTJ())));
        }
        if (!linkedHashMap.containsKey("flavorMarket")) {
            String str2 = AhwBna;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("flavorMarket", str2);
        }
        if (!linkedHashMap.containsKey("app_mode") && (str = (String) C32935mmv.KWHzl.get("app_mode_realtime_okx")) != null && str.length() != 0) {
            linkedHashMap.put("app_mode", str);
        }
        copydefault(linkedHashMap);
        eventData.setAttribute(linkedHashMap);
    }

    public final void AEQbTJ(EventData eventData) {
        Map<String, String> linkedHashMap;
        Map<String, String> attrs = eventData.getAttrs();
        if (attrs == null || (linkedHashMap = C56424yEw.isConnected(attrs)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        copydefault(linkedHashMap);
        eventData.setAttribute(linkedHashMap);
    }

    public final void copydefault(Map<String, String> map) {
        if (map.containsKey("launching")) {
            return;
        }
        map.put("launching", AYXKKw.get() ? "1" : "0");
    }

    public final void fJNWhG() {
        if (gEmmrt.get()) {
            pUU.EZpvd("Grafana.Common", "--- report event return cause previous report is running!");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = (i == 29 || i == 30) ? 5 : 128;
        LruLinkedHashMap<String, EventData> lruLinkedHashMap = KWHzl;
        int size = lruLinkedHashMap.size() < i2 ? i2 - lruLinkedHashMap.size() : 0;
        pUU.EZpvd("Grafana.Common", "reportEvent num: " + i2 + " limit: " + size + " android version:" + i);
        ReportEventDataBase.ActionBar actionBar = ReportEventDataBase.Companion;
        actionBar.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mhK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ReportManager.copydefault((java.util.List) obj);
            }
        }, new InterfaceC58227yxM() { // from class: o.mhI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ReportManager.values((java.lang.Throwable) obj);
            }
        }, actionBar.copydefault(EventData.class), size);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.components.report.ReportMetricApi.TaskDescription.reportEvent$default(com.okinc.components.report.ReportMetricApi, java.lang.String, java.lang.String, java.lang.String, java.lang.String, okhttp3.RequestBody, com.okinc.network.okg.cor.SubdomainStrategy, int, java.lang.Object):o.ywX */
    /* JADX DEBUG: Class process forced to load method for inline: o.yBI.subscribeBy$default(o.ywX, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):o.yxC */
    public static final void copydefault(List list) {
        ArrayList arrayList = new ArrayList();
        Intrinsics.copydefault(list);
        arrayList.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
        Collection<EventData> collectionValues = KWHzl.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (EventData eventData : collectionValues) {
            eventData.setFootprintId(valueOf);
            ReportManager reportManager = AEQbTJ;
            Intrinsics.copydefault(eventData);
            reportManager.KWHzl(eventData);
            arrayList.add(eventData);
        }
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            EventData eventData2 = (EventData) obj;
            if ((!C32627mhE.KWHzl(eventData2) && !C32627mhE.AEQbTJ(eventData2, EventAction.APP_ENV_RASP)) || !eventData2.getFootprintId().equals(valueOf)) {
                arrayList2.add(obj);
            }
        }
        pUU.EZpvd("Grafana.Common", "onNext->asyncGetAll() success: cacheDataMap size:" + KWHzl.size() + " list:" + arrayList2.size());
        if (!(!arrayList2.isEmpty())) {
            pUU.valueOf("Grafana.Common", "db have no data");
            return;
        }
        ReportManager reportManager2 = AEQbTJ;
        RequestBody requestBodyEZpvd = reportManager2.EZpvd((Collection<EventData>) CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList2));
        gEmmrt = new AtomicBoolean(true);
        if (requestBodyEZpvd != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ReportMetricApi reportMetricApiAEQbTJ = ReportMetricApi.Companion.AEQbTJ();
            String strCopydefault = reportManager2.copydefault(jCurrentTimeMillis);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            Function0<String> function0 = isConnected;
            String strInvoke = function0 != null ? function0.invoke() : null;
            AbstractC58185ywX abstractC58185ywXCopydefault = ReportMetricApi.TaskDescription.reportEvent$default(reportMetricApiAEQbTJ, strCopydefault, String.valueOf(jCurrentTimeMillis), strInvoke == null ? "" : strInvoke, reportManager2.DbNXlk(), requestBodyEZpvd, null, 32, null).copydefault(C43357rnk.KWHzl.EZpvd(ThreadPoolType.HTTP));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
            yBI.subscribeBy$default(abstractC58185ywXCopydefault, new Function1() { // from class: o.mhO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ReportManager.DbNXlk((java.lang.Throwable) obj2);
                }
            }, (Function0) null, new Function1() { // from class: o.mhP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ReportManager.copydefault(arrayList2, (ResponseBody) obj2);
                }
            }, 2, (Object) null);
        }
    }

    public static final Unit DbNXlk(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.EZpvd("Grafana.Common", "commonEvent report error: " + th);
        gEmmrt = new AtomicBoolean(false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(List list, ResponseBody responseBody) throws IOException {
        pUU.KWHzl("Grafana.Common", "commonEvent report success: " + responseBody.string());
        gEmmrt = new AtomicBoolean(false);
        AEQbTJ.AEQbTJ((List<? extends EventData>) list);
        return Unit.INSTANCE;
    }

    public static final void values(Throwable th) {
        pUU.copydefault("Grafana.Common", "onError->asyncGetAll() dao: error:" + th.getMessage());
    }

    public final void AEQbTJ(@NotNull List<? extends EventData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        KWHzl.clear();
        ReportEventDataBase.ActionBar actionBar = ReportEventDataBase.Companion;
        InterfaceC58227yxM<Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ReportManager.AEQbTJ((java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<Throwable> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.mic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ReportManager.AkhnZx((java.lang.Throwable) obj);
            }
        };
        InterfaceC32703mib interfaceC32703mibCopydefault = actionBar.copydefault(EventData.class);
        EventData[] eventDataArr = (EventData[]) list.toArray(new EventData[0]);
        actionBar.KWHzl(interfaceC58227yxM, interfaceC58227yxM2, interfaceC32703mibCopydefault, (InterfaceC32712mik[]) Arrays.copyOf(eventDataArr, eventDataArr.length));
    }

    public static final void AEQbTJ(Integer num) {
        pUU.EZpvd("Grafana.Common", "onNext->deleteEventData()   success:" + num);
    }

    public static final void AkhnZx(Throwable th) {
        pUU.valueOf("Grafana.Common", "onError->deleteEventData()  error:" + th.getMessage());
    }

    public final RequestBody EZpvd(Collection<EventData> collection) {
        pUU.EZpvd("Grafana.Common", "buildRequestBody=>" + collection);
        String json = C43466rpn.OLrzqt.valueOf().toJson(collection);
        if (json != null) {
            return RequestBody.Companion.create(json, MediaType.Companion.get(EIP1271Verifier.mediaTypeString));
        }
        return null;
    }

    public final String copydefault(long j) {
        return C43346rnZ.KWHzl.OLrzqt(xVW.copydefault() + "iopu34e" + ((j / ((long) 1000)) / ((long) 15)));
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class MemoryAlarmException extends Throwable {
        public static final int $stable = 0;
        private final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemoryAlarmException(@NotNull String str) {
            super("");
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }
    }
}
