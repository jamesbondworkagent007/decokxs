package com.okinc.business.defi.common.utils;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.BlockAddressCheckResp;
import com.okinc.business.defi.biz.net.bean.DeviceRefCodeCacheBean;
import com.okinc.business.defi.biz.net.bean.InviteeInfoItemResponse;
import com.okinc.business.defi.biz.net.bean.InviteeInfoResponse;
import com.okinc.business.defi.biz.net.bean.InviterAddress;
import com.okinc.business.defi.biz.net.bean.ListChainResponse;
import com.okinc.business.defi.biz.net.bean.PreferRefCodeCacheBean;
import com.okinc.business.defi.biz.net.bean.PreferRefCodeInfoResponse;
import com.okinc.business.defi.biz.net.bean.RefInfoResponse;
import com.okinc.business.defi.biz.net.bean.RefIpCheckResponse;
import com.okinc.business.defi.biz.net.bean.ReferralSignatureData;
import com.okinc.business.defi.biz.net.bean.ReferralSubInviterInvitationResponse;
import com.okinc.business.defi.biz.net.bean.UnBindBackendReferralCodeCacheBean;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.WalletReferralSource;
import com.okinc.wallet.api.bean.ReferralCodeType;
import com.okinc.wallet.api.bean.ReferralInfo;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.VerifyMessageParams;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractActivityC33041mov;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.AbstractC58185ywX;
import o.AbstractC58245yxe;
import o.AbstractC58260yxt;
import o.C10337bmZ;
import o.C10854bwM;
import o.C10954byG;
import o.C11286cIp;
import o.C12827cuN;
import o.C13458dMb;
import o.C13754dXa;
import o.C13934dbu;
import o.C14513dmq;
import o.C14644dpO;
import o.C14716dqh;
import o.C14723dqo;
import o.C32866mlf;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33569myt;
import o.C38307pTy;
import o.C43056riA;
import o.C43251rlk;
import o.C48787ucK;
import o.C54819xWm;
import o.C54836xXc;
import o.C55298xhM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;
import o.C56548yJl;
import o.C59449zhJ;
import o.C7323ahf;
import o.C9678baC;
import o.C9748bbT;
import o.InterfaceC54852xXs;
import o.InterfaceC54856xXw;
import o.InterfaceC54859xXz;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58239yxY;
import o.InterfaceC7298ahG;
import o.InterfaceC7835arN;
import o.InterfaceC9731bbC;
import o.InterfaceC9734bbF;
import o.InterfaceC9738bbJ;
import o.InterfaceC9739bbK;
import o.InterfaceC9740bbL;
import o.InterfaceC9852bdR;
import o.pTB;
import o.pUU;
import o.xWO;
import o.xXL;
import o.xXO;
import o.xYU;
import o.xYW;
import o.yDY;
import o.yFA;
import o.yFK;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralManager {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final ConcurrentHashMap<String, Boolean> AEQbTJ;
    public final C14644dpO AYXKKw;
    public final ConcurrentHashMap<String, ReferralInfoBean> AhwBna;
    public InterfaceC58217yxC DbNXlk;
    public Job EZpvd;
    public volatile boolean OLrzqt;
    public CompletableDeferred<Unit> copydefault;
    public volatile boolean djBIcL;
    public final ReferralBindReportManagerV2 fetchVPNInfo;
    public final C11286cIp gEmmrt;
    public final C13934dbu isConnected;
    public final C14723dqo valueOf;
    public final C14716dqh values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ReferralManager copydefault() {
        return Companion.KWHzl();
    }

    public final boolean KWHzl() {
        return true;
    }

    public final boolean djBIcL() {
        return true;
    }

    public final boolean ejfBZ() {
        return true;
    }

    public final boolean fARcdN() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.djBIcL;
    }

    public ReferralManager(@NotNull C11286cIp c11286cIp, @NotNull C13934dbu c13934dbu, @NotNull C14716dqh c14716dqh, @NotNull ReferralBindReportManagerV2 referralBindReportManagerV2, @NotNull C14723dqo c14723dqo, @NotNull C14644dpO c14644dpO) {
        Intrinsics.checkNotNullParameter(c11286cIp, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c14716dqh, "");
        Intrinsics.checkNotNullParameter(referralBindReportManagerV2, "");
        Intrinsics.checkNotNullParameter(c14723dqo, "");
        Intrinsics.checkNotNullParameter(c14644dpO, "");
        this.gEmmrt = c11286cIp;
        this.isConnected = c13934dbu;
        this.values = c14716dqh;
        this.fetchVPNInfo = referralBindReportManagerV2;
        this.valueOf = c14723dqo;
        this.AYXKKw = c14644dpO;
        this.AhwBna = new ConcurrentHashMap<>();
        this.copydefault = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.AEQbTJ = new ConcurrentHashMap<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.common.utils.ReferralManager.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ReferralManager KWHzl() {
            return getInstance$default(this, null, 1, null);
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ ReferralManager getInstance$default(StateListAnimator stateListAnimator, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.AEQbTJ(context);
        }

        public final ReferralManager AEQbTJ(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).getNewProxyInstance();
        }
    }

    public final void iwGUEr() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ReferralManager$updateAllReferralInfo$1(this, null), 3, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0039 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x004c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x0154 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0027 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[Catch: all -> 0x004c, Exception -> 0x004f, TryCatch #6 {Exception -> 0x004f, all -> 0x004c, blocks: (B:22:0x0048, B:36:0x0077, B:37:0x00a2, B:39:0x00a8, B:41:0x00cc, B:42:0x00f5, B:43:0x010a), top: B:62:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.okinc.business.defi.common.utils.ReferralManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object djBIcL(Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$updateAllReferralInfoAsync$1 referralManager$updateAllReferralInfoAsync$1;
        ?? r3;
        ?? r0;
        ?? r02 = " records";
        if (continuation instanceof ReferralManager$updateAllReferralInfoAsync$1) {
            referralManager$updateAllReferralInfoAsync$1 = (ReferralManager$updateAllReferralInfoAsync$1) continuation;
            int i = referralManager$updateAllReferralInfoAsync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$updateAllReferralInfoAsync$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$updateAllReferralInfoAsync$1 = new ReferralManager$updateAllReferralInfoAsync$1(this, continuation);
            }
        }
        Object objEZpvd = referralManager$updateAllReferralInfoAsync$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$updateAllReferralInfoAsync$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                if (this.djBIcL) {
                    pUU.EZpvd("DexReferral", "updateAllReferralInfoAsync: Already initializing, skipping");
                    return Unit.INSTANCE;
                }
                try {
                    this.djBIcL = true;
                    pUU.KWHzl("DexReferral", "updateAllReferralInfoAsync: Starting update");
                    C11286cIp c11286cIp = this.gEmmrt;
                    referralManager$updateAllReferralInfoAsync$1.L$0 = this;
                    referralManager$updateAllReferralInfoAsync$1.label = 1;
                    objEZpvd = c11286cIp.EZpvd(referralManager$updateAllReferralInfoAsync$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    r3 = this;
                    List<Triple> list = (List) objEZpvd;
                    pUU.EZpvd("DexReferral", "updateAllReferralInfoAsync: Retrieved " + list.size() + " records");
                    r3.AhwBna.clear();
                    ArrayList arrayList = new ArrayList();
                    while (r13.hasNext()) {
                    }
                    RxBus.AEQbTJ(new xXL(arrayList));
                    pUU.KWHzl("DexReferral", "updateAllReferralInfoAsync completed: Retrieved " + r3.AhwBna.size() + " records");
                    r3.copydefault.complete(Unit.INSTANCE);
                    referralManager$updateAllReferralInfoAsync$1.L$0 = r3;
                    referralManager$updateAllReferralInfoAsync$1.label = 2;
                    if (r3.EZpvd(referralManager$updateAllReferralInfoAsync$1) != objCopydefault) {
                    }
                } catch (Exception e) {
                    e = e;
                    r0 = this;
                    pUU.AEQbTJ("DexReferral", "updateAllReferralInfoAsync, Fail", e);
                    r0.copydefault.complete(Unit.INSTANCE);
                    r02 = r0;
                } catch (Throwable th) {
                    th = th;
                    r3 = this;
                    r3.djBIcL = false;
                    throw th;
                }
            } else if (i2 == 1) {
                r3 = (ReferralManager) referralManager$updateAllReferralInfoAsync$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    r3 = r3;
                    List<Triple> list2 = (List) objEZpvd;
                    pUU.EZpvd("DexReferral", "updateAllReferralInfoAsync: Retrieved " + list2.size() + " records");
                    r3.AhwBna.clear();
                    ArrayList arrayList2 = new ArrayList();
                    for (Triple triple : list2) {
                        String strEZpvd = r3.EZpvd((String) triple.getFirst(), (String) triple.getSecond());
                        ReferralInfoBean referralInfoBeanAEQbTJ = ReferralInfoBean.Companion.AEQbTJ((String) triple.getThird());
                        if (referralInfoBeanAEQbTJ != null) {
                            r3.AhwBna.put(strEZpvd, referralInfoBeanAEQbTJ);
                            arrayList2.add(referralInfoBeanAEQbTJ.getReferralCode());
                            pUU.KWHzl("DexReferral", "updateAllReferralInfoAsync key=" + strEZpvd + " bean=" + referralInfoBeanAEQbTJ);
                        } else {
                            pUU.copydefault("DexReferral", "updateAllReferralInfoAsync: Failed to parse JSON for key: " + strEZpvd);
                        }
                    }
                    RxBus.AEQbTJ(new xXL(arrayList2));
                    pUU.KWHzl("DexReferral", "updateAllReferralInfoAsync completed: Retrieved " + r3.AhwBna.size() + " records");
                    r3.copydefault.complete(Unit.INSTANCE);
                    referralManager$updateAllReferralInfoAsync$1.L$0 = r3;
                    referralManager$updateAllReferralInfoAsync$1.label = 2;
                    if (r3.EZpvd(referralManager$updateAllReferralInfoAsync$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    r02 = r3;
                } catch (Exception e2) {
                    e = e2;
                    r0 = r3;
                    pUU.AEQbTJ("DexReferral", "updateAllReferralInfoAsync, Fail", e);
                    r0.copydefault.complete(Unit.INSTANCE);
                    r02 = r0;
                } catch (Throwable th2) {
                    th = th2;
                    r3.djBIcL = false;
                    throw th;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0 = (ReferralManager) referralManager$updateAllReferralInfoAsync$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                    r02 = r0;
                } catch (Exception e3) {
                    e = e3;
                    pUU.AEQbTJ("DexReferral", "updateAllReferralInfoAsync, Fail", e);
                    r0.copydefault.complete(Unit.INSTANCE);
                    r02 = r0;
                }
            }
            r02.djBIcL = false;
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            r3 = r02;
        }
    }

    public final void wlaJM() {
        if (!fIwbmz() && !fJNWhG()) {
            pUU.KWHzl("DexReferral", "Triggering initialization");
            iwGUEr();
        } else {
            pUU.KWHzl("DexReferral", "Already initializing or initialized");
        }
    }

    public final void EZpvd() {
        if (OLrzqt()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.dqc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ReferralManager.djBIcL(this.EZpvd);
                }
            });
        }
    }

    public static final void djBIcL(final ReferralManager referralManager) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: o.dqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return ReferralManager.AhwBna(this.AEQbTJ);
            }
        });
    }

    public static final boolean AhwBna(ReferralManager referralManager) {
        pUU.KWHzl("DexReferral", "check DexReferral init");
        referralManager.wlaJM();
        return false;
    }

    public final boolean fJNWhG() {
        return this.copydefault.isCompleted();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object valueOf(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$waitForInitialization$1 referralManager$waitForInitialization$1;
        if (continuation instanceof ReferralManager$waitForInitialization$1) {
            referralManager$waitForInitialization$1 = (ReferralManager$waitForInitialization$1) continuation;
            int i = referralManager$waitForInitialization$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$waitForInitialization$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$waitForInitialization$1 = new ReferralManager$waitForInitialization$1(this, continuation);
            }
        }
        Object obj = referralManager$waitForInitialization$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$waitForInitialization$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                CompletableDeferred<Unit> completableDeferred = this.copydefault;
                referralManager$waitForInitialization$1.label = 1;
                if (completableDeferred.await(referralManager$waitForInitialization$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            pUU.EZpvd("DexReferral", "ReferralManager initialization completed");
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "waitForInitialization: Exception", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:13:0x002f, B:31:0x0072, B:33:0x0076, B:34:0x0079, B:18:0x003f, B:25:0x005e, B:27:0x0066, B:35:0x009c, B:21:0x0046), top: B:41:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$registerUnbindBackendReferralInfoCheckListener$1 referralManager$registerUnbindBackendReferralInfoCheckListener$1;
        ReferralManager referralManager;
        final ReferralManager referralManager2;
        InterfaceC58217yxC interfaceC58217yxC;
        if (continuation instanceof ReferralManager$registerUnbindBackendReferralInfoCheckListener$1) {
            referralManager$registerUnbindBackendReferralInfoCheckListener$1 = (ReferralManager$registerUnbindBackendReferralInfoCheckListener$1) continuation;
            int i = referralManager$registerUnbindBackendReferralInfoCheckListener$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$registerUnbindBackendReferralInfoCheckListener$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$registerUnbindBackendReferralInfoCheckListener$1 = new ReferralManager$registerUnbindBackendReferralInfoCheckListener$1(this, continuation);
            }
        }
        Object objAwaitFirst = referralManager$registerUnbindBackendReferralInfoCheckListener$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$registerUnbindBackendReferralInfoCheckListener$1.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "registerUnbindBackendReferralInfoCheckListener error", e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwaitFirst);
            pUU.KWHzl("DexReferral", "registerUnbindBackendReferralInfoCheckListener start");
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            referralManager$registerUnbindBackendReferralInfoCheckListener$1.L$0 = this;
            referralManager$registerUnbindBackendReferralInfoCheckListener$1.label = 1;
            objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, referralManager$registerUnbindBackendReferralInfoCheckListener$1);
            if (objAwaitFirst == objCopydefault) {
                return objCopydefault;
            }
            referralManager = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                referralManager2 = (ReferralManager) referralManager$registerUnbindBackendReferralInfoCheckListener$1.L$0;
                C56391yDq.AEQbTJ(objAwaitFirst);
                interfaceC58217yxC = referralManager2.DbNXlk;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new String[0]);
                final Function1 function1 = new Function1() { // from class: o.dpV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ReferralManager.copydefault(this.KWHzl, (xXO) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dpU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReferralManager.gEmmrt(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.dqf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ReferralManager.KWHzl((java.lang.Throwable) obj);
                    }
                };
                referralManager2.DbNXlk = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dqd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReferralManager.AkhnZx(function12, obj);
                    }
                });
                return Unit.INSTANCE;
            }
            referralManager = (ReferralManager) referralManager$registerUnbindBackendReferralInfoCheckListener$1.L$0;
            C56391yDq.AEQbTJ(objAwaitFirst);
        }
        if (((Boolean) objAwaitFirst).booleanValue()) {
            referralManager$registerUnbindBackendReferralInfoCheckListener$1.L$0 = referralManager;
            referralManager$registerUnbindBackendReferralInfoCheckListener$1.label = 2;
            if (referralManager.OLrzqt(referralManager$registerUnbindBackendReferralInfoCheckListener$1) == objCopydefault) {
                return objCopydefault;
            }
            referralManager2 = referralManager;
            interfaceC58217yxC = referralManager2.DbNXlk;
            if (interfaceC58217yxC != null) {
            }
            AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(xXO.class, new String[0]);
            final Function1 function13 = new Function1() { // from class: o.dpV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ReferralManager.copydefault(this.KWHzl, (xXO) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dpU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ReferralManager.gEmmrt(function13, obj);
                }
            };
            final Function1 function122 = new Function1() { // from class: o.dqf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ReferralManager.KWHzl((java.lang.Throwable) obj);
                }
            };
            referralManager2.DbNXlk = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dqd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ReferralManager.AkhnZx(function122, obj);
                }
            });
            return Unit.INSTANCE;
        }
        pUU.valueOf("DexReferral", "registerUnbindBackendReferralInfoCheckListener failed");
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ReferralManager referralManager, xXO xxo) {
        Job job = referralManager.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        referralManager.EZpvd = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ReferralManager$registerUnbindBackendReferralInfoCheckListener$2$1(referralManager, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Throwable th) {
        pUU.AEQbTJ("DexReferral", "WalletMainEvent subscription error", th);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0025 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:13:0x0033, B:41:0x00e4, B:29:0x007c, B:31:0x008a, B:33:0x00a6, B:35:0x00bb, B:36:0x00bf, B:37:0x00c3, B:38:0x00c7), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: Exception -> 0x0038, TryCatch #2 {Exception -> 0x0038, blocks: (B:13:0x0033, B:41:0x00e4, B:29:0x007c, B:31:0x008a, B:33:0x00a6, B:35:0x00bb, B:36:0x00bf, B:37:0x00c3, B:38:0x00c7), top: B:53:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.okinc.business.defi.common.utils.ReferralManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$bindReferralSubInviter$1 referralManager$bindReferralSubInviter$1;
        ?? r2;
        Exception e;
        Object obj;
        ?? r12;
        ?? r11;
        Pair pair;
        if (continuation instanceof ReferralManager$bindReferralSubInviter$1) {
            referralManager$bindReferralSubInviter$1 = (ReferralManager$bindReferralSubInviter$1) continuation;
            int i = referralManager$bindReferralSubInviter$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$bindReferralSubInviter$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$bindReferralSubInviter$1 = new ReferralManager$bindReferralSubInviter$1(this, continuation);
            }
        }
        Object obj2 = referralManager$bindReferralSubInviter$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$bindReferralSubInviter$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj2);
                EZpvd(context);
                try {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ReferralManager$bindReferralSubInviter$resultPair$1 referralManager$bindReferralSubInviter$resultPair$1 = new ReferralManager$bindReferralSubInviter$resultPair$1(this, str, null);
                    referralManager$bindReferralSubInviter$1.L$0 = this;
                    referralManager$bindReferralSubInviter$1.L$1 = context;
                    referralManager$bindReferralSubInviter$1.L$2 = str;
                    referralManager$bindReferralSubInviter$1.label = 1;
                    Object objWithContext = BuildersKt.withContext(io2, referralManager$bindReferralSubInviter$resultPair$1, referralManager$bindReferralSubInviter$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objWithContext;
                    r12 = str;
                    r11 = this;
                    pair = (Pair) obj;
                    if (((Number) pair.getFirst()).intValue() != 0) {
                    }
                    str.AEQbTJ(context);
                } catch (Exception e2) {
                    e = e2;
                    r2 = this;
                    r2.AEQbTJ(context);
                    pUU.AEQbTJ("DexReferral", "bindReferralSubInviter failed", e);
                }
            } else if (i2 == 1) {
                String str2 = (String) referralManager$bindReferralSubInviter$1.L$2;
                context = (Context) referralManager$bindReferralSubInviter$1.L$1;
                r2 = (ReferralManager) referralManager$bindReferralSubInviter$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    r12 = str2;
                    r11 = r2;
                    obj = obj2;
                    pair = (Pair) obj;
                    if (((Number) pair.getFirst()).intValue() != 0) {
                        ReferralSubInviterInvitationResponse referralSubInviterInvitationResponse = (ReferralSubInviterInvitationResponse) pair.getSecond();
                        pUU.KWHzl("DexReferral", "bindReferralSubInviter data=" + referralSubInviterInvitationResponse);
                        if (referralSubInviterInvitationResponse != null) {
                            Json.Default r1 = Json.Default;
                            r1.getSerializersModule();
                            String strEncodeToString = r1.encodeToString(ReferralSubInviterInvitationResponse.Companion.serializer(), referralSubInviterInvitationResponse);
                            if (referralSubInviterInvitationResponse.getStatus() == 1) {
                                r11.copydefault(context, r12, strEncodeToString);
                                str = r11;
                            } else {
                                r11.OLrzqt(context, r12, strEncodeToString);
                                str = r11;
                            }
                        } else {
                            r11.KWHzl(context, r12);
                            str = r11;
                        }
                    } else {
                        pUU.KWHzl("DexReferral", "bindReferralSubInviter other error");
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        ReferralManager$bindReferralSubInviter$2 referralManager$bindReferralSubInviter$2 = new ReferralManager$bindReferralSubInviter$2(context, r11, r12, null);
                        referralManager$bindReferralSubInviter$1.L$0 = r11;
                        referralManager$bindReferralSubInviter$1.L$1 = context;
                        referralManager$bindReferralSubInviter$1.L$2 = null;
                        referralManager$bindReferralSubInviter$1.label = 2;
                        str = r11;
                        if (BuildersKt.withContext(main, referralManager$bindReferralSubInviter$2, referralManager$bindReferralSubInviter$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    str.AEQbTJ(context);
                } catch (Exception e3) {
                    e = e3;
                    r2.AEQbTJ(context);
                    pUU.AEQbTJ("DexReferral", "bindReferralSubInviter failed", e);
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) referralManager$bindReferralSubInviter$1.L$1;
                ReferralManager referralManager = (ReferralManager) referralManager$bindReferralSubInviter$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                str = referralManager;
                str.AEQbTJ(context);
            }
        } catch (Exception e4) {
            r2 = str;
            e = e4;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [383=5] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0092 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f3 A[Catch: Exception -> 0x0278, TryCatch #1 {Exception -> 0x0278, blocks: (B:45:0x0101, B:57:0x0122, B:61:0x0145, B:65:0x0177, B:67:0x017b, B:77:0x01cb, B:78:0x01ed, B:79:0x01f3, B:81:0x01fe, B:83:0x0208, B:85:0x021e), top: B:120:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0245 A[Catch: Exception -> 0x0092, TryCatch #5 {Exception -> 0x0092, blocks: (B:27:0x008d, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:94:0x025d, B:95:0x0263, B:97:0x0267, B:101:0x0272, B:102:0x0277), top: B:126:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0263 A[Catch: Exception -> 0x0092, TryCatch #5 {Exception -> 0x0092, blocks: (B:27:0x008d, B:89:0x023f, B:91:0x0245, B:93:0x0253, B:94:0x025d, B:95:0x0263, B:97:0x0267, B:101:0x0272, B:102:0x0277), top: B:126:0x008d }] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.okinc.business.defi.common.utils.ReferralManager] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Context context, String str, boolean z, @NotNull final WalletReferralSource walletReferralSource, boolean z2, @NotNull Map<String, String> map, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$bindReferralCode$1 referralManager$bindReferralCode$1;
        ?? r5;
        Context context2;
        final String upperCase;
        ReferralManager referralManager;
        boolean z3;
        Map<String, String> map2;
        Context context3;
        boolean z4;
        WalletReferralSource walletReferralSource2;
        ReferralManager referralManager2;
        Pair pair;
        int iIntValue;
        ?? r52;
        WalletReferralSource walletReferralSource3;
        boolean z5;
        Pair pair2;
        Context context4;
        AbstractC43419rot abstractC43419rot;
        ?? r3;
        ReferralManager referralManager3;
        MainCoroutineDispatcher main;
        ReferralManager$bindReferralCode$3 referralManager$bindReferralCode$3;
        MainCoroutineDispatcher main2;
        ReferralManager$bindReferralCode$6 referralManager$bindReferralCode$6;
        Context context5 = context;
        if (continuation instanceof ReferralManager$bindReferralCode$1) {
            referralManager$bindReferralCode$1 = (ReferralManager$bindReferralCode$1) continuation;
            int i = referralManager$bindReferralCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$bindReferralCode$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$bindReferralCode$1 = new ReferralManager$bindReferralCode$1(this, continuation);
            }
        }
        Object objWithContext = referralManager$bindReferralCode$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Exception e) {
            e = e;
            r5 = walletReferralSource;
        }
        switch (referralManager$bindReferralCode$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objWithContext);
                EZpvd(context);
                if (str != null) {
                    upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                } else {
                    upperCase = null;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    r5 = this;
                    context2 = context5;
                    r5.AEQbTJ(context2);
                    pUU.AEQbTJ("DexReferral", "bindReferralCode failed", e);
                    return Unit.INSTANCE;
                }
                if (upperCase == null) {
                    AEQbTJ(context);
                    pUU.KWHzl("DexReferral", "bindReferralCode empty code, jump to bind page directly");
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ReferralManager$bindReferralCode$wallet$2 referralManager$bindReferralCode$wallet$2 = new ReferralManager$bindReferralCode$wallet$2(null);
                    referralManager$bindReferralCode$1.L$0 = this;
                    referralManager$bindReferralCode$1.L$1 = context5;
                    referralManager$bindReferralCode$1.label = 7;
                    objWithContext = BuildersKt.withContext(io2, referralManager$bindReferralCode$wallet$2, referralManager$bindReferralCode$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager = this;
                    main2 = Dispatchers.getMain();
                    referralManager$bindReferralCode$6 = new ReferralManager$bindReferralCode$6(referralManager, context5, (InterfaceC9738bbJ) objWithContext, null);
                    referralManager$bindReferralCode$1.L$0 = referralManager;
                    referralManager$bindReferralCode$1.L$1 = context5;
                    referralManager$bindReferralCode$1.label = 8;
                    if (BuildersKt.withContext(main2, referralManager$bindReferralCode$6, referralManager$bindReferralCode$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C32866mlf.KWHzl("DexReferral_InviteeAction_ShareLink_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dqe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ReferralManager.KWHzl(upperCase, walletReferralSource, (EventParamsList) obj);
                    }
                });
                referralManager$bindReferralCode$1.L$0 = this;
                referralManager$bindReferralCode$1.L$1 = context5;
                referralManager$bindReferralCode$1.L$2 = walletReferralSource;
                referralManager$bindReferralCode$1.L$3 = map;
                referralManager$bindReferralCode$1.L$4 = upperCase;
                referralManager$bindReferralCode$1.Z$0 = z;
                z3 = z2;
                referralManager$bindReferralCode$1.Z$1 = z3;
                referralManager$bindReferralCode$1.label = 1;
                Object objOLrzqt = OLrzqt(upperCase, referralManager$bindReferralCode$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                map2 = map;
                objWithContext = objOLrzqt;
                context3 = context5;
                z4 = z;
                walletReferralSource2 = walletReferralSource;
                referralManager2 = this;
                try {
                    pair = (Pair) objWithContext;
                    iIntValue = ((Number) pair.getFirst()).intValue();
                } catch (Exception e3) {
                    e = e3;
                    r5 = referralManager2;
                    context2 = context3;
                    r5.AEQbTJ(context2);
                    pUU.AEQbTJ("DexReferral", "bindReferralCode failed", e);
                    return Unit.INSTANCE;
                }
                if (iIntValue != -1000) {
                    pUU.KWHzl("DexReferral", "bindReferralCode empty wallet");
                    DeviceRefCodeCacheBean deviceRefCodeCacheBeanValues = referralManager2.values();
                    if (deviceRefCodeCacheBeanValues == null || !referralManager2.KWHzl(deviceRefCodeCacheBeanValues.getBean())) {
                        C13934dbu c13934dbu = referralManager2.isConnected;
                        referralManager$bindReferralCode$1.L$0 = referralManager2;
                        referralManager$bindReferralCode$1.L$1 = context3;
                        referralManager$bindReferralCode$1.L$2 = walletReferralSource2;
                        referralManager$bindReferralCode$1.L$3 = pair;
                        referralManager$bindReferralCode$1.L$4 = null;
                        referralManager$bindReferralCode$1.Z$0 = z4;
                        referralManager$bindReferralCode$1.label = 2;
                        Object objEZpvd = c13934dbu.EZpvd(referralManager$bindReferralCode$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        r52 = referralManager2;
                        walletReferralSource3 = walletReferralSource2;
                        context2 = context3;
                        objWithContext = objEZpvd;
                        z5 = z4;
                        pair2 = pair;
                        abstractC43419rot = (AbstractC43419rot) objWithContext;
                        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pUU.copydefault("DexReferral", "bindReferralCode Error");
                        } else if (((RefIpCheckResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getAllowed()) {
                            r52.AEQbTJ(context2, (RefInfoResponse) pair2.getSecond(), z5, walletReferralSource3);
                        } else {
                            pUU.KWHzl("DexReferral", "bindReferralCode ip limited");
                        }
                        r3 = r52;
                        context4 = context2;
                        r3.AEQbTJ(context4);
                        return Unit.INSTANCE;
                    }
                    pUU.KWHzl("DexReferral", "bindReferralCode has device code, deviceInfo=" + deviceRefCodeCacheBeanValues);
                } else if (iIntValue != 0) {
                    if (iIntValue != 1) {
                        if (iIntValue == 3 || iIntValue == 4 || iIntValue == 5 || iIntValue == 6) {
                            if (!z4) {
                                pUU.KWHzl("DexReferral", "bindReferralCode code not exist");
                                MainCoroutineDispatcher main3 = Dispatchers.getMain();
                                ReferralManager$bindReferralCode$4 referralManager$bindReferralCode$4 = new ReferralManager$bindReferralCode$4(context3, referralManager2, upperCase, walletReferralSource2, map2, null);
                                referralManager$bindReferralCode$1.L$0 = referralManager2;
                                referralManager$bindReferralCode$1.L$1 = context3;
                                referralManager$bindReferralCode$1.L$2 = null;
                                referralManager$bindReferralCode$1.L$3 = null;
                                referralManager$bindReferralCode$1.L$4 = null;
                                referralManager$bindReferralCode$1.label = 5;
                                if (BuildersKt.withContext(main3, referralManager$bindReferralCode$4, referralManager$bindReferralCode$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else if (!z4) {
                            pUU.KWHzl("DexReferral", "bindReferralCode other error");
                            MainCoroutineDispatcher main4 = Dispatchers.getMain();
                            ReferralManager$bindReferralCode$5 referralManager$bindReferralCode$5 = new ReferralManager$bindReferralCode$5(context3, referralManager2, upperCase, null);
                            referralManager$bindReferralCode$1.L$0 = referralManager2;
                            referralManager$bindReferralCode$1.L$1 = context3;
                            referralManager$bindReferralCode$1.L$2 = null;
                            referralManager$bindReferralCode$1.L$3 = null;
                            referralManager$bindReferralCode$1.L$4 = null;
                            referralManager$bindReferralCode$1.label = 6;
                            if (BuildersKt.withContext(main4, referralManager$bindReferralCode$5, referralManager$bindReferralCode$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else if (!z4 && (context3 instanceof FragmentActivity)) {
                        pUU.KWHzl("DexReferral", "bindReferralCode self bind");
                        CoroutineDispatcher io3 = Dispatchers.getIO();
                        ReferralManager$bindReferralCode$wallet$1 referralManager$bindReferralCode$wallet$1 = new ReferralManager$bindReferralCode$wallet$1(null);
                        referralManager$bindReferralCode$1.L$0 = referralManager2;
                        referralManager$bindReferralCode$1.L$1 = context3;
                        referralManager$bindReferralCode$1.L$2 = upperCase;
                        referralManager$bindReferralCode$1.L$3 = null;
                        referralManager$bindReferralCode$1.L$4 = null;
                        referralManager$bindReferralCode$1.label = 3;
                        objWithContext = BuildersKt.withContext(io3, referralManager$bindReferralCode$wallet$1, referralManager$bindReferralCode$1);
                        if (objWithContext == objCopydefault) {
                            return objCopydefault;
                        }
                        context4 = context3;
                        referralManager3 = referralManager2;
                        try {
                            main = Dispatchers.getMain();
                            referralManager$bindReferralCode$3 = new ReferralManager$bindReferralCode$3(referralManager3, context4, upperCase, (InterfaceC9738bbJ) objWithContext, null);
                            referralManager$bindReferralCode$1.L$0 = referralManager3;
                            referralManager$bindReferralCode$1.L$1 = context4;
                            referralManager$bindReferralCode$1.L$2 = null;
                            referralManager$bindReferralCode$1.label = 4;
                            r3 = referralManager3;
                            if (BuildersKt.withContext(main, referralManager$bindReferralCode$3, referralManager$bindReferralCode$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            r3.AEQbTJ(context4);
                        } catch (Exception e4) {
                            e = e4;
                            context2 = context4;
                            r5 = referralManager3;
                            r5.AEQbTJ(context2);
                            pUU.AEQbTJ("DexReferral", "bindReferralCode failed", e);
                        }
                        return Unit.INSTANCE;
                    }
                } else if (z3) {
                    pUU.KWHzl("DexReferral", "bindReferralCode fullScreeGuide");
                    Object second = pair.getSecond();
                    Intrinsics.copydefault(second);
                    showReferralInviteeEntry$default(referralManager2, context3, upperCase, ((RefInfoResponse) second).getDiscountRate(), walletReferralSource2, map2, false, 32, null);
                } else {
                    pUU.KWHzl("DexReferral", "bindReferralCode not fullScreeGuide");
                }
                context4 = context3;
                r3 = referralManager2;
                r3.AEQbTJ(context4);
                return Unit.INSTANCE;
            case 1:
                boolean z6 = referralManager$bindReferralCode$1.Z$1;
                z4 = referralManager$bindReferralCode$1.Z$0;
                String str2 = (String) referralManager$bindReferralCode$1.L$4;
                Map<String, String> map3 = (Map) referralManager$bindReferralCode$1.L$3;
                WalletReferralSource walletReferralSource4 = (WalletReferralSource) referralManager$bindReferralCode$1.L$2;
                context3 = (Context) referralManager$bindReferralCode$1.L$1;
                ReferralManager referralManager4 = (ReferralManager) referralManager$bindReferralCode$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    map2 = map3;
                    walletReferralSource2 = walletReferralSource4;
                    z3 = z6;
                    upperCase = str2;
                    referralManager2 = referralManager4;
                    pair = (Pair) objWithContext;
                    iIntValue = ((Number) pair.getFirst()).intValue();
                    if (iIntValue != -1000) {
                    }
                    context4 = context3;
                    r3 = referralManager2;
                    r3.AEQbTJ(context4);
                } catch (Exception e5) {
                    e = e5;
                    context2 = context3;
                    r5 = referralManager4;
                    r5.AEQbTJ(context2);
                    pUU.AEQbTJ("DexReferral", "bindReferralCode failed", e);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 2:
                z5 = referralManager$bindReferralCode$1.Z$0;
                pair2 = (Pair) referralManager$bindReferralCode$1.L$3;
                walletReferralSource3 = (WalletReferralSource) referralManager$bindReferralCode$1.L$2;
                context2 = (Context) referralManager$bindReferralCode$1.L$1;
                r5 = (ReferralManager) referralManager$bindReferralCode$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    r52 = r5;
                    abstractC43419rot = (AbstractC43419rot) objWithContext;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    }
                    r3 = r52;
                    context4 = context2;
                    r3.AEQbTJ(context4);
                } catch (Exception e6) {
                    e = e6;
                    r5.AEQbTJ(context2);
                    pUU.AEQbTJ("DexReferral", "bindReferralCode failed", e);
                }
                return Unit.INSTANCE;
            case 3:
                upperCase = (String) referralManager$bindReferralCode$1.L$2;
                context4 = (Context) referralManager$bindReferralCode$1.L$1;
                ReferralManager referralManager5 = (ReferralManager) referralManager$bindReferralCode$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                referralManager3 = referralManager5;
                main = Dispatchers.getMain();
                referralManager$bindReferralCode$3 = new ReferralManager$bindReferralCode$3(referralManager3, context4, upperCase, (InterfaceC9738bbJ) objWithContext, null);
                referralManager$bindReferralCode$1.L$0 = referralManager3;
                referralManager$bindReferralCode$1.L$1 = context4;
                referralManager$bindReferralCode$1.L$2 = null;
                referralManager$bindReferralCode$1.label = 4;
                r3 = referralManager3;
                if (BuildersKt.withContext(main, referralManager$bindReferralCode$3, referralManager$bindReferralCode$1) == objCopydefault) {
                }
                r3.AEQbTJ(context4);
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
                Context context6 = (Context) referralManager$bindReferralCode$1.L$1;
                r3 = (ReferralManager) referralManager$bindReferralCode$1.L$0;
                context4 = context6;
                C56391yDq.AEQbTJ(objWithContext);
                r3.AEQbTJ(context4);
                return Unit.INSTANCE;
            case 7:
                context5 = (Context) referralManager$bindReferralCode$1.L$1;
                referralManager = (ReferralManager) referralManager$bindReferralCode$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                main2 = Dispatchers.getMain();
                referralManager$bindReferralCode$6 = new ReferralManager$bindReferralCode$6(referralManager, context5, (InterfaceC9738bbJ) objWithContext, null);
                referralManager$bindReferralCode$1.L$0 = referralManager;
                referralManager$bindReferralCode$1.L$1 = context5;
                referralManager$bindReferralCode$1.label = 8;
                if (BuildersKt.withContext(main2, referralManager$bindReferralCode$6, referralManager$bindReferralCode$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(objWithContext);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Unit KWHzl(String str, WalletReferralSource walletReferralSource, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("referral_code", str, false);
        eventParamsList.put("share_from", walletReferralSource.getEvent(), true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$checkAndSavePreferReferralCodeForAppLink$1 referralManager$checkAndSavePreferReferralCodeForAppLink$1;
        String str2;
        PreferRefCodeCacheBean preferRefCodeCacheBean;
        ReferralManager referralManager;
        if (continuation instanceof ReferralManager$checkAndSavePreferReferralCodeForAppLink$1) {
            referralManager$checkAndSavePreferReferralCodeForAppLink$1 = (ReferralManager$checkAndSavePreferReferralCodeForAppLink$1) continuation;
            int i = referralManager$checkAndSavePreferReferralCodeForAppLink$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkAndSavePreferReferralCodeForAppLink$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkAndSavePreferReferralCodeForAppLink$1 = new ReferralManager$checkAndSavePreferReferralCodeForAppLink$1(this, continuation);
            }
        }
        Object obj = referralManager$checkAndSavePreferReferralCodeForAppLink$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkAndSavePreferReferralCodeForAppLink$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            PreferRefCodeCacheBean preferRefCodeCacheBeanIsConnected = isConnected();
            referralManager$checkAndSavePreferReferralCodeForAppLink$1.L$0 = this;
            referralManager$checkAndSavePreferReferralCodeForAppLink$1.L$1 = upperCase;
            referralManager$checkAndSavePreferReferralCodeForAppLink$1.L$2 = preferRefCodeCacheBeanIsConnected;
            referralManager$checkAndSavePreferReferralCodeForAppLink$1.label = 1;
            Object objAhwBna = AhwBna(upperCase, referralManager$checkAndSavePreferReferralCodeForAppLink$1);
            if (objAhwBna == objCopydefault) {
                return objCopydefault;
            }
            str2 = upperCase;
            preferRefCodeCacheBean = preferRefCodeCacheBeanIsConnected;
            obj = objAhwBna;
            referralManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            preferRefCodeCacheBean = (PreferRefCodeCacheBean) referralManager$checkAndSavePreferReferralCodeForAppLink$1.L$2;
            str2 = (String) referralManager$checkAndSavePreferReferralCodeForAppLink$1.L$1;
            referralManager = (ReferralManager) referralManager$checkAndSavePreferReferralCodeForAppLink$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Pair pair = (Pair) obj;
        if (((Number) pair.getFirst()).intValue() == 0) {
            pUU.KWHzl("DexReferral", "checkAndSavePreferReferralCodeForAppLink: upperCaseReferralCode=" + str2 + ", lastPreferCode=" + preferRefCodeCacheBean);
            PreferRefCodeInfoResponse preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) pair.getSecond();
            if (preferRefCodeInfoResponse != null) {
                referralManager.OLrzqt(str2, preferRefCodeInfoResponse, preferRefCodeCacheBean);
            }
        } else {
            pUU.KWHzl("DexReferral", "checkAndSavePreferReferralCodeForAppLink: invalid=" + pair.getFirst() + ", result.second=" + pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    public final Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$checkAttributionCodeAndSaveDeviceCode$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ Object tryUpdateDeviceCodeWhenExist$default(ReferralManager referralManager, String str, DeviceRefCodeCacheBean deviceRefCodeCacheBean, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return referralManager.OLrzqt(str, deviceRefCodeCacheBean, z, (Continuation<? super Unit>) continuation);
    }

    public final Object OLrzqt(@NotNull String str, @NotNull DeviceRefCodeCacheBean deviceRefCodeCacheBean, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$tryUpdateDeviceCodeWhenExist$2(str, deviceRefCodeCacheBean, z, this, null), continuation);
    }

    public static /* synthetic */ Object saveDeviceCodeWhenEmpty$default(ReferralManager referralManager, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return referralManager.EZpvd(str, z, (Continuation<? super Unit>) continuation);
    }

    public final Object EZpvd(@NotNull String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$saveDeviceCodeWhenEmpty$2(str, z, this, null), continuation);
    }

    public final DeviceRefCodeCacheBean values() {
        try {
            pUU.KWHzl("DexReferral", "getReferralDeviceCodeInfo, start");
            return this.AYXKKw.OLrzqt();
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralDeviceCodeInfo failed", e);
            return null;
        }
    }

    public final void OLrzqt(@NotNull DeviceRefCodeCacheBean deviceRefCodeCacheBean) {
        Intrinsics.checkNotNullParameter(deviceRefCodeCacheBean, "");
        try {
            pUU.KWHzl("DexReferral", "updateReferralDeviceCodeInfo, start, codeInfo=" + deviceRefCodeCacheBean);
            this.AYXKKw.EZpvd(deviceRefCodeCacheBean);
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "updateReferralDeviceCodeInfo failed", e);
        }
    }

    public final Object AYXKKw(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$removeDeviceCodeInfo$2(str, this, null), continuation);
    }

    public final void fJNWhG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ReferralManager$updateReferralDeviceCodeInfoWithString$1(this, str, null), 3, null);
    }

    public final DeviceRefCodeCacheBean copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        try {
            pUU.KWHzl("DexReferral", "getReferralDeviceCodeInfoWithoutSelfBind: start, wallet=" + abstractC12782ctV.DbNXlk());
            DeviceRefCodeCacheBean deviceRefCodeCacheBeanValues = values();
            if (deviceRefCodeCacheBeanValues != null && valueOf(abstractC12782ctV)) {
                if (!AEQbTJ(abstractC12782ctV, deviceRefCodeCacheBeanValues.getBean().getInviterAddresses())) {
                    pUU.KWHzl("DexReferral", "getReferralDeviceCodeInfoWithoutSelfBind: not selfbind:" + deviceRefCodeCacheBeanValues);
                    return deviceRefCodeCacheBeanValues;
                }
                pUU.KWHzl("DexReferral", "getReferralDeviceCodeInfoWithoutSelfBind: selfbind:" + deviceRefCodeCacheBeanValues);
            } else {
                pUU.KWHzl("DexReferral", "getReferralDeviceCodeInfoWithoutSelfBind: null");
            }
            return null;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkReferralCodeState failed", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0121 A[Catch: Exception -> 0x014d, TryCatch #0 {Exception -> 0x014d, blocks: (B:14:0x0037, B:19:0x0056, B:39:0x00f8, B:41:0x0121, B:43:0x012e, B:22:0x0065, B:31:0x00af, B:33:0x00ba, B:25:0x006d, B:27:0x0097, B:49:0x0147), top: B:55:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull ReferralInfo referralInfo, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$checkReferralCodeState$1 referralManager$checkReferralCodeState$1;
        ReferralManager referralManager;
        AbstractC12782ctV abstractC12782ctV;
        DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault;
        boolean z;
        String str2;
        AbstractC12782ctV abstractC12782ctV2;
        DeviceRefCodeCacheBean deviceRefCodeCacheBean;
        ReferralManager referralManager2;
        int i;
        int i2;
        String str3 = str;
        if (continuation instanceof ReferralManager$checkReferralCodeState$1) {
            referralManager$checkReferralCodeState$1 = (ReferralManager$checkReferralCodeState$1) continuation;
            int i3 = referralManager$checkReferralCodeState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                referralManager$checkReferralCodeState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                referralManager$checkReferralCodeState$1 = new ReferralManager$checkReferralCodeState$1(this, continuation);
            }
        }
        Object objAwait = referralManager$checkReferralCodeState$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = referralManager$checkReferralCodeState$1.label;
        boolean z2 = false;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkReferralCodeState failed", e);
        }
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            pUU.KWHzl("DexReferral", "checkReferralCodeState: start, codeInfo=" + referralInfo + " accountId=" + str3);
            if (referralInfo.getCodeType() == ReferralCodeType.CODE_TYPE_BIND_DEVICE.getType()) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str3, false);
                referralManager$checkReferralCodeState$1.L$0 = this;
                referralManager$checkReferralCodeState$1.L$1 = str3;
                referralManager$checkReferralCodeState$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, referralManager$checkReferralCodeState$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                referralManager = this;
            } else {
                pUU.KWHzl("DexReferral", "checkReferralCodeState: bound, no need check");
                return C56443yFo.KWHzl(z2);
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = referralManager$checkReferralCodeState$1.I$0;
                    C56391yDq.AEQbTJ(objAwait);
                    z = true;
                    if (i2 != 0) {
                        z2 = z;
                    }
                    return C56443yFo.KWHzl(z2);
                }
                deviceRefCodeCacheBean = (DeviceRefCodeCacheBean) referralManager$checkReferralCodeState$1.L$3;
                abstractC12782ctV2 = (AbstractC12782ctV) referralManager$checkReferralCodeState$1.L$2;
                str2 = (String) referralManager$checkReferralCodeState$1.L$1;
                referralManager2 = (ReferralManager) referralManager$checkReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                z = true;
                deviceRefCodeCacheBeanCopydefault = deviceRefCodeCacheBean;
                abstractC12782ctV = abstractC12782ctV2;
                str3 = str2;
                referralManager = referralManager2;
                Intrinsics.copydefault(abstractC12782ctV);
                DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault2 = referralManager.copydefault(abstractC12782ctV);
                boolean zEZpvd = Intrinsics.EZpvd(deviceRefCodeCacheBeanCopydefault2, deviceRefCodeCacheBeanCopydefault);
                StringBuilder sb = new StringBuilder();
                sb.append("checkReferralCodeState: if is the same=");
                sb.append(!zEZpvd);
                pUU.KWHzl("DexReferral", sb.toString());
                i = !Intrinsics.EZpvd(deviceRefCodeCacheBeanCopydefault, deviceRefCodeCacheBeanCopydefault2) ? 1 : 0;
                if (i != 0) {
                    pUU.KWHzl("DexReferral", "checkReferralCodeState: referral codein for changed, need check prefer referral info status");
                    ReferralInfo referralInfoKWHzl = referralManager.KWHzl(str3, "1");
                    if (referralInfoKWHzl != null) {
                        referralManager$checkReferralCodeState$1.L$0 = null;
                        referralManager$checkReferralCodeState$1.L$1 = null;
                        referralManager$checkReferralCodeState$1.L$2 = null;
                        referralManager$checkReferralCodeState$1.L$3 = null;
                        referralManager$checkReferralCodeState$1.I$0 = i;
                        referralManager$checkReferralCodeState$1.label = 3;
                        if (referralManager.EZpvd(referralInfoKWHzl, str3, false, (Continuation<? super Boolean>) referralManager$checkReferralCodeState$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                i2 = i;
                if (i2 != 0) {
                }
                return C56443yFo.KWHzl(z2);
            }
            str3 = (String) referralManager$checkReferralCodeState$1.L$1;
            ReferralManager referralManager3 = (ReferralManager) referralManager$checkReferralCodeState$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
            referralManager = referralManager3;
        }
        abstractC12782ctV = (AbstractC12782ctV) objAwait;
        Intrinsics.copydefault(abstractC12782ctV);
        deviceRefCodeCacheBeanCopydefault = referralManager.copydefault(abstractC12782ctV);
        if (deviceRefCodeCacheBeanCopydefault != null) {
            pUU.KWHzl("DexReferral", "checkReferralCodeState: checkAndSaveUnbindBackendReferralCode");
            String code = deviceRefCodeCacheBeanCopydefault.getCode();
            referralManager$checkReferralCodeState$1.L$0 = referralManager;
            referralManager$checkReferralCodeState$1.L$1 = str3;
            referralManager$checkReferralCodeState$1.L$2 = abstractC12782ctV;
            referralManager$checkReferralCodeState$1.L$3 = deviceRefCodeCacheBeanCopydefault;
            referralManager$checkReferralCodeState$1.label = 2;
            ReferralManager referralManager4 = referralManager;
            z = true;
            if (tryUpdateDeviceCodeWhenExist$default(referralManager, code, deviceRefCodeCacheBeanCopydefault, false, referralManager$checkReferralCodeState$1, 4, null) == objCopydefault) {
                return objCopydefault;
            }
            str2 = str3;
            abstractC12782ctV2 = abstractC12782ctV;
            deviceRefCodeCacheBean = deviceRefCodeCacheBeanCopydefault;
            referralManager2 = referralManager4;
            deviceRefCodeCacheBeanCopydefault = deviceRefCodeCacheBean;
            abstractC12782ctV = abstractC12782ctV2;
            str3 = str2;
            referralManager = referralManager2;
            Intrinsics.copydefault(abstractC12782ctV);
            DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault22 = referralManager.copydefault(abstractC12782ctV);
            boolean zEZpvd2 = Intrinsics.EZpvd(deviceRefCodeCacheBeanCopydefault22, deviceRefCodeCacheBeanCopydefault);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkReferralCodeState: if is the same=");
            sb2.append(!zEZpvd2);
            pUU.KWHzl("DexReferral", sb2.toString());
            i = !Intrinsics.EZpvd(deviceRefCodeCacheBeanCopydefault, deviceRefCodeCacheBeanCopydefault22) ? 1 : 0;
            if (i != 0) {
            }
            i2 = i;
            if (i2 != 0) {
            }
            return C56443yFo.KWHzl(z2);
        }
        z = true;
        Intrinsics.copydefault(abstractC12782ctV);
        DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault222 = referralManager.copydefault(abstractC12782ctV);
        boolean zEZpvd22 = Intrinsics.EZpvd(deviceRefCodeCacheBeanCopydefault222, deviceRefCodeCacheBeanCopydefault);
        StringBuilder sb22 = new StringBuilder();
        sb22.append("checkReferralCodeState: if is the same=");
        sb22.append(!zEZpvd22);
        pUU.KWHzl("DexReferral", sb22.toString());
        i = !Intrinsics.EZpvd(deviceRefCodeCacheBeanCopydefault, deviceRefCodeCacheBeanCopydefault222) ? 1 : 0;
        if (i != 0) {
        }
        i2 = i;
        if (i2 != 0) {
        }
        return C56443yFo.KWHzl(z2);
    }

    public static /* synthetic */ Object checkPreferReferralCodeState$default(ReferralManager referralManager, ReferralInfo referralInfo, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return referralManager.EZpvd(referralInfo, str, z, (Continuation<? super Boolean>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [866=4] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cf A[Catch: Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:13:0x004a, B:105:0x02c5, B:107:0x02cf, B:108:0x02ee, B:16:0x0065, B:101:0x029b, B:19:0x0078, B:86:0x0218, B:22:0x008d, B:80:0x01eb, B:25:0x00a0, B:66:0x01b6, B:68:0x01bd, B:71:0x01c5, B:73:0x01cb, B:28:0x00b5, B:48:0x0147, B:50:0x0150, B:52:0x015a, B:58:0x0179, B:60:0x0185, B:62:0x018d, B:89:0x023e, B:91:0x024c, B:93:0x0256, B:95:0x0260, B:31:0x00c6, B:40:0x0113, B:42:0x011f, B:44:0x012c, B:55:0x0171, B:34:0x00d3, B:36:0x00f9), top: B:117:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fc A[PHI: r16
  0x02fc: PHI (r16v9 boolean) = (r16v3 boolean), (r16v10 boolean), (r16v10 boolean) binds: [B:88:0x023c, B:109:0x02f6, B:111:0x02fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:13:0x004a, B:105:0x02c5, B:107:0x02cf, B:108:0x02ee, B:16:0x0065, B:101:0x029b, B:19:0x0078, B:86:0x0218, B:22:0x008d, B:80:0x01eb, B:25:0x00a0, B:66:0x01b6, B:68:0x01bd, B:71:0x01c5, B:73:0x01cb, B:28:0x00b5, B:48:0x0147, B:50:0x0150, B:52:0x015a, B:58:0x0179, B:60:0x0185, B:62:0x018d, B:89:0x023e, B:91:0x024c, B:93:0x0256, B:95:0x0260, B:31:0x00c6, B:40:0x0113, B:42:0x011f, B:44:0x012c, B:55:0x0171, B:34:0x00d3, B:36:0x00f9), top: B:117:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171 A[Catch: Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:13:0x004a, B:105:0x02c5, B:107:0x02cf, B:108:0x02ee, B:16:0x0065, B:101:0x029b, B:19:0x0078, B:86:0x0218, B:22:0x008d, B:80:0x01eb, B:25:0x00a0, B:66:0x01b6, B:68:0x01bd, B:71:0x01c5, B:73:0x01cb, B:28:0x00b5, B:48:0x0147, B:50:0x0150, B:52:0x015a, B:58:0x0179, B:60:0x0185, B:62:0x018d, B:89:0x023e, B:91:0x024c, B:93:0x0256, B:95:0x0260, B:31:0x00c6, B:40:0x0113, B:42:0x011f, B:44:0x012c, B:55:0x0171, B:34:0x00d3, B:36:0x00f9), top: B:117:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185 A[Catch: Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:13:0x004a, B:105:0x02c5, B:107:0x02cf, B:108:0x02ee, B:16:0x0065, B:101:0x029b, B:19:0x0078, B:86:0x0218, B:22:0x008d, B:80:0x01eb, B:25:0x00a0, B:66:0x01b6, B:68:0x01bd, B:71:0x01c5, B:73:0x01cb, B:28:0x00b5, B:48:0x0147, B:50:0x0150, B:52:0x015a, B:58:0x0179, B:60:0x0185, B:62:0x018d, B:89:0x023e, B:91:0x024c, B:93:0x0256, B:95:0x0260, B:31:0x00c6, B:40:0x0113, B:42:0x011f, B:44:0x012c, B:55:0x0171, B:34:0x00d3, B:36:0x00f9), top: B:117:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd A[Catch: Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:13:0x004a, B:105:0x02c5, B:107:0x02cf, B:108:0x02ee, B:16:0x0065, B:101:0x029b, B:19:0x0078, B:86:0x0218, B:22:0x008d, B:80:0x01eb, B:25:0x00a0, B:66:0x01b6, B:68:0x01bd, B:71:0x01c5, B:73:0x01cb, B:28:0x00b5, B:48:0x0147, B:50:0x0150, B:52:0x015a, B:58:0x0179, B:60:0x0185, B:62:0x018d, B:89:0x023e, B:91:0x024c, B:93:0x0256, B:95:0x0260, B:31:0x00c6, B:40:0x0113, B:42:0x011f, B:44:0x012c, B:55:0x0171, B:34:0x00d3, B:36:0x00f9), top: B:117:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5 A[Catch: Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:13:0x004a, B:105:0x02c5, B:107:0x02cf, B:108:0x02ee, B:16:0x0065, B:101:0x029b, B:19:0x0078, B:86:0x0218, B:22:0x008d, B:80:0x01eb, B:25:0x00a0, B:66:0x01b6, B:68:0x01bd, B:71:0x01c5, B:73:0x01cb, B:28:0x00b5, B:48:0x0147, B:50:0x0150, B:52:0x015a, B:58:0x0179, B:60:0x0185, B:62:0x018d, B:89:0x023e, B:91:0x024c, B:93:0x0256, B:95:0x0260, B:31:0x00c6, B:40:0x0113, B:42:0x011f, B:44:0x012c, B:55:0x0171, B:34:0x00d3, B:36:0x00f9), top: B:117:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023e A[Catch: Exception -> 0x02ff, TryCatch #0 {Exception -> 0x02ff, blocks: (B:13:0x004a, B:105:0x02c5, B:107:0x02cf, B:108:0x02ee, B:16:0x0065, B:101:0x029b, B:19:0x0078, B:86:0x0218, B:22:0x008d, B:80:0x01eb, B:25:0x00a0, B:66:0x01b6, B:68:0x01bd, B:71:0x01c5, B:73:0x01cb, B:28:0x00b5, B:48:0x0147, B:50:0x0150, B:52:0x015a, B:58:0x0179, B:60:0x0185, B:62:0x018d, B:89:0x023e, B:91:0x024c, B:93:0x0256, B:95:0x0260, B:31:0x00c6, B:40:0x0113, B:42:0x011f, B:44:0x012c, B:55:0x0171, B:34:0x00d3, B:36:0x00f9), top: B:117:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull ReferralInfo referralInfo, @NotNull String str, boolean z, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$checkPreferReferralCodeState$1 referralManager$checkPreferReferralCodeState$1;
        ReferralManager referralManager;
        ReferralManager referralManager2;
        DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault;
        ReferralInfo referralInfo2;
        AbstractC12782ctV abstractC12782ctV;
        boolean z2;
        PreferRefCodeCacheBean preferRefCodeCacheBeanIsConnected;
        ReferralManager referralManager3;
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean;
        ReferralInfo referralInfo3;
        ReferralInfo referralInfo4;
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean2;
        String str2;
        PreferRefCodeCacheBean preferRefCodeCacheBean;
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanValueOf;
        ReferralManager referralManager4;
        String str3;
        int i;
        ReferralManager referralManager5;
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean3;
        int i2;
        DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault2;
        AbstractC12782ctV abstractC12782ctV2;
        PreferRefCodeInfoResponse bean;
        String code;
        String str4;
        ReferralManager referralManager6;
        UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanValueOf2;
        int i3;
        Object objAhwBna;
        ReferralManager referralManager7;
        PreferRefCodeCacheBean preferRefCodeCacheBean2;
        PreferRefCodeInfoResponse preferRefCodeInfoResponse;
        ReferralInfo referralInfo5 = referralInfo;
        String str5 = str;
        if (continuation instanceof ReferralManager$checkPreferReferralCodeState$1) {
            referralManager$checkPreferReferralCodeState$1 = (ReferralManager$checkPreferReferralCodeState$1) continuation;
            int i4 = referralManager$checkPreferReferralCodeState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                referralManager$checkPreferReferralCodeState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                referralManager$checkPreferReferralCodeState$1 = new ReferralManager$checkPreferReferralCodeState$1(this, continuation);
            }
        }
        Object objAwait = referralManager$checkPreferReferralCodeState$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        boolean z3 = false;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkPreferReferralCodeState failed", e);
        }
        switch (referralManager$checkPreferReferralCodeState$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objAwait);
                pUU.KWHzl("DexReferral", "checkPreferReferralCodeState: start, codeInfo=" + referralInfo5 + " accountId=" + str5 + ", checkReferralState=" + z);
                if (z) {
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str5, false);
                    referralManager$checkPreferReferralCodeState$1.L$0 = this;
                    referralManager$checkPreferReferralCodeState$1.L$1 = referralInfo5;
                    referralManager$checkPreferReferralCodeState$1.L$2 = str5;
                    referralManager$checkPreferReferralCodeState$1.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, referralManager$checkPreferReferralCodeState$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager2 = this;
                    AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) objAwait;
                    Intrinsics.copydefault(abstractC12782ctV3);
                    deviceRefCodeCacheBeanCopydefault = referralManager2.copydefault(abstractC12782ctV3);
                    if (deviceRefCodeCacheBeanCopydefault == null) {
                        pUU.KWHzl("DexReferral", "checkPreferReferralCodeState: checkAndSaveUnbindBackendReferralCode");
                        if (!referralManager2.AEQbTJ(deviceRefCodeCacheBeanCopydefault.getBean())) {
                            String code2 = deviceRefCodeCacheBeanCopydefault.getCode();
                            referralManager$checkPreferReferralCodeState$1.L$0 = referralManager2;
                            referralManager$checkPreferReferralCodeState$1.L$1 = referralInfo5;
                            referralManager$checkPreferReferralCodeState$1.L$2 = str5;
                            referralManager$checkPreferReferralCodeState$1.L$3 = abstractC12782ctV3;
                            referralManager$checkPreferReferralCodeState$1.label = 2;
                            if (referralManager2.OLrzqt(code2, deviceRefCodeCacheBeanCopydefault, false, (Continuation<? super Unit>) referralManager$checkPreferReferralCodeState$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            referralInfo2 = referralInfo5;
                            abstractC12782ctV = abstractC12782ctV3;
                            Intrinsics.copydefault(abstractC12782ctV);
                            deviceRefCodeCacheBeanCopydefault2 = referralManager2.copydefault(abstractC12782ctV);
                            if (deviceRefCodeCacheBeanCopydefault2 == null && referralManager2.AEQbTJ(deviceRefCodeCacheBeanCopydefault2.getBean())) {
                                RxBus.AEQbTJ(new xXL(C56402yEa.EZpvd(deviceRefCodeCacheBeanCopydefault2.getCode())));
                                return C56443yFo.KWHzl(true);
                            }
                            referralInfo5 = referralInfo2;
                        }
                    } else {
                        pUU.KWHzl("DexReferral", "checkPreferReferralCodeState: no device code");
                    }
                    referralManager = referralManager2;
                    if (referralInfo5.getCodeType() == ReferralCodeType.CODE_TYPE_BIND_BACKEND.getType()) {
                        z2 = true;
                        if (referralInfo5.getCodeType() == ReferralCodeType.CODE_TYPE_DEEPLINK.getType()) {
                            preferRefCodeCacheBeanIsConnected = referralManager.isConnected();
                            UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanValueOf3 = referralManager.valueOf(str5);
                            if (unBindBackendReferralCodeCacheBeanValueOf3 == null || referralManager.AEQbTJ(unBindBackendReferralCodeCacheBeanValueOf3.getBean())) {
                                referralManager3 = referralManager;
                                unBindBackendReferralCodeCacheBean = unBindBackendReferralCodeCacheBeanValueOf3;
                                referralInfo3 = referralInfo5;
                                i3 = !Intrinsics.EZpvd(referralManager3.valueOf(str5), unBindBackendReferralCodeCacheBean) ? 1 : 0;
                                String referralCode = referralInfo3.getReferralCode();
                                referralManager$checkPreferReferralCodeState$1.L$0 = referralManager3;
                                referralManager$checkPreferReferralCodeState$1.L$1 = referralInfo3;
                                referralManager$checkPreferReferralCodeState$1.L$2 = preferRefCodeCacheBeanIsConnected;
                                referralManager$checkPreferReferralCodeState$1.L$3 = null;
                                referralManager$checkPreferReferralCodeState$1.L$4 = null;
                                referralManager$checkPreferReferralCodeState$1.I$0 = i3;
                                referralManager$checkPreferReferralCodeState$1.label = 7;
                                objAhwBna = referralManager3.AhwBna(referralCode, referralManager$checkPreferReferralCodeState$1);
                                if (objAhwBna == objCopydefault) {
                                    return objCopydefault;
                                }
                                referralManager7 = referralManager3;
                                PreferRefCodeCacheBean preferRefCodeCacheBean3 = preferRefCodeCacheBeanIsConnected;
                                objAwait = objAhwBna;
                                preferRefCodeCacheBean2 = preferRefCodeCacheBean3;
                                preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) ((Pair) objAwait).getSecond();
                                if (preferRefCodeInfoResponse != null) {
                                    pUU.KWHzl("DexReferral", "checkPreferReferralCodeState: result.second=" + preferRefCodeInfoResponse);
                                    C56443yFo.KWHzl(referralManager7.EZpvd(referralInfo3.getReferralCode(), preferRefCodeInfoResponse, preferRefCodeCacheBean2));
                                }
                                boolean zEZpvd = Intrinsics.EZpvd(preferRefCodeCacheBean2, referralManager7.isConnected());
                                if (i3 == 0 || (!zEZpvd)) {
                                    z3 = z2;
                                }
                            } else {
                                pUU.KWHzl("DexReferral", "checkPreferReferralCodeState: need check checkAndSaveUnbindBackendReferralCode ");
                                InviteeInfoItemResponse inviteeInfo = unBindBackendReferralCodeCacheBeanValueOf3.getInviteeInfo();
                                PreferRefCodeInfoResponse bean2 = unBindBackendReferralCodeCacheBeanValueOf3.getBean();
                                String code3 = unBindBackendReferralCodeCacheBeanValueOf3.getCode();
                                referralManager$checkPreferReferralCodeState$1.L$0 = referralManager;
                                referralManager$checkPreferReferralCodeState$1.L$1 = referralInfo5;
                                referralManager$checkPreferReferralCodeState$1.L$2 = str5;
                                referralManager$checkPreferReferralCodeState$1.L$3 = preferRefCodeCacheBeanIsConnected;
                                referralManager$checkPreferReferralCodeState$1.L$4 = unBindBackendReferralCodeCacheBeanValueOf3;
                                referralManager$checkPreferReferralCodeState$1.label = 6;
                                if (referralManager.AEQbTJ(str5, inviteeInfo, bean2, code3, referralManager$checkPreferReferralCodeState$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                referralInfo4 = referralInfo5;
                                referralManager3 = referralManager;
                                unBindBackendReferralCodeCacheBean2 = unBindBackendReferralCodeCacheBeanValueOf3;
                                str2 = str5;
                                preferRefCodeCacheBean = preferRefCodeCacheBeanIsConnected;
                                unBindBackendReferralCodeCacheBean = unBindBackendReferralCodeCacheBean2;
                                preferRefCodeCacheBeanIsConnected = preferRefCodeCacheBean;
                                str5 = str2;
                                referralInfo3 = referralInfo4;
                                i3 = !Intrinsics.EZpvd(referralManager3.valueOf(str5), unBindBackendReferralCodeCacheBean) ? 1 : 0;
                                String referralCode2 = referralInfo3.getReferralCode();
                                referralManager$checkPreferReferralCodeState$1.L$0 = referralManager3;
                                referralManager$checkPreferReferralCodeState$1.L$1 = referralInfo3;
                                referralManager$checkPreferReferralCodeState$1.L$2 = preferRefCodeCacheBeanIsConnected;
                                referralManager$checkPreferReferralCodeState$1.L$3 = null;
                                referralManager$checkPreferReferralCodeState$1.L$4 = null;
                                referralManager$checkPreferReferralCodeState$1.I$0 = i3;
                                referralManager$checkPreferReferralCodeState$1.label = 7;
                                objAhwBna = referralManager3.AhwBna(referralCode2, referralManager$checkPreferReferralCodeState$1);
                                if (objAhwBna == objCopydefault) {
                                }
                            }
                        }
                        return C56443yFo.KWHzl(z3);
                    }
                    unBindBackendReferralCodeCacheBeanValueOf = referralManager.valueOf(str5);
                    if (referralManager.OLrzqt) {
                        referralManager4 = referralManager;
                        str3 = str5;
                        i = 0;
                        if (unBindBackendReferralCodeCacheBeanValueOf != null) {
                        }
                        z2 = true;
                        unBindBackendReferralCodeCacheBeanValueOf2 = referralManager4.valueOf(str3);
                        boolean zEZpvd2 = Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf);
                        StringBuilder sb = new StringBuilder();
                        sb.append("checkPreferReferralCodeState: if is the same=");
                        sb.append(!zEZpvd2);
                        pUU.KWHzl("DexReferral", sb.toString());
                        if (!Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf)) {
                        }
                        return C56443yFo.KWHzl(z3);
                    }
                    pUU.KWHzl("DexReferral", "checkPreferReferralCodeState: need check UnbindBackendCode");
                    referralManager.OLrzqt = true;
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt2 = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str5, false);
                    referralManager$checkPreferReferralCodeState$1.L$0 = referralManager;
                    referralManager$checkPreferReferralCodeState$1.L$1 = str5;
                    referralManager$checkPreferReferralCodeState$1.L$2 = unBindBackendReferralCodeCacheBeanValueOf;
                    referralManager$checkPreferReferralCodeState$1.L$3 = null;
                    referralManager$checkPreferReferralCodeState$1.I$0 = 1;
                    referralManager$checkPreferReferralCodeState$1.label = 3;
                    objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt2, referralManager$checkPreferReferralCodeState$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager5 = referralManager;
                    str3 = str5;
                    unBindBackendReferralCodeCacheBean3 = unBindBackendReferralCodeCacheBeanValueOf;
                    i2 = 1;
                    abstractC12782ctV2 = (AbstractC12782ctV) objAwait;
                    Intrinsics.copydefault(abstractC12782ctV2);
                    bean = unBindBackendReferralCodeCacheBean3 == null ? unBindBackendReferralCodeCacheBean3.getBean() : null;
                    code = unBindBackendReferralCodeCacheBean3 == null ? unBindBackendReferralCodeCacheBean3.getCode() : null;
                    referralManager$checkPreferReferralCodeState$1.L$0 = referralManager5;
                    referralManager$checkPreferReferralCodeState$1.L$1 = str3;
                    referralManager$checkPreferReferralCodeState$1.L$2 = unBindBackendReferralCodeCacheBean3;
                    referralManager$checkPreferReferralCodeState$1.I$0 = i2;
                    referralManager$checkPreferReferralCodeState$1.label = 4;
                    if (referralManager5.OLrzqt(abstractC12782ctV2, bean, code, referralManager$checkPreferReferralCodeState$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager4 = referralManager5;
                    UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean4 = unBindBackendReferralCodeCacheBean3;
                    i = i2;
                    unBindBackendReferralCodeCacheBeanValueOf = unBindBackendReferralCodeCacheBean4;
                    if (unBindBackendReferralCodeCacheBeanValueOf != null || i != 0) {
                        z2 = true;
                        unBindBackendReferralCodeCacheBeanValueOf2 = referralManager4.valueOf(str3);
                        boolean zEZpvd22 = Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("checkPreferReferralCodeState: if is the same=");
                        sb2.append(!zEZpvd22);
                        pUU.KWHzl("DexReferral", sb2.toString());
                        if (!Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf)) {
                            z3 = z2;
                        }
                        return C56443yFo.KWHzl(z3);
                    }
                    pUU.KWHzl("DexReferral", "checkPreferReferralCodeState: checkAndSaveUnbindBackendReferralCode");
                    InviteeInfoItemResponse inviteeInfo2 = unBindBackendReferralCodeCacheBeanValueOf.getInviteeInfo();
                    PreferRefCodeInfoResponse bean3 = unBindBackendReferralCodeCacheBeanValueOf.getBean();
                    String code4 = unBindBackendReferralCodeCacheBeanValueOf.getCode();
                    referralManager$checkPreferReferralCodeState$1.L$0 = referralManager4;
                    referralManager$checkPreferReferralCodeState$1.L$1 = str3;
                    referralManager$checkPreferReferralCodeState$1.L$2 = unBindBackendReferralCodeCacheBeanValueOf;
                    referralManager$checkPreferReferralCodeState$1.L$3 = null;
                    referralManager$checkPreferReferralCodeState$1.label = 5;
                    z2 = true;
                    if (referralManager4.AEQbTJ(str3, inviteeInfo2, bean3, code4, referralManager$checkPreferReferralCodeState$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str3;
                    referralManager6 = referralManager4;
                    referralManager4 = referralManager6;
                    str3 = str4;
                    unBindBackendReferralCodeCacheBeanValueOf2 = referralManager4.valueOf(str3);
                    boolean zEZpvd222 = Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf);
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("checkPreferReferralCodeState: if is the same=");
                    sb22.append(!zEZpvd222);
                    pUU.KWHzl("DexReferral", sb22.toString());
                    if (!Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf)) {
                    }
                    return C56443yFo.KWHzl(z3);
                }
                referralManager = this;
                if (referralInfo5.getCodeType() == ReferralCodeType.CODE_TYPE_BIND_BACKEND.getType()) {
                }
                break;
            case 1:
                String str6 = (String) referralManager$checkPreferReferralCodeState$1.L$2;
                ReferralInfo referralInfo6 = (ReferralInfo) referralManager$checkPreferReferralCodeState$1.L$1;
                ReferralManager referralManager8 = (ReferralManager) referralManager$checkPreferReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                referralManager2 = referralManager8;
                str5 = str6;
                referralInfo5 = referralInfo6;
                AbstractC12782ctV abstractC12782ctV32 = (AbstractC12782ctV) objAwait;
                Intrinsics.copydefault(abstractC12782ctV32);
                deviceRefCodeCacheBeanCopydefault = referralManager2.copydefault(abstractC12782ctV32);
                if (deviceRefCodeCacheBeanCopydefault == null) {
                }
                referralManager = referralManager2;
                if (referralInfo5.getCodeType() == ReferralCodeType.CODE_TYPE_BIND_BACKEND.getType()) {
                }
                break;
            case 2:
                abstractC12782ctV = (AbstractC12782ctV) referralManager$checkPreferReferralCodeState$1.L$3;
                str5 = (String) referralManager$checkPreferReferralCodeState$1.L$2;
                referralInfo2 = (ReferralInfo) referralManager$checkPreferReferralCodeState$1.L$1;
                referralManager2 = (ReferralManager) referralManager$checkPreferReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                Intrinsics.copydefault(abstractC12782ctV);
                deviceRefCodeCacheBeanCopydefault2 = referralManager2.copydefault(abstractC12782ctV);
                if (deviceRefCodeCacheBeanCopydefault2 == null) {
                }
                referralInfo5 = referralInfo2;
                referralManager = referralManager2;
                if (referralInfo5.getCodeType() == ReferralCodeType.CODE_TYPE_BIND_BACKEND.getType()) {
                }
                break;
            case 3:
                i2 = referralManager$checkPreferReferralCodeState$1.I$0;
                unBindBackendReferralCodeCacheBean3 = (UnBindBackendReferralCodeCacheBean) referralManager$checkPreferReferralCodeState$1.L$2;
                str3 = (String) referralManager$checkPreferReferralCodeState$1.L$1;
                referralManager5 = (ReferralManager) referralManager$checkPreferReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                abstractC12782ctV2 = (AbstractC12782ctV) objAwait;
                Intrinsics.copydefault(abstractC12782ctV2);
                if (unBindBackendReferralCodeCacheBean3 == null) {
                }
                if (unBindBackendReferralCodeCacheBean3 == null) {
                }
                referralManager$checkPreferReferralCodeState$1.L$0 = referralManager5;
                referralManager$checkPreferReferralCodeState$1.L$1 = str3;
                referralManager$checkPreferReferralCodeState$1.L$2 = unBindBackendReferralCodeCacheBean3;
                referralManager$checkPreferReferralCodeState$1.I$0 = i2;
                referralManager$checkPreferReferralCodeState$1.label = 4;
                if (referralManager5.OLrzqt(abstractC12782ctV2, bean, code, referralManager$checkPreferReferralCodeState$1) == objCopydefault) {
                }
                referralManager4 = referralManager5;
                UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean42 = unBindBackendReferralCodeCacheBean3;
                i = i2;
                unBindBackendReferralCodeCacheBeanValueOf = unBindBackendReferralCodeCacheBean42;
                if (unBindBackendReferralCodeCacheBeanValueOf != null) {
                }
                z2 = true;
                unBindBackendReferralCodeCacheBeanValueOf2 = referralManager4.valueOf(str3);
                boolean zEZpvd2222 = Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf);
                StringBuilder sb222 = new StringBuilder();
                sb222.append("checkPreferReferralCodeState: if is the same=");
                sb222.append(!zEZpvd2222);
                pUU.KWHzl("DexReferral", sb222.toString());
                if (!Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf)) {
                }
                return C56443yFo.KWHzl(z3);
            case 4:
                i2 = referralManager$checkPreferReferralCodeState$1.I$0;
                unBindBackendReferralCodeCacheBean3 = (UnBindBackendReferralCodeCacheBean) referralManager$checkPreferReferralCodeState$1.L$2;
                str3 = (String) referralManager$checkPreferReferralCodeState$1.L$1;
                referralManager5 = (ReferralManager) referralManager$checkPreferReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                referralManager4 = referralManager5;
                UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean422 = unBindBackendReferralCodeCacheBean3;
                i = i2;
                unBindBackendReferralCodeCacheBeanValueOf = unBindBackendReferralCodeCacheBean422;
                if (unBindBackendReferralCodeCacheBeanValueOf != null) {
                }
                z2 = true;
                unBindBackendReferralCodeCacheBeanValueOf2 = referralManager4.valueOf(str3);
                boolean zEZpvd22222 = Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf);
                StringBuilder sb2222 = new StringBuilder();
                sb2222.append("checkPreferReferralCodeState: if is the same=");
                sb2222.append(!zEZpvd22222);
                pUU.KWHzl("DexReferral", sb2222.toString());
                if (!Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf)) {
                }
                return C56443yFo.KWHzl(z3);
            case 5:
                unBindBackendReferralCodeCacheBeanValueOf = (UnBindBackendReferralCodeCacheBean) referralManager$checkPreferReferralCodeState$1.L$2;
                str4 = (String) referralManager$checkPreferReferralCodeState$1.L$1;
                referralManager6 = (ReferralManager) referralManager$checkPreferReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                z2 = true;
                referralManager4 = referralManager6;
                str3 = str4;
                unBindBackendReferralCodeCacheBeanValueOf2 = referralManager4.valueOf(str3);
                boolean zEZpvd222222 = Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf);
                StringBuilder sb22222 = new StringBuilder();
                sb22222.append("checkPreferReferralCodeState: if is the same=");
                sb22222.append(!zEZpvd222222);
                pUU.KWHzl("DexReferral", sb22222.toString());
                if (!Intrinsics.EZpvd(unBindBackendReferralCodeCacheBeanValueOf2, unBindBackendReferralCodeCacheBeanValueOf)) {
                }
                return C56443yFo.KWHzl(z3);
            case 6:
                unBindBackendReferralCodeCacheBean2 = (UnBindBackendReferralCodeCacheBean) referralManager$checkPreferReferralCodeState$1.L$4;
                preferRefCodeCacheBean = (PreferRefCodeCacheBean) referralManager$checkPreferReferralCodeState$1.L$3;
                str2 = (String) referralManager$checkPreferReferralCodeState$1.L$2;
                referralInfo4 = (ReferralInfo) referralManager$checkPreferReferralCodeState$1.L$1;
                referralManager3 = (ReferralManager) referralManager$checkPreferReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                z2 = true;
                unBindBackendReferralCodeCacheBean = unBindBackendReferralCodeCacheBean2;
                preferRefCodeCacheBeanIsConnected = preferRefCodeCacheBean;
                str5 = str2;
                referralInfo3 = referralInfo4;
                i3 = !Intrinsics.EZpvd(referralManager3.valueOf(str5), unBindBackendReferralCodeCacheBean) ? 1 : 0;
                String referralCode22 = referralInfo3.getReferralCode();
                referralManager$checkPreferReferralCodeState$1.L$0 = referralManager3;
                referralManager$checkPreferReferralCodeState$1.L$1 = referralInfo3;
                referralManager$checkPreferReferralCodeState$1.L$2 = preferRefCodeCacheBeanIsConnected;
                referralManager$checkPreferReferralCodeState$1.L$3 = null;
                referralManager$checkPreferReferralCodeState$1.L$4 = null;
                referralManager$checkPreferReferralCodeState$1.I$0 = i3;
                referralManager$checkPreferReferralCodeState$1.label = 7;
                objAhwBna = referralManager3.AhwBna(referralCode22, referralManager$checkPreferReferralCodeState$1);
                if (objAhwBna == objCopydefault) {
                }
                break;
            case 7:
                i3 = referralManager$checkPreferReferralCodeState$1.I$0;
                preferRefCodeCacheBean2 = (PreferRefCodeCacheBean) referralManager$checkPreferReferralCodeState$1.L$2;
                referralInfo3 = (ReferralInfo) referralManager$checkPreferReferralCodeState$1.L$1;
                referralManager7 = (ReferralManager) referralManager$checkPreferReferralCodeState$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                z2 = true;
                preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) ((Pair) objAwait).getSecond();
                if (preferRefCodeInfoResponse != null) {
                }
                boolean zEZpvd3 = Intrinsics.EZpvd(preferRefCodeCacheBean2, referralManager7.isConnected());
                if (i3 == 0) {
                    z3 = z2;
                }
                return C56443yFo.KWHzl(z3);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, InviteeInfoItemResponse inviteeInfoItemResponse, PreferRefCodeInfoResponse preferRefCodeInfoResponse, String str2, Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$checkAndSaveUnbindBackendReferralCode$1 referralManager$checkAndSaveUnbindBackendReferralCode$1;
        String str3;
        String str4;
        ReferralManager referralManager;
        if (continuation instanceof ReferralManager$checkAndSaveUnbindBackendReferralCode$1) {
            referralManager$checkAndSaveUnbindBackendReferralCode$1 = (ReferralManager$checkAndSaveUnbindBackendReferralCode$1) continuation;
            int i = referralManager$checkAndSaveUnbindBackendReferralCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkAndSaveUnbindBackendReferralCode$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkAndSaveUnbindBackendReferralCode$1 = new ReferralManager$checkAndSaveUnbindBackendReferralCode$1(this, continuation);
            }
        }
        Object obj = referralManager$checkAndSaveUnbindBackendReferralCode$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkAndSaveUnbindBackendReferralCode$1.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkAndSaveUnbindBackendReferralCode failed", e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DexReferral", "checkAndSaveUnbindBackendReferralCode: start, referralCodeResponse=" + inviteeInfoItemResponse + " bean=" + preferRefCodeInfoResponse + " codeOfBean=" + str2);
            String code = inviteeInfoItemResponse.getCode();
            if (code != null) {
                referralManager$checkAndSaveUnbindBackendReferralCode$1.L$0 = this;
                referralManager$checkAndSaveUnbindBackendReferralCode$1.L$1 = str;
                referralManager$checkAndSaveUnbindBackendReferralCode$1.L$2 = inviteeInfoItemResponse;
                referralManager$checkAndSaveUnbindBackendReferralCode$1.L$3 = preferRefCodeInfoResponse;
                referralManager$checkAndSaveUnbindBackendReferralCode$1.L$4 = str2;
                referralManager$checkAndSaveUnbindBackendReferralCode$1.L$5 = code;
                referralManager$checkAndSaveUnbindBackendReferralCode$1.label = 1;
                Object objAhwBna = AhwBna(code, referralManager$checkAndSaveUnbindBackendReferralCode$1);
                if (objAhwBna == objCopydefault) {
                    return objCopydefault;
                }
                str3 = str;
                str4 = code;
                obj = objAhwBna;
                referralManager = this;
            } else {
                pUU.KWHzl("DexReferral", "checkAndSaveUnbindBackendReferralCode: referralCode=" + code);
                return C56443yFo.KWHzl(false);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) referralManager$checkAndSaveUnbindBackendReferralCode$1.L$5;
            str2 = (String) referralManager$checkAndSaveUnbindBackendReferralCode$1.L$4;
            preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) referralManager$checkAndSaveUnbindBackendReferralCode$1.L$3;
            inviteeInfoItemResponse = (InviteeInfoItemResponse) referralManager$checkAndSaveUnbindBackendReferralCode$1.L$2;
            str3 = (String) referralManager$checkAndSaveUnbindBackendReferralCode$1.L$1;
            referralManager = (ReferralManager) referralManager$checkAndSaveUnbindBackendReferralCode$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Pair pair = (Pair) obj;
        pUU.KWHzl("DexReferral", "checkAndSaveUnbindBackendReferralCode: referralCode=" + str4 + " it=" + pair.getSecond() + ", referralCodeResponse=" + inviteeInfoItemResponse);
        PreferRefCodeInfoResponse preferRefCodeInfoResponse2 = (PreferRefCodeInfoResponse) pair.getSecond();
        if (preferRefCodeInfoResponse2 != null) {
            if (preferRefCodeInfoResponse != null && str2 != null && Intrinsics.EZpvd((Object) inviteeInfoItemResponse.getCode(), (Object) str2) && Intrinsics.EZpvd(preferRefCodeInfoResponse2, preferRefCodeInfoResponse)) {
                pUU.KWHzl("DexReferral", "checkAndSaveUnbindBackendReferralCode: no change");
            }
            referralManager.AEQbTJ(str3, str4, preferRefCodeInfoResponse2, inviteeInfoItemResponse);
            return C56443yFo.KWHzl(true);
        }
        return C56443yFo.KWHzl(false);
    }

    public final boolean AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Triple triple;
        String strSubstring;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkAndSaveUnbindBackendReferralCode failed", e);
        }
        if (!StringsKt__StringsKt.contains$default((CharSequence) str4, (CharSequence) str, false, 2, (Object) null)) {
            pUU.KWHzl("DexReferral", "verifyMessageAndSignature: message not include code");
            return false;
        }
        String strAhwBna = AhwBna(str2);
        if (Intrinsics.EZpvd((Object) strAhwBna, (Object) "1")) {
            C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            if (C59449zhJ.AYXKKw(str5, EIP1271Verifier.hexPrefix, true)) {
                strSubstring = str5.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            } else {
                strSubstring = str5;
            }
            triple = new Triple(c10854bwMIsConnected, str4, strSubstring);
        } else if (Intrinsics.EZpvd((Object) strAhwBna, (Object) "501")) {
            triple = new Triple(C10954byG.EZpvd.valueOf().hDKMBd(), AEQbTJ(str4), OLrzqt(str5));
        } else {
            triple = new Triple(null, null, null);
        }
        C10854bwM c10854bwM = (C10854bwM) triple.component1();
        String str6 = (String) triple.component2();
        String str7 = (String) triple.component3();
        if (c10854bwM != null && str7 != null && str6 != null) {
            SignParams signParams = new SignParams(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), null, null, null, null, 0, null, true, false, null, 1788, null);
            VerifyMessageParams verifyMessageParams = new VerifyMessageParams(str3, str6, true, str7);
            boolean result = xYU.copydefault.KWHzl(signParams, verifyMessageParams).getResult();
            pUU.KWHzl("DexReferral", "verifyMessageAndSignature: result=" + result + ", " + signParams + ", " + verifyMessageParams);
            return result;
        }
        pUU.KWHzl("DexReferral", "verifyMessageAndSignature: return false");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$checkUnbindBackendReferralInfoIfNull$1 referralManager$checkUnbindBackendReferralInfoIfNull$1;
        ReferralManager referralManager;
        Object objM7377constructorimpl;
        Object obj;
        Exception e;
        if (continuation instanceof ReferralManager$checkUnbindBackendReferralInfoIfNull$1) {
            referralManager$checkUnbindBackendReferralInfoIfNull$1 = (ReferralManager$checkUnbindBackendReferralInfoIfNull$1) continuation;
            int i = referralManager$checkUnbindBackendReferralInfoIfNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkUnbindBackendReferralInfoIfNull$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkUnbindBackendReferralInfoIfNull$1 = new ReferralManager$checkUnbindBackendReferralInfoIfNull$1(this, continuation);
            }
        }
        Object objAwait = referralManager$checkUnbindBackendReferralInfoIfNull$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkUnbindBackendReferralInfoIfNull$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                pUU.KWHzl("DexReferral", "checkUnbindBackendReferralInfoIfNull: start");
                try {
                    Result.Application application = Result.Companion;
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
                    referralManager$checkUnbindBackendReferralInfoIfNull$1.L$0 = this;
                    referralManager$checkUnbindBackendReferralInfoIfNull$1.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, referralManager$checkUnbindBackendReferralInfoIfNull$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager = this;
                } catch (Throwable th) {
                    th = th;
                    referralManager = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = referralManager$checkUnbindBackendReferralInfoIfNull$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objAwait);
                    } catch (Exception e2) {
                        e = e2;
                        pUU.AEQbTJ("DexReferral", "checkUnbindBackendReferralInfoIfNull ", e);
                    }
                    objM7377constructorimpl = obj;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        pUU.KWHzl("DexReferral", "checkUnbindBackendReferralInfoIfNull: mainwallet empty");
                    }
                    return Unit.INSTANCE;
                }
                referralManager = (ReferralManager) referralManager$checkUnbindBackendReferralInfoIfNull$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwait);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
                try {
                    Intrinsics.copydefault(abstractC12782ctV);
                } catch (Exception e3) {
                    obj = objM7377constructorimpl;
                    e = e3;
                    pUU.AEQbTJ("DexReferral", "checkUnbindBackendReferralInfoIfNull ", e);
                }
                if (referralManager.AEQbTJ(abstractC12782ctV) == null) {
                    if (referralManager.valueOf(abstractC12782ctV.DbNXlk()) == null) {
                        referralManager$checkUnbindBackendReferralInfoIfNull$1.L$0 = objM7377constructorimpl;
                        referralManager$checkUnbindBackendReferralInfoIfNull$1.label = 2;
                        if (referralManager.OLrzqt(abstractC12782ctV, (PreferRefCodeInfoResponse) null, (String) null, referralManager$checkUnbindBackendReferralInfoIfNull$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj = objM7377constructorimpl;
                        objM7377constructorimpl = obj;
                    } else {
                        pUU.KWHzl("DexReferral", "checkUnbindBackendReferralInfoIfNull: unbindBackendCode != null");
                    }
                } else {
                    pUU.KWHzl("DexReferral", "checkUnbindBackendReferralInfoIfNull: code bound, no need check");
                }
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[Catch: Exception -> 0x0117, TryCatch #0 {Exception -> 0x0117, blocks: (B:12:0x002c, B:17:0x0051, B:33:0x00a4, B:35:0x00ae, B:37:0x00b4, B:40:0x00bc, B:42:0x00c6, B:45:0x00e1, B:20:0x005f, B:22:0x006a, B:25:0x0074, B:29:0x0080, B:46:0x00fa), top: B:52:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1 A[Catch: Exception -> 0x0117, TryCatch #0 {Exception -> 0x0117, blocks: (B:12:0x002c, B:17:0x0051, B:33:0x00a4, B:35:0x00ae, B:37:0x00b4, B:40:0x00bc, B:42:0x00c6, B:45:0x00e1, B:20:0x005f, B:22:0x006a, B:25:0x0074, B:29:0x0080, B:46:0x00fa), top: B:52:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(AbstractC12782ctV abstractC12782ctV, PreferRefCodeInfoResponse preferRefCodeInfoResponse, String str, Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$checkUnbindBackendReferralInfo$1 referralManager$checkUnbindBackendReferralInfo$1;
        PreferRefCodeInfoResponse preferRefCodeInfoResponse2;
        String str2;
        String str3;
        String str4;
        ReferralManager referralManager;
        AbstractC43419rot abstractC43419rot;
        if (continuation instanceof ReferralManager$checkUnbindBackendReferralInfo$1) {
            referralManager$checkUnbindBackendReferralInfo$1 = (ReferralManager$checkUnbindBackendReferralInfo$1) continuation;
            int i = referralManager$checkUnbindBackendReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkUnbindBackendReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkUnbindBackendReferralInfo$1 = new ReferralManager$checkUnbindBackendReferralInfo$1(this, continuation);
            }
        }
        ReferralManager$checkUnbindBackendReferralInfo$1 referralManager$checkUnbindBackendReferralInfo$12 = referralManager$checkUnbindBackendReferralInfo$1;
        Object obj = referralManager$checkUnbindBackendReferralInfo$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkUnbindBackendReferralInfo$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DexReferral", "checkUnbindBackendReferralInfo: start");
                Pair<String, String> pairEZpvd = EZpvd(abstractC12782ctV);
                String first = pairEZpvd != null ? pairEZpvd.getFirst() : null;
                String second = pairEZpvd != null ? pairEZpvd.getSecond() : null;
                if (first != null && second != null) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ReferralManager$checkUnbindBackendReferralInfo$checkResponse$1 referralManager$checkUnbindBackendReferralInfo$checkResponse$1 = new ReferralManager$checkUnbindBackendReferralInfo$checkResponse$1(this, abstractC12782ctV, second, null);
                    referralManager$checkUnbindBackendReferralInfo$12.L$0 = this;
                    referralManager$checkUnbindBackendReferralInfo$12.L$1 = abstractC12782ctV;
                    referralManager$checkUnbindBackendReferralInfo$12.L$2 = preferRefCodeInfoResponse;
                    referralManager$checkUnbindBackendReferralInfo$12.L$3 = str;
                    referralManager$checkUnbindBackendReferralInfo$12.L$4 = first;
                    referralManager$checkUnbindBackendReferralInfo$12.L$5 = second;
                    referralManager$checkUnbindBackendReferralInfo$12.label = 1;
                    Object objWithContext = BuildersKt.withContext(io2, referralManager$checkUnbindBackendReferralInfo$checkResponse$1, referralManager$checkUnbindBackendReferralInfo$12);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    preferRefCodeInfoResponse2 = preferRefCodeInfoResponse;
                    str2 = str;
                    str3 = second;
                    obj = objWithContext;
                    str4 = first;
                    referralManager = this;
                    abstractC43419rot = (AbstractC43419rot) obj;
                    InviteeInfoResponse inviteeInfoResponse = (InviteeInfoResponse) abstractC43419rot.copydefault();
                    if (inviteeInfoResponse == null) {
                    }
                    if (!abstractC43419rot.EZpvd()) {
                    }
                } else {
                    pUU.KWHzl("DexReferral", "checkUnbindBackendReferralInfo error: chainId=" + first + " address=" + second);
                }
            } else if (i2 == 1) {
                String str5 = (String) referralManager$checkUnbindBackendReferralInfo$12.L$5;
                String str6 = (String) referralManager$checkUnbindBackendReferralInfo$12.L$4;
                String str7 = (String) referralManager$checkUnbindBackendReferralInfo$12.L$3;
                PreferRefCodeInfoResponse preferRefCodeInfoResponse3 = (PreferRefCodeInfoResponse) referralManager$checkUnbindBackendReferralInfo$12.L$2;
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) referralManager$checkUnbindBackendReferralInfo$12.L$1;
                ReferralManager referralManager2 = (ReferralManager) referralManager$checkUnbindBackendReferralInfo$12.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str7;
                preferRefCodeInfoResponse2 = preferRefCodeInfoResponse3;
                referralManager = referralManager2;
                str3 = str5;
                abstractC12782ctV = abstractC12782ctV2;
                str4 = str6;
                abstractC43419rot = (AbstractC43419rot) obj;
                InviteeInfoResponse inviteeInfoResponse2 = (InviteeInfoResponse) abstractC43419rot.copydefault();
                List<InviteeInfoItemResponse> list = inviteeInfoResponse2 == null ? inviteeInfoResponse2.getList() : null;
                if (!abstractC43419rot.EZpvd()) {
                    InviteeInfoItemResponse inviteeInfoItemResponse = list != null ? (InviteeInfoItemResponse) CollectionsKt___CollectionsKt.AkhnZx(list, 0) : null;
                    String strDbNXlk = abstractC12782ctV.DbNXlk();
                    referralManager$checkUnbindBackendReferralInfo$12.L$0 = null;
                    referralManager$checkUnbindBackendReferralInfo$12.L$1 = null;
                    referralManager$checkUnbindBackendReferralInfo$12.L$2 = null;
                    referralManager$checkUnbindBackendReferralInfo$12.L$3 = null;
                    referralManager$checkUnbindBackendReferralInfo$12.L$4 = null;
                    referralManager$checkUnbindBackendReferralInfo$12.L$5 = null;
                    referralManager$checkUnbindBackendReferralInfo$12.label = 2;
                    if (referralManager.OLrzqt(strDbNXlk, str4, str3, inviteeInfoItemResponse, preferRefCodeInfoResponse2, str2, referralManager$checkUnbindBackendReferralInfo$12) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    pUU.KWHzl("DexReferral", "checkUnbindBackendReferralInfo: checkResponse error " + abstractC43419rot.AEQbTJ());
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkUnbindBackendReferralInfo ", e);
        }
        return Unit.INSTANCE;
    }

    public final Object OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, InviteeInfoItemResponse inviteeInfoItemResponse, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Pair<String, String> pairEZpvd = EZpvd(abstractC12782ctV);
        String first = pairEZpvd != null ? pairEZpvd.getFirst() : null;
        String second = pairEZpvd != null ? pairEZpvd.getSecond() : null;
        if (first != null && second != null) {
            UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanValueOf = valueOf(abstractC12782ctV.DbNXlk());
            Object objOLrzqt = OLrzqt(abstractC12782ctV.DbNXlk(), first, second, inviteeInfoItemResponse, unBindBackendReferralCodeCacheBeanValueOf != null ? unBindBackendReferralCodeCacheBeanValueOf.getBean() : null, unBindBackendReferralCodeCacheBeanValueOf != null ? unBindBackendReferralCodeCacheBeanValueOf.getCode() : null, continuation);
            return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, String str2, String str3, InviteeInfoItemResponse inviteeInfoItemResponse, PreferRefCodeInfoResponse preferRefCodeInfoResponse, String str4, Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2 referralManager$verifyAndSaveUnbindBackendReferralInfo$2;
        if (continuation instanceof ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2) {
            referralManager$verifyAndSaveUnbindBackendReferralInfo$2 = (ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2) continuation;
            int i = referralManager$verifyAndSaveUnbindBackendReferralInfo$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$verifyAndSaveUnbindBackendReferralInfo$2.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$verifyAndSaveUnbindBackendReferralInfo$2 = new ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2(this, continuation);
            }
        }
        ReferralManager$verifyAndSaveUnbindBackendReferralInfo$2 referralManager$verifyAndSaveUnbindBackendReferralInfo$22 = referralManager$verifyAndSaveUnbindBackendReferralInfo$2;
        Object obj = referralManager$verifyAndSaveUnbindBackendReferralInfo$22.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$verifyAndSaveUnbindBackendReferralInfo$22.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("DexReferral", "verifyAndSaveUnbindBackendReferralInfo: start codeInfo=" + inviteeInfoItemResponse + ", chainId=" + str2 + ", address=" + str3 + ", bean=" + preferRefCodeInfoResponse);
                if (inviteeInfoItemResponse != null && C33129mqd.OLrzqt((CharSequence) inviteeInfoItemResponse.getCode()) && C33129mqd.OLrzqt((CharSequence) inviteeInfoItemResponse.getSignMsg()) && C33129mqd.OLrzqt((CharSequence) inviteeInfoItemResponse.getSignature())) {
                    String code = inviteeInfoItemResponse.getCode();
                    Intrinsics.copydefault((Object) code);
                    String signMsg = inviteeInfoItemResponse.getSignMsg();
                    Intrinsics.copydefault((Object) signMsg);
                    String signature = inviteeInfoItemResponse.getSignature();
                    Intrinsics.copydefault((Object) signature);
                    if (AEQbTJ(code, str2, str3, signMsg, signature)) {
                        pUU.KWHzl("DexReferral", "verifyAndSaveUnbindBackendReferralInfo: verifyMessageAndSignature success");
                        referralManager$verifyAndSaveUnbindBackendReferralInfo$22.label = 1;
                        if (AEQbTJ(str, inviteeInfoItemResponse, preferRefCodeInfoResponse, str4, referralManager$verifyAndSaveUnbindBackendReferralInfo$22) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        pUU.KWHzl("DexReferral", "verifyAndSaveUnbindBackendReferralInfo: verifyMessageAndSignature fail");
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    this.valueOf.EZpvd(str);
                    pUU.KWHzl("DexReferral", "verifyAndSaveUnbindBackendReferralInfo: codeInfo=" + inviteeInfoItemResponse + "}");
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "verifyAndSaveUnbindBackendReferralInfo ", e);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(String str, String str2, PreferRefCodeInfoResponse preferRefCodeInfoResponse, InviteeInfoItemResponse inviteeInfoItemResponse) {
        try {
            pUU.KWHzl("DexReferral", "cacheUnbindBackendPreferCodeAndPostEvent: unbind code updated: accountId=" + str + ", code=" + str2 + ", cacheRefCodeInfo=" + preferRefCodeInfoResponse + ", referralCodeResponse=" + inviteeInfoItemResponse);
            UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBean = new UnBindBackendReferralCodeCacheBean(str2, preferRefCodeInfoResponse, inviteeInfoItemResponse);
            RxBus.AEQbTJ(new xXL(C56402yEa.EZpvd(str2)));
            this.valueOf.AEQbTJ(str, unBindBackendReferralCodeCacheBean);
            StringBuilder sb = new StringBuilder();
            sb.append("cacheUnbindBackendPreferCodeAndPostEvent: unbind code updated: code=");
            sb.append(str2);
            sb.append(", newPreferCode=");
            sb.append(unBindBackendReferralCodeCacheBean);
            pUU.KWHzl("DexReferral", sb.toString());
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "cacheUnbindBackendPreferCodeAndPostEvent: Failed to save chain list to cache", e);
        }
    }

    public final UnBindBackendReferralCodeCacheBean valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanCopydefault = this.valueOf.copydefault(str);
            pUU.KWHzl("DexReferral", "getUnbindBackendPreferCode: unbindBackendCode=" + unBindBackendReferralCodeCacheBeanCopydefault);
            return unBindBackendReferralCodeCacheBeanCopydefault;
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "Failed to get prefer code from cache", e);
            return null;
        }
    }

    public final void AkhnZx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            this.valueOf.EZpvd(str);
            pUU.KWHzl("DexReferral", "removeUnbindBackendPreferCode: accountId=" + str);
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "removeUnbindBackendPreferCode Failed ", e);
        }
    }

    public final String OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return "You will authorize applying this referral code: " + str + ", nonce: " + Base64.encodeToString(bytes, 2);
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "generateSignMsg Failed", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[Catch: Exception -> 0x0134, TryCatch #0 {Exception -> 0x0134, blocks: (B:13:0x0030, B:18:0x004b, B:35:0x00c5, B:37:0x00d1, B:39:0x00da, B:41:0x00e8, B:43:0x00f2, B:45:0x00fc, B:50:0x0111, B:54:0x0120, B:47:0x0104, B:21:0x005a, B:31:0x00a9, B:27:0x0072), top: B:61:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104 A[Catch: Exception -> 0x0134, TryCatch #0 {Exception -> 0x0134, blocks: (B:13:0x0030, B:18:0x004b, B:35:0x00c5, B:37:0x00d1, B:39:0x00da, B:41:0x00e8, B:43:0x00f2, B:45:0x00fc, B:50:0x0111, B:54:0x0120, B:47:0x0104, B:21:0x005a, B:31:0x00a9, B:27:0x0072), top: B:61:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull ReferralInfo referralInfo, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$triggerBindReferralInfoForDex$1 referralManager$triggerBindReferralInfoForDex$1;
        ReferralManager referralManager;
        int i;
        ReferralManager referralManager2;
        ReferralInfo referralInfo2;
        int i2;
        AbstractC12782ctV abstractC12782ctV;
        String referralCode;
        Map<String, String> inviterAddressMap;
        if (continuation instanceof ReferralManager$triggerBindReferralInfoForDex$1) {
            referralManager$triggerBindReferralInfoForDex$1 = (ReferralManager$triggerBindReferralInfoForDex$1) continuation;
            int i3 = referralManager$triggerBindReferralInfoForDex$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                referralManager$triggerBindReferralInfoForDex$1.label = i3 - Integer.MIN_VALUE;
            } else {
                referralManager$triggerBindReferralInfoForDex$1 = new ReferralManager$triggerBindReferralInfoForDex$1(this, continuation);
            }
        }
        ReferralManager$triggerBindReferralInfoForDex$1 referralManager$triggerBindReferralInfoForDex$12 = referralManager$triggerBindReferralInfoForDex$1;
        Object objAwait = referralManager$triggerBindReferralInfoForDex$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = referralManager$triggerBindReferralInfoForDex$12.label;
        boolean z = true;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "triggerBindReferralInfo Failed", e);
        }
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            if (!referralInfo.getIpAllowed()) {
                pUU.KWHzl("DexReferral", "triggerBindReferralInfo: not allowed");
                return Unit.INSTANCE;
            }
            pUU.KWHzl("DexReferral", "triggerBindReferralInfo: start: codeInfo=" + referralInfo + ", accountId=" + str);
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
            referralManager$triggerBindReferralInfoForDex$12.L$0 = this;
            referralManager$triggerBindReferralInfoForDex$12.L$1 = referralInfo;
            referralManager$triggerBindReferralInfoForDex$12.I$0 = 0;
            referralManager$triggerBindReferralInfoForDex$12.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, referralManager$triggerBindReferralInfoForDex$12);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            referralManager = this;
            i = 0;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAwait);
                    return Unit.INSTANCE;
                }
                i2 = referralManager$triggerBindReferralInfoForDex$12.I$0;
                abstractC12782ctV = (AbstractC12782ctV) referralManager$triggerBindReferralInfoForDex$12.L$2;
                referralInfo2 = (ReferralInfo) referralManager$triggerBindReferralInfoForDex$12.L$1;
                referralManager2 = (ReferralManager) referralManager$triggerBindReferralInfoForDex$12.L$0;
                C56391yDq.AEQbTJ(objAwait);
                if (referralInfo2.getCodeType() != ReferralCodeType.CODE_TYPE_BIND_FRONTEND.getType()) {
                    Intrinsics.copydefault(abstractC12782ctV);
                    ReferralInfoBean referralInfoBeanAEQbTJ = referralManager2.AEQbTJ(abstractC12782ctV);
                    if (referralInfoBeanAEQbTJ != null && Intrinsics.EZpvd((Object) referralInfoBeanAEQbTJ.getReferralCode(), (Object) referralInfo2.getReferralCode())) {
                        if (C33129mqd.OLrzqt((CharSequence) referralInfoBeanAEQbTJ.getSignMsg()) && C33129mqd.OLrzqt((CharSequence) referralInfoBeanAEQbTJ.getSignature())) {
                            pUU.KWHzl("DexReferral", "triggerBindReferralInfo: bound already");
                            return Unit.INSTANCE;
                        }
                        i2 = 1;
                    }
                    Intrinsics.copydefault(abstractC12782ctV);
                    referralCode = referralInfo2.getReferralCode();
                    inviterAddressMap = referralInfo2.getInviterAddressMap();
                    if (i2 != 0) {
                        z = false;
                    }
                    referralManager$triggerBindReferralInfoForDex$12.L$0 = null;
                    referralManager$triggerBindReferralInfoForDex$12.L$1 = null;
                    referralManager$triggerBindReferralInfoForDex$12.L$2 = null;
                    referralManager$triggerBindReferralInfoForDex$12.label = 3;
                    if (referralManager2.AEQbTJ(abstractC12782ctV, referralCode, inviterAddressMap, 2, z, referralManager$triggerBindReferralInfoForDex$12) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (referralInfo2.getCodeType() == ReferralCodeType.CODE_TYPE_BIND_BACKEND.getType()) {
                        i2 = 1;
                    }
                    Intrinsics.copydefault(abstractC12782ctV);
                    referralCode = referralInfo2.getReferralCode();
                    inviterAddressMap = referralInfo2.getInviterAddressMap();
                    if (i2 != 0) {
                    }
                    referralManager$triggerBindReferralInfoForDex$12.L$0 = null;
                    referralManager$triggerBindReferralInfoForDex$12.L$1 = null;
                    referralManager$triggerBindReferralInfoForDex$12.L$2 = null;
                    referralManager$triggerBindReferralInfoForDex$12.label = 3;
                    if (referralManager2.AEQbTJ(abstractC12782ctV, referralCode, inviterAddressMap, 2, z, referralManager$triggerBindReferralInfoForDex$12) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
            int i5 = referralManager$triggerBindReferralInfoForDex$12.I$0;
            ReferralInfo referralInfo3 = (ReferralInfo) referralManager$triggerBindReferralInfoForDex$12.L$1;
            referralManager = (ReferralManager) referralManager$triggerBindReferralInfoForDex$12.L$0;
            C56391yDq.AEQbTJ(objAwait);
            i = i5;
            referralInfo = referralInfo3;
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objAwait;
        ReferralBindReportManagerV2 referralBindReportManagerV2 = referralManager.fetchVPNInfo;
        Intrinsics.copydefault(abstractC12782ctV2);
        referralManager$triggerBindReferralInfoForDex$12.L$0 = referralManager;
        referralManager$triggerBindReferralInfoForDex$12.L$1 = referralInfo;
        referralManager$triggerBindReferralInfoForDex$12.L$2 = abstractC12782ctV2;
        referralManager$triggerBindReferralInfoForDex$12.I$0 = i;
        referralManager$triggerBindReferralInfoForDex$12.label = 2;
        if (referralBindReportManagerV2.AEQbTJ(abstractC12782ctV2, referralManager$triggerBindReferralInfoForDex$12) == objCopydefault) {
            return objCopydefault;
        }
        referralManager2 = referralManager;
        referralInfo2 = referralInfo;
        i2 = i;
        abstractC12782ctV = abstractC12782ctV2;
        if (referralInfo2.getCodeType() != ReferralCodeType.CODE_TYPE_BIND_FRONTEND.getType()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x0030 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(AbstractC12782ctV abstractC12782ctV, String str, Map<String, String> map, int i, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$triggerBindReferralInfo$1 referralManager$triggerBindReferralInfo$1;
        ?? r3;
        String first;
        AbstractC12782ctV abstractC12782ctV2;
        String str2;
        String str3;
        int i2;
        boolean z2;
        String str4;
        ReferralManager referralManager;
        ?? r32 = i;
        if (continuation instanceof ReferralManager$triggerBindReferralInfo$1) {
            referralManager$triggerBindReferralInfo$1 = (ReferralManager$triggerBindReferralInfo$1) continuation;
            int i3 = referralManager$triggerBindReferralInfo$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                referralManager$triggerBindReferralInfo$1.label = i3 - Integer.MIN_VALUE;
            } else {
                referralManager$triggerBindReferralInfo$1 = new ReferralManager$triggerBindReferralInfo$1(this, continuation);
            }
        }
        Object objCopydefault = referralManager$triggerBindReferralInfo$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i4 = referralManager$triggerBindReferralInfo$1.label;
        try {
            try {
            } catch (Exception e) {
                e = e;
                r3 = "DexReferral";
                pUU.AEQbTJ(r3, "triggerBindReferralInfo Failed", e);
                return Unit.INSTANCE;
            }
        } catch (Exception e2) {
            e = e2;
            r3 = r32;
            pUU.AEQbTJ(r3, "triggerBindReferralInfo Failed", e);
            return Unit.INSTANCE;
        }
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pUU.KWHzl("DexReferral", "triggerBindReferralInfo: start: referralCode=" + str + ", inviterAddressMap=" + map + ", source=" + (r32 == true ? 1 : 0) + ", isRestore=" + z);
            String strDbNXlk = abstractC12782ctV.DbNXlk();
            String strAEQbTJ = AEQbTJ(str, map);
            Pair<String, String> pairEZpvd = EZpvd(abstractC12782ctV);
            if (pairEZpvd != null && strAEQbTJ != null) {
                first = pairEZpvd.getFirst();
                String second = pairEZpvd.getSecond();
                referralManager$triggerBindReferralInfo$1.L$0 = this;
                abstractC12782ctV2 = abstractC12782ctV;
                referralManager$triggerBindReferralInfo$1.L$1 = abstractC12782ctV2;
                referralManager$triggerBindReferralInfo$1.L$2 = str;
                referralManager$triggerBindReferralInfo$1.L$3 = strAEQbTJ;
                referralManager$triggerBindReferralInfo$1.L$4 = first;
                referralManager$triggerBindReferralInfo$1.L$5 = second;
                referralManager$triggerBindReferralInfo$1.I$0 = r32 == true ? 1 : 0;
                referralManager$triggerBindReferralInfo$1.Z$0 = z;
                referralManager$triggerBindReferralInfo$1.label = 1;
                objCopydefault = copydefault(first, strDbNXlk, strAEQbTJ, referralManager$triggerBindReferralInfo$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                str2 = str;
                str3 = strAEQbTJ;
                i2 = r32 == true ? 1 : 0;
                z2 = z;
                str4 = second;
                referralManager = this;
            } else {
                String str5 = "DexReferral";
                pUU.KWHzl(str5, "triggerBindReferralInfo: param error signMsg=" + strAEQbTJ + ", chainAddressMap=" + pairEZpvd);
                Unit unit = Unit.INSTANCE;
                r32 = str5;
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return Unit.INSTANCE;
            }
            z2 = referralManager$triggerBindReferralInfo$1.Z$0;
            i2 = referralManager$triggerBindReferralInfo$1.I$0;
            str4 = (String) referralManager$triggerBindReferralInfo$1.L$5;
            String str6 = (String) referralManager$triggerBindReferralInfo$1.L$4;
            String str7 = (String) referralManager$triggerBindReferralInfo$1.L$3;
            str2 = (String) referralManager$triggerBindReferralInfo$1.L$2;
            AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) referralManager$triggerBindReferralInfo$1.L$1;
            ReferralManager referralManager2 = (ReferralManager) referralManager$triggerBindReferralInfo$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            str3 = str7;
            referralManager = referralManager2;
            abstractC12782ctV2 = abstractC12782ctV3;
            first = str6;
        }
        String str8 = (String) objCopydefault;
        if (str8 != null) {
            referralManager$triggerBindReferralInfo$1.L$0 = null;
            referralManager$triggerBindReferralInfo$1.L$1 = null;
            referralManager$triggerBindReferralInfo$1.L$2 = null;
            referralManager$triggerBindReferralInfo$1.L$3 = null;
            referralManager$triggerBindReferralInfo$1.L$4 = null;
            referralManager$triggerBindReferralInfo$1.L$5 = null;
            referralManager$triggerBindReferralInfo$1.label = 2;
            String str9 = str2;
            String str10 = first;
            String str11 = str4;
            r32 = "DexReferral";
            if (referralManager.KWHzl(str9, str10, str11, abstractC12782ctV2, str3, str8, i2 == true ? 1 : 0, z2, referralManager$triggerBindReferralInfo$1) == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            String str12 = "DexReferral";
            pUU.KWHzl(str12, "triggerBindReferralInfo: signature null");
            Unit unit2 = Unit.INSTANCE;
            r32 = str12;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0294 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0295 -> B:56:0x029c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, String str2, String str3, Continuation<? super String> continuation) throws Throwable {
        ReferralManager$signBindCodeMessage$1 referralManager$signBindCodeMessage$1;
        InterfaceC9740bbL interfaceC9740bbLAEQbTJ;
        String str4;
        List listEZpvd;
        Iterator it;
        ReferralManager referralManager;
        FragmentActivity fragmentActivity;
        String str5;
        String str6;
        String str7;
        String str8;
        ReferralManager referralManager2;
        InterfaceC9740bbL interfaceC9740bbL;
        Iterator it2;
        InterfaceC9734bbF interfaceC9734bbF;
        FragmentActivity fragmentActivity2;
        Object objAwaitFirst;
        String str9;
        FragmentActivity fragmentActivity3;
        Iterator it3;
        InterfaceC9734bbF interfaceC9734bbF2;
        String str10 = str;
        if (continuation instanceof ReferralManager$signBindCodeMessage$1) {
            referralManager$signBindCodeMessage$1 = (ReferralManager$signBindCodeMessage$1) continuation;
            int i = referralManager$signBindCodeMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$signBindCodeMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$signBindCodeMessage$1 = new ReferralManager$signBindCodeMessage$1(this, continuation);
            }
        }
        Object obj = referralManager$signBindCodeMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$signBindCodeMessage$1.label;
        Object obj2 = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null) {
                return null;
            }
            android.app.Activity activityOLrzqt = C33569myt.OLrzqt(activityAEQbTJ);
            FragmentActivity fragmentActivity4 = activityOLrzqt instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt : null;
            if (fragmentActivity4 == null) {
                return null;
            }
            interfaceC9740bbLAEQbTJ = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AEQbTJ();
            if (Intrinsics.EZpvd((Object) str10, (Object) "1")) {
                listEZpvd = C56402yEa.EZpvd(new SignDataArgs(str2, null, C33129mqd.valueOf(str), new EVMMessageSignData(str3, false, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), null, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, C56443yFo.AEQbTJ(13), 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, false, false, null, false, false, false, false, 16776178, null));
                str4 = str3;
            } else if (Intrinsics.EZpvd((Object) str10, (Object) "501")) {
                str4 = str3;
                listEZpvd = C56402yEa.EZpvd(new SignDataArgs(str2, null, C33129mqd.valueOf(str), new SolanaMessageSignData(AEQbTJ(str4), false, null, 6, null), null, null, null, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, C56443yFo.AEQbTJ(13), null, null, null, null, null, null, false, false, null, false, false, false, false, 16776178, null));
            } else {
                str4 = str3;
                listEZpvd = null;
            }
            if (listEZpvd != null) {
                it = listEZpvd.iterator();
                referralManager = this;
                fragmentActivity = fragmentActivity4;
                str5 = str2;
                if (it.hasNext()) {
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            it3 = (Iterator) referralManager$signBindCodeMessage$1.L$6;
            interfaceC9740bbLAEQbTJ = (InterfaceC9740bbL) referralManager$signBindCodeMessage$1.L$5;
            fragmentActivity3 = (FragmentActivity) referralManager$signBindCodeMessage$1.L$4;
            String str11 = (String) referralManager$signBindCodeMessage$1.L$3;
            str9 = (String) referralManager$signBindCodeMessage$1.L$2;
            String str12 = (String) referralManager$signBindCodeMessage$1.L$1;
            referralManager = (ReferralManager) referralManager$signBindCodeMessage$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str6 = str12;
            str8 = str11;
            interfaceC9734bbF2 = (InterfaceC9734bbF) ((Pair) obj).getFirst();
            if (interfaceC9734bbF2 != null) {
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it4 = (Iterator) referralManager$signBindCodeMessage$1.L$6;
                interfaceC9740bbLAEQbTJ = (InterfaceC9740bbL) referralManager$signBindCodeMessage$1.L$5;
                FragmentActivity fragmentActivity5 = (FragmentActivity) referralManager$signBindCodeMessage$1.L$4;
                String str13 = (String) referralManager$signBindCodeMessage$1.L$3;
                String str14 = (String) referralManager$signBindCodeMessage$1.L$2;
                String str15 = (String) referralManager$signBindCodeMessage$1.L$1;
                ReferralManager referralManager3 = (ReferralManager) referralManager$signBindCodeMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                Object obj3 = obj;
                ReferralManager referralManager4 = referralManager3;
                fragmentActivity = fragmentActivity5;
                it = it4;
                str10 = str15;
                str4 = str13;
                str7 = str14;
                ResponseData responseData = (ResponseData) obj3;
                if (responseData.getCode() != -5001) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    String strAEQbTJ = ((C9748bbT) data).AEQbTJ();
                    pUU.KWHzl("DexReferral", "signedMessage=" + strAEQbTJ);
                    if (strAEQbTJ != null) {
                        pUU.KWHzl("DexReferral", "signBindCodeMessage: signed signature=" + strAEQbTJ);
                        return (!Intrinsics.EZpvd((Object) str10, (Object) "1") && Intrinsics.EZpvd((Object) str10, (Object) "501")) ? referralManager4.EZpvd(strAEQbTJ) : strAEQbTJ;
                    }
                    pUU.KWHzl("DexReferral", "signBindCodeMessage: signature null");
                } else {
                    pUU.KWHzl("DexReferral", "signBindCodeMessage: signature error");
                }
                str5 = str7;
                referralManager = referralManager4;
                obj2 = null;
                if (it.hasNext()) {
                    SignDataArgs<?> signDataArgs = (SignDataArgs) it.next();
                    pUU.KWHzl("DexReferral", "signBindCodeMessage: accountId=" + str5 + ", chainId=" + str10 + ", address=" + str10 + ", accountId=" + str5 + ", signMsg=" + str4);
                    AbstractC58260yxt<Pair<InterfaceC9734bbF, String>> abstractC58260yxtEZpvd = interfaceC9740bbLAEQbTJ.EZpvd(signDataArgs);
                    referralManager$signBindCodeMessage$1.L$0 = referralManager;
                    referralManager$signBindCodeMessage$1.L$1 = str10;
                    referralManager$signBindCodeMessage$1.L$2 = str5;
                    referralManager$signBindCodeMessage$1.L$3 = str4;
                    referralManager$signBindCodeMessage$1.L$4 = fragmentActivity;
                    referralManager$signBindCodeMessage$1.L$5 = interfaceC9740bbLAEQbTJ;
                    referralManager$signBindCodeMessage$1.L$6 = it;
                    referralManager$signBindCodeMessage$1.label = 1;
                    Object objAwait = RxAwaitKt.await(abstractC58260yxtEZpvd, referralManager$signBindCodeMessage$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    str6 = str10;
                    str8 = str4;
                    it3 = it;
                    fragmentActivity3 = fragmentActivity;
                    str9 = str5;
                    obj = objAwait;
                    interfaceC9734bbF2 = (InterfaceC9734bbF) ((Pair) obj).getFirst();
                    if (interfaceC9734bbF2 != null) {
                        return null;
                    }
                    referralManager$signBindCodeMessage$1.L$0 = referralManager;
                    referralManager$signBindCodeMessage$1.L$1 = str6;
                    referralManager$signBindCodeMessage$1.L$2 = str9;
                    referralManager$signBindCodeMessage$1.L$3 = str8;
                    referralManager$signBindCodeMessage$1.L$4 = fragmentActivity3;
                    referralManager$signBindCodeMessage$1.L$5 = interfaceC9740bbLAEQbTJ;
                    referralManager$signBindCodeMessage$1.L$6 = it3;
                    referralManager$signBindCodeMessage$1.L$7 = interfaceC9734bbF2;
                    referralManager$signBindCodeMessage$1.L$8 = referralManager$signBindCodeMessage$1;
                    referralManager$signBindCodeMessage$1.label = 2;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(referralManager$signBindCodeMessage$1), 1);
                    cancellableContinuationImpl.initCancellability();
                    FragmentManager supportFragmentManager = fragmentActivity3.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    new C14513dmq(supportFragmentManager, "referral", new LoaderManager(cancellableContinuationImpl), null, 8, null).EZpvd();
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == C56442yFn.copydefault()) {
                        C56447yFs.copydefault(referralManager$signBindCodeMessage$1);
                    }
                    if (result == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager2 = referralManager;
                    str7 = str9;
                    obj = result;
                    fragmentActivity2 = fragmentActivity3;
                    interfaceC9740bbL = interfaceC9740bbLAEQbTJ;
                    it2 = it3;
                    interfaceC9734bbF = interfaceC9734bbF2;
                    AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXAEQbTJ = interfaceC9734bbF.AEQbTJ((String) obj);
                    referralManager$signBindCodeMessage$1.L$0 = referralManager2;
                    referralManager$signBindCodeMessage$1.L$1 = str6;
                    referralManager$signBindCodeMessage$1.L$2 = str7;
                    referralManager$signBindCodeMessage$1.L$3 = str8;
                    referralManager$signBindCodeMessage$1.L$4 = fragmentActivity2;
                    referralManager$signBindCodeMessage$1.L$5 = interfaceC9740bbL;
                    referralManager$signBindCodeMessage$1.L$6 = it2;
                    referralManager$signBindCodeMessage$1.L$7 = null;
                    referralManager$signBindCodeMessage$1.L$8 = null;
                    referralManager$signBindCodeMessage$1.label = 3;
                    objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, referralManager$signBindCodeMessage$1);
                    if (objAwaitFirst != objCopydefault) {
                        return objCopydefault;
                    }
                    fragmentActivity = fragmentActivity2;
                    obj3 = objAwaitFirst;
                    referralManager4 = referralManager2;
                    str10 = str6;
                    it = it2;
                    interfaceC9740bbLAEQbTJ = interfaceC9740bbL;
                    str4 = str8;
                    ResponseData responseData2 = (ResponseData) obj3;
                    if (responseData2.getCode() != -5001) {
                    }
                    str5 = str7;
                    referralManager = referralManager4;
                    obj2 = null;
                    if (it.hasNext()) {
                    }
                }
                return obj2;
            }
            interfaceC9734bbF = (InterfaceC9734bbF) referralManager$signBindCodeMessage$1.L$7;
            it2 = (Iterator) referralManager$signBindCodeMessage$1.L$6;
            interfaceC9740bbL = (InterfaceC9740bbL) referralManager$signBindCodeMessage$1.L$5;
            FragmentActivity fragmentActivity6 = (FragmentActivity) referralManager$signBindCodeMessage$1.L$4;
            str8 = (String) referralManager$signBindCodeMessage$1.L$3;
            str7 = (String) referralManager$signBindCodeMessage$1.L$2;
            str6 = (String) referralManager$signBindCodeMessage$1.L$1;
            ReferralManager referralManager5 = (ReferralManager) referralManager$signBindCodeMessage$1.L$0;
            C56391yDq.AEQbTJ(obj);
            fragmentActivity2 = fragmentActivity6;
            referralManager2 = referralManager5;
            AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXAEQbTJ2 = interfaceC9734bbF.AEQbTJ((String) obj);
            referralManager$signBindCodeMessage$1.L$0 = referralManager2;
            referralManager$signBindCodeMessage$1.L$1 = str6;
            referralManager$signBindCodeMessage$1.L$2 = str7;
            referralManager$signBindCodeMessage$1.L$3 = str8;
            referralManager$signBindCodeMessage$1.L$4 = fragmentActivity2;
            referralManager$signBindCodeMessage$1.L$5 = interfaceC9740bbL;
            referralManager$signBindCodeMessage$1.L$6 = it2;
            referralManager$signBindCodeMessage$1.L$7 = null;
            referralManager$signBindCodeMessage$1.L$8 = null;
            referralManager$signBindCodeMessage$1.label = 3;
            objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ2, referralManager$signBindCodeMessage$1);
            if (objAwaitFirst != objCopydefault) {
            }
        }
    }

    public static final class LoaderManager implements Function1<String, Unit> {
        public final /* synthetic */ CancellableContinuation<String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(CancellableContinuation<? super String> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        public final void EZpvd(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.OLrzqt.isActive()) {
                CancellableContinuation<String> cancellableContinuation = this.OLrzqt;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(str));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(String str) {
            EZpvd(str);
            return Unit.INSTANCE;
        }
    }

    public final String AEQbTJ(String str) {
        try {
            return xYW.AEQbTJ.copydefault(str);
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "Failed to convert string to Base58", e);
            return str;
        }
    }

    public final String EZpvd(String str) {
        try {
            String strKWHzl = xYW.AEQbTJ.KWHzl(str);
            if (C59449zhJ.AYXKKw(strKWHzl, EIP1271Verifier.hexPrefix, true)) {
                strKWHzl = strKWHzl.substring(2);
                Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
            }
            return strKWHzl;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "Failed to convert Base58 to hex", e);
            return str;
        }
    }

    public final String OLrzqt(String str) {
        String strSubstring;
        try {
            if (C59449zhJ.AYXKKw(str, EIP1271Verifier.hexPrefix, true)) {
                strSubstring = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            } else {
                strSubstring = str;
            }
            return xYW.AEQbTJ.valueOf(strSubstring);
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "Failed to convert hex to Base58", e);
            return str;
        }
    }

    public final void OLrzqt(String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, PreferRefCodeCacheBean preferRefCodeCacheBean) {
        try {
            DbNXlk(str);
            PreferRefCodeCacheBean preferRefCodeCacheBean2 = new PreferRefCodeCacheBean(str, preferRefCodeInfoResponse);
            if (preferRefCodeCacheBean != null && Intrinsics.EZpvd(preferRefCodeCacheBean, preferRefCodeCacheBean2)) {
                pUU.KWHzl("DexReferral", "cachePreferCodeAndPostEvent: Prefer code unchanged, skip SP update");
            } else {
                SPUtils.put("dex_referral_prefer_code_cache", preferRefCodeCacheBean2.toJson(), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
                RxBus.AEQbTJ(new xXL(C56402yEa.EZpvd(str)));
                pUU.KWHzl("DexReferral", "cachePreferCodeAndPostEvent: Prefer code updated: code=" + str + ", newPreferCode=" + preferRefCodeCacheBean2);
            }
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "cachePreferCodeAndPostEvent: Failed to save chain list to cache", e);
        }
    }

    public final boolean EZpvd(String str, PreferRefCodeInfoResponse preferRefCodeInfoResponse, PreferRefCodeCacheBean preferRefCodeCacheBean) {
        PreferRefCodeCacheBean preferRefCodeCacheBean2;
        try {
            preferRefCodeCacheBean2 = new PreferRefCodeCacheBean(str, preferRefCodeInfoResponse);
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "Failed to save chain list to cache", e);
        }
        if (preferRefCodeCacheBean != null && Intrinsics.EZpvd(preferRefCodeCacheBean, preferRefCodeCacheBean2)) {
            pUU.KWHzl("DexReferral", "Prefer code unchanged, skip SP update");
            return false;
        }
        SPUtils.put("dex_referral_prefer_code_cache", preferRefCodeCacheBean2.toJson(), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
        pUU.KWHzl("DexReferral", "Prefer code updated: code=" + str + ", newPreferCode=" + preferRefCodeCacheBean2);
        return true;
    }

    public final PreferRefCodeCacheBean isConnected() {
        String string;
        try {
            string = SPUtils.getString("dex_referral_prefer_code_cache", "", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            Intrinsics.copydefault((Object) string);
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "Failed to get prefer code from cache", e);
        }
        if (string.length() > 0) {
            pUU.KWHzl("DexReferral", "get prefer code from cache, cachedJson=" + string);
            return PreferRefCodeCacheBean.Companion.KWHzl(string);
        }
        pUU.valueOf("DexReferral", "Failed to get prefer code from cache, cachedJson empty");
        return null;
    }

    public final void AuCTel() {
        try {
            SPUtils.remove("dex_referral_prefer_code_cache", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            pUU.EZpvd("DexReferral", "removeDeeplinkPreferCode Removed deeplink prefer code from cache");
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "removeDeeplinkPreferCode Failed to remove deeplink prefer code from cache", e);
        }
    }

    public final void AEQbTJ(Context context, final RefInfoResponse refInfoResponse, boolean z, final WalletReferralSource walletReferralSource) {
        String strOLrzqt;
        if (!(context instanceof FragmentActivity) || refInfoResponse == null) {
            return;
        }
        pUU.KWHzl("DexReferral", "bindReferralCode wallet not found, showCustomConnectWalletDialog ");
        if (C33129mqd.OLrzqt(refInfoResponse.getDiscountRate(), "0")) {
            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.OLrzqt(C13754dXa.FragmentManager.OuxcSI, context), C56423yEv.EZpvd(C56390yDp.OLrzqt("refcode", refInfoResponse.getRefCode())));
        } else {
            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.OLrzqt(C13754dXa.FragmentManager.QSBOWP, context), C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", pTB.formatICUPercent$default(C33129mqd.copydefault(refInfoResponse.getDiscountRate()), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, Double.valueOf(100.0d), null, 20, null)), C56390yDp.OLrzqt("refcode", refInfoResponse.getRefCode())));
        }
        String str = strOLrzqt;
        C32866mlf.KWHzl("DexReferral_Invitee_NoValidWalletPrompt_view", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReferralManager.KWHzl(refInfoResponse, walletReferralSource, (EventParamsList) obj);
            }
        });
        xWO xwo = (xWO) C43251rlk.OLrzqt(xWO.class);
        if (xwo != null) {
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            xwo.copydefault(supportFragmentManager, new C54836xXc(new C54836xXc.TaskDescription(C13754dXa.Activity.RcXXUw, C55298xhM.copydefault(138.0f, context), C55298xhM.copydefault(138.0f, context)), C33070mpX.OLrzqt(C13754dXa.FragmentManager.RKDWNf, context), str, C33070mpX.OLrzqt(C13754dXa.FragmentManager.getPostValueLengthLimit, context), C33070mpX.OLrzqt(C13754dXa.FragmentManager.OBJEWx, context)), new Application(refInfoResponse, z, context), new InterfaceC54856xXw() { // from class: o.dqi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC54856xXw
                public final void OLrzqt(android.os.Bundle bundle) {
                    ReferralManager.EZpvd(this.KWHzl, refInfoResponse, walletReferralSource, bundle);
                }
            }, new ActionBar(refInfoResponse, walletReferralSource));
        }
    }

    public static final Unit KWHzl(RefInfoResponse refInfoResponse, WalletReferralSource walletReferralSource, EventParamsList eventParamsList) {
        String event;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("referral_code", refInfoResponse.getRefCode(), false);
        WalletReferralSource walletReferralSource2 = WalletReferralSource.DEVICE_CACHED;
        if (walletReferralSource == walletReferralSource2) {
            event = walletReferralSource2.getEvent();
        } else {
            event = WalletReferralSource.DEEPLINK.getEvent();
        }
        eventParamsList.put("code_source", event, true);
        return Unit.INSTANCE;
    }

    public static final class Application implements InterfaceC54859xXz {
        public final /* synthetic */ Context AEQbTJ;
        public final /* synthetic */ RefInfoResponse EZpvd;
        public final /* synthetic */ boolean KWHzl;

        public Application(RefInfoResponse refInfoResponse, boolean z, Context context) {
            this.EZpvd = refInfoResponse;
            this.KWHzl = z;
            this.AEQbTJ = context;
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ReferralManager$handleWalletNotFound$2$voidCallback$1(ReferralManager.this, this.EZpvd, this.KWHzl, this.AEQbTJ, null), 3, null);
        }
    }

    public static final void EZpvd(ReferralManager referralManager, RefInfoResponse refInfoResponse, WalletReferralSource walletReferralSource, Bundle bundle) {
        if (bundle == null) {
            referralManager.OLrzqt(refInfoResponse.getRefCode(), walletReferralSource, EopTrackEvent.EXIT);
        }
    }

    public static final class ActionBar implements InterfaceC54852xXs {
        public final /* synthetic */ RefInfoResponse EZpvd;
        public final /* synthetic */ WalletReferralSource copydefault;

        public ActionBar(RefInfoResponse refInfoResponse, WalletReferralSource walletReferralSource) {
            this.EZpvd = refInfoResponse;
            this.copydefault = walletReferralSource;
        }

        @Override // o.InterfaceC54852xXs
        public void AEQbTJ() {
            pUU.KWHzl("DexReferral", "onCreateWallet");
            ReferralManager.this.OLrzqt(this.EZpvd.getRefCode(), this.copydefault, "create_wallet");
        }

        @Override // o.InterfaceC54852xXs
        public void copydefault() {
            pUU.KWHzl("DexReferral", "onImportWallet");
            ReferralManager.this.OLrzqt(this.EZpvd.getRefCode(), this.copydefault, "import_wallet");
        }
    }

    public final void EZpvd(Context context) {
        if (context instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) context).showLoadingWithLogo();
        }
    }

    public final void AEQbTJ(Context context) {
        if (context instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) context).dismissLoadingWithLogo();
        }
    }

    public final Object djBIcL(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return OLrzqt(str, false, continuation);
    }

    public final Object EZpvd(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return OLrzqt(str, true, continuation);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean.copy$default(com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean, java.lang.String, java.lang.String, java.util.Map, boolean, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean */
    /* JADX WARN: Path cross not found for [B:56:0x01ad, B:59:0x01bc], limit reached: 72 */
    /* JADX WARN: Path cross not found for [B:59:0x01bc, B:56:0x01ad], limit reached: 72 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120 A[Catch: Exception -> 0x01ef, TryCatch #0 {Exception -> 0x01ef, blocks: (B:14:0x0051, B:54:0x01a5, B:56:0x01ad, B:58:0x01b8, B:42:0x011a, B:44:0x0120, B:46:0x0146, B:48:0x0154, B:50:0x015a, B:63:0x01cb, B:19:0x0073, B:41:0x010a, B:22:0x0086, B:33:0x00db, B:35:0x00e3, B:37:0x00eb, B:65:0x01d7, B:66:0x01dd, B:25:0x008d, B:27:0x00ae, B:29:0x00c0, B:67:0x01e3, B:68:0x01e9), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad A[Catch: Exception -> 0x01ef, TryCatch #0 {Exception -> 0x01ef, blocks: (B:14:0x0051, B:54:0x01a5, B:56:0x01ad, B:58:0x01b8, B:42:0x011a, B:44:0x0120, B:46:0x0146, B:48:0x0154, B:50:0x015a, B:63:0x01cb, B:19:0x0073, B:41:0x010a, B:22:0x0086, B:33:0x00db, B:35:0x00e3, B:37:0x00eb, B:65:0x01d7, B:66:0x01dd, B:25:0x008d, B:27:0x00ae, B:29:0x00c0, B:67:0x01e3, B:68:0x01e9), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb A[Catch: Exception -> 0x01ef, TryCatch #0 {Exception -> 0x01ef, blocks: (B:14:0x0051, B:54:0x01a5, B:56:0x01ad, B:58:0x01b8, B:42:0x011a, B:44:0x0120, B:46:0x0146, B:48:0x0154, B:50:0x015a, B:63:0x01cb, B:19:0x0073, B:41:0x010a, B:22:0x0086, B:33:0x00db, B:35:0x00e3, B:37:0x00eb, B:65:0x01d7, B:66:0x01dd, B:25:0x008d, B:27:0x00ae, B:29:0x00c0, B:67:0x01e3, B:68:0x01e9), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x019f -> B:54:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01c1 -> B:62:0x01c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, boolean z, Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$updateReferralInfoStatus$1 referralManager$updateReferralInfoStatus$1;
        String strValueOf;
        String strAYXKKw;
        ReferralManager referralManager;
        boolean z2;
        String strEZpvd;
        Ref.BooleanRef booleanRef;
        ReferralInfoBean referralInfoBean;
        Iterator it;
        String str2;
        Ref.BooleanRef booleanRef2;
        ReferralManager referralManager2;
        boolean z3;
        if (continuation instanceof ReferralManager$updateReferralInfoStatus$1) {
            referralManager$updateReferralInfoStatus$1 = (ReferralManager$updateReferralInfoStatus$1) continuation;
            int i = referralManager$updateReferralInfoStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$updateReferralInfoStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$updateReferralInfoStatus$1 = new ReferralManager$updateReferralInfoStatus$1(this, continuation);
            }
        }
        Object obj = referralManager$updateReferralInfoStatus$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$updateReferralInfoStatus$1.label;
        char c = 3;
        boolean z4 = true;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "disconnectReferralInfo: Exception occurred", e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("DexReferral", "disconnectReferralInfo: Starting disconnect for accountId=" + str);
            AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
            if (abstractC12782ctVOLrzqt != null) {
                strValueOf = String.valueOf(abstractC12782ctVOLrzqt.QwvEab().ordinal());
                strAYXKKw = AYXKKw(abstractC12782ctVOLrzqt);
                if (strAYXKKw != null) {
                    C11286cIp c11286cIp = this.gEmmrt;
                    referralManager$updateReferralInfoStatus$1.L$0 = this;
                    referralManager$updateReferralInfoStatus$1.L$1 = strValueOf;
                    referralManager$updateReferralInfoStatus$1.L$2 = strAYXKKw;
                    referralManager$updateReferralInfoStatus$1.Z$0 = z;
                    referralManager$updateReferralInfoStatus$1.label = 1;
                    Object objEZpvd = c11286cIp.EZpvd(strValueOf, strAYXKKw, referralManager$updateReferralInfoStatus$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager = this;
                    obj = objEZpvd;
                    z2 = z;
                } else {
                    pUU.KWHzl("DexReferral", "disconnectReferralInfo: walletAddress empty");
                }
            } else {
                pUU.KWHzl("DexReferral", "disconnectReferralInfo: wallet not found");
            }
            return C56443yFo.KWHzl(false);
        }
        if (i2 == 1) {
            z2 = referralManager$updateReferralInfoStatus$1.Z$0;
            strAYXKKw = (String) referralManager$updateReferralInfoStatus$1.L$2;
            strValueOf = (String) referralManager$updateReferralInfoStatus$1.L$1;
            referralManager = (ReferralManager) referralManager$updateReferralInfoStatus$1.L$0;
            C56391yDq.AEQbTJ(obj);
        } else if (i2 == 2) {
            z2 = referralManager$updateReferralInfoStatus$1.Z$0;
            booleanRef = (Ref.BooleanRef) referralManager$updateReferralInfoStatus$1.L$3;
            referralInfoBean = (ReferralInfoBean) referralManager$updateReferralInfoStatus$1.L$2;
            strEZpvd = (String) referralManager$updateReferralInfoStatus$1.L$1;
            referralManager = (ReferralManager) referralManager$updateReferralInfoStatus$1.L$0;
            C56391yDq.AEQbTJ(obj);
            String str3 = strEZpvd;
            it = ((Iterable) obj).iterator();
            str2 = str3;
            ReferralManager referralManager3 = referralManager;
            booleanRef2 = booleanRef;
            referralManager2 = referralManager3;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = referralManager$updateReferralInfoStatus$1.Z$0;
            ReferralInfoBean referralInfoBean2 = (ReferralInfoBean) referralManager$updateReferralInfoStatus$1.L$6;
            String str4 = (String) referralManager$updateReferralInfoStatus$1.L$5;
            it = (Iterator) referralManager$updateReferralInfoStatus$1.L$4;
            booleanRef2 = (Ref.BooleanRef) referralManager$updateReferralInfoStatus$1.L$3;
            ReferralInfoBean referralInfoBean3 = (ReferralInfoBean) referralManager$updateReferralInfoStatus$1.L$2;
            String str5 = (String) referralManager$updateReferralInfoStatus$1.L$1;
            ReferralManager referralManager4 = (ReferralManager) referralManager$updateReferralInfoStatus$1.L$0;
            C56391yDq.AEQbTJ(obj);
            boolean z6 = z5;
            char c2 = 3;
            if (((Boolean) obj).booleanValue()) {
                referralManager4.AhwBna.put(str4, referralInfoBean2);
                if (Intrinsics.EZpvd((Object) str5, (Object) str4)) {
                    z3 = true;
                    booleanRef2.element = true;
                }
                referralInfoBean = referralInfoBean3;
                str2 = str5;
                referralManager2 = referralManager4;
                z4 = z3;
                c = c2;
                z2 = z6;
                if (it.hasNext()) {
                    Triple triple = (Triple) it.next();
                    String strEZpvd2 = referralManager2.EZpvd((String) triple.getFirst(), (String) triple.getSecond());
                    ReferralInfoBean referralInfoBeanAEQbTJ = ReferralInfoBean.Companion.AEQbTJ((String) triple.getThird());
                    if (referralInfoBeanAEQbTJ == null || !Intrinsics.EZpvd((Object) referralInfoBeanAEQbTJ.getReferralCode(), (Object) referralInfoBean.getReferralCode()) || referralInfoBeanAEQbTJ.getDisconnected() == z2) {
                        z6 = z2;
                        c2 = c;
                        z3 = z4;
                        z4 = z3;
                        c = c2;
                        z2 = z6;
                        if (it.hasNext()) {
                            pUU.KWHzl("DexReferral", "disconnectReferralInfo: updateSuccess");
                            return C56443yFo.KWHzl(booleanRef2.element);
                        }
                    } else {
                        ReferralInfoBean referralInfoBeanCopy$default = ReferralInfoBean.copy$default(referralInfoBeanAEQbTJ, null, null, null, z2, null, null, null, 119, null);
                        C11286cIp c11286cIp2 = referralManager2.gEmmrt;
                        String str6 = (String) triple.getFirst();
                        String str7 = (String) triple.getSecond();
                        String json = referralInfoBeanCopy$default.toJson();
                        referralManager$updateReferralInfoStatus$1.L$0 = referralManager2;
                        referralManager$updateReferralInfoStatus$1.L$1 = str2;
                        referralManager$updateReferralInfoStatus$1.L$2 = referralInfoBean;
                        referralManager$updateReferralInfoStatus$1.L$3 = booleanRef2;
                        referralManager$updateReferralInfoStatus$1.L$4 = it;
                        referralManager$updateReferralInfoStatus$1.L$5 = strEZpvd2;
                        referralManager$updateReferralInfoStatus$1.L$6 = referralInfoBeanCopy$default;
                        referralManager$updateReferralInfoStatus$1.Z$0 = z2;
                        z6 = z2;
                        c2 = 3;
                        referralManager$updateReferralInfoStatus$1.label = 3;
                        Object objAEQbTJ = c11286cIp2.AEQbTJ(str6, str7, json, referralManager$updateReferralInfoStatus$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        str5 = str2;
                        referralManager4 = referralManager2;
                        obj = objAEQbTJ;
                        referralInfoBean2 = referralInfoBeanCopy$default;
                        referralInfoBean3 = referralInfoBean;
                        str4 = strEZpvd2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                }
            }
            z3 = true;
            referralInfoBean = referralInfoBean3;
            str2 = str5;
            referralManager2 = referralManager4;
            z4 = z3;
            c = c2;
            z2 = z6;
            if (it.hasNext()) {
            }
        }
        String str8 = (String) obj;
        strEZpvd = referralManager.EZpvd(strValueOf, strAYXKKw);
        if (str8 != null) {
            ReferralInfoBean referralInfoBeanAEQbTJ2 = ReferralInfoBean.Companion.AEQbTJ(str8);
            if (referralInfoBeanAEQbTJ2 != null) {
                booleanRef = new Ref.BooleanRef();
                C11286cIp c11286cIp3 = referralManager.gEmmrt;
                referralManager$updateReferralInfoStatus$1.L$0 = referralManager;
                referralManager$updateReferralInfoStatus$1.L$1 = strEZpvd;
                referralManager$updateReferralInfoStatus$1.L$2 = referralInfoBeanAEQbTJ2;
                referralManager$updateReferralInfoStatus$1.L$3 = booleanRef;
                referralManager$updateReferralInfoStatus$1.Z$0 = z2;
                referralManager$updateReferralInfoStatus$1.label = 2;
                Object objEZpvd2 = c11286cIp3.EZpvd(referralManager$updateReferralInfoStatus$1);
                if (objEZpvd2 == objCopydefault) {
                    return objCopydefault;
                }
                referralInfoBean = referralInfoBeanAEQbTJ2;
                obj = objEZpvd2;
                String str32 = strEZpvd;
                it = ((Iterable) obj).iterator();
                str2 = str32;
                ReferralManager referralManager32 = referralManager;
                booleanRef2 = booleanRef;
                referralManager2 = referralManager32;
                if (it.hasNext()) {
                }
            } else {
                pUU.KWHzl("DexReferral", "disconnectReferralInfo: bean empty");
            }
        } else {
            pUU.KWHzl("DexReferral", "disconnectReferralInfo: encryptedReferralInfoString empty");
        }
        return C56443yFo.KWHzl(false);
    }

    public final String EZpvd(String str, String str2) {
        return str + "_" + str2;
    }

    public final Object KWHzl(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$deleteReferralInfo$2(str, str2, this, null), continuation);
    }

    public final Object KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$deleteReferralInfo$4(abstractC12782ctV, this, null), continuation);
    }

    public final Object copydefault(AbstractC12782ctV abstractC12782ctV, String str, String str2, Map<String, String> map, String str3, String str4, String str5, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$saveReferralInfo$2(abstractC12782ctV, str, str2, map, str3, str4, str5, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(String str, String str2, String str3, AbstractC12782ctV abstractC12782ctV, String str4, String str5, int i, boolean z, Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1 referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1;
        String str6;
        int i2;
        boolean z2;
        ReferralManager referralManager;
        AbstractC12782ctV abstractC12782ctV2;
        String str7;
        String str8;
        String str9;
        AbstractC43419rot abstractC43419rot;
        BlockAddressCheckResp blockAddressCheckResp;
        String str10 = str2;
        if (continuation instanceof ReferralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1) {
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1 = (ReferralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1) continuation;
            int i3 = referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.label = i3 - Integer.MIN_VALUE;
            } else {
                referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1 = new ReferralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1(this, continuation);
            }
        }
        Object objCopydefault = referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i4 = referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.label;
        try {
            try {
                if (i4 == 0) {
                    C56391yDq.AEQbTJ(objCopydefault);
                    pUU.KWHzl("DexReferral", "checkBlockAddressAndSaveReferralInfoV2WithReferralCode: Starting for code=" + str + ", chainId=" + str10 + ", address=" + str3 + ", signMsg=" + str4 + ", signature=" + str5 + ", wallet.id=" + abstractC12782ctV.DbNXlk());
                    Map<String, String> mapKWHzl = KWHzl(abstractC12782ctV);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ReferralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$checkResponse$1 referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$checkResponse$1 = new ReferralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$checkResponse$1(this, mapKWHzl, null);
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$0 = this;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$1 = str;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$2 = str10;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$3 = str3;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$4 = abstractC12782ctV;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$5 = str4;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$6 = str5;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.I$0 = i;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.Z$0 = z;
                    referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.label = 1;
                    Object objWithContext = BuildersKt.withContext(io2, referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$checkResponse$1, referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1);
                    if (objWithContext == objCopydefault2) {
                        return objCopydefault2;
                    }
                    str6 = str;
                    i2 = i;
                    objCopydefault = objWithContext;
                    z2 = z;
                    referralManager = this;
                    abstractC12782ctV2 = abstractC12782ctV;
                    str7 = str4;
                    str8 = str3;
                    str9 = str5;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            C56391yDq.AEQbTJ(objCopydefault);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.Z$0;
                    int i5 = referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.I$0;
                    str9 = (String) referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$6;
                    str7 = (String) referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$5;
                    AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$4;
                    str8 = (String) referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$3;
                    String str11 = (String) referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$2;
                    String str12 = (String) referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$1;
                    ReferralManager referralManager2 = (ReferralManager) referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    z2 = z3;
                    i2 = i5;
                    str10 = str11;
                    referralManager = referralManager2;
                    str6 = str12;
                    abstractC12782ctV2 = abstractC12782ctV3;
                }
            } catch (Exception e) {
                e = e;
                pUU.AEQbTJ(str10, "checkBlockAddressAndSaveReferralInfoV2WithReferralCode: Exception occurred", e);
            }
            abstractC43419rot = (AbstractC43419rot) objCopydefault;
        } catch (Exception e2) {
            e = e2;
            str10 = "DexReferral";
        }
        if (abstractC43419rot.EZpvd() && (blockAddressCheckResp = (BlockAddressCheckResp) abstractC43419rot.copydefault()) != null && Intrinsics.EZpvd(blockAddressCheckResp.getPass(), C56443yFo.KWHzl(true))) {
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$0 = null;
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$1 = null;
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$2 = null;
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$3 = null;
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$4 = null;
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$5 = null;
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.L$6 = null;
            referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1.label = 2;
            objCopydefault = referralManager.copydefault(str6, str10, str8, abstractC12782ctV2, str7, str9, i2, z2, referralManager$checkBlockAddressAndSaveReferralInfoV2WithReferralCode$1);
            return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
        }
        pUU.KWHzl("DexReferral", "checkBlockAddressAndSaveReferralInfoV2WithReferralCode blockAddressCheck not pass");
        return C56443yFo.KWHzl(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$saveAndReportReferralInfoWithReferralCode$1 referralManager$saveAndReportReferralInfoWithReferralCode$1;
        String str4;
        String str5;
        int i2;
        boolean z2;
        ReferralManager referralManager;
        Map map;
        if (continuation instanceof ReferralManager$saveAndReportReferralInfoWithReferralCode$1) {
            referralManager$saveAndReportReferralInfoWithReferralCode$1 = (ReferralManager$saveAndReportReferralInfoWithReferralCode$1) continuation;
            int i3 = referralManager$saveAndReportReferralInfoWithReferralCode$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                referralManager$saveAndReportReferralInfoWithReferralCode$1.label = i3 - Integer.MIN_VALUE;
            } else {
                referralManager$saveAndReportReferralInfoWithReferralCode$1 = new ReferralManager$saveAndReportReferralInfoWithReferralCode$1(this, continuation);
            }
        }
        ReferralManager$saveAndReportReferralInfoWithReferralCode$1 referralManager$saveAndReportReferralInfoWithReferralCode$12 = referralManager$saveAndReportReferralInfoWithReferralCode$1;
        Object objAwait = referralManager$saveAndReportReferralInfoWithReferralCode$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = referralManager$saveAndReportReferralInfoWithReferralCode$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
                referralManager$saveAndReportReferralInfoWithReferralCode$12.L$0 = this;
                str4 = str2;
                referralManager$saveAndReportReferralInfoWithReferralCode$12.L$1 = str4;
                str5 = str3;
                referralManager$saveAndReportReferralInfoWithReferralCode$12.L$2 = str5;
                referralManager$saveAndReportReferralInfoWithReferralCode$12.I$0 = i;
                referralManager$saveAndReportReferralInfoWithReferralCode$12.Z$0 = z;
                referralManager$saveAndReportReferralInfoWithReferralCode$12.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, referralManager$saveAndReportReferralInfoWithReferralCode$12);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                z2 = z;
                referralManager = this;
            } else {
                if (i4 != 1) {
                    if (i4 == 2) {
                        C56391yDq.AEQbTJ(objAwait);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z3 = referralManager$saveAndReportReferralInfoWithReferralCode$12.Z$0;
                int i5 = referralManager$saveAndReportReferralInfoWithReferralCode$12.I$0;
                str5 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$12.L$2;
                String str6 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$12.L$1;
                referralManager = (ReferralManager) referralManager$saveAndReportReferralInfoWithReferralCode$12.L$0;
                C56391yDq.AEQbTJ(objAwait);
                z2 = z3;
                i2 = i5;
                str4 = str6;
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
            String upperCase = str4.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            Intrinsics.copydefault(abstractC12782ctV);
            Pair<String, String> pairEZpvd = referralManager.EZpvd(abstractC12782ctV);
            if (pairEZpvd != null) {
                String first = pairEZpvd.getFirst();
                String second = pairEZpvd.getSecond();
                try {
                    Json.Default r0 = Json.Default;
                    r0.getSerializersModule();
                    map = (Map) r0.decodeFromString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, ReferralSignatureData.Companion.serializer()), str5);
                } catch (Exception e) {
                    pUU.AEQbTJ("DexReferral", "saveAndReportReferralInfoWithReferralCode chainAddressMap parse failed", e);
                    map = null;
                }
                ReferralSignatureData referralSignatureData = map != null ? (ReferralSignatureData) map.get(first) : null;
                if (referralSignatureData != null) {
                    String msg = referralSignatureData.getMsg();
                    String signature = referralSignatureData.getSignature();
                    referralManager$saveAndReportReferralInfoWithReferralCode$12.L$0 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$12.L$1 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$12.L$2 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$12.label = 2;
                    objAwait = referralManager.copydefault(upperCase, first, second, abstractC12782ctV, msg, signature, i2, z2, referralManager$saveAndReportReferralInfoWithReferralCode$12);
                    return objAwait == objCopydefault ? objCopydefault : objAwait;
                }
                pUU.KWHzl("DexReferral", "saveAndReportReferralInfoWithReferralCode signatureInfo=" + referralSignatureData + ", source=" + i2);
            } else {
                pUU.KWHzl("DexReferral", "saveAndReportReferralInfoWithReferralCode chainAddressMap null");
            }
        } catch (Exception e2) {
            pUU.AEQbTJ("DexReferral", "saveAndReportReferralInfoWithReferralCode: Exception occurred", e2);
        }
        return C56443yFo.KWHzl(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0292 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, String str2, String str3, AbstractC12782ctV abstractC12782ctV, String str4, String str5, int i, boolean z, Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$saveAndReportReferralInfoWithReferralCode$2 referralManager$saveAndReportReferralInfoWithReferralCode$2;
        String str6;
        int i2;
        ReferralManager referralManager;
        Object obj;
        String str7;
        boolean z2;
        String str8;
        AbstractC12782ctV abstractC12782ctV2;
        boolean zBooleanValue;
        Object obj2;
        boolean z3;
        boolean z4;
        String str9;
        String str10;
        ReferralManager referralManager2;
        int i3;
        String str11;
        String str12;
        AbstractC12782ctV abstractC12782ctV3;
        String str13;
        boolean z5;
        String str14;
        String str15;
        boolean z6;
        ReferralBindReportManagerV2 referralBindReportManagerV2;
        Map<String, String> mapEZpvd;
        String str16 = str2;
        String str17 = str3;
        String str18 = str5;
        int i4 = i;
        if (continuation instanceof ReferralManager$saveAndReportReferralInfoWithReferralCode$2) {
            referralManager$saveAndReportReferralInfoWithReferralCode$2 = (ReferralManager$saveAndReportReferralInfoWithReferralCode$2) continuation;
            int i5 = referralManager$saveAndReportReferralInfoWithReferralCode$2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                referralManager$saveAndReportReferralInfoWithReferralCode$2.label = i5 - Integer.MIN_VALUE;
            } else {
                referralManager$saveAndReportReferralInfoWithReferralCode$2 = new ReferralManager$saveAndReportReferralInfoWithReferralCode$2(this, continuation);
            }
        }
        ReferralManager$saveAndReportReferralInfoWithReferralCode$2 referralManager$saveAndReportReferralInfoWithReferralCode$22 = referralManager$saveAndReportReferralInfoWithReferralCode$2;
        Object obj3 = referralManager$saveAndReportReferralInfoWithReferralCode$22.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i6 = referralManager$saveAndReportReferralInfoWithReferralCode$22.label;
        try {
            if (i6 == 0) {
                C56391yDq.AEQbTJ(obj3);
                pUU.AEQbTJ("saveAndReportReferralInfoWithReferralCode: Starting for code=" + str + ", chainId=" + str16 + ", address=" + str17 + ", signMsg=" + str4 + ", signature=" + str18 + ", wallet.id=" + abstractC12782ctV.DbNXlk() + ", source=" + i4 + ", isRestore=" + z);
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = this;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = str;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = str16;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = str17;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = abstractC12782ctV;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = str4;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = str18;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.I$0 = i4;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.label = 1;
                i2 = 2;
                str6 = "DexReferral";
                try {
                    Object objCopydefault2 = copydefault(abstractC12782ctV, str, str4, str5, referralManager$saveAndReportReferralInfoWithReferralCode$22);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    referralManager = this;
                    obj = objCopydefault2;
                    str7 = str4;
                    z2 = z;
                    str8 = str;
                    abstractC12782ctV2 = abstractC12782ctV;
                } catch (Exception e) {
                    e = e;
                    pUU.AEQbTJ(str6, "saveAndReportReferralInfoWithReferralCode: Exception occurred", e);
                    return C56443yFo.KWHzl(false);
                }
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        z6 = referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$1;
                        z4 = referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0;
                        i3 = referralManager$saveAndReportReferralInfoWithReferralCode$22.I$0;
                        str14 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6;
                        str9 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5;
                        abstractC12782ctV3 = (AbstractC12782ctV) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4;
                        str12 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3;
                        str15 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2;
                        str11 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1;
                        referralManager2 = (ReferralManager) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0;
                        C56391yDq.AEQbTJ(obj3);
                        str6 = "DexReferral";
                        z3 = z6;
                        str10 = str15;
                        str18 = str14;
                        obj2 = objCopydefault;
                        referralBindReportManagerV2 = referralManager2.fetchVPNInfo;
                        mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(str10, str12));
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = null;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = null;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = null;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = null;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = null;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = null;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = null;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z3;
                        referralManager$saveAndReportReferralInfoWithReferralCode$22.label = 4;
                        if (referralBindReportManagerV2.OLrzqt(str11, mapEZpvd, abstractC12782ctV3, str9, str18, i3, z4, referralManager$saveAndReportReferralInfoWithReferralCode$22) == obj2) {
                        }
                        zBooleanValue = z3;
                        return C56443yFo.KWHzl(zBooleanValue);
                    }
                    if (i6 != 3) {
                        if (i6 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0;
                        C56391yDq.AEQbTJ(obj3);
                        str6 = "DexReferral";
                        zBooleanValue = z3;
                        return C56443yFo.KWHzl(zBooleanValue);
                    }
                    z5 = referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$1;
                    z4 = referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0;
                    i3 = referralManager$saveAndReportReferralInfoWithReferralCode$22.I$0;
                    String str19 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6;
                    str9 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5;
                    abstractC12782ctV3 = (AbstractC12782ctV) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4;
                    str12 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3;
                    String str20 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2;
                    str11 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1;
                    referralManager2 = (ReferralManager) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    str6 = "DexReferral";
                    str13 = str20;
                    str18 = str19;
                    obj2 = objCopydefault;
                    str10 = str13;
                    z3 = z5;
                    referralBindReportManagerV2 = referralManager2.fetchVPNInfo;
                    mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(str10, str12));
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z3;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.label = 4;
                    if (referralBindReportManagerV2.OLrzqt(str11, mapEZpvd, abstractC12782ctV3, str9, str18, i3, z4, referralManager$saveAndReportReferralInfoWithReferralCode$22) == obj2) {
                        return obj2;
                    }
                    zBooleanValue = z3;
                    return C56443yFo.KWHzl(zBooleanValue);
                }
                z2 = referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0;
                int i7 = referralManager$saveAndReportReferralInfoWithReferralCode$22.I$0;
                String str21 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6;
                String str22 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5;
                abstractC12782ctV2 = (AbstractC12782ctV) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4;
                String str23 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3;
                String str24 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2;
                str8 = (String) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1;
                ReferralManager referralManager3 = (ReferralManager) referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0;
                C56391yDq.AEQbTJ(obj3);
                str6 = "DexReferral";
                referralManager = referralManager3;
                i2 = 2;
                obj = obj3;
                str7 = str22;
                str17 = str23;
                str18 = str21;
                str16 = str24;
                i4 = i7;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            pUU.KWHzl(str6, "saveAndReportReferralInfoWithReferralCode: result=" + zBooleanValue);
            if (zBooleanValue && referralManager.djBIcL()) {
                pUU.KWHzl(str6, "saveAndReportReferralInfoWithReferralCode: check device code");
                DeviceRefCodeCacheBean deviceRefCodeCacheBeanValues = referralManager.values();
                if (deviceRefCodeCacheBeanValues == null) {
                    pUU.KWHzl(str6, "saveAndReportReferralInfoWithReferralCode: no device code");
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = referralManager;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = str8;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = str16;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = str17;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = abstractC12782ctV2;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = str7;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = str18;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.I$0 = i4;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z2;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$1 = zBooleanValue;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.label = i2;
                    Object objSaveDeviceCodeWhenEmpty$default = saveDeviceCodeWhenEmpty$default(referralManager, str8, false, referralManager$saveAndReportReferralInfoWithReferralCode$22, 2, null);
                    if (objSaveDeviceCodeWhenEmpty$default == objCopydefault) {
                        return objCopydefault;
                    }
                    str14 = str18;
                    str15 = str16;
                    str9 = str7;
                    obj3 = objSaveDeviceCodeWhenEmpty$default;
                    z4 = z2;
                    z6 = zBooleanValue;
                    String str25 = str8;
                    referralManager2 = referralManager;
                    i3 = i4;
                    str11 = str25;
                    AbstractC12782ctV abstractC12782ctV4 = abstractC12782ctV2;
                    str12 = str17;
                    abstractC12782ctV3 = abstractC12782ctV4;
                    z3 = z6;
                    str10 = str15;
                    str18 = str14;
                    obj2 = objCopydefault;
                    referralBindReportManagerV2 = referralManager2.fetchVPNInfo;
                    mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(str10, str12));
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z3;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.label = 4;
                    if (referralBindReportManagerV2.OLrzqt(str11, mapEZpvd, abstractC12782ctV3, str9, str18, i3, z4, referralManager$saveAndReportReferralInfoWithReferralCode$22) == obj2) {
                    }
                    zBooleanValue = z3;
                    return C56443yFo.KWHzl(zBooleanValue);
                }
                boolean zKWHzl = referralManager.KWHzl(deviceRefCodeCacheBeanValues.getBean());
                pUU.KWHzl(str6, "saveAndReportReferralInfoWithReferralCode: has device code, allowed=" + zKWHzl);
                if (!zKWHzl) {
                    pUU.KWHzl(str6, "saveAndReportReferralInfoWithReferralCode: has device code, need update");
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = referralManager;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = str8;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = str16;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = str17;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = abstractC12782ctV2;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = str7;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = str18;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.I$0 = i4;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z2;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$1 = zBooleanValue;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.label = 3;
                    Object objTryUpdateDeviceCodeWhenExist$default = tryUpdateDeviceCodeWhenExist$default(referralManager, str8, deviceRefCodeCacheBeanValues, false, referralManager$saveAndReportReferralInfoWithReferralCode$22, 4, null);
                    obj2 = objCopydefault;
                    if (objTryUpdateDeviceCodeWhenExist$default == obj2) {
                        return obj2;
                    }
                    str13 = str16;
                    str9 = str7;
                    z4 = z2;
                    z5 = zBooleanValue;
                    String str26 = str8;
                    referralManager2 = referralManager;
                    i3 = i4;
                    str11 = str26;
                    AbstractC12782ctV abstractC12782ctV5 = abstractC12782ctV2;
                    str12 = str17;
                    abstractC12782ctV3 = abstractC12782ctV5;
                    str10 = str13;
                    z3 = z5;
                    referralBindReportManagerV2 = referralManager2.fetchVPNInfo;
                    mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(str10, str12));
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = null;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z3;
                    referralManager$saveAndReportReferralInfoWithReferralCode$22.label = 4;
                    if (referralBindReportManagerV2.OLrzqt(str11, mapEZpvd, abstractC12782ctV3, str9, str18, i3, z4, referralManager$saveAndReportReferralInfoWithReferralCode$22) == obj2) {
                    }
                    zBooleanValue = z3;
                    return C56443yFo.KWHzl(zBooleanValue);
                }
                obj2 = objCopydefault;
                z3 = zBooleanValue;
                z4 = z2;
                String str27 = str16;
                str9 = str7;
                str10 = str27;
                String str28 = str8;
                referralManager2 = referralManager;
                i3 = i4;
                str11 = str28;
                AbstractC12782ctV abstractC12782ctV6 = abstractC12782ctV2;
                str12 = str17;
                abstractC12782ctV3 = abstractC12782ctV6;
                referralBindReportManagerV2 = referralManager2.fetchVPNInfo;
                mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(str10, str12));
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$0 = null;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$1 = null;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$2 = null;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$3 = null;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$4 = null;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$5 = null;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.L$6 = null;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.Z$0 = z3;
                referralManager$saveAndReportReferralInfoWithReferralCode$22.label = 4;
                if (referralBindReportManagerV2.OLrzqt(str11, mapEZpvd, abstractC12782ctV3, str9, str18, i3, z4, referralManager$saveAndReportReferralInfoWithReferralCode$22) == obj2) {
                }
                zBooleanValue = z3;
                return C56443yFo.KWHzl(zBooleanValue);
            }
            pUU.KWHzl(str6, "saveAndReportReferralInfoWithReferralCode: report unenable");
            return C56443yFo.KWHzl(zBooleanValue);
        } catch (Exception e2) {
            e = e2;
            str6 = "DexReferral";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011b A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:12:0x0031, B:33:0x0113, B:35:0x011b, B:37:0x0125, B:17:0x0052, B:24:0x00a0, B:26:0x00a6, B:27:0x00cb, B:29:0x00d1, B:30:0x00f3, B:38:0x012b, B:40:0x012f, B:42:0x013a, B:43:0x013f, B:20:0x005e), top: B:48:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:12:0x0031, B:33:0x0113, B:35:0x011b, B:37:0x0125, B:17:0x0052, B:24:0x00a0, B:26:0x00a6, B:27:0x00cb, B:29:0x00d1, B:30:0x00f3, B:38:0x012b, B:40:0x012f, B:42:0x013a, B:43:0x013f, B:20:0x005e), top: B:48:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(AbstractC12782ctV abstractC12782ctV, String str, String str2, String str3, Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$saveReferralInfoWithReferralCode$1 referralManager$saveReferralInfoWithReferralCode$1;
        AbstractC12782ctV abstractC12782ctV2;
        ReferralManager referralManager;
        String str4;
        String str5;
        String str6 = str;
        if (continuation instanceof ReferralManager$saveReferralInfoWithReferralCode$1) {
            referralManager$saveReferralInfoWithReferralCode$1 = (ReferralManager$saveReferralInfoWithReferralCode$1) continuation;
            int i = referralManager$saveReferralInfoWithReferralCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$saveReferralInfoWithReferralCode$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$saveReferralInfoWithReferralCode$1 = new ReferralManager$saveReferralInfoWithReferralCode$1(this, continuation);
            }
        }
        ReferralManager$saveReferralInfoWithReferralCode$1 referralManager$saveReferralInfoWithReferralCode$12 = referralManager$saveReferralInfoWithReferralCode$1;
        Object objAEQbTJ = referralManager$saveReferralInfoWithReferralCode$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$saveReferralInfoWithReferralCode$12.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "saveReferralInfoWithReferralCode: Exception occurred", e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pUU.KWHzl("DexReferral", "saveReferralInfoWithReferralCode: Starting for accountId=" + abstractC12782ctV.DbNXlk() + ", code=" + str6);
            String strAYXKKw = AYXKKw(abstractC12782ctV);
            C13934dbu c13934dbu = this.isConnected;
            referralManager$saveReferralInfoWithReferralCode$12.L$0 = this;
            abstractC12782ctV2 = abstractC12782ctV;
            referralManager$saveReferralInfoWithReferralCode$12.L$1 = abstractC12782ctV2;
            referralManager$saveReferralInfoWithReferralCode$12.L$2 = str6;
            referralManager$saveReferralInfoWithReferralCode$12.L$3 = str2;
            referralManager$saveReferralInfoWithReferralCode$12.L$4 = str3;
            referralManager$saveReferralInfoWithReferralCode$12.label = 1;
            objAEQbTJ = c13934dbu.AEQbTJ(str6, strAYXKKw, referralManager$saveReferralInfoWithReferralCode$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            referralManager = this;
            str4 = str2;
            str5 = str3;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (!((Boolean) objAEQbTJ).booleanValue()) {
                    pUU.KWHzl("DexReferral", "saveReferralInfoWithReferralCode: saveReferralInfo success");
                    return C56443yFo.KWHzl(true);
                }
                pUU.KWHzl("DexReferral", "saveReferralInfoWithReferralCode: saveReferralInfo fail");
                return C56443yFo.KWHzl(false);
            }
            String str7 = (String) referralManager$saveReferralInfoWithReferralCode$12.L$4;
            String str8 = (String) referralManager$saveReferralInfoWithReferralCode$12.L$3;
            String str9 = (String) referralManager$saveReferralInfoWithReferralCode$12.L$2;
            AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) referralManager$saveReferralInfoWithReferralCode$12.L$1;
            ReferralManager referralManager2 = (ReferralManager) referralManager$saveReferralInfoWithReferralCode$12.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            str5 = str7;
            str4 = str8;
            str6 = str9;
            abstractC12782ctV2 = abstractC12782ctV3;
            referralManager = referralManager2;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            RefInfoResponse refInfoResponse = (RefInfoResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            List<InviterAddress> inviterAddresses = refInfoResponse.getInviterAddresses();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(inviterAddresses, 10)), 16));
            for (InviterAddress inviterAddress : inviterAddresses) {
                Pair pairOLrzqt = C56390yDp.OLrzqt(String.valueOf(inviterAddress.getChainId()), inviterAddress.getAddress());
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            String inviter = refInfoResponse.getInviter();
            String discountRate = refInfoResponse.getDiscountRate();
            referralManager$saveReferralInfoWithReferralCode$12.L$0 = null;
            referralManager$saveReferralInfoWithReferralCode$12.L$1 = null;
            referralManager$saveReferralInfoWithReferralCode$12.L$2 = null;
            referralManager$saveReferralInfoWithReferralCode$12.L$3 = null;
            referralManager$saveReferralInfoWithReferralCode$12.L$4 = null;
            referralManager$saveReferralInfoWithReferralCode$12.label = 2;
            objAEQbTJ = referralManager.copydefault(abstractC12782ctV2, str6, inviter, linkedHashMap, discountRate, str4, str5, referralManager$saveReferralInfoWithReferralCode$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) objAEQbTJ).booleanValue()) {
            }
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.KWHzl("DexReferral", "saveReferralInfoWithReferralCode: saveReferralInfo Error");
            return C56443yFo.KWHzl(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object valueOf(@NotNull String str, @NotNull Continuation<? super ReferralInfoBean> continuation) throws Throwable {
        ReferralManager$getReferralInfoFromDB$1 referralManager$getReferralInfoFromDB$1;
        String strAYXKKw;
        if (continuation instanceof ReferralManager$getReferralInfoFromDB$1) {
            referralManager$getReferralInfoFromDB$1 = (ReferralManager$getReferralInfoFromDB$1) continuation;
            int i = referralManager$getReferralInfoFromDB$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$getReferralInfoFromDB$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$getReferralInfoFromDB$1 = new ReferralManager$getReferralInfoFromDB$1(this, continuation);
            }
        }
        Object objEZpvd = referralManager$getReferralInfoFromDB$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$getReferralInfoFromDB$1.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralInfoFromDB: Exception occurred", e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("DexReferral", "getReferralInfoFromDB: Starting for accountId=" + str);
            AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
            if (abstractC12782ctVOLrzqt != null && (strAYXKKw = AYXKKw(abstractC12782ctVOLrzqt)) != null) {
                C11286cIp c11286cIp = this.gEmmrt;
                int iOrdinal = abstractC12782ctVOLrzqt.QwvEab().ordinal();
                referralManager$getReferralInfoFromDB$1.label = 1;
                objEZpvd = c11286cIp.EZpvd(String.valueOf(iOrdinal), strAYXKKw, referralManager$getReferralInfoFromDB$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objEZpvd);
        String str2 = (String) objEZpvd;
        if (str2 != null) {
            pUU.KWHzl("DexReferral", "getReferralInfoFromDB: result=" + str2);
            return ReferralInfoBean.Companion.AEQbTJ(str2);
        }
        return null;
    }

    public final ReferralInfo copydefault(@NotNull String str, @NotNull String str2) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            pUU.KWHzl("DexReferral", "getReferralInfoForDex: accountId=" + str + ", chainId=" + str2);
            String strAhwBna = AhwBna(str2);
            if (strAhwBna != null) {
                AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
                if (abstractC12782ctVOLrzqt != null) {
                    ReferralInfoBean referralInfoBeanAEQbTJ = AEQbTJ(abstractC12782ctVOLrzqt);
                    pUU.KWHzl("DexReferral", "getReferralInfoForDex: bean=" + referralInfoBeanAEQbTJ + ", mappingChainId=" + strAhwBna);
                    if (referralInfoBeanAEQbTJ != null) {
                        String str3 = referralInfoBeanAEQbTJ.getInviterAddressMap().get(strAhwBna);
                        if (str3 != null) {
                            return new ReferralInfo(referralInfoBeanAEQbTJ.getReferralCode(), str3, String.valueOf(abstractC12782ctVOLrzqt.QwvEab().ordinal()), "", false, ReferralCodeType.CODE_TYPE_BIND_FRONTEND.getType(), (Map) referralInfoBeanAEQbTJ.getInviterAddressMap(), 16, (DefaultConstructorMarker) null);
                        }
                        pUU.KWHzl("DexReferral", "getReferralInfoForDex inviterAddress not found, mappingChainId: " + strAhwBna + ", skipping");
                    } else {
                        pUU.KWHzl("DexReferral", "getReferralInfoForDex bean == null");
                        DeviceRefCodeCacheBean deviceRefCodeCacheBeanCopydefault = copydefault(abstractC12782ctVOLrzqt);
                        pUU.KWHzl("DexReferral", "getReferralInfoForDex bean == null, getReferralDeviceCodeInfo");
                        if (deviceRefCodeCacheBeanCopydefault != null) {
                            boolean zAEQbTJ = AEQbTJ(deviceRefCodeCacheBeanCopydefault.getBean());
                            pUU.KWHzl("DexReferral", "getReferralInfoForDex bean == null, deviceCodeInfo=" + deviceRefCodeCacheBeanCopydefault + ", allowed=" + zAEQbTJ);
                            if (zAEQbTJ) {
                                Iterator<T> it = deviceRefCodeCacheBeanCopydefault.getBean().getInviterAddresses().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (Intrinsics.EZpvd((Object) String.valueOf(((InviterAddress) next).getChainId()), (Object) strAhwBna)) {
                                        break;
                                    }
                                }
                                InviterAddress inviterAddress = (InviterAddress) next;
                                String address = inviterAddress != null ? inviterAddress.getAddress() : null;
                                if (address != null) {
                                    String code = deviceRefCodeCacheBeanCopydefault.getCode();
                                    int iOrdinal = abstractC12782ctVOLrzqt.QwvEab().ordinal();
                                    int type = ReferralCodeType.CODE_TYPE_BIND_DEVICE.getType();
                                    List<InviterAddress> inviterAddresses = deviceRefCodeCacheBeanCopydefault.getBean().getInviterAddresses();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(inviterAddresses, 10)), 16));
                                    for (InviterAddress inviterAddress2 : inviterAddresses) {
                                        Pair pairOLrzqt = C56390yDp.OLrzqt(String.valueOf(inviterAddress2.getChainId()), inviterAddress2.getAddress());
                                        linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                                    }
                                    return new ReferralInfo(code, address, String.valueOf(iOrdinal), "", false, type, (Map) linkedHashMap, 16, (DefaultConstructorMarker) null);
                                }
                                pUU.KWHzl("DexReferral", "getReferralInfoForDex getReferralDeviceCodeInfo, inviterAddress == null");
                            } else {
                                pUU.KWHzl("DexReferral", "getReferralInfoForDe, getReferralDeviceCodeInfo: allowed=" + zAEQbTJ);
                            }
                        } else {
                            pUU.KWHzl("DexReferral", "getReferralInfoForDex bean == null, getReferralDeviceCodeInfo == null");
                        }
                    }
                } else {
                    pUU.KWHzl("DexReferral", "getReferralInfoForDex wallet empty");
                }
            } else {
                pUU.KWHzl("DexReferral", "getReferralInfoForDex mappingChainId empty");
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralInfoForDex: Exception occurred", e);
        }
        return null;
    }

    public final ReferralInfo KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex: accountId=" + str + ", chainId=" + str2);
            String strAhwBna = AhwBna(str2);
            if (strAhwBna != null) {
                AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
                if (abstractC12782ctVOLrzqt != null && valueOf(abstractC12782ctVOLrzqt)) {
                    UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanValueOf = valueOf(abstractC12782ctVOLrzqt.DbNXlk());
                    if (unBindBackendReferralCodeCacheBeanValueOf != null) {
                        boolean zKWHzl = KWHzl(abstractC12782ctVOLrzqt, unBindBackendReferralCodeCacheBeanValueOf.getCode(), strAhwBna, unBindBackendReferralCodeCacheBeanValueOf.getBean());
                        if (zKWHzl) {
                            ReferralInfo referralInfoKWHzl = KWHzl(abstractC12782ctVOLrzqt, unBindBackendReferralCodeCacheBeanValueOf.getCode(), strAhwBna, unBindBackendReferralCodeCacheBeanValueOf.getBean(), ReferralCodeType.CODE_TYPE_BIND_BACKEND);
                            boolean zKWHzl2 = KWHzl(unBindBackendReferralCodeCacheBeanValueOf.getBean());
                            if (referralInfoKWHzl != null && zKWHzl2) {
                                pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex unbindBackendReferralInfoForDex=" + referralInfoKWHzl);
                                return referralInfoKWHzl;
                            }
                            pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex unbindBackendReferralInfoForDex null");
                        } else {
                            pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex unbindBackendEnable: " + zKWHzl);
                        }
                    } else {
                        pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex unbindBackendReferralInfo null");
                    }
                    PreferRefCodeCacheBean preferRefCodeCacheBeanIsConnected = isConnected();
                    if (preferRefCodeCacheBeanIsConnected != null) {
                        if (AEQbTJ(abstractC12782ctVOLrzqt, preferRefCodeCacheBeanIsConnected.getCode(), strAhwBna, preferRefCodeCacheBeanIsConnected.getBean())) {
                            ReferralInfo referralInfoKWHzl2 = KWHzl(abstractC12782ctVOLrzqt, preferRefCodeCacheBeanIsConnected.getCode(), strAhwBna, preferRefCodeCacheBeanIsConnected.getBean(), ReferralCodeType.CODE_TYPE_DEEPLINK);
                            if (referralInfoKWHzl2 != null) {
                                pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex deeplinkPreferReferralInfo=" + referralInfoKWHzl2);
                                return referralInfoKWHzl2;
                            }
                            pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex deeplinkPreferReferralInfo null");
                        } else {
                            pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex deeplinkCodeEnable false");
                        }
                    } else {
                        pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex preferReferralInfo null");
                    }
                } else {
                    pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex wallet null or not support bind");
                }
            } else {
                pUU.KWHzl("DexReferral", "getPreferReferralInfoForDex mappingChainId empty ");
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getPreferReferralInfoForDex: Exception occurred", e);
        }
        return null;
    }

    public final ReferralInfo KWHzl(AbstractC12782ctV abstractC12782ctV, String str, String str2, PreferRefCodeInfoResponse preferRefCodeInfoResponse, ReferralCodeType referralCodeType) {
        boolean zAEQbTJ;
        Object next;
        InviterAddress inviterAddress;
        try {
            zAEQbTJ = AEQbTJ(preferRefCodeInfoResponse);
            Iterator<T> it = preferRefCodeInfoResponse.getInviterAddresses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) String.valueOf(((InviterAddress) next).getChainId()), (Object) str2)) {
                    break;
                }
            }
            inviterAddress = (InviterAddress) next;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "assemblePreferReferralInfo: Exception occurred", e);
        }
        if (inviterAddress != null) {
            String address = inviterAddress.getAddress();
            int iOrdinal = abstractC12782ctV.QwvEab().ordinal();
            int type = referralCodeType.getType();
            List<InviterAddress> inviterAddresses = preferRefCodeInfoResponse.getInviterAddresses();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(inviterAddresses, 10)), 16));
            for (InviterAddress inviterAddress2 : inviterAddresses) {
                Pair pairOLrzqt = C56390yDp.OLrzqt(String.valueOf(inviterAddress2.getChainId()), inviterAddress2.getAddress());
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            return new ReferralInfo(str, address, String.valueOf(iOrdinal), "", zAEQbTJ, type, linkedHashMap);
        }
        pUU.KWHzl("DexReferral", "assemblePreferReferralInfo inviterAddress not found, mappingChainId: " + str2 + ", skipping");
        return null;
    }

    public final boolean AEQbTJ(PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        return preferRefCodeInfoResponse.getAllowed() && preferRefCodeInfoResponse.getInviterStatus() == 0 && preferRefCodeInfoResponse.getCodeStatus() == 0;
    }

    public final boolean KWHzl(PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        return preferRefCodeInfoResponse.getInviterStatus() == 0 && preferRefCodeInfoResponse.getCodeStatus() == 0;
    }

    public final boolean KWHzl(AbstractC12782ctV abstractC12782ctV, String str, String str2, PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        try {
            if (preferRefCodeInfoResponse != null) {
                pUU.KWHzl("DexReferral", "checkUnbindReferralCodeStatus: preferReferralInfo=" + preferRefCodeInfoResponse + ", mappingChainId=" + str2);
                if (this.values.EZpvd(str)) {
                    pUU.KWHzl("DexReferral", "checkUnbindReferralCodeStatus: Code " + str + " is rejected, skipping");
                    return false;
                }
                if (C33129mqd.valueOf(preferRefCodeInfoResponse.getDiscountRate(), preferRefCodeInfoResponse.getDiscountRateThreshold())) {
                    pUU.KWHzl("DexReferral", "checkUnbindReferralCodeStatus: discountRate " + preferRefCodeInfoResponse.getDiscountRate() + " is less than " + preferRefCodeInfoResponse.getDiscountRateThreshold() + ", skipping");
                    return false;
                }
                if (!AEQbTJ(abstractC12782ctV, preferRefCodeInfoResponse.getInviterAddresses())) {
                    return true;
                }
                pUU.KWHzl("DexReferral", "checkUnbindReferralCodeStatus: checkSelfBindUseNew true, skipping");
                return false;
            }
            pUU.KWHzl("DexReferral", "checkUnbindReferralCodeStatus: prefer code empty ");
            return false;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkUnbindReferralCodeStatus: Exception occurred", e);
            return true;
        }
    }

    public final boolean AEQbTJ(AbstractC12782ctV abstractC12782ctV, String str, String str2, PreferRefCodeInfoResponse preferRefCodeInfoResponse) {
        return KWHzl(abstractC12782ctV, str, str2, preferRefCodeInfoResponse);
    }

    public final Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ReferralManager$triggerRetryReportReferralInfo$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final boolean copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("DexReferral", "addCodeToRejectedList code=" + str);
        RxBus.KWHzl("EVENT_DEX_REFERRAL_PREFER_CODE_CHANGE");
        this.values.KWHzl(str);
        if (!this.values.AEQbTJ().contains(str)) {
            return false;
        }
        pUU.KWHzl("DexReferral", "addCodeToRejectedList success");
        return true;
    }

    public final ReferralInfoBean AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        try {
            pUU.KWHzl("DexReferral", "getReferralInfoBean: Starting for wallet type=" + abstractC12782ctV.QwvEab());
            String strValueOf = String.valueOf(abstractC12782ctV.QwvEab().ordinal());
            String strAYXKKw = AYXKKw(abstractC12782ctV);
            if (strAYXKKw == null) {
                pUU.KWHzl("DexReferral", "getReferralInfoBean: walletAddress empty");
                return null;
            }
            String strEZpvd = EZpvd(strValueOf, strAYXKKw);
            ReferralInfoBean referralInfoBean = this.AhwBna.get(strEZpvd);
            if (referralInfoBean != null) {
                copydefault(strValueOf, abstractC12782ctV, strAYXKKw, referralInfoBean);
            }
            pUU.KWHzl("DexReferral", "getReferralInfoBean: key=" + strEZpvd + ", map=" + referralInfoBean);
            if (AEQbTJ() && this.AhwBna.isEmpty()) {
                wlaJM();
            }
            return referralInfoBean;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralInfoBean: Exception occurred", e);
            return null;
        }
    }

    public final void copydefault(String str, AbstractC12782ctV abstractC12782ctV, String str2, ReferralInfoBean referralInfoBean) {
        if (referralInfoBean.getInviterAddressMap().containsValue(str2)) {
            pUU.KWHzl("DexReferral", "selfCheckAddress: start bean.inviterAddressMap=" + referralInfoBean.getInviterAddressMap());
            String strEZpvd = EZpvd(str, str2);
            if (this.AEQbTJ.containsKey(strEZpvd)) {
                pUU.KWHzl("DexReferral", "selfCheckAddress: handled");
            } else {
                this.AEQbTJ.put(strEZpvd, Boolean.TRUE);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ReferralManager$selfCheckAddress$1(this, abstractC12782ctV, referralInfoBean, null), 3, null);
            }
        }
    }

    public final ReferralInfoBean gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            pUU.EZpvd("DexReferral", "getReferralInfoBean: Starting for accountId=" + str);
            AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
            if (abstractC12782ctVOLrzqt != null) {
                return AEQbTJ(abstractC12782ctVOLrzqt);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralInfoBean: Exception occurred", e);
        }
        return null;
    }

    public static /* synthetic */ Object gotoReferralDashboard$default(ReferralManager referralManager, Context context, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return referralManager.EZpvd(context, z, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[Catch: Exception -> 0x005b, TRY_LEAVE, TryCatch #3 {Exception -> 0x005b, blocks: (B:20:0x0057, B:38:0x0096, B:40:0x009e, B:46:0x00c1, B:48:0x00c5, B:50:0x00dc), top: B:71:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: Exception -> 0x005b, TRY_ENTER, TryCatch #3 {Exception -> 0x005b, blocks: (B:20:0x0057, B:38:0x0096, B:40:0x009e, B:46:0x00c1, B:48:0x00c5, B:50:0x00dc), top: B:71:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Context context, boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ReferralManager$gotoReferralDashboard$1 referralManager$gotoReferralDashboard$1;
        Context context2;
        ReferralManager referralManager;
        Context context3;
        final ReferralManager referralManager2;
        Context context4;
        boolean z2 = z;
        if (continuation instanceof ReferralManager$gotoReferralDashboard$1) {
            referralManager$gotoReferralDashboard$1 = (ReferralManager$gotoReferralDashboard$1) continuation;
            int i = referralManager$gotoReferralDashboard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$gotoReferralDashboard$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$gotoReferralDashboard$1 = new ReferralManager$gotoReferralDashboard$1(this, continuation);
            }
        }
        Object objWithContext = referralManager$gotoReferralDashboard$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$gotoReferralDashboard$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (!z2) {
                try {
                    if (!KWHzl()) {
                        return Unit.INSTANCE;
                    }
                    try {
                        pUU.KWHzl("DexReferral", "gotoReferralDashboard: Starting");
                        EZpvd(context);
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        ReferralManager$gotoReferralDashboard$hasWallet$1 referralManager$gotoReferralDashboard$hasWallet$1 = new ReferralManager$gotoReferralDashboard$hasWallet$1(null);
                        referralManager$gotoReferralDashboard$1.L$0 = this;
                        context3 = context;
                        try {
                            referralManager$gotoReferralDashboard$1.L$1 = context3;
                            referralManager$gotoReferralDashboard$1.Z$0 = z2;
                            referralManager$gotoReferralDashboard$1.label = 1;
                            objWithContext = BuildersKt.withContext(io2, referralManager$gotoReferralDashboard$hasWallet$1, referralManager$gotoReferralDashboard$1);
                            if (objWithContext != objCopydefault) {
                                return objCopydefault;
                            }
                            referralManager2 = this;
                            context4 = context3;
                            if (!((Boolean) objWithContext).booleanValue()) {
                            }
                        } catch (Exception e) {
                            e = e;
                            referralManager = this;
                            context2 = context3;
                            pUU.AEQbTJ("DexReferral", "gotoReferralDashboard: Exception occurred", e);
                            referralManager.AEQbTJ(context2);
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        context3 = context;
                    }
                } catch (Exception e3) {
                    e = e3;
                    context2 = context;
                    referralManager = this;
                    pUU.AEQbTJ("DexReferral", "gotoReferralDashboard: Exception occurred", e);
                    referralManager.AEQbTJ(context2);
                    return Unit.INSTANCE;
                }
            } else {
                pUU.KWHzl("DexReferral", "gotoReferralDashboard: Starting");
                EZpvd(context);
                CoroutineDispatcher io22 = Dispatchers.getIO();
                ReferralManager$gotoReferralDashboard$hasWallet$1 referralManager$gotoReferralDashboard$hasWallet$12 = new ReferralManager$gotoReferralDashboard$hasWallet$1(null);
                referralManager$gotoReferralDashboard$1.L$0 = this;
                context3 = context;
                referralManager$gotoReferralDashboard$1.L$1 = context3;
                referralManager$gotoReferralDashboard$1.Z$0 = z2;
                referralManager$gotoReferralDashboard$1.label = 1;
                objWithContext = BuildersKt.withContext(io22, referralManager$gotoReferralDashboard$hasWallet$12, referralManager$gotoReferralDashboard$1);
                if (objWithContext != objCopydefault) {
                }
            }
        } else if (i2 == 1) {
            z2 = referralManager$gotoReferralDashboard$1.Z$0;
            context4 = (Context) referralManager$gotoReferralDashboard$1.L$1;
            referralManager2 = (ReferralManager) referralManager$gotoReferralDashboard$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                if (!((Boolean) objWithContext).booleanValue()) {
                    CoroutineDispatcher io3 = Dispatchers.getIO();
                    ReferralManager$gotoReferralDashboard$wallet$1 referralManager$gotoReferralDashboard$wallet$1 = new ReferralManager$gotoReferralDashboard$wallet$1(null);
                    referralManager$gotoReferralDashboard$1.L$0 = referralManager2;
                    referralManager$gotoReferralDashboard$1.L$1 = context4;
                    referralManager$gotoReferralDashboard$1.label = 2;
                    objWithContext = BuildersKt.withContext(io3, referralManager$gotoReferralDashboard$wallet$1, referralManager$gotoReferralDashboard$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    context2 = context4;
                    referralManager = referralManager2;
                    referralManager.AEQbTJ(context2, ((InterfaceC9738bbJ) objWithContext).DbNXlk());
                    context4 = context2;
                    referralManager.AEQbTJ(context4);
                } else {
                    if (context4 instanceof FragmentActivity) {
                        pUU.KWHzl("DexReferral", "gotoReferralDashboard: wallet empty");
                        referralManager2.AEQbTJ("", WalletReferralSource.DEEPLINK, "import_wallet");
                        xWO xwo = (xWO) C43251rlk.OLrzqt(xWO.class);
                        if (xwo != null) {
                            FragmentManager supportFragmentManager = ((FragmentActivity) context4).getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            xwo.copydefault(supportFragmentManager, new C54836xXc(new C54836xXc.TaskDescription(C13754dXa.Activity.RcXXUw, C55298xhM.copydefault(138.0f, context4), C55298xhM.copydefault(138.0f, context4)), C33070mpX.AYXKKw(C13754dXa.FragmentManager.dTTfOR), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ddhgMB), C33070mpX.OLrzqt(C13754dXa.FragmentManager.getPostValueLengthLimit, context4), C33070mpX.OLrzqt(C13754dXa.FragmentManager.OBJEWx, context4)), referralManager2.new Activity(context4, z2), new InterfaceC54856xXw() { // from class: o.dpY
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC54856xXw
                                public final void OLrzqt(android.os.Bundle bundle) {
                                    ReferralManager.EZpvd(this.EZpvd, bundle);
                                }
                            }, referralManager2.new TaskDescription());
                        }
                    }
                    referralManager = referralManager2;
                    referralManager.AEQbTJ(context4);
                }
            } catch (Exception e4) {
                e = e4;
                context2 = context4;
                referralManager = referralManager2;
                pUU.AEQbTJ("DexReferral", "gotoReferralDashboard: Exception occurred", e);
                referralManager.AEQbTJ(context2);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context2 = (Context) referralManager$gotoReferralDashboard$1.L$1;
            referralManager = (ReferralManager) referralManager$gotoReferralDashboard$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                referralManager.AEQbTJ(context2, ((InterfaceC9738bbJ) objWithContext).DbNXlk());
                context4 = context2;
            } catch (Exception e5) {
                e = e5;
                pUU.AEQbTJ("DexReferral", "gotoReferralDashboard: Exception occurred", e);
                referralManager.AEQbTJ(context2);
                return Unit.INSTANCE;
            }
            try {
                referralManager.AEQbTJ(context4);
            } catch (Exception e6) {
                e = e6;
                context2 = context4;
                pUU.AEQbTJ("DexReferral", "gotoReferralDashboard: Exception occurred", e);
                referralManager.AEQbTJ(context2);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC54859xXz {
        public final /* synthetic */ Context AEQbTJ;
        public final /* synthetic */ boolean KWHzl;

        public Activity(Context context, boolean z) {
            this.AEQbTJ = context;
            this.KWHzl = z;
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ReferralManager$gotoReferralDashboard$2$voidCallback$1(ReferralManager.this, this.AEQbTJ, this.KWHzl, null), 3, null);
        }
    }

    public static final void EZpvd(ReferralManager referralManager, Bundle bundle) {
        if (bundle == null) {
            referralManager.AEQbTJ("", WalletReferralSource.DEEPLINK, EopTrackEvent.EXIT);
        }
    }

    public static final class TaskDescription implements InterfaceC54852xXs {
        public TaskDescription() {
        }

        @Override // o.InterfaceC54852xXs
        public void AEQbTJ() {
            ReferralManager.this.AEQbTJ("", WalletReferralSource.DEEPLINK, "create_wallet");
        }

        @Override // o.InterfaceC54852xXs
        public void copydefault() {
            ReferralManager.this.AEQbTJ("", WalletReferralSource.DEEPLINK, "import_wallet");
        }
    }

    public final void EZpvd(Context context, String str) {
        HashMap map = new HashMap();
        map.put("to", "DexReferralBindErrorVC");
        map.put("code", str);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.OLrzqt(context, "okluadiscover", "/discover/route", map);
    }

    public final void KWHzl(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("to", "DexReferralEntryReferralNotAllowedVC");
        map.put("code", str);
        map.put("accountId", str2);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.OLrzqt(context, "okluadiscover", "/discover/route", map);
    }

    public static /* synthetic */ void showReferralInviteeEntry$default(ReferralManager referralManager, Context context, String str, String str2, WalletReferralSource walletReferralSource, Map map, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        referralManager.OLrzqt(context, str, str2, walletReferralSource, (Map<String, String>) map, z);
    }

    public final void OLrzqt(Context context, String str, String str2, WalletReferralSource walletReferralSource, Map<String, String> map, boolean z) {
        HashMap map2 = new HashMap();
        map2.put("code", str);
        map2.put("rate", str2);
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "share_from", walletReferralSource.getEvent());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            JsonElementBuildersKt.put(jsonObjectBuilder, entry.getKey(), entry.getValue());
        }
        map2.put("share", jsonObjectBuilder.build().toString());
        map2.put("to", "DexReferralInviteeEntryVC");
        map2.put("isInvalid", String.valueOf(z));
        map2.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/discover/route", map2);
    }

    public final void copydefault(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("code", str);
        map.put("data", str2);
        map.put("to", "DexReferralSubInviteeEntryVC");
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/discover/route", map);
    }

    public final void OLrzqt(Context context, boolean z, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("succeed", Boolean.valueOf(z));
        map.put("code", str);
        map.put("inviter", str2);
        map.put("discountRate", str3);
        map.put("to", "DexReferralInviteeBindResultVC");
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/discover/route", map);
    }

    public final void copydefault(Context context, String str) {
        HashMap map = new HashMap();
        map.put("to", "DexReferralInviteeEditVC");
        map.put("walletId", str);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/discover/route", map);
    }

    public final void AEQbTJ(Context context, String str) {
        HashMap map = new HashMap();
        map.put("to", "DexReferralDashboardVC");
        map.put("walletId", str);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/discover/route", map);
    }

    public final void KWHzl(@NotNull Context context, @NotNull String str, @NotNull ReferralInfo referralInfo, @NotNull Map<String, String> map, @NotNull final Function1<? super Boolean, Unit> function1) {
        Pair pairOLrzqt;
        String discountRate;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(referralInfo, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            int codeType = referralInfo.getCodeType();
            try {
                if (codeType == ReferralCodeType.CODE_TYPE_BIND_BACKEND.getType()) {
                    UnBindBackendReferralCodeCacheBean unBindBackendReferralCodeCacheBeanValueOf = valueOf(str);
                    pairOLrzqt = C56390yDp.OLrzqt(unBindBackendReferralCodeCacheBeanValueOf != null ? unBindBackendReferralCodeCacheBeanValueOf.getCode() : null, unBindBackendReferralCodeCacheBeanValueOf != null ? unBindBackendReferralCodeCacheBeanValueOf.getBean() : null);
                } else if (codeType == ReferralCodeType.CODE_TYPE_DEEPLINK.getType()) {
                    PreferRefCodeCacheBean preferRefCodeCacheBeanIsConnected = isConnected();
                    pairOLrzqt = C56390yDp.OLrzqt(preferRefCodeCacheBeanIsConnected != null ? preferRefCodeCacheBeanIsConnected.getCode() : null, preferRefCodeCacheBeanIsConnected != null ? preferRefCodeCacheBeanIsConnected.getBean() : null);
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(null, null);
                }
                String str2 = (String) pairOLrzqt.component1();
                PreferRefCodeInfoResponse preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) pairOLrzqt.component2();
                if (str2 != null && preferRefCodeInfoResponse != null && C59449zhJ.gEmmrt(referralInfo.getReferralCode(), str2, true)) {
                    discountRate = preferRefCodeInfoResponse.getDiscountRate();
                } else {
                    pUU.KWHzl("DexReferral", "showRefAppliedRemindDialog: data exception, accountId=" + str + ",referralCode=" + referralInfo.getReferralCode() + ", code=" + str2 + " ");
                    discountRate = "";
                }
                String referralCode = referralInfo.getReferralCode();
                String str3 = map.get("dex_mode");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = map.get("token_pair");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = map.get("fee_rate_before_code");
                copydefault(context, str, referralCode, str3, str4, str5 == null ? "" : str5, discountRate);
                AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_DEX_REFERRAL_PREFER_CODE_CHANGE");
                final Function1 function12 = new Function1() { // from class: o.dpX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ReferralManager.AEQbTJ(function1, (java.lang.String) obj);
                    }
                };
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.dqa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ReferralManager.fetchVPNInfo(function12, obj);
                    }
                });
                InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
                if (interfaceC7298ahGKWHzl == null || !AYXKKw()) {
                    return;
                }
                interfaceC7298ahGKWHzl.EZpvd("OKDexReferral_dismissDexReferralInfoSheetKey", new Dialog(interfaceC58217yxCAEQbTJ, interfaceC7298ahGKWHzl), "OKDexReferral_dismissDexReferralInfoSheetKey");
            } catch (Exception e) {
                e = e;
                pUU.AEQbTJ("DexReferral", "showRefAppliedRemindDialog: Exception occurred", e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, String str) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final class Dialog implements InterfaceC7835arN {
        public final /* synthetic */ InterfaceC7298ahG EZpvd;
        public final /* synthetic */ InterfaceC58217yxC copydefault;

        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public Dialog(InterfaceC58217yxC interfaceC58217yxC, InterfaceC7298ahG interfaceC7298ahG) {
            this.copydefault = interfaceC58217yxC;
            this.EZpvd = interfaceC7298ahG;
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            this.copydefault.dispose();
            this.EZpvd.AEQbTJ("OKDexReferral_dismissDexReferralInfoSheetKey", this);
            return true;
        }
    }

    public final void copydefault(Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if (context == null && (context = C54819xWm.KWHzl().AEQbTJ()) == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("walletId", str);
        map.put("code", str2);
        map.put("inviteeDiscount", str6);
        map.put("dexMode", str3);
        map.put("tokenPair", str4);
        map.put("feeRateBeforeCode", str5);
        map.put("to", "DexRefAppliedRemindVC");
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.OLrzqt(context, "okluadiscover", "/discover/route", map);
    }

    public final void KWHzl(Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if (context == null && (context = C54819xWm.KWHzl().AEQbTJ()) == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("walletId", str);
        map.put("code", str2);
        map.put("inviteeDiscount", str6);
        map.put("dexMode", str3);
        map.put("tokenPair", str4);
        map.put("feeRateBeforeCode", str5);
        map.put("to", "DexRefAppliedRemindSecondVC");
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.OLrzqt(context, "okluadiscover", "/discover/route", map);
    }

    public final void OLrzqt(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("to", "ReferralAcceptSubInviterExpiredResultVC");
        map.put("code", str);
        map.put("data", str2);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/discover/route", map);
    }

    public final void OLrzqt(Context context, String str) {
        HashMap map = new HashMap();
        map.put("to", "DexReferralAcceptSubInviterErrorVC");
        map.put("code", str);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.OLrzqt(context, "okluadiscover", "/discover/route", map);
    }

    public final void KWHzl(Context context, String str) {
        HashMap map = new HashMap();
        map.put("to", "DexReferralAcceptSubInviterNotExistVC");
        map.put("code", str);
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.OLrzqt(context, "okluadiscover", "/discover/route", map);
    }

    public final void OLrzqt(String str, WalletReferralSource walletReferralSource, String str2) {
        OLrzqt(str, walletReferralSource, str2, "invitation_page");
    }

    public final void AEQbTJ(String str, WalletReferralSource walletReferralSource, String str2) {
        OLrzqt(str, walletReferralSource, str2, "dashboard");
    }

    public final void OLrzqt(final String str, final WalletReferralSource walletReferralSource, final String str2, final String str3) {
        C32866mlf.KWHzl("DexReferral_Invitee_NoValidWalletPrompt_Click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.dqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReferralManager.EZpvd(str, walletReferralSource, str2, str3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(String str, WalletReferralSource walletReferralSource, String str2, String str3, EventParamsList eventParamsList) {
        String event;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("referral_code", str, false);
        WalletReferralSource walletReferralSource2 = WalletReferralSource.DEVICE_CACHED;
        if (walletReferralSource == walletReferralSource2) {
            event = walletReferralSource2.getEvent();
        } else {
            event = WalletReferralSource.DEEPLINK.getEvent();
        }
        eventParamsList.put("code_source", event, true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str2, true);
        eventParamsList.put("enter_from", str3, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull String str, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        ReferralManager$checkSelfBind$1 referralManager$checkSelfBind$1;
        if (continuation instanceof ReferralManager$checkSelfBind$1) {
            referralManager$checkSelfBind$1 = (ReferralManager$checkSelfBind$1) continuation;
            int i = referralManager$checkSelfBind$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkSelfBind$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkSelfBind$1 = new ReferralManager$checkSelfBind$1(this, continuation);
            }
        }
        Object objCopydefault = referralManager$checkSelfBind$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = referralManager$checkSelfBind$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            referralManager$checkSelfBind$1.label = 1;
            objCopydefault = copydefault(str, referralManager$checkSelfBind$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        return ((Pair) objCopydefault).getFirst();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:14:0x0033, B:47:0x00c4, B:49:0x00cc, B:51:0x00da, B:19:0x0048, B:37:0x0099, B:39:0x009f, B:41:0x00a9, B:43:0x00b4, B:53:0x00e9, B:55:0x00ed, B:63:0x012a, B:64:0x0133, B:65:0x013d, B:66:0x0147, B:67:0x0151, B:69:0x015a, B:70:0x015f, B:22:0x0054, B:29:0x007d, B:33:0x0087, B:32:0x0083, B:25:0x005b), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:14:0x0033, B:47:0x00c4, B:49:0x00cc, B:51:0x00da, B:19:0x0048, B:37:0x0099, B:39:0x009f, B:41:0x00a9, B:43:0x00b4, B:53:0x00e9, B:55:0x00ed, B:63:0x012a, B:64:0x0133, B:65:0x013d, B:66:0x0147, B:67:0x0151, B:69:0x015a, B:70:0x015f, B:22:0x0054, B:29:0x007d, B:33:0x0087, B:32:0x0083, B:25:0x005b), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:14:0x0033, B:47:0x00c4, B:49:0x00cc, B:51:0x00da, B:19:0x0048, B:37:0x0099, B:39:0x009f, B:41:0x00a9, B:43:0x00b4, B:53:0x00e9, B:55:0x00ed, B:63:0x012a, B:64:0x0133, B:65:0x013d, B:66:0x0147, B:67:0x0151, B:69:0x015a, B:70:0x015f, B:22:0x0054, B:29:0x007d, B:33:0x0087, B:32:0x0083, B:25:0x005b), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:14:0x0033, B:47:0x00c4, B:49:0x00cc, B:51:0x00da, B:19:0x0048, B:37:0x0099, B:39:0x009f, B:41:0x00a9, B:43:0x00b4, B:53:0x00e9, B:55:0x00ed, B:63:0x012a, B:64:0x0133, B:65:0x013d, B:66:0x0147, B:67:0x0151, B:69:0x015a, B:70:0x015f, B:22:0x0054, B:29:0x007d, B:33:0x0087, B:32:0x0083, B:25:0x005b), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, Continuation<? super Pair<Integer, RefInfoResponse>> continuation) throws Throwable {
        ReferralManager$checkSelfBindWithCode$1 referralManager$checkSelfBindWithCode$1;
        ReferralManager referralManager;
        AbstractC12782ctV abstractC12782ctV;
        AbstractC43419rot abstractC43419rot;
        RefInfoResponse refInfoResponse;
        if (continuation instanceof ReferralManager$checkSelfBindWithCode$1) {
            referralManager$checkSelfBindWithCode$1 = (ReferralManager$checkSelfBindWithCode$1) continuation;
            int i = referralManager$checkSelfBindWithCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkSelfBindWithCode$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkSelfBindWithCode$1 = new ReferralManager$checkSelfBindWithCode$1(this, continuation);
            }
        }
        Object objKWHzl = referralManager$checkSelfBindWithCode$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkSelfBindWithCode$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                pUU.EZpvd("DexReferral", "checkSelfBindWithCode: Starting for referralCode=" + str);
                referralManager$checkSelfBindWithCode$1.L$0 = this;
                referralManager$checkSelfBindWithCode$1.L$1 = str;
                referralManager$checkSelfBindWithCode$1.label = 1;
                objKWHzl = KWHzl(referralManager$checkSelfBindWithCode$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                referralManager = this;
            } else if (i2 == 1) {
                str = (String) referralManager$checkSelfBindWithCode$1.L$1;
                referralManager = (ReferralManager) referralManager$checkSelfBindWithCode$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    refInfoResponse = (RefInfoResponse) referralManager$checkSelfBindWithCode$1.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    if (!((Boolean) objKWHzl).booleanValue()) {
                        pUU.valueOf("DexReferral", "checkSelfBindWithCode: isSelfBind");
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(1), refInfoResponse);
                    }
                    pUU.KWHzl("DexReferral", "checkSelfBindWithCode: NORMAL");
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(0), refInfoResponse);
                }
                abstractC12782ctV = (AbstractC12782ctV) referralManager$checkSelfBindWithCode$1.L$1;
                referralManager = (ReferralManager) referralManager$checkSelfBindWithCode$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                abstractC43419rot = (AbstractC43419rot) objKWHzl;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    RefInfoResponse refInfoResponse2 = (RefInfoResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    if (abstractC12782ctV == null) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1000), refInfoResponse2);
                    }
                    referralManager$checkSelfBindWithCode$1.L$0 = refInfoResponse2;
                    referralManager$checkSelfBindWithCode$1.L$1 = null;
                    referralManager$checkSelfBindWithCode$1.label = 3;
                    Object objOLrzqt = referralManager.OLrzqt(refInfoResponse2, referralManager$checkSelfBindWithCode$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    objKWHzl = objOLrzqt;
                    refInfoResponse = refInfoResponse2;
                    if (!((Boolean) objKWHzl).booleanValue()) {
                    }
                } else {
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pUU.valueOf("DexReferral", "checkSelfBindWithCode: response.reason.code=" + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode());
                    int code = ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode();
                    if (code == 12004) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(3), null);
                    }
                    if (code == 12007) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(5), null);
                    }
                    if (code == 12013) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(4), null);
                    }
                    if (code == 12016) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(6), null);
                    }
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1), null);
                }
            }
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objKWHzl;
            String strAYXKKw = abstractC12782ctV2 == null ? null : referralManager.AYXKKw(abstractC12782ctV2);
            C13934dbu c13934dbu = referralManager.isConnected;
            referralManager$checkSelfBindWithCode$1.L$0 = referralManager;
            referralManager$checkSelfBindWithCode$1.L$1 = abstractC12782ctV2;
            referralManager$checkSelfBindWithCode$1.label = 2;
            Object objAEQbTJ = c13934dbu.AEQbTJ(str, strAYXKKw, referralManager$checkSelfBindWithCode$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            objKWHzl = objAEQbTJ;
            abstractC12782ctV = abstractC12782ctV2;
            abstractC43419rot = (AbstractC43419rot) objKWHzl;
            if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkSelfBindWithCode: Exception occurred", e);
            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        ReferralManager$checkSelfBind$2 referralManager$checkSelfBind$2;
        if (continuation instanceof ReferralManager$checkSelfBind$2) {
            referralManager$checkSelfBind$2 = (ReferralManager$checkSelfBind$2) continuation;
            int i = referralManager$checkSelfBind$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkSelfBind$2.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkSelfBind$2 = new ReferralManager$checkSelfBind$2(this, continuation);
            }
        }
        Object objAEQbTJ = referralManager$checkSelfBind$2.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkSelfBind$2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            referralManager$checkSelfBind$2.label = 1;
            objAEQbTJ = AEQbTJ(str, str2, referralManager$checkSelfBind$2);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((Pair) objAEQbTJ).getFirst();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:13:0x0030, B:42:0x00c3, B:44:0x00cb, B:46:0x00d9, B:18:0x0049, B:29:0x008b, B:31:0x0091, B:33:0x009d, B:36:0x00a8, B:38:0x00b1, B:48:0x00e8, B:50:0x00ec, B:58:0x0129, B:59:0x0132, B:60:0x013c, B:61:0x0146, B:62:0x0150, B:64:0x015a, B:65:0x015f, B:21:0x0050, B:25:0x0076, B:24:0x0072), top: B:69:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: Exception -> 0x0160, TryCatch #0 {Exception -> 0x0160, blocks: (B:13:0x0030, B:42:0x00c3, B:44:0x00cb, B:46:0x00d9, B:18:0x0049, B:29:0x008b, B:31:0x0091, B:33:0x009d, B:36:0x00a8, B:38:0x00b1, B:48:0x00e8, B:50:0x00ec, B:58:0x0129, B:59:0x0132, B:60:0x013c, B:61:0x0146, B:62:0x0150, B:64:0x015a, B:65:0x015f, B:21:0x0050, B:25:0x0076, B:24:0x0072), top: B:69:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, String str2, Continuation<? super Pair<Integer, RefInfoResponse>> continuation) throws Throwable {
        ReferralManager$checkSelfBindWithAccountId$1 referralManager$checkSelfBindWithAccountId$1;
        AbstractC12782ctV abstractC12782ctVOLrzqt;
        ReferralManager referralManager;
        String str3;
        RefInfoResponse refInfoResponse;
        if (continuation instanceof ReferralManager$checkSelfBindWithAccountId$1) {
            referralManager$checkSelfBindWithAccountId$1 = (ReferralManager$checkSelfBindWithAccountId$1) continuation;
            int i = referralManager$checkSelfBindWithAccountId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkSelfBindWithAccountId$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkSelfBindWithAccountId$1 = new ReferralManager$checkSelfBindWithAccountId$1(this, continuation);
            }
        }
        Object obj = referralManager$checkSelfBindWithAccountId$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkSelfBindWithAccountId$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("DexReferral", "checkSelfBindWithCode: Starting for referralCode=" + str);
                abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str2);
                String strAYXKKw = abstractC12782ctVOLrzqt == null ? null : AYXKKw(abstractC12782ctVOLrzqt);
                C13934dbu c13934dbu = this.isConnected;
                referralManager$checkSelfBindWithAccountId$1.L$0 = this;
                referralManager$checkSelfBindWithAccountId$1.L$1 = abstractC12782ctVOLrzqt;
                referralManager$checkSelfBindWithAccountId$1.L$2 = strAYXKKw;
                referralManager$checkSelfBindWithAccountId$1.label = 1;
                Object objAEQbTJ = c13934dbu.AEQbTJ(str, strAYXKKw, referralManager$checkSelfBindWithAccountId$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                referralManager = this;
                String str4 = strAYXKKw;
                obj = objAEQbTJ;
                str3 = str4;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    refInfoResponse = (RefInfoResponse) referralManager$checkSelfBindWithAccountId$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        pUU.valueOf("DexReferral", "checkSelfBindWithAccountId: isSelfBind");
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(1), refInfoResponse);
                    }
                    pUU.KWHzl("DexReferral", "checkSelfBindWithAccountId: NORMAL");
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(0), refInfoResponse);
                }
                str3 = (String) referralManager$checkSelfBindWithAccountId$1.L$2;
                abstractC12782ctVOLrzqt = (AbstractC12782ctV) referralManager$checkSelfBindWithAccountId$1.L$1;
                referralManager = (ReferralManager) referralManager$checkSelfBindWithAccountId$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                RefInfoResponse refInfoResponse2 = (RefInfoResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                if (abstractC12782ctVOLrzqt == null) {
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1000), refInfoResponse2);
                }
                if (str3 == null) {
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1000), refInfoResponse2);
                }
                referralManager$checkSelfBindWithAccountId$1.L$0 = refInfoResponse2;
                referralManager$checkSelfBindWithAccountId$1.L$1 = null;
                referralManager$checkSelfBindWithAccountId$1.L$2 = null;
                referralManager$checkSelfBindWithAccountId$1.label = 2;
                Object objAEQbTJ2 = referralManager.AEQbTJ(abstractC12782ctVOLrzqt, refInfoResponse2, referralManager$checkSelfBindWithAccountId$1);
                if (objAEQbTJ2 == objCopydefault) {
                    return objCopydefault;
                }
                obj = objAEQbTJ2;
                refInfoResponse = refInfoResponse2;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                pUU.valueOf("DexReferral", "checkSelfBindWithAccountId: response.reason.code=" + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode());
                int code = ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode();
                if (code == 12004) {
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(3), null);
                }
                if (code == 12007) {
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(5), null);
                }
                if (code == 12013) {
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(4), null);
                }
                if (code == 12016) {
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(6), null);
                }
                return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1), null);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkSelfBindWithCode: Exception occurred", e);
            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:13:0x0030, B:33:0x0089, B:35:0x008f, B:37:0x0099, B:39:0x00a9, B:41:0x00b8, B:43:0x00bc, B:51:0x00f9, B:52:0x0102, B:53:0x010c, B:54:0x0116, B:55:0x0120, B:57:0x012a, B:58:0x012f, B:18:0x0044, B:25:0x006d, B:29:0x0077, B:28:0x0073, B:21:0x004b), top: B:62:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:13:0x0030, B:33:0x0089, B:35:0x008f, B:37:0x0099, B:39:0x00a9, B:41:0x00b8, B:43:0x00bc, B:51:0x00f9, B:52:0x0102, B:53:0x010c, B:54:0x0116, B:55:0x0120, B:57:0x012a, B:58:0x012f, B:18:0x0044, B:25:0x006d, B:29:0x0077, B:28:0x0073, B:21:0x004b), top: B:62:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(String str, Continuation<? super Pair<Integer, RefInfoResponse>> continuation) throws Throwable {
        ReferralManager$checkWantBindAndWallet$1 referralManager$checkWantBindAndWallet$1;
        ReferralManager referralManager;
        AbstractC12782ctV abstractC12782ctV;
        AbstractC43419rot abstractC43419rot;
        if (continuation instanceof ReferralManager$checkWantBindAndWallet$1) {
            referralManager$checkWantBindAndWallet$1 = (ReferralManager$checkWantBindAndWallet$1) continuation;
            int i = referralManager$checkWantBindAndWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkWantBindAndWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkWantBindAndWallet$1 = new ReferralManager$checkWantBindAndWallet$1(this, continuation);
            }
        }
        Object objKWHzl = referralManager$checkWantBindAndWallet$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkWantBindAndWallet$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                pUU.EZpvd("DexReferral", "checkSelfBindWithCode: Starting for referralCode=" + str);
                referralManager$checkWantBindAndWallet$1.L$0 = this;
                referralManager$checkWantBindAndWallet$1.L$1 = str;
                referralManager$checkWantBindAndWallet$1.label = 1;
                objKWHzl = KWHzl(referralManager$checkWantBindAndWallet$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                referralManager = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC12782ctV = (AbstractC12782ctV) referralManager$checkWantBindAndWallet$1.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    abstractC43419rot = (AbstractC43419rot) objKWHzl;
                    if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                        RefInfoResponse refInfoResponse = (RefInfoResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                        if (abstractC12782ctV == null) {
                            pUU.KWHzl("DexReferral", "checkWantBindAndWallet: EMPTY_WALLET");
                            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1000), refInfoResponse);
                        }
                        pUU.KWHzl("DexReferral", "checkWantBindAndWallet: NORMAL");
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(0), refInfoResponse);
                    }
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pUU.valueOf("DexReferral", "checkWantBindAndWallet: response.reason.code=" + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode());
                    int code = ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode();
                    if (code == 12004) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(3), null);
                    }
                    if (code == 12007) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(5), null);
                    }
                    if (code == 12013) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(4), null);
                    }
                    if (code == 12016) {
                        return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(6), null);
                    }
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1), null);
                }
                str = (String) referralManager$checkWantBindAndWallet$1.L$1;
                referralManager = (ReferralManager) referralManager$checkWantBindAndWallet$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objKWHzl;
            String strAYXKKw = abstractC12782ctV2 == null ? null : referralManager.AYXKKw(abstractC12782ctV2);
            C13934dbu c13934dbu = referralManager.isConnected;
            referralManager$checkWantBindAndWallet$1.L$0 = abstractC12782ctV2;
            referralManager$checkWantBindAndWallet$1.L$1 = null;
            referralManager$checkWantBindAndWallet$1.label = 2;
            Object objAEQbTJ = c13934dbu.AEQbTJ(str, strAYXKKw, referralManager$checkWantBindAndWallet$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            objKWHzl = objAEQbTJ;
            abstractC12782ctV = abstractC12782ctV2;
            abstractC43419rot = (AbstractC43419rot) objKWHzl;
            if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "checkSelfBindWithCode: Exception occurred", e);
            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(-1), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AhwBna(String str, Continuation<? super Pair<Integer, PreferRefCodeInfoResponse>> continuation) throws Throwable {
        ReferralManager$requestAndCheckRefCode$1 referralManager$requestAndCheckRefCode$1;
        if (continuation instanceof ReferralManager$requestAndCheckRefCode$1) {
            referralManager$requestAndCheckRefCode$1 = (ReferralManager$requestAndCheckRefCode$1) continuation;
            int i = referralManager$requestAndCheckRefCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$requestAndCheckRefCode$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$requestAndCheckRefCode$1 = new ReferralManager$requestAndCheckRefCode$1(this, continuation);
            }
        }
        ReferralManager$requestAndCheckRefCode$1 referralManager$requestAndCheckRefCode$12 = referralManager$requestAndCheckRefCode$1;
        Object objDexReferralCode$default = referralManager$requestAndCheckRefCode$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$requestAndCheckRefCode$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objDexReferralCode$default);
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                pUU.EZpvd("DexReferral", "requestAndCheckRefCode: Starting for referralCode=" + upperCase);
                C13934dbu c13934dbu = this.isConnected;
                referralManager$requestAndCheckRefCode$12.label = 1;
                objDexReferralCode$default = C13934dbu.dexReferralCode$default(c13934dbu, upperCase, false, referralManager$requestAndCheckRefCode$12, 2, null);
                if (objDexReferralCode$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objDexReferralCode$default);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objDexReferralCode$default;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                PreferRefCodeInfoResponse preferRefCodeInfoResponse = (PreferRefCodeInfoResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                pUU.KWHzl("DexReferral", "requestAndCheckRefCode: referralInfo=" + preferRefCodeInfoResponse);
                if (preferRefCodeInfoResponse.getInviterStatus() == 0 && preferRefCodeInfoResponse.getCodeStatus() == 0) {
                    return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(0), ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                }
                return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(1), ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
            }
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.valueOf("DexReferral", "requestAndCheckRefCode: Error");
            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(2), null);
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "requestAndCheckRefCode: Exception occurred", e);
            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(2), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gEmmrt(String str, Continuation<? super Pair<Integer, ReferralSubInviterInvitationResponse>> continuation) throws Throwable {
        ReferralManager$requestSubInviterInvitationDetail$1 referralManager$requestSubInviterInvitationDetail$1;
        if (continuation instanceof ReferralManager$requestSubInviterInvitationDetail$1) {
            referralManager$requestSubInviterInvitationDetail$1 = (ReferralManager$requestSubInviterInvitationDetail$1) continuation;
            int i = referralManager$requestSubInviterInvitationDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$requestSubInviterInvitationDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$requestSubInviterInvitationDetail$1 = new ReferralManager$requestSubInviterInvitationDetail$1(this, continuation);
            }
        }
        Object objAkhnZx = referralManager$requestSubInviterInvitationDetail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$requestSubInviterInvitationDetail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAkhnZx);
                pUU.EZpvd("DexReferral", "requestSubInviterInvitationDetail: Starting for referralCode=" + str);
                C13934dbu c13934dbu = this.isConnected;
                referralManager$requestSubInviterInvitationDetail$1.label = 1;
                objAkhnZx = c13934dbu.AkhnZx(str, referralManager$requestSubInviterInvitationDetail$1);
                if (objAkhnZx == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAkhnZx);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAkhnZx;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                pUU.KWHzl("DexReferral", "requestSubInviterInvitationDetail: referralInfo=" + ((ReferralSubInviterInvitationResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()));
                return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(0), ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
            }
            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.valueOf("DexReferral", "requestSubInviterInvitationDetail: Error");
            if (((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode() == 0) {
                return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(0), null);
            }
            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(2), null);
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "requestSubInviterInvitationDetail: Exception occurred", e);
            return C56390yDp.OLrzqt(C56443yFo.AEQbTJ(2), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super AbstractC12782ctV> continuation) throws Throwable {
        ReferralManager$getSupportedWallet$1 referralManager$getSupportedWallet$1;
        if (continuation instanceof ReferralManager$getSupportedWallet$1) {
            referralManager$getSupportedWallet$1 = (ReferralManager$getSupportedWallet$1) continuation;
            int i = referralManager$getSupportedWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$getSupportedWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$getSupportedWallet$1 = new ReferralManager$getSupportedWallet$1(this, continuation);
            }
        }
        Object objAwaitSingleOrNull = referralManager$getSupportedWallet$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$getSupportedWallet$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitSingleOrNull);
                AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
                final Function1 function1 = new Function1() { // from class: o.dqk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ReferralManager.KWHzl(this.KWHzl, (java.util.List) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.dpS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ReferralManager.djBIcL(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.dpR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(ReferralManager.copydefault((java.util.List) obj));
                    }
                };
                AbstractC58245yxe abstractC58245yxeOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58239yxY() { // from class: o.dpT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58239yxY
                    public final boolean test(java.lang.Object obj) {
                        return ReferralManager.AYXKKw(function12, obj);
                    }
                });
                final Function1 function13 = new Function1() { // from class: o.dpZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ReferralManager.EZpvd((java.util.List) obj);
                    }
                };
                AbstractC58245yxe abstractC58245yxeEZpvd = abstractC58245yxeOLrzqt.EZpvd(new InterfaceC58229yxO() { // from class: o.dpW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ReferralManager.AhwBna(function13, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58245yxeEZpvd, "");
                referralManager$getSupportedWallet$1.label = 1;
                objAwaitSingleOrNull = RxAwaitKt.awaitSingleOrNull(abstractC58245yxeEZpvd, referralManager$getSupportedWallet$1);
                if (objAwaitSingleOrNull == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwaitSingleOrNull);
            }
            return (AbstractC12782ctV) objAwaitSingleOrNull;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getSupportedWallet: Failed to get supported wallet", e);
            return null;
        }
    }

    public static final List djBIcL(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final boolean AYXKKw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean copydefault(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return !list.isEmpty();
    }

    public static final AbstractC12782ctV AhwBna(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public static final AbstractC12782ctV EZpvd(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
    }

    public final boolean valueOf() {
        return Intrinsics.EZpvd((Object) AEQbTJ("showEntrance", "true"), (Object) "true") && KWHzl();
    }

    public final boolean gEmmrt() {
        return Intrinsics.EZpvd((Object) AEQbTJ("isSupportBind", "true"), (Object) "true") && KWHzl();
    }

    public final String DbNXlk() {
        return AEQbTJ("referralShareShortLink", C33070mpX.AYXKKw(C13754dXa.FragmentManager.QkdxfA));
    }

    public final boolean AhwBna() {
        String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_dexreferral_selfbindcheck_enabled", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        return TextUtils.equals(strAEQbTJ, DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final String AEQbTJ(String str, String str2) {
        return C48787ucK.AEQbTJ.copydefault("dexReferralV2Config." + str, str2);
    }

    public final boolean valueOf(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return OLrzqt(abstractC12782ctV) != null;
    }

    public final boolean fetchVPNInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return djBIcL(str) != null;
    }

    public final boolean AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(str));
        return c10854bwMOLrzqt != null && (c10854bwMOLrzqt.ejfBZ() || c10854bwMOLrzqt.fdOvFl());
    }

    public final String djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
        if (abstractC12782ctVOLrzqt != null) {
            return OLrzqt(abstractC12782ctVOLrzqt);
        }
        return null;
    }

    public final boolean isConnected(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
        if (abstractC12782ctVOLrzqt != null) {
            return abstractC12782ctVOLrzqt.AubY() && abstractC12782ctVOLrzqt.djSkpj() && abstractC12782ctVOLrzqt.zLjUOn();
        }
        return false;
    }

    public final List<String> uzCIH() {
        return C56402yEa.EZpvd("1");
    }

    public final List<String> getFieldNames() {
        return C56402yEa.EZpvd(String.valueOf(WalletType.HDWallet.ordinal()));
    }

    public final List<String> getNewProxyInstance() {
        return yDY.gEmmrt("1", "501");
    }

    public final List<String> hDKMBd() {
        return yDY.gEmmrt(String.valueOf(WalletType.HDWallet.ordinal()), String.valueOf(WalletType.KeyWallet.ordinal()));
    }

    public final String OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        try {
            pUU.EZpvd("DexReferral", "getSupportBindReferralDefaultChainId: Starting for wallet type=" + abstractC12782ctV.QwvEab());
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd();
            if (abstractC12782ctV.AubY()) {
                return "1";
            }
            if (!abstractC12782ctV.AwvSrB()) {
                return null;
            }
            if (abstractC12782ctV.AuCTelauCTel()) {
                return "1";
            }
            if (interfaceC9731bbCEZpvd == null) {
                return null;
            }
            if (abstractC12782ctV.flVtFt() == interfaceC9731bbCEZpvd.AEQbTJ()) {
                return "501";
            }
            return null;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getSupportBindReferralDefaultChainId: Exception occurred", e);
            return null;
        }
    }

    public final String AhwBna(String str) {
        C10854bwM c10854bwMOLrzqt;
        try {
            pUU.EZpvd("DexReferral", "getReferralMappingChainId: Starting for chainId=" + str);
            if (AYXKKw(str) && (c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(str))) != null) {
                if (c10854bwMOLrzqt.ejfBZ()) {
                    return "1";
                }
                if (c10854bwMOLrzqt.fdOvFl()) {
                    return "501";
                }
                return null;
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralMappingChainId: Exception occurred", e);
        }
        return null;
    }

    public final String AYXKKw(AbstractC12782ctV abstractC12782ctV) {
        Pair<String, String> pairEZpvd = EZpvd(abstractC12782ctV);
        if (pairEZpvd != null) {
            return pairEZpvd.getSecond();
        }
        return null;
    }

    public final Pair<String, String> EZpvd(AbstractC12782ctV abstractC12782ctV) {
        try {
            pUU.EZpvd("DexReferral", "getChainIdAndAddressMapSupportBindReferral: Starting for wallet type=" + abstractC12782ctV.QwvEab());
            String strOLrzqt = OLrzqt(abstractC12782ctV);
            String strEZpvd = strOLrzqt != null ? abstractC12782ctV.EZpvd(C33129mqd.valueOf(strOLrzqt)) : null;
            if (strEZpvd != null && strOLrzqt != null) {
                return C56390yDp.OLrzqt(strOLrzqt, strEZpvd);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getChainIdAndAddressMapSupportBindReferral: Exception occurred", e);
        }
        return null;
    }

    public final Map<String, String> KWHzl(AbstractC12782ctV abstractC12782ctV) {
        try {
            pUU.EZpvd("DexReferral", "getWalletAddressesSupportBindReferral: Starting for wallet type=" + abstractC12782ctV.QwvEab());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Pair pair : yDY.gEmmrt(C56390yDp.OLrzqt(1L, abstractC12782ctV.EZpvd(1L)), C56390yDp.OLrzqt(501L, abstractC12782ctV.EZpvd(501L)))) {
                long jLongValue = ((Number) pair.component1()).longValue();
                String str = (String) pair.component2();
                if (str.length() > 0) {
                    linkedHashMap.put(String.valueOf(jLongValue), str);
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "getWalletAddressesSupportBindReferral: Exception occurred", e);
            return C56424yEw.KWHzl();
        }
    }

    public final Object AEQbTJ(AbstractC12782ctV abstractC12782ctV, RefInfoResponse refInfoResponse, Continuation<? super Boolean> continuation) {
        boolean z;
        if (AhwBna()) {
            String strAYXKKw = AYXKKw(abstractC12782ctV);
            List<InviterAddress> inviterAddresses = refInfoResponse.getInviterAddresses();
            if ((inviterAddresses instanceof Collection) && inviterAddresses.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = inviterAddresses.iterator();
                while (it.hasNext()) {
                    z = true;
                    if (C59449zhJ.gEmmrt(((InviterAddress) it.next()).getAddress(), strAYXKKw, true)) {
                        break;
                    }
                }
                z = false;
            }
            return C56443yFo.KWHzl(z);
        }
        return OLrzqt(refInfoResponse, continuation);
    }

    public final boolean AEQbTJ(AbstractC12782ctV abstractC12782ctV, List<InviterAddress> list) {
        String strAYXKKw = AYXKKw(abstractC12782ctV);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.gEmmrt(((InviterAddress) it.next()).getAddress(), strAYXKKw, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean KWHzl(AbstractC12782ctV abstractC12782ctV, Map<String, String> map) {
        String strAYXKKw = AYXKKw(abstractC12782ctV);
        Collection<String> collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (C59449zhJ.gEmmrt((String) it.next(), strAYXKKw, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(RefInfoResponse refInfoResponse, Continuation<? super Boolean> continuation) throws Throwable {
        ReferralManager$checkSelfBindOld$1 referralManager$checkSelfBindOld$1;
        Object objM7377constructorimpl;
        if (continuation instanceof ReferralManager$checkSelfBindOld$1) {
            referralManager$checkSelfBindOld$1 = (ReferralManager$checkSelfBindOld$1) continuation;
            int i = referralManager$checkSelfBindOld$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralManager$checkSelfBindOld$1.label = i - Integer.MIN_VALUE;
            } else {
                referralManager$checkSelfBindOld$1 = new ReferralManager$checkSelfBindOld$1(this, continuation);
            }
        }
        Object objAwait = referralManager$checkSelfBindOld$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = referralManager$checkSelfBindOld$1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
                referralManager$checkSelfBindOld$1.L$0 = refInfoResponse;
                referralManager$checkSelfBindOld$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtFetchAllWallets$default, referralManager$checkSelfBindOld$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                refInfoResponse = (RefInfoResponse) referralManager$checkSelfBindOld$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            Intrinsics.checkNotNullExpressionValue(objAwait, "");
            Iterable iterable = (Iterable) objAwait;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ArrayList<ChainAddress> arrayListFvQaOB = ((AbstractC12782ctV) it.next()).EZpvd();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayListFvQaOB, 10));
                Iterator<T> it2 = arrayListFvQaOB.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ChainAddress) it2.next()).getAddress());
                }
                arrayList.add(arrayList2);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("DexReferral", "Error getting addresses for wallet: " + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = yDY.AhwBna();
        }
        List list = (List) objM7377constructorimpl;
        if ((!list.isEmpty()) && (!refInfoResponse.getInviterAddresses().isEmpty())) {
            List<String> listQOLQEE = C56403yEb.QOLQEE(list);
            if (!(listQOLQEE instanceof Collection) || !listQOLQEE.isEmpty()) {
                loop2: for (String str : listQOLQEE) {
                    List<InviterAddress> inviterAddresses = refInfoResponse.getInviterAddresses();
                    if (!(inviterAddresses instanceof Collection) || !inviterAddresses.isEmpty()) {
                        Iterator<T> it3 = inviterAddresses.iterator();
                        while (it3.hasNext()) {
                            if (C59449zhJ.gEmmrt(str, ((InviterAddress) it3.next()).getAddress(), true)) {
                                break loop2;
                            }
                        }
                    }
                }
                z = false;
            }
        } else {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }

    public final String values(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DexReferralLinkParseConfig dexReferralLinkParseConfigKWHzl = KWHzl("parseRegex");
        if (dexReferralLinkParseConfigKWHzl.getParseRegex().isEmpty()) {
            pUU.valueOf("DexReferral", "Config is null or empty");
            return null;
        }
        try {
            for (String str2 : dexReferralLinkParseConfigKWHzl.getParseRegex()) {
                try {
                    byte[] bArrDecode = Base64.decode(str2, 0);
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                    String str3 = new String(bArrDecode, Charsets.UTF_8);
                    pUU.EZpvd("DexReferral", "Trying regex pattern: " + str3);
                    MatchResult matchResultFind$default = Regex.find$default(new Regex(str3), str, 0, 2, null);
                    if (matchResultFind$default != null && matchResultFind$default.OLrzqt().size() > 1) {
                        String str4 = matchResultFind$default.OLrzqt().get(1);
                        pUU.EZpvd("DexReferral", "Match found! Pattern: " + str3 + ", Result: " + str4);
                        return str4;
                    }
                } catch (Exception e) {
                    pUU.OLrzqt("DexReferral", "Failed to parse regex: " + str2, e);
                }
            }
            pUU.EZpvd("DexReferral", "No match found for any regex pattern. URL: " + str);
        } catch (Exception e2) {
            pUU.AEQbTJ("DexReferral", "Regex matching failed for URL: " + str, e2);
        }
        AEQbTJ(str, dexReferralLinkParseConfigKWHzl.getParseRegex().toString(), "join");
        return null;
    }

    public final String fetchVPNInfo() {
        String string = SPUtils.getString("DEX_REFERRAL_CODE_CACHE", "", "MLS_PREFERENCE");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void DbNXlk(String str) {
        SPUtils.put("DEX_REFERRAL_CODE_CACHE", str, "MLS_PREFERENCE");
    }

    public final void AEQbTJ(@NotNull List<ListChainResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            Json.Default r0 = Json.Default;
            r0.getSerializersModule();
            SPUtils.put("dex_referral_chain_list_cache", r0.encodeToString(new ArrayListSerializer(ListChainResponse.Companion.serializer()), list), "REFERRAL_MANAGER_SP_CACHE_FILENAME");
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "Failed to save chain list to cache", e);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[Catch: Exception -> 0x0084, TryCatch #1 {Exception -> 0x0084, blocks: (B:3:0x0004, B:9:0x0032, B:11:0x0050, B:16:0x0060, B:21:0x0080, B:22:0x0083, B:12:0x0053, B:8:0x002d, B:5:0x0015, B:14:0x005b, B:19:0x007e), top: B:28:0x0004, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[Catch: Exception -> 0x0084, TRY_LEAVE, TryCatch #1 {Exception -> 0x0084, blocks: (B:3:0x0004, B:9:0x0032, B:11:0x0050, B:16:0x0060, B:21:0x0080, B:22:0x0083, B:12:0x0053, B:8:0x002d, B:5:0x0015, B:14:0x005b, B:19:0x007e), top: B:28:0x0004, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ListChainResponse> AkhnZx() {
        BufferedReader bufferedReader;
        try {
            String string = SPUtils.getString("dex_referral_chain_list_cache", "", "REFERRAL_MANAGER_SP_CACHE_FILENAME");
            Intrinsics.copydefault((Object) string);
            if (string.length() > 0) {
                try {
                    Json.Default r3 = Json.Default;
                    r3.getSerializersModule();
                    return (List) r3.decodeFromString(new ArrayListSerializer(ListChainResponse.Companion.serializer()), string);
                } catch (Exception e) {
                    pUU.OLrzqt("DexReferral", "Failed to parse cached chain list, fallback to raw resource", e);
                    InputStream inputStreamOpenRawResource = C9678baC.Companion.AEQbTJ().getResources().openRawResource(C13754dXa.Fragment.EZpvd);
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
                    Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8);
                    if (!(inputStreamReader instanceof BufferedReader)) {
                    }
                    String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                    yFA.copydefault(bufferedReader, null);
                    inputStreamOpenRawResource.close();
                    Json.Default r2 = Json.Default;
                    r2.getSerializersModule();
                    return (List) r2.decodeFromString(new ArrayListSerializer(ListChainResponse.Companion.serializer()), strAEQbTJ);
                }
            }
            InputStream inputStreamOpenRawResource2 = C9678baC.Companion.AEQbTJ().getResources().openRawResource(C13754dXa.Fragment.EZpvd);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource2, "");
            Reader inputStreamReader2 = new InputStreamReader(inputStreamOpenRawResource2, Charsets.UTF_8);
            bufferedReader = !(inputStreamReader2 instanceof BufferedReader) ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
            try {
                String strAEQbTJ2 = yFK.AEQbTJ(bufferedReader);
                yFA.copydefault(bufferedReader, null);
                inputStreamOpenRawResource2.close();
                Json.Default r22 = Json.Default;
                r22.getSerializersModule();
                return (List) r22.decodeFromString(new ArrayListSerializer(ListChainResponse.Companion.serializer()), strAEQbTJ2);
            } finally {
            }
        } catch (Exception e2) {
            pUU.AEQbTJ("DexReferral", "Failed to read chain list from raw resource", e2);
            return yDY.AhwBna();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlin.text.Regex.find$default(kotlin.text.Regex, java.lang.CharSequence, int, int, java.lang.Object):kotlin.text.MatchResult */
    public final String KWHzl(String str, String str2, String str3) {
        try {
            MatchResult matchResultFind$default = Regex.find$default(new Regex(str2), str, 0, 2, null);
            if (matchResultFind$default != null && matchResultFind$default.OLrzqt().size() > 1) {
                return matchResultFind$default.OLrzqt().get(1);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DexReferral", "Failed to parse chain from URL: " + str, e);
        }
        AEQbTJ(str, str2, str3);
        return null;
    }

    public final String AhwBna(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str, "/token/([^/]+)/", str2);
    }

    public final String valueOf(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str, "/token/[^/]+/([^/?]+)", str2);
    }

    public final String gEmmrt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(str, "/affiliates/([^/?]+)", str2);
    }

    public final DexReferralLinkParseConfig KWHzl(String str) {
        DexReferralLinkParseConfig dexReferralLinkParseConfig = (DexReferralLinkParseConfig) C48787ucK.AEQbTJ.EZpvd("dexReferralLinkParseConfig." + str, DexReferralLinkParseConfig.class);
        return dexReferralLinkParseConfig == null ? new DexReferralLinkParseConfig(C56402yEa.EZpvd("L2pvaW4vKD86W14vXSsvKSooW14vPyNdKykoPzpcXD98JCk=")) : dexReferralLinkParseConfig;
    }

    public final void AEQbTJ(String str, String str2, String str3) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ReferralManager$reportCodeError$1(str, str2, str3, null), 3, null);
    }

    public final boolean AYXKKw() {
        String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_dexreferral_remove_mln_listener_enabled", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        return TextUtils.equals(strAEQbTJ, DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean OLrzqt() {
        String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_dexreferral_check_initialization_enabled", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        return TextUtils.equals(strAEQbTJ, DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final boolean AEQbTJ() {
        String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_dexreferral_double_check_initialization_enabled", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        return TextUtils.equals(strAEQbTJ, DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public static final class DexReferralLinkParseConfig {
        public static final int $stable = 8;
        private final List<String> parseRegex;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.common.utils.ReferralManager$DexReferralLinkParseConfig */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DexReferralLinkParseConfig copy$default(DexReferralLinkParseConfig dexReferralLinkParseConfig, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dexReferralLinkParseConfig.parseRegex;
            }
            return dexReferralLinkParseConfig.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component1() {
            return this.parseRegex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexReferralLinkParseConfig copy(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new DexReferralLinkParseConfig(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DexReferralLinkParseConfig) && Intrinsics.EZpvd(this.parseRegex, ((DexReferralLinkParseConfig) obj).parseRegex);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getParseRegex() {
            return this.parseRegex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.parseRegex.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DexReferralLinkParseConfig(parseRegex=" + this.parseRegex + ")";
        }

        public DexReferralLinkParseConfig(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.parseRegex = list;
        }
    }

    public final String AEQbTJ(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        try {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder, WalletSearchRequest.SEARCH_SOURCE_ADDRESS, value);
                JsonElementBuildersKt.put(jsonObjectBuilder, "chainId", key);
                arrayList.add(jsonObjectBuilder.build());
            }
            Json.Default r7 = Json.Default;
            r7.getSerializersModule();
            return OLrzqt(str, r7.encodeToString(new ArrayListSerializer(JsonObject.Companion.serializer()), arrayList));
        } catch (Exception e) {
            pUU.OLrzqt("DexReferral", "generateSignMsg Failed", e);
            return null;
        }
    }

    public static final List KWHzl(ReferralManager referralManager, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (referralManager.valueOf((AbstractC12782ctV) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
