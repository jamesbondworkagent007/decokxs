package o;

import androidx.core.view.ViewGroupKt;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKPrivateTypingIndicatorMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37702oyn extends AbstractC35702oAn<OKPrivateTypingIndicatorMessage, nNH> {
    private static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKPrivateTypingIndicatorMessage oKPrivateTypingIndicatorMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKPrivateTypingIndicatorMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKPrivateTypingIndicatorMessage> KWHzl() {
        return OKPrivateTypingIndicatorMessage.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C35399nuc.Dialog.DPHsZd;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.oGY, java.lang.Object] */
    @Override // o.AbstractC35702oAn, o.AbstractC35882oHe
    public /* synthetic */ void KWHzl(oGY ogy, C35254nrp c35254nrp) {
        KWHzl((oGY<nNH>) ogy, c35254nrp);
    }

    /* JADX INFO: renamed from: o.oyn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oyn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yED.AEQbTJ(OKMessage.MessageDirection.RECEIVE);
    }

    @Override // o.AbstractC35702oAn
    /* JADX INFO: renamed from: copydefault */
    public void KWHzl(@NotNull oGY<nNH> ogy, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        super.KWHzl((oGY) ogy, c35254nrp);
        AEQbTJ((nNH) ogy.copydefault());
    }

    @Override // o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<nNH> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        copydefault((nNH) ogy.copydefault());
        super.AEQbTJ(ogy);
    }

    public final void AEQbTJ(nNH nnh) {
        android.widget.LinearLayout linearLayout = nnh.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        java.lang.Object tag = linearLayout.getTag(C35399nuc.StateListAnimator.RXdAnZ);
        android.animation.AnimatorSet animatorSet = tag instanceof android.animation.AnimatorSet ? (android.animation.AnimatorSet) tag : null;
        if (animatorSet == null || !animatorSet.isRunning()) {
            copydefault(nnh);
            java.util.List listZuBGHE = C59467zhb.zuBGHE(ViewGroupKt.getChildren(linearLayout));
            if (listZuBGHE.isEmpty()) {
                return;
            }
            float f = -C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listZuBGHE, 10));
            int i = 0;
            for (java.lang.Object obj : listZuBGHE) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder((android.view.View) obj, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f, f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.3f));
                objectAnimatorOfPropertyValuesHolder.setDuration(350L);
                objectAnimatorOfPropertyValuesHolder.setStartDelay(((long) i) * 150);
                objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
                objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                arrayList.add(objectAnimatorOfPropertyValuesHolder);
                i++;
            }
            animatorSet2.playTogether(arrayList);
            linearLayout.setTag(C35399nuc.StateListAnimator.RXdAnZ, animatorSet2);
            animatorSet2.start();
        }
    }

    public final void copydefault(nNH nnh) {
        android.widget.LinearLayout linearLayout = nnh.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        java.lang.Object tag = linearLayout.getTag(C35399nuc.StateListAnimator.RXdAnZ);
        android.animation.AnimatorSet animatorSet = tag instanceof android.animation.AnimatorSet ? (android.animation.AnimatorSet) tag : null;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        linearLayout.setTag(C35399nuc.StateListAnimator.RXdAnZ, null);
        for (android.view.View view : ViewGroupKt.getChildren(linearLayout)) {
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
        }
    }
}
