package com.okinc.account.api.model.wallet;

import com.okinc.account.api.model.wallet.BindWalletDeeplinkMetadata;
import com.okinc.account.api.model.wallet.BindWalletInput;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class BindWalletForWalletAppKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BindWalletDeeplinkMetadata.Intention.values().length];
            try {
                iArr[BindWalletDeeplinkMetadata.Intention.WALLET_MANAGEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BindWalletDeeplinkMetadata.Intention.WALLET_GENERAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BindWalletDeeplinkMetadata.Intention.WALLET_WITHDRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BindWalletDeeplinkMetadata.Intention.EXCHANGE_MANAGEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BindWalletDeeplinkMetadata.Intention.EXCHANGE_WITHDRAW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BindWalletInput.EntryPoint.values().length];
            try {
                iArr2[BindWalletInput.EntryPoint.WALLET_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BindWalletInput.EntryPoint.WALLET_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BindWalletInput.EntryPoint.CEFI_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BindWalletInput.EntryPoint.CEFI_WITHDRAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BindWalletInput.EntryPoint.INVITE_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BindWalletInput.EntryPoint.AFFILIATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BindWalletInput.EntryPoint toBindFlowEntryPoint(@NotNull BindWalletDeeplinkMetadata.Intention intention) {
        Intrinsics.checkNotNullParameter(intention, "");
        int i = WhenMappings.$EnumSwitchMapping$0[intention.ordinal()];
        if (i == 1) {
            return BindWalletInput.EntryPoint.WALLET_DEFAULT;
        }
        if (i == 2) {
            return BindWalletInput.EntryPoint.WALLET_DEFAULT;
        }
        if (i == 3) {
            return BindWalletInput.EntryPoint.WALLET_DEPOSIT;
        }
        if (i == 4) {
            return BindWalletInput.EntryPoint.CEFI_DEFAULT;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return BindWalletInput.EntryPoint.CEFI_WITHDRAW;
    }

    public static final BindWalletDeeplinkMetadata.Intention toIntention(@NotNull BindWalletInput.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "");
        switch (WhenMappings.$EnumSwitchMapping$1[entryPoint.ordinal()]) {
            case 1:
                return BindWalletDeeplinkMetadata.Intention.WALLET_MANAGEMENT;
            case 2:
                return BindWalletDeeplinkMetadata.Intention.WALLET_WITHDRAW;
            case 3:
                return BindWalletDeeplinkMetadata.Intention.EXCHANGE_MANAGEMENT;
            case 4:
                return BindWalletDeeplinkMetadata.Intention.EXCHANGE_WITHDRAW;
            case 5:
                return BindWalletDeeplinkMetadata.Intention.EXCHANGE_MANAGEMENT;
            case 6:
                return BindWalletDeeplinkMetadata.Intention.EXCHANGE_MANAGEMENT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
