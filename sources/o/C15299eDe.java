package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eDe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15299eDe extends AbstractC57671ymn {
    public boolean AEQbTJ;
    public DialogInterface.OnDismissListener EZpvd;
    public AbstractC16557emF KWHzl;
    public java.lang.Float copydefault = java.lang.Float.valueOf(0.92f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(DialogInterface.OnDismissListener onDismissListener) {
        this.EZpvd = onDismissListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public boolean isConnected() {
        return this.AEQbTJ;
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.copydefault);
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16557emF abstractC16557emFEZpvd = AbstractC16557emF.EZpvd(layoutInflater, viewGroup, false);
        this.KWHzl = abstractC16557emFEZpvd;
        if (abstractC16557emFEZpvd == null) {
            Intrinsics.gEmmrt("");
            abstractC16557emFEZpvd = null;
        }
        android.view.View root = abstractC16557emFEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getActiveQueueItemId);
        AbstractC16557emF abstractC16557emF = this.KWHzl;
        AbstractC16557emF abstractC16557emF2 = null;
        if (abstractC16557emF == null) {
            Intrinsics.gEmmrt("");
            abstractC16557emF = null;
        }
        abstractC16557emF.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.eDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C15299eDe.EZpvd(this.OLrzqt, view2);
            }
        });
        AbstractC16557emF abstractC16557emF3 = this.KWHzl;
        if (abstractC16557emF3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16557emF3 = null;
        }
        abstractC16557emF3.copydefault.setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.getCurrentPosition, C56423yEv.EZpvd(C56390yDp.OLrzqt("details", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.eDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15299eDe.copydefault(view, (java.util.List) obj);
            }
        }, 14, null));
        AbstractC16557emF abstractC16557emF4 = this.KWHzl;
        if (abstractC16557emF4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16557emF4 = null;
        }
        android.widget.ImageView imageView = abstractC16557emF4.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        AbstractC16557emF abstractC16557emF5 = this.KWHzl;
        if (abstractC16557emF5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16557emF2 = abstractC16557emF5;
        }
        android.content.Context context = abstractC16557emF2.OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/web3_wallet/ledger_review_transaction.png", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        view.post(new java.lang.Runnable() { // from class: o.eDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15299eDe.copydefault(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(C15299eDe c15299eDe, android.view.View view) {
        c15299eDe.dismissAllowingStateLoss();
    }

    public static final Unit copydefault(android.view.View view, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(view.getContext(), C13754dXa.StateListAnimator.OLrzqt)));
        return Unit.INSTANCE;
    }

    public static final void copydefault(C15299eDe c15299eDe) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15299eDe, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.EZpvd;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
