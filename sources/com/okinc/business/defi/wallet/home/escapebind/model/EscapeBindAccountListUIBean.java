package com.okinc.business.defi.wallet.home.escapebind.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class EscapeBindAccountListUIBean implements Parcelable {
    private final String aaAccountId;
    private final String aaAccountName;
    private final List<EscapeAccountDetailUIBean> tokens;
    private final String totalCurrencyAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeBindAccountListUIBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(EscapeAccountDetailUIBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<EscapeBindAccountListUIBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeBindAccountListUIBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EscapeAccountDetailUIBean.CREATOR.createFromParcel(parcel));
            }
            return new EscapeBindAccountListUIBean(string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeBindAccountListUIBean[] newArray(int i) {
            return new EscapeBindAccountListUIBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapeBindAccountListUIBean copy$default(EscapeBindAccountListUIBean escapeBindAccountListUIBean, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapeBindAccountListUIBean.aaAccountId;
        }
        if ((i & 2) != 0) {
            str2 = escapeBindAccountListUIBean.aaAccountName;
        }
        if ((i & 4) != 0) {
            str3 = escapeBindAccountListUIBean.totalCurrencyAmount;
        }
        if ((i & 8) != 0) {
            list = escapeBindAccountListUIBean.tokens;
        }
        return escapeBindAccountListUIBean.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.aaAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.aaAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeAccountDetailUIBean> component4() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeBindAccountListUIBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<EscapeAccountDetailUIBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EscapeBindAccountListUIBean(str, str2, str3, list);
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
        if (!(obj instanceof EscapeBindAccountListUIBean)) {
            return false;
        }
        EscapeBindAccountListUIBean escapeBindAccountListUIBean = (EscapeBindAccountListUIBean) obj;
        return Intrinsics.EZpvd((Object) this.aaAccountId, (Object) escapeBindAccountListUIBean.aaAccountId) && Intrinsics.EZpvd((Object) this.aaAccountName, (Object) escapeBindAccountListUIBean.aaAccountName) && Intrinsics.EZpvd((Object) this.totalCurrencyAmount, (Object) escapeBindAccountListUIBean.totalCurrencyAmount) && Intrinsics.EZpvd(this.tokens, escapeBindAccountListUIBean.tokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAaAccountId() {
        return this.aaAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAaAccountName() {
        return this.aaAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeAccountDetailUIBean> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCurrencyAmount() {
        return this.totalCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.aaAccountId.hashCode() * 31) + this.aaAccountName.hashCode()) * 31) + this.totalCurrencyAmount.hashCode()) * 31) + this.tokens.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeBindAccountListUIBean(aaAccountId=" + this.aaAccountId + ", aaAccountName=" + this.aaAccountName + ", totalCurrencyAmount=" + this.totalCurrencyAmount + ", tokens=" + this.tokens + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.aaAccountId);
        parcel.writeString(this.aaAccountName);
        parcel.writeString(this.totalCurrencyAmount);
        List<EscapeAccountDetailUIBean> list = this.tokens;
        parcel.writeInt(list.size());
        Iterator<EscapeAccountDetailUIBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeBindAccountListUIBean> serializer() {
            return EscapeBindAccountListUIBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeBindAccountListUIBean(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, EscapeBindAccountListUIBean$$serializer.INSTANCE.getDescriptor());
        }
        this.aaAccountId = str;
        this.aaAccountName = str2;
        this.totalCurrencyAmount = str3;
        this.tokens = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeBindAccountListUIBean escapeBindAccountListUIBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, escapeBindAccountListUIBean.aaAccountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, escapeBindAccountListUIBean.aaAccountName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, escapeBindAccountListUIBean.totalCurrencyAmount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], escapeBindAccountListUIBean.tokens);
    }

    public EscapeBindAccountListUIBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<EscapeAccountDetailUIBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.aaAccountId = str;
        this.aaAccountName = str2;
        this.totalCurrencyAmount = str3;
        this.tokens = list;
    }
}
