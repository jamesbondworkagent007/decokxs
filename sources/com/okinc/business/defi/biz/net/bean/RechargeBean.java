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
public final class RechargeBean implements Parcelable {
    public static final int $stable = 0;
    private final String content;
    private final int icon;
    private final boolean isRecommended;
    private final RechargeNavigationBean navigationData;
    private final String title;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RechargeBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RechargeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RechargeBean(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), RechargeNavigationBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeBean[] newArray(int i) {
            return new RechargeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RechargeBean copy$default(RechargeBean rechargeBean, String str, String str2, boolean z, String str3, int i, RechargeNavigationBean rechargeNavigationBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rechargeBean.type;
        }
        if ((i2 & 2) != 0) {
            str2 = rechargeBean.title;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            z = rechargeBean.isRecommended;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str3 = rechargeBean.content;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            i = rechargeBean.icon;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            rechargeNavigationBean = rechargeBean.navigationData;
        }
        return rechargeBean.copy(str, str4, z2, str5, i3, rechargeNavigationBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isRecommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RechargeNavigationBean component6() {
        return this.navigationData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RechargeBean copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, int i, @NotNull RechargeNavigationBean rechargeNavigationBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rechargeNavigationBean, "");
        return new RechargeBean(str, str2, z, str3, i, rechargeNavigationBean);
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
        if (!(obj instanceof RechargeBean)) {
            return false;
        }
        RechargeBean rechargeBean = (RechargeBean) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) rechargeBean.type) && Intrinsics.EZpvd((Object) this.title, (Object) rechargeBean.title) && this.isRecommended == rechargeBean.isRecommended && Intrinsics.EZpvd((Object) this.content, (Object) rechargeBean.content) && this.icon == rechargeBean.icon && Intrinsics.EZpvd(this.navigationData, rechargeBean.navigationData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RechargeNavigationBean getNavigationData() {
        return this.navigationData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isRecommended)) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + this.navigationData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecommended() {
        return this.isRecommended;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RechargeBean(type=" + this.type + ", title=" + this.title + ", isRecommended=" + this.isRecommended + ", content=" + this.content + ", icon=" + this.icon + ", navigationData=" + this.navigationData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeInt(this.isRecommended ? 1 : 0);
        parcel.writeString(this.content);
        parcel.writeInt(this.icon);
        this.navigationData.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RechargeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RechargeBean> serializer() {
            return RechargeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RechargeBean(int i, String str, String str2, boolean z, String str3, int i2, RechargeNavigationBean rechargeNavigationBean, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, RechargeBean$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.title = str2;
        this.isRecommended = z;
        this.content = str3;
        this.icon = i2;
        this.navigationData = rechargeNavigationBean;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RechargeBean rechargeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rechargeBean.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rechargeBean.title);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, rechargeBean.isRecommended);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, rechargeBean.content);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, rechargeBean.icon);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, RechargeNavigationBean$$serializer.INSTANCE, rechargeBean.navigationData);
    }

    public RechargeBean(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, int i, @NotNull RechargeNavigationBean rechargeNavigationBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(rechargeNavigationBean, "");
        this.type = str;
        this.title = str2;
        this.isRecommended = z;
        this.content = str3;
        this.icon = i;
        this.navigationData = rechargeNavigationBean;
    }
}
