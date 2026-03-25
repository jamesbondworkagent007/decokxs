package o;

import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wOD extends android.widget.LinearLayout {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wOD(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.wOD.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ wOD(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wOD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View.inflate(context, C48033uCm.Activity.cBPFI, this);
        this.EZpvd = (android.widget.TextView) findViewById(C48033uCm.Application.createCheckBox);
        this.KWHzl = findViewById(C48033uCm.Application.ActivityResultContractsGetContent);
        this.copydefault = (android.widget.TextView) findViewById(C48033uCm.Application.getThemeResId);
        this.AEQbTJ = findViewById(C48033uCm.Application.addState);
    }

    public final void copydefault(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        KWHzl(tacticsData);
    }

    public final void copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        KWHzl(z, str, str2, str3, str4);
    }

    public final void setDividerVisibility(int i) {
        this.AEQbTJ.setVisibility(i);
    }

    public final boolean OLrzqt(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        return copydefault(tacticsData.getState());
    }

    public final void KWHzl(TacticsData tacticsData) {
        KWHzl(tacticsData.getHistory(), tacticsData.getStopStateText(), tacticsData.getOrderType(), tacticsData.getState(), tacticsData.getRunningDuration());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        if (r14.equals("partially_effective") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011b, code lost:
    
        r10.EZpvd.setVisibility(8);
        r10.KWHzl.setVisibility(8);
        r10.copydefault.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 1;
        boolean z2 = false;
        if (z) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str) || C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                android.widget.TextView textView = this.EZpvd;
                textView.setVisibility(0);
                textView.setText(new C55930xtI(z2, i, defaultConstructorMarker).AEQbTJ(str, str2, str3).getFirst());
                textView.setTextColor(new C55930xtI(z2, i, defaultConstructorMarker).AEQbTJ(str, str2, str3).getSecond().intValue());
                this.copydefault.setVisibility(8);
                return;
            }
            this.EZpvd.setVisibility(8);
            return;
        }
        this.copydefault.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addPreRequisiteCollector), C56423yEv.EZpvd(C56390yDp.OLrzqt("durationDayTime", wUB.copydefault(C33129mqd.valueOf(str4))))));
        if (Intrinsics.EZpvd(this.EZpvd.getTag(), (java.lang.Object) str3)) {
            return;
        }
        kotlin.Pair curState$default = C55930xtI.getCurState$default(new C55930xtI(z2, i, defaultConstructorMarker), str3, str2, null, 4, null);
        java.lang.String str5 = (java.lang.String) curState$default.component1();
        int iIntValue = ((java.lang.Number) curState$default.component2()).intValue();
        pUU.EZpvd("TacticsListItemBinder", "updateStateText: " + str3 + ", currentStateText: " + str5);
        android.widget.TextView textView2 = this.EZpvd;
        textView2.setTag(str3);
        textView2.setText(str5);
        textView2.setTextColor(iIntValue);
        int iHashCode = str3.hashCode();
        if (iHashCode != -1784744586) {
            if (iHashCode != 0) {
                if (iHashCode == 3322092) {
                }
            } else if (str3.equals("")) {
                this.EZpvd.setVisibility(8);
                this.KWHzl.setVisibility(8);
                this.copydefault.setVisibility(8);
                return;
            }
            this.EZpvd.setVisibility(0);
            this.KWHzl.setVisibility(8);
            this.copydefault.setVisibility(8);
        }
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.getVisibility() == 0 || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "pause");
    }
}
