package o;

import com.okinc.core.util.SPUtils;
import com.okinc.mln.miniapp.MiniAppUpdateError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.resource.request.MlnUpdateRequest;
import com.okinc.resource.request.MlnUpdateResp;
import com.okinc.rxutils.RxBus;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC48864udi;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.rjQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43125rjQ implements InterfaceC7790aqV, InterfaceC43015rhM, InterfaceC7792aqX {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C43125rjQ.class, "disableAutoUpdate", "getDisableAutoUpdate$MLN_mln_ui()Z", 0))};
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public java.lang.String AYXKKw;
    public final C7828arG AhwBna;
    public final ConcurrentHashMap.KeySetView<java.lang.String, java.lang.Boolean> AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final java.lang.String EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final java.lang.String copydefault;
    public final ConcurrentLinkedQueue<AbstractC48864udi.Application> djBIcL;
    public boolean fetchVPNInfo;
    public volatile boolean gEmmrt;
    public boolean isConnected;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43125rjQ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.EZpvd;
    }

    public final InterfaceC7790aqV isConnected() {
        return this;
    }

    public C43125rjQ(final java.util.concurrent.Executor executor) {
        java.lang.String str = C43082ria.EZpvd.EZpvd() + "hotReload";
        this.EZpvd = str;
        this.copydefault = str + "/oklua.bundle.zip";
        this.isConnected = true;
        this.fetchVPNInfo = true;
        this.AkhnZx = ConcurrentHashMap.newKeySet();
        this.djBIcL = new ConcurrentLinkedQueue<>();
        this.valueOf = "";
        this.AYXKKw = "";
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43125rjQ.copydefault();
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.rjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43125rjQ.EZpvd(executor);
            }
        });
        this.AhwBna = new C7828arG("miniapp_sp", "disableOkluaAutoUpdate", false);
        copydefault(SPUtils.getString("last_mln_version_sp_key", ""));
        EZpvd(SPUtils.getString("last_md5_sp_key", ""));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.concurrent.Executor:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.concurrent.Executor) : (r1v0 java.util.concurrent.Executor))
 A[MD:(java.util.concurrent.Executor):void (m)] (LINE:69) call: o.rjQ.<init>(java.util.concurrent.Executor):void type: THIS */
    public /* synthetic */ C43125rjQ(java.util.concurrent.Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : executor);
    }

    public final void AEQbTJ(long j, long j2) {
        java.util.List listAxsJAYsNCnLh;
        synchronized (this.djBIcL) {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.djBIcL);
        }
        java.util.Iterator it = listAxsJAYsNCnLh.iterator();
        while (it.hasNext()) {
            ((AbstractC48864udi.Application) it.next()).EZpvd(j, j2);
        }
    }

    public static /* synthetic */ void notifyAllCallbacksAndClear$default(C43125rjQ c43125rjQ, C48860ude c48860ude, java.lang.String str, java.lang.Throwable th, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyAllCallbacksAndClear");
        }
        if ((i & 1) != 0) {
            c48860ude = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c43125rjQ.KWHzl(c48860ude, str, th, z);
    }

    public final void KWHzl(C48860ude c48860ude, java.lang.String str, java.lang.Throwable th, boolean z) {
        java.util.List<AbstractC48864udi.Application> listAxsJAYsNCnLh;
        synchronized (this.djBIcL) {
            this.gEmmrt = false;
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.djBIcL);
            this.djBIcL.clear();
        }
        C43102riu.copydefault();
        pUU.EZpvd("MLNUpdateDownloader", "Notifying " + listAxsJAYsNCnLh.size() + " callbacks and clearing queue");
        for (AbstractC48864udi.Application application : listAxsJAYsNCnLh) {
            if (z) {
                application.EZpvd();
            } else if (th != null) {
                application.KWHzl(th);
            } else if (c48860ude != null && str != null) {
                application.EZpvd(c48860ude, str);
            }
        }
    }

    public final java.util.Set<java.lang.String> fetchVPNInfo() {
        ConcurrentHashMap.KeySetView<java.lang.String, java.lang.Boolean> keySetView = this.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(keySetView, "");
        return CollectionsKt___CollectionsKt.OqFWZa(keySetView);
    }

    public final void copydefault(java.lang.String str) {
        this.valueOf = str;
        ConcurrentHashMap.KeySetView<java.lang.String, java.lang.Boolean> keySetView = this.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(keySetView, "");
        keySetView.add(str);
        SPUtils.put("last_mln_version_sp_key", str);
    }

    public final void EZpvd(java.lang.String str) {
        this.AYXKKw = str;
        SPUtils.put("last_md5_sp_key", str);
    }

    public final java.lang.String djBIcL() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String copydefault() {
        java.lang.String strEZpvd = C33486mxP.EZpvd(C32979mnm.EZpvd.OLrzqt(), "oklua.bundle/info.json");
        if (strEZpvd != null) {
            try {
                return new JSONObject(strEZpvd).getString("ver");
            } catch (java.lang.Exception e) {
                C43102riu.copydefault();
                pUU.copydefault("MLNUpdateDownloader", "parse version data error:" + e.getMessage());
            }
        }
        return "";
    }

    public final java.lang.String valueOf() {
        if (this.valueOf.length() == 0) {
            return this.EZpvd + "/oklua.bundle";
        }
        return this.EZpvd + "/" + this.valueOf + "/oklua.bundle";
    }

    public final java.util.concurrent.Executor DbNXlk() {
        return (java.util.concurrent.Executor) this.DbNXlk.getValue();
    }

    public static final java.util.concurrent.Executor EZpvd(java.util.concurrent.Executor executor) {
        return executor == null ? Executors.newSingleThreadExecutor() : executor;
    }

    public final boolean AhwBna() {
        return this.AhwBna.getValue(this, AEQbTJ[0]).booleanValue();
    }

    public final void OLrzqt(boolean z) {
        this.AhwBna.KWHzl(this, AEQbTJ[0], java.lang.Boolean.valueOf(z));
    }

    public static /* synthetic */ MlnUpdateRequest getRequestMlnHotReloadParams$default(C43125rjQ c43125rjQ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestMlnHotReloadParams");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c43125rjQ.AEQbTJ(z, z2);
    }

    public final MlnUpdateRequest AEQbTJ(boolean z, boolean z2) {
        if (z2 && AhwBna()) {
            return null;
        }
        return new MlnUpdateRequest(C43047rhs.AEQbTJ.AEQbTJ(z));
    }

    public final void copydefault(@NotNull final android.content.Context context, final MlnUpdateResp mlnUpdateResp, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(context, "");
        if (mlnUpdateResp != null) {
            copydefault("onRequestMlnHotReloadResponse", (AbstractC48864udi.Application) null, new Function0() { // from class: o.rjY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C43125rjQ.EZpvd(this.OLrzqt, mlnUpdateResp, context);
                }
            });
        }
    }

    public static final Unit EZpvd(C43125rjQ c43125rjQ, MlnUpdateResp mlnUpdateResp, android.content.Context context) {
        AbstractC58185ywX<ResponseData<MlnUpdateResp>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, mlnUpdateResp, null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        c43125rjQ.KWHzl(abstractC58185ywXKWHzl, context);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC7792aqX
    public void copydefault(@NotNull final android.content.Context context, final boolean z, AbstractC48864udi.Application application) {
        Intrinsics.checkNotNullParameter(context, "");
        copydefault("requestMlnHotReload, updateLanguageFromRemote: " + z, application, new Function0() { // from class: o.rjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43125rjQ.EZpvd(z, context, this);
            }
        });
    }

    public static final Unit EZpvd(boolean z, android.content.Context context, C43125rjQ c43125rjQ) {
        AbstractC58185ywX<pSD> abstractC58185ywXKWHzl;
        if (z) {
            abstractC58185ywXKWHzl = pSC.AEQbTJ.EZpvd(context).KWHzl(yBP.AEQbTJ()).OLrzqt(new InterfaceC60096zvd() { // from class: o.rkc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC60096zvd
                public final void subscribe(InterfaceC60097zve interfaceC60097zve) {
                    C43125rjQ.OLrzqt(interfaceC60097zve);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final ActionBar actionBar = c43125rjQ.new ActionBar();
        AbstractC58185ywX<ResponseData<MlnUpdateResp>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super pSD, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.rka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43125rjQ.OLrzqt(actionBar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        c43125rjQ.KWHzl(abstractC58185ywXKWHzl2, context);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(InterfaceC60097zve interfaceC60097zve) {
        interfaceC60097zve.onNext(new pSD(null, null, null, 7, null));
        interfaceC60097zve.onComplete();
    }

    /* JADX INFO: renamed from: o.rjQ$ActionBar */
    public static final class ActionBar implements Function1<?, InterfaceC60096zvd<? extends ResponseData<MlnUpdateResp>>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<MlnUpdateResp>> invoke(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            C43102riu.copydefault();
            pUU.EZpvd("MLNUpdateDownloader", "requestMlnHotReload getMlnUpdateInfo");
            return InterfaceC48877udv.Companion.EZpvd(C43125rjQ.getRequestMlnHotReloadParams$default(C43125rjQ.this, false, false, 3, null));
        }
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.rjQ$StateListAnimator */
    public static final class StateListAnimator implements AbstractC48864udi.Application {
        public final /* synthetic */ AbstractC48864udi.ActionBar OLrzqt;

        public StateListAnimator(AbstractC48864udi.ActionBar actionBar) {
            this.OLrzqt = actionBar;
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this, str);
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            this.OLrzqt.AEQbTJ(j, j2);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
            this.OLrzqt.OLrzqt(new java.lang.Exception("update skipped"));
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(C48860ude c48860ude, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt.EZpvd(str);
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt.OLrzqt(th);
        }
    }

    public final void AEQbTJ(@NotNull final android.content.Context context, @NotNull AbstractC48864udi.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        copydefault("requestMlnHotReloadForWhiteList", new StateListAnimator(actionBar), new Function0() { // from class: o.rjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43125rjQ.KWHzl(this.AEQbTJ, context);
            }
        });
    }

    public static final Unit KWHzl(C43125rjQ c43125rjQ, android.content.Context context) {
        c43125rjQ.KWHzl(InterfaceC48877udv.Companion.EZpvd(getRequestMlnHotReloadParams$default(c43125rjQ, true, false, 2, null)), context);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str, AbstractC48864udi.Application application, Function0<Unit> function0) {
        synchronized (this.djBIcL) {
            C43102riu.copydefault();
            pUU.EZpvd("MLNUpdateDownloader", str + ", isDownloading: " + this.gEmmrt);
            if (application != null) {
                this.djBIcL.offer(application);
            }
            if (this.gEmmrt) {
                return;
            }
            this.gEmmrt = true;
            Unit unit = Unit.INSTANCE;
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.rjQ$LoaderManager */
    public static final class LoaderManager implements AbstractC48864udi.Application {
        public final /* synthetic */ C7841arT AEQbTJ;

        public LoaderManager(C7841arT c7841arT) {
            this.AEQbTJ = c7841arT;
        }

        @Override // o.AbstractC48864udi.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this, str);
        }

        @Override // o.AbstractC48864udi.Application
        public void copydefault() {
            AbstractC48864udi.Application.ActionBar.OLrzqt(this);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(long j, long j2) {
            C43125rjQ.this.AEQbTJ(j, j2);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd() {
            C43125rjQ.notifyAllCallbacksAndClear$default(C43125rjQ.this, null, null, null, true, 7, null);
        }

        @Override // o.AbstractC48864udi.Application
        public void EZpvd(C48860ude c48860ude, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c48860ude, "");
            Intrinsics.checkNotNullParameter(str, "");
            C43125rjQ.notifyAllCallbacksAndClear$default(C43125rjQ.this, c48860ude, str, null, false, 12, null);
            this.AEQbTJ.AEQbTJ();
        }

        @Override // o.AbstractC48864udi.Application
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C43125rjQ.notifyAllCallbacksAndClear$default(C43125rjQ.this, null, null, th, false, 11, null);
            C43102riu.copydefault();
            pUU.AEQbTJ("MLNUpdateDownloader", "update error", th);
            this.AEQbTJ.KWHzl(th);
        }
    }

    public final void KWHzl(AbstractC58185ywX<ResponseData<MlnUpdateResp>> abstractC58185ywX, final android.content.Context context) {
        final C7841arT c7841arT = new C7841arT("oklua");
        final LoaderManager loaderManager = new LoaderManager(c7841arT);
        C43102riu.copydefault();
        pUU.EZpvd("MLNUpdateDownloader", "local: " + this.valueOf + " (MD5: " + this.AYXKKw + "), assertVersion: " + djBIcL());
        AbstractC58185ywX<ResponseData<MlnUpdateResp>> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.KWHzl(DbNXlk())).KWHzl(yBP.KWHzl(DbNXlk()));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        yBI.subscribeBy$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.rjW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43125rjQ.OLrzqt(loaderManager, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.rjV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43125rjQ.OLrzqt(this.OLrzqt, c7841arT, context, loaderManager, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(LoaderManager loaderManager, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        loaderManager.KWHzl(new MiniAppUpdateError(303, th));
        return Unit.INSTANCE;
    }

    public final void KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, AbstractC48864udi.Application application) {
        if (C48833udD.KWHzl(str3, str4)) {
            EZpvd(str, str2, str3, str4, application);
            return;
        }
        C43102riu.copydefault();
        pUU.KWHzl("MLNUpdateDownloader", "start downloading");
        C7864arq.copydefault(context, str2, str3, str4, new Application(application, str3, str4, this, str, str2));
    }

    /* JADX INFO: renamed from: o.rjQ$Application */
    public static final class Application implements InterfaceC33145mqt {
        public final /* synthetic */ AbstractC48864udi.Application AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ C43125rjQ djBIcL;
        public long valueOf;

        public Application(AbstractC48864udi.Application application, java.lang.String str, java.lang.String str2, C43125rjQ c43125rjQ, java.lang.String str3, java.lang.String str4) {
            this.AEQbTJ = application;
            this.EZpvd = str;
            this.copydefault = str2;
            this.djBIcL = c43125rjQ;
            this.KWHzl = str3;
            this.OLrzqt = str4;
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
            long j3 = 10;
            long j4 = (j * j3) / j2;
            if (this.valueOf < j4) {
                this.valueOf = j4;
                C43102riu.copydefault();
                pUU.OLrzqt("MLNUpdateDownloader", "downloading progress = " + j + ", total = " + j2 + ", percent = " + (this.valueOf * j3) + "%");
            }
            this.AEQbTJ.EZpvd(j, j2);
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            this.AEQbTJ.KWHzl(new MiniAppUpdateError(304, "download error, errorCode = " + i + ", desc = " + str, null, 4, null));
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            C43102riu.copydefault();
            pUU.KWHzl("MLNUpdateDownloader", "download success, result = " + str);
            if (C48833udD.KWHzl(this.EZpvd, this.copydefault)) {
                this.djBIcL.EZpvd(this.KWHzl, this.OLrzqt, this.EZpvd, this.copydefault, this.AEQbTJ);
                return;
            }
            this.AEQbTJ.KWHzl(new MiniAppUpdateError(305, "MD5 check failed, MD5: " + this.copydefault, null, 4, null));
        }
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, AbstractC48864udi.Application application) {
        C43102riu.copydefault();
        pUU.KWHzl("MLNUpdateDownloader", "MD5 equals");
        java.lang.Object objCopydefault = copydefault(str3, str, str4);
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            application.EZpvd(new C48860ude("oklua", str4, str, str2, null, 16, null), str3);
            return;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
        application.KWHzl(thM7380exceptionOrNullimpl);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!copydefault(str2, str3)) {
            C43102riu.copydefault();
            pUU.KWHzl("MLNUpdateDownloader", "not newer version, skip decompress");
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new MiniAppUpdateError(305, "not newer version, skip decompress", null, 4, null)));
        }
        if (C48833udD.KWHzl(str, str3)) {
            java.lang.String str4 = this.EZpvd + java.io.File.separator + str2;
            C43102riu.copydefault();
            pUU.KWHzl("MLNUpdateDownloader", "decompress " + str + " to " + str4);
            if (C7871arx.AEQbTJ(str4, str, new Activity())) {
                copydefault(str2);
                EZpvd(str3);
                this.fetchVPNInfo = true;
                C43292rmY.OLrzqt.copydefault(C7326ahi.gEmmrt());
                RxBus.AEQbTJ(new C43128rjT());
                C7906asf.AEQbTJ("universal", str2);
                C6800aWH.EZpvd(str);
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(Unit.INSTANCE);
            }
            C43102riu.copydefault();
            pUU.valueOf("MLNUpdateDownloader", "decompress failed");
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new MiniAppUpdateError(305, "decompress failed", null, 4, null)));
        }
        Result.Application application4 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new MiniAppUpdateError(305, "md5 check failed", null, 4, null)));
    }

    /* JADX INFO: renamed from: o.rjQ$Activity */
    public static final class Activity implements InterfaceC33145mqt {
        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
        }

        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            if (str == null) {
                str = "Unzip error.";
            }
            C43102riu.copydefault();
            pUU.copydefault("MLNUpdateDownloader", str);
            C43104riw.reportUpdateFailure$default(str, null, 2, null);
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            C43102riu.copydefault();
            if (str == null) {
                str = "";
            }
            pUU.KWHzl("MLNUpdateDownloader", str);
        }
    }

    public final boolean copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String strDjBIcL;
        java.util.List<java.lang.String> listGEmmrt;
        java.util.List<java.lang.String> listGEmmrt2;
        if (OLrzqt()) {
            strDjBIcL = djBIcL();
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) str) && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) AkhnZx())) {
                return true;
            }
            strDjBIcL = this.valueOf;
        }
        java.lang.String str3 = strDjBIcL;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            listGEmmrt = StringsKt__StringsKt.split$default((java.lang.CharSequence) str3, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        } else {
            listGEmmrt = yDY.gEmmrt("0", "0", "0");
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            listGEmmrt2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        } else {
            listGEmmrt2 = yDY.gEmmrt("0", "0", "0");
        }
        if (listGEmmrt.size() == 3 && listGEmmrt2.size() == 3) {
            return EZpvd(listGEmmrt, listGEmmrt2);
        }
        return false;
    }

    public final boolean OLrzqt() {
        if (this.fetchVPNInfo) {
            this.isConnected = AEQbTJ();
            this.fetchVPNInfo = false;
        }
        return this.isConnected;
    }

    public final boolean AEQbTJ() {
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) djBIcL()) || C48833udD.copydefault(this.valueOf, djBIcL()) <= 0;
    }

    @Override // o.InterfaceC7790aqV
    public java.lang.String AEQbTJ(android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (context == null) {
            return "";
        }
        java.lang.String strAEQbTJ = valueOf() + "/" + str;
        if (!new java.io.File(strAEQbTJ).exists() || OLrzqt()) {
            strAEQbTJ = C7791aqW.AEQbTJ(str);
        }
        Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
        return strAEQbTJ;
    }

    @Override // o.InterfaceC43015rhM
    public void KWHzl() {
        yFL.AkhnZx(new java.io.File(this.EZpvd));
        copydefault("");
        EZpvd("");
        this.fetchVPNInfo = true;
        C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
        if (c7791aqWAEQbTJ != null) {
            c7791aqWAEQbTJ.AEQbTJ(false);
            java.io.File fileAYXKKw = c7791aqWAEQbTJ.AYXKKw();
            if (fileAYXKKw != null) {
                yFL.AkhnZx(fileAYXKKw);
            }
            c7791aqWAEQbTJ.EZpvd(null);
        }
    }

    /* JADX INFO: renamed from: o.rjQ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rjQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final boolean EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) list2.get(i))) {
                return C33129mqd.valueOf(str) < C33129mqd.valueOf(list2.get(i));
            }
            i++;
        }
        return false;
    }

    public static final Unit OLrzqt(C43125rjQ c43125rjQ, C7841arT c7841arT, android.content.Context context, LoaderManager loaderManager, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            MlnUpdateResp mlnUpdateResp = (MlnUpdateResp) data;
            C43102riu.copydefault();
            pUU.EZpvd("MLNUpdateDownloader", "request success, resp: " + responseData.getData());
            if (mlnUpdateResp.getVersion().length() > 0 && c43125rjQ.copydefault(mlnUpdateResp.getVersion(), mlnUpdateResp.getMd5())) {
                java.lang.String str = c43125rjQ.copydefault;
                c7841arT.OLrzqt(mlnUpdateResp.getVersion());
                c7841arT.EZpvd();
                c43125rjQ.KWHzl(context, mlnUpdateResp.getVersion(), mlnUpdateResp.getUrl(), str, mlnUpdateResp.getMd5(), loaderManager);
            } else {
                C43102riu.copydefault();
                pUU.KWHzl("MLNUpdateDownloader", "not newer version, skip download");
                loaderManager.EZpvd();
            }
        } else {
            loaderManager.KWHzl(new MiniAppUpdateError(303, "request error, code: " + responseData.getCode() + ", msg: " + responseData.getMsg(), null, 4, null));
        }
        return Unit.INSTANCE;
    }
}
