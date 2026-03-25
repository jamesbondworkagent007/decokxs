package com.okinc.business.defi.biz.wallethardware.onekey;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.wallethardware.onekey.OneKeySignHelper;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import com.okinc.wallet.hardware.api.onekey.OneKeySDKError;
import io.reactivex.BackpressureStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58185ywX;
import o.C13754dXa;
import o.C54819xWm;
import o.C55097xdX;
import o.C57656ymY;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.eHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OneKeySignHelper {
    public static final OneKeySignHelper copydefault = new OneKeySignHelper();
    public static final Handler AEQbTJ = new Handler(Looper.getMainLooper());
    public static final int EZpvd = 8;

    private OneKeySignHelper() {
    }

    public interface OneKeySignData extends Parcelable {

        public static final class BtcTransaction implements OneKeySignData {
            public final UTXOTransaction EZpvd;
            public static final int KWHzl = UTXOTransaction.$stable;
            public static final Parcelable.Creator<BtcTransaction> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<BtcTransaction> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BtcTransaction createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new BtcTransaction((UTXOTransaction) parcel.readParcelable(BtcTransaction.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BtcTransaction[] newArray(int i) {
                    return new BtcTransaction[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ BtcTransaction copy$default(BtcTransaction btcTransaction, UTXOTransaction uTXOTransaction, int i, Object obj) {
                if ((i & 1) != 0) {
                    uTXOTransaction = btcTransaction.EZpvd;
                }
                return btcTransaction.copydefault(uTXOTransaction);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UTXOTransaction EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BtcTransaction copydefault(@NotNull UTXOTransaction uTXOTransaction) {
                Intrinsics.checkNotNullParameter(uTXOTransaction, "");
                return new BtcTransaction(uTXOTransaction);
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
                return (obj instanceof BtcTransaction) && Intrinsics.EZpvd(this.EZpvd, ((BtcTransaction) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "BtcTransaction(transaction=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeParcelable(this.EZpvd, i);
            }

            public BtcTransaction(@NotNull UTXOTransaction uTXOTransaction) {
                Intrinsics.checkNotNullParameter(uTXOTransaction, "");
                this.EZpvd = uTXOTransaction;
            }
        }

        public static final class EvmTransaction implements OneKeySignData {
            public static final Parcelable.Creator<EvmTransaction> CREATOR = new Creator();
            public final EvmTransactionData AEQbTJ;
            public final ChainAddress copydefault;

            public static final class Creator implements Parcelable.Creator<EvmTransaction> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EvmTransaction createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new EvmTransaction(ChainAddress.CREATOR.createFromParcel(parcel), EvmTransactionData.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EvmTransaction[] newArray(int i) {
                    return new EvmTransaction[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ EvmTransaction copy$default(EvmTransaction evmTransaction, ChainAddress chainAddress, EvmTransactionData evmTransactionData, int i, Object obj) {
                if ((i & 1) != 0) {
                    chainAddress = evmTransaction.copydefault;
                }
                if ((i & 2) != 0) {
                    evmTransactionData = evmTransaction.AEQbTJ;
                }
                return evmTransaction.EZpvd(chainAddress, evmTransactionData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EvmTransaction EZpvd(@NotNull ChainAddress chainAddress, @NotNull EvmTransactionData evmTransactionData) {
                Intrinsics.checkNotNullParameter(chainAddress, "");
                Intrinsics.checkNotNullParameter(evmTransactionData, "");
                return new EvmTransaction(chainAddress, evmTransactionData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChainAddress KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EvmTransactionData copydefault() {
                return this.AEQbTJ;
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
                if (!(obj instanceof EvmTransaction)) {
                    return false;
                }
                EvmTransaction evmTransaction = (EvmTransaction) obj;
                return Intrinsics.EZpvd(this.copydefault, evmTransaction.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, evmTransaction.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EvmTransaction(chainAddress=" + this.copydefault + ", data=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                this.copydefault.writeToParcel(parcel, i);
                this.AEQbTJ.writeToParcel(parcel, i);
            }

            public EvmTransaction(@NotNull ChainAddress chainAddress, @NotNull EvmTransactionData evmTransactionData) {
                Intrinsics.checkNotNullParameter(chainAddress, "");
                Intrinsics.checkNotNullParameter(evmTransactionData, "");
                this.copydefault = chainAddress;
                this.AEQbTJ = evmTransactionData;
            }
        }

        public static final class EvmTypedData implements OneKeySignData {
            public static final Parcelable.Creator<EvmTypedData> CREATOR = new Creator();
            public final EVMTypedData AEQbTJ;
            public final ChainAddress OLrzqt;

            public static final class Creator implements Parcelable.Creator<EvmTypedData> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EvmTypedData createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new EvmTypedData(ChainAddress.CREATOR.createFromParcel(parcel), EVMTypedData.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EvmTypedData[] newArray(int i) {
                    return new EvmTypedData[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ EvmTypedData copy$default(EvmTypedData evmTypedData, ChainAddress chainAddress, EVMTypedData eVMTypedData, int i, Object obj) {
                if ((i & 1) != 0) {
                    chainAddress = evmTypedData.OLrzqt;
                }
                if ((i & 2) != 0) {
                    eVMTypedData = evmTypedData.AEQbTJ;
                }
                return evmTypedData.OLrzqt(chainAddress, eVMTypedData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EVMTypedData EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChainAddress KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EvmTypedData OLrzqt(@NotNull ChainAddress chainAddress, @NotNull EVMTypedData eVMTypedData) {
                Intrinsics.checkNotNullParameter(chainAddress, "");
                Intrinsics.checkNotNullParameter(eVMTypedData, "");
                return new EvmTypedData(chainAddress, eVMTypedData);
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
                if (!(obj instanceof EvmTypedData)) {
                    return false;
                }
                EvmTypedData evmTypedData = (EvmTypedData) obj;
                return Intrinsics.EZpvd(this.OLrzqt, evmTypedData.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, evmTypedData.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EvmTypedData(chainAddress=" + this.OLrzqt + ", data=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                this.OLrzqt.writeToParcel(parcel, i);
                this.AEQbTJ.writeToParcel(parcel, i);
            }

            public EvmTypedData(@NotNull ChainAddress chainAddress, @NotNull EVMTypedData eVMTypedData) {
                Intrinsics.checkNotNullParameter(chainAddress, "");
                Intrinsics.checkNotNullParameter(eVMTypedData, "");
                this.OLrzqt = chainAddress;
                this.AEQbTJ = eVMTypedData;
            }
        }

        public static final class EvmMessage implements OneKeySignData {
            public static final Parcelable.Creator<EvmMessage> CREATOR = new Creator();
            public final ChainAddress AEQbTJ;
            public final String copydefault;

            public static final class Creator implements Parcelable.Creator<EvmMessage> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EvmMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new EvmMessage(ChainAddress.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EvmMessage[] newArray(int i) {
                    return new EvmMessage[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ EvmMessage copy$default(EvmMessage evmMessage, ChainAddress chainAddress, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    chainAddress = evmMessage.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str = evmMessage.copydefault;
                }
                return evmMessage.EZpvd(chainAddress, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EvmMessage EZpvd(@NotNull ChainAddress chainAddress, @NotNull String str) {
                Intrinsics.checkNotNullParameter(chainAddress, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new EvmMessage(chainAddress, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ChainAddress OLrzqt() {
                return this.AEQbTJ;
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
                if (!(obj instanceof EvmMessage)) {
                    return false;
                }
                EvmMessage evmMessage = (EvmMessage) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, evmMessage.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) evmMessage.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EvmMessage(chainAddress=" + this.AEQbTJ + ", signData=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                this.AEQbTJ.writeToParcel(parcel, i);
                parcel.writeString(this.copydefault);
            }

            public EvmMessage(@NotNull ChainAddress chainAddress, @NotNull String str) {
                Intrinsics.checkNotNullParameter(chainAddress, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = chainAddress;
                this.copydefault = str;
            }
        }
    }

    public final AbstractC58185ywX<ResponseData<String>> copydefault(AbstractC12782ctV abstractC12782ctV, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return KWHzl(abstractC12782ctV, new OneKeySignData.BtcTransaction(uTXOTransaction));
    }

    public final AbstractC58185ywX<ResponseData<String>> KWHzl(AbstractC12782ctV abstractC12782ctV, @NotNull ChainAddress chainAddress, @NotNull EvmTransactionData evmTransactionData) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(evmTransactionData, "");
        return KWHzl(abstractC12782ctV, new OneKeySignData.EvmTransaction(chainAddress, evmTransactionData));
    }

    public final AbstractC58185ywX<ResponseData<String>> OLrzqt(AbstractC12782ctV abstractC12782ctV, @NotNull ChainAddress chainAddress, @NotNull EVMTypedData eVMTypedData) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(eVMTypedData, "");
        return KWHzl(abstractC12782ctV, new OneKeySignData.EvmTypedData(chainAddress, eVMTypedData));
    }

    public final AbstractC58185ywX<ResponseData<String>> EZpvd(AbstractC12782ctV abstractC12782ctV, @NotNull ChainAddress chainAddress, @NotNull String str) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(abstractC12782ctV, new OneKeySignData.EvmMessage(chainAddress, str));
    }

    public final AbstractC58185ywX<ResponseData<String>> KWHzl(final AbstractC12782ctV abstractC12782ctV, final OneKeySignData oneKeySignData) {
        final Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || !(activityAEQbTJ instanceof FragmentActivity)) {
            AbstractC58185ywX<ResponseData<String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.dee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                OneKeySignHelper.OLrzqt(abstractC12782ctV, oneKeySignData, activityAEQbTJ, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final void OLrzqt(AbstractC12782ctV abstractC12782ctV, OneKeySignData oneKeySignData, final Activity activity, final InterfaceC58184ywW interfaceC58184ywW) {
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        CheckAndSignDialog.Activity activity2 = CheckAndSignDialog.Companion;
        String strEZpvd = (abstractC12782ctV == null || (abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ()) == null) ? null : abstractC12784ctXGwTjWJ.EZpvd();
        final CheckAndSignDialog checkAndSignDialogEZpvd = activity2.EZpvd(strEZpvd != null ? strEZpvd : "", oneKeySignData);
        checkAndSignDialogEZpvd.EZpvd(new CheckAndSignDialog.StateListAnimator() { // from class: o.deh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckAndSignDialog.StateListAnimator
            public final void EZpvd(eHO eho) {
                OneKeySignHelper.copydefault(interfaceC58184ywW, activity, eho);
            }
        });
        AEQbTJ.postDelayed(new Runnable() { // from class: o.dei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OneKeySignHelper.OLrzqt(checkAndSignDialogEZpvd, activity);
            }
        }, 100L);
    }

    public static final void copydefault(InterfaceC58184ywW interfaceC58184ywW, Activity activity, eHO eho) {
        Intrinsics.checkNotNullParameter(eho, "");
        if (eho instanceof eHO.Activity) {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, ((eHO.Activity) eho).copydefault(), null, 46, null));
        } else if (eho instanceof eHO.Application) {
            OneKeySignHelper oneKeySignHelper = copydefault;
            OneKeySDKError oneKeySDKErrorKWHzl = oneKeySignHelper.KWHzl(((eHO.Application) eho).copydefault());
            oneKeySignHelper.KWHzl((FragmentActivity) activity, oneKeySDKErrorKWHzl.getCode(), oneKeySDKErrorKWHzl.getMessage());
            interfaceC58184ywW.onNext(new ResponseData(-5007, null, null, null, null, null, 62, null));
        } else {
            if (!(eho instanceof eHO.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            copydefault.AEQbTJ(activity, C13754dXa.FragmentManager.PlaybackStateCompatApi22);
            interfaceC58184ywW.onNext(new ResponseData(-5007, null, null, null, null, null, 62, null));
        }
        interfaceC58184ywW.onComplete();
    }

    public static final void OLrzqt(CheckAndSignDialog checkAndSignDialog, Activity activity) {
        checkAndSignDialog.show(((FragmentActivity) activity).getSupportFragmentManager(), "HardwareWalletOneKeyTxStatusDialog");
    }

    public final void KWHzl(FragmentActivity fragmentActivity, String str, String str2) {
        if (Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.CallMethodNeedUpgradeFirmware.getCode()) || Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.NewFirmwareUnRelease.getCode()) || Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.NewFirmwareForceUpdate.getCode())) {
            AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.IResultReceiver);
            return;
        }
        if (Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.RuntimeError.getCode())) {
            if (StringsKt__StringsKt.AhwBna((CharSequence) str2, (CharSequence) "Failure_UnexpectedMessage", true)) {
                AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.IResultReceiver);
                return;
            } else {
                AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.PlaybackStateCompatState);
                return;
            }
        }
        if (Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.PinInvalid.getCode())) {
            AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.PlaybackStateCompatShuffleMode);
            return;
        }
        if (Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.PinCancelled.getCode()) || Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.ActionCancelled.getCode())) {
            AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.PlaybackStateCompatApi21);
            return;
        }
        if (Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.BluetoothError.getCode())) {
            AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.PlaybackStateCompatMediaKeyAction);
            return;
        }
        if (Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.SDKUnavailable.getCode())) {
            AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.send);
        } else if (Intrinsics.EZpvd((Object) str, (Object) OneKeySDKError.DeviceOpenedPassphrase.getCode())) {
            AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.IResultReceiverDefault);
        } else {
            AEQbTJ(fragmentActivity, C13754dXa.FragmentManager.PlaybackStateCompatState);
        }
    }

    public final void AEQbTJ(Context context, @StringRes int i) {
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55097xdX.setTitle(string);
        c55097xdX.setState(3);
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public final OneKeySDKError KWHzl(Throwable th) {
        if (th instanceof OneKeyException) {
            OneKeySDKError error = ((OneKeyException) th).getError();
            return error == null ? OneKeySDKError.UnknownError : error;
        }
        return OneKeySDKError.UnknownError;
    }
}
