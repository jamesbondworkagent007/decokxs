package com.okinc.okex.center.ui.displaymodels;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ChatbotEntryDisplayModel implements Parcelable {
    public static final int $stable = 0;
    private final String adaGreeting;
    private final String chatWithUsTitle;
    private final boolean chatbotEnabled;
    private final String chatbotIcon;
    private final String contextualBot;
    private final String okAssistantGreeting;
    private final String xbotGreeting;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChatbotEntryDisplayModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChatbotEntryDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatbotEntryDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChatbotEntryDisplayModel(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatbotEntryDisplayModel[] newArray(int i) {
            return new ChatbotEntryDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatbotEntryDisplayModel() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChatbotEntryDisplayModel copy$default(ChatbotEntryDisplayModel chatbotEntryDisplayModel, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatbotEntryDisplayModel.chatbotEnabled;
        }
        if ((i & 2) != 0) {
            str = chatbotEntryDisplayModel.chatWithUsTitle;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = chatbotEntryDisplayModel.chatbotIcon;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = chatbotEntryDisplayModel.okAssistantGreeting;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = chatbotEntryDisplayModel.xbotGreeting;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = chatbotEntryDisplayModel.adaGreeting;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = chatbotEntryDisplayModel.contextualBot;
        }
        return chatbotEntryDisplayModel.copy(z, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.chatbotEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chatWithUsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chatbotIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.okAssistantGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.xbotGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.adaGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contextualBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatbotEntryDisplayModel copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ChatbotEntryDisplayModel(z, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof ChatbotEntryDisplayModel)) {
            return false;
        }
        ChatbotEntryDisplayModel chatbotEntryDisplayModel = (ChatbotEntryDisplayModel) obj;
        return this.chatbotEnabled == chatbotEntryDisplayModel.chatbotEnabled && Intrinsics.EZpvd((Object) this.chatWithUsTitle, (Object) chatbotEntryDisplayModel.chatWithUsTitle) && Intrinsics.EZpvd((Object) this.chatbotIcon, (Object) chatbotEntryDisplayModel.chatbotIcon) && Intrinsics.EZpvd((Object) this.okAssistantGreeting, (Object) chatbotEntryDisplayModel.okAssistantGreeting) && Intrinsics.EZpvd((Object) this.xbotGreeting, (Object) chatbotEntryDisplayModel.xbotGreeting) && Intrinsics.EZpvd((Object) this.adaGreeting, (Object) chatbotEntryDisplayModel.adaGreeting) && Intrinsics.EZpvd((Object) this.contextualBot, (Object) chatbotEntryDisplayModel.contextualBot);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdaGreeting() {
        return this.adaGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChatWithUsTitle() {
        return this.chatWithUsTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChatbotEnabled() {
        return this.chatbotEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChatbotIcon() {
        return this.chatbotIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContextualBot() {
        return this.contextualBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkAssistantGreeting() {
        return this.okAssistantGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXbotGreeting() {
        return this.xbotGreeting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.chatbotEnabled) * 31) + this.chatWithUsTitle.hashCode()) * 31) + this.chatbotIcon.hashCode()) * 31) + this.okAssistantGreeting.hashCode()) * 31) + this.xbotGreeting.hashCode()) * 31) + this.adaGreeting.hashCode()) * 31) + this.contextualBot.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChatbotEntryDisplayModel(chatbotEnabled=" + this.chatbotEnabled + ", chatWithUsTitle=" + this.chatWithUsTitle + ", chatbotIcon=" + this.chatbotIcon + ", okAssistantGreeting=" + this.okAssistantGreeting + ", xbotGreeting=" + this.xbotGreeting + ", adaGreeting=" + this.adaGreeting + ", contextualBot=" + this.contextualBot + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.chatbotEnabled ? 1 : 0);
        parcel.writeString(this.chatWithUsTitle);
        parcel.writeString(this.chatbotIcon);
        parcel.writeString(this.okAssistantGreeting);
        parcel.writeString(this.xbotGreeting);
        parcel.writeString(this.adaGreeting);
        parcel.writeString(this.contextualBot);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatbotEntryDisplayModel> serializer() {
            return ChatbotEntryDisplayModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatbotEntryDisplayModel(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.chatbotEnabled = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.chatWithUsTitle = "";
        } else {
            this.chatWithUsTitle = str;
        }
        if ((i & 4) == 0) {
            this.chatbotIcon = "";
        } else {
            this.chatbotIcon = str2;
        }
        if ((i & 8) == 0) {
            this.okAssistantGreeting = "";
        } else {
            this.okAssistantGreeting = str3;
        }
        if ((i & 16) == 0) {
            this.xbotGreeting = "";
        } else {
            this.xbotGreeting = str4;
        }
        if ((i & 32) == 0) {
            this.adaGreeting = "";
        } else {
            this.adaGreeting = str5;
        }
        if ((i & 64) == 0) {
            this.contextualBot = "";
        } else {
            this.contextualBot = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ChatbotEntryDisplayModel chatbotEntryDisplayModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !chatbotEntryDisplayModel.chatbotEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, chatbotEntryDisplayModel.chatbotEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chatbotEntryDisplayModel.chatWithUsTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chatbotEntryDisplayModel.chatWithUsTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) chatbotEntryDisplayModel.chatbotIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, chatbotEntryDisplayModel.chatbotIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) chatbotEntryDisplayModel.okAssistantGreeting, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chatbotEntryDisplayModel.okAssistantGreeting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) chatbotEntryDisplayModel.xbotGreeting, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, chatbotEntryDisplayModel.xbotGreeting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) chatbotEntryDisplayModel.adaGreeting, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, chatbotEntryDisplayModel.adaGreeting);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) chatbotEntryDisplayModel.contextualBot, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, chatbotEntryDisplayModel.contextualBot);
    }

    public ChatbotEntryDisplayModel(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.chatbotEnabled = z;
        this.chatWithUsTitle = str;
        this.chatbotIcon = str2;
        this.okAssistantGreeting = str3;
        this.xbotGreeting = str4;
        this.adaGreeting = str5;
        this.contextualBot = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChatbotEntryDisplayModel(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "");
    }
}
