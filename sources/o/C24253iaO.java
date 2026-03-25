package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24253iaO extends android.widget.LinearLayout {
    public hFS EZpvd;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24253iaO(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:23) call: o.iaO.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C24253iaO(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24253iaO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context);
        this.KWHzl = "";
    }

    public final void EZpvd(android.content.Context context) {
        C55113xdn c55113xdn;
        hFS hfsAEQbTJ = hFS.AEQbTJ(android.view.LayoutInflater.from(context), this);
        this.EZpvd = hfsAEQbTJ;
        if (hfsAEQbTJ == null || (c55113xdn = hfsAEQbTJ.OLrzqt) == null) {
            return;
        }
        c55113xdn.setAutoMirrored(true);
    }

    public final void setState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 1446) {
                if (iHashCode == 1447 && str.equals("-4")) {
                    KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.fhwtiV), C32113mPz.ActionBar.zLjUOn, true);
                    return;
                }
            } else if (str.equals("-3")) {
                KWHzl("", C32113mPz.ActionBar.zLjUOn, true);
                return;
            }
        } else if (str.equals("0")) {
            KWHzl("", C32113mPz.ActionBar.zLjUOn, true);
            return;
        }
        KWHzl("", C32113mPz.ActionBar.zLjUOn, false);
    }

    public final void KWHzl() {
        C55113xdn c55113xdn;
        hFS hfs = this.EZpvd;
        if (hfs == null || (c55113xdn = hfs.OLrzqt) == null) {
            return;
        }
        C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_ORDER_PENDING_LOADING);
        C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
    }

    public final void copydefault(long j) {
        hFS hfs = this.EZpvd;
        if (hfs != null) {
            java.lang.String time$default = pTA.formatTime$default(new Date(j), OKTimeEnum.TIME_FORMAT_MS, null, null, false, 14, null);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.fhwtiV);
            java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(strAYXKKw + " " + time$default, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.iaQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24253iaO.OLrzqt(this.OLrzqt, (java.util.List) obj);
                }
            }, 14, null), new java.lang.String[]{time$default}, 0, null, false, new Function1() { // from class: o.iaN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24253iaO.AEQbTJ(this.copydefault, (java.util.List) obj);
                }
            }, 14, null);
            hfs.OLrzqt.copydefault();
            hfs.AEQbTJ.setText(charSequence);
        }
    }

    public static final Unit OLrzqt(C24253iaO c24253iaO, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c24253iaO.getContext(), C32113mPz.Dialog.zuBGHE));
        android.content.Context context = c24253iaO.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C32113mPz.ActionBar.zLjUOn)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C24253iaO c24253iaO, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c24253iaO.getContext(), C32113mPz.Dialog.AxsJAY));
        android.content.Context context = c24253iaO.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context, C52761wXj.Activity.HJWChPRAkuRW)));
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, int i, boolean z) {
        C55113xdn c55113xdn;
        hFS hfs = this.EZpvd;
        if (hfs != null) {
            hfs.AEQbTJ.setText(str);
            AppCompatTextView appCompatTextView = hfs.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView.setTextColor(C25382ivf.copydefault(i, context));
            if (z) {
                KWHzl();
            } else {
                hFS hfs2 = this.EZpvd;
                if (hfs2 != null && (c55113xdn = hfs2.OLrzqt) != null) {
                    c55113xdn.copydefault();
                }
            }
            invalidate();
        }
    }
}
