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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ProcessingAppModel extends PageComponentAppModel {
    private static final KSerializer<Object>[] $childSerializers;
    private final HashMap<String, String> amplitudeParams;
    private final Boolean canClose;
    private final CtaAppModel cta;
    private final String id;
    private final Boolean isLocalPolling;
    private final List<UIComponentAppModel> items;
    private final Exit onExit;
    private final Onboarding onboarding;
    private final Boolean pageStack;
    private final String pageTitle;
    private final Polling polling;
    private final Long processTimeOut;
    private final Quit quit;
    private final Boolean required;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProcessingAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ProcessingAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProcessingAppModel createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(ProcessingAppModel.class.getClassLoader()));
            }
            CtaAppModel ctaAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CtaAppModel.CREATOR.createFromParcel(parcel);
            Quit quitCreateFromParcel = parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel);
            Exit exitCreateFromParcel = parcel.readInt() == 0 ? null : Exit.CREATOR.createFromParcel(parcel);
            Polling pollingCreateFromParcel = parcel.readInt() == 0 ? null : Polling.CREATOR.createFromParcel(parcel);
            Onboarding onboardingCreateFromParcel = parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string2 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
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
            return new ProcessingAppModel(arrayList, ctaAppModelCreateFromParcel, quitCreateFromParcel, exitCreateFromParcel, pollingCreateFromParcel, onboardingCreateFromParcel, string, lValueOf, boolValueOf, string2, boolValueOf2, string3, string4, string5, string6, boolValueOf3, map, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProcessingAppModel[] newArray(int i) {
            return new ProcessingAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component17() {
        return this.amplitudeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.isLocalPolling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaAppModel component2() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component3() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exit component4() {
        return this.onExit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Polling component5() {
        return this.polling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Onboarding component6() {
        return this.onboarding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.processTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProcessingAppModel copy(@NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap<String, String> map, Boolean bool4) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ProcessingAppModel(list, ctaAppModel, quit, exit, polling, onboarding, str, l, bool, str2, bool2, str3, str4, str5, str6, bool3, map, bool4);
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
        if (!(obj instanceof ProcessingAppModel)) {
            return false;
        }
        ProcessingAppModel processingAppModel = (ProcessingAppModel) obj;
        return Intrinsics.EZpvd(this.items, processingAppModel.items) && Intrinsics.EZpvd(this.cta, processingAppModel.cta) && Intrinsics.EZpvd(this.quit, processingAppModel.quit) && Intrinsics.EZpvd(this.onExit, processingAppModel.onExit) && Intrinsics.EZpvd(this.polling, processingAppModel.polling) && Intrinsics.EZpvd(this.onboarding, processingAppModel.onboarding) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) processingAppModel.pageTitle) && Intrinsics.EZpvd(this.processTimeOut, processingAppModel.processTimeOut) && Intrinsics.EZpvd(this.canClose, processingAppModel.canClose) && Intrinsics.EZpvd((Object) this.id, (Object) processingAppModel.id) && Intrinsics.EZpvd(this.required, processingAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) processingAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) processingAppModel.value) && Intrinsics.EZpvd((Object) this.title, (Object) processingAppModel.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) processingAppModel.subtitle) && Intrinsics.EZpvd(this.pageStack, processingAppModel.pageStack) && Intrinsics.EZpvd(this.amplitudeParams, processingAppModel.amplitudeParams) && Intrinsics.EZpvd(this.isLocalPolling, processingAppModel.isLocalPolling);
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
    public final CtaAppModel getCta() {
        return this.cta;
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
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel
    public Boolean getPageStack() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Polling getPolling() {
        return this.polling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getProcessTimeOut() {
        return this.processTimeOut;
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
        Quit quit = this.quit;
        int iHashCode3 = quit == null ? 0 : quit.hashCode();
        Exit exit = this.onExit;
        int iHashCode4 = exit == null ? 0 : exit.hashCode();
        Polling polling = this.polling;
        int iHashCode5 = polling == null ? 0 : polling.hashCode();
        Onboarding onboarding = this.onboarding;
        int iHashCode6 = onboarding == null ? 0 : onboarding.hashCode();
        String str = this.pageTitle;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Long l = this.processTimeOut;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        Boolean bool = this.canClose;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str2 = this.id;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.required;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.version;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.title;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.subtitle;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        Boolean bool3 = this.pageStack;
        int iHashCode16 = bool3 == null ? 0 : bool3.hashCode();
        HashMap<String, String> map = this.amplitudeParams;
        int iHashCode17 = map == null ? 0 : map.hashCode();
        Boolean bool4 = this.isLocalPolling;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (bool4 == null ? 0 : bool4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isLocalPolling() {
        return this.isLocalPolling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProcessingAppModel(items=" + this.items + ", cta=" + this.cta + ", quit=" + this.quit + ", onExit=" + this.onExit + ", polling=" + this.polling + ", onboarding=" + this.onboarding + ", pageTitle=" + this.pageTitle + ", processTimeOut=" + this.processTimeOut + ", canClose=" + this.canClose + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ", amplitudeParams=" + this.amplitudeParams + ", isLocalPolling=" + this.isLocalPolling + ")";
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
        Polling polling = this.polling;
        if (polling == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            polling.writeToParcel(parcel, i);
        }
        Onboarding onboarding = this.onboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, i);
        }
        parcel.writeString(this.pageTitle);
        Long l = this.processTimeOut;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.canClose;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool2 = this.required;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool3 = this.pageStack;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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
        Boolean bool4 = this.isLocalPolling;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProcessingAppModel> serializer() {
            return ProcessingAppModel$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProcessingAppModel(int i, List list, CtaAppModel ctaAppModel, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap map, Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ProcessingAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaAppModel;
        }
        if ((i & 4) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        if ((i & 8) == 0) {
            this.onExit = null;
        } else {
            this.onExit = exit;
        }
        if ((i & 16) == 0) {
            this.polling = null;
        } else {
            this.polling = polling;
        }
        if ((i & 32) == 0) {
            this.onboarding = null;
        } else {
            this.onboarding = onboarding;
        }
        if ((i & 64) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str;
        }
        this.processTimeOut = (i & 128) == 0 ? 120000L : l;
        if ((i & 256) == 0) {
            this.canClose = null;
        } else {
            this.canClose = bool;
        }
        if ((i & 512) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool2;
        if ((i & 2048) == 0) {
            this.version = "";
        } else {
            this.version = str3;
        }
        if ((i & 4096) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 8192) == 0) {
            this.title = "";
        } else {
            this.title = str5;
        }
        if ((i & 16384) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str6;
        }
        this.pageStack = (32768 & i) == 0 ? Boolean.FALSE : bool3;
        if ((65536 & i) == 0) {
            this.amplitudeParams = null;
        } else {
            this.amplitudeParams = map;
        }
        this.isLocalPolling = (i & 131072) == 0 ? Boolean.FALSE : bool4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ProcessingAppModel processingAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        PageComponentAppModel.write$Self(processingAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], processingAppModel.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || processingAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CtaAppModel$$serializer.INSTANCE, processingAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || processingAppModel.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Quit$$serializer.INSTANCE, processingAppModel.quit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || processingAppModel.onExit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, Exit$$serializer.INSTANCE, processingAppModel.onExit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || processingAppModel.polling != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, Polling$$serializer.INSTANCE, processingAppModel.polling);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || processingAppModel.onboarding != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Onboarding$$serializer.INSTANCE, processingAppModel.onboarding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || processingAppModel.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, processingAppModel.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (l = processingAppModel.processTimeOut) == null || l.longValue() != 120000) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, processingAppModel.processTimeOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || processingAppModel.canClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, processingAppModel.canClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || processingAppModel.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, processingAppModel.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(processingAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, processingAppModel.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) processingAppModel.getVersion(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, processingAppModel.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) processingAppModel.getValue(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, processingAppModel.getValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) processingAppModel.getTitle(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, processingAppModel.getTitle());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) processingAppModel.getSubtitle(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, processingAppModel.getSubtitle());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(processingAppModel.getPageStack(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, processingAppModel.getPageStack());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || processingAppModel.amplitudeParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], processingAppModel.amplitudeParams);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd(processingAppModel.isLocalPolling, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, processingAppModel.isLocalPolling);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c1: CONSTRUCTOR 
  (r19v0 java.util.List)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x000a: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Exit:?: TERNARY null = ((wrap:int:0x0012: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Exit) : (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Exit))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Polling:?: TERNARY null = ((wrap:int:0x001a: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Polling) : (r23v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Polling))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding:?: TERNARY null = ((wrap:int:0x0022: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (120000 long) : (r26v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r33v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (32768 int) & (r37v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0087: ARITH (r37v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r35v0 java.util.HashMap))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0092: ARITH (r37v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0096: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r36v0 java.lang.Boolean))
 A[MD:(java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, com.okinc.ok_kyc_core.data.remote.networkmodel.Polling, com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.Boolean):void (m)] (LINE:670) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel.<init>(java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, com.okinc.ok_kyc_core.data.remote.networkmodel.Exit, com.okinc.ok_kyc_core.data.remote.networkmodel.Polling, com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.HashMap, java.lang.Boolean):void type: THIS */
    public /* synthetic */ ProcessingAppModel(List list, CtaAppModel ctaAppModel, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap map, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : ctaAppModel, (i & 4) != 0 ? null : quit, (i & 8) != 0 ? null : exit, (i & 16) != 0 ? null : polling, (i & 32) != 0 ? null : onboarding, (i & 64) != 0 ? null : str, (i & 128) != 0 ? 120000L : l, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? Boolean.FALSE : bool2, (i & 2048) != 0 ? "" : str3, (i & 4096) != 0 ? "" : str4, (i & 8192) != 0 ? "" : str5, (i & 16384) == 0 ? str6 : "", (32768 & i) != 0 ? Boolean.FALSE : bool3, (i & 65536) != 0 ? null : map, (i & 131072) != 0 ? Boolean.FALSE : bool4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProcessingAppModel(@NotNull List<? extends UIComponentAppModel> list, CtaAppModel ctaAppModel, Quit quit, Exit exit, Polling polling, Onboarding onboarding, String str, Long l, Boolean bool, String str2, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, HashMap<String, String> map, Boolean bool4) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.cta = ctaAppModel;
        this.quit = quit;
        this.onExit = exit;
        this.polling = polling;
        this.onboarding = onboarding;
        this.pageTitle = str;
        this.processTimeOut = l;
        this.canClose = bool;
        this.id = str2;
        this.required = bool2;
        this.version = str3;
        this.value = str4;
        this.title = str5;
        this.subtitle = str6;
        this.pageStack = bool3;
        this.amplitudeParams = map;
        this.isLocalPolling = bool4;
    }
}
