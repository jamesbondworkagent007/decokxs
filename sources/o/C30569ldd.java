package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30569ldd extends LinearLayoutCompat {
    public final C21548hDl AEQbTJ;
    public AdvancedAutoSellStrategy EZpvd;
    public Function1<? super AdvancedAutoSellStrategy, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnAddStrategyClickListener(Function1<? super AdvancedAutoSellStrategy, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30569ldd(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new AdvancedAutoSellStrategy.TakeProfit("", "", false, (java.lang.String) null, (java.lang.String) null, 0, 60, (DefaultConstructorMarker) null);
        C21548hDl c21548hDlCopydefault = C21548hDl.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21548hDlCopydefault, "");
        this.AEQbTJ = c21548hDlCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30569ldd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new AdvancedAutoSellStrategy.TakeProfit("", "", false, (java.lang.String) null, (java.lang.String) null, 0, 60, (DefaultConstructorMarker) null);
        C21548hDl c21548hDlCopydefault = C21548hDl.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21548hDlCopydefault, "");
        this.AEQbTJ = c21548hDlCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30569ldd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new AdvancedAutoSellStrategy.TakeProfit("", "", false, (java.lang.String) null, (java.lang.String) null, 0, 60, (DefaultConstructorMarker) null);
        C21548hDl c21548hDlCopydefault = C21548hDl.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21548hDlCopydefault, "");
        this.AEQbTJ = c21548hDlCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(1);
    }

    public final void setupRemoteStrategy(@NotNull AdvancedAutoSellStrategy advancedAutoSellStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(advancedAutoSellStrategy, "");
        this.EZpvd = advancedAutoSellStrategy;
        this.AEQbTJ.KWHzl.setText(advancedAutoSellStrategy.valueOf());
        android.view.View view = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        android.widget.TextView textView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        android.widget.TextView textView2 = this.AEQbTJ.KWHzl;
        textView2.setOnClickListener(new Application(textView2, 1000L, this, advancedAutoSellStrategy));
    }

    public final void AEQbTJ(boolean z) {
        int iCopydefault;
        this.AEQbTJ.KWHzl.setEnabled(z);
        if (z) {
            C33517mxu c33517mxu = C33517mxu.KWHzl;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = c33517mxu.OLrzqt(context, C52761wXj.ActionBar.aKErDB);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        }
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(iCopydefault);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        TextViewCompat.setCompoundDrawableTintList(this.AEQbTJ.KWHzl, colorStateListValueOf);
    }

    /* JADX INFO: renamed from: o.ldd$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ AdvancedAutoSellStrategy AEQbTJ;
        public final /* synthetic */ C30569ldd EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C30569ldd c30569ldd, AdvancedAutoSellStrategy advancedAutoSellStrategy) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c30569ldd;
            this.AEQbTJ = advancedAutoSellStrategy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.copydefault;
                if (function1 != null) {
                    function1.invoke(this.AEQbTJ);
                }
            }
        }
    }
}
