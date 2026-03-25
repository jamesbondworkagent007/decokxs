package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C20816gny extends AbstractC20799gnh<C20814gnw> {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.gny$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gny.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C20816gny copydefault(android.os.Bundle bundle) {
            C20816gny c20816gny = new C20816gny();
            c20816gny.setArguments(bundle);
            return c20816gny;
        }
    }

    @Override // o.AbstractC20799gnh
    public void gEmmrt() {
        if (KWHzl()) {
            TransactionInfo transactionInfoFIwbmz = AhwBna().fIwbmz();
            EZpvd((transactionInfoFIwbmz == null || !transactionInfoFIwbmz.hasAmountOrCurrency()) ? C13754dXa.FragmentManager.fVjYLc : C13754dXa.FragmentManager.gsvlRV);
        }
    }

    @Override // o.AbstractC20799gnh
    public void djBIcL() {
        AEQbTJ((AbstractC20809gnr) new ViewModelProvider(this).get(C20814gnw.class));
    }

    @Override // o.AbstractC20799gnh
    public void AkhnZx() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("is_transfer_amount", AhwBna().AuCTelauCTel());
        intent.putExtra("transfer_amount", AhwBna().AuCTel());
        intent.putExtra("symbol", gEmmrt(false));
        intent.putExtra("sign", AhwBna().wlaJM());
        intent.putExtra("iso_code", AhwBna().DbNXlk());
        intent.putExtra("valuation", AhwBna().fARcdN());
        intent.putExtra("receive_address", AYXKKw());
        if (KWHzl()) {
            if (zLjUOn() == 1002) {
                OLrzqt(1002, intent);
                return;
            } else {
                AEQbTJ(intent.getExtras());
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    @Override // o.AbstractC20799gnh
    public boolean AYXKKw(boolean z) {
        return !C33129mqd.valueOf(AhwBna().AuCTel(), 0);
    }

    @Override // o.AbstractC20799gnh
    public void copydefault(@NotNull C20863gos c20863gos) {
        Intrinsics.checkNotNullParameter(c20863gos, "");
        dismissLoading();
        EZpvd(c20863gos);
        C20814gnw c20814gnwAhwBna = AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC20809gnr.initUIUpdateListener$default(c20814gnwAhwBna, viewLifecycleOwner, null, 2, null);
    }

    @Override // o.AbstractC20799gnh
    public void EZpvd() {
        if (C33129mqd.valueOf(AhwBna().AuCTel(), 0) && C33129mqd.valueOf(AhwBna().fARcdN(), 0)) {
            djBIcL(false);
        } else {
            djBIcL(true);
        }
    }
}
