package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import com.okinc.business.defi.wallet.mine.walletbind.utils.WalletBindResultDeeplinkMetaData$executeDeeplink$1;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC54840xXg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fAB implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC43233rlS.OLrzqt(), (java.lang.Object) "wallet/cedefi/bindresult")) {
            if (C34703nhO.copydefault()) {
                java.lang.Object obj = map.get("result");
                java.lang.Object obj2 = map.get("intention");
                if (Intrinsics.EZpvd(obj2, (java.lang.Object) "wallet_management")) {
                    if (Intrinsics.EZpvd(obj, (java.lang.Object) OtpEventTracker.OTP_EVENT_VALUE_CANCEL)) {
                        return;
                    }
                    C17304fAj.EZpvd.OLrzqt(context, Intrinsics.EZpvd(obj, (java.lang.Object) "success"));
                    return;
                }
                if (Intrinsics.EZpvd(obj2, (java.lang.Object) "wallet_withdraw")) {
                    if (Intrinsics.EZpvd(obj, (java.lang.Object) OtpEventTracker.OTP_EVENT_VALUE_CANCEL)) {
                        return;
                    }
                    C17304fAj.EZpvd.AEQbTJ(context);
                    return;
                } else {
                    if (Intrinsics.EZpvd(obj2, (java.lang.Object) "wallet_general")) {
                        if (Intrinsics.EZpvd(obj, (java.lang.Object) "success")) {
                            java.lang.Object obj3 = map.get("uid");
                            java.lang.String string = obj3 != null ? obj3.toString() : null;
                            RxBus.AEQbTJ(new xWW(new AbstractC54840xXg.PictureInPictureParams(string != null ? string : "")));
                            C7323ahf.KWHzl().AEQbTJ("LUA_WALLET_BIND_RESULT_EVENT", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("APP_TYPE", "wallet"), C56390yDp.OLrzqt("RESULT", "success"), C56390yDp.OLrzqt("UID", string)));
                            return;
                        }
                        if (Intrinsics.EZpvd(obj, (java.lang.Object) OtpEventTracker.OTP_EVENT_VALUE_CANCEL)) {
                            RxBus.AEQbTJ(new xWW(AbstractC54840xXg.VoiceInteractor.KWHzl));
                            C7323ahf.KWHzl().AEQbTJ("LUA_WALLET_BIND_RESULT_EVENT", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("APP_TYPE", "wallet"), C56390yDp.OLrzqt("RESULT", "fail")));
                            return;
                        } else {
                            RxBus.AEQbTJ(new xWW(AbstractC54840xXg.TaskStackBuilder.AEQbTJ));
                            C7323ahf.KWHzl().AEQbTJ("LUA_WALLET_BIND_RESULT_EVENT", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("APP_TYPE", "wallet"), C56390yDp.OLrzqt("RESULT", "fail")));
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC43233rlS.OLrzqt(), (java.lang.Object) "wallet/cedefi/startbind") && C34703nhO.copydefault()) {
            java.lang.Object obj4 = map.get("intention");
            java.lang.Object obj5 = map.get("nonce");
            java.lang.Object obj6 = map.get("package");
            java.lang.Object obj7 = map.get("chainIndex");
            Intention intentionCopydefault = Intention.Companion.copydefault(java.lang.String.valueOf(obj4));
            if (intentionCopydefault != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new WalletBindResultDeeplinkMetaData$executeDeeplink$1(new C19330fzJ(), obj6, intentionCopydefault, obj5, obj7, obj4, context, null), 3, null);
                return;
            }
            C19339fzS.EZpvd.OLrzqt("[OKX APP-Bind Wallet]", "intention is null from: " + interfaceC43233rlS + ".path");
        }
    }
}
