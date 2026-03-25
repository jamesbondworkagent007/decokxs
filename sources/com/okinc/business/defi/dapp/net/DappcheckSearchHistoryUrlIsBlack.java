package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappcheckSearchHistoryUrlIsBlack implements Parcelable {
    private List<String> urlList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappcheckSearchHistoryUrlIsBlack> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DappcheckSearchHistoryUrlIsBlack> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappcheckSearchHistoryUrlIsBlack createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappcheckSearchHistoryUrlIsBlack(parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappcheckSearchHistoryUrlIsBlack[] newArray(int i) {
            return new DappcheckSearchHistoryUrlIsBlack[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.net.DappcheckSearchHistoryUrlIsBlack */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DappcheckSearchHistoryUrlIsBlack copy$default(DappcheckSearchHistoryUrlIsBlack dappcheckSearchHistoryUrlIsBlack, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dappcheckSearchHistoryUrlIsBlack.urlList;
        }
        return dappcheckSearchHistoryUrlIsBlack.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.urlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappcheckSearchHistoryUrlIsBlack copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DappcheckSearchHistoryUrlIsBlack(list);
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
        return (obj instanceof DappcheckSearchHistoryUrlIsBlack) && Intrinsics.EZpvd(this.urlList, ((DappcheckSearchHistoryUrlIsBlack) obj).urlList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUrlList() {
        return this.urlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.urlList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrlList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.urlList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappcheckSearchHistoryUrlIsBlack(urlList=" + this.urlList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.urlList);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappcheckSearchHistoryUrlIsBlack.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappcheckSearchHistoryUrlIsBlack> serializer() {
            return DappcheckSearchHistoryUrlIsBlack$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappcheckSearchHistoryUrlIsBlack(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DappcheckSearchHistoryUrlIsBlack$$serializer.INSTANCE.getDescriptor());
        }
        this.urlList = list;
    }

    public DappcheckSearchHistoryUrlIsBlack(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.urlList = list;
    }
}
