package o;

import com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignAccountInfo;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneAccountsResp;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneSignResp;
import com.okinc.wallet.hardware.api.keystone.RSV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57029yah extends InterfaceC43217rlC {
    ParseKeystoneSignResp EZpvd(long j, @NotNull java.lang.String str);

    RSV EZpvd(@NotNull java.lang.String str);

    AbstractC58185ywX<java.lang.String> KWHzl(@NotNull KeystoneSignAccountInfo keystoneSignAccountInfo, @NotNull KeystoneEvmSignType keystoneEvmSignType, @NotNull java.lang.String str);

    ParseKeystoneAccountsResp OLrzqt(@NotNull java.lang.String str);

    AbstractC58185ywX<java.lang.String> copydefault(@NotNull KeystoneSignAccountInfo keystoneSignAccountInfo, @NotNull java.lang.String str);

    AbstractC58185ywX<java.lang.String> copydefault(@NotNull java.lang.String str);
}
