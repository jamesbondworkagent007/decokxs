package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SimpleNotes implements Parcelable {
    private ArrayList<Expiry> expiry;
    private ArrayList<OpType> opType;
    private String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleNotes> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(OpType$$serializer.INSTANCE), new ArrayListSerializer(Expiry$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SimpleNotes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleNotes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(OpType.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Expiry.CREATOR.createFromParcel(parcel));
            }
            return new SimpleNotes(string, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleNotes[] newArray(int i) {
            return new SimpleNotes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.SimpleNotes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleNotes copy$default(SimpleNotes simpleNotes, String str, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleNotes.uly;
        }
        if ((i & 2) != 0) {
            arrayList = simpleNotes.opType;
        }
        if ((i & 4) != 0) {
            arrayList2 = simpleNotes.expiry;
        }
        return simpleNotes.copy(str, arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<OpType> component2() {
        return this.opType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Expiry> component3() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleNotes copy(@NotNull String str, @NotNull ArrayList<OpType> arrayList, @NotNull ArrayList<Expiry> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new SimpleNotes(str, arrayList, arrayList2);
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
        if (!(obj instanceof SimpleNotes)) {
            return false;
        }
        SimpleNotes simpleNotes = (SimpleNotes) obj;
        return Intrinsics.EZpvd((Object) this.uly, (Object) simpleNotes.uly) && Intrinsics.EZpvd(this.opType, simpleNotes.opType) && Intrinsics.EZpvd(this.expiry, simpleNotes.expiry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Expiry> getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<OpType> getOpType() {
        return this.opType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.uly.hashCode() * 31) + this.opType.hashCode()) * 31) + this.expiry.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiry(@NotNull ArrayList<Expiry> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.expiry = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpType(@NotNull ArrayList<OpType> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.opType = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleNotes(uly=" + this.uly + ", opType=" + this.opType + ", expiry=" + this.expiry + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.uly);
        ArrayList<OpType> arrayList = this.opType;
        parcel.writeInt(arrayList.size());
        Iterator<OpType> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        ArrayList<Expiry> arrayList2 = this.expiry;
        parcel.writeInt(arrayList2.size());
        Iterator<Expiry> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SimpleNotes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleNotes> serializer() {
            return SimpleNotes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleNotes(int i, String str, ArrayList arrayList, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, SimpleNotes$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.uly = "";
        } else {
            this.uly = str;
        }
        this.opType = arrayList;
        this.expiry = arrayList2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SimpleNotes simpleNotes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) simpleNotes.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, simpleNotes.uly);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], simpleNotes.opType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], simpleNotes.expiry);
    }

    public SimpleNotes(@NotNull String str, @NotNull ArrayList<OpType> arrayList, @NotNull ArrayList<Expiry> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.uly = str;
        this.opType = arrayList;
        this.expiry = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 java.util.ArrayList)
  (r3v0 java.util.ArrayList)
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.OpType>, java.util.ArrayList<com.okinc.unify_trade.biz.Expiry>):void (m)] (LINE:1076) call: com.okinc.unify_trade.biz.SimpleNotes.<init>(java.lang.String, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SimpleNotes(String str, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, arrayList, arrayList2);
    }
}
