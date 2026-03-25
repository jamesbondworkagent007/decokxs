package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.wallet.home.more.ui.MoreSAItemViewBinder$1;
import com.okinc.business.defi.wallet.home.more.ui.MoreSAItemViewBinder$startTimer$1;
import java.util.Date;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C13754dXa;
import o.C52761wXj;
import o.dTH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18071fbV extends AbstractC14584doH<C18065fbP, C16780eqQ> {
    public final Function1<C18065fbP, Unit> AEQbTJ;
    public final CoroutineScope EZpvd;
    public final Function1<C18065fbP, Unit> OLrzqt;
    public Job copydefault;
    public boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C18065fbP, Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fbP, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.fbP, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18071fbV(@NotNull CoroutineScope coroutineScope, Function1<? super C18065fbP, Unit> function1, Function1<? super C18065fbP, Unit> function12) {
        super(MoreSAItemViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.EZpvd = coroutineScope;
        this.OLrzqt = function1;
        this.AEQbTJ = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull C14661dpf<C16780eqQ> c14661dpf) {
        Intrinsics.checkNotNullParameter(c14661dpf, "");
        super.onViewRecycled(c14661dpf);
        copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull final C16780eqQ c16780eqQ, @NotNull final C18065fbP c18065fbP) {
        java.lang.String strAkhnZx;
        Intrinsics.checkNotNullParameter(c16780eqQ, "");
        Intrinsics.checkNotNullParameter(c18065fbP, "");
        ConstraintLayout root = c16780eqQ.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c18065fbP));
        copydefault();
        if (c18065fbP.KWHzl().AubY()) {
            if (!c18065fbP.KWHzl().QbewEr()) {
                android.widget.ImageView imageView = c16780eqQ.EZpvd;
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                } else {
                    drawableKWHzl = null;
                }
                imageView.setImageDrawable(drawableKWHzl);
                android.widget.ImageView imageView2 = c16780eqQ.EZpvd;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(C55298xhM.dp2pxFloat$default(8.0f, null, 1, null));
                gradientDrawable.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN));
                imageView2.setBackground(gradientDrawable);
                c16780eqQ.copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity21));
                c16780eqQ.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                c16780eqQ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onContextAvailable));
                return;
            }
            android.widget.TextView textView = c16780eqQ.copydefault;
            if (c18065fbP.EZpvd()) {
                strAkhnZx = java.lang.String.valueOf(C14733dqy.copydefault.KWHzl(c18065fbP.KWHzl()));
            } else {
                strAkhnZx = c18065fbP.KWHzl().AkhnZx();
            }
            textView.setText(strAkhnZx);
            dTH dthOLrzqt = C17922fXg.OLrzqt(c18065fbP.KWHzl());
            if (dthOLrzqt instanceof dTH.Application) {
                android.widget.ImageView imageView3 = c16780eqQ.EZpvd;
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                } else {
                    drawableKWHzl2 = null;
                }
                imageView3.setImageDrawable(drawableKWHzl2);
                android.widget.ImageView imageView4 = c16780eqQ.EZpvd;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(C55298xhM.dp2pxFloat$default(8.0f, null, 1, null));
                gradientDrawable2.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN));
                imageView4.setBackground(gradientDrawable2);
                c16780eqQ.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                c16780eqQ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity22));
                return;
            }
            if (dthOLrzqt instanceof dTH.PendingIntent) {
                int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
                android.widget.ImageView imageView5 = c16780eqQ.EZpvd;
                android.graphics.drawable.Drawable drawableKWHzl3 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
                if (drawableKWHzl3 != null) {
                    drawableKWHzl3.setTint(iCopydefault);
                } else {
                    drawableKWHzl3 = null;
                }
                imageView5.setImageDrawable(drawableKWHzl3);
                android.widget.ImageView imageView6 = c16780eqQ.EZpvd;
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(C55298xhM.dp2pxFloat$default(8.0f, null, 1, null));
                gradientDrawable3.setColor(C33070mpX.copydefault(C52761wXj.Activity.aJZHYI));
                imageView6.setBackground(gradientDrawable3);
                long jFIwbmz = c18065fbP.KWHzl().fIwbmz() - java.lang.System.currentTimeMillis();
                if (jFIwbmz < CalendarModelKt.MillisecondsIn24Hours) {
                    int i = C13754dXa.FragmentManager.onStateChanged;
                    java.lang.String strOLrzqt = OLrzqt(jFIwbmz);
                    android.widget.TextView textView2 = c16780eqQ.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    setFormatStr$default(this, i, strOLrzqt, "date", textView2, C52761wXj.Activity.gdmIOq, null, 32, null);
                    copydefault(new Function0() { // from class: o.fbX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C18071fbV.copydefault(c18065fbP, this, c16780eqQ);
                        }
                    });
                    return;
                }
                int i2 = C13754dXa.FragmentManager.onStateChanged;
                java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(c18065fbP.KWHzl().fIwbmz()), null, 1, null);
                android.widget.TextView textView3 = c16780eqQ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                setFormatStr$default(this, i2, simpleDate$default, "date", textView3, C52761wXj.Activity.gdmIOq, null, 32, null);
                return;
            }
            if (dthOLrzqt instanceof dTH.Activity) {
                android.widget.ImageView imageView7 = c16780eqQ.EZpvd;
                android.graphics.drawable.Drawable drawableKWHzl4 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gkJEwt);
                if (drawableKWHzl4 != null) {
                    drawableKWHzl4.setTint(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
                } else {
                    drawableKWHzl4 = null;
                }
                imageView7.setImageDrawable(drawableKWHzl4);
                android.widget.ImageView imageView8 = c16780eqQ.EZpvd;
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(C55298xhM.dp2pxFloat$default(8.0f, null, 1, null));
                gradientDrawable4.setColor(C33070mpX.copydefault(C52761wXj.Activity.aJZHYI));
                imageView8.setBackground(gradientDrawable4);
                if (C17922fXg.AEQbTJ(c18065fbP.KWHzl())) {
                    c16780eqQ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.accessBackHandlerlambda0));
                    return;
                }
                int i3 = C13754dXa.FragmentManager.ComponentActivity3;
                java.lang.String simpleDate$default2 = pTA.formatSimpleDate$default(new Date(c18065fbP.KWHzl().fIwbmz()), null, 1, null);
                android.widget.TextView textView4 = c16780eqQ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                setFormatStr$default(this, i3, simpleDate$default2, "date", textView4, C52761wXj.Activity.dvKsVJ, null, 32, null);
            }
        }
    }

    public static final Unit copydefault(C18065fbP c18065fbP, C18071fbV c18071fbV, C16780eqQ c16780eqQ) {
        long jFIwbmz = c18065fbP.KWHzl().fIwbmz() - java.lang.System.currentTimeMillis();
        if (jFIwbmz >= 0) {
            int i = C13754dXa.FragmentManager.onStateChanged;
            c18065fbP.KWHzl().fIwbmz();
            java.lang.String strOLrzqt = c18071fbV.OLrzqt(jFIwbmz);
            android.widget.TextView textView = c16780eqQ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            setFormatStr$default(c18071fbV, i, strOLrzqt, "date", textView, C52761wXj.Activity.gdmIOq, null, 32, null);
        } else {
            c18071fbV.copydefault();
            Function1<C18065fbP, Unit> function1 = c18071fbV.AEQbTJ;
            if (function1 != null) {
                function1.invoke(c18065fbP);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fbV$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C18071fbV AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C18065fbP OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C18071fbV c18071fbV, C18065fbP c18065fbP) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c18071fbV;
            this.OLrzqt = c18065fbP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1<C18065fbP, Unit> function1EZpvd = this.AEQbTJ.EZpvd();
                if (function1EZpvd != null) {
                    function1EZpvd.invoke(this.OLrzqt);
                }
            }
        }
    }

    public final java.lang.String OLrzqt(long j) {
        long j2 = 60;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format("%02d:%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j / ((long) 3600000)), java.lang.Long.valueOf((j / ((long) 60000)) % j2), java.lang.Long.valueOf((j / ((long) 1000)) % j2)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        this.copydefault = BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new MoreSAItemViewBinder$startTimer$1(this, function0, null), 3, null);
    }

    public final void copydefault() {
        this.djBIcL = false;
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.fbV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.CharSequence setFormatStr$default(C18071fbV c18071fbV, int i, java.lang.String str, java.lang.String str2, android.widget.TextView textView, int i2, Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            i2 = C52761wXj.Activity.fdOvFl;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            function0 = null;
        }
        return c18071fbV.copydefault(i, str, str2, textView, i4, function0);
    }

    public final java.lang.CharSequence copydefault(@androidx.annotation.StringRes int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull android.widget.TextView textView, int i2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.String str3 = str + "\u200b";
        return KWHzl(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(str2, str3))) + "\u200b", str3, textView, i2, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.fbV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.CharSequence setFormatStr$default(C18071fbV c18071fbV, java.lang.String str, java.lang.String str2, android.widget.TextView textView, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        return c18071fbV.KWHzl(str, str2, textView, i3, function0);
    }

    public final java.lang.CharSequence KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull android.widget.TextView textView, final int i, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.CharSequence charSequence = C33574myy.setupSpanStyles$default(str, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.fbZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18071fbV.OLrzqt(i, (java.util.List) obj);
            }
        }, 14, null);
        Intrinsics.copydefault(charSequence, "");
        android.text.SpannableString spannableString = (android.text.SpannableString) charSequence;
        textView.setText(spannableString);
        if (function0 != null) {
            textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(textView, str, str2, new Function0() { // from class: o.fbY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C18071fbV.AEQbTJ(function0);
                }
            }));
        }
        return spannableString;
    }

    public static final Unit OLrzqt(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(i)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
