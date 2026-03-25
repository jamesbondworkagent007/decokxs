package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30509lcW extends LinearLayoutCompat {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final android.view.LayoutInflater OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30509lcW(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        this.OLrzqt = layoutInflaterFrom;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lcV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.EZpvd(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lcZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.OLrzqt(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lcY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.AhwBna(this.OLrzqt);
            }
        });
        hHG.copydefault(layoutInflaterFrom, this);
        setOrientation(1);
        AEQbTJ(false);
        copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.lde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30509lcW.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30509lcW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        this.OLrzqt = layoutInflaterFrom;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lcV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.EZpvd(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lcZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.OLrzqt(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lcY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.AhwBna(this.OLrzqt);
            }
        });
        hHG.copydefault(layoutInflaterFrom, this);
        setOrientation(1);
        AEQbTJ(false);
        copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.lde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30509lcW.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30509lcW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        this.OLrzqt = layoutInflaterFrom;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lcV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.EZpvd(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lcZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.OLrzqt(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lcY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30509lcW.AhwBna(this.OLrzqt);
            }
        });
        hHG.copydefault(layoutInflaterFrom, this);
        setOrientation(1);
        AEQbTJ(false);
        copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.lde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30509lcW.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    private final LinearLayoutCompat AEQbTJ() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (LinearLayoutCompat) value;
    }

    public static final LinearLayoutCompat EZpvd(C30509lcW c30509lcW) {
        return (LinearLayoutCompat) c30509lcW.findViewById(C23274hvD.Application.jNexW);
    }

    private final AppCompatTextView KWHzl() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView OLrzqt(C30509lcW c30509lcW) {
        return (AppCompatTextView) c30509lcW.findViewById(C23274hvD.Application.DrawableRes);
    }

    public static final AppCompatTextView AhwBna(C30509lcW c30509lcW) {
        return (AppCompatTextView) c30509lcW.findViewById(C23274hvD.Application.ResourcesFlusherApi16Impl);
    }

    private final AppCompatTextView copydefault() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final void AEQbTJ(C30509lcW c30509lcW, android.view.View view) {
        c30509lcW.KWHzl(!(c30509lcW.AEQbTJ().getVisibility() == 0));
        c30509lcW.AEQbTJ(c30509lcW.AEQbTJ().getVisibility() == 0);
    }

    public final void setStrategies(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AEQbTJ().removeAllViews();
        for (AdvancedAutoSellStrategy advancedAutoSellStrategy : list) {
            hHH hhhKWHzl = hHH.KWHzl(this.OLrzqt, AEQbTJ(), true);
            Intrinsics.checkNotNullExpressionValue(hhhKWHzl, "");
            hhhKWHzl.AEQbTJ.setTextValue(getContext().getString(C30501lcO.KWHzl(advancedAutoSellStrategy)));
            hhhKWHzl.djBIcL.setText(C30501lcO.copydefault(advancedAutoSellStrategy));
        }
    }

    private final void KWHzl(boolean z) {
        AEQbTJ().setVisibility(z ? 0 : 8);
        KWHzl().setVisibility(z ? 0 : 8);
    }

    public final void AEQbTJ(boolean z) {
        java.lang.String string;
        int i = z ? C52761wXj.TaskDescription.OTwTPd : C52761wXj.TaskDescription.call;
        if (z) {
            string = getContext().getString(C23274hvD.Fragment.adwzgZ);
        } else {
            string = getContext().getString(C23274hvD.Fragment.OKSWiw);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        copydefault().setText(string);
        copydefault().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, ContextCompat.getDrawable(getContext(), i), (android.graphics.drawable.Drawable) null);
    }
}
