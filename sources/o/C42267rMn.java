package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.Icon;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42267rMn extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final AbstractC43998rzp AEQbTJ;
    public Function1<? super CTAButtonAppModel, Unit> EZpvd;
    public final C42519rVw KWHzl;
    public ViewStatus copydefault;

    /* JADX INFO: renamed from: o.rMn$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.rMn$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Center.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UIAlignment.Trailing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[UIAlignment.Leading.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42267rMn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C42267rMn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDialogBtClickCallBack(Function1<? super CTAButtonAppModel, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.copydefault = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:66) call: o.rMn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C42267rMn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42267rMn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = ViewStatus.Form;
        this.KWHzl = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.zblBkD, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43998rzp) viewDataBindingInflate;
    }

    /* JADX INFO: renamed from: o.rMn$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rMn.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public void copydefault(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final FreeTextAppModel freeTextAppModel = uIComponentAppModel instanceof FreeTextAppModel ? (FreeTextAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (freeTextAppModel != null ? freeTextAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            if (freeTextAppModel != null && Intrinsics.EZpvd(freeTextAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new ActionBar(new Function1() { // from class: o.rMl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42267rMn.copydefault(freeTextAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (freeTextAppModel != null ? freeTextAppModel.getId() : null))) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (freeTextAppModel != null ? freeTextAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit copydefault(FreeTextAppModel freeTextAppModel, C42267rMn c42267rMn, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), freeTextAppModel != null ? freeTextAppModel.getId() : null) && c42267rMn.getVisibility() == 8) {
                c42267rMn.setVisibility(0);
                if (freeTextAppModel != null) {
                    freeTextAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), freeTextAppModel != null ? freeTextAppModel.getId() : null) && c42267rMn.getVisibility() == 0) {
                c42267rMn.setVisibility(8);
                if (freeTextAppModel != null) {
                    freeTextAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull final FragmentActivity fragmentActivity, final AbstractC42074rFj abstractC42074rFj, @NotNull UIComponentAppModel uIComponentAppModel) {
        java.lang.String str;
        java.lang.CharSequence charSequence;
        FreetextStep step;
        int i;
        java.lang.String str2;
        android.graphics.drawable.Drawable drawableKWHzl;
        java.lang.Object objCopydefault;
        android.content.Context context;
        java.lang.String str3;
        UIAlignment textAlign;
        java.lang.String icon;
        android.view.View view;
        java.lang.String strKWHzl;
        android.widget.ImageView imageView;
        int i2;
        int i3;
        java.util.HashMap<java.lang.String, PopupTextContent> popup;
        java.util.Iterator<Map.Entry<java.lang.String, LinkTextContent>> it;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String linkColor;
        java.lang.String str7 = "";
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context2);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context3, this.copydefault, uIComponentAppModel.getBottomMargin()));
        final FreeTextAppModel freeTextAppModel = uIComponentAppModel instanceof FreeTextAppModel ? (FreeTextAppModel) uIComponentAppModel : null;
        if (freeTextAppModel != null) {
            this.AEQbTJ.KWHzl.setContentDescription(freeTextAppModel.getId());
            android.widget.LinearLayout linearLayout = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            RichTextContent richContent = freeTextAppModel.getRichContent();
            if (richContent != null) {
                java.util.HashMap map = new java.util.HashMap();
                java.util.HashMap<java.lang.String, java.lang.String> bold = richContent.getBold();
                if (bold != null) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry : bold.entrySet()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                    Unit unit = Unit.INSTANCE;
                }
                java.util.HashMap<java.lang.String, LinkTextContent> link = richContent.getLink();
                java.lang.String str8 = "externalUrl";
                java.lang.String str9 = "  ";
                if (link != null) {
                    for (Map.Entry<java.lang.String, LinkTextContent> entry2 : link.entrySet()) {
                        java.lang.String key = entry2.getKey();
                        java.lang.String text = entry2.getValue().getText();
                        map.put(key, (text == null ? "" : text) + (Intrinsics.EZpvd((java.lang.Object) entry2.getValue().getRelativeUriType(), (java.lang.Object) "externalUrl") ? "  " : ""));
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                java.util.HashMap<java.lang.String, PopupTextContent> popup2 = richContent.getPopup();
                if (popup2 != null) {
                    for (Map.Entry<java.lang.String, PopupTextContent> entry3 : popup2.entrySet()) {
                        java.lang.String key2 = entry3.getKey();
                        java.lang.String text2 = entry3.getValue().getText();
                        if (text2 == null) {
                            text2 = "";
                        }
                        map.put(key2, text2);
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                java.lang.String text3 = richContent.getText();
                if (text3 == null) {
                    text3 = "";
                }
                java.lang.CharSequence charSequenceOLrzqt = C33069mpW.OLrzqt(text3, map);
                java.util.HashMap<java.lang.String, java.lang.String> bold2 = richContent.getBold();
                if (bold2 != null) {
                    java.util.Iterator<Map.Entry<java.lang.String, java.lang.String>> it2 = bold2.entrySet().iterator();
                    while (it2.hasNext()) {
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequenceOLrzqt, new java.lang.String[]{it2.next().getValue()}, 0, null, false, new Function1() { // from class: o.rMk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42267rMn.EZpvd((java.util.List) obj);
                            }
                        }, 14, null);
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                java.util.HashMap<java.lang.String, LinkTextContent> link2 = richContent.getLink();
                if ((link2 == null || link2.isEmpty()) && ((popup = richContent.getPopup()) == null || popup.isEmpty())) {
                    this.AEQbTJ.copydefault.setClickable(false);
                } else {
                    this.AEQbTJ.copydefault.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    this.AEQbTJ.copydefault.setClickable(true);
                }
                java.util.HashMap<java.lang.String, LinkTextContent> link3 = richContent.getLink();
                if (link3 != null) {
                    java.util.Iterator<Map.Entry<java.lang.String, LinkTextContent>> it3 = link3.entrySet().iterator();
                    while (it3.hasNext()) {
                        final Map.Entry<java.lang.String, LinkTextContent> next = it3.next();
                        java.lang.String text4 = next.getValue().getText();
                        if (text4 == null) {
                            text4 = str7;
                        }
                        java.lang.String str10 = text4 + str9;
                        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) next.getValue().getRelativeUriType(), (java.lang.Object) str8);
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequenceOLrzqt, new java.lang.String[]{text4}, 0, null, false, new Function1() { // from class: o.rMo
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42267rMn.EZpvd(next, this, freeTextAppModel, abstractC42074rFj, (java.util.List) obj);
                            }
                        }, 14, null);
                        boolean z = charSequenceOLrzqt instanceof android.text.Spannable;
                        if (z && zEZpvd) {
                            android.text.Spannable spannable = (android.text.Spannable) charSequenceOLrzqt;
                            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequenceOLrzqt, str10, 0, false, 6, (java.lang.Object) null);
                            if (iIndexOf$default >= 0) {
                                int length = text4.length();
                                int length2 = str10.length();
                                it = it3;
                                android.content.Context context4 = getContext();
                                str4 = str8;
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                rQR rqr2 = rQR.AEQbTJ;
                                LinkTextStyle style = next.getValue().getStyle();
                                if (style != null) {
                                    str5 = str9;
                                    str6 = str7;
                                    linkColor = style.getLinkColor();
                                } else {
                                    str5 = str9;
                                    str6 = str7;
                                    linkColor = null;
                                }
                                spannable.setSpan(new rVH(context4, null, rqr2.EZpvd(linkColor, this.KWHzl), false, next.getValue().getRelativeUriType(), next.getValue().getUrl(), next.getValue().getDeeplink(), "free-text", next.getValue().getCta() != null, new Function0() { // from class: o.rMq
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C42267rMn.AEQbTJ(next, abstractC42074rFj);
                                    }
                                }, null, null, 3072, null), iIndexOf$default + length, iIndexOf$default + length2, 33);
                            }
                        } else {
                            it = it3;
                            str4 = str8;
                            str5 = str9;
                            str6 = str7;
                        }
                        if (z && zEZpvd) {
                            android.text.Spannable spannable2 = (android.text.Spannable) charSequenceOLrzqt;
                            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default(charSequenceOLrzqt, str10, 0, false, 6, (java.lang.Object) null);
                            if (iIndexOf$default2 >= 0) {
                                int length3 = iIndexOf$default2 + text4.length();
                                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.dNxZaP);
                                if (drawable != null) {
                                    int iIntValue = (int) ((freeTextAppModel.getFontSize() != null ? r7.intValue() : 14) * getContext().getResources().getDisplayMetrics().density);
                                    drawable.setBounds(0, 0, iIntValue, iIntValue);
                                    spannable2.setSpan(new android.text.style.ImageSpan(drawable, 0), length3 + 1, length3 + 2, 33);
                                    Unit unit5 = Unit.INSTANCE;
                                }
                            }
                        }
                        it3 = it;
                        str8 = str4;
                        str9 = str5;
                        str7 = str6;
                    }
                    str = str7;
                    Unit unit6 = Unit.INSTANCE;
                } else {
                    str = "";
                }
                java.util.HashMap<java.lang.String, PopupTextContent> popup3 = richContent.getPopup();
                if (popup3 != null) {
                    for (final Map.Entry<java.lang.String, PopupTextContent> entry4 : popup3.entrySet()) {
                        java.lang.CharSequence charSequence2 = charSequenceOLrzqt;
                        java.lang.String[] strArr = new java.lang.String[1];
                        java.lang.String text5 = entry4.getValue().getText();
                        if (text5 == null) {
                            text5 = str;
                        }
                        strArr[0] = text5;
                        charSequenceOLrzqt = C33061mpO.setupSpanStyles$default(charSequence2, strArr, 0, null, false, new Function1() { // from class: o.rMp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C42267rMn.EZpvd(entry4, this, fragmentActivity, abstractC42074rFj, (java.util.List) obj);
                            }
                        }, 14, null);
                    }
                    Unit unit7 = Unit.INSTANCE;
                }
                java.lang.CharSequence charSequence3 = charSequenceOLrzqt;
                if (charSequence3 != null) {
                    charSequence = charSequence3;
                }
                if (freeTextAppModel.getIcon() == null || freeTextAppModel.getStep() != null || C33129mqd.OLrzqt((java.lang.CharSequence) freeTextAppModel.getIconUrl())) {
                    step = freeTextAppModel.getStep();
                    if (step == null) {
                        this.AEQbTJ.AEQbTJ.setVisibility(8);
                        if (Intrinsics.EZpvd(step.getCompleted(), java.lang.Boolean.TRUE)) {
                            this.AEQbTJ.EZpvd.setVisibility(0);
                            this.AEQbTJ.OLrzqt.setVisibility(8);
                            this.AEQbTJ.AYXKKw.setVisibility(8);
                            android.graphics.drawable.Drawable drawableKWHzl2 = rQR.AEQbTJ.KWHzl("completed", this.KWHzl);
                            if (drawableKWHzl2 != null) {
                                android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawableKWHzl2.mutate());
                                str3 = str;
                                Intrinsics.checkNotNullExpressionValue(drawableWrap, str3);
                                DrawableCompat.setTint(drawableWrap, C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
                                this.AEQbTJ.EZpvd.setImageDrawable(drawableWrap);
                                Unit unit8 = Unit.INSTANCE;
                            } else {
                                str3 = str;
                            }
                            android.view.View view2 = this.AEQbTJ.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(view2, str3);
                            objCopydefault = copydefault(view2, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight());
                            str2 = str3;
                            i = 1;
                        } else {
                            java.lang.String str11 = str;
                            this.AEQbTJ.EZpvd.setVisibility(8);
                            if (Intrinsics.EZpvd((java.lang.Object) step.getType(), (java.lang.Object) "text")) {
                                this.AEQbTJ.OLrzqt.setVisibility(8);
                                this.AEQbTJ.AYXKKw.setVisibility(0);
                                android.widget.TextView textView = this.AEQbTJ.AYXKKw;
                                Intrinsics.checkNotNullExpressionValue(textView, str11);
                                java.lang.CharSequence number = step.getNumber();
                                java.lang.CharSequence charSequence4 = number == null ? str11 : number;
                                int iAEQbTJ = rQR.AEQbTJ.AEQbTJ(freeTextAppModel.getTextColor(), this.KWHzl);
                                java.lang.Integer fontSize = freeTextAppModel.getFontSize();
                                int iIntValue2 = fontSize != null ? fontSize.intValue() : 14;
                                java.lang.String fontWeight = freeTextAppModel.getFontWeight();
                                java.lang.Boolean boolIsBold = freeTextAppModel.isBold();
                                str2 = str11;
                                i = 1;
                                setTextStyle(textView, charSequence4, java.lang.Integer.valueOf(iAEQbTJ), iIntValue2, fontWeight, 1.0f, boolIsBold != null ? boolIsBold.booleanValue() : false, UIAlignment.Center, null);
                                ViewGroup.LayoutParams layoutParams = this.AEQbTJ.AYXKKw.getLayoutParams();
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) freeTextAppModel.getIconWidth())) {
                                    context = null;
                                    layoutParams.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(freeTextAppModel.getIconWidth()), null, 1, null);
                                } else {
                                    context = null;
                                    layoutParams.width = -2;
                                }
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) freeTextAppModel.getIconHeight())) {
                                    layoutParams.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(freeTextAppModel.getIconHeight()), context, 1, context);
                                } else {
                                    layoutParams.height = -2;
                                }
                                this.AEQbTJ.AYXKKw.setLayoutParams(layoutParams);
                            } else {
                                str2 = str11;
                                i = 1;
                                this.AEQbTJ.OLrzqt.setVisibility(0);
                                this.AEQbTJ.AYXKKw.setVisibility(8);
                                android.widget.TextView textView2 = this.AEQbTJ.OLrzqt;
                                java.lang.String number2 = step.getNumber();
                                if (number2 == null) {
                                    number2 = str2;
                                }
                                textView2.setText(number2);
                            }
                            objCopydefault = Unit.INSTANCE;
                        }
                        if (objCopydefault == null) {
                        }
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(this.AEQbTJ.copydefault.getCurrentTextColor());
                        paint.setTextSize(this.AEQbTJ.copydefault.getTextSize());
                        android.content.res.Resources resources = getContext().getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, str2);
                        int iEZpvd = C55302xhQ.EZpvd(resources);
                        int iDp2px$default = C55298xhM.dp2px$default(32.0f, null, i, null);
                        Intrinsics.checkNotNullExpressionValue(this.AEQbTJ.EZpvd, str2);
                        int iCeil = (int) java.lang.Math.ceil(paint.measureText(charSequence.toString()) / (((iEZpvd - iDp2px$default) - copydefault(r4, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight()).width) - C55298xhM.dp2px$default(6.0f, null, i, null)));
                        pUU.EZpvd("zhoulijuan", "lineCount=" + iCeil);
                        boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIcon(), (java.lang.Object) "solid-dot");
                        android.widget.LinearLayout linearLayout2 = this.AEQbTJ.KWHzl;
                        UIAlignment align = freeTextAppModel.getAlign();
                        int i4 = align == null ? -1 : Application.KWHzl[align.ordinal()];
                        linearLayout2.setGravity(i4 != i ? i4 != 2 ? (iCeil > i || zEZpvd2) ? 8388659 : TextAlign.LEFT : iCeil > i ? 8388661 : TextAlign.RIGHT : iCeil > i ? 49 : 17);
                    } else {
                        i = 1;
                        str2 = str;
                    }
                    rQR rqr3 = rQR.AEQbTJ;
                    drawableKWHzl = rqr3.KWHzl(freeTextAppModel.getIcon(), this.KWHzl);
                    if (drawableKWHzl != null) {
                        android.graphics.drawable.Drawable drawableWrap2 = DrawableCompat.wrap(drawableKWHzl.mutate());
                        Intrinsics.checkNotNullExpressionValue(drawableWrap2, str2);
                        java.lang.Integer numCopydefault = rqr3.copydefault(freeTextAppModel.getIconRenderColor(), this.KWHzl);
                        if (numCopydefault != null) {
                            DrawableCompat.setTint(drawableWrap2, numCopydefault.intValue());
                            Unit unit9 = Unit.INSTANCE;
                        } else {
                            if (Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIcon(), (java.lang.Object) Icon.Check.getNameValue())) {
                                DrawableCompat.setTint(drawableWrap2, C33070mpX.copydefault(C52761wXj.Activity.iLWfRf));
                            }
                            if (Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIcon(), (java.lang.Object) Icon.SHIELD.getNameValue())) {
                                DrawableCompat.setTint(drawableWrap2, C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
                            }
                            Unit unit10 = Unit.INSTANCE;
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIconPosition(), (java.lang.Object) "trailing")) {
                            this.AEQbTJ.AEQbTJ.setVisibility(0);
                            this.AEQbTJ.EZpvd.setVisibility(8);
                            this.AEQbTJ.AEQbTJ.setImageDrawable(drawableWrap2);
                            android.view.View view3 = this.AEQbTJ.AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(view3, str2);
                            copydefault(view3, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight());
                        } else {
                            this.AEQbTJ.AEQbTJ.setVisibility(8);
                            this.AEQbTJ.EZpvd.setVisibility(0);
                            this.AEQbTJ.EZpvd.setImageDrawable(drawableWrap2);
                            android.view.View view4 = this.AEQbTJ.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(view4, str2);
                            copydefault(view4, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight());
                        }
                    }
                    android.graphics.Paint paint2 = new android.graphics.Paint();
                    paint2.setColor(this.AEQbTJ.copydefault.getCurrentTextColor());
                    paint2.setTextSize(this.AEQbTJ.copydefault.getTextSize());
                    android.content.res.Resources resources2 = getContext().getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, str2);
                    int iEZpvd2 = C55302xhQ.EZpvd(resources2);
                    int iDp2px$default2 = C55298xhM.dp2px$default(32.0f, null, i, null);
                    Intrinsics.checkNotNullExpressionValue(this.AEQbTJ.EZpvd, str2);
                    int iCeil2 = (int) java.lang.Math.ceil(paint2.measureText(charSequence.toString()) / (((iEZpvd2 - iDp2px$default2) - copydefault(r4, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight()).width) - C55298xhM.dp2px$default(6.0f, null, i, null)));
                    pUU.EZpvd("zhoulijuan", "lineCount=" + iCeil2);
                    boolean zEZpvd22 = Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIcon(), (java.lang.Object) "solid-dot");
                    android.widget.LinearLayout linearLayout22 = this.AEQbTJ.KWHzl;
                    UIAlignment align2 = freeTextAppModel.getAlign();
                    if (align2 == null) {
                    }
                    linearLayout22.setGravity(i4 != i ? i4 != 2 ? (iCeil2 > i || zEZpvd22) ? 8388659 : TextAlign.LEFT : iCeil2 > i ? 8388661 : TextAlign.RIGHT : iCeil2 > i ? 49 : 17);
                } else {
                    UIAlignment align3 = freeTextAppModel.getAlign();
                    if (align3 == null) {
                        i3 = 1;
                        i2 = -1;
                    } else {
                        i2 = Application.KWHzl[align3.ordinal()];
                        i3 = 1;
                    }
                    if (i2 == i3) {
                        this.AEQbTJ.KWHzl.setGravity(17);
                        Unit unit11 = Unit.INSTANCE;
                    } else if (i2 == 2) {
                        this.AEQbTJ.KWHzl.setGravity(8388613);
                        Unit unit12 = Unit.INSTANCE;
                    } else {
                        this.AEQbTJ.KWHzl.setGravity(8388611);
                        Unit unit13 = Unit.INSTANCE;
                    }
                    str2 = str;
                }
                android.widget.TextView textView3 = this.AEQbTJ.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView3, str2);
                rQR rqr4 = rQR.AEQbTJ;
                int iAEQbTJ2 = rqr4.AEQbTJ(freeTextAppModel.getTextColor(), this.KWHzl);
                java.lang.Integer fontSize2 = freeTextAppModel.getFontSize();
                int iIntValue3 = fontSize2 == null ? fontSize2.intValue() : 14;
                java.lang.String fontWeight2 = freeTextAppModel.getFontWeight();
                java.lang.Float lineHeight = freeTextAppModel.getLineHeight();
                float fFloatValue2 = lineHeight == null ? lineHeight.floatValue() : 1.0f;
                java.lang.Boolean boolIsBold2 = freeTextAppModel.isBold();
                boolean zBooleanValue = boolIsBold2 == null ? boolIsBold2.booleanValue() : false;
                textAlign = freeTextAppModel.getTextAlign();
                if (textAlign == null && (textAlign = freeTextAppModel.getAlign()) == null) {
                    textAlign = UIAlignment.Leading;
                }
                setTextStyle(textView3, charSequence, java.lang.Integer.valueOf(iAEQbTJ2), iIntValue3, fontWeight2, fFloatValue2, zBooleanValue, textAlign, rqr4.OLrzqt(freeTextAppModel.getBackgroundColor(), this.KWHzl));
                icon = freeTextAppModel.getIcon();
                if ((icon != null || icon.length() == 0 || rqr4.KWHzl(freeTextAppModel.getIcon(), this.KWHzl) == null) && C33129mqd.OLrzqt((java.lang.CharSequence) freeTextAppModel.getIconUrl())) {
                    this.AEQbTJ.EZpvd.setVisibility(0);
                    if (!Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIconPosition(), (java.lang.Object) "trailing")) {
                        view = this.AEQbTJ.AEQbTJ;
                    } else {
                        view = this.AEQbTJ.EZpvd;
                    }
                    Intrinsics.copydefault(view);
                    ViewGroup.LayoutParams layoutParamsCopydefault = copydefault(view, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight());
                    if (!C33492mxV.OLrzqt()) {
                        strKWHzl = C55297xhL.KWHzl(freeTextAppModel.getIconDarkUrl(), "lfit", layoutParamsCopydefault.height, layoutParamsCopydefault.width);
                        if (strKWHzl == null) {
                            strKWHzl = freeTextAppModel.getIconDarkUrl();
                        }
                    } else {
                        strKWHzl = C55297xhL.KWHzl(freeTextAppModel.getIconUrl(), "lfit", layoutParamsCopydefault.height, layoutParamsCopydefault.width);
                        if (strKWHzl == null) {
                            strKWHzl = freeTextAppModel.getIconUrl();
                        }
                    }
                    C5335Nt c5335NtCopydefault = Glide.AEQbTJ(getContext()).EZpvd(strKWHzl).KWHzl(C43662rtX.Activity.UeEOUB).copydefault(C43662rtX.Activity.UeEOUB);
                    if (!Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIconPosition(), (java.lang.Object) "trailing")) {
                        imageView = this.AEQbTJ.AEQbTJ;
                    } else {
                        imageView = this.AEQbTJ.EZpvd;
                    }
                    c5335NtCopydefault.EZpvd(imageView);
                }
                return;
            }
            str = "";
            java.lang.CharSequence textContent = freeTextAppModel.getTextContent();
            charSequence = textContent != null ? textContent : str;
            if (freeTextAppModel.getIcon() == null) {
                step = freeTextAppModel.getStep();
                if (step == null) {
                }
                rQR rqr32 = rQR.AEQbTJ;
                drawableKWHzl = rqr32.KWHzl(freeTextAppModel.getIcon(), this.KWHzl);
                if (drawableKWHzl != null) {
                }
                android.graphics.Paint paint22 = new android.graphics.Paint();
                paint22.setColor(this.AEQbTJ.copydefault.getCurrentTextColor());
                paint22.setTextSize(this.AEQbTJ.copydefault.getTextSize());
                android.content.res.Resources resources22 = getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources22, str2);
                int iEZpvd22 = C55302xhQ.EZpvd(resources22);
                int iDp2px$default22 = C55298xhM.dp2px$default(32.0f, null, i, null);
                Intrinsics.checkNotNullExpressionValue(this.AEQbTJ.EZpvd, str2);
                int iCeil22 = (int) java.lang.Math.ceil(paint22.measureText(charSequence.toString()) / (((iEZpvd22 - iDp2px$default22) - copydefault(r4, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight()).width) - C55298xhM.dp2px$default(6.0f, null, i, null)));
                pUU.EZpvd("zhoulijuan", "lineCount=" + iCeil22);
                boolean zEZpvd222 = Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIcon(), (java.lang.Object) "solid-dot");
                android.widget.LinearLayout linearLayout222 = this.AEQbTJ.KWHzl;
                UIAlignment align22 = freeTextAppModel.getAlign();
                if (align22 == null) {
                }
                linearLayout222.setGravity(i4 != i ? i4 != 2 ? (iCeil22 > i || zEZpvd222) ? 8388659 : TextAlign.LEFT : iCeil22 > i ? 8388661 : TextAlign.RIGHT : iCeil22 > i ? 49 : 17);
            }
            android.widget.TextView textView32 = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView32, str2);
            rQR rqr42 = rQR.AEQbTJ;
            int iAEQbTJ22 = rqr42.AEQbTJ(freeTextAppModel.getTextColor(), this.KWHzl);
            java.lang.Integer fontSize22 = freeTextAppModel.getFontSize();
            if (fontSize22 == null) {
            }
            java.lang.String fontWeight22 = freeTextAppModel.getFontWeight();
            java.lang.Float lineHeight2 = freeTextAppModel.getLineHeight();
            float fFloatValue22 = lineHeight2 == null ? lineHeight2.floatValue() : 1.0f;
            java.lang.Boolean boolIsBold22 = freeTextAppModel.isBold();
            if (boolIsBold22 == null) {
            }
            textAlign = freeTextAppModel.getTextAlign();
            if (textAlign == null) {
                textAlign = UIAlignment.Leading;
            }
            setTextStyle(textView32, charSequence, java.lang.Integer.valueOf(iAEQbTJ22), iIntValue3, fontWeight22, fFloatValue22, zBooleanValue, textAlign, rqr42.OLrzqt(freeTextAppModel.getBackgroundColor(), this.KWHzl));
            icon = freeTextAppModel.getIcon();
            if (icon != null) {
            }
            this.AEQbTJ.EZpvd.setVisibility(0);
            if (!Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIconPosition(), (java.lang.Object) "trailing")) {
            }
            Intrinsics.copydefault(view);
            ViewGroup.LayoutParams layoutParamsCopydefault2 = copydefault(view, freeTextAppModel.getIconWidth(), freeTextAppModel.getIconHeight());
            if (!C33492mxV.OLrzqt()) {
            }
            C5335Nt c5335NtCopydefault2 = Glide.AEQbTJ(getContext()).EZpvd(strKWHzl).KWHzl(C43662rtX.Activity.UeEOUB).copydefault(C43662rtX.Activity.UeEOUB);
            if (!Intrinsics.EZpvd((java.lang.Object) freeTextAppModel.getIconPosition(), (java.lang.Object) "trailing")) {
            }
            c5335NtCopydefault2.EZpvd(imageView);
        }
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.StyleSpan(1));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final Map.Entry entry, C42267rMn c42267rMn, FreeTextAppModel freeTextAppModel, final AbstractC42074rFj abstractC42074rFj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkTextStyle style = ((LinkTextContent) entry.getValue()).getStyle();
        if (style != null && Intrinsics.EZpvd(style.isBold(), java.lang.Boolean.TRUE)) {
            list.add(new android.text.style.StyleSpan(1));
        }
        LinkTextStyle style2 = ((LinkTextContent) entry.getValue()).getStyle();
        if (style2 != null && Intrinsics.EZpvd(style2.isUnderLineBold(), java.lang.Boolean.TRUE)) {
            rQR rqr = rQR.AEQbTJ;
            LinkTextStyle style3 = ((LinkTextContent) entry.getValue()).getStyle();
            java.lang.Integer numAYXKKw = rqr.AYXKKw(style3 != null ? style3.getUnderLineColor() : null, c42267rMn.KWHzl);
            if (numAYXKKw != null) {
                int iIntValue = numAYXKKw.intValue();
                android.content.Context context = c42267rMn.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                LinkTextStyle style4 = ((LinkTextContent) entry.getValue()).getStyle();
                java.lang.Integer numEZpvd = rqr.EZpvd(style4 != null ? style4.getLinkColor() : null, c42267rMn.KWHzl);
                list.add(new rVK(context, iIntValue, numEZpvd != null ? numEZpvd.intValue() : rqr.AEQbTJ(freeTextAppModel.getTextColor(), c42267rMn.KWHzl)));
            }
        } else {
            android.content.Context context2 = c42267rMn.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            rQR rqr2 = rQR.AEQbTJ;
            LinkTextStyle style5 = ((LinkTextContent) entry.getValue()).getStyle();
            java.lang.Integer numAYXKKw2 = rqr2.AYXKKw(style5 != null ? style5.getUnderLineColor() : null, c42267rMn.KWHzl);
            LinkTextStyle style6 = ((LinkTextContent) entry.getValue()).getStyle();
            java.lang.Integer numEZpvd2 = rqr2.EZpvd(style6 != null ? style6.getLinkColor() : null, c42267rMn.KWHzl);
            java.lang.Boolean underline = ((LinkTextContent) entry.getValue()).getUnderline();
            list.add(new rVH(context2, numAYXKKw2, numEZpvd2, underline != null ? underline.booleanValue() : true, ((LinkTextContent) entry.getValue()).getRelativeUriType(), ((LinkTextContent) entry.getValue()).getUrl(), ((LinkTextContent) entry.getValue()).getDeeplink(), "free-text", ((LinkTextContent) entry.getValue()).getCta() != null, new Function0() { // from class: o.rMj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C42267rMn.KWHzl(entry, abstractC42074rFj);
                }
            }, null, null, 3072, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Map.Entry entry, AbstractC42074rFj abstractC42074rFj) {
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataAYXKKw;
        CTAButtonAppModel cta = ((LinkTextContent) entry.getValue()).getCta();
        if (cta != null && abstractC42074rFj != null && (mutableLiveDataAYXKKw = abstractC42074rFj.AYXKKw()) != null) {
            mutableLiveDataAYXKKw.setValue(new C43734ruq<>(new kotlin.Pair(cta, new DialogInformation("", false, null, 4, null))));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Map.Entry entry, AbstractC42074rFj abstractC42074rFj) {
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataAYXKKw;
        CTAButtonAppModel cta = ((LinkTextContent) entry.getValue()).getCta();
        if (cta != null && abstractC42074rFj != null && (mutableLiveDataAYXKKw = abstractC42074rFj.AYXKKw()) != null) {
            mutableLiveDataAYXKKw.setValue(new C43734ruq<>(new kotlin.Pair(cta, new DialogInformation("", false, null, 4, null))));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Map.Entry entry, final C42267rMn c42267rMn, final FragmentActivity fragmentActivity, final AbstractC42074rFj abstractC42074rFj, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkTextStyle style = ((PopupTextContent) entry.getValue()).getStyle();
        if (style != null && Intrinsics.EZpvd(style.isBold(), java.lang.Boolean.TRUE)) {
            list.add(new android.text.style.StyleSpan(1));
        }
        android.content.Context context = c42267rMn.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        rQR rqr = rQR.AEQbTJ;
        LinkTextStyle style2 = ((PopupTextContent) entry.getValue()).getStyle();
        java.lang.Integer numAYXKKw = rqr.AYXKKw(style2 != null ? style2.getUnderLineColor() : null, c42267rMn.KWHzl);
        LinkTextStyle style3 = ((PopupTextContent) entry.getValue()).getStyle();
        java.lang.Integer numEZpvd = rqr.EZpvd(style3 != null ? style3.getLinkColor() : null, c42267rMn.KWHzl);
        java.lang.Boolean underline = ((PopupTextContent) entry.getValue()).getUnderline();
        list.add(new rVH(context, numAYXKKw, numEZpvd, underline != null ? underline.booleanValue() : true, null, null, null, "free-text", false, null, ((PopupTextContent) entry.getValue()).getDialog(), new Function1() { // from class: o.rMr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42267rMn.AEQbTJ(fragmentActivity, abstractC42074rFj, list, c42267rMn, (ButtonDialog) obj);
            }
        }, 864, null));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, final AbstractC42074rFj abstractC42074rFj, final java.util.List list, final C42267rMn c42267rMn, ButtonDialog buttonDialog) {
        Intrinsics.checkNotNullParameter(buttonDialog, "");
        C43693ruB.OLrzqt("KYC_Free_Text_Popup");
        rQZ.KWHzl.AEQbTJ(fragmentActivity, buttonDialog, new Function1() { // from class: o.rMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42267rMn.KWHzl(abstractC42074rFj, list, c42267rMn, (CTAButtonAppModel) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC42074rFj abstractC42074rFj, java.util.List list, C42267rMn c42267rMn, CTAButtonAppModel cTAButtonAppModel) {
        Intrinsics.checkNotNullParameter(cTAButtonAppModel, "");
        if (abstractC42074rFj != null) {
            abstractC42074rFj.copydefault(cTAButtonAppModel);
        } else {
            Function1<? super CTAButtonAppModel, Unit> function1 = c42267rMn.EZpvd;
            if (function1 != null) {
                function1.invoke(cTAButtonAppModel);
            }
        }
        return Unit.INSTANCE;
    }

    public final ViewGroup.LayoutParams copydefault(android.view.View view, java.lang.String str, java.lang.String str2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = C55298xhM.dp2px$default(16.0f, null, 1, null);
        layoutParams.height = C55298xhM.dp2px$default(16.0f, null, 1, null);
        if (str != null) {
            layoutParams.width = C55298xhM.dp2px$default(C33129mqd.djBIcL(str), null, 1, null);
        }
        if (str2 != null) {
            layoutParams.height = C55298xhM.dp2px$default(C33129mqd.djBIcL(str2), null, 1, null);
        }
        view.setLayoutParams(layoutParams);
        Intrinsics.copydefault(layoutParams);
        return layoutParams;
    }

    public final void setTextStyle(android.widget.TextView textView, java.lang.CharSequence charSequence, @androidx.annotation.ColorInt java.lang.Integer num, int i, java.lang.String str, float f, boolean z, UIAlignment uIAlignment, @androidx.annotation.ColorInt java.lang.Integer num2) {
        textView.setVisibility(0);
        textView.setText(charSequence);
        textView.setLineSpacing(0.0f, f);
        int i2 = Application.KWHzl[uIAlignment.ordinal()];
        if (i2 == 1) {
            textView.setGravity(17);
        } else if (i2 == 2) {
            textView.setGravity(8388613);
        } else if (i2 == 3) {
            textView.setGravity(8388611);
        } else {
            textView.setGravity(8388611);
        }
        if (str != null) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TtmlNode.BOLD)) {
                textView.setTextAppearance(getContext(), C52761wXj.LoaderManager.zuWLRA);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "medium")) {
                textView.setTextAppearance(getContext(), C52761wXj.LoaderManager.DCUTEI);
            } else {
                textView.setTextAppearance(getContext(), C52761wXj.LoaderManager.OBJEWx);
            }
        } else if (z) {
            textView.setTextAppearance(getContext(), C52761wXj.LoaderManager.zuWLRA);
        }
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        if (num2 != null) {
            textView.setBackgroundColor(num2.intValue());
        }
        textView.setTextSize(i);
    }
}
