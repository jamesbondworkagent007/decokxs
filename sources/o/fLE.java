package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletItemUIData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fKG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class fLE extends RecyclerView.ViewHolder {
    public final C16997euV EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16997euV copydefault() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fLE(@NotNull C16997euV c16997euV) {
        super(c16997euV.getRoot());
        Intrinsics.checkNotNullParameter(c16997euV, "");
        this.EZpvd = c16997euV;
    }

    public final void AEQbTJ(@NotNull EscapedWalletItemUIData escapedWalletItemUIData) {
        Intrinsics.checkNotNullParameter(escapedWalletItemUIData, "");
        AppCompatImageView appCompatImageView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        copydefault(appCompatImageView, escapedWalletItemUIData.getAccountId(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fLE.copydefault((C5335Nt) obj);
            }
        }, 32.0f);
        this.EZpvd.copydefault.setText(escapedWalletItemUIData.getWalletName());
        C16997euV c16997euV = this.EZpvd;
        android.widget.TextView textView = c16997euV.AEQbTJ;
        android.content.Context context = c16997euV.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C33069mpW.KWHzl(context, C13754dXa.FragmentManager.OqHLSf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", escapedWalletItemUIData.getEscapedTime()))));
        ConstraintLayout root = this.EZpvd.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, escapedWalletItemUIData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.gEmmrt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.fLE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadBlockiesIcon$default(fLE fle, android.widget.ImageView imageView, java.lang.String str, int i, Function1 function1, float f, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C13754dXa.Activity.aKErDB;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: o.fLC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return fLE.EZpvd((C5335Nt) obj2);
                }
            };
        }
        fle.copydefault(imageView, str, i3, function1, f);
    }

    public final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, @androidx.annotation.DrawableRes int i, @NotNull Function1<? super C5335Nt<android.graphics.drawable.Drawable>, Unit> function1, float f) {
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        wXL wxl = null;
        if (f != 0.0f && layoutParams.width != (iDp2px$default = C55298xhM.dp2px$default(f, null, 1, null))) {
            layoutParams.height = iDp2px$default;
            layoutParams.width = iDp2px$default;
        }
        if (str != null && str.length() != 0) {
            wxl = new wXL(str, 0, 2, null);
        }
        C5335Nt c5335NtCopydefault = Glide.KWHzl(imageView).KWHzl(wxl).AEQbTJ(i).KWHzl(i).copydefault(i);
        function1.invoke(c5335NtCopydefault);
        c5335NtCopydefault.EZpvd(imageView);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ fLE KWHzl;
        public final /* synthetic */ EscapedWalletItemUIData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fLE fle, EscapedWalletItemUIData escapedWalletItemUIData) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = fle;
            this.copydefault = escapedWalletItemUIData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                fKG.Application application = fKG.Companion;
                android.content.Context context = this.KWHzl.copydefault().getRoot().getContext();
                AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                if (abstractActivityC33041mov == null) {
                    return;
                }
                application.AEQbTJ(abstractActivityC33041mov, new EscapeStatusInput(ProjectSource.CeDeFi, this.copydefault.getAccountId()));
            }
        }
    }
}
