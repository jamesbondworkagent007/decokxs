package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.ui.IntroductionText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pbD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38528pbD extends AbstractC59533zio<IntroductionText, Application> {
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> copydefault;

    public C38528pbD(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function1;
        this.copydefault = function2;
    }

    /* JADX INFO: renamed from: o.pbD$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public android.widget.ImageView AEQbTJ;
        public C55258xgZ EZpvd;
        public android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55258xgZ KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (C55258xgZ) view.findViewById(C35964oKf.StateListAnimator.aJFbMH);
            this.copydefault = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.fsSxsn);
            this.AEQbTJ = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.DGGHxk);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.accept, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull final IntroductionText introductionText) {
        C55318xhg c55318xhgEZpvd;
        C55318xhg c55318xhgEZpvd2;
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(introductionText, "");
        application.setIsRecyclable(false);
        android.widget.TextView textViewEZpvd = application.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setText(introductionText.getCoinValue());
        }
        if (Intrinsics.EZpvd((java.lang.Object) introductionText.getCoinDesName(), (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.QKudOq)) || Intrinsics.EZpvd((java.lang.Object) introductionText.getCoinDesName(), (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.AxsJAYsNCnLh))) {
            android.widget.TextView textViewEZpvd2 = application.EZpvd();
            if (textViewEZpvd2 != null) {
                textViewEZpvd2.setMaxLines(2);
                java.lang.String coinValue = introductionText.getCoinValue();
                if (coinValue == null) {
                    coinValue = "";
                }
                EZpvd(textViewEZpvd2, coinValue);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) introductionText.getCoinDesName(), (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.OqFWZa)) || Intrinsics.EZpvd((java.lang.Object) introductionText.getCoinDesName(), (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.zuWLRA))) {
            double dDp2px$default = C33052mpF.dp2px$default(new android.graphics.Paint().measureText(introductionText.getCoinValue()), null, 1, null);
            C33566myq c33566myq = C33566myq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(application.itemView.getContext(), "");
            if (dDp2px$default > ((double) (c33566myq.EZpvd(r7) - 48)) * 0.4d) {
                android.widget.TextView textViewEZpvd3 = application.EZpvd();
                if (textViewEZpvd3 != null) {
                    textViewEZpvd3.setMaxLines(2);
                    java.lang.String coinValue2 = introductionText.getCoinValue();
                    if (coinValue2 == null) {
                        coinValue2 = "";
                    }
                    EZpvd(textViewEZpvd3, coinValue2);
                }
            } else {
                android.widget.TextView textViewEZpvd4 = application.EZpvd();
                if (textViewEZpvd4 != null) {
                    textViewEZpvd4.setMaxLines(1);
                }
            }
        } else {
            android.widget.TextView textViewEZpvd5 = application.EZpvd();
            if (textViewEZpvd5 != null) {
                textViewEZpvd5.setMaxLines(1);
            }
        }
        C55258xgZ c55258xgZKWHzl = application.KWHzl();
        if (c55258xgZKWHzl != null) {
            C55312xha c55312xhaAhwBna = c55258xgZKWHzl.AhwBna();
            if (c55312xhaAhwBna != null && (c55320xhiKWHzl = c55312xhaAhwBna.KWHzl()) != null) {
                java.lang.String coinDesName = introductionText.getCoinDesName();
                c55320xhiKWHzl.setText(coinDesName != null ? coinDesName : "");
            }
            if (introductionText.isShow()) {
                C55312xha c55312xhaValueOf = c55258xgZKWHzl.valueOf();
                if (c55312xhaValueOf != null) {
                    c55312xhaValueOf.OLrzqt();
                }
                C55312xha c55312xhaAhwBna2 = c55258xgZKWHzl.AhwBna();
                if (c55312xhaAhwBna2 != null && (c55318xhgEZpvd2 = c55312xhaAhwBna2.EZpvd()) != null) {
                    c55318xhgEZpvd2.setVisibility(8);
                }
            } else {
                C55312xha c55312xhaValueOf2 = c55258xgZKWHzl.valueOf();
                if (c55312xhaValueOf2 != null) {
                    c55312xhaValueOf2.copydefault();
                }
                C55312xha c55312xhaAhwBna3 = c55258xgZKWHzl.AhwBna();
                if (c55312xhaAhwBna3 != null && (c55318xhgEZpvd = c55312xhaAhwBna3.EZpvd()) != null) {
                    c55318xhgEZpvd.setVisibility(8);
                }
            }
        }
        C55258xgZ c55258xgZKWHzl2 = application.KWHzl();
        if (c55258xgZKWHzl2 != null) {
            c55258xgZKWHzl2.setOnClickListener(new View.OnClickListener() { // from class: o.pbB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C38528pbD.OLrzqt(introductionText, this, view);
                }
            });
        }
        java.lang.String type = introductionText.getType();
        if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) oLT.OLrzqt()) || Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) oLT.AkhnZx())) {
            android.widget.TextView textViewEZpvd6 = application.EZpvd();
            if (textViewEZpvd6 != null) {
                textViewEZpvd6.setOnClickListener(new View.OnClickListener() { // from class: o.pbG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C38528pbD.AEQbTJ(this.OLrzqt, introductionText, view);
                    }
                });
            }
            android.widget.ImageView imageViewOLrzqt = application.OLrzqt();
            if (imageViewOLrzqt != null) {
                imageViewOLrzqt.setVisibility(0);
            }
        } else {
            android.widget.ImageView imageViewOLrzqt2 = application.OLrzqt();
            if (imageViewOLrzqt2 != null) {
                imageViewOLrzqt2.setVisibility(8);
            }
        }
        android.widget.TextView textViewEZpvd7 = application.EZpvd();
        if (textViewEZpvd7 != null) {
            textViewEZpvd7.setTextColor(ContextCompat.getColor(application.itemView.getContext(), C32113mPz.ActionBar.zLjUOn));
        }
    }

    public static final void OLrzqt(IntroductionText introductionText, C38528pbD c38528pbD, android.view.View view) {
        java.lang.String desc;
        Function1<? super java.lang.String, Unit> function1;
        if (!introductionText.isShow() || (desc = introductionText.getDesc()) == null || (function1 = c38528pbD.AEQbTJ) == null) {
            return;
        }
        function1.invoke(desc);
    }

    public static final void AEQbTJ(C38528pbD c38528pbD, IntroductionText introductionText, android.view.View view) {
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c38528pbD.copydefault;
        java.lang.String type = introductionText.getType();
        if (type == null) {
            type = "";
        }
        java.lang.String coinValue = introductionText.getCoinValue();
        function2.invoke(type, coinValue != null ? coinValue : "");
    }

    public final void EZpvd(android.widget.TextView textView, java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() == 2) {
            textView.setText(listSplit$default.get(0) + "\n" + listSplit$default.get(1));
        }
    }
}
