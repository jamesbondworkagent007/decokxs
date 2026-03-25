package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.service.VerifyFlowType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38266pSk extends AbstractC43215rlA implements rSB {
    @Override // o.rSB
    public void EZpvd(@NotNull android.content.Context context, @NotNull final VendorConfig vendorConfig, @NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(vendorConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        pUU.KWHzl("qjf", "KycEopLivenessDynamicImpl:openEopLiveness---------->" + str2);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KYC_Liveness_Start_Success", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pSm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38266pSk.OLrzqt(str2, vendorConfig, (EventParamsList) obj);
            }
        });
        ActivityC38205pQc.Companion.copydefault(context, vendorConfig, str, str2, activityResultLauncher);
    }

    public static final Unit OLrzqt(java.lang.String str, VendorConfig vendorConfig, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String string = java.util.Arrays.toString(new int[]{VerifyFlowType.LIVE_FACE.getVerifyType()});
        Intrinsics.checkNotNullExpressionValue(string, "");
        eventParamsList.put(EopTrackEvent.KEY_FEATURE_ARRAY, string, false);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", vendorConfig.getSource(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, vendorConfig.getSourceCode(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.rSB
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC38205pQc.Companion.AEQbTJ(context, str);
    }

    @Override // o.rSB
    public void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, FacialExtParams facialExtParams) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        ActivityC38205pQc.Companion.KWHzl(fragmentActivity, str, activityResultLauncher, facialExtParams);
    }

    @Override // o.rSB
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, FacialExtParams facialExtParams) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC38205pQc.Companion.EZpvd(context, str, facialExtParams);
    }
}
