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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WebDeskModeConfigList implements Parcelable {
    private List<WebDeskModeConfig> configList;
    private String defaultWebUA;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WebDeskModeConfigList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(WebDeskModeConfig$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<WebDeskModeConfigList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebDeskModeConfigList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(WebDeskModeConfig.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new WebDeskModeConfigList(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebDeskModeConfigList[] newArray(int i) {
            return new WebDeskModeConfigList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.net.WebDeskModeConfigList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebDeskModeConfigList copy$default(WebDeskModeConfigList webDeskModeConfigList, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webDeskModeConfigList.defaultWebUA;
        }
        if ((i & 2) != 0) {
            list = webDeskModeConfigList.configList;
        }
        return webDeskModeConfigList.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.defaultWebUA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WebDeskModeConfig> component2() {
        return this.configList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebDeskModeConfigList copy(@NotNull String str, List<WebDeskModeConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WebDeskModeConfigList(str, list);
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
        if (!(obj instanceof WebDeskModeConfigList)) {
            return false;
        }
        WebDeskModeConfigList webDeskModeConfigList = (WebDeskModeConfigList) obj;
        return Intrinsics.EZpvd((Object) this.defaultWebUA, (Object) webDeskModeConfigList.defaultWebUA) && Intrinsics.EZpvd(this.configList, webDeskModeConfigList.configList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WebDeskModeConfig> getConfigList() {
        return this.configList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultWebUA() {
        return this.defaultWebUA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.defaultWebUA.hashCode();
        List<WebDeskModeConfig> list = this.configList;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfigList(List<WebDeskModeConfig> list) {
        this.configList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultWebUA(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.defaultWebUA = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebDeskModeConfigList(defaultWebUA=" + this.defaultWebUA + ", configList=" + this.configList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.defaultWebUA);
        List<WebDeskModeConfig> list = this.configList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<WebDeskModeConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.WebDeskModeConfigList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WebDeskModeConfigList> serializer() {
            return WebDeskModeConfigList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WebDeskModeConfigList(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WebDeskModeConfigList$$serializer.INSTANCE.getDescriptor());
        }
        this.defaultWebUA = str;
        if ((i & 2) == 0) {
            this.configList = null;
        } else {
            this.configList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(WebDeskModeConfigList webDeskModeConfigList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, webDeskModeConfigList.defaultWebUA);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && webDeskModeConfigList.configList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], webDeskModeConfigList.configList);
    }

    public WebDeskModeConfigList(@NotNull String str, List<WebDeskModeConfig> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.defaultWebUA = str;
        this.configList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.dapp.net.WebDeskModeConfig>):void (m)] (LINE:180) call: com.okinc.business.defi.dapp.net.WebDeskModeConfigList.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WebDeskModeConfigList(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
