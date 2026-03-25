package o;

import android.widget.TextView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33824nHe extends nGR {
    public final java.lang.String AEQbTJ = "NotificationConversationProvider";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    /* JADX INFO: renamed from: o.nHe$Application */
    public final class Application extends C35895oHr {
        public final nON AEQbTJ;
        public final /* synthetic */ C33824nHe EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C33824nHe c33824nHe, nON non) {
            super(non.getRoot().getContext(), non.getRoot());
            Intrinsics.checkNotNullParameter(non, "");
            this.EZpvd = c33824nHe;
            this.AEQbTJ = non;
        }

        public final void AEQbTJ(@NotNull nGF ngf) {
            Intrinsics.checkNotNullParameter(ngf, "");
            KWHzl(ngf);
            djBIcL(ngf);
            OLrzqt(ngf);
            EZpvd(ngf);
            AhwBna(ngf);
            copydefault(ngf);
            gEmmrt(ngf);
        }

        public final void gEmmrt(nGF ngf) {
            android.widget.ImageView imageView = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(ngf.AEQbTJ().isTop() ? 0 : 8);
        }

        public final void KWHzl(nGF ngf) {
            this.AEQbTJ.gEmmrt.setImageResource(ngf.valueOf());
        }

        public final void copydefault(nGF ngf) {
            this.AEQbTJ.AhwBna.setContentDescription(ngf.EZpvd());
        }

        public final void djBIcL(nGF ngf) {
            this.AEQbTJ.EZpvd.setText(ngf.AhwBna());
        }

        public final void OLrzqt(nGF ngf) {
            android.text.Spannable spannableKWHzl = ngf.KWHzl();
            if (spannableKWHzl != null) {
                this.AEQbTJ.OLrzqt.setText(spannableKWHzl, TextView.BufferType.SPANNABLE);
            }
        }

        public final void EZpvd(nGF ngf) {
            java.lang.String strKWHzl = "";
            if (ngf.AEQbTJ().getSentTime() != 0) {
                nDD ndd = nDD.OLrzqt;
                android.content.Context contextKWHzl = KWHzl();
                Intrinsics.checkNotNullExpressionValue(contextKWHzl, "");
                strKWHzl = ndd.KWHzl(contextKWHzl, ngf.AEQbTJ().getSentTime());
            }
            int i = C52761wXj.Activity.QwvEab;
            android.widget.TextView textView = this.AEQbTJ.copydefault;
            textView.setText(strKWHzl);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i));
        }

        public final void AhwBna(nGF ngf) {
            android.widget.TextView textView = this.AEQbTJ.djBIcL;
            C33824nHe c33824nHe = this.EZpvd;
            Intrinsics.copydefault(textView);
            textView.setVisibility(ngf.AEQbTJ().getUnreadMessageCount() > 0 ? 0 : 8);
            textView.setBackgroundResource(C44105sDn.Application.AkhnZx);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(c33824nHe.OLrzqt(context, ngf.AEQbTJ().getUnreadMessageCount()));
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nON nonEZpvd = nON.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nonEZpvd, "");
        return new Application(this, nonEZpvd);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof nGF;
    }

    @Override // o.nGR, o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        super.AEQbTJ(c35895oHr, obj, i);
        if ((obj instanceof nGF) && (c35895oHr instanceof Application)) {
            ((Application) c35895oHr).AEQbTJ((nGF) obj);
        } else {
            pUU.copydefault(this.AEQbTJ, "Incorrect uiConversation or holder type");
        }
    }
}
