package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.market.ext.UpDownColor;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.qpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41375qpd extends C40499qYc {
    public java.lang.String AYXKKw;
    public boolean AhwBna;
    public java.lang.CharSequence AkhnZx;
    public java.lang.Integer AuCTel;
    public UpDownColor DbNXlk;
    public java.lang.String djBIcL;
    public java.util.List<java.lang.String> ejfBZ;
    public java.lang.Integer fARcdN;
    public final float fIwbmz;
    public final int fJNWhG;
    public java.lang.CharSequence fetchVPNInfo;
    public java.lang.CharSequence gEmmrt;
    public final float getFieldNames;
    public final boolean getNewProxyInstance;
    public final float hDKMBd;
    public java.lang.CharSequence isConnected;
    public int uzCIH;
    public final C42861reR valueOf;
    public kotlin.Pair<java.lang.String, java.lang.String> values;
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static final java.util.Map<java.lang.String, SoftReference<kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer>>> copydefault = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, SoftReference<kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer>>> AEQbTJ = new LinkedHashMap();
    public static final int OLrzqt = C52761wXj.Activity.Dmq;
    public static final int KWHzl = C52761wXj.Activity.invokespecialDPHOMC;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41375qpd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41375qpd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:46) call: o.qpd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41375qpd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41375qpd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        int iDjBIcL = C33570myu.djBIcL(context);
        this.fJNWhG = iDjBIcL;
        this.uzCIH = iDjBIcL;
        this.values = new kotlin.Pair<>("", "");
        this.gEmmrt = "";
        this.fetchVPNInfo = "";
        this.AYXKKw = "";
        if (isInEditMode()) {
            this.fIwbmz = 15.0f;
            this.getFieldNames = 15.0f;
            this.hDKMBd = 12.0f;
            this.getNewProxyInstance = false;
        } else {
            this.fIwbmz = C55298xhM.gEmmrt(15.0f, context);
            this.getFieldNames = C55298xhM.gEmmrt(14.0f, context);
            this.hDKMBd = C55298xhM.gEmmrt(12.0f, context);
            this.getNewProxyInstance = C33492mxV.OLrzqt();
        }
        this.valueOf = C42861reR.OLrzqt(android.view.LayoutInflater.from(context), this);
    }

    /* JADX INFO: renamed from: o.qpd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qpd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qpd$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlin.Pair getOrCreateClickableIconSpan$OKMarket_market_impl$default(Activity activity, android.view.View view, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return activity.OLrzqt(view, function0);
        }

        public final kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> OLrzqt(@NotNull android.view.View view, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(view, "");
            android.graphics.Bitmap bitmapViewToBitmap$default = C55296xhK.viewToBitmap$default(view, 0, 0, 3, null);
            if (bitmapViewToBitmap$default != null) {
                return C56390yDp.OLrzqt(new C40547qZx(bitmapViewToBitmap$default, function0), java.lang.Integer.valueOf(bitmapViewToBitmap$default.getWidth()));
            }
            return null;
        }

        public final kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> OLrzqt(boolean z, java.util.List<java.lang.String> list, @NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup, java.lang.Integer num, java.lang.Integer num2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (list != null && !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) it.next())) {
                        java.lang.String str = list + "_" + z;
                        SoftReference softReference = (SoftReference) C41375qpd.copydefault.get(str);
                        kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pair = softReference != null ? (kotlin.Pair) softReference.get() : null;
                        if (pair != null) {
                            return pair;
                        }
                        C42862reS c42862reSEZpvd = C42862reS.EZpvd(android.view.LayoutInflater.from(context), viewGroup, false);
                        Intrinsics.checkNotNullExpressionValue(c42862reSEZpvd, "");
                        int i = 0;
                        for (java.lang.Object obj : yDY.gEmmrt(c42862reSEZpvd.AEQbTJ, c42862reSEZpvd.KWHzl)) {
                            if (i < 0) {
                                yDY.AYXKKw();
                            }
                            android.widget.TextView textView = (android.widget.TextView) obj;
                            java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list, i);
                            textView.setText(str2);
                            textView.setTextColor(C33070mpX.OLrzqt(num != null ? num.intValue() : C41375qpd.OLrzqt, context));
                            textView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(num2 != null ? num2.intValue() : C41375qpd.KWHzl, context)));
                            Intrinsics.copydefault(textView);
                            textView.setVisibility((str2 == null || str2.length() == 0) ^ true ? 0 : 8);
                            i++;
                        }
                        android.widget.LinearLayout root = c42862reSEZpvd.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root, "");
                        android.graphics.Bitmap bitmapViewToBitmap$default = C55296xhK.viewToBitmap$default(root, 0, 0, 3, null);
                        if (bitmapViewToBitmap$default != null) {
                            kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pairOLrzqt = C56390yDp.OLrzqt(new qZE(bitmapViewToBitmap$default), java.lang.Integer.valueOf(bitmapViewToBitmap$default.getWidth()));
                            C41375qpd.copydefault.put(str, new SoftReference(pairOLrzqt));
                            return pairOLrzqt;
                        }
                    }
                }
            }
            return null;
        }
    }

    private final int AEQbTJ() {
        return (((this.uzCIH - C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(92, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
    }

    public final void setData(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, java.util.List<java.lang.String> list, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.String str, java.lang.CharSequence charSequence4, UpDownColor upDownColor, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.values = pair;
        this.ejfBZ = list;
        this.gEmmrt = charSequence;
        this.fetchVPNInfo = charSequence2;
        this.isConnected = charSequence3;
        this.djBIcL = str;
        this.AkhnZx = charSequence4;
        this.DbNXlk = upDownColor;
        this.AuCTel = num;
        this.fARcdN = num2;
        this.AhwBna = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
        this.AYXKKw = str2 != null ? str2 : "";
        copydefault(pair, list, charSequence, charSequence2, charSequence3, str, charSequence4, upDownColor, num, num2, bool, str2);
    }

    public final void copydefault(kotlin.Pair<java.lang.String, java.lang.String> pair, java.util.List<java.lang.String> list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.String str, java.lang.CharSequence charSequence4, UpDownColor upDownColor, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pair.getSecond())) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                str4 = ((java.lang.Object) pair.getSecond()) + " / ";
            } else {
                str4 = " / " + ((java.lang.Object) pair.getSecond());
            }
            str3 = str4;
        } else {
            str3 = "";
        }
        setAdaptiveTitle(pair.getFirst(), str3, list, charSequence2.toString(), num, num2, bool, str2);
        AppCompatTextView appCompatTextView = this.valueOf.KWHzl;
        Intrinsics.copydefault(appCompatTextView);
        int i = 8;
        appCompatTextView.setVisibility(appCompatTextView.getVisibility() == 0 && (StringsKt__StringsKt.fARcdN(charSequence) ^ true) ? 0 : 8);
        appCompatTextView.setText(charSequence);
        AppCompatTextView appCompatTextView2 = this.valueOf.AhwBna;
        Intrinsics.copydefault(appCompatTextView2);
        if (appCompatTextView2.getVisibility() == 0 && charSequence3 != null && (!StringsKt__StringsKt.fARcdN(charSequence3))) {
            i = 0;
        }
        appCompatTextView2.setVisibility(i);
        appCompatTextView2.setText(charSequence3);
        AppCompatImageView appCompatImageView = this.valueOf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, str == null ? "" : str);
        this.valueOf.copydefault.setChangeRatioAndColor(charSequence4, upDownColor);
        if (list == null || !(!list.isEmpty())) {
            AppCompatTextView appCompatTextView3 = this.valueOf.AhwBna;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            if (appCompatTextView3.getVisibility() != 0) {
                AppCompatTextView appCompatTextView4 = this.valueOf.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                ViewGroup.LayoutParams layoutParams = appCompatTextView4.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    layoutParams2.endToStart = this.valueOf.djBIcL.getId();
                    appCompatTextView4.setLayoutParams(layoutParams2);
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        AppCompatTextView appCompatTextView5 = this.valueOf.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView5.getLayoutParams();
        if (layoutParams3 != null) {
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = -2;
            layoutParams4.endToStart = -1;
            appCompatTextView5.setLayoutParams(layoutParams4);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        pUU.EZpvd("DiscoverQuotationLayout", "onSizeChanged: w=" + i + ", h=" + i2 + ", oldw=" + i3 + ", oldh=" + i4);
        if (i == i3 || i == (i5 = this.uzCIH)) {
            return;
        }
        pUU.EZpvd("DiscoverQuotationLayout", "onSizeChanged diff: w=" + i + ", oldw=" + i3 + ", foldScreenWidth=" + i5);
        this.uzCIH = i;
        post(new java.lang.Runnable() { // from class: o.qpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C41375qpd.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(C41375qpd c41375qpd) {
        kotlin.Pair<java.lang.String, java.lang.String> pair = c41375qpd.values;
        java.util.List<java.lang.String> list = c41375qpd.ejfBZ;
        java.lang.CharSequence charSequence = c41375qpd.gEmmrt;
        java.lang.CharSequence charSequence2 = c41375qpd.fetchVPNInfo;
        java.lang.CharSequence charSequence3 = c41375qpd.isConnected;
        java.lang.String str = c41375qpd.djBIcL;
        java.lang.CharSequence charSequence4 = c41375qpd.AkhnZx;
        UpDownColor upDownColor = c41375qpd.DbNXlk;
        java.lang.Integer num = c41375qpd.AuCTel;
        java.lang.Integer num2 = c41375qpd.fARcdN;
        boolean z = c41375qpd.AhwBna;
        c41375qpd.copydefault(pair, list, charSequence, charSequence2, charSequence3, str, charSequence4, upDownColor, num, num2, java.lang.Boolean.valueOf(z), c41375qpd.AYXKKw);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setAdaptiveTitle(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, java.lang.String str4) {
        kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pair;
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        java.lang.StringBuilder sb3;
        java.lang.StringBuilder sb4;
        android.text.TextPaint paint = this.valueOf.AYXKKw.getPaint();
        paint.setTextSize(this.fIwbmz);
        float fMeasureText = paint.measureText(str);
        float fMeasureText2 = paint.measureText(str3);
        paint.setTextSize(this.getFieldNames);
        float fMeasureText3 = (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2) || str2.length() == 0) ? 0.0f : paint.measureText(str2);
        Activity activity = Companion;
        boolean z = this.getNewProxyInstance;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kotlin.Pair<android.text.style.ReplacementSpan, java.lang.Integer> pairOLrzqt = activity.OLrzqt(z, list, context, this, num, num2);
        if (pairOLrzqt == null) {
            pairOLrzqt = new kotlin.Pair<>(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpanComponent1 = pairOLrzqt.component1();
        int iIntValue = pairOLrzqt.component2().intValue();
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && C27563jxZ.OLrzqt.EZpvd()) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C42979rgd c42979rgd = new C42979rgd(context2, null, 0, 6, null);
            c42979rgd.setBoostTag(str4, bool);
            pair = activity.OLrzqt(c42979rgd, new Function0() { // from class: o.qpa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C41375qpd.AEQbTJ(this.copydefault);
                }
            });
            if (pair == null) {
                pair = new kotlin.Pair<>(null, 0);
            }
        } else {
            pair = new kotlin.Pair<>(null, 0);
        }
        android.text.style.ReplacementSpan replacementSpanComponent12 = pair.component1();
        float fIntValue = iIntValue + pair.component2().intValue();
        float f = fMeasureText + fMeasureText3 + fIntValue;
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText2 + f), java.lang.Integer.valueOf(AEQbTJ()))) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            if (C55296xhK.OLrzqt(context3)) {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str2);
                sb4.append(str);
            } else {
                sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(str2);
            }
            setTextData$default(this, sb4.toString(), str, str2, replacementSpanComponent1, str3, C32113mPz.Dialog.gHZMYf, this.fIwbmz, false, replacementSpanComponent12, 128, null);
            return;
        }
        paint.setTextSize(this.hDKMBd);
        float fMeasureText4 = paint.measureText(str3);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(f + fMeasureText4), java.lang.Integer.valueOf(AEQbTJ()))) {
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            if (C55296xhK.OLrzqt(context4)) {
                sb3 = new java.lang.StringBuilder();
                sb3.append(str2);
                sb3.append(str);
            } else {
                sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(str2);
            }
            setTextData$default(this, sb3.toString(), str, str2, replacementSpanComponent1, str3, C32113mPz.Dialog.gHZMYf, this.hDKMBd, false, replacementSpanComponent12, 128, null);
            return;
        }
        paint.setTextSize(this.hDKMBd);
        float fMeasureText5 = paint.measureText(str);
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText3 + fMeasureText5 + fIntValue + fMeasureText4), java.lang.Integer.valueOf(AEQbTJ()))) {
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            if (C55296xhK.OLrzqt(context5)) {
                sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(str);
            } else {
                sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(str2);
            }
            setTextData$default(this, sb2.toString(), str, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.hDKMBd, false, replacementSpanComponent12, 128, null);
            return;
        }
        if (C33129mqd.valueOf(java.lang.Float.valueOf(fMeasureText5 + fMeasureText4), java.lang.Integer.valueOf(AEQbTJ()))) {
            setTextData(str + "\n" + str2, str, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.hDKMBd, true, replacementSpanComponent12);
            return;
        }
        Intrinsics.copydefault(paint);
        java.lang.String strAkhnZx = C59454zhO.AkhnZx(str, KWHzl(str, paint, AEQbTJ() - fMeasureText4));
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(strAkhnZx + "...");
            setTextData(strAEQbTJ + "\n" + str2, strAEQbTJ, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.hDKMBd, true, replacementSpanComponent12);
            return;
        }
        android.content.Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        if (C55296xhK.OLrzqt(context6)) {
            sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(str);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
        }
        setTextData$default(this, sb.toString(), str, str2, replacementSpanComponent1, str3, qZH.FragmentManager.AEQbTJ, this.hDKMBd, false, replacementSpanComponent12, 128, null);
    }

    public static final Unit AEQbTJ(C41375qpd c41375qpd) {
        xWA xwa;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
        if (listKWHzl != null && (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) != null) {
            android.content.Context context = c41375qpd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            xwa.AEQbTJ(context);
        }
        return Unit.INSTANCE;
    }

    private final int KWHzl(java.lang.String str, android.graphics.Paint paint, float f) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float fMeasureText = paint.measureText(java.lang.String.valueOf(str.charAt(i2)));
            if (!C33129mqd.copydefault(java.lang.Float.valueOf(f), java.lang.Float.valueOf(fMeasureText))) {
                break;
            }
            f -= fMeasureText;
            i++;
        }
        return i;
    }

    public static /* synthetic */ void setTextData$default(C41375qpd c41375qpd, java.lang.String str, java.lang.String str2, java.lang.String str3, android.text.style.ReplacementSpan replacementSpan, java.lang.String str4, int i, float f, boolean z, android.text.style.ReplacementSpan replacementSpan2, int i2, java.lang.Object obj) {
        c41375qpd.setTextData(str, str2, str3, replacementSpan, str4, i, f, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : replacementSpan2);
    }

    public final void setTextData(java.lang.String str, java.lang.String str2, java.lang.String str3, final android.text.style.ReplacementSpan replacementSpan, java.lang.String str4, final int i, float f, boolean z, final android.text.style.ReplacementSpan replacementSpan2) {
        java.lang.String str5;
        if (replacementSpan != null) {
            str5 = ((z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) ? "" : " ") + "tag";
        } else {
            str5 = "";
        }
        java.lang.String str6 = replacementSpan2 != null ? Marker.ANY_NON_NULL_MARKER : "";
        AppCompatTextView appCompatTextView = this.valueOf.AYXKKw;
        MatchPattern matchPattern = MatchPattern.LAST_ONLY;
        appCompatTextView.setText(StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str + str5 + str6, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.qpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41375qpd.copydefault(this.KWHzl, i, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str3}, 0, null, false, new Function1() { // from class: o.qpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41375qpd.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{"tag"}, 0, matchPattern, false, new Function1() { // from class: o.qpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41375qpd.copydefault(replacementSpan, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{Marker.ANY_NON_NULL_MARKER}, 0, matchPattern, false, new Function1() { // from class: o.qph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41375qpd.OLrzqt(replacementSpan2, (java.util.List) obj);
            }
        }, 10, null)));
        this.valueOf.djBIcL.setTextSize(0, f);
        this.valueOf.djBIcL.setText(str4);
        if (replacementSpan2 instanceof C40547qZx) {
            this.valueOf.AYXKKw.post(new java.lang.Runnable() { // from class: o.qpe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C41375qpd.gEmmrt(this.EZpvd);
                }
            });
        }
    }

    public static final Unit copydefault(C41375qpd c41375qpd, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c41375qpd.getContext(), i));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C41375qpd c41375qpd, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c41375qpd.getContext(), C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.text.style.ReplacementSpan replacementSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (replacementSpan != null) {
            list.add(replacementSpan);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gEmmrt(C41375qpd c41375qpd) {
        AppCompatTextView appCompatTextView = c41375qpd.valueOf.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        C41426qqb.copydefault(appCompatTextView, new Function1() { // from class: o.qpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41375qpd.AEQbTJ((C40547qZx) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C40547qZx c40547qZx) {
        Intrinsics.checkNotNullParameter(c40547qZx, "");
        Function0<Unit> function0KWHzl = c40547qZx.KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void setPriceViewsVisible(boolean z) {
        AppCompatTextView appCompatTextView = this.valueOf.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView2 = this.valueOf.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(z ? 0 : 8);
        C41312qoT c41312qoT = this.valueOf.copydefault;
        Intrinsics.checkNotNullExpressionValue(c41312qoT, "");
        c41312qoT.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView3 = this.valueOf.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(z ? 0 : 8);
    }
}
