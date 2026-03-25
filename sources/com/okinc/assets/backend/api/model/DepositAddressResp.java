package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class DepositAddressResp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Integer addrType;
    private String address;
    private int addressId;
    private int arrivalType;
    private final String clientVerifiedName;
    private int confirmNum;
    private final Integer estimatedDepositCreditedTime;
    private final Integer estimatedWithdrawUnlockTime;
    private boolean hasExAddress;
    private AddressInfo info;
    private int invoiceAmountScale;
    private String invoiceMax;
    private String invoiceMin;
    private boolean isIsolationAddress;
    private boolean isIsolationTab;
    private boolean isNeedSignEntity;
    private String memo;
    private String minDeposit;
    private boolean needTag;
    private HashMap<String, String> specialField;
    private ArrayList<SubCurrency> subCurrencies;
    private ArrayList<Integer> supportEntity;
    private String tag;
    private int target;
    private String tips;
    private int withdrawConfirmNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DepositAddressResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DepositAddressResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAddressResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AddressInfo addressInfoCreateFromParcel = AddressInfo.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i4 = parcel.readInt();
            String string6 = parcel.readString();
            int i5 = parcel.readInt();
            HashMap map = new HashMap(i5);
            int i6 = 0;
            while (i6 != i5) {
                map.put(parcel.readString(), parcel.readString());
                i6++;
                i5 = i5;
                string5 = string5;
            }
            String str = string5;
            boolean z4 = parcel.readInt() != 0;
            int i7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            while (i8 != i7) {
                arrayList.add(SubCurrency.CREATOR.createFromParcel(parcel));
                i8++;
                i7 = i7;
            }
            boolean z5 = parcel.readInt() != 0;
            int i9 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i9);
            int i10 = 0;
            while (i10 != i9) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
                i10++;
                i9 = i9;
            }
            return new DepositAddressResp(string, z, z2, i, i2, i3, z3, string2, string3, addressInfoCreateFromParcel, string4, str, i4, string6, map, z4, arrayList, z5, arrayList2, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositAddressResp[] newArray(int i) {
            return new DepositAddressResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositAddressResp() {
        this((String) null, false, false, 0, 0, 0, false, (String) null, (String) null, (AddressInfo) null, (String) null, (String) null, 0, (String) null, (HashMap) null, false, (ArrayList) null, false, (ArrayList) null, (String) null, 0, 0, (String) null, (Integer) null, (Integer) null, (Integer) null, 67108863, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressInfo component10() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.invoiceMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.invoiceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.invoiceAmountScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.minDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component15() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubCurrency> component17() {
        return this.subCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isNeedSignEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Integer> component19() {
        return this.supportEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isIsolationAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.tips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.clientVerifiedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.estimatedDepositCreditedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component25() {
        return this.estimatedWithdrawUnlockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.addrType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isIsolationTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.withdrawConfirmNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.arrivalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.confirmNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.hasExAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositAddressResp copy(@NotNull String str, boolean z, boolean z2, int i, int i2, int i3, boolean z3, @NotNull String str2, @NotNull String str3, @NotNull AddressInfo addressInfo, @NotNull String str4, @NotNull String str5, int i4, @NotNull String str6, @NotNull HashMap<String, String> map, boolean z4, @NotNull ArrayList<SubCurrency> arrayList, boolean z5, @NotNull ArrayList<Integer> arrayList2, String str7, int i5, int i6, String str8, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(addressInfo, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new DepositAddressResp(str, z, z2, i, i2, i3, z3, str2, str3, addressInfo, str4, str5, i4, str6, map, z4, arrayList, z5, arrayList2, str7, i5, i6, str8, num, num2, num3);
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
        if (!(obj instanceof DepositAddressResp)) {
            return false;
        }
        DepositAddressResp depositAddressResp = (DepositAddressResp) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) depositAddressResp.address) && this.isIsolationAddress == depositAddressResp.isIsolationAddress && this.isIsolationTab == depositAddressResp.isIsolationTab && this.withdrawConfirmNum == depositAddressResp.withdrawConfirmNum && this.arrivalType == depositAddressResp.arrivalType && this.confirmNum == depositAddressResp.confirmNum && this.hasExAddress == depositAddressResp.hasExAddress && Intrinsics.EZpvd((Object) this.tag, (Object) depositAddressResp.tag) && Intrinsics.EZpvd((Object) this.memo, (Object) depositAddressResp.memo) && Intrinsics.EZpvd(this.info, depositAddressResp.info) && Intrinsics.EZpvd((Object) this.invoiceMax, (Object) depositAddressResp.invoiceMax) && Intrinsics.EZpvd((Object) this.invoiceMin, (Object) depositAddressResp.invoiceMin) && this.invoiceAmountScale == depositAddressResp.invoiceAmountScale && Intrinsics.EZpvd((Object) this.minDeposit, (Object) depositAddressResp.minDeposit) && Intrinsics.EZpvd(this.specialField, depositAddressResp.specialField) && this.needTag == depositAddressResp.needTag && Intrinsics.EZpvd(this.subCurrencies, depositAddressResp.subCurrencies) && this.isNeedSignEntity == depositAddressResp.isNeedSignEntity && Intrinsics.EZpvd(this.supportEntity, depositAddressResp.supportEntity) && Intrinsics.EZpvd((Object) this.tips, (Object) depositAddressResp.tips) && this.addressId == depositAddressResp.addressId && this.target == depositAddressResp.target && Intrinsics.EZpvd((Object) this.clientVerifiedName, (Object) depositAddressResp.clientVerifiedName) && Intrinsics.EZpvd(this.estimatedDepositCreditedTime, depositAddressResp.estimatedDepositCreditedTime) && Intrinsics.EZpvd(this.estimatedWithdrawUnlockTime, depositAddressResp.estimatedWithdrawUnlockTime) && Intrinsics.EZpvd(this.addrType, depositAddressResp.addrType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddrType() {
        return this.addrType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressId() {
        return this.addressId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getArrivalType() {
        return this.arrivalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientVerifiedName() {
        return this.clientVerifiedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getConfirmNum() {
        return this.confirmNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimatedDepositCreditedTime() {
        return this.estimatedDepositCreditedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimatedWithdrawUnlockTime() {
        return this.estimatedWithdrawUnlockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasExAddress() {
        return this.hasExAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressInfo getInfo() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvoiceAmountScale() {
        return this.invoiceAmountScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoiceMax() {
        return this.invoiceMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoiceMin() {
        return this.invoiceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinDeposit() {
        return this.minDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedTag() {
        return this.needTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getSpecialField() {
        return this.specialField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubCurrency> getSubCurrencies() {
        return this.subCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Integer> getSupportEntity() {
        return this.supportEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTips() {
        return this.tips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWithdrawConfirmNum() {
        return this.withdrawConfirmNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isIsolationAddress);
        int iHashCode3 = Boolean.hashCode(this.isIsolationTab);
        int iHashCode4 = Integer.hashCode(this.withdrawConfirmNum);
        int iHashCode5 = Integer.hashCode(this.arrivalType);
        int iHashCode6 = Integer.hashCode(this.confirmNum);
        int iHashCode7 = Boolean.hashCode(this.hasExAddress);
        int iHashCode8 = this.tag.hashCode();
        int iHashCode9 = this.memo.hashCode();
        int iHashCode10 = this.info.hashCode();
        int iHashCode11 = this.invoiceMax.hashCode();
        int iHashCode12 = this.invoiceMin.hashCode();
        int iHashCode13 = Integer.hashCode(this.invoiceAmountScale);
        int iHashCode14 = this.minDeposit.hashCode();
        int iHashCode15 = this.specialField.hashCode();
        int iHashCode16 = Boolean.hashCode(this.needTag);
        int iHashCode17 = this.subCurrencies.hashCode();
        int iHashCode18 = Boolean.hashCode(this.isNeedSignEntity);
        int iHashCode19 = this.supportEntity.hashCode();
        String str = this.tips;
        int iHashCode20 = str == null ? 0 : str.hashCode();
        int iHashCode21 = Integer.hashCode(this.addressId);
        int iHashCode22 = Integer.hashCode(this.target);
        String str2 = this.clientVerifiedName;
        int iHashCode23 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.estimatedDepositCreditedTime;
        int iHashCode24 = num == null ? 0 : num.hashCode();
        Integer num2 = this.estimatedWithdrawUnlockTime;
        int iHashCode25 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.addrType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isIsolationAddress() {
        return this.isIsolationAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isIsolationTab() {
        return this.isIsolationTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedSignEntity() {
        return this.isNeedSignEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddrType(Integer num) {
        this.addrType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressId(int i) {
        this.addressId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArrivalType(int i) {
        this.arrivalType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmNum(int i) {
        this.confirmNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasExAddress(boolean z) {
        this.hasExAddress = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfo(@NotNull AddressInfo addressInfo) {
        Intrinsics.checkNotNullParameter(addressInfo, "");
        this.info = addressInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoiceAmountScale(int i) {
        this.invoiceAmountScale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoiceMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.invoiceMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoiceMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.invoiceMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsolationAddress(boolean z) {
        this.isIsolationAddress = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsolationTab(boolean z) {
        this.isIsolationTab = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinDeposit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minDeposit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedSignEntity(boolean z) {
        this.isNeedSignEntity = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedTag(boolean z) {
        this.needTag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecialField(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.specialField = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencies(@NotNull ArrayList<SubCurrency> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.subCurrencies = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportEntity(@NotNull ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.supportEntity = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTarget(int i) {
        this.target = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTips(String str) {
        this.tips = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawConfirmNum(int i) {
        this.withdrawConfirmNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositAddressResp(address=" + this.address + ", isIsolationAddress=" + this.isIsolationAddress + ", isIsolationTab=" + this.isIsolationTab + ", withdrawConfirmNum=" + this.withdrawConfirmNum + ", arrivalType=" + this.arrivalType + ", confirmNum=" + this.confirmNum + ", hasExAddress=" + this.hasExAddress + ", tag=" + this.tag + ", memo=" + this.memo + ", info=" + this.info + ", invoiceMax=" + this.invoiceMax + ", invoiceMin=" + this.invoiceMin + ", invoiceAmountScale=" + this.invoiceAmountScale + ", minDeposit=" + this.minDeposit + ", specialField=" + this.specialField + ", needTag=" + this.needTag + ", subCurrencies=" + this.subCurrencies + ", isNeedSignEntity=" + this.isNeedSignEntity + ", supportEntity=" + this.supportEntity + ", tips=" + this.tips + ", addressId=" + this.addressId + ", target=" + this.target + ", clientVerifiedName=" + this.clientVerifiedName + ", estimatedDepositCreditedTime=" + this.estimatedDepositCreditedTime + ", estimatedWithdrawUnlockTime=" + this.estimatedWithdrawUnlockTime + ", addrType=" + this.addrType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeInt(this.isIsolationAddress ? 1 : 0);
        parcel.writeInt(this.isIsolationTab ? 1 : 0);
        parcel.writeInt(this.withdrawConfirmNum);
        parcel.writeInt(this.arrivalType);
        parcel.writeInt(this.confirmNum);
        parcel.writeInt(this.hasExAddress ? 1 : 0);
        parcel.writeString(this.tag);
        parcel.writeString(this.memo);
        this.info.writeToParcel(parcel, i);
        parcel.writeString(this.invoiceMax);
        parcel.writeString(this.invoiceMin);
        parcel.writeInt(this.invoiceAmountScale);
        parcel.writeString(this.minDeposit);
        HashMap<String, String> map = this.specialField;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.needTag ? 1 : 0);
        ArrayList<SubCurrency> arrayList = this.subCurrencies;
        parcel.writeInt(arrayList.size());
        Iterator<SubCurrency> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isNeedSignEntity ? 1 : 0);
        ArrayList<Integer> arrayList2 = this.supportEntity;
        parcel.writeInt(arrayList2.size());
        Iterator<Integer> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeString(this.tips);
        parcel.writeInt(this.addressId);
        parcel.writeInt(this.target);
        parcel.writeString(this.clientVerifiedName);
        Integer num = this.estimatedDepositCreditedTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.estimatedWithdrawUnlockTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.addrType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.DepositAddressResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DepositAddressResp> serializer() {
            return DepositAddressResp$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer), null, new ArrayListSerializer(SubCurrency$$serializer.INSTANCE), null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null};
    }

    public /* synthetic */ DepositAddressResp(int i, String str, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, String str2, String str3, AddressInfo addressInfo, String str4, String str5, int i5, String str6, HashMap map, boolean z4, ArrayList arrayList, boolean z5, ArrayList arrayList2, String str7, int i6, int i7, String str8, Integer num, Integer num2, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.isIsolationAddress = false;
        } else {
            this.isIsolationAddress = z;
        }
        if ((i & 4) == 0) {
            this.isIsolationTab = false;
        } else {
            this.isIsolationTab = z2;
        }
        if ((i & 8) == 0) {
            this.withdrawConfirmNum = 0;
        } else {
            this.withdrawConfirmNum = i2;
        }
        if ((i & 16) == 0) {
            this.arrivalType = 0;
        } else {
            this.arrivalType = i3;
        }
        if ((i & 32) == 0) {
            this.confirmNum = 0;
        } else {
            this.confirmNum = i4;
        }
        if ((i & 64) == 0) {
            this.hasExAddress = false;
        } else {
            this.hasExAddress = z3;
        }
        if ((i & 128) == 0) {
            this.tag = "";
        } else {
            this.tag = str2;
        }
        if ((i & 256) == 0) {
            this.memo = "";
        } else {
            this.memo = str3;
        }
        this.info = (i & 512) == 0 ? new AddressInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : addressInfo;
        if ((i & 1024) == 0) {
            this.invoiceMax = "";
        } else {
            this.invoiceMax = str4;
        }
        if ((i & 2048) == 0) {
            this.invoiceMin = "";
        } else {
            this.invoiceMin = str5;
        }
        if ((i & 4096) == 0) {
            this.invoiceAmountScale = 0;
        } else {
            this.invoiceAmountScale = i5;
        }
        if ((i & 8192) == 0) {
            this.minDeposit = "";
        } else {
            this.minDeposit = str6;
        }
        this.specialField = (i & 16384) == 0 ? new HashMap() : map;
        if ((32768 & i) == 0) {
            this.needTag = false;
        } else {
            this.needTag = z4;
        }
        this.subCurrencies = (65536 & i) == 0 ? new ArrayList() : arrayList;
        if ((131072 & i) == 0) {
            this.isNeedSignEntity = false;
        } else {
            this.isNeedSignEntity = z5;
        }
        this.supportEntity = (262144 & i) == 0 ? new ArrayList() : arrayList2;
        if ((524288 & i) == 0) {
            this.tips = null;
        } else {
            this.tips = str7;
        }
        if ((1048576 & i) == 0) {
            this.addressId = 0;
        } else {
            this.addressId = i6;
        }
        if ((2097152 & i) == 0) {
            this.target = 0;
        } else {
            this.target = i7;
        }
        if ((4194304 & i) == 0) {
            this.clientVerifiedName = null;
        } else {
            this.clientVerifiedName = str8;
        }
        this.estimatedDepositCreditedTime = (8388608 & i) == 0 ? 0 : num;
        this.estimatedWithdrawUnlockTime = (16777216 & i) == 0 ? 0 : num2;
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.addrType = null;
        } else {
            this.addrType = num3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [8=5] */
    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(DepositAddressResp depositAddressResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) depositAddressResp.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, depositAddressResp.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || depositAddressResp.isIsolationAddress) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, depositAddressResp.isIsolationAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || depositAddressResp.isIsolationTab) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, depositAddressResp.isIsolationTab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || depositAddressResp.withdrawConfirmNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, depositAddressResp.withdrawConfirmNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || depositAddressResp.arrivalType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, depositAddressResp.arrivalType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || depositAddressResp.confirmNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, depositAddressResp.confirmNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || depositAddressResp.hasExAddress) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, depositAddressResp.hasExAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) depositAddressResp.tag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, depositAddressResp.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) depositAddressResp.memo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, depositAddressResp.memo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(depositAddressResp.info, new AddressInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, AddressInfo$$serializer.INSTANCE, depositAddressResp.info);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) depositAddressResp.invoiceMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, depositAddressResp.invoiceMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) depositAddressResp.invoiceMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, depositAddressResp.invoiceMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || depositAddressResp.invoiceAmountScale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, depositAddressResp.invoiceAmountScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) depositAddressResp.minDeposit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, depositAddressResp.minDeposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd(depositAddressResp.specialField, new HashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], depositAddressResp.specialField);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || depositAddressResp.needTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, depositAddressResp.needTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(depositAddressResp.subCurrencies, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], depositAddressResp.subCurrencies);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || depositAddressResp.isNeedSignEntity) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, depositAddressResp.isNeedSignEntity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(depositAddressResp.supportEntity, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], depositAddressResp.supportEntity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || depositAddressResp.tips != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, depositAddressResp.tips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || depositAddressResp.addressId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, depositAddressResp.addressId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || depositAddressResp.target != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 21, depositAddressResp.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || depositAddressResp.clientVerifiedName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, depositAddressResp.clientVerifiedName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || (num2 = depositAddressResp.estimatedDepositCreditedTime) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, depositAddressResp.estimatedDepositCreditedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || (num = depositAddressResp.estimatedWithdrawUnlockTime) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, IntSerializer.INSTANCE, depositAddressResp.estimatedWithdrawUnlockTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && depositAddressResp.addrType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, depositAddressResp.addrType);
    }

    public DepositAddressResp(@NotNull String str, boolean z, boolean z2, int i, int i2, int i3, boolean z3, @NotNull String str2, @NotNull String str3, @NotNull AddressInfo addressInfo, @NotNull String str4, @NotNull String str5, int i4, @NotNull String str6, @NotNull HashMap<String, String> map, boolean z4, @NotNull ArrayList<SubCurrency> arrayList, boolean z5, @NotNull ArrayList<Integer> arrayList2, String str7, int i5, int i6, String str8, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(addressInfo, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.address = str;
        this.isIsolationAddress = z;
        this.isIsolationTab = z2;
        this.withdrawConfirmNum = i;
        this.arrivalType = i2;
        this.confirmNum = i3;
        this.hasExAddress = z3;
        this.tag = str2;
        this.memo = str3;
        this.info = addressInfo;
        this.invoiceMax = str4;
        this.invoiceMin = str5;
        this.invoiceAmountScale = i4;
        this.minDeposit = str6;
        this.specialField = map;
        this.needTag = z4;
        this.subCurrencies = arrayList;
        this.isNeedSignEntity = z5;
        this.supportEntity = arrayList2;
        this.tips = str7;
        this.addressId = i5;
        this.target = i6;
        this.clientVerifiedName = str8;
        this.estimatedDepositCreditedTime = num;
        this.estimatedWithdrawUnlockTime = num2;
        this.addrType = num3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DepositAddressResp(String str, boolean z, boolean z2, int i, int i2, int i3, boolean z3, String str2, String str3, AddressInfo addressInfo, String str4, String str5, int i4, String str6, HashMap map, boolean z4, ArrayList arrayList, boolean z5, ArrayList arrayList2, String str7, int i5, int i6, String str8, Integer num, Integer num2, Integer num3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        int i8;
        Integer num4;
        String str9 = (i7 & 1) != 0 ? "" : str;
        boolean z6 = (i7 & 2) != 0 ? false : z;
        boolean z7 = (i7 & 4) != 0 ? false : z2;
        int i9 = (i7 & 8) != 0 ? 0 : i;
        int i10 = (i7 & 16) != 0 ? 0 : i2;
        int i11 = (i7 & 32) != 0 ? 0 : i3;
        boolean z8 = (i7 & 64) != 0 ? false : z3;
        String str10 = (i7 & 128) != 0 ? "" : str2;
        String str11 = (i7 & 256) != 0 ? "" : str3;
        AddressInfo addressInfo2 = (i7 & 512) != 0 ? new AddressInfo((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : addressInfo;
        String str12 = (i7 & 1024) != 0 ? "" : str4;
        String str13 = (i7 & 2048) != 0 ? "" : str5;
        int i12 = (i7 & 4096) != 0 ? 0 : i4;
        String str14 = (i7 & 8192) == 0 ? str6 : "";
        HashMap map2 = (i7 & 16384) != 0 ? new HashMap() : map;
        boolean z9 = (i7 & 32768) != 0 ? false : z4;
        ArrayList arrayList3 = (i7 & 65536) != 0 ? new ArrayList() : arrayList;
        boolean z10 = (i7 & 131072) != 0 ? false : z5;
        ArrayList arrayList4 = (i7 & 262144) != 0 ? new ArrayList() : arrayList2;
        String str15 = (i7 & 524288) != 0 ? null : str7;
        int i13 = (i7 & 1048576) != 0 ? 0 : i5;
        int i14 = (i7 & 2097152) != 0 ? 0 : i6;
        String str16 = (i7 & 4194304) != 0 ? null : str8;
        if ((i7 & 8388608) != 0) {
            i8 = 0;
            num4 = 0;
        } else {
            i8 = 0;
            num4 = num;
        }
        this(str9, z6, z7, i9, i10, i11, z8, str10, str11, addressInfo2, str12, str13, i12, str14, map2, z9, arrayList3, z10, arrayList4, str15, i13, i14, str16, num4, (i7 & 16777216) != 0 ? Integer.valueOf(i8) : num2, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? num3 : null);
    }
}
