package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53028wdk extends android.widget.RelativeLayout {
    public final PlaceOrderCondition KWHzl;
    public final uSX copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53028wdk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53028wdk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderCondition EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.wdk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53028wdk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53028wdk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uSX usxKWHzl = uSX.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(usxKWHzl, "");
        this.copydefault = usxKWHzl;
        this.KWHzl = new PlaceOrderCondition((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
        LinearLayoutCompat linearLayoutCompat = usxKWHzl.copydefault;
        linearLayoutCompat.setOnClickListener(new Activity(linearLayoutCompat, 1000L, usxKWHzl));
    }

    public final void setOnStartConditionClick(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.copydefault.AEQbTJ.KWHzl(onClickListener);
    }

    public static /* synthetic */ void refreshTpSlView$default(C53028wdk c53028wdk, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c53028wdk.copydefault(str, str2, str3);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strCopydefault = "--";
        java.lang.String strAEQbTJ = (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : xMR.copydefault.AEQbTJ(str, 3, RoundingMode.FLOOR);
        if (str2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            strCopydefault = xMR.copydefault.copydefault(str2, 3);
        }
        this.KWHzl.setSpreadRatio(str);
        this.KWHzl.setUnitAmt(str2);
        this.copydefault.AEQbTJ.setActiveContent("≥" + strAEQbTJ + " | " + strCopydefault + " " + str3);
    }

    /* JADX INFO: renamed from: o.wdk$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ uSX OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, uSX usx) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = usx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                LinearLayoutCompat linearLayoutCompat = this.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                boolean z = !(linearLayoutCompat.getVisibility() == 0);
                LinearLayoutCompat linearLayoutCompat2 = this.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                linearLayoutCompat2.setVisibility(z ? 0 : 8);
                this.OLrzqt.EZpvd.setRotation(z ? 0.0f : 180.0f);
                if (z) {
                    C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_DropDown_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                }
            }
        }
    }
}
