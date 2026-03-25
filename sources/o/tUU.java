package o;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tUU extends android.widget.LinearLayout {
    public final android.widget.TextView AEQbTJ;
    public Function0<Unit> AYXKKw;
    public java.lang.String AhwBna;
    public final float AkhnZx;
    public boolean AuCTel;
    public java.lang.String DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.view.View copydefault;
    public final FlexboxLayout djBIcL;
    public java.lang.String ejfBZ;
    public final android.widget.TextView fARcdN;
    public int fIwbmz;
    public java.lang.String fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final float gEmmrt;
    public final float isConnected;
    public java.util.List<java.lang.String> valueOf;
    public final float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUU(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.tUU.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUU(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.gEmmrt = C55298xhM.dp2pxFloat$default(14.0f, null, 1, null);
        this.values = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.AkhnZx = C55298xhM.dp2pxFloat$default(8.0f, null, 1, null);
        this.isConnected = C55298xhM.dp2pxFloat$default(18.0f, null, 1, null);
        this.fJNWhG = "";
        this.AhwBna = "";
        this.valueOf = yDY.AhwBna();
        this.fIwbmz = -1;
        this.DbNXlk = "";
        this.ejfBZ = "";
        this.AYXKKw = new Function0() { // from class: o.tUT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tUU.AEQbTJ();
            }
        };
        setOrientation(1);
        android.view.View.inflate(context, C47501trL.Application.WS, this);
        this.fetchVPNInfo = (android.widget.TextView) findViewById(C47501trL.TaskDescription.OStAOF);
        this.fARcdN = (android.widget.TextView) findViewById(C47501trL.TaskDescription.GiPPlL);
        this.KWHzl = (android.widget.ImageView) findViewById(C47501trL.TaskDescription.hDKMBd);
        this.OLrzqt = (android.widget.ImageView) findViewById(C47501trL.TaskDescription.uzCIH);
        this.EZpvd = (android.widget.ImageView) findViewById(C47501trL.TaskDescription.iwGUEr);
        this.AEQbTJ = (android.widget.TextView) findViewById(C47501trL.TaskDescription.zLjUOn);
        this.djBIcL = (FlexboxLayout) findViewById(C47501trL.TaskDescription.fdOvFl);
        this.copydefault = findViewById(C47501trL.TaskDescription.AuCTelauCTel);
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setTextAndAvatars$default(tUU tuu, java.lang.String str, java.lang.String str2, java.util.List list, Function0 function0, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        tuu.setTextAndAvatars(str, str2, list, function0, z);
    }

    public final void setTextAndAvatars(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, Function0<Unit> function0, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AuCTel = z;
        this.fJNWhG = str;
        this.AhwBna = str2;
        this.valueOf = list;
        this.AYXKKw = function0;
        OLrzqt();
        int iEZpvd = EZpvd(str2, list);
        if (!list.isEmpty()) {
            kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = OLrzqt(str, iEZpvd);
            this.DbNXlk = pairOLrzqt.getFirst();
            this.ejfBZ = pairOLrzqt.getSecond();
            this.djBIcL.setVisibility(0);
            this.fetchVPNInfo.setVisibility(0);
            EZpvd();
        } else {
            this.fIwbmz = 1;
            this.DbNXlk = str;
            this.ejfBZ = "";
            this.djBIcL.setVisibility(8);
            this.fetchVPNInfo.setVisibility(0);
        }
        post(new java.lang.Runnable() { // from class: o.tVc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tUU.OLrzqt(this.KWHzl);
            }
        });
        this.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.tVb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tUU.setTextAndAvatars$lambda$2(this.EZpvd, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(tUU tuu) {
        tuu.fetchVPNInfo.requestLayout();
        tuu.fetchVPNInfo.invalidate();
        tuu.fARcdN.requestLayout();
        tuu.fARcdN.invalidate();
    }

    public static final void setTextAndAvatars$lambda$2(tUU tuu, android.view.View view) {
        Function0<Unit> function0 = tuu.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.fIwbmz == -1 && C33129mqd.OLrzqt((java.lang.CharSequence) this.fJNWhG)) {
            setTextAndAvatars(this.fJNWhG, this.AhwBna, this.valueOf, this.AYXKKw, this.AuCTel);
        }
    }

    public final int EZpvd(java.lang.String str, java.util.List<java.lang.String> list) {
        float f;
        float f2 = 0.0f;
        float fMeasureText = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? this.AEQbTJ.getPaint().measureText(str) + this.values : 0.0f;
        this.AEQbTJ.getPaint().measureText(str);
        int iCopydefault = C56548yJl.copydefault(list.size(), 3);
        if (iCopydefault != 1) {
            if (iCopydefault == 2) {
                f = this.AkhnZx;
            } else if (iCopydefault == 3) {
                f = this.AkhnZx * 2;
            }
            f2 = f + this.gEmmrt;
        } else {
            f2 = this.gEmmrt;
        }
        return yII.EZpvd(f2 + fMeasureText + this.isConnected);
    }

    public final void OLrzqt() {
        this.fIwbmz = -1;
        this.ejfBZ = "";
        this.DbNXlk = "";
        this.fARcdN.setText("");
        this.fetchVPNInfo.setText("");
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(java.lang.String str, int i) {
        java.lang.Object objM7377constructorimpl;
        if (getMeasuredWidth() == 0) {
            return C56390yDp.OLrzqt("", "");
        }
        if (getMeasuredWidth() > i && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), this.fARcdN.getPaint(), getMeasuredWidth() - i);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            android.text.StaticLayout staticLayoutBuild = builderObtain.setAlignment(alignment).build();
            Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
            if (staticLayoutBuild.getLineCount() <= 1) {
                this.fIwbmz = 1;
                return C56390yDp.OLrzqt("", str);
            }
            if (staticLayoutBuild.getLineCount() > 1) {
                this.fIwbmz = 2;
                android.text.StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(str, 0, str.length(), this.fetchVPNInfo.getPaint(), getMeasuredWidth()).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild2, "");
                try {
                    Result.Application application = Result.Companion;
                    int lineStart = staticLayoutBuild2.getLineStart(staticLayoutBuild2.getLineCount() - 1);
                    java.lang.String strSubstring = str.substring(0, lineStart);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    java.lang.String strSubstring2 = str.substring(lineStart, str.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    objM7377constructorimpl = Result.m7377constructorimpl(new kotlin.Pair(strSubstring, strSubstring2));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                kotlin.Pair pair = new kotlin.Pair("", str);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = pair;
                }
                return (kotlin.Pair) objM7377constructorimpl;
            }
            return C56390yDp.OLrzqt("", "");
        }
        return C56390yDp.OLrzqt("", str);
    }

    public final void EZpvd() {
        int i = this.fIwbmz;
        if (i == 1) {
            this.fetchVPNInfo.setVisibility(8);
            this.djBIcL.setVisibility(0);
        } else if (i == 2) {
            this.fetchVPNInfo.setVisibility(0);
            this.djBIcL.setVisibility(0);
        }
        if (this.AuCTel) {
            this.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.spnCvw));
            this.fARcdN.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.spnCvw));
            this.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.zblBkD));
            this.copydefault.setBackgroundTintList(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.invokespecialaGOrKO));
        } else {
            this.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            this.fARcdN.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
        }
        this.fetchVPNInfo.setText(this.DbNXlk);
        this.fARcdN.setText(this.ejfBZ);
        this.AEQbTJ.setText(this.AhwBna);
        int i2 = 0;
        for (java.lang.Object obj : CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.valueOf, 3)) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (i2 == 0) {
                android.widget.ImageView imageView = this.KWHzl;
                java.lang.String strKWHzl = C55297xhL.KWHzl(str, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                C33054mpH.loadAvatar$default(imageView, strKWHzl == null ? "" : strKWHzl, null, null, 6, null);
            } else if (i2 == 1) {
                android.widget.ImageView imageView2 = this.OLrzqt;
                java.lang.String strKWHzl2 = C55297xhL.KWHzl(str, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                C33054mpH.loadAvatar$default(imageView2, strKWHzl2 == null ? "" : strKWHzl2, null, null, 6, null);
            } else if (i2 == 2) {
                android.widget.ImageView imageView3 = this.EZpvd;
                java.lang.String strKWHzl3 = C55297xhL.KWHzl(str, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                C33054mpH.loadAvatar$default(imageView3, strKWHzl3 == null ? "" : strKWHzl3, null, null, 6, null);
            }
            i2++;
        }
        int size = this.valueOf.size();
        this.KWHzl.setVisibility(size >= 1 ? 0 : 8);
        this.OLrzqt.setVisibility(size >= 2 ? 0 : 8);
        this.EZpvd.setVisibility(size < 3 ? 8 : 0);
        this.OLrzqt.setElevation(0.1f);
        this.KWHzl.setElevation(0.2f);
    }
}
