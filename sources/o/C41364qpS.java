package o;

import android.view.ViewGroup;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.market.ext.TabLayoutExtKt$showTabRedDotOnce$2;
import com.okinc.market.ext.TabLayoutExtKt$showTabRedDotOnce$4;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41364qpS {
    public static final boolean AEQbTJ(int i) {
        return i == 0;
    }

    public static final boolean OLrzqt(int i) {
        return i == 0;
    }

    public static /* synthetic */ void setupMenuIconWhenTabSelected$default(C55244xgL c55244xgL, int i, Function1 function1, Function1 function12, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: o.qpW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C41364qpS.AEQbTJ(((java.lang.Integer) obj2).intValue()));
                }
            };
        }
        OLrzqt(c55244xgL, i, function1, function12);
    }

    /* JADX INFO: renamed from: o.qpS$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Function1<java.lang.Integer, java.lang.String> KWHzl;
        public final /* synthetic */ Function1<java.lang.Integer, java.lang.Boolean> OLrzqt;
        public final /* synthetic */ int copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(int i, Function1<? super java.lang.Integer, java.lang.Boolean> function1, Function1<? super java.lang.Integer, java.lang.String> function12) {
            this.copydefault = i;
            this.OLrzqt = function1;
            this.KWHzl = function12;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                C41364qpS.EZpvd(tab, true, this.copydefault, this.OLrzqt, this.KWHzl);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab != null) {
                C41364qpS.EZpvd(tab, false, this.copydefault, this.OLrzqt, this.KWHzl);
            }
        }
    }

    public static final void OLrzqt(@NotNull C55244xgL c55244xgL, @androidx.annotation.DrawableRes int i, @NotNull Function1<? super java.lang.Integer, java.lang.Boolean> function1, @NotNull Function1<? super java.lang.Integer, java.lang.String> function12) {
        Intrinsics.checkNotNullParameter(c55244xgL, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        c55244xgL.copydefault(new ActionBar(i, function1, function12));
    }

    public static /* synthetic */ void updateMenuIcon$default(TabLayout.Tab tab, boolean z, int i, Function1 function1, Function1 function12, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: o.qpT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C41364qpS.OLrzqt(((java.lang.Integer) obj2).intValue()));
                }
            };
        }
        EZpvd(tab, z, i, function1, function12);
    }

    public static final void EZpvd(TabLayout.Tab tab, boolean z, @androidx.annotation.DrawableRes int i, Function1<? super java.lang.Integer, java.lang.Boolean> function1, Function1<? super java.lang.Integer, java.lang.String> function12) {
        if (function1.invoke(java.lang.Integer.valueOf(tab.getPosition())).booleanValue()) {
            return;
        }
        android.view.View customView = tab.getCustomView();
        C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
        if (c54989xbV == null) {
            return;
        }
        java.lang.String strInvoke = function12.invoke(java.lang.Integer.valueOf(tab.getPosition()));
        android.widget.ImageView imageViewAEQbTJ = c54989xbV.AEQbTJ();
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        android.widget.ImageView imageViewOLrzqt = c54989xbV.OLrzqt();
        imageViewAEQbTJ.setVisibility(z ? 0 : 8);
        imageViewOLrzqt.setVisibility(8);
        if (z) {
            if (strInvoke != null) {
                C57659ymb.EZpvd(imageViewAEQbTJ, strInvoke, i);
            } else {
                imageViewAEQbTJ.setImageResource(i);
            }
            ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                android.content.Context context = textViewEZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                marginLayoutParams.setMarginStart(C55298xhM.KWHzl(4.0f, context));
                textViewEZpvd.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.LayoutParams layoutParams2 = textViewEZpvd.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(0);
            textViewEZpvd.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void copydefault(@NotNull C55244xgL c55244xgL, java.lang.Integer num, @NotNull Function0<java.lang.Boolean> function0, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.Object objM7377constructorimpl;
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(c55244xgL, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (num != null) {
            int iIntValue = num.intValue();
            java.lang.Integer num2 = (iIntValue < 0 || iIntValue >= c55244xgL.AhwBna()) ? null : num;
            if (num2 != null) {
                num2.intValue();
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c55244xgL));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (fragment == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new TabLayoutExtKt$showTabRedDotOnce$2(c55244xgL, num, function1, function0, null), 2, null);
                return;
            }
        }
        pUU.EZpvd("OKDisplayChipGroup showTabRedDotOnce failed: invalid position " + num);
    }

    public static final void copydefault(@NotNull C55254xgV c55254xgV, java.lang.Integer num, @NotNull Function0<java.lang.Boolean> function0, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.Object objM7377constructorimpl;
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(c55254xgV, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (num != null) {
            int iIntValue = num.intValue();
            java.lang.Integer num2 = (iIntValue < 0 || iIntValue >= c55254xgV.copydefault().getTabCount()) ? null : num;
            if (num2 != null) {
                num2.intValue();
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(c55254xgV));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (fragment == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new TabLayoutExtKt$showTabRedDotOnce$4(c55254xgV, num, function1, function0, null), 2, null);
                return;
            }
        }
        pUU.EZpvd("OKTabs showTabRedDotOnce failed: invalid position " + num);
    }
}
