package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.unify_trade.bot.data.DistributeItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.wgv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53198wgv extends android.widget.LinearLayout {
    public int AEQbTJ;
    public AbstractC50951vdo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53198wgv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53198wgv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.wgv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53198wgv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53198wgv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = 3;
        OLrzqt();
    }

    public final void OLrzqt() {
        this.KWHzl = (AbstractC50951vdo) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.OhcwxsRkSIEV, this, true);
    }

    public final void copydefault(@NotNull java.util.List<DistributeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC50951vdo abstractC50951vdo = this.KWHzl;
        AbstractC50951vdo abstractC50951vdo2 = null;
        if (abstractC50951vdo == null) {
            Intrinsics.gEmmrt("");
            abstractC50951vdo = null;
        }
        C53195wgs c53195wgs = abstractC50951vdo.KWHzl;
        c53195wgs.setMaxShow(this.AEQbTJ);
        c53195wgs.OLrzqt(list);
        AbstractC50951vdo abstractC50951vdo3 = this.KWHzl;
        if (abstractC50951vdo3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50951vdo3 = null;
        }
        abstractC50951vdo3.copydefault.removeAllViews();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            DistributeItem distributeItem = (DistributeItem) obj;
            if (i < this.AEQbTJ) {
                int iDpInt$default = C55298xhM.dpInt$default(i == 0 ? 6 : 10, (android.content.Context) null, 1, (java.lang.Object) null);
                android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
                int i2 = C48033uCm.Activity.OeawrHOeawrH;
                AbstractC50951vdo abstractC50951vdo4 = this.KWHzl;
                if (abstractC50951vdo4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50951vdo4 = null;
                }
                AbstractC50937vda abstractC50937vda = (AbstractC50937vda) DataBindingUtil.inflate(layoutInflaterFrom, i2, abstractC50951vdo4.copydefault, false);
                abstractC50937vda.AEQbTJ.setBackgroundTintList(android.content.res.ColorStateList.valueOf(distributeItem.getColor()));
                abstractC50937vda.EZpvd.setText(distributeItem.getCoinName());
                ViewGroup.LayoutParams layoutParams = abstractC50937vda.copydefault.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(iDpInt$default);
                abstractC50937vda.copydefault.setLayoutParams(layoutParams2);
                AbstractC50951vdo abstractC50951vdo5 = this.KWHzl;
                if (abstractC50951vdo5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC50951vdo5 = null;
                }
                abstractC50951vdo5.copydefault.addView(abstractC50937vda.copydefault);
            }
            i++;
        }
        int size = list.size() - this.AEQbTJ;
        AbstractC50951vdo abstractC50951vdo6 = this.KWHzl;
        if (abstractC50951vdo6 == null) {
            Intrinsics.gEmmrt("");
            abstractC50951vdo6 = null;
        }
        android.view.View view = abstractC50951vdo6.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(size <= 0 ? 8 : 0);
        AbstractC50951vdo abstractC50951vdo7 = this.KWHzl;
        if (abstractC50951vdo7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50951vdo2 = abstractC50951vdo7;
        }
        abstractC50951vdo2.OLrzqt.setText(size > 0 ? Marker.ANY_NON_NULL_MARKER + xMR.copydefault.copydefault(java.lang.String.valueOf(size)) : "");
    }
}
