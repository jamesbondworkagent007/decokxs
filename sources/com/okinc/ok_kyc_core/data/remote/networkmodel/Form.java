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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("form")
@Serializable
public final class Form extends PageComponent {
    private static final KSerializer<Object>[] $childSerializers;
    private final String align;
    private final HashMap<String, String> amplitudeParams;
    private final Boolean canClose;
    private final Boolean canGoBack;
    private final Cta cta;
    private final CTAButton deleteButton;
    private final DynamicTitle dynamicTitle;
    private final String faqUrl;
    private final String id;
    private final Boolean isFormRefresh;
    private final JsonArray items;
    private final List<ReminderData> notifications;
    private final Exit onExit;
    private final Boolean pageStack;
    private final String pageStackType;
    private final String pageTitle;
    private final Quit quit;
    private final Boolean required;
    private final RichSubtitleData richSubtitle;
    private final RichTitle richTitle;
    private final CTAButton rightButton;
    private final Stepper stepper;
    private final String subtitle;
    private final String title;
    private final TitleStepper titleWithSteps;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Form> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Form> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            Boolean boolValueOf3;
            HashMap map;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "");
            JsonArray jsonArray = (JsonArray) parcel.readValue(Form.class.getClassLoader());
            Cta cta = (Cta) parcel.readParcelable(Form.class.getClassLoader());
            Stepper stepperCreateFromParcel = parcel.readInt() == 0 ? null : Stepper.CREATOR.createFromParcel(parcel);
            TitleStepper titleStepperCreateFromParcel = parcel.readInt() == 0 ? null : TitleStepper.CREATOR.createFromParcel(parcel);
            DynamicTitle dynamicTitleCreateFromParcel = parcel.readInt() == 0 ? null : DynamicTitle.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            Exit exitCreateFromParcel = parcel.readInt() == 0 ? null : Exit.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            RichTitle richTitleCreateFromParcel = parcel.readInt() == 0 ? null : RichTitle.CREATOR.createFromParcel(parcel);
            RichSubtitleData richSubtitleDataCreateFromParcel = parcel.readInt() == 0 ? null : RichSubtitleData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(ReminderData.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            CTAButton cTAButtonCreateFromParcel2 = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i3 = parcel.readInt();
                HashMap map2 = new HashMap(i3);
                int i4 = 0;
                while (i4 != i3) {
                    map2.put(parcel.readString(), parcel.readString());
                    i4++;
                    i3 = i3;
                }
                map = map2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Form(jsonArray, cta, stepperCreateFromParcel, titleStepperCreateFromParcel, dynamicTitleCreateFromParcel, string, quitCreateFromParcel, exitCreateFromParcel, string2, boolValueOf, boolValueOf2, string3, richTitleCreateFromParcel, richSubtitleDataCreateFromParcel, arrayList, string4, boolValueOf3, string5, string6, string7, string8, cTAButtonCreateFromParcel, cTAButtonCreateFromParcel2, map, boolValueOf4, boolValueOf5, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form[] newArray(int i) {
            return new Form[i];
        }
    }

    @SerialName("step")
    public static /* synthetic */ void getStepper$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.canClose;
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
    public final RichSubtitleData component14() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReminderData> component15() {
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
    public final Cta component2() {
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
    public final CTAButton component22() {
        return this.deleteButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component23() {
        return this.rightButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component24() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component25() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component26() {
        return this.isFormRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
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
    public final DynamicTitle component5() {
        return this.dynamicTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component7() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit component8() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Form copy(@NotNull JsonArray jsonArray, Cta cta, Stepper stepper, TitleStepper titleStepper, DynamicTitle dynamicTitle, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, String str3, RichTitle richTitle, RichSubtitleData richSubtitleData, List<ReminderData> list, String str4, Boolean bool3, String str5, String str6, String str7, String str8, CTAButton cTAButton, CTAButton cTAButton2, HashMap<String, String> map, Boolean bool4, Boolean bool5, String str9) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new Form(jsonArray, cta, stepper, titleStepper, dynamicTitle, str, quit, exit, str2, bool, bool2, str3, richTitle, richSubtitleData, list, str4, bool3, str5, str6, str7, str8, cTAButton, cTAButton2, map, bool4, bool5, str9);
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
        if (!(obj instanceof Form)) {
            return false;
        }
        Form form = (Form) obj;
        return Intrinsics.EZpvd(this.items, form.items) && Intrinsics.EZpvd(this.cta, form.cta) && Intrinsics.EZpvd(this.stepper, form.stepper) && Intrinsics.EZpvd(this.titleWithSteps, form.titleWithSteps) && Intrinsics.EZpvd(this.dynamicTitle, form.dynamicTitle) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) form.pageTitle) && Intrinsics.EZpvd(this.quit, form.quit) && Intrinsics.EZpvd(this.onExit, form.onExit) && Intrinsics.EZpvd((Object) this.align, (Object) form.align) && Intrinsics.EZpvd(this.canGoBack, form.canGoBack) && Intrinsics.EZpvd(this.canClose, form.canClose) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) form.faqUrl) && Intrinsics.EZpvd(this.richTitle, form.richTitle) && Intrinsics.EZpvd(this.richSubtitle, form.richSubtitle) && Intrinsics.EZpvd(this.notifications, form.notifications) && Intrinsics.EZpvd((Object) this.id, (Object) form.id) && Intrinsics.EZpvd(this.required, form.required) && Intrinsics.EZpvd((Object) this.version, (Object) form.version) && Intrinsics.EZpvd((Object) this.value, (Object) form.value) && Intrinsics.EZpvd((Object) this.title, (Object) form.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) form.subtitle) && Intrinsics.EZpvd(this.deleteButton, form.deleteButton) && Intrinsics.EZpvd(this.rightButton, form.rightButton) && Intrinsics.EZpvd(this.amplitudeParams, form.amplitudeParams) && Intrinsics.EZpvd(this.pageStack, form.pageStack) && Intrinsics.EZpvd(this.isFormRefresh, form.isFormRefresh) && Intrinsics.EZpvd((Object) this.pageStackType, (Object) form.pageStackType);
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
    public final Cta getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getDeleteButton() {
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReminderData> getNotifications() {
        return this.notifications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit getOnExit() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getPageStack() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageStackType() {
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichSubtitleData getRichSubtitle() {
        return this.richSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTitle getRichTitle() {
        return this.richTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getRightButton() {
        return this.rightButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Stepper getStepper() {
        return this.stepper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TitleStepper getTitleWithSteps() {
        return this.titleWithSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.items.hashCode();
        Cta cta = this.cta;
        int iHashCode2 = cta == null ? 0 : cta.hashCode();
        Stepper stepper = this.stepper;
        int iHashCode3 = stepper == null ? 0 : stepper.hashCode();
        TitleStepper titleStepper = this.titleWithSteps;
        int iHashCode4 = titleStepper == null ? 0 : titleStepper.hashCode();
        DynamicTitle dynamicTitle = this.dynamicTitle;
        int iHashCode5 = dynamicTitle == null ? 0 : dynamicTitle.hashCode();
        String str = this.pageTitle;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Quit quit = this.quit;
        int iHashCode7 = quit == null ? 0 : quit.hashCode();
        Exit exit = this.onExit;
        int iHashCode8 = exit == null ? 0 : exit.hashCode();
        String str2 = this.align;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.canGoBack;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canClose;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.faqUrl;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        RichTitle richTitle = this.richTitle;
        int iHashCode13 = richTitle == null ? 0 : richTitle.hashCode();
        RichSubtitleData richSubtitleData = this.richSubtitle;
        int iHashCode14 = richSubtitleData == null ? 0 : richSubtitleData.hashCode();
        List<ReminderData> list = this.notifications;
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
        CTAButton cTAButton = this.deleteButton;
        int iHashCode22 = cTAButton == null ? 0 : cTAButton.hashCode();
        CTAButton cTAButton2 = this.rightButton;
        int iHashCode23 = cTAButton2 == null ? 0 : cTAButton2.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        int iHashCode24 = map == null ? 0 : map.hashCode();
        Boolean bool4 = this.pageStack;
        int iHashCode25 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.isFormRefresh;
        int iHashCode26 = bool5 == null ? 0 : bool5.hashCode();
        String str9 = this.pageStackType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFormRefresh() {
        return this.isFormRefresh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Form(items=" + this.items + ", cta=" + this.cta + ", stepper=" + this.stepper + ", titleWithSteps=" + this.titleWithSteps + ", dynamicTitle=" + this.dynamicTitle + ", pageTitle=" + this.pageTitle + ", quit=" + this.quit + ", onExit=" + this.onExit + ", align=" + this.align + ", canGoBack=" + this.canGoBack + ", canClose=" + this.canClose + ", faqUrl=" + this.faqUrl + ", richTitle=" + this.richTitle + ", richSubtitle=" + this.richSubtitle + ", notifications=" + this.notifications + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", deleteButton=" + this.deleteButton + ", rightButton=" + this.rightButton + ", amplitudeParams=" + this.amplitudeParams + ", pageStack=" + this.pageStack + ", isFormRefresh=" + this.isFormRefresh + ", pageStackType=" + this.pageStackType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeValue(this.items);
        parcel.writeParcelable(this.cta, i);
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
        DynamicTitle dynamicTitle = this.dynamicTitle;
        if (dynamicTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicTitle.writeToParcel(parcel, i);
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
        parcel.writeString(this.faqUrl);
        RichTitle richTitle = this.richTitle;
        if (richTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richTitle.writeToParcel(parcel, i);
        }
        RichSubtitleData richSubtitleData = this.richSubtitle;
        if (richSubtitleData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richSubtitleData.writeToParcel(parcel, i);
        }
        List<ReminderData> list = this.notifications;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ReminderData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
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
        CTAButton cTAButton = this.deleteButton;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        CTAButton cTAButton2 = this.rightButton;
        if (cTAButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton2.writeToParcel(parcel, i);
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
        Boolean bool4 = this.pageStack;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isFormRefresh;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pageStackType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Form.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Form> serializer() {
            return Form$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ReminderData$$serializer.INSTANCE), null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Form(int i, JsonArray jsonArray, Cta cta, Stepper stepper, TitleStepper titleStepper, DynamicTitle dynamicTitle, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, String str3, RichTitle richTitle, RichSubtitleData richSubtitleData, List list, String str4, Boolean bool3, String str5, String str6, String str7, String str8, CTAButton cTAButton, CTAButton cTAButton2, HashMap map, Boolean bool4, Boolean bool5, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (18746881 != (i & 18746881)) {
            PluginExceptionsKt.throwMissingFieldException(i, 18746881, Form$$serializer.INSTANCE.getDescriptor());
        }
        this.items = jsonArray;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
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
            this.dynamicTitle = null;
        } else {
            this.dynamicTitle = dynamicTitle;
        }
        if ((i & 32) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str;
        }
        if ((i & 64) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        if ((i & 128) == 0) {
            this.onExit = null;
        } else {
            this.onExit = exit;
        }
        if ((i & 256) == 0) {
            this.align = null;
        } else {
            this.align = str2;
        }
        this.canGoBack = bool;
        this.canClose = bool2;
        this.faqUrl = str3;
        if ((i & 4096) == 0) {
            this.richTitle = null;
        } else {
            this.richTitle = richTitle;
        }
        if ((i & 8192) == 0) {
            this.richSubtitle = null;
        } else {
            this.richSubtitle = richSubtitleData;
        }
        if ((i & 16384) == 0) {
            this.notifications = null;
        } else {
            this.notifications = list;
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
        if ((2097152 & i) == 0) {
            this.deleteButton = null;
        } else {
            this.deleteButton = cTAButton;
        }
        if ((4194304 & i) == 0) {
            this.rightButton = null;
        } else {
            this.rightButton = cTAButton2;
        }
        if ((8388608 & i) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
        this.pageStack = bool4;
        if ((33554432 & i) == 0) {
            this.isFormRefresh = null;
        } else {
            this.isFormRefresh = bool5;
        }
        if ((i & 67108864) == 0) {
            this.pageStackType = null;
        } else {
            this.pageStackType = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Form form, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponent.write$Self(form, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, form.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || form.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, form.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || form.stepper != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Stepper$$serializer.INSTANCE, form.stepper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || form.titleWithSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, TitleStepper$$serializer.INSTANCE, form.titleWithSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || form.dynamicTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, DynamicTitle$$serializer.INSTANCE, form.dynamicTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || form.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, form.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || form.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Quit$$serializer.INSTANCE, form.quit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || form.onExit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, Exit$$serializer.INSTANCE, form.onExit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || form.align != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, form.align);
        }
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, form.canGoBack);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, form.canClose);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, form.faqUrl);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || form.richTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, RichTitle$$serializer.INSTANCE, form.richTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || form.richSubtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, RichSubtitleData$$serializer.INSTANCE, form.richSubtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || form.notifications != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], form.notifications);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || form.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, form.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(form.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, form.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, form.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, form.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, form.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, form.getSubtitle());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || form.deleteButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, CTAButton$$serializer.INSTANCE, form.deleteButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || form.rightButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, CTAButton$$serializer.INSTANCE, form.rightButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || form.amplitudeParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, kSerializerArr[23], form.amplitudeParams);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, booleanSerializer, form.getPageStack());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || form.isFormRefresh != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, booleanSerializer, form.isFormRefresh);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && form.pageStackType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, form.pageStackType);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bb: CONSTRUCTOR 
  (r32v0 kotlinx.serialization.json.JsonArray)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0002: ARITH (r59v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r33v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper:?: TERNARY null = ((wrap:int:0x000b: ARITH (r59v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper) : (r34v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper:?: TERNARY null = ((wrap:int:0x0013: ARITH (r59v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper) : (r35v0 com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle:?: TERNARY null = ((wrap:int:0x001b: ARITH (r59v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle) : (r36v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r59v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x002b: ARITH (r59v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r38v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Exit:?: TERNARY null = ((wrap:int:0x0033: ARITH (r59v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Exit) : (r39v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Exit))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r59v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (r41v0 java.lang.Boolean)
  (r42v0 java.lang.Boolean)
  (r43v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle:?: TERNARY null = ((wrap:int:0x0043: ARITH (r59v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle) : (r44v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData:?: TERNARY null = ((wrap:int:0x004c: ARITH (r59v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData) : (r45v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0055: ARITH (r59v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r46v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (32768 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006b: ARITH (65536 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0070: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r48v0 java.lang.Boolean))
  (r49v0 java.lang.String)
  (r50v0 java.lang.String)
  (r51v0 java.lang.String)
  (r52v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0077: ARITH (2097152 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r53v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0081: ARITH (4194304 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r54v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x008b: ARITH (8388608 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r55v0 java.util.HashMap))
  (r56v0 java.lang.Boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0095: ARITH (33554432 int) & (r59v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r57v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r59v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
 A[MD:(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper, com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ReminderData>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:108) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Form.<init>(kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.Stepper, com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitleData, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.util.HashMap, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ Form(JsonArray jsonArray, Cta cta, Stepper stepper, TitleStepper titleStepper, DynamicTitle dynamicTitle, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, String str3, RichTitle richTitle, RichSubtitleData richSubtitleData, List list, String str4, Boolean bool3, String str5, String str6, String str7, String str8, CTAButton cTAButton, CTAButton cTAButton2, HashMap map, Boolean bool4, Boolean bool5, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonArray, (i & 2) != 0 ? null : cta, (i & 4) != 0 ? null : stepper, (i & 8) != 0 ? null : titleStepper, (i & 16) != 0 ? null : dynamicTitle, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : quit, (i & 128) != 0 ? null : exit, (i & 256) != 0 ? null : str2, bool, bool2, str3, (i & 4096) != 0 ? null : richTitle, (i & 8192) != 0 ? null : richSubtitleData, (i & 16384) != 0 ? null : list, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? Boolean.FALSE : bool3, str5, str6, str7, str8, (2097152 & i) != 0 ? null : cTAButton, (4194304 & i) != 0 ? null : cTAButton2, (8388608 & i) != 0 ? null : map, bool4, (33554432 & i) != 0 ? null : bool5, (i & 67108864) != 0 ? null : str9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Form(@NotNull JsonArray jsonArray, Cta cta, Stepper stepper, TitleStepper titleStepper, DynamicTitle dynamicTitle, String str, Quit quit, Exit exit, String str2, Boolean bool, Boolean bool2, String str3, RichTitle richTitle, RichSubtitleData richSubtitleData, List<ReminderData> list, String str4, Boolean bool3, String str5, String str6, String str7, String str8, CTAButton cTAButton, CTAButton cTAButton2, HashMap<String, String> map, Boolean bool4, Boolean bool5, String str9) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.items = jsonArray;
        this.cta = cta;
        this.stepper = stepper;
        this.titleWithSteps = titleStepper;
        this.dynamicTitle = dynamicTitle;
        this.pageTitle = str;
        this.quit = quit;
        this.onExit = exit;
        this.align = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        this.faqUrl = str3;
        this.richTitle = richTitle;
        this.richSubtitle = richSubtitleData;
        this.notifications = list;
        this.id = str4;
        this.required = bool3;
        this.version = str5;
        this.value = str6;
        this.title = str7;
        this.subtitle = str8;
        this.deleteButton = cTAButton;
        this.rightButton = cTAButton2;
        this.amplitudeParams = map;
        this.pageStack = bool4;
        this.isFormRefresh = bool5;
        this.pageStackType = str9;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/PageComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public FormAppModel toAppModel() {
        ArrayList arrayList = new ArrayList();
        List<ReminderData> list = this.notifications;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C43780rvj.copydefault((ReminderData) it.next()));
            }
        }
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.items);
        Cta cta = this.cta;
        CtaAppModel appModel = cta != null ? cta.toAppModel() : null;
        Stepper stepper = this.stepper;
        TitleStepper titleStepper = this.titleWithSteps;
        String str = this.pageTitle;
        Quit quit = this.quit;
        Exit exit = this.onExit;
        String str2 = this.align;
        Boolean bool = this.canGoBack;
        Boolean bool2 = this.canClose;
        String str3 = this.faqUrl;
        RichTitle richTitle = this.richTitle;
        RichSubtitleData richSubtitleData = this.richSubtitle;
        RichSubtitle richSubtitleEZpvd = richSubtitleData != null ? C43780rvj.EZpvd(richSubtitleData) : null;
        String id = getId();
        Boolean required = getRequired();
        String version = getVersion();
        String value = getValue();
        String title = getTitle();
        String subtitle = getSubtitle();
        Boolean pageStack = getPageStack();
        DynamicTitle dynamicTitle = this.dynamicTitle;
        CTAButton cTAButton = this.deleteButton;
        CTAButtonAppModel appModel2 = cTAButton != null ? cTAButton.toAppModel() : null;
        HashMap<String, String> map = this.amplitudeParams;
        CTAButton cTAButton2 = this.rightButton;
        return new FormAppModel(listCopydefault, appModel, stepper, titleStepper, str, quit, exit, str2, bool, bool2, (CTAButtonAppModel) null, str3, richTitle, richSubtitleEZpvd, arrayList, id, required, version, value, title, subtitle, pageStack, dynamicTitle, appModel2, map, cTAButton2 != null ? cTAButton2.toAppModel() : null, (AlertCardAppModel) null, this.isFormRefresh, PageStackType.Companion.copydefault(this.pageStackType), 67108864, (DefaultConstructorMarker) null);
    }
}
