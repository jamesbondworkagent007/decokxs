package com.okinc.common.application;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.TextViewCompat;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.engagelab.privates.common.MTCommon;
import com.engagelab.privates.common.business.lifecycle.MTLifecycleBusiness;
import com.engagelab.privates.common.business.network.MTNetworkBusiness;
import com.engagelab.privates.common.observer.MTObservable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.okinc.base.thread.TPM;
import com.okinc.base.utils.OkUtils;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.biz.net.common.InterceptorTimeoutMonitor;
import com.okinc.business.appupdate.update.RequireUpgradeHandler;
import com.okinc.common.application.BaseApplication;
import com.okinc.common.network.NetworkInit;
import com.okinc.common.network.PredefinedDoHChains;
import com.okinc.common.okcore.OKCoreInit;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.dynamicfeature.manage.FeatureException;
import com.okinc.lib.dionysus.crash.DeviceInfoHelper;
import com.okinc.lib.monitor.LooperMonitor;
import com.okinc.localization.LocalizeResources;
import com.okinc.localization.util.currency.CurrencyProxy;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.log.LogLevel;
import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.dns.model.DoHChain;
import com.okinc.network.okg.unifieddomain.DomainType;
import com.okinc.okapm.Apm;
import com.okinc.okapm.common.AppStartMode;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.okex.deeplink.SchemeActivity;
import com.okinc.okpush.sdk.config.OKPushConfig;
import com.okinc.okuser.data.User;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.stub.CheckedSharedPreferences;
import com.okinc.web.WebStringEnum;
import com.tencent.mmkv.MMKV;
import dagger.Lazy;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC32486meW;
import o.AbstractC42536rWm;
import o.AbstractC58185ywX;
import o.ActivityC32554mfl;
import o.C30359lVl;
import o.C31968mKp;
import o.C32408mcY;
import o.C32479meP;
import o.C32481meR;
import o.C32482meS;
import o.C32483meT;
import o.C32487meX;
import o.C32489meZ;
import o.C32547mfe;
import o.C32549mfg;
import o.C32551mfi;
import o.C32562mft;
import o.C32563mfu;
import o.C32573mgD;
import o.C32578mgI;
import o.C32582mgM;
import o.C32608mgm;
import o.C32609mgn;
import o.C32613mgr;
import o.C32650mhb;
import o.C32659mhk;
import o.C32660mhl;
import o.C32662mhn;
import o.C32859mlY;
import o.C32864mld;
import o.C32866mlf;
import o.C32867mlg;
import o.C32871mlk;
import o.C32883mlw;
import o.C32923mmj;
import o.C32927mmn;
import o.C32931mmr;
import o.C32935mmv;
import o.C32979mnm;
import o.C32981mno;
import o.C32986mnt;
import o.C33051mpE;
import o.C33069mpW;
import o.C33070mpX;
import o.C33081mpi;
import o.C33083mpk;
import o.C33087mpo;
import o.C33088mpp;
import o.C33095mpw;
import o.C33129mqd;
import o.C33482mxL;
import o.C33492mxV;
import o.C33551myb;
import o.C33570myu;
import o.C34703nhO;
import o.C34704nhP;
import o.C34717nhc;
import o.C34733nhs;
import o.C35202nqq;
import o.C3567AoQ;
import o.C38303pTu;
import o.C38348pVl;
import o.C42543rWt;
import o.C42548rWy;
import o.C4298Bav;
import o.C43246rlf;
import o.C43248rlh;
import o.C43270rmC;
import o.C43292rmY;
import o.C43308rmo;
import o.C43372rnz;
import o.C43384roK;
import o.C43385roL;
import o.C43386roM;
import o.C43398roY;
import o.C43418ros;
import o.C43461rpi;
import o.C43466rpn;
import o.C44107sDp;
import o.C44712scB;
import o.C46979thQ;
import o.C47239tmL;
import o.C48787ucK;
import o.C48801ucY;
import o.C48844udO;
import o.C48863udh;
import o.C49328umV;
import o.C52761wXj;
import o.C52762wXk;
import o.C54807xWa;
import o.C54819xWm;
import o.C55110xdk;
import o.C55123xdx;
import o.C55328xhq;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.C57309yfw;
import o.C57363ygx;
import o.C57601ylW;
import o.C58113yvE;
import o.C6767aVb;
import o.C6769aVd;
import o.C6770aVe;
import o.C6773aVh;
import o.C6777aVl;
import o.C6832aWn;
import o.C6878aXg;
import o.C6885aXn;
import o.C6887aXp;
import o.C8043avL;
import o.C8087awC;
import o.InterfaceC32484meU;
import o.InterfaceC32485meV;
import o.InterfaceC32607mgl;
import o.InterfaceC32855mlU;
import o.InterfaceC32861mla;
import o.InterfaceC35209nqx;
import o.InterfaceC43216rlB;
import o.InterfaceC43259rls;
import o.InterfaceC44717scG;
import o.InterfaceC47230tmC;
import o.InterfaceC47278tmy;
import o.InterfaceC48788ucL;
import o.InterfaceC54816xWj;
import o.InterfaceC56387yDm;
import o.InterfaceC58227yxM;
import o.InterfaceC6831aWm;
import o.InterfaceC6884aXm;
import o.YG;
import o.mNP;
import o.mNS;
import o.oJV;
import o.oJX;
import o.pJW;
import o.pSE;
import o.pSQ;
import o.pTF;
import o.pTN;
import o.pTU;
import o.pUQ;
import o.pUU;
import o.pUX;
import o.rWF;
import o.xVW;
import o.xVY;
import o.yBG;
import o.yCM;
import o.yDV;
import o.yDY;
import o.yHO;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseApplication extends android.app.Application implements C34717nhc.StateListAnimator, MessageQueue.IdleHandler {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public AtomicBoolean AEQbTJ;
    public Resources AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC42536rWm DbNXlk;
    public final long EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;
    public int djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public int gEmmrt;
    public C6777aVl isConnected;

    @yCM
    public Lazy<pTN> localizationInit;

    @yCM
    public Lazy<pTU> localizeService;
    public boolean valueOf;
    public final InterfaceC56387yDm values;

    public static final class StateListAnimator extends C32927mmn {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public String EZpvd() {
            return "mobile_infra_interceptor_monitor";
        }
    }

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NetworkStringEnum.values().length];
            try {
                iArr[NetworkStringEnum.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkStringEnum.IDAUTH_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[WebStringEnum.values().length];
            try {
                iArr2[WebStringEnum.BTN_SAVE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WebStringEnum.BTN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WebStringEnum.BTN_OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WebStringEnum.BTN_RELOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WebStringEnum.FIXED_LINK_SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[WebStringEnum.EMPTY_TITLE_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            copydefault = iArr2;
        }
    }

    public abstract InterfaceC32485meV QfsBiF();

    public BaseApplication() {
        C48844udO.EZpvd();
        EZpvd(QVAiDq());
        AEQbTJ(Apm.EventType.APP_START.getValue(), Boolean.FALSE);
        this.EZpvd = System.currentTimeMillis();
        this.AEQbTJ = new AtomicBoolean(false);
        this.values = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mcV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QSBOWP();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.mcR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.DCUTEIdCUTEI(this.AEQbTJ);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mdb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.DAIeex(this.AEQbTJ);
            }
        });
        this.valueOf = true;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mdn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.accept(this.KWHzl);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.mdA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.wlaJM();
            }
        });
    }

    public InterfaceC32484meU QVAiDq() {
        return new C32489meZ(null, null, 0, false, null, null, false, false, false, null, false, false, false, false, false, false, false, false, null, null, null, 2097151, null);
    }

    public boolean AxsJAYsNCnLh() {
        return InterfaceC32484meU.Companion.KWHzl().fJNWhG();
    }

    public String aKErDB() {
        return InterfaceC32484meU.Companion.KWHzl().fIwbmz();
    }

    public final InterfaceC47278tmy UeEOUB() {
        return (InterfaceC47278tmy) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC47278tmy QSBOWP() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public final Lazy<pTN> QbewEr() {
        Lazy<pTN> lazy = this.localizationInit;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final Lazy<pTU> RcXXUw() {
        Lazy<pTU> lazy = this.localizeService;
        if (lazy != null) {
            return lazy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final C32650mhb DCUTEIdCUTEI(BaseApplication baseApplication) {
        return new C32650mhb(baseApplication, null, null, null, null, 30, null);
    }

    public final C32650mhb djSkpj() {
        return (C32650mhb) this.AhwBna.getValue();
    }

    public static final C32573mgD DAIeex(BaseApplication baseApplication) {
        return new C32573mgD(baseApplication, null, 2, 0 == true ? 1 : 0);
    }

    public final C32573mgD QUSxYX() {
        return (C32573mgD) this.KWHzl.getValue();
    }

    public final MessageQueue.IdleHandler RJOkX() {
        return (MessageQueue.IdleHandler) this.copydefault.getValue();
    }

    public static final MessageQueue.IdleHandler accept(final BaseApplication baseApplication) {
        return new MessageQueue.IdleHandler() { // from class: o.mdu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return BaseApplication.QKudOq(this.EZpvd);
            }
        };
    }

    public static final boolean QKudOq(BaseApplication baseApplication) {
        baseApplication.ffGIBT();
        return false;
    }

    public final rWF dNCPSb() {
        return (rWF) this.fetchVPNInfo.getValue();
    }

    public static final rWF wlaJM() {
        return new rWF(true, InterfaceC32484meU.Companion.KWHzl().djBIcL());
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.common.application.BaseApplication.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void EZpvd(InterfaceC32484meU interfaceC32484meU) {
        InterfaceC32484meU.Companion.OLrzqt(interfaceC32484meU);
        C33083mpk.KWHzl.EZpvd(C56424yEw.isConnected(interfaceC32484meU.AkhnZx()));
        C32487meX c32487meX = C32487meX.AEQbTJ;
        c32487meX.EZpvd(interfaceC32484meU.djBIcL());
        c32487meX.copydefault(Boolean.valueOf(Intrinsics.EZpvd((Object) c32487meX.KWHzl(), (Object) "cn") || Intrinsics.EZpvd((Object) c32487meX.KWHzl(), (Object) "china")));
        OKPushConfig.copydefault.copydefault(new Function1() { // from class: o.mdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        C33482mxL.KWHzl = interfaceC32484meU.djBIcL();
        ReportManager.AEQbTJ.copydefault(interfaceC32484meU.djBIcL());
        C34703nhO.OLrzqt(interfaceC32484meU.EZpvd());
        C34703nhO.EZpvd(Boolean.valueOf(interfaceC32484meU.values()));
        C33051mpE.AEQbTJ.OLrzqt(true);
        C42543rWt.KWHzl.AEQbTJ(new yHO() { // from class: o.mdP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BaseApplication.KWHzl((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        C32864mld.OLrzqt.copydefault(new BaseApplication$initCommon$3(this));
    }

    public static final Unit AEQbTJ(BaseApplication baseApplication, String str) {
        Intent intent = new Intent(baseApplication, (Class<?>) SchemeActivity.class);
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        baseApplication.startActivity(intent);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        mNS.copydefault.EZpvd(str, str2, str3);
        return Unit.INSTANCE;
    }

    public final boolean DAIeex() {
        return C35202nqq.OLrzqt.AEQbTJ("network_enable_event_reporter");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.attachBaseContext(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        OkUtils.EZpvd(this);
        C43246rlf.OLrzqt.OLrzqt((android.app.Application) this);
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        c32979mnm.EZpvd(this);
        c32979mnm.KWHzl(aKErDB());
        mNP.AEQbTJ.KWHzl();
        AxsJAYaxsJAY();
        if (QKudOq()) {
            C32660mhl.EZpvd("attachBaseContext - pushOptimizationInit()", new Function0() { // from class: o.meE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BaseApplication.iRxXKY(this.KWHzl);
                }
            });
        }
        C32660mhl.EZpvd("attachBaseContext - initDionysus()", new Function0() { // from class: o.mcT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.hUfVAv(this.KWHzl);
            }
        });
        C32660mhl.EZpvd("attachBaseContext - initAppBaseConfig()", new Function0() { // from class: o.mcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.gGvvIC(this.KWHzl);
            }
        });
        C32660mhl.EZpvd("attachBaseContext - exceptionHandler.register()", new Function0() { // from class: o.mcZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.fJNWhG();
            }
        });
        C32660mhl.EZpvd("attachBaseContext - initBugReport()", new Function0() { // from class: o.mcX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.AxsJAYaxsJAY(this.AEQbTJ);
            }
        });
        C32660mhl.EZpvd("attachBaseContext - initOKQPL()", new C32408mcY(this));
        InterfaceC32484meU.Activity activity = InterfaceC32484meU.Companion;
        if (activity.KWHzl().valueOf()) {
            C32662mhn.OLrzqt(this);
        }
        if (QUSxYX().AEQbTJ(true, "BaseApp.attachBaseContext")) {
            return;
        }
        C32660mhl.EZpvd("attachBaseContext - attachBaseContext()", new Function0() { // from class: o.mda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.EZpvd(this.OLrzqt, context);
            }
        });
        C32660mhl.EZpvd("attachBaseContext - splitCompat.install()", new Function0() { // from class: o.mcW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.iZzfmt(this.EZpvd);
            }
        });
        C32660mhl.EZpvd("attachBaseContext - splitCompat.install()", new Function0() { // from class: o.mdf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.fARcdN();
            }
        });
        try {
            if (QKudOq()) {
                if (activity.KWHzl().OLrzqt()) {
                    OLrzqt(true, activity.KWHzl().copydefault());
                }
                registerActivityLifecycleCallbacks(dNCPSb());
            }
        } catch (Exception e) {
            pUU.copydefault("ApplicationProxy", "Startup OKexApp " + e.getMessage());
        }
        pUU.KWHzl("ApplicationProxy", "cost time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static final Unit iRxXKY(BaseApplication baseApplication) {
        C43418ros.OLrzqt.OLrzqt(baseApplication, true, new ActionBar());
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements C43418ros.StateListAnimator {
        @Override // o.C43418ros.StateListAnimator
        public void copydefault(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            EventData eventData = new EventData();
            eventData.setAct(EventAction.PUSH_NETWORK_OPTIMIZATION.getType());
            eventData.setCode(str);
            eventData.setMsg(str2);
            eventData.setSource(str4);
            eventData.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("full_url", str3), C56390yDp.OLrzqt("type", str5)));
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
    }

    public static final Unit hUfVAv(BaseApplication baseApplication) {
        baseApplication.QUSxYX().KWHzl(baseApplication.AxsJAYsNCnLh());
        return Unit.INSTANCE;
    }

    public static final Unit gGvvIC(BaseApplication baseApplication) {
        baseApplication.dxcTrN();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG() {
        C6770aVe.Companion.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAYaxsJAY(BaseApplication baseApplication) {
        baseApplication.dvKsVJ();
        return Unit.INSTANCE;
    }

    public static final Unit gkJEwt(BaseApplication baseApplication) {
        baseApplication.hUfVAv();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(BaseApplication baseApplication, Context context) {
        baseApplication.QfsBiF().AEQbTJ(context);
        return Unit.INSTANCE;
    }

    public static final Unit iZzfmt(BaseApplication baseApplication) {
        C34717nhc.Companion.KWHzl(baseApplication, baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN() {
        C35202nqq.OLrzqt.AEQbTJ("report_exposed_classes", new FragmentManager());
        return Unit.INSTANCE;
    }

    public static final class FragmentManager implements InterfaceC35209nqx {
        @Override // o.InterfaceC35209nqx
        public void AEQbTJ(boolean z) {
            pSQ.copydefault.copydefault(z);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mgD.showErrorIgnoreInit$default(o.mgD, boolean, java.lang.String, int, java.lang.Object):boolean */
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        C32578mgI.AEQbTJ(this);
        fFgQHt();
        iZzfmt();
        OKCoreInit.INSTANCE.initJNA(this);
        long jCurrentTimeMillis = System.currentTimeMillis();
        finit();
        pUU.KWHzl("ApplicationProxy", "beforeCostTime " + (jCurrentTimeMillis - this.EZpvd) + ",initCrashlyticsCostTime " + (System.currentTimeMillis() - jCurrentTimeMillis));
        C57309yfw.AEQbTJ.copydefault(this);
        if (C32573mgD.showErrorIgnoreInit$default(QUSxYX(), false, "BaseApp.onCreate", 1, null)) {
            return;
        }
        if (Intrinsics.EZpvd((Object) (getPackageName() + ":fcm"), (Object) C43308rmo.copydefault(this))) {
            return;
        }
        if (QKudOq()) {
            giSNqX();
        }
        djSkpj().copydefault(AxsJAYsNCnLh());
        RlQdEF();
        rWF.Companion.OLrzqt(new Function0() { // from class: o.mdY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.spnCvw(this.EZpvd);
            }
        });
        if (QKudOq()) {
            C44107sDp.copydefault();
            try {
                dNCPSb().AEQbTJ(C43308rmo.OLrzqt(this));
                dNCPSb().KWHzl(SPUtils.getBoolean("first_launch", true));
            } catch (Exception e) {
                pUU.copydefault("ApplicationProxy", "Startup foreground OKexApp " + e.getMessage());
            }
        }
    }

    public static final Unit spnCvw(BaseApplication baseApplication) {
        pUU.KWHzl("startup", "onFirstRenderFinish");
        baseApplication.djSkpj().fIwbmz();
        C48844udO.OLrzqt();
        C43246rlf.OLrzqt.EZpvd();
        baseApplication.QbewEr().get().EZpvd();
        Looper.myQueue().addIdleHandler(baseApplication);
        return Unit.INSTANCE;
    }

    public void finit() {
        try {
            zuBGHE();
            InterfaceC32484meU.Companion.KWHzl().uzCIH();
        } catch (Throwable th) {
            pUU.copydefault("ApplicationProxy", "initCrashlytics " + th);
        }
    }

    public final void zuBGHE() {
        if (InterfaceC32484meU.Companion.KWHzl().gEmmrt()) {
            pUU.KWHzl("ApplicationProxy", "configFirebaseCrashlytics start");
            long jCurrentTimeMillis = System.currentTimeMillis();
            C6777aVl c6777aVl = this.isConnected;
            if (c6777aVl != null) {
                String strCopydefault = QfsBiF().copydefault();
                User userOLrzqt = UeEOUB().OLrzqt();
                c6777aVl.copydefault(this, strCopydefault, userOLrzqt != null ? userOLrzqt.getUid() : null, mNP.AEQbTJ.copydefault());
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            pUU.KWHzl("ApplicationProxy", "configFirebaseCrashlytics end cost " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " , thread " + Thread.currentThread().getName());
        }
    }

    public final void fFgQHt() {
        if (!xVW.OLrzqt(this).booleanValue()) {
            xVW.copydefault(this);
            this.valueOf = false;
        }
        xVW.EZpvd(this);
        pUU.KWHzl("ApplicationProxy", "device id " + xVW.copydefault());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.meS.registerTask$default(o.meS, java.lang.String, boolean, boolean, int, java.util.List, kotlin.jvm.functions.Function0, int, java.lang.Object):o.meS */
    public final void RlQdEF() {
        C32482meS c32482meS;
        C32660mhl.EZpvd("OKCore - init", new Function0() { // from class: o.med
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.DarRvM(this.OLrzqt);
            }
        });
        if (!this.valueOf) {
            UeEOUB().fARcdN();
        }
        if (C54807xWa.AEQbTJ()) {
            pUU.KWHzl("Monitor.Device", "InitTaskManager use single Thread Pool");
            c32482meS = new C32482meS(this, ThreadUtils.gEmmrt());
        } else {
            pUU.KWHzl("Monitor.Device", "InitTaskManager use normal Thread Pool");
            c32482meS = new C32482meS(this, null);
        }
        C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerTask$default(copydefault(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerUIProcessTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(C32482meS.registerTask$default(c32482meS, "InitIMC", false, false, 20, null, new Function0() { // from class: o.mek
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.DXXBbs(this.copydefault);
            }
        }, 20, null), "installAurora", false, true, 10, null, new Function0() { // from class: o.mex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.DCJXGO(this.EZpvd);
            }
        }, 18, null), "installHms", false, true, 10, null, new Function0() { // from class: o.meC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.OqFWZa(this.AEQbTJ);
            }
        }, 18, null), "TrackInitManager", false, true, 0, null, new Function0() { // from class: o.mez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.zuWLRA(this.EZpvd);
            }
        }, 26, null), "init_amplitude", false, true, 0, null, new Function0() { // from class: o.meA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.OuxcSI(this.copydefault);
            }
        }, 26, null), "init_byte_dance", false, true, 0, null, new Function0() { // from class: o.mey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.ffGIBT(this.KWHzl);
            }
        }, 26, null), "WidgetEnv", false, true, 0, null, new Function0() { // from class: o.meB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.DCUTEI(this.EZpvd);
            }
        }, 24, null), "setTextAppearance", false, false, 0, null, new Function0() { // from class: o.meH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.RKDWNf(this.AEQbTJ);
            }
        }, 30, null), "Router", false, true, 0, null, new Function0() { // from class: o.meF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.hDKMBd();
            }
        }, 26, null), "Network", false, true, 10, null, new Function0() { // from class: o.meb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QkdxfA(this.EZpvd);
            }
        }, 18, null), "init_firebase_crashlytics_proxy", false, false, 0, C56402yEa.EZpvd("Network"), new Function0() { // from class: o.mdZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QSBOWP(this.KWHzl);
            }
        }, 14, null), "RemoteConfig", false, false, 0, C56402yEa.EZpvd("Network"), new Function0() { // from class: o.mec
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.hBpjJd(this.AEQbTJ);
            }
        }, 14, null), "Analytics", false, true, 0, yDY.gEmmrt("Network", "TrackInitManager", "init_amplitude"), new Function0() { // from class: o.mea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.gwTjWJ(this.AEQbTJ);
            }
        }, 8, null), "InitWebView", false, true, 0, null, new Function0() { // from class: o.mee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.RdAHlO(this.AEQbTJ);
            }
        }, 26, null), "Keys", false, false, 0, null, new Function0() { // from class: o.meg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.hrNTAI(this.EZpvd);
            }
        }, 30, null), "Localization", false, true, 0, yDY.gEmmrt("Network", "init_amplitude"), new Function0() { // from class: o.mef
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.ODXsMY(this.copydefault);
            }
        }, 8, null), "GlobalDispatchCreate", false, true, 0, yDY.gEmmrt("InitIMC", "Network"), new Function0() { // from class: o.meh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.uzCIH();
            }
        }, 8, null)), "OKDebugger", false, true, 0, C56402yEa.EZpvd("Network"), new Function0() { // from class: o.men
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.getNewProxyInstance();
            }
        }, 8, null), "OAppManager", false, true, 0, null, new Function0() { // from class: o.mem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.DLWbHP(this.AEQbTJ);
            }
        }, 24, null), "WidgetConfig", false, false, 0, null, new Function0() { // from class: o.mej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QCjLjM(this.EZpvd);
            }
        }, 30, null), "MinorTasks", false, false, -1, null, new Function0() { // from class: o.mel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QSLkRj(this.KWHzl);
            }
        }, 22, null), "DebugManager", false, false, 0, yDY.gEmmrt("GlobalDispatchCreate", "OAppManager"), new Function0() { // from class: o.mes
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QVsKAR(this.copydefault);
            }
        }, 14, null), "initNightMode", false, true, 0, null, new Function0() { // from class: o.meo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QwvEab(this.OLrzqt);
            }
        }, 26, null), "initReport", false, true, 0, null, new Function0() { // from class: o.mer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.aUsmxb(this.AEQbTJ);
            }
        }, 26, null), "UINetwork", false, false, 0, yDY.gEmmrt("Network", "WidgetEnv"), new Function0() { // from class: o.mep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.USBtdM(this.copydefault);
            }
        }, 14, null), "initMonitor", false, false, 0, null, new Function0() { // from class: o.mev
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.dUDNAs(this.AEQbTJ);
            }
        }, 30, null), "Pandora", false, false, 0, C56402yEa.EZpvd("Network"), new Function0() { // from class: o.mew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.UlJrfe(this.KWHzl);
            }
        }, 12, null), "RiskService", false, false, -1, null, new Function0() { // from class: o.met
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.fdOvFl(this.EZpvd);
            }
        }, 22, null), "initScreenshot", false, true, 0, null, new Function0() { // from class: o.meu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.fERRXa(this.OLrzqt);
            }
        }, 26, null).OLrzqt();
        if (QKudOq()) {
            Looper.myQueue().addIdleHandler(RJOkX());
            gHZMYf();
        }
    }

    public static final Unit DarRvM(BaseApplication baseApplication) {
        OKCoreInit.INSTANCE.init(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit DXXBbs(final BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.KWHzl("init_imc_start");
        C32660mhl.EZpvd("InitIMC", new Function0() { // from class: o.meJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.ODWQjV(this.EZpvd);
            }
        });
        c42548rWy.KWHzl("init_imc_end");
        return Unit.INSTANCE;
    }

    public static final Unit ODWQjV(BaseApplication baseApplication) {
        baseApplication.AEQbTJ(baseApplication, InterfaceC32484meU.Companion.KWHzl().KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit DCJXGO(BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_aurora_sdk_start");
        baseApplication.fZBcTu();
        baseApplication.gasjUx();
        c42548rWy.AEQbTJ("init_aurora_sdk_end");
        return Unit.INSTANCE;
    }

    public static final Unit OqFWZa(BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_hms_sdk_start");
        baseApplication.gGvvIC();
        c42548rWy.AEQbTJ("init_hms_sdk_end");
        return Unit.INSTANCE;
    }

    public static final Unit zuWLRA(BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_track_start");
        baseApplication.registerActivityLifecycleCallbacks(new C32923mmj());
        C32931mmr.Companion.KWHzl("[New] AppLifecycleAnalyticsCallbacks registered.");
        C32871mlk.Companion.copydefault(baseApplication);
        c42548rWy.AEQbTJ("init_track_end");
        return Unit.INSTANCE;
    }

    public static final Unit OuxcSI(BaseApplication baseApplication) {
        baseApplication.DarRvM();
        C48801ucY.AEQbTJ.AEQbTJ();
        C32883mlw.Companion.KWHzl(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit ffGIBT(BaseApplication baseApplication) {
        C32859mlY.KWHzl.AEQbTJ(InterfaceC32607mgl.Companion.copydefault(baseApplication.QVAiDq()));
        return Unit.INSTANCE;
    }

    public static final Unit DCUTEI(final BaseApplication baseApplication) {
        C32660mhl.EZpvd("WidgetEnv - init", new Function0() { // from class: o.meG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.getPostValueLengthLimit(this.copydefault);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit getPostValueLengthLimit(BaseApplication baseApplication) {
        C57601ylW.OLrzqt(baseApplication, baseApplication.AxsJAYsNCnLh());
        C52762wXk.AEQbTJ.copydefault(new Function1() { // from class: o.meK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(BaseApplication.KWHzl((java.lang.String) obj));
            }
        });
        C55123xdx.Companion.copydefault(C33482mxL.KWHzl());
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(String str) {
        String strEZpvd = C43386roM.EZpvd.EZpvd();
        if (strEZpvd == null) {
            return false;
        }
        String host = new URL(str).getHost();
        Intrinsics.checkNotNullExpressionValue(host, "");
        return StringsKt__StringsKt.contains$default((CharSequence) strEZpvd, (CharSequence) host, false, 2, (Object) null);
    }

    public static final Unit RKDWNf(BaseApplication baseApplication) {
        try {
            AppCompatTextView appCompatTextView = new AppCompatTextView(baseApplication);
            TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.fFgQHt);
            TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.giSNqX);
            TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.gGvvIC);
            ResourcesCompat.getFont(baseApplication, C52761wXj.Dialog.KWHzl);
            ResourcesCompat.getFont(baseApplication, C52761wXj.Dialog.AEQbTJ);
            ResourcesCompat.getFont(baseApplication, C52761wXj.Dialog.EZpvd);
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd() {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_router_start");
        c42548rWy.AEQbTJ("init_router_end");
        return Unit.INSTANCE;
    }

    public static final Unit QkdxfA(final BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_network_start");
        C32660mhl.EZpvd("Network-Setup", new Function0() { // from class: o.mdN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.QHmsKR(this.copydefault);
            }
        });
        C32660mhl.EZpvd("Network-Extra", new Function0() { // from class: o.mdK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.OBJEWx(this.KWHzl);
            }
        });
        c42548rWy.AEQbTJ("init_network_end");
        return Unit.INSTANCE;
    }

    public static final Unit QHmsKR(BaseApplication baseApplication) {
        baseApplication.OqFWZa();
        return Unit.INSTANCE;
    }

    public static final Unit OBJEWx(BaseApplication baseApplication) {
        baseApplication.QfsBiF().gEmmrt();
        return Unit.INSTANCE;
    }

    public static final Unit QSBOWP(BaseApplication baseApplication) {
        C6769aVd.OLrzqt.KWHzl(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit hBpjJd(BaseApplication baseApplication) {
        C48801ucY.AEQbTJ.AEQbTJ(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit gwTjWJ(final BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_analytics_start");
        C32660mhl.EZpvd("Analytics-config", new Function0() { // from class: o.mdX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.dHguZz(this.copydefault);
            }
        });
        C32660mhl.EZpvd("Analytics-init", new Function0() { // from class: o.mdU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.dmfpNf(this.KWHzl);
            }
        });
        c42548rWy.AEQbTJ("init_analytics_end");
        return Unit.INSTANCE;
    }

    public static final Unit dHguZz(BaseApplication baseApplication) {
        baseApplication.QfsBiF().AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit dmfpNf(BaseApplication baseApplication) {
        C32871mlk.Companion.EZpvd(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit RdAHlO(BaseApplication baseApplication) {
        baseApplication.DTwDnp();
        return Unit.INSTANCE;
    }

    public static final Unit hrNTAI(BaseApplication baseApplication) {
        baseApplication.OuxcSI();
        C6767aVb.Companion.OLrzqt().AEQbTJ(baseApplication);
        baseApplication.DXXBbs();
        baseApplication.DCJXGO();
        baseApplication.QfsBiF().EZpvd(InterfaceC32484meU.Companion.KWHzl().AuCTel());
        return Unit.INSTANCE;
    }

    public static final Unit ODXsMY(final BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_localization_start");
        C32660mhl.EZpvd("Localization-onCreateGlobalDispatch", new Function0() { // from class: o.mde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.OFhtUX(this.AEQbTJ);
            }
        });
        C32660mhl.EZpvd("Localization-init", new Function0() { // from class: o.mdg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.OHqIaq(this.AEQbTJ);
            }
        });
        c42548rWy.AEQbTJ("init_localization_end");
        return Unit.INSTANCE;
    }

    public static final Unit OFhtUX(BaseApplication baseApplication) {
        baseApplication.QfsBiF().KWHzl(baseApplication.AxsJAYsNCnLh());
        return Unit.INSTANCE;
    }

    public static final Unit OHqIaq(BaseApplication baseApplication) {
        baseApplication.accept();
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH() {
        C32660mhl.EZpvd("GlobalDispatchCreate", new Function0() { // from class: o.mdR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.iwGUEr();
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr() {
        C43246rlf.OLrzqt.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance() {
        C32660mhl.EZpvd("OKDebugger", new Function0() { // from class: o.mdx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.getFieldNames();
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames() {
        InterfaceC32484meU interfaceC32484meUKWHzl = InterfaceC32484meU.Companion.KWHzl();
        C32582mgM.EZpvd.KWHzl(interfaceC32484meUKWHzl.isConnected(), interfaceC32484meUKWHzl.fetchVPNInfo());
        return Unit.INSTANCE;
    }

    public static final Unit DLWbHP(final BaseApplication baseApplication) {
        C32660mhl.EZpvd("OAppManager - init", new Function0() { // from class: o.mdO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.OJuSTm(this.EZpvd);
            }
        });
        C32660mhl.EZpvd("OAppManager - process lifecycle monitor", new Function0() { // from class: o.mdW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.AuCTelauCTel();
            }
        });
        C32660mhl.EZpvd("OAppManager - report native crash grafana", new Function0() { // from class: o.mei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.OxVOHk(this.AEQbTJ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OJuSTm(BaseApplication baseApplication) {
        C54819xWm.KWHzl().copydefault(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel() {
        C32986mnt.EZpvd.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit OxVOHk(BaseApplication baseApplication) {
        baseApplication.QUSxYX().EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit QCjLjM(BaseApplication baseApplication) {
        baseApplication.OcIXYQ();
        return Unit.INSTANCE;
    }

    public static final Unit QSLkRj(BaseApplication baseApplication) {
        baseApplication.fvQaOB();
        C32479meP.EZpvd.copydefault(baseApplication, baseApplication.QfsBiF());
        C48863udh.OLrzqt.OLrzqt();
        C30359lVl.OLrzqt.EZpvd(baseApplication);
        C32613mgr.copydefault.copydefault(true);
        return Unit.INSTANCE;
    }

    public static final Unit QVsKAR(BaseApplication baseApplication) throws DeviceInfoHelper.DeviceInfoException {
        baseApplication.DCUTEI();
        return Unit.INSTANCE;
    }

    public static final Unit QwvEab(BaseApplication baseApplication) {
        baseApplication.gkJEwt();
        return Unit.INSTANCE;
    }

    public static final Unit aUsmxb(BaseApplication baseApplication) {
        baseApplication.iRxXKY();
        return Unit.INSTANCE;
    }

    public static final Unit USBtdM(BaseApplication baseApplication) {
        C52762wXk c52762wXk = C52762wXk.AEQbTJ;
        OkHttpClient okHttpClientEZpvd = C32547mfe.EZpvd(false);
        Intrinsics.checkNotNullExpressionValue(okHttpClientEZpvd, "");
        c52762wXk.OLrzqt(okHttpClientEZpvd);
        C32609mgn.copydefault.AEQbTJ(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit dUDNAs(BaseApplication baseApplication) {
        C33095mpw.OLrzqt();
        baseApplication.AwvSrB();
        return Unit.INSTANCE;
    }

    public static final Unit UlJrfe(final BaseApplication baseApplication) {
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        c42548rWy.AEQbTJ("init_pandora_start");
        C32660mhl.EZpvd("Pandora", new Function0() { // from class: o.mdz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.igXuih(this.AEQbTJ);
            }
        });
        c42548rWy.AEQbTJ("init_pandora_end");
        return Unit.INSTANCE;
    }

    public static final Unit igXuih(BaseApplication baseApplication) {
        C31968mKp.KWHzl.AEQbTJ(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit fdOvFl(BaseApplication baseApplication) {
        C46979thQ.copydefault.OLrzqt().OLrzqt(baseApplication);
        return Unit.INSTANCE;
    }

    public static final Unit fERRXa(BaseApplication baseApplication) {
        oJX.copydefault.EZpvd(baseApplication);
        return Unit.INSTANCE;
    }

    public final void giSNqX() {
        C44712scB.copydefault(this, new YG.ActionBar() { // from class: o.mdo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.YG.ActionBar
            public final void log(java.lang.String str) {
                BaseApplication.copydefault(str);
            }
        }, new InterfaceC44717scG() { // from class: o.mdr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC44717scG
            public final void AEQbTJ(java.lang.Throwable th) {
                BaseApplication.AEQbTJ(th);
            }
        });
    }

    public static final void copydefault(String str) {
        Intrinsics.copydefault((Object) str);
        pUU.KWHzl("NativeSecret", str);
    }

    public static final void AEQbTJ(Throwable th) {
        C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
        Intrinsics.copydefault(th);
        taskDescription.EZpvd(th);
    }

    public final void accept() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!SPUtils.getBoolean("CURRENCY_SYMBOL_FROM_ICU", false)) {
            CurrencyProxy.INSTANCE.setCurrencySymbolCallback(new Function1() { // from class: o.mdh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseApplication.AhwBna((java.lang.String) obj);
                }
            });
        }
        oJV.AEQbTJ.KWHzl(new Function0() { // from class: o.mdk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(BaseApplication.zLjUOn());
            }
        });
        try {
            String strAEQbTJ = MMKV.AEQbTJ(this);
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            pUU.KWHzl("ApplicationProxy", "localizationInit, cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", mmkv rootDir:" + strAEQbTJ);
        } catch (Throwable unused) {
            ClassLoader classLoader = getClass().getClassLoader();
            pUU.copydefault("ApplicationProxy", "MMKV---ClassLoader: " + classLoader + ", Parent: " + (classLoader != null ? classLoader.getParent() : null));
            pUU.copydefault("ApplicationProxy", "MMKV---ApplicationInfo---");
            pUU.copydefault("ApplicationProxy", "MMKV---sourceDir: " + getApplicationInfo().sourceDir + "---");
            String[] strArr = getApplicationInfo().splitSourceDirs;
            pUU.copydefault("ApplicationProxy", "MMKV---splitSourceDirs: " + (strArr != null ? yDV.joinToString$default(strArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) : null) + "---");
            pUU.copydefault("ApplicationProxy", "MMKV---nativeLibraryDir: " + getApplicationInfo().nativeLibraryDir + "---");
        }
        oJV ojv = oJV.AEQbTJ;
        ojv.OLrzqt(new Function0() { // from class: o.mdi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.htlTjW(this.OLrzqt);
            }
        });
        ojv.copydefault(new Function0() { // from class: o.mdl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.fjfviF(this.AEQbTJ);
            }
        });
        ojv.EZpvd(new BaseApplication$localizationInit$5(this, null));
        pTN ptn = QbewEr().get();
        String strKWHzl = C32487meX.AEQbTJ.KWHzl();
        ptn.KWHzl(strKWHzl != null ? strKWHzl : "");
    }

    public static final String AhwBna(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C32551mfi.EZpvd.KWHzl(str);
    }

    public static final boolean zLjUOn() {
        return mNP.AEQbTJ.EZpvd();
    }

    public static final Unit htlTjW(BaseApplication baseApplication) {
        baseApplication.QHmsKR();
        return Unit.INSTANCE;
    }

    public static final Unit fjfviF(BaseApplication baseApplication) {
        baseApplication.QHmsKR();
        TPM.AEQbTJ(new Runnable() { // from class: o.mdy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                BaseApplication.zsXlph();
            }
        });
        return Unit.INSTANCE;
    }

    public static final void zsXlph() {
        C57309yfw.AEQbTJ.gEmmrt();
    }

    public final Object AEQbTJ(LanguageUnit languageUnit, int i, String str, Continuation<? super Boolean> continuation) {
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        String str2 = "switchMarketRequestKeyPrefix_" + str;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BaseApplication$startSwitchMarket$2$1(str2, str, c56434yFf, null), 3, null);
        ActivityC32554mfl.Companion.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), languageUnit.getMarket(), languageUnit.getLanguageCode(), i, str2);
        pUU.KWHzl("SwitchMarketLoadingActivity", "startActivity. requestKey:" + str2);
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    public final void QHmsKR() {
        String strAYXKKw = C38303pTu.AYXKKw(RcXXUw().get().OLrzqt().getLocale());
        C43384roK.KWHzl.KWHzl(strAYXKKw);
        C32935mmv.KWHzl.put("language", strAYXKKw);
    }

    public final C32482meS copydefault(@NotNull C32482meS c32482meS) {
        Intrinsics.checkNotNullParameter(c32482meS, "");
        QfsBiF().copydefault(c32482meS);
        return c32482meS;
    }

    public final void fvQaOB() {
        if (QKudOq()) {
            if (C54807xWa.AEQbTJ()) {
                pUU.KWHzl("Monitor.Device", "low end device ignore initLooperMonitor ");
            } else {
                LooperMonitor.OLrzqt().AEQbTJ(Looper.getMainLooper(), new TaskStackBuilder());
            }
        }
    }

    public static final class TaskStackBuilder implements LooperMonitor.Activity {
        public TaskStackBuilder() {
        }

        @Override // com.okinc.lib.monitor.LooperMonitor.Activity
        public void copydefault(String str, long j) {
            if (j <= 2000) {
                if (j > 1000) {
                    pUU.KWHzl("Monitor.Looper", "handler task time:" + j + " \ntask name:" + str + " \npage:" + C6767aVb.Companion.OLrzqt().EZpvd());
                    return;
                }
                return;
            }
            String strEZpvd = C6767aVb.Companion.OLrzqt().EZpvd();
            if (TextUtils.isEmpty(strEZpvd)) {
                strEZpvd = str;
            }
            pUU.KWHzl("Monitor.Looper", "handler  page:" + strEZpvd + " \ntime:" + j + " \ntask:" + str);
            BaseApplication.this.OLrzqt(String.valueOf(j), strEZpvd, str);
        }

        @Override // com.okinc.lib.monitor.LooperMonitor.Activity
        public void OLrzqt(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C6777aVl.Companion.EZpvd(th);
        }
    }

    public final void OLrzqt(String str, String str2, String str3) {
        EventData eventData = new EventData();
        eventData.setAct(EventAction.BLOCK_TIME.getType());
        eventData.setPath(str2);
        HashMap map = new HashMap();
        map.put("blockedTime", str);
        if (str3 == null) {
            str3 = "";
        }
        map.put("isDeviceRooted", str3);
        eventData.setAttribute(map);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void flVtFt() {
        C34733nhs.ActionBar actionBar = C34733nhs.Companion;
        actionBar.OLrzqt(new C34733nhs.TaskDescription() { // from class: o.mdw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C34733nhs.TaskDescription
            public final java.lang.String EZpvd(java.lang.Exception exc) {
                return BaseApplication.KWHzl(this.copydefault, exc);
            }
        });
        actionBar.EZpvd(new PictureInPictureParams());
    }

    public static final String KWHzl(BaseApplication baseApplication, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (exc instanceof FeatureException) {
            String message = exc.getMessage();
            if (message != null) {
                return message;
            }
            String string = baseApplication.getString(C32549mfg.StateListAnimator.fFgQHt);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        String string2 = baseApplication.getString(C32549mfg.StateListAnimator.fFgQHt);
        Intrinsics.copydefault((Object) string2);
        return string2;
    }

    public static final class PictureInPictureParams extends C34733nhs.StateListAnimator {
        @Override // o.C34733nhs.StateListAnimator
        public void EZpvd(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            super.EZpvd(str, str2);
            pUU.KWHzl(str, str2);
        }

        @Override // o.C34733nhs.StateListAnimator
        public void EZpvd(String str, String str2, final Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            super.EZpvd(str, str2, th);
            final String str3 = str2 + ": " + copydefault();
            pUU.AEQbTJ(str, str3, th);
            C32866mlf.onEvent$default("dynamic_feature_error", (TrackChannel[]) null, new Function1() { // from class: o.meM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseApplication.PictureInPictureParams.OLrzqt(str3, th, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }

        public static final Unit OLrzqt(String str, Throwable th, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("msg", str + ": " + (th != null ? th.getMessage() : null), false);
            return Unit.INSTANCE;
        }

        @Override // o.C34733nhs.StateListAnimator
        public void AEQbTJ(String str, String str2, Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            super.AEQbTJ(str, str2, th);
            pUU.OLrzqt(str, str2, th);
        }
    }

    public final void iZzfmt() {
        AbstractC32486meW abstractC32486meWEZpvd = QfsBiF().EZpvd();
        C34704nhP c34704nhP = C34704nhP.copydefault;
        c34704nhP.OLrzqt(abstractC32486meWEZpvd.EZpvd());
        c34704nhP.OLrzqt(abstractC32486meWEZpvd.AEQbTJ());
        c34704nhP.EZpvd(abstractC32486meWEZpvd.AkhnZx());
    }

    public final void DarRvM() {
        Map<AmplitudeName, String> mapGEmmrt;
        AbstractC32486meW abstractC32486meWEZpvd = QfsBiF().EZpvd();
        C32864mld c32864mld = C32864mld.OLrzqt;
        if (AxsJAYsNCnLh()) {
            mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(AmplitudeName.CEFI, abstractC32486meWEZpvd.gEmmrt()), C56390yDp.OLrzqt(AmplitudeName.WEB3, abstractC32486meWEZpvd.AYXKKw()));
        } else {
            mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(AmplitudeName.CEFI, abstractC32486meWEZpvd.AhwBna()), C56390yDp.OLrzqt(AmplitudeName.WEB3, abstractC32486meWEZpvd.fetchVPNInfo()));
        }
        c32864mld.OLrzqt(mapGEmmrt);
        AmplitudeName amplitudeName = AmplitudeName.CEFI;
        c32864mld.KWHzl(C56424yEw.gEmmrt(C56390yDp.OLrzqt(amplitudeName, abstractC32486meWEZpvd.valueOf()), C56390yDp.OLrzqt(AmplitudeName.WEB3, abstractC32486meWEZpvd.djBIcL())));
        c32864mld.EZpvd(abstractC32486meWEZpvd.KWHzl());
        c32864mld.djBIcL(new Function0() { // from class: o.meq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(BaseApplication.AubY());
            }
        });
        ABTestManager.AEQbTJ.KWHzl(new ComponentName(), amplitudeName);
        try {
            Boolean boolAEQbTJ = C32487meX.AEQbTJ.AEQbTJ();
            Intrinsics.copydefault(boolAEQbTJ);
            c32864mld.KWHzl(boolAEQbTJ.booleanValue());
        } catch (Exception e) {
            pUU.AEQbTJ("ApplicationProxy", e);
        }
    }

    public static final boolean AubY() {
        return InterfaceC32484meU.Companion.KWHzl().fARcdN();
    }

    public static final class ComponentName implements InterfaceC32861mla {
        public ComponentName() {
        }

        @Override // o.InterfaceC32861mla
        public void EZpvd(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            BaseApplication.this.copydefault(amplitudeName);
            BaseApplication.this.valueOf(amplitudeName);
        }

        @Override // o.InterfaceC32861mla
        public void KWHzl(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            BaseApplication.this.copydefault(amplitudeName);
            BaseApplication.this.valueOf(amplitudeName);
        }
    }

    public final void gHZMYf() {
        if (QKudOq()) {
            String name = getClass().getName();
            pUU.KWHzl("LogIdleHandler", "  addIdleHandler application:" + name);
            MessageQueue messageQueueMyQueue = Looper.myQueue();
            Intrinsics.copydefault((Object) name);
            messageQueueMyQueue.addIdleHandler(new C38348pVl(name));
            C54819xWm.KWHzl().AEQbTJ(new Application());
        }
    }

    public static final class Application implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            pUU.copydefault("LogIdleHandler", "appenderFlush onAppEnterForeground");
            pUU.copydefault();
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            pUU.copydefault("LogIdleHandler", "appenderFlush onAppEnterBackground");
            pUU.copydefault();
        }
    }

    public final void iRxXKY() {
        ReportManager reportManager = ReportManager.AEQbTJ;
        reportManager.KWHzl(xVW.copydefault() + "_" + System.currentTimeMillis());
        reportManager.AEQbTJ(new Function0() { // from class: o.mdC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.AxsJAYsNCnLh(this.AEQbTJ);
            }
        });
        InterfaceC32855mlU.Companion.copydefault(new Function0() { // from class: o.mdB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BaseApplication.ejfBZ();
            }
        });
    }

    public static final String AxsJAYsNCnLh(BaseApplication baseApplication) {
        User userOLrzqt = baseApplication.UeEOUB().OLrzqt();
        if (userOLrzqt != null) {
            return userOLrzqt.getUid();
        }
        return null;
    }

    public static final InterfaceC32855mlU ejfBZ() {
        return new SharedElementCallback();
    }

    public static final class SharedElementCallback implements InterfaceC32855mlU {
        @Override // o.InterfaceC32855mlU
        public void copydefault(Throwable th, Map<String, String> map, String str, String str2) {
            Intrinsics.checkNotNullParameter(th, "");
            C6777aVl.Companion.OLrzqt(th, map, str, str2);
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        QfsBiF().djBIcL();
        C35202nqq.OLrzqt.AEQbTJ();
        C48787ucK.AEQbTJ.DbNXlk();
        C43246rlf.OLrzqt.djBIcL();
        pUU.copydefault("dexguard", "Application onTerminate");
        reportLifeCycleEvent$default(this, Apm.EventType.APP_END.getValue(), null, 2, null);
        if (OKCoreInit.INSTANCE.isOKCoreInitialized()) {
            C3567AoQ.appSupportNotifyWillTerminate();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        pUU.KWHzl("ApplicationProxy", "onConfigurationChanged, config:" + configuration);
        C43246rlf.OLrzqt.EZpvd(configuration);
        this.AYXKKw = null;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C43246rlf.OLrzqt.AYXKKw();
        pUU.KWHzl("ApplicationProxy", "onLowMemory");
        djSkpj().fJNWhG();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C43246rlf.OLrzqt.AEQbTJ(i);
        pUU.KWHzl("ApplicationProxy", "onTrimMemory level:" + i);
        djSkpj().EZpvd(i);
        if (OKCoreInit.INSTANCE.isOKCoreInitialized()) {
            C3567AoQ.appSupportNotifyMemoryWarning();
        }
    }

    public final void gkJEwt() {
        int iOLrzqt = QfsBiF().OLrzqt();
        AppCompatDelegate.setDefaultNightMode(iOLrzqt);
        if (iOLrzqt == -1) {
            C32866mlf.KWHzl("night_mode", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mdL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseApplication.AYXKKw((EventParamsList) obj);
                }
            });
        } else if (iOLrzqt == 1) {
            C32866mlf.KWHzl("night_mode", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mdM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseApplication.copydefault((EventParamsList) obj);
                }
            });
        } else {
            if (iOLrzqt != 2) {
                return;
            }
            C32866mlf.KWHzl("night_mode", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mdI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseApplication.KWHzl((EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.MODE, "1", true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.MODE, "0", true);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(OtcExtraKeys.MODE, "2", true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(C43248rlh c43248rlh) {
        if (C34703nhO.AEQbTJ()) {
            C35202nqq.OLrzqt.AEQbTJ("get_service_config", new AssistContent(c43248rlh));
        }
    }

    public static final class AssistContent implements InterfaceC35209nqx {
        public final /* synthetic */ C43248rlh AEQbTJ;

        public AssistContent(C43248rlh c43248rlh) {
            this.AEQbTJ = c43248rlh;
        }

        @Override // o.InterfaceC35209nqx
        public void AEQbTJ(boolean z) {
            if (z) {
                pUU.EZpvd("IMC", "setServiceCallback");
                this.AEQbTJ.OLrzqt(new ActionBar());
            }
        }

        public static final class ActionBar implements InterfaceC43259rls {
            public final Set<Class<?>> KWHzl = new LinkedHashSet();

            @Override // o.InterfaceC43259rls
            public <T extends InterfaceC43216rlB> void EZpvd(Class<T> cls, T t) {
                Intrinsics.checkNotNullParameter(cls, "");
                if (this.KWHzl.contains(cls)) {
                    return;
                }
                ReportManager reportManager = ReportManager.AEQbTJ;
                EventData eventData = new EventData();
                eventData.setAct("tr_service");
                eventData.setCode(t == null ? "1" : "0");
                eventData.setPath(cls.getCanonicalName());
                reportManager.EZpvd(eventData);
                this.KWHzl.add(cls);
            }
        }
    }

    public final void AEQbTJ(Context context, final boolean z) {
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        String strOLrzqt = C34703nhO.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        c43246rlf.EZpvd(strOLrzqt);
        c43246rlf.OLrzqt(this, new Function0() { // from class: o.mds
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(BaseApplication.EZpvd(z, this));
            }
        });
        c43246rlf.copydefault(new Function1() { // from class: o.mdq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.EZpvd((java.util.Collection) obj);
            }
        });
        if (QKudOq()) {
            c43246rlf.OLrzqt(new Function2() { // from class: o.mdt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return BaseApplication.EZpvd((java.lang.String) obj, ((java.lang.Long) obj2).longValue());
                }
            });
        }
        c43246rlf.OLrzqt(context);
    }

    public static final boolean EZpvd(boolean z, BaseApplication baseApplication) {
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        c43248rlh.EZpvd(z);
        c43248rlh.OLrzqt(new C32608mgm());
        baseApplication.KWHzl(c43248rlh);
        return true;
    }

    public static final Set EZpvd(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return CollectionsKt___CollectionsKt.OqFWZa(collection);
    }

    public static final Unit EZpvd(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        C42548rWy.AEQbTJ(str, j);
        return Unit.INSTANCE;
    }

    public final void DTwDnp() {
        C57309yfw c57309yfw = C57309yfw.AEQbTJ;
        c57309yfw.OLrzqt(this);
        QOLQEE();
        C57363ygx.copydefault.OLrzqt(false);
        AbstractC32486meW abstractC32486meWEZpvd = QfsBiF().EZpvd();
        c57309yfw.AEQbTJ(abstractC32486meWEZpvd.values());
        c57309yfw.OLrzqt(abstractC32486meWEZpvd.OLrzqt());
        c57309yfw.djBIcL().add(new Function1() { // from class: o.mdj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.EZpvd((OkHttpClient) obj);
            }
        });
    }

    public static final OkHttpClient EZpvd(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        if (C35202nqq.OLrzqt.AEQbTJ("okweb_security_sign_jwt")) {
            builderNewBuilder.addInterceptor(new C6878aXg(null, 1, 0 == true ? 1 : 0));
        }
        return builderNewBuilder.build();
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void OuxcSI() {
        final Function1 function1 = new Function1() { // from class: o.mdc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.copydefault((java.lang.Throwable) obj);
            }
        };
        yBG.AEQbTJ((InterfaceC58227yxM<? super Throwable>) new InterfaceC58227yxM() { // from class: o.mdd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                BaseApplication.KWHzl(function1, obj);
            }
        });
    }

    public static final Unit copydefault(Throwable th) {
        if (th instanceof Exception) {
            String stackTraceString = Log.getStackTraceString(th);
            Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            pUU.KWHzl("RxJava", stackTraceString);
        }
        return Unit.INSTANCE;
    }

    public final void DCUTEI() throws DeviceInfoHelper.DeviceInfoException {
        String uid;
        RxBus.AEQbTJ("ev_account_change", "ev_account_login", "ev_account_logout").subscribe(new RxBus.EventCallback<String>() { // from class: com.okinc.common.application.BaseApplication$setBugReportUid$1
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) throws DeviceInfoHelper.DeviceInfoException {
                String uid2;
                C6777aVl c6777aVl = this.this$0.isConnected;
                if (c6777aVl != null) {
                    User userOLrzqt = this.this$0.UeEOUB().OLrzqt();
                    c6777aVl.OLrzqt(userOLrzqt != null ? userOLrzqt.getUid() : null);
                }
                C32573mgD c32573mgDQUSxYX = this.this$0.QUSxYX();
                User userOLrzqt2 = this.this$0.UeEOUB().OLrzqt();
                if (userOLrzqt2 == null || (uid2 = userOLrzqt2.getUid()) == null) {
                    uid2 = "N/A";
                }
                c32573mgDQUSxYX.KWHzl(uid2 + "_" + xVW.copydefault());
            }
        });
        C6777aVl c6777aVl = this.isConnected;
        if (c6777aVl != null) {
            User userOLrzqt = UeEOUB().OLrzqt();
            c6777aVl.OLrzqt(userOLrzqt != null ? userOLrzqt.getUid() : null);
        }
        C32573mgD c32573mgDQUSxYX = QUSxYX();
        User userOLrzqt2 = UeEOUB().OLrzqt();
        if (userOLrzqt2 == null || (uid = userOLrzqt2.getUid()) == null) {
            uid = "N/A";
        }
        c32573mgDQUSxYX.KWHzl(uid + "_" + xVW.copydefault());
    }

    public final void dvKsVJ() {
        this.isConnected = new C6777aVl.ActionBar(this).KWHzl(AxsJAYsNCnLh()).copydefault(SPUtils.getBoolean("bug_report_enable", true, "startup_config")).copydefault();
        pUX.OLrzqt.AEQbTJ(new C6773aVh());
    }

    public final void OLrzqt(boolean z, boolean z2) {
        pUU.EZpvd("BlockCanary", "needInit:" + z + " enableSaveLog:" + z2);
        if (!z || C8043avL.EZpvd(this)) {
            return;
        }
        C8043avL.OLrzqt(new C32481meR(this, z2));
    }

    public final void AxsJAYaxsJAY() {
        pUQ.StateListAnimator stateListAnimatorEZpvd = new pUQ.StateListAnimator(this).EZpvd(LogLevel.LEVEL_INFO).EZpvd("OkLog").OLrzqt(AxsJAYsNCnLh()).EZpvd(AxsJAYsNCnLh()).OLrzqt(CacheDataSink.DEFAULT_FRAGMENT_SIZE).EZpvd(5);
        if (mNP.AEQbTJ.OLrzqt()) {
            File externalFilesDir = getExternalFilesDir("logDir");
            pUQ.StateListAnimator stateListAnimatorOLrzqt = stateListAnimatorEZpvd.OLrzqt(String.valueOf(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null));
            File externalFilesDir2 = getExternalFilesDir("cacheDir");
            stateListAnimatorOLrzqt.AEQbTJ(String.valueOf(externalFilesDir2 != null ? externalFilesDir2.getAbsolutePath() : null));
        }
        pUU.AEQbTJ(stateListAnimatorEZpvd.KWHzl());
        OkUtils.EZpvd(new VoiceInteractor());
        pUU.copydefault("dexguard", "-----------------------------------------------------------------------------------------------------------------------------------------");
        pUU.copydefault("dexguard", "-----------------------------------------------------app start:" + new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS").format(new Date()) + "---------------------------------------------------");
        pUU.copydefault("dexguard", "-----------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static final class VoiceInteractor implements InterfaceC6831aWm {
        @Override // o.InterfaceC6831aWm
        public void OLrzqt(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            pUU.valueOf(str, str2);
        }

        @Override // o.InterfaceC6831aWm
        public void EZpvd(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            pUU.copydefault(str, str2);
        }
    }

    public final void OqFWZa() {
        Triple<String, String, String> triple;
        JsonElement jsonElement;
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        c43292rmY.copydefault(C54807xWa.AEQbTJ());
        C47239tmL c47239tmL = C47239tmL.copydefault;
        C6887aXp.copydefault.copydefault(new ComponentCallbacks(new C6885aXn(c47239tmL.KWHzl(), c47239tmL.copydefault(), null, 4, null)));
        c43292rmY.OLrzqt(new yHO() { // from class: o.mdE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BaseApplication.AEQbTJ((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
        sSMYrx();
        QKVWgx();
        C43372rnz c43372rnz = C43372rnz.copydefault;
        PredefinedDoHChains predefinedDoHChains = PredefinedDoHChains.OKX_HTTP_MAIN;
        DoHChain plainModel = predefinedDoHChains.toPlainModel();
        PredefinedDoHChains predefinedDoHChains2 = PredefinedDoHChains.WEB3_HTTP_MAIN;
        DoHChain plainModel2 = predefinedDoHChains2.toPlainModel();
        PredefinedDoHChains predefinedDoHChains3 = PredefinedDoHChains.OKX_WS_V5;
        DoHChain plainModel3 = predefinedDoHChains3.toPlainModel();
        PredefinedDoHChains predefinedDoHChains4 = PredefinedDoHChains.WEB3_WS_DEX;
        c43372rnz.EZpvd(plainModel, plainModel2, plainModel3, predefinedDoHChains4.toPlainModel(), PredefinedDoHChains.TR_HTTP_MAIN.toPlainModel());
        C43398roY.copydefault.AEQbTJ(false, new Function1() { // from class: o.mdJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.EZpvd((OkHttpClient.Builder) obj);
            }
        });
        C32582mgM c32582mgM = C32582mgM.EZpvd;
        Integer numValueOf = null;
        if (c32582mgM.gEmmrt()) {
            triple = new Triple<>(c32582mgM.KWHzl(), c32582mgM.EZpvd(), c32582mgM.OLrzqt());
        } else {
            triple = new Triple<>(null, null, null);
        }
        boolean z = AxsJAYsNCnLh() || Intrinsics.EZpvd(QfsBiF().KWHzl(), Boolean.TRUE);
        ArrayList<Interceptor> arrayListAEQbTJ = c32582mgM.AEQbTJ();
        ABTestManager.AEQbTJ.KWHzl(new BroadcastReceiver(), AmplitudeName.CEFI);
        C48787ucK c48787ucK = C48787ucK.AEQbTJ;
        JsonObject jsonObjectAEQbTJ = c48787ucK.AEQbTJ("dohConfig");
        if (jsonObjectAEQbTJ != null && (jsonElement = jsonObjectAEQbTJ.get("backupCount")) != null) {
            numValueOf = Integer.valueOf(jsonElement.getAsInt());
        }
        c43372rnz.KWHzl(true, numValueOf);
        c43292rmY.EZpvd(c48787ucK.AEQbTJ("dohConfig.remove_private_params_from_not_okx", 1) == 1);
        c48787ucK.AEQbTJ("dohConfig", new ComponentCallbacks2());
        List listAhwBna = yDY.AhwBna(predefinedDoHChains, predefinedDoHChains2, predefinedDoHChains3, predefinedDoHChains4);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(((PredefinedDoHChains) it.next()).toPlainModel());
        }
        C43292rmY c43292rmY2 = C43292rmY.OLrzqt;
        c43292rmY2.KWHzl(this, arrayList, triple, z, arrayListAEQbTJ);
        C31968mKp.KWHzl.EZpvd();
        c43292rmY2.EZpvd(new yHO() { // from class: o.mdH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BaseApplication.AEQbTJ((java.lang.Throwable) obj, (java.util.Map) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        c43292rmY2.EZpvd(new Function2() { // from class: o.mdF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BaseApplication.EZpvd(this.EZpvd, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        c43292rmY2.EZpvd(new Function1() { // from class: o.mdG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        c43292rmY2.copydefault(C56424yEw.gEmmrt(C56390yDp.OLrzqt("risk-params", "fp-status=-2"), C56390yDp.OLrzqt("fingerprint-id", xVW.copydefault())));
        C48787ucK.AEQbTJ.AEQbTJ("wsConfig", new ClipData(c43292rmY2));
        c43292rmY2.OLrzqt(QfsBiF().EZpvd().copydefault());
        AxsJAY();
        new NetworkInit(this, arrayList).initNetwork();
    }

    public static final class ComponentCallbacks implements InterfaceC6884aXm {
        public final /* synthetic */ C6885aXn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC6884aXm
        public C6885aXn AEQbTJ() {
            return this.OLrzqt;
        }

        public ComponentCallbacks(C6885aXn c6885aXn) {
            this.OLrzqt = c6885aXn;
        }
    }

    public static final Unit AEQbTJ(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            C4298Bav.setHttpBaseUrl(str);
        }
        if (!StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
            C4298Bav.setWsCefiUrl(str2);
        }
        if (!StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
            C4298Bav.setWsDefiUrl(str3);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        C32483meT.AEQbTJ.KWHzl(builder, false);
        return Unit.INSTANCE;
    }

    public static final void copydefault(BaseApplication baseApplication, AmplitudeName amplitudeName) {
        baseApplication.AEQbTJ(amplitudeName);
        baseApplication.OLrzqt(amplitudeName);
        baseApplication.KWHzl(amplitudeName);
        baseApplication.EZpvd(amplitudeName);
    }

    public static final class BroadcastReceiver implements InterfaceC32861mla {
        public BroadcastReceiver() {
        }

        @Override // o.InterfaceC32861mla
        public void EZpvd(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            BaseApplication.copydefault(BaseApplication.this, amplitudeName);
        }

        @Override // o.InterfaceC32861mla
        public void KWHzl(AmplitudeName amplitudeName) {
            Intrinsics.checkNotNullParameter(amplitudeName, "");
            BaseApplication.copydefault(BaseApplication.this, amplitudeName);
        }
    }

    public static final class ComponentCallbacks2 implements InterfaceC48788ucL {
        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            C43292rmY.OLrzqt.EZpvd(C48787ucK.AEQbTJ.AEQbTJ("dohConfig.remove_private_params_from_not_okx", 1) == 1);
        }
    }

    public static final Unit AEQbTJ(Throwable th, Map map, boolean z) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(map, "");
        C6777aVl.Companion.OLrzqt(th, map, Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(BaseApplication baseApplication, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (baseApplication.DbNXlk == null) {
            baseApplication.DbNXlk = AbstractC42536rWm.Application.getInstance$default(AbstractC42536rWm.Companion, null, 1, null);
        }
        if (str2 == null) {
            AbstractC42536rWm abstractC42536rWm = baseApplication.DbNXlk;
            if (abstractC42536rWm != null) {
                AbstractC42536rWm.addMarker$default(abstractC42536rWm, QPLType.NETWORKV2, QPLMarker.START, str, 0L, 8, null);
            }
        } else {
            Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("x-id", str2));
            AbstractC42536rWm abstractC42536rWm2 = baseApplication.DbNXlk;
            if (abstractC42536rWm2 != null) {
                AbstractC42536rWm.addMarker$default(abstractC42536rWm2, QPLType.NETWORKV2, QPLMarker.START, str, 0L, mapEZpvd, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(BaseApplication baseApplication, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, baseApplication.getString(C32549mfg.StateListAnimator.AkhnZx), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        return Unit.INSTANCE;
    }

    public static final class ClipData implements InterfaceC48788ucL {
        public final /* synthetic */ C43292rmY EZpvd;

        public ClipData(C43292rmY c43292rmY) {
            this.EZpvd = c43292rmY;
        }

        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            JsonElement jsonElement;
            JsonObject jsonObjectAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ("wsConfig");
            this.EZpvd.AEQbTJ(jsonObjectAEQbTJ == null || !((jsonElement = jsonObjectAEQbTJ.get("recordPong")) == null || jsonElement.getAsInt() == 0));
        }
    }

    public final void AxsJAY() {
        C43292rmY.OLrzqt.copydefault(new Function1() { // from class: o.mdv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(BaseApplication.OLrzqt(this.EZpvd, ((java.lang.Integer) obj).intValue()));
            }
        });
        C48787ucK.AEQbTJ.AEQbTJ(RequireUpgradeHandler.NETWORK_COMMONERR_RANGE, new Dialog());
    }

    public static final boolean OLrzqt(BaseApplication baseApplication, int i) {
        return i <= baseApplication.djBIcL && baseApplication.gEmmrt <= i;
    }

    public static final class Dialog implements InterfaceC48788ucL {
        public Dialog() {
        }

        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            JsonObject jsonObjectAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ(RequireUpgradeHandler.NETWORK_COMMONERR_RANGE);
            if (jsonObjectAEQbTJ != null) {
                BaseApplication baseApplication = BaseApplication.this;
                JsonElement jsonElement = jsonObjectAEQbTJ.get(TtmlNode.START);
                baseApplication.gEmmrt = jsonElement != null ? jsonElement.getAsInt() : baseApplication.gEmmrt;
                JsonElement jsonElement2 = jsonObjectAEQbTJ.get(TtmlNode.END);
                baseApplication.djBIcL = jsonElement2 != null ? jsonElement2.getAsInt() : baseApplication.djBIcL;
            }
        }
    }

    public final void sSMYrx() {
        C43292rmY.OLrzqt.OLrzqt(new Function1() { // from class: o.mdD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.EZpvd((NetworkStringEnum) obj);
            }
        });
    }

    public static final String EZpvd(NetworkStringEnum networkStringEnum) {
        Intrinsics.checkNotNullParameter(networkStringEnum, "");
        int i = TaskDescription.OLrzqt[networkStringEnum.ordinal()];
        if (i != 1) {
            return i != 2 ? "" : C33070mpX.AYXKKw(C32549mfg.StateListAnimator.UeEOUB);
        }
        return C33070mpX.AYXKKw(C32549mfg.StateListAnimator.AkhnZx);
    }

    public final void QOLQEE() {
        C57309yfw.AEQbTJ.EZpvd(new Function1() { // from class: o.meI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.AEQbTJ(this.OLrzqt, (WebStringEnum) obj);
            }
        });
    }

    public static final String AEQbTJ(BaseApplication baseApplication, WebStringEnum webStringEnum) {
        Intrinsics.checkNotNullParameter(webStringEnum, "");
        switch (TaskDescription.copydefault[webStringEnum.ordinal()]) {
            case 1:
                return C33070mpX.AYXKKw(C32549mfg.StateListAnimator.aKErDB);
            case 2:
                return C33070mpX.AYXKKw(C32549mfg.StateListAnimator.dxcTrN);
            case 3:
                return C33070mpX.AYXKKw(C32549mfg.StateListAnimator.gGvvIC);
            case 4:
                return C33070mpX.AYXKKw(C32549mfg.StateListAnimator.djBIcL);
            case 5:
                return C33070mpX.AYXKKw(C32549mfg.StateListAnimator.gEmmrt);
            case 6:
                String strEZpvd = baseApplication.QfsBiF().EZpvd(webStringEnum.getType());
                return strEZpvd == null ? "" : strEZpvd;
            default:
                return "";
        }
    }

    public final void QKVWgx() {
        C43384roK c43384roK = C43384roK.KWHzl;
        c43384roK.copydefault(new Function0() { // from class: o.mdm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(BaseApplication.fIwbmz());
            }
        });
        c43384roK.AEQbTJ(new Function0() { // from class: o.mdp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(BaseApplication.RlQdEF(this.copydefault));
            }
        });
        c43384roK.copydefault(C34703nhO.copydefault() ? "OKX-Wallet" : QfsBiF().EZpvd().OLrzqt());
        String strCopydefault = C8087awC.copydefault(this);
        if (C33129mqd.OLrzqt((CharSequence) strCopydefault)) {
            xVY.AEQbTJ(this, strCopydefault);
        } else {
            xVY.EZpvd(this);
        }
    }

    public static final boolean fIwbmz() {
        return C33492mxV.OLrzqt();
    }

    public static final int RlQdEF(BaseApplication baseApplication) {
        return C33570myu.AEQbTJ(baseApplication);
    }

    public final boolean QKudOq() {
        return C33551myb.EZpvd(this);
    }

    public final void DXXBbs() {
        pTF.KWHzl.OLrzqt(ORxRYg());
    }

    public final boolean ORxRYg() {
        mNP.AEQbTJ.copydefault();
        return false;
    }

    public final void DCJXGO() {
        C33088mpp c33088mpp = C33088mpp.AEQbTJ;
        c33088mpp.copydefault(C32549mfg.StateListAnimator.fARcdN);
        c33088mpp.valueOf(C32549mfg.StateListAnimator.getFieldNames);
        c33088mpp.KWHzl(C32549mfg.StateListAnimator.fJNWhG);
        c33088mpp.AEQbTJ(C32549mfg.StateListAnimator.AuCTel);
        c33088mpp.AYXKKw(C32549mfg.StateListAnimator.uzCIH);
        c33088mpp.djBIcL(C32549mfg.StateListAnimator.getNewProxyInstance);
        c33088mpp.EZpvd(C32549mfg.StateListAnimator.DbNXlk);
        c33088mpp.OLrzqt(C32549mfg.StateListAnimator.ejfBZ);
        c33088mpp.gEmmrt(C32549mfg.StateListAnimator.hDKMBd);
        c33088mpp.AhwBna(C32549mfg.StateListAnimator.fIwbmz);
        c33088mpp.AkhnZx(C32549mfg.StateListAnimator.finit);
        c33088mpp.fetchVPNInfo(C32549mfg.StateListAnimator.dvKsVJ);
        c33088mpp.values(C32549mfg.StateListAnimator.dvKsVJ);
        C33087mpo c33087mpo = C33087mpo.KWHzl;
        c33087mpo.copydefault(C32549mfg.StateListAnimator.djBIcL);
        c33087mpo.KWHzl(C32549mfg.StateListAnimator.zuBGHE);
        C33087mpo.uzCIH = C32549mfg.StateListAnimator.QOLQEE;
        c33087mpo.AEQbTJ(C32549mfg.StateListAnimator.zsXlph);
        c33087mpo.OLrzqt(C32549mfg.StateListAnimator.AuCTelauCTel);
        C33087mpo.DbNXlk = C32549mfg.StateListAnimator.wlaJM;
        C33087mpo.fARcdN = C32549mfg.StateListAnimator.gHZMYf;
        C33087mpo.zLjUOn = C32549mfg.StateListAnimator.gGvvIC;
        C33087mpo.getFieldNames = C32549mfg.StateListAnimator.ORxRYg;
        C33087mpo.gEmmrt = C32549mfg.StateListAnimator.values;
        C33087mpo.AYXKKw = C32549mfg.StateListAnimator.fetchVPNInfo;
        C33087mpo.valueOf = C32549mfg.StateListAnimator.isConnected;
        C33087mpo.wlaJM = C32549mfg.StateListAnimator.QbewEr;
        C33087mpo.isConnected = C32549mfg.StateListAnimator.AubY;
        C33087mpo.AuCTel = C32549mfg.StateListAnimator.sSMYrx;
        C33087mpo.fIwbmz = C32549mfg.StateListAnimator.AxsJAY;
        C33087mpo.getNewProxyInstance = C32549mfg.StateListAnimator.QKVWgx;
        C33087mpo.hDKMBd = C32549mfg.StateListAnimator.DTwDnp;
        C33087mpo.AkhnZx = C32549mfg.StateListAnimator.zLjUOn;
        C33087mpo.iwGUEr = C32549mfg.StateListAnimator.OcIXYQ;
        C33087mpo.ejfBZ = C32549mfg.StateListAnimator.AwvSrB;
        C33087mpo.djBIcL = C32549mfg.StateListAnimator.iwGUEr;
        C33087mpo.copydefault = new Function2() { // from class: o.mdT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BaseApplication.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue(), (java.util.Map) obj2);
            }
        };
        C33087mpo.AEQbTJ = new Function1() { // from class: o.mdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseApplication.AEQbTJ((android.content.Context) obj);
            }
        };
    }

    public static final String EZpvd(BaseApplication baseApplication, int i, Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        return C33069mpW.KWHzl(baseApplication, i, (Map<String, ? extends Object>) map);
    }

    public static final C49328umV AEQbTJ(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pSE.EZpvd.EZpvd(context);
        return new C49328umV(C33051mpE.AEQbTJ.KWHzl(context));
    }

    @Override // o.C34717nhc.StateListAnimator
    public void getPostValueLengthLimit() {
        this.AYXKKw = null;
        RcXXUw().get().copydefault();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.AYXKKw == null) {
            Resources resources = super.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            AssetManager assets = resources.getAssets();
            Intrinsics.copydefault(assets);
            this.AYXKKw = new LocalizeResources(assets, resources);
        }
        C33051mpE c33051mpE = C33051mpE.AEQbTJ;
        Resources resources2 = this.AYXKKw;
        Intrinsics.copydefault(resources2);
        return c33051mpE.EZpvd(resources2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (intent != null) {
            pUU.copydefault("dexguard", "BaseApplication startActivity " + intent + " AMS:" + C6832aWn.AEQbTJ());
        }
        super.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        if (intent != null) {
            pUU.copydefault("dexguard", "BaseApplication startActivity2 " + intent + " AMS:" + C6832aWn.AEQbTJ());
            String string = bundle != null ? bundle.toString() : null;
            pUU.copydefault("dexguard", "BaseApplication startActivity2 " + string + " AMS:" + C6832aWn.AEQbTJ());
        }
        super.startActivity(intent, bundle);
    }

    public static final class LoaderManager implements InterfaceC48788ucL {
        public LoaderManager() {
        }

        @Override // o.InterfaceC48788ucL
        public void onStrategyUpdated() {
            C57601ylW.KWHzl.OLrzqt(BaseApplication.this.ODWQjV());
        }
    }

    public final void OcIXYQ() {
        C48787ucK.AEQbTJ.AEQbTJ("lottieModeConfig", new LoaderManager());
        C35202nqq.OLrzqt.AEQbTJ("bug_report_enable", new PendingIntent());
    }

    public static final class PendingIntent implements InterfaceC35209nqx {
        @Override // o.InterfaceC35209nqx
        public void AEQbTJ(boolean z) {
            pUU.KWHzl("OKBugReport", "gray callback for bug_report_enable: " + z);
            SPUtils.put("bug_report_enable", Boolean.valueOf(z), "startup_config");
        }
    }

    public final boolean ODWQjV() {
        if (SPUtils.getBoolean("use_lottie_software", false)) {
            return true;
        }
        return C33129mqd.OLrzqt((Object) Integer.valueOf(C48787ucK.AEQbTJ.AEQbTJ("lottieModeConfig.software", 0)), (Object) 1);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        pUU.KWHzl("startup", "queueIdle");
        QfsBiF().AhwBna();
        C54819xWm.KWHzl().OLrzqt();
        flVtFt();
        zuWLRA();
        if (!QKudOq()) {
            return false;
        }
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        if (strArr != null && strArr.length != 0) {
            return false;
        }
        C32866mlf.onEvent$default("support_32_abi", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1) null, 2, (Object) null);
        return false;
    }

    public final void zuWLRA() {
        AhwBna("init_imc", "init_imc_start", "init_imc_end");
        AhwBna("init_aurora_sdk", "init_aurora_sdk_start", "init_aurora_sdk_end");
        AhwBna("init_hms_sdk", "init_hms_sdk_start", "init_hms_sdk_end");
        AhwBna("init_network", "init_network_start", "init_network_end");
        AhwBna("init_track", "init_track_start", "init_track_end");
        AhwBna("init_router", "init_router_start", "init_router_end");
        AhwBna("init_analytics", "init_analytics_start", "init_analytics_end");
        AhwBna("init_pandora", "init_pandora_start", "init_pandora_end");
        AhwBna("init_localization", "init_localization_start", "init_localization_end");
    }

    public final void AhwBna(String str, String str2, String str3) {
        EventData eventData = new EventData();
        eventData.setAct("base_launch_time");
        eventData.setPath(str);
        eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("duration", String.valueOf(C42548rWy.AEQbTJ.AEQbTJ(str2, str3)))));
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public void fZBcTu() {
        MTObservable.getInstance().observer(this, new MTCommon());
        MTLifecycleBusiness.getInstance().init(this);
        MTNetworkBusiness.getInstance().init(this);
    }

    public void gasjUx() {
        FirebaseApp.initializeApp(this);
        if (QKudOq()) {
            AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("event_first_activity_created");
            final Object obj = new Object();
            abstractC58185ywXAEQbTJ.subscribe(new RxBus.EventCallback<String>(obj) { // from class: com.okinc.common.application.BaseApplication$initFirebaseSDK$1
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str) {
                    User userOLrzqt = this.this$0.UeEOUB().OLrzqt();
                    String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
                    pUU.EZpvd("ApplicationProxy", "initFirebaseSDK,tk===>" + tk);
                    if (C33129mqd.OLrzqt((CharSequence) tk)) {
                        FirebaseAnalytics.getInstance(this.this$0).setUserId(tk);
                    } else {
                        FirebaseAnalytics.getInstance(this.this$0).setUserId(null);
                    }
                    FlowKt.launchIn(FlowKt.onEach(this.this$0.UeEOUB().fIwbmz(), new BaseApplication$initFirebaseSDK$1$onEvent$1(this.this$0, null)), GlobalScope.INSTANCE);
                }
            });
            FirebaseAnalytics.getInstance(this).getAppInstanceId().addOnCompleteListener(new OnCompleteListener() { // from class: o.mdS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    BaseApplication.AEQbTJ(task);
                }
            });
        }
    }

    public static final void AEQbTJ(Task task) {
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            C32867mlg.KWHzl.OLrzqt(str);
            pUU.KWHzl("ApplicationProxy", "update appInstanceId: " + str);
            return;
        }
        pUU.AEQbTJ("ApplicationProxy", "update appInstanceId", task.getException());
    }

    public final void gGvvIC() {
        AutoInitHelper.doAutoInit(this);
        AGConnectInstance.initialize(this);
    }

    public void ffGIBT() {
        rWF.Companion.KWHzl(true);
    }

    public final void hUfVAv() {
        C32659mhk.AEQbTJ.copydefault(this);
        C55110xdk.OLrzqt.AEQbTJ(new yHO() { // from class: o.meD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BaseApplication.OLrzqt(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Long) obj2).longValue(), (WeakReference) obj3);
            }
        });
    }

    public static final Unit OLrzqt(boolean z, long j, WeakReference weakReference) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new BaseApplication$initOKQPL$1$1(weakReference, z, j, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void AwvSrB() {
        pJW.KWHzl(this);
        pJW.OLrzqt(C43418ros.OLrzqt);
        registerActivityLifecycleCallbacks(new Fragment());
    }

    public static final class Fragment extends C32981mno {
        @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            super.onActivityCreated(activity, bundle);
            C43418ros.OLrzqt.EZpvd(activity);
        }
    }

    public final void copydefault(AmplitudeName amplitudeName) {
        try {
            if (amplitudeName == AmplitudeName.CEFI) {
                JSONObject jSONObject = (JSONObject) ABTestManager.AEQbTJ.KWHzl("mobile_infra_network_unified_replace_whitelist", amplitudeName);
                pUU.KWHzl("ApplicationProxy", "skylab unified domains payload: " + jSONObject);
                if (jSONObject != null && jSONObject.has("cdn")) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cdn");
                    if (jSONArrayOptJSONArray != null) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i, null);
                            if (strOptString != null) {
                                linkedHashSet.add(strOptString);
                            }
                        }
                        C43385roL.Companion.EZpvd().KWHzl(DomainType.CDN, linkedHashSet);
                    }
                }
                if (jSONObject != null && jSONObject.has(OSSConstants.RESOURCE_NAME_OSS)) {
                    C43292rmY.OLrzqt.valueOf(true);
                } else {
                    C43292rmY.OLrzqt.valueOf(false);
                }
            }
        } catch (Exception e) {
            pUU.copydefault("ApplicationProxy", "updateUnifiedDomainConfig error: " + e.getMessage());
        }
    }

    public final void valueOf(AmplitudeName amplitudeName) {
        JSONObject jSONObject;
        try {
            if (amplitudeName != AmplitudeName.CEFI || (jSONObject = (JSONObject) ABTestManager.AEQbTJ.KWHzl("mobile_infra_unify_domain_report", amplitudeName)) == null) {
                return;
            }
            pUU.KWHzl("ApplicationProxy", "updateUnifiedDomainReportConfig, payload:" + jSONObject);
            int i = jSONObject.has("core") ? jSONObject.getInt("core") : -1;
            C43461rpi c43461rpi = C43461rpi.copydefault;
            c43461rpi.AEQbTJ(i);
            c43461rpi.OLrzqt(jSONObject.has("file_download") ? jSONObject.getInt("file_download") : -1);
        } catch (Exception e) {
            pUU.copydefault("ApplicationProxy", "updateUnifiedDomainReportConfig error: " + e.getMessage());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        SharedPreferences sharedPreferences = super.getSharedPreferences(str, i);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return new CheckedSharedPreferences(str, sharedPreferences);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rnz.updateConfig$default(o.rnz, boolean, boolean, int, java.lang.Object):void */
    public final void KWHzl(AmplitudeName amplitudeName) {
        if (amplitudeName == AmplitudeName.CEFI) {
            boolean zKWHzl = ABTestManager.AEQbTJ.KWHzl(new C32562mft(), amplitudeName);
            boolean zGEmmrt = C43466rpn.OLrzqt.gEmmrt();
            pUU.KWHzl("ApplicationProxy", "OKDnsManager， enableDirectConnect:" + zKWHzl + ", preConnectDirectly:" + zGEmmrt);
            C43372rnz.updateConfig$default(C43372rnz.copydefault, zKWHzl || zGEmmrt, false, 2, null);
        }
    }

    public final void EZpvd(AmplitudeName amplitudeName) {
        if (amplitudeName == AmplitudeName.CEFI) {
            boolean zKWHzl = ABTestManager.AEQbTJ.KWHzl(new C32563mfu(), amplitudeName);
            pUU.KWHzl("ApplicationProxy", "updateDOHLinkReportState，enableFeature:" + zKWHzl);
            C43292rmY.OLrzqt.KWHzl(zKWHzl);
        }
    }

    public final void OLrzqt(AmplitudeName amplitudeName) {
        if (amplitudeName == AmplitudeName.CEFI) {
            C43270rmC.OLrzqt.EZpvd(ABTestManager.getPayload$default(ABTestManager.AEQbTJ, "network_interceptor_experiment_key", null, 2, null));
        }
    }

    public final void AEQbTJ(AmplitudeName amplitudeName) {
        if (amplitudeName == AmplitudeName.CEFI) {
            if (ABTestManager.isEnabled$default(ABTestManager.AEQbTJ, new StateListAnimator(), null, 2, null)) {
                InterceptorTimeoutMonitor.AEQbTJ.AhwBna();
            } else {
                InterceptorTimeoutMonitor.AEQbTJ.EZpvd();
            }
        }
    }

    public final void dxcTrN() {
        InterfaceC32484meU interfaceC32484meUKWHzl = InterfaceC32484meU.Companion.KWHzl();
        C33081mpi.EZpvd = interfaceC32484meUKWHzl.AEQbTJ();
        C33081mpi c33081mpi = C33081mpi.OLrzqt;
        c33081mpi.AEQbTJ(interfaceC32484meUKWHzl.AYXKKw());
        c33081mpi.OLrzqt(interfaceC32484meUKWHzl.ejfBZ());
    }

    public static /* synthetic */ void reportLifeCycleEvent$default(BaseApplication baseApplication, String str, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportLifeCycleEvent");
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        baseApplication.AEQbTJ(str, bool);
    }

    public final void AEQbTJ(String str, Boolean bool) {
        EventData eventData = new EventData();
        eventData.setAct(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MetricsSQLiteCacheKt.METRICS_START_TIME, String.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("start_mode", AppStartMode.OnCold.getValue());
        eventData.setAttrs(linkedHashMap);
        if (bool != null) {
            ReportManager.AEQbTJ.EZpvd(eventData, bool.booleanValue());
        } else {
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
    }
}
