package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public abstract class SubmitOrderMetadata implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tfS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SubmitOrderMetadata._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SubmitOrderMetadata(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void write$Self(SubmitOrderMetadata submitOrderMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) SubmitOrderMetadata.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SubmitOrderMetadata> serializer() {
            return copydefault();
        }
    }

    private SubmitOrderMetadata() {
    }

    public /* synthetic */ SubmitOrderMetadata(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata", C56524yIo.AEQbTJ(SubmitOrderMetadata.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(BlikMetadata.class), C56524yIo.AEQbTJ(GooglePayMetadata.class)}, new KSerializer[]{SubmitOrderMetadata$BlikMetadata$$serializer.INSTANCE, SubmitOrderMetadata$GooglePayMetadata$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Serializable
    public static final class GooglePayMetadata extends SubmitOrderMetadata {
        public static final int $stable = 0;
        private final String assuranceDetails;
        private final String billingAddress;
        private final String paymentTransientData;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<GooglePayMetadata> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<GooglePayMetadata> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayMetadata createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new GooglePayMetadata(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayMetadata[] newArray(int i) {
                return new GooglePayMetadata[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAssuranceDetails() {
            return this.assuranceDetails;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBillingAddress() {
            return this.billingAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPaymentTransientData() {
            return this.paymentTransientData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.billingAddress);
            parcel.writeString(this.paymentTransientData);
            parcel.writeString(this.assuranceDetails);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata.GooglePayMetadata.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<GooglePayMetadata> serializer() {
                return SubmitOrderMetadata$GooglePayMetadata$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GooglePayMetadata(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, SubmitOrderMetadata$GooglePayMetadata$$serializer.INSTANCE.getDescriptor());
            }
            this.billingAddress = str;
            this.paymentTransientData = str2;
            this.assuranceDetails = str3;
        }

        public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(GooglePayMetadata googlePayMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SubmitOrderMetadata.write$Self(googlePayMetadata, compositeEncoder, serialDescriptor);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, googlePayMetadata.billingAddress);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, googlePayMetadata.paymentTransientData);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, googlePayMetadata.assuranceDetails);
        }

        public GooglePayMetadata(String str, String str2, String str3) {
            super(null);
            this.billingAddress = str;
            this.paymentTransientData = str2;
            this.assuranceDetails = str3;
        }
    }

    @Serializable
    public static final class BlikMetadata extends SubmitOrderMetadata {
        private String authCode;
        private String fxRateSessionToken;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<BlikMetadata> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<BlikMetadata> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BlikMetadata createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BlikMetadata(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BlikMetadata[] newArray(int i) {
                return new BlikMetadata[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BlikMetadata() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BlikMetadata copy$default(BlikMetadata blikMetadata, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = blikMetadata.fxRateSessionToken;
            }
            if ((i & 2) != 0) {
                str2 = blikMetadata.authCode;
            }
            return blikMetadata.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.fxRateSessionToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.authCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BlikMetadata copy(String str, String str2) {
            return new BlikMetadata(str, str2);
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
            if (!(obj instanceof BlikMetadata)) {
                return false;
            }
            BlikMetadata blikMetadata = (BlikMetadata) obj;
            return Intrinsics.EZpvd((Object) this.fxRateSessionToken, (Object) blikMetadata.fxRateSessionToken) && Intrinsics.EZpvd((Object) this.authCode, (Object) blikMetadata.authCode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAuthCode() {
            return this.authCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFxRateSessionToken() {
            return this.fxRateSessionToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.fxRateSessionToken;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.authCode;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthCode(String str) {
            this.authCode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFxRateSessionToken(String str) {
            this.fxRateSessionToken = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BlikMetadata(fxRateSessionToken=" + this.fxRateSessionToken + ", authCode=" + this.authCode + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.fxRateSessionToken);
            parcel.writeString(this.authCode);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata.BlikMetadata.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BlikMetadata> serializer() {
                return SubmitOrderMetadata$BlikMetadata$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BlikMetadata(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.fxRateSessionToken = null;
            } else {
                this.fxRateSessionToken = str;
            }
            if ((i & 2) == 0) {
                this.authCode = null;
            } else {
                this.authCode = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(BlikMetadata blikMetadata, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            SubmitOrderMetadata.write$Self(blikMetadata, compositeEncoder, serialDescriptor);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || blikMetadata.fxRateSessionToken != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, blikMetadata.fxRateSessionToken);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && blikMetadata.authCode == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, blikMetadata.authCode);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:67) call: com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderMetadata.BlikMetadata.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ BlikMetadata(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public BlikMetadata(String str, String str2) {
            super(null);
            this.fxRateSessionToken = str;
            this.authCode = str2;
        }
    }
}
