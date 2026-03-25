package o;

import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27334jtI extends android.widget.FrameLayout {
    public final InterfaceC56387yDm KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27334jtI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27334jtI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.jtI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27334jtI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27334jtI(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jtK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27334jtI.copydefault(context, this);
            }
        });
    }

    private final iJH KWHzl() {
        return (iJH) this.KWHzl.getValue();
    }

    public static final iJH copydefault(android.content.Context context, C27334jtI c27334jtI) {
        return iJH.KWHzl(android.view.LayoutInflater.from(context), c27334jtI, true);
    }

    public final void setData(@NotNull C27338jtM c27338jtM) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(c27338jtM, "");
        iJH ijhKWHzl = KWHzl();
        ijhKWHzl.DbNXlk.setText(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, c27338jtM.OLrzqt(), 0, 0, true, true, 6, null));
        C27538jxA c27538jxA = C27538jxA.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27212jqt c27212jqt = ijhKWHzl.KWHzl;
        java.util.List<InvestLogoBaseVo> middleLogoList = c27338jtM.djBIcL().getMiddleLogoList();
        if (middleLogoList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(middleLogoList, 10));
            java.util.Iterator<T> it = middleLogoList.iterator();
            while (it.hasNext()) {
                java.lang.String tokenLogo = ((InvestLogoBaseVo) it.next()).getTokenLogo();
                if (tokenLogo == null) {
                    tokenLogo = "";
                }
                arrayList2.add(tokenLogo);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        c27538jxA.OLrzqt(context, c27212jqt, new InvestmentLogoData(arrayList, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 16.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : C25493ixk.TaskDescription.OLrzqt, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : 0);
        ijhKWHzl.AYXKKw.setText(CollectionsKt___CollectionsKt.joinToString$default(c27338jtM.copydefault(), "/", null, null, 0, null, new Function1() { // from class: o.jtO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27334jtI.copydefault((InvestTokenWithAmount) obj);
            }
        }, 30, null));
        android.widget.TextView textView = ijhKWHzl.AkhnZx;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setText(C33069mpW.KWHzl(context2, C25493ixk.FragmentManager.ejfBZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("projectName", c27338jtM.EZpvd()))));
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.widget.TextView textView2 = ijhKWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        c27569jxf.copydefault(textView2, c27338jtM.AEQbTJ(), c27338jtM.KWHzl(), C55298xhM.dp2px$default(8.0f, null, 1, null), 6);
    }

    public static final java.lang.CharSequence copydefault(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }
}
