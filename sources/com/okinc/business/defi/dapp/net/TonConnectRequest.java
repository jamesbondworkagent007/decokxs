package com.okinc.business.defi.dapp.net;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class TonConnectRequest implements Parcelable {
    private List<TonConnectItem> items;
    private String manifestUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TonConnectRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TonConnectItem$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<TonConnectRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TonConnectRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TonConnectItem.CREATOR.createFromParcel(parcel));
            }
            return new TonConnectRequest(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TonConnectRequest[] newArray(int i) {
            return new TonConnectRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.net.TonConnectRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TonConnectRequest copy$default(TonConnectRequest tonConnectRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonConnectRequest.manifestUrl;
        }
        if ((i & 2) != 0) {
            list = tonConnectRequest.items;
        }
        return tonConnectRequest.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.manifestUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TonConnectItem> component2() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonConnectRequest copy(String str, @NotNull List<TonConnectItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TonConnectRequest(str, list);
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
        if (!(obj instanceof TonConnectRequest)) {
            return false;
        }
        TonConnectRequest tonConnectRequest = (TonConnectRequest) obj;
        return Intrinsics.EZpvd((Object) this.manifestUrl, (Object) tonConnectRequest.manifestUrl) && Intrinsics.EZpvd(this.items, tonConnectRequest.items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TonConnectItem> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getManifestUrl() {
        return this.manifestUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.manifestUrl;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.items.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItems(@NotNull List<TonConnectItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setManifestUrl(String str) {
        this.manifestUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonConnectRequest(manifestUrl=" + this.manifestUrl + ", items=" + this.items + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.manifestUrl);
        List<TonConnectItem> list = this.items;
        parcel.writeInt(list.size());
        Iterator<TonConnectItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.TonConnectRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonConnectRequest> serializer() {
            return TonConnectRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonConnectRequest(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, TonConnectRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.manifestUrl = "";
        } else {
            this.manifestUrl = str;
        }
        this.items = list;
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(TonConnectRequest tonConnectRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tonConnectRequest.manifestUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tonConnectRequest.manifestUrl);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], tonConnectRequest.items);
    }

    public TonConnectRequest(String str, @NotNull List<TonConnectItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.manifestUrl = str;
        this.items = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 java.util.List)
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.dapp.net.TonConnectItem>):void (m)] (LINE:243) call: com.okinc.business.defi.dapp.net.TonConnectRequest.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TonConnectRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, list);
    }
}
