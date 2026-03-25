package o;

import java.util.Objects;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lAA {
    public static com.okinc.okpaymentapi.data.remote.model.management.Channel AEQbTJ;
    public static com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd;
    public static final lAA KWHzl = new lAA();
    public static final int OLrzqt = 8;
    public static com.okinc.okpaymentapi.data.remote.model.management.Channel copydefault;
    public static com.okinc.okpaymentapi.data.remote.model.management.Channel djBIcL;

    private lAA() {
    }

    public final com.okinc.okpaymentapi.data.remote.model.management.Channel copydefault() {
        Objects.toString(copydefault);
        return copydefault;
    }

    public final com.okinc.okpaymentapi.data.remote.model.management.Channel OLrzqt() {
        Objects.toString(EZpvd);
        return EZpvd;
    }

    public final com.okinc.okpaymentapi.data.remote.model.management.Channel AEQbTJ() {
        Objects.toString(AEQbTJ);
        return AEQbTJ;
    }

    public final com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd() {
        Objects.toString(djBIcL);
        return djBIcL;
    }

    public final void AEQbTJ(boolean z, @NotNull java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list) {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel;
        Intrinsics.checkNotNullParameter(list, "");
        if (C31784mDu.AEQbTJ.copydefault() <= 0 || (channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            return;
        }
        java.util.List<java.lang.String> supportedTransactionType = channel.getSupportedTransactionType();
        if (supportedTransactionType != null && supportedTransactionType.contains("buy")) {
            if (z) {
                copydefault = channel;
                return;
            } else {
                EZpvd = channel;
                return;
            }
        }
        java.util.List<java.lang.String> supportedTransactionType2 = channel.getSupportedTransactionType();
        if (supportedTransactionType2 == null || !supportedTransactionType2.contains("sell")) {
            return;
        }
        if (z) {
            AEQbTJ = channel;
        } else {
            djBIcL = channel;
        }
    }
}
