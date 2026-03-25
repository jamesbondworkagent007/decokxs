package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC20512giL;
import o.ActivityC18568fkp;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.giL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20512giL<T> extends AbstractC43310rmq<T, AbstractC16908esm> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(@NotNull AbstractC16908esm abstractC16908esm, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str) {
        Companion.EZpvd(abstractC16908esm, charSequence, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(@NotNull AbstractC16908esm abstractC16908esm, @NotNull java.lang.String str) {
        Companion.EZpvd(abstractC16908esm, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(@NotNull AbstractC16908esm abstractC16908esm, boolean z, @NotNull java.lang.String str) {
        Companion.AEQbTJ(abstractC16908esm, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(@NotNull AbstractC16908esm abstractC16908esm, @NotNull java.lang.String str) {
        Companion.AEQbTJ(abstractC16908esm, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void EZpvd(@NotNull AbstractC16908esm abstractC16908esm, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, View.OnClickListener onClickListener) {
        Companion.EZpvd(abstractC16908esm, str, str2, z, onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void OLrzqt(@NotNull AbstractC16908esm abstractC16908esm, @NotNull View.OnClickListener onClickListener) {
        Companion.copydefault(abstractC16908esm, onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void OLrzqt(@NotNull AbstractC16908esm abstractC16908esm, java.lang.String str) {
        Companion.copydefault(abstractC16908esm, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void copydefault(@NotNull AbstractC16908esm abstractC16908esm, java.lang.Integer num) {
        Companion.AEQbTJ(abstractC16908esm, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public final int getItemLayoutId() {
        return C13754dXa.TaskDescription.DXd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public final int getVariableId() {
        return dTV.isConnected;
    }

    /* JADX INFO: renamed from: o.giL$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.giL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void AEQbTJ(android.view.View view) {
        }

        public static final void KWHzl(android.view.View view) {
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull AbstractC16908esm abstractC16908esm, boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.widget.ImageView imageView = abstractC16908esm.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(z ? 0 : 8);
            android.widget.ImageView imageView2 = abstractC16908esm.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C57659ymb.copydefault(imageView2, str, C52761wXj.TaskDescription.aHXSQp, 1.0f, 32.0f);
        }

        public final void EZpvd(@NotNull AbstractC16908esm abstractC16908esm, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(str, "");
            abstractC16908esm.djBIcL.setText(charSequence);
            android.widget.TextView textView = abstractC16908esm.valueOf;
            if (str.length() == 0) {
                Intrinsics.copydefault(textView);
                textView.setVisibility(8);
                return;
            }
            Intrinsics.copydefault(textView);
            int iCopydefault = 0;
            textView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (!StringsKt__StringsKt.fARcdN(charSequence)) {
                    android.content.Context context = textView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iCopydefault = C55298xhM.copydefault(6.0f, context);
                }
                layoutParams2.setMarginStart(iCopydefault);
                textView.setLayoutParams(layoutParams2);
                C14731dqw.AEQbTJ.copydefault(textView, str, 12);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }

        public final void EZpvd(@NotNull AbstractC16908esm abstractC16908esm, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.widget.TextView textView = abstractC16908esm.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            abstractC16908esm.gEmmrt.setText(str);
        }

        public static /* synthetic */ void hideCoinName$default(Activity activity, AbstractC16908esm abstractC16908esm, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            AbstractC20512giL.copydefault(abstractC16908esm, num);
        }

        public final void AEQbTJ(@NotNull AbstractC16908esm abstractC16908esm, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            android.widget.TextView textView = abstractC16908esm.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = abstractC16908esm.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                if (num != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = num.intValue();
                }
                layoutParams2.startToEnd = C13754dXa.ActionBar.aWJMta;
                layoutParams2.topToTop = 0;
                layoutParams2.bottomToBottom = 0;
                textView2.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }

        public final void AEQbTJ(@NotNull AbstractC16908esm abstractC16908esm, @NotNull final java.lang.String str) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            Intrinsics.checkNotNullParameter(str, "");
            C52794wYp c52794wYp = abstractC16908esm.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(0);
            android.widget.TextView textView = abstractC16908esm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = abstractC16908esm.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            abstractC16908esm.KWHzl.setText(C13754dXa.FragmentManager.fhUrPt);
            abstractC16908esm.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.giK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC20512giL.Activity.copydefault(str, view);
                }
            });
            abstractC16908esm.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.giO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC20512giL.Activity.AEQbTJ(view);
                }
            });
        }

        public static final void copydefault(java.lang.String str, android.view.View view) {
            ActivityC18568fkp.Activity activity = ActivityC18568fkp.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            activity.AEQbTJ(context, (28 & 2) != 0 ? "" : str, (28 & 4) != 0 ? "" : null, (28 & 8) != 0 ? "" : null, (28 & 16) != 0 ? "" : null);
        }

        public final void copydefault(@NotNull AbstractC16908esm abstractC16908esm, @NotNull View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            Intrinsics.checkNotNullParameter(onClickListener, "");
            C52794wYp c52794wYp = abstractC16908esm.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(0);
            android.widget.TextView textView = abstractC16908esm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = abstractC16908esm.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            abstractC16908esm.KWHzl.setText(C13754dXa.FragmentManager.OnBackPressedDispatcherApi33Impl);
            abstractC16908esm.KWHzl.setOnClickListener(onClickListener);
            abstractC16908esm.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.giP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC20512giL.Activity.KWHzl(view);
                }
            });
        }

        public static /* synthetic */ void bindContent$default(Activity activity, AbstractC16908esm abstractC16908esm, java.lang.String str, java.lang.String str2, boolean z, View.OnClickListener onClickListener, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                onClickListener = null;
            }
            AbstractC20512giL.EZpvd(abstractC16908esm, str, str2, z, onClickListener);
        }

        public final void EZpvd(@NotNull AbstractC16908esm abstractC16908esm, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C52794wYp c52794wYp = abstractC16908esm.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            android.widget.TextView textView = abstractC16908esm.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            abstractC16908esm.OLrzqt.setText(str);
            if (!z) {
                android.widget.TextView textView2 = abstractC16908esm.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                abstractC16908esm.EZpvd.setText(str2);
            } else {
                android.widget.TextView textView3 = abstractC16908esm.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
            }
            abstractC16908esm.getRoot().setOnClickListener(onClickListener);
        }

        public final void copydefault(@NotNull AbstractC16908esm abstractC16908esm, java.lang.String str) {
            Intrinsics.checkNotNullParameter(abstractC16908esm, "");
            abstractC16908esm.AYXKKw.setText(str);
            C55251xgS c55251xgS = abstractC16908esm.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(str != null ? 0 : 8);
        }
    }
}
