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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class EscapeAccountListResp implements Parcelable {
    private final String aaAccountId;
    private final String aaAccountName;
    private final List<EscapeAccountDetail> tokens;
    private final String totalCurrencyAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeAccountListResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(EscapeAccountDetail$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<EscapeAccountListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountListResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(EscapeAccountDetail.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new EscapeAccountListResp(string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountListResp[] newArray(int i) {
            return new EscapeAccountListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EscapeAccountListResp() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapeAccountListResp copy$default(EscapeAccountListResp escapeAccountListResp, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapeAccountListResp.aaAccountId;
        }
        if ((i & 2) != 0) {
            str2 = escapeAccountListResp.aaAccountName;
        }
        if ((i & 4) != 0) {
            str3 = escapeAccountListResp.totalCurrencyAmount;
        }
        if ((i & 8) != 0) {
            list = escapeAccountListResp.tokens;
        }
        return escapeAccountListResp.copy(str, str2, str3, list);
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
    public final List<EscapeAccountDetail> component4() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeAccountListResp copy(String str, String str2, String str3, List<EscapeAccountDetail> list) {
        return new EscapeAccountListResp(str, str2, str3, list);
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
        if (!(obj instanceof EscapeAccountListResp)) {
            return false;
        }
        EscapeAccountListResp escapeAccountListResp = (EscapeAccountListResp) obj;
        return Intrinsics.EZpvd((Object) this.aaAccountId, (Object) escapeAccountListResp.aaAccountId) && Intrinsics.EZpvd((Object) this.aaAccountName, (Object) escapeAccountListResp.aaAccountName) && Intrinsics.EZpvd((Object) this.totalCurrencyAmount, (Object) escapeAccountListResp.totalCurrencyAmount) && Intrinsics.EZpvd(this.tokens, escapeAccountListResp.tokens);
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
    public final List<EscapeAccountDetail> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCurrencyAmount() {
        return this.totalCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.aaAccountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.aaAccountName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalCurrencyAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<EscapeAccountDetail> list = this.tokens;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeAccountListResp(aaAccountId=" + this.aaAccountId + ", aaAccountName=" + this.aaAccountName + ", totalCurrencyAmount=" + this.totalCurrencyAmount + ", tokens=" + this.tokens + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.aaAccountId);
        parcel.writeString(this.aaAccountName);
        parcel.writeString(this.totalCurrencyAmount);
        List<EscapeAccountDetail> list = this.tokens;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<EscapeAccountDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeAccountListResp> serializer() {
            return EscapeAccountListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeAccountListResp(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aaAccountId = null;
        } else {
            this.aaAccountId = str;
        }
        if ((i & 2) == 0) {
            this.aaAccountName = null;
        } else {
            this.aaAccountName = str2;
        }
        if ((i & 4) == 0) {
            this.totalCurrencyAmount = null;
        } else {
            this.totalCurrencyAmount = str3;
        }
        if ((i & 8) == 0) {
            this.tokens = null;
        } else {
            this.tokens = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeAccountListResp escapeAccountListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || escapeAccountListResp.aaAccountId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, escapeAccountListResp.aaAccountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || escapeAccountListResp.aaAccountName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, escapeAccountListResp.aaAccountName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || escapeAccountListResp.totalCurrencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, escapeAccountListResp.totalCurrencyAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && escapeAccountListResp.tokens == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], escapeAccountListResp.tokens);
    }

    public EscapeAccountListResp(String str, String str2, String str3, List<EscapeAccountDetail> list) {
        this.aaAccountId = str;
        this.aaAccountName = str2;
        this.totalCurrencyAmount = str3;
        this.tokens = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetail>):void (m)] (LINE:27) call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountListResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ EscapeAccountListResp(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }

    public final EscapeBindAccountListUIBean toUIBean() {
        List listAhwBna;
        String str = this.aaAccountId;
        if (str == null) {
            str = "";
        }
        String str2 = this.aaAccountName;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.totalCurrencyAmount;
        if (str3 == null) {
            str3 = "";
        }
        List<EscapeAccountDetail> list = this.tokens;
        if (list == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (EscapeAccountDetail escapeAccountDetail : list) {
                String address = escapeAccountDetail.getAddress();
                String str4 = address == null ? "" : address;
                String tokenAddress = escapeAccountDetail.getTokenAddress();
                String str5 = tokenAddress == null ? "" : tokenAddress;
                String chainIndex = escapeAccountDetail.getChainIndex();
                String str6 = chainIndex == null ? "" : chainIndex;
                String chainName = escapeAccountDetail.getChainName();
                String str7 = chainName == null ? "" : chainName;
                Long coinId = escapeAccountDetail.getCoinId();
                long jLongValue = coinId != null ? coinId.longValue() : 0L;
                String symbol = escapeAccountDetail.getSymbol();
                if (symbol == null) {
                    symbol = "";
                }
                String name = escapeAccountDetail.getName();
                String str8 = name == null ? "" : name;
                String logo = escapeAccountDetail.getLogo();
                String str9 = logo == null ? "" : logo;
                String coinAmount = escapeAccountDetail.getCoinAmount();
                String str10 = coinAmount == null ? "" : coinAmount;
                String originalCoinAmount = escapeAccountDetail.getOriginalCoinAmount();
                String str11 = originalCoinAmount == null ? "" : originalCoinAmount;
                Integer decimalNum = escapeAccountDetail.getDecimalNum();
                int iIntValue = decimalNum != null ? decimalNum.intValue() : 0;
                Integer displayPrecision = escapeAccountDetail.getDisplayPrecision();
                int iIntValue2 = displayPrecision != null ? displayPrecision.intValue() : 0;
                String currencyAmount = escapeAccountDetail.getCurrencyAmount();
                String str12 = currencyAmount == null ? "" : currencyAmount;
                Long riskType = escapeAccountDetail.getRiskType();
                long jLongValue2 = riskType != null ? riskType.longValue() : 0L;
                Boolean boolIsMainCoin = escapeAccountDetail.isMainCoin();
                listAhwBna.add(new EscapeAccountDetailUIBean(str4, str5, str6, str7, jLongValue, symbol, str8, str9, str10, str11, iIntValue, iIntValue2, str12, jLongValue2, boolIsMainCoin != null ? boolIsMainCoin.booleanValue() : false));
            }
        }
        return new EscapeBindAccountListUIBean(str, str2, str3, listAhwBna);
    }
}
