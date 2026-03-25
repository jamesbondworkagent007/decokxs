package com.okinc.okx.paymentapi.service;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import com.okinc.okpaymentapi.data.remote.model.experience.SubmitOrderResp;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.data.ResultType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC47246tmS;
import o.C47309tnc;
import o.InterfaceC43217rlC;
import o.InterfaceC47247tmT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface OKPaymentPlatformService extends InterfaceC43217rlC {
    void EZpvd(@NotNull Context context, @NotNull DynamicDepositWithdrawPageParameters dynamicDepositWithdrawPageParameters, ActivityResultLauncher<Intent> activityResultLauncher);

    void EZpvd(@NotNull Context context, @NotNull C47309tnc c47309tnc, @NotNull ResultType resultType);

    void KWHzl(@NotNull Context context, @NotNull AbstractC47246tmS abstractC47246tmS, TradeType tradeType, ActivityResultLauncher<Intent> activityResultLauncher, ChannelPlatformCode channelPlatformCode, SubmitOrderResp submitOrderResp, boolean z, EarnOption earnOption, OKPaymentSource oKPaymentSource, boolean z2);

    void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12);

    void OLrzqt(@NotNull Context context, @NotNull CurrencyPreviewPageParameters currencyPreviewPageParameters);

    void OLrzqt(@NotNull Context context, @NotNull String str, @NotNull String str2, String str3);

    void OLrzqt(ResultType.ResultButtonActionType resultButtonActionType, @NotNull Context context, @NotNull TradeType tradeType);

    void copydefault(@NotNull Context context, @NotNull BuySellCryptoListParameters buySellCryptoListParameters, Function1<? super InterfaceC47247tmT, Unit> function1, Integer num);

    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okx.paymentapi.service.OKPaymentPlatformService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startInternalDynamicDWPage$default(OKPaymentPlatformService oKPaymentPlatformService, Context context, DynamicDepositWithdrawPageParameters dynamicDepositWithdrawPageParameters, ActivityResultLauncher activityResultLauncher, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startInternalDynamicDWPage");
            }
            if ((i & 4) != 0) {
                activityResultLauncher = null;
            }
            oKPaymentPlatformService.EZpvd(context, dynamicDepositWithdrawPageParameters, (ActivityResultLauncher<Intent>) activityResultLauncher);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.okx.paymentapi.service.OKPaymentPlatformService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startInternalBuySellCryptoList$default(OKPaymentPlatformService oKPaymentPlatformService, Context context, BuySellCryptoListParameters buySellCryptoListParameters, Function1 function1, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startInternalBuySellCryptoList");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            oKPaymentPlatformService.copydefault(context, buySellCryptoListParameters, function1, num);
        }

        public static /* synthetic */ void handleResultScreenButtonClick$default(OKPaymentPlatformService oKPaymentPlatformService, ResultType.ResultButtonActionType resultButtonActionType, Context context, TradeType tradeType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleResultScreenButtonClick");
            }
            if ((i & 4) != 0) {
                tradeType = TradeType.BUY;
            }
            oKPaymentPlatformService.OLrzqt(resultButtonActionType, context, tradeType);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.okinc.okx.paymentapi.service.OKPaymentPlatformService */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startPaymentDeeplinkPage$default(OKPaymentPlatformService oKPaymentPlatformService, Context context, AbstractC47246tmS abstractC47246tmS, TradeType tradeType, ActivityResultLauncher activityResultLauncher, ChannelPlatformCode channelPlatformCode, SubmitOrderResp submitOrderResp, boolean z, EarnOption earnOption, OKPaymentSource oKPaymentSource, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPaymentDeeplinkPage");
            }
            oKPaymentPlatformService.KWHzl(context, abstractC47246tmS, (i & 4) != 0 ? null : tradeType, (i & 8) != 0 ? null : activityResultLauncher, (i & 16) != 0 ? null : channelPlatformCode, (i & 32) != 0 ? null : submitOrderResp, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : earnOption, (i & 256) != 0 ? null : oKPaymentSource, (i & 512) != 0 ? false : z2);
        }

        public static /* synthetic */ void startBanContactDeeplinkPage$default(OKPaymentPlatformService oKPaymentPlatformService, Context context, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startBanContactDeeplinkPage");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            oKPaymentPlatformService.OLrzqt(context, str, str2, str3);
        }

        public static /* synthetic */ void trackPaymentsEvent$default(OKPaymentPlatformService oKPaymentPlatformService, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackPaymentsEvent");
            }
            oKPaymentPlatformService.KWHzl((i & 1) != 0 ? "" : str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class DynamicBossParameters implements Parcelable {
        public static final Parcelable.Creator<DynamicBossParameters> CREATOR = new Creator();
        public final String AEQbTJ;
        public final TradeType EZpvd;

        public static final class Creator implements Parcelable.Creator<DynamicBossParameters> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DynamicBossParameters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DynamicBossParameters(parcel.readString(), TradeType.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DynamicBossParameters[] newArray(int i) {
                return new DynamicBossParameters[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DynamicBossParameters copy$default(DynamicBossParameters dynamicBossParameters, String str, TradeType tradeType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dynamicBossParameters.AEQbTJ;
            }
            if ((i & 2) != 0) {
                tradeType = dynamicBossParameters.EZpvd;
            }
            return dynamicBossParameters.EZpvd(str, tradeType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DynamicBossParameters EZpvd(@NotNull String str, @NotNull TradeType tradeType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tradeType, "");
            return new DynamicBossParameters(str, tradeType);
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
            if (!(obj instanceof DynamicBossParameters)) {
                return false;
            }
            DynamicBossParameters dynamicBossParameters = (DynamicBossParameters) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dynamicBossParameters.AEQbTJ) && this.EZpvd == dynamicBossParameters.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DynamicBossParameters(rawTemplate=" + this.AEQbTJ + ", tradeType=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            this.EZpvd.writeToParcel(parcel, i);
        }

        public DynamicBossParameters(@NotNull String str, @NotNull TradeType tradeType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tradeType, "");
            this.AEQbTJ = str;
            this.EZpvd = tradeType;
        }
    }
}
