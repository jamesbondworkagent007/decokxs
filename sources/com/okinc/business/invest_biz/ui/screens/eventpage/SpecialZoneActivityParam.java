package com.okinc.business.invest_biz.ui.screens.eventpage;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SpecialZoneActivityParam implements Parcelable {
    public static final int $stable = 0;
    private final int specifyTabId;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpecialZoneActivityParam> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SpecialZoneActivityParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecialZoneActivityParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpecialZoneActivityParam(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecialZoneActivityParam[] newArray(int i) {
            return new SpecialZoneActivityParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpecialZoneActivityParam copy$default(SpecialZoneActivityParam specialZoneActivityParam, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = specialZoneActivityParam.walletId;
        }
        if ((i2 & 2) != 0) {
            i = specialZoneActivityParam.specifyTabId;
        }
        return specialZoneActivityParam.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.specifyTabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpecialZoneActivityParam copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SpecialZoneActivityParam(str, i);
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
        if (!(obj instanceof SpecialZoneActivityParam)) {
            return false;
        }
        SpecialZoneActivityParam specialZoneActivityParam = (SpecialZoneActivityParam) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) specialZoneActivityParam.walletId) && this.specifyTabId == specialZoneActivityParam.specifyTabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSpecifyTabId() {
        return this.specifyTabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletId.hashCode() * 31) + Integer.hashCode(this.specifyTabId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpecialZoneActivityParam(walletId=" + this.walletId + ", specifyTabId=" + this.specifyTabId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        parcel.writeInt(this.specifyTabId);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.eventpage.SpecialZoneActivityParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpecialZoneActivityParam> serializer() {
            return SpecialZoneActivityParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpecialZoneActivityParam(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, SpecialZoneActivityParam$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str;
        }
        this.specifyTabId = i2;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(SpecialZoneActivityParam specialZoneActivityParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) specialZoneActivityParam.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, specialZoneActivityParam.walletId);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, specialZoneActivityParam.specifyTabId);
    }

    public SpecialZoneActivityParam(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
        this.specifyTabId = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 int)
 A[MD:(java.lang.String, int):void (m)] (LINE:24) call: com.okinc.business.invest_biz.ui.screens.eventpage.SpecialZoneActivityParam.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ SpecialZoneActivityParam(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i);
    }
}
