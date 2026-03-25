package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import com.okinc.kline.data.TimeIntervalItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39828pzh extends ConstraintLayout {
    public int AYXKKw;
    public oPP EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public Function1<? super java.lang.Integer, Unit> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemSelectListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX INFO: renamed from: o.pzh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pzh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39828pzh(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, (android.util.AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39828pzh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39828pzh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(context, attributeSet);
    }

    private final void OLrzqt(android.content.Context context, android.util.AttributeSet attributeSet) {
        EZpvd(context);
    }

    private final void EZpvd(android.content.Context context) {
        oPP opp = (oPP) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C35964oKf.Application.invokespecialROgMPW, this, true);
        this.EZpvd = opp;
        pFQ.fastDoubleClickListener$default(opp != null ? opp.EZpvd : null, 0L, new Function1() { // from class: o.pzj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39828pzh.djBIcL(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        oPP opp2 = this.EZpvd;
        pFQ.fastDoubleClickListener$default(opp2 != null ? opp2.KWHzl : null, 0L, new Function1() { // from class: o.pzi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39828pzh.valueOf(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
        oPP opp3 = this.EZpvd;
        pFQ.fastDoubleClickListener$default(opp3 != null ? opp3.copydefault : null, 0L, new Function1() { // from class: o.pzn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39828pzh.AhwBna(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        oPP opp4 = this.EZpvd;
        pFQ.fastDoubleClickListener$default(opp4 != null ? opp4.AEQbTJ : null, 0L, new Function1() { // from class: o.pzp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39828pzh.gEmmrt(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        oPP opp5 = this.EZpvd;
        pFQ.fastDoubleClickListener$default(opp5 != null ? opp5.AhwBna : null, 0L, new Function1() { // from class: o.pzl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39828pzh.AYXKKw(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit djBIcL(C39828pzh c39828pzh, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c39828pzh.AEQbTJ(0);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C39828pzh c39828pzh, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c39828pzh.AEQbTJ(1);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C39828pzh c39828pzh, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c39828pzh.AEQbTJ(2);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C39828pzh c39828pzh, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c39828pzh.AEQbTJ(3);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C39828pzh c39828pzh, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c39828pzh.AEQbTJ(4);
        return Unit.INSTANCE;
    }

    public final void setData() {
        InterfaceC39509ptg interfaceC39509ptgDjBIcL;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        android.widget.RelativeLayout relativeLayout;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.widget.RelativeLayout relativeLayout2;
        android.widget.ImageView imageView2;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl2;
        pUU.KWHzl("KlineFullScreenTimeTitleView", "before set data, current select status is " + this.OLrzqt);
        if (this.OLrzqt) {
            return;
        }
        pFN pfn = pFN.OLrzqt;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL2 = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL2 != null && (arrayListKWHzl2 = interfaceC39509ptgDjBIcL2.KWHzl()) != null) {
            this.AYXKKw = arrayListKWHzl2.size();
        }
        this.KWHzl = false;
        oPP opp = this.EZpvd;
        if (opp != null && (textView6 = opp.EZpvd) != null) {
            textView6.setVisibility(8);
        }
        oPP opp2 = this.EZpvd;
        if (opp2 != null && (textView5 = opp2.KWHzl) != null) {
            textView5.setVisibility(8);
        }
        oPP opp3 = this.EZpvd;
        if (opp3 != null && (textView4 = opp3.copydefault) != null) {
            textView4.setVisibility(8);
        }
        oPP opp4 = this.EZpvd;
        if (opp4 != null && (textView3 = opp4.AEQbTJ) != null) {
            textView3.setVisibility(8);
        }
        int sPTimeInterval = C36246oUr.copydefault().KWHzl("ds0").getSPTimeInterval();
        InterfaceC39509ptg interfaceC39509ptgDjBIcL3 = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL3 == null || interfaceC39509ptgDjBIcL3.AEQbTJ() == null || (interfaceC39509ptgDjBIcL = pfn.djBIcL()) == null || (arrayListKWHzl = interfaceC39509ptgDjBIcL.KWHzl()) == null) {
            return;
        }
        int i = 0;
        for (java.lang.Object obj : arrayListKWHzl) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            setTimeText(i, sPTimeInterval, (TimeIntervalItem) obj);
            i++;
        }
        if (this.KWHzl) {
            oPP opp5 = this.EZpvd;
            if (opp5 == null || (relativeLayout = opp5.AhwBna) == null) {
                return;
            }
            relativeLayout.setSelected(false);
            oPP opp6 = this.EZpvd;
            if (opp6 != null && (textView = opp6.gEmmrt) != null) {
                textView.setText(copydefault(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex), false));
            }
            oPP opp7 = this.EZpvd;
            if (opp7 != null && (imageView = opp7.OLrzqt) != null) {
                imageView.setSelected(false);
                imageView.setImageResource(C35964oKf.Activity.wlaJM);
            }
            relativeLayout.setBackground(KWHzl(false));
            return;
        }
        oPP opp8 = this.EZpvd;
        if (opp8 == null || (relativeLayout2 = opp8.AhwBna) == null) {
            return;
        }
        relativeLayout2.setSelected(true);
        oPP opp9 = this.EZpvd;
        if (opp9 != null && (textView2 = opp9.gEmmrt) != null) {
            textView2.setText(copydefault(C37935pGd.OLrzqt.AEQbTJ(sPTimeInterval), true));
        }
        oPP opp10 = this.EZpvd;
        if (opp10 != null && (imageView2 = opp10.OLrzqt) != null) {
            imageView2.setSelected(true);
            imageView2.setImageResource(C35964oKf.Activity.wlaJM);
        }
        relativeLayout2.setBackground(KWHzl(true));
    }

    public final void setTimeText(int i, int i2, TimeIntervalItem timeIntervalItem) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        oPP opp;
        android.widget.TextView textView4;
        if (i == 0) {
            oPP opp2 = this.EZpvd;
            if (opp2 == null || (textView = opp2.EZpvd) == null) {
                return;
            }
            setTimeText(textView, i2, timeIntervalItem);
            return;
        }
        if (i == 1) {
            oPP opp3 = this.EZpvd;
            if (opp3 == null || (textView2 = opp3.KWHzl) == null) {
                return;
            }
            setTimeText(textView2, i2, timeIntervalItem);
            return;
        }
        if (i != 2) {
            if (i != 3 || (opp = this.EZpvd) == null || (textView4 = opp.AEQbTJ) == null) {
                return;
            }
            setTimeText(textView4, i2, timeIntervalItem);
            return;
        }
        oPP opp4 = this.EZpvd;
        if (opp4 == null || (textView3 = opp4.copydefault) == null) {
            return;
        }
        setTimeText(textView3, i2, timeIntervalItem);
    }

    public final void setTimeText(android.widget.TextView textView, int i, TimeIntervalItem timeIntervalItem) {
        textView.setSelected(i == timeIntervalItem.timeInterval);
        textView.setText(copydefault(timeIntervalItem.getDisplayName(), textView.isSelected()));
        textView.setBackground(KWHzl(textView.isSelected()));
        textView.setVisibility(0);
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = textView.isSelected();
    }

    public final void AEQbTJ(int i) {
        android.widget.LinearLayout linearLayout;
        android.view.View childAt;
        android.widget.LinearLayout linearLayout2;
        android.view.View childAt2;
        android.widget.TextView textView;
        android.widget.RelativeLayout relativeLayout;
        android.widget.LinearLayout linearLayout3;
        android.view.View childAt3;
        int i2 = this.AYXKKw;
        if (i < i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                oPP opp = this.EZpvd;
                if (opp != null && (linearLayout3 = opp.djBIcL) != null && (childAt3 = linearLayout3.getChildAt(i3)) != null) {
                    childAt3.setSelected(false);
                    if (childAt3 instanceof android.widget.TextView) {
                        android.widget.TextView textView2 = (android.widget.TextView) childAt3;
                        textView2.setText(copydefault(textView2.getText().toString(), false));
                        textView2.setBackground(KWHzl(false));
                    }
                }
            }
            oPP opp2 = this.EZpvd;
            if (opp2 != null && (relativeLayout = opp2.AhwBna) != null) {
                relativeLayout.setBackground(KWHzl(false));
            }
            oPP opp3 = this.EZpvd;
            if (opp3 != null && (textView = opp3.gEmmrt) != null) {
                textView.setText(copydefault(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex), false));
            }
        }
        oPP opp4 = this.EZpvd;
        if (opp4 != null && (linearLayout2 = opp4.djBIcL) != null && (childAt2 = linearLayout2.getChildAt(i)) != null) {
            childAt2.setSelected(true);
        }
        oPP opp5 = this.EZpvd;
        if (opp5 != null && (linearLayout = opp5.djBIcL) != null && (childAt = linearLayout.getChildAt(i)) != null) {
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView3 = (android.widget.TextView) childAt;
                textView3.setText(copydefault(textView3.getText().toString(), true));
                textView3.setBackground(KWHzl(true));
            } else if (childAt instanceof android.widget.RelativeLayout) {
                android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) childAt;
                android.view.View childAt4 = relativeLayout2.getChildAt(0);
                Intrinsics.copydefault(childAt4, "");
                android.widget.TextView textView4 = (android.widget.TextView) childAt4;
                textView4.setText(copydefault(textView4.getText().toString(), false));
                android.view.View childAt5 = relativeLayout2.getChildAt(1);
                Intrinsics.copydefault(childAt5, "");
                android.widget.ImageView imageView = (android.widget.ImageView) childAt5;
                imageView.setSelected(true);
                if (i == 4) {
                    imageView.setImageResource(C35964oKf.Activity.zsXlph);
                }
            }
        }
        Function1<? super java.lang.Integer, Unit> function1 = this.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
    }

    public final android.graphics.drawable.Drawable KWHzl(boolean z) {
        if (z) {
            return C33070mpX.KWHzl(C35964oKf.Activity.AxsJAYsNCnLh);
        }
        return C33070mpX.KWHzl(C35964oKf.Activity.gEmmrt);
    }

    public final java.lang.CharSequence copydefault(java.lang.String str, boolean z) {
        if (z) {
            return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pzk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39828pzh.EZpvd(this.EZpvd, (java.util.List) obj);
                }
            }, 14, null);
        }
        return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.pzg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39828pzh.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit EZpvd(C39828pzh c39828pzh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39828pzh.getContext(), C35964oKf.Dialog.copydefault));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C39828pzh c39828pzh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39828pzh.getContext(), C35964oKf.Dialog.EZpvd));
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z) {
        oPP opp;
        android.widget.LinearLayout linearLayout;
        Sequence<android.view.View> children;
        pUU.KWHzl("KlineFullScreenTimeTitleView", "reset select status to " + z);
        this.OLrzqt = z;
        if (!z || (opp = this.EZpvd) == null || (linearLayout = opp.djBIcL) == null || (children = ViewGroupKt.getChildren(linearLayout)) == null) {
            return;
        }
        for (android.view.View view : children) {
            view.setSelected(false);
            if (view instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) view;
                textView.setText(copydefault(textView.getText().toString(), false));
                textView.setBackground(KWHzl(false));
            } else if (view instanceof android.widget.RelativeLayout) {
                ((android.widget.RelativeLayout) view).setBackground(KWHzl(false));
                java.lang.Object objZLjUOn = C59467zhb.zLjUOn(ViewGroupKt.getChildren((android.view.ViewGroup) view));
                android.widget.TextView textView2 = objZLjUOn instanceof android.widget.TextView ? (android.widget.TextView) objZLjUOn : null;
                if (textView2 != null) {
                    textView2.setText(copydefault(C33070mpX.AYXKKw(C35964oKf.Fragment.DAIeex), false));
                }
            }
        }
    }
}
