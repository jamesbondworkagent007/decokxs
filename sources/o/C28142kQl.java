package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.WalletTypeForReminder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28142kQl implements InterfaceC19780gPa, gOW {
    public final kKG AEQbTJ;

    @yCM
    public C28142kQl(@NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(kkg, "");
        this.AEQbTJ = kkg;
    }

    @Override // o.InterfaceC19780gPa
    public TradeReminderType copydefault(@NotNull BusinessType businessType) {
        Intrinsics.checkNotNullParameter(businessType, "");
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AEQbTJ.valueOf();
        if (interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.zsXlph()) {
            return TradeReminderType.ConnectWallet;
        }
        if (interfaceC9738bbJValueOf.QfsBiF()) {
            return TradeReminderType.WalletBusinessUnsupported;
        }
        if (interfaceC9738bbJValueOf.getFieldNames()) {
            return TradeReminderType.WalletBusinessUnsupported;
        }
        return TradeReminderType.None;
    }

    @Override // o.InterfaceC19780gPa
    public TradeReminderType EZpvd(java.lang.String str, @NotNull BusinessType businessType) {
        Intrinsics.checkNotNullParameter(businessType, "");
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AEQbTJ.valueOf();
        if (interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.zsXlph()) {
            return null;
        }
        if (!OLrzqt(interfaceC9738bbJValueOf, str)) {
            return TradeReminderType.WalletStatusAbnormal;
        }
        return TradeReminderType.None;
    }

    public final boolean OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str) {
        return interfaceC9738bbJ.gEmmrt(C33129mqd.valueOf(str)) && interfaceC9738bbJ.djSkpj();
    }

    @Override // o.gOW
    public java.lang.String OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AEQbTJ.valueOf();
        if (interfaceC9738bbJValueOf != null) {
            return interfaceC9738bbJValueOf.AkhnZx();
        }
        return null;
    }

    @Override // o.gOW
    public WalletTypeForReminder AEQbTJ() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AEQbTJ.valueOf();
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
}
