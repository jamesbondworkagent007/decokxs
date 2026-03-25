package o;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19329fzI {
    public final C19330fzJ EZpvd;

    @yCM
    public C19329fzI(@NotNull C19330fzJ c19330fzJ) {
        Intrinsics.checkNotNullParameter(c19330fzJ, "");
        this.EZpvd = c19330fzJ;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Intention intention) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(intention, "");
        java.lang.String str3 = intention == Intention.WALLET_MANAGEMENT ? "exchange/cedefi/startbind?" : "exchange/cedefi/asset/withdraw?";
        C17304fAj c17304fAj = C17304fAj.EZpvd;
        java.lang.String str4 = c17304fAj.copydefault(str) + str3 + "token=" + str2 + "&intention=" + intention.getValue() + "&package=" + c17304fAj.AkhnZx() + "}";
        C19339fzS.EZpvd.OLrzqt("[Get Deeplink]", "get deeplink succeed,deeplink=" + str4);
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(str4);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Intention intention, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(intention, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C17304fAj c17304fAj = C17304fAj.EZpvd;
        java.lang.String str4 = c17304fAj.copydefault(str) + "exchange/cedefi/confirmbind?encrypted=" + str2 + "&intention=" + intention.getValue() + "&package=" + c17304fAj.AkhnZx() + "&verifyAppToken=" + str3;
        C19339fzS.EZpvd.OLrzqt("[Get Deeplink]", "get deeplink succeed,deeplink=" + str4);
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(str4);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Intention intention) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(intention, "");
        C17304fAj c17304fAj = C17304fAj.EZpvd;
        java.lang.String str2 = c17304fAj.copydefault(str) + "exchange/cedefi/bindredirect?intention=" + intention.getValue() + "&package=" + c17304fAj.AkhnZx();
        C19339fzS.EZpvd.OLrzqt("[Get Deeplink]", "get deeplink succeed,deeplink=" + str2);
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(str2);
    }
}
