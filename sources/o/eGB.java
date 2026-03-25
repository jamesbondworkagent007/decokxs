package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eGB extends AbstractC52785wYg {
    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.eGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eGB.KWHzl(this.copydefault, view);
            }
        });
    }

    public static final void KWHzl(eGB egb, android.view.View view) {
        egb.dismissAllowingStateLoss();
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        ViewGroup.LayoutParams layoutParams = c54954xan.KWHzl.getLayoutParams();
        layoutParams.width = C55298xhM.copydefault(240.0f, (android.content.Context) C52762wXk.AEQbTJ());
        layoutParams.height = C55298xhM.copydefault(180.0f, (android.content.Context) C52762wXk.AEQbTJ());
        c54954xan.KWHzl.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = c54954xan.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        android.content.Context context = c54954xan.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.EZpvd(appCompatImageView, C43454rpb.copydefault("images/web3_wallet/android/keystone_upgrade.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        c54954xan.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiverStub));
        c54954xan.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver_Parcel));
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setState));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.eGD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    eGB.copydefault(this.copydefault, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PlaybackStateCompatCustomActionBuilder));
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.eGG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    eGB.valueOf(this.KWHzl, view);
                }
            });
        }
    }

    public static final void copydefault(eGB egb, android.view.View view) {
        egb.dismissAllowingStateLoss();
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiverStubProxy)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity activity = egb.getActivity();
        if (activity == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(taskDescription, activity, bundleBundleOf, null, 4, null);
    }

    public static final void valueOf(eGB egb, android.view.View view) {
        egb.dismissAllowingStateLoss();
    }
}
