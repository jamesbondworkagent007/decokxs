package com.okinc.business.defi.api.model.tx.signdata;

import android.os.Bundle;
import com.okinc.business.defi.api.bean.AAMessageSignType;
import com.okinc.business.defi.api.bean.MpcSignType;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SignDataArgs<T extends BaseSignData> {
    public static final int $stable = 8;
    private AAMessageSignType aaMessageSignType;
    private Integer bizType;
    private Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> broadcastDelegate;
    private ArrayList<Integer> checkTypeFailList;
    private PlatformItem dapp;
    private boolean forceCheckKys;
    private final long generalChainId;
    private Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> inquiryCallback;
    private boolean isChangedCustomRpc;
    private boolean isTeeMode;
    private MpcSignType mpcSignType;
    private boolean needReleaseTransfer;
    private T signData;
    private SolanaSignType solanaSignType;
    private Integer txSource;
    private Integer txToastCheckBizLine;
    private String txToastCheckPayload;
    private boolean useDefaultUI;
    private boolean useDexGasParamsOnEVM;
    private String walletAddress;
    private final String walletId;
    private Bundle walletTxDataExtra;
    private Long wcId;
    private String wcTopic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaSignType component10() {
        return this.solanaSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle component13() {
        return this.walletTxDataExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.txToastCheckBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.txToastCheckPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>>, kotlin.jvm.functions.Function1<com.okinc.business.defi.api.bean.NewCallbackBean, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>> component16() {
        return this.broadcastDelegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>>, kotlin.jvm.functions.Function1<com.okinc.business.defi.api.bean.NewCallbackBean, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>> component17() {
        return this.inquiryCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isChangedCustomRpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.needReleaseTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Integer> component20() {
        return this.checkTypeFailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.forceCheckKys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.useDexGasParamsOnEVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.useDefaultUI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.isTeeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T component4() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem component5() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.wcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.wcTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcSignType component8() {
        return this.mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAMessageSignType component9() {
        return this.aaMessageSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignDataArgs<T> copy(@NotNull String str, String str2, long j, @NotNull T t, PlatformItem platformItem, Long l, String str3, @NotNull MpcSignType mpcSignType, @NotNull AAMessageSignType aAMessageSignType, @NotNull SolanaSignType solanaSignType, Integer num, Integer num2, Bundle bundle, Integer num3, String str4, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function12, boolean z, boolean z2, ArrayList<Integer> arrayList, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(mpcSignType, "");
        Intrinsics.checkNotNullParameter(aAMessageSignType, "");
        Intrinsics.checkNotNullParameter(solanaSignType, "");
        return new SignDataArgs<>(str, str2, j, t, platformItem, l, str3, mpcSignType, aAMessageSignType, solanaSignType, num, num2, bundle, num3, str4, function1, function12, z, z2, arrayList, z3, z4, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignDataArgs)) {
            return false;
        }
        SignDataArgs signDataArgs = (SignDataArgs) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) signDataArgs.walletId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) signDataArgs.walletAddress) && this.generalChainId == signDataArgs.generalChainId && Intrinsics.EZpvd(this.signData, signDataArgs.signData) && Intrinsics.EZpvd(this.dapp, signDataArgs.dapp) && Intrinsics.EZpvd(this.wcId, signDataArgs.wcId) && Intrinsics.EZpvd((Object) this.wcTopic, (Object) signDataArgs.wcTopic) && this.mpcSignType == signDataArgs.mpcSignType && this.aaMessageSignType == signDataArgs.aaMessageSignType && this.solanaSignType == signDataArgs.solanaSignType && Intrinsics.EZpvd(this.txSource, signDataArgs.txSource) && Intrinsics.EZpvd(this.bizType, signDataArgs.bizType) && Intrinsics.EZpvd(this.walletTxDataExtra, signDataArgs.walletTxDataExtra) && Intrinsics.EZpvd(this.txToastCheckBizLine, signDataArgs.txToastCheckBizLine) && Intrinsics.EZpvd((Object) this.txToastCheckPayload, (Object) signDataArgs.txToastCheckPayload) && Intrinsics.EZpvd(this.broadcastDelegate, signDataArgs.broadcastDelegate) && Intrinsics.EZpvd(this.inquiryCallback, signDataArgs.inquiryCallback) && this.isChangedCustomRpc == signDataArgs.isChangedCustomRpc && this.needReleaseTransfer == signDataArgs.needReleaseTransfer && Intrinsics.EZpvd(this.checkTypeFailList, signDataArgs.checkTypeFailList) && this.forceCheckKys == signDataArgs.forceCheckKys && this.useDexGasParamsOnEVM == signDataArgs.useDexGasParamsOnEVM && this.useDefaultUI == signDataArgs.useDefaultUI && this.isTeeMode == signDataArgs.isTeeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAMessageSignType getAaMessageSignType() {
        return this.aaMessageSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>>, kotlin.jvm.functions.Function1<com.okinc.business.defi.api.bean.NewCallbackBean, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>> getBroadcastDelegate() {
        return this.broadcastDelegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Integer> getCheckTypeFailList() {
        return this.checkTypeFailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem getDapp() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getForceCheckKys() {
        return this.forceCheckKys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGeneralChainId() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>>, kotlin.jvm.functions.Function1<com.okinc.business.defi.api.bean.NewCallbackBean, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>> */
    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<String>>> getInquiryCallback() {
        return this.inquiryCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcSignType getMpcSignType() {
        return this.mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedReleaseTransfer() {
        return this.needReleaseTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaSignType getSolanaSignType() {
        return this.solanaSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxSource() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTxToastCheckBizLine() {
        return this.txToastCheckBizLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxToastCheckPayload() {
        return this.txToastCheckPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseDefaultUI() {
        return this.useDefaultUI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseDexGasParamsOnEVM() {
        return this.useDexGasParamsOnEVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getWalletTxDataExtra() {
        return this.walletTxDataExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getWcId() {
        return this.wcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWcTopic() {
        return this.wcTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.walletId.hashCode();
        String str = this.walletAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Long.hashCode(this.generalChainId);
        int iHashCode4 = this.signData.hashCode();
        PlatformItem platformItem = this.dapp;
        int iHashCode5 = platformItem == null ? 0 : platformItem.hashCode();
        Long l = this.wcId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str2 = this.wcTopic;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.mpcSignType.hashCode();
        int iHashCode9 = this.aaMessageSignType.hashCode();
        int iHashCode10 = this.solanaSignType.hashCode();
        Integer num = this.txSource;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        Integer num2 = this.bizType;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        Bundle bundle = this.walletTxDataExtra;
        int iHashCode13 = bundle == null ? 0 : bundle.hashCode();
        Integer num3 = this.txToastCheckBizLine;
        int iHashCode14 = num3 == null ? 0 : num3.hashCode();
        String str3 = this.txToastCheckPayload;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1 = this.broadcastDelegate;
        int iHashCode16 = function1 == null ? 0 : function1.hashCode();
        Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function12 = this.inquiryCallback;
        int iHashCode17 = function12 == null ? 0 : function12.hashCode();
        int iHashCode18 = Boolean.hashCode(this.isChangedCustomRpc);
        int iHashCode19 = Boolean.hashCode(this.needReleaseTransfer);
        ArrayList<Integer> arrayList = this.checkTypeFailList;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + Boolean.hashCode(this.forceCheckKys)) * 31) + Boolean.hashCode(this.useDexGasParamsOnEVM)) * 31) + Boolean.hashCode(this.useDefaultUI)) * 31) + Boolean.hashCode(this.isTeeMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isChangedCustomRpc() {
        return this.isChangedCustomRpc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTeeMode() {
        return this.isTeeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaMessageSignType(@NotNull AAMessageSignType aAMessageSignType) {
        Intrinsics.checkNotNullParameter(aAMessageSignType, "");
        this.aaMessageSignType = aAMessageSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBroadcastDelegate(Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1) {
        this.broadcastDelegate = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangedCustomRpc(boolean z) {
        this.isChangedCustomRpc = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckTypeFailList(ArrayList<Integer> arrayList) {
        this.checkTypeFailList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDapp(PlatformItem platformItem) {
        this.dapp = platformItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForceCheckKys(boolean z) {
        this.forceCheckKys = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInquiryCallback(Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1) {
        this.inquiryCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpcSignType(@NotNull MpcSignType mpcSignType) {
        Intrinsics.checkNotNullParameter(mpcSignType, "");
        this.mpcSignType = mpcSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedReleaseTransfer(boolean z) {
        this.needReleaseTransfer = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignData(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.signData = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanaSignType(@NotNull SolanaSignType solanaSignType) {
        Intrinsics.checkNotNullParameter(solanaSignType, "");
        this.solanaSignType = solanaSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTeeMode(boolean z) {
        this.isTeeMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxSource(Integer num) {
        this.txSource = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxToastCheckBizLine(Integer num) {
        this.txToastCheckBizLine = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxToastCheckPayload(String str) {
        this.txToastCheckPayload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseDefaultUI(boolean z) {
        this.useDefaultUI = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseDexGasParamsOnEVM(boolean z) {
        this.useDexGasParamsOnEVM = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAddress(String str) {
        this.walletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletTxDataExtra(Bundle bundle) {
        this.walletTxDataExtra = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWcId(Long l) {
        this.wcId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWcTopic(String str) {
        this.wcTopic = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignDataArgs(walletId=" + this.walletId + ", walletAddress=" + this.walletAddress + ", generalChainId=" + this.generalChainId + ", signData=" + this.signData + ", dapp=" + this.dapp + ", wcId=" + this.wcId + ", wcTopic=" + this.wcTopic + ", mpcSignType=" + this.mpcSignType + ", aaMessageSignType=" + this.aaMessageSignType + ", solanaSignType=" + this.solanaSignType + ", txSource=" + this.txSource + ", bizType=" + this.bizType + ", walletTxDataExtra=" + this.walletTxDataExtra + ", txToastCheckBizLine=" + this.txToastCheckBizLine + ", txToastCheckPayload=" + this.txToastCheckPayload + ", broadcastDelegate=" + this.broadcastDelegate + ", inquiryCallback=" + this.inquiryCallback + ", isChangedCustomRpc=" + this.isChangedCustomRpc + ", needReleaseTransfer=" + this.needReleaseTransfer + ", checkTypeFailList=" + this.checkTypeFailList + ", forceCheckKys=" + this.forceCheckKys + ", useDexGasParamsOnEVM=" + this.useDexGasParamsOnEVM + ", useDefaultUI=" + this.useDefaultUI + ", isTeeMode=" + this.isTeeMode + ")";
    }

    public SignDataArgs(@NotNull String str, String str2, long j, @NotNull T t, PlatformItem platformItem, Long l, String str3, @NotNull MpcSignType mpcSignType, @NotNull AAMessageSignType aAMessageSignType, @NotNull SolanaSignType solanaSignType, Integer num, Integer num2, Bundle bundle, Integer num3, String str4, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function12, boolean z, boolean z2, ArrayList<Integer> arrayList, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(mpcSignType, "");
        Intrinsics.checkNotNullParameter(aAMessageSignType, "");
        Intrinsics.checkNotNullParameter(solanaSignType, "");
        this.walletId = str;
        this.walletAddress = str2;
        this.generalChainId = j;
        this.signData = t;
        this.dapp = platformItem;
        this.wcId = l;
        this.wcTopic = str3;
        this.mpcSignType = mpcSignType;
        this.aaMessageSignType = aAMessageSignType;
        this.solanaSignType = solanaSignType;
        this.txSource = num;
        this.bizType = num2;
        this.walletTxDataExtra = bundle;
        this.txToastCheckBizLine = num3;
        this.txToastCheckPayload = str4;
        this.broadcastDelegate = function1;
        this.inquiryCallback = function12;
        this.isChangedCustomRpc = z;
        this.needReleaseTransfer = z2;
        this.checkTypeFailList = arrayList;
        this.forceCheckKys = z3;
        this.useDexGasParamsOnEVM = z4;
        this.useDefaultUI = z5;
        this.isTeeMode = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d1: CONSTRUCTOR 
  (r30v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r55v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (r32v0 long)
  (r34v0 com.okinc.business.defi.api.model.tx.signdata.BaseSignData)
  (wrap:com.okinc.business.defi.api.model.tx.signdata.PlatformItem:?: TERNARY null = ((wrap:int:0x000b: ARITH (r55v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.PlatformItem) : (r35v0 com.okinc.business.defi.api.model.tx.signdata.PlatformItem))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r55v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r36v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r55v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.MpcSignType:?: TERNARY null = ((wrap:int:0x0023: ARITH (r55v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] (LINE:49) com.okinc.business.defi.api.bean.MpcSignType.NORMAL com.okinc.business.defi.api.bean.MpcSignType) : (r38v0 com.okinc.business.defi.api.bean.MpcSignType))
  (wrap:com.okinc.business.defi.api.bean.AAMessageSignType:?: TERNARY null = ((wrap:int:0x002d: ARITH (r55v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] (LINE:55) com.okinc.business.defi.api.bean.AAMessageSignType.NORMAL com.okinc.business.defi.api.bean.AAMessageSignType) : (r39v0 com.okinc.business.defi.api.bean.AAMessageSignType))
  (wrap:com.okinc.business.defi.api.bean.SolanaSignType:?: TERNARY null = ((wrap:int:0x0037: ARITH (r55v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] (LINE:61) com.okinc.business.defi.api.bean.SolanaSignType.NORMAL com.okinc.business.defi.api.bean.SolanaSignType) : (r40v0 com.okinc.business.defi.api.bean.SolanaSignType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0041: ARITH (r55v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0049: ARITH (r55v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x0052: ARITH (r55v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r43v0 android.os.Bundle))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005b: ARITH (r55v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r55v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0070: ARITH (32768 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r46v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x007a: ARITH (65536 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r47v0 kotlin.jvm.functions.Function1))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0084: ARITH (131072 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (262144 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0099: ARITH (524288 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r50v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (1048576 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ad: ARITH (2097152 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r52v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b7: ARITH (4194304 int) & (r55v0 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r55v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
 A[MD:(java.lang.String, java.lang.String, long, T extends com.okinc.business.defi.api.model.tx.signdata.BaseSignData, com.okinc.business.defi.api.model.tx.signdata.PlatformItem, java.lang.Long, java.lang.String, com.okinc.business.defi.api.bean.MpcSignType, com.okinc.business.defi.api.bean.AAMessageSignType, com.okinc.business.defi.api.bean.SolanaSignType, java.lang.Integer, java.lang.Integer, android.os.Bundle, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>>, kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.NewCallbackBean, ? extends o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>>>, boolean, boolean, java.util.ArrayList<java.lang.Integer>, boolean, boolean, boolean, boolean):void (m)] (LINE:24) call: com.okinc.business.defi.api.model.tx.signdata.SignDataArgs.<init>(java.lang.String, java.lang.String, long, com.okinc.business.defi.api.model.tx.signdata.BaseSignData, com.okinc.business.defi.api.model.tx.signdata.PlatformItem, java.lang.Long, java.lang.String, com.okinc.business.defi.api.bean.MpcSignType, com.okinc.business.defi.api.bean.AAMessageSignType, com.okinc.business.defi.api.bean.SolanaSignType, java.lang.Integer, java.lang.Integer, android.os.Bundle, java.lang.Integer, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean, java.util.ArrayList, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ SignDataArgs(String str, String str2, long j, BaseSignData baseSignData, PlatformItem platformItem, Long l, String str3, MpcSignType mpcSignType, AAMessageSignType aAMessageSignType, SolanaSignType solanaSignType, Integer num, Integer num2, Bundle bundle, Integer num3, String str4, Function1 function1, Function1 function12, boolean z, boolean z2, ArrayList arrayList, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, j, baseSignData, (i & 16) != 0 ? null : platformItem, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? MpcSignType.NORMAL : mpcSignType, (i & 256) != 0 ? AAMessageSignType.NORMAL : aAMessageSignType, (i & 512) != 0 ? SolanaSignType.NORMAL : solanaSignType, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : bundle, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : str4, (32768 & i) != 0 ? null : function1, (65536 & i) != 0 ? null : function12, (131072 & i) != 0 ? false : z, (262144 & i) != 0 ? false : z2, (524288 & i) != 0 ? null : arrayList, (1048576 & i) != 0 ? false : z3, (2097152 & i) != 0 ? false : z4, (4194304 & i) != 0 ? false : z5, (i & 8388608) != 0 ? false : z6);
    }
}
