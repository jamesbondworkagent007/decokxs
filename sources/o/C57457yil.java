package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yil, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57457yil extends android.widget.LinearLayout {
    public final C57370yhD AEQbTJ;
    public android.os.Vibrator copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57457yil(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57457yil(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.yil.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57457yil(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57457yil(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57370yhD c57370yhDKWHzl = C57370yhD.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57370yhDKWHzl, "");
        this.AEQbTJ = c57370yhDKWHzl;
        OLrzqt();
        KWHzl(attributeSet);
        java.lang.Object systemService = context.getSystemService("vibrator");
        Intrinsics.copydefault(systemService, "");
        this.copydefault = (android.os.Vibrator) systemService;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C55251xgS EZpvd() {
        C55251xgS c55251xgS = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        return c55251xgS;
    }

    public final void OLrzqt() {
        setOrientation(1);
        setPadding(C57410yhr.AEQbTJ(), C57410yhr.copydefault(), C57410yhr.KWHzl(), C57410yhr.EZpvd());
    }

    public final void KWHzl(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C57406yhn.Fragment.AYXKKw);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.AkhnZx);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.djBIcL);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String string3 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.gEmmrt);
        if (string3 == null) {
            string3 = "";
        }
        java.lang.String string4 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.DbNXlk);
        if (string4 == null) {
            string4 = "";
        }
        java.lang.String string5 = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.values);
        java.lang.String str = string5 != null ? string5 : "";
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.fetchVPNInfo, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C57406yhn.Fragment.isConnected, false);
        setHeaderTitleInfo(string);
        setContentInfo(string2);
        setSubContentInfo(string3);
        setPrimaryTagInfo(string4);
        setSecondaryTagInfo(str);
        setIconVisibility(z);
        setArrowIconVisibility(z2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setViewDataBean(@NotNull TransactionAddressInfoBean transactionAddressInfoBean) {
        Intrinsics.checkNotNullParameter(transactionAddressInfoBean, "");
        setHeaderTitleInfo(transactionAddressInfoBean.getHeaderTitle());
        setContentInfo(transactionAddressInfoBean.getContentInfo());
        setSubContentInfo(transactionAddressInfoBean.getSubContent());
        setPrimaryTagInfo(transactionAddressInfoBean.getPrimaryTagInfo());
        setSecondaryTagInfo(transactionAddressInfoBean.getSecondaryTagInfo());
        setIconVisibility(transactionAddressInfoBean.isShowIcon());
        setIconAction(transactionAddressInfoBean.getIconCallback());
        setArrowIconVisibility(transactionAddressInfoBean.isShowArrowIcon());
        setArrowIconAction(transactionAddressInfoBean.getArrowClickCallback());
    }

    public final void setHeaderTitleInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void setContentInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.AEQbTJ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void setSubContentInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public final void setPrimaryTagInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55251xgS c55251xgS = this.AEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C55307xhV.AEQbTJ(c55251xgS, str);
    }

    public final void setSecondaryTagInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55251xgS c55251xgS = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C55307xhV.AEQbTJ(c55251xgS, str);
        C55251xgS c55251xgS2 = this.AEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        if (c55251xgS2.getVisibility() == 0) {
            AEQbTJ(8.0f);
        } else {
            AEQbTJ(0.0f);
        }
    }

    public static /* synthetic */ void setIconVisibility$default(C57457yil c57457yil, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57457yil.setIconVisibility(z);
    }

    public final void setIconVisibility(boolean z) {
        android.widget.ImageView imageView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setArrowIconVisibility$default(C57457yil c57457yil, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57457yil.setArrowIconVisibility(z);
    }

    public final void setArrowIconVisibility(boolean z) {
        android.widget.ImageView imageView = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yil */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setIconAction$default(C57457yil c57457yil, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57457yil.setIconAction(function0);
    }

    public final void setIconAction(final Function0<Unit> function0) {
        if (function0 != null) {
            this.AEQbTJ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.yin
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C57457yil.setIconAction$lambda$0(function0, view);
                }
            });
        }
    }

    public static final void setIconAction$lambda$0(Function0 function0, android.view.View view) {
        view.performHapticFeedback(1, 3);
        function0.invoke();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yil */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setArrowIconAction$default(C57457yil c57457yil, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c57457yil.setArrowIconAction(function0);
    }

    public final void setArrowIconAction(final Function0<Unit> function0) {
        if (function0 != null) {
            this.AEQbTJ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.yit
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
        }
    }

    private final void AEQbTJ(float f) {
        ViewGroup.LayoutParams layoutParams = this.AEQbTJ.valueOf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(f, null, 1, null));
        this.AEQbTJ.valueOf.setLayoutParams(marginLayoutParams);
    }
}
