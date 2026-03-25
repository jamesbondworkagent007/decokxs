package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vFe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50189vFe extends android.widget.FrameLayout {
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public java.lang.String EZpvd;
    public final AbstractC49530uqL KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnLeverChangeCallback(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50189vFe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "5";
        AbstractC49530uqL abstractC49530uqLCopydefault = AbstractC49530uqL.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC49530uqLCopydefault, "");
        this.KWHzl = abstractC49530uqLCopydefault;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vCH.Application.show$default(o.vCH$Application, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str8) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str8, "");
        vCH.Companion.copydefault(this.EZpvd, str3, (512 & 4) != 0 ? null : str4, (512 & 8) != 0 ? null : str5 == null ? this.OLrzqt : str5, (512 & 16) != 0 ? null : str, (512 & 32) != 0 ? null : str2, (512 & 64) != 0 ? null : str7, (512 & 128) != 0 ? null : str6, fragmentManager, (512 & 512) != 0 ? null : null, (512 & 1024) != 0 ? null : str8, (512 & 2048) != 0 ? null : new Function1() { // from class: o.vFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50189vFe.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C50189vFe c50189vFe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50189vFe.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        this.EZpvd = str;
        this.KWHzl.AEQbTJ.setTitle(C56033xvF.getBotLever$default(str == null ? this.copydefault : str, false, 2, null));
        Function1<? super java.lang.String, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            if (str == null) {
                str = this.copydefault;
            }
            function1.invoke(str);
        }
    }

    public final C55052xcf copydefault() {
        C55052xcf c55052xcf = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
        return c55052xcf;
    }
}
