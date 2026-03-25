package com.okinc.account.api.model.security;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class CodeVerifyResp implements Parcelable {
    private int behavior;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CodeVerifyResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CodeVerifyResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CodeVerifyResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CodeVerifyResp(parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CodeVerifyResp[] newArray(int i) {
            return new CodeVerifyResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public CodeVerifyResp() {
        int i = 0;
        this(i, i, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CodeVerifyResp copy$default(CodeVerifyResp codeVerifyResp, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = codeVerifyResp.behavior;
        }
        if ((i3 & 2) != 0) {
            i2 = codeVerifyResp.type;
        }
        return codeVerifyResp.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CodeVerifyResp copy(int i, int i2) {
        return new CodeVerifyResp(i, i2);
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
        if (!(obj instanceof CodeVerifyResp)) {
            return false;
        }
        CodeVerifyResp codeVerifyResp = (CodeVerifyResp) obj;
        return this.behavior == codeVerifyResp.behavior && this.type == codeVerifyResp.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.behavior) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBehavior(int i) {
        this.behavior = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CodeVerifyResp(behavior=" + this.behavior + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.behavior);
        parcel.writeInt(this.type);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.security.CodeVerifyResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CodeVerifyResp> serializer() {
            return CodeVerifyResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CodeVerifyResp(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.behavior = -1;
        } else {
            this.behavior = i2;
        }
        if ((i & 2) == 0) {
            this.type = -1;
        } else {
            this.type = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(CodeVerifyResp codeVerifyResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || codeVerifyResp.behavior != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, codeVerifyResp.behavior);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && codeVerifyResp.type == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, codeVerifyResp.type);
    }

    public CodeVerifyResp(int i, int i2) {
        this.behavior = i;
        this.type = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:11) call: com.okinc.account.api.model.security.CodeVerifyResp.<init>(int, int):void type: THIS */
    public /* synthetic */ CodeVerifyResp(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }
}
