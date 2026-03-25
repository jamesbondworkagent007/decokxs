package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50191vFg extends android.widget.FrameLayout {
    public java.lang.String AEQbTJ;
    public android.widget.TextView AYXKKw;
    public java.lang.String EZpvd;
    public android.widget.LinearLayout KWHzl;
    public java.lang.String OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;
    public android.widget.TextView djBIcL;
    public C50189vFe valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        java.lang.String str = this.AEQbTJ;
        return str == null ? this.EZpvd : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnLeverChangeCallback(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50191vFg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = "5";
        android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.ardYFU, (android.view.ViewGroup) this, true);
        this.djBIcL = (android.widget.TextView) findViewById(C48033uCm.Application.apply);
        this.valueOf = (C50189vFe) findViewById(C48033uCm.Application.bindView);
        this.AYXKKw = (android.widget.TextView) findViewById(C48033uCm.Application.DtnWsU);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(C48033uCm.Application.forceCloseConnection);
        this.KWHzl = linearLayout;
        linearLayout.setActivated(true);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        vCH.Companion.copydefault(this.AEQbTJ, str3, (512 & 4) != 0 ? null : str4, (512 & 8) != 0 ? null : str5 == null ? this.OLrzqt : str5, (512 & 16) != 0 ? null : str, (512 & 32) != 0 ? null : str2, (512 & 64) != 0 ? null : str7, (512 & 128) != 0 ? null : str6, fragmentManager, (512 & 512) != 0 ? null : null, (512 & 1024) != 0 ? null : str8, (512 & 2048) != 0 ? null : new Function1() { // from class: o.vFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50191vFg.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C50191vFg c50191vFg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50191vFg.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        this.AEQbTJ = str;
        this.valueOf.EZpvd(str);
        Function1<? super java.lang.String, Unit> function1 = this.copydefault;
        if (function1 != null) {
            if (str == null) {
                str = this.EZpvd;
            }
            function1.invoke(str);
        }
    }

    public final void KWHzl(int i) {
        this.valueOf.copydefault().EZpvd().getDrawable().setTint(i);
    }

    public final void setErrorState(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setActivated(false);
        this.AYXKKw.setVisibility(0);
        this.AYXKKw.setText(str);
    }

    public final void setTextPlaceHolder(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.setText(str);
    }
}
