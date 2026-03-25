package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7923asw extends wXX {
    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(constraintLayout.getContext());
        android.view.View viewInflate = layoutInflaterFrom.inflate(C7343ahz.Activity.copydefault, (android.view.ViewGroup) constraintLayout, false);
        Intrinsics.copydefault(viewInflate, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewInflate;
        constraintLayout.addView(viewGroup, new ConstraintLayout.LayoutParams(-1, -2));
        Intrinsics.copydefault(layoutInflaterFrom);
        java.lang.String string = getString(C7343ahz.Fragment.DbNXlk);
        Intrinsics.checkNotNullExpressionValue(string, "");
        KWHzl(layoutInflaterFrom, viewGroup, "https://static.coinall.ltd/cdn/assets/imgs/233/02122CF13B32737C.png", string, "blindbox/inviter");
        java.lang.String string2 = getString(C7343ahz.Fragment.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        KWHzl(layoutInflaterFrom, viewGroup, "https://static.coinall.ltd/cdn/assets/imgs/233/73BE931E2CCE63B5.png", string2, "supportcenter");
    }

    public final void KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull final android.view.ViewGroup viewGroup, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        android.view.View viewInflate = layoutInflater.inflate(C7343ahz.Activity.gEmmrt, viewGroup, false);
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(C7343ahz.TaskDescription.fJNWhG);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C7343ahz.TaskDescription.RcXXUw);
        Glide.KWHzl(imageView).EZpvd(str).EZpvd(imageView);
        textView.setText(str2);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: o.asv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C7923asw.EZpvd(viewGroup, str3, this, view);
            }
        });
        viewGroup.addView(viewInflate);
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final void EZpvd(android.view.ViewGroup viewGroup, java.lang.String str, C7923asw c7923asw, android.view.View view) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, str, null, new Function1() { // from class: o.asy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7923asw.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
        c7923asw.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(17);
        C52794wYp c52794wYpOLrzqt = wyf.OLrzqt();
        if (c52794wYpOLrzqt != null) {
            c52794wYpOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.asB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C7923asw.OLrzqt(this.KWHzl, view);
                }
            });
        }
        wyf.setCancelText(getString(C7343ahz.Fragment.fetchVPNInfo));
    }

    public static final void OLrzqt(C7923asw c7923asw, android.view.View view) {
        c7923asw.dismissAllowingStateLoss();
    }
}
