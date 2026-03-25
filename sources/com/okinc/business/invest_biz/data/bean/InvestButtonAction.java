package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestButtonAction implements Parcelable {
    public static final int $stable = 0;
    public static final String ACTION_CALLBACK_CLOSE = "CLOSE";
    public static final String ACTION_CALLBACK_REFRESH = "REFRESH";
    public static final String ACTION_CALLBACK_URL_REDIRECT = "URL_REDIRECT";
    private final String actionCallback;
    private final String actionName;
    private final String actionURL;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestButtonAction> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestButtonAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestButtonAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestButtonAction(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestButtonAction[] newArray(int i) {
            return new InvestButtonAction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestButtonAction() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestButtonAction copy$default(InvestButtonAction investButtonAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investButtonAction.actionCallback;
        }
        if ((i & 2) != 0) {
            str2 = investButtonAction.actionName;
        }
        if ((i & 4) != 0) {
            str3 = investButtonAction.actionURL;
        }
        return investButtonAction.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.actionCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.actionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.actionURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestButtonAction copy(String str, String str2, String str3) {
        return new InvestButtonAction(str, str2, str3);
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
        if (!(obj instanceof InvestButtonAction)) {
            return false;
        }
        InvestButtonAction investButtonAction = (InvestButtonAction) obj;
        return Intrinsics.EZpvd((Object) this.actionCallback, (Object) investButtonAction.actionCallback) && Intrinsics.EZpvd((Object) this.actionName, (Object) investButtonAction.actionName) && Intrinsics.EZpvd((Object) this.actionURL, (Object) investButtonAction.actionURL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionCallback() {
        return this.actionCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionName() {
        return this.actionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionURL() {
        return this.actionURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.actionCallback;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.actionName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.actionURL;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestButtonAction(actionCallback=" + this.actionCallback + ", actionName=" + this.actionName + ", actionURL=" + this.actionURL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.actionCallback);
        parcel.writeString(this.actionName);
        parcel.writeString(this.actionURL);
    }

    public /* synthetic */ InvestButtonAction(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actionCallback = null;
        } else {
            this.actionCallback = str;
        }
        if ((i & 2) == 0) {
            this.actionName = null;
        } else {
            this.actionName = str2;
        }
        if ((i & 4) == 0) {
            this.actionURL = null;
        } else {
            this.actionURL = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestButtonAction investButtonAction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investButtonAction.actionCallback != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investButtonAction.actionCallback);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investButtonAction.actionName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investButtonAction.actionName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && investButtonAction.actionURL == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investButtonAction.actionURL);
    }

    public InvestButtonAction(String str, String str2, String str3) {
        this.actionCallback = str;
        this.actionName = str2;
        this.actionURL = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:231) call: com.okinc.business.invest_biz.data.bean.InvestButtonAction.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestButtonAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestButtonAction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestButtonAction> serializer() {
            return InvestButtonAction$$serializer.INSTANCE;
        }
    }
}
