package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CheckCreateAvailableResp implements Parcelable {
    public static final int $stable = 0;
    private final int createAvailable;
    private final int importAvailable;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CheckCreateAvailableResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckCreateAvailableResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckCreateAvailableResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CheckCreateAvailableResp(parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckCreateAvailableResp[] newArray(int i) {
            return new CheckCreateAvailableResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckCreateAvailableResp copy$default(CheckCreateAvailableResp checkCreateAvailableResp, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = checkCreateAvailableResp.createAvailable;
        }
        if ((i3 & 2) != 0) {
            i2 = checkCreateAvailableResp.importAvailable;
        }
        return checkCreateAvailableResp.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.createAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.importAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckCreateAvailableResp copy(int i, int i2) {
        return new CheckCreateAvailableResp(i, i2);
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
        if (!(obj instanceof CheckCreateAvailableResp)) {
            return false;
        }
        CheckCreateAvailableResp checkCreateAvailableResp = (CheckCreateAvailableResp) obj;
        return this.createAvailable == checkCreateAvailableResp.createAvailable && this.importAvailable == checkCreateAvailableResp.importAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCreateAvailable() {
        return this.createAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImportAvailable() {
        return this.importAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.createAvailable) * 31) + Integer.hashCode(this.importAvailable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckCreateAvailableResp(createAvailable=" + this.createAvailable + ", importAvailable=" + this.importAvailable + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.createAvailable);
        parcel.writeInt(this.importAvailable);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CheckCreateAvailableResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckCreateAvailableResp> serializer() {
            return CheckCreateAvailableResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckCreateAvailableResp(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CheckCreateAvailableResp$$serializer.INSTANCE.getDescriptor());
        }
        this.createAvailable = i2;
        this.importAvailable = i3;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CheckCreateAvailableResp checkCreateAvailableResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, checkCreateAvailableResp.createAvailable);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, checkCreateAvailableResp.importAvailable);
    }

    public CheckCreateAvailableResp(int i, int i2) {
        this.createAvailable = i;
        this.importAvailable = i2;
    }
}
