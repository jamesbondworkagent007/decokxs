package o;

import com.okinc.wallet.hardware.api.onekey.OneKeyConnectedDevice;
import com.okinc.wallet.hardware.api.onekey.OneKeyDevice;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yas, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57040yas {
    public static final OneKeyConnectedDevice AEQbTJ(@NotNull OneKeyDevice oneKeyDevice, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(oneKeyDevice, "");
        return new OneKeyConnectedDevice(oneKeyDevice, str, str2, str3);
    }
}
