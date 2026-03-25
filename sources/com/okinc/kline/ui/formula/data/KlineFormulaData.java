package com.okinc.kline.ui.formula.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineFormulaData implements Parcelable {
    private String calcExpression;
    private String instIdArray;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlineFormulaData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KlineFormulaData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFormulaData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KlineFormulaData(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineFormulaData[] newArray(int i) {
            return new KlineFormulaData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KlineFormulaData copy$default(KlineFormulaData klineFormulaData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klineFormulaData.calcExpression;
        }
        if ((i & 2) != 0) {
            str2 = klineFormulaData.instIdArray;
        }
        return klineFormulaData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.calcExpression;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instIdArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineFormulaData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new KlineFormulaData(str, str2);
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
        if (!(obj instanceof KlineFormulaData)) {
            return false;
        }
        KlineFormulaData klineFormulaData = (KlineFormulaData) obj;
        return Intrinsics.EZpvd((Object) this.calcExpression, (Object) klineFormulaData.calcExpression) && Intrinsics.EZpvd((Object) this.instIdArray, (Object) klineFormulaData.instIdArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalcExpression() {
        return this.calcExpression;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstIdArray() {
        return this.instIdArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.calcExpression.hashCode() * 31) + this.instIdArray.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalcExpression(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.calcExpression = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIdArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instIdArray = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineFormulaData(calcExpression=" + this.calcExpression + ", instIdArray=" + this.instIdArray + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.calcExpression);
        parcel.writeString(this.instIdArray);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.ui.formula.data.KlineFormulaData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineFormulaData> serializer() {
            return KlineFormulaData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KlineFormulaData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, KlineFormulaData$$serializer.INSTANCE.getDescriptor());
        }
        this.calcExpression = str;
        this.instIdArray = str2;
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(KlineFormulaData klineFormulaData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, klineFormulaData.calcExpression);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, klineFormulaData.instIdArray);
    }

    public KlineFormulaData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.calcExpression = str;
        this.instIdArray = str2;
    }
}
