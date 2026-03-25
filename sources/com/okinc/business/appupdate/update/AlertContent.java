package com.okinc.business.appupdate.update;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AlertContent implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String logoURL;
    private List<String> messages;
    private List<String> titleList;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlertContent> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AlertContent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AlertContent(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertContent[] newArray(int i) {
            return new AlertContent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertContent() {
        this((String) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.appupdate.update.AlertContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlertContent copy$default(AlertContent alertContent, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertContent.url;
        }
        if ((i & 2) != 0) {
            str2 = alertContent.logoURL;
        }
        if ((i & 4) != 0) {
            list = alertContent.messages;
        }
        if ((i & 8) != 0) {
            list2 = alertContent.titleList;
        }
        return alertContent.copy(str, str2, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.logoURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.titleList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertContent copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new AlertContent(str, str2, list, list2);
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
        if (!(obj instanceof AlertContent)) {
            return false;
        }
        AlertContent alertContent = (AlertContent) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) alertContent.url) && Intrinsics.EZpvd((Object) this.logoURL, (Object) alertContent.logoURL) && Intrinsics.EZpvd(this.messages, alertContent.messages) && Intrinsics.EZpvd(this.titleList, alertContent.titleList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoURL() {
        return this.logoURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMessages() {
        return this.messages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTitleList() {
        return this.titleList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.url.hashCode() * 31) + this.logoURL.hashCode()) * 31) + this.messages.hashCode()) * 31) + this.titleList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogoURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logoURL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessages(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.messages = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.titleList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertContent(url=" + this.url + ", logoURL=" + this.logoURL + ", messages=" + this.messages + ", titleList=" + this.titleList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.url);
        parcel.writeString(this.logoURL);
        parcel.writeStringList(this.messages);
        parcel.writeStringList(this.titleList);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AlertContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertContent> serializer() {
            return AlertContent$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ AlertContent(int i, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.logoURL = "";
        } else {
            this.logoURL = str2;
        }
        if ((i & 4) == 0) {
            this.messages = new ArrayList();
        } else {
            this.messages = list;
        }
        if ((i & 8) == 0) {
            this.titleList = new ArrayList();
        } else {
            this.titleList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKUpgrade_ok_upgrade(AlertContent alertContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) alertContent.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, alertContent.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) alertContent.logoURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, alertContent.logoURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(alertContent.messages, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], alertContent.messages);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(alertContent.titleList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], alertContent.titleList);
    }

    public AlertContent(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.url = str;
        this.logoURL = str2;
        this.messages = list;
        this.titleList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:177) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:178) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:174) call: com.okinc.business.appupdate.update.AlertContent.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ AlertContent(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? new ArrayList() : list2);
    }
}
