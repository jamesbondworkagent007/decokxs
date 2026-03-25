package o;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import com.immomo.mls.fun.other.BlueLinkTag;
import com.immomo.mls.fun.other.CoinTag;
import com.immomo.mls.fun.other.ContentTagList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7875asA extends android.widget.LinearLayout {
    public int AYXKKw;
    public boolean AhwBna;
    public java.lang.String AkhnZx;
    public final C7917asq AuCTel;
    public int DbNXlk;
    public final android.view.View EZpvd;
    public CoinTag KWHzl;
    public final android.widget.TextView OLrzqt;
    public Function0<Unit> copydefault;
    public final C7917asq djBIcL;
    public boolean ejfBZ;
    public int fARcdN;
    public Function1<? super BlueLinkTag, Unit> fIwbmz;
    public java.lang.String fJNWhG;
    public int fetchVPNInfo;
    public final int gEmmrt;
    public final android.view.View isConnected;
    public java.lang.String valueOf;
    public int values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7875asA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7875asA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void KWHzl(int i) {
        if (this.AYXKKw != i) {
            this.ejfBZ = true;
        }
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.fARcdN = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.asA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C7875asA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: o.asA$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.asA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7875asA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = -1;
        this.AkhnZx = "";
        this.KWHzl = new CoinTag((ContentTagList) null, 1, (DefaultConstructorMarker) null);
        this.AYXKKw = -1;
        this.valueOf = "";
        this.fJNWhG = "";
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.EZpvd);
        this.gEmmrt = iCopydefault;
        this.fetchVPNInfo = iCopydefault;
        setOrientation(1);
        android.view.View.inflate(context, C7343ahz.Activity.fARcdN, this);
        this.djBIcL = (C7917asq) findViewById(C7343ahz.TaskDescription.dNCPSb);
        this.AuCTel = (C7917asq) findViewById(C7343ahz.TaskDescription.djSkpj);
        android.widget.TextView textView = (android.widget.TextView) findViewById(C7343ahz.TaskDescription.EZpvd);
        this.OLrzqt = textView;
        this.EZpvd = findViewById(C7343ahz.TaskDescription.AhwBna);
        this.isConnected = findViewById(C7343ahz.TaskDescription.AubY);
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.asD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C7875asA.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(C7875asA c7875asA, android.view.View view) {
        Function0<Unit> function0 = c7875asA.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ void setTextColorAndMoreTextColor$default(C7875asA c7875asA, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        c7875asA.setTextColorAndMoreTextColor(num, num2);
    }

    public final void setTextColorAndMoreTextColor(java.lang.Integer num, java.lang.Integer num2) {
        if (num != null) {
            num.intValue();
            this.djBIcL.setTextColor(num.intValue());
            this.AuCTel.setTextColor(num.intValue());
        }
        if (num2 != null) {
            this.OLrzqt.setTextColor(num2.intValue());
        }
    }

    public static final Unit OLrzqt(BlueLinkTag blueLinkTag) {
        Intrinsics.checkNotNullParameter(blueLinkTag, "");
        return Unit.INSTANCE;
    }

    public final void setTextAndAvatars(@NotNull java.lang.String str, int i, boolean z, int i2, @NotNull Function0<Unit> function0, java.lang.Integer num, @NotNull CoinTag coinTag, @NotNull Function1<? super BlueLinkTag, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(coinTag, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.values = i;
        this.AhwBna = z;
        this.fetchVPNInfo = num != null ? num.intValue() : this.gEmmrt;
        this.fetchVPNInfo = KWHzl(this.fARcdN, num);
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) str);
        this.AkhnZx = str;
        this.DbNXlk = i2;
        this.copydefault = function0;
        this.KWHzl = coinTag;
        this.fIwbmz = function1;
        EZpvd();
        if (this.AhwBna) {
            this.OLrzqt.setText(C33070mpX.AYXKKw(C7343ahz.Fragment.AuCTel));
        } else {
            this.OLrzqt.setText(C33070mpX.AYXKKw(C7343ahz.Fragment.isConnected));
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = KWHzl(str);
        if (this.ejfBZ || !zEZpvd) {
            this.valueOf = pairKWHzl.getFirst();
            this.fJNWhG = pairKWHzl.getSecond();
            if (this.AYXKKw == -1) {
                return;
            }
            OLrzqt();
            if (i2 == -1) {
                this.AhwBna = false;
                this.EZpvd.setVisibility(8);
            }
        }
    }

    public final int KWHzl(int i, java.lang.Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return i > 1 ? C33070mpX.copydefault(C52761wXj.Activity.invokespecialaKhcqp) : this.gEmmrt;
    }

    /* JADX INFO: renamed from: o.asA$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.util.List<BlueLinkTag> AEQbTJ;
        public final /* synthetic */ int EZpvd;

        public ActionBar(java.util.List<BlueLinkTag> list, int i) {
            this.AEQbTJ = list;
            this.EZpvd = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.AEQbTJ.get(this.EZpvd));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: o.asA$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.util.List<BlueLinkTag> EZpvd;
        public final /* synthetic */ int copydefault;

        public Application(java.util.List<BlueLinkTag> list, int i) {
            this.EZpvd = list;
            this.copydefault = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.EZpvd.get(this.copydefault));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: o.asA$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ java.util.List<BlueLinkTag> OLrzqt;

        public TaskDescription(java.util.List<BlueLinkTag> list, int i) {
            this.OLrzqt = list;
            this.AEQbTJ = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.OLrzqt.get(this.AEQbTJ));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: o.asA$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.util.List<BlueLinkTag> KWHzl;
        public final /* synthetic */ int OLrzqt;

        public StateListAnimator(java.util.List<BlueLinkTag> list, int i) {
            this.KWHzl = list;
            this.OLrzqt = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.KWHzl.get(this.OLrzqt));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: o.asA$LoaderManager */
    public static final class LoaderManager extends android.text.style.ClickableSpan {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ java.util.List<BlueLinkTag> OLrzqt;

        public LoaderManager(java.util.List<BlueLinkTag> list, int i) {
            this.OLrzqt = list;
            this.AEQbTJ = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.OLrzqt.get(this.AEQbTJ));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: o.asA$FragmentManager */
    public static final class FragmentManager extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.util.List<BlueLinkTag> EZpvd;
        public final /* synthetic */ int OLrzqt;

        public FragmentManager(java.util.List<BlueLinkTag> list, int i) {
            this.EZpvd = list;
            this.OLrzqt = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.EZpvd.get(this.OLrzqt));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: o.asA$Dialog */
    public static final class Dialog extends android.text.style.ClickableSpan {
        public final /* synthetic */ java.util.List<BlueLinkTag> AEQbTJ;
        public final /* synthetic */ int copydefault;

        public Dialog(java.util.List<BlueLinkTag> list, int i) {
            this.AEQbTJ = list;
            this.copydefault = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.AEQbTJ.get(this.copydefault));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: renamed from: o.asA$Fragment */
    public static final class Fragment extends android.text.style.ClickableSpan {
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ java.util.List<BlueLinkTag> KWHzl;

        public Fragment(java.util.List<BlueLinkTag> list, int i) {
            this.KWHzl = list;
            this.EZpvd = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = C7875asA.this.fIwbmz;
            if (function1 != null) {
                function1.invoke(this.KWHzl.get(this.EZpvd));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    public static final void KWHzl(C7875asA c7875asA) {
        if (c7875asA.EZpvd.getVisibility() == 0) {
            Paint.FontMetricsInt fontMetricsInt = c7875asA.djBIcL.getPaint().getFontMetricsInt();
            int i = fontMetricsInt.descent;
            int i2 = fontMetricsInt.ascent;
            android.view.View view = c7875asA.EZpvd;
            int lineHeight = c7875asA.djBIcL.getLineHeight();
            Intrinsics.checkNotNullExpressionValue(c7875asA.getContext(), "");
            C55296xhK.margin$default(view, null, java.lang.Float.valueOf(C55298xhM.EZpvd(lineHeight - (i - i2), r4)), null, null, 13, null);
        }
        c7875asA.djBIcL.requestLayout();
        c7875asA.djBIcL.invalidate();
        c7875asA.AuCTel.requestLayout();
        c7875asA.AuCTel.invalidate();
    }

    public final void EZpvd() {
        KWHzl(-1);
        this.fJNWhG = "";
        this.valueOf = "";
        this.AuCTel.setText("");
        this.djBIcL.setText("");
    }

    public final int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, i3, false, 4, (java.lang.Object) null);
            if (iIndexOf$default == -1) {
                return -1;
            }
            i2++;
            if (i2 == i) {
                return iIndexOf$default;
            }
            i3 = iIndexOf$default + 1;
        }
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        if (this.values <= 0) {
            return C56390yDp.OLrzqt("", "");
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return C56390yDp.OLrzqt("", str);
        }
        android.text.StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), this.djBIcL.getPaint(), this.values).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
        KWHzl(staticLayoutBuild.getLineCount());
        pUU.KWHzl("OKMarketMulLineView", "lineCount = " + this.AYXKKw);
        if (this.DbNXlk == -1) {
            return C56390yDp.OLrzqt(str, "");
        }
        if (!this.AhwBna) {
            if (staticLayoutBuild.getLineCount() <= 7) {
                return C56390yDp.OLrzqt(str, "");
            }
            try {
                Result.Application application = Result.Companion;
                int lineStart = staticLayoutBuild.getLineStart(6);
                java.lang.String strSubstring = str.substring(0, lineStart);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                java.lang.String strSubstring2 = str.substring(lineStart, str.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                objM7377constructorimpl2 = Result.m7377constructorimpl(new kotlin.Pair(strSubstring, strSubstring2));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            kotlin.Pair pair = new kotlin.Pair(str, "");
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                objM7377constructorimpl2 = pair;
            }
            return (kotlin.Pair) objM7377constructorimpl2;
        }
        int i = this.AYXKKw;
        if (i <= 1) {
            return C56390yDp.OLrzqt("", str);
        }
        try {
            Result.Application application3 = Result.Companion;
            int lineStart2 = staticLayoutBuild.getLineStart(java.lang.Math.min(i - 1, 6));
            java.lang.String strSubstring3 = str.substring(0, lineStart2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            java.lang.String strSubstring4 = str.substring(lineStart2, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            objM7377constructorimpl = Result.m7377constructorimpl(new kotlin.Pair(strSubstring3, strSubstring4));
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        kotlin.Pair pair2 = new kotlin.Pair(str, "");
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = pair2;
        }
        return (kotlin.Pair) objM7377constructorimpl;
    }

    public final void OLrzqt() {
        int i;
        int i2;
        java.util.List<java.lang.Integer> list;
        int i3 = this.AYXKKw;
        int i4 = 0;
        if (i3 > 7) {
            this.djBIcL.setVisibility(0);
            this.EZpvd.setVisibility(0);
        } else if (i3 == 0) {
            this.djBIcL.setVisibility(8);
            this.EZpvd.setVisibility(8);
        } else if (this.AhwBna && i3 == 1) {
            this.djBIcL.setVisibility(8);
            this.EZpvd.setVisibility(0);
        } else {
            this.djBIcL.setVisibility(0);
            this.EZpvd.setVisibility(this.AhwBna ? 0 : 8);
        }
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        this.isConnected.setForeground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{c33512mxp.AEQbTJ(this.fetchVPNInfo, 0.0f), c33512mxp.AEQbTJ(this.fetchVPNInfo, 1.0f)}));
        java.util.List<BlueLinkTag> cashtagList = this.KWHzl.getContentTagList().getCashtagList();
        java.util.List<BlueLinkTag> hashtagList = this.KWHzl.getContentTagList().getHashtagList();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.valueOf);
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(this.fJNWhG);
        int size = cashtagList.size();
        int i5 = 0;
        while (true) {
            int i6 = -1;
            if (i5 >= size) {
                break;
            }
            java.lang.String tag = cashtagList.get(i5).getTag();
            java.util.List<java.lang.Integer> position = cashtagList.get(i5).getPosition();
            int size2 = position.size();
            int i7 = i4;
            while (i7 < size2) {
                int iAEQbTJ = AEQbTJ(this.AkhnZx, tag, position.get(i7).intValue());
                pUU.KWHzl("qjf", "OKMarketMulLineView---findNthMatchIndex = " + iAEQbTJ);
                if (iAEQbTJ == i6) {
                    i2 = size;
                } else if (this.valueOf.length() - iAEQbTJ >= tag.length()) {
                    i2 = size;
                    spannableStringBuilder.setSpan(new ActionBar(cashtagList, i5), iAEQbTJ, tag.length() + iAEQbTJ, 33);
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), iAEQbTJ, tag.length() + iAEQbTJ, 33);
                } else {
                    i2 = size;
                    if (iAEQbTJ - this.valueOf.length() < 0) {
                        spannableStringBuilder.setSpan(new Application(cashtagList, i5), iAEQbTJ, this.valueOf.length(), 33);
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), iAEQbTJ, this.valueOf.length(), 33);
                        list = position;
                        spannableStringBuilder2.setSpan(new TaskDescription(cashtagList, i5), 0, tag.length() - (this.valueOf.length() - iAEQbTJ), 33);
                        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), 0, tag.length() - (this.valueOf.length() - iAEQbTJ), 33);
                    } else {
                        list = position;
                        spannableStringBuilder2.setSpan(new StateListAnimator(cashtagList, i5), iAEQbTJ - this.valueOf.length(), (iAEQbTJ - this.valueOf.length()) + tag.length(), 33);
                        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), iAEQbTJ - this.valueOf.length(), (iAEQbTJ - this.valueOf.length()) + tag.length(), 33);
                    }
                    i7++;
                    size = i2;
                    position = list;
                    i6 = -1;
                }
                list = position;
                i7++;
                size = i2;
                position = list;
                i6 = -1;
            }
            i5++;
            i4 = 0;
        }
        int size3 = hashtagList.size();
        for (int i8 = 0; i8 < size3; i8++) {
            java.lang.String tag2 = hashtagList.get(i8).getTag();
            java.util.List<java.lang.Integer> position2 = hashtagList.get(i8).getPosition();
            int size4 = position2.size();
            int i9 = 0;
            while (i9 < size4) {
                int iAEQbTJ2 = AEQbTJ(this.AkhnZx, tag2, position2.get(i9).intValue());
                pUU.KWHzl("qjf", "OKMarketMulLineView---findNthMatchIndex = " + iAEQbTJ2);
                if (iAEQbTJ2 == -1) {
                    i = size3;
                } else if (this.valueOf.length() - iAEQbTJ2 >= tag2.length()) {
                    spannableStringBuilder.setSpan(new LoaderManager(hashtagList, i8), iAEQbTJ2, tag2.length() + iAEQbTJ2, 33);
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), iAEQbTJ2, tag2.length() + iAEQbTJ2, 33);
                    i = size3;
                } else if (iAEQbTJ2 - this.valueOf.length() < 0) {
                    spannableStringBuilder.setSpan(new FragmentManager(hashtagList, i8), iAEQbTJ2, this.valueOf.length(), 33);
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), iAEQbTJ2, this.valueOf.length(), 33);
                    i = size3;
                    spannableStringBuilder2.setSpan(new Dialog(hashtagList, i8), 0, tag2.length() - (this.valueOf.length() - iAEQbTJ2), 33);
                    spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), 0, tag2.length() - (this.valueOf.length() - iAEQbTJ2), 33);
                } else {
                    i = size3;
                    spannableStringBuilder2.setSpan(new Fragment(hashtagList, i8), iAEQbTJ2 - this.valueOf.length(), (iAEQbTJ2 - this.valueOf.length()) + tag2.length(), 33);
                    spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), iAEQbTJ2 - this.valueOf.length(), (iAEQbTJ2 - this.valueOf.length()) + tag2.length(), 33);
                }
                i9++;
                size3 = i;
            }
        }
        if (C7911ask.KWHzl(spannableStringBuilder)) {
            this.djBIcL.setText(spannableStringBuilder);
            this.djBIcL.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        } else {
            this.djBIcL.setText(this.valueOf);
        }
        if (C7911ask.KWHzl(spannableStringBuilder2)) {
            this.AuCTel.setText(spannableStringBuilder2);
            this.AuCTel.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        } else {
            this.AuCTel.setText(this.fJNWhG);
        }
        pUU.KWHzl("OKMarketMulLineView", "updateUI = request Layout");
        if (this.ejfBZ) {
            post(new java.lang.Runnable() { // from class: o.asC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C7875asA.KWHzl(this.EZpvd);
                }
            });
        }
    }
}
