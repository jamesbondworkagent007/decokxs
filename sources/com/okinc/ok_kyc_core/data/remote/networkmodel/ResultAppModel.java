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
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43783rvm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ResultAppModel extends PageComponentAppModel implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> amplitudeParams;
    private final Boolean canClose;
    private final Boolean canGoBack;
    private final CtaAppModel cta;
    private final String faqUrl;
    private final String icon;
    private final String id;
    private final Boolean isFlowSuccess;
    private final Integer isHidePro;
    private final List<UIComponentAppModel> items;
    private final Exit onExit;
    private final Boolean pageStack;
    private final Quit quit;
    private final Boolean required;
    private final Integer risk;
    private final ResultStatus status;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ResultAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ResultAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultAppModel createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (int i3 = 0; i3 != i; i3++) {
                arrayList.add(parcel.readParcelable(ResultAppModel.class.getClassLoader()));
            }
            CtaAppModel ctaAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CtaAppModel.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            ResultStatus resultStatusValueOf = parcel.readInt() == 0 ? null : ResultStatus.valueOf(parcel.readString());
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            Exit exitCreateFromParcel = parcel.readInt() == 0 ? null : Exit.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i4 = parcel.readInt();
                HashMap map2 = new HashMap(i4);
                while (i2 != i4) {
                    map2.put(parcel.readString(), parcel.readString());
                    i2++;
                    i4 = i4;
                }
                map = map2;
            }
            return new ResultAppModel(arrayList, ctaAppModelCreateFromParcel, string, resultStatusValueOf, quitCreateFromParcel, exitCreateFromParcel, numValueOf, numValueOf2, string2, boolValueOf, boolValueOf2, boolValueOf3, string3, boolValueOf4, string4, string5, string6, string7, boolValueOf5, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultAppModel[] newArray(int i) {
            return new ResultAppModel[i];
        }
    }

    @Serializable(with = C43783rvm.class)
    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> component1() {
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
    public final Boolean component12() {
        return this.isFlowSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel component2() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component20() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResultStatus component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component5() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit component6() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.isHidePro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.risk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResultAppModel copy(@NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ResultAppModel(list, ctaAppModel, str, resultStatus, quit, exit, num, num2, str2, bool, bool2, bool3, str3, bool4, str4, str5, str6, str7, bool5, map);
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
        if (!(obj instanceof ResultAppModel)) {
            return false;
        }
        ResultAppModel resultAppModel = (ResultAppModel) obj;
        return Intrinsics.EZpvd(this.items, resultAppModel.items) && Intrinsics.EZpvd(this.cta, resultAppModel.cta) && Intrinsics.EZpvd((Object) this.icon, (Object) resultAppModel.icon) && this.status == resultAppModel.status && Intrinsics.EZpvd(this.quit, resultAppModel.quit) && Intrinsics.EZpvd(this.onExit, resultAppModel.onExit) && Intrinsics.EZpvd(this.isHidePro, resultAppModel.isHidePro) && Intrinsics.EZpvd(this.risk, resultAppModel.risk) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) resultAppModel.faqUrl) && Intrinsics.EZpvd(this.canGoBack, resultAppModel.canGoBack) && Intrinsics.EZpvd(this.canClose, resultAppModel.canClose) && Intrinsics.EZpvd(this.isFlowSuccess, resultAppModel.isFlowSuccess) && Intrinsics.EZpvd((Object) this.id, (Object) resultAppModel.id) && Intrinsics.EZpvd(this.required, resultAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) resultAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) resultAppModel.value) && Intrinsics.EZpvd((Object) this.title, (Object) resultAppModel.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) resultAppModel.subtitle) && Intrinsics.EZpvd(this.pageStack, resultAppModel.pageStack) && Intrinsics.EZpvd(this.amplitudeParams, resultAppModel.amplitudeParams);
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
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> getItems() {
        return this.items;
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
    public final Quit getQuit() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRisk() {
        return this.risk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResultStatus getStatus() {
        return this.status;
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
        String str = this.icon;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        ResultStatus resultStatus = this.status;
        int iHashCode4 = resultStatus == null ? 0 : resultStatus.hashCode();
        Quit quit = this.quit;
        int iHashCode5 = quit == null ? 0 : quit.hashCode();
        Exit exit = this.onExit;
        int iHashCode6 = exit == null ? 0 : exit.hashCode();
        Integer num = this.isHidePro;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.risk;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.faqUrl;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.canGoBack;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canClose;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isFlowSuccess;
        int iHashCode12 = bool3 == null ? 0 : bool3.hashCode();
        String str3 = this.id;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        Boolean bool4 = this.required;
        int iHashCode14 = bool4 == null ? 0 : bool4.hashCode();
        String str4 = this.version;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode16 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.title;
        int iHashCode17 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.subtitle;
        int iHashCode18 = str7 == null ? 0 : str7.hashCode();
        Boolean bool5 = this.pageStack;
        int iHashCode19 = bool5 == null ? 0 : bool5.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFlowSuccess() {
        return this.isFlowSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isHidePro() {
        return this.isHidePro;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResultAppModel(items=" + this.items + ", cta=" + this.cta + ", icon=" + this.icon + ", status=" + this.status + ", quit=" + this.quit + ", onExit=" + this.onExit + ", isHidePro=" + this.isHidePro + ", risk=" + this.risk + ", faqUrl=" + this.faqUrl + ", canGoBack=" + this.canGoBack + ", canClose=" + this.canClose + ", isFlowSuccess=" + this.isFlowSuccess + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ", amplitudeParams=" + this.amplitudeParams + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<UIComponentAppModel> list = this.items;
        parcel.writeInt(list.size());
        Iterator<UIComponentAppModel> it = list.iterator();
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
        parcel.writeString(this.icon);
        ResultStatus resultStatus = this.status;
        if (resultStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(resultStatus.name());
        }
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
        Integer num = this.isHidePro;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.risk;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.faqUrl);
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
        Boolean bool3 = this.isFlowSuccess;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool4 = this.required;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool5 = this.pageStack;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        HashMap<String, String> map = this.amplitudeParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ResultAppModel> serializer() {
            return ResultAppModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResultAppModel(int i, List list, CtaAppModel ctaAppModel, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap map, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (253889 != (i & 253889)) {
            PluginExceptionsKt.throwMissingFieldException(i, 253889, ResultAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaAppModel;
        }
        if ((i & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 8) == 0) {
            this.status = null;
        } else {
            this.status = resultStatus;
        }
        if ((i & 16) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        if ((i & 32) == 0) {
            this.onExit = null;
        } else {
            this.onExit = exit;
        }
        this.isHidePro = num;
        this.risk = num2;
        this.faqUrl = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        this.isFlowSuccess = bool3;
        this.id = str3;
        this.required = (i & 8192) == 0 ? Boolean.FALSE : bool4;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        this.pageStack = (262144 & i) == 0 ? Boolean.FALSE : bool5;
        if ((i & 524288) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ResultAppModel resultAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponentAppModel.write$Self(resultAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], resultAppModel.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || resultAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CtaAppModel$$serializer.INSTANCE, resultAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || resultAppModel.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, resultAppModel.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || resultAppModel.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C43783rvm.EZpvd, resultAppModel.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || resultAppModel.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, Quit$$serializer.INSTANCE, resultAppModel.quit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || resultAppModel.onExit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Exit$$serializer.INSTANCE, resultAppModel.onExit);
        }
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, intSerializer, resultAppModel.isHidePro);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, intSerializer, resultAppModel.risk);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, resultAppModel.faqUrl);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, resultAppModel.canGoBack);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, resultAppModel.canClose);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, resultAppModel.isFlowSuccess);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, resultAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(resultAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, resultAppModel.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, resultAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, resultAppModel.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, resultAppModel.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, resultAppModel.getSubtitle());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(resultAppModel.getPageStack(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, resultAppModel.getPageStack());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && resultAppModel.amplitudeParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, kSerializerArr[19], resultAppModel.amplitudeParams);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (r25v0 java.util.List)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel:?: TERNARY null = ((wrap:int:0x0002: ARITH (r45v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r45v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus:?: TERNARY null = ((wrap:int:0x0013: ARITH (r45v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x001b: ARITH (r45v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r29v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Exit:?: TERNARY null = ((wrap:int:0x0023: ARITH (r45v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Exit) : (r30v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Exit))
  (r31v0 java.lang.Integer)
  (r32v0 java.lang.Integer)
  (r33v0 java.lang.String)
  (r34v0 java.lang.Boolean)
  (r35v0 java.lang.Boolean)
  (r36v0 java.lang.Boolean)
  (r37v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r45v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (262144 int) & (r45v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r43v0 java.lang.Boolean))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0044: ARITH (r45v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r44v0 java.util.HashMap))
 A[MD:(java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap<java.lang.String, java.lang.String>):void (m)] (LINE:761) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel.<init>(java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap):void type: THIS */
    public /* synthetic */ ResultAppModel(List list, CtaAppModel ctaAppModel, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : ctaAppModel, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : resultStatus, (i & 16) != 0 ? null : quit, (i & 32) != 0 ? null : exit, num, num2, str2, bool, bool2, bool3, str3, (i & 8192) != 0 ? Boolean.FALSE : bool4, str4, str5, str6, str7, (262144 & i) != 0 ? Boolean.FALSE : bool5, (i & 524288) != 0 ? null : map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResultAppModel(@NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, String str, ResultStatus resultStatus, Quit quit, Exit exit, Integer num, Integer num2, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Boolean bool4, String str4, String str5, String str6, String str7, Boolean bool5, HashMap<String, String> map) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.cta = ctaAppModel;
        this.icon = str;
        this.status = resultStatus;
        this.quit = quit;
        this.onExit = exit;
        this.isHidePro = num;
        this.risk = num2;
        this.faqUrl = str2;
        this.canGoBack = bool;
        this.canClose = bool2;
        this.isFlowSuccess = bool3;
        this.id = str3;
        this.required = bool4;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        this.pageStack = bool5;
        this.amplitudeParams = map;
    }
}
