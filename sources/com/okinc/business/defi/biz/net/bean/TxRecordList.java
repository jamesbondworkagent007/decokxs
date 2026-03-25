package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class TxRecordList implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<TxRecord> content;
    private Map<String, String> explorerUrl;
    private Boolean hasViewMore;
    private String total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxRecordList> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<TxRecordList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxRecordList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TxRecord.CREATOR.createFromParcel(parcel));
            }
            LinkedHashMap linkedHashMap = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TxRecordList(string, arrayList, boolValueOf, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxRecordList[] newArray(int i) {
            return new TxRecordList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxRecordList() {
        this((String) null, (List) null, (Boolean) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.TxRecordList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxRecordList copy$default(TxRecordList txRecordList, String str, List list, Boolean bool, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = txRecordList.total;
        }
        if ((i & 2) != 0) {
            list = txRecordList.content;
        }
        if ((i & 4) != 0) {
            bool = txRecordList.hasViewMore;
        }
        if ((i & 8) != 0) {
            map = txRecordList.explorerUrl;
        }
        return txRecordList.copy(str, list, bool, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxRecord> component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component4() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxRecordList copy(@NotNull String str, @NotNull List<TxRecord> list, Boolean bool, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TxRecordList(str, list, bool, map);
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
        if (!(obj instanceof TxRecordList)) {
            return false;
        }
        TxRecordList txRecordList = (TxRecordList) obj;
        return Intrinsics.EZpvd((Object) this.total, (Object) txRecordList.total) && Intrinsics.EZpvd(this.content, txRecordList.content) && Intrinsics.EZpvd(this.hasViewMore, txRecordList.hasViewMore) && Intrinsics.EZpvd(this.explorerUrl, txRecordList.explorerUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TxRecord> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasViewMore() {
        return this.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.total.hashCode();
        int iHashCode2 = this.content.hashCode();
        Boolean bool = this.hasViewMore;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Map<String, String> map = this.explorerUrl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull List<TxRecord> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.content = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(Map<String, String> map) {
        this.explorerUrl = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasViewMore(Boolean bool) {
        this.hasViewMore = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.total = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxRecordList(total=" + this.total + ", content=" + this.content + ", hasViewMore=" + this.hasViewMore + ", explorerUrl=" + this.explorerUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.total);
        List<TxRecord> list = this.content;
        parcel.writeInt(list.size());
        Iterator<TxRecord> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Boolean bool = this.hasViewMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Map<String, String> map = this.explorerUrl;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TxRecordList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxRecordList> serializer() {
            return TxRecordList$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(TxRecord$$serializer.INSTANCE), null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }

    public /* synthetic */ TxRecordList(int i, String str, List list, Boolean bool, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.total = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.content = new ArrayList();
        } else {
            this.content = list;
        }
        if ((i & 4) == 0) {
            this.hasViewMore = Boolean.TRUE;
        } else {
            this.hasViewMore = bool;
        }
        if ((i & 8) == 0) {
            this.explorerUrl = null;
        } else {
            this.explorerUrl = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxRecordList txRecordList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) txRecordList.total, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, txRecordList.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(txRecordList.content, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], txRecordList.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(txRecordList.hasViewMore, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, txRecordList.hasViewMore);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && txRecordList.explorerUrl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], txRecordList.explorerUrl);
    }

    public TxRecordList(@NotNull String str, @NotNull List<TxRecord> list, Boolean bool, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.total = str;
        this.content = list;
        this.hasViewMore = bool;
        this.explorerUrl = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:33) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0013: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r4v0 java.util.Map))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.TxRecord>, java.lang.Boolean, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:31) call: com.okinc.business.defi.biz.net.bean.TxRecordList.<init>(java.lang.String, java.util.List, java.lang.Boolean, java.util.Map):void type: THIS */
    public /* synthetic */ TxRecordList(String str, List list, Boolean bool, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? Boolean.TRUE : bool, (i & 8) != 0 ? null : map);
    }
}
