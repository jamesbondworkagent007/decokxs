package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TxToastCheckRes implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final String BASIC_RISK_ALERT = "basic_risk_alert";
    public static final String BASIC_RISK_REJECT = "basic_risk_reject";
    public static final String BLACK_TAG = "black_tag";
    public static final String EIP712_NOT_STANDARD = "eip712NotStandard";
    public static final String EOA_ADDRESS_TYPE = "eoa";
    public static final String ETH_SIGN = "eth_sign";
    public static final String EVM_7702_AUTH_ADDRESS_NOT_IN_WHITELIST = "evm_7702_auth_address_not_in_whitelist";
    public static final String FROM_RISK_REJECT = "from_risk_reject";
    public static final String LONG_SIGN_TEXT = "longSignText";
    public static final String LOWER_VALUE = "lower_value";
    public static final String NOT_SAME_PARAMS = "not_same_params";
    public static final String OFFLINE_AUTHORIZATION_FOR_UNKNOWN_PROJECT = "offline_authorization_for_unknown_project";
    public static final String PURCHASE_MALICIOUS_TOKEN = "purchase_malicious_token";
    public static final String QUEUE_WITHDRAWAL_RISK = "suspicion_withdraw_address";
    public static final String RESULT_CODE_INSUFFICIENT_FUNDS = "306001";
    public static final String RESULT_DAPP_GAS_NOT_ENOUGH = "306003";
    public static final String RESULT_STRATEGY_PERMIT = "Permit";
    public static final String RESULT_STRATEGY_PERMIT2 = "Permit2";
    public static final String SEND_TOKEN_TO_CONTRACT = "send_token_to_contract";
    public static final int SIMILAR_EXACT = 1;
    public static final int SIMILAR_FUZZY = 2;
    public static final int SIMILAR_MISS = 0;
    public static final String TO_EOA_HAS_CALLDATA = "to_eoa_has_calldata";
    private Map<String, ? extends List<AssetsDiff>> assetsDiffs;
    private AuthQuantityInfo authQuantityInfo;
    private String blackAddress;
    private BlackAddressWarning blackAddressWarning;
    private BlackTagRes blackTag;
    private List<String> causeRiskItem;
    private Integer checkType;
    private Map<String, ? extends List<Exposures>> exposures;
    private WalletGasLimitRes gasLimit;
    private String gasPrice;
    private IntentionContract intention;
    private Integer isSimilar;
    private String msg;
    private String newNonce;
    private String nonce;
    private String orderId;
    private String orderType;
    private Integer pendingNum;
    private String permissionMsg;
    private Map<String, ? extends List<BeforeAndAfterPermission>> permissions;
    private String popUpDesc;
    private String popUpTitle;
    private String primaryButtonName;
    private String priorityFee;
    private Boolean result;
    private String resultCode;
    private String secondaryButtonName;
    private Boolean similar;
    private String similarAddress;
    private List<SimulateTransactionResult> simulateTransactionResultList;
    private List<Integer> solanaPayFee;
    private String strategy;
    private Integer toastType;
    private Integer trxPermissionId;
    private String txId;
    private String txhash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxToastCheckRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TxToastCheckRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxToastCheckRes createFromParcel(Parcel parcel) {
            WalletGasLimitRes walletGasLimitRes;
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            String str2;
            String str3;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap4;
            LinkedHashMap linkedHashMap5;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            WalletGasLimitRes walletGasLimitResCreateFromParcel = parcel.readInt() == 0 ? null : WalletGasLimitRes.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string13 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                walletGasLimitRes = walletGasLimitResCreateFromParcel;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i);
                walletGasLimitRes = walletGasLimitResCreateFromParcel;
                int i2 = 0;
                while (i2 != i) {
                    arrayList4.add(SimulateTransactionResult.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList4;
            }
            BlackTagRes blackTagResCreateFromParcel = parcel.readInt() == 0 ? null : BlackTagRes.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                str = string7;
                str2 = string8;
                str3 = string9;
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i3);
                arrayList2 = arrayList;
                int i4 = 0;
                while (i4 != i3) {
                    int i5 = i3;
                    String string17 = parcel.readString();
                    String str4 = string9;
                    int i6 = parcel.readInt();
                    String str5 = string8;
                    ArrayList arrayList5 = new ArrayList(i6);
                    String str6 = string7;
                    int i7 = 0;
                    while (i7 != i6) {
                        arrayList5.add(AssetsDiff.CREATOR.createFromParcel(parcel));
                        i7++;
                        i6 = i6;
                    }
                    linkedHashMap6.put(string17, arrayList5);
                    i4++;
                    i3 = i5;
                    string9 = str4;
                    string8 = str5;
                    string7 = str6;
                }
                str = string7;
                str2 = string8;
                str3 = string9;
                linkedHashMap = linkedHashMap6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = linkedHashMap;
                linkedHashMap3 = null;
            } else {
                int i8 = parcel.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(i8);
                int i9 = 0;
                while (i9 != i8) {
                    String string18 = parcel.readString();
                    int i10 = parcel.readInt();
                    int i11 = i8;
                    ArrayList arrayList6 = new ArrayList(i10);
                    LinkedHashMap linkedHashMap8 = linkedHashMap;
                    int i12 = 0;
                    while (i12 != i10) {
                        arrayList6.add(Exposures.CREATOR.createFromParcel(parcel));
                        i12++;
                        i10 = i10;
                    }
                    linkedHashMap7.put(string18, arrayList6);
                    i9++;
                    i8 = i11;
                    linkedHashMap = linkedHashMap8;
                }
                linkedHashMap2 = linkedHashMap;
                linkedHashMap3 = linkedHashMap7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList3 = arrayList7;
            }
            String string19 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string20 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap4 = linkedHashMap3;
                linkedHashMap5 = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(i15);
                int i16 = 0;
                while (i16 != i15) {
                    String string21 = parcel.readString();
                    int i17 = parcel.readInt();
                    int i18 = i15;
                    ArrayList arrayList8 = new ArrayList(i17);
                    LinkedHashMap linkedHashMap10 = linkedHashMap3;
                    int i19 = 0;
                    while (i19 != i17) {
                        arrayList8.add(BeforeAndAfterPermission.CREATOR.createFromParcel(parcel));
                        i19++;
                        i17 = i17;
                    }
                    linkedHashMap9.put(string21, arrayList8);
                    i16++;
                    i15 = i18;
                    linkedHashMap3 = linkedHashMap10;
                }
                linkedHashMap4 = linkedHashMap3;
                linkedHashMap5 = linkedHashMap9;
            }
            return new TxToastCheckRes(numValueOf, boolValueOf, string, string2, numValueOf2, string3, string4, string5, string6, str, str2, str3, numValueOf3, walletGasLimitRes, string10, string11, string12, numValueOf4, string13, boolValueOf2, string14, string15, numValueOf5, string16, arrayList2, blackTagResCreateFromParcel, linkedHashMap2, linkedHashMap4, arrayList3, string19, arrayListCreateStringArrayList, string20, linkedHashMap5, parcel.readInt() == 0 ? null : IntentionContract.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BlackAddressWarning.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthQuantityInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxToastCheckRes[] newArray(int i) {
            return new TxToastCheckRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxToastCheckRes() {
        this((Integer) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (WalletGasLimitRes) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (List) null, (BlackTagRes) null, (Map) null, (Map) null, (List) null, (String) null, (List) null, (String) null, (Map) null, (IntentionContract) null, (BlackAddressWarning) null, (AuthQuantityInfo) null, -1, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.checkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.trxPermissionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletGasLimitRes component14() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.blackAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.isSimilar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.similarAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component20() {
        return this.similar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component23() {
        return this.pendingNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimulateTransactionResult> component25() {
        return this.simulateTransactionResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackTagRes component26() {
        return this.blackTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.AssetsDiff>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.AssetsDiff>> */
    public final Map<String, List<AssetsDiff>> component27() {
        return this.assetsDiffs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.Exposures>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.Exposures>> */
    public final Map<String, List<Exposures>> component28() {
        return this.exposures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component29() {
        return this.solanaPayFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component31() {
        return this.causeRiskItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.permissionMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission>> */
    public final Map<String, List<BeforeAndAfterPermission>> component33() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentionContract component34() {
        return this.intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackAddressWarning component35() {
        return this.blackAddressWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthQuantityInfo component36() {
        return this.authQuantityInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.newNonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.popUpTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.popUpDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.primaryButtonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.secondaryButtonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxToastCheckRes copy(Integer num, Boolean bool, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num3, WalletGasLimitRes walletGasLimitRes, String str10, String str11, String str12, Integer num4, String str13, Boolean bool2, String str14, String str15, Integer num5, String str16, List<SimulateTransactionResult> list, BlackTagRes blackTagRes, Map<String, ? extends List<AssetsDiff>> map, Map<String, ? extends List<Exposures>> map2, List<Integer> list2, String str17, List<String> list3, String str18, Map<String, ? extends List<BeforeAndAfterPermission>> map3, IntentionContract intentionContract, BlackAddressWarning blackAddressWarning, AuthQuantityInfo authQuantityInfo) {
        return new TxToastCheckRes(num, bool, str, str2, num2, str3, str4, str5, str6, str7, str8, str9, num3, walletGasLimitRes, str10, str11, str12, num4, str13, bool2, str14, str15, num5, str16, list, blackTagRes, map, map2, list2, str17, list3, str18, map3, intentionContract, blackAddressWarning, authQuantityInfo);
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
        if (!(obj instanceof TxToastCheckRes)) {
            return false;
        }
        TxToastCheckRes txToastCheckRes = (TxToastCheckRes) obj;
        return Intrinsics.EZpvd(this.checkType, txToastCheckRes.checkType) && Intrinsics.EZpvd(this.result, txToastCheckRes.result) && Intrinsics.EZpvd((Object) this.nonce, (Object) txToastCheckRes.nonce) && Intrinsics.EZpvd((Object) this.newNonce, (Object) txToastCheckRes.newNonce) && Intrinsics.EZpvd(this.toastType, txToastCheckRes.toastType) && Intrinsics.EZpvd((Object) this.popUpTitle, (Object) txToastCheckRes.popUpTitle) && Intrinsics.EZpvd((Object) this.popUpDesc, (Object) txToastCheckRes.popUpDesc) && Intrinsics.EZpvd((Object) this.primaryButtonName, (Object) txToastCheckRes.primaryButtonName) && Intrinsics.EZpvd((Object) this.secondaryButtonName, (Object) txToastCheckRes.secondaryButtonName) && Intrinsics.EZpvd((Object) this.msg, (Object) txToastCheckRes.msg) && Intrinsics.EZpvd((Object) this.txId, (Object) txToastCheckRes.txId) && Intrinsics.EZpvd((Object) this.txhash, (Object) txToastCheckRes.txhash) && Intrinsics.EZpvd(this.trxPermissionId, txToastCheckRes.trxPermissionId) && Intrinsics.EZpvd(this.gasLimit, txToastCheckRes.gasLimit) && Intrinsics.EZpvd((Object) this.blackAddress, (Object) txToastCheckRes.blackAddress) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) txToastCheckRes.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) txToastCheckRes.priorityFee) && Intrinsics.EZpvd(this.isSimilar, txToastCheckRes.isSimilar) && Intrinsics.EZpvd((Object) this.similarAddress, (Object) txToastCheckRes.similarAddress) && Intrinsics.EZpvd(this.similar, txToastCheckRes.similar) && Intrinsics.EZpvd((Object) this.resultCode, (Object) txToastCheckRes.resultCode) && Intrinsics.EZpvd((Object) this.orderId, (Object) txToastCheckRes.orderId) && Intrinsics.EZpvd(this.pendingNum, txToastCheckRes.pendingNum) && Intrinsics.EZpvd((Object) this.orderType, (Object) txToastCheckRes.orderType) && Intrinsics.EZpvd(this.simulateTransactionResultList, txToastCheckRes.simulateTransactionResultList) && Intrinsics.EZpvd(this.blackTag, txToastCheckRes.blackTag) && Intrinsics.EZpvd(this.assetsDiffs, txToastCheckRes.assetsDiffs) && Intrinsics.EZpvd(this.exposures, txToastCheckRes.exposures) && Intrinsics.EZpvd(this.solanaPayFee, txToastCheckRes.solanaPayFee) && Intrinsics.EZpvd((Object) this.strategy, (Object) txToastCheckRes.strategy) && Intrinsics.EZpvd(this.causeRiskItem, txToastCheckRes.causeRiskItem) && Intrinsics.EZpvd((Object) this.permissionMsg, (Object) txToastCheckRes.permissionMsg) && Intrinsics.EZpvd(this.permissions, txToastCheckRes.permissions) && Intrinsics.EZpvd(this.intention, txToastCheckRes.intention) && Intrinsics.EZpvd(this.blackAddressWarning, txToastCheckRes.blackAddressWarning) && Intrinsics.EZpvd(this.authQuantityInfo, txToastCheckRes.authQuantityInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.AssetsDiff>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.AssetsDiff>> */
    public final Map<String, List<AssetsDiff>> getAssetsDiffs() {
        return this.assetsDiffs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthQuantityInfo getAuthQuantityInfo() {
        return this.authQuantityInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlackAddress() {
        return this.blackAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackAddressWarning getBlackAddressWarning() {
        return this.blackAddressWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackTagRes getBlackTag() {
        return this.blackTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCauseRiskItem() {
        return this.causeRiskItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCheckType() {
        return this.checkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.Exposures>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.Exposures>> */
    public final Map<String, List<Exposures>> getExposures() {
        return this.exposures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletGasLimitRes getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentionContract getIntention() {
        return this.intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewNonce() {
        return this.newNonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPendingNum() {
        return this.pendingNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPermissionMsg() {
        return this.permissionMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission>> */
    public final Map<String, List<BeforeAndAfterPermission>> getPermissions() {
        return this.permissions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPopUpDesc() {
        return this.popUpDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPopUpTitle() {
        return this.popUpTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimaryButtonName() {
        return this.primaryButtonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResultCode() {
        return this.resultCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondaryButtonName() {
        return this.secondaryButtonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSimilar() {
        return this.similar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimilarAddress() {
        return this.similarAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimulateTransactionResult> getSimulateTransactionResultList() {
        return this.simulateTransactionResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getSolanaPayFee() {
        return this.solanaPayFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategy() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToastType() {
        return this.toastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTrxPermissionId() {
        return this.trxPermissionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxhash() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.checkType;
        int iHashCode = num == null ? 0 : num.hashCode();
        Boolean bool = this.result;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.nonce;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.newNonce;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.toastType;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.popUpTitle;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.popUpDesc;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.primaryButtonName;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.secondaryButtonName;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.msg;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.txId;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.txhash;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        Integer num3 = this.trxPermissionId;
        int iHashCode13 = num3 == null ? 0 : num3.hashCode();
        WalletGasLimitRes walletGasLimitRes = this.gasLimit;
        int iHashCode14 = walletGasLimitRes == null ? 0 : walletGasLimitRes.hashCode();
        String str10 = this.blackAddress;
        int iHashCode15 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.gasPrice;
        int iHashCode16 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.priorityFee;
        int iHashCode17 = str12 == null ? 0 : str12.hashCode();
        Integer num4 = this.isSimilar;
        int iHashCode18 = num4 == null ? 0 : num4.hashCode();
        String str13 = this.similarAddress;
        int iHashCode19 = str13 == null ? 0 : str13.hashCode();
        Boolean bool2 = this.similar;
        int iHashCode20 = bool2 == null ? 0 : bool2.hashCode();
        String str14 = this.resultCode;
        int iHashCode21 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.orderId;
        int iHashCode22 = str15 == null ? 0 : str15.hashCode();
        Integer num5 = this.pendingNum;
        int iHashCode23 = num5 == null ? 0 : num5.hashCode();
        String str16 = this.orderType;
        int iHashCode24 = str16 == null ? 0 : str16.hashCode();
        List<SimulateTransactionResult> list = this.simulateTransactionResultList;
        int iHashCode25 = list == null ? 0 : list.hashCode();
        BlackTagRes blackTagRes = this.blackTag;
        int iHashCode26 = blackTagRes == null ? 0 : blackTagRes.hashCode();
        Map<String, ? extends List<AssetsDiff>> map = this.assetsDiffs;
        int iHashCode27 = map == null ? 0 : map.hashCode();
        Map<String, ? extends List<Exposures>> map2 = this.exposures;
        int iHashCode28 = map2 == null ? 0 : map2.hashCode();
        List<Integer> list2 = this.solanaPayFee;
        int iHashCode29 = list2 == null ? 0 : list2.hashCode();
        String str17 = this.strategy;
        int iHashCode30 = str17 == null ? 0 : str17.hashCode();
        List<String> list3 = this.causeRiskItem;
        int iHashCode31 = list3 == null ? 0 : list3.hashCode();
        String str18 = this.permissionMsg;
        int iHashCode32 = str18 == null ? 0 : str18.hashCode();
        Map<String, ? extends List<BeforeAndAfterPermission>> map3 = this.permissions;
        int iHashCode33 = map3 == null ? 0 : map3.hashCode();
        IntentionContract intentionContract = this.intention;
        int iHashCode34 = intentionContract == null ? 0 : intentionContract.hashCode();
        BlackAddressWarning blackAddressWarning = this.blackAddressWarning;
        int iHashCode35 = blackAddressWarning == null ? 0 : blackAddressWarning.hashCode();
        AuthQuantityInfo authQuantityInfo = this.authQuantityInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (authQuantityInfo == null ? 0 : authQuantityInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isSimilar() {
        return this.isSimilar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetsDiffs(Map<String, ? extends List<AssetsDiff>> map) {
        this.assetsDiffs = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthQuantityInfo(AuthQuantityInfo authQuantityInfo) {
        this.authQuantityInfo = authQuantityInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlackAddress(String str) {
        this.blackAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlackAddressWarning(BlackAddressWarning blackAddressWarning) {
        this.blackAddressWarning = blackAddressWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlackTag(BlackTagRes blackTagRes) {
        this.blackTag = blackTagRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCauseRiskItem(List<String> list) {
        this.causeRiskItem = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckType(Integer num) {
        this.checkType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExposures(Map<String, ? extends List<Exposures>> map) {
        this.exposures = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(WalletGasLimitRes walletGasLimitRes) {
        this.gasLimit = walletGasLimitRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(String str) {
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntention(IntentionContract intentionContract) {
        this.intention = intentionContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewNonce(String str) {
        this.newNonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(String str) {
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(String str) {
        this.orderType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingNum(Integer num) {
        this.pendingNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPermissionMsg(String str) {
        this.permissionMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPermissions(Map<String, ? extends List<BeforeAndAfterPermission>> map) {
        this.permissions = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPopUpDesc(String str) {
        this.popUpDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPopUpTitle(String str) {
        this.popUpTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrimaryButtonName(String str) {
        this.primaryButtonName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFee(String str) {
        this.priorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResult(Boolean bool) {
        this.result = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResultCode(String str) {
        this.resultCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryButtonName(String str) {
        this.secondaryButtonName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimilar(Boolean bool) {
        this.similar = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimilar(Integer num) {
        this.isSimilar = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimilarAddress(String str) {
        this.similarAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimulateTransactionResultList(List<SimulateTransactionResult> list) {
        this.simulateTransactionResultList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanaPayFee(List<Integer> list) {
        this.solanaPayFee = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategy(String str) {
        this.strategy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToastType(Integer num) {
        this.toastType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrxPermissionId(Integer num) {
        this.trxPermissionId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxhash(String str) {
        this.txhash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxToastCheckRes(checkType=" + this.checkType + ", result=" + this.result + ", nonce=" + this.nonce + ", newNonce=" + this.newNonce + ", toastType=" + this.toastType + ", popUpTitle=" + this.popUpTitle + ", popUpDesc=" + this.popUpDesc + ", primaryButtonName=" + this.primaryButtonName + ", secondaryButtonName=" + this.secondaryButtonName + ", msg=" + this.msg + ", txId=" + this.txId + ", txhash=" + this.txhash + ", trxPermissionId=" + this.trxPermissionId + ", gasLimit=" + this.gasLimit + ", blackAddress=" + this.blackAddress + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ", isSimilar=" + this.isSimilar + ", similarAddress=" + this.similarAddress + ", similar=" + this.similar + ", resultCode=" + this.resultCode + ", orderId=" + this.orderId + ", pendingNum=" + this.pendingNum + ", orderType=" + this.orderType + ", simulateTransactionResultList=" + this.simulateTransactionResultList + ", blackTag=" + this.blackTag + ", assetsDiffs=" + this.assetsDiffs + ", exposures=" + this.exposures + ", solanaPayFee=" + this.solanaPayFee + ", strategy=" + this.strategy + ", causeRiskItem=" + this.causeRiskItem + ", permissionMsg=" + this.permissionMsg + ", permissions=" + this.permissions + ", intention=" + this.intention + ", blackAddressWarning=" + this.blackAddressWarning + ", authQuantityInfo=" + this.authQuantityInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.checkType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.result;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.nonce);
        parcel.writeString(this.newNonce);
        Integer num2 = this.toastType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.popUpTitle);
        parcel.writeString(this.popUpDesc);
        parcel.writeString(this.primaryButtonName);
        parcel.writeString(this.secondaryButtonName);
        parcel.writeString(this.msg);
        parcel.writeString(this.txId);
        parcel.writeString(this.txhash);
        Integer num3 = this.trxPermissionId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        WalletGasLimitRes walletGasLimitRes = this.gasLimit;
        if (walletGasLimitRes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletGasLimitRes.writeToParcel(parcel, i);
        }
        parcel.writeString(this.blackAddress);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.priorityFee);
        Integer num4 = this.isSimilar;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.similarAddress);
        Boolean bool2 = this.similar;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.resultCode);
        parcel.writeString(this.orderId);
        Integer num5 = this.pendingNum;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeString(this.orderType);
        List<SimulateTransactionResult> list = this.simulateTransactionResultList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SimulateTransactionResult> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        BlackTagRes blackTagRes = this.blackTag;
        if (blackTagRes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blackTagRes.writeToParcel(parcel, i);
        }
        Map<String, ? extends List<AssetsDiff>> map = this.assetsDiffs;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ? extends List<AssetsDiff>> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                List<AssetsDiff> value = entry.getValue();
                parcel.writeInt(value.size());
                Iterator<AssetsDiff> it2 = value.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
        }
        Map<String, ? extends List<Exposures>> map2 = this.exposures;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, ? extends List<Exposures>> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                List<Exposures> value2 = entry2.getValue();
                parcel.writeInt(value2.size());
                Iterator<Exposures> it3 = value2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
        }
        List<Integer> list2 = this.solanaPayFee;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Integer> it4 = list2.iterator();
            while (it4.hasNext()) {
                parcel.writeInt(it4.next().intValue());
            }
        }
        parcel.writeString(this.strategy);
        parcel.writeStringList(this.causeRiskItem);
        parcel.writeString(this.permissionMsg);
        Map<String, ? extends List<BeforeAndAfterPermission>> map3 = this.permissions;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map3.size());
            for (Map.Entry<String, ? extends List<BeforeAndAfterPermission>> entry3 : map3.entrySet()) {
                parcel.writeString(entry3.getKey());
                List<BeforeAndAfterPermission> value3 = entry3.getValue();
                parcel.writeInt(value3.size());
                Iterator<BeforeAndAfterPermission> it5 = value3.iterator();
                while (it5.hasNext()) {
                    it5.next().writeToParcel(parcel, i);
                }
            }
        }
        IntentionContract intentionContract = this.intention;
        if (intentionContract == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            intentionContract.writeToParcel(parcel, i);
        }
        BlackAddressWarning blackAddressWarning = this.blackAddressWarning;
        if (blackAddressWarning == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blackAddressWarning.writeToParcel(parcel, i);
        }
        AuthQuantityInfo authQuantityInfo = this.authQuantityInfo;
        if (authQuantityInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authQuantityInfo.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TxToastCheckRes(int i, int i2, Integer num, Boolean bool, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num3, WalletGasLimitRes walletGasLimitRes, String str10, String str11, String str12, Integer num4, String str13, Boolean bool2, String str14, String str15, Integer num5, String str16, List list, BlackTagRes blackTagRes, Map map, Map map2, List list2, String str17, List list3, String str18, Map map3, IntentionContract intentionContract, BlackAddressWarning blackAddressWarning, AuthQuantityInfo authQuantityInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.checkType = null;
        } else {
            this.checkType = num;
        }
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = bool;
        }
        if ((i & 4) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str;
        }
        if ((i & 8) == 0) {
            this.newNonce = null;
        } else {
            this.newNonce = str2;
        }
        if ((i & 16) == 0) {
            this.toastType = null;
        } else {
            this.toastType = num2;
        }
        if ((i & 32) == 0) {
            this.popUpTitle = null;
        } else {
            this.popUpTitle = str3;
        }
        if ((i & 64) == 0) {
            this.popUpDesc = null;
        } else {
            this.popUpDesc = str4;
        }
        if ((i & 128) == 0) {
            this.primaryButtonName = null;
        } else {
            this.primaryButtonName = str5;
        }
        if ((i & 256) == 0) {
            this.secondaryButtonName = null;
        } else {
            this.secondaryButtonName = str6;
        }
        if ((i & 512) == 0) {
            this.msg = null;
        } else {
            this.msg = str7;
        }
        if ((i & 1024) == 0) {
            this.txId = null;
        } else {
            this.txId = str8;
        }
        if ((i & 2048) == 0) {
            this.txhash = null;
        } else {
            this.txhash = str9;
        }
        if ((i & 4096) == 0) {
            this.trxPermissionId = null;
        } else {
            this.trxPermissionId = num3;
        }
        if ((i & 8192) == 0) {
            this.gasLimit = null;
        } else {
            this.gasLimit = walletGasLimitRes;
        }
        if ((i & 16384) == 0) {
            this.blackAddress = null;
        } else {
            this.blackAddress = str10;
        }
        if ((32768 & i) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str11;
        }
        if ((65536 & i) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str12;
        }
        this.isSimilar = (131072 & i) == 0 ? 0 : num4;
        if ((262144 & i) == 0) {
            this.similarAddress = null;
        } else {
            this.similarAddress = str13;
        }
        if ((524288 & i) == 0) {
            this.similar = null;
        } else {
            this.similar = bool2;
        }
        if ((1048576 & i) == 0) {
            this.resultCode = null;
        } else {
            this.resultCode = str14;
        }
        if ((2097152 & i) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str15;
        }
        this.pendingNum = (4194304 & i) == 0 ? 0 : num5;
        if ((8388608 & i) == 0) {
            this.orderType = null;
        } else {
            this.orderType = str16;
        }
        if ((16777216 & i) == 0) {
            this.simulateTransactionResultList = null;
        } else {
            this.simulateTransactionResultList = list;
        }
        if ((33554432 & i) == 0) {
            this.blackTag = null;
        } else {
            this.blackTag = blackTagRes;
        }
        if ((67108864 & i) == 0) {
            this.assetsDiffs = null;
        } else {
            this.assetsDiffs = map;
        }
        if ((134217728 & i) == 0) {
            this.exposures = null;
        } else {
            this.exposures = map2;
        }
        if ((268435456 & i) == 0) {
            this.solanaPayFee = null;
        } else {
            this.solanaPayFee = list2;
        }
        if ((536870912 & i) == 0) {
            this.strategy = null;
        } else {
            this.strategy = str17;
        }
        if ((1073741824 & i) == 0) {
            this.causeRiskItem = null;
        } else {
            this.causeRiskItem = list3;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.permissionMsg = null;
        } else {
            this.permissionMsg = str18;
        }
        if ((i2 & 1) == 0) {
            this.permissions = null;
        } else {
            this.permissions = map3;
        }
        if ((i2 & 2) == 0) {
            this.intention = null;
        } else {
            this.intention = intentionContract;
        }
        if ((i2 & 4) == 0) {
            this.blackAddressWarning = null;
        } else {
            this.blackAddressWarning = blackAddressWarning;
        }
        if ((i2 & 8) == 0) {
            this.authQuantityInfo = null;
        } else {
            this.authQuantityInfo = authQuantityInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(TxToastCheckRes txToastCheckRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || txToastCheckRes.checkType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, txToastCheckRes.checkType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || txToastCheckRes.result != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, txToastCheckRes.result);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || txToastCheckRes.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, txToastCheckRes.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || txToastCheckRes.newNonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, txToastCheckRes.newNonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || txToastCheckRes.toastType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, txToastCheckRes.toastType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || txToastCheckRes.popUpTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, txToastCheckRes.popUpTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || txToastCheckRes.popUpDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, txToastCheckRes.popUpDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || txToastCheckRes.primaryButtonName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, txToastCheckRes.primaryButtonName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || txToastCheckRes.secondaryButtonName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, txToastCheckRes.secondaryButtonName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || txToastCheckRes.msg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, txToastCheckRes.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || txToastCheckRes.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, txToastCheckRes.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || txToastCheckRes.txhash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, txToastCheckRes.txhash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || txToastCheckRes.trxPermissionId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, txToastCheckRes.trxPermissionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || txToastCheckRes.gasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, WalletGasLimitRes$$serializer.INSTANCE, txToastCheckRes.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || txToastCheckRes.blackAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, txToastCheckRes.blackAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || txToastCheckRes.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, txToastCheckRes.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || txToastCheckRes.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, txToastCheckRes.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || (num2 = txToastCheckRes.isSimilar) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, txToastCheckRes.isSimilar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || txToastCheckRes.similarAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, txToastCheckRes.similarAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || txToastCheckRes.similar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, txToastCheckRes.similar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || txToastCheckRes.resultCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, txToastCheckRes.resultCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || txToastCheckRes.orderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, txToastCheckRes.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || (num = txToastCheckRes.pendingNum) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, IntSerializer.INSTANCE, txToastCheckRes.pendingNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || txToastCheckRes.orderType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, txToastCheckRes.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || txToastCheckRes.simulateTransactionResultList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, kSerializerArr[24], txToastCheckRes.simulateTransactionResultList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || txToastCheckRes.blackTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, BlackTagRes$$serializer.INSTANCE, txToastCheckRes.blackTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || txToastCheckRes.assetsDiffs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, kSerializerArr[26], txToastCheckRes.assetsDiffs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || txToastCheckRes.exposures != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], txToastCheckRes.exposures);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || txToastCheckRes.solanaPayFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, kSerializerArr[28], txToastCheckRes.solanaPayFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || txToastCheckRes.strategy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, txToastCheckRes.strategy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || txToastCheckRes.causeRiskItem != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, kSerializerArr[30], txToastCheckRes.causeRiskItem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || txToastCheckRes.permissionMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, txToastCheckRes.permissionMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || txToastCheckRes.permissions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, kSerializerArr[32], txToastCheckRes.permissions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || txToastCheckRes.intention != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, IntentionContract$$serializer.INSTANCE, txToastCheckRes.intention);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || txToastCheckRes.blackAddressWarning != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, BlackAddressWarning$$serializer.INSTANCE, txToastCheckRes.blackAddressWarning);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) && txToastCheckRes.authQuantityInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, AuthQuantityInfo$$serializer.INSTANCE, txToastCheckRes.authQuantityInfo);
    }

    public TxToastCheckRes(Integer num, Boolean bool, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num3, WalletGasLimitRes walletGasLimitRes, String str10, String str11, String str12, Integer num4, String str13, Boolean bool2, String str14, String str15, Integer num5, String str16, List<SimulateTransactionResult> list, BlackTagRes blackTagRes, Map<String, ? extends List<AssetsDiff>> map, Map<String, ? extends List<Exposures>> map2, List<Integer> list2, String str17, List<String> list3, String str18, Map<String, ? extends List<BeforeAndAfterPermission>> map3, IntentionContract intentionContract, BlackAddressWarning blackAddressWarning, AuthQuantityInfo authQuantityInfo) {
        this.checkType = num;
        this.result = bool;
        this.nonce = str;
        this.newNonce = str2;
        this.toastType = num2;
        this.popUpTitle = str3;
        this.popUpDesc = str4;
        this.primaryButtonName = str5;
        this.secondaryButtonName = str6;
        this.msg = str7;
        this.txId = str8;
        this.txhash = str9;
        this.trxPermissionId = num3;
        this.gasLimit = walletGasLimitRes;
        this.blackAddress = str10;
        this.gasPrice = str11;
        this.priorityFee = str12;
        this.isSimilar = num4;
        this.similarAddress = str13;
        this.similar = bool2;
        this.resultCode = str14;
        this.orderId = str15;
        this.pendingNum = num5;
        this.orderType = str16;
        this.simulateTransactionResultList = list;
        this.blackTag = blackTagRes;
        this.assetsDiffs = map;
        this.exposures = map2;
        this.solanaPayFee = list2;
        this.strategy = str17;
        this.causeRiskItem = list3;
        this.permissionMsg = str18;
        this.permissions = map3;
        this.intention = intentionContract;
        this.blackAddressWarning = blackAddressWarning;
        this.authQuantityInfo = authQuantityInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01a9: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r37v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r73v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r73v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r73v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0022: ARITH (r73v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r73v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r73v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r73v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r73v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r73v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r73v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r73v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r73v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.biz.net.bean.WalletGasLimitRes:?: TERNARY null = ((wrap:int:0x006a: ARITH (r73v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.WalletGasLimitRes) : (r50v0 com.okinc.business.defi.biz.net.bean.WalletGasLimitRes))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r73v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r73v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r73v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0093: ARITH (r73v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r54v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r73v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r73v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r56v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r73v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r73v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r73v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r59v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r73v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r73v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r61v0 java.util.List))
  (wrap:com.okinc.business.defi.biz.net.bean.BlackTagRes:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r73v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.BlackTagRes) : (r62v0 com.okinc.business.defi.biz.net.bean.BlackTagRes))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r73v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r63v0 java.util.Map))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0107: ARITH (r73v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r64v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0112: ARITH (r73v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r65v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011d: ARITH (r73v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0128: ARITH (r73v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r67v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0133: ARITH (r73v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x013b: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r69v0 java.util.Map))
  (wrap:com.okinc.business.defi.biz.net.bean.IntentionContract:?: TERNARY null = ((wrap:int:0x0144: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.IntentionContract) : (r70v0 com.okinc.business.defi.biz.net.bean.IntentionContract))
  (wrap:com.okinc.business.defi.biz.net.bean.BlackAddressWarning:?: TERNARY null = ((wrap:int:0x014d: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.BlackAddressWarning) : (r71v0 com.okinc.business.defi.biz.net.bean.BlackAddressWarning))
  (wrap:com.okinc.business.defi.biz.net.bean.AuthQuantityInfo:?: TERNARY null = ((wrap:int:0x0156: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.AuthQuantityInfo) : (r72v0 com.okinc.business.defi.biz.net.bean.AuthQuantityInfo))
 A[MD:(java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.biz.net.bean.WalletGasLimitRes, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.SimulateTransactionResult>, com.okinc.business.defi.biz.net.bean.BlackTagRes, java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.AssetsDiff>>, java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.Exposures>>, java.util.List<java.lang.Integer>, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission>>, com.okinc.business.defi.biz.net.bean.IntentionContract, com.okinc.business.defi.biz.net.bean.BlackAddressWarning, com.okinc.business.defi.biz.net.bean.AuthQuantityInfo):void (m)] (LINE:15) call: com.okinc.business.defi.biz.net.bean.TxToastCheckRes.<init>(java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.defi.biz.net.bean.WalletGasLimitRes, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, com.okinc.business.defi.biz.net.bean.BlackTagRes, java.util.Map, java.util.Map, java.util.List, java.lang.String, java.util.List, java.lang.String, java.util.Map, com.okinc.business.defi.biz.net.bean.IntentionContract, com.okinc.business.defi.biz.net.bean.BlackAddressWarning, com.okinc.business.defi.biz.net.bean.AuthQuantityInfo):void type: THIS */
    public /* synthetic */ TxToastCheckRes(Integer num, Boolean bool, String str, String str2, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num3, WalletGasLimitRes walletGasLimitRes, String str10, String str11, String str12, Integer num4, String str13, Boolean bool2, String str14, String str15, Integer num5, String str16, List list, BlackTagRes blackTagRes, Map map, Map map2, List list2, String str17, List list3, String str18, Map map3, IntentionContract intentionContract, BlackAddressWarning blackAddressWarning, AuthQuantityInfo authQuantityInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : walletGasLimitRes, (i & 16384) != 0 ? null : str10, (i & 32768) != 0 ? null : str11, (i & 65536) != 0 ? null : str12, (i & 131072) != 0 ? 0 : num4, (i & 262144) != 0 ? null : str13, (i & 524288) != 0 ? null : bool2, (i & 1048576) != 0 ? null : str14, (i & 2097152) != 0 ? null : str15, (i & 4194304) != 0 ? 0 : num5, (i & 8388608) != 0 ? null : str16, (i & 16777216) != 0 ? null : list, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : blackTagRes, (i & 67108864) != 0 ? null : map, (i & 134217728) != 0 ? null : map2, (i & 268435456) != 0 ? null : list2, (i & 536870912) != 0 ? null : str17, (i & 1073741824) != 0 ? null : list3, (i & Integer.MIN_VALUE) != 0 ? null : str18, (i2 & 1) != 0 ? null : map3, (i2 & 2) != 0 ? null : intentionContract, (i2 & 4) != 0 ? null : blackAddressWarning, (i2 & 8) != 0 ? null : authQuantityInfo);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TxToastCheckRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TxToastCheckRes> serializer() {
            return TxToastCheckRes$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SimulateTransactionResult$$serializer.INSTANCE), null, new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(AssetsDiff$$serializer.INSTANCE)), new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(Exposures$$serializer.INSTANCE)), new ArrayListSerializer(IntSerializer.INSTANCE), null, new ArrayListSerializer(stringSerializer), null, new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(BeforeAndAfterPermission$$serializer.INSTANCE)), null, null, null};
    }

    public final boolean isSimilarAddress() {
        return Intrinsics.EZpvd(this.similar, Boolean.TRUE) && C33129mqd.OLrzqt((CharSequence) this.similarAddress);
    }

    public final boolean isBoutique() {
        Boolean tagExt;
        BlackAddressWarning blackAddressWarning = this.blackAddressWarning;
        if (blackAddressWarning == null || (tagExt = blackAddressWarning.getTagExt()) == null) {
            return false;
        }
        return tagExt.booleanValue();
    }

    public final String getWarningBlackAddress() {
        if (isBoutique()) {
            BlackAddressWarning blackAddressWarning = this.blackAddressWarning;
            String address = blackAddressWarning != null ? blackAddressWarning.getAddress() : null;
            if (address != null) {
                return address;
            }
        } else {
            String str = this.blackAddress;
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
