package o;

import androidx.work.WorkRequest;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.biz.statistics.data.bean.StatisticsRequest;
import com.okinc.biz.statistics.data.bean.StatisticsResp;
import com.okinc.biz.statistics.db.ReportDatabase;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43457rpe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aXQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6862aXQ extends AbstractC32806mkY {
    public static AbstractC58253yxm DbNXlk;
    public static android.content.Context KWHzl;
    public static final int copydefault;
    public static final C6862aXQ AEQbTJ = new C6862aXQ();
    public static final InterfaceC56387yDm fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.aYm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6862aXQ.djBIcL();
        }
    });
    public static final C43457rpe.ActionBar isConnected = new C43457rpe.ActionBar() { // from class: o.aYo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C43457rpe.ActionBar
        public final void copydefault(boolean z, android.net.NetworkInfo networkInfo) {
            C6862aXQ.EZpvd(z, networkInfo);
        }
    };
    public static AtomicLong OLrzqt = new AtomicLong(0);
    public static AtomicLong EZpvd = new AtomicLong(0);
    public static AtomicBoolean fetchVPNInfo = new AtomicBoolean(true);
    public static final android.os.Handler AhwBna = new android.os.Handler(android.os.Looper.getMainLooper());
    public static AtomicBoolean djBIcL = new AtomicBoolean(false);
    public static final java.lang.Runnable values = new java.lang.Runnable() { // from class: o.aXR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C6862aXQ.AhwBna();
        }
    };
    public static final java.lang.Runnable AYXKKw = new java.lang.Runnable() { // from class: o.aXT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C6862aXQ.AEQbTJ();
        }
    };
    public static final java.lang.Runnable AkhnZx = new java.lang.Runnable() { // from class: o.aXS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C6862aXQ.AYXKKw();
        }
    };
    public static AtomicBoolean valueOf = new AtomicBoolean(false);
    public static final java.util.List<C6913aYO> gEmmrt = Collections.synchronizedList(new java.util.ArrayList(10));

    /* JADX INFO: renamed from: o.aXQ$StateListAnimator */
    public static final class StateListAnimator extends C32927mmn {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return "mobile_infra_self_tracking_account_scope";
        }
    }

    private C6862aXQ() {
    }

    static {
        AbstractC58253yxm abstractC58253yxmKWHzl = yBP.KWHzl(Executors.newSingleThreadExecutor());
        Intrinsics.checkNotNullExpressionValue(abstractC58253yxmKWHzl, "");
        DbNXlk = abstractC58253yxmKWHzl;
        copydefault = 8;
    }

    public final java.util.List<InterfaceC35206nqu> AuCTel() {
        return (java.util.List) fIwbmz.getValue();
    }

    public static final java.util.List djBIcL() {
        return C43251rlk.KWHzl(InterfaceC35206nqu.class);
    }

    @Override // o.InterfaceC32874mln
    public TrackChannel fJNWhG() {
        return TrackChannel.OKStatistics;
    }

    @Override // o.InterfaceC32874mln
    public void onEvent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C6913aYO c6913aYO = new C6913aYO();
        c6913aYO.AEQbTJ(str);
        Unit unit = Unit.INSTANCE;
        OLrzqt(c6913aYO);
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C6913aYO[] c6913aYOArr = new C6913aYO[1];
        C6913aYO c6913aYO = new C6913aYO();
        c6913aYO.AEQbTJ(str);
        C6909aYK c6909aYK = new C6909aYK(map);
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        c6909aYK.put("new_user_id", tk != null ? tk : "");
        C32932mms.AEQbTJ.AEQbTJ(str, c6909aYK);
        c6913aYO.copydefault(c6909aYK);
        Unit unit = Unit.INSTANCE;
        c6913aYOArr[0] = c6913aYO;
        OLrzqt(c6913aYOArr);
    }

    @Override // o.InterfaceC32874mln
    public void copydefault(@NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        copydefault(str, C32867mlg.KWHzl.OLrzqt(eventParamsList, true));
    }

    public static final void EZpvd(boolean z, android.net.NetworkInfo networkInfo) {
        if (z) {
            AEQbTJ.getFieldNames();
        }
    }

    public static final void AhwBna() {
        AEQbTJ.getFieldNames();
    }

    public static final void AEQbTJ() {
        AEQbTJ.AkhnZx();
    }

    public static final void AYXKKw() {
        AEQbTJ.AEQbTJ(new C6913aYO[0]);
    }

    @Override // o.AbstractC32806mkY
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl = context.getApplicationContext();
        C43457rpe.OLrzqt(context).EZpvd(isConnected);
        getFieldNames();
    }

    public final void getNewProxyInstance() {
        AhwBna.post(values);
    }

    public final void ejfBZ() {
        AhwBna.post(AYXKKw);
    }

    public final void getFieldNames() {
        if (valueOf()) {
            AkhnZx();
            return;
        }
        DbNXlk();
        long jValues = values();
        AhwBna.postDelayed(values, jValues);
        pUU.KWHzl("DataReporter", "postReportDelayed() time:" + jValues);
    }

    public final void DbNXlk() {
        AhwBna.removeCallbacks(values);
    }

    public final void AkhnZx() {
        if (!djBIcL.get()) {
            djBIcL.set(true);
            final InterfaceC6905aYG<C6913aYO> interfaceC6905aYGOLrzqt = ReportDatabase.Companion.OLrzqt(C6913aYO.class);
            AbstractC58247yxg<StatisticsResp> abstractC58247yxgObserveOn = AhwBna(interfaceC6905aYGOLrzqt).subscribeOn(DbNXlk).observeOn(DbNXlk);
            final Function1 function1 = new Function1() { // from class: o.aYb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6862aXQ.OLrzqt((StatisticsResp) obj);
                }
            };
            InterfaceC58227yxM<? super StatisticsResp> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aYc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6862aXQ.valueOf(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.aYe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6862aXQ.EZpvd(interfaceC6905aYGOLrzqt, (java.lang.Throwable) obj);
                }
            };
            abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.aYd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6862aXQ.AhwBna(function12, obj);
                }
            }, new InterfaceC58222yxH() { // from class: o.aYj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    C6862aXQ.EZpvd(interfaceC6905aYGOLrzqt);
                }
            });
            return;
        }
        pUU.KWHzl("DataReporter", "mIsDoReporting!!!,skip this time");
    }

    public static final Unit OLrzqt(StatisticsResp statisticsResp) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC6905aYG interfaceC6905aYG, java.lang.Throwable th) {
        fetchVPNInfo.set(false);
        EZpvd.set(android.os.SystemClock.elapsedRealtime());
        djBIcL.set(false);
        C6862aXQ c6862aXQ = AEQbTJ;
        java.lang.String strOLrzqt = c6862aXQ.OLrzqt(false, c6862aXQ.KWHzl((InterfaceC6905aYG<C6913aYO>) interfaceC6905aYG));
        c6862aXQ.getNewProxyInstance();
        pUU.copydefault("DataReporter", "makeReport->reportResult:" + strOLrzqt);
        pUU.copydefault("DataReporter", "makeReport->onError:" + th.getMessage());
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        pUU.copydefault("DataReporter", "makeReport->onError:" + (stackTrace != null ? yDV.joinToString$default(stackTrace, "\n", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) null, 62, (java.lang.Object) null) : null));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(InterfaceC6905aYG interfaceC6905aYG) {
        C6862aXQ c6862aXQ = AEQbTJ;
        long jKWHzl = c6862aXQ.KWHzl((InterfaceC6905aYG<C6913aYO>) interfaceC6905aYG);
        fetchVPNInfo.set(true);
        djBIcL.set(false);
        c6862aXQ.OLrzqt(true, jKWHzl);
        if (jKWHzl > 0) {
            pUU.KWHzl("DataReporter", "onCompleted() totalCount:" + jKWHzl + ", reDoReport()");
            c6862aXQ.ejfBZ();
            return;
        }
        EZpvd.set(android.os.SystemClock.elapsedRealtime());
    }

    public final java.lang.String OLrzqt(boolean z, long j) {
        java.lang.Long l = SPUtils.getLong("key_report_success_count", 0L, "sp_report_result");
        if (z) {
            SPUtils.put("key_report_success_count", java.lang.Long.valueOf(l.longValue() + 1), "sp_report_result");
            return "successCount:" + (l.longValue() + 1) + ";remainCount:" + j;
        }
        java.lang.Long l2 = SPUtils.getLong("key_report_fail_count", 0L, "sp_report_result");
        SPUtils.put("key_report_fail_count", java.lang.Long.valueOf(l2.longValue() + 1), "sp_report_result");
        double dLongValue = l2.longValue() + 1;
        long jLongValue = l2.longValue();
        Intrinsics.copydefault(l);
        return "successCount:" + l + ";failCount:" + (l2.longValue() + 1) + ";ratio:" + (dLongValue / ((jLongValue + 1) + l.longValue())) + ";remainCount:" + j;
    }

    public final AbstractC58247yxg<StatisticsResp> AhwBna(final InterfaceC6905aYG<C6913aYO> interfaceC6905aYG) {
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(interfaceC6905aYG);
        final Function1 function1 = new Function1() { // from class: o.aYf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6862aXQ.OLrzqt((InterfaceC6905aYG) obj);
            }
        };
        AbstractC58247yxg map = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.aYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C6862aXQ.AYXKKw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.aYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6862aXQ.KWHzl(interfaceC6905aYG, (kotlin.Pair) obj);
            }
        };
        AbstractC58247yxg<StatisticsResp> abstractC58247yxgFlatMap = map.flatMap(new InterfaceC58229yxO() { // from class: o.aYl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C6862aXQ.AkhnZx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgFlatMap, "");
        return abstractC58247yxgFlatMap;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(InterfaceC6905aYG interfaceC6905aYG) {
        Intrinsics.checkNotNullParameter(interfaceC6905aYG, "");
        java.util.List<C6913aYO> listCopydefault = AEQbTJ.copydefault((InterfaceC6905aYG<C6913aYO>) interfaceC6905aYG, 0L, 50L);
        listCopydefault.size();
        return new kotlin.Pair(interfaceC6905aYG, listCopydefault);
    }

    public static final InterfaceC58255yxo AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58255yxo) function1.invoke(obj);
    }

    public static final InterfaceC58255yxo KWHzl(InterfaceC6905aYG interfaceC6905aYG, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        final C6913aYO[] c6913aYOArr = (C6913aYO[]) ((java.util.Collection) pair.getSecond()).toArray(new C6913aYO[0]);
        if (!(c6913aYOArr.length == 0)) {
            java.lang.Object first = pair.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "");
            final InterfaceC6905aYG interfaceC6905aYG2 = (InterfaceC6905aYG) first;
            AbstractC58247yxg<StatisticsResp> abstractC58247yxgReportData = C6918aYT.Companion.KWHzl().reportData(AEQbTJ.KWHzl((C6913aYO[]) java.util.Arrays.copyOf(c6913aYOArr, c6913aYOArr.length)));
            final Function1 function1 = new Function1() { // from class: o.aXW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6862aXQ.EZpvd(c6913aYOArr, interfaceC6905aYG2, (StatisticsResp) obj);
                }
            };
            return abstractC58247yxgReportData.doOnNext(new InterfaceC58227yxM() { // from class: o.aXZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6862aXQ.DbNXlk(function1, obj);
                }
            });
        }
        pUU.EZpvd("DataReporter", "reportData()-->size:" + ((java.util.List) pair.getSecond()).size() + ",empty data,skip report!  dao:" + interfaceC6905aYG.getClass().getSimpleName());
        return AbstractC58247yxg.just(new StatisticsResp(1, java.lang.System.currentTimeMillis()));
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C6913aYO[] c6913aYOArr, InterfaceC6905aYG interfaceC6905aYG, StatisticsResp statisticsResp) {
        pUU.KWHzl("DataReporter", "doOnNext()-->delete size:" + c6913aYOArr.length + "  dao:" + interfaceC6905aYG.getClass().getSimpleName());
        interfaceC6905aYG.copydefault(java.util.Arrays.copyOf(c6913aYOArr, c6913aYOArr.length));
        return Unit.INSTANCE;
    }

    public final boolean valueOf() {
        if (EZpvd.get() == 0) {
            EZpvd.set(android.os.SystemClock.elapsedRealtime() - ((long) (10000 - (C34704nhP.copydefault.EZpvd() ? 2000 : 5000))));
            return false;
        }
        long jEZpvd = EZpvd(EZpvd.get());
        if (fetchVPNInfo.get()) {
            if (jEZpvd <= WorkRequest.MIN_BACKOFF_MILLIS) {
                return false;
            }
        } else if (jEZpvd <= WorkRequest.MIN_BACKOFF_MILLIS) {
            return false;
        }
        return true;
    }

    public final boolean gEmmrt() {
        return EZpvd(OLrzqt.get()) >= 2000;
    }

    public final long fIwbmz() {
        return ((long) 2000) - EZpvd(OLrzqt.get());
    }

    public final long EZpvd(long j) {
        return android.os.SystemClock.elapsedRealtime() - j;
    }

    public final long values() {
        long jEZpvd = EZpvd(EZpvd.get());
        fetchVPNInfo.get();
        return ((long) 10000) - jEZpvd;
    }

    public final boolean fARcdN() {
        android.content.Context context = KWHzl;
        if (context == null) {
            Intrinsics.gEmmrt("");
            context = null;
        }
        return C43457rpe.OLrzqt(context).OLrzqt();
    }

    public final void OLrzqt(@NotNull C6913aYO... c6913aYOArr) {
        Intrinsics.checkNotNullParameter(c6913aYOArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (C6913aYO c6913aYO : c6913aYOArr) {
            if (c6913aYO.OLrzqt()) {
                arrayList2.add(c6913aYO);
            } else {
                arrayList.add(c6913aYO);
            }
        }
        if (arrayList.size() > 0) {
            C6913aYO[] c6913aYOArr2 = (C6913aYO[]) arrayList.toArray(new C6913aYO[0]);
            AEQbTJ((C6913aYO[]) java.util.Arrays.copyOf(c6913aYOArr2, c6913aYOArr2.length));
        }
        if (arrayList2.size() > 0) {
            InterfaceC6905aYG<C6913aYO> interfaceC6905aYGOLrzqt = ReportDatabase.Companion.OLrzqt(C6913aYO.class);
            C6913aYO[] c6913aYOArr3 = (C6913aYO[]) arrayList2.toArray(new C6913aYO[0]);
            EZpvd(interfaceC6905aYGOLrzqt, (C6913aYO[]) java.util.Arrays.copyOf(c6913aYOArr3, c6913aYOArr3.length));
        }
    }

    public final void EZpvd(final InterfaceC6905aYG<C6913aYO> interfaceC6905aYG, final C6913aYO... c6913aYOArr) {
        if (fARcdN()) {
            AEQbTJ(KWHzl((C6913aYO[]) java.util.Arrays.copyOf(c6913aYOArr, c6913aYOArr.length)), new Function1() { // from class: o.aXV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6862aXQ.OLrzqt(interfaceC6905aYG, c6913aYOArr, (StatisticsResp) obj);
                }
            }, new Function1() { // from class: o.aXX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6862aXQ.OLrzqt(interfaceC6905aYG, c6913aYOArr, (java.lang.Throwable) obj);
                }
            });
        } else {
            copydefault(new InterfaceC58227yxM() { // from class: o.aXY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6862aXQ.EZpvd((long[]) obj);
                }
            }, new InterfaceC58227yxM() { // from class: o.aYa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C6862aXQ.djBIcL(interfaceC6905aYG, (java.lang.Throwable) obj);
                }
            }, interfaceC6905aYG, (C6913aYO[]) java.util.Arrays.copyOf(c6913aYOArr, c6913aYOArr.length));
        }
    }

    public static final Unit OLrzqt(InterfaceC6905aYG interfaceC6905aYG, C6913aYO[] c6913aYOArr, StatisticsResp statisticsResp) {
        Intrinsics.checkNotNullParameter(statisticsResp, "");
        pUU.KWHzl("DataReporter", "onNext->doReportFallbackSave()  dao:" + interfaceC6905aYG.getClass().getSimpleName() + "  resp:" + c6913aYOArr);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final InterfaceC6905aYG interfaceC6905aYG, C6913aYO[] c6913aYOArr, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("DataReporter", "error:" + th);
        AEQbTJ.copydefault(new InterfaceC58227yxM() { // from class: o.aXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6862aXQ.AEQbTJ((long[]) obj);
            }
        }, new InterfaceC58227yxM() { // from class: o.aXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6862aXQ.copydefault(interfaceC6905aYG, (java.lang.Throwable) obj);
            }
        }, interfaceC6905aYG, (C6913aYO[]) java.util.Arrays.copyOf(c6913aYOArr, c6913aYOArr.length));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(long[] jArr) {
        AEQbTJ.getFieldNames();
    }

    public static final void copydefault(InterfaceC6905aYG interfaceC6905aYG, java.lang.Throwable th) {
        pUU.copydefault("DataReporter", "onError->saveRecord()  dao:" + interfaceC6905aYG.getClass().getSimpleName() + "  error:" + th.getMessage());
    }

    public static final void EZpvd(long[] jArr) {
        AEQbTJ.getFieldNames();
    }

    public static final void djBIcL(InterfaceC6905aYG interfaceC6905aYG, java.lang.Throwable th) {
        pUU.copydefault("DataReporter", "onError->saveRecord() dao:" + interfaceC6905aYG.getClass().getSimpleName() + "  error:" + th.getMessage());
    }

    public final <T extends C6913aYO> StatisticsRequest<T> KWHzl(T... tArr) {
        C6900aYB c6900aYBEZpvd;
        C6900aYB c6900aYB = null;
        try {
            c6900aYBEZpvd = C6901aYC.copydefault.EZpvd();
        } catch (java.lang.Exception e) {
            pUU.copydefault("DataReporter", "buildClientInfo-->onError:" + e.getMessage());
            c6900aYBEZpvd = null;
        }
        if (c6900aYBEZpvd == null) {
            Intrinsics.gEmmrt("");
        } else {
            c6900aYB = c6900aYBEZpvd;
        }
        StatisticsRequest<T> statisticsRequest = new StatisticsRequest<>(c6900aYB);
        if (!(tArr.length == 0)) {
            statisticsRequest.addAll(yDT.fIwbmz(tArr));
        }
        return statisticsRequest;
    }

    public final <T extends C6913aYO> InterfaceC58217yxC AEQbTJ(StatisticsRequest<T> statisticsRequest, Function1<? super StatisticsResp, Unit> function1, Function1<? super java.lang.Throwable, Unit> function12) {
        AbstractC58247yxg<StatisticsResp> abstractC58247yxgReportData = C6918aYT.Companion.KWHzl().reportData(statisticsRequest);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgReportData, "");
        return C33527myD.subscribeOnIO$default(abstractC58247yxgReportData, function12, (Function0) null, function1, 2, (java.lang.Object) null);
    }

    public static final long[] gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (long[]) function1.invoke(obj);
    }

    public final InterfaceC58217yxC copydefault(@NotNull InterfaceC58227yxM<long[]> interfaceC58227yxM, @NotNull InterfaceC58227yxM<java.lang.Throwable> interfaceC58227yxM2, @NotNull final InterfaceC6905aYG<C6913aYO> interfaceC6905aYG, @NotNull C6913aYO... c6913aYOArr) {
        Intrinsics.checkNotNullParameter(interfaceC58227yxM, "");
        Intrinsics.checkNotNullParameter(interfaceC58227yxM2, "");
        Intrinsics.checkNotNullParameter(interfaceC6905aYG, "");
        Intrinsics.checkNotNullParameter(c6913aYOArr, "");
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(c6913aYOArr);
        final Function1 function1 = new Function1() { // from class: o.aYn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6862aXQ.OLrzqt(interfaceC6905aYG, (C6913aYO[]) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.aYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C6862aXQ.gEmmrt(function1, obj);
            }
        }).subscribeOn(DbNXlk).observeOn(C58266yxz.OLrzqt()).subscribe(interfaceC58227yxM, interfaceC58227yxM2);
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
        return interfaceC58217yxCSubscribe;
    }

    public static final long[] OLrzqt(InterfaceC6905aYG interfaceC6905aYG, C6913aYO[] c6913aYOArr) {
        Intrinsics.checkNotNullParameter(c6913aYOArr, "");
        C6862aXQ c6862aXQ = AEQbTJ;
        long jKWHzl = (c6862aXQ.KWHzl((InterfaceC6905aYG<C6913aYO>) interfaceC6905aYG) + ((long) c6913aYOArr.length)) - 1000;
        if (jKWHzl > 0) {
            java.util.List<C6913aYO> listCopydefault = c6862aXQ.copydefault((InterfaceC6905aYG<C6913aYO>) interfaceC6905aYG, 0L, jKWHzl);
            if (!listCopydefault.isEmpty()) {
                C6913aYO[] c6913aYOArr2 = (C6913aYO[]) listCopydefault.toArray(new C6913aYO[0]);
                interfaceC6905aYG.copydefault(java.util.Arrays.copyOf(c6913aYOArr2, c6913aYOArr2.length));
            }
        }
        return interfaceC6905aYG.OLrzqt(java.util.Arrays.copyOf(c6913aYOArr, c6913aYOArr.length));
    }

    public final void AEQbTJ(@NotNull C6913aYO... c6913aYOArr) {
        Intrinsics.checkNotNullParameter(c6913aYOArr, "");
        if (c6913aYOArr.length != 0) {
            java.util.List<C6913aYO> list = gEmmrt;
            Intrinsics.checkNotNullExpressionValue(list, "");
            C56406yEe.KWHzl(list, c6913aYOArr);
        }
        if (gEmmrt()) {
            fetchVPNInfo();
            return;
        }
        android.os.Handler handler = AhwBna;
        java.lang.Runnable runnable = AkhnZx;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, fIwbmz());
    }

    public final void fetchVPNInfo() {
        java.util.List<C6913aYO> list = gEmmrt;
        if (list.size() == 0) {
            pUU.EZpvd("DataReporter", "doEventSave() mEventPendingList isEmpty,skip this time");
            return;
        }
        if (valueOf.get()) {
            return;
        }
        valueOf.set(true);
        final java.util.ArrayList arrayList = new java.util.ArrayList(list);
        InterfaceC58227yxM<long[]> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6862aXQ.KWHzl(arrayList, (long[]) obj);
            }
        };
        InterfaceC58227yxM<java.lang.Throwable> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.aYi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6862aXQ.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC6905aYG<C6913aYO> interfaceC6905aYGOLrzqt = ReportDatabase.Companion.OLrzqt(C6913aYO.class);
        C6913aYO[] c6913aYOArr = (C6913aYO[]) arrayList.toArray(new C6913aYO[0]);
        copydefault(interfaceC58227yxM, interfaceC58227yxM2, interfaceC6905aYGOLrzqt, (C6913aYO[]) java.util.Arrays.copyOf(c6913aYOArr, c6913aYOArr.length));
    }

    public static final void KWHzl(java.util.ArrayList arrayList, long[] jArr) {
        java.util.List<C6913aYO> list = gEmmrt;
        list.size();
        list.removeAll(arrayList);
        int size = list.size();
        OLrzqt.set(android.os.SystemClock.elapsedRealtime());
        valueOf.set(false);
        if (size > 0) {
            AEQbTJ.AEQbTJ(new C6913aYO[0]);
        }
        AEQbTJ.getFieldNames();
    }

    public static final void copydefault(java.lang.Throwable th) {
        OLrzqt.set(android.os.SystemClock.elapsedRealtime());
        valueOf.set(false);
        pUU.copydefault("DataReporter", "doEventSave() error:" + th.getMessage());
        int size = gEmmrt.size();
        if (size > 0) {
            pUU.KWHzl("DataReporter", "doEventSave() remainSize =" + size + " ,scheduleEventSave-->");
            AEQbTJ.AEQbTJ(new C6913aYO[0]);
        }
    }

    public final java.util.List<C6913aYO> copydefault(@NotNull InterfaceC6905aYG<C6913aYO> interfaceC6905aYG, long j, long j2) {
        Intrinsics.checkNotNullParameter(interfaceC6905aYG, "");
        if (ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, new StateListAnimator(), null, 2, null)) {
            return interfaceC6905aYG.KWHzl(j, j2, isConnected());
        }
        return interfaceC6905aYG.OLrzqt(j, j2);
    }

    public final long KWHzl(@NotNull InterfaceC6905aYG<C6913aYO> interfaceC6905aYG) {
        Intrinsics.checkNotNullParameter(interfaceC6905aYG, "");
        if (ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, new StateListAnimator(), null, 2, null)) {
            return interfaceC6905aYG.copydefault(isConnected());
        }
        return interfaceC6905aYG.EZpvd();
    }

    public final java.lang.String isConnected() {
        java.lang.String str;
        java.util.List<InterfaceC35206nqu> listAuCTel = AuCTel();
        if (listAuCTel != null) {
            java.util.Iterator<T> it = listAuCTel.iterator();
            while (it.hasNext()) {
                str = ((InterfaceC35206nqu) it.next()).KWHzl().get("_user_id");
                if (str != null) {
                    break;
                }
            }
            str = null;
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        java.lang.String string = jSONObject.put("_user_id", str).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        pUU.EZpvd("DataReporter", "escapedUserId " + string);
        return StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringAfter$default(string, ":\"", (java.lang.String) null, 2, (java.lang.Object) null), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
