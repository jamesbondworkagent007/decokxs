package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.SaUiReminder;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.WalletTypeForReminder;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.gLQ;
import o.gOT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gOV implements InterfaceC19780gPa, gOW {
    public final Function0<MpcWalletService.MpcWalletAbleStatus> EZpvd;
    public final java.lang.String copydefault;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends com.okinc.wallet.api.MpcWalletService$MpcWalletAbleStatus> */
    /* JADX WARN: Multi-variable type inference failed */
    public gOV(@NotNull java.lang.String str, Function0<? extends MpcWalletService.MpcWalletAbleStatus> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.EZpvd = function0;
    }

    @Override // o.InterfaceC19780gPa
    public TradeReminderType copydefault(@NotNull BusinessType businessType) {
        Intrinsics.checkNotNullParameter(businessType, "");
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.copydefault).fARcdN().valueOf();
        if (interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.zsXlph()) {
            return TradeReminderType.ConnectWallet;
        }
        if (interfaceC9738bbJValueOf.QfsBiF()) {
            return TradeReminderType.WalletBusinessUnsupported;
        }
        if (interfaceC9738bbJValueOf.getFieldNames()) {
            return TradeReminderType.WalletBusinessUnsupported;
        }
        if (interfaceC9738bbJValueOf.ORxRYg()) {
            return TradeReminderType.None;
        }
        return TradeReminderType.None;
    }

    @Override // o.InterfaceC19780gPa
    public TradeReminderType EZpvd(java.lang.String str, @NotNull BusinessType businessType) {
        Intrinsics.checkNotNullParameter(businessType, "");
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = c22380heK.copydefault(this.copydefault).fARcdN().valueOf();
        if (interfaceC9738bbJValueOf == null || str == null) {
            return null;
        }
        if (interfaceC9738bbJValueOf.ORxRYg()) {
            if (!c22380heK.copydefault(this.copydefault).fARcdN().OLrzqt(interfaceC9738bbJValueOf, str, true)) {
                return TradeReminderType.WalletStatusAbnormal;
            }
            Function0<MpcWalletService.MpcWalletAbleStatus> function0 = this.EZpvd;
            MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatusInvoke = function0 != null ? function0.invoke() : null;
            switch (mpcWalletAbleStatusInvoke == null ? -1 : Application.OLrzqt[mpcWalletAbleStatusInvoke.ordinal()]) {
                case 1:
                    return TradeReminderType.WalletMPCAccountInUse;
                case 2:
                case 3:
                    return TradeReminderType.WalletMPCAuthenticateAccount;
                case 4:
                    return TradeReminderType.WalletMPCWalletHacked;
                case 5:
                    return TradeReminderType.WalletMPCAccountFrozen;
                case 6:
                    return TradeReminderType.WalletMPCAccountDeleted;
                default:
                    return TradeReminderType.None;
            }
        }
        if (!c22380heK.copydefault(this.copydefault).fARcdN().OLrzqt(interfaceC9738bbJValueOf, str, true)) {
            return TradeReminderType.WalletStatusAbnormal;
        }
        return TradeReminderType.None;
    }

    @Override // o.gOW
    public java.lang.String OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.copydefault).fARcdN().valueOf();
        if (interfaceC9738bbJValueOf != null) {
            return interfaceC9738bbJValueOf.AkhnZx();
        }
        return null;
    }

    @Override // o.gOW
    public WalletTypeForReminder AEQbTJ() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.copydefault).fARcdN().valueOf();
        if (interfaceC9738bbJValueOf == null) {
            return null;
        }
        if (interfaceC9738bbJValueOf.gHZMYf()) {
            return WalletTypeForReminder.Hardware;
        }
        if (interfaceC9738bbJValueOf.ORxRYg()) {
            return WalletTypeForReminder.MPC;
        }
        if (interfaceC9738bbJValueOf.getFieldNames()) {
            return WalletTypeForReminder.AA;
        }
        if (interfaceC9738bbJValueOf.AubY() || interfaceC9738bbJValueOf.AwvSrB()) {
            return WalletTypeForReminder.PrivateKey;
        }
        return null;
    }

    public static final class ActionBar implements gOT {
        @Override // o.gOT
        public TradeReminderType AEQbTJ(gLQ glq, java.lang.String str) {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.gOT
        public SaUiReminder EZpvd(@NotNull TradeReminderType tradeReminderType, gLQ glq) {
            Intrinsics.checkNotNullParameter(tradeReminderType, "");
            return null;
        }

        @Override // o.gOT
        public TradeReminderType EZpvd(gLQ glq) {
            return null;
        }

        @Override // o.gOT
        public TradeReminderType OLrzqt(gLQ glq) {
            return null;
        }

        @Override // o.gOT
        public boolean KWHzl() {
            return gOT.Application.EZpvd(this);
        }

        @Override // o.gOT
        public long OLrzqt() {
            return gOT.Application.KWHzl(this);
        }

        @Override // o.gOT
        public gLQ KWHzl(java.lang.String str) {
            return gLQ.TaskDescription.copydefault;
        }
    }
}
