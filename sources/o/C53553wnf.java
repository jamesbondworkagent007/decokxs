package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53553wnf extends ConstraintLayout {
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public uVQ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53553wnf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53553wnf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setControlSelectedListener(Function1<? super java.lang.String, Unit> function1) {
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.wnf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53553wnf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53553wnf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C55320xhi c55320xhiKWHzl;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt("1", C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote)), C56390yDp.OLrzqt("2", C33070mpX.AYXKKw(C55688xof.Application.setQueue)));
        this.AEQbTJ = listGEmmrt;
        uVQ uvqCopydefault = uVQ.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uvqCopydefault, "");
        this.KWHzl = uvqCopydefault;
        C55312xha c55312xhaValueOf = uvqCopydefault.KWHzl.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener));
        }
        C55258xgZ c55258xgZ = uvqCopydefault.KWHzl;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        int i2 = 0;
        for (java.lang.Object obj : listGEmmrt) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            C55249xgQ c55249xgQ = uvqCopydefault.EZpvd;
            TabLayout.Tab tabNewTab = c55249xgQ.newTab();
            tabNewTab.setTag(pair.getFirst());
            tabNewTab.setText((java.lang.CharSequence) pair.getSecond());
            c55249xgQ.addTab(tabNewTab, i2 == 0);
            i2++;
        }
        uvqCopydefault.EZpvd.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application());
    }

    /* JADX INFO: renamed from: o.wnf$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Function1 function1 = C53553wnf.this.EZpvd;
            if (function1 != null) {
                java.lang.Object tag = tab != null ? tab.getTag() : null;
                java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                if (str == null) {
                    str = "";
                }
                function1.invoke(str);
            }
        }
    }

    public final void setControlSelected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int tabCount = this.KWHzl.EZpvd.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = this.KWHzl.EZpvd.getTabAt(i);
            if (Intrinsics.EZpvd(tabAt != null ? tabAt.getTag() : null, (java.lang.Object) str)) {
                this.KWHzl.EZpvd.selectTab(tabAt);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: o.wnf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53553wnf AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53553wnf c53553wnf) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c53553wnf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C53554wng c53554wng = new C53554wng();
                androidx.fragment.app.FragmentManager childFragmentManager = ViewKt.findFragment(this.AEQbTJ).getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c53554wng.show(childFragmentManager);
            }
        }
    }
}
