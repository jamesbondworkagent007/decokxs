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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BotLeadProfitProfitUserListDetails implements Parcelable {
    private ArrayList<BotLeadProfitProfitDetailsUser> details;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadProfitProfitUserListDetails> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(BotLeadProfitProfitDetailsUser$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<BotLeadProfitProfitUserListDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitUserListDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(BotLeadProfitProfitDetailsUser.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BotLeadProfitProfitUserListDetails(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitUserListDetails[] newArray(int i) {
            return new BotLeadProfitProfitUserListDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadProfitProfitUserListDetails() {
        this((ArrayList) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotLeadProfitProfitUserListDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotLeadProfitProfitUserListDetails copy$default(BotLeadProfitProfitUserListDetails botLeadProfitProfitUserListDetails, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = botLeadProfitProfitUserListDetails.details;
        }
        return botLeadProfitProfitUserListDetails.copy(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BotLeadProfitProfitDetailsUser> component1() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadProfitProfitUserListDetails copy(ArrayList<BotLeadProfitProfitDetailsUser> arrayList) {
        return new BotLeadProfitProfitUserListDetails(arrayList);
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
        return (obj instanceof BotLeadProfitProfitUserListDetails) && Intrinsics.EZpvd(this.details, ((BotLeadProfitProfitUserListDetails) obj).details);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BotLeadProfitProfitDetailsUser> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<BotLeadProfitProfitDetailsUser> arrayList = this.details;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetails(ArrayList<BotLeadProfitProfitDetailsUser> arrayList) {
        this.details = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadProfitProfitUserListDetails(details=" + this.details + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<BotLeadProfitProfitDetailsUser> arrayList = this.details;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<BotLeadProfitProfitDetailsUser> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadProfitProfitUserListDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadProfitProfitUserListDetails> serializer() {
            return BotLeadProfitProfitUserListDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadProfitProfitUserListDetails(int i, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.details = new ArrayList<>();
        } else {
            this.details = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadProfitProfitUserListDetails botLeadProfitProfitUserListDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(botLeadProfitProfitUserListDetails.details, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], botLeadProfitProfitUserListDetails.details);
    }

    public BotLeadProfitProfitUserListDetails(ArrayList<BotLeadProfitProfitDetailsUser> arrayList) {
        this.details = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3769) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.biz.BotLeadProfitProfitDetailsUser>):void (m)] (LINE:3768) call: com.okinc.unify_trade.biz.BotLeadProfitProfitUserListDetails.<init>(java.util.ArrayList):void type: THIS */
    public /* synthetic */ BotLeadProfitProfitUserListDetails(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
