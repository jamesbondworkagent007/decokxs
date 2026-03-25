package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("selectWalletVerificationMethod")
@Serializable
public final class SelectWalletVerification extends PageComponent implements Parcelable {
    private final Boolean canClose;
    private final Boolean canGoBack;
    private final ArrayList<WalletCardChoiceData> cardChoice;
    private final String defaultMethod;
    private final String id;
    private final Boolean pageStack;
    private final String pageTitle;
    private final Quit quit;
    private final Boolean required;
    private final String subtitle;
    private final String title;
    private final String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectWalletVerification> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(WalletCardChoiceData$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SelectWalletVerification> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectWalletVerification createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(WalletCardChoiceData.CREATOR.createFromParcel(parcel));
                }
            }
            return new SelectWalletVerification(string, boolValueOf, boolValueOf2, string2, arrayList, parcel.readInt() == 0 ? null : Quit.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectWalletVerification[] newArray(int i) {
            return new SelectWalletVerification[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.defaultMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.pageStack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.canClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.canGoBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pageTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WalletCardChoiceData> component5() {
        return this.cardChoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quit component6() {
        return this.quit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectWalletVerification copy(String str, Boolean bool, Boolean bool2, String str2, ArrayList<WalletCardChoiceData> arrayList, Quit quit, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Boolean bool4) {
        return new SelectWalletVerification(str, bool, bool2, str2, arrayList, quit, str3, bool3, str4, str5, str6, str7, bool4);
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
        if (!(obj instanceof SelectWalletVerification)) {
            return false;
        }
        SelectWalletVerification selectWalletVerification = (SelectWalletVerification) obj;
        return Intrinsics.EZpvd((Object) this.defaultMethod, (Object) selectWalletVerification.defaultMethod) && Intrinsics.EZpvd(this.canClose, selectWalletVerification.canClose) && Intrinsics.EZpvd(this.canGoBack, selectWalletVerification.canGoBack) && Intrinsics.EZpvd((Object) this.pageTitle, (Object) selectWalletVerification.pageTitle) && Intrinsics.EZpvd(this.cardChoice, selectWalletVerification.cardChoice) && Intrinsics.EZpvd(this.quit, selectWalletVerification.quit) && Intrinsics.EZpvd((Object) this.id, (Object) selectWalletVerification.id) && Intrinsics.EZpvd(this.required, selectWalletVerification.required) && Intrinsics.EZpvd((Object) this.version, (Object) selectWalletVerification.version) && Intrinsics.EZpvd((Object) this.value, (Object) selectWalletVerification.value) && Intrinsics.EZpvd((Object) this.title, (Object) selectWalletVerification.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) selectWalletVerification.subtitle) && Intrinsics.EZpvd(this.pageStack, selectWalletVerification.pageStack);
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
    public final ArrayList<WalletCardChoiceData> getCardChoice() {
        return this.cardChoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultMethod() {
        return this.defaultMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public Boolean getPageStack() {
        return this.pageStack;
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
        String str = this.defaultMethod;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.canClose;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canGoBack;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.pageTitle;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        ArrayList<WalletCardChoiceData> arrayList = this.cardChoice;
        int iHashCode5 = arrayList == null ? 0 : arrayList.hashCode();
        Quit quit = this.quit;
        int iHashCode6 = quit == null ? 0 : quit.hashCode();
        String str3 = this.id;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Boolean bool3 = this.required;
        int iHashCode8 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.version;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.title;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.subtitle;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        Boolean bool4 = this.pageStack;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectWalletVerification(defaultMethod=" + this.defaultMethod + ", canClose=" + this.canClose + ", canGoBack=" + this.canGoBack + ", pageTitle=" + this.pageTitle + ", cardChoice=" + this.cardChoice + ", quit=" + this.quit + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", title=" + this.title + ", subtitle=" + this.subtitle + ", pageStack=" + this.pageStack + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.defaultMethod);
        Boolean bool = this.canClose;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.canGoBack;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.pageTitle);
        ArrayList<WalletCardChoiceData> arrayList = this.cardChoice;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<WalletCardChoiceData> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Quit quit = this.quit;
        if (quit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quit.writeToParcel(parcel, i);
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerification.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SelectWalletVerification> serializer() {
            return SelectWalletVerification$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectWalletVerification(int i, String str, Boolean bool, Boolean bool2, String str2, ArrayList arrayList, Quit quit, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3904 != (i & 3904)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3904, SelectWalletVerification$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.defaultMethod = null;
        } else {
            this.defaultMethod = str;
        }
        if ((i & 2) == 0) {
            this.canClose = null;
        } else {
            this.canClose = bool;
        }
        if ((i & 4) == 0) {
            this.canGoBack = null;
        } else {
            this.canGoBack = bool2;
        }
        if ((i & 8) == 0) {
            this.pageTitle = null;
        } else {
            this.pageTitle = str2;
        }
        if ((i & 16) == 0) {
            this.cardChoice = null;
        } else {
            this.cardChoice = arrayList;
        }
        if ((i & 32) == 0) {
            this.quit = null;
        } else {
            this.quit = quit;
        }
        this.id = str3;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool3;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        this.pageStack = (i & 4096) == 0 ? Boolean.FALSE : bool4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SelectWalletVerification selectWalletVerification, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PageComponent.write$Self(selectWalletVerification, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || selectWalletVerification.defaultMethod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, selectWalletVerification.defaultMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || selectWalletVerification.canClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, selectWalletVerification.canClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || selectWalletVerification.canGoBack != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, selectWalletVerification.canGoBack);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || selectWalletVerification.pageTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, selectWalletVerification.pageTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || selectWalletVerification.cardChoice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], selectWalletVerification.cardChoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || selectWalletVerification.quit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, Quit$$serializer.INSTANCE, selectWalletVerification.quit);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, selectWalletVerification.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(selectWalletVerification.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, selectWalletVerification.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, selectWalletVerification.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, selectWalletVerification.getValue());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, selectWalletVerification.getTitle());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, selectWalletVerification.getSubtitle());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(selectWalletVerification.getPageStack(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, selectWalletVerification.getPageStack());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r22v0 java.util.ArrayList))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Quit:?: TERNARY null = ((wrap:int:0x002b: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Quit) : (r23v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Quit))
  (r24v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.ArrayList<com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoiceData>, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:789) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerification.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.util.ArrayList, com.okinc.ok_kyc_core.data.remote.networkmodel.Quit, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SelectWalletVerification(String str, Boolean bool, Boolean bool2, String str2, ArrayList arrayList, Quit quit, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? null : quit, str3, (i & 128) != 0 ? Boolean.FALSE : bool3, str4, str5, str6, str7, (i & 4096) != 0 ? Boolean.FALSE : bool4);
    }

    public SelectWalletVerification(String str, Boolean bool, Boolean bool2, String str2, ArrayList<WalletCardChoiceData> arrayList, Quit quit, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Boolean bool4) {
        super(null);
        this.defaultMethod = str;
        this.canClose = bool;
        this.canGoBack = bool2;
        this.pageTitle = str2;
        this.cardChoice = arrayList;
        this.quit = quit;
        this.id = str3;
        this.required = bool3;
        this.version = str4;
        this.value = str5;
        this.title = str6;
        this.subtitle = str7;
        this.pageStack = bool4;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/PageComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent
    public SelectWalletVerificationAppModel toAppModel() {
        ArrayList arrayList = new ArrayList();
        ArrayList<WalletCardChoiceData> arrayList2 = this.cardChoice;
        if (arrayList2 != null) {
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(C43780rvj.KWHzl((WalletCardChoiceData) it.next()));
            }
        }
        return new SelectWalletVerificationAppModel(this.defaultMethod, this.canClose, this.canGoBack, this.pageTitle, arrayList, this.quit, getId(), getRequired(), getVersion(), getValue(), getTitle(), getSubtitle(), getPageStack());
    }
}
