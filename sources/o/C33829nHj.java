package o;

import android.widget.TextView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33829nHj extends nGR {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    /* JADX INFO: renamed from: o.nHj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nHj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.nHj$Application */
    public final class Application extends C35895oHr {
        public final /* synthetic */ C33829nHj AEQbTJ;
        public final nON EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C33829nHj c33829nHj, nON non) {
            super(non.getRoot().getContext(), non.getRoot());
            Intrinsics.checkNotNullParameter(non, "");
            this.AEQbTJ = c33829nHj;
            this.EZpvd = non;
        }

        public final void OLrzqt(@NotNull nGM ngm) {
            Intrinsics.checkNotNullParameter(ngm, "");
            AEQbTJ(ngm);
            AhwBna(ngm);
            KWHzl(ngm);
            copydefault(ngm);
            valueOf(ngm);
            EZpvd(ngm);
            AYXKKw(ngm);
        }

        public final void AYXKKw(nGM ngm) {
            android.widget.ImageView imageView = this.EZpvd.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(ngm.AEQbTJ().isTop() ? 0 : 8);
        }

        public final void AEQbTJ(nGM ngm) {
            this.EZpvd.gEmmrt.setImageResource(ngm.AhwBna());
        }

        public final void EZpvd(nGM ngm) {
            this.EZpvd.AhwBna.setContentDescription(ngm.EZpvd());
        }

        public final void AhwBna(nGM ngm) {
            this.EZpvd.EZpvd.setText(ngm.AYXKKw());
        }

        public final void KWHzl(nGM ngm) {
            android.text.Spannable spannableKWHzl = ngm.KWHzl();
            if (spannableKWHzl != null) {
                this.EZpvd.OLrzqt.setText(spannableKWHzl, TextView.BufferType.SPANNABLE);
            }
        }

        public final void copydefault(nGM ngm) {
            java.lang.String strKWHzl = "";
            if (ngm.AEQbTJ().getSentTime() != 0) {
                nDD ndd = nDD.OLrzqt;
                android.content.Context contextKWHzl = KWHzl();
                Intrinsics.checkNotNullExpressionValue(contextKWHzl, "");
                strKWHzl = ndd.KWHzl(contextKWHzl, ngm.AEQbTJ().getSentTime());
            }
            int i = C52761wXj.Activity.QwvEab;
            android.widget.TextView textView = this.EZpvd.copydefault;
            textView.setText(strKWHzl);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i));
        }

        public final void valueOf(nGM ngm) {
            android.widget.TextView textView = this.EZpvd.djBIcL;
            C33829nHj c33829nHj = this.AEQbTJ;
            Intrinsics.copydefault(textView);
            textView.setVisibility(ngm.AEQbTJ().getUnreadMessageCount() > 0 ? 0 : 8);
            textView.setBackgroundResource(C44105sDn.Application.AkhnZx);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(c33829nHj.OLrzqt(context, ngm.AEQbTJ().getUnreadMessageCount()));
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
        return obj instanceof nGM;
    }

    @Override // o.nGR, o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        super.AEQbTJ(c35895oHr, obj, i);
        if ((obj instanceof nGM) && (c35895oHr instanceof Application)) {
            ((Application) c35895oHr).OLrzqt((nGM) obj);
        } else {
            pUU.copydefault("OrbitConversationProvider", "Incorrect uiConversation or holder type");
        }
    }
}
