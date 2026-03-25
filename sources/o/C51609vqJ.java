package o;

import android.widget.TextView;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.unify_trade.biz.HomeStrategyFilterCoin;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51609vqJ extends android.widget.LinearLayout {
    public RecyclerView AEQbTJ;
    public final Activity AhwBna;
    public C43316rmw EZpvd;
    public java.util.List<HomeStrategyFilterCoin> KWHzl;
    public OKEditText OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCoinSelected(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51609vqJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.hpmliR, (android.view.ViewGroup) this, true);
        setOrientation(1);
        EZpvd();
        this.AhwBna = new Activity(context);
    }

    /* JADX INFO: renamed from: o.vqJ$Activity */
    public static final class Activity extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getHorizontalSnapPreference() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        public Activity(android.content.Context context) {
            super(context);
        }
    }

    public final void EZpvd() {
        android.text.Editable text;
        this.AEQbTJ = (RecyclerView) findViewById(C48033uCm.Application.sIqKDg);
        this.OLrzqt = (OKEditText) findViewById(C48033uCm.Application.dkJJWw);
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vqG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51609vqJ.AEQbTJ((EmptyData) obj);
            }
        }));
        OKEditText oKEditText = this.OLrzqt;
        c43316rmw.register(HomeStrategyFilterCoin.class, new C51507voN((oKEditText == null || (text = oKEditText.getText()) == null) ? null : text.toString(), new Function0() { // from class: o.vqH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51609vqJ.OLrzqt(this.EZpvd);
            }
        }));
        this.EZpvd = c43316rmw;
        c43316rmw.setHasStableIds(true);
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.EZpvd);
        }
        OKEditText oKEditText2 = this.OLrzqt;
        if (oKEditText2 != null) {
            oKEditText2.addTextChangedListener(new Application());
        }
        OKEditText oKEditText3 = this.OLrzqt;
        if (oKEditText3 != null) {
            oKEditText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.vqN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return C51609vqJ.KWHzl(textView, i, keyEvent);
                }
            });
        }
    }

    public static final Unit AEQbTJ(EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51609vqJ c51609vqJ) {
        Function0<Unit> function0 = c51609vqJ.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vqJ$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            java.util.List listSearchAndSortItems$default;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            java.lang.String str = string;
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                listSearchAndSortItems$default = C51609vqJ.this.KWHzl;
            } else {
                C47222tlv c47222tlv = C47222tlv.KWHzl;
                java.util.List listAhwBna = C51609vqJ.this.KWHzl;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                listSearchAndSortItems$default = C47222tlv.searchAndSortItems$default(c47222tlv, str, listAhwBna, FuzzySearchEventSourceEnum.OKTRADE_STRATEGY.getSource(), false, 8, null);
            }
            C51609vqJ.this.OLrzqt((java.util.List<HomeStrategyFilterCoin>) listSearchAndSortItems$default);
        }
    }

    public static final boolean KWHzl(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        return keyEvent != null && keyEvent.getKeyCode() == 66;
    }

    public final void AEQbTJ(java.util.List<HomeStrategyFilterCoin> list) {
        this.KWHzl = list;
        OLrzqt(list);
        KWHzl();
    }

    public final void OLrzqt(java.util.List<HomeStrategyFilterCoin> list) {
        C43316rmw c43316rmw = this.EZpvd;
        if (c43316rmw != null) {
            if (list == null) {
                list = yDY.AhwBna();
            }
            C49952uyJ.updateDataOrNoResult$default(c43316rmw, list, C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 0, 4, null);
        }
    }

    public final HomeStrategyFilterCoin copydefault() {
        java.lang.Object next;
        java.util.List<?> items;
        C43316rmw c43316rmw = this.EZpvd;
        if (c43316rmw == null || (items = c43316rmw.getItems()) == null) {
            next = null;
        } else {
            java.util.Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                next = it.next();
                HomeStrategyFilterCoin homeStrategyFilterCoin = next instanceof HomeStrategyFilterCoin ? (HomeStrategyFilterCoin) next : null;
                if (homeStrategyFilterCoin != null && homeStrategyFilterCoin.isSelected()) {
                    break;
                }
            }
            next = null;
        }
        if (next instanceof HomeStrategyFilterCoin) {
            return (HomeStrategyFilterCoin) next;
        }
        return null;
    }

    public final void KWHzl() {
        RecyclerView.LayoutManager layoutManager;
        Activity activity = this.AhwBna;
        java.util.List<HomeStrategyFilterCoin> list = this.KWHzl;
        int i = 0;
        if (list != null) {
            java.util.Iterator<HomeStrategyFilterCoin> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next().isSelected()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        activity.setTargetPosition(i);
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.startSmoothScroll(this.AhwBna);
    }
}
