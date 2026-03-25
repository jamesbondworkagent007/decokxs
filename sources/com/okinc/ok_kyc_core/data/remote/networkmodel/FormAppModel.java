package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class FormAppModel extends PageComponentAppModel implements Cloneable {
    private static final KSerializer<Object>[] $childSerializers;
    private AlertCardAppModel alertCard;
    private final String align;
    private final HashMap<String, String> amplitudeParams;
    private Boolean canClose;
    private Boolean canGoBack;
    private CtaAppModel cta;
    private CTAButtonAppModel deleteButton;
    private final DynamicTitle dynamicTitle;
    private final String faqUrl;
    private final String id;
    private final Boolean isFormRefresh;
    private List<? extends UIComponentAppModel> items;
    private final List<Reminder> notifications;
    private final Exit onExit;
    private final Boolean pageStack;
    private final PageStackType pageStackType;
    private String pageTitle;
    private final Quit quit;
    private final Boolean required;
    private final RichSubtitle richSubtitle;
    private final RichTitle richTitle;
    private CTAButtonAppModel rightButton;
    private final CTAButtonAppModel skipCta;
    private final Stepper stepper;
    private final String subtitle;
    private final String title;
    private final TitleStepper titleWithSteps;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FormAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FormAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormAppModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(parcel.readParcelable(FormAppModel.class.getClassLoader()));
            }
            CtaAppModel ctaAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CtaAppModel.CREATOR.createFromParcel(parcel);
            Stepper stepperCreateFromParcel = parcel.readInt() == 0 ? null : Stepper.CREATOR.createFromParcel(parcel);
            TitleStepper titleStepperCreateFromParcel = parcel.readInt() == 0 ? null : TitleStepper.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            Exit exitCreateFromParcel = parcel.readInt() == 0 ? null : Exit.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            CTAButtonAppModel cTAButtonAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            RichTitle richTitleCreateFromParcel = parcel.readInt() == 0 ? null : RichTitle.CREATOR.createFromParcel(parcel);
            RichSubtitle richSubtitleCreateFromParcel = parcel.readInt() == 0 ? null : RichSubtitle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int i4 = 0;
                while (i4 != i3) {
                    arrayList3.add(Reminder.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList = arrayList3;
            }
            String string4 = parcel.readString();
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            DynamicTitle dynamicTitleCreateFromParcel = parcel.readInt() == 0 ? null : DynamicTitle.CREATOR.createFromParcel(parcel);
            CTAButtonAppModel cTAButtonAppModelCreateFromParcel2 = parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str = string3;
                map = null;
            } else {
                int i5 = parcel.readInt();
                HashMap map2 = new HashMap(i5);
                int i6 = 0;
                while (i6 != i5) {
                    map2.put(parcel.readString(), parcel.readString());
                    i6++;
                    i5 = i5;
                    string3 = string3;
                }
                str = string3;
                map = map2;
            }
            return new FormAppModel(arrayList2, ctaAppModelCreateFromParcel, stepperCreateFromParcel, titleStepperCreateFromParcel, string, quitCreateFromParcel, exitCreateFromParcel, string2, boolValueOf, boolValueOf2, cTAButtonAppModelCreateFromParcel, str, richTitleCreateFromParcel, richSubtitleCreateFromParcel, arrayList, string4, boolValueOf3, string5, string6, string7, string8, boolValueOf4, dynamicTitleCreateFromParcel, cTAButtonAppModelCreateFromParcel2, map, parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlertCardAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), PageStackType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormAppModel[] newArray(int i) {
            return new FormAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component11() {
        return this.skipCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTitle component13() {
        return this.richTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichSubtitle component14() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Reminder> component15() {
        return this.notifications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel component2() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component22() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicTitle component23() {
        return this.dynamicTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component24() {
        return this.deleteButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component25() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component26() {
        return this.rightButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCardAppModel component27() {
        return this.alertCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component28() {
        return this.isFormRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageStackType component29() {
        return this.pageStackType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stepper component3() {
        return this.stepper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TitleStepper component4() {
        return this.titleWithSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component6() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit component7() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FormAppModel copy(@NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, Stepper stepper, TitleStepper titleStepper, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, String str3, RichTitle richTitle, RichSubtitle richSubtitle, List<Reminder> list2, String str4, Boolean bool3, String str5, String str6, String str7, String str8, Boolean bool4, DynamicTitle dynamicTitle, CTAButtonAppModel cTAButtonAppModel2, HashMap<String, String> map, CTAButtonAppModel cTAButtonAppModel3, AlertCardAppModel alertCardAppModel, Boolean bool5, @NotNull PageStackType pageStackType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pageStackType, "");
        return new FormAppModel(list, ctaAppModel, stepper, titleStepper, str, quit, exit, str2, bool, bool2, cTAButtonAppModel, str3, richTitle, richSubtitle, list2, str4, bool3, str5, str6, str7, str8, bool4, dynamicTitle, cTAButtonAppModel2, map, cTAButtonAppModel3, alertCardAppModel, bool5, pageStackType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormAppModel)) {
            return false;
        }
        FormAppModel formAppModel = (FormAppModel) obj;
        return Intrinsics.EZpvd(this.items, formAppModel.items) && Intrinsics.EZpvd(this.cta, formAppModel.cta) && Intrinsics.EZpvd(this.stepper, formAppModel.stepper) && Intrinsics.EZpvd(this.titleWithSteps, formAppModel.titleWithSteps) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) formAppModel.pageTitle) && Intrinsics.EZpvd(this.quit, formAppModel.quit) && Intrinsics.EZpvd(this.onExit, formAppModel.onExit) && Intrinsics.EZpvd((Object) this.align, (Object) formAppModel.align) && Intrinsics.EZpvd(this.canGoBack, formAppModel.canGoBack) && Intrinsics.EZpvd(this.canClose, formAppModel.canClose) && Intrinsics.EZpvd(this.skipCta, formAppModel.skipCta) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) formAppModel.faqUrl) && Intrinsics.EZpvd(this.richTitle, formAppModel.richTitle) && Intrinsics.EZpvd(this.richSubtitle, formAppModel.richSubtitle) && Intrinsics.EZpvd(this.notifications, formAppModel.notifications) && Intrinsics.EZpvd((Object) this.id, (Object) formAppModel.id) && Intrinsics.EZpvd(this.required, formAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) formAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) formAppModel.value) && Intrinsics.EZpvd((Object) this.title, (Object) formAppModel.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) formAppModel.subtitle) && Intrinsics.EZpvd(this.pageStack, formAppModel.pageStack) && Intrinsics.EZpvd(this.dynamicTitle, formAppModel.dynamicTitle) && Intrinsics.EZpvd(this.deleteButton, formAppModel.deleteButton) && Intrinsics.EZpvd(this.amplitudeParams, formAppModel.amplitudeParams) && Intrinsics.EZpvd(this.rightButton, formAppModel.rightButton) && Intrinsics.EZpvd(this.alertCard, formAppModel.alertCard) && Intrinsics.EZpvd(this.isFormRefresh, formAppModel.isFormRefresh) && this.pageStackType == formAppModel.pageStackType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCardAppModel getAlertCard() {
        return this.alertCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlign() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getAmplitudeParams() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanClose() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanGoBack() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getDeleteButton() {
        return this.deleteButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicTitle getDynamicTitle() {
        return this.dynamicTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    public final List<UIComponentAppModel> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Reminder> getNotifications() {
        return this.notifications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit getOnExit() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public Boolean getPageStack() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageStackType getPageStackType() {
        return this.pageStackType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit getQuit() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichSubtitle getRichSubtitle() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTitle getRichTitle() {
        return this.richTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getRightButton() {
        return this.rightButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getSkipCta() {
        return this.skipCta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stepper getStepper() {
        return this.stepper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TitleStepper getTitleWithSteps() {
        return this.titleWithSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.items.hashCode();
        CtaAppModel ctaAppModel = this.cta;
        int iHashCode2 = ctaAppModel == null ? 0 : ctaAppModel.hashCode();
        Stepper stepper = this.stepper;
        int iHashCode3 = stepper == null ? 0 : stepper.hashCode();
        TitleStepper titleStepper = this.titleWithSteps;
        int iHashCode4 = titleStepper == null ? 0 : titleStepper.hashCode();
        String str = this.pageTitle;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Quit quit = this.quit;
        int iHashCode6 = quit == null ? 0 : quit.hashCode();
        Exit exit = this.onExit;
        int iHashCode7 = exit == null ? 0 : exit.hashCode();
        String str2 = this.align;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.canGoBack;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canClose;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.skipCta;
        int iHashCode11 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        String str3 = this.faqUrl;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        RichTitle richTitle = this.richTitle;
        int iHashCode13 = richTitle == null ? 0 : richTitle.hashCode();
        RichSubtitle richSubtitle = this.richSubtitle;
        int iHashCode14 = richSubtitle == null ? 0 : richSubtitle.hashCode();
        List<Reminder> list = this.notifications;
        int iHashCode15 = list == null ? 0 : list.hashCode();
        String str4 = this.id;
        int iHashCode16 = str4 == null ? 0 : str4.hashCode();
        Boolean bool3 = this.required;
        int iHashCode17 = bool3 == null ? 0 : bool3.hashCode();
        String str5 = this.version;
        int iHashCode18 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.value;
        int iHashCode19 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.title;
        int iHashCode20 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.subtitle;
        int iHashCode21 = str8 == null ? 0 : str8.hashCode();
        Boolean bool4 = this.pageStack;
        int iHashCode22 = bool4 == null ? 0 : bool4.hashCode();
        DynamicTitle dynamicTitle = this.dynamicTitle;
        int iHashCode23 = dynamicTitle == null ? 0 : dynamicTitle.hashCode();
        CTAButtonAppModel cTAButtonAppModel2 = this.deleteButton;
        int iHashCode24 = cTAButtonAppModel2 == null ? 0 : cTAButtonAppModel2.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        int iHashCode25 = map == null ? 0 : map.hashCode();
        CTAButtonAppModel cTAButtonAppModel3 = this.rightButton;
        int iHashCode26 = cTAButtonAppModel3 == null ? 0 : cTAButtonAppModel3.hashCode();
        AlertCardAppModel alertCardAppModel = this.alertCard;
        int iHashCode27 = alertCardAppModel == null ? 0 : alertCardAppModel.hashCode();
        Boolean bool5 = this.isFormRefresh;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + (bool5 == null ? 0 : bool5.hashCode())) * 31) + this.pageStackType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFormRefresh() {
        return this.isFormRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlertCard(AlertCardAppModel alertCardAppModel) {
        this.alertCard = alertCardAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanClose(Boolean bool) {
        this.canClose = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanGoBack(Boolean bool) {
        this.canGoBack = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCta(CtaAppModel ctaAppModel) {
        this.cta = ctaAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleteButton(CTAButtonAppModel cTAButtonAppModel) {
        this.deleteButton = cTAButtonAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItems(@NotNull List<? extends UIComponentAppModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageTitle(String str) {
        this.pageTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightButton(CTAButtonAppModel cTAButtonAppModel) {
        this.rightButton = cTAButtonAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FormAppModel(items=" + this.items + ", cta=" + this.cta + ", stepper=" + this.stepper + ", titleWithSteps=" + this.titleWithSteps + ", pageTitle=" + this.pageTitle + ", quit=" + this.quit + ", onExit=" + this.onExit + ", align=" + this.align + ", canGoBack=" + this.canGoBack + ", canClose=" + this.canClose + ", skipCta=" + this.skipCta + ", faqUrl=" + this.faqUrl + ", richTitle=" + this.richTitle + ", richSubtitle=" + this.richSubtitle + ", notifications=" + this.notifications + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ", dynamicTitle=" + this.dynamicTitle + ", deleteButton=" + this.deleteButton + ", amplitudeParams=" + this.amplitudeParams + ", rightButton=" + this.rightButton + ", alertCard=" + this.alertCard + ", isFormRefresh=" + this.isFormRefresh + ", pageStackType=" + this.pageStackType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<? extends UIComponentAppModel> list = this.items;
        parcel.writeInt(list.size());
        Iterator<? extends UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        CtaAppModel ctaAppModel = this.cta;
        if (ctaAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaAppModel.writeToParcel(parcel, i);
        }
        Stepper stepper = this.stepper;
        if (stepper == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stepper.writeToParcel(parcel, i);
        }
        TitleStepper titleStepper = this.titleWithSteps;
        if (titleStepper == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            titleStepper.writeToParcel(parcel, i);
        }
        parcel.writeString(this.pageTitle);
        Quit quit = this.quit;
        if (quit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quit.writeToParcel(parcel, i);
        }
        Exit exit = this.onExit;
        if (exit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exit.writeToParcel(parcel, i);
        }
        parcel.writeString(this.align);
        Boolean bool = this.canGoBack;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.canClose;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        CTAButtonAppModel cTAButtonAppModel = this.skipCta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.faqUrl);
        RichTitle richTitle = this.richTitle;
        if (richTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richTitle.writeToParcel(parcel, i);
        }
        RichSubtitle richSubtitle = this.richSubtitle;
        if (richSubtitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richSubtitle.writeToParcel(parcel, i);
        }
        List<Reminder> list2 = this.notifications;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Reminder> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.id);
        Boolean bool3 = this.required;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool4 = this.pageStack;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        DynamicTitle dynamicTitle = this.dynamicTitle;
        if (dynamicTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicTitle.writeToParcel(parcel, i);
        }
        CTAButtonAppModel cTAButtonAppModel2 = this.deleteButton;
        if (cTAButtonAppModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel2.writeToParcel(parcel, i);
        }
        HashMap<String, String> map = this.amplitudeParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        CTAButtonAppModel cTAButtonAppModel3 = this.rightButton;
        if (cTAButtonAppModel3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel3.writeToParcel(parcel, i);
        }
        AlertCardAppModel alertCardAppModel = this.alertCard;
        if (alertCardAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertCardAppModel.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.isFormRefresh;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pageStackType.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FormAppModel> serializer() {
            return FormAppModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(Reminder$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType", PageStackType.values())};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormAppModel(int i, List list, CtaAppModel ctaAppModel, Stepper stepper, TitleStepper titleStepper, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, String str3, RichTitle richTitle, RichSubtitle richSubtitle, List list2, String str4, Boolean bool3, String str5, String str6, String str7, String str8, Boolean bool4, DynamicTitle dynamicTitle, CTAButtonAppModel cTAButtonAppModel2, HashMap map, CTAButtonAppModel cTAButtonAppModel3, AlertCardAppModel alertCardAppModel, Boolean bool5, PageStackType pageStackType, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1968897 != (i & 1968897)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1968897, FormAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaAppModel;
        }
        if ((i & 4) == 0) {
            this.stepper = null;
        } else {
            this.stepper = stepper;
        }
        if ((i & 8) == 0) {
            this.titleWithSteps = null;
        } else {
            this.titleWithSteps = titleStepper;
        }
        if ((i & 16) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str;
        }
        if ((i & 32) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        if ((i & 64) == 0) {
            this.onExit = null;
        } else {
            this.onExit = exit;
        }
        if ((i & 128) == 0) {
            this.align = null;
        } else {
            this.align = str2;
        }
        this.canGoBack = bool;
        this.canClose = bool2;
        if ((i & 1024) == 0) {
            this.skipCta = null;
        } else {
            this.skipCta = cTAButtonAppModel;
        }
        this.faqUrl = str3;
        if ((i & 4096) == 0) {
            this.richTitle = null;
        } else {
            this.richTitle = richTitle;
        }
        if ((i & 8192) == 0) {
            this.richSubtitle = null;
        } else {
            this.richSubtitle = richSubtitle;
        }
        if ((i & 16384) == 0) {
            this.notifications = null;
        } else {
            this.notifications = list2;
        }
        if ((32768 & i) == 0) {
            this.id = null;
        } else {
            this.id = str4;
        }
        this.required = (65536 & i) == 0 ? Boolean.FALSE : bool3;
        this.version = str5;
        this.value = str6;
        this.title = str7;
        this.subtitle = str8;
        this.pageStack = (2097152 & i) == 0 ? Boolean.FALSE : bool4;
        if ((4194304 & i) == 0) {
            this.dynamicTitle = null;
        } else {
            this.dynamicTitle = dynamicTitle;
        }
        if ((8388608 & i) == 0) {
            this.deleteButton = null;
        } else {
            this.deleteButton = cTAButtonAppModel2;
        }
        if ((16777216 & i) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
        if ((33554432 & i) == 0) {
            this.rightButton = null;
        } else {
            this.rightButton = cTAButtonAppModel3;
        }
        if ((67108864 & i) == 0) {
            this.alertCard = null;
        } else {
            this.alertCard = alertCardAppModel;
        }
        this.isFormRefresh = (134217728 & i) == 0 ? Boolean.FALSE : bool5;
        this.pageStackType = (i & 268435456) == 0 ? PageStackType.FULLSCREEN : pageStackType;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(FormAppModel formAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponentAppModel.write$Self(formAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], formAppModel.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || formAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CtaAppModel$$serializer.INSTANCE, formAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || formAppModel.stepper != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Stepper$$serializer.INSTANCE, formAppModel.stepper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || formAppModel.titleWithSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, TitleStepper$$serializer.INSTANCE, formAppModel.titleWithSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || formAppModel.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, formAppModel.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || formAppModel.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Quit$$serializer.INSTANCE, formAppModel.quit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || formAppModel.onExit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Exit$$serializer.INSTANCE, formAppModel.onExit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || formAppModel.align != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, formAppModel.align);
        }
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, formAppModel.canGoBack);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, formAppModel.canClose);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || formAppModel.skipCta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, CTAButtonAppModel$$serializer.INSTANCE, formAppModel.skipCta);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, formAppModel.faqUrl);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || formAppModel.richTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, RichTitle$$serializer.INSTANCE, formAppModel.richTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || formAppModel.richSubtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, RichSubtitle$$serializer.INSTANCE, formAppModel.richSubtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || formAppModel.notifications != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], formAppModel.notifications);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || formAppModel.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, formAppModel.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(formAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, formAppModel.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, formAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, formAppModel.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, formAppModel.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, formAppModel.getSubtitle());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(formAppModel.getPageStack(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, booleanSerializer, formAppModel.getPageStack());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || formAppModel.dynamicTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, DynamicTitle$$serializer.INSTANCE, formAppModel.dynamicTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || formAppModel.deleteButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, CTAButtonAppModel$$serializer.INSTANCE, formAppModel.deleteButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || formAppModel.amplitudeParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr[24], formAppModel.amplitudeParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || formAppModel.rightButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, CTAButtonAppModel$$serializer.INSTANCE, formAppModel.rightButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || formAppModel.alertCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, AlertCardAppModel$$serializer.INSTANCE, formAppModel.alertCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd(formAppModel.isFormRefresh, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, booleanSerializer, formAppModel.isFormRefresh);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && formAppModel.pageStackType == PageStackType.FULLSCREEN) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 28, kSerializerArr[28], formAppModel.pageStackType);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00dd: CONSTRUCTOR 
  (r34v0 java.util.List)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel:?: TERNARY null = ((wrap:int:0x0002: ARITH (r63v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel) : (r35v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper:?: TERNARY null = ((wrap:int:0x000b: ARITH (r63v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper) : (r36v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper:?: TERNARY null = ((wrap:int:0x0013: ARITH (r63v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper) : (r37v0 com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r63v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x0023: ARITH (r63v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r39v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Exit:?: TERNARY null = ((wrap:int:0x002b: ARITH (r63v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Exit) : (r40v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Exit))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r63v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (r42v0 java.lang.Boolean)
  (r43v0 java.lang.Boolean)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x003b: ARITH (r63v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r44v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (r45v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle:?: TERNARY null = ((wrap:int:0x0043: ARITH (r63v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle) : (r46v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle:?: TERNARY null = ((wrap:int:0x004c: ARITH (r63v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle) : (r47v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0055: ARITH (r63v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r48v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (32768 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006b: ARITH (65536 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0070: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r50v0 java.lang.Boolean))
  (r51v0 java.lang.String)
  (r52v0 java.lang.String)
  (r53v0 java.lang.String)
  (r54v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0077: ARITH (2097152 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r55v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle:?: TERNARY null = ((wrap:int:0x0083: ARITH (4194304 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle) : (r56v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x008d: ARITH (8388608 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r57v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0097: ARITH (16777216 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r58v0 java.util.HashMap))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x00a1: ARITH (33554432 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r59v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel:?: TERNARY null = ((wrap:int:0x00ab: ARITH (67108864 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel) : (r60v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b5: ARITH (134217728 int) & (r63v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ba: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r61v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r63v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c6: SGET  A[WRAPPED] (LINE:413) com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType.FULLSCREEN com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType) : (r62v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType))
 A[MD:(java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper, com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Reminder>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.util.HashMap<java.lang.String, java.lang.String>, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType):void (m)] (LINE:384) call: com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel.<init>(java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper, com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.util.HashMap, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType):void type: THIS */
    public /* synthetic */ FormAppModel(List list, CtaAppModel ctaAppModel, Stepper stepper, TitleStepper titleStepper, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, String str3, RichTitle richTitle, RichSubtitle richSubtitle, List list2, String str4, Boolean bool3, String str5, String str6, String str7, String str8, Boolean bool4, DynamicTitle dynamicTitle, CTAButtonAppModel cTAButtonAppModel2, HashMap map, CTAButtonAppModel cTAButtonAppModel3, AlertCardAppModel alertCardAppModel, Boolean bool5, PageStackType pageStackType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : ctaAppModel, (i & 4) != 0 ? null : stepper, (i & 8) != 0 ? null : titleStepper, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : quit, (i & 64) != 0 ? null : exit, (i & 128) != 0 ? null : str2, bool, bool2, (i & 1024) != 0 ? null : cTAButtonAppModel, str3, (i & 4096) != 0 ? null : richTitle, (i & 8192) != 0 ? null : richSubtitle, (i & 16384) != 0 ? null : list2, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? Boolean.FALSE : bool3, str5, str6, str7, str8, (2097152 & i) != 0 ? Boolean.FALSE : bool4, (4194304 & i) != 0 ? null : dynamicTitle, (8388608 & i) != 0 ? null : cTAButtonAppModel2, (16777216 & i) != 0 ? null : map, (33554432 & i) != 0 ? null : cTAButtonAppModel3, (67108864 & i) != 0 ? null : alertCardAppModel, (134217728 & i) != 0 ? Boolean.FALSE : bool5, (i & 268435456) != 0 ? PageStackType.FULLSCREEN : pageStackType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormAppModel(@NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, Stepper stepper, TitleStepper titleStepper, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, String str3, RichTitle richTitle, RichSubtitle richSubtitle, List<Reminder> list2, String str4, Boolean bool3, String str5, String str6, String str7, String str8, Boolean bool4, DynamicTitle dynamicTitle, CTAButtonAppModel cTAButtonAppModel2, HashMap<String, String> map, CTAButtonAppModel cTAButtonAppModel3, AlertCardAppModel alertCardAppModel, Boolean bool5, @NotNull PageStackType pageStackType) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pageStackType, "");
        this.items = list;
        this.cta = ctaAppModel;
        this.stepper = stepper;
        this.titleWithSteps = titleStepper;
        this.pageTitle = str;
        this.quit = quit;
        this.onExit = exit;
        this.align = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        this.skipCta = cTAButtonAppModel;
        this.faqUrl = str3;
        this.richTitle = richTitle;
        this.richSubtitle = richSubtitle;
        this.notifications = list2;
        this.id = str4;
        this.required = bool3;
        this.version = str5;
        this.value = str6;
        this.title = str7;
        this.subtitle = str8;
        this.pageStack = bool4;
        this.dynamicTitle = dynamicTitle;
        this.deleteButton = cTAButtonAppModel2;
        this.amplitudeParams = map;
        this.rightButton = cTAButtonAppModel3;
        this.alertCard = alertCardAppModel;
        this.isFormRefresh = bool5;
        this.pageStackType = pageStackType;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FormAppModel m6822clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.copydefault(objClone, "");
        return (FormAppModel) objClone;
    }
}
