package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fAZ extends AbstractC14668dpm {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public AbstractC16529ele OLrzqt;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fAZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final fAZ AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            fAZ faz = new fAZ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("LEAST_AMOUNT", str);
            faz.setArguments(bundle);
            return faz;
        }
    }

    private final java.lang.String KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("LEAST_AMOUNT")) == null) ? MultiTransferSignData.DEFAULT_INTERVAL : string;
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.OLrzqt = (AbstractC16529ele) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.apNbdB, viewGroup, false);
        EZpvd(false);
        AEQbTJ(false);
        KWHzl(false);
        copydefault(false);
        AEQbTJ();
        ViewGroup.LayoutParams layoutParams = OLrzqt().valueOf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.KWHzl(0.0f, contextRequireContext);
        OLrzqt().valueOf.setLayoutParams(layoutParams2);
        EZpvd();
        AbstractC16529ele abstractC16529ele = this.OLrzqt;
        C52794wYp c52794wYp = abstractC16529ele != null ? abstractC16529ele.AEQbTJ : null;
        Intrinsics.copydefault(c52794wYp);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(c52794wYp);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.fBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fAZ.KWHzl(this.EZpvd, obj);
            }
        });
        AbstractC16529ele abstractC16529ele2 = this.OLrzqt;
        AppCompatImageView appCompatImageView = abstractC16529ele2 != null ? abstractC16529ele2.OLrzqt : null;
        Intrinsics.copydefault(appCompatImageView);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(appCompatImageView).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst2, this).subscribe(new InterfaceC58227yxM() { // from class: o.fBb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fAZ.EZpvd(this.KWHzl, obj);
            }
        });
        AbstractC16529ele abstractC16529ele3 = this.OLrzqt;
        Intrinsics.copydefault(abstractC16529ele3);
        abstractC16529ele3.getRoot().post(new java.lang.Runnable() { // from class: o.fBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fAZ.KWHzl(this.OLrzqt);
            }
        });
        AbstractC16529ele abstractC16529ele4 = this.OLrzqt;
        Intrinsics.copydefault(abstractC16529ele4);
        android.view.View root = abstractC16529ele4.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static final void KWHzl(fAZ faz, java.lang.Object obj) {
        faz.AEQbTJ(new android.os.Bundle());
    }

    public static final void EZpvd(fAZ faz, java.lang.Object obj) {
        AbstractC57212yeE.close$default(faz, null, 1, null);
    }

    public static final void KWHzl(fAZ faz) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) faz, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        android.widget.ImageView imageView;
        java.lang.String strCopydefault;
        android.widget.TextView textView;
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        AbstractC16529ele abstractC16529ele = this.OLrzqt;
        if (abstractC16529ele != null && (textView = abstractC16529ele.valueOf) != null) {
            textView.setText(KWHzl());
        }
        AbstractC16529ele abstractC16529ele2 = this.OLrzqt;
        if (abstractC16529ele2 == null || (imageView = abstractC16529ele2.EZpvd) == null) {
            return;
        }
        if (c10854bwMIsConnected == null || (strCopydefault = c10854bwMIsConnected.copydefault()) == null) {
            strCopydefault = "";
        }
        C57659ymb.EZpvd(imageView, strCopydefault, C52761wXj.TaskDescription.fERRXa);
    }
}
