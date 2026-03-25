package o;

import androidx.core.os.BundleKt;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rVH extends android.text.style.ClickableSpan {
    public final ButtonDialog AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final boolean AkhnZx;
    public final java.lang.String DbNXlk;
    public final Function0<Unit> EZpvd;
    public final long KWHzl;
    public final Function1<ButtonDialog, Unit> OLrzqt;
    public final android.content.Context copydefault;
    public long djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.Integer gEmmrt;
    public final java.lang.Integer valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (r17v0 android.content.Context)
  (r18v0 java.lang.Integer)
  (r19v0 java.lang.Integer)
  (r20v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (r24v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0026: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:32) call: o.rVM.<init>():void type: CONSTRUCTOR) : (r26v0 kotlin.jvm.functions.Function0))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog:?: TERNARY null = ((wrap:int:0x0033: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog) : (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x003b: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r28v0 kotlin.jvm.functions.Function1))
 A[MD:(android.content.Context, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog, kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog, kotlin.Unit>):void (m)] (LINE:22) call: o.rVH.<init>(android.content.Context, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ rVH(android.content.Context context, java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, Function0 function0, ButtonDialog buttonDialog, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, num, num2, z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, str4, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? new Function0() { // from class: o.rVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVH.copydefault();
            }
        } : function0, (i & 1024) != 0 ? null : buttonDialog, (i & 2048) != 0 ? null : function1);
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public rVH(@NotNull android.content.Context context, java.lang.Integer num, java.lang.Integer num2, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, boolean z2, @NotNull Function0<Unit> function0, ButtonDialog buttonDialog, Function1<? super ButtonDialog, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = context;
        this.gEmmrt = num;
        this.valueOf = num2;
        this.AkhnZx = z;
        this.DbNXlk = str;
        this.fetchVPNInfo = str2;
        this.AYXKKw = str3;
        this.values = str4;
        this.AhwBna = z2;
        this.EZpvd = function0;
        this.AEQbTJ = buttonDialog;
        this.OLrzqt = function1;
        this.KWHzl = 1000L;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        pUU.EZpvd("ViewClickableAndUnderLineSpan", "underline=" + this.AkhnZx);
        if (this.AkhnZx) {
            textPaint.setUnderlineText(true);
            textPaint.setAntiAlias(true);
        }
        java.lang.Integer num = this.valueOf;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - this.djBIcL > this.KWHzl) {
            this.djBIcL = jCurrentTimeMillis;
            EZpvd(view);
        }
    }

    public final void EZpvd(android.view.View view) {
        Function1<ButtonDialog, Unit> function1;
        android.net.Uri uri;
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setHighlightColor(0);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.fetchVPNInfo)) {
            java.util.HashMap mapAYXKKw = C56424yEw.AYXKKw(C56390yDp.OLrzqt("type", "url"));
            if (Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) "free-text")) {
                C43693ruB.copydefault("KYC_Free_DeepLink_Click", mapAYXKKw);
            } else {
                C43693ruB.copydefault("KYC_CheckBox_DeepLink_Click", mapAYXKKw);
            }
            java.lang.String str = this.DbNXlk;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "cdn")) {
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.VIEW");
                android.net.Uri uri2 = android.net.Uri.parse(C43386roM.EZpvd.EZpvd() + this.fetchVPNInfo);
                Intrinsics.checkNotNullExpressionValue(uri2, "");
                intent.setData(uri2);
                try {
                    view.getContext().startActivity(intent);
                    return;
                } catch (java.lang.Exception e) {
                    java.lang.String stackTraceString = android.util.Log.getStackTraceString(e);
                    Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
                    pUU.copydefault("ViewClickableAndUnderLineSpan", stackTraceString);
                    return;
                }
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "externalUrl")) {
                java.lang.String str2 = this.fetchVPNInfo;
                if (str2 != null) {
                    uri = android.net.Uri.parse(str2);
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                } else {
                    uri = null;
                }
                this.copydefault.startActivity(new android.content.Intent("android.intent.action.VIEW", uri));
                return;
            }
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.fetchVPNInfo));
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw)) {
            if (this.AYXKKw != null) {
                java.util.HashMap mapAYXKKw2 = C56424yEw.AYXKKw(C56390yDp.OLrzqt("type", "deepLink"));
                if (Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) "free-text")) {
                    C43693ruB.copydefault("KYC_Free_DeepLink_Click", mapAYXKKw2);
                } else {
                    C43693ruB.copydefault("KYC_CheckBox_DeepLink_Click", mapAYXKKw2);
                }
                C42463rTu.deepLinkJump$default(C42463rTu.KWHzl, this.copydefault, this.AYXKKw, null, 4, null);
                return;
            }
            return;
        }
        ButtonDialog buttonDialog = this.AEQbTJ;
        if (buttonDialog == null) {
            if (this.AhwBna) {
                this.EZpvd.invoke();
            }
        } else {
            if (this.copydefault == null || (function1 = this.OLrzqt) == null) {
                return;
            }
            function1.invoke(buttonDialog);
        }
    }
}
