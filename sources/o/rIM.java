package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.Scopes;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HorizontalRuleAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HyperlinkAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TableCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextContentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.presentation.processing.ProcessingViewModel$navigateToFormPage$1;
import com.okinc.ok_kyc_core.presentation.processing.ProcessingViewModel$navigateToResultPage$1;
import com.okinc.ok_kyc_core.presentation.processing.ProcessingViewModel$postProcessing$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rIM extends AbstractC42074rFj {
    public java.util.List<rAX<java.lang.Boolean>> AuCTelauCTel;
    public final C41970rBn AubY;
    public java.util.List<rAX<java.lang.String>> AwvSrB;
    public java.util.List<rAX<java.lang.String>> AxsJAY;
    public final rBH ORxRYg;
    public final rBJ QKVWgx;
    public final rBT gHZMYf;
    public final rBQ sSMYrx;
    public final rBG zLjUOn;
    public java.util.List<rAX<Date>> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.String>> AuCTelauCTel() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.String>> AubY() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBQ DbNXlk() {
        return this.sSMYrx;
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
    public void OLrzqt(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBJ fARcdN() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBG valueOf() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBT values() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.Boolean>> zLjUOn() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rBH zsXlph() {
        return this.ORxRYg;
    }

    public rIM(@NotNull rBH rbh, @NotNull C41970rBn c41970rBn, @NotNull rBQ rbq, @NotNull rBT rbt) {
        Intrinsics.checkNotNullParameter(rbh, "");
        Intrinsics.checkNotNullParameter(c41970rBn, "");
        Intrinsics.checkNotNullParameter(rbq, "");
        Intrinsics.checkNotNullParameter(rbt, "");
        this.ORxRYg = rbh;
        this.AubY = c41970rBn;
        this.sSMYrx = rbq;
        this.gHZMYf = rbt;
        this.AwvSrB = new java.util.ArrayList();
        this.zuBGHE = new java.util.ArrayList();
        this.AuCTelauCTel = new java.util.ArrayList();
        this.AxsJAY = new java.util.ArrayList();
        this.QKVWgx = c41970rBn.AhwBna();
        this.zLjUOn = c41970rBn.AYXKKw();
    }

    @Override // o.AbstractC42074rFj
    public void AEQbTJ(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ProcessingViewModel$navigateToResultPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void EZpvd(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ProcessingViewModel$navigateToFormPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
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
        AbstractC42074rFj.navigate$default(this, C43662rtX.ActionBar.DbNXlk, BundleKt.bundleOf(C56390yDp.OLrzqt("resultId", str), C56390yDp.OLrzqt("resultTarget", str2), C56390yDp.OLrzqt("ctaValue", new java.util.HashMap(map)), C56390yDp.OLrzqt("vendorType", num), C56390yDp.OLrzqt("verifyType", num2), C56390yDp.OLrzqt(OtcExtraKeys.SESSIONID, str3), C56390yDp.OLrzqt("imageFiles", map2), C56390yDp.OLrzqt("eopImageFiles", arrayList), C56390yDp.OLrzqt("playbook", str4), C56390yDp.OLrzqt("playbookParams", map3), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), null, 4, null);
    }

    public final java.util.List<rAX<UIComponentAppModel>> OLrzqt(@NotNull ProcessingAppModel processingAppModel) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        java.util.List<UIComponentAppModel> items;
        Intrinsics.checkNotNullParameter(processingAppModel, "");
        java.util.ArrayList<UIComponentAppModel> arrayList = new java.util.ArrayList();
        arrayList.addAll(processingAppModel.getItems());
        CtaAppModel cta = processingAppModel.getCta();
        if (cta != null && (items = cta.getItems()) != null) {
            arrayList.addAll(items);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (final UIComponentAppModel uIComponentAppModel : arrayList) {
            if (uIComponentAppModel instanceof CheckboxAppModel) {
                CheckboxAppModel checkboxAppModel = (CheckboxAppModel) uIComponentAppModel;
                java.lang.String id = checkboxAppModel.getId();
                if (checkboxAppModel.getRequired() != null) {
                    java.lang.Boolean required = checkboxAppModel.getRequired();
                    Intrinsics.copydefault(required);
                    zBooleanValue = required.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                rAX<java.lang.Boolean> rax = new rAX<>(id, zBooleanValue, null, null, false, 28, null);
                rax.AEQbTJ(new Function1() { // from class: o.rIS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.copydefault((java.lang.Boolean) obj);
                    }
                }, new Function1() { // from class: o.rIQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.EZpvd((java.lang.Boolean) obj);
                    }
                });
                rax.copydefault(fIwbmz());
                this.AuCTelauCTel.add(rax);
            } else if (uIComponentAppModel instanceof CTAButtonAppModel) {
                this.AxsJAY.add(new rAX<>(((CTAButtonAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null));
            } else if (uIComponentAppModel instanceof AlertAppModel) {
                rAX<java.lang.String> rax2 = new rAX<>(((AlertAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax2.copydefault(fIwbmz());
                this.AwvSrB.add(rax2);
            } else if (uIComponentAppModel instanceof CardAppModel) {
                rAX<java.lang.String> rax3 = new rAX<>(((CardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax3.copydefault(fIwbmz());
                this.AwvSrB.add(rax3);
            } else if (uIComponentAppModel instanceof HyperlinkAppModel) {
                rAX<java.lang.String> rax4 = new rAX<>(((HyperlinkAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax4.copydefault(fIwbmz());
                this.AwvSrB.add(rax4);
            } else if (uIComponentAppModel instanceof TextContentAppModel) {
                rAX<java.lang.String> rax5 = new rAX<>(((TextContentAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax5.copydefault(fIwbmz());
                this.AwvSrB.add(rax5);
            } else if (uIComponentAppModel instanceof InputDateAppModel) {
                InputDateAppModel inputDateAppModel = (InputDateAppModel) uIComponentAppModel;
                java.lang.String id2 = inputDateAppModel.getId();
                if (inputDateAppModel.getRequired() != null) {
                    java.lang.Boolean required2 = inputDateAppModel.getRequired();
                    Intrinsics.copydefault(required2);
                    zBooleanValue2 = required2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                rAX<Date> rax6 = new rAX<>(id2, zBooleanValue2, null, null, false, 28, null);
                rax6.AEQbTJ(new Function1() { // from class: o.rIU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.AEQbTJ((Date) obj);
                    }
                }, new Function1() { // from class: o.rIR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.AEQbTJ(uIComponentAppModel, (Date) obj);
                    }
                });
                rax6.copydefault(fIwbmz());
                this.zuBGHE.add(rax6);
            } else if (uIComponentAppModel instanceof FreeTextAppModel) {
                rAX<java.lang.String> rax7 = new rAX<>(((FreeTextAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax7.copydefault(fIwbmz());
                this.AwvSrB.add(rax7);
            } else if (uIComponentAppModel instanceof InputCardAppModel) {
                rAX<java.lang.String> rax8 = new rAX<>(((InputCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax8.copydefault(fIwbmz());
                this.AwvSrB.add(rax8);
            } else if (uIComponentAppModel instanceof InputChoiceAppModel) {
                InputChoiceAppModel inputChoiceAppModel = (InputChoiceAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax9 = new rAX<>(inputChoiceAppModel.getId(), Intrinsics.EZpvd(inputChoiceAppModel.getRequired(), java.lang.Boolean.TRUE), null, null, false, 28, null);
                rax9.AEQbTJ(new Function1() { // from class: o.rIT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.values((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rIY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.DbNXlk((java.lang.String) obj);
                    }
                });
                rax9.copydefault(fIwbmz());
                this.AwvSrB.add(rax9);
            } else if (uIComponentAppModel instanceof InputCardSelectAppModel) {
                InputCardSelectAppModel inputCardSelectAppModel = (InputCardSelectAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax10 = new rAX<>(inputCardSelectAppModel.getId(), Intrinsics.EZpvd(inputCardSelectAppModel.getRequired(), java.lang.Boolean.TRUE), null, null, false, 28, null);
                rax10.AEQbTJ(new Function1() { // from class: o.rIW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.AkhnZx((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rIX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return rIM.fIwbmz((java.lang.String) obj);
                    }
                });
                rax10.copydefault(fIwbmz());
                this.AwvSrB.add(rax10);
            } else if (uIComponentAppModel instanceof HorizontalRuleAppModel) {
                rAX<java.lang.String> rax11 = new rAX<>(((HorizontalRuleAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax11.copydefault(fIwbmz());
                this.AwvSrB.add(rax11);
            } else if (uIComponentAppModel instanceof HelperLabelAppModel) {
                rAX<java.lang.String> rax12 = new rAX<>(((HelperLabelAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax12.copydefault(fIwbmz());
                this.AwvSrB.add(rax12);
            } else if (uIComponentAppModel instanceof AlertCardAppModel) {
                rAX<java.lang.String> rax13 = new rAX<>(((AlertCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax13.copydefault(fIwbmz());
                this.AwvSrB.add(rax13);
            } else if (uIComponentAppModel instanceof TableCardAppModel) {
                rAX<java.lang.String> rax14 = new rAX<>(((TableCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax14.copydefault(fIwbmz());
                this.AwvSrB.add(rax14);
            }
        }
        return arrayList2;
    }

    public static final C41966rBj copydefault(java.lang.Boolean bool) {
        return rAY.AEQbTJ.EZpvd((java.lang.Object) bool);
    }

    public static final C41966rBj EZpvd(java.lang.Boolean bool) {
        return rAY.AEQbTJ.EZpvd(bool);
    }

    public static final C41966rBj AEQbTJ(Date date) {
        return rAY.AEQbTJ.EZpvd(date);
    }

    public static final C41966rBj AEQbTJ(UIComponentAppModel uIComponentAppModel, Date date) {
        return rAY.AEQbTJ.copydefault(date, ((InputDateAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj values(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj DbNXlk(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj AkhnZx(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj fIwbmz(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.Map<java.lang.String, java.lang.String> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ProcessingViewModel$postProcessing$1(this, str, str2, str4, map2, str3, map, null), 3, null);
    }
}
