package o;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.icu.text.TimeZoneFormat;
import android.icu.util.TimeZone;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import com.bumptech.glide.Glide;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.referral.bean.ReferralFooterInfo;
import com.okinc.share.view.FootViewTheme;
import com.okinc.tradeuilib.imgs.OKRemoteImageResource;
import com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C48894ueL;
import o.C52761wXj;
import o.C55159xeg;
import o.C55688xof;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53770wrk {
    public static final C53770wrk AEQbTJ = new C53770wrk();
    public static final int[] OLrzqt = {C33070mpX.copydefault(C48033uCm.StateListAnimator.AkhnZx), C33070mpX.copydefault(C48033uCm.StateListAnimator.AhwBna)};
    public static final java.util.Set<java.lang.String> KWHzl = yEE.AhwBna("spot_dca", "contract_dca", "recurring", "smart_portfolio", "smart_arbitrage", "dcd_bot", "signal_bot");
    public static final int EZpvd = 8;

    private C53770wrk() {
    }

    public final void EZpvd(@NotNull C48339uNv c48339uNv, @NotNull TacticsData tacticsData, C53780wru c53780wru, boolean z, @NotNull C53771wrl c53771wrl) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(c48339uNv, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(c53771wrl, "");
        ShareData shareData = tacticsData.getShareData();
        EZpvd(c48339uNv, tacticsData, z);
        android.widget.ImageView imageView = c48339uNv.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        EZpvd(shareData, imageView);
        android.widget.TextView textView = c48339uNv.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        OLrzqt(textView);
        android.widget.ImageView imageView2 = c48339uNv.AuCTel;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        copydefault(imageView2);
        android.widget.TextView textView2 = c48339uNv.AYXKKw;
        if (c53780wru == null || (strOLrzqt = c53780wru.KWHzl()) == null) {
            strOLrzqt = OLrzqt(tacticsData);
        }
        textView2.setText(strOLrzqt);
        android.widget.TextView textView3 = c48339uNv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        copydefault(textView3, shareData.getMainDataValue());
        AEQbTJ(c48339uNv, c53771wrl);
        if (c53780wru != null) {
            copydefault(c48339uNv, c53780wru);
        } else {
            copydefault(c48339uNv, shareData, tacticsData);
        }
        C49352umt c49352umt = c48339uNv.isConnected;
        Intrinsics.checkNotNullExpressionValue(c49352umt, "");
        copydefault(c49352umt, z, shareData.getQrCode());
    }

    public final void EZpvd(C48339uNv c48339uNv, TacticsData tacticsData, boolean z) {
        android.widget.TextView textView = c48339uNv.zsXlph;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.TextView textView2 = c48339uNv.AubY;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        AEQbTJ(tacticsData, textView, textView2);
        android.widget.FrameLayout frameLayout = c48339uNv.gHZMYf;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        android.widget.LinearLayout linearLayout = c48339uNv.AxsJAY;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.widget.LinearLayout linearLayout2 = c48339uNv.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        android.widget.TextView textView3 = c48339uNv.zsXlph;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        android.view.View view = c48339uNv.wlaJM;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.widget.TextView textView4 = c48339uNv.sSMYrx;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        android.widget.TextView textView5 = c48339uNv.AubY;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        copydefault(z, frameLayout, linearLayout, linearLayout2, textView3, view, textView4, textView5);
    }

    public final void AEQbTJ(C48339uNv c48339uNv, C53771wrl c53771wrl) {
        C53697wqQ c53697wqQ = C53697wqQ.copydefault;
        android.content.Context context = c48339uNv.djBIcL.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = c53697wqQ.copydefault(context);
        int iIntValue = pairCopydefault.component1().intValue();
        int iIntValue2 = pairCopydefault.component2().intValue();
        C55159xeg c55159xeg = c48339uNv.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55159xeg, "");
        c53697wqQ.copydefault(c55159xeg, c53771wrl, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 2) != 0, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 4) != 0 ? Insets.of(0, 0, 0, C55298xhM.dp2px$default(4.0f, null, 1, null) + C55298xhM.sp2px$default(12.0f, null, 1, null)) : Insets.of(0, 0, 0, 0), (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 8) != 0 ? null : null, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 16) != 0 ? null : null, iIntValue, iIntValue2, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 128) != 0 ? null : null, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 256) != 0 ? null : null, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 512) != 0 ? new C55159xeg.StateListAnimator(null, java.lang.Float.valueOf(0.0f), 2, null) : null, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 1024) != 0 ? new C55159xeg.StateListAnimator(java.lang.Integer.valueOf(C52761wXj.LoaderManager.DCJXGO), java.lang.Float.valueOf(C55298xhM.sp2pxFloat$default(12.0f, null, 1, null)), 0, java.lang.Integer.valueOf(ContextCompat.getColor(c55159xeg.getContext(), C52761wXj.Activity.QwvEab))) : null, (MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE & 2048) != 0 ? OKVerticalSeparatorView.LineStyle.None : null);
        C55159xeg c55159xeg2 = c48339uNv.djBIcL;
        c55159xeg2.setClipBounds(null);
        c55159xeg2.setClipChildren(false);
        c55159xeg2.setClipToPadding(false);
        android.view.ViewParent parent = c48339uNv.djBIcL.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    public final void copydefault(C48339uNv c48339uNv, C53780wru c53780wru) {
        int i = 0;
        for (java.lang.Object obj : c53780wru.OLrzqt()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C53777wrr c53777wrr = (C53777wrr) obj;
            if (i == 0) {
                c48339uNv.AEQbTJ.setText(c53777wrr.EZpvd());
                C53770wrk c53770wrk = AEQbTJ;
                android.widget.TextView textView = c48339uNv.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                c53770wrk.EZpvd(textView, uLP.AEQbTJ(c53777wrr.KWHzl().KWHzl()), uLP.KWHzl(c53777wrr.KWHzl().KWHzl()));
            } else if (i == 1) {
                c48339uNv.AhwBna.setText(c53777wrr.EZpvd());
                C53770wrk c53770wrk2 = AEQbTJ;
                android.widget.TextView textView2 = c48339uNv.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                c53770wrk2.EZpvd(textView2, uLP.AEQbTJ(c53777wrr.KWHzl().KWHzl()), uLP.KWHzl(c53777wrr.KWHzl().KWHzl()));
            } else if (i == 2) {
                Group group = c48339uNv.fIwbmz;
                Intrinsics.checkNotNullExpressionValue(group, "");
                group.setVisibility(0);
                java.lang.String strOLrzqt = c53777wrr.OLrzqt();
                if (strOLrzqt != null && strOLrzqt.length() != 0) {
                    ShapeableImageView shapeableImageView = c48339uNv.uzCIH;
                    Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                    shapeableImageView.setVisibility(0);
                    ShapeableImageView shapeableImageView2 = c48339uNv.uzCIH;
                    Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
                    C50033uzl.copydefault(shapeableImageView2, c53777wrr.OLrzqt());
                }
                c48339uNv.getNewProxyInstance.setText(c53777wrr.EZpvd());
                C53770wrk c53770wrk3 = AEQbTJ;
                android.widget.TextView textView3 = c48339uNv.getFieldNames;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                c53770wrk3.EZpvd(textView3, uLP.AEQbTJ(c53777wrr.KWHzl().KWHzl()), uLP.KWHzl(c53777wrr.KWHzl().KWHzl()));
            }
            i++;
        }
    }

    public final void copydefault(C48339uNv c48339uNv, ShareData shareData, TacticsData tacticsData) {
        boolean z = (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) shareData.getAltDataTitle()) ^ true) && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) shareData.getAltDataValue()) ^ true);
        android.widget.TextView textView = c48339uNv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        android.widget.TextView textView2 = c48339uNv.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        if (z) {
            c48339uNv.AEQbTJ.setText(shareData.getAltDataTitle());
            android.widget.TextView textView3 = c48339uNv.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            OLrzqt(textView3, tacticsData);
        }
        c48339uNv.AhwBna.setText(OLrzqt(tacticsData.getHistory(), true));
        c48339uNv.valueOf.setText(C56002xub.KWHzl.EZpvd(tacticsData.getRunningDuration()));
    }

    public final void OLrzqt(@NotNull final C48340uNw c48340uNw, @NotNull TacticsData tacticsData, C53780wru c53780wru, boolean z) {
        java.lang.String strOLrzqt;
        android.text.SpannedString spannedStringCopydefault;
        java.util.List<java.lang.String> listAEQbTJ;
        Intrinsics.checkNotNullParameter(c48340uNw, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ShareData shareData = tacticsData.getShareData();
        if (z) {
            android.content.Context context = c48340uNw.uzCIH.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OLrzqt(context, OKRemoteImageResource.Resource.TRADE_SHARE_VIP_BACKGROUND, new Function1() { // from class: o.wri
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53770wrk.copydefault(c48340uNw, (android.graphics.drawable.Drawable) obj);
                }
            });
        }
        OLrzqt(c48340uNw, tacticsData, z);
        android.widget.ImageView imageView = c48340uNw.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        EZpvd(shareData, imageView);
        android.widget.TextView textView = c48340uNw.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        OLrzqt(textView);
        android.widget.ImageView imageView2 = c48340uNw.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        copydefault(imageView2);
        c48340uNw.copydefault.setText(shareData.getMainDataTitle());
        android.widget.TextView textView2 = c48340uNw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        copydefault(textView2, shareData.getMainDataValue());
        android.content.Context context2 = c48340uNw.AuCTel.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        OLrzqt(context2, KWHzl(shareData.getMainDataValue(), z), new Function1() { // from class: o.wrg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53770wrk.KWHzl(c48340uNw, (android.graphics.drawable.Drawable) obj);
            }
        });
        copydefault(c48340uNw, tacticsData);
        android.widget.TextView textView3 = c48340uNw.values;
        if (c53780wru == null || (strOLrzqt = c53780wru.KWHzl()) == null) {
            strOLrzqt = OLrzqt(tacticsData);
        }
        textView3.setText(strOLrzqt);
        android.widget.TextView textView4 = c48340uNw.AubY;
        if (c53780wru != null && (listAEQbTJ = c53780wru.AEQbTJ()) != null && (!listAEQbTJ.isEmpty())) {
            spannedStringCopydefault = KWHzl(c53780wru.AEQbTJ());
        } else {
            spannedStringCopydefault = copydefault(tacticsData);
        }
        textView4.setText(spannedStringCopydefault);
        if (c53780wru != null) {
            KWHzl(c48340uNw, c53780wru);
        } else {
            EZpvd(c48340uNw, shareData, tacticsData);
        }
        C49352umt c49352umt = c48340uNw.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c49352umt, "");
        copydefault(c49352umt, z, shareData.getQrCode());
    }

    public static final Unit copydefault(C48340uNw c48340uNw, android.graphics.drawable.Drawable drawable) {
        c48340uNw.uzCIH.setBackground(drawable);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C48340uNw c48340uNw, android.graphics.drawable.Drawable drawable) {
        c48340uNw.AuCTel.setImageDrawable(drawable);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C48340uNw c48340uNw, TacticsData tacticsData, boolean z) {
        android.widget.TextView textView = c48340uNw.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.TextView textView2 = c48340uNw.zsXlph;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        AEQbTJ(tacticsData, textView, textView2);
        android.widget.FrameLayout frameLayout = c48340uNw.gHZMYf;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        android.widget.LinearLayout linearLayout = c48340uNw.AwvSrB;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.widget.LinearLayout linearLayout2 = c48340uNw.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        android.widget.TextView textView3 = c48340uNw.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        android.view.View view = c48340uNw.wlaJM;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.widget.TextView textView4 = c48340uNw.sSMYrx;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        android.widget.TextView textView5 = c48340uNw.zsXlph;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        copydefault(z, frameLayout, linearLayout, linearLayout2, textView3, view, textView4, textView5);
    }

    public final void copydefault(C48340uNw c48340uNw, TacticsData tacticsData) {
        C51601vqB c51601vqB = c48340uNw.isConnected;
        c51601vqB.AEQbTJ(tacticsData);
        android.widget.TextView textViewAEQbTJ = c51601vqB.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.invokespecialaGOrKO)));
            textViewAEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.WS));
        }
    }

    public final void KWHzl(C48340uNw c48340uNw, C53780wru c53780wru) {
        int i = 0;
        for (java.lang.Object obj : c53780wru.OLrzqt()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C53777wrr c53777wrr = (C53777wrr) obj;
            if (i == 0) {
                c48340uNw.djBIcL.setText(c53777wrr.EZpvd());
                C53770wrk c53770wrk = AEQbTJ;
                android.widget.TextView textView = c48340uNw.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                c53770wrk.EZpvd(textView, uLP.AEQbTJ(c53777wrr.KWHzl().KWHzl()), uLP.KWHzl(c53777wrr.KWHzl().KWHzl()));
            } else if (i == 1) {
                android.widget.TextView textView2 = c48340uNw.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(c53777wrr.AEQbTJ() ? 0 : 8);
                android.widget.TextView textView3 = c48340uNw.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(c53777wrr.AEQbTJ() ? 0 : 8);
                c48340uNw.valueOf.setText(c53777wrr.EZpvd());
                C53770wrk c53770wrk2 = AEQbTJ;
                android.widget.TextView textView4 = c48340uNw.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                c53770wrk2.EZpvd(textView4, uLP.AEQbTJ(c53777wrr.KWHzl().KWHzl()), uLP.KWHzl(c53777wrr.KWHzl().KWHzl()));
            } else if (i == 2) {
                c48340uNw.AEQbTJ.setText(c53777wrr.EZpvd());
                C53770wrk c53770wrk3 = AEQbTJ;
                android.widget.TextView textView5 = c48340uNw.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                c53770wrk3.EZpvd(textView5, uLP.AEQbTJ(c53777wrr.KWHzl().KWHzl()), uLP.KWHzl(c53777wrr.KWHzl().KWHzl()));
                java.lang.String strOLrzqt = c53777wrr.OLrzqt();
                if (strOLrzqt != null && strOLrzqt.length() != 0) {
                    ShapeableImageView shapeableImageView = c48340uNw.fARcdN;
                    Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
                    shapeableImageView.setVisibility(0);
                    ShapeableImageView shapeableImageView2 = c48340uNw.fARcdN;
                    Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
                    C50033uzl.copydefault(shapeableImageView2, c53777wrr.OLrzqt());
                }
            }
            i++;
        }
    }

    public final void EZpvd(C48340uNw c48340uNw, ShareData shareData, TacticsData tacticsData) {
        android.widget.TextView textView = c48340uNw.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.TextView textView2 = c48340uNw.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        KWHzl(textView, textView2, shareData.getBotDataTitle1(), shareData.getBotDataValue1());
        android.widget.TextView textView3 = c48340uNw.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        android.widget.TextView textView4 = c48340uNw.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        KWHzl(textView3, textView4, shareData.getBotDataTitle2(), shareData.getBotDataValue2());
        boolean z = (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) shareData.getAltDataTitle()) ^ true) && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) shareData.getAltDataValue()) ^ true);
        android.widget.TextView textView5 = c48340uNw.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(z ? 0 : 8);
        android.widget.TextView textView6 = c48340uNw.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(z ? 0 : 8);
        if (z) {
            c48340uNw.AEQbTJ.setText(shareData.getAltDataTitle());
            android.widget.TextView textView7 = c48340uNw.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            OLrzqt(textView7, tacticsData);
        }
    }

    public final void EZpvd(android.widget.TextView textView, java.lang.String str, java.lang.String str2) {
        textView.setText(str);
        C49962uyT c49962uyT = C49962uyT.AEQbTJ;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(c49962uyT.KWHzl(context, str2));
    }

    public final void copydefault(C49352umt c49352umt, boolean z, java.lang.String str) {
        c49352umt.setIcon(null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            c49352umt.setQRCode(str);
        } else {
            ReferralFooterInfo referralFooterInfoOLrzqt = ((InterfaceC48694uaX) C43251rlk.copydefault(InterfaceC48694uaX.class)).OLrzqt();
            if (referralFooterInfoOLrzqt != null) {
                c49352umt.setTitle(referralFooterInfoOLrzqt.getInviteeShareText());
                c49352umt.setSubTitle(referralFooterInfoOLrzqt.getDownloadUrl());
                c49352umt.setQRCode(referralFooterInfoOLrzqt.getDownloadUrl());
            }
        }
        if (z) {
            c49352umt.setTheme(FootViewTheme.FIXED_VIP);
        }
    }

    public final void OLrzqt(android.widget.TextView textView, TacticsData tacticsData) {
        ShareData shareData = tacticsData.getShareData();
        java.lang.String altDataValue = shareData.getAltDataValue();
        java.lang.String pnlUnit = shareData.getPnlUnit();
        java.lang.String priceUnit = shareData.getPriceUnit();
        if (pnlUnit == null || pnlUnit.length() == 0) {
            pnlUnit = priceUnit;
        }
        java.lang.String strAEQbTJ = AEQbTJ(tacticsData, shareData, altDataValue, pnlUnit);
        C49962uyT c49962uyT = C49962uyT.AEQbTJ;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (!(!Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "--"))) {
            altDataValue = null;
        }
        int iKWHzl = c49962uyT.KWHzl(context, altDataValue);
        textView.setText(strAEQbTJ);
        textView.setTextColor(iKWHzl);
    }

    public final java.lang.String AEQbTJ(TacticsData tacticsData, ShareData shareData, java.lang.String str, java.lang.String str2) {
        boolean z = true;
        if (!tacticsData.getHistory() && Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "smart_arbitrage")) {
            return C56068xvo.copydefault.copydefault(str, true);
        }
        java.lang.String pnlUnit = shareData.getPnlUnit();
        if ((pnlUnit == null || pnlUnit.length() == 0) && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            z = false;
        }
        return C56033xvF.getBotPnl$default(z ? tacticsData.getInstId() : "", z ? tacticsData.getInstType() : "", str, str2, true, true, null, false, tacticsData.takeNonBlankTradeQuoteCcy(), null, null, 1728, null);
    }

    public static /* synthetic */ java.lang.String getTacticStatus$default(C53770wrk c53770wrk, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c53770wrk.OLrzqt(z, z2);
    }

    public final java.lang.String OLrzqt(boolean z, boolean z2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(C33070mpX.AYXKKw(z ? C55688xof.Application.getPlaybackType : C55688xof.Application.collapseActionView));
        if (z2) {
            sb.append(" | ");
            sb.append(C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty));
        }
        return sb.toString();
    }

    public final java.lang.String OLrzqt(TacticsData tacticsData) {
        BotCommon common;
        BotVo bot = tacticsData.getBot();
        java.lang.String stgyName = (bot == null || (common = bot.getCommon()) == null) ? null : common.getStgyName();
        if (stgyName == null) {
            stgyName = "";
        }
        if (stgyName.length() != 0) {
            return stgyName;
        }
        java.lang.String stgyName2 = tacticsData.getStgyName();
        return (stgyName2 == null || stgyName2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stgyName2)) ? tacticsData.getTvTitle() : stgyName2;
    }

    public final OKRemoteImageResource.Resource KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean zGEmmrt = C33129mqd.gEmmrt(str, 0);
        boolean z2 = C33512mxp.AEQbTJ.isConnected() == 0;
        return (zGEmmrt && z2) ? z ? OKRemoteImageResource.Resource.TRADE_SHARE_BG_HEART_RED_VIP : OKRemoteImageResource.Resource.TRADE_SHARE_BG_HEART_RED : zGEmmrt ? z ? OKRemoteImageResource.Resource.TRADE_SHARE_BG_HEART_GREEN_VIP : OKRemoteImageResource.Resource.TRADE_SHARE_BG_HEART_GREEN : z2 ? z ? OKRemoteImageResource.Resource.TRADE_SHARE_BG_ROCKET_GREEN_VIP : OKRemoteImageResource.Resource.TRADE_SHARE_BG_ROCKET_GREEN : z ? OKRemoteImageResource.Resource.TRADE_SHARE_BG_ROCKET_RED_VIP : OKRemoteImageResource.Resource.TRADE_SHARE_BG_ROCKET_RED;
    }

    public final void copydefault(android.widget.TextView textView, java.lang.String str) {
        textView.setText(C56068xvo.copydefault.copydefault(str, true));
        C49962uyT c49962uyT = C49962uyT.AEQbTJ;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(c49962uyT.KWHzl(context, str));
    }

    public final void copydefault(android.widget.ImageView imageView) {
        if (C34703nhO.AEQbTJ()) {
            imageView.setImageResource(C48894ueL.ActionBar.wlaJM);
        }
    }

    public final void OLrzqt(android.widget.TextView textView) {
        Date date = new Date();
        java.lang.String time$default = pTA.formatTime$default(date, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        java.lang.String date$default = pTA.formatDate$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
        textView.setText(time$default + "(" + TimeZoneFormat.getInstance(java.util.Locale.getDefault()).format(TimeZoneFormat.Style.SPECIFIC_SHORT, TimeZone.getDefault(), date.getTime()) + ") " + date$default);
    }

    public final void EZpvd(ShareData shareData, android.widget.ImageView imageView) {
        wUE wue = wUE.OLrzqt;
        java.lang.String avatar = shareData.getAvatar();
        if (avatar == null) {
            avatar = "";
        }
        wue.KWHzl(imageView, wUE.Application.m8784constructorimpl$default(avatar, null, 2, null));
    }

    public final void AEQbTJ(TacticsData tacticsData, android.widget.TextView textView, android.widget.TextView textView2) {
        ShareData shareData = tacticsData.getShareData();
        java.lang.String nickName = shareData.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        textView.setText(nickName);
        textView2.setVisibility(Intrinsics.EZpvd((java.lang.Object) tacticsData.getCopyType(), (java.lang.Object) "3") ? 0 : 8);
        java.lang.String tradeTag = EZpvd(tacticsData.getOrderType()) ? shareData.getTradeTag() : tacticsData.getSignalSource();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeTag)) {
            textView2.setText(tradeTag);
            textView2.setVisibility(0);
        }
    }

    public final boolean EZpvd(java.lang.String str) {
        return KWHzl.contains(str);
    }

    public final void copydefault(boolean z, android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, android.widget.TextView textView, android.view.View view, android.widget.TextView textView2, android.widget.TextView textView3) {
        if (z) {
            OLrzqt(frameLayout, linearLayout, textView, textView2, textView3);
        } else {
            OLrzqt(linearLayout, linearLayout2, view, textView2);
        }
    }

    public final void copydefault(android.widget.TextView textView) {
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().measureText(textView.getText().toString()), textView.getTextSize(), OLrzqt, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull OKRemoteImageResource.Resource resource, @NotNull Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Glide.AEQbTJ(context).EZpvd(C43454rpb.copydefault(resource.getFilename(), context, false)).OLrzqt(new Activity(function1));
    }

    /* JADX INFO: renamed from: o.wrk$Activity */
    public static final class Activity extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.copydefault.invoke(drawable);
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            this.copydefault.invoke(null);
        }
    }

    public final void EZpvd(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            if (!StringsKt__StringsKt.fARcdN(spannableStringBuilder)) {
                android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.init));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(" | ");
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            }
            spannableStringBuilder.append((java.lang.CharSequence) str);
        }
    }

    public final android.graphics.Bitmap copydefault(@NotNull android.view.View view, @NotNull C49352umt c49352umt, boolean z) {
        int iOLrzqt;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c49352umt, "");
        c49352umt.setVisibility(z ? 0 : 8);
        int iOLrzqt2 = C33070mpX.OLrzqt(C48033uCm.TaskDescription.AEQbTJ);
        if (z) {
            iOLrzqt = C33070mpX.OLrzqt(C48033uCm.TaskDescription.EZpvd);
        } else {
            iOLrzqt = C33070mpX.OLrzqt(C48033uCm.TaskDescription.copydefault);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iOLrzqt2, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iOLrzqt, 1073741824);
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        view.setLayoutDirection(C55296xhK.OLrzqt(context) ? 1 : 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        android.graphics.Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ(view, true);
        Intrinsics.checkNotNullExpressionValue(bitmapAEQbTJ, "");
        return bitmapAEQbTJ;
    }

    public final android.text.SpannedString KWHzl(java.util.List<java.lang.String> list) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (i == 0) {
                spannableStringBuilder.append((java.lang.CharSequence) str);
            } else {
                AEQbTJ.EZpvd(spannableStringBuilder, str);
            }
            i++;
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final android.text.SpannedString copydefault(TacticsData tacticsData) {
        java.lang.String strAYXKKw;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String level = "";
        if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "smart_arbitrage")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onResult);
        } else if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "dcd_bot")) {
            strAYXKKw = "";
        } else {
            strAYXKKw = Intrinsics.EZpvd((java.lang.Object) tacticsData.getInstType(), (java.lang.Object) "SPOT") ? C33070mpX.AYXKKw(C48033uCm.Fragment.zKcAg) : C56033xvF.AhwBna(tacticsData.getDirection());
        }
        spannableStringBuilder.append((java.lang.CharSequence) strAYXKKw);
        java.lang.String instType = tacticsData.getInstType();
        int iHashCode = instType.hashCode();
        if (iHashCode == -2027980370 ? instType.equals("MARGIN") : iHashCode == 2558355 ? instType.equals("SWAP") : iHashCode == 214415088 && instType.equals("FUTURES")) {
            level = tacticsData.getLevel();
        }
        C53770wrk c53770wrk = AEQbTJ;
        c53770wrk.EZpvd(spannableStringBuilder, level);
        c53770wrk.EZpvd(spannableStringBuilder, getTacticStatus$default(c53770wrk, tacticsData.getHistory(), false, 2, null));
        if (C54589xNz.EZpvd.EZpvd()) {
            c53770wrk.EZpvd(spannableStringBuilder, C33070mpX.AYXKKw(C55688xof.Application.fmB));
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final void KWHzl(android.widget.TextView textView, android.widget.TextView textView2, java.lang.String str, java.lang.String str2) {
        boolean z = (str == null || str2 == null) ? false : true;
        textView.setVisibility(z ? 0 : 8);
        textView2.setVisibility(z ? 0 : 8);
        if (z) {
            textView.setText(str);
            textView2.setText(str2);
        }
    }

    public final void OLrzqt(android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        linearLayout.setBackground(((InterfaceC49510ups) C43251rlk.copydefault(InterfaceC49510ups.class)).AEQbTJ(OLrzqt, C55298xhM.dp2pxFloat$default(textView3.getVisibility() == 0 ? 36.0f : 22.0f, null, 1, null)));
        if (textView3.getVisibility() == 0) {
            linearLayout.setPaddingRelative(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.height = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        textView.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        copydefault(textView);
        copydefault(textView2);
        textView3.setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
        textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    public final void OLrzqt(android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, android.view.View view, android.widget.TextView textView) {
        linearLayout.setPadding(0, 0, 0, 0);
        if (linearLayout2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        view.setVisibility(8);
        textView.setVisibility(8);
    }
}
