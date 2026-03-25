package o;

import com.okinc.account.api.model.security.otp.TwoFactorAuth;
import com.okinc.auth.impl.reset2fa.data.datasource.Reset2faRemoteDataSource;
import com.okinc.auth.impl.twofactorauth.data.repository.TwoFactorAuthRepository$submitNonAuthRebind2fa$1;
import com.okinc.auth.impl.twofactorauth.data.repository.TwoFactorAuthRepository$submitRebind2fa$1;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aTY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6660aTY {
    public final Reset2faRemoteDataSource AEQbTJ;
    public final C6658aTW OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C6660aTY(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Reset2faRemoteDataSource reset2faRemoteDataSource, @NotNull C6658aTW c6658aTW) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(reset2faRemoteDataSource, "");
        Intrinsics.checkNotNullParameter(c6658aTW, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = reset2faRemoteDataSource;
        this.OLrzqt = c6658aTW;
    }

    public final Flow<TwoFactorAuth<java.lang.Object>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return FlowKt.flowOn(FlowKt.flow(new TwoFactorAuthRepository$submitRebind2fa$1(this, subdomainStrategy, str, str3, str4, str6, str2, str5, null)), this.copydefault);
    }

    public final Flow<TwoFactorAuth<java.lang.Object>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, SubdomainStrategy subdomainStrategy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return FlowKt.flowOn(FlowKt.flow(new TwoFactorAuthRepository$submitNonAuthRebind2fa$1(this, subdomainStrategy, str, str2, str3, str4, str5, str6, str7, str8, null)), this.copydefault);
    }
}
