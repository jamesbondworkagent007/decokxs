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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTag implements Parcelable {
    public static final int $stable = 0;
    public final String title;
    public final int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestTag> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTag> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTag(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTag[] newArray(int i) {
            return new InvestTag[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTag() {
        this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestTag copy$default(InvestTag investTag, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investTag.title;
        }
        if ((i2 & 2) != 0) {
            i = investTag.type;
        }
        return investTag.copydefault(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTag copydefault(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestTag(str, i);
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
        if (!(obj instanceof InvestTag)) {
            return false;
        }
        InvestTag investTag = (InvestTag) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) investTag.title) && this.type == investTag.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.title.hashCode() * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTag(title=" + this.title + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeInt(this.type);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTag> serializer() {
            return InvestTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTag(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.type = 1;
        } else {
            this.type = i2;
        }
    }

    public static final /* synthetic */ void OLrzqt(InvestTag investTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investTag.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investTag.title);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && investTag.type == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, investTag.type);
    }

    public InvestTag(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.type = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:369) call: com.okinc.business.invest_biz.data.bean.InvestTag.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ InvestTag(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i);
    }
}
