package com.okinc.unify_trade.biz;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AccountModePreCheckData implements Parcelable {
    private final String acctLv;
    private final String canSetMaxLever;
    private final String curAcctLv;
    private final String isUpgrade;
    private final AccountModePreCheckMgnBfData mgnAft;
    private final AccountModePreCheckMgnBfData mgnBf;
    private final String percents;
    private final List<AccountModePreCheckPosData> posList;
    private final List<AccountModePreCheckPosTierData> posTierCheck;
    private final String riskOffsetType;
    private final String sCode;
    private final ArrayList<AccountModePreCheckUnMatchedInfoData> unmatchedInfoCheck;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountModePreCheckData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(AccountModePreCheckPosData$$serializer.INSTANCE), null, new ArrayListSerializer(AccountModePreCheckUnMatchedInfoData$$serializer.INSTANCE), new ArrayListSerializer(AccountModePreCheckPosTierData$$serializer.INSTANCE), null, null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<AccountModePreCheckData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AccountModePreCheckPosData.CREATOR.createFromParcel(parcel));
                }
            }
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList4.add(AccountModePreCheckUnMatchedInfoData.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList5.add(AccountModePreCheckPosTierData.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList5;
            }
            return new AccountModePreCheckData(string, string2, string3, string4, string5, string6, arrayList, string7, arrayList2, arrayList3, parcel.readInt() == 0 ? null : AccountModePreCheckMgnBfData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountModePreCheckMgnBfData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountModePreCheckData[] newArray(int i) {
            return new AccountModePreCheckData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountModePreCheckData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (ArrayList) null, (List) null, (AccountModePreCheckMgnBfData) null, (AccountModePreCheckMgnBfData) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountModePreCheckPosTierData> component10() {
        return this.posTierCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckMgnBfData component11() {
        return this.mgnBf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckMgnBfData component12() {
        return this.mgnAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.curAcctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isUpgrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.canSetMaxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.percents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountModePreCheckPosData> component7() {
        return this.posList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.riskOffsetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AccountModePreCheckUnMatchedInfoData> component9() {
        return this.unmatchedInfoCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, List<AccountModePreCheckPosData> list, @NotNull String str7, ArrayList<AccountModePreCheckUnMatchedInfoData> arrayList, List<AccountModePreCheckPosTierData> list2, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new AccountModePreCheckData(str, str2, str3, str4, str5, str6, list, str7, arrayList, list2, accountModePreCheckMgnBfData, accountModePreCheckMgnBfData2);
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
        if (!(obj instanceof AccountModePreCheckData)) {
            return false;
        }
        AccountModePreCheckData accountModePreCheckData = (AccountModePreCheckData) obj;
        return Intrinsics.EZpvd((Object) this.sCode, (Object) accountModePreCheckData.sCode) && Intrinsics.EZpvd((Object) this.curAcctLv, (Object) accountModePreCheckData.curAcctLv) && Intrinsics.EZpvd((Object) this.acctLv, (Object) accountModePreCheckData.acctLv) && Intrinsics.EZpvd((Object) this.isUpgrade, (Object) accountModePreCheckData.isUpgrade) && Intrinsics.EZpvd((Object) this.canSetMaxLever, (Object) accountModePreCheckData.canSetMaxLever) && Intrinsics.EZpvd((Object) this.percents, (Object) accountModePreCheckData.percents) && Intrinsics.EZpvd(this.posList, accountModePreCheckData.posList) && Intrinsics.EZpvd((Object) this.riskOffsetType, (Object) accountModePreCheckData.riskOffsetType) && Intrinsics.EZpvd(this.unmatchedInfoCheck, accountModePreCheckData.unmatchedInfoCheck) && Intrinsics.EZpvd(this.posTierCheck, accountModePreCheckData.posTierCheck) && Intrinsics.EZpvd(this.mgnBf, accountModePreCheckData.mgnBf) && Intrinsics.EZpvd(this.mgnAft, accountModePreCheckData.mgnAft);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcctLv() {
        return this.acctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanSetMaxLever() {
        return this.canSetMaxLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurAcctLv() {
        return this.curAcctLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckMgnBfData getMgnAft() {
        return this.mgnAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountModePreCheckMgnBfData getMgnBf() {
        return this.mgnBf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercents() {
        return this.percents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountModePreCheckPosData> getPosList() {
        return this.posList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountModePreCheckPosTierData> getPosTierCheck() {
        return this.posTierCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskOffsetType() {
        return this.riskOffsetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AccountModePreCheckUnMatchedInfoData> getUnmatchedInfoCheck() {
        return this.unmatchedInfoCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sCode.hashCode();
        int iHashCode2 = this.curAcctLv.hashCode();
        int iHashCode3 = this.acctLv.hashCode();
        int iHashCode4 = this.isUpgrade.hashCode();
        int iHashCode5 = this.canSetMaxLever.hashCode();
        int iHashCode6 = this.percents.hashCode();
        List<AccountModePreCheckPosData> list = this.posList;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        int iHashCode8 = this.riskOffsetType.hashCode();
        ArrayList<AccountModePreCheckUnMatchedInfoData> arrayList = this.unmatchedInfoCheck;
        int iHashCode9 = arrayList == null ? 0 : arrayList.hashCode();
        List<AccountModePreCheckPosTierData> list2 = this.posTierCheck;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        AccountModePreCheckMgnBfData accountModePreCheckMgnBfData = this.mgnBf;
        int iHashCode11 = accountModePreCheckMgnBfData == null ? 0 : accountModePreCheckMgnBfData.hashCode();
        AccountModePreCheckMgnBfData accountModePreCheckMgnBfData2 = this.mgnAft;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (accountModePreCheckMgnBfData2 != null ? accountModePreCheckMgnBfData2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isUpgrade() {
        return this.isUpgrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountModePreCheckData(sCode=" + this.sCode + ", curAcctLv=" + this.curAcctLv + ", acctLv=" + this.acctLv + ", isUpgrade=" + this.isUpgrade + ", canSetMaxLever=" + this.canSetMaxLever + ", percents=" + this.percents + ", posList=" + this.posList + ", riskOffsetType=" + this.riskOffsetType + ", unmatchedInfoCheck=" + this.unmatchedInfoCheck + ", posTierCheck=" + this.posTierCheck + ", mgnBf=" + this.mgnBf + ", mgnAft=" + this.mgnAft + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sCode);
        parcel.writeString(this.curAcctLv);
        parcel.writeString(this.acctLv);
        parcel.writeString(this.isUpgrade);
        parcel.writeString(this.canSetMaxLever);
        parcel.writeString(this.percents);
        List<AccountModePreCheckPosData> list = this.posList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AccountModePreCheckPosData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.riskOffsetType);
        ArrayList<AccountModePreCheckUnMatchedInfoData> arrayList = this.unmatchedInfoCheck;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<AccountModePreCheckUnMatchedInfoData> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<AccountModePreCheckPosTierData> list2 = this.posTierCheck;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AccountModePreCheckPosTierData> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        AccountModePreCheckMgnBfData accountModePreCheckMgnBfData = this.mgnBf;
        if (accountModePreCheckMgnBfData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountModePreCheckMgnBfData.writeToParcel(parcel, i);
        }
        AccountModePreCheckMgnBfData accountModePreCheckMgnBfData2 = this.mgnAft;
        if (accountModePreCheckMgnBfData2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountModePreCheckMgnBfData2.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountModePreCheckData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountModePreCheckData> serializer() {
            return AccountModePreCheckData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountModePreCheckData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, ArrayList arrayList, List list2, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sCode = "";
        } else {
            this.sCode = str;
        }
        if ((i & 2) == 0) {
            this.curAcctLv = "";
        } else {
            this.curAcctLv = str2;
        }
        if ((i & 4) == 0) {
            this.acctLv = "";
        } else {
            this.acctLv = str3;
        }
        if ((i & 8) == 0) {
            this.isUpgrade = "";
        } else {
            this.isUpgrade = str4;
        }
        if ((i & 16) == 0) {
            this.canSetMaxLever = "";
        } else {
            this.canSetMaxLever = str5;
        }
        if ((i & 32) == 0) {
            this.percents = "";
        } else {
            this.percents = str6;
        }
        if ((i & 64) == 0) {
            this.posList = null;
        } else {
            this.posList = list;
        }
        if ((i & 128) == 0) {
            this.riskOffsetType = "";
        } else {
            this.riskOffsetType = str7;
        }
        if ((i & 256) == 0) {
            this.unmatchedInfoCheck = null;
        } else {
            this.unmatchedInfoCheck = arrayList;
        }
        if ((i & 512) == 0) {
            this.posTierCheck = null;
        } else {
            this.posTierCheck = list2;
        }
        if ((i & 1024) == 0) {
            this.mgnBf = null;
        } else {
            this.mgnBf = accountModePreCheckMgnBfData;
        }
        if ((i & 2048) == 0) {
            this.mgnAft = null;
        } else {
            this.mgnAft = accountModePreCheckMgnBfData2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountModePreCheckData accountModePreCheckData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountModePreCheckData.sCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountModePreCheckData.sCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountModePreCheckData.curAcctLv, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountModePreCheckData.curAcctLv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountModePreCheckData.acctLv, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountModePreCheckData.acctLv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountModePreCheckData.isUpgrade, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountModePreCheckData.isUpgrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountModePreCheckData.canSetMaxLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountModePreCheckData.canSetMaxLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountModePreCheckData.percents, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountModePreCheckData.percents);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || accountModePreCheckData.posList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], accountModePreCheckData.posList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountModePreCheckData.riskOffsetType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountModePreCheckData.riskOffsetType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || accountModePreCheckData.unmatchedInfoCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], accountModePreCheckData.unmatchedInfoCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || accountModePreCheckData.posTierCheck != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], accountModePreCheckData.posTierCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || accountModePreCheckData.mgnBf != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, AccountModePreCheckMgnBfData$$serializer.INSTANCE, accountModePreCheckData.mgnBf);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && accountModePreCheckData.mgnAft == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, AccountModePreCheckMgnBfData$$serializer.INSTANCE, accountModePreCheckData.mgnAft);
    }

    public AccountModePreCheckData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, List<AccountModePreCheckPosData> list, @NotNull String str7, ArrayList<AccountModePreCheckUnMatchedInfoData> arrayList, List<AccountModePreCheckPosTierData> list2, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.sCode = str;
        this.curAcctLv = str2;
        this.acctLv = str3;
        this.isUpgrade = str4;
        this.canSetMaxLever = str5;
        this.percents = str6;
        this.posList = list;
        this.riskOffsetType = str7;
        this.unmatchedInfoCheck = arrayList;
        this.posTierCheck = list2;
        this.mgnBf = accountModePreCheckMgnBfData;
        this.mgnAft = accountModePreCheckMgnBfData2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r22v0 java.util.ArrayList))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData) : (r24v0 com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData))
  (wrap:com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData) : (null com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.AccountModePreCheckPosData>, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.AccountModePreCheckUnMatchedInfoData>, java.util.List<com.okinc.unify_trade.biz.AccountModePreCheckPosTierData>, com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData, com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData):void (m)] (LINE:4693) call: com.okinc.unify_trade.biz.AccountModePreCheckData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.ArrayList, java.util.List, com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData, com.okinc.unify_trade.biz.AccountModePreCheckMgnBfData):void type: THIS */
    public /* synthetic */ AccountModePreCheckData(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, ArrayList arrayList, List list2, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData, AccountModePreCheckMgnBfData accountModePreCheckMgnBfData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? null : list, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : arrayList, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : accountModePreCheckMgnBfData, (i & 2048) == 0 ? accountModePreCheckMgnBfData2 : null);
    }

    /* JADX INFO: renamed from: isUpgrade, reason: collision with other method in class */
    public final boolean m7125isUpgrade() {
        return Intrinsics.EZpvd((Object) this.isUpgrade, (Object) "1");
    }
}
