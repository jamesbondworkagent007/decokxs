package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import com.okinc.business.defi.wallet.tee.converter.ui.item.SmallAssetsConverterEmptyViewBinding$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.fTZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUN extends AbstractC19608gIr<fTZ.StateListAnimator, C17133ewz> {
    public final Function0<Unit> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fUN(@NotNull Function0<Unit> function0) {
        super(SmallAssetsConverterEmptyViewBinding$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C17133ewz c17133ewz, @NotNull fTZ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(c17133ewz, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C55173xeu c55173xeu = c17133ewz.OLrzqt;
        Intrinsics.copydefault(c55173xeu);
        ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C55298xhM.dp2px$default(32.0f, null, 1, null);
            c55173xeu.setLayoutParams(marginLayoutParams);
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareFromSearch));
            if (stateListAnimator.EZpvd()) {
                c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareFromMediaId));
            } else if (stateListAnimator.copydefault() > 0) {
                c55173xeu.setSubTitle(OLrzqt(c55173xeu.EZpvd(), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepare), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(stateListAnimator.copydefault())))), C52761wXj.TaskDescription.DGOPHZDGOPHZ));
                android.widget.TextView textViewEZpvd = c55173xeu.EZpvd();
                textViewEZpvd.setOnClickListener(new StateListAnimator(textViewEZpvd, 1000L, this));
            } else {
                c55173xeu.setSubTitle((java.lang.CharSequence) "");
            }
            c55173xeu.AEQbTJ().setVisibility(8);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final java.lang.CharSequence OLrzqt(android.widget.TextView textView, java.lang.String str, @androidx.annotation.DrawableRes int i) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str).append((java.lang.CharSequence) " ");
        int length = spannableStringBuilder.length();
        android.graphics.drawable.Drawable drawable = AppCompatResources.getDrawable(textView.getContext(), i);
        Intrinsics.copydefault(drawable);
        android.graphics.drawable.Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
        DrawableCompat.setTint(drawableWrap, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        drawableWrap.setBounds(0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(drawableWrap, 0), length - 1, length, 33);
        return spannableStringBuilder;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ fUN OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fUN fun) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = fun;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt.invoke();
            }
        }
    }
}
