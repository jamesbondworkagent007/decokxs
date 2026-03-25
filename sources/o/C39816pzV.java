package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import com.okinc.kline.data.TimeIntervalItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39816pzV extends ConstraintLayout implements InterfaceC35975oKq {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public android.widget.TextView AEQbTJ;
    public float AYXKKw;
    public Function1<? super java.lang.Integer, Unit> AhwBna;
    public boolean EZpvd;
    public Function0<Unit> OLrzqt;
    public java.lang.Integer copydefault;
    public boolean djBIcL;
    public int gEmmrt;
    public int valueOf;
    public int values;

    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35975oKq
    public void AEQbTJ(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC35975oKq
    public android.view.View OLrzqt() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallBack(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35975oKq
    public void setOnItemSelectListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX INFO: renamed from: o.pzV$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pzV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39816pzV(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = true;
        copydefault(context, (android.util.AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39816pzV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = true;
        copydefault(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39816pzV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = true;
        copydefault(context, attributeSet);
    }

    private final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.AYXKKw = C55298xhM.EZpvd(2.0f, context);
        this.gEmmrt = C55298xhM.copydefault(8.0f, context);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35964oKf.PendingIntent.getNewProxyInstance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.valueOf = typedArrayObtainStyledAttributes.getInt(C35964oKf.PendingIntent.getFieldNames, 0);
        this.djBIcL = typedArrayObtainStyledAttributes.getBoolean(C35964oKf.PendingIntent.iwGUEr, true);
        typedArrayObtainStyledAttributes.recycle();
        OLrzqt(context);
    }

    private final void OLrzqt(android.content.Context context) {
        if (this.valueOf == 0) {
            this.values = 4;
            android.view.View.inflate(context, C35964oKf.Application.invokespecialRtjmuc, this);
            android.widget.TextView textView = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.DwQSDd);
            this.AEQbTJ = textView;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: o.pAd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C39816pzV.AEQbTJ(this.copydefault, view);
                    }
                });
            }
        } else {
            this.values = 10;
            android.view.View.inflate(context, C35964oKf.Application.invokespecialaKhcqp, this);
        }
        int childCount = getChildCount();
        for (final int i = 0; i < childCount; i++) {
            if (!Intrinsics.EZpvd(getChildAt(i), this.AEQbTJ)) {
                pFQ.fastDoubleClickListener$default(getChildAt(i), 0L, new Function1() { // from class: o.pAc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39816pzV.KWHzl(this.EZpvd, i, (android.view.View) obj);
                    }
                }, 1, null);
            }
        }
    }

    public static final void AEQbTJ(C39816pzV c39816pzV, android.view.View view) {
        Function0<Unit> function0 = c39816pzV.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit KWHzl(C39816pzV c39816pzV, int i, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c39816pzV.KWHzl(i);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC35975oKq
    public void setScreenOrientation(int i) {
        this.valueOf = i;
        if (getContext() == null) {
            return;
        }
        removeAllViews();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        OLrzqt(context);
    }

    public void setData() {
        setData(false);
    }

    @Override // o.InterfaceC35975oKq
    public void setData(boolean z) {
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        pUU.KWHzl("MarketTitleSelectView", "before set data, current select status is " + this.EZpvd);
        if (this.EZpvd) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setSelected(false);
        }
        if (this.valueOf == 0) {
            this.values = 4;
            for (int i2 = 0; i2 < 4; i2++) {
                android.view.View childAt = getChildAt(i2);
                Intrinsics.copydefault(childAt, "");
                OLrzqt((android.widget.TextView) childAt);
            }
        } else {
            int i3 = this.values;
            if (i3 == 4) {
                for (int i4 = 0; i4 < i3; i4++) {
                    android.view.View childAt2 = getChildAt(i4);
                    Intrinsics.copydefault(childAt2, "");
                    OLrzqt((android.widget.TextView) childAt2);
                }
            }
        }
        int sPTimeInterval = C36246oUr.copydefault().KWHzl("ds0").getSPTimeInterval();
        android.view.View childAt3 = getChildAt(this.values);
        Intrinsics.copydefault(childAt3, "");
        android.view.View childAt4 = ((android.widget.RelativeLayout) childAt3).getChildAt(0);
        Intrinsics.copydefault(childAt4, "");
        ((android.widget.TextView) childAt4).setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex));
        pFN pfn = pFN.OLrzqt;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL == null || (arrayListAEQbTJ = interfaceC39509ptgDjBIcL.AEQbTJ()) == null) {
            return;
        }
        if (this.values == 4) {
            InterfaceC39509ptg interfaceC39509ptgDjBIcL2 = pfn.djBIcL();
            if (interfaceC39509ptgDjBIcL2 == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL2.KWHzl()) == null) {
                return;
            }
            boolean zIsSelected = false;
            int i5 = 0;
            for (java.lang.Object obj : arrayListKWHzl) {
                if (i5 < 0) {
                    yDY.AYXKKw();
                }
                TimeIntervalItem timeIntervalItem = (TimeIntervalItem) obj;
                android.view.View childAt5 = getChildAt(i5);
                Intrinsics.copydefault(childAt5, "");
                android.widget.TextView textView = (android.widget.TextView) childAt5;
                textView.setSelected(sPTimeInterval == timeIntervalItem.timeInterval);
                textView.setText(OLrzqt(timeIntervalItem.getDisplayName(), textView.isSelected()));
                textView.setBackground(EZpvd(textView.isSelected()));
                KWHzl(textView);
                if (!zIsSelected) {
                    zIsSelected = textView.isSelected();
                }
                i5++;
            }
            if (!zIsSelected) {
                android.view.View childAt6 = getChildAt(this.values);
                Intrinsics.copydefault(childAt6, "");
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) childAt6;
                relativeLayout.setSelected(true);
                android.view.View childAt7 = relativeLayout.getChildAt(0);
                Intrinsics.copydefault(childAt7, "");
                ((android.widget.TextView) childAt7).setText(OLrzqt(C37935pGd.OLrzqt.AEQbTJ(sPTimeInterval), true));
                android.view.View childAt8 = relativeLayout.getChildAt(1);
                Intrinsics.copydefault(childAt8, "");
                android.widget.ImageView imageView = (android.widget.ImageView) childAt8;
                imageView.setSelected(true);
                imageView.setImageResource(C35964oKf.Activity.wlaJM);
                relativeLayout.setBackground(EZpvd(true));
                return;
            }
            android.view.View childAt9 = getChildAt(this.values);
            Intrinsics.copydefault(childAt9, "");
            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) childAt9;
            relativeLayout2.setSelected(false);
            android.view.View childAt10 = relativeLayout2.getChildAt(0);
            Intrinsics.copydefault(childAt10, "");
            ((android.widget.TextView) childAt10).setText(OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex), false));
            android.view.View childAt11 = relativeLayout2.getChildAt(1);
            Intrinsics.copydefault(childAt11, "");
            android.widget.ImageView imageView2 = (android.widget.ImageView) childAt11;
            imageView2.setSelected(false);
            imageView2.setImageResource(C35964oKf.Activity.wlaJM);
            relativeLayout2.setBackground(EZpvd(false));
            return;
        }
        int size = arrayListAEQbTJ.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 < this.values) {
                android.view.View childAt12 = getChildAt(i6);
                Intrinsics.copydefault(childAt12, "");
                android.widget.TextView textView2 = (android.widget.TextView) childAt12;
                textView2.setSelected(sPTimeInterval == arrayListAEQbTJ.get(i6).timeInterval);
                textView2.setText(OLrzqt(arrayListAEQbTJ.get(i6).getDisplayName(), textView2.isSelected()));
                textView2.setBackground(EZpvd(textView2.isSelected()));
            } else {
                if (arrayListAEQbTJ.get(i6).timeInterval == sPTimeInterval) {
                    android.view.View childAt13 = getChildAt(this.values);
                    Intrinsics.copydefault(childAt13, "");
                    android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) childAt13;
                    relativeLayout3.setSelected(true);
                    android.view.View childAt14 = relativeLayout3.getChildAt(0);
                    Intrinsics.copydefault(childAt14, "");
                    ((android.widget.TextView) childAt14).setText(OLrzqt(arrayListAEQbTJ.get(i6).getDisplayName(), true));
                    android.view.View childAt15 = relativeLayout3.getChildAt(1);
                    Intrinsics.copydefault(childAt15, "");
                    android.widget.ImageView imageView3 = (android.widget.ImageView) childAt15;
                    imageView3.setSelected(true);
                    imageView3.setImageResource(C35964oKf.Activity.wlaJM);
                    relativeLayout3.setBackground(EZpvd(true));
                    return;
                }
                android.view.View childAt16 = getChildAt(this.values);
                Intrinsics.copydefault(childAt16, "");
                android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) childAt16;
                relativeLayout4.setSelected(false);
                android.view.View childAt17 = relativeLayout4.getChildAt(0);
                Intrinsics.copydefault(childAt17, "");
                ((android.widget.TextView) childAt17).setText(OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex), false));
                android.view.View childAt18 = relativeLayout4.getChildAt(1);
                Intrinsics.copydefault(childAt18, "");
                android.widget.ImageView imageView4 = (android.widget.ImageView) childAt18;
                imageView4.setSelected(false);
                imageView4.setImageResource(C35964oKf.Activity.wlaJM);
                relativeLayout4.setBackground(EZpvd(false));
            }
        }
    }

    public final void OLrzqt(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText("");
            C55296xhK.OLrzqt(textView, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
            textView.setPadding(0, 0, 0, 0);
        }
    }

    public final void KWHzl(android.widget.TextView textView) {
        if (textView != null) {
            C55296xhK.OLrzqt(textView, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(this.AYXKKw), java.lang.Float.valueOf(0.0f));
            int i = this.gEmmrt;
            textView.setPadding(i, 0, i, 0);
        }
    }

    private final void KWHzl(int i) {
        if (i < this.values) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                childAt.setSelected(false);
                if (childAt instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) childAt;
                    textView.setText(OLrzqt(textView.getText().toString(), false));
                    textView.setBackground(EZpvd(false));
                } else if (childAt instanceof android.widget.RelativeLayout) {
                    ((android.widget.RelativeLayout) childAt).setBackground(EZpvd(false));
                }
            }
            android.view.View childAt2 = getChildAt(this.values);
            Intrinsics.copydefault(childAt2, "");
            android.view.View childAt3 = ((android.widget.RelativeLayout) childAt2).getChildAt(0);
            Intrinsics.copydefault(childAt3, "");
            ((android.widget.TextView) childAt3).setText(OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex), false));
        }
        getChildAt(i).setSelected(true);
        android.view.View childAt4 = getChildAt(i);
        if (childAt4 instanceof android.widget.TextView) {
            android.widget.TextView textView2 = (android.widget.TextView) childAt4;
            textView2.setText(OLrzqt(textView2.getText().toString(), true));
            textView2.setBackground(EZpvd(true));
        } else if (childAt4 instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) childAt4;
            android.view.View childAt5 = relativeLayout.getChildAt(0);
            Intrinsics.copydefault(childAt5, "");
            android.widget.TextView textView3 = (android.widget.TextView) childAt5;
            textView3.setText(OLrzqt(textView3.getText().toString(), false));
            android.view.View childAt6 = relativeLayout.getChildAt(1);
            Intrinsics.copydefault(childAt6, "");
            android.widget.ImageView imageView = (android.widget.ImageView) childAt6;
            imageView.setSelected(true);
            if (i == this.values) {
                imageView.setImageResource(C35964oKf.Activity.zsXlph);
            }
        }
        Function1<? super java.lang.Integer, Unit> function1 = this.AhwBna;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
    }

    public final void OLrzqt(boolean z) {
        pUU.KWHzl("MarketTitleSelectView", "reset select status to " + z);
        this.EZpvd = z;
        if (z) {
            for (android.view.View view : ViewGroupKt.getChildren(this)) {
                view.setSelected(false);
                if (view instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) view;
                    textView.setText(OLrzqt(textView.getText().toString(), false));
                    textView.setBackground(EZpvd(false));
                } else if (view instanceof android.widget.RelativeLayout) {
                    ((android.widget.RelativeLayout) view).setBackground(EZpvd(false));
                    java.lang.Object objZLjUOn = C59467zhb.zLjUOn(ViewGroupKt.getChildren((android.view.ViewGroup) view));
                    android.widget.TextView textView2 = objZLjUOn instanceof android.widget.TextView ? (android.widget.TextView) objZLjUOn : null;
                    if (textView2 != null) {
                        textView2.setText(OLrzqt(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex), false));
                    }
                }
            }
        }
    }

    private final android.graphics.drawable.Drawable EZpvd(boolean z) {
        if (z && this.djBIcL) {
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C35964oKf.Activity.AxsJAYsNCnLh);
            java.lang.Integer num = this.copydefault;
            if (num == null) {
                return drawableKWHzl;
            }
            int iIntValue = num.intValue();
            if (drawableKWHzl == null) {
                return drawableKWHzl;
            }
            drawableKWHzl.setTint(iIntValue);
            return drawableKWHzl;
        }
        return C33070mpX.KWHzl(C35964oKf.Activity.gEmmrt);
    }

    private final java.lang.CharSequence OLrzqt(java.lang.String str, boolean z) {
        if (z) {
            if (this.djBIcL) {
                return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pzY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39816pzV.copydefault(this.KWHzl, (java.util.List) obj);
                    }
                }, 14, null);
            }
            return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pzX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39816pzV.AYXKKw(this.AEQbTJ, (java.util.List) obj);
                }
            }, 14, null);
        }
        if (this.djBIcL) {
            return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pzU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39816pzV.valueOf(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null);
        }
        return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39816pzV.AhwBna(this.copydefault, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit copydefault(C39816pzV c39816pzV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39816pzV.getContext(), C35964oKf.Dialog.KWHzl));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C39816pzV c39816pzV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39816pzV.getContext(), C35964oKf.Dialog.djBIcL));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C39816pzV c39816pzV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39816pzV.getContext(), C35964oKf.Dialog.EZpvd));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C39816pzV c39816pzV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39816pzV.getContext(), C35964oKf.Dialog.AEQbTJ));
        return Unit.INSTANCE;
    }

    public final void setTimeSelectBackground(@androidx.annotation.ColorInt int i) {
        this.copydefault = java.lang.Integer.valueOf(i);
    }
}
