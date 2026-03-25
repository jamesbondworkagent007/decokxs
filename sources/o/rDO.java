package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.ok_kyc_core.impl.RiskStatusCacheInfo;
import com.okinc.okuser.data.User;
import dagger.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rDO implements rDN {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final Function2<java.lang.String, EventParamsList, Unit> AEQbTJ;
    public final Lazy<InterfaceC47278tmy> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public rDO(@NotNull Lazy<InterfaceC47278tmy> lazy, @NotNull Function2<? super java.lang.String, ? super EventParamsList, Unit> function2) {
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = lazy;
        this.AEQbTJ = function2;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rDO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.rDN
    public void EZpvd(java.lang.Boolean bool, java.lang.String str, int i) {
        if (OLrzqt(bool, str)) {
            AEQbTJ(i);
        }
    }

    @Override // o.rDN
    public RiskStatusCacheInfo copydefault(java.lang.Boolean bool, java.lang.String str, boolean z) {
        User userOLrzqt;
        java.lang.String uid;
        if (C42459rTq.KWHzl.AuCTel() && this.EZpvd.get().values() && z && ((bool == null || Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) && ((str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && (userOLrzqt = this.EZpvd.get().OLrzqt()) != null && (uid = userOLrzqt.getUid()) != null))) {
            RiskStatusCacheInfo riskStatusCacheInfo = (RiskStatusCacheInfo) SPUtils.getObject(OLrzqt(uid), RiskStatusCacheInfo.class);
            if (riskStatusCacheInfo != null && java.lang.System.currentTimeMillis() - riskStatusCacheInfo.getTimestamp() <= 604800000) {
                return riskStatusCacheInfo;
            }
            EZpvd();
        }
        return null;
    }

    public final boolean OLrzqt(java.lang.Boolean bool, java.lang.String str) {
        return C42459rTq.KWHzl.AuCTel() && this.EZpvd.get().values() && (bool == null || Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) && (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str));
    }

    public final void AEQbTJ(int i) {
        User userOLrzqt = this.EZpvd.get().OLrzqt();
        java.lang.String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
        if (uid == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) uid)) {
            pUU.copydefault("RiskStatusCache", "User ID Not Found");
            return;
        }
        java.lang.String strOLrzqt = OLrzqt(uid);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        RiskStatusCacheInfo riskStatusCacheInfo = (RiskStatusCacheInfo) SPUtils.getObject(strOLrzqt, RiskStatusCacheInfo.class);
        if (riskStatusCacheInfo != null && riskStatusCacheInfo.getAction() != i) {
            OLrzqt(jCurrentTimeMillis - riskStatusCacheInfo.getTimestamp(), i, riskStatusCacheInfo.getAction());
        }
        SPUtils.put(strOLrzqt, new RiskStatusCacheInfo(i, jCurrentTimeMillis));
    }

    public final void EZpvd() {
        java.lang.String uid;
        User userOLrzqt = this.EZpvd.get().OLrzqt();
        if (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) {
            return;
        }
        SPUtils.remove(OLrzqt(uid));
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return "compliance_user_risk_status_cache_" + str;
    }

    public final void OLrzqt(long j, int i, int i2) {
        Function2<java.lang.String, EventParamsList, Unit> function2 = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "new_status", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "old_status", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2)), false, 4, null);
        Unit unit = Unit.INSTANCE;
        function2.invoke("Compliance_RiskStatus_CacheChange_View", eventParamsList);
    }
}
