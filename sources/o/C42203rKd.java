package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$getMultiVendorEopVerificationResult$1;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$navigateToFormPage$1;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$navigateToProcessingPage$1;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$navigateToResultPage$1;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$postEncryptVerify$1;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$postOnboarding$2;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42203rKd extends AbstractC42074rFj {
    public final C41970rBn AuCTelauCTel;
    public final rBQ AubY;
    public final rBT AwvSrB;
    public final rBJ gHZMYf;
    public final rBG zLjUOn;

    /* JADX INFO: renamed from: o.rKd$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBQ DbNXlk() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public void KWHzl(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, @NotNull java.util.ArrayList<EopImageInfo> arrayList, @NotNull java.lang.String str4, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map3, PageComponentProfile pageComponentProfile, java.lang.String str5, java.lang.Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map3, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBJ fARcdN() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBG valueOf() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBT values() {
        return this.AwvSrB;
    }

    public C42203rKd(@NotNull C41970rBn c41970rBn, @NotNull rBT rbt, @NotNull rBQ rbq) {
        Intrinsics.checkNotNullParameter(c41970rBn, "");
        Intrinsics.checkNotNullParameter(rbt, "");
        Intrinsics.checkNotNullParameter(rbq, "");
        this.AuCTelauCTel = c41970rBn;
        this.AwvSrB = rbt;
        this.AubY = rbq;
        this.gHZMYf = c41970rBn.AhwBna();
        this.zLjUOn = c41970rBn.AYXKKw();
    }

    @Override // o.AbstractC42074rFj
    public void AEQbTJ(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OcrVerifyViewModel$navigateToResultPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void EZpvd(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OcrVerifyViewModel$navigateToFormPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void OLrzqt(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OcrVerifyViewModel$navigateToProcessingPage$1(this, pageComponentAppModel, str, str2, map, pageComponentProfile, navOptions, null), 3, null);
    }

    public final java.lang.Object KWHzl(@NotNull VendorVerifyRequest vendorVerifyRequest, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new OcrVerifyViewModel$postOnboarding$2(this, vendorVerifyRequest, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull VendorVerifyRequest vendorVerifyRequest, StateListAnimator stateListAnimator, androidx.fragment.app.Fragment fragment, PageComponentProfile pageComponentProfile, java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(vendorVerifyRequest, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OcrVerifyViewModel$getMultiVendorEopVerificationResult$1(vendorVerifyRequest, this, fragment, pageComponentProfile, map, str, stateListAnimator, null), 3, null);
    }

    public final void AEQbTJ(@NotNull VendorVerifyRequest vendorVerifyRequest, StateListAnimator stateListAnimator, androidx.fragment.app.Fragment fragment, PageComponentProfile pageComponentProfile, java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(vendorVerifyRequest, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OcrVerifyViewModel$postEncryptVerify$1(vendorVerifyRequest, this, fragment, pageComponentProfile, map, str2, str, stateListAnimator, null), 3, null);
    }
}
