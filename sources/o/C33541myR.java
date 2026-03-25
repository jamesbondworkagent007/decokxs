package o;

import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33541myR extends TabLayout {
    public final StateListAnimator AEQbTJ;
    public int EZpvd;
    public Function1<? super java.lang.Integer, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemLayout(int i) {
        this.EZpvd = i;
    }

    /* JADX INFO: renamed from: o.myR$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            Function1 function1 = C33541myR.this.copydefault;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(tab.getPosition()));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33541myR(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33541myR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33541myR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C32113mPz.Fragment.iwGUEr;
        this.AEQbTJ = new StateListAnimator();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.myR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTabs$default(C33541myR c33541myR, java.util.ArrayList arrayList, Function2 function2, Function1 function1, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        c33541myR.setTabs((java.util.ArrayList<java.lang.Integer>) arrayList, (Function2<? super java.lang.Integer, ? super android.view.View, Unit>) function2, (Function1<? super java.lang.Integer, Unit>) function1, z);
    }

    public final void setTabs(@NotNull java.util.ArrayList<java.lang.Integer> arrayList, Function2<? super java.lang.Integer, ? super android.view.View, Unit> function2, @NotNull Function1<? super java.lang.Integer, Unit> function1, boolean z) {
        android.text.TextPaint paint;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(function1, "");
        addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.AEQbTJ);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue = ((java.lang.Number) obj).intValue();
            TabLayout.Tab tabNewTab = newTab();
            Intrinsics.checkNotNullExpressionValue(tabNewTab, "");
            Unit unit = null;
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(this.EZpvd, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.gwTjWJ);
            if (textView != null && (paint = textView.getPaint()) != null) {
                paint.setFakeBoldText(z);
            }
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            tabNewTab.setCustomView(viewInflate);
            this.copydefault = function1;
            ((android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.gwTjWJ)).setText(getContext().getString(iIntValue));
            try {
                addTab(tabNewTab);
            } catch (java.lang.Error e) {
                e.printStackTrace();
            }
            if (function2 != null) {
                Intrinsics.copydefault(viewInflate);
                function2.invoke(java.lang.Integer.valueOf(i), viewInflate);
                unit = Unit.INSTANCE;
            }
            arrayList2.add(unit);
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.myR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTabs$default(C33541myR c33541myR, java.util.List list, int i, Function2 function2, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function2 = null;
        }
        c33541myR.setTabs((java.util.List<java.lang.String>) list, i, (Function2<? super java.lang.Integer, ? super android.view.View, Unit>) function2, (Function1<? super java.lang.Integer, Unit>) function1);
    }

    public final void setTabs(@NotNull java.util.List<java.lang.String> list, int i, Function2<? super java.lang.Integer, ? super android.view.View, Unit> function2, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.AEQbTJ);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            TabLayout.Tab tabNewTab = newTab();
            Intrinsics.checkNotNullExpressionValue(tabNewTab, "");
            Unit unit = null;
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(this.EZpvd, (android.view.ViewGroup) null);
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            tabNewTab.setCustomView(viewInflate);
            this.copydefault = function1;
            ((android.widget.TextView) viewInflate.findViewById(C32113mPz.FragmentManager.gwTjWJ)).setText((java.lang.String) obj);
            try {
                addTab(tabNewTab);
            } catch (java.lang.Error e) {
                e.printStackTrace();
            }
            if (function2 != null) {
                Intrinsics.copydefault(viewInflate);
                function2.invoke(java.lang.Integer.valueOf(i2), viewInflate);
                unit = Unit.INSTANCE;
            }
            arrayList.add(unit);
            i2++;
        }
    }
}
