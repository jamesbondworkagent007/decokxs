package o;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.Scopes;
import com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AssetValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AutoInputChoiceAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Choices;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FileUploaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HorizontalRuleAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HyperlinkAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntryAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardChoicesAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCheckboxSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceWithSubInputAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputConditionalTextOrSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDescriptionAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputFormatTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputMultipleChoicesAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputSSNAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputVerificationCodeAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NewFileUploaderAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumberAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProgressStepperAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Rule;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TableCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextContentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Value;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VerifyCenterNotificationAppModel;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$addInfoFormEntry$1;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$deleteInfoFormEntry$1;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$getInfoFormEntryDetail$1;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$navigateToFormPage$1;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$navigateToProcessingPage$1;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$navigateToResultPage$1;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$navigateToSelectWalletVerificationPage$1;
import com.okinc.ok_kyc_core.presentation.formTemplate.FormViewModel$updateInfoFormEntry$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rGL extends AbstractC42074rFj {
    public int AuCTelauCTel;
    public final MutableLiveData<C43734ruq<PageComponentAppModel>> AubY;
    public java.util.Map<java.lang.String, java.lang.String> AwvSrB;
    public MutableLiveData<java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>>> AxsJAY;
    public final rBJ AxsJAYaxsJAY;
    public java.util.Map<java.lang.String, java.lang.String> DTwDnp;
    public final rBM ORxRYg;
    public MutableLiveData<java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>>> OcIXYQ;
    public MutableLiveData<java.lang.Integer> QKVWgx;
    public final rBG QOLQEE;
    public java.util.List<rAX<java.lang.Boolean>> QUSxYX;
    public java.util.List<rAX<AddressCascaderFildValue>> QVAiDq;
    public MutableLiveData<java.lang.Boolean> QbewEr;
    public java.util.List<rAX<Value>> QfsBiF;
    public java.util.List<rAX<AssetValue>> RJOkX;
    public java.util.List<rAX<Date>> RcXXUw;
    public java.util.List<rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>> UeEOUB;
    public java.util.List<rAX<InputDateRangeValue>> aKErDB;
    public java.util.List<rAX<java.lang.String>> dNCPSb;
    public java.util.List<rAX<java.util.List<FieldDisplay>>> djSkpj;
    public final rBT dvKsVJ;
    public java.util.List<rAX<java.util.List<java.lang.String>>> dxcTrN;
    public java.util.List<rAX<PairInputValue>> fFgQHt;
    public java.util.List<rAX<java.lang.String>> fZBcTu;
    public final rBQ finit;
    public kotlin.Pair<java.lang.Integer, ? extends java.util.ArrayList<POACameraGalleryOutputBean>> flVtFt;
    public MutableLiveData<java.lang.Long> fvQaOB;
    public final MutableLiveData<java.util.ArrayList<FieldDisplay>> gGvvIC;
    public MutableLiveData<java.lang.String> gHZMYf;
    public ActivityResultLauncher<android.content.Intent> gasjUx;
    public ActivityResultLauncher<android.content.Intent> giSNqX;
    public MutableLiveData<C42156rIk> gkJEwt;
    public final java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File> hUfVAv;
    public InterfaceC55124xdy iRxXKY;
    public FormAppModel iZzfmt;
    public java.util.ArrayList<java.lang.String> sSMYrx;
    public final MutableLiveData<C43734ruq<java.util.ArrayList<FieldDisplay>>> zLjUOn;
    public final C41970rBn zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>>> AuCTelauCTel() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AubY() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> AwvSrB() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AxsJAY() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.Boolean>> DTwDnp() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBQ DbNXlk() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AuCTelauCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        this.giSNqX = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull FormAppModel formAppModel) {
        Intrinsics.checkNotNullParameter(formAppModel, "");
        this.iZzfmt = formAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<AssetValue>> ORxRYg() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<AddressCascaderFildValue>> OcIXYQ() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rBM QKVWgx() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<java.util.ArrayList<FieldDisplay>>> QOLQEE() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<Value>> QUSxYX() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<InputDateRangeValue>> QVAiDq() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<Date>> QbewEr() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>> QfsBiF() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.String>> RJOkX() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.Integer, ? extends java.util.ArrayList<com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean>>, kotlin.Pair<java.lang.Integer, java.util.ArrayList<com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean>> */
    public final kotlin.Pair<java.lang.Integer, java.util.ArrayList<POACameraGalleryOutputBean>> RcXXUw() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.util.List<java.lang.String>>> UeEOUB() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<PairInputValue>> aKErDB() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        this.gasjUx = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(kotlin.Pair<java.lang.Integer, ? extends java.util.ArrayList<POACameraGalleryOutputBean>> pair) {
        this.flVtFt = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC55124xdy interfaceC55124xdy) {
        Intrinsics.checkNotNullParameter(interfaceC55124xdy, "");
        this.iRxXKY = interfaceC55124xdy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.String>> dNCPSb() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.util.List<FieldDisplay>>> djSkpj() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<PageComponentAppModel>> dxcTrN() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBJ fARcdN() {
        return this.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Long> fFgQHt() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<FieldDisplay>> fZBcTu() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File> flVtFt() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41970rBn gHZMYf() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C42156rIk> gasjUx() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> giSNqX() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.Map<java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>>> sSMYrx() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBG valueOf() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBT values() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zLjUOn() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> zsXlph() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> zuBGHE() {
        return this.gHZMYf;
    }

    public rGL(@NotNull C41970rBn c41970rBn, @NotNull rBQ rbq, @NotNull rBT rbt, @NotNull rBM rbm) {
        Intrinsics.checkNotNullParameter(c41970rBn, "");
        Intrinsics.checkNotNullParameter(rbq, "");
        Intrinsics.checkNotNullParameter(rbt, "");
        Intrinsics.checkNotNullParameter(rbm, "");
        this.zuBGHE = c41970rBn;
        this.finit = rbq;
        this.dvKsVJ = rbt;
        this.ORxRYg = rbm;
        this.AubY = new MutableLiveData<>();
        this.gGvvIC = new MutableLiveData<>();
        this.fZBcTu = new java.util.ArrayList();
        this.QVAiDq = new java.util.ArrayList();
        this.UeEOUB = new java.util.ArrayList();
        this.dxcTrN = new java.util.ArrayList();
        this.djSkpj = new java.util.ArrayList();
        this.RcXXUw = new java.util.ArrayList();
        this.aKErDB = new java.util.ArrayList();
        this.fFgQHt = new java.util.ArrayList();
        this.RJOkX = new java.util.ArrayList();
        this.QfsBiF = new java.util.ArrayList();
        this.QUSxYX = new java.util.ArrayList();
        this.dNCPSb = new java.util.ArrayList();
        this.OcIXYQ = new MutableLiveData<>();
        this.QKVWgx = new MutableLiveData<>();
        this.QbewEr = new MutableLiveData<>();
        this.fvQaOB = new MutableLiveData<>();
        this.AuCTelauCTel = 50;
        this.DTwDnp = new LinkedHashMap();
        this.sSMYrx = new java.util.ArrayList<>();
        this.AxsJAY = new MutableLiveData<>();
        this.AwvSrB = new LinkedHashMap();
        this.hUfVAv = new java.util.ArrayList();
        this.gkJEwt = new MutableLiveData<>();
        this.gHZMYf = new MutableLiveData<>();
        this.zLjUOn = new MutableLiveData<>();
        this.AxsJAYaxsJAY = c41970rBn.AhwBna();
        this.QOLQEE = c41970rBn.AYXKKw();
    }

    public final FormAppModel finit() {
        FormAppModel formAppModel = this.iZzfmt;
        if (formAppModel != null) {
            return formAppModel;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC55124xdy dvKsVJ() {
        InterfaceC55124xdy interfaceC55124xdy = this.iRxXKY;
        if (interfaceC55124xdy != null) {
            return interfaceC55124xdy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void fvQaOB() {
        this.fZBcTu.clear();
        this.QVAiDq.clear();
        this.UeEOUB.clear();
        this.dNCPSb.clear();
        this.QUSxYX.clear();
        this.RcXXUw.clear();
        this.aKErDB.clear();
        this.fFgQHt.clear();
        this.RJOkX.clear();
        this.djSkpj.clear();
        this.QfsBiF.clear();
        this.dxcTrN.clear();
        this.OcIXYQ = new MutableLiveData<>();
        this.DTwDnp.clear();
        this.sSMYrx.clear();
        this.AxsJAY = new MutableLiveData<>();
        this.gkJEwt = new MutableLiveData<>();
        this.AwvSrB = new LinkedHashMap();
        fIwbmz().KWHzl();
    }

    @Override // o.AbstractC42074rFj
    public void AEQbTJ(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$navigateToResultPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void KWHzl(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$navigateToSelectWalletVerificationPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void EZpvd(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$navigateToFormPage$1(pageComponentAppModel, navOptions, this, str, map, pageComponentProfile, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void OLrzqt(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$navigateToProcessingPage$1(this, pageComponentAppModel, str, str2, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, @NotNull java.util.ArrayList<EopImageInfo> arrayList, @NotNull java.lang.String str4, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map3, PageComponentProfile pageComponentProfile, java.lang.String str5, java.lang.Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map3, "");
        AbstractC42074rFj.navigate$default(this, C43662rtX.ActionBar.AEQbTJ, BundleKt.bundleOf(C56390yDp.OLrzqt("resultId", str), C56390yDp.OLrzqt("resultTarget", str2), C56390yDp.OLrzqt("ctaValue", new java.util.HashMap(map)), C56390yDp.OLrzqt("vendorType", num), C56390yDp.OLrzqt("verifyType", num2), C56390yDp.OLrzqt(OtcExtraKeys.SESSIONID, str3), C56390yDp.OLrzqt("imageFiles", map2), C56390yDp.OLrzqt("eopImageFiles", arrayList), C56390yDp.OLrzqt("NFC_MRZ", str5), C56390yDp.OLrzqt("NFC_TYPE", num3), C56390yDp.OLrzqt("playbook", str4), C56390yDp.OLrzqt("playbookParams", map3), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), null, 4, null);
    }

    public final void AEQbTJ(@NotNull FormAppModel formAppModel) {
        java.util.List<UIComponentAppModel> items;
        Intrinsics.checkNotNullParameter(formAppModel, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(formAppModel.getItems());
        CtaAppModel cta = formAppModel.getCta();
        if (cta != null && (items = cta.getItems()) != null) {
            arrayList.addAll(items);
        }
        setUpFormWithAppModel$default(this, arrayList, null, 2, null);
    }

    public static final boolean fIwbmz(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void flVtFt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<rAX<java.lang.String>> list = this.fZBcTu;
        final Function1 function1 = new Function1() { // from class: o.rGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.isConnected(this.AEQbTJ, str, (rAX) obj));
            }
        };
        list.removeIf(new java.util.function.Predicate() { // from class: o.rGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.fIwbmz(function1, obj);
            }
        });
        java.util.List<rAX<AddressCascaderFildValue>> list2 = this.QVAiDq;
        final Function1 function12 = new Function1() { // from class: o.rGU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.uzCIH(this.OLrzqt, str, (rAX) obj));
            }
        };
        list2.removeIf(new java.util.function.Predicate() { // from class: o.rGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.uzCIH(function12, obj);
            }
        });
        java.util.List<rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>>> list3 = this.UeEOUB;
        final Function1 function13 = new Function1() { // from class: o.rGY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.hDKMBd(this.copydefault, str, (rAX) obj));
            }
        };
        list3.removeIf(new java.util.function.Predicate() { // from class: o.rGX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.getNewProxyInstance(function13, obj);
            }
        });
        java.util.List<rAX<java.lang.String>> list4 = this.dNCPSb;
        final Function1 function14 = new Function1() { // from class: o.rHb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.getFieldNames(this.EZpvd, str, (rAX) obj));
            }
        };
        list4.removeIf(new java.util.function.Predicate() { // from class: o.rHd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.iwGUEr(function14, obj);
            }
        });
        java.util.List<rAX<java.lang.Boolean>> list5 = this.QUSxYX;
        final Function1 function15 = new Function1() { // from class: o.rHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.getNewProxyInstance(this.AEQbTJ, str, (rAX) obj));
            }
        };
        list5.removeIf(new java.util.function.Predicate() { // from class: o.rGZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.fetchVPNInfo(function15, obj);
            }
        });
        java.util.List<rAX<Date>> list6 = this.RcXXUw;
        final Function1 function16 = new Function1() { // from class: o.rGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.fetchVPNInfo(this.copydefault, str, (rAX) obj));
            }
        };
        list6.removeIf(new java.util.function.Predicate() { // from class: o.rGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.values(function16, obj);
            }
        });
        java.util.List<rAX<InputDateRangeValue>> list7 = this.aKErDB;
        final Function1 function17 = new Function1() { // from class: o.rHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.DbNXlk(this.OLrzqt, str, (rAX) obj));
            }
        };
        list7.removeIf(new java.util.function.Predicate() { // from class: o.rHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.DbNXlk(function17, obj);
            }
        });
        java.util.List<rAX<PairInputValue>> list8 = this.fFgQHt;
        final Function1 function18 = new Function1() { // from class: o.rHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.ejfBZ(this.EZpvd, str, (rAX) obj));
            }
        };
        list8.removeIf(new java.util.function.Predicate() { // from class: o.rHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.fARcdN(function18, obj);
            }
        });
        java.util.List<rAX<AssetValue>> list9 = this.RJOkX;
        final Function1 function19 = new Function1() { // from class: o.rIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.fJNWhG(this.OLrzqt, str, (rAX) obj));
            }
        };
        list9.removeIf(new java.util.function.Predicate() { // from class: o.rIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.AuCTel(function19, obj);
            }
        });
        java.util.List<rAX<java.util.List<FieldDisplay>>> list10 = this.djSkpj;
        final Function1 function110 = new Function1() { // from class: o.rIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.fARcdN(this.KWHzl, str, (rAX) obj));
            }
        };
        list10.removeIf(new java.util.function.Predicate() { // from class: o.rGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.ejfBZ(function110, obj);
            }
        });
        java.util.List<rAX<Value>> list11 = this.QfsBiF;
        final Function1 function111 = new Function1() { // from class: o.rGQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.AuCTel(this.OLrzqt, str, (rAX) obj));
            }
        };
        list11.removeIf(new java.util.function.Predicate() { // from class: o.rGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.fJNWhG(function111, obj);
            }
        });
        java.util.List<rAX<java.util.List<java.lang.String>>> list12 = this.dxcTrN;
        final Function1 function112 = new Function1() { // from class: o.rGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(rGL.fIwbmz(this.EZpvd, str, (rAX) obj));
            }
        };
        list12.removeIf(new java.util.function.Predicate() { // from class: o.rGP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return rGL.hDKMBd(function112, obj);
            }
        });
        java.util.Iterator<rAX<?>> it = fIwbmz().OLrzqt().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            rAX<?> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            rAX<?> rax = next;
            java.lang.String strGGvvIC = gGvvIC(rax.OLrzqt());
            if (strGGvvIC != null && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str)) {
                it.remove();
                fIwbmz().AEQbTJ().removeSource(rax);
                fIwbmz().copydefault();
            }
        }
    }

    public static final boolean isConnected(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean uzCIH(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean uzCIH(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean hDKMBd(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean iwGUEr(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean getFieldNames(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean getNewProxyInstance(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean values(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean fetchVPNInfo(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean DbNXlk(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean DbNXlk(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean fARcdN(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean ejfBZ(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean AuCTel(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean fJNWhG(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean ejfBZ(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean fARcdN(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean fJNWhG(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean AuCTel(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public static final boolean hDKMBd(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean fIwbmz(rGL rgl, java.lang.String str, rAX rax) {
        Intrinsics.checkNotNullParameter(rax, "");
        java.lang.String strGGvvIC = rgl.gGvvIC(rax.OLrzqt());
        return C33129mqd.OLrzqt((java.lang.CharSequence) strGGvvIC) && Intrinsics.EZpvd((java.lang.Object) strGGvvIC, (java.lang.Object) str);
    }

    public final java.lang.String gGvvIC(java.lang.String str) {
        if (str != null) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() == 3) {
                return listSplit$default.get(0) + "-" + listSplit$default.get(2);
            }
        }
        return null;
    }

    public static /* synthetic */ void setUpFormWithAppModel$default(rGL rgl, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        rgl.copydefault((java.util.List<? extends UIComponentAppModel>) list, str);
    }

    public static final C41966rBj AEQbTJ(Date date) {
        return rAY.AEQbTJ.EZpvd(date);
    }

    public static final C41966rBj AEQbTJ(UIComponentAppModel uIComponentAppModel, Date date) {
        return rAY.AEQbTJ.copydefault(date, ((InputDateAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj QOLQEE(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj QKVWgx(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj AhwBna(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        InputTextAppModel inputTextAppModel = (InputTextAppModel) uIComponentAppModel;
        if (Intrinsics.EZpvd(inputTextAppModel.isNumber(), java.lang.Boolean.TRUE)) {
            return rAY.AEQbTJ.KWHzl(str, inputTextAppModel.getRules());
        }
        return rAY.AEQbTJ.OLrzqt(str, inputTextAppModel.getRules());
    }

    public static final C41966rBj AEQbTJ(java.lang.Boolean bool) {
        return rAY.AEQbTJ.EZpvd((java.lang.Object) bool);
    }

    public static final C41966rBj OLrzqt(java.lang.Boolean bool) {
        return rAY.AEQbTJ.EZpvd(bool);
    }

    public static final C41966rBj AhwBna(java.util.List list) {
        return rAY.AEQbTJ.OLrzqt((java.util.List<?>) list);
    }

    public static final C41966rBj AYXKKw(java.util.List list) {
        return rAY.AEQbTJ.OLrzqt((java.util.List<?>) list);
    }

    public static final C41966rBj gEmmrt(java.util.List list) {
        return rAY.AEQbTJ.copydefault((java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>) list);
    }

    public static final C41966rBj DTwDnp(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj ORxRYg(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj QVAiDq(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj QUSxYX(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj QbewEr(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj RJOkX(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj djBIcL(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        return rAY.AEQbTJ.OLrzqt(str, ((InputConditionalTextOrSelectAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj QfsBiF(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj aKErDB(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj gEmmrt(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        return rAY.AEQbTJ.OLrzqt(str, ((InputSSNAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj RcXXUw(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj djSkpj(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj AkhnZx(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        return rAY.AEQbTJ.OLrzqt(str, ((InputVerificationCodeAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj UeEOUB(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj dNCPSb(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj isConnected(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        return rAY.AEQbTJ.OLrzqt(str, ((InputDescriptionAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj dvKsVJ(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj fZBcTu(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj dxcTrN(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj finit(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj fFgQHt(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj gasjUx(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj giSNqX(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj fvQaOB(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj djBIcL(java.util.List list) {
        return rAY.AEQbTJ.OLrzqt((java.util.List<?>) list);
    }

    public static final C41966rBj EZpvd(UIComponentAppModel uIComponentAppModel, java.util.List list) {
        java.lang.String maxNumOfOptions;
        rAY ray = rAY.AEQbTJ;
        Choices choices = ((InputMultipleChoicesAppModel) uIComponentAppModel).getChoices();
        if (choices == null || (maxNumOfOptions = choices.getMaxNumOfOptions()) == null) {
            maxNumOfOptions = "1";
        }
        return ray.AEQbTJ(list, C33129mqd.AhwBna(maxNumOfOptions));
    }

    public static final C41966rBj isConnected(java.util.List list) {
        return rAY.AEQbTJ.OLrzqt((java.util.List<?>) list);
    }

    public static final C41966rBj djBIcL(UIComponentAppModel uIComponentAppModel, java.util.List list) {
        java.lang.String maxNumOfOptions;
        rAY ray = rAY.AEQbTJ;
        CardChoices choices = ((InputCardChoicesAppModel) uIComponentAppModel).getChoices();
        if (choices == null || (maxNumOfOptions = choices.getMaxNumOfOptions()) == null) {
            maxNumOfOptions = "1";
        }
        return ray.AEQbTJ(list, C33129mqd.AhwBna(maxNumOfOptions));
    }

    public static final C41966rBj values(java.util.List list) {
        return rAY.AEQbTJ.OLrzqt((java.util.List<?>) list);
    }

    public static final C41966rBj AEQbTJ(Value value) {
        return rAY.AEQbTJ.EZpvd(value);
    }

    public static final C41966rBj copydefault(Value value) {
        return rAY.AEQbTJ.copydefault(value);
    }

    public static final C41966rBj AwvSrB(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj valueOf(UIComponentAppModel uIComponentAppModel, java.lang.String str) {
        return rAY.AEQbTJ.OLrzqt(str, ((InputFormatTextAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj AxsJAY(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj OcIXYQ(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj KWHzl(UIComponentAppModel uIComponentAppModel, java.util.List list) {
        java.lang.Object min;
        rAY ray = rAY.AEQbTJ;
        Rule rule = ((InfoFormEntryAppModel) uIComponentAppModel).getRule();
        if (rule == null || (min = rule.getMin()) == null) {
            min = "1";
        }
        return ray.OLrzqt((java.util.List<FieldDisplay>) list, C33129mqd.AhwBna(min));
    }

    public static final C41966rBj OLrzqt(InputDateRangeValue inputDateRangeValue) {
        return rAY.AEQbTJ.EZpvd((java.lang.Object) inputDateRangeValue);
    }

    public static final C41966rBj KWHzl(InputDateRangeValue inputDateRangeValue) {
        return rAY.AEQbTJ.EZpvd(inputDateRangeValue);
    }

    public static final C41966rBj EZpvd(AssetValue assetValue) {
        return rAY.AEQbTJ.EZpvd(assetValue);
    }

    public static final C41966rBj AEQbTJ(AssetValue assetValue) {
        return rAY.AEQbTJ.OLrzqt(assetValue);
    }

    public static final C41966rBj OLrzqt(PairInputValue pairInputValue) {
        return rAY.AEQbTJ.EZpvd(pairInputValue);
    }

    public static final C41966rBj AEQbTJ(UIComponentAppModel uIComponentAppModel, PairInputValue pairInputValue) {
        return rAY.AEQbTJ.EZpvd(pairInputValue, (PairInputNumberAppModel) uIComponentAppModel);
    }

    public static final C41966rBj copydefault(AddressCascaderFildValue addressCascaderFildValue) {
        return rAY.AEQbTJ.EZpvd(addressCascaderFildValue);
    }

    public final boolean KWHzl(UIComponentAppModel uIComponentAppModel) {
        if (uIComponentAppModel.getRequired() == null) {
            return false;
        }
        java.lang.Boolean required = uIComponentAppModel.getRequired();
        Intrinsics.copydefault(required);
        return required.booleanValue();
    }

    public final void KWHzl(@NotNull FormAppModel formAppModel) {
        Intrinsics.checkNotNullParameter(formAppModel, "");
        this.AubY.setValue(new C43734ruq<>(formAppModel));
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<FieldDisplay> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.gGvvIC.setValue(arrayList);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, FragmentActivity fragmentActivity, @NotNull Function1<? super java.util.HashMap<java.lang.String, ValueAndName>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC42074rFj.startLoading$default(this, null, fragmentActivity, ButtonStyle.Text, null, 8, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$getInfoFormEntryDetail$1(this, str, map, str2, fragmentActivity, function1, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2, C52794wYp c52794wYp, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c41957rBa, "");
        Intrinsics.checkNotNullParameter(map, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$addInfoFormEntry$1(this, str, map, c41957rBa, c52794wYp, fragmentActivity, str2, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, C52794wYp c52794wYp, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c41957rBa, "");
        Intrinsics.checkNotNullParameter(map, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$updateInfoFormEntry$1(this, str, map, str3, c41957rBa, c52794wYp, fragmentActivity, str2, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void OLrzqt(C52794wYp c52794wYp, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str3, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EZpvd(c52794wYp, fragmentActivity, ButtonStyle.Text, ComplianceTheme.OKX);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FormViewModel$deleteInfoFormEntry$1(this, str, map, str3, fragmentActivity, str2, null), 3, null);
    }

    public final void OLrzqt(@NotNull android.content.Context context, int i, int i2, @NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.giSNqX;
        if (activityResultLauncher != null) {
            ComponentActivity componentActivity = context instanceof ComponentActivity ? (ComponentActivity) context : null;
            if (componentActivity != null) {
                ActivityC43661rtW.Companion.copydefault(componentActivity, C56424yEw.gEmmrt(C56390yDp.OLrzqt("SHOULD_SHOW_FILE_SELECTOR", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("LIMIT", java.lang.Integer.valueOf(i))), strArr, activityResultLauncher);
            }
        }
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.gasjUx;
        if (activityResultLauncher != null) {
            ComponentActivity componentActivity = context instanceof ComponentActivity ? (ComponentActivity) context : null;
            if (componentActivity != null) {
                ActivityC43724rug.Companion.EZpvd(componentActivity, C56424yEw.gEmmrt(C56390yDp.OLrzqt("FileType", str), C56390yDp.OLrzqt("URI", str2), C56390yDp.OLrzqt("PreviewerMode", "DirectShow")), activityResultLauncher);
            }
        }
    }

    public final void copydefault(@NotNull java.util.List<? extends UIComponentAppModel> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        for (final UIComponentAppModel uIComponentAppModel : list) {
            if (uIComponentAppModel instanceof CTAButtonAppModel) {
                this.dNCPSb.add(new rAX<>(((CTAButtonAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null));
            } else if (uIComponentAppModel instanceof InputDateAppModel) {
                rAX<Date> rax = new rAX<>(((InputDateAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax.AEQbTJ(new Function1() { // from class: o.rHa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AEQbTJ((Date) obj);
                    }
                }, new Function1() { // from class: o.rHp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AEQbTJ(uIComponentAppModel, (Date) obj);
                    }
                });
                rax.copydefault(fIwbmz());
                this.RcXXUw.add(rax);
            } else if (uIComponentAppModel instanceof InputTextAppModel) {
                rAX<java.lang.String> rax2 = new rAX<>(((InputTextAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax2.AEQbTJ(new Function1() { // from class: o.rHz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.QOLQEE((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.QKVWgx((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AhwBna(uIComponentAppModel, (java.lang.String) obj);
                    }
                });
                rax2.copydefault(fIwbmz());
                this.fZBcTu.add(rax2);
            } else if (uIComponentAppModel instanceof CheckboxAppModel) {
                rAX<java.lang.Boolean> rax3 = new rAX<>(((CheckboxAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax3.AEQbTJ(new Function1() { // from class: o.rIf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AEQbTJ((java.lang.Boolean) obj);
                    }
                }, new Function1() { // from class: o.rId
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.OLrzqt((java.lang.Boolean) obj);
                    }
                });
                rax3.copydefault(fIwbmz());
                this.QUSxYX.add(rax3);
            } else if (uIComponentAppModel instanceof FileUploaderAppModel) {
                rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax4 = new rAX<>(((FileUploaderAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax4.AEQbTJ(new Function1() { // from class: o.rIe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AhwBna((java.util.List) obj);
                    }
                });
                rax4.copydefault(fIwbmz());
                this.UeEOUB.add(rax4);
            } else if (uIComponentAppModel instanceof NewFileUploaderAppModel) {
                rAX<java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.File>> rax5 = new rAX<>(((NewFileUploaderAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax5.AEQbTJ(new Function1() { // from class: o.rIh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AYXKKw((java.util.List) obj);
                    }
                }, new Function1() { // from class: o.rIj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.gEmmrt((java.util.List) obj);
                    }
                });
                rax5.copydefault(fIwbmz());
                this.UeEOUB.add(rax5);
            } else if (uIComponentAppModel instanceof InputSelectAppModel) {
                rAX<java.lang.String> rax6 = new rAX<>(((InputSelectAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax6.AEQbTJ(new Function1() { // from class: o.rHe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.DTwDnp((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.ORxRYg((java.lang.String) obj);
                    }
                });
                rax6.copydefault(fIwbmz());
                this.fZBcTu.add(rax6);
            } else if (uIComponentAppModel instanceof SelectCardAppModel) {
                rAX<java.lang.String> rax7 = new rAX<>(((SelectCardAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), null, null, false, 28, null);
                rax7.AEQbTJ(new Function1() { // from class: o.rHh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.QVAiDq((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.QUSxYX((java.lang.String) obj);
                    }
                });
                rax7.copydefault(fIwbmz());
                this.fZBcTu.add(rax7);
            } else if (uIComponentAppModel instanceof InputConditionalTextOrSelectAppModel) {
                rAX<java.lang.String> rax8 = new rAX<>(((InputConditionalTextOrSelectAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax8.AEQbTJ(new Function1() { // from class: o.rHf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.QbewEr((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.RJOkX((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.djBIcL(uIComponentAppModel, (java.lang.String) obj);
                    }
                });
                rax8.copydefault(fIwbmz());
                this.fZBcTu.add(rax8);
            } else if (uIComponentAppModel instanceof InputSSNAppModel) {
                rAX<java.lang.String> rax9 = new rAX<>(((InputSSNAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax9.AEQbTJ(new Function1() { // from class: o.rHk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.QfsBiF((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.aKErDB((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.gEmmrt(uIComponentAppModel, (java.lang.String) obj);
                    }
                });
                rax9.copydefault(fIwbmz());
                this.fZBcTu.add(rax9);
            } else if (uIComponentAppModel instanceof InputVerificationCodeAppModel) {
                rAX<java.lang.String> rax10 = new rAX<>(((InputVerificationCodeAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax10.AEQbTJ(new Function1() { // from class: o.rHr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.RcXXUw((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.djSkpj((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AkhnZx(uIComponentAppModel, (java.lang.String) obj);
                    }
                });
                rax10.copydefault(fIwbmz());
                this.fZBcTu.add(rax10);
            } else if (uIComponentAppModel instanceof InputDescriptionAppModel) {
                rAX<java.lang.String> rax11 = new rAX<>(((InputDescriptionAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax11.AEQbTJ(new Function1() { // from class: o.rHx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.UeEOUB((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.dNCPSb((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.isConnected(uIComponentAppModel, (java.lang.String) obj);
                    }
                });
                rax11.copydefault(fIwbmz());
                this.fZBcTu.add(rax11);
            } else if (uIComponentAppModel instanceof IllustrationAppModel) {
                rAX<java.lang.String> rax12 = new rAX<>(((IllustrationAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax12.copydefault(fIwbmz());
                this.fZBcTu.add(rax12);
            } else if (uIComponentAppModel instanceof AlertAppModel) {
                rAX<java.lang.String> rax13 = new rAX<>(((AlertAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax13.copydefault(fIwbmz());
                this.fZBcTu.add(rax13);
            } else if (uIComponentAppModel instanceof CardAppModel) {
                rAX<java.lang.String> rax14 = new rAX<>(((CardAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax14.copydefault(fIwbmz());
                this.fZBcTu.add(rax14);
            } else if (uIComponentAppModel instanceof CtaAppModel) {
                Unit unit = Unit.INSTANCE;
            } else if (uIComponentAppModel instanceof HyperlinkAppModel) {
                rAX<java.lang.String> rax15 = new rAX<>(((HyperlinkAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax15.copydefault(fIwbmz());
                this.fZBcTu.add(rax15);
            } else if (uIComponentAppModel instanceof TextContentAppModel) {
                rAX<java.lang.String> rax16 = new rAX<>(((TextContentAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax16.copydefault(fIwbmz());
                this.fZBcTu.add(rax16);
            } else if (uIComponentAppModel instanceof FreeTextAppModel) {
                rAX<java.lang.String> rax17 = new rAX<>(((FreeTextAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax17.copydefault(fIwbmz());
                this.fZBcTu.add(rax17);
            } else if (uIComponentAppModel instanceof AddressSearchAppModel) {
                rAX<java.lang.String> rax18 = new rAX<>(((AddressSearchAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax18.copydefault(fIwbmz());
                this.fZBcTu.add(rax18);
            } else if (uIComponentAppModel instanceof ImageListAppModel) {
                rAX<java.lang.String> rax19 = new rAX<>(((ImageListAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                rax19.copydefault(fIwbmz());
                this.fZBcTu.add(rax19);
            } else if (uIComponentAppModel instanceof InputCardAppModel) {
                InputCardAppModel inputCardAppModel = (InputCardAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax20 = new rAX<>(inputCardAppModel.getId(), Intrinsics.EZpvd(inputCardAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                rax20.AEQbTJ(new Function1() { // from class: o.rHw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.dvKsVJ((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.fZBcTu((java.lang.String) obj);
                    }
                });
                rax20.copydefault(fIwbmz());
                this.fZBcTu.add(rax20);
            } else if (uIComponentAppModel instanceof InputChoiceAppModel) {
                InputChoiceAppModel inputChoiceAppModel = (InputChoiceAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax21 = new rAX<>(inputChoiceAppModel.getId(), Intrinsics.EZpvd(inputChoiceAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                rax21.AEQbTJ(new Function1() { // from class: o.rHA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.dxcTrN((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.finit((java.lang.String) obj);
                    }
                });
                rax21.copydefault(fIwbmz());
                this.fZBcTu.add(rax21);
            } else if (uIComponentAppModel instanceof AutoInputChoiceAppModel) {
                AutoInputChoiceAppModel autoInputChoiceAppModel = (AutoInputChoiceAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax22 = new rAX<>(autoInputChoiceAppModel.getId(), Intrinsics.EZpvd(autoInputChoiceAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                rax22.AEQbTJ(new Function1() { // from class: o.rHB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.fFgQHt((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.gasjUx((java.lang.String) obj);
                    }
                });
                rax22.copydefault(fIwbmz());
                this.fZBcTu.add(rax22);
            } else if (uIComponentAppModel instanceof InputCardSelectAppModel) {
                InputCardSelectAppModel inputCardSelectAppModel = (InputCardSelectAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax23 = new rAX<>(inputCardSelectAppModel.getId(), Intrinsics.EZpvd(inputCardSelectAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                rax23.AEQbTJ(new Function1() { // from class: o.rHG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.giSNqX((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.fvQaOB((java.lang.String) obj);
                    }
                });
                rax23.copydefault(fIwbmz());
                this.fZBcTu.add(rax23);
            } else if (uIComponentAppModel instanceof InputMultipleChoicesAppModel) {
                InputMultipleChoicesAppModel inputMultipleChoicesAppModel = (InputMultipleChoicesAppModel) uIComponentAppModel;
                rAX<java.util.List<java.lang.String>> rax24 = new rAX<>(inputMultipleChoicesAppModel.getId(), Intrinsics.EZpvd(inputMultipleChoicesAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                rax24.AEQbTJ(new Function1() { // from class: o.rHD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.djBIcL((java.util.List) obj);
                    }
                }, new Function1() { // from class: o.rHM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.EZpvd(uIComponentAppModel, (java.util.List) obj);
                    }
                });
                rax24.copydefault(fIwbmz());
                this.dxcTrN.add(rax24);
            } else if (uIComponentAppModel instanceof InputCardChoicesAppModel) {
                InputCardChoicesAppModel inputCardChoicesAppModel = (InputCardChoicesAppModel) uIComponentAppModel;
                rAX<java.util.List<java.lang.String>> rax25 = new rAX<>(inputCardChoicesAppModel.getId(), Intrinsics.EZpvd(inputCardChoicesAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                rax25.AEQbTJ(new Function1() { // from class: o.rHJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.isConnected((java.util.List) obj);
                    }
                }, new Function1() { // from class: o.rHK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.djBIcL(uIComponentAppModel, (java.util.List) obj);
                    }
                });
                rax25.copydefault(fIwbmz());
                this.dxcTrN.add(rax25);
            } else if (uIComponentAppModel instanceof InputCheckboxSelectAppModel) {
                InputCheckboxSelectAppModel inputCheckboxSelectAppModel = (InputCheckboxSelectAppModel) uIComponentAppModel;
                rAX<java.util.List<java.lang.String>> rax26 = new rAX<>(inputCheckboxSelectAppModel.getId(), Intrinsics.EZpvd(inputCheckboxSelectAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                rax26.AEQbTJ(new Function1() { // from class: o.rHI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.values((java.util.List) obj);
                    }
                });
                rax26.copydefault(fIwbmz());
                this.dxcTrN.add(rax26);
            } else if (uIComponentAppModel instanceof HorizontalRuleAppModel) {
                rAX<java.lang.String> rax27 = new rAX<>(((HorizontalRuleAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax27.copydefault(fIwbmz());
                this.fZBcTu.add(rax27);
            } else if (uIComponentAppModel instanceof ProgressStepperAppModel) {
                rAX<java.lang.String> rax28 = new rAX<>(((ProgressStepperAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax28.copydefault(fIwbmz());
                this.fZBcTu.add(rax28);
            } else if (uIComponentAppModel instanceof VerifyCenterNotificationAppModel) {
                rAX<java.lang.String> rax29 = new rAX<>(((VerifyCenterNotificationAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax29.copydefault(fIwbmz());
                this.fZBcTu.add(rax29);
            } else if (uIComponentAppModel instanceof InputChoiceWithSubInputAppModel) {
                rAX<Value> rax30 = new rAX<>(((InputChoiceWithSubInputAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax30.AEQbTJ(new Function1() { // from class: o.rHL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AEQbTJ((Value) obj);
                    }
                }, new Function1() { // from class: o.rHP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.copydefault((Value) obj);
                    }
                });
                rax30.copydefault(fIwbmz());
                this.QfsBiF.add(rax30);
            } else if (uIComponentAppModel instanceof InputFormatTextAppModel) {
                rAX<java.lang.String> rax31 = new rAX<>(((InputFormatTextAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                rax31.AEQbTJ(new Function1() { // from class: o.rHQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.AwvSrB((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rHN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rGL.valueOf(uIComponentAppModel, (java.lang.String) obj);
                    }
                });
                rax31.copydefault(fIwbmz());
                this.fZBcTu.add(rax31);
            } else if (uIComponentAppModel instanceof CtaCardAppModel) {
                rAX<java.lang.String> rax32 = new rAX<>(((CtaCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax32.copydefault(fIwbmz());
                this.fZBcTu.add(rax32);
            } else {
                boolean z = uIComponentAppModel instanceof CtaListAppModel;
                if (z) {
                    CtaListAppModel ctaListAppModel = (CtaListAppModel) uIComponentAppModel;
                    java.lang.String id = ctaListAppModel.getId();
                    boolean zKWHzl = KWHzl(uIComponentAppModel);
                    if (!z) {
                        ctaListAppModel = null;
                    }
                    rAX<java.lang.String> rax33 = new rAX<>(id, zKWHzl, null, null, ctaListAppModel != null && ctaListAppModel.isValid(), 12, null);
                    rax33.copydefault(fIwbmz());
                    this.fZBcTu.add(rax33);
                } else if (uIComponentAppModel instanceof EditCardAppModel) {
                    EditCardAppModel editCardAppModel = (EditCardAppModel) uIComponentAppModel;
                    rAX<java.lang.String> rax34 = new rAX<>(editCardAppModel.getId(), Intrinsics.EZpvd(editCardAppModel.getRequired(), java.lang.Boolean.TRUE), null, null, false, 28, null);
                    rax34.AEQbTJ(new Function1() { // from class: o.rHU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.AxsJAY((java.lang.String) obj);
                        }
                    }, new Function1() { // from class: o.rHW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.OcIXYQ((java.lang.String) obj);
                        }
                    });
                    rax34.copydefault(fIwbmz());
                    this.fZBcTu.add(rax34);
                } else if (uIComponentAppModel instanceof InfoFormEntryAppModel) {
                    rAX<java.util.List<FieldDisplay>> rax35 = new rAX<>(((InfoFormEntryAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                    rax35.AEQbTJ(new Function1() { // from class: o.rHV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.KWHzl(uIComponentAppModel, (java.util.List) obj);
                        }
                    });
                    rax35.copydefault(fIwbmz());
                    this.djSkpj.add(rax35);
                } else if (uIComponentAppModel instanceof InputDateRangeAppModel) {
                    rAX<InputDateRangeValue> rax36 = new rAX<>(((InputDateRangeAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                    rax36.AEQbTJ(new Function1() { // from class: o.rHT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.OLrzqt((InputDateRangeValue) obj);
                        }
                    }, new Function1() { // from class: o.rHS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.KWHzl((InputDateRangeValue) obj);
                        }
                    });
                    rax36.copydefault(fIwbmz());
                    this.aKErDB.add(rax36);
                } else if (uIComponentAppModel instanceof AssetListAppModel) {
                    AssetListAppModel assetListAppModel = (AssetListAppModel) uIComponentAppModel;
                    rAX<AssetValue> rax37 = new rAX<>(assetListAppModel.getId(), Intrinsics.EZpvd(assetListAppModel.getRequired(), java.lang.Boolean.TRUE), str, null, false, 24, null);
                    rax37.AEQbTJ(new Function1() { // from class: o.rHX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.EZpvd((AssetValue) obj);
                        }
                    }, new Function1() { // from class: o.rHY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.AEQbTJ((AssetValue) obj);
                        }
                    });
                    rax37.copydefault(fIwbmz());
                    this.RJOkX.add(rax37);
                } else if (uIComponentAppModel instanceof PairInputNumberAppModel) {
                    rAX<PairInputValue> rax38 = new rAX<>(((PairInputNumberAppModel) uIComponentAppModel).getId(), KWHzl(uIComponentAppModel), str, null, false, 24, null);
                    rax38.AEQbTJ(new Function1() { // from class: o.rIa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.OLrzqt((PairInputValue) obj);
                        }
                    }, new Function1() { // from class: o.rIg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.AEQbTJ(uIComponentAppModel, (PairInputValue) obj);
                        }
                    });
                    rax38.copydefault(fIwbmz());
                    this.fFgQHt.add(rax38);
                } else if (uIComponentAppModel instanceof HelperLabelAppModel) {
                    rAX<java.lang.String> rax39 = new rAX<>(((HelperLabelAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                    rax39.copydefault(fIwbmz());
                    this.fZBcTu.add(rax39);
                } else if (uIComponentAppModel instanceof AlertCardAppModel) {
                    rAX<java.lang.String> rax40 = new rAX<>(((AlertCardAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                    rax40.copydefault(fIwbmz());
                    this.fZBcTu.add(rax40);
                } else if (uIComponentAppModel instanceof AddressCascaderAppModel) {
                    AddressCascaderAppModel addressCascaderAppModel = (AddressCascaderAppModel) uIComponentAppModel;
                    rAX<AddressCascaderFildValue> rax41 = new rAX<>(addressCascaderAppModel.getId(), Intrinsics.EZpvd(addressCascaderAppModel.getRequired(), java.lang.Boolean.TRUE), null, null, false, 28, null);
                    rax41.AEQbTJ(new Function1() { // from class: o.rIc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rGL.copydefault((AddressCascaderFildValue) obj);
                        }
                    });
                    rax41.copydefault(fIwbmz());
                    this.QVAiDq.add(rax41);
                } else if (uIComponentAppModel instanceof TableCardAppModel) {
                    rAX<java.lang.String> rax42 = new rAX<>(((TableCardAppModel) uIComponentAppModel).getId(), false, str, null, false, 24, null);
                    rax42.copydefault(fIwbmz());
                    this.fZBcTu.add(rax42);
                } else {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }
}
