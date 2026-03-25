package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18798fpH implements InterfaceC18835fps {
    public final FragmentActivity AEQbTJ;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.copydefault = i;
    }

    public C18798fpH(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.AEQbTJ = fragmentActivity;
        this.copydefault = 1;
    }

    @Override // o.InterfaceC18835fps
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull final Function1<? super C9697baV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC54838xXe) C43251rlk.copydefault(InterfaceC54838xXe.class)).OLrzqt(this.AEQbTJ, str, str2, str3, this.copydefault, new Function1() { // from class: o.fpG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18798fpH.KWHzl(function1, this, (C9697baV) obj);
            }
        });
    }

    public static final Unit KWHzl(Function1 function1, C18798fpH c18798fpH, C9697baV c9697baV) {
        Intrinsics.checkNotNullParameter(c9697baV, "");
        function1.invoke(c9697baV);
        if (c9697baV.EZpvd()) {
            c18798fpH.AEQbTJ.setResult(-1);
            c18798fpH.AEQbTJ.finish();
            Function0<Unit> function0AT_ = ((xWS) C43251rlk.copydefault(xWS.class)).aT_();
            if (function0AT_ != null) {
                function0AT_.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
