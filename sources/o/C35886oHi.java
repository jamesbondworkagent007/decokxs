package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bumptech.glide.Glide;
import com.okinc.okimcore.model.im.OKContractAddressMessage;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35886oHi extends ConstraintLayout {
    public final sDI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35886oHi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35886oHi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:41) call: o.oHi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35886oHi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35886oHi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        sDI sdiOLrzqt = sDI.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(sdiOLrzqt, "");
        this.copydefault = sdiOLrzqt;
    }

    private final android.widget.TextView valueOf() {
        android.widget.TextView textView = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    private final android.widget.TextView djBIcL() {
        android.widget.TextView textView = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    private final android.widget.ImageView AhwBna() {
        android.widget.ImageView imageView = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    private final CardView KWHzl() {
        CardView cardView = this.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        return cardView;
    }

    private final android.widget.ImageView gEmmrt() {
        android.widget.ImageView imageView = this.copydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    private final android.widget.ImageView copydefault() {
        android.widget.ImageView imageView = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final void setViewAndData(@NotNull OKMessage oKMessage, java.lang.String str) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OLrzqt(oKMessage);
        valueOf().setText(KWHzl(oKMessage, str));
        djBIcL().setText(AEQbTJ(oKMessage));
    }

    public final void setTextColor(int i, int i2) {
        android.widget.TextView textViewValueOf = valueOf();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textViewValueOf.setTextColor(C33070mpX.OLrzqt(i, context));
        android.widget.TextView textViewDjBIcL = djBIcL();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textViewDjBIcL.setTextColor(C33070mpX.OLrzqt(i2, context2));
        android.graphics.drawable.Drawable[] compoundDrawables = djBIcL().getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "");
        for (android.graphics.drawable.Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                copydefault(drawable, djBIcL());
            }
        }
    }

    public final void EZpvd() {
        valueOf().setText("");
        djBIcL().setText("");
        djBIcL().setCompoundDrawables(null, null, null, null);
        AhwBna().setImageDrawable(null);
        KWHzl().setVisibility(8);
    }

    public final void AEQbTJ() {
        android.widget.LinearLayout linearLayout = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = 0;
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final void OLrzqt(OKMessage oKMessage) {
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKReferenceMessage) {
            content = ((OKReferenceMessage) content).getOriginalOKMessageContent();
        }
        djBIcL().setEllipsize(TextUtils.TruncateAt.END);
        this.copydefault.AEQbTJ.setVisibility(8);
        this.copydefault.EZpvd.setVisibility(8);
        this.copydefault.gEmmrt.setVisibility(8);
        AhwBna().setVisibility(8);
        if ((content instanceof OKImageMessage) || (content instanceof OKGIFMessage) || (content instanceof OKSightMessage)) {
            this.copydefault.AEQbTJ.setVisibility(0);
            this.copydefault.gEmmrt.setVisibility(0);
            setupVisualContent(content, oKMessage, true);
            return;
        }
        if (content instanceof OKShareMessage) {
            OKShareMessage oKShareMessage = (OKShareMessage) content;
            if (oKShareMessage.getImage() != null) {
                this.copydefault.AEQbTJ.setVisibility(0);
                this.copydefault.gEmmrt.setVisibility(0);
            }
            setupVisualContent(content, oKMessage, oKShareMessage.getImage() != null);
            return;
        }
        if (content instanceof OKStickerMessage) {
            OKStickerMessage oKStickerMessage = (OKStickerMessage) content;
            if (oKStickerMessage.getIconUrl() != null) {
                this.copydefault.AEQbTJ.setVisibility(0);
                this.copydefault.gEmmrt.setVisibility(0);
            }
            setupVisualContent(content, oKMessage, oKStickerMessage.getIconUrl() != null);
            return;
        }
        if (content instanceof OKContractAddressMessage) {
            EZpvd(content);
            this.copydefault.AEQbTJ.setVisibility(0);
            this.copydefault.EZpvd.setVisibility(0);
            OKContractAddressMessage oKContractAddressMessage = (OKContractAddressMessage) content;
            java.lang.String tokenLogo = oKContractAddressMessage.getTokenLogo();
            if (tokenLogo != null && tokenLogo.length() != 0) {
                Intrinsics.copydefault(Glide.AEQbTJ(gEmmrt().getContext()).EZpvd(oKContractAddressMessage.getTokenLogo()).KWHzl(C52761wXj.TaskDescription.vLaW).copydefault(C52761wXj.TaskDescription.vLaW).gEmmrt().EZpvd(gEmmrt()));
            } else {
                gEmmrt().setImageResource(C52761wXj.TaskDescription.vLaW);
            }
            java.lang.String chainLogo = oKContractAddressMessage.getChainLogo();
            if (chainLogo != null && chainLogo.length() != 0) {
                Intrinsics.copydefault(Glide.AEQbTJ(copydefault().getContext()).EZpvd(oKContractAddressMessage.getChainLogo()).KWHzl(C52761wXj.TaskDescription.RSDDiY).copydefault(C52761wXj.TaskDescription.RSDDiY).gEmmrt().EZpvd(copydefault()));
                return;
            } else {
                copydefault().setImageResource(C52761wXj.TaskDescription.RSDDiY);
                return;
            }
        }
        if (content instanceof OKHQVoiceMessage) {
            EZpvd(content);
            KWHzl().setVisibility(8);
        } else if (content instanceof OKFileMessage) {
            EZpvd(content);
            KWHzl().setVisibility(8);
            djBIcL().setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (content instanceof OKTextMessage) {
            OLrzqt();
        } else {
            OLrzqt();
        }
    }

    public final void setupVisualContent(OKMessageContent oKMessageContent, OKMessage oKMessage, boolean z) {
        java.lang.Object objM7377constructorimpl;
        EZpvd(oKMessageContent);
        KWHzl().setVisibility(z ? 0 : 8);
        AhwBna().setVisibility(z ? 0 : 8);
        Unit unit = null;
        if (z) {
            try {
                Result.Application application = Result.Companion;
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU != null) {
                    interfaceC35180nqU.KWHzl(AhwBna(), oKMessage);
                    unit = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
            return;
        }
        AhwBna().setImageDrawable(null);
    }

    public final void OLrzqt() {
        djBIcL().setCompoundDrawables(null, null, null, null);
        KWHzl().setVisibility(8);
    }

    private final void EZpvd(OKMessageContent oKMessageContent) {
        java.lang.Integer numValueOf;
        android.graphics.drawable.Drawable drawableEZpvd;
        if ((oKMessageContent instanceof OKImageMessage) || (oKMessageContent instanceof OKGIFMessage)) {
            numValueOf = java.lang.Integer.valueOf(C44105sDn.Application.ejfBZ);
        } else if (oKMessageContent instanceof OKSightMessage) {
            numValueOf = java.lang.Integer.valueOf(C44105sDn.Application.hDKMBd);
        } else if (oKMessageContent instanceof OKShareMessage) {
            numValueOf = java.lang.Integer.valueOf(C44105sDn.Application.fARcdN);
        } else if (oKMessageContent instanceof OKStickerMessage) {
            numValueOf = java.lang.Integer.valueOf(C44105sDn.Application.getFieldNames);
        } else if (oKMessageContent instanceof OKHQVoiceMessage) {
            numValueOf = java.lang.Integer.valueOf(C44105sDn.Application.fIwbmz);
        } else if (oKMessageContent instanceof OKFileMessage) {
            numValueOf = java.lang.Integer.valueOf(C44105sDn.Application.fJNWhG);
        } else if (oKMessageContent instanceof OKContractAddressMessage) {
            numValueOf = java.lang.Integer.valueOf(C44105sDn.Application.iwGUEr);
        } else {
            boolean z = oKMessageContent instanceof OKTextMessage;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            drawableEZpvd = C33070mpX.EZpvd(iIntValue, context);
        } else {
            drawableEZpvd = null;
        }
        djBIcL().setCompoundDrawablesRelativeWithIntrinsicBounds(drawableEZpvd != null ? copydefault(drawableEZpvd, djBIcL()) : null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    public final android.graphics.drawable.Drawable copydefault(android.graphics.drawable.Drawable drawable, android.widget.TextView textView) {
        drawable.mutate().setColorFilter(new PorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        return drawable;
    }

    public final android.text.SpannableStringBuilder AEQbTJ(OKMessage oKMessage) {
        InterfaceC35353nti interfaceC35353ntiOLrzqt;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (oKMessage.getContent() instanceof OKRecallNotificationMessage) {
            android.text.SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.copydefault));
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "");
            return spannableStringBuilderAppend;
        }
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        java.lang.CharSequence charSequenceAEQbTJ = null;
        AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAoEZpvd = (interfaceC35180nqU == null || (interfaceC35353ntiOLrzqt = interfaceC35180nqU.OLrzqt()) == null) ? null : interfaceC35353ntiOLrzqt.EZpvd(oKMessage);
        if (abstractC35703oAoEZpvd != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            charSequenceAEQbTJ = abstractC35703oAoEZpvd.AEQbTJ(context, oKMessage);
        }
        OKMessageContent content = oKMessage.getContent();
        if ((content instanceof OKImageMessage) || (content instanceof OKGIFMessage)) {
            spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.KWHzl));
        } else if (content instanceof OKSightMessage) {
            OKMessageContent content2 = oKMessage.getContent();
            Intrinsics.copydefault(content2, "");
            spannableStringBuilder.append((java.lang.CharSequence) C44160sFn.copydefault(((OKSightMessage) content2).getDuration()));
        } else if (content instanceof OKHQVoiceMessage) {
            OKMessageContent content3 = oKMessage.getContent();
            Intrinsics.copydefault(content3, "");
            spannableStringBuilder.append((java.lang.CharSequence) C44160sFn.copydefault(((OKHQVoiceMessage) content3).getDuration()));
        } else if (content instanceof OKTextMessage) {
            if (charSequenceAEQbTJ != null) {
                spannableStringBuilder.append(charSequenceAEQbTJ);
            }
            Unit unit = Unit.INSTANCE;
        } else if (content instanceof OKReferenceMessage) {
            OKMessageContent content4 = oKMessage.getContent();
            Intrinsics.copydefault(content4, "");
            OKMessageContent originalOKMessageContent = ((OKReferenceMessage) content4).getOriginalOKMessageContent();
            if ((originalOKMessageContent instanceof OKImageMessage) || (originalOKMessageContent instanceof OKGIFMessage)) {
                spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.KWHzl));
            } else if (originalOKMessageContent instanceof OKSightMessage) {
                spannableStringBuilder.append((java.lang.CharSequence) C44160sFn.copydefault(((OKSightMessage) originalOKMessageContent).getDuration()));
            } else if (originalOKMessageContent instanceof OKStickerMessage) {
                spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.ejfBZ));
            } else if (originalOKMessageContent instanceof OKHQVoiceMessage) {
                spannableStringBuilder.append((java.lang.CharSequence) C44160sFn.copydefault(((OKHQVoiceMessage) originalOKMessageContent).getDuration()));
            } else if (originalOKMessageContent instanceof OKTextMessage) {
                if (charSequenceAEQbTJ != null) {
                    spannableStringBuilder.append(charSequenceAEQbTJ);
                }
            } else if (originalOKMessageContent instanceof OKFileMessage) {
                java.lang.String fileName = ((OKFileMessage) originalOKMessageContent).getFileName();
                if (fileName == null) {
                    fileName = C33070mpX.AYXKKw(C44105sDn.PendingIntent.AuCTel);
                }
                spannableStringBuilder.append((java.lang.CharSequence) fileName);
            }
            Unit unit2 = Unit.INSTANCE;
        } else if (content instanceof OKContractAddressMessage) {
            OKMessageContent content5 = oKMessage.getContent();
            Intrinsics.copydefault(content5, "");
            spannableStringBuilder.append((java.lang.CharSequence) ((OKContractAddressMessage) content5).getTokenSymbol());
        } else if (content instanceof OKShareMessage) {
            spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.fetchVPNInfo));
        } else if (content instanceof OKStickerMessage) {
            spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.ejfBZ));
        } else if (content instanceof OKFileMessage) {
            OKMessageContent content6 = oKMessage.getContent();
            Intrinsics.copydefault(content6, "");
            java.lang.String fileName2 = ((OKFileMessage) content6).getFileName();
            if (fileName2 == null) {
                fileName2 = C33070mpX.AYXKKw(C44105sDn.PendingIntent.AuCTel);
            }
            spannableStringBuilder.append((java.lang.CharSequence) fileName2);
        } else {
            spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.AEQbTJ));
        }
        return spannableStringBuilder;
    }

    public final java.lang.String KWHzl(OKMessage oKMessage, java.lang.String str) {
        java.lang.String strCopydefault = C44170sFx.copydefault(str, oKMessage.getSenderUserId());
        return strCopydefault == null ? "" : strCopydefault;
    }
}
