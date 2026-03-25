package o;

import android.widget.LinearLayout;
import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.business.rewards.okplatform.bean.BaseRichTextBlock;
import com.okinc.business.rewards.okplatform.bean.RichTextRoot;
import com.okinc.lexical.table.RichTextTable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37999pIm extends android.widget.FrameLayout implements InterfaceC28104kPa {
    public kOO AEQbTJ;
    public java.lang.Float EZpvd;
    public java.lang.Integer KWHzl;
    public android.graphics.Typeface OLrzqt;
    public java.lang.Integer copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomTypeFace(@NotNull android.graphics.Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        this.OLrzqt = typeface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37999pIm(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        kOO kooCopydefault = kOO.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(kooCopydefault, "");
        this.AEQbTJ = kooCopydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37999pIm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        kOO kooCopydefault = kOO.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(kooCopydefault, "");
        this.AEQbTJ = kooCopydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37999pIm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        kOO kooCopydefault = kOO.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(kooCopydefault, "");
        this.AEQbTJ = kooCopydefault;
    }

    public static /* synthetic */ void initRichData$default(C37999pIm c37999pIm, RichTextRoot richTextRoot, LexicalDecorate lexicalDecorate, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lexicalDecorate = null;
        }
        c37999pIm.EZpvd(richTextRoot, lexicalDecorate);
    }

    public final void EZpvd(RichTextRoot richTextRoot, LexicalDecorate lexicalDecorate) {
        if (richTextRoot != null) {
            try {
                this.AEQbTJ.EZpvd.removeAllViews();
                richTextRoot.getRoot().getChildren();
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                C37993pIg c37993pIg = new C37993pIg();
                if (lexicalDecorate != null) {
                    c37993pIg.KWHzl(lexicalDecorate);
                }
                int size = richTextRoot.getRoot().getChildren().size();
                int i = 0;
                while (i < size) {
                    BaseRichTextBlock baseRichTextBlock = richTextRoot.getRoot().getChildren().get(i);
                    if (baseRichTextBlock instanceof RichTextTable) {
                        android.content.Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        C38001pIo c38001pIoKWHzl = c37993pIg.KWHzl(context, (RichTextTable) baseRichTextBlock, lexicalDecorate);
                        c38001pIoKWHzl.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        this.AEQbTJ.EZpvd.addView(c38001pIoKWHzl);
                    } else {
                        int i2 = i + 1;
                        if (i2 == richTextRoot.getRoot().getChildren().size()) {
                            android.widget.LinearLayout linearLayout = this.AEQbTJ.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                            AEQbTJ(spannableStringBuilder, c37993pIg, baseRichTextBlock, linearLayout, true);
                        } else if (!(richTextRoot.getRoot().getChildren().get(i2) instanceof RichTextTable)) {
                            spannableStringBuilder.append((java.lang.CharSequence) c37993pIg.EZpvd(baseRichTextBlock, i == 0));
                        } else {
                            android.widget.LinearLayout linearLayout2 = this.AEQbTJ.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                            generateTextView$default(this, spannableStringBuilder, c37993pIg, baseRichTextBlock, linearLayout2, false, 16, null);
                        }
                    }
                    i++;
                }
                invalidate();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ void generateTextView$default(C37999pIm c37999pIm, android.text.SpannableStringBuilder spannableStringBuilder, C37993pIg c37993pIg, BaseRichTextBlock baseRichTextBlock, android.widget.LinearLayout linearLayout, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c37999pIm.AEQbTJ(spannableStringBuilder, c37993pIg, baseRichTextBlock, linearLayout, z);
    }

    public final void AEQbTJ(android.text.SpannableStringBuilder spannableStringBuilder, C37993pIg c37993pIg, BaseRichTextBlock baseRichTextBlock, android.widget.LinearLayout linearLayout, boolean z) {
        spannableStringBuilder.append((java.lang.CharSequence) C37993pIg.startRenderSingle$default(c37993pIg, baseRichTextBlock, false, 2, null));
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C37997pIk c37997pIk = new C37997pIk(context);
        java.lang.Integer num = this.copydefault;
        if (num != null) {
            c37997pIk.setTextColor(num.intValue());
        }
        android.graphics.Typeface typeface = this.OLrzqt;
        if (typeface != null) {
            c37997pIk.setTypeface(typeface);
        }
        java.lang.Float f = this.EZpvd;
        if (f != null) {
            c37997pIk.setTextSize(f.floatValue());
        }
        java.lang.Integer num2 = this.KWHzl;
        if (num2 != null) {
            num2.intValue();
            java.lang.Integer num3 = this.KWHzl;
            if (num3 != null && num3.intValue() == 8388627) {
                c37997pIk.setTextAlignment(5);
            } else if (num3 != null && num3.intValue() == 17) {
                c37997pIk.setTextAlignment(4);
            } else if (num3 != null && num3.intValue() == 8388629) {
                c37997pIk.setTextAlignment(6);
            }
        }
        c37997pIk.setText(spannableStringBuilder);
        c37997pIk.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(c37997pIk);
        spannableStringBuilder.clear();
    }

    public final void setCustomTextColor(int i) {
        this.copydefault = java.lang.Integer.valueOf(i);
    }

    public final void setCustomTextSize(float f) {
        this.EZpvd = java.lang.Float.valueOf(f);
    }

    public final void setCustomGravity(int i) {
        this.KWHzl = java.lang.Integer.valueOf(i);
        pUU.KWHzl("====", java.lang.Integer.valueOf(i));
    }

    @Override // o.InterfaceC28104kPa
    public void setLexicalRichData(RichTextRoot richTextRoot, LexicalDecorate lexicalDecorate) {
        EZpvd(richTextRoot, lexicalDecorate);
    }
}
