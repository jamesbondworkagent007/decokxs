package o;

import android.view.View;
import com.okinc.business.market.features.smart_money.signal.ui.wallet_address.SmartMoneyAddressItemBinder$1;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29670kxy extends AbstractC25436iwg<C29626kxG, C21602hFl> {
    public final InterfaceC29581kwO AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29670kxy() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd() {
        return "--";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.kwO:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.kwO) : (r1v0 o.kwO))
 A[MD:(o.kwO):void (m)] (LINE:45) call: o.kxy.<init>(o.kwO):void type: THIS */
    public /* synthetic */ C29670kxy(InterfaceC29581kwO interfaceC29581kwO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC29581kwO);
    }

    public C29670kxy(InterfaceC29581kwO interfaceC29581kwO) {
        super(SmartMoneyAddressItemBinder$1.INSTANCE);
        this.AEQbTJ = interfaceC29581kwO;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21602hFl> c25435iwf, @NotNull C29626kxG c29626kxG) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29626kxG, "");
        C21602hFl c21602hFl = (C21602hFl) c25435iwf.EZpvd();
        android.widget.ImageView imageView = c21602hFl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(c29626kxG.gEmmrt() ? 0 : 8);
        java.lang.String strKWHzl = c29626kxG.gEmmrt() ? c29626kxG.KWHzl() : "";
        android.widget.ImageView imageView2 = c21602hFl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadWalletProfileImage$default(imageView2, c29626kxG.EZpvd(), strKWHzl, c29626kxG.valueOf(), 0.0f, 8, null);
        android.widget.TextView textView = c21602hFl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C31258lqd.copydefault(textView, c29626kxG.OLrzqt(), c29626kxG.copydefault(), C52761wXj.Activity.fdOvFl);
        android.widget.TextView textView2 = c21602hFl.djBIcL;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        android.widget.TextView textView3 = c21602hFl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        kLY.formatPercentage$default(textView3, c29626kxG.AhwBna(), null, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), null, 18, null);
        c21602hFl.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        android.widget.TextView textView4 = c21602hFl.EZpvd;
        java.lang.String strDjBIcL = c29626kxG.djBIcL();
        textView4.setText(C31256lqb.KWHzl(C33129mqd.OLrzqt((java.lang.CharSequence) strDjBIcL) ? kLY.formatPercentage$default(strDjBIcL, DisplaySign.EXCEPT_ZERO, false, null, null, 14, null) : "", (Function0<java.lang.String>) new Function0() { // from class: o.kxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29670kxy.EZpvd();
            }
        }));
        java.lang.String formattedLocalCurrencyInICU$default = C23272hvB.getFormattedLocalCurrencyInICU$default(C23272hvB.KWHzl, C23311hvo.copydefault(c29626kxG.AYXKKw()), null, null, false, 14, null);
        c21602hFl.copydefault.setText(pTF.KWHzl.AEQbTJ(C23271hvA.copydefault.copydefault(c29626kxG.AYXKKw()) + formattedLocalCurrencyInICU$default));
        c21602hFl.copydefault.setTextColor(KWHzl(c21602hFl, c29626kxG));
        android.widget.TextView textView5 = c21602hFl.djBIcL;
        textView5.setOnClickListener(new Application(textView5, 1000L, this, c29626kxG));
    }

    public final int KWHzl(C21602hFl c21602hFl, C29626kxG c29626kxG) {
        if (C23313hvq.KWHzl(c29626kxG.AYXKKw(), 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c21602hFl.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeFallDefault$default(c33512mxp, context, 0.0f, 2, null);
        }
        if (!C23313hvq.OLrzqt(c29626kxG.AYXKKw(), 0)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = c21602hFl.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeRiseDefault$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: o.kxy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29670kxy KWHzl;
        public final /* synthetic */ C29626kxG OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C29670kxy c29670kxy, C29626kxG c29626kxG) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c29670kxy;
            this.OLrzqt = c29626kxG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC29581kwO interfaceC29581kwO = this.KWHzl.AEQbTJ;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.Activity(this.OLrzqt.valueOf(), this.OLrzqt.AEQbTJ()));
                }
            }
        }
    }
}
