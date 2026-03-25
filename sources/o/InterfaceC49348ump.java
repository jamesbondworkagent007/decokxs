package o;

import android.graphics.Bitmap;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.share.api.RedirectBehavior;
import com.okinc.share.bean.LayoutType;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.view.FootViewTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48894ueL;
import o.C48931uew;
import o.InterfaceC49348ump;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ump, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49348ump extends InterfaceC48895ueM {
    android.widget.TextView AYXKKw();

    C6995aZr AhwBna();

    @Override // o.InterfaceC48895ueM
    void KWHzl(LifecycleOwner lifecycleOwner, java.lang.String str, @NotNull C48891ueI c48891ueI, @NotNull Function1<? super C48887ueE, Unit> function1);

    @Override // o.InterfaceC48895ueM
    java.lang.String OLrzqt();

    android.widget.ImageView djBIcL();

    void setIconInternal(android.graphics.drawable.Drawable drawable);

    void setQRCodeInternal(java.lang.String str, boolean z);

    void setSubTitleInternal(java.lang.CharSequence charSequence);

    void setTitleInternal(java.lang.CharSequence charSequence);

    android.widget.TextView valueOf();

    /* JADX INFO: renamed from: o.ump$ActionBar */
    public static final class ActionBar {
        public static void KWHzl(@NotNull InterfaceC49348ump interfaceC49348ump, android.graphics.drawable.Drawable drawable) {
            interfaceC49348ump.setIconInternal(drawable);
        }

        public static void copydefault(@NotNull InterfaceC49348ump interfaceC49348ump, java.lang.CharSequence charSequence) {
            interfaceC49348ump.setTitleInternal(charSequence);
        }

        public static void EZpvd(@NotNull InterfaceC49348ump interfaceC49348ump, android.graphics.drawable.Drawable drawable) {
            android.widget.ImageView imageViewDjBIcL = interfaceC49348ump.djBIcL();
            if (imageViewDjBIcL != null) {
                imageViewDjBIcL.setImageDrawable(drawable);
            }
            android.widget.ImageView imageViewDjBIcL2 = interfaceC49348ump.djBIcL();
            if (imageViewDjBIcL2 != null) {
                imageViewDjBIcL2.setVisibility(drawable != null ? 0 : 8);
            }
        }

        public static void OLrzqt(@NotNull InterfaceC49348ump interfaceC49348ump, java.lang.CharSequence charSequence) {
            android.widget.TextView textViewValueOf = interfaceC49348ump.valueOf();
            if (textViewValueOf != null) {
                textViewValueOf.setText(charSequence);
            }
            android.widget.TextView textViewValueOf2 = interfaceC49348ump.valueOf();
            if (textViewValueOf2 != null) {
                textViewValueOf2.setVisibility((charSequence == null || charSequence.length() == 0) ^ true ? 0 : 8);
            }
        }

        public static void AEQbTJ(@NotNull InterfaceC49348ump interfaceC49348ump, java.lang.CharSequence charSequence) {
            interfaceC49348ump.setSubTitleInternal(charSequence);
        }

        public static void EZpvd(@NotNull InterfaceC49348ump interfaceC49348ump, java.lang.CharSequence charSequence) {
            android.widget.TextView textViewAYXKKw = interfaceC49348ump.AYXKKw();
            if (textViewAYXKKw != null) {
                textViewAYXKKw.setText(charSequence);
            }
            android.widget.TextView textViewAYXKKw2 = interfaceC49348ump.AYXKKw();
            if (textViewAYXKKw2 != null) {
                textViewAYXKKw2.setVisibility((charSequence == null || charSequence.length() == 0) ^ true ? 0 : 8);
            }
        }

        public static void AEQbTJ(@NotNull InterfaceC49348ump interfaceC49348ump, java.lang.String str, boolean z) {
            float fKWHzl = C33570myu.KWHzl(C32979mnm.EZpvd.OLrzqt(), 4.0f);
            if (android.text.TextUtils.isEmpty(str) || !z) {
                C6995aZr c6995aZrAhwBna = interfaceC49348ump.AhwBna();
                if (c6995aZrAhwBna != null) {
                    c6995aZrAhwBna.setVisibility(8);
                }
                C6995aZr c6995aZrAhwBna2 = interfaceC49348ump.AhwBna();
                if (c6995aZrAhwBna2 != null) {
                    c6995aZrAhwBna2.setContent(str, false, fKWHzl);
                }
                pUU.KWHzl("FootView", "FootView->setQRCode->GONE qrcode:" + str);
                return;
            }
            C6995aZr c6995aZrAhwBna3 = interfaceC49348ump.AhwBna();
            if (c6995aZrAhwBna3 != null) {
                c6995aZrAhwBna3.setVisibility(0);
            }
            C6995aZr c6995aZrAhwBna4 = interfaceC49348ump.AhwBna();
            if (c6995aZrAhwBna4 != null) {
                FootViewTheme footViewThemeCopydefault = interfaceC49348ump.copydefault();
                FootViewTheme footViewTheme = FootViewTheme.FIXED_VIP;
                if (footViewThemeCopydefault == footViewTheme) {
                    c6995aZrAhwBna4.setBackground(ContextCompat.getDrawable(c6995aZrAhwBna4.getContext(), C48931uew.TaskDescription.KWHzl));
                    C6995aZr.setContent$default(c6995aZrAhwBna4, (java.lang.String) null, false, 0.0f, 6, (java.lang.Object) null);
                    c6995aZrAhwBna4.setContent(str, false, Bitmap.Config.ARGB_8888, ContextCompat.getColor(c6995aZrAhwBna4.getContext(), C48894ueL.TaskDescription.DbNXlk), 0);
                    pUU.KWHzl("FootView", "FootView->VISIBLE->setQRCode->theme:" + footViewTheme);
                    return;
                }
                c6995aZrAhwBna4.setBackground(ContextCompat.getDrawable(c6995aZrAhwBna4.getContext(), C48931uew.TaskDescription.EZpvd));
                C6995aZr.setContent$default(c6995aZrAhwBna4, (java.lang.String) null, false, 0.0f, 6, (java.lang.Object) null);
                c6995aZrAhwBna4.setContent(str, false, fKWHzl);
                pUU.KWHzl("FootView", "FootView->VISIBLE->setQRCode->theme:" + footViewThemeCopydefault);
            }
        }

        public static java.lang.String AEQbTJ(@NotNull InterfaceC49348ump interfaceC49348ump) {
            C6995aZr c6995aZrAhwBna = interfaceC49348ump.AhwBna();
            if (c6995aZrAhwBna != null) {
                return c6995aZrAhwBna.OLrzqt();
            }
            return null;
        }

        public static void EZpvd(@NotNull InterfaceC49348ump interfaceC49348ump, @NotNull java.lang.String str, @NotNull final Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                str = interfaceC49348ump.AEQbTJ();
            }
            interfaceC49348ump.KWHzl(null, null, new C48891ueI(str, null, false, android.text.TextUtils.equals(((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).DTwDnp().djBIcL(), interfaceC49348ump.OLrzqt()) ? RedirectBehavior.DIRECT_GOTO_BIZ_PAGE : RedirectBehavior.DEFAULT_ALLOW_DEEPLINK, null), new Function1() { // from class: o.umo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC49348ump.ActionBar.EZpvd(function0, (C48887ueE) obj);
                }
            });
        }

        public static Unit EZpvd(Function0 function0, C48887ueE c48887ueE) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static void AEQbTJ(@NotNull final InterfaceC49348ump interfaceC49348ump, LifecycleOwner lifecycleOwner, java.lang.String str, @NotNull C48891ueI c48891ueI, @NotNull final Function1<? super C48887ueE, Unit> function1) {
            Intrinsics.checkNotNullParameter(c48891ueI, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (C49004ugP.OLrzqt.EZpvd().isUserInDemoTrading()) {
                pUU.KWHzl("OKShare", "FootView->createAndSetShortLinkToQRCode-> isUserInDemoTrading, skip->");
                function1.invoke(null);
                return;
            }
            java.lang.String strOLrzqt = interfaceC49348ump.OLrzqt();
            java.lang.String str2 = str == null ? strOLrzqt : str;
            if (str2 != null && str2.length() != 0) {
                java.lang.String strCopydefault = c48891ueI.copydefault();
                if (strCopydefault == null || strCopydefault.length() == 0) {
                    c48891ueI.AEQbTJ(interfaceC49348ump.AEQbTJ());
                }
                final InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
                pUU.KWHzl("OKShare", "FootView->createAndSetShortLinkToQRCode-> params:" + c48891ueI);
                AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(str2, c48891ueI);
                if (lifecycleOwner != null) {
                    C58156yvv.OLrzqt(abstractC58185ywXAEQbTJ, lifecycleOwner, Lifecycle.Event.ON_DESTROY);
                }
                final Function1 function12 = new Function1() { // from class: o.umr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InterfaceC49348ump.ActionBar.OLrzqt(interfaceC49348ump, interfaceC48893ueK, function1, (C48887ueE) obj);
                    }
                };
                InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.umq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        InterfaceC49348ump.ActionBar.copydefault(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.ums
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InterfaceC49348ump.ActionBar.AEQbTJ(function1, (java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.umu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        InterfaceC49348ump.ActionBar.KWHzl(function13, obj);
                    }
                });
                return;
            }
            pUU.copydefault("OKShare", "FootView->createAndSetShortLinkToQRCode-> empty original link, qrcode:" + strOLrzqt + " originalLink:" + str);
            function1.invoke(null);
        }

        public static void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static Unit OLrzqt(InterfaceC49348ump interfaceC49348ump, InterfaceC48893ueK interfaceC48893ueK, Function1 function1, C48887ueE c48887ueE) {
            pUU.KWHzl("OKShare", "FootView->createAndSetShortLinkToQRCode-> shortLink:" + c48887ueE.OLrzqt() + " fullLink:" + c48887ueE.EZpvd());
            java.lang.String strOLrzqt = c48887ueE.OLrzqt();
            if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
                interfaceC49348ump.setQRCodeInternal(C49292ulm.EZpvd.KWHzl(strOLrzqt), true);
            } else {
                LayoutType layoutTypeAEQbTJ = ShareFooterInfo.Companion.AEQbTJ(interfaceC48893ueK.zuBGHE().getReferralFooterInfo());
                LayoutType layoutType = LayoutType.TYPE3;
                interfaceC49348ump.setQRCodeInternal(strOLrzqt, true ^ (layoutTypeAEQbTJ == layoutType && !interfaceC49348ump.KWHzl()));
                if (!interfaceC49348ump.EZpvd() && (layoutTypeAEQbTJ == LayoutType.TYPE2 || layoutTypeAEQbTJ == layoutType || layoutTypeAEQbTJ == LayoutType.TYPE0)) {
                    interfaceC49348ump.setSubTitleInternal(C49292ulm.EZpvd.KWHzl(strOLrzqt));
                }
            }
            C6995aZr c6995aZrAhwBna = interfaceC49348ump.AhwBna();
            pUU.KWHzl("OKShare", " qRCodeView.setContent->shareUrl:" + strOLrzqt + " qrcode:" + (c6995aZrAhwBna != null ? c6995aZrAhwBna.OLrzqt() : null));
            function1.invoke(c48887ueE);
            return Unit.INSTANCE;
        }

        public static void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
            pUU.copydefault("OKShare", "FootView->createAndSetShortLinkToQRCode-> occur error:" + th.getMessage());
            function1.invoke(null);
            return Unit.INSTANCE;
        }
    }
}
