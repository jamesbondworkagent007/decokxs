package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28327kXh {
    public final kKG AEQbTJ;
    public final C30794lhq EZpvd;
    public final C23212htv OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30794lhq KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23212htv copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public C28327kXh(@NotNull C23212htv c23212htv, @NotNull kKG kkg, @NotNull C30794lhq c30794lhq) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c30794lhq, "");
        this.OLrzqt = c23212htv;
        this.AEQbTJ = kkg;
        this.EZpvd = c30794lhq;
    }

    public final AbstractC58185ywX<ResponseData<C9748bbT>> KWHzl(InterfaceC9734bbF interfaceC9734bbF, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription) throws OKServerException {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        InterfaceC9740bbL interfaceC9740bbLKWHzl = this.AEQbTJ.KWHzl();
        if (interfaceC9734bbF == null) {
            throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), null, null, 13, null);
        }
        java.lang.CharSequence charSequenceCopydefault = interfaceC9740bbLKWHzl.copydefault(fragmentActivity, interfaceC9734bbF.valueOf(), interfaceC9734bbF);
        java.lang.CharSequence charSequence = charSequenceCopydefault != null ? charSequenceCopydefault : "";
        if (Intrinsics.EZpvd(interfaceC9734bbF.valueOf(), C9863bdc.EZpvd)) {
            AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXEZpvd = interfaceC9740bbLKWHzl.copydefault(fragmentActivity, interfaceC9734bbF, taskDescription, z).EZpvd();
            Intrinsics.copydefault(abstractC58185ywXEZpvd);
            return abstractC58185ywXEZpvd;
        }
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(0, charSequence.toString(), null, null, 13, null));
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }
}
