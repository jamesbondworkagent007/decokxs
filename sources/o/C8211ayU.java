package o;

import com.okinc.account.api.model.security.otp.Otp;
import com.okinc.auth.impl.data.repository.OtpRepository$requestEmailOtpForForgetPasswordRebind2fa$1;
import com.okinc.auth.impl.data.repository.OtpRepository$requestEmailOtpForRebind2fa$1;
import com.okinc.auth.impl.data.repository.OtpRepository$requestPhoneOtpForForgetRebind2fa$1;
import com.okinc.auth.impl.data.repository.OtpRepository$requestPhoneOtpForRebind2fa$1;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8211ayU {
    public final Reset2faRemoteDataSource copydefault;

    @yCM
    public C8211ayU(@NotNull Reset2faRemoteDataSource reset2faRemoteDataSource) {
        Intrinsics.checkNotNullParameter(reset2faRemoteDataSource, "");
        this.copydefault = reset2faRemoteDataSource;
    }

    public final Flow<Otp> KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, java.lang.String str4, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return FlowKt.flowOn(FlowKt.flow(new OtpRepository$requestPhoneOtpForRebind2fa$1(this, subdomainStrategy, i, str, str2, str3, i2, str4, null)), Dispatchers.getIO());
    }

    public final Flow<Otp> EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, java.lang.String str4, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return FlowKt.flowOn(FlowKt.flow(new OtpRepository$requestPhoneOtpForForgetRebind2fa$1(this, subdomainStrategy, i, str, str2, str3, i2, str4, null)), Dispatchers.getIO());
    }

    public static /* synthetic */ Flow requestEmailOtpForRebind2fa$default(C8211ayU c8211ayU, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c8211ayU.AEQbTJ(i, str, str2, str3, subdomainStrategy);
    }

    public final Flow<Otp> AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FlowKt.flowOn(FlowKt.flow(new OtpRepository$requestEmailOtpForRebind2fa$1(this, subdomainStrategy, i, str, str2, str3, null)), Dispatchers.getIO());
    }

    public static /* synthetic */ Flow requestEmailOtpForForgetPasswordRebind2fa$default(C8211ayU c8211ayU, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c8211ayU.OLrzqt(i, str, str2, str3, subdomainStrategy);
    }

    public final Flow<Otp> OLrzqt(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FlowKt.flowOn(FlowKt.flow(new OtpRepository$requestEmailOtpForForgetPasswordRebind2fa$1(this, subdomainStrategy, i, str, str2, str3, null)), Dispatchers.getIO());
    }
}
