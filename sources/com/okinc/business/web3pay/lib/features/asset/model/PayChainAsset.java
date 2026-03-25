package com.okinc.business.web3pay.lib.features.asset.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PayChainAsset implements Parcelable {
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final ArrayList<ConvertPayTokenAsset> suggestConvertTokenList;
    private final ArrayList<PayTokenAsset> tokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PayChainAsset> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(PayTokenAsset$$serializer.INSTANCE), new ArrayListSerializer(ConvertPayTokenAsset$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<PayChainAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayChainAsset createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(PayTokenAsset.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(ConvertPayTokenAsset.CREATOR.createFromParcel(parcel));
                }
            }
            return new PayChainAsset(string, string2, string3, arrayList2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PayChainAsset[] newArray(int i) {
            return new PayChainAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.web3pay.lib.features.asset.model.PayChainAsset */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayChainAsset copy$default(PayChainAsset payChainAsset, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payChainAsset.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = payChainAsset.chainLogo;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = payChainAsset.chainName;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            arrayList = payChainAsset.tokenList;
        }
        ArrayList arrayList3 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = payChainAsset.suggestConvertTokenList;
        }
        return payChainAsset.copy(str, str4, str5, arrayList3, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PayTokenAsset> component4() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConvertPayTokenAsset> component5() {
        return this.suggestConvertTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayChainAsset copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ArrayList<PayTokenAsset> arrayList, ArrayList<ConvertPayTokenAsset> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new PayChainAsset(str, str2, str3, arrayList, arrayList2);
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
        if (!(obj instanceof PayChainAsset)) {
            return false;
        }
        PayChainAsset payChainAsset = (PayChainAsset) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) payChainAsset.chainIndex) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) payChainAsset.chainLogo) && Intrinsics.EZpvd((Object) this.chainName, (Object) payChainAsset.chainName) && Intrinsics.EZpvd(this.tokenList, payChainAsset.tokenList) && Intrinsics.EZpvd(this.suggestConvertTokenList, payChainAsset.suggestConvertTokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ConvertPayTokenAsset> getSuggestConvertTokenList() {
        return this.suggestConvertTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PayTokenAsset> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.chainLogo.hashCode();
        int iHashCode3 = this.chainName.hashCode();
        int iHashCode4 = this.tokenList.hashCode();
        ArrayList<ConvertPayTokenAsset> arrayList = this.suggestConvertTokenList;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayChainAsset(chainIndex=" + this.chainIndex + ", chainLogo=" + this.chainLogo + ", chainName=" + this.chainName + ", tokenList=" + this.tokenList + ", suggestConvertTokenList=" + this.suggestConvertTokenList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.chainName);
        ArrayList<PayTokenAsset> arrayList = this.tokenList;
        parcel.writeInt(arrayList.size());
        Iterator<PayTokenAsset> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        ArrayList<ConvertPayTokenAsset> arrayList2 = this.suggestConvertTokenList;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList2.size());
        Iterator<ConvertPayTokenAsset> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.PayChainAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PayChainAsset> serializer() {
            return PayChainAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PayChainAsset(int i, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PayChainAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.chainLogo = str2;
        this.chainName = str3;
        this.tokenList = arrayList;
        if ((i & 16) == 0) {
            this.suggestConvertTokenList = null;
        } else {
            this.suggestConvertTokenList = arrayList2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PayChainAsset payChainAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, payChainAsset.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, payChainAsset.chainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, payChainAsset.chainName);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], payChainAsset.tokenList);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && payChainAsset.suggestConvertTokenList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], payChainAsset.suggestConvertTokenList);
    }

    public PayChainAsset(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ArrayList<PayTokenAsset> arrayList, ArrayList<ConvertPayTokenAsset> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.chainIndex = str;
        this.chainLogo = str2;
        this.chainName = str3;
        this.tokenList = arrayList;
        this.suggestConvertTokenList = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.util.ArrayList)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r11v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.web3pay.lib.features.asset.model.PayTokenAsset>, java.util.ArrayList<com.okinc.business.web3pay.lib.features.asset.model.ConvertPayTokenAsset>):void (m)] (LINE:69) call: com.okinc.business.web3pay.lib.features.asset.model.PayChainAsset.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ PayChainAsset(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, arrayList, (i & 16) != 0 ? null : arrayList2);
    }
}
