package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus;
import com.okinc.ok_kyc_core.impl.RiskStatusCacheInfo;
import dagger.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rDM implements rDL {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final Lazy<InterfaceC43702ruK> KWHzl;
    public final rDN OLrzqt;

    @yCM
    public rDM(@NotNull rDN rdn, @NotNull Lazy<InterfaceC43702ruK> lazy) {
        Intrinsics.checkNotNullParameter(rdn, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        this.OLrzqt = rdn;
        this.KWHzl = lazy;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rDM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.rDL
    public AbstractC58185ywX<CheckUKRiskStatusResponse> KWHzl(@NotNull FragmentActivity fragmentActivity, final java.lang.Boolean bool, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33527myD.KWHzl(C58156yvv.EZpvd(this.KWHzl.get().EZpvd(bool, str != null ? C33129mqd.gEmmrt(str) : null), fragmentActivity)), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.rDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rDM.EZpvd(this.EZpvd, bool, str, (CheckUKRiskStatusResponse) obj);
            }
        };
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58227yxM() { // from class: o.rDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rDM.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(rDM rdm, java.lang.Boolean bool, java.lang.String str, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        rdm.OLrzqt.EZpvd(bool, str, checkUKRiskStatusResponse.getAction().getCode());
        return Unit.INSTANCE;
    }

    @Override // o.rDL
    public AbstractC58185ywX<CheckUKRiskStatusResponse> copydefault(@NotNull final FragmentActivity fragmentActivity, final java.lang.Boolean bool, final java.lang.String str, boolean z, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        RiskStatusCacheInfo riskStatusCacheInfoCopydefault = this.OLrzqt.copydefault(bool, str, z);
        if (riskStatusCacheInfoCopydefault != null) {
            int action = riskStatusCacheInfoCopydefault.getAction();
            RiskStatus riskStatus = RiskStatus.NORestrict;
            if (action == riskStatus.getCode()) {
                OLrzqt(1, riskStatusCacheInfoCopydefault.getTimestamp(), str2);
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new CheckUKRiskStatusResponse(riskStatus, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.HashMap) null, (java.util.HashMap) null, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));
                final Function1 function1 = new Function1() { // from class: o.rDU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rDM.copydefault(this.EZpvd, fragmentActivity, bool, str, (CheckUKRiskStatusResponse) obj);
                    }
                };
                AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.rDS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        rDM.copydefault(function1, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXKWHzl2);
                return abstractC58185ywXKWHzl2;
            }
        }
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl3 = KWHzl(fragmentActivity, bool, str);
        final Function1 function12 = new Function1() { // from class: o.rDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rDM.copydefault(this.AEQbTJ, str2, (CheckUKRiskStatusResponse) obj);
            }
        };
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl4 = abstractC58185ywXKWHzl3.KWHzl(new InterfaceC58227yxM() { // from class: o.rDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rDM.AhwBna(function12, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXKWHzl4);
        return abstractC58185ywXKWHzl4;
    }

    public static final Unit copydefault(rDM rdm, FragmentActivity fragmentActivity, java.lang.Boolean bool, java.lang.String str, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        rdm.KWHzl(fragmentActivity, bool, str);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(rDM rdm, java.lang.String str, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        rdm.OLrzqt(0, java.lang.System.currentTimeMillis(), str);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final int i, final long j, final java.lang.String str) {
        C32866mlf.onEvent$default("Compliance_RiskStatus_Cache_View", (TrackChannel[]) null, new Function1() { // from class: o.rDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rDM.copydefault(i, str, j, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(int i, java.lang.String str, long j, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from_cache", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "entry_source", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "read_time", C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j)), false, 4, null);
        return Unit.INSTANCE;
    }
}
