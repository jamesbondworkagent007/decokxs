package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationViewModel$navigateToFormPage$1;
import com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationViewModel$navigateToProcessingPage$1;
import com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationViewModel$navigateToResultPage$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rJH extends AbstractC42074rFj {
    public final rBG AuCTelauCTel;
    public final rBQ AubY;
    public final rBJ AxsJAY;
    public final C41970rBn zLjUOn;
    public final rBT zuBGHE;

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
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBG valueOf() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBT values() {
        return this.zuBGHE;
    }

    public rJH(@NotNull C41970rBn c41970rBn, @NotNull rBQ rbq, @NotNull rBT rbt) {
        Intrinsics.checkNotNullParameter(c41970rBn, "");
        Intrinsics.checkNotNullParameter(rbq, "");
        Intrinsics.checkNotNullParameter(rbt, "");
        this.zLjUOn = c41970rBn;
        this.AubY = rbq;
        this.zuBGHE = rbt;
        this.AxsJAY = c41970rBn.AhwBna();
        this.AuCTelauCTel = c41970rBn.AYXKKw();
    }

    @Override // o.AbstractC42074rFj
    public void AEQbTJ(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectWalletVerificationViewModel$navigateToResultPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void EZpvd(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectWalletVerificationViewModel$navigateToFormPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void OLrzqt(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectWalletVerificationViewModel$navigateToProcessingPage$1(this, pageComponentAppModel, str, str2, map, pageComponentProfile, navOptions, null), 3, null);
    }
}
