package o;

import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLink;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichSubtitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTitle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TitleLink;
import com.okinc.ok_kyc_core.data.remote.networkmodel.TitleStepper;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42274rMu extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final C42519rVw EZpvd;
    public final AbstractC43902rxz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42274rMu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42274rMu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.rMu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42274rMu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42274rMu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.iZzfmt, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC43902rxz) viewDataBindingInflate;
        this.EZpvd = new C42519rVw(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: o.rMu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rMu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.rMu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindData$default(C42274rMu c42274rMu, java.lang.String str, java.lang.String str2, java.lang.String str3, TitleStepper titleStepper, RichTitle richTitle, RichSubtitle richSubtitle, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "ALIGN_LEADING";
        }
        if ((i & 8) != 0) {
            titleStepper = null;
        }
        if ((i & 16) != 0) {
            richTitle = null;
        }
        if ((i & 32) != 0) {
            richSubtitle = null;
        }
        if ((i & 64) != 0) {
            function1 = null;
        }
        c42274rMu.KWHzl(str, str2, str3, titleStepper, richTitle, richSubtitle, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, TitleStepper titleStepper, RichTitle richTitle, RichSubtitle richSubtitle, final Function1<? super CTAButtonAppModel, Unit> function1) {
        java.lang.String text;
        pUU.EZpvd("qjf", "HeaderItemView--title=" + str + " ,subtitle = " + str2 + " ,align=" + str3);
        java.lang.CharSequence charSequenceAEQbTJ = AEQbTJ(titleStepper);
        char c = 0;
        if (charSequenceAEQbTJ == null || charSequenceAEQbTJ.length() == 0) {
            this.copydefault.AEQbTJ.setVisibility(8);
        } else {
            this.copydefault.AEQbTJ.setVisibility(0);
            this.copydefault.AEQbTJ.setText(charSequenceAEQbTJ);
        }
        java.lang.CharSequence charSequenceEZpvd = EZpvd(str, titleStepper, richTitle);
        if (charSequenceEZpvd == null || charSequenceEZpvd.length() == 0) {
            this.copydefault.copydefault.setVisibility(8);
        } else {
            this.copydefault.copydefault.setVisibility(0);
            this.copydefault.copydefault.setText(charSequenceEZpvd);
        }
        if (richSubtitle != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) richSubtitle.getText())) {
                this.copydefault.KWHzl.setVisibility(0);
                this.copydefault.KWHzl.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                java.util.HashMap<java.lang.String, CtaLink> ctaLink = richSubtitle.getCtaLink();
                java.lang.CharSequence charSequence = "";
                if (ctaLink != null) {
                    java.util.HashMap map = new java.util.HashMap();
                    for (Map.Entry<java.lang.String, CtaLink> entry : ctaLink.entrySet()) {
                        java.lang.String key = entry.getKey();
                        CTAButtonAppModel cta = entry.getValue().getCta();
                        if (cta == null || (text = cta.getText()) == null) {
                            text = "";
                        }
                        map.put(key, text);
                    }
                    java.lang.String text2 = richSubtitle.getText();
                    if (text2 == null) {
                        text2 = "";
                    }
                    java.lang.CharSequence charSequenceOLrzqt = C33069mpW.OLrzqt(text2, map);
                    for (final Map.Entry<java.lang.String, CtaLink> entry2 : ctaLink.entrySet()) {
                        final CTAButtonAppModel cta2 = entry2.getValue().getCta();
                        if (cta2 != null) {
                            java.lang.CharSequence charSequence2 = charSequenceOLrzqt;
                            java.lang.String[] strArr = new java.lang.String[1];
                            java.lang.String text3 = cta2.getText();
                            if (text3 == null) {
                                text3 = "";
                            }
                            strArr[c] = text3;
                            charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequence2, strArr, 0, null, false, new Function1() { // from class: o.rMv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C42274rMu.EZpvd(entry2, this, function1, cta2, (java.util.List) obj);
                                }
                            }, 14, null);
                        }
                        c = 0;
                    }
                    java.lang.CharSequence charSequence3 = charSequenceOLrzqt;
                    if (charSequence3 == null) {
                        java.lang.String text4 = richSubtitle.getText();
                        if (text4 != null) {
                            charSequence = text4;
                        }
                    } else {
                        charSequence = charSequence3;
                    }
                    this.copydefault.KWHzl.setText(charSequence);
                }
            } else {
                this.copydefault.KWHzl.setVisibility(8);
            }
        } else if (str2 == null || str2.length() == 0) {
            this.copydefault.KWHzl.setVisibility(8);
        } else {
            this.copydefault.KWHzl.setVisibility(0);
            this.copydefault.KWHzl.setText(str2);
        }
        if ((charSequenceAEQbTJ == null || charSequenceAEQbTJ.length() == 0) && ((charSequenceEZpvd == null || charSequenceEZpvd.length() == 0) && ((str2 == null || str2.length() == 0) && richSubtitle == null))) {
            this.copydefault.EZpvd.setVisibility(8);
        }
        if (str3 != null) {
            int iHashCode = str3.hashCode();
            if (iHashCode == -1364013995) {
                if (str3.equals(TtmlNode.CENTER)) {
                    AEQbTJ(17);
                }
            } else if (iHashCode == 50359046) {
                if (str3.equals("leading")) {
                    AEQbTJ(8388611);
                }
            } else if (iHashCode == 1276059676 && str3.equals("trailing")) {
                AEQbTJ(8388613);
            }
        }
    }

    public static final Unit EZpvd(Map.Entry entry, C42274rMu c42274rMu, Function1 function1, CTAButtonAppModel cTAButtonAppModel, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (((CtaLink) entry.getValue()).getStyle() == null) {
            list.add(new android.text.style.StyleSpan(1));
        } else {
            LinkTextStyle style = ((CtaLink) entry.getValue()).getStyle();
            if (style != null && Intrinsics.EZpvd(style.isBold(), java.lang.Boolean.TRUE)) {
                list.add(new android.text.style.StyleSpan(1));
            }
        }
        list.add(new Application(entry, c42274rMu, function1, cTAButtonAppModel));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rMu$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ C42274rMu AEQbTJ;
        public final /* synthetic */ Function1<CTAButtonAppModel, Unit> EZpvd;
        public final /* synthetic */ CTAButtonAppModel KWHzl;
        public final /* synthetic */ Map.Entry<java.lang.String, CtaLink> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Map.Entry<java.lang.String, CtaLink> entry, C42274rMu c42274rMu, Function1<? super CTAButtonAppModel, Unit> function1, CTAButtonAppModel cTAButtonAppModel) {
            this.copydefault = entry;
            this.AEQbTJ = c42274rMu;
            this.EZpvd = function1;
            this.KWHzl = cTAButtonAppModel;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            rQR rqr = rQR.AEQbTJ;
            LinkTextStyle style = this.copydefault.getValue().getStyle();
            java.lang.Integer numAYXKKw = rqr.AYXKKw(style != null ? style.getLinkColor() : null, this.AEQbTJ.EZpvd);
            if (numAYXKKw != null) {
                textPaint.setColor(numAYXKKw.intValue());
            }
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<CTAButtonAppModel, Unit> function1 = this.EZpvd;
            if (function1 != null) {
                function1.invoke(this.KWHzl);
            }
        }
    }

    public static /* synthetic */ java.lang.CharSequence getFirstLine$default(C42274rMu c42274rMu, TitleStepper titleStepper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            titleStepper = null;
        }
        return c42274rMu.AEQbTJ(titleStepper);
    }

    public final java.lang.CharSequence AEQbTJ(TitleStepper titleStepper) {
        if (titleStepper != null) {
            if (titleStepper.getInstructionText() != null && C33129mqd.OLrzqt((java.lang.CharSequence) titleStepper.getInstructionText())) {
                return C33061mpO.setupSpanStyles$default(titleStepper.getInstructionText(), new java.lang.String[]{titleStepper.getInstructionText()}, 0, null, false, new Function1() { // from class: o.rMw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42274rMu.OLrzqt(this.EZpvd, (java.util.List) obj);
                    }
                }, 14, null);
            }
            if (titleStepper.getCurrentStep() != null && titleStepper.getTotalSteps() != null) {
                return C33061mpO.setupSpanStyles$default(titleStepper.getCurrentStep() + " / " + titleStepper.getTotalSteps(), new java.lang.String[]{titleStepper.getCurrentStep() + " / " + titleStepper.getTotalSteps()}, 0, null, false, new Function1() { // from class: o.rMx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42274rMu.EZpvd(this.copydefault, (java.util.List) obj);
                    }
                }, 14, null);
            }
        }
        return null;
    }

    public static final Unit OLrzqt(C42274rMu c42274rMu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42274rMu.getContext(), C52761wXj.LoaderManager.zuBGHE));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C42274rMu c42274rMu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42274rMu.getContext(), C52761wXj.LoaderManager.zuBGHE));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.CharSequence getSecondLine$default(C42274rMu c42274rMu, java.lang.String str, TitleStepper titleStepper, RichTitle richTitle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            titleStepper = null;
        }
        if ((i & 4) != 0) {
            richTitle = null;
        }
        return c42274rMu.EZpvd(str, titleStepper, richTitle);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x002a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence EZpvd(java.lang.String str, TitleStepper titleStepper, RichTitle richTitle) {
        java.lang.String text;
        if (titleStepper != null) {
            java.lang.String title = titleStepper.getTitle();
            java.lang.String str2 = title == null ? "" : title;
            java.lang.CharSequence charSequence = C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.rMt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42274rMu.valueOf(this.copydefault, (java.util.List) obj);
                }
            }, 14, null) : null;
            if (charSequence != null) {
                return charSequence;
            }
        }
        if (richTitle != null) {
            java.util.HashMap<java.lang.String, TitleLink> link = richTitle.getLink();
            if (link != null) {
                java.util.HashMap map = new java.util.HashMap();
                for (Map.Entry<java.lang.String, TitleLink> entry : link.entrySet()) {
                    java.lang.String key = entry.getKey();
                    TitleLink value = entry.getValue();
                    if (value == null || (text = value.getText()) == null) {
                        text = "";
                    }
                    map.put(key, text);
                }
                java.lang.String text2 = richTitle.getText();
                if (text2 == null) {
                    text2 = "";
                }
                java.lang.CharSequence charSequenceOLrzqt = C33069mpW.OLrzqt(text2, map);
                java.util.Iterator<Map.Entry<java.lang.String, TitleLink>> it = link.entrySet().iterator();
                while (it.hasNext()) {
                    final TitleLink value2 = it.next().getValue();
                    java.lang.CharSequence charSequence2 = charSequenceOLrzqt;
                    java.lang.String[] strArr = new java.lang.String[1];
                    java.lang.String text3 = value2.getText();
                    if (text3 == null) {
                        text3 = "";
                    }
                    strArr[0] = text3;
                    charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequence2, strArr, 0, null, false, new Function1() { // from class: o.rMB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C42274rMu.OLrzqt(value2, this, (java.util.List) obj);
                        }
                    }, 14, null);
                }
                str = charSequenceOLrzqt;
                if (str == 0) {
                    str = richTitle.getText();
                    if (str == 0) {
                        str = "";
                    }
                }
            }
        }
        return str;
    }

    public static final Unit valueOf(C42274rMu c42274rMu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c42274rMu.getContext(), C52761wXj.LoaderManager.dUDNAs));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rMu$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ TitleLink OLrzqt;
        public final /* synthetic */ C42274rMu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public TaskDescription(TitleLink titleLink, C42274rMu c42274rMu) {
            this.OLrzqt = titleLink;
            this.copydefault = c42274rMu;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(rQR.AEQbTJ.AEQbTJ(this.OLrzqt.getColor(), this.copydefault.EZpvd));
        }
    }

    public static final Unit OLrzqt(TitleLink titleLink, C42274rMu c42274rMu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TaskDescription(titleLink, c42274rMu));
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(int i) {
        this.copydefault.AEQbTJ.setGravity(i);
        this.copydefault.copydefault.setGravity(i);
        this.copydefault.KWHzl.setGravity(i);
    }

    public final void setHeaderMarginVertical(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.copydefault.EZpvd.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = i2;
        this.copydefault.EZpvd.setLayoutParams(marginLayoutParams);
    }
}
