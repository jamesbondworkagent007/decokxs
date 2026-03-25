package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.eop.bean.ImageUploadRequestBody;
import com.okinc.liveness.eop.bean.UploadImageCallBack;
import com.okinc.liveness.eop.viewmodel.EopLivenessKycViewModel$verifyFacialInfo$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pRY extends AbstractC33073mpa {
    public FacialExtParams valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final pRV<kotlin.Pair<ImageUploadRequestBody, ResponseData<UploadImageCallBack>>> AhwBna = new pRV<>();
    public final pRV<java.lang.Throwable> copydefault = new pRV<>();
    public final pRV<FacialInfoResult> AYXKKw = new pRV<>();
    public final pRV<FacialInfoResult> OLrzqt = new pRV<>();
    public final pRV<java.lang.Throwable> djBIcL = new pRV<>();
    public final pRV<java.lang.Throwable> KWHzl = new pRV<>();
    public java.lang.String gEmmrt = "";
    public java.lang.String EZpvd = "";
    public java.lang.String values = "";
    public java.lang.String DbNXlk = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<java.lang.Throwable> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<FacialInfoResult> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacialExtParams OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(FacialExtParams facialExtParams) {
        this.valueOf = facialExtParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pRY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new EopLivenessKycViewModel$verifyFacialInfo$1(this, str, null), 3, null);
    }
}
