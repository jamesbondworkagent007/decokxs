package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C21046gsP;
import o.C52761wXj;
import o.InterfaceC55114xdo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21046gsP {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.gsP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gsP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull C21041gsK c21041gsK, @NotNull final AbstractActivityC33041mov abstractActivityC33041mov) {
            java.lang.Object objM7377constructorimpl;
            final InterfaceC48893ueK interfaceC48893ueK;
            java.lang.String strOLrzqt;
            java.lang.String valuation$default;
            java.lang.String strAEQbTJ;
            BigDecimal bigDecimalEZpvd;
            java.lang.String strCopydefault;
            java.lang.String valuation$default2;
            java.lang.String strOLrzqt2;
            BigDecimal bigDecimalEZpvd2;
            Intrinsics.checkNotNullParameter(c21041gsK, "");
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            android.view.View viewInflate = android.view.View.inflate(abstractActivityC33041mov, C13754dXa.TaskDescription.seuMaA, null);
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.onMediaButtonEvent);
            android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.message);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(C13754dXa.ActionBar.onExtraCallback);
            android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C13754dXa.ActionBar.onPlayFromSearch);
            android.widget.TextView textView3 = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.onFastForward);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(C13754dXa.ActionBar.DcMfJKDCKfqPDCfLja);
            android.widget.TextView textView4 = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.onPrepare);
            android.widget.TextView textView5 = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.DGgnkA);
            android.widget.TextView textView6 = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.DBxZfM);
            android.widget.TextView textView7 = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.onPrepareFromSearch);
            textView.setText(c21041gsK.OLrzqt());
            textView2.setText(c21041gsK.AYXKKw());
            textView2.setVisibility(c21041gsK.AYXKKw().length() == 0 ? 8 : 0);
            textView3.setText(c21041gsK.copydefault());
            textView7.setText(c21041gsK.KWHzl());
            int iDpInt$default = C55298xhM.dpInt$default(268, (android.content.Context) null, 1, (java.lang.Object) null);
            Intrinsics.copydefault(linearLayout);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iDpInt$default;
                layoutParams.height = iDpInt$default;
                linearLayout.setLayoutParams(layoutParams);
                Intrinsics.copydefault(imageView);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = iDpInt$default;
                    layoutParams2.height = iDpInt$default;
                    imageView.setLayoutParams(layoutParams2);
                    float fAEQbTJ = C55298xhM.AEQbTJ(12, (android.content.Context) abstractActivityC33041mov);
                    float f = iDpInt$default;
                    C6996aZs c6996aZs = C6996aZs.OLrzqt;
                    java.lang.String strDjBIcL = c21041gsK.djBIcL();
                    int color = ContextCompat.getColor(abstractActivityC33041mov, C52761wXj.Activity.copydefault);
                    int color2 = ContextCompat.getColor(abstractActivityC33041mov, C52761wXj.Activity.fdOvFl);
                    ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.Q;
                    android.graphics.Bitmap bitmapValueOf = c21041gsK.valueOf();
                    if (bitmapValueOf == null) {
                        bitmapValueOf = BitmapFactory.decodeResource(abstractActivityC33041mov.getResources(), C13754dXa.Activity.DcqEDu);
                    }
                    Intrinsics.copydefault(bitmapValueOf);
                    int i = (int) (f * 0.21f);
                    imageView.setImageBitmap(c6996aZs.KWHzl(strDjBIcL, iDpInt$default, iDpInt$default, (2848 & 8) != 0 ? -16777216 : color2, (2848 & 16) != 0 ? -1 : color, (2848 & 32) != 0 ? 0 : 0, (2848 & 64) != 0 ? 0 : 0, (2848 & 128) != 0 ? 0 : 0, (2848 & 256) != 0 ? 1.0f : 0.0f, (2848 & 512) != 0 ? 1.0f : 0.0f, (2848 & 1024) != 0 ? Bitmap.Config.RGB_565 : null, (2848 & 2048) != 0 ? 0.0f : 0.0f, (2848 & 4096) != 0 ? ErrorCorrectionLevel.H : errorCorrectionLevel, C21045gsO.OLrzqt(bitmapValueOf, fAEQbTJ), i, i, C55298xhM.OLrzqt(0.5f, (android.content.Context) abstractActivityC33041mov), C55298xhM.OLrzqt(0.75f, (android.content.Context) abstractActivityC33041mov), 0.0f));
                    if (c21041gsK.AhwBna()) {
                        constraintLayout.setVisibility(0);
                        C21033gsC c21033gsCEZpvd = c21041gsK.EZpvd();
                        if (c21033gsCEZpvd != null && c21033gsCEZpvd.KWHzl()) {
                            java.lang.String strAEQbTJ2 = c21041gsK.EZpvd().AEQbTJ();
                            if (strAEQbTJ2 == null || (bigDecimalEZpvd2 = C33129mqd.EZpvd(strAEQbTJ2)) == null) {
                                valuation$default2 = null;
                            } else {
                                CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
                                java.lang.String strOLrzqt3 = c21041gsK.EZpvd().OLrzqt();
                                valuation$default2 = C54880xYt.formatValuation$default(bigDecimalEZpvd2, 0, 0, null, currencyDisplayStyle, new WalletCurrencyBean(strOLrzqt3 == null ? "" : strOLrzqt3, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 30, null), null, false, 39, null);
                            }
                            textView4.setText(java.lang.String.valueOf(valuation$default2));
                            java.lang.String strCopydefault2 = c21041gsK.EZpvd().copydefault();
                            if (strCopydefault2 != null) {
                                C10854bwM c10854bwMAEQbTJ = c21041gsK.AEQbTJ();
                                strOLrzqt2 = C54870xYj.OLrzqt(strCopydefault2, (249 & 1) != 0 ? 0 : 0, c10854bwMAEQbTJ != null ? c10854bwMAEQbTJ.DTwDnp() : 0, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                            } else {
                                strOLrzqt2 = null;
                            }
                            textView5.setText(strOLrzqt2);
                            textView6.setText(" " + c21041gsK.EZpvd().EZpvd());
                        } else {
                            C21033gsC c21033gsCEZpvd2 = c21041gsK.EZpvd();
                            if (c21033gsCEZpvd2 == null || (strCopydefault = c21033gsCEZpvd2.copydefault()) == null) {
                                strOLrzqt = null;
                            } else {
                                C10854bwM c10854bwMAEQbTJ2 = c21041gsK.AEQbTJ();
                                strOLrzqt = C54870xYj.OLrzqt(strCopydefault, (249 & 1) != 0 ? 0 : 0, c10854bwMAEQbTJ2 != null ? c10854bwMAEQbTJ2.DTwDnp() : 0, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                            }
                            C21033gsC c21033gsCEZpvd3 = c21041gsK.EZpvd();
                            textView4.setText(strOLrzqt + " " + (c21033gsCEZpvd3 != null ? c21033gsCEZpvd3.EZpvd() : null));
                            C21033gsC c21033gsCEZpvd4 = c21041gsK.EZpvd();
                            if (c21033gsCEZpvd4 == null || (strAEQbTJ = c21033gsCEZpvd4.AEQbTJ()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(strAEQbTJ)) == null) {
                                valuation$default = null;
                            } else {
                                CurrencyDisplayStyle currencyDisplayStyle2 = CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX;
                                java.lang.String strOLrzqt4 = c21041gsK.EZpvd().OLrzqt();
                                valuation$default = C54880xYt.formatValuation$default(bigDecimalEZpvd, 0, 0, null, currencyDisplayStyle2, new WalletCurrencyBean(strOLrzqt4 == null ? "" : strOLrzqt4, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 30, null), null, false, 39, null);
                            }
                            textView5.setText(java.lang.String.valueOf(valuation$default));
                            textView6.setText("");
                        }
                        textView4.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        C33487mxQ.OLrzqt(viewInflate, C55298xhM.KWHzl(346.0f, abstractActivityC33041mov), C55298xhM.KWHzl(644.0f, abstractActivityC33041mov));
                    } else {
                        constraintLayout.setVisibility(8);
                        C33487mxQ.OLrzqt(viewInflate, C55298xhM.KWHzl(326.0f, abstractActivityC33041mov), C55298xhM.KWHzl(548.0f, abstractActivityC33041mov));
                    }
                    viewInflate.requestLayout();
                    viewInflate.invalidate();
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                    viewInflate.draw(new android.graphics.Canvas(bitmapCreateBitmap));
                    try {
                        Result.Application application = Result.Companion;
                        interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                    try {
                        ShareFileProvider.Companion.copydefault(bitmapCreateBitmap, abstractActivityC33041mov, new Function1() { // from class: o.gsR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C21046gsP.Application.OLrzqt(this.EZpvd, abstractActivityC33041mov, (java.lang.Throwable) obj);
                            }
                        }, new Function1() { // from class: o.gsQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C21046gsP.Application.KWHzl(interfaceC48893ueK, abstractActivityC33041mov, (java.io.File) obj);
                            }
                        });
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        C21046gsP.Companion.AEQbTJ(thM7380exceptionOrNullimpl, abstractActivityC33041mov);
                        return;
                    }
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }

        public static final Unit OLrzqt(Application application, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            application.AEQbTJ(th, abstractActivityC33041mov);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(InterfaceC48893ueK interfaceC48893ueK, AbstractActivityC33041mov abstractActivityC33041mov, java.io.File file) {
            Intrinsics.checkNotNullParameter(file, "");
            ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
            java.lang.String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            interfaceC48893ueK.copydefault(abstractActivityC33041mov, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.gsS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21046gsP.Application.KWHzl((ImageShareParams) obj);
                }
            }), null, 2, null));
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            imageShareParams.setShareFrom("wallet_share_qrcode");
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th, AbstractActivityC33041mov abstractActivityC33041mov) {
            pUU.AEQbTJ("ShareReceiveView", "savePendingShareBitmap error: ", th);
            InterfaceC55114xdo.TaskDescription.showToast$default(abstractActivityC33041mov, C13754dXa.FragmentManager.skipToQueueItem, 0, 2, null);
        }
    }
}
