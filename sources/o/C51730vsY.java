package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewStubProxy;
import com.google.android.material.tabs.TabLayout;
import com.okinc.tradingbot.impl.market_place.my_bot.view.MyBotAssetDateType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51730vsY extends android.widget.FrameLayout {
    public Function1<? super MyBotAssetDateType, Unit> EZpvd;
    public AbstractC48585uWw KWHzl;
    public boolean OLrzqt;
    public AbstractC48582uWt copydefault;

    /* JADX INFO: renamed from: o.vsY$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MyBotAssetDateType.values().length];
            try {
                iArr[MyBotAssetDateType.ONE_DAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MyBotAssetDateType.ONE_WEEK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MyBotAssetDateType.ONE_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51730vsY(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51730vsY(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51730vsY(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        copydefault(context);
    }

    public final void copydefault(android.content.Context context) {
        this.KWHzl = (AbstractC48585uWw) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.v, this, true);
    }

    public final void setDateSelectListener(@NotNull MyBotAssetDateType myBotAssetDateType, Function1<? super MyBotAssetDateType, Unit> function1) {
        Intrinsics.checkNotNullParameter(myBotAssetDateType, "");
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.EZpvd = function1;
        AbstractC48585uWw abstractC48585uWw = this.KWHzl;
        if (abstractC48585uWw != null) {
            int iDjBIcL = ((C33570myu.djBIcL(getContext()) - C55298xhM.dp2px$default(32.0f, null, 1, null)) - C55298xhM.dp2px$default(3.0f, null, 1, null)) / 3;
            pUU.EZpvd("ProAssetsSelectView", "maxWidth=" + iDjBIcL);
            abstractC48585uWw.AEQbTJ.setMaxWidth(iDjBIcL);
            abstractC48585uWw.AEQbTJ.setText(MyBotAssetDateType.ONE_DAY.getXAxisString());
            android.widget.TextView textView = abstractC48585uWw.AEQbTJ;
            textView.setOnClickListener(new StateListAnimator(textView, 1000L, this));
            abstractC48585uWw.copydefault.setMaxWidth(iDjBIcL);
            abstractC48585uWw.copydefault.setText(MyBotAssetDateType.ONE_WEEK.getXAxisString());
            android.widget.TextView textView2 = abstractC48585uWw.copydefault;
            textView2.setOnClickListener(new Application(textView2, 1000L, this));
            abstractC48585uWw.KWHzl.setMaxWidth(iDjBIcL);
            abstractC48585uWw.KWHzl.setText(MyBotAssetDateType.ONE_MONTH.getXAxisString());
            android.widget.TextView textView3 = abstractC48585uWw.KWHzl;
            textView3.setOnClickListener(new TaskDescription(textView3, 1000L, this));
            AEQbTJ(myBotAssetDateType, true);
        }
    }

    public final void AEQbTJ(MyBotAssetDateType myBotAssetDateType, boolean z) {
        boolean zKWHzl;
        Function1<? super MyBotAssetDateType, Unit> function1;
        AbstractC48585uWw abstractC48585uWw = this.KWHzl;
        if (abstractC48585uWw != null) {
            int i = Activity.OLrzqt[myBotAssetDateType.ordinal()];
            if (i == 1) {
                EZpvd(abstractC48585uWw.copydefault, abstractC48585uWw.KWHzl);
                android.widget.TextView textView = abstractC48585uWw.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                zKWHzl = KWHzl(textView);
            } else if (i == 2) {
                EZpvd(abstractC48585uWw.AEQbTJ, abstractC48585uWw.KWHzl);
                android.widget.TextView textView2 = abstractC48585uWw.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                zKWHzl = KWHzl(textView2);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                EZpvd(abstractC48585uWw.AEQbTJ, abstractC48585uWw.copydefault);
                android.widget.TextView textView3 = abstractC48585uWw.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                zKWHzl = KWHzl(textView3);
            }
            if (z || !zKWHzl || (function1 = this.EZpvd) == null) {
                return;
            }
            function1.invoke(myBotAssetDateType);
        }
    }

    public final boolean KWHzl(android.widget.TextView textView) {
        if (textView.isSelected()) {
            return false;
        }
        textView.setSelected(true);
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        return true;
    }

    private final void EZpvd(android.widget.TextView... textViewArr) {
        for (android.widget.TextView textView : textViewArr) {
            textView.setSelected(false);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        }
    }

    public final void copydefault(@NotNull java.util.List<java.lang.String> list) {
        AbstractC48585uWw abstractC48585uWw;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty() || (abstractC48585uWw = this.KWHzl) == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = abstractC48585uWw.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        if (!abstractC48585uWw.EZpvd.isInflated()) {
            ViewStubProxy viewStubProxy = abstractC48585uWw.EZpvd;
            Intrinsics.checkNotNullExpressionValue(viewStubProxy, "");
            this.copydefault = (AbstractC48582uWt) C33131mqf.OLrzqt(viewStubProxy);
        }
        AbstractC48582uWt abstractC48582uWt = this.copydefault;
        if (abstractC48582uWt != null) {
            TabLayout tabLayout = abstractC48582uWt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "");
            tabLayout.setVisibility(0);
            abstractC48582uWt.EZpvd.removeAllTabs();
            for (java.lang.String str : list) {
                TabLayout.Tab tabNewTab = abstractC48582uWt.EZpvd.newTab();
                Intrinsics.checkNotNullExpressionValue(tabNewTab, "");
                android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.clearRegistrations, (android.view.ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "");
                ((android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.InspectablePropertyFlagEntry)).setText(str);
                tabNewTab.setCustomView(viewInflate);
                abstractC48582uWt.EZpvd.addTab(tabNewTab);
            }
        }
    }

    public final void KWHzl() {
        TabLayout tabLayout;
        android.widget.LinearLayout linearLayout;
        AbstractC48585uWw abstractC48585uWw = this.KWHzl;
        if (abstractC48585uWw != null && (linearLayout = abstractC48585uWw.OLrzqt) != null) {
            linearLayout.setVisibility(0);
        }
        AbstractC48582uWt abstractC48582uWt = this.copydefault;
        if (abstractC48582uWt == null || (tabLayout = abstractC48582uWt.EZpvd) == null) {
            return;
        }
        tabLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.vsY$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C51730vsY AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51730vsY c51730vsY) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c51730vsY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C55867xrz.KWHzl.AEQbTJ("one_week");
                this.AEQbTJ.AEQbTJ(MyBotAssetDateType.ONE_WEEK, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.vsY$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C51730vsY AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51730vsY c51730vsY) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c51730vsY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C55867xrz.KWHzl.AEQbTJ("one_day");
                this.AEQbTJ.AEQbTJ(MyBotAssetDateType.ONE_DAY, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.vsY$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C51730vsY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51730vsY c51730vsY) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c51730vsY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C55867xrz.KWHzl.AEQbTJ("one_month");
                this.copydefault.AEQbTJ(MyBotAssetDateType.ONE_MONTH, false);
            }
        }
    }
}
