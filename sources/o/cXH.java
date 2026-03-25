package o;

import com.okinc.business.defi.biz.database.extra.bean.ReferralInfoBean;
import com.okinc.business.defi.biz.impl.OKWeb3AnalyticsServiceImpl$onEventWithUTM$1;
import com.okinc.business.defi.biz.impl.OKWeb3AnalyticsServiceImpl$waitForInitialization$1;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.business.defi.utm.Web3UtmParamManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.reactive.AwaitKt;
import o.C12827cuN;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cXH extends AbstractC43215rlA implements InterfaceC9847bdM {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cXH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC9847bdM
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        if (trackChannelArr.length == 0) {
            onEventWithUTM$default(this, str, null, function1, z, 1, null);
        } else {
            OLrzqt(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length), function1, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cXH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onEventWithUTM$default(cXH cxh, java.lang.String str, TrackChannel[] trackChannelArr, Function1 function1, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        cxh.OLrzqt(str, trackChannelArr, function1, z);
    }

    public final void OLrzqt(java.lang.String str, TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new OKWeb3AnalyticsServiceImpl$onEventWithUTM$1(this, str, trackChannelArr, function1, z, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKWeb3AnalyticsServiceImpl$waitForInitialization$1 oKWeb3AnalyticsServiceImpl$waitForInitialization$1;
        if (continuation instanceof OKWeb3AnalyticsServiceImpl$waitForInitialization$1) {
            oKWeb3AnalyticsServiceImpl$waitForInitialization$1 = (OKWeb3AnalyticsServiceImpl$waitForInitialization$1) continuation;
            int i = oKWeb3AnalyticsServiceImpl$waitForInitialization$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKWeb3AnalyticsServiceImpl$waitForInitialization$1.label = i - Integer.MIN_VALUE;
            } else {
                oKWeb3AnalyticsServiceImpl$waitForInitialization$1 = new OKWeb3AnalyticsServiceImpl$waitForInitialization$1(this, continuation);
            }
        }
        java.lang.Object obj = oKWeb3AnalyticsServiceImpl$waitForInitialization$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKWeb3AnalyticsServiceImpl$waitForInitialization$1.label;
        try {
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKWeb3AnalyticsServiceImpl", "Async initialization failed", e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            oKWeb3AnalyticsServiceImpl$waitForInitialization$1.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, oKWeb3AnalyticsServiceImpl$waitForInitialization$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("OKWeb3AnalyticsServiceImpl", "All initializations completed");
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.EZpvd("OKWeb3AnalyticsServiceImpl", "Wallet initialization completed");
        ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
        if (!instance$default.fJNWhG()) {
            oKWeb3AnalyticsServiceImpl$waitForInitialization$1.label = 2;
            if (instance$default.valueOf(oKWeb3AnalyticsServiceImpl$waitForInitialization$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        pUU.EZpvd("OKWeb3AnalyticsServiceImpl", "All initializations completed");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(EventParamsList eventParamsList) {
        java.util.Map<java.lang.String, java.lang.String> uTMMap;
        try {
            Web3UtmParamManager.UTMParamCachedBean uTMParamCachedBeanOLrzqt = Web3UtmParamManager.TaskDescription.getInstance$default(Web3UtmParamManager.Companion, null, 1, null).OLrzqt();
            if (uTMParamCachedBeanOLrzqt == null || (uTMMap = uTMParamCachedBeanOLrzqt.toUTMMap()) == null) {
                return;
            }
            for (Map.Entry<java.lang.String, java.lang.String> entry : uTMMap.entrySet()) {
                eventParamsList.put(entry.getKey(), entry.getValue(), false);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final void KWHzl(EventParamsList eventParamsList) {
        ReferralInfoBean referralInfoBeanGEmmrt;
        try {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
            if (abstractC12782ctV == null || (referralInfoBeanGEmmrt = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).gEmmrt(abstractC12782ctV.DbNXlk())) == null) {
                return;
            }
            eventParamsList.put("web3_c_ref", referralInfoBeanGEmmrt.getReferralCode(), false);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
