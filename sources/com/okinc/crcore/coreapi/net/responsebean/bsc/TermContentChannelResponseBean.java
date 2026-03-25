package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TermContentChannelResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final TermsURLContentDataResponseBean content;
    private final int mode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TermContentChannelResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<TermContentChannelResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TermContentChannelResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TermContentChannelResponseBean(parcel.readInt(), parcel.readInt() == 0 ? null : TermsURLContentDataResponseBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TermContentChannelResponseBean[] newArray(int i) {
            return new TermContentChannelResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TermContentChannelResponseBean() {
        this(0, (TermsURLContentDataResponseBean) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TermContentChannelResponseBean copy$default(TermContentChannelResponseBean termContentChannelResponseBean, int i, TermsURLContentDataResponseBean termsURLContentDataResponseBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = termContentChannelResponseBean.mode;
        }
        if ((i2 & 2) != 0) {
            termsURLContentDataResponseBean = termContentChannelResponseBean.content;
        }
        return termContentChannelResponseBean.copy(i, termsURLContentDataResponseBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermsURLContentDataResponseBean component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermContentChannelResponseBean copy(int i, TermsURLContentDataResponseBean termsURLContentDataResponseBean) {
        return new TermContentChannelResponseBean(i, termsURLContentDataResponseBean);
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
        if (!(obj instanceof TermContentChannelResponseBean)) {
            return false;
        }
        TermContentChannelResponseBean termContentChannelResponseBean = (TermContentChannelResponseBean) obj;
        return this.mode == termContentChannelResponseBean.mode && Intrinsics.EZpvd(this.content, termContentChannelResponseBean.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermsURLContentDataResponseBean getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.mode);
        TermsURLContentDataResponseBean termsURLContentDataResponseBean = this.content;
        return (iHashCode * 31) + (termsURLContentDataResponseBean == null ? 0 : termsURLContentDataResponseBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TermContentChannelResponseBean(mode=" + this.mode + ", content=" + this.content + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.mode);
        TermsURLContentDataResponseBean termsURLContentDataResponseBean = this.content;
        if (termsURLContentDataResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            termsURLContentDataResponseBean.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.TermContentChannelResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TermContentChannelResponseBean> serializer() {
            return TermContentChannelResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TermContentChannelResponseBean(int i, int i2, TermsURLContentDataResponseBean termsURLContentDataResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        this.mode = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.content = null;
        } else {
            this.content = termsURLContentDataResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TermContentChannelResponseBean termContentChannelResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || termContentChannelResponseBean.mode != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, termContentChannelResponseBean.mode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && termContentChannelResponseBean.content == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TermsURLContentDataResponseBean$$serializer.INSTANCE, termContentChannelResponseBean.content);
    }

    public TermContentChannelResponseBean(int i, TermsURLContentDataResponseBean termsURLContentDataResponseBean) {
        this.mode = i;
        this.content = termsURLContentDataResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean) : (r2v0 com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean))
 A[MD:(int, com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.TermContentChannelResponseBean.<init>(int, com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean):void type: THIS */
    public /* synthetic */ TermContentChannelResponseBean(int i, TermsURLContentDataResponseBean termsURLContentDataResponseBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : termsURLContentDataResponseBean);
    }
}
