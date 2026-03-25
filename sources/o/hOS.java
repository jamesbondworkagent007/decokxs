package o;

import com.okinc.business.dex.api.bean.TokenBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hOS {
    public static final hOS KWHzl = new hOS();

    private hOS() {
    }

    public static /* synthetic */ void showCreateWallet$default(hOS hos, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC19677gLf = null;
        }
        if ((i & 8) != 0) {
            interfaceC19674gLc = null;
        }
        hos.EZpvd(fragmentManager, context, interfaceC19677gLf, interfaceC19674gLc);
    }

    public final void EZpvd(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final android.content.Context context, InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc) {
        boolean zKWHzl;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (interfaceC19674gLc != null) {
            zKWHzl = interfaceC19674gLc.KWHzl();
        } else {
            zKWHzl = C19675gLd.OLrzqt.KWHzl();
        }
        if (!zKWHzl) {
            EZpvd(fragmentManager, context);
            return;
        }
        if (interfaceC19677gLf != null) {
            interfaceC19677gLf.OLrzqt(context, new Function0() { // from class: o.hPe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.AEQbTJ(fragmentManager, context);
                }
            }, new Function0() { // from class: o.hPd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.AYXKKw();
                }
            });
            return;
        }
        C19675gLd c19675gLd = C19675gLd.OLrzqt;
        if (c19675gLd.copydefault()) {
            c19675gLd.EZpvd(context, new Function0() { // from class: o.hPa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.OLrzqt(fragmentManager, context);
                }
            }, new Function0() { // from class: o.hPb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.djBIcL();
                }
            });
        } else {
            EZpvd(fragmentManager, context);
        }
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context) {
        KWHzl.EZpvd(fragmentManager, context);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context) {
        KWHzl.EZpvd(fragmentManager, context);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public final void EZpvd(androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context) {
        ((xWO) C43251rlk.copydefault(xWO.class)).EZpvd(fragmentManager, context, new Function1() { // from class: o.hOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hOS.OLrzqt(((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(boolean z) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void goDetailPage$default(hOS hos, android.app.Activity activity, TokenBase tokenBase, boolean z, InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        hos.KWHzl(activity, tokenBase, z, (i & 8) != 0 ? null : interfaceC19677gLf, (i & 16) != 0 ? null : interfaceC19674gLc);
    }

    public final void KWHzl(@NotNull final android.app.Activity activity, final TokenBase tokenBase, final boolean z, InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc) {
        boolean zKWHzl;
        Intrinsics.checkNotNullParameter(activity, "");
        if (interfaceC19674gLc != null) {
            zKWHzl = interfaceC19674gLc.KWHzl();
        } else {
            zKWHzl = C19675gLd.OLrzqt.KWHzl();
        }
        if (!zKWHzl) {
            copydefault(activity, tokenBase, z);
            return;
        }
        if (interfaceC19677gLf != null) {
            interfaceC19677gLf.OLrzqt(activity, new Function0() { // from class: o.hOW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.AEQbTJ(activity, tokenBase, z);
                }
            }, new Function0() { // from class: o.hOX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.copydefault();
                }
            });
            return;
        }
        C19675gLd c19675gLd = C19675gLd.OLrzqt;
        if (c19675gLd.copydefault()) {
            c19675gLd.EZpvd(activity, new Function0() { // from class: o.hOZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.EZpvd(activity, tokenBase, z);
                }
            }, new Function0() { // from class: o.hOY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return hOS.AhwBna();
                }
            });
        } else {
            copydefault(activity, tokenBase, z);
        }
    }

    public static final Unit AEQbTJ(android.app.Activity activity, TokenBase tokenBase, boolean z) {
        KWHzl.copydefault(activity, tokenBase, z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.app.Activity activity, TokenBase tokenBase, boolean z) {
        KWHzl.copydefault(activity, tokenBase, z);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull android.app.Activity activity, TokenBase tokenBase, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        java.lang.String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String chainName = tokenBase != null ? tokenBase.getChainName() : null;
        java.lang.String str2 = chainName == null ? "" : chainName;
        java.lang.String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        java.lang.String str3 = tokenContractAddress == null ? "" : tokenContractAddress;
        java.lang.String tokenLogoUrl = tokenBase != null ? tokenBase.getTokenLogoUrl() : null;
        java.lang.String str4 = tokenLogoUrl == null ? "" : tokenLogoUrl;
        java.lang.String chainLogoUrl = tokenBase != null ? tokenBase.getChainLogoUrl() : null;
        java.lang.String str5 = chainLogoUrl == null ? "" : chainLogoUrl;
        java.lang.String tokenSymbol = tokenBase != null ? tokenBase.getTokenSymbol() : null;
        java.lang.String str6 = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String tokenName = tokenBase != null ? tokenBase.getTokenName() : null;
        gko.EZpvd(activity, new TokenBase(str, str3, str4, str5, null, str6, tokenName == null ? "" : tokenName, 0, 0, 0, 0, null, "cefi_trade", null, null, str2, null, 0, 0, false, null, null, z, false, null, null, null, 0, false, null, null, false, -4231280, null));
    }
}
