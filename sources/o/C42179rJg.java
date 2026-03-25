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
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.EditCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HorizontalRuleAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HyperlinkAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.IllustrationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ImageListAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardSelectAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TableCardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TextContentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.presentation.resultTemplate.ResultViewModel$navigateToFormPage$1;
import com.okinc.ok_kyc_core.presentation.resultTemplate.ResultViewModel$navigateToProcessingPage$1;
import com.okinc.ok_kyc_core.presentation.resultTemplate.ResultViewModel$navigateToResultPage$1;
import com.okinc.ok_kyc_core.presentation.resultTemplate.ResultViewModel$navigateToSelectWalletVerificationPage$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42179rJg extends AbstractC42074rFj {
    public final C41970rBn AuCTelauCTel;
    public final rBG AubY;
    public java.util.List<rAX<java.lang.String>> AwvSrB;
    public final rBQ AxsJAY;
    public final rBJ QOLQEE;
    public final rBT gHZMYf;
    public java.util.List<rAX<Date>> sSMYrx;
    public java.util.List<rAX<java.lang.Boolean>> zLjUOn;
    public java.util.List<rAX<java.lang.String>> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.Boolean>> AuCTelauCTel() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.String>> AubY() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBQ DbNXlk() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBJ fARcdN() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBG valueOf() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBT values() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<rAX<java.lang.String>> zLjUOn() {
        return this.AwvSrB;
    }

    public C42179rJg(@NotNull C41970rBn c41970rBn, @NotNull rBQ rbq, @NotNull rBT rbt) {
        Intrinsics.checkNotNullParameter(c41970rBn, "");
        Intrinsics.checkNotNullParameter(rbq, "");
        Intrinsics.checkNotNullParameter(rbt, "");
        this.AuCTelauCTel = c41970rBn;
        this.AxsJAY = rbq;
        this.gHZMYf = rbt;
        this.zuBGHE = new java.util.ArrayList();
        this.sSMYrx = new java.util.ArrayList();
        this.zLjUOn = new java.util.ArrayList();
        this.AwvSrB = new java.util.ArrayList();
        this.QOLQEE = c41970rBn.AhwBna();
        this.AubY = c41970rBn.AYXKKw();
    }

    public final void zsXlph() {
        this.zuBGHE.clear();
        this.AwvSrB.clear();
        this.zLjUOn.clear();
        this.sSMYrx.clear();
        fIwbmz().KWHzl();
    }

    @Override // o.AbstractC42074rFj
    public void AEQbTJ(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResultViewModel$navigateToResultPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void KWHzl(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResultViewModel$navigateToSelectWalletVerificationPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void EZpvd(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResultViewModel$navigateToFormPage$1(this, pageComponentAppModel, str, map, pageComponentProfile, navOptions, null), 3, null);
    }

    @Override // o.AbstractC42074rFj
    public void OLrzqt(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ResultViewModel$navigateToProcessingPage$1(this, pageComponentAppModel, str, str2, map, pageComponentProfile, navOptions, null), 3, null);
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
        AbstractC42074rFj.navigate$default(this, C43662rtX.ActionBar.ejfBZ, BundleKt.bundleOf(C56390yDp.OLrzqt("resultId", str), C56390yDp.OLrzqt("resultTarget", str2), C56390yDp.OLrzqt("ctaValue", new java.util.HashMap(map)), C56390yDp.OLrzqt("vendorType", num), C56390yDp.OLrzqt("verifyType", num2), C56390yDp.OLrzqt(OtcExtraKeys.SESSIONID, str3), C56390yDp.OLrzqt("imageFiles", map2), C56390yDp.OLrzqt("eopImageFiles", arrayList), C56390yDp.OLrzqt("playbook", str4), C56390yDp.OLrzqt("playbookParams", map3), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), null, 4, null);
    }

    public final java.util.List<rAX<UIComponentAppModel>> EZpvd(@NotNull ResultAppModel resultAppModel) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        java.util.List<UIComponentAppModel> items;
        Intrinsics.checkNotNullParameter(resultAppModel, "");
        java.util.ArrayList<UIComponentAppModel> arrayList = new java.util.ArrayList();
        arrayList.addAll(resultAppModel.getItems());
        CtaAppModel cta = resultAppModel.getCta();
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
                rax.AEQbTJ(new Function1() { // from class: o.rJf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.AEQbTJ((java.lang.Boolean) obj);
                    }
                }, new Function1() { // from class: o.rJo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.KWHzl((java.lang.Boolean) obj);
                    }
                });
                rax.copydefault(fIwbmz());
                this.zLjUOn.add(rax);
            } else if (uIComponentAppModel instanceof CTAButtonAppModel) {
                this.AwvSrB.add(new rAX<>(((CTAButtonAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null));
            } else if (uIComponentAppModel instanceof IllustrationAppModel) {
                rAX<java.lang.String> rax2 = new rAX<>(((IllustrationAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax2.copydefault(fIwbmz());
                this.zuBGHE.add(rax2);
            } else if (uIComponentAppModel instanceof AlertAppModel) {
                rAX<java.lang.String> rax3 = new rAX<>(((AlertAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax3.copydefault(fIwbmz());
                this.zuBGHE.add(rax3);
            } else if (uIComponentAppModel instanceof CardAppModel) {
                rAX<java.lang.String> rax4 = new rAX<>(((CardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax4.copydefault(fIwbmz());
                this.zuBGHE.add(rax4);
            } else if (uIComponentAppModel instanceof HyperlinkAppModel) {
                rAX<java.lang.String> rax5 = new rAX<>(((HyperlinkAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax5.copydefault(fIwbmz());
                this.zuBGHE.add(rax5);
            } else if (uIComponentAppModel instanceof TextContentAppModel) {
                rAX<java.lang.String> rax6 = new rAX<>(((TextContentAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax6.copydefault(fIwbmz());
                this.zuBGHE.add(rax6);
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
                rAX<Date> rax7 = new rAX<>(id2, zBooleanValue2, null, null, false, 28, null);
                rax7.AEQbTJ(new Function1() { // from class: o.rJl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.OLrzqt((Date) obj);
                    }
                }, new Function1() { // from class: o.rJm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.copydefault(uIComponentAppModel, (Date) obj);
                    }
                });
                rax7.copydefault(fIwbmz());
                this.sSMYrx.add(rax7);
            } else if (uIComponentAppModel instanceof FreeTextAppModel) {
                rAX<java.lang.String> rax8 = new rAX<>(((FreeTextAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax8.copydefault(fIwbmz());
                this.zuBGHE.add(rax8);
            } else if (uIComponentAppModel instanceof ImageListAppModel) {
                rAX<java.lang.String> rax9 = new rAX<>(((ImageListAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax9.copydefault(fIwbmz());
                this.zuBGHE.add(rax9);
            } else if (uIComponentAppModel instanceof InputCardAppModel) {
                rAX<java.lang.String> rax10 = new rAX<>(((InputCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax10.copydefault(fIwbmz());
                this.zuBGHE.add(rax10);
            } else if (uIComponentAppModel instanceof InputChoiceAppModel) {
                InputChoiceAppModel inputChoiceAppModel = (InputChoiceAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax11 = new rAX<>(inputChoiceAppModel.getId(), Intrinsics.EZpvd(inputChoiceAppModel.getRequired(), java.lang.Boolean.TRUE), null, null, false, 28, null);
                rax11.AEQbTJ(new Function1() { // from class: o.rJn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.fetchVPNInfo((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rJk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.fIwbmz((java.lang.String) obj);
                    }
                });
                rax11.copydefault(fIwbmz());
                this.zuBGHE.add(rax11);
            } else if (uIComponentAppModel instanceof InputCardSelectAppModel) {
                InputCardSelectAppModel inputCardSelectAppModel = (InputCardSelectAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax12 = new rAX<>(inputCardSelectAppModel.getId(), Intrinsics.EZpvd(inputCardSelectAppModel.getRequired(), java.lang.Boolean.TRUE), null, null, false, 28, null);
                rax12.AEQbTJ(new Function1() { // from class: o.rJr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.fJNWhG((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rJs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.AuCTel((java.lang.String) obj);
                    }
                });
                rax12.copydefault(fIwbmz());
                this.zuBGHE.add(rax12);
            } else if (uIComponentAppModel instanceof HorizontalRuleAppModel) {
                rAX<java.lang.String> rax13 = new rAX<>(((HorizontalRuleAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax13.copydefault(fIwbmz());
                this.zuBGHE.add(rax13);
            } else if (uIComponentAppModel instanceof CtaCardAppModel) {
                rAX<java.lang.String> rax14 = new rAX<>(((CtaCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax14.copydefault(fIwbmz());
                this.zuBGHE.add(rax14);
            } else if (uIComponentAppModel instanceof EditCardAppModel) {
                EditCardAppModel editCardAppModel = (EditCardAppModel) uIComponentAppModel;
                rAX<java.lang.String> rax15 = new rAX<>(editCardAppModel.getId(), Intrinsics.EZpvd(editCardAppModel.getRequired(), java.lang.Boolean.TRUE), null, null, false, 28, null);
                rax15.AEQbTJ(new Function1() { // from class: o.rJq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.fARcdN((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.rJt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42179rJg.ejfBZ((java.lang.String) obj);
                    }
                });
                rax15.copydefault(fIwbmz());
                this.zuBGHE.add(rax15);
            } else if (uIComponentAppModel instanceof HelperLabelAppModel) {
                rAX<java.lang.String> rax16 = new rAX<>(((HelperLabelAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax16.copydefault(fIwbmz());
                this.zuBGHE.add(rax16);
            } else if (uIComponentAppModel instanceof AlertCardAppModel) {
                rAX<java.lang.String> rax17 = new rAX<>(((AlertCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax17.copydefault(fIwbmz());
                this.zuBGHE.add(rax17);
            } else if (uIComponentAppModel instanceof TableCardAppModel) {
                rAX<java.lang.String> rax18 = new rAX<>(((TableCardAppModel) uIComponentAppModel).getId(), false, null, null, false, 28, null);
                rax18.copydefault(fIwbmz());
                this.zuBGHE.add(rax18);
            }
        }
        return arrayList2;
    }

    public static final C41966rBj AEQbTJ(java.lang.Boolean bool) {
        return rAY.AEQbTJ.EZpvd((java.lang.Object) bool);
    }

    public static final C41966rBj KWHzl(java.lang.Boolean bool) {
        return rAY.AEQbTJ.EZpvd(bool);
    }

    public static final C41966rBj OLrzqt(Date date) {
        return rAY.AEQbTJ.EZpvd(date);
    }

    public static final C41966rBj copydefault(UIComponentAppModel uIComponentAppModel, Date date) {
        return rAY.AEQbTJ.copydefault(date, ((InputDateAppModel) uIComponentAppModel).getRules());
    }

    public static final C41966rBj fetchVPNInfo(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj fIwbmz(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj fJNWhG(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj AuCTel(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }

    public static final C41966rBj fARcdN(java.lang.String str) {
        return rAY.AEQbTJ.EZpvd(str);
    }

    public static final C41966rBj ejfBZ(java.lang.String str) {
        return rAY.AEQbTJ.AEQbTJ(str);
    }
}
